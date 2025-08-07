class Solution(object):
    def mostCommonWord(self, paragraph, banned):
        """
        :type paragraph: str
        :type banned: List[str]
        :rtype: str
        """
        cleaned = ""
        for ch in paragraph:
            if ch.isalpha() or ch == ' ':
                cleaned += ch.lower()
            else:
                cleaned += ' '
        words = cleaned.split()

        filtered = []
        for word in words:
            is_banned = False
            for ban in banned:
                if word == ban:
                    is_banned = True
                    break
            if not is_banned:
                filtered.append(word)

        max_count = 0
        most_common = ""
        for i in range(len(filtered)):
            count = 1
            for j in range(i + 1, len(filtered)):
                if filtered[i] == filtered[j]:
                    count += 1
            if count > max_count:
                max_count = count
                most_common = filtered[i]

        return most_common



                