// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paifeaturestore20230621.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListModelFeatureAvailableFeaturesRequest} extends {@link RequestModel}
 *
 * <p>ListModelFeatureAvailableFeaturesRequest</p>
 */
public class ListModelFeatureAvailableFeaturesRequest extends Request {
    @Path
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Path
    @NameInMap("ModelFeatureId")
    @Validation(required = true)
    private String modelFeatureId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("FeatureName")
    private String featureName;

    private ListModelFeatureAvailableFeaturesRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.modelFeatureId = builder.modelFeatureId;
        this.regionId = builder.regionId;
        this.featureName = builder.featureName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListModelFeatureAvailableFeaturesRequest create() {
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
     * @return modelFeatureId
     */
    public String getModelFeatureId() {
        return this.modelFeatureId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return featureName
     */
    public String getFeatureName() {
        return this.featureName;
    }

    public static final class Builder extends Request.Builder<ListModelFeatureAvailableFeaturesRequest, Builder> {
        private String instanceId; 
        private String modelFeatureId; 
        private String regionId; 
        private String featureName; 

        private Builder() {
            super();
        } 

        private Builder(ListModelFeatureAvailableFeaturesRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.modelFeatureId = request.modelFeatureId;
            this.regionId = request.regionId;
            this.featureName = request.featureName;
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
         * ModelFeatureId.
         */
        public Builder modelFeatureId(String modelFeatureId) {
            this.putPathParameter("ModelFeatureId", modelFeatureId);
            this.modelFeatureId = modelFeatureId;
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
         * FeatureName.
         */
        public Builder featureName(String featureName) {
            this.putQueryParameter("FeatureName", featureName);
            this.featureName = featureName;
            return this;
        }

        @Override
        public ListModelFeatureAvailableFeaturesRequest build() {
            return new ListModelFeatureAvailableFeaturesRequest(this);
        } 

    } 

}
