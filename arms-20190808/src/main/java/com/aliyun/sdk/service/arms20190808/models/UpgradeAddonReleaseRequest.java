// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpgradeAddonReleaseRequest} extends {@link RequestModel}
 *
 * <p>UpgradeAddonReleaseRequest</p>
 */
public class UpgradeAddonReleaseRequest extends Request {
    @Query
    @NameInMap("AddonVersion")
    @Validation(required = true)
    private String addonVersion;

    @Query
    @NameInMap("DryRun")
    private Boolean dryRun;

    @Query
    @NameInMap("EnvironmentId")
    @Validation(required = true)
    private String environmentId;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ReleaseName")
    @Validation(required = true)
    private String releaseName;

    @Query
    @NameInMap("Values")
    @Validation(required = true)
    private String values;

    private UpgradeAddonReleaseRequest(Builder builder) {
        super(builder);
        this.addonVersion = builder.addonVersion;
        this.dryRun = builder.dryRun;
        this.environmentId = builder.environmentId;
        this.regionId = builder.regionId;
        this.releaseName = builder.releaseName;
        this.values = builder.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpgradeAddonReleaseRequest create() {
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

    public static final class Builder extends Request.Builder<UpgradeAddonReleaseRequest, Builder> {
        private String addonVersion; 
        private Boolean dryRun; 
        private String environmentId; 
        private String regionId; 
        private String releaseName; 
        private String values; 

        private Builder() {
            super();
        } 

        private Builder(UpgradeAddonReleaseRequest request) {
            super(request);
            this.addonVersion = request.addonVersion;
            this.dryRun = request.dryRun;
            this.environmentId = request.environmentId;
            this.regionId = request.regionId;
            this.releaseName = request.releaseName;
            this.values = request.values;
        } 

        /**
         * Version of Addon.
         */
        public Builder addonVersion(String addonVersion) {
            this.putQueryParameter("AddonVersion", addonVersion);
            this.addonVersion = addonVersion;
            return this;
        }

        /**
         * Whether to pre-check this request.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
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
         * The ID of the region.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The name of Release.
         */
        public Builder releaseName(String releaseName) {
            this.putQueryParameter("ReleaseName", releaseName);
            this.releaseName = releaseName;
            return this;
        }

        /**
         * Metadata information.
         */
        public Builder values(String values) {
            this.putQueryParameter("Values", values);
            this.values = values;
            return this;
        }

        @Override
        public UpgradeAddonReleaseRequest build() {
            return new UpgradeAddonReleaseRequest(this);
        } 

    } 

}
