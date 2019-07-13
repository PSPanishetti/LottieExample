package in.codeworld.lottie;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.airbnb.lottie.LottieAnimationView;

public class MainActivity extends AppCompatActivity {

    LottieAnimationView lottieAnimationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lottieAnimationView=findViewById(R.id.animation_view);

    }

    public void confettiAnim(View view) {

        lottieAnimationView.setAnimation(R.raw.confetti_anim);
        lottieAnimationView.playAnimation();
        Toast.makeText(this, "Playing Confetti Anim", Toast.LENGTH_SHORT).show();

    }

    public void happyBirthDay(View view) {

        lottieAnimationView.setAnimation(R.raw.happy_birthday);
        lottieAnimationView.playAnimation();
        Toast.makeText(this, "Playing Happy Birthday Animation", Toast.LENGTH_SHORT).show();

    }

    public void motorCycle(View view) {

        lottieAnimationView.setAnimation(R.raw.bicycle);
        lottieAnimationView.playAnimation();
        Toast.makeText(this, "Playing Bicycle Anim", Toast.LENGTH_SHORT).show();
    }
}
