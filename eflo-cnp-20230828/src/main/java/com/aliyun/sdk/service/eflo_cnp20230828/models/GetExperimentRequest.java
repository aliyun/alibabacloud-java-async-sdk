// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo_cnp20230828.models;

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
 * {@link GetExperimentRequest} extends {@link RequestModel}
 *
 * <p>GetExperimentRequest</p>
 */
public class GetExperimentRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExperimentId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long experimentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    private GetExperimentRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.experimentId = builder.experimentId;
        this.resourceGroupId = builder.resourceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetExperimentRequest create() {
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
     * @return experimentId
     */
    public Long getExperimentId() {
        return this.experimentId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public static final class Builder extends Request.Builder<GetExperimentRequest, Builder> {
        private String regionId; 
        private Long experimentId; 
        private String resourceGroupId; 

        private Builder() {
            super();
        } 

        private Builder(GetExperimentRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.experimentId = request.experimentId;
            this.resourceGroupId = request.resourceGroupId;
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
         * <p>Experiment ID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>234</p>
         */
        public Builder experimentId(Long experimentId) {
            this.putQueryParameter("ExperimentId", experimentId);
            this.experimentId = experimentId;
            return this;
        }

        /**
         * <p>Resource Group Id</p>
         * 
         * <strong>example:</strong>
         * <p>rg-sdsmfg23</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        @Override
        public GetExperimentRequest build() {
            return new GetExperimentRequest(this);
        } 

    } 

}
