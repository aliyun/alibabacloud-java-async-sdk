// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDatasetInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDatasetInfoResponseBody</p>
 */
public class DescribeDatasetInfoResponseBody extends TeaModel {
    @NameInMap("DatasetInfo")
    private DatasetInfo datasetInfo;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeDatasetInfoResponseBody(Builder builder) {
        this.datasetInfo = builder.datasetInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDatasetInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return datasetInfo
     */
    public DatasetInfo getDatasetInfo() {
        return this.datasetInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private DatasetInfo datasetInfo; 
        private String requestId; 

        /**
         * DatasetInfo.
         */
        public Builder datasetInfo(DatasetInfo datasetInfo) {
            this.datasetInfo = datasetInfo;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDatasetInfoResponseBody build() {
            return new DescribeDatasetInfoResponseBody(this);
        } 

    } 

    public static class DatasetInfo extends TeaModel {
        @NameInMap("CreatedTime")
        private String createdTime;

        @NameInMap("DatasetId")
        private String datasetId;

        @NameInMap("DatasetName")
        private String datasetName;

        @NameInMap("DatasetType")
        private String datasetType;

        @NameInMap("ModifiedTime")
        private String modifiedTime;

        private DatasetInfo(Builder builder) {
            this.createdTime = builder.createdTime;
            this.datasetId = builder.datasetId;
            this.datasetName = builder.datasetName;
            this.datasetType = builder.datasetType;
            this.modifiedTime = builder.modifiedTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DatasetInfo create() {
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
         * @return datasetName
         */
        public String getDatasetName() {
            return this.datasetName;
        }

        /**
         * @return datasetType
         */
        public String getDatasetType() {
            return this.datasetType;
        }

        /**
         * @return modifiedTime
         */
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public static final class Builder {
            private String createdTime; 
            private String datasetId; 
            private String datasetName; 
            private String datasetType; 
            private String modifiedTime; 

            /**
             * The creation time (UTC) of the dataset.
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
             * The name of the dataset.
             */
            public Builder datasetName(String datasetName) {
                this.datasetName = datasetName;
                return this;
            }

            /**
             * The type of the dataset. Valid values:
             * <p>
             * 
             * *   JWT_BLOCKING: a JSON Web Token (JWT) blacklist
             * *   IP_WHITELIST_CIDR : an IP address whitelist
             * *   PARAMETER_ACCESS : parameter-based access control
             */
            public Builder datasetType(String datasetType) {
                this.datasetType = datasetType;
                return this;
            }

            /**
             * The last modification time (UTC) of the dataset.
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            public DatasetInfo build() {
                return new DatasetInfo(this);
            } 

        } 

    }
}
