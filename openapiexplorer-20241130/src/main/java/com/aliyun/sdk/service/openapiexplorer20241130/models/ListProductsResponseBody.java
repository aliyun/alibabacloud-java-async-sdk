// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.openapiexplorer20241130.models;

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
 * {@link ListProductsResponseBody} extends {@link TeaModel}
 *
 * <p>ListProductsResponseBody</p>
 */
public class ListProductsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("products")
    private java.util.List<Products> products;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private ListProductsResponseBody(Builder builder) {
        this.products = builder.products;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProductsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return products
     */
    public java.util.List<Products> getProducts() {
        return this.products;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Products> products; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListProductsResponseBody model) {
            this.products = model.products;
            this.requestId = model.requestId;
        } 

        /**
         * products.
         */
        public Builder products(java.util.List<Products> products) {
            this.products = products;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListProductsResponseBody build() {
            return new ListProductsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListProductsResponseBody} extends {@link TeaModel}
     *
     * <p>ListProductsResponseBody</p>
     */
    public static class Products extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("category2Name")
        private String category2Name;

        @com.aliyun.core.annotation.NameInMap("categoryName")
        private String categoryName;

        @com.aliyun.core.annotation.NameInMap("code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("defaultVersion")
        private String defaultVersion;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("group")
        private String group;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("shortName")
        private String shortName;

        @com.aliyun.core.annotation.NameInMap("style")
        private String style;

        @com.aliyun.core.annotation.NameInMap("versions")
        private java.util.List<String> versions;

        private Products(Builder builder) {
            this.category2Name = builder.category2Name;
            this.categoryName = builder.categoryName;
            this.code = builder.code;
            this.defaultVersion = builder.defaultVersion;
            this.description = builder.description;
            this.group = builder.group;
            this.name = builder.name;
            this.shortName = builder.shortName;
            this.style = builder.style;
            this.versions = builder.versions;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Products create() {
            return builder().build();
        }

        /**
         * @return category2Name
         */
        public String getCategory2Name() {
            return this.category2Name;
        }

        /**
         * @return categoryName
         */
        public String getCategoryName() {
            return this.categoryName;
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return defaultVersion
         */
        public String getDefaultVersion() {
            return this.defaultVersion;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return group
         */
        public String getGroup() {
            return this.group;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return shortName
         */
        public String getShortName() {
            return this.shortName;
        }

        /**
         * @return style
         */
        public String getStyle() {
            return this.style;
        }

        /**
         * @return versions
         */
        public java.util.List<String> getVersions() {
            return this.versions;
        }

        public static final class Builder {
            private String category2Name; 
            private String categoryName; 
            private String code; 
            private String defaultVersion; 
            private String description; 
            private String group; 
            private String name; 
            private String shortName; 
            private String style; 
            private java.util.List<String> versions; 

            private Builder() {
            } 

            private Builder(Products model) {
                this.category2Name = model.category2Name;
                this.categoryName = model.categoryName;
                this.code = model.code;
                this.defaultVersion = model.defaultVersion;
                this.description = model.description;
                this.group = model.group;
                this.name = model.name;
                this.shortName = model.shortName;
                this.style = model.style;
                this.versions = model.versions;
            } 

            /**
             * category2Name.
             */
            public Builder category2Name(String category2Name) {
                this.category2Name = category2Name;
                return this;
            }

            /**
             * categoryName.
             */
            public Builder categoryName(String categoryName) {
                this.categoryName = categoryName;
                return this;
            }

            /**
             * code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * defaultVersion.
             */
            public Builder defaultVersion(String defaultVersion) {
                this.defaultVersion = defaultVersion;
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
             * group.
             */
            public Builder group(String group) {
                this.group = group;
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
             * shortName.
             */
            public Builder shortName(String shortName) {
                this.shortName = shortName;
                return this;
            }

            /**
             * style.
             */
            public Builder style(String style) {
                this.style = style;
                return this;
            }

            /**
             * versions.
             */
            public Builder versions(java.util.List<String> versions) {
                this.versions = versions;
                return this;
            }

            public Products build() {
                return new Products(this);
            } 

        } 

    }
}
