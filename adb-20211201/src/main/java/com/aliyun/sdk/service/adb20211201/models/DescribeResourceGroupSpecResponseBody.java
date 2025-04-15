// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

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
 * {@link DescribeResourceGroupSpecResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeResourceGroupSpecResponseBody</p>
 */
public class DescribeResourceGroupSpecResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Specs")
    private java.util.List<Specs> specs;

    private DescribeResourceGroupSpecResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.specs = builder.specs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeResourceGroupSpecResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return specs
     */
    public java.util.List<Specs> getSpecs() {
        return this.specs;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<Specs> specs; 

        private Builder() {
        } 

        private Builder(DescribeResourceGroupSpecResponseBody model) {
            this.requestId = model.requestId;
            this.specs = model.specs;
        } 

        /**
         * <p>requestId</p>
         * 
         * <strong>example:</strong>
         * <p>10226189-4391-5B10-97AF-5CA5XXXXXXX</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Specs.
         */
        public Builder specs(java.util.List<Specs> specs) {
            this.specs = specs;
            return this;
        }

        public DescribeResourceGroupSpecResponseBody build() {
            return new DescribeResourceGroupSpecResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeResourceGroupSpecResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeResourceGroupSpecResponseBody</p>
     */
    public static class Specs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllocateUnits")
        private java.util.List<String> allocateUnits;

        @com.aliyun.core.annotation.NameInMap("MaxQuantity")
        private Integer maxQuantity;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Specs(Builder builder) {
            this.allocateUnits = builder.allocateUnits;
            this.maxQuantity = builder.maxQuantity;
            this.name = builder.name;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Specs create() {
            return builder().build();
        }

        /**
         * @return allocateUnits
         */
        public java.util.List<String> getAllocateUnits() {
            return this.allocateUnits;
        }

        /**
         * @return maxQuantity
         */
        public Integer getMaxQuantity() {
            return this.maxQuantity;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private java.util.List<String> allocateUnits; 
            private Integer maxQuantity; 
            private String name; 
            private String type; 

            private Builder() {
            } 

            private Builder(Specs model) {
                this.allocateUnits = model.allocateUnits;
                this.maxQuantity = model.maxQuantity;
                this.name = model.name;
                this.type = model.type;
            } 

            /**
             * AllocateUnits.
             */
            public Builder allocateUnits(java.util.List<String> allocateUnits) {
                this.allocateUnits = allocateUnits;
                return this;
            }

            /**
             * MaxQuantity.
             */
            public Builder maxQuantity(Integer maxQuantity) {
                this.maxQuantity = maxQuantity;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Specs build() {
                return new Specs(this);
            } 

        } 

    }
}
