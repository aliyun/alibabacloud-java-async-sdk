// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link BatchDeleteFileMetaRequest} extends {@link RequestModel}
 *
 * <p>BatchDeleteFileMetaRequest</p>
 */
public class BatchDeleteFileMetaRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DatasetName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String datasetName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("URIs")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < String > URIs;

    private BatchDeleteFileMetaRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.datasetName = builder.datasetName;
        this.projectName = builder.projectName;
        this.URIs = builder.URIs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchDeleteFileMetaRequest create() {
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
     * @return datasetName
     */
    public String getDatasetName() {
        return this.datasetName;
    }

    /**
     * @return projectName
     */
    public String getProjectName() {
        return this.projectName;
    }

    /**
     * @return URIs
     */
    public java.util.List < String > getURIs() {
        return this.URIs;
    }

    public static final class Builder extends Request.Builder<BatchDeleteFileMetaRequest, Builder> {
        private String regionId; 
        private String datasetName; 
        private String projectName; 
        private java.util.List < String > URIs; 

        private Builder() {
            super();
        } 

        private Builder(BatchDeleteFileMetaRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.datasetName = request.datasetName;
            this.projectName = request.projectName;
            this.URIs = request.URIs;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder datasetName(String datasetName) {
            this.putQueryParameter("DatasetName", datasetName);
            this.datasetName = datasetName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder projectName(String projectName) {
            this.putQueryParameter("ProjectName", projectName);
            this.projectName = projectName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder URIs(java.util.List < String > URIs) {
            String URIsShrink = shrink(URIs, "URIs", "json");
            this.putQueryParameter("URIs", URIsShrink);
            this.URIs = URIs;
            return this;
        }

        @Override
        public BatchDeleteFileMetaRequest build() {
            return new BatchDeleteFileMetaRequest(this);
        } 

    } 

}
