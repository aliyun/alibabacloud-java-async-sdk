// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEnvironmentFeatureRequest} extends {@link RequestModel}
 *
 * <p>DescribeEnvironmentFeatureRequest</p>
 */
public class DescribeEnvironmentFeatureRequest extends Request {
    @Query
    @NameInMap("EnvironmentId")
    @Validation(required = true)
    private String environmentId;

    @Query
    @NameInMap("FeatureName")
    @Validation(required = true)
    private String featureName;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    private DescribeEnvironmentFeatureRequest(Builder builder) {
        super(builder);
        this.environmentId = builder.environmentId;
        this.featureName = builder.featureName;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEnvironmentFeatureRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return environmentId
     */
    public String getEnvironmentId() {
        return this.environmentId;
    }

    /**
     * @return featureName
     */
    public String getFeatureName() {
        return this.featureName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DescribeEnvironmentFeatureRequest, Builder> {
        private String environmentId; 
        private String featureName; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeEnvironmentFeatureRequest request) {
            super(request);
            this.environmentId = request.environmentId;
            this.featureName = request.featureName;
            this.regionId = request.regionId;
        } 

        /**
         * Environment ID.
         */
        public Builder environmentId(String environmentId) {
            this.putQueryParameter("EnvironmentId", environmentId);
            this.environmentId = environmentId;
            return this;
        }

        /**
         * Name of Feature.
         */
        public Builder featureName(String featureName) {
            this.putQueryParameter("FeatureName", featureName);
            this.featureName = featureName;
            return this;
        }

        /**
         * The region ID.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DescribeEnvironmentFeatureRequest build() {
            return new DescribeEnvironmentFeatureRequest(this);
        } 

    } 

}
