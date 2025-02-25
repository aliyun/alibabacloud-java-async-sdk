// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paiabtest20240119.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateFeatureRequest} extends {@link RequestModel}
 *
 * <p>UpdateFeatureRequest</p>
 */
public class UpdateFeatureRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("FeatureId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String featureId;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Status")
    @com.aliyun.core.annotation.Validation(required = true)
    private String status;

    private UpdateFeatureRequest(Builder builder) {
        super(builder);
        this.featureId = builder.featureId;
        this.regionId = builder.regionId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateFeatureRequest create() {
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

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<UpdateFeatureRequest, Builder> {
        private String featureId; 
        private String regionId; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(UpdateFeatureRequest request) {
            super(request);
            this.featureId = request.featureId;
            this.regionId = request.regionId;
            this.status = request.status;
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

        /**
         * Status.
         */
        public Builder status(String status) {
            this.putBodyParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public UpdateFeatureRequest build() {
            return new UpdateFeatureRequest(this);
        } 

    } 

}
