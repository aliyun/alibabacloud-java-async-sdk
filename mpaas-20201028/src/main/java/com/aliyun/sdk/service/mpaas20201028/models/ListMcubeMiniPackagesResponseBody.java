// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListMcubeMiniPackagesResponseBody} extends {@link TeaModel}
 *
 * <p>ListMcubeMiniPackagesResponseBody</p>
 */
public class ListMcubeMiniPackagesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ListMiniPackageResult")
    private ListMiniPackageResult listMiniPackageResult;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResultCode")
    private String resultCode;

    @com.aliyun.core.annotation.NameInMap("ResultMessage")
    private String resultMessage;

    private ListMcubeMiniPackagesResponseBody(Builder builder) {
        this.listMiniPackageResult = builder.listMiniPackageResult;
        this.requestId = builder.requestId;
        this.resultCode = builder.resultCode;
        this.resultMessage = builder.resultMessage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMcubeMiniPackagesResponseBody create() {
        return builder().build();
    }

    /**
     * @return listMiniPackageResult
     */
    public ListMiniPackageResult getListMiniPackageResult() {
        return this.listMiniPackageResult;
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
        private ListMiniPackageResult listMiniPackageResult; 
        private String requestId; 
        private String resultCode; 
        private String resultMessage; 

        /**
         * ListMiniPackageResult.
         */
        public Builder listMiniPackageResult(ListMiniPackageResult listMiniPackageResult) {
            this.listMiniPackageResult = listMiniPackageResult;
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

        public ListMcubeMiniPackagesResponseBody build() {
            return new ListMcubeMiniPackagesResponseBody(this);
        } 

    } 

    public static class MiniPackageList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppCode")
        private String appCode;

        @com.aliyun.core.annotation.NameInMap("AutoInstall")
        private Long autoInstall;

        @com.aliyun.core.annotation.NameInMap("ClientVersionMax")
        private String clientVersionMax;

        @com.aliyun.core.annotation.NameInMap("ClientVersionMin")
        private String clientVersionMin;

        @com.aliyun.core.annotation.NameInMap("DownloadUrl")
        private String downloadUrl;

        @com.aliyun.core.annotation.NameInMap("ExtendInfo")
        private String extendInfo;

        @com.aliyun.core.annotation.NameInMap("ExtraData")
        private String extraData;

        @com.aliyun.core.annotation.NameInMap("FallbackBaseUrl")
        private String fallbackBaseUrl;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("H5Id")
        private String h5Id;

        @com.aliyun.core.annotation.NameInMap("H5Name")
        private String h5Name;

        @com.aliyun.core.annotation.NameInMap("H5Version")
        private String h5Version;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("InstallType")
        private Long installType;

        @com.aliyun.core.annotation.NameInMap("MainUrl")
        private String mainUrl;

        @com.aliyun.core.annotation.NameInMap("Memo")
        private String memo;

        @com.aliyun.core.annotation.NameInMap("PackageType")
        private Long packageType;

        @com.aliyun.core.annotation.NameInMap("Platform")
        private String platform;

        @com.aliyun.core.annotation.NameInMap("PublishPeriod")
        private Long publishPeriod;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private Long resourceType;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Long status;

        private MiniPackageList(Builder builder) {
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

        public static MiniPackageList create() {
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

            public MiniPackageList build() {
                return new MiniPackageList(this);
            } 

        } 

    }
    public static class ListMiniPackageResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CurrentPage")
        private Integer currentPage;

        @com.aliyun.core.annotation.NameInMap("HasMore")
        private Boolean hasMore;

        @com.aliyun.core.annotation.NameInMap("MiniPackageList")
        private java.util.List < MiniPackageList> miniPackageList;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("ResultMsg")
        private String resultMsg;

        @com.aliyun.core.annotation.NameInMap("Success")
        private Boolean success;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Long totalCount;

        private ListMiniPackageResult(Builder builder) {
            this.currentPage = builder.currentPage;
            this.hasMore = builder.hasMore;
            this.miniPackageList = builder.miniPackageList;
            this.pageSize = builder.pageSize;
            this.resultMsg = builder.resultMsg;
            this.success = builder.success;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ListMiniPackageResult create() {
            return builder().build();
        }

        /**
         * @return currentPage
         */
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        /**
         * @return hasMore
         */
        public Boolean getHasMore() {
            return this.hasMore;
        }

        /**
         * @return miniPackageList
         */
        public java.util.List < MiniPackageList> getMiniPackageList() {
            return this.miniPackageList;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
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

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Integer currentPage; 
            private Boolean hasMore; 
            private java.util.List < MiniPackageList> miniPackageList; 
            private Integer pageSize; 
            private String resultMsg; 
            private Boolean success; 
            private Long totalCount; 

            /**
             * CurrentPage.
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * HasMore.
             */
            public Builder hasMore(Boolean hasMore) {
                this.hasMore = hasMore;
                return this;
            }

            /**
             * MiniPackageList.
             */
            public Builder miniPackageList(java.util.List < MiniPackageList> miniPackageList) {
                this.miniPackageList = miniPackageList;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
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

            /**
             * TotalCount.
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public ListMiniPackageResult build() {
                return new ListMiniPackageResult(this);
            } 

        } 

    }
}
