# Code review - TP1

AwesomePasswordChecker is a Java class designed to evaluate and analyze passwords based on a set of predefined character clusters. It provides methods for encoding passwords, calculating their "distance" from predefined clusters, and computing their MD5 hash. The class can be used for password strength evaluation and categorization.

## Summary
- Singleton Instance: The class follows the Singleton design pattern, ensuring only one instance of the password checker exists.
- Password Masking: Encodes a password into an array of integers representing the types of characters in the password (e.g., lowercase, uppercase, digits, special characters).
- Distance Calculation: Computes the Euclidean distance between the encoded password and predefined cluster centers to evaluate its uniqueness or strength.
- MD5 Hashing: Computes the MD5 hash of a given password or string.

## Usage
- To use AwesomePasswordChecker, first obtain an instance via getInstance(). You can either specify a custom file containing cluster data or use the default resource file.
- Use maskAff() to encode a password into its "mask," which represents different character types (lowercase, uppercase, digits, etc.).
- Call getDIstance() to calculate how similar a password is to predefined clusters, with the result indicating the password's relative strength or uniqueness.
- You can also compute the MD5 hash of a password or any string using computeMD5().

## TODO
- [x] Maven/Gradle/Ant project
- [x] README.md with a summary of the project and basic usage of the library.
- Code:
    - [x] License chosen.
    - [x] Comment the code using Javadoc.
    - [x] Apply a code style policy (ex: Checkstyle).
    - [x] Fix bugs if necessary.
- SCM:
    - [x] Github project.
    - [x] Security.md.
    - [x] Issues Templates.
    - [x] Pull request template.
    - [x] Protected Branches policies.
    - [ ] Define pull request policy (approval etc…)
- Tests:
    - [ ] Units Tests implementation with proper test plan.
    - [ ] “Performance test” on “ComputeMD5” method
- CI/CD:
    - Foreach pull requests:￼
        - [x] Checkstyle
        - [x] Unit Tests passed.
        - [ ] Cobertura/JaCoCo reach 90%.
        - [x] Performance Tests passed.
        - [ ] SAST run successfully without default (Ex: Semgrep).
    - Foreach main modification:
        - [ ] Build and Deploy version in Github Maven registry.
        - [ ] Deploy documentation using GH-Pages with URL (blah.com/javadoc/<version>)
        - [ ] Deploy Cobertura/JaCoCo report with GH-Pages with URL (blah.com/cobertura/<version>)

