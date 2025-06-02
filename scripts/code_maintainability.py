def write_maintainability_violations_to_file() -> None:
    message = (
        f"### 🧹 Maintainability Check\n\n"
        f"Some functions or modules have a maintainability index below 20. "
        f"Consider reviewing them for opportunities to simplify or clarify.\n\n"
    )

    with open("check_maintainability_violations.md", "w", encoding="utf-8") as f:
        f.write(message)


if __name__ == "__main__":
    write_maintainability_violations_to_file()
