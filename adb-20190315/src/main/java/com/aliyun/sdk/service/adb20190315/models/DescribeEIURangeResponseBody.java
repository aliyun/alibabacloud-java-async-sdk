// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

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
 * {@link DescribeEIURangeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEIURangeResponseBody</p>
 */
public class DescribeEIURangeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EIUInfo")
    private EIUInfo EIUInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeEIURangeResponseBody(Builder builder) {
        this.EIUInfo = builder.EIUInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEIURangeResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return EIUInfo
     */
    public EIUInfo getEIUInfo() {
        return this.EIUInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private EIUInfo EIUInfo; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeEIURangeResponseBody model) {
            this.EIUInfo = model.EIUInfo;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The queried information about the number of EIUs.</p>
         */
        public Builder EIUInfo(EIUInfo EIUInfo) {
            this.EIUInfo = EIUInfo;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>D65A809F-34CE-4550-9BC1-0ED21ETG380</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeEIURangeResponseBody build() {
            return new DescribeEIURangeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeEIURangeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEIURangeResponseBody</p>
     */
    public static class EIUInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DefaultValue")
        private String defaultValue;

        @com.aliyun.core.annotation.NameInMap("EIURange")
        private java.util.List<Long> EIURange;

        @com.aliyun.core.annotation.NameInMap("MaxValue")
        private String maxValue;

        @com.aliyun.core.annotation.NameInMap("MinValue")
        private String minValue;

        @com.aliyun.core.annotation.NameInMap("Step")
        private String step;

        @com.aliyun.core.annotation.NameInMap("StorageResourceRange")
        private java.util.List<String> storageResourceRange;

        private EIUInfo(Builder builder) {
            this.defaultValue = builder.defaultValue;
            this.EIURange = builder.EIURange;
            this.maxValue = builder.maxValue;
            this.minValue = builder.minValue;
            this.step = builder.step;
            this.storageResourceRange = builder.storageResourceRange;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EIUInfo create() {
            return builder().build();
        }

        /**
         * @return defaultValue
         */
        public String getDefaultValue() {
            return this.defaultValue;
        }

        /**
         * @return EIURange
         */
        public java.util.List<Long> getEIURange() {
            return this.EIURange;
        }

        /**
         * @return maxValue
         */
        public String getMaxValue() {
            return this.maxValue;
        }

        /**
         * @return minValue
         */
        public String getMinValue() {
            return this.minValue;
        }

        /**
         * @return step
         */
        public String getStep() {
            return this.step;
        }

        /**
         * @return storageResourceRange
         */
        public java.util.List<String> getStorageResourceRange() {
            return this.storageResourceRange;
        }

        public static final class Builder {
            private String defaultValue; 
            private java.util.List<Long> EIURange; 
            private String maxValue; 
            private String minValue; 
            private String step; 
            private java.util.List<String> storageResourceRange; 

            private Builder() {
            } 

            private Builder(EIUInfo model) {
                this.defaultValue = model.defaultValue;
                this.EIURange = model.EIURange;
                this.maxValue = model.maxValue;
                this.minValue = model.minValue;
                this.step = model.step;
                this.storageResourceRange = model.storageResourceRange;
            } 

            /**
             * <p>The suggested value for the number of EIUs.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder defaultValue(String defaultValue) {
                this.defaultValue = defaultValue;
                return this;
            }

            /**
             * <p>The queried range for the number of EIUs.</p>
             */
            public Builder EIURange(java.util.List<Long> EIURange) {
                this.EIURange = EIURange;
                return this;
            }

            /**
             * <p>A reserved parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>none</p>
             */
            public Builder maxValue(String maxValue) {
                this.maxValue = maxValue;
                return this;
            }

            /**
             * <p>A reserved parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>none</p>
             */
            public Builder minValue(String minValue) {
                this.minValue = minValue;
                return this;
            }

            /**
             * <p>A reserved parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>none</p>
             */
            public Builder step(String step) {
                this.step = step;
                return this;
            }

            /**
             * <p>A reserved parameter.</p>
             */
            public Builder storageResourceRange(java.util.List<String> storageResourceRange) {
                this.storageResourceRange = storageResourceRange;
                return this;
            }

            public EIUInfo build() {
                return new EIUInfo(this);
            } 

        } 

    }
}
