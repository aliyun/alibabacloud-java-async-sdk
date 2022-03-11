// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyInstanceUpgradePeriodRequest} extends {@link RequestModel}
 *
 * <p>ModifyInstanceUpgradePeriodRequest</p>
 */
public class ModifyInstanceUpgradePeriodRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("UpgradeMode")
    private String upgradeMode;

    @Query
    @NameInMap("UpgradeStartTime")
    @Validation(required = true)
    private String upgradeStartTime;

    private ModifyInstanceUpgradePeriodRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.lang = builder.lang;
        this.regionId = builder.regionId;
        this.upgradeMode = builder.upgradeMode;
        this.upgradeStartTime = builder.upgradeStartTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyInstanceUpgradePeriodRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return upgradeMode
     */
    public String getUpgradeMode() {
        return this.upgradeMode;
    }

    /**
     * @return upgradeStartTime
     */
    public String getUpgradeStartTime() {
        return this.upgradeStartTime;
    }

    public static final class Builder extends Request.Builder<ModifyInstanceUpgradePeriodRequest, Builder> {
        private String instanceId; 
        private String lang; 
        private String regionId; 
        private String upgradeMode; 
        private String upgradeStartTime; 

        private Builder() {
            super();
        } 

        private Builder(ModifyInstanceUpgradePeriodRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.lang = request.lang;
            this.regionId = request.regionId;
            this.upgradeMode = request.upgradeMode;
            this.upgradeStartTime = request.upgradeStartTime;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * UpgradeMode.
         */
        public Builder upgradeMode(String upgradeMode) {
            this.putQueryParameter("UpgradeMode", upgradeMode);
            this.upgradeMode = upgradeMode;
            return this;
        }

        /**
         * UpgradeStartTime.
         */
        public Builder upgradeStartTime(String upgradeStartTime) {
            this.putQueryParameter("UpgradeStartTime", upgradeStartTime);
            this.upgradeStartTime = upgradeStartTime;
            return this;
        }

        @Override
        public ModifyInstanceUpgradePeriodRequest build() {
            return new ModifyInstanceUpgradePeriodRequest(this);
        } 

    } 

}
