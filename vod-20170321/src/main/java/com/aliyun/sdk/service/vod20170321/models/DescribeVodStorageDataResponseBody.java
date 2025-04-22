// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link DescribeVodStorageDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVodStorageDataResponseBody</p>
 */
public class DescribeVodStorageDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataInterval")
    private String dataInterval;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StorageData")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeVodStorageDataResponseBody model) {
            this.dataInterval = model.dataInterval;
            this.requestId = model.requestId;
            this.storageData = model.storageData;
        } 

        /**
         * <p>The time granularity at which the data was queried. Valid values:</p>
         * <ul>
         * <li><strong>hour</strong></li>
         * <li><strong>day</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>day</p>
         */
        public Builder dataInterval(String dataInterval) {
            this.dataInterval = dataInterval;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>C370DAF1-C838-4288-****-9A87633D248E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The storage usage data returned.</p>
         */
        public Builder storageData(StorageData storageData) {
            this.storageData = storageData;
            return this;
        }

        public DescribeVodStorageDataResponseBody build() {
            return new DescribeVodStorageDataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeVodStorageDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVodStorageDataResponseBody</p>
     */
    public static class StorageDataItem extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NetworkOut")
        private String networkOut;

        @com.aliyun.core.annotation.NameInMap("StorageUtilization")
        private String storageUtilization;

        @com.aliyun.core.annotation.NameInMap("TimeStamp")
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

            private Builder() {
            } 

            private Builder(StorageDataItem model) {
                this.networkOut = model.networkOut;
                this.storageUtilization = model.storageUtilization;
                this.timeStamp = model.timeStamp;
            } 

            /**
             * <p>The outbound traffic. Unit: bytes. The outbound traffic is generated when videos are directly downloaded or played from OSS buckets without Alibaba Cloud CDN acceleration.</p>
             * 
             * <strong>example:</strong>
             * <p>111111</p>
             */
            public Builder networkOut(String networkOut) {
                this.networkOut = networkOut;
                return this;
            }

            /**
             * <p>The detailed usage data of storage-related resources. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>111111</p>
             */
            public Builder storageUtilization(String storageUtilization) {
                this.storageUtilization = storageUtilization;
                return this;
            }

            /**
             * <p>The timestamp of the returned data. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-02-01T15:00:00Z</p>
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
    /**
     * 
     * {@link DescribeVodStorageDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVodStorageDataResponseBody</p>
     */
    public static class StorageData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("StorageDataItem")
        private java.util.List<StorageDataItem> storageDataItem;

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
        public java.util.List<StorageDataItem> getStorageDataItem() {
            return this.storageDataItem;
        }

        public static final class Builder {
            private java.util.List<StorageDataItem> storageDataItem; 

            private Builder() {
            } 

            private Builder(StorageData model) {
                this.storageDataItem = model.storageDataItem;
            } 

            /**
             * StorageDataItem.
             */
            public Builder storageDataItem(java.util.List<StorageDataItem> storageDataItem) {
                this.storageDataItem = storageDataItem;
                return this;
            }

            public StorageData build() {
                return new StorageData(this);
            } 

        } 

    }
}
