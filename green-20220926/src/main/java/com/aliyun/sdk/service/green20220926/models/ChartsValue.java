// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220926.models;

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
 * {@link ChartsValue} extends {@link TeaModel}
 *
 * <p>ChartsValue</p>
 */
public class ChartsValue extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("X")
    private java.util.List<String> x;

    @com.aliyun.core.annotation.NameInMap("Y")
    private java.util.List<Y> y;

    private ChartsValue(Builder builder) {
        this.x = builder.x;
        this.y = builder.y;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ChartsValue create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return x
     */
    public java.util.List<String> getX() {
        return this.x;
    }

    /**
     * @return y
     */
    public java.util.List<Y> getY() {
        return this.y;
    }

    public static final class Builder {
        private java.util.List<String> x; 
        private java.util.List<Y> y; 

        private Builder() {
        } 

        private Builder(ChartsValue model) {
            this.x = model.x;
            this.y = model.y;
        } 

        /**
         * X.
         */
        public Builder x(java.util.List<String> x) {
            this.x = x;
            return this;
        }

        /**
         * Y.
         */
        public Builder y(java.util.List<Y> y) {
            this.y = y;
            return this;
        }

        public ChartsValue build() {
            return new ChartsValue(this);
        } 

    } 

    /**
     * 
     * {@link ChartsValue} extends {@link TeaModel}
     *
     * <p>ChartsValue</p>
     */
    public static class Y extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Data")
        private java.util.List<Long> data;

        private Y(Builder builder) {
            this.name = builder.name;
            this.data = builder.data;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Y create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return data
         */
        public java.util.List<Long> getData() {
            return this.data;
        }

        public static final class Builder {
            private String name; 
            private java.util.List<Long> data; 

            private Builder() {
            } 

            private Builder(Y model) {
                this.name = model.name;
                this.data = model.data;
            } 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Data.
             */
            public Builder data(java.util.List<Long> data) {
                this.data = data;
                return this;
            }

            public Y build() {
                return new Y(this);
            } 

        } 

    }
}
