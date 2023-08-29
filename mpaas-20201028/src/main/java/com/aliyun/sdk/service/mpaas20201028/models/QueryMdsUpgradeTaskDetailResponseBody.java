// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryMdsUpgradeTaskDetailResponseBody} extends {@link TeaModel}
 *
 * <p>QueryMdsUpgradeTaskDetailResponseBody</p>
 */
public class QueryMdsUpgradeTaskDetailResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ResultCode")
    private String resultCode;

    @NameInMap("ResultContent")
    private ResultContent resultContent;

    @NameInMap("ResultMessage")
    private String resultMessage;

    private QueryMdsUpgradeTaskDetailResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resultCode = builder.resultCode;
        this.resultContent = builder.resultContent;
        this.resultMessage = builder.resultMessage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryMdsUpgradeTaskDetailResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resultCode
     */
    public String getResultCode() {
        return this.resultCode;
    }

    /**
     * @return resultContent
     */
    public ResultContent getResultContent() {
        return this.resultContent;
    }

    /**
     * @return resultMessage
     */
    public String getResultMessage() {
        return this.resultMessage;
    }

    public static final class Builder {
        private String requestId; 
        private String resultCode; 
        private ResultContent resultContent; 
        private String resultMessage; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ResultCode.
         */
        public Builder resultCode(String resultCode) {
            this.resultCode = resultCode;
            return this;
        }

        /**
         * ResultContent.
         */
        public Builder resultContent(ResultContent resultContent) {
            this.resultContent = resultContent;
            return this;
        }

        /**
         * ResultMessage.
         */
        public Builder resultMessage(String resultMessage) {
            this.resultMessage = resultMessage;
            return this;
        }

        public QueryMdsUpgradeTaskDetailResponseBody build() {
            return new QueryMdsUpgradeTaskDetailResponseBody(this);
        } 

    } 

    public static class RuleJsonList extends TeaModel {
        @NameInMap("Operation")
        private String operation;

        @NameInMap("RuleElement")
        private String ruleElement;

        @NameInMap("RuleType")
        private String ruleType;

        @NameInMap("Value")
        private String value;

        private RuleJsonList(Builder builder) {
            this.operation = builder.operation;
            this.ruleElement = builder.ruleElement;
            this.ruleType = builder.ruleType;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RuleJsonList create() {
            return builder().build();
        }

        /**
         * @return operation
         */
        public String getOperation() {
            return this.operation;
        }

        /**
         * @return ruleElement
         */
        public String getRuleElement() {
            return this.ruleElement;
        }

        /**
         * @return ruleType
         */
        public String getRuleType() {
            return this.ruleType;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String operation; 
            private String ruleElement; 
            private String ruleType; 
            private String value; 

            /**
             * Operation.
             */
            public Builder operation(String operation) {
                this.operation = operation;
                return this;
            }

            /**
             * RuleElement.
             */
            public Builder ruleElement(String ruleElement) {
                this.ruleElement = ruleElement;
                return this;
            }

            /**
             * RuleType.
             */
            public Builder ruleType(String ruleType) {
                this.ruleType = ruleType;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public RuleJsonList build() {
                return new RuleJsonList(this);
            } 

        } 

    }
    public static class Whitelist extends TeaModel {
        @NameInMap("AppCode")
        private String appCode;

        @NameInMap("Business")
        private String business;

        @NameInMap("GmtModified")
        private String gmtModified;

        @NameInMap("Id")
        private Long id;

        @NameInMap("IdType")
        private String idType;

        @NameInMap("Platform")
        private String platform;

        @NameInMap("Status")
        private Long status;

        @NameInMap("WhiteListCount")
        private Long whiteListCount;

        @NameInMap("WhiteListName")
        private String whiteListName;

        private Whitelist(Builder builder) {
            this.appCode = builder.appCode;
            this.business = builder.business;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.idType = builder.idType;
            this.platform = builder.platform;
            this.status = builder.status;
            this.whiteListCount = builder.whiteListCount;
            this.whiteListName = builder.whiteListName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Whitelist create() {
            return builder().build();
        }

        /**
         * @return appCode
         */
        public String getAppCode() {
            return this.appCode;
        }

        /**
         * @return business
         */
        public String getBusiness() {
            return this.business;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return idType
         */
        public String getIdType() {
            return this.idType;
        }

        /**
         * @return platform
         */
        public String getPlatform() {
            return this.platform;
        }

        /**
         * @return status
         */
        public Long getStatus() {
            return this.status;
        }

        /**
         * @return whiteListCount
         */
        public Long getWhiteListCount() {
            return this.whiteListCount;
        }

        /**
         * @return whiteListName
         */
        public String getWhiteListName() {
            return this.whiteListName;
        }

        public static final class Builder {
            private String appCode; 
            private String business; 
            private String gmtModified; 
            private Long id; 
            private String idType; 
            private String platform; 
            private Long status; 
            private Long whiteListCount; 
            private String whiteListName; 

            /**
             * AppCode.
             */
            public Builder appCode(String appCode) {
                this.appCode = appCode;
                return this;
            }

            /**
             * Business.
             */
            public Builder business(String business) {
                this.business = business;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
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
             * IdType.
             */
            public Builder idType(String idType) {
                this.idType = idType;
                return this;
            }

            /**
             * Platform.
             */
            public Builder platform(String platform) {
                this.platform = platform;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Long status) {
                this.status = status;
                return this;
            }

            /**
             * WhiteListCount.
             */
            public Builder whiteListCount(Long whiteListCount) {
                this.whiteListCount = whiteListCount;
                return this;
            }

            /**
             * WhiteListName.
             */
            public Builder whiteListName(String whiteListName) {
                this.whiteListName = whiteListName;
                return this;
            }

            public Whitelist build() {
                return new Whitelist(this);
            } 

        } 

    }
    public static class Content extends TeaModel {
        @NameInMap("AppCode")
        private String appCode;

        @NameInMap("AppId")
        private String appId;

        @NameInMap("Appstoreurl")
        private String appstoreurl;

        @NameInMap("ChannelContains")
        private String channelContains;

        @NameInMap("ChannelExcludes")
        private String channelExcludes;

        @NameInMap("CityContains")
        private String cityContains;

        @NameInMap("CityExcludes")
        private String cityExcludes;

        @NameInMap("Creator")
        private String creator;

        @NameInMap("DeviceGreyNum")
        private Long deviceGreyNum;

        @NameInMap("DevicePercent")
        private Long devicePercent;

        @NameInMap("DownloadUrl")
        private String downloadUrl;

        @NameInMap("ExecutionOrder")
        private Long executionOrder;

        @NameInMap("GmtCreateStr")
        private String gmtCreateStr;

        @NameInMap("GreyConfigInfo")
        private String greyConfigInfo;

        @NameInMap("GreyEndtimeData")
        private String greyEndtimeData;

        @NameInMap("GreyNotice")
        private Long greyNotice;

        @NameInMap("GreyNum")
        private Long greyNum;

        @NameInMap("GreyUv")
        private Long greyUv;

        @NameInMap("Id")
        private Long id;

        @NameInMap("InnerVersion")
        private String innerVersion;

        @NameInMap("IsEnterprise")
        private Long isEnterprise;

        @NameInMap("IsOfficial")
        private Long isOfficial;

        @NameInMap("IsPush")
        private Long isPush;

        @NameInMap("IsRc")
        private Long isRc;

        @NameInMap("IsRelease")
        private Long isRelease;

        @NameInMap("Memo")
        private String memo;

        @NameInMap("MobileModelContains")
        private String mobileModelContains;

        @NameInMap("MobileModelExcludes")
        private String mobileModelExcludes;

        @NameInMap("Modifier")
        private String modifier;

        @NameInMap("NetType")
        private String netType;

        @NameInMap("OsVersion")
        private String osVersion;

        @NameInMap("PackageInfoId")
        private Long packageInfoId;

        @NameInMap("PackageType")
        private String packageType;

        @NameInMap("Platform")
        private String platform;

        @NameInMap("ProductId")
        private String productId;

        @NameInMap("ProductVersion")
        private String productVersion;

        @NameInMap("PublishMode")
        private Long publishMode;

        @NameInMap("PublishType")
        private Long publishType;

        @NameInMap("PushContent")
        private String pushContent;

        @NameInMap("QrcodeUrl")
        private String qrcodeUrl;

        @NameInMap("ReleaseType")
        private String releaseType;

        @NameInMap("RuleJsonList")
        private java.util.List < RuleJsonList> ruleJsonList;

        @NameInMap("SilentType")
        private Long silentType;

        @NameInMap("SyncMode")
        private String syncMode;

        @NameInMap("SyncResult")
        private String syncResult;

        @NameInMap("TaskStatus")
        private Long taskStatus;

        @NameInMap("UpgradeContent")
        private String upgradeContent;

        @NameInMap("UpgradeType")
        private Long upgradeType;

        @NameInMap("UpgradeValidTime")
        private Long upgradeValidTime;

        @NameInMap("Whitelist")
        private java.util.List < Whitelist> whitelist;

        @NameInMap("WhitelistIds")
        private String whitelistIds;

        private Content(Builder builder) {
            this.appCode = builder.appCode;
            this.appId = builder.appId;
            this.appstoreurl = builder.appstoreurl;
            this.channelContains = builder.channelContains;
            this.channelExcludes = builder.channelExcludes;
            this.cityContains = builder.cityContains;
            this.cityExcludes = builder.cityExcludes;
            this.creator = builder.creator;
            this.deviceGreyNum = builder.deviceGreyNum;
            this.devicePercent = builder.devicePercent;
            this.downloadUrl = builder.downloadUrl;
            this.executionOrder = builder.executionOrder;
            this.gmtCreateStr = builder.gmtCreateStr;
            this.greyConfigInfo = builder.greyConfigInfo;
            this.greyEndtimeData = builder.greyEndtimeData;
            this.greyNotice = builder.greyNotice;
            this.greyNum = builder.greyNum;
            this.greyUv = builder.greyUv;
            this.id = builder.id;
            this.innerVersion = builder.innerVersion;
            this.isEnterprise = builder.isEnterprise;
            this.isOfficial = builder.isOfficial;
            this.isPush = builder.isPush;
            this.isRc = builder.isRc;
            this.isRelease = builder.isRelease;
            this.memo = builder.memo;
            this.mobileModelContains = builder.mobileModelContains;
            this.mobileModelExcludes = builder.mobileModelExcludes;
            this.modifier = builder.modifier;
            this.netType = builder.netType;
            this.osVersion = builder.osVersion;
            this.packageInfoId = builder.packageInfoId;
            this.packageType = builder.packageType;
            this.platform = builder.platform;
            this.productId = builder.productId;
            this.productVersion = builder.productVersion;
            this.publishMode = builder.publishMode;
            this.publishType = builder.publishType;
            this.pushContent = builder.pushContent;
            this.qrcodeUrl = builder.qrcodeUrl;
            this.releaseType = builder.releaseType;
            this.ruleJsonList = builder.ruleJsonList;
            this.silentType = builder.silentType;
            this.syncMode = builder.syncMode;
            this.syncResult = builder.syncResult;
            this.taskStatus = builder.taskStatus;
            this.upgradeContent = builder.upgradeContent;
            this.upgradeType = builder.upgradeType;
            this.upgradeValidTime = builder.upgradeValidTime;
            this.whitelist = builder.whitelist;
            this.whitelistIds = builder.whitelistIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Content create() {
            return builder().build();
        }

        /**
         * @return appCode
         */
        public String getAppCode() {
            return this.appCode;
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return appstoreurl
         */
        public String getAppstoreurl() {
            return this.appstoreurl;
        }

        /**
         * @return channelContains
         */
        public String getChannelContains() {
            return this.channelContains;
        }

        /**
         * @return channelExcludes
         */
        public String getChannelExcludes() {
            return this.channelExcludes;
        }

        /**
         * @return cityContains
         */
        public String getCityContains() {
            return this.cityContains;
        }

        /**
         * @return cityExcludes
         */
        public String getCityExcludes() {
            return this.cityExcludes;
        }

        /**
         * @return creator
         */
        public String getCreator() {
            return this.creator;
        }

        /**
         * @return deviceGreyNum
         */
        public Long getDeviceGreyNum() {
            return this.deviceGreyNum;
        }

        /**
         * @return devicePercent
         */
        public Long getDevicePercent() {
            return this.devicePercent;
        }

        /**
         * @return downloadUrl
         */
        public String getDownloadUrl() {
            return this.downloadUrl;
        }

        /**
         * @return executionOrder
         */
        public Long getExecutionOrder() {
            return this.executionOrder;
        }

        /**
         * @return gmtCreateStr
         */
        public String getGmtCreateStr() {
            return this.gmtCreateStr;
        }

        /**
         * @return greyConfigInfo
         */
        public String getGreyConfigInfo() {
            return this.greyConfigInfo;
        }

        /**
         * @return greyEndtimeData
         */
        public String getGreyEndtimeData() {
            return this.greyEndtimeData;
        }

        /**
         * @return greyNotice
         */
        public Long getGreyNotice() {
            return this.greyNotice;
        }

        /**
         * @return greyNum
         */
        public Long getGreyNum() {
            return this.greyNum;
        }

        /**
         * @return greyUv
         */
        public Long getGreyUv() {
            return this.greyUv;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return innerVersion
         */
        public String getInnerVersion() {
            return this.innerVersion;
        }

        /**
         * @return isEnterprise
         */
        public Long getIsEnterprise() {
            return this.isEnterprise;
        }

        /**
         * @return isOfficial
         */
        public Long getIsOfficial() {
            return this.isOfficial;
        }

        /**
         * @return isPush
         */
        public Long getIsPush() {
            return this.isPush;
        }

        /**
         * @return isRc
         */
        public Long getIsRc() {
            return this.isRc;
        }

        /**
         * @return isRelease
         */
        public Long getIsRelease() {
            return this.isRelease;
        }

        /**
         * @return memo
         */
        public String getMemo() {
            return this.memo;
        }

        /**
         * @return mobileModelContains
         */
        public String getMobileModelContains() {
            return this.mobileModelContains;
        }

        /**
         * @return mobileModelExcludes
         */
        public String getMobileModelExcludes() {
            return this.mobileModelExcludes;
        }

        /**
         * @return modifier
         */
        public String getModifier() {
            return this.modifier;
        }

        /**
         * @return netType
         */
        public String getNetType() {
            return this.netType;
        }

        /**
         * @return osVersion
         */
        public String getOsVersion() {
            return this.osVersion;
        }

        /**
         * @return packageInfoId
         */
        public Long getPackageInfoId() {
            return this.packageInfoId;
        }

        /**
         * @return packageType
         */
        public String getPackageType() {
            return this.packageType;
        }

        /**
         * @return platform
         */
        public String getPlatform() {
            return this.platform;
        }

        /**
         * @return productId
         */
        public String getProductId() {
            return this.productId;
        }

        /**
         * @return productVersion
         */
        public String getProductVersion() {
            return this.productVersion;
        }

        /**
         * @return publishMode
         */
        public Long getPublishMode() {
            return this.publishMode;
        }

        /**
         * @return publishType
         */
        public Long getPublishType() {
            return this.publishType;
        }

        /**
         * @return pushContent
         */
        public String getPushContent() {
            return this.pushContent;
        }

        /**
         * @return qrcodeUrl
         */
        public String getQrcodeUrl() {
            return this.qrcodeUrl;
        }

        /**
         * @return releaseType
         */
        public String getReleaseType() {
            return this.releaseType;
        }

        /**
         * @return ruleJsonList
         */
        public java.util.List < RuleJsonList> getRuleJsonList() {
            return this.ruleJsonList;
        }

        /**
         * @return silentType
         */
        public Long getSilentType() {
            return this.silentType;
        }

        /**
         * @return syncMode
         */
        public String getSyncMode() {
            return this.syncMode;
        }

        /**
         * @return syncResult
         */
        public String getSyncResult() {
            return this.syncResult;
        }

        /**
         * @return taskStatus
         */
        public Long getTaskStatus() {
            return this.taskStatus;
        }

        /**
         * @return upgradeContent
         */
        public String getUpgradeContent() {
            return this.upgradeContent;
        }

        /**
         * @return upgradeType
         */
        public Long getUpgradeType() {
            return this.upgradeType;
        }

        /**
         * @return upgradeValidTime
         */
        public Long getUpgradeValidTime() {
            return this.upgradeValidTime;
        }

        /**
         * @return whitelist
         */
        public java.util.List < Whitelist> getWhitelist() {
            return this.whitelist;
        }

        /**
         * @return whitelistIds
         */
        public String getWhitelistIds() {
            return this.whitelistIds;
        }

        public static final class Builder {
            private String appCode; 
            private String appId; 
            private String appstoreurl; 
            private String channelContains; 
            private String channelExcludes; 
            private String cityContains; 
            private String cityExcludes; 
            private String creator; 
            private Long deviceGreyNum; 
            private Long devicePercent; 
            private String downloadUrl; 
            private Long executionOrder; 
            private String gmtCreateStr; 
            private String greyConfigInfo; 
            private String greyEndtimeData; 
            private Long greyNotice; 
            private Long greyNum; 
            private Long greyUv; 
            private Long id; 
            private String innerVersion; 
            private Long isEnterprise; 
            private Long isOfficial; 
            private Long isPush; 
            private Long isRc; 
            private Long isRelease; 
            private String memo; 
            private String mobileModelContains; 
            private String mobileModelExcludes; 
            private String modifier; 
            private String netType; 
            private String osVersion; 
            private Long packageInfoId; 
            private String packageType; 
            private String platform; 
            private String productId; 
            private String productVersion; 
            private Long publishMode; 
            private Long publishType; 
            private String pushContent; 
            private String qrcodeUrl; 
            private String releaseType; 
            private java.util.List < RuleJsonList> ruleJsonList; 
            private Long silentType; 
            private String syncMode; 
            private String syncResult; 
            private Long taskStatus; 
            private String upgradeContent; 
            private Long upgradeType; 
            private Long upgradeValidTime; 
            private java.util.List < Whitelist> whitelist; 
            private String whitelistIds; 

            /**
             * AppCode.
             */
            public Builder appCode(String appCode) {
                this.appCode = appCode;
                return this;
            }

            /**
             * AppId.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * Appstoreurl.
             */
            public Builder appstoreurl(String appstoreurl) {
                this.appstoreurl = appstoreurl;
                return this;
            }

            /**
             * ChannelContains.
             */
            public Builder channelContains(String channelContains) {
                this.channelContains = channelContains;
                return this;
            }

            /**
             * ChannelExcludes.
             */
            public Builder channelExcludes(String channelExcludes) {
                this.channelExcludes = channelExcludes;
                return this;
            }

            /**
             * CityContains.
             */
            public Builder cityContains(String cityContains) {
                this.cityContains = cityContains;
                return this;
            }

            /**
             * CityExcludes.
             */
            public Builder cityExcludes(String cityExcludes) {
                this.cityExcludes = cityExcludes;
                return this;
            }

            /**
             * Creator.
             */
            public Builder creator(String creator) {
                this.creator = creator;
                return this;
            }

            /**
             * DeviceGreyNum.
             */
            public Builder deviceGreyNum(Long deviceGreyNum) {
                this.deviceGreyNum = deviceGreyNum;
                return this;
            }

            /**
             * DevicePercent.
             */
            public Builder devicePercent(Long devicePercent) {
                this.devicePercent = devicePercent;
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
             * ExecutionOrder.
             */
            public Builder executionOrder(Long executionOrder) {
                this.executionOrder = executionOrder;
                return this;
            }

            /**
             * GmtCreateStr.
             */
            public Builder gmtCreateStr(String gmtCreateStr) {
                this.gmtCreateStr = gmtCreateStr;
                return this;
            }

            /**
             * GreyConfigInfo.
             */
            public Builder greyConfigInfo(String greyConfigInfo) {
                this.greyConfigInfo = greyConfigInfo;
                return this;
            }

            /**
             * GreyEndtimeData.
             */
            public Builder greyEndtimeData(String greyEndtimeData) {
                this.greyEndtimeData = greyEndtimeData;
                return this;
            }

            /**
             * GreyNotice.
             */
            public Builder greyNotice(Long greyNotice) {
                this.greyNotice = greyNotice;
                return this;
            }

            /**
             * GreyNum.
             */
            public Builder greyNum(Long greyNum) {
                this.greyNum = greyNum;
                return this;
            }

            /**
             * GreyUv.
             */
            public Builder greyUv(Long greyUv) {
                this.greyUv = greyUv;
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
             * InnerVersion.
             */
            public Builder innerVersion(String innerVersion) {
                this.innerVersion = innerVersion;
                return this;
            }

            /**
             * IsEnterprise.
             */
            public Builder isEnterprise(Long isEnterprise) {
                this.isEnterprise = isEnterprise;
                return this;
            }

            /**
             * IsOfficial.
             */
            public Builder isOfficial(Long isOfficial) {
                this.isOfficial = isOfficial;
                return this;
            }

            /**
             * IsPush.
             */
            public Builder isPush(Long isPush) {
                this.isPush = isPush;
                return this;
            }

            /**
             * IsRc.
             */
            public Builder isRc(Long isRc) {
                this.isRc = isRc;
                return this;
            }

            /**
             * IsRelease.
             */
            public Builder isRelease(Long isRelease) {
                this.isRelease = isRelease;
                return this;
            }

            /**
             * Memo.
             */
            public Builder memo(String memo) {
                this.memo = memo;
                return this;
            }

            /**
             * MobileModelContains.
             */
            public Builder mobileModelContains(String mobileModelContains) {
                this.mobileModelContains = mobileModelContains;
                return this;
            }

            /**
             * MobileModelExcludes.
             */
            public Builder mobileModelExcludes(String mobileModelExcludes) {
                this.mobileModelExcludes = mobileModelExcludes;
                return this;
            }

            /**
             * Modifier.
             */
            public Builder modifier(String modifier) {
                this.modifier = modifier;
                return this;
            }

            /**
             * NetType.
             */
            public Builder netType(String netType) {
                this.netType = netType;
                return this;
            }

            /**
             * OsVersion.
             */
            public Builder osVersion(String osVersion) {
                this.osVersion = osVersion;
                return this;
            }

            /**
             * PackageInfoId.
             */
            public Builder packageInfoId(Long packageInfoId) {
                this.packageInfoId = packageInfoId;
                return this;
            }

            /**
             * PackageType.
             */
            public Builder packageType(String packageType) {
                this.packageType = packageType;
                return this;
            }

            /**
             * Platform.
             */
            public Builder platform(String platform) {
                this.platform = platform;
                return this;
            }

            /**
             * ProductId.
             */
            public Builder productId(String productId) {
                this.productId = productId;
                return this;
            }

            /**
             * ProductVersion.
             */
            public Builder productVersion(String productVersion) {
                this.productVersion = productVersion;
                return this;
            }

            /**
             * PublishMode.
             */
            public Builder publishMode(Long publishMode) {
                this.publishMode = publishMode;
                return this;
            }

            /**
             * PublishType.
             */
            public Builder publishType(Long publishType) {
                this.publishType = publishType;
                return this;
            }

            /**
             * PushContent.
             */
            public Builder pushContent(String pushContent) {
                this.pushContent = pushContent;
                return this;
            }

            /**
             * QrcodeUrl.
             */
            public Builder qrcodeUrl(String qrcodeUrl) {
                this.qrcodeUrl = qrcodeUrl;
                return this;
            }

            /**
             * ReleaseType.
             */
            public Builder releaseType(String releaseType) {
                this.releaseType = releaseType;
                return this;
            }

            /**
             * RuleJsonList.
             */
            public Builder ruleJsonList(java.util.List < RuleJsonList> ruleJsonList) {
                this.ruleJsonList = ruleJsonList;
                return this;
            }

            /**
             * SilentType.
             */
            public Builder silentType(Long silentType) {
                this.silentType = silentType;
                return this;
            }

            /**
             * SyncMode.
             */
            public Builder syncMode(String syncMode) {
                this.syncMode = syncMode;
                return this;
            }

            /**
             * SyncResult.
             */
            public Builder syncResult(String syncResult) {
                this.syncResult = syncResult;
                return this;
            }

            /**
             * TaskStatus.
             */
            public Builder taskStatus(Long taskStatus) {
                this.taskStatus = taskStatus;
                return this;
            }

            /**
             * UpgradeContent.
             */
            public Builder upgradeContent(String upgradeContent) {
                this.upgradeContent = upgradeContent;
                return this;
            }

            /**
             * UpgradeType.
             */
            public Builder upgradeType(Long upgradeType) {
                this.upgradeType = upgradeType;
                return this;
            }

            /**
             * UpgradeValidTime.
             */
            public Builder upgradeValidTime(Long upgradeValidTime) {
                this.upgradeValidTime = upgradeValidTime;
                return this;
            }

            /**
             * Whitelist.
             */
            public Builder whitelist(java.util.List < Whitelist> whitelist) {
                this.whitelist = whitelist;
                return this;
            }

            /**
             * WhitelistIds.
             */
            public Builder whitelistIds(String whitelistIds) {
                this.whitelistIds = whitelistIds;
                return this;
            }

            public Content build() {
                return new Content(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("Content")
        private Content content;

        @NameInMap("ErrorCode")
        private String errorCode;

        @NameInMap("RequestId")
        private String requestId;

        @NameInMap("ResultMsg")
        private String resultMsg;

        @NameInMap("Success")
        private Boolean success;

        private Data(Builder builder) {
            this.content = builder.content;
            this.errorCode = builder.errorCode;
            this.requestId = builder.requestId;
            this.resultMsg = builder.resultMsg;
            this.success = builder.success;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public Content getContent() {
            return this.content;
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return requestId
         */
        public String getRequestId() {
            return this.requestId;
        }

        /**
         * @return resultMsg
         */
        public String getResultMsg() {
            return this.resultMsg;
        }

        /**
         * @return success
         */
        public Boolean getSuccess() {
            return this.success;
        }

        public static final class Builder {
            private Content content; 
            private String errorCode; 
            private String requestId; 
            private String resultMsg; 
            private Boolean success; 

            /**
             * Content.
             */
            public Builder content(Content content) {
                this.content = content;
                return this;
            }

            /**
             * ErrorCode.
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
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
             * ResultMsg.
             */
            public Builder resultMsg(String resultMsg) {
                this.resultMsg = resultMsg;
                return this;
            }

            /**
             * Success.
             */
            public Builder success(Boolean success) {
                this.success = success;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
    public static class ResultContent extends TeaModel {
        @NameInMap("Data")
        private Data data;

        @NameInMap("RequestId")
        private String requestId;

        private ResultContent(Builder builder) {
            this.data = builder.data;
            this.requestId = builder.requestId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultContent create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public Data getData() {
            return this.data;
        }

        /**
         * @return requestId
         */
        public String getRequestId() {
            return this.requestId;
        }

        public static final class Builder {
            private Data data; 
            private String requestId; 

            /**
             * Data.
             */
            public Builder data(Data data) {
                this.data = data;
                return this;
            }

            /**
             * RequestId.
             */
            public Builder requestId(String requestId) {
                this.requestId = requestId;
                return this;
            }

            public ResultContent build() {
                return new ResultContent(this);
            } 

        } 

    }
}
