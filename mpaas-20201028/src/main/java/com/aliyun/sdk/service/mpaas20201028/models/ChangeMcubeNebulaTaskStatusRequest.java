// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ChangeMcubeNebulaTaskStatusRequest} extends {@link RequestModel}
 *
 * <p>ChangeMcubeNebulaTaskStatusRequest</p>
 */
public class ChangeMcubeNebulaTaskStatusRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("AppId")
    private String appId;

    @Body
    @NameInMap("BizType")
    private String bizType;

    @Body
    @NameInMap("PackageId")
    private String packageId;

    @Body
    @NameInMap("TaskId")
    private String taskId;

    @Body
    @NameInMap("TaskStatus")
    private Integer taskStatus;

    @Body
    @NameInMap("TenantId")
    private String tenantId;

    @Body
    @NameInMap("WorkspaceId")
    private String workspaceId;

    private ChangeMcubeNebulaTaskStatusRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.appId = builder.appId;
        this.bizType = builder.bizType;
        this.packageId = builder.packageId;
        this.taskId = builder.taskId;
        this.taskStatus = builder.taskStatus;
        this.tenantId = builder.tenantId;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ChangeMcubeNebulaTaskStatusRequest create() {
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
     * @return bizType
     */
    public String getBizType() {
        return this.bizType;
    }

    /**
     * @return packageId
     */
    public String getPackageId() {
        return this.packageId;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return taskStatus
     */
    public Integer getTaskStatus() {
        return this.taskStatus;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<ChangeMcubeNebulaTaskStatusRequest, Builder> {
        private String regionId; 
        private String appId; 
        private String bizType; 
        private String packageId; 
        private String taskId; 
        private Integer taskStatus; 
        private String tenantId; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(ChangeMcubeNebulaTaskStatusRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.appId = request.appId;
            this.bizType = request.bizType;
            this.packageId = request.packageId;
            this.taskId = request.taskId;
            this.taskStatus = request.taskStatus;
            this.tenantId = request.tenantId;
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
         * BizType.
         */
        public Builder bizType(String bizType) {
            this.putBodyParameter("BizType", bizType);
            this.bizType = bizType;
            return this;
        }

        /**
         * PackageId.
         */
        public Builder packageId(String packageId) {
            this.putBodyParameter("PackageId", packageId);
            this.packageId = packageId;
            return this;
        }

        /**
         * TaskId.
         */
        public Builder taskId(String taskId) {
            this.putBodyParameter("TaskId", taskId);
            this.taskId = taskId;
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
         * TenantId.
         */
        public Builder tenantId(String tenantId) {
            this.putBodyParameter("TenantId", tenantId);
            this.tenantId = tenantId;
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
        public ChangeMcubeNebulaTaskStatusRequest build() {
            return new ChangeMcubeNebulaTaskStatusRequest(this);
        } 

    } 

}
