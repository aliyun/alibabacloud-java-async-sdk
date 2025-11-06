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
 * {@link ChangeMdsCubeTaskStatusRequest} extends {@link RequestModel}
 *
 * <p>ChangeMdsCubeTaskStatusRequest</p>
 */
public class ChangeMdsCubeTaskStatusRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppId")
    private String appId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TaskStatus")
    private Integer taskStatus;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TemplateResourceId")
    private Long templateResourceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TemplateTaskId")
    private Long templateTaskId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TenantId")
    private String tenantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private ChangeMdsCubeTaskStatusRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.appId = builder.appId;
        this.taskStatus = builder.taskStatus;
        this.templateResourceId = builder.templateResourceId;
        this.templateTaskId = builder.templateTaskId;
        this.tenantId = builder.tenantId;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ChangeMdsCubeTaskStatusRequest create() {
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
     * @return taskStatus
     */
    public Integer getTaskStatus() {
        return this.taskStatus;
    }

    /**
     * @return templateResourceId
     */
    public Long getTemplateResourceId() {
        return this.templateResourceId;
    }

    /**
     * @return templateTaskId
     */
    public Long getTemplateTaskId() {
        return this.templateTaskId;
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

    public static final class Builder extends Request.Builder<ChangeMdsCubeTaskStatusRequest, Builder> {
        private String regionId; 
        private String appId; 
        private Integer taskStatus; 
        private Long templateResourceId; 
        private Long templateTaskId; 
        private String tenantId; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(ChangeMdsCubeTaskStatusRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.appId = request.appId;
            this.taskStatus = request.taskStatus;
            this.templateResourceId = request.templateResourceId;
            this.templateTaskId = request.templateTaskId;
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
         * TaskStatus.
         */
        public Builder taskStatus(Integer taskStatus) {
            this.putBodyParameter("TaskStatus", taskStatus);
            this.taskStatus = taskStatus;
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
         * TemplateTaskId.
         */
        public Builder templateTaskId(Long templateTaskId) {
            this.putBodyParameter("TemplateTaskId", templateTaskId);
            this.templateTaskId = templateTaskId;
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
        public ChangeMdsCubeTaskStatusRequest build() {
            return new ChangeMdsCubeTaskStatusRequest(this);
        } 

    } 

}
