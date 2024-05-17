// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateMcubeMiniTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateMcubeMiniTaskRequest</p>
 */
public class CreateMcubeMiniTaskRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("GreyConfigInfo")
    private String greyConfigInfo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("GreyEndtimeData")
    private String greyEndtimeData;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("GreyNum")
    private Long greyNum;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Memo")
    @com.aliyun.core.annotation.Validation(required = true)
    private String memo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PackageId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long packageId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PublishMode")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long publishMode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PublishType")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long publishType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tenantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WhitelistIds")
    private String whitelistIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private CreateMcubeMiniTaskRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.appId = builder.appId;
        this.greyConfigInfo = builder.greyConfigInfo;
        this.greyEndtimeData = builder.greyEndtimeData;
        this.greyNum = builder.greyNum;
        this.memo = builder.memo;
        this.packageId = builder.packageId;
        this.publishMode = builder.publishMode;
        this.publishType = builder.publishType;
        this.tenantId = builder.tenantId;
        this.whitelistIds = builder.whitelistIds;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMcubeMiniTaskRequest create() {
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
    public Long getGreyNum() {
        return this.greyNum;
    }

    /**
     * @return memo
     */
    public String getMemo() {
        return this.memo;
    }

    /**
     * @return packageId
     */
    public Long getPackageId() {
        return this.packageId;
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
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
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

    public static final class Builder extends Request.Builder<CreateMcubeMiniTaskRequest, Builder> {
        private String regionId; 
        private String appId; 
        private String greyConfigInfo; 
        private String greyEndtimeData; 
        private Long greyNum; 
        private String memo; 
        private Long packageId; 
        private Long publishMode; 
        private Long publishType; 
        private String tenantId; 
        private String whitelistIds; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(CreateMcubeMiniTaskRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.appId = request.appId;
            this.greyConfigInfo = request.greyConfigInfo;
            this.greyEndtimeData = request.greyEndtimeData;
            this.greyNum = request.greyNum;
            this.memo = request.memo;
            this.packageId = request.packageId;
            this.publishMode = request.publishMode;
            this.publishType = request.publishType;
            this.tenantId = request.tenantId;
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
        public Builder greyNum(Long greyNum) {
            this.putBodyParameter("GreyNum", greyNum);
            this.greyNum = greyNum;
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
         * PackageId.
         */
        public Builder packageId(Long packageId) {
            this.putBodyParameter("PackageId", packageId);
            this.packageId = packageId;
            return this;
        }

        /**
         * PublishMode.
         */
        public Builder publishMode(Long publishMode) {
            this.putBodyParameter("PublishMode", publishMode);
            this.publishMode = publishMode;
            return this;
        }

        /**
         * PublishType.
         */
        public Builder publishType(Long publishType) {
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
        public CreateMcubeMiniTaskRequest build() {
            return new CreateMcubeMiniTaskRequest(this);
        } 

    } 

}
