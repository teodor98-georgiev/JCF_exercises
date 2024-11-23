for 03 file:
Create comparator type for Product type that would sort by category name. In case categories are the same - products with the lower price should go first. In case price is the same - sort product by product names.
To implement this task, please, use the following:
- Product Interface - https://github.com/AndriiPiatakha/learnit_java_core/blob/master/src/com/itbulls/learnit/javacore/jcf/hw/onlinestore/withlist/enteties/Product.java
- Product implementation - https://github.com/AndriiPiatakha/learnit_java_core/blob/master/src/com/itbulls/learnit/javacore/jcf/hw/onlinestore/withlist/enteties/impl/DefaultProduct.java
- Next product list

new ArrayList<>(Arrays.asList(

new DefaultProduct(1, "Hardwood Oak Suffolk Internal Door", "Doors", 109.99),

new DefaultProduct(2, "Oregon Cottage Interior Oak Door", "Doors", 109.99),

new DefaultProduct(3, "Oregon Cottage Horizontal Interior White Oak Door", "Doors", 189.99),

new DefaultProduct(4, "4 Panel Oak Deco Interior Door", "Doors", 209.09),

new DefaultProduct(5, "Worcester 2000 30kW Ng Combi Boiler Includes Free Comfort+ II controller", "Boilers", 989.99),

new DefaultProduct(6, "Glow-worm Betacom 4 30kW Combi Gas Boiler ERP", "Boilers", 787.99),

new DefaultProduct(7, "Worcester 2000 25kW Ng Combi Boiler with Free Comfort+ II controller", "Boilers", 859.99),

new DefaultProduct(8, "Wienerberger Terca Class B Engineering Brick Red 215mm x 102.5mm x 65mm (Pack of 504)", "Bricks", 402.99),

new DefaultProduct(9, "Wienerberger Terca Engineering Brick Blue Perforated Class B 65mm (Pack of 400)", "Bricks", 659.99),

new DefaultProduct(10, "Wienerberger Engineering Brick Red Smooth Class B 73mm - Pack of 368", "Bricks", 523.99)

));


Tech note: Comparator should be implemented in the separate file, in the separate class with the name CustomProductComparator.
