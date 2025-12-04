// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link CreateDatasetVersionRequest} extends {@link RequestModel}
 *
 * <p>CreateDatasetVersionRequest</p>
 */
public class CreateDatasetVersionRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Comment")
    private String comment;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DatasetId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String datasetId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ImportInfo")
    private java.util.Map<String, String> importInfo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MountPath")
    private String mountPath;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Url")
    @com.aliyun.core.annotation.Validation(required = true)
    private String url;

    private CreateDatasetVersionRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.comment = builder.comment;
        this.datasetId = builder.datasetId;
        this.importInfo = builder.importInfo;
        this.mountPath = builder.mountPath;
        this.url = builder.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDatasetVersionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return comment
     */
    public String getComment() {
        return this.comment;
    }

    /**
     * @return datasetId
     */
    public String getDatasetId() {
        return this.datasetId;
    }

    /**
     * @return importInfo
     */
    public java.util.Map<String, String> getImportInfo() {
        return this.importInfo;
    }

    /**
     * @return mountPath
     */
    public String getMountPath() {
        return this.mountPath;
    }

    /**
     * @return url
     */
    public String getUrl() {
        return this.url;
    }

    public static final class Builder extends Request.Builder<CreateDatasetVersionRequest, Builder> {
        private String regionId; 
        private String comment; 
        private String datasetId; 
        private java.util.Map<String, String> importInfo; 
        private String mountPath; 
        private String url; 

        private Builder() {
            super();
        } 

        private Builder(CreateDatasetVersionRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.comment = request.comment;
            this.datasetId = request.datasetId;
            this.importInfo = request.importInfo;
            this.mountPath = request.mountPath;
            this.url = request.url;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Comment.
         */
        public Builder comment(String comment) {
            this.putBodyParameter("Comment", comment);
            this.comment = comment;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dataworks-dataset:3pXXXb8o0ngr07njhps1</p>
         */
        public Builder datasetId(String datasetId) {
            this.putBodyParameter("DatasetId", datasetId);
            this.datasetId = datasetId;
            return this;
        }

        /**
         * ImportInfo.
         */
        public Builder importInfo(java.util.Map<String, String> importInfo) {
            String importInfoShrink = shrink(importInfo, "ImportInfo", "json");
            this.putBodyParameter("ImportInfo", importInfoShrink);
            this.importInfo = importInfo;
            return this;
        }

        /**
         * MountPath.
         */
        public Builder mountPath(String mountPath) {
            this.putBodyParameter("MountPath", mountPath);
            this.mountPath = mountPath;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://test-oss-bucket/test_dir/</p>
         */
        public Builder url(String url) {
            this.putBodyParameter("Url", url);
            this.url = url;
            return this;
        }

        @Override
        public CreateDatasetVersionRequest build() {
            return new CreateDatasetVersionRequest(this);
        } 

    } 

}
