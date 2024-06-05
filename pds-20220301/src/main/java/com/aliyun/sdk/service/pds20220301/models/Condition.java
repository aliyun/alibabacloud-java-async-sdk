// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link Condition} extends {@link TeaModel}
 *
 * <p>Condition</p>
 */
public class Condition extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("int_equals")
    private java.util.List < Long > intEquals;

    @com.aliyun.core.annotation.NameInMap("int_not_equals")
    private java.util.List < Long > intNotEquals;

    @com.aliyun.core.annotation.NameInMap("string_equals")
    private java.util.List < String > stringEquals;

    @com.aliyun.core.annotation.NameInMap("string_not_equals")
    private java.util.List < String > stringNotEquals;

    private Condition(Builder builder) {
        this.intEquals = builder.intEquals;
        this.intNotEquals = builder.intNotEquals;
        this.stringEquals = builder.stringEquals;
        this.stringNotEquals = builder.stringNotEquals;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Condition create() {
        return builder().build();
    }

    /**
     * @return intEquals
     */
    public java.util.List < Long > getIntEquals() {
        return this.intEquals;
    }

    /**
     * @return intNotEquals
     */
    public java.util.List < Long > getIntNotEquals() {
        return this.intNotEquals;
    }

    /**
     * @return stringEquals
     */
    public java.util.List < String > getStringEquals() {
        return this.stringEquals;
    }

    /**
     * @return stringNotEquals
     */
    public java.util.List < String > getStringNotEquals() {
        return this.stringNotEquals;
    }

    public static final class Builder {
        private java.util.List < Long > intEquals; 
        private java.util.List < Long > intNotEquals; 
        private java.util.List < String > stringEquals; 
        private java.util.List < String > stringNotEquals; 

        /**
         * int_equals.
         */
        public Builder intEquals(java.util.List < Long > intEquals) {
            this.intEquals = intEquals;
            return this;
        }

        /**
         * int_not_equals.
         */
        public Builder intNotEquals(java.util.List < Long > intNotEquals) {
            this.intNotEquals = intNotEquals;
            return this;
        }

        /**
         * string_equals.
         */
        public Builder stringEquals(java.util.List < String > stringEquals) {
            this.stringEquals = stringEquals;
            return this;
        }

        /**
         * string_not_equals.
         */
        public Builder stringNotEquals(java.util.List < String > stringNotEquals) {
            this.stringNotEquals = stringNotEquals;
            return this;
        }

        public Condition build() {
            return new Condition(this);
        } 

    } 

}
