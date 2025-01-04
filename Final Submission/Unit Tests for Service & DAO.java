@Test
public void testSaveUser() {
    UserDAO userDAO = new UserDAO();
    User user = new User("TestUser", "test@example.com");
    boolean result = userDAO.save(user);
    assertTrue(result);
}
