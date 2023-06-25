// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetFeatureDetailsRequest} extends {@link RequestModel}
 *
 * <p>GetFeatureDetailsRequest</p>
 */
public class GetFeatureDetailsRequest extends Request {
    @Query
    @NameInMap("Feature")
    @Validation(required = true)
    private String feature;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private GetFeatureDetailsRequest(Builder builder) {
        super(builder);
        this.feature = builder.feature;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFeatureDetailsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return feature
     */
    public String getFeature() {
        return this.feature;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<GetFeatureDetailsRequest, Builder> {
        private String feature; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetFeatureDetailsRequest request) {
            super(request);
            this.feature = request.feature;
            this.regionId = request.regionId;
        } 

        /**
         * The one or more features that you want to query. Valid values:
         * <p>
         * 
         * *   Terraform: the Terraform hosting feature.
         * *   ResourceCleaner: the resource cleaner feature. You can use ALIYUN::ROS::ResourceCleaner to create a resource cleaner.
         * *   TemplateScratch: the scenario feature.
         * *   All: all features that are supported by ROS.
         */
        public Builder feature(String feature) {
            this.putQueryParameter("Feature", feature);
            this.feature = feature;
            return this;
        }

        /**
         * The region ID of the stack. You can call the [DescribeRegions](~~131035~~) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public GetFeatureDetailsRequest build() {
            return new GetFeatureDetailsRequest(this);
        } 

    } 

}
