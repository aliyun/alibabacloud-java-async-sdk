// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateMcubeNebulaTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateMcubeNebulaTaskRequest</p>
 */
public class CreateMcubeNebulaTaskRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppCode")
    private String appCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppId")
    private String appId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BizType")
    private String bizType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Creator")
    private String creator;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("GmtCreate")
    private String gmtCreate;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("GmtModified")
    private String gmtModified;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("GmtModifiedStr")
    private String gmtModifiedStr;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("GreyConfigInfo")
    private String greyConfigInfo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("GreyEndtime")
    private String greyEndtime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("GreyEndtimeData")
    private String greyEndtimeData;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("GreyEndtimeStr")
    private String greyEndtimeStr;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("GreyNum")
    private Integer greyNum;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("GreyUrl")
    private String greyUrl;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Id")
    private Long id;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Memo")
    private String memo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Modifier")
    private String modifier;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PackageId")
    private Long packageId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Percent")
    private Integer percent;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Platform")
    private String platform;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProductId")
    private String productId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProductVersion")
    private String productVersion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PublishMode")
    private Integer publishMode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PublishType")
    private Integer publishType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ReleaseVersion")
    private String releaseVersion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResIds")
    private String resIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SerialVersionUID")
    private Long serialVersionUID;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Status")
    private Integer status;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SyncMode")
    private String syncMode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SyncResult")
    private String syncResult;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TaskName")
    private String taskName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TaskStatus")
    private Integer taskStatus;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TaskType")
    private Integer taskType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TaskVersion")
    private Long taskVersion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TenantId")
    private String tenantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UpgradeNoticeNum")
    private Long upgradeNoticeNum;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UpgradeProgress")
    private String upgradeProgress;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WhitelistIds")
    private String whitelistIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private CreateMcubeNebulaTaskRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.appCode = builder.appCode;
        this.appId = builder.appId;
        this.bizType = builder.bizType;
        this.creator = builder.creator;
        this.gmtCreate = builder.gmtCreate;
        this.gmtModified = builder.gmtModified;
        this.gmtModifiedStr = builder.gmtModifiedStr;
        this.greyConfigInfo = builder.greyConfigInfo;
        this.greyEndtime = builder.greyEndtime;
        this.greyEndtimeData = builder.greyEndtimeData;
        this.greyEndtimeStr = builder.greyEndtimeStr;
        this.greyNum = builder.greyNum;
        this.greyUrl = builder.greyUrl;
        this.id = builder.id;
        this.memo = builder.memo;
        this.modifier = builder.modifier;
        this.packageId = builder.packageId;
        this.percent = builder.percent;
        this.platform = builder.platform;
        this.productId = builder.productId;
        this.productVersion = builder.productVersion;
        this.publishMode = builder.publishMode;
        this.publishType = builder.publishType;
        this.releaseVersion = builder.releaseVersion;
        this.resIds = builder.resIds;
        this.serialVersionUID = builder.serialVersionUID;
        this.status = builder.status;
        this.syncMode = builder.syncMode;
        this.syncResult = builder.syncResult;
        this.taskName = builder.taskName;
        this.taskStatus = builder.taskStatus;
        this.taskType = builder.taskType;
        this.taskVersion = builder.taskVersion;
        this.tenantId = builder.tenantId;
        this.upgradeNoticeNum = builder.upgradeNoticeNum;
        this.upgradeProgress = builder.upgradeProgress;
        this.whitelistIds = builder.whitelistIds;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMcubeNebulaTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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
     * @return bizType
     */
    public String getBizType() {
        return this.bizType;
    }

    /**
     * @return creator
     */
    public String getCreator() {
        return this.creator;
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
     * @return gmtModifiedStr
     */
    public String getGmtModifiedStr() {
        return this.gmtModifiedStr;
    }

    /**
     * @return greyConfigInfo
     */
    public String getGreyConfigInfo() {
        return this.greyConfigInfo;
    }

    /**
     * @return greyEndtime
     */
    public String getGreyEndtime() {
        return this.greyEndtime;
    }

    /**
     * @return greyEndtimeData
     */
    public String getGreyEndtimeData() {
        return this.greyEndtimeData;
    }

    /**
     * @return greyEndtimeStr
     */
    public String getGreyEndtimeStr() {
        return this.greyEndtimeStr;
    }

    /**
     * @return greyNum
     */
    public Integer getGreyNum() {
        return this.greyNum;
    }

    /**
     * @return greyUrl
     */
    public String getGreyUrl() {
        return this.greyUrl;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return memo
     */
    public String getMemo() {
        return this.memo;
    }

    /**
     * @return modifier
     */
    public String getModifier() {
        return this.modifier;
    }

    /**
     * @return packageId
     */
    public Long getPackageId() {
        return this.packageId;
    }

    /**
     * @return percent
     */
    public Integer getPercent() {
        return this.percent;
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
    public Integer getPublishMode() {
        return this.publishMode;
    }

    /**
     * @return publishType
     */
    public Integer getPublishType() {
        return this.publishType;
    }

    /**
     * @return releaseVersion
     */
    public String getReleaseVersion() {
        return this.releaseVersion;
    }

    /**
     * @return resIds
     */
    public String getResIds() {
        return this.resIds;
    }

    /**
     * @return serialVersionUID
     */
    public Long getSerialVersionUID() {
        return this.serialVersionUID;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
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
     * @return taskName
     */
    public String getTaskName() {
        return this.taskName;
    }

    /**
     * @return taskStatus
     */
    public Integer getTaskStatus() {
        return this.taskStatus;
    }

    /**
     * @return taskType
     */
    public Integer getTaskType() {
        return this.taskType;
    }

    /**
     * @return taskVersion
     */
    public Long getTaskVersion() {
        return this.taskVersion;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * @return upgradeNoticeNum
     */
    public Long getUpgradeNoticeNum() {
        return this.upgradeNoticeNum;
    }

    /**
     * @return upgradeProgress
     */
    public String getUpgradeProgress() {
        return this.upgradeProgress;
    }

    /**
     * @return whitelistIds
     */
    public String getWhitelistIds() {
        return this.whitelistIds;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<CreateMcubeNebulaTaskRequest, Builder> {
        private String regionId; 
        private String appCode; 
        private String appId; 
        private String bizType; 
        private String creator; 
        private String gmtCreate; 
        private String gmtModified; 
        private String gmtModifiedStr; 
        private String greyConfigInfo; 
        private String greyEndtime; 
        private String greyEndtimeData; 
        private String greyEndtimeStr; 
        private Integer greyNum; 
        private String greyUrl; 
        private Long id; 
        private String memo; 
        private String modifier; 
        private Long packageId; 
        private Integer percent; 
        private String platform; 
        private String productId; 
        private String productVersion; 
        private Integer publishMode; 
        private Integer publishType; 
        private String releaseVersion; 
        private String resIds; 
        private Long serialVersionUID; 
        private Integer status; 
        private String syncMode; 
        private String syncResult; 
        private String taskName; 
        private Integer taskStatus; 
        private Integer taskType; 
        private Long taskVersion; 
        private String tenantId; 
        private Long upgradeNoticeNum; 
        private String upgradeProgress; 
        private String whitelistIds; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(CreateMcubeNebulaTaskRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.appCode = request.appCode;
            this.appId = request.appId;
            this.bizType = request.bizType;
            this.creator = request.creator;
            this.gmtCreate = request.gmtCreate;
            this.gmtModified = request.gmtModified;
            this.gmtModifiedStr = request.gmtModifiedStr;
            this.greyConfigInfo = request.greyConfigInfo;
            this.greyEndtime = request.greyEndtime;
            this.greyEndtimeData = request.greyEndtimeData;
            this.greyEndtimeStr = request.greyEndtimeStr;
            this.greyNum = request.greyNum;
            this.greyUrl = request.greyUrl;
            this.id = request.id;
            this.memo = request.memo;
            this.modifier = request.modifier;
            this.packageId = request.packageId;
            this.percent = request.percent;
            this.platform = request.platform;
            this.productId = request.productId;
            this.productVersion = request.productVersion;
            this.publishMode = request.publishMode;
            this.publishType = request.publishType;
            this.releaseVersion = request.releaseVersion;
            this.resIds = request.resIds;
            this.serialVersionUID = request.serialVersionUID;
            this.status = request.status;
            this.syncMode = request.syncMode;
            this.syncResult = request.syncResult;
            this.taskName = request.taskName;
            this.taskStatus = request.taskStatus;
            this.taskType = request.taskType;
            this.taskVersion = request.taskVersion;
            this.tenantId = request.tenantId;
            this.upgradeNoticeNum = request.upgradeNoticeNum;
            this.upgradeProgress = request.upgradeProgress;
            this.whitelistIds = request.whitelistIds;
            this.workspaceId = request.workspaceId;
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
         * AppCode.
         */
        public Builder appCode(String appCode) {
            this.putBodyParameter("AppCode", appCode);
            this.appCode = appCode;
            return this;
        }

        /**
         * AppId.
         */
        public Builder appId(String appId) {
            this.putBodyParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * BizType.
         */
        public Builder bizType(String bizType) {
            this.putBodyParameter("BizType", bizType);
            this.bizType = bizType;
            return this;
        }

        /**
         * Creator.
         */
        public Builder creator(String creator) {
            this.putBodyParameter("Creator", creator);
            this.creator = creator;
            return this;
        }

        /**
         * GmtCreate.
         */
        public Builder gmtCreate(String gmtCreate) {
            this.putBodyParameter("GmtCreate", gmtCreate);
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * GmtModified.
         */
        public Builder gmtModified(String gmtModified) {
            this.putBodyParameter("GmtModified", gmtModified);
            this.gmtModified = gmtModified;
            return this;
        }

        /**
         * GmtModifiedStr.
         */
        public Builder gmtModifiedStr(String gmtModifiedStr) {
            this.putBodyParameter("GmtModifiedStr", gmtModifiedStr);
            this.gmtModifiedStr = gmtModifiedStr;
            return this;
        }

        /**
         * GreyConfigInfo.
         */
        public Builder greyConfigInfo(String greyConfigInfo) {
            this.putBodyParameter("GreyConfigInfo", greyConfigInfo);
            this.greyConfigInfo = greyConfigInfo;
            return this;
        }

        /**
         * GreyEndtime.
         */
        public Builder greyEndtime(String greyEndtime) {
            this.putBodyParameter("GreyEndtime", greyEndtime);
            this.greyEndtime = greyEndtime;
            return this;
        }

        /**
         * GreyEndtimeData.
         */
        public Builder greyEndtimeData(String greyEndtimeData) {
            this.putBodyParameter("GreyEndtimeData", greyEndtimeData);
            this.greyEndtimeData = greyEndtimeData;
            return this;
        }

        /**
         * GreyEndtimeStr.
         */
        public Builder greyEndtimeStr(String greyEndtimeStr) {
            this.putBodyParameter("GreyEndtimeStr", greyEndtimeStr);
            this.greyEndtimeStr = greyEndtimeStr;
            return this;
        }

        /**
         * GreyNum.
         */
        public Builder greyNum(Integer greyNum) {
            this.putBodyParameter("GreyNum", greyNum);
            this.greyNum = greyNum;
            return this;
        }

        /**
         * GreyUrl.
         */
        public Builder greyUrl(String greyUrl) {
            this.putBodyParameter("GreyUrl", greyUrl);
            this.greyUrl = greyUrl;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(Long id) {
            this.putBodyParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * Memo.
         */
        public Builder memo(String memo) {
            this.putBodyParameter("Memo", memo);
            this.memo = memo;
            return this;
        }

        /**
         * Modifier.
         */
        public Builder modifier(String modifier) {
            this.putBodyParameter("Modifier", modifier);
            this.modifier = modifier;
            return this;
        }

        /**
         * PackageId.
         */
        public Builder packageId(Long packageId) {
            this.putBodyParameter("PackageId", packageId);
            this.packageId = packageId;
            return this;
        }

        /**
         * Percent.
         */
        public Builder percent(Integer percent) {
            this.putBodyParameter("Percent", percent);
            this.percent = percent;
            return this;
        }

        /**
         * Platform.
         */
        public Builder platform(String platform) {
            this.putBodyParameter("Platform", platform);
            this.platform = platform;
            return this;
        }

        /**
         * ProductId.
         */
        public Builder productId(String productId) {
            this.putBodyParameter("ProductId", productId);
            this.productId = productId;
            return this;
        }

        /**
         * ProductVersion.
         */
        public Builder productVersion(String productVersion) {
            this.putBodyParameter("ProductVersion", productVersion);
            this.productVersion = productVersion;
            return this;
        }

        /**
         * PublishMode.
         */
        public Builder publishMode(Integer publishMode) {
            this.putBodyParameter("PublishMode", publishMode);
            this.publishMode = publishMode;
            return this;
        }

        /**
         * PublishType.
         */
        public Builder publishType(Integer publishType) {
            this.putBodyParameter("PublishType", publishType);
            this.publishType = publishType;
            return this;
        }

        /**
         * ReleaseVersion.
         */
        public Builder releaseVersion(String releaseVersion) {
            this.putBodyParameter("ReleaseVersion", releaseVersion);
            this.releaseVersion = releaseVersion;
            return this;
        }

        /**
         * ResIds.
         */
        public Builder resIds(String resIds) {
            this.putBodyParameter("ResIds", resIds);
            this.resIds = resIds;
            return this;
        }

        /**
         * SerialVersionUID.
         */
        public Builder serialVersionUID(Long serialVersionUID) {
            this.putBodyParameter("SerialVersionUID", serialVersionUID);
            this.serialVersionUID = serialVersionUID;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(Integer status) {
            this.putBodyParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * SyncMode.
         */
        public Builder syncMode(String syncMode) {
            this.putBodyParameter("SyncMode", syncMode);
            this.syncMode = syncMode;
            return this;
        }

        /**
         * SyncResult.
         */
        public Builder syncResult(String syncResult) {
            this.putBodyParameter("SyncResult", syncResult);
            this.syncResult = syncResult;
            return this;
        }

        /**
         * TaskName.
         */
        public Builder taskName(String taskName) {
            this.putBodyParameter("TaskName", taskName);
            this.taskName = taskName;
            return this;
        }

        /**
         * TaskStatus.
         */
        public Builder taskStatus(Integer taskStatus) {
            this.putBodyParameter("TaskStatus", taskStatus);
            this.taskStatus = taskStatus;
            return this;
        }

        /**
         * TaskType.
         */
        public Builder taskType(Integer taskType) {
            this.putBodyParameter("TaskType", taskType);
            this.taskType = taskType;
            return this;
        }

        /**
         * TaskVersion.
         */
        public Builder taskVersion(Long taskVersion) {
            this.putBodyParameter("TaskVersion", taskVersion);
            this.taskVersion = taskVersion;
            return this;
        }

        /**
         * TenantId.
         */
        public Builder tenantId(String tenantId) {
            this.putBodyParameter("TenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        /**
         * UpgradeNoticeNum.
         */
        public Builder upgradeNoticeNum(Long upgradeNoticeNum) {
            this.putBodyParameter("UpgradeNoticeNum", upgradeNoticeNum);
            this.upgradeNoticeNum = upgradeNoticeNum;
            return this;
        }

        /**
         * UpgradeProgress.
         */
        public Builder upgradeProgress(String upgradeProgress) {
            this.putBodyParameter("UpgradeProgress", upgradeProgress);
            this.upgradeProgress = upgradeProgress;
            return this;
        }

        /**
         * WhitelistIds.
         */
        public Builder whitelistIds(String whitelistIds) {
            this.putBodyParameter("WhitelistIds", whitelistIds);
            this.whitelistIds = whitelistIds;
            return this;
        }

        /**
         * WorkspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.putBodyParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public CreateMcubeNebulaTaskRequest build() {
            return new CreateMcubeNebulaTaskRequest(this);
        } 

    } 

}
