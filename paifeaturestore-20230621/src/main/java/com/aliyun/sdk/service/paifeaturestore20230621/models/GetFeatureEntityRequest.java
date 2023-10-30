// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paifeaturestore20230621.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetFeatureEntityRequest} extends {@link RequestModel}
 *
 * <p>GetFeatureEntityRequest</p>
 */
public class GetFeatureEntityRequest extends Request {
    @Path
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Path
    @NameInMap("FeatureEntityId")
    @Validation(required = true)
    private String featureEntityId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private GetFeatureEntityRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.featureEntityId = builder.featureEntityId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFeatureEntityRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return featureEntityId
     */
    public String getFeatureEntityId() {
        return this.featureEntityId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<GetFeatureEntityRequest, Builder> {
        private String instanceId; 
        private String featureEntityId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetFeatureEntityRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.featureEntityId = request.featureEntityId;
            this.regionId = request.regionId;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * FeatureEntityId.
         */
        public Builder featureEntityId(String featureEntityId) {
            this.putPathParameter("FeatureEntityId", featureEntityId);
            this.featureEntityId = featureEntityId;
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
        public GetFeatureEntityRequest build() {
            return new GetFeatureEntityRequest(this);
        } 

    } 

}
