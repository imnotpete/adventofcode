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
    
    return max(elf_totals)
        
if __name__ == '__main__':
    parser = argparse.ArgumentParser(description="Find the elf with the most total calories")
    parser.add_argument("filepath", type=str, help="the file to read", default="test.dat", nargs="?")

    args=parser.parse_args()

    top_elf = main(filepath=args.filepath)
    print(top_elf)