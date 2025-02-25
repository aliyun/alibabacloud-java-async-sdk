// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20230930.models;

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
 * {@link ProductProperty} extends {@link TeaModel}
 *
 * <p>ProductProperty</p>
 */
public class ProductProperty extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("text")
    private String text;

    @com.aliyun.core.annotation.NameInMap("values")
    private java.util.List<String> values;

    private ProductProperty(Builder builder) {
        this.text = builder.text;
        this.values = builder.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ProductProperty create() {
        return builder().build();
    }

    /**
     * @return text
     */
    public String getText() {
        return this.text;
    }

    /**
     * @return values
     */
    public java.util.List<String> getValues() {
        return this.values;
    }

    public static final class Builder {
        private String text; 
        private java.util.List<String> values; 

        /**
         * text.
         */
        public Builder text(String text) {
            this.text = text;
            return this;
        }

        /**
         * values.
         */
        public Builder values(java.util.List<String> values) {
            this.values = values;
            return this;
        }

        public ProductProperty build() {
            return new ProductProperty(this);
        } 

    } 

}
