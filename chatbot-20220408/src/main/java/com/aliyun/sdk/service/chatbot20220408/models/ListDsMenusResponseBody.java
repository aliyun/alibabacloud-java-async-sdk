// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDsMenusResponseBody} extends {@link TeaModel}
 *
 * <p>ListDsMenusResponseBody</p>
 */
public class ListDsMenusResponseBody extends TeaModel {
    @NameInMap("Ext")
    private String ext;

    @NameInMap("Menus")
    private java.util.List < Menus> menus;

    @NameInMap("RequestId")
    private String requestId;

    private ListDsMenusResponseBody(Builder builder) {
        this.ext = builder.ext;
        this.menus = builder.menus;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDsMenusResponseBody create() {
        return builder().build();
    }

    /**
     * @return ext
     */
    public String getExt() {
        return this.ext;
    }

    /**
     * @return menus
     */
    public java.util.List < Menus> getMenus() {
        return this.menus;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String ext; 
        private java.util.List < Menus> menus; 
        private String requestId; 

        /**
         * Ext.
         */
        public Builder ext(String ext) {
            this.ext = ext;
            return this;
        }

        /**
         * Menus.
         */
        public Builder menus(java.util.List < Menus> menus) {
            this.menus = menus;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListDsMenusResponseBody build() {
            return new ListDsMenusResponseBody(this);
        } 

    } 

    public static class Menus extends TeaModel {
        @NameInMap("Tag")
        private String tag;

        @NameInMap("Title")
        private String title;

        @NameInMap("TitleEn")
        private String titleEn;

        @NameInMap("Url")
        private String url;

        private Menus(Builder builder) {
            this.tag = builder.tag;
            this.title = builder.title;
            this.titleEn = builder.titleEn;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Menus create() {
            return builder().build();
        }

        /**
         * @return tag
         */
        public String getTag() {
            return this.tag;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return titleEn
         */
        public String getTitleEn() {
            return this.titleEn;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String tag; 
            private String title; 
            private String titleEn; 
            private String url; 

            /**
             * Tag.
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            /**
             * Title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * TitleEn.
             */
            public Builder titleEn(String titleEn) {
                this.titleEn = titleEn;
                return this;
            }

            /**
             * Url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public Menus build() {
                return new Menus(this);
            } 

        } 

    }
}
