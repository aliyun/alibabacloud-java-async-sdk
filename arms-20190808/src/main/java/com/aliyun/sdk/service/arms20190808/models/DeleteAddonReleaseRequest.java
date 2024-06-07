// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteAddonReleaseRequest} extends {@link RequestModel}
 *
 * <p>DeleteAddonReleaseRequest</p>
 */
public class DeleteAddonReleaseRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AddonName")
    private String addonName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnvironmentId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String environmentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Force")
    private Boolean force;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReleaseName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String releaseName;

    private DeleteAddonReleaseRequest(Builder builder) {
        super(builder);
        this.addonName = builder.addonName;
        this.environmentId = builder.environmentId;
        this.force = builder.force;
        this.regionId = builder.regionId;
        this.releaseName = builder.releaseName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAddonReleaseRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return addonName
     */
    public String getAddonName() {
        return this.addonName;
    }

    /**
     * @return environmentId
     */
    public String getEnvironmentId() {
        return this.environmentId;
    }

    /**
     * @return force
     */
    public Boolean getForce() {
        return this.force;
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

    public static final class Builder extends Request.Builder<DeleteAddonReleaseRequest, Builder> {
        private String addonName; 
        private String environmentId; 
        private Boolean force; 
        private String regionId; 
        private String releaseName; 

        private Builder() {
            super();
        } 

        private Builder(DeleteAddonReleaseRequest request) {
            super(request);
            this.addonName = request.addonName;
            this.environmentId = request.environmentId;
            this.force = request.force;
            this.regionId = request.regionId;
            this.releaseName = request.releaseName;
        } 

        /**
         * AddonName.
         */
        public Builder addonName(String addonName) {
            this.putQueryParameter("AddonName", addonName);
            this.addonName = addonName;
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
         * Whether to be forcibly deleted. The default value is false.
         */
        public Builder force(Boolean force) {
            this.putQueryParameter("Force", force);
            this.force = force;
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
         * Name of Release.
         */
        public Builder releaseName(String releaseName) {
            this.putQueryParameter("ReleaseName", releaseName);
            this.releaseName = releaseName;
            return this;
        }

        @Override
        public DeleteAddonReleaseRequest build() {
            return new DeleteAddonReleaseRequest(this);
        } 

    } 

}
