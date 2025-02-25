// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.umeng_push20220225.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link HarmonyBody} extends {@link TeaModel}
 *
 * <p>HarmonyBody</p>
 */
public class HarmonyBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("action")
    private String action;

    @com.aliyun.core.annotation.NameInMap("addBadge")
    private Integer addBadge;

    @com.aliyun.core.annotation.NameInMap("afterOpen")
    private String afterOpen;

    @com.aliyun.core.annotation.NameInMap("bigBody")
    private String bigBody;

    @com.aliyun.core.annotation.NameInMap("custom")
    private String custom;

    @com.aliyun.core.annotation.NameInMap("img")
    private String img;

    @com.aliyun.core.annotation.NameInMap("largeIcon")
    private String largeIcon;

    @com.aliyun.core.annotation.NameInMap("text")
    private String text;

    @com.aliyun.core.annotation.NameInMap("title")
    private String title;

    @com.aliyun.core.annotation.NameInMap("uri")
    private String uri;

    private HarmonyBody(Builder builder) {
        this.action = builder.action;
        this.addBadge = builder.addBadge;
        this.afterOpen = builder.afterOpen;
        this.bigBody = builder.bigBody;
        this.custom = builder.custom;
        this.img = builder.img;
        this.largeIcon = builder.largeIcon;
        this.text = builder.text;
        this.title = builder.title;
        this.uri = builder.uri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static HarmonyBody create() {
        return builder().build();
    }

    /**
     * @return action
     */
    public String getAction() {
        return this.action;
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
     * @return bigBody
     */
    public String getBigBody() {
        return this.bigBody;
    }

    /**
     * @return custom
     */
    public String getCustom() {
        return this.custom;
    }

    /**
     * @return img
     */
    public String getImg() {
        return this.img;
    }

    /**
     * @return largeIcon
     */
    public String getLargeIcon() {
        return this.largeIcon;
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
     * @return uri
     */
    public String getUri() {
        return this.uri;
    }

    public static final class Builder {
        private String action; 
        private Integer addBadge; 
        private String afterOpen; 
        private String bigBody; 
        private String custom; 
        private String img; 
        private String largeIcon; 
        private String text; 
        private String title; 
        private String uri; 

        /**
         * action.
         */
        public Builder action(String action) {
            this.action = action;
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
         * bigBody.
         */
        public Builder bigBody(String bigBody) {
            this.bigBody = bigBody;
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
         * img.
         */
        public Builder img(String img) {
            this.img = img;
            return this;
        }

        /**
         * largeIcon.
         */
        public Builder largeIcon(String largeIcon) {
            this.largeIcon = largeIcon;
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
         * uri.
         */
        public Builder uri(String uri) {
            this.uri = uri;
            return this;
        }

        public HarmonyBody build() {
            return new HarmonyBody(this);
        } 

    } 

}
