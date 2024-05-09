// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEnvironmentFeatureRequest} extends {@link RequestModel}
 *
 * <p>DescribeEnvironmentFeatureRequest</p>
 */
public class DescribeEnvironmentFeatureRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AliyunLang")
    private String aliyunLang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnvironmentId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String environmentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FeatureName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String featureName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private DescribeEnvironmentFeatureRequest(Builder builder) {
        super(builder);
        this.aliyunLang = builder.aliyunLang;
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
     * @return aliyunLang
     */
    public String getAliyunLang() {
        return this.aliyunLang;
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
        private String aliyunLang; 
        private String environmentId; 
        private String featureName; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeEnvironmentFeatureRequest request) {
            super(request);
            this.aliyunLang = request.aliyunLang;
            this.environmentId = request.environmentId;
            this.featureName = request.featureName;
            this.regionId = request.regionId;
        } 

        /**
         * AliyunLang.
         */
        public Builder aliyunLang(String aliyunLang) {
            this.putQueryParameter("AliyunLang", aliyunLang);
            this.aliyunLang = aliyunLang;
            return this;
        }

        /**
         * The environment ID.
         */
        public Builder environmentId(String environmentId) {
            this.putQueryParameter("EnvironmentId", environmentId);
            this.environmentId = environmentId;
            return this;
        }

        /**
         * The name of the feature.
         * <p>
         * 
         * Valid values:
         * 
         * *   app-agent-pilot
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         * *   metric-agent
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
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
