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
    @com.aliyun.core.annotation.NameInMap("AgentImOnlineStatus")
    private String agentImOnlineStatus;

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
    @com.aliyun.core.annotation.NameInMap("AgentPlatformList")
    private java.util.List<String> agentPlatformList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentProvider")
    private String agentProvider;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentProviderList")
    private java.util.List<String> agentProviderList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentTemplateIds")
    private java.util.List<String> agentTemplateIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthUsers")
    private java.util.List<String> authUsers;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizRegionId")
    private String bizRegionId;

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
    @com.aliyun.core.annotation.NameInMap("ManagementStatus")
    private String managementStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModelConfigure")
    private Boolean modelConfigure;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModelTemplateId")
    private String modelTemplateId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OfficeSiteId")
    private String officeSiteId;

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
        this.agentImOnlineStatus = builder.agentImOnlineStatus;
        this.agentInstanceStatuses = builder.agentInstanceStatuses;
        this.agentInstanceVersions = builder.agentInstanceVersions;
        this.agentPlatform = builder.agentPlatform;
        this.agentPlatformList = builder.agentPlatformList;
        this.agentProvider = builder.agentProvider;
        this.agentProviderList = builder.agentProviderList;
        this.agentTemplateIds = builder.agentTemplateIds;
        this.authUsers = builder.authUsers;
        this.bizRegionId = builder.bizRegionId;
        this.bizType = builder.bizType;
        this.channelConfigure = builder.channelConfigure;
        this.deploymentSource = builder.deploymentSource;
        this.desktopIds = builder.desktopIds;
        this.desktopNames = builder.desktopNames;
        this.desktopStatuses = builder.desktopStatuses;
        this.hasAuthUser = builder.hasAuthUser;
        this.hasRisk = builder.hasRisk;
        this.includeRiskInfo = builder.includeRiskInfo;
        this.managementStatus = builder.managementStatus;
        this.modelConfigure = builder.modelConfigure;
        this.modelTemplateId = builder.modelTemplateId;
        this.officeSiteId = builder.officeSiteId;
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
     * @return agentImOnlineStatus
     */
    public String getAgentImOnlineStatus() {
        return this.agentImOnlineStatus;
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
     * @return agentPlatformList
     */
    public java.util.List<String> getAgentPlatformList() {
        return this.agentPlatformList;
    }

    /**
     * @return agentProvider
     */
    public String getAgentProvider() {
        return this.agentProvider;
    }

    /**
     * @return agentProviderList
     */
    public java.util.List<String> getAgentProviderList() {
        return this.agentProviderList;
    }

    /**
     * @return agentTemplateIds
     */
    public java.util.List<String> getAgentTemplateIds() {
        return this.agentTemplateIds;
    }

    /**
     * @return authUsers
     */
    public java.util.List<String> getAuthUsers() {
        return this.authUsers;
    }

    /**
     * @return bizRegionId
     */
    public String getBizRegionId() {
        return this.bizRegionId;
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
     * @return managementStatus
     */
    public String getManagementStatus() {
        return this.managementStatus;
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
     * @return officeSiteId
     */
    public String getOfficeSiteId() {
        return this.officeSiteId;
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
        private String agentImOnlineStatus; 
        private java.util.List<String> agentInstanceStatuses; 
        private java.util.List<String> agentInstanceVersions; 
        private String agentPlatform; 
        private java.util.List<String> agentPlatformList; 
        private String agentProvider; 
        private java.util.List<String> agentProviderList; 
        private java.util.List<String> agentTemplateIds; 
        private java.util.List<String> authUsers; 
        private String bizRegionId; 
        private Integer bizType; 
        private Boolean channelConfigure; 
        private String deploymentSource; 
        private java.util.List<String> desktopIds; 
        private java.util.List<String> desktopNames; 
        private java.util.List<String> desktopStatuses; 
        private Boolean hasAuthUser; 
        private Boolean hasRisk; 
        private Boolean includeRiskInfo; 
        private String managementStatus; 
        private Boolean modelConfigure; 
        private String modelTemplateId; 
        private String officeSiteId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String resourceGroupId; 
        private java.util.List<String> resourceIds; 

        private Builder() {
            super();
        } 

        private Builder(ListDesktopAgentRuntimeRequest request) {
            super(request);
            this.agentImOnlineStatus = request.agentImOnlineStatus;
            this.agentInstanceStatuses = request.agentInstanceStatuses;
            this.agentInstanceVersions = request.agentInstanceVersions;
            this.agentPlatform = request.agentPlatform;
            this.agentPlatformList = request.agentPlatformList;
            this.agentProvider = request.agentProvider;
            this.agentProviderList = request.agentProviderList;
            this.agentTemplateIds = request.agentTemplateIds;
            this.authUsers = request.authUsers;
            this.bizRegionId = request.bizRegionId;
            this.bizType = request.bizType;
            this.channelConfigure = request.channelConfigure;
            this.deploymentSource = request.deploymentSource;
            this.desktopIds = request.desktopIds;
            this.desktopNames = request.desktopNames;
            this.desktopStatuses = request.desktopStatuses;
            this.hasAuthUser = request.hasAuthUser;
            this.hasRisk = request.hasRisk;
            this.includeRiskInfo = request.includeRiskInfo;
            this.managementStatus = request.managementStatus;
            this.modelConfigure = request.modelConfigure;
            this.modelTemplateId = request.modelTemplateId;
            this.officeSiteId = request.officeSiteId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceIds = request.resourceIds;
        } 

        /**
         * <p>The agent IM online status filter.</p>
         * 
         * <strong>example:</strong>
         * <p>Online</p>
         */
        public Builder agentImOnlineStatus(String agentImOnlineStatus) {
            this.putQueryParameter("AgentImOnlineStatus", agentImOnlineStatus);
            this.agentImOnlineStatus = agentImOnlineStatus;
            return this;
        }

        /**
         * <p>The list of agent instance statuses.</p>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        public Builder agentInstanceStatuses(java.util.List<String> agentInstanceStatuses) {
            this.putQueryParameter("AgentInstanceStatuses", agentInstanceStatuses);
            this.agentInstanceStatuses = agentInstanceStatuses;
            return this;
        }

        /**
         * <p>The list of agent instance versions.</p>
         * 
         * <strong>example:</strong>
         * <p>OpenClaw 2026.4.15</p>
         */
        public Builder agentInstanceVersions(java.util.List<String> agentInstanceVersions) {
            this.putQueryParameter("AgentInstanceVersions", agentInstanceVersions);
            this.agentInstanceVersions = agentInstanceVersions;
            return this;
        }

        /**
         * <p>The agent platform.</p>
         * 
         * <strong>example:</strong>
         * <p>ENTERPRISE_AGENTIC_COMPUTER</p>
         */
        public Builder agentPlatform(String agentPlatform) {
            this.putQueryParameter("AgentPlatform", agentPlatform);
            this.agentPlatform = agentPlatform;
            return this;
        }

        /**
         * <p>The list of agent platforms. If both AgentPlatformList and AgentPlatform are specified, AgentPlatform takes precedence and this list is ignored.</p>
         * 
         * <strong>example:</strong>
         * <p>ENTERPRISE</p>
         */
        public Builder agentPlatformList(java.util.List<String> agentPlatformList) {
            this.putQueryParameter("AgentPlatformList", agentPlatformList);
            this.agentPlatformList = agentPlatformList;
            return this;
        }

        /**
         * <p>The agent provider name.</p>
         * 
         * <strong>example:</strong>
         * <p>AgenticComputer</p>
         */
        public Builder agentProvider(String agentProvider) {
            this.putQueryParameter("AgentProvider", agentProvider);
            this.agentProvider = agentProvider;
            return this;
        }

        /**
         * <p>The list of agent providers. If both AgentProviderList and AgentProvider are specified, AgentProvider takes precedence and this list is ignored.</p>
         * 
         * <strong>example:</strong>
         * <p>OpenClaw</p>
         */
        public Builder agentProviderList(java.util.List<String> agentProviderList) {
            this.putQueryParameter("AgentProviderList", agentProviderList);
            this.agentProviderList = agentProviderList;
            return this;
        }

        /**
         * <p>The list of agent template IDs. A match occurs only when all valid templates are assigned.</p>
         * 
         * <strong>example:</strong>
         * <p>at-xxxxx</p>
         */
        public Builder agentTemplateIds(java.util.List<String> agentTemplateIds) {
            this.putQueryParameter("AgentTemplateIds", agentTemplateIds);
            this.agentTemplateIds = agentTemplateIds;
            return this;
        }

        /**
         * <p>The list of authorized users.</p>
         * 
         * <strong>example:</strong>
         * <p>user001</p>
         */
        public Builder authUsers(java.util.List<String> authUsers) {
            this.putQueryParameter("AuthUsers", authUsers);
            this.authUsers = authUsers;
            return this;
        }

        /**
         * <p>The business region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder bizRegionId(String bizRegionId) {
            this.putQueryParameter("BizRegionId", bizRegionId);
            this.bizRegionId = bizRegionId;
            return this;
        }

        /**
         * <p>The business type.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder bizType(Integer bizType) {
            this.putQueryParameter("BizType", bizType);
            this.bizType = bizType;
            return this;
        }

        /**
         * <p>Specifies whether a third-party channel is configured.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder channelConfigure(Boolean channelConfigure) {
            this.putQueryParameter("ChannelConfigure", channelConfigure);
            this.channelConfigure = channelConfigure;
            return this;
        }

        /**
         * <p>The deployment source.</p>
         * 
         * <strong>example:</strong>
         * <p>Admin</p>
         */
        public Builder deploymentSource(String deploymentSource) {
            this.putQueryParameter("DeploymentSource", deploymentSource);
            this.deploymentSource = deploymentSource;
            return this;
        }

        /**
         * <p>The list of agent runtime IDs.</p>
         * 
         * <strong>example:</strong>
         * <p>jvs-xxxxx</p>
         */
        public Builder desktopIds(java.util.List<String> desktopIds) {
            this.putQueryParameter("DesktopIds", desktopIds);
            this.desktopIds = desktopIds;
            return this;
        }

        /**
         * <p>The list of agent runtime names.</p>
         * 
         * <strong>example:</strong>
         * <p>Desktop001</p>
         */
        public Builder desktopNames(java.util.List<String> desktopNames) {
            this.putQueryParameter("DesktopNames", desktopNames);
            this.desktopNames = desktopNames;
            return this;
        }

        /**
         * <p>The list of Cloud Desktop statuses.</p>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        public Builder desktopStatuses(java.util.List<String> desktopStatuses) {
            this.putQueryParameter("DesktopStatuses", desktopStatuses);
            this.desktopStatuses = desktopStatuses;
            return this;
        }

        /**
         * <p>Indicates whether authorization is granted to an authorized user.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder hasAuthUser(Boolean hasAuthUser) {
            this.putQueryParameter("HasAuthUser", hasAuthUser);
            this.hasAuthUser = hasAuthUser;
            return this;
        }

        /**
         * <p>Specifies whether risks exist. This parameter is used to filter Cloud Desktops with or without risks. It takes effect only when IncludeRiskInfo is set to true.</p>
         * <p>Set this parameter to true to return only records with risks. Set this parameter to false to return only records without risks. If this parameter is not specified, no filtering is applied.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder hasRisk(Boolean hasRisk) {
            this.putQueryParameter("HasRisk", hasRisk);
            this.hasRisk = hasRisk;
            return this;
        }

        /**
         * <p>Specifies whether to query and return risk information. Default value: false. If this parameter is set to true, the RiskInfo field is included in the response, and the HasRisk filter takes effect.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder includeRiskInfo(Boolean includeRiskInfo) {
            this.putQueryParameter("IncludeRiskInfo", includeRiskInfo);
            this.includeRiskInfo = includeRiskInfo;
            return this;
        }

        /**
         * <p>The management status filter, such as Hibernated.</p>
         * 
         * <strong>example:</strong>
         * <p>Hibernated</p>
         */
        public Builder managementStatus(String managementStatus) {
            this.putQueryParameter("ManagementStatus", managementStatus);
            this.managementStatus = managementStatus;
            return this;
        }

        /**
         * <p>Specifies whether a model is configured.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder modelConfigure(Boolean modelConfigure) {
            this.putQueryParameter("ModelConfigure", modelConfigure);
            this.modelConfigure = modelConfigure;
            return this;
        }

        /**
         * <p>The model group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>mt-xxxx</p>
         */
        public Builder modelTemplateId(String modelTemplateId) {
            this.putQueryParameter("ModelTemplateId", modelTemplateId);
            this.modelTemplateId = modelTemplateId;
            return this;
        }

        /**
         * <p>The office network ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou+dir-xxxx</p>
         */
        public Builder officeSiteId(String officeSiteId) {
            this.putQueryParameter("OfficeSiteId", officeSiteId);
            this.officeSiteId = officeSiteId;
            return this;
        }

        /**
         * <p>The page number, starting from 1. Values 0 and 1 return the same result.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-xxxx</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The list of resource IDs (underlying actual resource IDs).</p>
         * 
         * <strong>example:</strong>
         * <p>ecd-xxxxx</p>
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
