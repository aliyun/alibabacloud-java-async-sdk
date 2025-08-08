// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

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
 * {@link GetMcubeNebulaResourceResponseBody} extends {@link TeaModel}
 *
 * <p>GetMcubeNebulaResourceResponseBody</p>
 */
public class GetMcubeNebulaResourceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("GetNebulaResourceResult")
    private GetNebulaResourceResult getNebulaResourceResult;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResultCode")
    private String resultCode;

    @com.aliyun.core.annotation.NameInMap("ResultMessage")
    private String resultMessage;

    private GetMcubeNebulaResourceResponseBody(Builder builder) {
        this.getNebulaResourceResult = builder.getNebulaResourceResult;
        this.requestId = builder.requestId;
        this.resultCode = builder.resultCode;
        this.resultMessage = builder.resultMessage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMcubeNebulaResourceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return getNebulaResourceResult
     */
    public GetNebulaResourceResult getGetNebulaResourceResult() {
        return this.getNebulaResourceResult;
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
        private GetNebulaResourceResult getNebulaResourceResult; 
        private String requestId; 
        private String resultCode; 
        private String resultMessage; 

        private Builder() {
        } 

        private Builder(GetMcubeNebulaResourceResponseBody model) {
            this.getNebulaResourceResult = model.getNebulaResourceResult;
            this.requestId = model.requestId;
            this.resultCode = model.resultCode;
            this.resultMessage = model.resultMessage;
        } 

        /**
         * GetNebulaResourceResult.
         */
        public Builder getNebulaResourceResult(GetNebulaResourceResult getNebulaResourceResult) {
            this.getNebulaResourceResult = getNebulaResourceResult;
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

        public GetMcubeNebulaResourceResponseBody build() {
            return new GetMcubeNebulaResourceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetMcubeNebulaResourceResponseBody} extends {@link TeaModel}
     *
     * <p>GetMcubeNebulaResourceResponseBody</p>
     */
    public static class NebulaResourceInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppCode")
        private String appCode;

        @com.aliyun.core.annotation.NameInMap("AutoInstall")
        private Integer autoInstall;

        @com.aliyun.core.annotation.NameInMap("ClientVersionMax")
        private String clientVersionMax;

        @com.aliyun.core.annotation.NameInMap("ClientVersionMin")
        private String clientVersionMin;

        @com.aliyun.core.annotation.NameInMap("Creator")
        private String creator;

        @com.aliyun.core.annotation.NameInMap("DownloadUrl")
        private String downloadUrl;

        @com.aliyun.core.annotation.NameInMap("ExtendInfo")
        private String extendInfo;

        @com.aliyun.core.annotation.NameInMap("ExtraData")
        private String extraData;

        @com.aliyun.core.annotation.NameInMap("FallbackBaseUrl")
        private String fallbackBaseUrl;

        @com.aliyun.core.annotation.NameInMap("FileSize")
        private String fileSize;

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
        private Integer installType;

        @com.aliyun.core.annotation.NameInMap("MainUrl")
        private String mainUrl;

        @com.aliyun.core.annotation.NameInMap("Memo")
        private String memo;

        @com.aliyun.core.annotation.NameInMap("MetaId")
        private Long metaId;

        @com.aliyun.core.annotation.NameInMap("Modifier")
        private String modifier;

        @com.aliyun.core.annotation.NameInMap("PackageType")
        private Integer packageType;

        @com.aliyun.core.annotation.NameInMap("Platform")
        private String platform;

        @com.aliyun.core.annotation.NameInMap("PublishPeriod")
        private Integer publishPeriod;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("Vhost")
        private String vhost;

        private NebulaResourceInfo(Builder builder) {
            this.appCode = builder.appCode;
            this.autoInstall = builder.autoInstall;
            this.clientVersionMax = builder.clientVersionMax;
            this.clientVersionMin = builder.clientVersionMin;
            this.creator = builder.creator;
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
            this.mainUrl = builder.mainUrl;
            this.memo = builder.memo;
            this.metaId = builder.metaId;
            this.modifier = builder.modifier;
            this.packageType = builder.packageType;
            this.platform = builder.platform;
            this.publishPeriod = builder.publishPeriod;
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
            private String mainUrl; 
            private String memo; 
            private Long metaId; 
            private String modifier; 
            private Integer packageType; 
            private String platform; 
            private Integer publishPeriod; 
            private String resourceType; 
            private Integer status; 
            private String vhost; 

            private Builder() {
            } 

            private Builder(NebulaResourceInfo model) {
                this.appCode = model.appCode;
                this.autoInstall = model.autoInstall;
                this.clientVersionMax = model.clientVersionMax;
                this.clientVersionMin = model.clientVersionMin;
                this.creator = model.creator;
                this.downloadUrl = model.downloadUrl;
                this.extendInfo = model.extendInfo;
                this.extraData = model.extraData;
                this.fallbackBaseUrl = model.fallbackBaseUrl;
                this.fileSize = model.fileSize;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.h5Id = model.h5Id;
                this.h5Name = model.h5Name;
                this.h5Version = model.h5Version;
                this.id = model.id;
                this.installType = model.installType;
                this.mainUrl = model.mainUrl;
                this.memo = model.memo;
                this.metaId = model.metaId;
                this.modifier = model.modifier;
                this.packageType = model.packageType;
                this.platform = model.platform;
                this.publishPeriod = model.publishPeriod;
                this.resourceType = model.resourceType;
                this.status = model.status;
                this.vhost = model.vhost;
            } 

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
    /**
     * 
     * {@link GetMcubeNebulaResourceResponseBody} extends {@link TeaModel}
     *
     * <p>GetMcubeNebulaResourceResponseBody</p>
     */
    public static class GetNebulaResourceResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("NebulaResourceInfo")
        private NebulaResourceInfo nebulaResourceInfo;

        @com.aliyun.core.annotation.NameInMap("RequestId")
        private String requestId;

        @com.aliyun.core.annotation.NameInMap("ResultMsg")
        private String resultMsg;

        @com.aliyun.core.annotation.NameInMap("Success")
        private Boolean success;

        private GetNebulaResourceResult(Builder builder) {
            this.errorCode = builder.errorCode;
            this.nebulaResourceInfo = builder.nebulaResourceInfo;
            this.requestId = builder.requestId;
            this.resultMsg = builder.resultMsg;
            this.success = builder.success;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GetNebulaResourceResult create() {
            return builder().build();
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return nebulaResourceInfo
         */
        public NebulaResourceInfo getNebulaResourceInfo() {
            return this.nebulaResourceInfo;
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
            private String errorCode; 
            private NebulaResourceInfo nebulaResourceInfo; 
            private String requestId; 
            private String resultMsg; 
            private Boolean success; 

            private Builder() {
            } 

            private Builder(GetNebulaResourceResult model) {
                this.errorCode = model.errorCode;
                this.nebulaResourceInfo = model.nebulaResourceInfo;
                this.requestId = model.requestId;
                this.resultMsg = model.resultMsg;
                this.success = model.success;
            } 

            /**
             * ErrorCode.
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * NebulaResourceInfo.
             */
            public Builder nebulaResourceInfo(NebulaResourceInfo nebulaResourceInfo) {
                this.nebulaResourceInfo = nebulaResourceInfo;
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

            public GetNebulaResourceResult build() {
                return new GetNebulaResourceResult(this);
            } 

        } 

    }
}
