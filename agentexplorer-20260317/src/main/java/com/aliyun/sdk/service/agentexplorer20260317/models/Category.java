// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentexplorer20260317.models;

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
 * {@link Category} extends {@link TeaModel}
 *
 * <p>Category</p>
 */
public class Category extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("children")
    private java.util.List<Children> children;

    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    private Category(Builder builder) {
        this.children = builder.children;
        this.code = builder.code;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Category create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return children
     */
    public java.util.List<Children> getChildren() {
        return this.children;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder {
        private java.util.List<Children> children; 
        private String code; 
        private String name; 

        private Builder() {
        } 

        private Builder(Category model) {
            this.children = model.children;
            this.code = model.code;
            this.name = model.name;
        } 

        /**
         * children.
         */
        public Builder children(java.util.List<Children> children) {
            this.children = children;
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
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Category build() {
            return new Category(this);
        } 

    } 

    /**
     * 
     * {@link Category} extends {@link TeaModel}
     *
     * <p>Category</p>
     */
    public static class Children extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        private Children(Builder builder) {
            this.code = builder.code;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Children create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String code; 
            private String name; 

            private Builder() {
            } 

            private Builder(Children model) {
                this.code = model.code;
                this.name = model.name;
            } 

            /**
             * code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Children build() {
                return new Children(this);
            } 

        } 

    }
}
