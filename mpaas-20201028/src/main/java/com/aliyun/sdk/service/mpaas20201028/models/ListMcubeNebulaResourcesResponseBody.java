// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListMcubeNebulaResourcesResponseBody} extends {@link TeaModel}
 *
 * <p>ListMcubeNebulaResourcesResponseBody</p>
 */
public class ListMcubeNebulaResourcesResponseBody extends TeaModel {
    @NameInMap("ListMcubeNebulaResourceResult")
    private ListMcubeNebulaResourceResult listMcubeNebulaResourceResult;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ResultCode")
    private String resultCode;

    @NameInMap("ResultMessage")
    private String resultMessage;

    private ListMcubeNebulaResourcesResponseBody(Builder builder) {
        this.listMcubeNebulaResourceResult = builder.listMcubeNebulaResourceResult;
        this.requestId = builder.requestId;
        this.resultCode = builder.resultCode;
        this.resultMessage = builder.resultMessage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMcubeNebulaResourcesResponseBody create() {
        return builder().build();
    }

    /**
     * @return listMcubeNebulaResourceResult
     */
    public ListMcubeNebulaResourceResult getListMcubeNebulaResourceResult() {
        return this.listMcubeNebulaResourceResult;
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
        private ListMcubeNebulaResourceResult listMcubeNebulaResourceResult; 
        private String requestId; 
        private String resultCode; 
        private String resultMessage; 

        /**
         * ListMcubeNebulaResourceResult.
         */
        public Builder listMcubeNebulaResourceResult(ListMcubeNebulaResourceResult listMcubeNebulaResourceResult) {
            this.listMcubeNebulaResourceResult = listMcubeNebulaResourceResult;
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

        public ListMcubeNebulaResourcesResponseBody build() {
            return new ListMcubeNebulaResourcesResponseBody(this);
        } 

    } 

    public static class NebulaResourceInfo extends TeaModel {
        @NameInMap("AppCode")
        private String appCode;

        @NameInMap("AutoInstall")
        private Integer autoInstall;

        @NameInMap("ClientVersionMax")
        private String clientVersionMax;

        @NameInMap("ClientVersionMin")
        private String clientVersionMin;

        @NameInMap("Creator")
        private String creator;

        @NameInMap("DebugUrl")
        private String debugUrl;

        @NameInMap("DownloadUrl")
        private String downloadUrl;

        @NameInMap("ExtendInfo")
        private String extendInfo;

        @NameInMap("ExtraData")
        private String extraData;

        @NameInMap("FallbackBaseUrl")
        private String fallbackBaseUrl;

        @NameInMap("FileSize")
        private String fileSize;

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
        private Integer installType;

        @NameInMap("LazyLoad")
        private Integer lazyLoad;

        @NameInMap("MainUrl")
        private String mainUrl;

        @NameInMap("Md5")
        private String md5;

        @NameInMap("Memo")
        private String memo;

        @NameInMap("MetaId")
        private Long metaId;

        @NameInMap("Modifier")
        private String modifier;

        @NameInMap("PackageType")
        private Integer packageType;

        @NameInMap("Platform")
        private String platform;

        @NameInMap("PublishPeriod")
        private Integer publishPeriod;

        @NameInMap("ReleaseVersion")
        private String releaseVersion;

        @NameInMap("ResourceType")
        private String resourceType;

        @NameInMap("Status")
        private Integer status;

        @NameInMap("Vhost")
        private String vhost;

        private NebulaResourceInfo(Builder builder) {
            this.appCode = builder.appCode;
            this.autoInstall = builder.autoInstall;
            this.clientVersionMax = builder.clientVersionMax;
            this.clientVersionMin = builder.clientVersionMin;
            this.creator = builder.creator;
            this.debugUrl = builder.debugUrl;
            this.downloadUrl = builder.downloadUrl;
            this.extendInfo = builder.extendInfo;
            this.extraData = builder.extraData;
            this.fallbackBaseUrl = builder.fallbackBaseUrl;
            this.fileSize = builder.fileSize;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.h5Id = builder.h5Id;
            this.h5Name = builder.h5Name;
            this.h5Version = builder.h5Version;
            this.id = builder.id;
            this.installType = builder.installType;
            this.lazyLoad = builder.lazyLoad;
            this.mainUrl = builder.mainUrl;
            this.md5 = builder.md5;
            this.memo = builder.memo;
            this.metaId = builder.metaId;
            this.modifier = builder.modifier;
            this.packageType = builder.packageType;
            this.platform = builder.platform;
            this.publishPeriod = builder.publishPeriod;
            this.releaseVersion = builder.releaseVersion;
            this.resourceType = builder.resourceType;
            this.status = builder.status;
            this.vhost = builder.vhost;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NebulaResourceInfo create() {
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
        public Integer getAutoInstall() {
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
         * @return creator
         */
        public String getCreator() {
            return this.creator;
        }

        /**
         * @return debugUrl
         */
        public String getDebugUrl() {
            return this.debugUrl;
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
         * @return fileSize
         */
        public String getFileSize() {
            return this.fileSize;
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
        public Integer getInstallType() {
            return this.installType;
        }

        /**
         * @return lazyLoad
         */
        public Integer getLazyLoad() {
            return this.lazyLoad;
        }

        /**
         * @return mainUrl
         */
        public String getMainUrl() {
            return this.mainUrl;
        }

        /**
         * @return md5
         */
        public String getMd5() {
            return this.md5;
        }

        /**
         * @return memo
         */
        public String getMemo() {
            return this.memo;
        }

        /**
         * @return metaId
         */
        public Long getMetaId() {
            return this.metaId;
        }

        /**
         * @return modifier
         */
        public String getModifier() {
            return this.modifier;
        }

        /**
         * @return packageType
         */
        public Integer getPackageType() {
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
        public Integer getPublishPeriod() {
            return this.publishPeriod;
        }

        /**
         * @return releaseVersion
         */
        public String getReleaseVersion() {
            return this.releaseVersion;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return vhost
         */
        public String getVhost() {
            return this.vhost;
        }

        public static final class Builder {
            private String appCode; 
            private Integer autoInstall; 
            private String clientVersionMax; 
            private String clientVersionMin; 
            private String creator; 
            private String debugUrl; 
            private String downloadUrl; 
            private String extendInfo; 
            private String extraData; 
            private String fallbackBaseUrl; 
            private String fileSize; 
            private String gmtCreate; 
            private String gmtModified; 
            private String h5Id; 
            private String h5Name; 
            private String h5Version; 
            private Long id; 
            private Integer installType; 
            private Integer lazyLoad; 
            private String mainUrl; 
            private String md5; 
            private String memo; 
            private Long metaId; 
            private String modifier; 
            private Integer packageType; 
            private String platform; 
            private Integer publishPeriod; 
            private String releaseVersion; 
            private String resourceType; 
            private Integer status; 
            private String vhost; 

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
            public Builder autoInstall(Integer autoInstall) {
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
             * Creator.
             */
            public Builder creator(String creator) {
                this.creator = creator;
                return this;
            }

            /**
             * DebugUrl.
             */
            public Builder debugUrl(String debugUrl) {
                this.debugUrl = debugUrl;
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
             * FileSize.
             */
            public Builder fileSize(String fileSize) {
                this.fileSize = fileSize;
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
            public Builder installType(Integer installType) {
                this.installType = installType;
                return this;
            }

            /**
             * LazyLoad.
             */
            public Builder lazyLoad(Integer lazyLoad) {
                this.lazyLoad = lazyLoad;
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
             * Md5.
             */
            public Builder md5(String md5) {
                this.md5 = md5;
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
             * MetaId.
             */
            public Builder metaId(Long metaId) {
                this.metaId = metaId;
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
             * PackageType.
             */
            public Builder packageType(Integer packageType) {
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
            public Builder publishPeriod(Integer publishPeriod) {
                this.publishPeriod = publishPeriod;
                return this;
            }

            /**
             * ReleaseVersion.
             */
            public Builder releaseVersion(String releaseVersion) {
                this.releaseVersion = releaseVersion;
                return this;
            }

            /**
             * ResourceType.
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * Vhost.
             */
            public Builder vhost(String vhost) {
                this.vhost = vhost;
                return this;
            }

            public NebulaResourceInfo build() {
                return new NebulaResourceInfo(this);
            } 

        } 

    }
    public static class ListMcubeNebulaResourceResult extends TeaModel {
        @NameInMap("CurrentPage")
        private Integer currentPage;

        @NameInMap("ErrorCode")
        private String errorCode;

        @NameInMap("HasMore")
        private Boolean hasMore;

        @NameInMap("NebulaResourceInfo")
        private java.util.List < NebulaResourceInfo> nebulaResourceInfo;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("RequestId")
        private String requestId;

        @NameInMap("ResultMsg")
        private String resultMsg;

        @NameInMap("Success")
        private Boolean success;

        @NameInMap("TotalCount")
        private Long totalCount;

        private ListMcubeNebulaResourceResult(Builder builder) {
            this.currentPage = builder.currentPage;
            this.errorCode = builder.errorCode;
            this.hasMore = builder.hasMore;
            this.nebulaResourceInfo = builder.nebulaResourceInfo;
            this.pageSize = builder.pageSize;
            this.requestId = builder.requestId;
            this.resultMsg = builder.resultMsg;
            this.success = builder.success;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ListMcubeNebulaResourceResult create() {
            return builder().build();
        }

        /**
         * @return currentPage
         */
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return hasMore
         */
        public Boolean getHasMore() {
            return this.hasMore;
        }

        /**
         * @return nebulaResourceInfo
         */
        public java.util.List < NebulaResourceInfo> getNebulaResourceInfo() {
            return this.nebulaResourceInfo;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
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

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Integer currentPage; 
            private String errorCode; 
            private Boolean hasMore; 
            private java.util.List < NebulaResourceInfo> nebulaResourceInfo; 
            private Integer pageSize; 
            private String requestId; 
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
             * ErrorCode.
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
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
             * NebulaResourceInfo.
             */
            public Builder nebulaResourceInfo(java.util.List < NebulaResourceInfo> nebulaResourceInfo) {
                this.nebulaResourceInfo = nebulaResourceInfo;
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

            /**
             * TotalCount.
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public ListMcubeNebulaResourceResult build() {
                return new ListMcubeNebulaResourceResult(this);
            } 

        } 

    }
}
