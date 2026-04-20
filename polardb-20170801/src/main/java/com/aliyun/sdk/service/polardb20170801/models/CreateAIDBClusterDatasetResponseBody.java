// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link CreateAIDBClusterDatasetResponseBody} extends {@link TeaModel}
 *
 * <p>CreateAIDBClusterDatasetResponseBody</p>
 */
public class CreateAIDBClusterDatasetResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    private String DBClusterId;

    @com.aliyun.core.annotation.NameInMap("DataServiceId")
    private String dataServiceId;

    @com.aliyun.core.annotation.NameInMap("DatasetId")
    private String datasetId;

    @com.aliyun.core.annotation.NameInMap("DatasetName")
    private String datasetName;

    @com.aliyun.core.annotation.NameInMap("Path")
    private String path;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateAIDBClusterDatasetResponseBody(Builder builder) {
        this.DBClusterId = builder.DBClusterId;
        this.dataServiceId = builder.dataServiceId;
        this.datasetId = builder.datasetId;
        this.datasetName = builder.datasetName;
        this.path = builder.path;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAIDBClusterDatasetResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return dataServiceId
     */
    public String getDataServiceId() {
        return this.dataServiceId;
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
     * @return path
     */
    public String getPath() {
        return this.path;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String DBClusterId; 
        private String dataServiceId; 
        private String datasetId; 
        private String datasetName; 
        private String path; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateAIDBClusterDatasetResponseBody model) {
            this.DBClusterId = model.DBClusterId;
            this.dataServiceId = model.dataServiceId;
            this.datasetId = model.datasetId;
            this.datasetName = model.datasetName;
            this.path = model.path;
            this.requestId = model.requestId;
        } 

        /**
         * DBClusterId.
         */
        public Builder DBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * DataServiceId.
         */
        public Builder dataServiceId(String dataServiceId) {
            this.dataServiceId = dataServiceId;
            return this;
        }

        /**
         * DatasetId.
         */
        public Builder datasetId(String datasetId) {
            this.datasetId = datasetId;
            return this;
        }

        /**
         * DatasetName.
         */
        public Builder datasetName(String datasetName) {
            this.datasetName = datasetName;
            return this;
        }

        /**
         * Path.
         */
        public Builder path(String path) {
            this.path = path;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>CD35F3-F3-44CA-AFFF-BAF869******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateAIDBClusterDatasetResponseBody build() {
            return new CreateAIDBClusterDatasetResponseBody(this);
        } 

    } 

}
