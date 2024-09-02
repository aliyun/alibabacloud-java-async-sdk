// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link Domain} extends {@link TeaModel}
 *
 * <p>Domain</p>
 */
public class Domain extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("category")
    private String category;

    @com.aliyun.core.annotation.NameInMap("functions")
    private java.util.Map < String, java.util.List<String>> functions;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    private Domain(Builder builder) {
        this.category = builder.category;
        this.functions = builder.functions;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Domain create() {
        return builder().build();
    }

    /**
     * @return category
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * @return functions
     */
    public java.util.Map < String, java.util.List<String>> getFunctions() {
        return this.functions;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder {
        private String category; 
        private java.util.Map < String, java.util.List<String>> functions; 
        private String name; 

        /**
         * category.
         */
        public Builder category(String category) {
            this.category = category;
            return this;
        }

        /**
         * functions.
         */
        public Builder functions(java.util.Map < String, java.util.List<String>> functions) {
            this.functions = functions;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Domain build() {
            return new Domain(this);
        } 

    } 

}
