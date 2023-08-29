// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryMcubeMiniPackageResponseBody} extends {@link TeaModel}
 *
 * <p>QueryMcubeMiniPackageResponseBody</p>
 */
public class QueryMcubeMiniPackageResponseBody extends TeaModel {
    @NameInMap("QueryMiniPackageResult")
    private QueryMiniPackageResult queryMiniPackageResult;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ResultCode")
    private String resultCode;

    @NameInMap("ResultMessage")
    private String resultMessage;

    private QueryMcubeMiniPackageResponseBody(Builder builder) {
        this.queryMiniPackageResult = builder.queryMiniPackageResult;
        this.requestId = builder.requestId;
        this.resultCode = builder.resultCode;
        this.resultMessage = builder.resultMessage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryMcubeMiniPackageResponseBody create() {
        return builder().build();
    }

    /**
     * @return queryMiniPackageResult
     */
    public QueryMiniPackageResult getQueryMiniPackageResult() {
        return this.queryMiniPackageResult;
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
     * @return resultMessage
     */
    public String getResultMessage() {
        return this.resultMessage;
    }

    public static final class Builder {
        private QueryMiniPackageResult queryMiniPackageResult; 
        private String requestId; 
        private String resultCode; 
        private String resultMessage; 

        /**
         * QueryMiniPackageResult.
         */
        public Builder queryMiniPackageResult(QueryMiniPackageResult queryMiniPackageResult) {
            this.queryMiniPackageResult = queryMiniPackageResult;
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
         * ResultCode.
         */
        public Builder resultCode(String resultCode) {
            this.resultCode = resultCode;
            return this;
        }

        /**
         * ResultMessage.
         */
        public Builder resultMessage(String resultMessage) {
            this.resultMessage = resultMessage;
            return this;
        }

        public QueryMcubeMiniPackageResponseBody build() {
            return new QueryMcubeMiniPackageResponseBody(this);
        } 

    } 

    public static class MiniPackageInfo extends TeaModel {
        @NameInMap("AppCode")
        private String appCode;

        @NameInMap("AutoInstall")
        private Long autoInstall;

        @NameInMap("ClientVersionMax")
        private String clientVersionMax;

        @NameInMap("ClientVersionMin")
        private String clientVersionMin;

        @NameInMap("DownloadUrl")
        private String downloadUrl;

        @NameInMap("ExtendInfo")
        private String extendInfo;

        @NameInMap("ExtraData")
        private String extraData;

        @NameInMap("FallbackBaseUrl")
        private String fallbackBaseUrl;

        @NameInMap("GmtCreate")
        private String gmtCreate;

        @NameInMap("GmtModified")
        private String gmtModified;

        @NameInMap("H5Id")
        private String h5Id;

        @NameInMap("H5Name")
        private String h5Name;

        @NameInMap("H5Version")
        private String h5Version;

        @NameInMap("Id")
        private Long id;

        @NameInMap("InstallType")
        private Long installType;

        @NameInMap("MainUrl")
        private String mainUrl;

        @NameInMap("Memo")
        private String memo;

        @NameInMap("PackageType")
        private Long packageType;

        @NameInMap("Platform")
        private String platform;

        @NameInMap("PublishPeriod")
        private Long publishPeriod;

        @NameInMap("ResourceType")
        private Long resourceType;

        @NameInMap("Status")
        private Long status;

        private MiniPackageInfo(Builder builder) {
            this.appCode = builder.appCode;
            this.autoInstall = builder.autoInstall;
            this.clientVersionMax = builder.clientVersionMax;
            this.clientVersionMin = builder.clientVersionMin;
            this.downloadUrl = builder.downloadUrl;
            this.extendInfo = builder.extendInfo;
            this.extraData = builder.extraData;
            this.fallbackBaseUrl = builder.fallbackBaseUrl;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.h5Id = builder.h5Id;
            this.h5Name = builder.h5Name;
            this.h5Version = builder.h5Version;
            this.id = builder.id;
            this.installType = builder.installType;
            this.mainUrl = builder.mainUrl;
            this.memo = builder.memo;
            this.packageType = builder.packageType;
            this.platform = builder.platform;
            this.publishPeriod = builder.publishPeriod;
            this.resourceType = builder.resourceType;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MiniPackageInfo create() {
            return builder().build();
        }

        /**
         * @return appCode
         */
        public String getAppCode() {
            return this.appCode;
        }

        /**
         * @return autoInstall
         */
        public Long getAutoInstall() {
            return this.autoInstall;
        }

        /**
         * @return clientVersionMax
         */
        public String getClientVersionMax() {
            return this.clientVersionMax;
        }

        /**
         * @return clientVersionMin
         */
        public String getClientVersionMin() {
            return this.clientVersionMin;
        }

        /**
         * @return downloadUrl
         */
        public String getDownloadUrl() {
            return this.downloadUrl;
        }

        /**
         * @return extendInfo
         */
        public String getExtendInfo() {
            return this.extendInfo;
        }

        /**
         * @return extraData
         */
        public String getExtraData() {
            return this.extraData;
        }

        /**
         * @return fallbackBaseUrl
         */
        public String getFallbackBaseUrl() {
            return this.fallbackBaseUrl;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return h5Id
         */
        public String getH5Id() {
            return this.h5Id;
        }

        /**
         * @return h5Name
         */
        public String getH5Name() {
            return this.h5Name;
        }

        /**
         * @return h5Version
         */
        public String getH5Version() {
            return this.h5Version;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return installType
         */
        public Long getInstallType() {
            return this.installType;
        }

        /**
         * @return mainUrl
         */
        public String getMainUrl() {
            return this.mainUrl;
        }

        /**
         * @return memo
         */
        public String getMemo() {
            return this.memo;
        }

        /**
         * @return packageType
         */
        public Long getPackageType() {
            return this.packageType;
        }

        /**
         * @return platform
         */
        public String getPlatform() {
            return this.platform;
        }

        /**
         * @return publishPeriod
         */
        public Long getPublishPeriod() {
            return this.publishPeriod;
        }

        /**
         * @return resourceType
         */
        public Long getResourceType() {
            return this.resourceType;
        }

        /**
         * @return status
         */
        public Long getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String appCode; 
            private Long autoInstall; 
            private String clientVersionMax; 
            private String clientVersionMin; 
            private String downloadUrl; 
            private String extendInfo; 
            private String extraData; 
            private String fallbackBaseUrl; 
            private String gmtCreate; 
            private String gmtModified; 
            private String h5Id; 
            private String h5Name; 
            private String h5Version; 
            private Long id; 
            private Long installType; 
            private String mainUrl; 
            private String memo; 
            private Long packageType; 
            private String platform; 
            private Long publishPeriod; 
            private Long resourceType; 
            private Long status; 

            /**
             * AppCode.
             */
            public Builder appCode(String appCode) {
                this.appCode = appCode;
                return this;
            }

            /**
             * AutoInstall.
             */
            public Builder autoInstall(Long autoInstall) {
                this.autoInstall = autoInstall;
                return this;
            }

            /**
             * ClientVersionMax.
             */
            public Builder clientVersionMax(String clientVersionMax) {
                this.clientVersionMax = clientVersionMax;
                return this;
            }

            /**
             * ClientVersionMin.
             */
            public Builder clientVersionMin(String clientVersionMin) {
                this.clientVersionMin = clientVersionMin;
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
             * ExtendInfo.
             */
            public Builder extendInfo(String extendInfo) {
                this.extendInfo = extendInfo;
                return this;
            }

            /**
             * ExtraData.
             */
            public Builder extraData(String extraData) {
                this.extraData = extraData;
                return this;
            }

            /**
             * FallbackBaseUrl.
             */
            public Builder fallbackBaseUrl(String fallbackBaseUrl) {
                this.fallbackBaseUrl = fallbackBaseUrl;
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
             * GmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * H5Id.
             */
            public Builder h5Id(String h5Id) {
                this.h5Id = h5Id;
                return this;
            }

            /**
             * H5Name.
             */
            public Builder h5Name(String h5Name) {
                this.h5Name = h5Name;
                return this;
            }

            /**
             * H5Version.
             */
            public Builder h5Version(String h5Version) {
                this.h5Version = h5Version;
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
             * InstallType.
             */
            public Builder installType(Long installType) {
                this.installType = installType;
                return this;
            }

            /**
             * MainUrl.
             */
            public Builder mainUrl(String mainUrl) {
                this.mainUrl = mainUrl;
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
             * PackageType.
             */
            public Builder packageType(Long packageType) {
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
             * PublishPeriod.
             */
            public Builder publishPeriod(Long publishPeriod) {
                this.publishPeriod = publishPeriod;
                return this;
            }

            /**
             * ResourceType.
             */
            public Builder resourceType(Long resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Long status) {
                this.status = status;
                return this;
            }

            public MiniPackageInfo build() {
                return new MiniPackageInfo(this);
            } 

        } 

    }
    public static class QueryMiniPackageResult extends TeaModel {
        @NameInMap("MiniPackageInfo")
        private MiniPackageInfo miniPackageInfo;

        @NameInMap("ResultMsg")
        private String resultMsg;

        @NameInMap("Success")
        private Boolean success;

        private QueryMiniPackageResult(Builder builder) {
            this.miniPackageInfo = builder.miniPackageInfo;
            this.resultMsg = builder.resultMsg;
            this.success = builder.success;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QueryMiniPackageResult create() {
            return builder().build();
        }

        /**
         * @return miniPackageInfo
         */
        public MiniPackageInfo getMiniPackageInfo() {
            return this.miniPackageInfo;
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
            private MiniPackageInfo miniPackageInfo; 
            private String resultMsg; 
            private Boolean success; 

            /**
             * MiniPackageInfo.
             */
            public Builder miniPackageInfo(MiniPackageInfo miniPackageInfo) {
                this.miniPackageInfo = miniPackageInfo;
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

            public QueryMiniPackageResult build() {
                return new QueryMiniPackageResult(this);
            } 

        } 

    }
}
