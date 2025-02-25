// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devs20230714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link Variable} extends {@link TeaModel}
 *
 * <p>Variable</p>
 */
public class Variable extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("value")
    private String value;

    private Variable(Builder builder) {
        this.name = builder.name;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Variable create() {
        return builder().build();
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return value
     */
    public String getValue() {
        return this.value;
    }

    public static final class Builder {
        private String name; 
        private String value; 

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * value.
         */
        public Builder value(String value) {
            this.value = value;
            return this;
        }

        public Variable build() {
            return new Variable(this);
        } 

    } 

}
