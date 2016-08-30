package eder.padilla.personal.works.yuume;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {
    ImageView play,miniplay,albumtop,albumbottom,albumcenter,menu,albums,notification,user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        play=(ImageView)findViewById(R.id.play);
        Picasso.with(this)
                .load(R.drawable.play_music_icon)
                //.load("https://lh3.googleusercontent.com/gdBHEk-u3YRDtuCU3iDTQ52nZd1t4GPmldYaT26Jh6EhXgp1mlhQiuLFl4eXDAXzDig5=w300")
                .resize(300, 300)                        // optional
                .into(play);
        miniplay=(ImageView)findViewById(R.id.miniplay);
        Picasso.with(this)
        .load("https://lh3.googleusercontent.com/gdBHEk-u3YRDtuCU3iDTQ52nZd1t4GPmldYaT26Jh6EhXgp1mlhQiuLFl4eXDAXzDig5=w300")
                .resize(250, 250)                        // optional
                .into(miniplay);
        albumtop=(ImageView)findViewById(R.id.album1);
        Picasso.with(this)
                .load("https://s-media-cache-ak0.pinimg.com/236x/aa/b1/ec/aab1ecb34b618b8e62cabb604822c9a1.jpg")
                .resize(5, 5)                        // optional
                .into(albumtop);

        albumbottom=(ImageView)findViewById(R.id.albumbottom);
        Picasso.with(this)
                .load("http://www.jazjaz.net/wp-content/uploads/2013/05/The-Black-Arrow-In-Bloom-Large_thumb.jpg")
                .resize(50, 50)                        // optional
                .into(albumtop);

        albumcenter=(ImageView)findViewById(R.id.albumcenter);
        Picasso.with(this)
                .load("http://www.designformusic.com/wp-content/uploads/2016/01/perfectly-chilled-album-cover-artwork-design.jpg")
                .resize(250, 250)                        // optional
                .into(albumcenter);
        menu=(ImageView)findViewById(R.id.menu);
        Picasso.with(this)
                .load("http://www.johnschnell.net/img/icons/site-navigation/mobile-menu.png")
                .resize(250, 250)                        // optional
                .into(menu);
        albums=(ImageView)findViewById(R.id.albums);
        Picasso.with(this)
                .load("https://cdn4.iconfinder.com/data/icons/basic-ui-elements/700/06_menu_grid-512.png")
                .resize(250, 250)                        // optional
                .into(albums);
        user=(ImageView)findViewById(R.id.user);
        Picasso.with(this)
                .load("http://iconshow.me/media/images/ui/ios7-icons/png/512/contact.png")
                .resize(250, 250)                        // optional
                .into(user);
        notification=(ImageView)findViewById(R.id.notification);
        Picasso.with(this)
                .load("https://d3rnbxvnd0hlox.cloudfront.net/images/channels/651849913/icons/on_color_large.png")
                .resize(250, 250)                        // optional
                .into(notification);

    }
}
