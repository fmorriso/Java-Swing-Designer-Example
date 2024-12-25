# Java Swing Designer (IntelliJ) Example

A example of using the JetBrains IntelliJ Swing _**UI Designer**_.

## Tools Used

| Tool     | Version  |
|----------|----------|
| Java     | 23.0.1.0 |
| IntelliJ | 2024.3.1 |
| VSCode   | 1.96.2   |

## Change History

| Date       | Description      |
|------------|------------------|
| 2024-12-25 | Initial creation |

## References

* [Tutorial: Build UI using Swing](https://www.jetbrains.com/help/idea/design-gui-using-swing.html)  
* [Video: How To Use GUI Designer in IntelliJ](https://www.youtube.com/watch?v=whF_Qm1epQ8)

## Developer Notes

### GridBagLayout and GridBagConstraints

GridBagConstraints allow you to set the following properties to control the layout of individual components:

-   `gridx`: The column of the grid.
-   `gridy`: The row of the grid.
-   `gridwidth`: The number of columns a component spans.
-   `gridheight`: The number of rows a component spans.
-   `weightx, weighty`: How the extra space is distributed.
-   `anchor`: How the component is aligned within its grid cell.
-   `fill`: Determines how the component should resize within the grid cell.
