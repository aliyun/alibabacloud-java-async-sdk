// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paiabtest20240119.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetFeatureRequest} extends {@link RequestModel}
 *
 * <p>GetFeatureRequest</p>
 */
public class GetFeatureRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("FeatureId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String featureId;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private GetFeatureRequest(Builder builder) {
        super(builder);
        this.featureId = builder.featureId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFeatureRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return featureId
     */
    public String getFeatureId() {
        return this.featureId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<GetFeatureRequest, Builder> {
        private String featureId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetFeatureRequest request) {
            super(request);
            this.featureId = request.featureId;
            this.regionId = request.regionId;
        } 

        /**
         * FeatureId.
         */
        public Builder featureId(String featureId) {
            this.putPathParameter("FeatureId", featureId);
            this.featureId = featureId;
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
        public GetFeatureRequest build() {
            return new GetFeatureRequest(this);
        } 

    } 

}
