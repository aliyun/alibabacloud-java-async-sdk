// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListStorageCollectorResponseBody} extends {@link TeaModel}
 *
 * <p>ListStorageCollectorResponseBody</p>
 */
public class ListStorageCollectorResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("StorageCollectors")
    private java.util.List < StorageCollectors> storageCollectors;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListStorageCollectorResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.storageCollectors = builder.storageCollectors;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListStorageCollectorResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return storageCollectors
     */
    public java.util.List < StorageCollectors> getStorageCollectors() {
        return this.storageCollectors;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < StorageCollectors> storageCollectors; 
        private Boolean success; 
        private Integer totalCount; 

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * StorageCollectors.
         */
        public Builder storageCollectors(java.util.List < StorageCollectors> storageCollectors) {
            this.storageCollectors = storageCollectors;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListStorageCollectorResponseBody build() {
            return new ListStorageCollectorResponseBody(this);
        } 

    } 

    public static class StorageCollectors extends TeaModel {
        @NameInMap("DatasourceType")
        private String datasourceType;

        @NameInMap("Status")
        private String status;

        private StorageCollectors(Builder builder) {
            this.datasourceType = builder.datasourceType;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StorageCollectors create() {
            return builder().build();
        }

        /**
         * @return datasourceType
         */
        public String getDatasourceType() {
            return this.datasourceType;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String datasourceType; 
            private String status; 

            /**
             * DatasourceType.
             */
            public Builder datasourceType(String datasourceType) {
                this.datasourceType = datasourceType;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public StorageCollectors build() {
                return new StorageCollectors(this);
            } 

        } 

    }
}
