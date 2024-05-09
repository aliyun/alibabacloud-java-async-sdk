// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InstallEnvironmentFeatureRequest} extends {@link RequestModel}
 *
 * <p>InstallEnvironmentFeatureRequest</p>
 */
public class InstallEnvironmentFeatureRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AliyunLang")
    private String aliyunLang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Config")
    private String config;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnvironmentId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String environmentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FeatureName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String featureName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FeatureVersion")
    @com.aliyun.core.annotation.Validation(required = true)
    private String featureVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Region")
    private String region;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private InstallEnvironmentFeatureRequest(Builder builder) {
        super(builder);
        this.aliyunLang = builder.aliyunLang;
        this.config = builder.config;
        this.environmentId = builder.environmentId;
        this.featureName = builder.featureName;
        this.featureVersion = builder.featureVersion;
        this.region = builder.region;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InstallEnvironmentFeatureRequest create() {
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
     * @return config
     */
    public String getConfig() {
        return this.config;
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
     * @return featureVersion
     */
    public String getFeatureVersion() {
        return this.featureVersion;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<InstallEnvironmentFeatureRequest, Builder> {
        private String aliyunLang; 
        private String config; 
        private String environmentId; 
        private String featureName; 
        private String featureVersion; 
        private String region; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(InstallEnvironmentFeatureRequest request) {
            super(request);
            this.aliyunLang = request.aliyunLang;
            this.config = request.config;
            this.environmentId = request.environmentId;
            this.featureName = request.featureName;
            this.featureVersion = request.featureVersion;
            this.region = request.region;
            this.regionId = request.regionId;
        } 

        /**
         * The language. Valid values: zh and en. Default value: zh.
         */
        public Builder aliyunLang(String aliyunLang) {
            this.putQueryParameter("AliyunLang", aliyunLang);
            this.aliyunLang = aliyunLang;
            return this;
        }

        /**
         * The metadata of the feature.
         */
        public Builder config(String config) {
            this.putQueryParameter("Config", config);
            this.config = config;
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
         * The version of the feature.
         */
        public Builder featureVersion(String featureVersion) {
            this.putQueryParameter("FeatureVersion", featureVersion);
            this.featureVersion = featureVersion;
            return this;
        }

        /**
         * The region ID of the feature.
         */
        public Builder region(String region) {
            this.putQueryParameter("Region", region);
            this.region = region;
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
        public InstallEnvironmentFeatureRequest build() {
            return new InstallEnvironmentFeatureRequest(this);
        } 

    } 

}
