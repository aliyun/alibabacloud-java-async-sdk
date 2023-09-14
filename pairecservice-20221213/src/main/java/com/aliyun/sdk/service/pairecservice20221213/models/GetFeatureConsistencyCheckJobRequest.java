// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetFeatureConsistencyCheckJobRequest} extends {@link RequestModel}
 *
 * <p>GetFeatureConsistencyCheckJobRequest</p>
 */
public class GetFeatureConsistencyCheckJobRequest extends Request {
    @Path
    @NameInMap("FeatureConsistencyCheckJobId")
    private String featureConsistencyCheckJobId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    private GetFeatureConsistencyCheckJobRequest(Builder builder) {
        super(builder);
        this.featureConsistencyCheckJobId = builder.featureConsistencyCheckJobId;
        this.regionId = builder.regionId;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFeatureConsistencyCheckJobRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return featureConsistencyCheckJobId
     */
    public String getFeatureConsistencyCheckJobId() {
        return this.featureConsistencyCheckJobId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<GetFeatureConsistencyCheckJobRequest, Builder> {
        private String featureConsistencyCheckJobId; 
        private String regionId; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(GetFeatureConsistencyCheckJobRequest request) {
            super(request);
            this.featureConsistencyCheckJobId = request.featureConsistencyCheckJobId;
            this.regionId = request.regionId;
            this.instanceId = request.instanceId;
        } 

        /**
         * FeatureConsistencyCheckJobId.
         */
        public Builder featureConsistencyCheckJobId(String featureConsistencyCheckJobId) {
            this.putPathParameter("FeatureConsistencyCheckJobId", featureConsistencyCheckJobId);
            this.featureConsistencyCheckJobId = featureConsistencyCheckJobId;
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

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public GetFeatureConsistencyCheckJobRequest build() {
            return new GetFeatureConsistencyCheckJobRequest(this);
        } 

    } 

}
