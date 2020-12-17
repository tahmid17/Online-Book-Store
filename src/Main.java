public class Main {
    public Main() {
        showRegisterWindow();
    }

    private void showRegisterWindow() {
        final LoginFrame loginFrame = new LoginFrame();
        loginFrame.show();
        loginFrame.setOnLoginButtonClickListener(new LoginFrame.OnLoginButtonClickListener() {
            @Override
            public void onClick(String email, String password) {
                //after clicking on login button this method will be called

                //if user is valid then home window opens
                loginFrame.dispose();

                openHome();
            }
        });

        loginFrame.setCreateNewButtonClickListener(new LoginFrame.OnCreateNewButtonClickListener() {
            @Override
            public void onClick() {
                showSignUpWindow();
            }
        });
    }

    private void openHome() {
        final HomeFrame homeFrame = new HomeFrame();
        homeFrame.show();
        homeFrame.setOnProfileButtonClickListener(new HomeFrame.OnProfileButtonClickListener() {
            @Override
            public void onClick() {
                homeFrame.dispose();
                new ProfileFrame().show();
            }
        });
    }

    private void showSignUpWindow() {
        SignUpFrame signUpFrame = new SignUpFrame();
        signUpFrame.show();
        signUpFrame.setOnSignUpButtonClickListener(new SignUpFrame.OnSignUpButtonClickListener() {
            @Override
            public void onClick(String name, String email, String phone, String address, String dob, String password) {
                //afterClicking sign up button
            }
        });
    }


    public static void main(String[] args) {
        new Main();
    }
}
