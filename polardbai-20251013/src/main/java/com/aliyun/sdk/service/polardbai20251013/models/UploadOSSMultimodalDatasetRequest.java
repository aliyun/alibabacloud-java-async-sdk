// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbai20251013.models;

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
 * {@link UploadOSSMultimodalDatasetRequest} extends {@link RequestModel}
 *
 * <p>UploadOSSMultimodalDatasetRequest</p>
 */
public class UploadOSSMultimodalDatasetRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DatasetId")
    private String datasetId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OssUrl")
    private String ossUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceRegionId")
    private String sourceRegionId;

    private UploadOSSMultimodalDatasetRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.datasetId = builder.datasetId;
        this.ossUrl = builder.ossUrl;
        this.sourceRegionId = builder.sourceRegionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UploadOSSMultimodalDatasetRequest create() {
        return builder().build();
    }

@Override
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
     * @return datasetId
     */
    public String getDatasetId() {
        return this.datasetId;
    }

    /**
     * @return ossUrl
     */
    public String getOssUrl() {
        return this.ossUrl;
    }

    /**
     * @return sourceRegionId
     */
    public String getSourceRegionId() {
        return this.sourceRegionId;
    }

    public static final class Builder extends Request.Builder<UploadOSSMultimodalDatasetRequest, Builder> {
        private String DBClusterId; 
        private String datasetId; 
        private String ossUrl; 
        private String sourceRegionId; 

        private Builder() {
            super();
        } 

        private Builder(UploadOSSMultimodalDatasetRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
            this.datasetId = request.datasetId;
            this.ossUrl = request.ossUrl;
            this.sourceRegionId = request.sourceRegionId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-2ze454l20me07****</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * DatasetId.
         */
        public Builder datasetId(String datasetId) {
            this.putQueryParameter("DatasetId", datasetId);
            this.datasetId = datasetId;
            return this;
        }

        /**
         * OssUrl.
         */
        public Builder ossUrl(String ossUrl) {
            this.putQueryParameter("OssUrl", ossUrl);
            this.ossUrl = ossUrl;
            return this;
        }

        /**
         * SourceRegionId.
         */
        public Builder sourceRegionId(String sourceRegionId) {
            this.putQueryParameter("SourceRegionId", sourceRegionId);
            this.sourceRegionId = sourceRegionId;
            return this;
        }

        @Override
        public UploadOSSMultimodalDatasetRequest build() {
            return new UploadOSSMultimodalDatasetRequest(this);
        } 

    } 

}
