// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.riskmanagement20260424.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeVersionConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVersionConfigResponseBody</p>
 */
public class DescribeVersionConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeVersionConfigResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVersionConfigResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(DescribeVersionConfigResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeVersionConfigResponseBody build() {
            return new DescribeVersionConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeVersionConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVersionConfigResponseBody</p>
     */
    public static class DataBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgentlessCapacity")
        private Long agentlessCapacity;

        @com.aliyun.core.annotation.NameInMap("AllowPartialBuy")
        private Integer allowPartialBuy;

        @com.aliyun.core.annotation.NameInMap("AntiRansomwareCapacity")
        private Integer antiRansomwareCapacity;

        @com.aliyun.core.annotation.NameInMap("AntiRansomwareService")
        private Integer antiRansomwareService;

        @com.aliyun.core.annotation.NameInMap("AppWhiteList")
        private Integer appWhiteList;

        @com.aliyun.core.annotation.NameInMap("AppWhiteListAuthCount")
        private Long appWhiteListAuthCount;

        @com.aliyun.core.annotation.NameInMap("AssetLevel")
        private Integer assetLevel;

        @com.aliyun.core.annotation.NameInMap("CanTryPostPaidPackage")
        private Integer canTryPostPaidPackage;

        @com.aliyun.core.annotation.NameInMap("CspmCapacity")
        private Long cspmCapacity;

        @com.aliyun.core.annotation.NameInMap("HighestVersion")
        private Integer highestVersion;

        @com.aliyun.core.annotation.NameInMap("HoneypotCapacity")
        private Long honeypotCapacity;

        @com.aliyun.core.annotation.NameInMap("ImageScanCapacity")
        private Long imageScanCapacity;

        @com.aliyun.core.annotation.NameInMap("InstanceBuyType")
        private Integer instanceBuyType;

        @com.aliyun.core.annotation.NameInMap("IntelligentAnalysisFlow")
        private Integer intelligentAnalysisFlow;

        @com.aliyun.core.annotation.NameInMap("IsNewContainerVersion")
        private Boolean isNewContainerVersion;

        @com.aliyun.core.annotation.NameInMap("IsNewMultiVersion")
        private Boolean isNewMultiVersion;

        @com.aliyun.core.annotation.NameInMap("IsOverBalance")
        private Boolean isOverBalance;

        @com.aliyun.core.annotation.NameInMap("IsPostpay")
        private Boolean isPostpay;

        @com.aliyun.core.annotation.NameInMap("IsTrialVersion")
        private Integer isTrialVersion;

        @com.aliyun.core.annotation.NameInMap("LastTrailEndTime")
        private Long lastTrailEndTime;

        @com.aliyun.core.annotation.NameInMap("MergedVersion")
        private Integer mergedVersion;

        @com.aliyun.core.annotation.NameInMap("MultiVersion")
        private String multiVersion;

        @com.aliyun.core.annotation.NameInMap("MvAuthCount")
        private Integer mvAuthCount;

        @com.aliyun.core.annotation.NameInMap("MvUnusedAuthCount")
        private Integer mvUnusedAuthCount;

        @com.aliyun.core.annotation.NameInMap("NewThreatAnalysis")
        private Integer newThreatAnalysis;

        @com.aliyun.core.annotation.NameInMap("OnboardedAssets")
        private Integer onboardedAssets;

        @com.aliyun.core.annotation.NameInMap("OpenTime")
        private Long openTime;

        @com.aliyun.core.annotation.NameInMap("PostPayHostVersion")
        private Integer postPayHostVersion;

        @com.aliyun.core.annotation.NameInMap("PostPayInstanceId")
        private String postPayInstanceId;

        @com.aliyun.core.annotation.NameInMap("PostPayModuleSwitch")
        private String postPayModuleSwitch;

        @com.aliyun.core.annotation.NameInMap("PostPayOpenTime")
        private Long postPayOpenTime;

        @com.aliyun.core.annotation.NameInMap("PostPayStatus")
        private Integer postPayStatus;

        @com.aliyun.core.annotation.NameInMap("RaspCapacity")
        private Long raspCapacity;

        @com.aliyun.core.annotation.NameInMap("ReleaseTime")
        private Long releaseTime;

        @com.aliyun.core.annotation.NameInMap("RequestId")
        private String requestId;

        @com.aliyun.core.annotation.NameInMap("SasLog")
        private Integer sasLog;

        @com.aliyun.core.annotation.NameInMap("SasScreen")
        private Integer sasScreen;

        @com.aliyun.core.annotation.NameInMap("SdkCapacity")
        private Long sdkCapacity;

        @com.aliyun.core.annotation.NameInMap("SlsCapacity")
        private Long slsCapacity;

        @com.aliyun.core.annotation.NameInMap("ThreatAnalysisCapacity")
        private Long threatAnalysisCapacity;

        @com.aliyun.core.annotation.NameInMap("ThreatAnalysisFlow")
        private Integer threatAnalysisFlow;

        @com.aliyun.core.annotation.NameInMap("UserDefinedAlarms")
        private Integer userDefinedAlarms;

        @com.aliyun.core.annotation.NameInMap("Version")
        private Integer version;

        @com.aliyun.core.annotation.NameInMap("VmCores")
        private Integer vmCores;

        @com.aliyun.core.annotation.NameInMap("VulFixCapacity")
        private Long vulFixCapacity;

        @com.aliyun.core.annotation.NameInMap("WebLock")
        private Integer webLock;

        @com.aliyun.core.annotation.NameInMap("WebLockAuthCount")
        private Long webLockAuthCount;

        private DataBody(Builder builder) {
            this.agentlessCapacity = builder.agentlessCapacity;
            this.allowPartialBuy = builder.allowPartialBuy;
            this.antiRansomwareCapacity = builder.antiRansomwareCapacity;
            this.antiRansomwareService = builder.antiRansomwareService;
            this.appWhiteList = builder.appWhiteList;
            this.appWhiteListAuthCount = builder.appWhiteListAuthCount;
            this.assetLevel = builder.assetLevel;
            this.canTryPostPaidPackage = builder.canTryPostPaidPackage;
            this.cspmCapacity = builder.cspmCapacity;
            this.highestVersion = builder.highestVersion;
            this.honeypotCapacity = builder.honeypotCapacity;
            this.imageScanCapacity = builder.imageScanCapacity;
            this.instanceBuyType = builder.instanceBuyType;
            this.intelligentAnalysisFlow = builder.intelligentAnalysisFlow;
            this.isNewContainerVersion = builder.isNewContainerVersion;
            this.isNewMultiVersion = builder.isNewMultiVersion;
            this.isOverBalance = builder.isOverBalance;
            this.isPostpay = builder.isPostpay;
            this.isTrialVersion = builder.isTrialVersion;
            this.lastTrailEndTime = builder.lastTrailEndTime;
            this.mergedVersion = builder.mergedVersion;
            this.multiVersion = builder.multiVersion;
            this.mvAuthCount = builder.mvAuthCount;
            this.mvUnusedAuthCount = builder.mvUnusedAuthCount;
            this.newThreatAnalysis = builder.newThreatAnalysis;
            this.onboardedAssets = builder.onboardedAssets;
            this.openTime = builder.openTime;
            this.postPayHostVersion = builder.postPayHostVersion;
            this.postPayInstanceId = builder.postPayInstanceId;
            this.postPayModuleSwitch = builder.postPayModuleSwitch;
            this.postPayOpenTime = builder.postPayOpenTime;
            this.postPayStatus = builder.postPayStatus;
            this.raspCapacity = builder.raspCapacity;
            this.releaseTime = builder.releaseTime;
            this.requestId = builder.requestId;
            this.sasLog = builder.sasLog;
            this.sasScreen = builder.sasScreen;
            this.sdkCapacity = builder.sdkCapacity;
            this.slsCapacity = builder.slsCapacity;
            this.threatAnalysisCapacity = builder.threatAnalysisCapacity;
            this.threatAnalysisFlow = builder.threatAnalysisFlow;
            this.userDefinedAlarms = builder.userDefinedAlarms;
            this.version = builder.version;
            this.vmCores = builder.vmCores;
            this.vulFixCapacity = builder.vulFixCapacity;
            this.webLock = builder.webLock;
            this.webLockAuthCount = builder.webLockAuthCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataBody create() {
            return builder().build();
        }

        /**
         * @return agentlessCapacity
         */
        public Long getAgentlessCapacity() {
            return this.agentlessCapacity;
        }

        /**
         * @return allowPartialBuy
         */
        public Integer getAllowPartialBuy() {
            return this.allowPartialBuy;
        }

        /**
         * @return antiRansomwareCapacity
         */
        public Integer getAntiRansomwareCapacity() {
            return this.antiRansomwareCapacity;
        }

        /**
         * @return antiRansomwareService
         */
        public Integer getAntiRansomwareService() {
            return this.antiRansomwareService;
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
         * @return canTryPostPaidPackage
         */
        public Integer getCanTryPostPaidPackage() {
            return this.canTryPostPaidPackage;
        }

        /**
         * @return cspmCapacity
         */
        public Long getCspmCapacity() {
            return this.cspmCapacity;
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
         * @return instanceBuyType
         */
        public Integer getInstanceBuyType() {
            return this.instanceBuyType;
        }

        /**
         * @return intelligentAnalysisFlow
         */
        public Integer getIntelligentAnalysisFlow() {
            return this.intelligentAnalysisFlow;
        }

        /**
         * @return isNewContainerVersion
         */
        public Boolean getIsNewContainerVersion() {
            return this.isNewContainerVersion;
        }

        /**
         * @return isNewMultiVersion
         */
        public Boolean getIsNewMultiVersion() {
            return this.isNewMultiVersion;
        }

        /**
         * @return isOverBalance
         */
        public Boolean getIsOverBalance() {
            return this.isOverBalance;
        }

        /**
         * @return isPostpay
         */
        public Boolean getIsPostpay() {
            return this.isPostpay;
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
         * @return mergedVersion
         */
        public Integer getMergedVersion() {
            return this.mergedVersion;
        }

        /**
         * @return multiVersion
         */
        public String getMultiVersion() {
            return this.multiVersion;
        }

        /**
         * @return mvAuthCount
         */
        public Integer getMvAuthCount() {
            return this.mvAuthCount;
        }

        /**
         * @return mvUnusedAuthCount
         */
        public Integer getMvUnusedAuthCount() {
            return this.mvUnusedAuthCount;
        }

        /**
         * @return newThreatAnalysis
         */
        public Integer getNewThreatAnalysis() {
            return this.newThreatAnalysis;
        }

        /**
         * @return onboardedAssets
         */
        public Integer getOnboardedAssets() {
            return this.onboardedAssets;
        }

        /**
         * @return openTime
         */
        public Long getOpenTime() {
            return this.openTime;
        }

        /**
         * @return postPayHostVersion
         */
        public Integer getPostPayHostVersion() {
            return this.postPayHostVersion;
        }

        /**
         * @return postPayInstanceId
         */
        public String getPostPayInstanceId() {
            return this.postPayInstanceId;
        }

        /**
         * @return postPayModuleSwitch
         */
        public String getPostPayModuleSwitch() {
            return this.postPayModuleSwitch;
        }

        /**
         * @return postPayOpenTime
         */
        public Long getPostPayOpenTime() {
            return this.postPayOpenTime;
        }

        /**
         * @return postPayStatus
         */
        public Integer getPostPayStatus() {
            return this.postPayStatus;
        }

        /**
         * @return raspCapacity
         */
        public Long getRaspCapacity() {
            return this.raspCapacity;
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
         * @return sdkCapacity
         */
        public Long getSdkCapacity() {
            return this.sdkCapacity;
        }

        /**
         * @return slsCapacity
         */
        public Long getSlsCapacity() {
            return this.slsCapacity;
        }

        /**
         * @return threatAnalysisCapacity
         */
        public Long getThreatAnalysisCapacity() {
            return this.threatAnalysisCapacity;
        }

        /**
         * @return threatAnalysisFlow
         */
        public Integer getThreatAnalysisFlow() {
            return this.threatAnalysisFlow;
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
         * @return vulFixCapacity
         */
        public Long getVulFixCapacity() {
            return this.vulFixCapacity;
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
            private Long agentlessCapacity; 
            private Integer allowPartialBuy; 
            private Integer antiRansomwareCapacity; 
            private Integer antiRansomwareService; 
            private Integer appWhiteList; 
            private Long appWhiteListAuthCount; 
            private Integer assetLevel; 
            private Integer canTryPostPaidPackage; 
            private Long cspmCapacity; 
            private Integer highestVersion; 
            private Long honeypotCapacity; 
            private Long imageScanCapacity; 
            private Integer instanceBuyType; 
            private Integer intelligentAnalysisFlow; 
            private Boolean isNewContainerVersion; 
            private Boolean isNewMultiVersion; 
            private Boolean isOverBalance; 
            private Boolean isPostpay; 
            private Integer isTrialVersion; 
            private Long lastTrailEndTime; 
            private Integer mergedVersion; 
            private String multiVersion; 
            private Integer mvAuthCount; 
            private Integer mvUnusedAuthCount; 
            private Integer newThreatAnalysis; 
            private Integer onboardedAssets; 
            private Long openTime; 
            private Integer postPayHostVersion; 
            private String postPayInstanceId; 
            private String postPayModuleSwitch; 
            private Long postPayOpenTime; 
            private Integer postPayStatus; 
            private Long raspCapacity; 
            private Long releaseTime; 
            private String requestId; 
            private Integer sasLog; 
            private Integer sasScreen; 
            private Long sdkCapacity; 
            private Long slsCapacity; 
            private Long threatAnalysisCapacity; 
            private Integer threatAnalysisFlow; 
            private Integer userDefinedAlarms; 
            private Integer version; 
            private Integer vmCores; 
            private Long vulFixCapacity; 
            private Integer webLock; 
            private Long webLockAuthCount; 

            private Builder() {
            } 

            private Builder(DataBody model) {
                this.agentlessCapacity = model.agentlessCapacity;
                this.allowPartialBuy = model.allowPartialBuy;
                this.antiRansomwareCapacity = model.antiRansomwareCapacity;
                this.antiRansomwareService = model.antiRansomwareService;
                this.appWhiteList = model.appWhiteList;
                this.appWhiteListAuthCount = model.appWhiteListAuthCount;
                this.assetLevel = model.assetLevel;
                this.canTryPostPaidPackage = model.canTryPostPaidPackage;
                this.cspmCapacity = model.cspmCapacity;
                this.highestVersion = model.highestVersion;
                this.honeypotCapacity = model.honeypotCapacity;
                this.imageScanCapacity = model.imageScanCapacity;
                this.instanceBuyType = model.instanceBuyType;
                this.intelligentAnalysisFlow = model.intelligentAnalysisFlow;
                this.isNewContainerVersion = model.isNewContainerVersion;
                this.isNewMultiVersion = model.isNewMultiVersion;
                this.isOverBalance = model.isOverBalance;
                this.isPostpay = model.isPostpay;
                this.isTrialVersion = model.isTrialVersion;
                this.lastTrailEndTime = model.lastTrailEndTime;
                this.mergedVersion = model.mergedVersion;
                this.multiVersion = model.multiVersion;
                this.mvAuthCount = model.mvAuthCount;
                this.mvUnusedAuthCount = model.mvUnusedAuthCount;
                this.newThreatAnalysis = model.newThreatAnalysis;
                this.onboardedAssets = model.onboardedAssets;
                this.openTime = model.openTime;
                this.postPayHostVersion = model.postPayHostVersion;
                this.postPayInstanceId = model.postPayInstanceId;
                this.postPayModuleSwitch = model.postPayModuleSwitch;
                this.postPayOpenTime = model.postPayOpenTime;
                this.postPayStatus = model.postPayStatus;
                this.raspCapacity = model.raspCapacity;
                this.releaseTime = model.releaseTime;
                this.requestId = model.requestId;
                this.sasLog = model.sasLog;
                this.sasScreen = model.sasScreen;
                this.sdkCapacity = model.sdkCapacity;
                this.slsCapacity = model.slsCapacity;
                this.threatAnalysisCapacity = model.threatAnalysisCapacity;
                this.threatAnalysisFlow = model.threatAnalysisFlow;
                this.userDefinedAlarms = model.userDefinedAlarms;
                this.version = model.version;
                this.vmCores = model.vmCores;
                this.vulFixCapacity = model.vulFixCapacity;
                this.webLock = model.webLock;
                this.webLockAuthCount = model.webLockAuthCount;
            } 

            /**
             * AgentlessCapacity.
             */
            public Builder agentlessCapacity(Long agentlessCapacity) {
                this.agentlessCapacity = agentlessCapacity;
                return this;
            }

            /**
             * AllowPartialBuy.
             */
            public Builder allowPartialBuy(Integer allowPartialBuy) {
                this.allowPartialBuy = allowPartialBuy;
                return this;
            }

            /**
             * AntiRansomwareCapacity.
             */
            public Builder antiRansomwareCapacity(Integer antiRansomwareCapacity) {
                this.antiRansomwareCapacity = antiRansomwareCapacity;
                return this;
            }

            /**
             * AntiRansomwareService.
             */
            public Builder antiRansomwareService(Integer antiRansomwareService) {
                this.antiRansomwareService = antiRansomwareService;
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
             * CanTryPostPaidPackage.
             */
            public Builder canTryPostPaidPackage(Integer canTryPostPaidPackage) {
                this.canTryPostPaidPackage = canTryPostPaidPackage;
                return this;
            }

            /**
             * CspmCapacity.
             */
            public Builder cspmCapacity(Long cspmCapacity) {
                this.cspmCapacity = cspmCapacity;
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
             * InstanceBuyType.
             */
            public Builder instanceBuyType(Integer instanceBuyType) {
                this.instanceBuyType = instanceBuyType;
                return this;
            }

            /**
             * IntelligentAnalysisFlow.
             */
            public Builder intelligentAnalysisFlow(Integer intelligentAnalysisFlow) {
                this.intelligentAnalysisFlow = intelligentAnalysisFlow;
                return this;
            }

            /**
             * IsNewContainerVersion.
             */
            public Builder isNewContainerVersion(Boolean isNewContainerVersion) {
                this.isNewContainerVersion = isNewContainerVersion;
                return this;
            }

            /**
             * IsNewMultiVersion.
             */
            public Builder isNewMultiVersion(Boolean isNewMultiVersion) {
                this.isNewMultiVersion = isNewMultiVersion;
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
             * IsPostpay.
             */
            public Builder isPostpay(Boolean isPostpay) {
                this.isPostpay = isPostpay;
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
             * MergedVersion.
             */
            public Builder mergedVersion(Integer mergedVersion) {
                this.mergedVersion = mergedVersion;
                return this;
            }

            /**
             * MultiVersion.
             */
            public Builder multiVersion(String multiVersion) {
                this.multiVersion = multiVersion;
                return this;
            }

            /**
             * MvAuthCount.
             */
            public Builder mvAuthCount(Integer mvAuthCount) {
                this.mvAuthCount = mvAuthCount;
                return this;
            }

            /**
             * MvUnusedAuthCount.
             */
            public Builder mvUnusedAuthCount(Integer mvUnusedAuthCount) {
                this.mvUnusedAuthCount = mvUnusedAuthCount;
                return this;
            }

            /**
             * NewThreatAnalysis.
             */
            public Builder newThreatAnalysis(Integer newThreatAnalysis) {
                this.newThreatAnalysis = newThreatAnalysis;
                return this;
            }

            /**
             * OnboardedAssets.
             */
            public Builder onboardedAssets(Integer onboardedAssets) {
                this.onboardedAssets = onboardedAssets;
                return this;
            }

            /**
             * OpenTime.
             */
            public Builder openTime(Long openTime) {
                this.openTime = openTime;
                return this;
            }

            /**
             * PostPayHostVersion.
             */
            public Builder postPayHostVersion(Integer postPayHostVersion) {
                this.postPayHostVersion = postPayHostVersion;
                return this;
            }

            /**
             * PostPayInstanceId.
             */
            public Builder postPayInstanceId(String postPayInstanceId) {
                this.postPayInstanceId = postPayInstanceId;
                return this;
            }

            /**
             * PostPayModuleSwitch.
             */
            public Builder postPayModuleSwitch(String postPayModuleSwitch) {
                this.postPayModuleSwitch = postPayModuleSwitch;
                return this;
            }

            /**
             * PostPayOpenTime.
             */
            public Builder postPayOpenTime(Long postPayOpenTime) {
                this.postPayOpenTime = postPayOpenTime;
                return this;
            }

            /**
             * PostPayStatus.
             */
            public Builder postPayStatus(Integer postPayStatus) {
                this.postPayStatus = postPayStatus;
                return this;
            }

            /**
             * RaspCapacity.
             */
            public Builder raspCapacity(Long raspCapacity) {
                this.raspCapacity = raspCapacity;
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
             * SdkCapacity.
             */
            public Builder sdkCapacity(Long sdkCapacity) {
                this.sdkCapacity = sdkCapacity;
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
             * ThreatAnalysisCapacity.
             */
            public Builder threatAnalysisCapacity(Long threatAnalysisCapacity) {
                this.threatAnalysisCapacity = threatAnalysisCapacity;
                return this;
            }

            /**
             * ThreatAnalysisFlow.
             */
            public Builder threatAnalysisFlow(Integer threatAnalysisFlow) {
                this.threatAnalysisFlow = threatAnalysisFlow;
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
             * VulFixCapacity.
             */
            public Builder vulFixCapacity(Long vulFixCapacity) {
                this.vulFixCapacity = vulFixCapacity;
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

            public DataBody build() {
                return new DataBody(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeVersionConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVersionConfigResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Body")
        private DataBody body;

        private Data(Builder builder) {
            this.body = builder.body;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return body
         */
        public DataBody getBody() {
            return this.body;
        }

        public static final class Builder {
            private DataBody body; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.body = model.body;
            } 

            /**
             * Body.
             */
            public Builder body(DataBody body) {
                this.body = body;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
