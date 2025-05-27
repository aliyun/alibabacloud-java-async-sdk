// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetCapacityResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The information about the storage capacity.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>27D27DCB-D76B-5064-8B3B-0900DEF7****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetCapacityResponseBody build() {
            return new GetCapacityResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetCapacityResponseBody} extends {@link TeaModel}
     *
     * <p>GetCapacityResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Data model) {
                this.existLogStore = model.existLogStore;
                this.preservedCapacity = model.preservedCapacity;
                this.usedCapacity = model.usedCapacity;
            } 

            /**
             * <p>Indicates whether the Logstores for the threat analysis feature exist on the user side. Valid values:</p>
             * <ul>
             * <li>true: The logs are in the normal state. The log analysis feature is available.</li>
             * <li>false: The logs are being cleared. The log analysis feature is unavailable.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder existLogStore(Boolean existLogStore) {
                this.existLogStore = existLogStore;
                return this;
            }

            /**
             * <p>The purchased storage capacity of the threat analysis feature. Unit: GB.</p>
             * 
             * <strong>example:</strong>
             * <p>9000</p>
             */
            public Builder preservedCapacity(Long preservedCapacity) {
                this.preservedCapacity = preservedCapacity;
                return this;
            }

            /**
             * <p>The billable storage capacity of the threat analysis feature. Unit: GB.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
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
