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
 * {@link GetComputeResourceAuthUserMappingsRequest} extends {@link RequestModel}
 *
 * <p>GetComputeResourceAuthUserMappingsRequest</p>
 */
public class GetComputeResourceAuthUserMappingsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ComputeResourceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long computeResourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long projectId;

    private GetComputeResourceAuthUserMappingsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.computeResourceId = builder.computeResourceId;
        this.projectId = builder.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetComputeResourceAuthUserMappingsRequest create() {
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
     * @return computeResourceId
     */
    public Long getComputeResourceId() {
        return this.computeResourceId;
    }

    /**
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    public static final class Builder extends Request.Builder<GetComputeResourceAuthUserMappingsRequest, Builder> {
        private String regionId; 
        private Long computeResourceId; 
        private Long projectId; 

        private Builder() {
            super();
        } 

        private Builder(GetComputeResourceAuthUserMappingsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.computeResourceId = request.computeResourceId;
            this.projectId = request.projectId;
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
         * <p>The ID of the compute resource.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>100000</p>
         */
        public Builder computeResourceId(Long computeResourceId) {
            this.putQueryParameter("ComputeResourceId", computeResourceId);
            this.computeResourceId = computeResourceId;
            return this;
        }

        /**
         * <p>The DataWorks workspace to which the data source belongs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder projectId(Long projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        @Override
        public GetComputeResourceAuthUserMappingsRequest build() {
            return new GetComputeResourceAuthUserMappingsRequest(this);
        } 

    } 

}
