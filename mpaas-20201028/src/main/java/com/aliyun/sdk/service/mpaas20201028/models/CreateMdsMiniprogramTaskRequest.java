// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateMdsMiniprogramTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateMdsMiniprogramTaskRequest</p>
 */
public class CreateMdsMiniprogramTaskRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("AppId")
    private String appId;

    @Body
    @NameInMap("GreyConfigInfo")
    private String greyConfigInfo;

    @Body
    @NameInMap("GreyEndtimeData")
    private String greyEndtimeData;

    @Body
    @NameInMap("GreyNum")
    private String greyNum;

    @Body
    @NameInMap("Id")
    @Validation(required = true)
    private Long id;

    @Body
    @NameInMap("Memo")
    private String memo;

    @Body
    @NameInMap("PackageId")
    @Validation(required = true)
    private Long packageId;

    @Body
    @NameInMap("PublishMode")
    private String publishMode;

    @Body
    @NameInMap("PublishType")
    @Validation(required = true)
    private Long publishType;

    @Body
    @NameInMap("SyncMode")
    private String syncMode;

    @Body
    @NameInMap("TenantId")
    private String tenantId;

    @Body
    @NameInMap("WhitelistIds")
    private String whitelistIds;

    @Body
    @NameInMap("WorkspaceId")
    private String workspaceId;

    private CreateMdsMiniprogramTaskRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.appId = builder.appId;
        this.greyConfigInfo = builder.greyConfigInfo;
        this.greyEndtimeData = builder.greyEndtimeData;
        this.greyNum = builder.greyNum;
        this.id = builder.id;
        this.memo = builder.memo;
        this.packageId = builder.packageId;
        this.publishMode = builder.publishMode;
        this.publishType = builder.publishType;
        this.syncMode = builder.syncMode;
        this.tenantId = builder.tenantId;
        this.whitelistIds = builder.whitelistIds;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMdsMiniprogramTaskRequest create() {
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
    public String getGreyNum() {
        return this.greyNum;
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
     * @return packageId
     */
    public Long getPackageId() {
        return this.packageId;
    }

    /**
     * @return publishMode
     */
    public String getPublishMode() {
        return this.publishMode;
    }

    /**
     * @return publishType
     */
    public Long getPublishType() {
        return this.publishType;
    }

    /**
     * @return syncMode
     */
    public String getSyncMode() {
        return this.syncMode;
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

    public static final class Builder extends Request.Builder<CreateMdsMiniprogramTaskRequest, Builder> {
        private String regionId; 
        private String appId; 
        private String greyConfigInfo; 
        private String greyEndtimeData; 
        private String greyNum; 
        private Long id; 
        private String memo; 
        private Long packageId; 
        private String publishMode; 
        private Long publishType; 
        private String syncMode; 
        private String tenantId; 
        private String whitelistIds; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(CreateMdsMiniprogramTaskRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.appId = request.appId;
            this.greyConfigInfo = request.greyConfigInfo;
            this.greyEndtimeData = request.greyEndtimeData;
            this.greyNum = request.greyNum;
            this.id = request.id;
            this.memo = request.memo;
            this.packageId = request.packageId;
            this.publishMode = request.publishMode;
            this.publishType = request.publishType;
            this.syncMode = request.syncMode;
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
        public Builder greyNum(String greyNum) {
            this.putBodyParameter("GreyNum", greyNum);
            this.greyNum = greyNum;
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
        public Builder publishMode(String publishMode) {
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
         * SyncMode.
         */
        public Builder syncMode(String syncMode) {
            this.putBodyParameter("SyncMode", syncMode);
            this.syncMode = syncMode;
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
        public CreateMdsMiniprogramTaskRequest build() {
            return new CreateMdsMiniprogramTaskRequest(this);
        } 

    } 

}
