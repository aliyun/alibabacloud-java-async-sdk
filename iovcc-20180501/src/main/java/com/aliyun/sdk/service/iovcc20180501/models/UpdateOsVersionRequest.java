// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateOsVersionRequest} extends {@link RequestModel}
 *
 * <p>UpdateOsVersionRequest</p>
 */
public class UpdateOsVersionRequest extends Request {
    @Query
    @NameInMap("BlackVersionList")
    private String blackVersionList;

    @Query
    @NameInMap("DeviceModelId")
    @Validation(required = true)
    private String deviceModelId;

    @Query
    @NameInMap("EnableMobileDownload")
    @Validation(required = true)
    private String enableMobileDownload;

    @Query
    @NameInMap("Id")
    @Validation(required = true)
    private String id;

    @Query
    @NameInMap("IsForceNightUpgrade")
    @Validation(required = true)
    private String isForceNightUpgrade;

    @Query
    @NameInMap("IsForceUpgrade")
    @Validation(required = true)
    private String isForceUpgrade;

    @Query
    @NameInMap("IsMilestone")
    @Validation(required = true)
    private String isMilestone;

    @Query
    @NameInMap("MaxClientVersion")
    private String maxClientVersion;

    @Query
    @NameInMap("MinClientVersion")
    private String minClientVersion;

    @Query
    @NameInMap("MobileDownloadMaxSize")
    private String mobileDownloadMaxSize;

    @Query
    @NameInMap("NightUpgradeDownloadType")
    @Validation(required = true)
    private String nightUpgradeDownloadType;

    @Query
    @NameInMap("NightUpgradeIsAllowedCancel")
    @Validation(required = true)
    private String nightUpgradeIsAllowedCancel;

    @Query
    @NameInMap("NightUpgradeIsShowTip")
    @Validation(required = true)
    private String nightUpgradeIsShowTip;

    @Query
    @NameInMap("ProjectId")
    @Validation(required = true)
    private String projectId;

    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ReleaseNote")
    @Validation(required = true)
    private String releaseNote;

    @Query
    @NameInMap("Remark")
    private String remark;

    @Query
    @NameInMap("RomList")
    @Validation(required = true)
    private String romList;

    @Query
    @NameInMap("SystemVersion")
    @Validation(required = true)
    private String systemVersion;

    @Query
    @NameInMap("WhiteVersionList")
    private String whiteVersionList;

    private UpdateOsVersionRequest(Builder builder) {
        super(builder);
        this.blackVersionList = builder.blackVersionList;
        this.deviceModelId = builder.deviceModelId;
        this.enableMobileDownload = builder.enableMobileDownload;
        this.id = builder.id;
        this.isForceNightUpgrade = builder.isForceNightUpgrade;
        this.isForceUpgrade = builder.isForceUpgrade;
        this.isMilestone = builder.isMilestone;
        this.maxClientVersion = builder.maxClientVersion;
        this.minClientVersion = builder.minClientVersion;
        this.mobileDownloadMaxSize = builder.mobileDownloadMaxSize;
        this.nightUpgradeDownloadType = builder.nightUpgradeDownloadType;
        this.nightUpgradeIsAllowedCancel = builder.nightUpgradeIsAllowedCancel;
        this.nightUpgradeIsShowTip = builder.nightUpgradeIsShowTip;
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
        this.releaseNote = builder.releaseNote;
        this.remark = builder.remark;
        this.romList = builder.romList;
        this.systemVersion = builder.systemVersion;
        this.whiteVersionList = builder.whiteVersionList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateOsVersionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return blackVersionList
     */
    public String getBlackVersionList() {
        return this.blackVersionList;
    }

    /**
     * @return deviceModelId
     */
    public String getDeviceModelId() {
        return this.deviceModelId;
    }

    /**
     * @return enableMobileDownload
     */
    public String getEnableMobileDownload() {
        return this.enableMobileDownload;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return isForceNightUpgrade
     */
    public String getIsForceNightUpgrade() {
        return this.isForceNightUpgrade;
    }

    /**
     * @return isForceUpgrade
     */
    public String getIsForceUpgrade() {
        return this.isForceUpgrade;
    }

    /**
     * @return isMilestone
     */
    public String getIsMilestone() {
        return this.isMilestone;
    }

    /**
     * @return maxClientVersion
     */
    public String getMaxClientVersion() {
        return this.maxClientVersion;
    }

    /**
     * @return minClientVersion
     */
    public String getMinClientVersion() {
        return this.minClientVersion;
    }

    /**
     * @return mobileDownloadMaxSize
     */
    public String getMobileDownloadMaxSize() {
        return this.mobileDownloadMaxSize;
    }

    /**
     * @return nightUpgradeDownloadType
     */
    public String getNightUpgradeDownloadType() {
        return this.nightUpgradeDownloadType;
    }

    /**
     * @return nightUpgradeIsAllowedCancel
     */
    public String getNightUpgradeIsAllowedCancel() {
        return this.nightUpgradeIsAllowedCancel;
    }

    /**
     * @return nightUpgradeIsShowTip
     */
    public String getNightUpgradeIsShowTip() {
        return this.nightUpgradeIsShowTip;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return releaseNote
     */
    public String getReleaseNote() {
        return this.releaseNote;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * @return romList
     */
    public String getRomList() {
        return this.romList;
    }

    /**
     * @return systemVersion
     */
    public String getSystemVersion() {
        return this.systemVersion;
    }

    /**
     * @return whiteVersionList
     */
    public String getWhiteVersionList() {
        return this.whiteVersionList;
    }

    public static final class Builder extends Request.Builder<UpdateOsVersionRequest, Builder> {
        private String blackVersionList; 
        private String deviceModelId; 
        private String enableMobileDownload; 
        private String id; 
        private String isForceNightUpgrade; 
        private String isForceUpgrade; 
        private String isMilestone; 
        private String maxClientVersion; 
        private String minClientVersion; 
        private String mobileDownloadMaxSize; 
        private String nightUpgradeDownloadType; 
        private String nightUpgradeIsAllowedCancel; 
        private String nightUpgradeIsShowTip; 
        private String projectId; 
        private String regionId; 
        private String releaseNote; 
        private String remark; 
        private String romList; 
        private String systemVersion; 
        private String whiteVersionList; 

        private Builder() {
            super();
        } 

        private Builder(UpdateOsVersionRequest response) {
            super(response);
            this.blackVersionList = response.blackVersionList;
            this.deviceModelId = response.deviceModelId;
            this.enableMobileDownload = response.enableMobileDownload;
            this.id = response.id;
            this.isForceNightUpgrade = response.isForceNightUpgrade;
            this.isForceUpgrade = response.isForceUpgrade;
            this.isMilestone = response.isMilestone;
            this.maxClientVersion = response.maxClientVersion;
            this.minClientVersion = response.minClientVersion;
            this.mobileDownloadMaxSize = response.mobileDownloadMaxSize;
            this.nightUpgradeDownloadType = response.nightUpgradeDownloadType;
            this.nightUpgradeIsAllowedCancel = response.nightUpgradeIsAllowedCancel;
            this.nightUpgradeIsShowTip = response.nightUpgradeIsShowTip;
            this.projectId = response.projectId;
            this.regionId = response.regionId;
            this.releaseNote = response.releaseNote;
            this.remark = response.remark;
            this.romList = response.romList;
            this.systemVersion = response.systemVersion;
            this.whiteVersionList = response.whiteVersionList;
        } 

        /**
         * BlackVersionList.
         */
        public Builder blackVersionList(String blackVersionList) {
            this.putQueryParameter("BlackVersionList", blackVersionList);
            this.blackVersionList = blackVersionList;
            return this;
        }

        /**
         * DeviceModelId.
         */
        public Builder deviceModelId(String deviceModelId) {
            this.putQueryParameter("DeviceModelId", deviceModelId);
            this.deviceModelId = deviceModelId;
            return this;
        }

        /**
         * EnableMobileDownload.
         */
        public Builder enableMobileDownload(String enableMobileDownload) {
            this.putQueryParameter("EnableMobileDownload", enableMobileDownload);
            this.enableMobileDownload = enableMobileDownload;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(String id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * IsForceNightUpgrade.
         */
        public Builder isForceNightUpgrade(String isForceNightUpgrade) {
            this.putQueryParameter("IsForceNightUpgrade", isForceNightUpgrade);
            this.isForceNightUpgrade = isForceNightUpgrade;
            return this;
        }

        /**
         * IsForceUpgrade.
         */
        public Builder isForceUpgrade(String isForceUpgrade) {
            this.putQueryParameter("IsForceUpgrade", isForceUpgrade);
            this.isForceUpgrade = isForceUpgrade;
            return this;
        }

        /**
         * IsMilestone.
         */
        public Builder isMilestone(String isMilestone) {
            this.putQueryParameter("IsMilestone", isMilestone);
            this.isMilestone = isMilestone;
            return this;
        }

        /**
         * MaxClientVersion.
         */
        public Builder maxClientVersion(String maxClientVersion) {
            this.putQueryParameter("MaxClientVersion", maxClientVersion);
            this.maxClientVersion = maxClientVersion;
            return this;
        }

        /**
         * MinClientVersion.
         */
        public Builder minClientVersion(String minClientVersion) {
            this.putQueryParameter("MinClientVersion", minClientVersion);
            this.minClientVersion = minClientVersion;
            return this;
        }

        /**
         * MobileDownloadMaxSize.
         */
        public Builder mobileDownloadMaxSize(String mobileDownloadMaxSize) {
            this.putQueryParameter("MobileDownloadMaxSize", mobileDownloadMaxSize);
            this.mobileDownloadMaxSize = mobileDownloadMaxSize;
            return this;
        }

        /**
         * NightUpgradeDownloadType.
         */
        public Builder nightUpgradeDownloadType(String nightUpgradeDownloadType) {
            this.putQueryParameter("NightUpgradeDownloadType", nightUpgradeDownloadType);
            this.nightUpgradeDownloadType = nightUpgradeDownloadType;
            return this;
        }

        /**
         * NightUpgradeIsAllowedCancel.
         */
        public Builder nightUpgradeIsAllowedCancel(String nightUpgradeIsAllowedCancel) {
            this.putQueryParameter("NightUpgradeIsAllowedCancel", nightUpgradeIsAllowedCancel);
            this.nightUpgradeIsAllowedCancel = nightUpgradeIsAllowedCancel;
            return this;
        }

        /**
         * NightUpgradeIsShowTip.
         */
        public Builder nightUpgradeIsShowTip(String nightUpgradeIsShowTip) {
            this.putQueryParameter("NightUpgradeIsShowTip", nightUpgradeIsShowTip);
            this.nightUpgradeIsShowTip = nightUpgradeIsShowTip;
            return this;
        }

        /**
         * ProjectId.
         */
        public Builder projectId(String projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ReleaseNote.
         */
        public Builder releaseNote(String releaseNote) {
            this.putQueryParameter("ReleaseNote", releaseNote);
            this.releaseNote = releaseNote;
            return this;
        }

        /**
         * Remark.
         */
        public Builder remark(String remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        /**
         * RomList.
         */
        public Builder romList(String romList) {
            this.putQueryParameter("RomList", romList);
            this.romList = romList;
            return this;
        }

        /**
         * SystemVersion.
         */
        public Builder systemVersion(String systemVersion) {
            this.putQueryParameter("SystemVersion", systemVersion);
            this.systemVersion = systemVersion;
            return this;
        }

        /**
         * WhiteVersionList.
         */
        public Builder whiteVersionList(String whiteVersionList) {
            this.putQueryParameter("WhiteVersionList", whiteVersionList);
            this.whiteVersionList = whiteVersionList;
            return this;
        }

        @Override
        public UpdateOsVersionRequest build() {
            return new UpdateOsVersionRequest(this);
        } 

    } 

}
