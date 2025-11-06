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
 * {@link CreateMdsCubeTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateMdsCubeTaskRequest</p>
 */
public class CreateMdsCubeTaskRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("PublishMode")
    private Integer publishMode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PublishType")
    private Integer publishType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TaskDesc")
    private String taskDesc;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TemplateResourceId")
    private Long templateResourceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TenantId")
    private String tenantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WhitelistIds")
    private String whitelistIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private CreateMdsCubeTaskRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.appId = builder.appId;
        this.greyConfigInfo = builder.greyConfigInfo;
        this.greyEndtimeData = builder.greyEndtimeData;
        this.greyNum = builder.greyNum;
        this.publishMode = builder.publishMode;
        this.publishType = builder.publishType;
        this.taskDesc = builder.taskDesc;
        this.templateResourceId = builder.templateResourceId;
        this.tenantId = builder.tenantId;
        this.whitelistIds = builder.whitelistIds;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMdsCubeTaskRequest create() {
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
     * @return taskDesc
     */
    public String getTaskDesc() {
        return this.taskDesc;
    }

    /**
     * @return templateResourceId
     */
    public Long getTemplateResourceId() {
        return this.templateResourceId;
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

    public static final class Builder extends Request.Builder<CreateMdsCubeTaskRequest, Builder> {
        private String regionId; 
        private String appId; 
        private String greyConfigInfo; 
        private String greyEndtimeData; 
        private Integer greyNum; 
        private Integer publishMode; 
        private Integer publishType; 
        private String taskDesc; 
        private Long templateResourceId; 
        private String tenantId; 
        private String whitelistIds; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(CreateMdsCubeTaskRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.appId = request.appId;
            this.greyConfigInfo = request.greyConfigInfo;
            this.greyEndtimeData = request.greyEndtimeData;
            this.greyNum = request.greyNum;
            this.publishMode = request.publishMode;
            this.publishType = request.publishType;
            this.taskDesc = request.taskDesc;
            this.templateResourceId = request.templateResourceId;
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
        public Builder greyNum(Integer greyNum) {
            this.putBodyParameter("GreyNum", greyNum);
            this.greyNum = greyNum;
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
         * TaskDesc.
         */
        public Builder taskDesc(String taskDesc) {
            this.putBodyParameter("TaskDesc", taskDesc);
            this.taskDesc = taskDesc;
            return this;
        }

        /**
         * TemplateResourceId.
         */
        public Builder templateResourceId(Long templateResourceId) {
            this.putBodyParameter("TemplateResourceId", templateResourceId);
            this.templateResourceId = templateResourceId;
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
        public CreateMdsCubeTaskRequest build() {
            return new CreateMdsCubeTaskRequest(this);
        } 

    } 

}
