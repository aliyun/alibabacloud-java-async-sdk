// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCapacityResponseBody} extends {@link TeaModel}
 *
 * <p>GetCapacityResponseBody</p>
 */
public class GetCapacityResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetCapacityResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCapacityResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        /**
         * The information about the storage capacity.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetCapacityResponseBody build() {
            return new GetCapacityResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExistLogStore")
        private Boolean existLogStore;

        @com.aliyun.core.annotation.NameInMap("PreservedCapacity")
        private Long preservedCapacity;

        @com.aliyun.core.annotation.NameInMap("UsedCapacity")
        private Double usedCapacity;

        private Data(Builder builder) {
            this.existLogStore = builder.existLogStore;
            this.preservedCapacity = builder.preservedCapacity;
            this.usedCapacity = builder.usedCapacity;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return existLogStore
         */
        public Boolean getExistLogStore() {
            return this.existLogStore;
        }

        /**
         * @return preservedCapacity
         */
        public Long getPreservedCapacity() {
            return this.preservedCapacity;
        }

        /**
         * @return usedCapacity
         */
        public Double getUsedCapacity() {
            return this.usedCapacity;
        }

        public static final class Builder {
            private Boolean existLogStore; 
            private Long preservedCapacity; 
            private Double usedCapacity; 

            /**
             * Indicates whether the Logstores for the threat analysis feature exist on the user side. Valid values:
             * <p>
             * 
             * *   true: The logs are in the normal state. The log analysis feature is available.
             * *   false: The logs are being cleared. The log analysis feature is unavailable.
             */
            public Builder existLogStore(Boolean existLogStore) {
                this.existLogStore = existLogStore;
                return this;
            }

            /**
             * The purchased storage capacity of the threat analysis feature. Unit: GB.
             */
            public Builder preservedCapacity(Long preservedCapacity) {
                this.preservedCapacity = preservedCapacity;
                return this;
            }

            /**
             * The billable storage capacity of the threat analysis feature. Unit: GB.
             */
            public Builder usedCapacity(Double usedCapacity) {
                this.usedCapacity = usedCapacity;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
