def contar_angulos(inicio, fin):
  """
  Cuenta el número de veces que un reloj con minutos y horas forman un ángulo de 90°.

  Args:
    inicio: La hora de inicio.
    fin: La hora de fin.

  Returns:
    El número de ángulos de 90°.
  """

  contador = 0

  for horas in range(inicio, fin + 1):
    for minutos in range(0, 60):
      angulo = angulo_reloj(horas, minutos)
      if angulo == 90:
        contador += 1

  return contador
