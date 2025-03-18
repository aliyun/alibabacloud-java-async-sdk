// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeDatasetItemInfoResponseBody model) {
            this.datasetItemInfo = model.datasetItemInfo;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The Dataset information.</p>
         */
        public Builder datasetItemInfo(DatasetItemInfo datasetItemInfo) {
            this.datasetItemInfo = datasetItemInfo;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>5BAFA85F-38E3-5D9E-9E32-4B09********</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDatasetItemInfoResponseBody build() {
            return new DescribeDatasetItemInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDatasetItemInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDatasetItemInfoResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(DatasetItemInfo model) {
                this.createdTime = model.createdTime;
                this.datasetId = model.datasetId;
                this.datasetItemId = model.datasetItemId;
                this.description = model.description;
                this.expiredTime = model.expiredTime;
                this.modifiedTime = model.modifiedTime;
                this.value = model.value;
            } 

            /**
             * <p>The creation time (UTC) of the data entry.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-09-21T12:58:43Z</p>
             */
            public Builder createdTime(String createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * <p>The ID of the dataset.</p>
             * 
             * <strong>example:</strong>
             * <p>626238665db4a5140eea3e40********</p>
             */
            public Builder datasetId(String datasetId) {
                this.datasetId = datasetId;
                return this;
            }

            /**
             * <p>The ID of the data entry.</p>
             * 
             * <strong>example:</strong>
             * <p>5045****</p>
             */
            public Builder datasetItemId(String datasetItemId) {
                this.datasetItemId = datasetItemId;
                return this;
            }

            /**
             * <p>The description of the data entry.</p>
             * 
             * <strong>example:</strong>
             * <p>Description</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The time in UTC when the data entry expires. The time is in the <strong>yyyy-MM-ddTHH:mm:ssZ</strong> format. If this parameter is empty, the data entry does not expire.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-09-22T12:00:00Z</p>
             */
            public Builder expiredTime(String expiredTime) {
                this.expiredTime = expiredTime;
                return this;
            }

            /**
             * <p>The last modification time (UTC) of the data entry.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-09-21T12:58:43Z</p>
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * <p>The value of the data entry.</p>
             * 
             * <strong>example:</strong>
             * <p>106.43.XXX.XXX</p>
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
