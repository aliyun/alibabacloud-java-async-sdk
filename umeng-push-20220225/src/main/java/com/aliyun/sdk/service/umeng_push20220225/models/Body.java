// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.umeng_push20220225.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link Body} extends {@link TeaModel}
 *
 * <p>Body</p>
 */
public class Body extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("activity")
    private String activity;

    @com.aliyun.core.annotation.NameInMap("addBadge")
    private Integer addBadge;

    @com.aliyun.core.annotation.NameInMap("afterOpen")
    @com.aliyun.core.annotation.Validation(maxLength = 16)
    private String afterOpen;

    @com.aliyun.core.annotation.NameInMap("builderId")
    private Long builderId;

    @com.aliyun.core.annotation.NameInMap("custom")
    private String custom;

    @com.aliyun.core.annotation.NameInMap("expandImage")
    private String expandImage;

    @com.aliyun.core.annotation.NameInMap("icon")
    @com.aliyun.core.annotation.Validation(maxLength = 1024)
    private String icon;

    @com.aliyun.core.annotation.NameInMap("img")
    @com.aliyun.core.annotation.Validation(maxLength = 1024)
    private String img;

    @com.aliyun.core.annotation.NameInMap("playLights")
    private Boolean playLights;

    @com.aliyun.core.annotation.NameInMap("playSound")
    private Boolean playSound;

    @com.aliyun.core.annotation.NameInMap("playVibrate")
    private Boolean playVibrate;

    @com.aliyun.core.annotation.NameInMap("rePop")
    private Integer rePop;

    @com.aliyun.core.annotation.NameInMap("setBadge")
    private Integer setBadge;

    @com.aliyun.core.annotation.NameInMap("sound")
    private String sound;

    @com.aliyun.core.annotation.NameInMap("text")
    @com.aliyun.core.annotation.Validation(maxLength = 1024)
    private String text;

    @com.aliyun.core.annotation.NameInMap("title")
    @com.aliyun.core.annotation.Validation(maxLength = 1024)
    private String title;

    @com.aliyun.core.annotation.NameInMap("url")
    private String url;

    private Body(Builder builder) {
        this.activity = builder.activity;
        this.addBadge = builder.addBadge;
        this.afterOpen = builder.afterOpen;
        this.builderId = builder.builderId;
        this.custom = builder.custom;
        this.expandImage = builder.expandImage;
        this.icon = builder.icon;
        this.img = builder.img;
        this.playLights = builder.playLights;
        this.playSound = builder.playSound;
        this.playVibrate = builder.playVibrate;
        this.rePop = builder.rePop;
        this.setBadge = builder.setBadge;
        this.sound = builder.sound;
        this.text = builder.text;
        this.title = builder.title;
        this.url = builder.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Body create() {
        return builder().build();
    }

    /**
     * @return activity
     */
    public String getActivity() {
        return this.activity;
    }

    /**
     * @return addBadge
     */
    public Integer getAddBadge() {
        return this.addBadge;
    }

    /**
     * @return afterOpen
     */
    public String getAfterOpen() {
        return this.afterOpen;
    }

    /**
     * @return builderId
     */
    public Long getBuilderId() {
        return this.builderId;
    }

    /**
     * @return custom
     */
    public String getCustom() {
        return this.custom;
    }

    /**
     * @return expandImage
     */
    public String getExpandImage() {
        return this.expandImage;
    }

    /**
     * @return icon
     */
    public String getIcon() {
        return this.icon;
    }

    /**
     * @return img
     */
    public String getImg() {
        return this.img;
    }

    /**
     * @return playLights
     */
    public Boolean getPlayLights() {
        return this.playLights;
    }

    /**
     * @return playSound
     */
    public Boolean getPlaySound() {
        return this.playSound;
    }

    /**
     * @return playVibrate
     */
    public Boolean getPlayVibrate() {
        return this.playVibrate;
    }

    /**
     * @return rePop
     */
    public Integer getRePop() {
        return this.rePop;
    }

    /**
     * @return setBadge
     */
    public Integer getSetBadge() {
        return this.setBadge;
    }

    /**
     * @return sound
     */
    public String getSound() {
        return this.sound;
    }

    /**
     * @return text
     */
    public String getText() {
        return this.text;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * @return url
     */
    public String getUrl() {
        return this.url;
    }

    public static final class Builder {
        private String activity; 
        private Integer addBadge; 
        private String afterOpen; 
        private Long builderId; 
        private String custom; 
        private String expandImage; 
        private String icon; 
        private String img; 
        private Boolean playLights; 
        private Boolean playSound; 
        private Boolean playVibrate; 
        private Integer rePop; 
        private Integer setBadge; 
        private String sound; 
        private String text; 
        private String title; 
        private String url; 

        /**
         * activity.
         */
        public Builder activity(String activity) {
            this.activity = activity;
            return this;
        }

        /**
         * addBadge.
         */
        public Builder addBadge(Integer addBadge) {
            this.addBadge = addBadge;
            return this;
        }

        /**
         * afterOpen.
         */
        public Builder afterOpen(String afterOpen) {
            this.afterOpen = afterOpen;
            return this;
        }

        /**
         * builderId.
         */
        public Builder builderId(Long builderId) {
            this.builderId = builderId;
            return this;
        }

        /**
         * custom.
         */
        public Builder custom(String custom) {
            this.custom = custom;
            return this;
        }

        /**
         * expandImage.
         */
        public Builder expandImage(String expandImage) {
            this.expandImage = expandImage;
            return this;
        }

        /**
         * icon.
         */
        public Builder icon(String icon) {
            this.icon = icon;
            return this;
        }

        /**
         * img.
         */
        public Builder img(String img) {
            this.img = img;
            return this;
        }

        /**
         * playLights.
         */
        public Builder playLights(Boolean playLights) {
            this.playLights = playLights;
            return this;
        }

        /**
         * playSound.
         */
        public Builder playSound(Boolean playSound) {
            this.playSound = playSound;
            return this;
        }

        /**
         * playVibrate.
         */
        public Builder playVibrate(Boolean playVibrate) {
            this.playVibrate = playVibrate;
            return this;
        }

        /**
         * rePop.
         */
        public Builder rePop(Integer rePop) {
            this.rePop = rePop;
            return this;
        }

        /**
         * setBadge.
         */
        public Builder setBadge(Integer setBadge) {
            this.setBadge = setBadge;
            return this;
        }

        /**
         * sound.
         */
        public Builder sound(String sound) {
            this.sound = sound;
            return this;
        }

        /**
         * text.
         */
        public Builder text(String text) {
            this.text = text;
            return this;
        }

        /**
         * title.
         */
        public Builder title(String title) {
            this.title = title;
            return this;
        }

        /**
         * url.
         */
        public Builder url(String url) {
            this.url = url;
            return this;
        }

        public Body build() {
            return new Body(this);
        } 

    } 

}
