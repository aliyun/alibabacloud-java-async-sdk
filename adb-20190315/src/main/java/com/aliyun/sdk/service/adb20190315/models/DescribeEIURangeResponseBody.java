// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEIURangeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEIURangeResponseBody</p>
 */
public class DescribeEIURangeResponseBody extends TeaModel {
    @NameInMap("EIUInfo")
    private EIUInfo EIUInfo;

    @NameInMap("RequestId")
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

        /**
         * The queried information about the number of EIUs.
         */
        public Builder EIUInfo(EIUInfo EIUInfo) {
            this.EIUInfo = EIUInfo;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeEIURangeResponseBody build() {
            return new DescribeEIURangeResponseBody(this);
        } 

    } 

    public static class EIUInfo extends TeaModel {
        @NameInMap("DefaultValue")
        private String defaultValue;

        @NameInMap("EIURange")
        private java.util.List < Long > EIURange;

        @NameInMap("StorageResourceRange")
        private java.util.List < String > storageResourceRange;

        private EIUInfo(Builder builder) {
            this.defaultValue = builder.defaultValue;
            this.EIURange = builder.EIURange;
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
        public java.util.List < Long > getEIURange() {
            return this.EIURange;
        }

        /**
         * @return storageResourceRange
         */
        public java.util.List < String > getStorageResourceRange() {
            return this.storageResourceRange;
        }

        public static final class Builder {
            private String defaultValue; 
            private java.util.List < Long > EIURange; 
            private java.util.List < String > storageResourceRange; 

            /**
             * The suggested value for the number of EIUs.
             */
            public Builder defaultValue(String defaultValue) {
                this.defaultValue = defaultValue;
                return this;
            }

            /**
             * The queried range for the number of EIUs.
             */
            public Builder EIURange(java.util.List < Long > EIURange) {
                this.EIURange = EIURange;
                return this;
            }

            /**
             * A reserved parameter.
             */
            public Builder storageResourceRange(java.util.List < String > storageResourceRange) {
                this.storageResourceRange = storageResourceRange;
                return this;
            }

            public EIUInfo build() {
                return new EIUInfo(this);
            } 

        } 

    }
}
