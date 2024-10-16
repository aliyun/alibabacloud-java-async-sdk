// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.umeng_push20220225.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link Message2ThirdChannel} extends {@link TeaModel}
 *
 * <p>Message2ThirdChannel</p>
 */
public class Message2ThirdChannel extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("SetBadge")
    private Long setBadge;

    @com.aliyun.core.annotation.NameInMap("addBadge")
    private Long addBadge;

    @com.aliyun.core.annotation.NameInMap("bigBody")
    private String bigBody;

    @com.aliyun.core.annotation.NameInMap("bigTitle")
    private String bigTitle;

    @com.aliyun.core.annotation.NameInMap("expandImage")
    private String expandImage;

    @com.aliyun.core.annotation.NameInMap("img")
    private String img;

    @com.aliyun.core.annotation.NameInMap("sound")
    private String sound;

    @com.aliyun.core.annotation.NameInMap("text")
    private String text;

    @com.aliyun.core.annotation.NameInMap("title")
    private String title;

    private Message2ThirdChannel(Builder builder) {
        this.setBadge = builder.setBadge;
        this.addBadge = builder.addBadge;
        this.bigBody = builder.bigBody;
        this.bigTitle = builder.bigTitle;
        this.expandImage = builder.expandImage;
        this.img = builder.img;
        this.sound = builder.sound;
        this.text = builder.text;
        this.title = builder.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Message2ThirdChannel create() {
        return builder().build();
    }

    /**
     * @return setBadge
     */
    public Long getSetBadge() {
        return this.setBadge;
    }

    /**
     * @return addBadge
     */
    public Long getAddBadge() {
        return this.addBadge;
    }

    /**
     * @return bigBody
     */
    public String getBigBody() {
        return this.bigBody;
    }

    /**
     * @return bigTitle
     */
    public String getBigTitle() {
        return this.bigTitle;
    }

    /**
     * @return expandImage
     */
    public String getExpandImage() {
        return this.expandImage;
    }

    /**
     * @return img
     */
    public String getImg() {
        return this.img;
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

    public static final class Builder {
        private Long setBadge; 
        private Long addBadge; 
        private String bigBody; 
        private String bigTitle; 
        private String expandImage; 
        private String img; 
        private String sound; 
        private String text; 
        private String title; 

        /**
         * SetBadge.
         */
        public Builder setBadge(Long setBadge) {
            this.setBadge = setBadge;
            return this;
        }

        /**
         * addBadge.
         */
        public Builder addBadge(Long addBadge) {
            this.addBadge = addBadge;
            return this;
        }

        /**
         * bigBody.
         */
        public Builder bigBody(String bigBody) {
            this.bigBody = bigBody;
            return this;
        }

        /**
         * bigTitle.
         */
        public Builder bigTitle(String bigTitle) {
            this.bigTitle = bigTitle;
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
         * img.
         */
        public Builder img(String img) {
            this.img = img;
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

        public Message2ThirdChannel build() {
            return new Message2ThirdChannel(this);
        } 

    } 

}
