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
 * {@link ListDesktopAgentRuntimeResponseBody} extends {@link TeaModel}
 *
 * <p>ListDesktopAgentRuntimeResponseBody</p>
 */
public class ListDesktopAgentRuntimeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListDesktopAgentRuntimeResponseBody(Builder builder) {
        this.data = builder.data;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDesktopAgentRuntimeResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<Data> data; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListDesktopAgentRuntimeResponseBody model) {
            this.data = model.data;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The list of returned result objects.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
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
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListDesktopAgentRuntimeResponseBody build() {
            return new ListDesktopAgentRuntimeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDesktopAgentRuntimeResponseBody} extends {@link TeaModel}
     *
     * <p>ListDesktopAgentRuntimeResponseBody</p>
     */
    public static class AgentImInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgentImOnlineStatus")
        private String agentImOnlineStatus;

        @com.aliyun.core.annotation.NameInMap("AgentImStatus")
        private String agentImStatus;

        @com.aliyun.core.annotation.NameInMap("CloudSpaceStatus")
        private String cloudSpaceStatus;

        private AgentImInfo(Builder builder) {
            this.agentImOnlineStatus = builder.agentImOnlineStatus;
            this.agentImStatus = builder.agentImStatus;
            this.cloudSpaceStatus = builder.cloudSpaceStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AgentImInfo create() {
            return builder().build();
        }

        /**
         * @return agentImOnlineStatus
         */
        public String getAgentImOnlineStatus() {
            return this.agentImOnlineStatus;
        }

        /**
         * @return agentImStatus
         */
        public String getAgentImStatus() {
            return this.agentImStatus;
        }

        /**
         * @return cloudSpaceStatus
         */
        public String getCloudSpaceStatus() {
            return this.cloudSpaceStatus;
        }

        public static final class Builder {
            private String agentImOnlineStatus; 
            private String agentImStatus; 
            private String cloudSpaceStatus; 

            private Builder() {
            } 

            private Builder(AgentImInfo model) {
                this.agentImOnlineStatus = model.agentImOnlineStatus;
                this.agentImStatus = model.agentImStatus;
                this.cloudSpaceStatus = model.cloudSpaceStatus;
            } 

            /**
             * <p>The agent IM online status (Online/Offline). Default value: Offline.</p>
             * 
             * <strong>example:</strong>
             * <p>Online</p>
             */
            public Builder agentImOnlineStatus(String agentImOnlineStatus) {
                this.agentImOnlineStatus = agentImOnlineStatus;
                return this;
            }

            /**
             * <p>The agent IM status.</p>
             * 
             * <strong>example:</strong>
             * <p>Enabled</p>
             */
            public Builder agentImStatus(String agentImStatus) {
                this.agentImStatus = agentImStatus;
                return this;
            }

            /**
             * <p>The CloudSpace status.</p>
             * 
             * <strong>example:</strong>
             * <p>Enabled</p>
             */
            public Builder cloudSpaceStatus(String cloudSpaceStatus) {
                this.cloudSpaceStatus = cloudSpaceStatus;
                return this;
            }

            public AgentImInfo build() {
                return new AgentImInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDesktopAgentRuntimeResponseBody} extends {@link TeaModel}
     *
     * <p>ListDesktopAgentRuntimeResponseBody</p>
     */
    public static class AgentInstanceInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgentInstanceStatus")
        private String agentInstanceStatus;

        @com.aliyun.core.annotation.NameInMap("AgentInstanceVersion")
        private String agentInstanceVersion;

        @com.aliyun.core.annotation.NameInMap("AgentPlatform")
        private String agentPlatform;

        @com.aliyun.core.annotation.NameInMap("AgentProvider")
        private String agentProvider;

        @com.aliyun.core.annotation.NameInMap("ChannelConfigure")
        private Boolean channelConfigure;

        @com.aliyun.core.annotation.NameInMap("ChannelConfiguredList")
        private java.util.List<String> channelConfiguredList;

        @com.aliyun.core.annotation.NameInMap("DeploymentSource")
        private String deploymentSource;

        @com.aliyun.core.annotation.NameInMap("ModelConfigure")
        private Boolean modelConfigure;

        @com.aliyun.core.annotation.NameInMap("ModelTemplateId")
        private String modelTemplateId;

        private AgentInstanceInfoList(Builder builder) {
            this.agentInstanceStatus = builder.agentInstanceStatus;
            this.agentInstanceVersion = builder.agentInstanceVersion;
            this.agentPlatform = builder.agentPlatform;
            this.agentProvider = builder.agentProvider;
            this.channelConfigure = builder.channelConfigure;
            this.channelConfiguredList = builder.channelConfiguredList;
            this.deploymentSource = builder.deploymentSource;
            this.modelConfigure = builder.modelConfigure;
            this.modelTemplateId = builder.modelTemplateId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AgentInstanceInfoList create() {
            return builder().build();
        }

        /**
         * @return agentInstanceStatus
         */
        public String getAgentInstanceStatus() {
            return this.agentInstanceStatus;
        }

        /**
         * @return agentInstanceVersion
         */
        public String getAgentInstanceVersion() {
            return this.agentInstanceVersion;
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
         * @return channelConfigure
         */
        public Boolean getChannelConfigure() {
            return this.channelConfigure;
        }

        /**
         * @return channelConfiguredList
         */
        public java.util.List<String> getChannelConfiguredList() {
            return this.channelConfiguredList;
        }

        /**
         * @return deploymentSource
         */
        public String getDeploymentSource() {
            return this.deploymentSource;
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

        public static final class Builder {
            private String agentInstanceStatus; 
            private String agentInstanceVersion; 
            private String agentPlatform; 
            private String agentProvider; 
            private Boolean channelConfigure; 
            private java.util.List<String> channelConfiguredList; 
            private String deploymentSource; 
            private Boolean modelConfigure; 
            private String modelTemplateId; 

            private Builder() {
            } 

            private Builder(AgentInstanceInfoList model) {
                this.agentInstanceStatus = model.agentInstanceStatus;
                this.agentInstanceVersion = model.agentInstanceVersion;
                this.agentPlatform = model.agentPlatform;
                this.agentProvider = model.agentProvider;
                this.channelConfigure = model.channelConfigure;
                this.channelConfiguredList = model.channelConfiguredList;
                this.deploymentSource = model.deploymentSource;
                this.modelConfigure = model.modelConfigure;
                this.modelTemplateId = model.modelTemplateId;
            } 

            /**
             * <p>The agent instance status.</p>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
             */
            public Builder agentInstanceStatus(String agentInstanceStatus) {
                this.agentInstanceStatus = agentInstanceStatus;
                return this;
            }

            /**
             * <p>The agent instance version.</p>
             * 
             * <strong>example:</strong>
             * <p>2026.3.13</p>
             */
            public Builder agentInstanceVersion(String agentInstanceVersion) {
                this.agentInstanceVersion = agentInstanceVersion;
                return this;
            }

            /**
             * <p>The agent platform.</p>
             * 
             * <strong>example:</strong>
             * <p>ENTERPRISE_AGENTIC_COMPUTER</p>
             */
            public Builder agentPlatform(String agentPlatform) {
                this.agentPlatform = agentPlatform;
                return this;
            }

            /**
             * <p>The agent provider.</p>
             * 
             * <strong>example:</strong>
             * <p>AgenticComputer</p>
             */
            public Builder agentProvider(String agentProvider) {
                this.agentProvider = agentProvider;
                return this;
            }

            /**
             * <p>Indicates whether the agent instance has a third-party channel configured.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder channelConfigure(Boolean channelConfigure) {
                this.channelConfigure = channelConfigure;
                return this;
            }

            /**
             * <p>The list of third-party channels configured for the agent instance.</p>
             */
            public Builder channelConfiguredList(java.util.List<String> channelConfiguredList) {
                this.channelConfiguredList = channelConfiguredList;
                return this;
            }

            /**
             * <p>The deployment source.</p>
             * 
             * <strong>example:</strong>
             * <p>Admin</p>
             */
            public Builder deploymentSource(String deploymentSource) {
                this.deploymentSource = deploymentSource;
                return this;
            }

            /**
             * <p>Indicates whether the agent instance has a model configured.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder modelConfigure(Boolean modelConfigure) {
                this.modelConfigure = modelConfigure;
                return this;
            }

            /**
             * <p>The configured model group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>mt-xxxx</p>
             */
            public Builder modelTemplateId(String modelTemplateId) {
                this.modelTemplateId = modelTemplateId;
                return this;
            }

            public AgentInstanceInfoList build() {
                return new AgentInstanceInfoList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDesktopAgentRuntimeResponseBody} extends {@link TeaModel}
     *
     * <p>ListDesktopAgentRuntimeResponseBody</p>
     */
    public static class ResourceGroup extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupName")
        private String resourceGroupName;

        private ResourceGroup(Builder builder) {
            this.resourceGroupId = builder.resourceGroupId;
            this.resourceGroupName = builder.resourceGroupName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceGroup create() {
            return builder().build();
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return resourceGroupName
         */
        public String getResourceGroupName() {
            return this.resourceGroupName;
        }

        public static final class Builder {
            private String resourceGroupId; 
            private String resourceGroupName; 

            private Builder() {
            } 

            private Builder(ResourceGroup model) {
                this.resourceGroupId = model.resourceGroupId;
                this.resourceGroupName = model.resourceGroupName;
            } 

            /**
             * <p>The resource group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-xxxx</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The resource group name.</p>
             * 
             * <strong>example:</strong>
             * <p>resource-group-001</p>
             */
            public Builder resourceGroupName(String resourceGroupName) {
                this.resourceGroupName = resourceGroupName;
                return this;
            }

            public ResourceGroup build() {
                return new ResourceGroup(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDesktopAgentRuntimeResponseBody} extends {@link TeaModel}
     *
     * <p>ListDesktopAgentRuntimeResponseBody</p>
     */
    public static class RiskInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgentUninstalled")
        private Boolean agentUninstalled;

        @com.aliyun.core.annotation.NameInMap("ChannelModified")
        private Boolean channelModified;

        @com.aliyun.core.annotation.NameInMap("ModelModified")
        private Boolean modelModified;

        private RiskInfo(Builder builder) {
            this.agentUninstalled = builder.agentUninstalled;
            this.channelModified = builder.channelModified;
            this.modelModified = builder.modelModified;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RiskInfo create() {
            return builder().build();
        }

        /**
         * @return agentUninstalled
         */
        public Boolean getAgentUninstalled() {
            return this.agentUninstalled;
        }

        /**
         * @return channelModified
         */
        public Boolean getChannelModified() {
            return this.channelModified;
        }

        /**
         * @return modelModified
         */
        public Boolean getModelModified() {
            return this.modelModified;
        }

        public static final class Builder {
            private Boolean agentUninstalled; 
            private Boolean channelModified; 
            private Boolean modelModified; 

            private Builder() {
            } 

            private Builder(RiskInfo model) {
                this.agentUninstalled = model.agentUninstalled;
                this.channelModified = model.channelModified;
                this.modelModified = model.modelModified;
            } 

            /**
             * <p>Indicates whether the agent has been uninstalled.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder agentUninstalled(Boolean agentUninstalled) {
                this.agentUninstalled = agentUninstalled;
                return this;
            }

            /**
             * <p>Indicates whether the third-party channel configuration has been modified (inconsistent with the configuration distributed by the administrator).</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder channelModified(Boolean channelModified) {
                this.channelModified = channelModified;
                return this;
            }

            /**
             * <p>Indicates whether the model configuration has been modified (inconsistent with the configuration distributed by the administrator).</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder modelModified(Boolean modelModified) {
                this.modelModified = modelModified;
                return this;
            }

            public RiskInfo build() {
                return new RiskInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDesktopAgentRuntimeResponseBody} extends {@link TeaModel}
     *
     * <p>ListDesktopAgentRuntimeResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgentImInfo")
        private AgentImInfo agentImInfo;

        @com.aliyun.core.annotation.NameInMap("AgentInstanceInfoList")
        private java.util.List<AgentInstanceInfoList> agentInstanceInfoList;

        @com.aliyun.core.annotation.NameInMap("AuthUsers")
        private java.util.List<String> authUsers;

        @com.aliyun.core.annotation.NameInMap("ChannelConfigure")
        private Boolean channelConfigure;

        @com.aliyun.core.annotation.NameInMap("ChannelConfiguredList")
        private java.util.List<String> channelConfiguredList;

        @com.aliyun.core.annotation.NameInMap("DesktopId")
        private String desktopId;

        @com.aliyun.core.annotation.NameInMap("DesktopName")
        private String desktopName;

        @com.aliyun.core.annotation.NameInMap("DesktopStatus")
        private String desktopStatus;

        @com.aliyun.core.annotation.NameInMap("HasAuthUser")
        private Boolean hasAuthUser;

        @com.aliyun.core.annotation.NameInMap("ManagementStatuses")
        private java.util.List<String> managementStatuses;

        @com.aliyun.core.annotation.NameInMap("ModelConfigure")
        private Boolean modelConfigure;

        @com.aliyun.core.annotation.NameInMap("ModelTemplateId")
        private String modelTemplateId;

        @com.aliyun.core.annotation.NameInMap("ModelTemplateName")
        private String modelTemplateName;

        @com.aliyun.core.annotation.NameInMap("OsType")
        private String osType;

        @com.aliyun.core.annotation.NameInMap("QrCodeConfiguringList")
        private java.util.List<String> qrCodeConfiguringList;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("RegionLocation")
        private String regionLocation;

        @com.aliyun.core.annotation.NameInMap("ResourceGroup")
        private ResourceGroup resourceGroup;

        @com.aliyun.core.annotation.NameInMap("ResourceId")
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("RiskInfo")
        private RiskInfo riskInfo;

        private Data(Builder builder) {
            this.agentImInfo = builder.agentImInfo;
            this.agentInstanceInfoList = builder.agentInstanceInfoList;
            this.authUsers = builder.authUsers;
            this.channelConfigure = builder.channelConfigure;
            this.channelConfiguredList = builder.channelConfiguredList;
            this.desktopId = builder.desktopId;
            this.desktopName = builder.desktopName;
            this.desktopStatus = builder.desktopStatus;
            this.hasAuthUser = builder.hasAuthUser;
            this.managementStatuses = builder.managementStatuses;
            this.modelConfigure = builder.modelConfigure;
            this.modelTemplateId = builder.modelTemplateId;
            this.modelTemplateName = builder.modelTemplateName;
            this.osType = builder.osType;
            this.qrCodeConfiguringList = builder.qrCodeConfiguringList;
            this.regionId = builder.regionId;
            this.regionLocation = builder.regionLocation;
            this.resourceGroup = builder.resourceGroup;
            this.resourceId = builder.resourceId;
            this.riskInfo = builder.riskInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return agentImInfo
         */
        public AgentImInfo getAgentImInfo() {
            return this.agentImInfo;
        }

        /**
         * @return agentInstanceInfoList
         */
        public java.util.List<AgentInstanceInfoList> getAgentInstanceInfoList() {
            return this.agentInstanceInfoList;
        }

        /**
         * @return authUsers
         */
        public java.util.List<String> getAuthUsers() {
            return this.authUsers;
        }

        /**
         * @return channelConfigure
         */
        public Boolean getChannelConfigure() {
            return this.channelConfigure;
        }

        /**
         * @return channelConfiguredList
         */
        public java.util.List<String> getChannelConfiguredList() {
            return this.channelConfiguredList;
        }

        /**
         * @return desktopId
         */
        public String getDesktopId() {
            return this.desktopId;
        }

        /**
         * @return desktopName
         */
        public String getDesktopName() {
            return this.desktopName;
        }

        /**
         * @return desktopStatus
         */
        public String getDesktopStatus() {
            return this.desktopStatus;
        }

        /**
         * @return hasAuthUser
         */
        public Boolean getHasAuthUser() {
            return this.hasAuthUser;
        }

        /**
         * @return managementStatuses
         */
        public java.util.List<String> getManagementStatuses() {
            return this.managementStatuses;
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
         * @return modelTemplateName
         */
        public String getModelTemplateName() {
            return this.modelTemplateName;
        }

        /**
         * @return osType
         */
        public String getOsType() {
            return this.osType;
        }

        /**
         * @return qrCodeConfiguringList
         */
        public java.util.List<String> getQrCodeConfiguringList() {
            return this.qrCodeConfiguringList;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return regionLocation
         */
        public String getRegionLocation() {
            return this.regionLocation;
        }

        /**
         * @return resourceGroup
         */
        public ResourceGroup getResourceGroup() {
            return this.resourceGroup;
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        /**
         * @return riskInfo
         */
        public RiskInfo getRiskInfo() {
            return this.riskInfo;
        }

        public static final class Builder {
            private AgentImInfo agentImInfo; 
            private java.util.List<AgentInstanceInfoList> agentInstanceInfoList; 
            private java.util.List<String> authUsers; 
            private Boolean channelConfigure; 
            private java.util.List<String> channelConfiguredList; 
            private String desktopId; 
            private String desktopName; 
            private String desktopStatus; 
            private Boolean hasAuthUser; 
            private java.util.List<String> managementStatuses; 
            private Boolean modelConfigure; 
            private String modelTemplateId; 
            private String modelTemplateName; 
            private String osType; 
            private java.util.List<String> qrCodeConfiguringList; 
            private String regionId; 
            private String regionLocation; 
            private ResourceGroup resourceGroup; 
            private String resourceId; 
            private RiskInfo riskInfo; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.agentImInfo = model.agentImInfo;
                this.agentInstanceInfoList = model.agentInstanceInfoList;
                this.authUsers = model.authUsers;
                this.channelConfigure = model.channelConfigure;
                this.channelConfiguredList = model.channelConfiguredList;
                this.desktopId = model.desktopId;
                this.desktopName = model.desktopName;
                this.desktopStatus = model.desktopStatus;
                this.hasAuthUser = model.hasAuthUser;
                this.managementStatuses = model.managementStatuses;
                this.modelConfigure = model.modelConfigure;
                this.modelTemplateId = model.modelTemplateId;
                this.modelTemplateName = model.modelTemplateName;
                this.osType = model.osType;
                this.qrCodeConfiguringList = model.qrCodeConfiguringList;
                this.regionId = model.regionId;
                this.regionLocation = model.regionLocation;
                this.resourceGroup = model.resourceGroup;
                this.resourceId = model.resourceId;
                this.riskInfo = model.riskInfo;
            } 

            /**
             * <p>The agent IM information.</p>
             */
            public Builder agentImInfo(AgentImInfo agentImInfo) {
                this.agentImInfo = agentImInfo;
                return this;
            }

            /**
             * <p>The list of agent instance information.</p>
             */
            public Builder agentInstanceInfoList(java.util.List<AgentInstanceInfoList> agentInstanceInfoList) {
                this.agentInstanceInfoList = agentInstanceInfoList;
                return this;
            }

            /**
             * <p>The list of authorized users.</p>
             */
            public Builder authUsers(java.util.List<String> authUsers) {
                this.authUsers = authUsers;
                return this;
            }

            /**
             * <p>Indicates whether a third-party channel is configured for the agent runtime.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder channelConfigure(Boolean channelConfigure) {
                this.channelConfigure = channelConfigure;
                return this;
            }

            /**
             * <p>The list of third-party channels configured for the agent runtime.</p>
             */
            public Builder channelConfiguredList(java.util.List<String> channelConfiguredList) {
                this.channelConfiguredList = channelConfiguredList;
                return this;
            }

            /**
             * <p>The agent runtime ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ecd-xxxx</p>
             */
            public Builder desktopId(String desktopId) {
                this.desktopId = desktopId;
                return this;
            }

            /**
             * <p>The agent runtime name.</p>
             * 
             * <strong>example:</strong>
             * <p>Agent-001</p>
             */
            public Builder desktopName(String desktopName) {
                this.desktopName = desktopName;
                return this;
            }

            /**
             * <p>The Cloud Desktop status.</p>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
             */
            public Builder desktopStatus(String desktopStatus) {
                this.desktopStatus = desktopStatus;
                return this;
            }

            /**
             * <p>Indicates whether there is an authorized user with authorization.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder hasAuthUser(Boolean hasAuthUser) {
                this.hasAuthUser = hasAuthUser;
                return this;
            }

            /**
             * <p>The management status list, parsed from the managementStatus combined value.</p>
             */
            public Builder managementStatuses(java.util.List<String> managementStatuses) {
                this.managementStatuses = managementStatuses;
                return this;
            }

            /**
             * <p>Indicates whether a model is configured for the agent runtime.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder modelConfigure(Boolean modelConfigure) {
                this.modelConfigure = modelConfigure;
                return this;
            }

            /**
             * <p>The active model template ID. This parameter is returned only when modelConfigure is set to true.</p>
             * 
             * <strong>example:</strong>
             * <p>mt-xxxx</p>
             */
            public Builder modelTemplateId(String modelTemplateId) {
                this.modelTemplateId = modelTemplateId;
                return this;
            }

            /**
             * <p>The active model template name. This parameter is returned only when modelConfigure is set to true.</p>
             * 
             * <strong>example:</strong>
             * <p>model-template-001</p>
             */
            public Builder modelTemplateName(String modelTemplateName) {
                this.modelTemplateName = modelTemplateName;
                return this;
            }

            /**
             * <p>The operating system type.</p>
             * 
             * <strong>example:</strong>
             * <p>Windows</p>
             */
            public Builder osType(String osType) {
                this.osType = osType;
                return this;
            }

            /**
             * <p>The list of channel codes in QR code configuration.</p>
             */
            public Builder qrCodeConfiguringList(java.util.List<String> qrCodeConfiguringList) {
                this.qrCodeConfiguringList = qrCodeConfiguringList;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The region location (the Chinese mainland or outside the Chinese mainland).</p>
             * 
             * <strong>example:</strong>
             * <p>Mainland</p>
             */
            public Builder regionLocation(String regionLocation) {
                this.regionLocation = regionLocation;
                return this;
            }

            /**
             * <p>The resource group information.</p>
             */
            public Builder resourceGroup(ResourceGroup resourceGroup) {
                this.resourceGroup = resourceGroup;
                return this;
            }

            /**
             * <p>The resource ID, which is the Cloud Desktop ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ecd-xxxx</p>
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * <p>The risk information. This parameter is returned only when the request parameter IncludeRiskInfo is set to true. Otherwise, null is returned.</p>
             */
            public Builder riskInfo(RiskInfo riskInfo) {
                this.riskInfo = riskInfo;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
