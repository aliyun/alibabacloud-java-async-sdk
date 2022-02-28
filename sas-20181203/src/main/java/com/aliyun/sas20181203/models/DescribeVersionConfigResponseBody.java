// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVersionConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVersionConfigResponseBody</p>
 */
public class DescribeVersionConfigResponseBody extends TeaModel {
    @NameInMap("AllowPartialBuy")
    private Integer allowPartialBuy;

    @NameInMap("AppWhiteList")
    private Integer appWhiteList;

    @NameInMap("AppWhiteListAuthCount")
    private Long appWhiteListAuthCount;

    @NameInMap("AssetLevel")
    private Integer assetLevel;

    @NameInMap("HighestVersion")
    private Integer highestVersion;

    @NameInMap("HoneypotCapacity")
    private Long honeypotCapacity;

    @NameInMap("ImageScanCapacity")
    private Long imageScanCapacity;

    @NameInMap("InstanceId")
    private String instanceId;

    @NameInMap("IsOverBalance")
    private Boolean isOverBalance;

    @NameInMap("IsTrialVersion")
    private Integer isTrialVersion;

    @NameInMap("LastTrailEndTime")
    private Long lastTrailEndTime;

    @NameInMap("MVAuthCount")
    private Integer MVAuthCount;

    @NameInMap("MVUnusedAuthCount")
    private Integer MVUnusedAuthCount;

    @NameInMap("ReleaseTime")
    private Long releaseTime;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SasLog")
    private Integer sasLog;

    @NameInMap("SasScreen")
    private Integer sasScreen;

    @NameInMap("SlsCapacity")
    private Long slsCapacity;

    @NameInMap("UserDefinedAlarms")
    private Integer userDefinedAlarms;

    @NameInMap("Version")
    private Integer version;

    @NameInMap("VmCores")
    private Integer vmCores;

    @NameInMap("WebLock")
    private Integer webLock;

    @NameInMap("WebLockAuthCount")
    private Long webLockAuthCount;

    private DescribeVersionConfigResponseBody(Builder builder) {
        this.allowPartialBuy = builder.allowPartialBuy;
        this.appWhiteList = builder.appWhiteList;
        this.appWhiteListAuthCount = builder.appWhiteListAuthCount;
        this.assetLevel = builder.assetLevel;
        this.highestVersion = builder.highestVersion;
        this.honeypotCapacity = builder.honeypotCapacity;
        this.imageScanCapacity = builder.imageScanCapacity;
        this.instanceId = builder.instanceId;
        this.isOverBalance = builder.isOverBalance;
        this.isTrialVersion = builder.isTrialVersion;
        this.lastTrailEndTime = builder.lastTrailEndTime;
        this.MVAuthCount = builder.MVAuthCount;
        this.MVUnusedAuthCount = builder.MVUnusedAuthCount;
        this.releaseTime = builder.releaseTime;
        this.requestId = builder.requestId;
        this.sasLog = builder.sasLog;
        this.sasScreen = builder.sasScreen;
        this.slsCapacity = builder.slsCapacity;
        this.userDefinedAlarms = builder.userDefinedAlarms;
        this.version = builder.version;
        this.vmCores = builder.vmCores;
        this.webLock = builder.webLock;
        this.webLockAuthCount = builder.webLockAuthCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVersionConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return allowPartialBuy
     */
    public Integer getAllowPartialBuy() {
        return this.allowPartialBuy;
    }

    /**
     * @return appWhiteList
     */
    public Integer getAppWhiteList() {
        return this.appWhiteList;
    }

    /**
     * @return appWhiteListAuthCount
     */
    public Long getAppWhiteListAuthCount() {
        return this.appWhiteListAuthCount;
    }

    /**
     * @return assetLevel
     */
    public Integer getAssetLevel() {
        return this.assetLevel;
    }

    /**
     * @return highestVersion
     */
    public Integer getHighestVersion() {
        return this.highestVersion;
    }

    /**
     * @return honeypotCapacity
     */
    public Long getHoneypotCapacity() {
        return this.honeypotCapacity;
    }

    /**
     * @return imageScanCapacity
     */
    public Long getImageScanCapacity() {
        return this.imageScanCapacity;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return isOverBalance
     */
    public Boolean getIsOverBalance() {
        return this.isOverBalance;
    }

    /**
     * @return isTrialVersion
     */
    public Integer getIsTrialVersion() {
        return this.isTrialVersion;
    }

    /**
     * @return lastTrailEndTime
     */
    public Long getLastTrailEndTime() {
        return this.lastTrailEndTime;
    }

    /**
     * @return MVAuthCount
     */
    public Integer getMVAuthCount() {
        return this.MVAuthCount;
    }

    /**
     * @return MVUnusedAuthCount
     */
    public Integer getMVUnusedAuthCount() {
        return this.MVUnusedAuthCount;
    }

    /**
     * @return releaseTime
     */
    public Long getReleaseTime() {
        return this.releaseTime;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sasLog
     */
    public Integer getSasLog() {
        return this.sasLog;
    }

    /**
     * @return sasScreen
     */
    public Integer getSasScreen() {
        return this.sasScreen;
    }

    /**
     * @return slsCapacity
     */
    public Long getSlsCapacity() {
        return this.slsCapacity;
    }

    /**
     * @return userDefinedAlarms
     */
    public Integer getUserDefinedAlarms() {
        return this.userDefinedAlarms;
    }

    /**
     * @return version
     */
    public Integer getVersion() {
        return this.version;
    }

    /**
     * @return vmCores
     */
    public Integer getVmCores() {
        return this.vmCores;
    }

    /**
     * @return webLock
     */
    public Integer getWebLock() {
        return this.webLock;
    }

    /**
     * @return webLockAuthCount
     */
    public Long getWebLockAuthCount() {
        return this.webLockAuthCount;
    }

    public static final class Builder {
        private Integer allowPartialBuy; 
        private Integer appWhiteList; 
        private Long appWhiteListAuthCount; 
        private Integer assetLevel; 
        private Integer highestVersion; 
        private Long honeypotCapacity; 
        private Long imageScanCapacity; 
        private String instanceId; 
        private Boolean isOverBalance; 
        private Integer isTrialVersion; 
        private Long lastTrailEndTime; 
        private Integer MVAuthCount; 
        private Integer MVUnusedAuthCount; 
        private Long releaseTime; 
        private String requestId; 
        private Integer sasLog; 
        private Integer sasScreen; 
        private Long slsCapacity; 
        private Integer userDefinedAlarms; 
        private Integer version; 
        private Integer vmCores; 
        private Integer webLock; 
        private Long webLockAuthCount; 

        /**
         * AllowPartialBuy.
         */
        public Builder allowPartialBuy(Integer allowPartialBuy) {
            this.allowPartialBuy = allowPartialBuy;
            return this;
        }

        /**
         * AppWhiteList.
         */
        public Builder appWhiteList(Integer appWhiteList) {
            this.appWhiteList = appWhiteList;
            return this;
        }

        /**
         * AppWhiteListAuthCount.
         */
        public Builder appWhiteListAuthCount(Long appWhiteListAuthCount) {
            this.appWhiteListAuthCount = appWhiteListAuthCount;
            return this;
        }

        /**
         * AssetLevel.
         */
        public Builder assetLevel(Integer assetLevel) {
            this.assetLevel = assetLevel;
            return this;
        }

        /**
         * HighestVersion.
         */
        public Builder highestVersion(Integer highestVersion) {
            this.highestVersion = highestVersion;
            return this;
        }

        /**
         * HoneypotCapacity.
         */
        public Builder honeypotCapacity(Long honeypotCapacity) {
            this.honeypotCapacity = honeypotCapacity;
            return this;
        }

        /**
         * ImageScanCapacity.
         */
        public Builder imageScanCapacity(Long imageScanCapacity) {
            this.imageScanCapacity = imageScanCapacity;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * IsOverBalance.
         */
        public Builder isOverBalance(Boolean isOverBalance) {
            this.isOverBalance = isOverBalance;
            return this;
        }

        /**
         * IsTrialVersion.
         */
        public Builder isTrialVersion(Integer isTrialVersion) {
            this.isTrialVersion = isTrialVersion;
            return this;
        }

        /**
         * LastTrailEndTime.
         */
        public Builder lastTrailEndTime(Long lastTrailEndTime) {
            this.lastTrailEndTime = lastTrailEndTime;
            return this;
        }

        /**
         * MVAuthCount.
         */
        public Builder MVAuthCount(Integer MVAuthCount) {
            this.MVAuthCount = MVAuthCount;
            return this;
        }

        /**
         * MVUnusedAuthCount.
         */
        public Builder MVUnusedAuthCount(Integer MVUnusedAuthCount) {
            this.MVUnusedAuthCount = MVUnusedAuthCount;
            return this;
        }

        /**
         * ReleaseTime.
         */
        public Builder releaseTime(Long releaseTime) {
            this.releaseTime = releaseTime;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SasLog.
         */
        public Builder sasLog(Integer sasLog) {
            this.sasLog = sasLog;
            return this;
        }

        /**
         * SasScreen.
         */
        public Builder sasScreen(Integer sasScreen) {
            this.sasScreen = sasScreen;
            return this;
        }

        /**
         * SlsCapacity.
         */
        public Builder slsCapacity(Long slsCapacity) {
            this.slsCapacity = slsCapacity;
            return this;
        }

        /**
         * UserDefinedAlarms.
         */
        public Builder userDefinedAlarms(Integer userDefinedAlarms) {
            this.userDefinedAlarms = userDefinedAlarms;
            return this;
        }

        /**
         * Version.
         */
        public Builder version(Integer version) {
            this.version = version;
            return this;
        }

        /**
         * VmCores.
         */
        public Builder vmCores(Integer vmCores) {
            this.vmCores = vmCores;
            return this;
        }

        /**
         * WebLock.
         */
        public Builder webLock(Integer webLock) {
            this.webLock = webLock;
            return this;
        }

        /**
         * WebLockAuthCount.
         */
        public Builder webLockAuthCount(Long webLockAuthCount) {
            this.webLockAuthCount = webLockAuthCount;
            return this;
        }

        public DescribeVersionConfigResponseBody build() {
            return new DescribeVersionConfigResponseBody(this);
        } 

    } 

}
