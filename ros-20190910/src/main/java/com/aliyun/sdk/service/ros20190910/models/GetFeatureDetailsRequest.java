// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

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
 * {@link GetFeatureDetailsRequest} extends {@link RequestModel}
 *
 * <p>GetFeatureDetailsRequest</p>
 */
public class GetFeatureDetailsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Feature")
    @com.aliyun.core.annotation.Validation(required = true)
    private String feature;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The one or more features that you want to query. Valid values:</p>
         * <ul>
         * <li>Terraform: the Terraform hosting feature.</li>
         * <li>ResourceCleaner: the resource cleaner feature. You can use ALIYUN::ROS::ResourceCleaner to create a resource cleaner.</li>
         * <li>TemplateScratch: the scenario feature.</li>
         * <li>All: all features that are supported by ROS.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Terraform</p>
         */
        public Builder feature(String feature) {
            this.putQueryParameter("Feature", feature);
            this.feature = feature;
            return this;
        }

        /**
         * <p>The region ID of the stack. You can call the <a href="https://help.aliyun.com/document_detail/131035.html">DescribeRegions</a> operation to query the most recent region list.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
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
