// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GenerateOssUploadMetaRequest} extends {@link RequestModel}
 *
 * <p>GenerateOssUploadMetaRequest</p>
 */
public class GenerateOssUploadMetaRequest extends Request {
    @Query
    @NameInMap("Ext")
    @Validation(required = true)
    private String ext;

    @Query
    @NameInMap("ProjectId")
    @Validation(required = true)
    private String projectId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private GenerateOssUploadMetaRequest(Builder builder) {
        super(builder);
        this.ext = builder.ext;
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateOssUploadMetaRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ext
     */
    public String getExt() {
        return this.ext;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<GenerateOssUploadMetaRequest, Builder> {
        private String ext; 
        private String projectId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GenerateOssUploadMetaRequest response) {
            super(response);
            this.ext = response.ext;
            this.projectId = response.projectId;
            this.regionId = response.regionId;
        } 

        /**
         * Ext.
         */
        public Builder ext(String ext) {
            this.putQueryParameter("Ext", ext);
            this.ext = ext;
            return this;
        }

        /**
         * ProjectId.
         */
        public Builder projectId(String projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public GenerateOssUploadMetaRequest build() {
            return new GenerateOssUploadMetaRequest(this);
        } 

    } 

}
