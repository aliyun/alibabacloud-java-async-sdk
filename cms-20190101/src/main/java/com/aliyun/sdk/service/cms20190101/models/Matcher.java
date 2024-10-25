// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link Matcher} extends {@link TeaModel}
 *
 * <p>Matcher</p>
 */
public class Matcher extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Label")
    private String label;

    @com.aliyun.core.annotation.NameInMap("Operator")
    private String operator;

    @com.aliyun.core.annotation.NameInMap("Value")
    private String value;

    private Matcher(Builder builder) {
        this.label = builder.label;
        this.operator = builder.operator;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Matcher create() {
        return builder().build();
    }

    /**
     * @return label
     */
    public String getLabel() {
        return this.label;
    }

    /**
     * @return operator
     */
    public String getOperator() {
        return this.operator;
    }

    /**
     * @return value
     */
    public String getValue() {
        return this.value;
    }

    public static final class Builder {
        private String label; 
        private String operator; 
        private String value; 

        /**
         * Label.
         */
        public Builder label(String label) {
            this.label = label;
            return this;
        }

        /**
         * Operator.
         */
        public Builder operator(String operator) {
            this.operator = operator;
            return this;
        }

        /**
         * Value.
         */
        public Builder value(String value) {
            this.value = value;
            return this;
        }

        public Matcher build() {
            return new Matcher(this);
        } 

    } 

}
