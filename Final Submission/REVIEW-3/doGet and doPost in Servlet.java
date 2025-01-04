@Override
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    // Display user details
    request.getRequestDispatcher("userProfile.jsp").forward(request, response);
}

@Override
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    // Handle user form submissions
    String username = request.getParameter("username");
    String email = request.getParameter("email");
    
    if (username != null && email != null) {
        // Save user details (e.g., in database)
        request.setAttribute("message", "User successfully registered!");
    } else {
        request.setAttribute("error", "All fields are required!");
    }
    request.getRequestDispatcher("userForm.jsp").forward(request, response);
}
