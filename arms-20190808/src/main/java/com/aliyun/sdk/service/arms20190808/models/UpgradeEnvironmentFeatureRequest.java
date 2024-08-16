// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpgradeEnvironmentFeatureRequest} extends {@link RequestModel}
 *
 * <p>UpgradeEnvironmentFeatureRequest</p>
 */
public class UpgradeEnvironmentFeatureRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("FeatureVersion")
    private String featureVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Values")
    private String values;

    private UpgradeEnvironmentFeatureRequest(Builder builder) {
        super(builder);
        this.aliyunLang = builder.aliyunLang;
        this.environmentId = builder.environmentId;
        this.featureName = builder.featureName;
        this.featureVersion = builder.featureVersion;
        this.regionId = builder.regionId;
        this.values = builder.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpgradeEnvironmentFeatureRequest create() {
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
     * @return featureVersion
     */
    public String getFeatureVersion() {
        return this.featureVersion;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return values
     */
    public String getValues() {
        return this.values;
    }

    public static final class Builder extends Request.Builder<UpgradeEnvironmentFeatureRequest, Builder> {
        private String aliyunLang; 
        private String environmentId; 
        private String featureName; 
        private String featureVersion; 
        private String regionId; 
        private String values; 

        private Builder() {
            super();
        } 

        private Builder(UpgradeEnvironmentFeatureRequest request) {
            super(request);
            this.aliyunLang = request.aliyunLang;
            this.environmentId = request.environmentId;
            this.featureName = request.featureName;
            this.featureVersion = request.featureVersion;
            this.regionId = request.regionId;
            this.values = request.values;
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
         * The environment ID.
         */
        public Builder environmentId(String environmentId) {
            this.putQueryParameter("EnvironmentId", environmentId);
            this.environmentId = environmentId;
            return this;
        }

        /**
         * The feature name. Valid values: app-agent-pilot, metric-agent, ebpf-agent, and service-check.
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
         * The region ID.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Specifies whether to enable service discovery. For PodAnnotation, set the value to run or mini. For PodMonitor and ServiceMonitor, set the value to true or false.
         */
        public Builder values(String values) {
            this.putQueryParameter("Values", values);
            this.values = values;
            return this;
        }

        @Override
        public UpgradeEnvironmentFeatureRequest build() {
            return new UpgradeEnvironmentFeatureRequest(this);
        } 

    } 

}
