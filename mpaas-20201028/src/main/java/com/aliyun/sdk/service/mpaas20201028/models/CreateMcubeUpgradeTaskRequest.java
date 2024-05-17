// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateMcubeUpgradeTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateMcubeUpgradeTaskRequest</p>
 */
public class CreateMcubeUpgradeTaskRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppId")
    private String appId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("GreyConfigInfo")
    private String greyConfigInfo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("GreyEndtimeData")
    private String greyEndtimeData;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("GreyNum")
    private Integer greyNum;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("HistoryForce")
    private Integer historyForce;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Memo")
    private String memo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PackageInfoId")
    private Long packageInfoId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PublishMode")
    private Integer publishMode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PublishType")
    private Integer publishType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TenantId")
    private String tenantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UpgradeContent")
    private String upgradeContent;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UpgradeType")
    private Integer upgradeType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WhitelistIds")
    private String whitelistIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private CreateMcubeUpgradeTaskRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.appId = builder.appId;
        this.greyConfigInfo = builder.greyConfigInfo;
        this.greyEndtimeData = builder.greyEndtimeData;
        this.greyNum = builder.greyNum;
        this.historyForce = builder.historyForce;
        this.memo = builder.memo;
        this.packageInfoId = builder.packageInfoId;
        this.publishMode = builder.publishMode;
        this.publishType = builder.publishType;
        this.tenantId = builder.tenantId;
        this.upgradeContent = builder.upgradeContent;
        this.upgradeType = builder.upgradeType;
        this.whitelistIds = builder.whitelistIds;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMcubeUpgradeTaskRequest create() {
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
     * @return appId
     */
    public String getAppId() {
        return this.appId;
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
     * @return greyNum
     */
    public Integer getGreyNum() {
        return this.greyNum;
    }

    /**
     * @return historyForce
     */
    public Integer getHistoryForce() {
        return this.historyForce;
    }

    /**
     * @return memo
     */
    public String getMemo() {
        return this.memo;
    }

    /**
     * @return packageInfoId
     */
    public Long getPackageInfoId() {
        return this.packageInfoId;
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
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
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
    public Integer getUpgradeType() {
        return this.upgradeType;
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

    public static final class Builder extends Request.Builder<CreateMcubeUpgradeTaskRequest, Builder> {
        private String regionId; 
        private String appId; 
        private String greyConfigInfo; 
        private String greyEndtimeData; 
        private Integer greyNum; 
        private Integer historyForce; 
        private String memo; 
        private Long packageInfoId; 
        private Integer publishMode; 
        private Integer publishType; 
        private String tenantId; 
        private String upgradeContent; 
        private Integer upgradeType; 
        private String whitelistIds; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(CreateMcubeUpgradeTaskRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.appId = request.appId;
            this.greyConfigInfo = request.greyConfigInfo;
            this.greyEndtimeData = request.greyEndtimeData;
            this.greyNum = request.greyNum;
            this.historyForce = request.historyForce;
            this.memo = request.memo;
            this.packageInfoId = request.packageInfoId;
            this.publishMode = request.publishMode;
            this.publishType = request.publishType;
            this.tenantId = request.tenantId;
            this.upgradeContent = request.upgradeContent;
            this.upgradeType = request.upgradeType;
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
         * AppId.
         */
        public Builder appId(String appId) {
            this.putBodyParameter("AppId", appId);
            this.appId = appId;
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
         * GreyEndtimeData.
         */
        public Builder greyEndtimeData(String greyEndtimeData) {
            this.putBodyParameter("GreyEndtimeData", greyEndtimeData);
            this.greyEndtimeData = greyEndtimeData;
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
         * HistoryForce.
         */
        public Builder historyForce(Integer historyForce) {
            this.putBodyParameter("HistoryForce", historyForce);
            this.historyForce = historyForce;
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
         * PackageInfoId.
         */
        public Builder packageInfoId(Long packageInfoId) {
            this.putBodyParameter("PackageInfoId", packageInfoId);
            this.packageInfoId = packageInfoId;
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
         * TenantId.
         */
        public Builder tenantId(String tenantId) {
            this.putBodyParameter("TenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        /**
         * UpgradeContent.
         */
        public Builder upgradeContent(String upgradeContent) {
            this.putBodyParameter("UpgradeContent", upgradeContent);
            this.upgradeContent = upgradeContent;
            return this;
        }

        /**
         * UpgradeType.
         */
        public Builder upgradeType(Integer upgradeType) {
            this.putBodyParameter("UpgradeType", upgradeType);
            this.upgradeType = upgradeType;
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
        public CreateMcubeUpgradeTaskRequest build() {
            return new CreateMcubeUpgradeTaskRequest(this);
        } 

    } 

}
