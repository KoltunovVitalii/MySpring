package ru.koltunov.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


    @Component

    public class MusicPlayer {

        @Value("${musicPlayer.name}")
        private String name;
        @Value("${musicPlayer.volume}")
        private int volume;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getVolume() {
            return volume;
        }

        public void setVolume(int volume) {
            this.volume = volume;
        }

        @Autowired
        @Qualifier("rockMusic")
        private Music music;

        @Autowired
        @Qualifier("rapMusic")
        private Music music2;

        public String playMusic() {
            return "Playing: " + music.getSong() + ", " + music2.getSong();
        }
    }
