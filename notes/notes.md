## Default Constructors
- Classes generate a default constructor automatically for you
  - The generated constructor method will always be parameterless (no inputs coming in)    
  - If you add a constructor of your own with parameters then the default constructor is erased/replaced
  - If you wanted a parameterless constructor you have to type it out now
  - The parameterless constructor on the super/base/parent will automatically get called unless you call another one

 - super() is used in a child class constructor to call a specific constructor on the super/base/parent class that the class extends from 
## 