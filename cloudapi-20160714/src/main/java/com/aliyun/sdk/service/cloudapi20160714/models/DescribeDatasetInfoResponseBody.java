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
 * {@link DescribeDatasetInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDatasetInfoResponseBody</p>
 */
public class DescribeDatasetInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DatasetInfo")
    private DatasetInfo datasetInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeDatasetInfoResponseBody model) {
            this.datasetInfo = model.datasetInfo;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The dataset info.</p>
         */
        public Builder datasetInfo(DatasetInfo datasetInfo) {
            this.datasetInfo = datasetInfo;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>A2C8F75E-EE84-5C64-960F-45C8********</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDatasetInfoResponseBody build() {
            return new DescribeDatasetInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDatasetInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDatasetInfoResponseBody</p>
     */
    public static class DatasetInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreatedTime")
        private String createdTime;

        @com.aliyun.core.annotation.NameInMap("DatasetId")
        private String datasetId;

        @com.aliyun.core.annotation.NameInMap("DatasetName")
        private String datasetName;

        @com.aliyun.core.annotation.NameInMap("DatasetType")
        private String datasetType;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("ModifiedTime")
        private String modifiedTime;

        private DatasetInfo(Builder builder) {
            this.createdTime = builder.createdTime;
            this.datasetId = builder.datasetId;
            this.datasetName = builder.datasetName;
            this.datasetType = builder.datasetType;
            this.description = builder.description;
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
         * @return description
         */
        public String getDescription() {
            return this.description;
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
            private String description; 
            private String modifiedTime; 

            private Builder() {
            } 

            private Builder(DatasetInfo model) {
                this.createdTime = model.createdTime;
                this.datasetId = model.datasetId;
                this.datasetName = model.datasetName;
                this.datasetType = model.datasetType;
                this.description = model.description;
                this.modifiedTime = model.modifiedTime;
            } 

            /**
             * <p>The creation time (UTC) of the dataset.</p>
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
             * <p>62b91a790a693238********</p>
             */
            public Builder datasetId(String datasetId) {
                this.datasetId = datasetId;
                return this;
            }

            /**
             * <p>The name of the dataset.</p>
             * 
             * <strong>example:</strong>
             * <p>DatasetName</p>
             */
            public Builder datasetName(String datasetName) {
                this.datasetName = datasetName;
                return this;
            }

            /**
             * <p>The type of the dataset. Valid values:</p>
             * <ul>
             * <li>JWT_BLOCKING: a JSON Web Token (JWT) blacklist</li>
             * <li>IP_WHITELIST_CIDR : an IP address whitelist</li>
             * <li>PARAMETER_ACCESS : parameter-based access control</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>JWT_BLOCKING</p>
             */
            public Builder datasetType(String datasetType) {
                this.datasetType = datasetType;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The last modification time (UTC) of the dataset.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-09-21T12:58:43Z</p>
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
