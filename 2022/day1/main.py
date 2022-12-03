import argparse 

def main(filepath):
    file = open(filepath)

    current = []
    elf_totals = []
    for line in file.readlines():
        if line is None or line == "\n":
            elf_totals.append(sum(current))
            current = []
        else:
            current.append(int(line))
    
    # get trailing elf if last line is not a newline
    if len(current) != 0:
        elf_totals.append(sum(current))
    
    sorted_totals = sorted(elf_totals, reverse=True)
    return sorted_totals
        
if __name__ == '__main__':
    parser = argparse.ArgumentParser(description="Find the elf with the most total calories")
    parser.add_argument("filepath", type=str, help="the file to read", default="test.dat", nargs="?")

    args=parser.parse_args()

    sorted_totals = main(filepath=args.filepath)
    print(f"Top elf: {sorted_totals[0]}")
    print(f"Top three total: {sum(sorted_totals[:3])}")