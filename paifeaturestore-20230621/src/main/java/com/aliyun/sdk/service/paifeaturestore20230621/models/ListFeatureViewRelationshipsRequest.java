// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paifeaturestore20230621.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListFeatureViewRelationshipsRequest} extends {@link RequestModel}
 *
 * <p>ListFeatureViewRelationshipsRequest</p>
 */
public class ListFeatureViewRelationshipsRequest extends Request {
    @Path
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Path
    @NameInMap("FeatureViewId")
    @Validation(required = true)
    private String featureViewId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private ListFeatureViewRelationshipsRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.featureViewId = builder.featureViewId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFeatureViewRelationshipsRequest create() {
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
     * @return featureViewId
     */
    public String getFeatureViewId() {
        return this.featureViewId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ListFeatureViewRelationshipsRequest, Builder> {
        private String instanceId; 
        private String featureViewId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ListFeatureViewRelationshipsRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.featureViewId = request.featureViewId;
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
         * FeatureViewId.
         */
        public Builder featureViewId(String featureViewId) {
            this.putPathParameter("FeatureViewId", featureViewId);
            this.featureViewId = featureViewId;
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
        public ListFeatureViewRelationshipsRequest build() {
            return new ListFeatureViewRelationshipsRequest(this);
        } 

    } 

}
