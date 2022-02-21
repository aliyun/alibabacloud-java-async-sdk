// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetFenceScopeRequest} extends {@link RequestModel}
 *
 * <p>SetFenceScopeRequest</p>
 */
public class SetFenceScopeRequest extends Request {
    @Query
    @NameInMap("BrandId")
    @Validation(required = true)
    private String brandId;

    @Query
    @NameInMap("FenceId")
    @Validation(required = true)
    private Long fenceId;

    @Query
    @NameInMap("ModelId")
    @Validation(required = true)
    private String modelId;

    @Query
    @NameInMap("ProjectId")
    @Validation(required = true)
    private String projectId;

    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private SetFenceScopeRequest(Builder builder) {
        super(builder);
        this.brandId = builder.brandId;
        this.fenceId = builder.fenceId;
        this.modelId = builder.modelId;
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetFenceScopeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return brandId
     */
    public String getBrandId() {
        return this.brandId;
    }

    /**
     * @return fenceId
     */
    public Long getFenceId() {
        return this.fenceId;
    }

    /**
     * @return modelId
     */
    public String getModelId() {
        return this.modelId;
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

    public static final class Builder extends Request.Builder<SetFenceScopeRequest, Builder> {
        private String brandId; 
        private Long fenceId; 
        private String modelId; 
        private String projectId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(SetFenceScopeRequest response) {
            super(response);
            this.brandId = response.brandId;
            this.fenceId = response.fenceId;
            this.modelId = response.modelId;
            this.projectId = response.projectId;
            this.regionId = response.regionId;
        } 

        /**
         * BrandId.
         */
        public Builder brandId(String brandId) {
            this.putQueryParameter("BrandId", brandId);
            this.brandId = brandId;
            return this;
        }

        /**
         * FenceId.
         */
        public Builder fenceId(Long fenceId) {
            this.putQueryParameter("FenceId", fenceId);
            this.fenceId = fenceId;
            return this;
        }

        /**
         * ModelId.
         */
        public Builder modelId(String modelId) {
            this.putQueryParameter("ModelId", modelId);
            this.modelId = modelId;
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
        public SetFenceScopeRequest build() {
            return new SetFenceScopeRequest(this);
        } 

    } 

}
