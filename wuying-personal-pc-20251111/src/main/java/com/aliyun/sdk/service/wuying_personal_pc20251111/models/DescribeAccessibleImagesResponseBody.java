// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.wuying_personal_pc20251111.models;

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
 * {@link DescribeAccessibleImagesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAccessibleImagesResponseBody</p>
 */
public class DescribeAccessibleImagesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TraceId")
    private String traceId;

    private DescribeAccessibleImagesResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.requestId = builder.requestId;
        this.traceId = builder.traceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAccessibleImagesResponseBody create() {
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
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return traceId
     */
    public String getTraceId() {
        return this.traceId;
    }

    public static final class Builder {
        private String code; 
        private java.util.List<Data> data; 
        private Integer httpStatusCode; 
        private String requestId; 
        private String traceId; 

        private Builder() {
        } 

        private Builder(DescribeAccessibleImagesResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.requestId = model.requestId;
            this.traceId = model.traceId;
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
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
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
         * TraceId.
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public DescribeAccessibleImagesResponseBody build() {
            return new DescribeAccessibleImagesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAccessibleImagesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAccessibleImagesResponseBody</p>
     */
    public static class CurrentImageCodeInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CurrentPassword")
        private String currentPassword;

        @com.aliyun.core.annotation.NameInMap("ExpireTime")
        private String expireTime;

        @com.aliyun.core.annotation.NameInMap("GmtCreated")
        private String gmtCreated;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("ImageCode")
        private String imageCode;

        @com.aliyun.core.annotation.NameInMap("ImageId")
        private String imageId;

        @com.aliyun.core.annotation.NameInMap("IsCopyPassword")
        private Boolean isCopyPassword;

        @com.aliyun.core.annotation.NameInMap("IsEncrypted")
        private Boolean isEncrypted;

        @com.aliyun.core.annotation.NameInMap("IsFree")
        private Boolean isFree;

        @com.aliyun.core.annotation.NameInMap("PeriodDays")
        private Integer periodDays;

        @com.aliyun.core.annotation.NameInMap("RedeemCount")
        private Integer redeemCount;

        @com.aliyun.core.annotation.NameInMap("RedeemQuota")
        private Integer redeemQuota;

        private CurrentImageCodeInfo(Builder builder) {
            this.currentPassword = builder.currentPassword;
            this.expireTime = builder.expireTime;
            this.gmtCreated = builder.gmtCreated;
            this.gmtModified = builder.gmtModified;
            this.imageCode = builder.imageCode;
            this.imageId = builder.imageId;
            this.isCopyPassword = builder.isCopyPassword;
            this.isEncrypted = builder.isEncrypted;
            this.isFree = builder.isFree;
            this.periodDays = builder.periodDays;
            this.redeemCount = builder.redeemCount;
            this.redeemQuota = builder.redeemQuota;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CurrentImageCodeInfo create() {
            return builder().build();
        }

        /**
         * @return currentPassword
         */
        public String getCurrentPassword() {
            return this.currentPassword;
        }

        /**
         * @return expireTime
         */
        public String getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return gmtCreated
         */
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return imageCode
         */
        public String getImageCode() {
            return this.imageCode;
        }

        /**
         * @return imageId
         */
        public String getImageId() {
            return this.imageId;
        }

        /**
         * @return isCopyPassword
         */
        public Boolean getIsCopyPassword() {
            return this.isCopyPassword;
        }

        /**
         * @return isEncrypted
         */
        public Boolean getIsEncrypted() {
            return this.isEncrypted;
        }

        /**
         * @return isFree
         */
        public Boolean getIsFree() {
            return this.isFree;
        }

        /**
         * @return periodDays
         */
        public Integer getPeriodDays() {
            return this.periodDays;
        }

        /**
         * @return redeemCount
         */
        public Integer getRedeemCount() {
            return this.redeemCount;
        }

        /**
         * @return redeemQuota
         */
        public Integer getRedeemQuota() {
            return this.redeemQuota;
        }

        public static final class Builder {
            private String currentPassword; 
            private String expireTime; 
            private String gmtCreated; 
            private String gmtModified; 
            private String imageCode; 
            private String imageId; 
            private Boolean isCopyPassword; 
            private Boolean isEncrypted; 
            private Boolean isFree; 
            private Integer periodDays; 
            private Integer redeemCount; 
            private Integer redeemQuota; 

            private Builder() {
            } 

            private Builder(CurrentImageCodeInfo model) {
                this.currentPassword = model.currentPassword;
                this.expireTime = model.expireTime;
                this.gmtCreated = model.gmtCreated;
                this.gmtModified = model.gmtModified;
                this.imageCode = model.imageCode;
                this.imageId = model.imageId;
                this.isCopyPassword = model.isCopyPassword;
                this.isEncrypted = model.isEncrypted;
                this.isFree = model.isFree;
                this.periodDays = model.periodDays;
                this.redeemCount = model.redeemCount;
                this.redeemQuota = model.redeemQuota;
            } 

            /**
             * CurrentPassword.
             */
            public Builder currentPassword(String currentPassword) {
                this.currentPassword = currentPassword;
                return this;
            }

            /**
             * ExpireTime.
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * GmtCreated.
             */
            public Builder gmtCreated(String gmtCreated) {
                this.gmtCreated = gmtCreated;
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
             * ImageCode.
             */
            public Builder imageCode(String imageCode) {
                this.imageCode = imageCode;
                return this;
            }

            /**
             * ImageId.
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * IsCopyPassword.
             */
            public Builder isCopyPassword(Boolean isCopyPassword) {
                this.isCopyPassword = isCopyPassword;
                return this;
            }

            /**
             * IsEncrypted.
             */
            public Builder isEncrypted(Boolean isEncrypted) {
                this.isEncrypted = isEncrypted;
                return this;
            }

            /**
             * IsFree.
             */
            public Builder isFree(Boolean isFree) {
                this.isFree = isFree;
                return this;
            }

            /**
             * PeriodDays.
             */
            public Builder periodDays(Integer periodDays) {
                this.periodDays = periodDays;
                return this;
            }

            /**
             * RedeemCount.
             */
            public Builder redeemCount(Integer redeemCount) {
                this.redeemCount = redeemCount;
                return this;
            }

            /**
             * RedeemQuota.
             */
            public Builder redeemQuota(Integer redeemQuota) {
                this.redeemQuota = redeemQuota;
                return this;
            }

            public CurrentImageCodeInfo build() {
                return new CurrentImageCodeInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAccessibleImagesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAccessibleImagesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActivityType")
        private String activityType;

        @com.aliyun.core.annotation.NameInMap("AuthTime")
        private String authTime;

        @com.aliyun.core.annotation.NameInMap("CanUpdate")
        private Boolean canUpdate;

        @com.aliyun.core.annotation.NameInMap("CurrentImageCodeInfo")
        private CurrentImageCodeInfo currentImageCodeInfo;

        @com.aliyun.core.annotation.NameInMap("DataDiskSize")
        private Integer dataDiskSize;

        @com.aliyun.core.annotation.NameInMap("DeployMode")
        private String deployMode;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DockerImageSize")
        private Integer dockerImageSize;

        @com.aliyun.core.annotation.NameInMap("EnableStartUpConfig")
        private Boolean enableStartUpConfig;

        @com.aliyun.core.annotation.NameInMap("GmtCreated")
        private String gmtCreated;

        @com.aliyun.core.annotation.NameInMap("ImageId")
        private String imageId;

        @com.aliyun.core.annotation.NameInMap("ImageScope")
        private String imageScope;

        @com.aliyun.core.annotation.NameInMap("ImageSource")
        private String imageSource;

        @com.aliyun.core.annotation.NameInMap("ImageType")
        private String imageType;

        @com.aliyun.core.annotation.NameInMap("IsGpu")
        private Boolean isGpu;

        @com.aliyun.core.annotation.NameInMap("IsLinggou")
        private String isLinggou;

        @com.aliyun.core.annotation.NameInMap("IsWorkstation")
        private Boolean isWorkstation;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("OperationSystem")
        private String operationSystem;

        @com.aliyun.core.annotation.NameInMap("OsType")
        private String osType;

        @com.aliyun.core.annotation.NameInMap("Permission")
        private String permission;

        @com.aliyun.core.annotation.NameInMap("Platform")
        private String platform;

        @com.aliyun.core.annotation.NameInMap("Progress")
        private String progress;

        @com.aliyun.core.annotation.NameInMap("ReceiverType")
        private String receiverType;

        @com.aliyun.core.annotation.NameInMap("ShareCodes")
        private java.util.List<String> shareCodes;

        @com.aliyun.core.annotation.NameInMap("ShareCodesIncludeDisable")
        private java.util.List<String> shareCodesIncludeDisable;

        @com.aliyun.core.annotation.NameInMap("Shared")
        private Boolean shared;

        @com.aliyun.core.annotation.NameInMap("SharedBy")
        private String sharedBy;

        @com.aliyun.core.annotation.NameInMap("SourceDesktopId")
        private String sourceDesktopId;

        @com.aliyun.core.annotation.NameInMap("SourceDesktopType")
        private String sourceDesktopType;

        @com.aliyun.core.annotation.NameInMap("SourceImageId")
        private String sourceImageId;

        @com.aliyun.core.annotation.NameInMap("SourceImageName")
        private String sourceImageName;

        @com.aliyun.core.annotation.NameInMap("StartUpFileList")
        private java.util.List<String> startUpFileList;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("SupportPublish")
        private Boolean supportPublish;

        @com.aliyun.core.annotation.NameInMap("SystemDiskSize")
        private Integer systemDiskSize;

        @com.aliyun.core.annotation.NameInMap("ValidationCode")
        private String validationCode;

        private Data(Builder builder) {
            this.activityType = builder.activityType;
            this.authTime = builder.authTime;
            this.canUpdate = builder.canUpdate;
            this.currentImageCodeInfo = builder.currentImageCodeInfo;
            this.dataDiskSize = builder.dataDiskSize;
            this.deployMode = builder.deployMode;
            this.description = builder.description;
            this.dockerImageSize = builder.dockerImageSize;
            this.enableStartUpConfig = builder.enableStartUpConfig;
            this.gmtCreated = builder.gmtCreated;
            this.imageId = builder.imageId;
            this.imageScope = builder.imageScope;
            this.imageSource = builder.imageSource;
            this.imageType = builder.imageType;
            this.isGpu = builder.isGpu;
            this.isLinggou = builder.isLinggou;
            this.isWorkstation = builder.isWorkstation;
            this.name = builder.name;
            this.operationSystem = builder.operationSystem;
            this.osType = builder.osType;
            this.permission = builder.permission;
            this.platform = builder.platform;
            this.progress = builder.progress;
            this.receiverType = builder.receiverType;
            this.shareCodes = builder.shareCodes;
            this.shareCodesIncludeDisable = builder.shareCodesIncludeDisable;
            this.shared = builder.shared;
            this.sharedBy = builder.sharedBy;
            this.sourceDesktopId = builder.sourceDesktopId;
            this.sourceDesktopType = builder.sourceDesktopType;
            this.sourceImageId = builder.sourceImageId;
            this.sourceImageName = builder.sourceImageName;
            this.startUpFileList = builder.startUpFileList;
            this.status = builder.status;
            this.supportPublish = builder.supportPublish;
            this.systemDiskSize = builder.systemDiskSize;
            this.validationCode = builder.validationCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return activityType
         */
        public String getActivityType() {
            return this.activityType;
        }

        /**
         * @return authTime
         */
        public String getAuthTime() {
            return this.authTime;
        }

        /**
         * @return canUpdate
         */
        public Boolean getCanUpdate() {
            return this.canUpdate;
        }

        /**
         * @return currentImageCodeInfo
         */
        public CurrentImageCodeInfo getCurrentImageCodeInfo() {
            return this.currentImageCodeInfo;
        }

        /**
         * @return dataDiskSize
         */
        public Integer getDataDiskSize() {
            return this.dataDiskSize;
        }

        /**
         * @return deployMode
         */
        public String getDeployMode() {
            return this.deployMode;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return dockerImageSize
         */
        public Integer getDockerImageSize() {
            return this.dockerImageSize;
        }

        /**
         * @return enableStartUpConfig
         */
        public Boolean getEnableStartUpConfig() {
            return this.enableStartUpConfig;
        }

        /**
         * @return gmtCreated
         */
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        /**
         * @return imageId
         */
        public String getImageId() {
            return this.imageId;
        }

        /**
         * @return imageScope
         */
        public String getImageScope() {
            return this.imageScope;
        }

        /**
         * @return imageSource
         */
        public String getImageSource() {
            return this.imageSource;
        }

        /**
         * @return imageType
         */
        public String getImageType() {
            return this.imageType;
        }

        /**
         * @return isGpu
         */
        public Boolean getIsGpu() {
            return this.isGpu;
        }

        /**
         * @return isLinggou
         */
        public String getIsLinggou() {
            return this.isLinggou;
        }

        /**
         * @return isWorkstation
         */
        public Boolean getIsWorkstation() {
            return this.isWorkstation;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return operationSystem
         */
        public String getOperationSystem() {
            return this.operationSystem;
        }

        /**
         * @return osType
         */
        public String getOsType() {
            return this.osType;
        }

        /**
         * @return permission
         */
        public String getPermission() {
            return this.permission;
        }

        /**
         * @return platform
         */
        public String getPlatform() {
            return this.platform;
        }

        /**
         * @return progress
         */
        public String getProgress() {
            return this.progress;
        }

        /**
         * @return receiverType
         */
        public String getReceiverType() {
            return this.receiverType;
        }

        /**
         * @return shareCodes
         */
        public java.util.List<String> getShareCodes() {
            return this.shareCodes;
        }

        /**
         * @return shareCodesIncludeDisable
         */
        public java.util.List<String> getShareCodesIncludeDisable() {
            return this.shareCodesIncludeDisable;
        }

        /**
         * @return shared
         */
        public Boolean getShared() {
            return this.shared;
        }

        /**
         * @return sharedBy
         */
        public String getSharedBy() {
            return this.sharedBy;
        }

        /**
         * @return sourceDesktopId
         */
        public String getSourceDesktopId() {
            return this.sourceDesktopId;
        }

        /**
         * @return sourceDesktopType
         */
        public String getSourceDesktopType() {
            return this.sourceDesktopType;
        }

        /**
         * @return sourceImageId
         */
        public String getSourceImageId() {
            return this.sourceImageId;
        }

        /**
         * @return sourceImageName
         */
        public String getSourceImageName() {
            return this.sourceImageName;
        }

        /**
         * @return startUpFileList
         */
        public java.util.List<String> getStartUpFileList() {
            return this.startUpFileList;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return supportPublish
         */
        public Boolean getSupportPublish() {
            return this.supportPublish;
        }

        /**
         * @return systemDiskSize
         */
        public Integer getSystemDiskSize() {
            return this.systemDiskSize;
        }

        /**
         * @return validationCode
         */
        public String getValidationCode() {
            return this.validationCode;
        }

        public static final class Builder {
            private String activityType; 
            private String authTime; 
            private Boolean canUpdate; 
            private CurrentImageCodeInfo currentImageCodeInfo; 
            private Integer dataDiskSize; 
            private String deployMode; 
            private String description; 
            private Integer dockerImageSize; 
            private Boolean enableStartUpConfig; 
            private String gmtCreated; 
            private String imageId; 
            private String imageScope; 
            private String imageSource; 
            private String imageType; 
            private Boolean isGpu; 
            private String isLinggou; 
            private Boolean isWorkstation; 
            private String name; 
            private String operationSystem; 
            private String osType; 
            private String permission; 
            private String platform; 
            private String progress; 
            private String receiverType; 
            private java.util.List<String> shareCodes; 
            private java.util.List<String> shareCodesIncludeDisable; 
            private Boolean shared; 
            private String sharedBy; 
            private String sourceDesktopId; 
            private String sourceDesktopType; 
            private String sourceImageId; 
            private String sourceImageName; 
            private java.util.List<String> startUpFileList; 
            private String status; 
            private Boolean supportPublish; 
            private Integer systemDiskSize; 
            private String validationCode; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.activityType = model.activityType;
                this.authTime = model.authTime;
                this.canUpdate = model.canUpdate;
                this.currentImageCodeInfo = model.currentImageCodeInfo;
                this.dataDiskSize = model.dataDiskSize;
                this.deployMode = model.deployMode;
                this.description = model.description;
                this.dockerImageSize = model.dockerImageSize;
                this.enableStartUpConfig = model.enableStartUpConfig;
                this.gmtCreated = model.gmtCreated;
                this.imageId = model.imageId;
                this.imageScope = model.imageScope;
                this.imageSource = model.imageSource;
                this.imageType = model.imageType;
                this.isGpu = model.isGpu;
                this.isLinggou = model.isLinggou;
                this.isWorkstation = model.isWorkstation;
                this.name = model.name;
                this.operationSystem = model.operationSystem;
                this.osType = model.osType;
                this.permission = model.permission;
                this.platform = model.platform;
                this.progress = model.progress;
                this.receiverType = model.receiverType;
                this.shareCodes = model.shareCodes;
                this.shareCodesIncludeDisable = model.shareCodesIncludeDisable;
                this.shared = model.shared;
                this.sharedBy = model.sharedBy;
                this.sourceDesktopId = model.sourceDesktopId;
                this.sourceDesktopType = model.sourceDesktopType;
                this.sourceImageId = model.sourceImageId;
                this.sourceImageName = model.sourceImageName;
                this.startUpFileList = model.startUpFileList;
                this.status = model.status;
                this.supportPublish = model.supportPublish;
                this.systemDiskSize = model.systemDiskSize;
                this.validationCode = model.validationCode;
            } 

            /**
             * ActivityType.
             */
            public Builder activityType(String activityType) {
                this.activityType = activityType;
                return this;
            }

            /**
             * AuthTime.
             */
            public Builder authTime(String authTime) {
                this.authTime = authTime;
                return this;
            }

            /**
             * CanUpdate.
             */
            public Builder canUpdate(Boolean canUpdate) {
                this.canUpdate = canUpdate;
                return this;
            }

            /**
             * CurrentImageCodeInfo.
             */
            public Builder currentImageCodeInfo(CurrentImageCodeInfo currentImageCodeInfo) {
                this.currentImageCodeInfo = currentImageCodeInfo;
                return this;
            }

            /**
             * DataDiskSize.
             */
            public Builder dataDiskSize(Integer dataDiskSize) {
                this.dataDiskSize = dataDiskSize;
                return this;
            }

            /**
             * DeployMode.
             */
            public Builder deployMode(String deployMode) {
                this.deployMode = deployMode;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * DockerImageSize.
             */
            public Builder dockerImageSize(Integer dockerImageSize) {
                this.dockerImageSize = dockerImageSize;
                return this;
            }

            /**
             * EnableStartUpConfig.
             */
            public Builder enableStartUpConfig(Boolean enableStartUpConfig) {
                this.enableStartUpConfig = enableStartUpConfig;
                return this;
            }

            /**
             * GmtCreated.
             */
            public Builder gmtCreated(String gmtCreated) {
                this.gmtCreated = gmtCreated;
                return this;
            }

            /**
             * ImageId.
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * ImageScope.
             */
            public Builder imageScope(String imageScope) {
                this.imageScope = imageScope;
                return this;
            }

            /**
             * ImageSource.
             */
            public Builder imageSource(String imageSource) {
                this.imageSource = imageSource;
                return this;
            }

            /**
             * ImageType.
             */
            public Builder imageType(String imageType) {
                this.imageType = imageType;
                return this;
            }

            /**
             * IsGpu.
             */
            public Builder isGpu(Boolean isGpu) {
                this.isGpu = isGpu;
                return this;
            }

            /**
             * IsLinggou.
             */
            public Builder isLinggou(String isLinggou) {
                this.isLinggou = isLinggou;
                return this;
            }

            /**
             * IsWorkstation.
             */
            public Builder isWorkstation(Boolean isWorkstation) {
                this.isWorkstation = isWorkstation;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * OperationSystem.
             */
            public Builder operationSystem(String operationSystem) {
                this.operationSystem = operationSystem;
                return this;
            }

            /**
             * OsType.
             */
            public Builder osType(String osType) {
                this.osType = osType;
                return this;
            }

            /**
             * Permission.
             */
            public Builder permission(String permission) {
                this.permission = permission;
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
             * Progress.
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * ReceiverType.
             */
            public Builder receiverType(String receiverType) {
                this.receiverType = receiverType;
                return this;
            }

            /**
             * ShareCodes.
             */
            public Builder shareCodes(java.util.List<String> shareCodes) {
                this.shareCodes = shareCodes;
                return this;
            }

            /**
             * ShareCodesIncludeDisable.
             */
            public Builder shareCodesIncludeDisable(java.util.List<String> shareCodesIncludeDisable) {
                this.shareCodesIncludeDisable = shareCodesIncludeDisable;
                return this;
            }

            /**
             * Shared.
             */
            public Builder shared(Boolean shared) {
                this.shared = shared;
                return this;
            }

            /**
             * SharedBy.
             */
            public Builder sharedBy(String sharedBy) {
                this.sharedBy = sharedBy;
                return this;
            }

            /**
             * SourceDesktopId.
             */
            public Builder sourceDesktopId(String sourceDesktopId) {
                this.sourceDesktopId = sourceDesktopId;
                return this;
            }

            /**
             * SourceDesktopType.
             */
            public Builder sourceDesktopType(String sourceDesktopType) {
                this.sourceDesktopType = sourceDesktopType;
                return this;
            }

            /**
             * SourceImageId.
             */
            public Builder sourceImageId(String sourceImageId) {
                this.sourceImageId = sourceImageId;
                return this;
            }

            /**
             * SourceImageName.
             */
            public Builder sourceImageName(String sourceImageName) {
                this.sourceImageName = sourceImageName;
                return this;
            }

            /**
             * StartUpFileList.
             */
            public Builder startUpFileList(java.util.List<String> startUpFileList) {
                this.startUpFileList = startUpFileList;
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
             * SupportPublish.
             */
            public Builder supportPublish(Boolean supportPublish) {
                this.supportPublish = supportPublish;
                return this;
            }

            /**
             * SystemDiskSize.
             */
            public Builder systemDiskSize(Integer systemDiskSize) {
                this.systemDiskSize = systemDiskSize;
                return this;
            }

            /**
             * ValidationCode.
             */
            public Builder validationCode(String validationCode) {
                this.validationCode = validationCode;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
