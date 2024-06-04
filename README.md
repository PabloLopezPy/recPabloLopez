# Recu.SegunEval

## Modificaciones realizadas

He realizado las siguientes modificaciones:

1. Modificado la visibilidad de los atributos de `Empleado` a `private` y añadido getters y setters.
2. Separada la lógica de gestión de empleados en una nueva clase `Empleados`.
3. Creada una clase estática para textos fijos y actualizado el código para usarla.
4. Documentado el código con JavaDoc.

## Autor

Pablo López

## Ramas del terminal
git clone https://github.com/PabloLopezPy/Recu.SegunEval.git
cd Recu.SegunEval
git checkout -b PLP
git add Empleado.java y demas clases
git commit -m "Mensaje que quieras tu introducir"
git checkout -b Doc
git checkout PLP
git merge Doc
git checkout main
git merge PLP
git push origin main
