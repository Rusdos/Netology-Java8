#Цикломатическая сложность кода в Jacoco
Цикломатическая сложность была разработана Томасом Дж. МакКейбом в 1976 году. Он рекомендовал программистам учитывать сложность модулей, над которыми они работают, и разбивать их на более мелкие модули, чтобы всякий раз, когда цикломатическая сложность модуля превышала 10. 10 максимальная цикломатическая сложность для одной программы.

Jacoco рассчитывает цикломатическую сложность по формуле: 
v(G) = B - D + 1
где B - количество ветвей, D - количество точек принятия решения.