# Функция сортировки пузырьком в итеративном стиле
def sort_list(list_to_sort: list):
    for i in range(len(list_to_sort) - 1, 0, -1):
        for j in range(0, i):
            if list_to_sort[j] < list_to_sort[j + 1]:
                temp = list_to_sort[j]
                list_to_sort[j] = list_to_sort[j + 1]
                list_to_sort[j + 1] = temp
    return list_to_sort


# Функция сортировки в декларативном стиле
def sort_list2(list_to_sort: list):
    list_to_sort.sort(reverse=True)


def start():
    list_sort1 = [0, 7, 5, 2, 3, 1, 0, 1, 7, 56, 6]
    list_sort1 = sort_list(list_sort1)
    print('Список отсортированный в императивном стиле: ' + str(list_sort1))

    list_sort2 = [0, 7, 5, 2, 3, 1, 0, 1, 7, 56, 6]
    list_sort2 = sort_list(list_sort2)
    print('Список отсортированный в декларативном стиле' + str(list_sort2))

    list_sort3 = []
    list_sort3 = sort_list(list_sort3)
    print('Пустой список' + str(list_sort3))


if __name__ == '__main__':
    start()
