
<html>
<body>
    <h2>Expense Tracker</h2>
    <a href="/expenses/new">Add New Expense</a>
    <table>
        <thead>
            <tr>
                <th>Description</th>
                <th>Amount</th>
                <th>Date</th>
                <th>Actions</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="expense" items="${expenses}">
                <tr>
                    <td>${expense.description}</td>
                    <td>${expense.amount}</td>
                    <td>${expense.date}</td>
                    <td>
                        <a href="/expenses/edit/${expense.id}">Edit</a> | 
                        <a href="/expenses/delete/${expense.id}">Delete</a>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
