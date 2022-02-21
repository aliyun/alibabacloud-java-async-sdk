// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOssUploadMetaRequest} extends {@link RequestModel}
 *
 * <p>GetOssUploadMetaRequest</p>
 */
public class GetOssUploadMetaRequest extends Request {
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
    @Validation(required = true)
    private String regionId;

    private GetOssUploadMetaRequest(Builder builder) {
        super(builder);
        this.ext = builder.ext;
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOssUploadMetaRequest create() {
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

    public static final class Builder extends Request.Builder<GetOssUploadMetaRequest, Builder> {
        private String ext; 
        private String projectId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetOssUploadMetaRequest response) {
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
        public GetOssUploadMetaRequest build() {
            return new GetOssUploadMetaRequest(this);
        } 

    } 

}
