# Code review - TP1

## TODO
- [x] Maven/Gradle/Ant project
- [ ] README.md with a summary of the project and basic usage of the library.
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
    - [ ] Protected Branches policies.
    - [ ] Define pull request policy (approval etc…)
- Tests:
    - [ ] Units Tests implementation with proper test plan.
    - [ ] “Performance test” on “ComputeMD5” method
- CI/CD:
    - Foreach pull requests:￼
        - [ ] Checkstyle
        - [ ] Unit Tests passed.
        - [ ] Cobertura reach 90%.
        - [ ] Performance Tests passed.
        - [ ] SAST run successfully without default (Ex: Semgrep).
    - Foreach main modification:
        - [ ] Build and Deploy version in Github Maven registry.
        - [ ] Deploy documentation using GH-Pages with URL (blah.com/javadoc/<version>)
        - [ ] Deploy Cobertura (Cojojo?) report with GH-Pages with URL (blah.com/cobertura/<version>)
