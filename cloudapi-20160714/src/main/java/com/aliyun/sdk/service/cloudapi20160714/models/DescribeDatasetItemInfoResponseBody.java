// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDatasetItemInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDatasetItemInfoResponseBody</p>
 */
public class DescribeDatasetItemInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DatasetItemInfo")
    private DatasetItemInfo datasetItemInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDatasetItemInfoResponseBody(Builder builder) {
        this.datasetItemInfo = builder.datasetItemInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDatasetItemInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return datasetItemInfo
     */
    public DatasetItemInfo getDatasetItemInfo() {
        return this.datasetItemInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private DatasetItemInfo datasetItemInfo; 
        private String requestId; 

        /**
         * The Dataset information.
         */
        public Builder datasetItemInfo(DatasetItemInfo datasetItemInfo) {
            this.datasetItemInfo = datasetItemInfo;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDatasetItemInfoResponseBody build() {
            return new DescribeDatasetItemInfoResponseBody(this);
        } 

    } 

    public static class DatasetItemInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreatedTime")
        private String createdTime;

        @com.aliyun.core.annotation.NameInMap("DatasetId")
        private String datasetId;

        @com.aliyun.core.annotation.NameInMap("DatasetItemId")
        private String datasetItemId;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("ExpiredTime")
        private String expiredTime;

        @com.aliyun.core.annotation.NameInMap("ModifiedTime")
        private String modifiedTime;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private DatasetItemInfo(Builder builder) {
            this.createdTime = builder.createdTime;
            this.datasetId = builder.datasetId;
            this.datasetItemId = builder.datasetItemId;
            this.description = builder.description;
            this.expiredTime = builder.expiredTime;
            this.modifiedTime = builder.modifiedTime;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DatasetItemInfo create() {
            return builder().build();
        }

        /**
         * @return createdTime
         */
        public String getCreatedTime() {
            return this.createdTime;
        }

        /**
         * @return datasetId
         */
        public String getDatasetId() {
            return this.datasetId;
        }

        /**
         * @return datasetItemId
         */
        public String getDatasetItemId() {
            return this.datasetItemId;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return expiredTime
         */
        public String getExpiredTime() {
            return this.expiredTime;
        }

        /**
         * @return modifiedTime
         */
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String createdTime; 
            private String datasetId; 
            private String datasetItemId; 
            private String description; 
            private String expiredTime; 
            private String modifiedTime; 
            private String value; 

            /**
             * The creation time (UTC) of the data entry.
             */
            public Builder createdTime(String createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * The ID of the dataset.
             */
            public Builder datasetId(String datasetId) {
                this.datasetId = datasetId;
                return this;
            }

            /**
             * The ID of the data entry.
             */
            public Builder datasetItemId(String datasetItemId) {
                this.datasetItemId = datasetItemId;
                return this;
            }

            /**
             * The description of the data entry.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The time in UTC when the data entry expires. The time is in the **yyyy-MM-ddTHH:mm:ssZ** format. If this parameter is empty, the data entry does not expire.
             */
            public Builder expiredTime(String expiredTime) {
                this.expiredTime = expiredTime;
                return this;
            }

            /**
             * The last modification time (UTC) of the data entry.
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * The value of the data entry.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public DatasetItemInfo build() {
                return new DatasetItemInfo(this);
            } 

        } 

    }
}
