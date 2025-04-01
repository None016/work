def find_min_sum(filename):
    with open(filename, 'r') as f:
        n = int(f.readline())
        sm = [float('inf')] * 10  # Инициализация списка для минимальных сумм
        sm[0] = 0  # Начальная сумма с остатком 0

        for _ in range(n):
            x, y = map(int, f.readline().split())
            sm2 = [float('inf')] * 10  # Временный список для новых сумм

            for j in range(10):
                if sm[j] == float('inf'):
                    continue  # Пропускаем, если сумма для этого остатка недостижима

                # Пробуем добавить x и y к текущей сумме
                r1 = sm[j] + x
                r2 = sm[j] + y

                # Обновляем sm2 для новых остатков
                sm2[r1 % 10] = min(sm2[r1 % 10], r1)
                sm2[r2 % 10] = min(sm2[r2 % 10], r2)

            sm = sm2  # Обновляем основной список

        return sm[6]  # Возвращаем сумму с остатком 6

# Вызов функции для файлов A и B
sum_a = find_min_sum('aX.txt')
sum_b = find_min_sum('bX.txt')

print(f"Сумма для файла A: {sum_a}")
print(f"Сумма для файла B: {sum_b}")