# formando-equipo

---

DESCRIPCION DEL PROBLEMA

---

Una empresa ha decidido formar un
equipo con un subconjunto de sus
colaboradores, para lanzar un novedoso
producto al mercado. El equipo debe estar
formado por los dos o más colaboradores
que sean más afines entre sí. Para
descubrir este equipo, se ha diseñado un
formulario con preguntas, cada una con
diversas respuestas.

Un equipo es afín si sus colaboradores
han contestado las primeras N preguntas
de la misma manera. La afinidad de dicho
equipo se define como la cantidad de
colaboradores en el equipo, multiplicado
por el cuadrado de N (siendo N la cantidad
de preguntas contestadas de la misma
manera). Esto es así porque las preguntas
están ordenadas de mayor a menor en
grado de importancia.

---

SE PIDE

---

Indicar cual es la afinidad
del equipo de colaboradores de mayor
afinidad.

---

DATOS DE ENTRADA

---

Se recibe un archivo equipo.in con
el siguiente formato:

• Primero una línea con la cantidad p de
preguntas (1 ≤ p ≤ 500)

• Luego una línea con la cantidad de
colaboradores c (2 ≤ c ≤ 5.000) que
contestaron la encuesta.

• Luego c líneas, una para cada colaborador,
con una hilera de p letras minúsculas (sin ñ), que
representan las respuestas del colaborador a las
preguntas del formulario.

---

DATOS DE SALIDA

---

Se debe generar un archivo equipo.out
que contendrá

• una línea con la afinidad máxima de un
equipo de colaboradores.

• una línea con las N letras comunes que
determinen esta afinidad máxima (si
hay más de un grupo de respuestas
comunes que determinen afinidad
máxima, indicar sólo uno)

---

EJEMPLO

---

dado el input:

5<br />
6<br />
abafj<br />
abcac<br />
abcad<br />
abade<br />
abaej<br />
abcee<br />

el resultado esperado es:

32<br />
abca
