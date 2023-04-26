// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVodStorageDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVodStorageDataResponseBody</p>
 */
public class DescribeVodStorageDataResponseBody extends TeaModel {
    @NameInMap("DataInterval")
    private String dataInterval;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("StorageData")
    private StorageData storageData;

    private DescribeVodStorageDataResponseBody(Builder builder) {
        this.dataInterval = builder.dataInterval;
        this.requestId = builder.requestId;
        this.storageData = builder.storageData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVodStorageDataResponseBody create() {
        return builder().build();
    }

    /**
     * @return dataInterval
     */
    public String getDataInterval() {
        return this.dataInterval;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return storageData
     */
    public StorageData getStorageData() {
        return this.storageData;
    }

    public static final class Builder {
        private String dataInterval; 
        private String requestId; 
        private StorageData storageData; 

        /**
         * The time granularity at which the data was queried. Valid values:
         * <p>
         * 
         * *   **hour**
         * *   **day**
         */
        public Builder dataInterval(String dataInterval) {
            this.dataInterval = dataInterval;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The storage usage data returned.
         */
        public Builder storageData(StorageData storageData) {
            this.storageData = storageData;
            return this;
        }

        public DescribeVodStorageDataResponseBody build() {
            return new DescribeVodStorageDataResponseBody(this);
        } 

    } 

    public static class StorageDataItem extends TeaModel {
        @NameInMap("NetworkOut")
        private String networkOut;

        @NameInMap("StorageUtilization")
        private String storageUtilization;

        @NameInMap("TimeStamp")
        private String timeStamp;

        private StorageDataItem(Builder builder) {
            this.networkOut = builder.networkOut;
            this.storageUtilization = builder.storageUtilization;
            this.timeStamp = builder.timeStamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StorageDataItem create() {
            return builder().build();
        }

        /**
         * @return networkOut
         */
        public String getNetworkOut() {
            return this.networkOut;
        }

        /**
         * @return storageUtilization
         */
        public String getStorageUtilization() {
            return this.storageUtilization;
        }

        /**
         * @return timeStamp
         */
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public static final class Builder {
            private String networkOut; 
            private String storageUtilization; 
            private String timeStamp; 

            /**
             * The outbound traffic. Unit: bytes. The outbound traffic is generated when videos are directly downloaded or played from OSS buckets without Alibaba Cloud CDN acceleration.
             */
            public Builder networkOut(String networkOut) {
                this.networkOut = networkOut;
                return this;
            }

            /**
             * The detailed usage data of storage-related resources. Unit: bytes.
             */
            public Builder storageUtilization(String storageUtilization) {
                this.storageUtilization = storageUtilization;
                return this;
            }

            /**
             * The timestamp of the returned data. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
             */
            public Builder timeStamp(String timeStamp) {
                this.timeStamp = timeStamp;
                return this;
            }

            public StorageDataItem build() {
                return new StorageDataItem(this);
            } 

        } 

    }
    public static class StorageData extends TeaModel {
        @NameInMap("StorageDataItem")
        private java.util.List < StorageDataItem> storageDataItem;

        private StorageData(Builder builder) {
            this.storageDataItem = builder.storageDataItem;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StorageData create() {
            return builder().build();
        }

        /**
         * @return storageDataItem
         */
        public java.util.List < StorageDataItem> getStorageDataItem() {
            return this.storageDataItem;
        }

        public static final class Builder {
            private java.util.List < StorageDataItem> storageDataItem; 

            /**
             * StorageDataItem.
             */
            public Builder storageDataItem(java.util.List < StorageDataItem> storageDataItem) {
                this.storageDataItem = storageDataItem;
                return this;
            }

            public StorageData build() {
                return new StorageData(this);
            } 

        } 

    }
}
