// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link ModifyInstanceUpgradePeriodRequest} extends {@link RequestModel}
 *
 * <p>ModifyInstanceUpgradePeriodRequest</p>
 */
public class ModifyInstanceUpgradePeriodRequest extends Request {
    @Query
    @NameInMap("InstanceId")
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

    public static final class Builder extends Request.Builder<Builder> {
        private String instanceId; 
        private String lang; 
        private String regionId; 
        private String upgradeMode; 
        private String upgradeStartTime; 

        /**
         * <p>InstanceId.</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>Lang.</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>RegionId.</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>UpgradeMode.</p>
         */
        public Builder upgradeMode(String upgradeMode) {
            this.putQueryParameter("UpgradeMode", upgradeMode);
            this.upgradeMode = upgradeMode;
            return this;
        }

        /**
         * <p>UpgradeStartTime.</p>
         */
        public Builder upgradeStartTime(String upgradeStartTime) {
            this.putQueryParameter("UpgradeStartTime", upgradeStartTime);
            this.upgradeStartTime = upgradeStartTime;
            return this;
        }

        public ModifyInstanceUpgradePeriodRequest build() {
            return new ModifyInstanceUpgradePeriodRequest(this);
        } 

    } 

}
