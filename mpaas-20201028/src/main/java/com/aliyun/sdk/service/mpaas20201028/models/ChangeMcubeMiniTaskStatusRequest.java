// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ChangeMcubeMiniTaskStatusRequest} extends {@link RequestModel}
 *
 * <p>ChangeMcubeMiniTaskStatusRequest</p>
 */
public class ChangeMcubeMiniTaskStatusRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Body
    @NameInMap("BizType")
    @Validation(required = true)
    private String bizType;

    @Body
    @NameInMap("PackageId")
    @Validation(required = true)
    private Long packageId;

    @Body
    @NameInMap("TaskId")
    @Validation(required = true)
    private Long taskId;

    @Body
    @NameInMap("TaskStatus")
    @Validation(required = true)
    private Long taskStatus;

    @Body
    @NameInMap("TenantId")
    @Validation(required = true)
    private String tenantId;

    @Body
    @NameInMap("WorkspaceId")
    @Validation(required = true)
    private String workspaceId;

    private ChangeMcubeMiniTaskStatusRequest(Builder builder) {
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

    public static ChangeMcubeMiniTaskStatusRequest create() {
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
    public Long getPackageId() {
        return this.packageId;
    }

    /**
     * @return taskId
     */
    public Long getTaskId() {
        return this.taskId;
    }

    /**
     * @return taskStatus
     */
    public Long getTaskStatus() {
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

    public static final class Builder extends Request.Builder<ChangeMcubeMiniTaskStatusRequest, Builder> {
        private String regionId; 
        private String appId; 
        private String bizType; 
        private Long packageId; 
        private Long taskId; 
        private Long taskStatus; 
        private String tenantId; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(ChangeMcubeMiniTaskStatusRequest request) {
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
        public Builder packageId(Long packageId) {
            this.putBodyParameter("PackageId", packageId);
            this.packageId = packageId;
            return this;
        }

        /**
         * TaskId.
         */
        public Builder taskId(Long taskId) {
            this.putBodyParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        /**
         * TaskStatus.
         */
        public Builder taskStatus(Long taskStatus) {
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
        public ChangeMcubeMiniTaskStatusRequest build() {
            return new ChangeMcubeMiniTaskStatusRequest(this);
        } 

    } 

}
