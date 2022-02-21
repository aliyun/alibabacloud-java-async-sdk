// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVsStorageUsageDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVsStorageUsageDataResponseBody</p>
 */
public class DescribeVsStorageUsageDataResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("StorageUsage")
    private StorageUsage storageUsage;

    private DescribeVsStorageUsageDataResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.storageUsage = builder.storageUsage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVsStorageUsageDataResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return storageUsage
     */
    public StorageUsage getStorageUsage() {
        return this.storageUsage;
    }

    public static final class Builder {
        private String requestId; 
        private StorageUsage storageUsage; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * StorageUsage.
         */
        public Builder storageUsage(StorageUsage storageUsage) {
            this.storageUsage = storageUsage;
            return this;
        }

        public DescribeVsStorageUsageDataResponseBody build() {
            return new DescribeVsStorageUsageDataResponseBody(this);
        } 

    } 

    public static class StorageUsageDataModule extends TeaModel {
        @NameInMap("Bucket")
        private String bucket;

        @NameInMap("StorageDataValue")
        private Integer storageDataValue;

        @NameInMap("TimeStamp")
        private String timeStamp;

        private StorageUsageDataModule(Builder builder) {
            this.bucket = builder.bucket;
            this.storageDataValue = builder.storageDataValue;
            this.timeStamp = builder.timeStamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StorageUsageDataModule create() {
            return builder().build();
        }

        /**
         * @return bucket
         */
        public String getBucket() {
            return this.bucket;
        }

        /**
         * @return storageDataValue
         */
        public Integer getStorageDataValue() {
            return this.storageDataValue;
        }

        /**
         * @return timeStamp
         */
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public static final class Builder {
            private String bucket; 
            private Integer storageDataValue; 
            private String timeStamp; 

            /**
             * Bucket.
             */
            public Builder bucket(String bucket) {
                this.bucket = bucket;
                return this;
            }

            /**
             * StorageDataValue.
             */
            public Builder storageDataValue(Integer storageDataValue) {
                this.storageDataValue = storageDataValue;
                return this;
            }

            /**
             * TimeStamp.
             */
            public Builder timeStamp(String timeStamp) {
                this.timeStamp = timeStamp;
                return this;
            }

            public StorageUsageDataModule build() {
                return new StorageUsageDataModule(this);
            } 

        } 

    }
    public static class StorageUsage extends TeaModel {
        @NameInMap("StorageUsageDataModule")
        private java.util.List < StorageUsageDataModule> storageUsageDataModule;

        private StorageUsage(Builder builder) {
            this.storageUsageDataModule = builder.storageUsageDataModule;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StorageUsage create() {
            return builder().build();
        }

        /**
         * @return storageUsageDataModule
         */
        public java.util.List < StorageUsageDataModule> getStorageUsageDataModule() {
            return this.storageUsageDataModule;
        }

        public static final class Builder {
            private java.util.List < StorageUsageDataModule> storageUsageDataModule; 

            /**
             * StorageUsageDataModule.
             */
            public Builder storageUsageDataModule(java.util.List < StorageUsageDataModule> storageUsageDataModule) {
                this.storageUsageDataModule = storageUsageDataModule;
                return this;
            }

            public StorageUsage build() {
                return new StorageUsage(this);
            } 

        } 

    }
}
