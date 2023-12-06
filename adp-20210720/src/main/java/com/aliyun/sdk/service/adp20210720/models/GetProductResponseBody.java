// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adp20210720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetProductResponseBody} extends {@link TeaModel}
 *
 * <p>GetProductResponseBody</p>
 */
public class GetProductResponseBody extends TeaModel {
    @NameInMap("code")
    private String code;

    @NameInMap("data")
    private Data data;

    @NameInMap("msg")
    private String msg;

    private GetProductResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.msg = builder.msg;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetProductResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return msg
     */
    public String getMsg() {
        return this.msg;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String msg; 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * msg.
         */
        public Builder msg(String msg) {
            this.msg = msg;
            return this;
        }

        public GetProductResponseBody build() {
            return new GetProductResponseBody(this);
        } 

    } 

    public static class Icons extends TeaModel {
        @NameInMap("description")
        private String description;

        @NameInMap("name")
        private String name;

        @NameInMap("url")
        private String url;

        private Icons(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Icons create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String description; 
            private String name; 
            private String url; 

            /**
             * description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public Icons build() {
                return new Icons(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("categories")
        private java.util.List < String > categories;

        @NameInMap("description")
        private String description;

        @NameInMap("displayName")
        private String displayName;

        @NameInMap("icons")
        private java.util.List < Icons> icons;

        @NameInMap("name")
        private String name;

        @NameInMap("uid")
        private String uid;

        @NameInMap("vendor")
        private String vendor;

        private Data(Builder builder) {
            this.categories = builder.categories;
            this.description = builder.description;
            this.displayName = builder.displayName;
            this.icons = builder.icons;
            this.name = builder.name;
            this.uid = builder.uid;
            this.vendor = builder.vendor;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return categories
         */
        public java.util.List < String > getCategories() {
            return this.categories;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return icons
         */
        public java.util.List < Icons> getIcons() {
            return this.icons;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return uid
         */
        public String getUid() {
            return this.uid;
        }

        /**
         * @return vendor
         */
        public String getVendor() {
            return this.vendor;
        }

        public static final class Builder {
            private java.util.List < String > categories; 
            private String description; 
            private String displayName; 
            private java.util.List < Icons> icons; 
            private String name; 
            private String uid; 
            private String vendor; 

            /**
             * categories.
             */
            public Builder categories(java.util.List < String > categories) {
                this.categories = categories;
                return this;
            }

            /**
             * description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * displayName.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * icons.
             */
            public Builder icons(java.util.List < Icons> icons) {
                this.icons = icons;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * uid.
             */
            public Builder uid(String uid) {
                this.uid = uid;
                return this;
            }

            /**
             * vendor.
             */
            public Builder vendor(String vendor) {
                this.vendor = vendor;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
