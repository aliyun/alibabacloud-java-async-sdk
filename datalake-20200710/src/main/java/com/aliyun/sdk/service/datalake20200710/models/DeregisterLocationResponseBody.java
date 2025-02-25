// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeregisterLocationResponseBody} extends {@link TeaModel}
 *
 * <p>DeregisterLocationResponseBody</p>
 */
public class DeregisterLocationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DeregisterLocationResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeregisterLocationResponseBody create() {
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

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 
        private Boolean success; 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DeregisterLocationResponseBody build() {
            return new DeregisterLocationResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LocationId")
        private String locationId;

        @com.aliyun.core.annotation.NameInMap("StorageCollectTaskOperationResultList")
        private java.util.List < StorageCollectTaskOperationResult > storageCollectTaskOperationResultList;

        private Data(Builder builder) {
            this.locationId = builder.locationId;
            this.storageCollectTaskOperationResultList = builder.storageCollectTaskOperationResultList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return locationId
         */
        public String getLocationId() {
            return this.locationId;
        }

        /**
         * @return storageCollectTaskOperationResultList
         */
        public java.util.List < StorageCollectTaskOperationResult > getStorageCollectTaskOperationResultList() {
            return this.storageCollectTaskOperationResultList;
        }

        public static final class Builder {
            private String locationId; 
            private java.util.List < StorageCollectTaskOperationResult > storageCollectTaskOperationResultList; 

            /**
             * Location ID
             */
            public Builder locationId(String locationId) {
                this.locationId = locationId;
                return this;
            }

            /**
             * StorageCollectTaskOperationResultList.
             */
            public Builder storageCollectTaskOperationResultList(java.util.List < StorageCollectTaskOperationResult > storageCollectTaskOperationResultList) {
                this.storageCollectTaskOperationResultList = storageCollectTaskOperationResultList;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
