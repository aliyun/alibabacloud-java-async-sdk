// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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
 * {@link ListDesktopAgentRuntimeRequest} extends {@link RequestModel}
 *
 * <p>ListDesktopAgentRuntimeRequest</p>
 */
public class ListDesktopAgentRuntimeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentInstanceStatuses")
    private java.util.List<String> agentInstanceStatuses;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentInstanceVersions")
    private java.util.List<String> agentInstanceVersions;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentPlatform")
    private String agentPlatform;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentProvider")
    @com.aliyun.core.annotation.Validation(required = true)
    private String agentProvider;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthUsers")
    private java.util.List<String> authUsers;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizType")
    private Integer bizType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChannelConfigure")
    private Boolean channelConfigure;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeploymentSource")
    private String deploymentSource;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DesktopIds")
    private java.util.List<String> desktopIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DesktopNames")
    private java.util.List<String> desktopNames;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DesktopStatuses")
    private java.util.List<String> desktopStatuses;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HasAuthUser")
    private Boolean hasAuthUser;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HasRisk")
    private Boolean hasRisk;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IncludeRiskInfo")
    private Boolean includeRiskInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModelConfigure")
    private Boolean modelConfigure;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModelTemplateId")
    private String modelTemplateId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceIds")
    private java.util.List<String> resourceIds;

    private ListDesktopAgentRuntimeRequest(Builder builder) {
        super(builder);
        this.agentInstanceStatuses = builder.agentInstanceStatuses;
        this.agentInstanceVersions = builder.agentInstanceVersions;
        this.agentPlatform = builder.agentPlatform;
        this.agentProvider = builder.agentProvider;
        this.authUsers = builder.authUsers;
        this.bizType = builder.bizType;
        this.channelConfigure = builder.channelConfigure;
        this.deploymentSource = builder.deploymentSource;
        this.desktopIds = builder.desktopIds;
        this.desktopNames = builder.desktopNames;
        this.desktopStatuses = builder.desktopStatuses;
        this.hasAuthUser = builder.hasAuthUser;
        this.hasRisk = builder.hasRisk;
        this.includeRiskInfo = builder.includeRiskInfo;
        this.modelConfigure = builder.modelConfigure;
        this.modelTemplateId = builder.modelTemplateId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceIds = builder.resourceIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDesktopAgentRuntimeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentInstanceStatuses
     */
    public java.util.List<String> getAgentInstanceStatuses() {
        return this.agentInstanceStatuses;
    }

    /**
     * @return agentInstanceVersions
     */
    public java.util.List<String> getAgentInstanceVersions() {
        return this.agentInstanceVersions;
    }

    /**
     * @return agentPlatform
     */
    public String getAgentPlatform() {
        return this.agentPlatform;
    }

    /**
     * @return agentProvider
     */
    public String getAgentProvider() {
        return this.agentProvider;
    }

    /**
     * @return authUsers
     */
    public java.util.List<String> getAuthUsers() {
        return this.authUsers;
    }

    /**
     * @return bizType
     */
    public Integer getBizType() {
        return this.bizType;
    }

    /**
     * @return channelConfigure
     */
    public Boolean getChannelConfigure() {
        return this.channelConfigure;
    }

    /**
     * @return deploymentSource
     */
    public String getDeploymentSource() {
        return this.deploymentSource;
    }

    /**
     * @return desktopIds
     */
    public java.util.List<String> getDesktopIds() {
        return this.desktopIds;
    }

    /**
     * @return desktopNames
     */
    public java.util.List<String> getDesktopNames() {
        return this.desktopNames;
    }

    /**
     * @return desktopStatuses
     */
    public java.util.List<String> getDesktopStatuses() {
        return this.desktopStatuses;
    }

    /**
     * @return hasAuthUser
     */
    public Boolean getHasAuthUser() {
        return this.hasAuthUser;
    }

    /**
     * @return hasRisk
     */
    public Boolean getHasRisk() {
        return this.hasRisk;
    }

    /**
     * @return includeRiskInfo
     */
    public Boolean getIncludeRiskInfo() {
        return this.includeRiskInfo;
    }

    /**
     * @return modelConfigure
     */
    public Boolean getModelConfigure() {
        return this.modelConfigure;
    }

    /**
     * @return modelTemplateId
     */
    public String getModelTemplateId() {
        return this.modelTemplateId;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return resourceIds
     */
    public java.util.List<String> getResourceIds() {
        return this.resourceIds;
    }

    public static final class Builder extends Request.Builder<ListDesktopAgentRuntimeRequest, Builder> {
        private java.util.List<String> agentInstanceStatuses; 
        private java.util.List<String> agentInstanceVersions; 
        private String agentPlatform; 
        private String agentProvider; 
        private java.util.List<String> authUsers; 
        private Integer bizType; 
        private Boolean channelConfigure; 
        private String deploymentSource; 
        private java.util.List<String> desktopIds; 
        private java.util.List<String> desktopNames; 
        private java.util.List<String> desktopStatuses; 
        private Boolean hasAuthUser; 
        private Boolean hasRisk; 
        private Boolean includeRiskInfo; 
        private Boolean modelConfigure; 
        private String modelTemplateId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String resourceGroupId; 
        private java.util.List<String> resourceIds; 

        private Builder() {
            super();
        } 

        private Builder(ListDesktopAgentRuntimeRequest request) {
            super(request);
            this.agentInstanceStatuses = request.agentInstanceStatuses;
            this.agentInstanceVersions = request.agentInstanceVersions;
            this.agentPlatform = request.agentPlatform;
            this.agentProvider = request.agentProvider;
            this.authUsers = request.authUsers;
            this.bizType = request.bizType;
            this.channelConfigure = request.channelConfigure;
            this.deploymentSource = request.deploymentSource;
            this.desktopIds = request.desktopIds;
            this.desktopNames = request.desktopNames;
            this.desktopStatuses = request.desktopStatuses;
            this.hasAuthUser = request.hasAuthUser;
            this.hasRisk = request.hasRisk;
            this.includeRiskInfo = request.includeRiskInfo;
            this.modelConfigure = request.modelConfigure;
            this.modelTemplateId = request.modelTemplateId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceIds = request.resourceIds;
        } 

        /**
         * AgentInstanceStatuses.
         */
        public Builder agentInstanceStatuses(java.util.List<String> agentInstanceStatuses) {
            this.putQueryParameter("AgentInstanceStatuses", agentInstanceStatuses);
            this.agentInstanceStatuses = agentInstanceStatuses;
            return this;
        }

        /**
         * AgentInstanceVersions.
         */
        public Builder agentInstanceVersions(java.util.List<String> agentInstanceVersions) {
            this.putQueryParameter("AgentInstanceVersions", agentInstanceVersions);
            this.agentInstanceVersions = agentInstanceVersions;
            return this;
        }

        /**
         * AgentPlatform.
         */
        public Builder agentPlatform(String agentPlatform) {
            this.putQueryParameter("AgentPlatform", agentPlatform);
            this.agentPlatform = agentPlatform;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>OpenClaw</p>
         */
        public Builder agentProvider(String agentProvider) {
            this.putQueryParameter("AgentProvider", agentProvider);
            this.agentProvider = agentProvider;
            return this;
        }

        /**
         * AuthUsers.
         */
        public Builder authUsers(java.util.List<String> authUsers) {
            this.putQueryParameter("AuthUsers", authUsers);
            this.authUsers = authUsers;
            return this;
        }

        /**
         * BizType.
         */
        public Builder bizType(Integer bizType) {
            this.putQueryParameter("BizType", bizType);
            this.bizType = bizType;
            return this;
        }

        /**
         * ChannelConfigure.
         */
        public Builder channelConfigure(Boolean channelConfigure) {
            this.putQueryParameter("ChannelConfigure", channelConfigure);
            this.channelConfigure = channelConfigure;
            return this;
        }

        /**
         * DeploymentSource.
         */
        public Builder deploymentSource(String deploymentSource) {
            this.putQueryParameter("DeploymentSource", deploymentSource);
            this.deploymentSource = deploymentSource;
            return this;
        }

        /**
         * DesktopIds.
         */
        public Builder desktopIds(java.util.List<String> desktopIds) {
            this.putQueryParameter("DesktopIds", desktopIds);
            this.desktopIds = desktopIds;
            return this;
        }

        /**
         * DesktopNames.
         */
        public Builder desktopNames(java.util.List<String> desktopNames) {
            this.putQueryParameter("DesktopNames", desktopNames);
            this.desktopNames = desktopNames;
            return this;
        }

        /**
         * DesktopStatuses.
         */
        public Builder desktopStatuses(java.util.List<String> desktopStatuses) {
            this.putQueryParameter("DesktopStatuses", desktopStatuses);
            this.desktopStatuses = desktopStatuses;
            return this;
        }

        /**
         * HasAuthUser.
         */
        public Builder hasAuthUser(Boolean hasAuthUser) {
            this.putQueryParameter("HasAuthUser", hasAuthUser);
            this.hasAuthUser = hasAuthUser;
            return this;
        }

        /**
         * HasRisk.
         */
        public Builder hasRisk(Boolean hasRisk) {
            this.putQueryParameter("HasRisk", hasRisk);
            this.hasRisk = hasRisk;
            return this;
        }

        /**
         * IncludeRiskInfo.
         */
        public Builder includeRiskInfo(Boolean includeRiskInfo) {
            this.putQueryParameter("IncludeRiskInfo", includeRiskInfo);
            this.includeRiskInfo = includeRiskInfo;
            return this;
        }

        /**
         * ModelConfigure.
         */
        public Builder modelConfigure(Boolean modelConfigure) {
            this.putQueryParameter("ModelConfigure", modelConfigure);
            this.modelConfigure = modelConfigure;
            return this;
        }

        /**
         * ModelTemplateId.
         */
        public Builder modelTemplateId(String modelTemplateId) {
            this.putQueryParameter("ModelTemplateId", modelTemplateId);
            this.modelTemplateId = modelTemplateId;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * ResourceIds.
         */
        public Builder resourceIds(java.util.List<String> resourceIds) {
            this.putQueryParameter("ResourceIds", resourceIds);
            this.resourceIds = resourceIds;
            return this;
        }

        @Override
        public ListDesktopAgentRuntimeRequest build() {
            return new ListDesktopAgentRuntimeRequest(this);
        } 

    } 

}
