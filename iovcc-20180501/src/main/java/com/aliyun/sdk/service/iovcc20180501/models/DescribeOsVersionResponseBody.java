// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeOsVersionResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeOsVersionResponseBody</p>
 */
public class DescribeOsVersionResponseBody extends TeaModel {
    @NameInMap("OsVersion")
    private OsVersion osVersion;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeOsVersionResponseBody(Builder builder) {
        this.osVersion = builder.osVersion;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeOsVersionResponseBody create() {
        return builder().build();
    }

    /**
     * @return osVersion
     */
    public OsVersion getOsVersion() {
        return this.osVersion;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private OsVersion osVersion; 
        private String requestId; 

        /**
         * OsVersion.
         */
        public Builder osVersion(OsVersion osVersion) {
            this.osVersion = osVersion;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeOsVersionResponseBody build() {
            return new DescribeOsVersionResponseBody(this);
        } 

    } 

    public static class NightUpgradeOption extends TeaModel {
        @NameInMap("DownloadType")
        private String downloadType;

        @NameInMap("IsAllowedCancel")
        private String isAllowedCancel;

        @NameInMap("IsShowTip")
        private String isShowTip;

        private NightUpgradeOption(Builder builder) {
            this.downloadType = builder.downloadType;
            this.isAllowedCancel = builder.isAllowedCancel;
            this.isShowTip = builder.isShowTip;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NightUpgradeOption create() {
            return builder().build();
        }

        /**
         * @return downloadType
         */
        public String getDownloadType() {
            return this.downloadType;
        }

        /**
         * @return isAllowedCancel
         */
        public String getIsAllowedCancel() {
            return this.isAllowedCancel;
        }

        /**
         * @return isShowTip
         */
        public String getIsShowTip() {
            return this.isShowTip;
        }

        public static final class Builder {
            private String downloadType; 
            private String isAllowedCancel; 
            private String isShowTip; 

            /**
             * DownloadType.
             */
            public Builder downloadType(String downloadType) {
                this.downloadType = downloadType;
                return this;
            }

            /**
             * IsAllowedCancel.
             */
            public Builder isAllowedCancel(String isAllowedCancel) {
                this.isAllowedCancel = isAllowedCancel;
                return this;
            }

            /**
             * IsShowTip.
             */
            public Builder isShowTip(String isShowTip) {
                this.isShowTip = isShowTip;
                return this;
            }

            public NightUpgradeOption build() {
                return new NightUpgradeOption(this);
            } 

        } 

    }
    public static class RomList extends TeaModel {
        @NameInMap("BaseVersion")
        private String baseVersion;

        @NameInMap("DownloadUrl")
        private String downloadUrl;

        @NameInMap("GmtCreate")
        private String gmtCreate;

        @NameInMap("GmtModify")
        private String gmtModify;

        @NameInMap("Id")
        private Long id;

        @NameInMap("Md5")
        private String md5;

        @NameInMap("OriginalUrl")
        private String originalUrl;

        @NameInMap("Size")
        private String size;

        @NameInMap("SplitNum")
        private String splitNum;

        @NameInMap("VersionId")
        private Long versionId;

        private RomList(Builder builder) {
            this.baseVersion = builder.baseVersion;
            this.downloadUrl = builder.downloadUrl;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModify = builder.gmtModify;
            this.id = builder.id;
            this.md5 = builder.md5;
            this.originalUrl = builder.originalUrl;
            this.size = builder.size;
            this.splitNum = builder.splitNum;
            this.versionId = builder.versionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RomList create() {
            return builder().build();
        }

        /**
         * @return baseVersion
         */
        public String getBaseVersion() {
            return this.baseVersion;
        }

        /**
         * @return downloadUrl
         */
        public String getDownloadUrl() {
            return this.downloadUrl;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModify
         */
        public String getGmtModify() {
            return this.gmtModify;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return md5
         */
        public String getMd5() {
            return this.md5;
        }

        /**
         * @return originalUrl
         */
        public String getOriginalUrl() {
            return this.originalUrl;
        }

        /**
         * @return size
         */
        public String getSize() {
            return this.size;
        }

        /**
         * @return splitNum
         */
        public String getSplitNum() {
            return this.splitNum;
        }

        /**
         * @return versionId
         */
        public Long getVersionId() {
            return this.versionId;
        }

        public static final class Builder {
            private String baseVersion; 
            private String downloadUrl; 
            private String gmtCreate; 
            private String gmtModify; 
            private Long id; 
            private String md5; 
            private String originalUrl; 
            private String size; 
            private String splitNum; 
            private Long versionId; 

            /**
             * BaseVersion.
             */
            public Builder baseVersion(String baseVersion) {
                this.baseVersion = baseVersion;
                return this;
            }

            /**
             * DownloadUrl.
             */
            public Builder downloadUrl(String downloadUrl) {
                this.downloadUrl = downloadUrl;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtModify.
             */
            public Builder gmtModify(String gmtModify) {
                this.gmtModify = gmtModify;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * Md5.
             */
            public Builder md5(String md5) {
                this.md5 = md5;
                return this;
            }

            /**
             * OriginalUrl.
             */
            public Builder originalUrl(String originalUrl) {
                this.originalUrl = originalUrl;
                return this;
            }

            /**
             * Size.
             */
            public Builder size(String size) {
                this.size = size;
                return this;
            }

            /**
             * SplitNum.
             */
            public Builder splitNum(String splitNum) {
                this.splitNum = splitNum;
                return this;
            }

            /**
             * VersionId.
             */
            public Builder versionId(Long versionId) {
                this.versionId = versionId;
                return this;
            }

            public RomList build() {
                return new RomList(this);
            } 

        } 

    }
    public static class OsVersion extends TeaModel {
        @NameInMap("BlackVersionList")
        private String blackVersionList;

        @NameInMap("DeviceModelId")
        private String deviceModelId;

        @NameInMap("DeviceModelName")
        private String deviceModelName;

        @NameInMap("EnableMobileDownload")
        private String enableMobileDownload;

        @NameInMap("GmtCreate")
        private String gmtCreate;

        @NameInMap("GmtModify")
        private String gmtModify;

        @NameInMap("Id")
        private Long id;

        @NameInMap("IsForceNightUpgrade")
        private String isForceNightUpgrade;

        @NameInMap("IsForceUpgrade")
        private String isForceUpgrade;

        @NameInMap("IsMilestone")
        private String isMilestone;

        @NameInMap("MaxClientVersion")
        private String maxClientVersion;

        @NameInMap("MinClientVersion")
        private String minClientVersion;

        @NameInMap("MobileDownloadMaxSize")
        private String mobileDownloadMaxSize;

        @NameInMap("NightUpgradeOption")
        private NightUpgradeOption nightUpgradeOption;

        @NameInMap("ReleaseNote")
        private String releaseNote;

        @NameInMap("Remark")
        private String remark;

        @NameInMap("RomList")
        private java.util.List < RomList> romList;

        @NameInMap("Status")
        private String status;

        @NameInMap("StatusName")
        private String statusName;

        @NameInMap("SystemVersion")
        private String systemVersion;

        @NameInMap("WhiteVersionList")
        private String whiteVersionList;

        private OsVersion(Builder builder) {
            this.blackVersionList = builder.blackVersionList;
            this.deviceModelId = builder.deviceModelId;
            this.deviceModelName = builder.deviceModelName;
            this.enableMobileDownload = builder.enableMobileDownload;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModify = builder.gmtModify;
            this.id = builder.id;
            this.isForceNightUpgrade = builder.isForceNightUpgrade;
            this.isForceUpgrade = builder.isForceUpgrade;
            this.isMilestone = builder.isMilestone;
            this.maxClientVersion = builder.maxClientVersion;
            this.minClientVersion = builder.minClientVersion;
            this.mobileDownloadMaxSize = builder.mobileDownloadMaxSize;
            this.nightUpgradeOption = builder.nightUpgradeOption;
            this.releaseNote = builder.releaseNote;
            this.remark = builder.remark;
            this.romList = builder.romList;
            this.status = builder.status;
            this.statusName = builder.statusName;
            this.systemVersion = builder.systemVersion;
            this.whiteVersionList = builder.whiteVersionList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OsVersion create() {
            return builder().build();
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
         * @return deviceModelName
         */
        public String getDeviceModelName() {
            return this.deviceModelName;
        }

        /**
         * @return enableMobileDownload
         */
        public String getEnableMobileDownload() {
            return this.enableMobileDownload;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModify
         */
        public String getGmtModify() {
            return this.gmtModify;
        }

        /**
         * @return id
         */
        public Long getId() {
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
         * @return nightUpgradeOption
         */
        public NightUpgradeOption getNightUpgradeOption() {
            return this.nightUpgradeOption;
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
        public java.util.List < RomList> getRomList() {
            return this.romList;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return statusName
         */
        public String getStatusName() {
            return this.statusName;
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

        public static final class Builder {
            private String blackVersionList; 
            private String deviceModelId; 
            private String deviceModelName; 
            private String enableMobileDownload; 
            private String gmtCreate; 
            private String gmtModify; 
            private Long id; 
            private String isForceNightUpgrade; 
            private String isForceUpgrade; 
            private String isMilestone; 
            private String maxClientVersion; 
            private String minClientVersion; 
            private String mobileDownloadMaxSize; 
            private NightUpgradeOption nightUpgradeOption; 
            private String releaseNote; 
            private String remark; 
            private java.util.List < RomList> romList; 
            private String status; 
            private String statusName; 
            private String systemVersion; 
            private String whiteVersionList; 

            /**
             * BlackVersionList.
             */
            public Builder blackVersionList(String blackVersionList) {
                this.blackVersionList = blackVersionList;
                return this;
            }

            /**
             * DeviceModelId.
             */
            public Builder deviceModelId(String deviceModelId) {
                this.deviceModelId = deviceModelId;
                return this;
            }

            /**
             * DeviceModelName.
             */
            public Builder deviceModelName(String deviceModelName) {
                this.deviceModelName = deviceModelName;
                return this;
            }

            /**
             * EnableMobileDownload.
             */
            public Builder enableMobileDownload(String enableMobileDownload) {
                this.enableMobileDownload = enableMobileDownload;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtModify.
             */
            public Builder gmtModify(String gmtModify) {
                this.gmtModify = gmtModify;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * IsForceNightUpgrade.
             */
            public Builder isForceNightUpgrade(String isForceNightUpgrade) {
                this.isForceNightUpgrade = isForceNightUpgrade;
                return this;
            }

            /**
             * IsForceUpgrade.
             */
            public Builder isForceUpgrade(String isForceUpgrade) {
                this.isForceUpgrade = isForceUpgrade;
                return this;
            }

            /**
             * IsMilestone.
             */
            public Builder isMilestone(String isMilestone) {
                this.isMilestone = isMilestone;
                return this;
            }

            /**
             * MaxClientVersion.
             */
            public Builder maxClientVersion(String maxClientVersion) {
                this.maxClientVersion = maxClientVersion;
                return this;
            }

            /**
             * MinClientVersion.
             */
            public Builder minClientVersion(String minClientVersion) {
                this.minClientVersion = minClientVersion;
                return this;
            }

            /**
             * MobileDownloadMaxSize.
             */
            public Builder mobileDownloadMaxSize(String mobileDownloadMaxSize) {
                this.mobileDownloadMaxSize = mobileDownloadMaxSize;
                return this;
            }

            /**
             * NightUpgradeOption.
             */
            public Builder nightUpgradeOption(NightUpgradeOption nightUpgradeOption) {
                this.nightUpgradeOption = nightUpgradeOption;
                return this;
            }

            /**
             * ReleaseNote.
             */
            public Builder releaseNote(String releaseNote) {
                this.releaseNote = releaseNote;
                return this;
            }

            /**
             * Remark.
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * RomList.
             */
            public Builder romList(java.util.List < RomList> romList) {
                this.romList = romList;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * StatusName.
             */
            public Builder statusName(String statusName) {
                this.statusName = statusName;
                return this;
            }

            /**
             * SystemVersion.
             */
            public Builder systemVersion(String systemVersion) {
                this.systemVersion = systemVersion;
                return this;
            }

            /**
             * WhiteVersionList.
             */
            public Builder whiteVersionList(String whiteVersionList) {
                this.whiteVersionList = whiteVersionList;
                return this;
            }

            public OsVersion build() {
                return new OsVersion(this);
            } 

        } 

    }
}
