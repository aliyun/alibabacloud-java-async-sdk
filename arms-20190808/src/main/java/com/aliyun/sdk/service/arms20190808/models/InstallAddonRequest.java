// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InstallAddonRequest} extends {@link RequestModel}
 *
 * <p>InstallAddonRequest</p>
 */
public class InstallAddonRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AddonVersion")
    @com.aliyun.core.annotation.Validation(required = true)
    private String addonVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AliyunLang")
    private String aliyunLang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnvironmentId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String environmentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReleaseName")
    private String releaseName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Values")
    private String values;

    private InstallAddonRequest(Builder builder) {
        super(builder);
        this.addonVersion = builder.addonVersion;
        this.aliyunLang = builder.aliyunLang;
        this.dryRun = builder.dryRun;
        this.environmentId = builder.environmentId;
        this.name = builder.name;
        this.regionId = builder.regionId;
        this.releaseName = builder.releaseName;
        this.values = builder.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InstallAddonRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return addonVersion
     */
    public String getAddonVersion() {
        return this.addonVersion;
    }

    /**
     * @return aliyunLang
     */
    public String getAliyunLang() {
        return this.aliyunLang;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return environmentId
     */
    public String getEnvironmentId() {
        return this.environmentId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return releaseName
     */
    public String getReleaseName() {
        return this.releaseName;
    }

    /**
     * @return values
     */
    public String getValues() {
        return this.values;
    }

    public static final class Builder extends Request.Builder<InstallAddonRequest, Builder> {
        private String addonVersion; 
        private String aliyunLang; 
        private Boolean dryRun; 
        private String environmentId; 
        private String name; 
        private String regionId; 
        private String releaseName; 
        private String values; 

        private Builder() {
            super();
        } 

        private Builder(InstallAddonRequest request) {
            super(request);
            this.addonVersion = request.addonVersion;
            this.aliyunLang = request.aliyunLang;
            this.dryRun = request.dryRun;
            this.environmentId = request.environmentId;
            this.name = request.name;
            this.regionId = request.regionId;
            this.releaseName = request.releaseName;
            this.values = request.values;
        } 

        /**
         * The version of the add-on.
         */
        public Builder addonVersion(String addonVersion) {
            this.putQueryParameter("AddonVersion", addonVersion);
            this.addonVersion = addonVersion;
            return this;
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
         * Specifies whether to perform only a dry run, without performing the actual request. Default value: false.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
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
         * The name of the add-on.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
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
         * The name of the add-on after it is installed. If you do not specify this parameter, a default rule name is generated.
         */
        public Builder releaseName(String releaseName) {
            this.putQueryParameter("ReleaseName", releaseName);
            this.releaseName = releaseName;
            return this;
        }

        /**
         * The metadata.
         */
        public Builder values(String values) {
            this.putQueryParameter("Values", values);
            this.values = values;
            return this;
        }

        @Override
        public InstallAddonRequest build() {
            return new InstallAddonRequest(this);
        } 

    } 

}
