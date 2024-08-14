// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetProjectResponseBody} extends {@link TeaModel}
 *
 * <p>GetProjectResponseBody</p>
 */
public class GetProjectResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetProjectResponseBody(Builder builder) {
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetProjectResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Data data; 
        private Integer httpStatusCode; 
        private String requestId; 
        private Boolean success; 

        /**
         * The information about the workspace.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The HTTP status code.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false**
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetProjectResponseBody build() {
            return new GetProjectResponseBody(this);
        } 

    } 

    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * The tag key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The tag value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Appkey")
        private String appkey;

        @com.aliyun.core.annotation.NameInMap("BaseProject")
        private Boolean baseProject;

        @com.aliyun.core.annotation.NameInMap("DefaultDiResourceGroupIdentifier")
        private String defaultDiResourceGroupIdentifier;

        @com.aliyun.core.annotation.NameInMap("Destination")
        private Integer destination;

        @com.aliyun.core.annotation.NameInMap("DevStorageQuota")
        private String devStorageQuota;

        @com.aliyun.core.annotation.NameInMap("DevelopmentType")
        private Integer developmentType;

        @com.aliyun.core.annotation.NameInMap("DisableDevelopment")
        private Boolean disableDevelopment;

        @com.aliyun.core.annotation.NameInMap("EnvTypes")
        private java.util.List < String > envTypes;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("IsAllowDownload")
        private Integer isAllowDownload;

        @com.aliyun.core.annotation.NameInMap("IsDefault")
        private Integer isDefault;

        @com.aliyun.core.annotation.NameInMap("MaxFlowNode")
        private Integer maxFlowNode;

        @com.aliyun.core.annotation.NameInMap("ProdStorageQuota")
        private String prodStorageQuota;

        @com.aliyun.core.annotation.NameInMap("ProjectDescription")
        private String projectDescription;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private Integer projectId;

        @com.aliyun.core.annotation.NameInMap("ProjectIdentifier")
        private String projectIdentifier;

        @com.aliyun.core.annotation.NameInMap("ProjectMode")
        private Integer projectMode;

        @com.aliyun.core.annotation.NameInMap("ProjectName")
        private String projectName;

        @com.aliyun.core.annotation.NameInMap("ProjectOwnerBaseId")
        private String projectOwnerBaseId;

        @com.aliyun.core.annotation.NameInMap("ProtectedMode")
        private Integer protectedMode;

        @com.aliyun.core.annotation.NameInMap("ResidentArea")
        private String residentArea;

        @com.aliyun.core.annotation.NameInMap("ResourceManagerResourceGroupId")
        private String resourceManagerResourceGroupId;

        @com.aliyun.core.annotation.NameInMap("SchedulerMaxRetryTimes")
        private Integer schedulerMaxRetryTimes;

        @com.aliyun.core.annotation.NameInMap("SchedulerRetryInterval")
        private Integer schedulerRetryInterval;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("TablePrivacyMode")
        private Integer tablePrivacyMode;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List < Tags> tags;

        @com.aliyun.core.annotation.NameInMap("TenantId")
        private Long tenantId;

        @com.aliyun.core.annotation.NameInMap("UseProxyOdpsAccount")
        private Boolean useProxyOdpsAccount;

        private Data(Builder builder) {
            this.appkey = builder.appkey;
            this.baseProject = builder.baseProject;
            this.defaultDiResourceGroupIdentifier = builder.defaultDiResourceGroupIdentifier;
            this.destination = builder.destination;
            this.devStorageQuota = builder.devStorageQuota;
            this.developmentType = builder.developmentType;
            this.disableDevelopment = builder.disableDevelopment;
            this.envTypes = builder.envTypes;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.isAllowDownload = builder.isAllowDownload;
            this.isDefault = builder.isDefault;
            this.maxFlowNode = builder.maxFlowNode;
            this.prodStorageQuota = builder.prodStorageQuota;
            this.projectDescription = builder.projectDescription;
            this.projectId = builder.projectId;
            this.projectIdentifier = builder.projectIdentifier;
            this.projectMode = builder.projectMode;
            this.projectName = builder.projectName;
            this.projectOwnerBaseId = builder.projectOwnerBaseId;
            this.protectedMode = builder.protectedMode;
            this.residentArea = builder.residentArea;
            this.resourceManagerResourceGroupId = builder.resourceManagerResourceGroupId;
            this.schedulerMaxRetryTimes = builder.schedulerMaxRetryTimes;
            this.schedulerRetryInterval = builder.schedulerRetryInterval;
            this.status = builder.status;
            this.tablePrivacyMode = builder.tablePrivacyMode;
            this.tags = builder.tags;
            this.tenantId = builder.tenantId;
            this.useProxyOdpsAccount = builder.useProxyOdpsAccount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return appkey
         */
        public String getAppkey() {
            return this.appkey;
        }

        /**
         * @return baseProject
         */
        public Boolean getBaseProject() {
            return this.baseProject;
        }

        /**
         * @return defaultDiResourceGroupIdentifier
         */
        public String getDefaultDiResourceGroupIdentifier() {
            return this.defaultDiResourceGroupIdentifier;
        }

        /**
         * @return destination
         */
        public Integer getDestination() {
            return this.destination;
        }

        /**
         * @return devStorageQuota
         */
        public String getDevStorageQuota() {
            return this.devStorageQuota;
        }

        /**
         * @return developmentType
         */
        public Integer getDevelopmentType() {
            return this.developmentType;
        }

        /**
         * @return disableDevelopment
         */
        public Boolean getDisableDevelopment() {
            return this.disableDevelopment;
        }

        /**
         * @return envTypes
         */
        public java.util.List < String > getEnvTypes() {
            return this.envTypes;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return isAllowDownload
         */
        public Integer getIsAllowDownload() {
            return this.isAllowDownload;
        }

        /**
         * @return isDefault
         */
        public Integer getIsDefault() {
            return this.isDefault;
        }

        /**
         * @return maxFlowNode
         */
        public Integer getMaxFlowNode() {
            return this.maxFlowNode;
        }

        /**
         * @return prodStorageQuota
         */
        public String getProdStorageQuota() {
            return this.prodStorageQuota;
        }

        /**
         * @return projectDescription
         */
        public String getProjectDescription() {
            return this.projectDescription;
        }

        /**
         * @return projectId
         */
        public Integer getProjectId() {
            return this.projectId;
        }

        /**
         * @return projectIdentifier
         */
        public String getProjectIdentifier() {
            return this.projectIdentifier;
        }

        /**
         * @return projectMode
         */
        public Integer getProjectMode() {
            return this.projectMode;
        }

        /**
         * @return projectName
         */
        public String getProjectName() {
            return this.projectName;
        }

        /**
         * @return projectOwnerBaseId
         */
        public String getProjectOwnerBaseId() {
            return this.projectOwnerBaseId;
        }

        /**
         * @return protectedMode
         */
        public Integer getProtectedMode() {
            return this.protectedMode;
        }

        /**
         * @return residentArea
         */
        public String getResidentArea() {
            return this.residentArea;
        }

        /**
         * @return resourceManagerResourceGroupId
         */
        public String getResourceManagerResourceGroupId() {
            return this.resourceManagerResourceGroupId;
        }

        /**
         * @return schedulerMaxRetryTimes
         */
        public Integer getSchedulerMaxRetryTimes() {
            return this.schedulerMaxRetryTimes;
        }

        /**
         * @return schedulerRetryInterval
         */
        public Integer getSchedulerRetryInterval() {
            return this.schedulerRetryInterval;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return tablePrivacyMode
         */
        public Integer getTablePrivacyMode() {
            return this.tablePrivacyMode;
        }

        /**
         * @return tags
         */
        public java.util.List < Tags> getTags() {
            return this.tags;
        }

        /**
         * @return tenantId
         */
        public Long getTenantId() {
            return this.tenantId;
        }

        /**
         * @return useProxyOdpsAccount
         */
        public Boolean getUseProxyOdpsAccount() {
            return this.useProxyOdpsAccount;
        }

        public static final class Builder {
            private String appkey; 
            private Boolean baseProject; 
            private String defaultDiResourceGroupIdentifier; 
            private Integer destination; 
            private String devStorageQuota; 
            private Integer developmentType; 
            private Boolean disableDevelopment; 
            private java.util.List < String > envTypes; 
            private String gmtCreate; 
            private String gmtModified; 
            private Integer isAllowDownload; 
            private Integer isDefault; 
            private Integer maxFlowNode; 
            private String prodStorageQuota; 
            private String projectDescription; 
            private Integer projectId; 
            private String projectIdentifier; 
            private Integer projectMode; 
            private String projectName; 
            private String projectOwnerBaseId; 
            private Integer protectedMode; 
            private String residentArea; 
            private String resourceManagerResourceGroupId; 
            private Integer schedulerMaxRetryTimes; 
            private Integer schedulerRetryInterval; 
            private Integer status; 
            private Integer tablePrivacyMode; 
            private java.util.List < Tags> tags; 
            private Long tenantId; 
            private Boolean useProxyOdpsAccount; 

            /**
             * This parameter is deprecated.
             */
            public Builder appkey(String appkey) {
                this.appkey = appkey;
                return this;
            }

            /**
             * This parameter is deprecated.
             */
            public Builder baseProject(Boolean baseProject) {
                this.baseProject = baseProject;
                return this;
            }

            /**
             * The ID of the resource group that was allocated by default when you purchased an exclusive resource group for MaxCompute.
             */
            public Builder defaultDiResourceGroupIdentifier(String defaultDiResourceGroupIdentifier) {
                this.defaultDiResourceGroupIdentifier = defaultDiResourceGroupIdentifier;
                return this;
            }

            /**
             * This parameter is deprecated.
             */
            public Builder destination(Integer destination) {
                this.destination = destination;
                return this;
            }

            /**
             * This parameter is deprecated.
             */
            public Builder devStorageQuota(String devStorageQuota) {
                this.devStorageQuota = devStorageQuota;
                return this;
            }

            /**
             * This parameter is deprecated.
             */
            public Builder developmentType(Integer developmentType) {
                this.developmentType = developmentType;
                return this;
            }

            /**
             * Indicates whether the Develop role is disabled. Valid values:
             * <p>
             * 
             * *   **false** (default)
             * *   **true**
             */
            public Builder disableDevelopment(Boolean disableDevelopment) {
                this.disableDevelopment = disableDevelopment;
                return this;
            }

            /**
             * The environment information of the workspace.
             */
            public Builder envTypes(java.util.List < String > envTypes) {
                this.envTypes = envTypes;
                return this;
            }

            /**
             * The time when the workspace was created. Example: `Dec 3, 2019 9:12:20 PM`.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * The time when the workspace was last modified. Example: `Dec 3, 2019 9:12:20 PM`.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * Indicates whether you are allowed to download the query result from DataStudio. Valid values:
             * <p>
             * 
             * *   **1**: You are allowed to download the query result from DataStudio.
             * *   **0**: You are not allowed to download the query result from DataStudio.
             */
            public Builder isAllowDownload(Integer isAllowDownload) {
                this.isAllowDownload = isAllowDownload;
                return this;
            }

            /**
             * Indicates whether the workspace is a default workspace. Valid values:
             * <p>
             * 
             * *   **1**: The workspace is a default workspace.
             * *   **0**: The workspace is not a default workspace.
             */
            public Builder isDefault(Integer isDefault) {
                this.isDefault = isDefault;
                return this;
            }

            /**
             * This parameter is deprecated.
             */
            public Builder maxFlowNode(Integer maxFlowNode) {
                this.maxFlowNode = maxFlowNode;
                return this;
            }

            /**
             * This parameter is deprecated.
             */
            public Builder prodStorageQuota(String prodStorageQuota) {
                this.prodStorageQuota = prodStorageQuota;
                return this;
            }

            /**
             * The description of the workspace.
             */
            public Builder projectDescription(String projectDescription) {
                this.projectDescription = projectDescription;
                return this;
            }

            /**
             * The ID of the workspace.
             */
            public Builder projectId(Integer projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * The name of the workspace.
             */
            public Builder projectIdentifier(String projectIdentifier) {
                this.projectIdentifier = projectIdentifier;
                return this;
            }

            /**
             * The mode of the workspace. Valid values:
             * <p>
             * 
             * *   **2**: The workspace is in basic mode.
             * *   **3**: The workspace is in standard mode.
             */
            public Builder projectMode(Integer projectMode) {
                this.projectMode = projectMode;
                return this;
            }

            /**
             * The display name of the workspace.
             */
            public Builder projectName(String projectName) {
                this.projectName = projectName;
                return this;
            }

            /**
             * The ID of the Alibaba Cloud account used by the workspace owner.
             */
            public Builder projectOwnerBaseId(String projectOwnerBaseId) {
                this.projectOwnerBaseId = projectOwnerBaseId;
                return this;
            }

            /**
             * Indicates whether the workspace protection feature is enabled. Valid values:
             * <p>
             * 
             * *   **1**: enabled
             * *   **0**: disabled
             */
            public Builder protectedMode(Integer protectedMode) {
                this.protectedMode = protectedMode;
                return this;
            }

            /**
             * The type of the workspace. Valid values:
             * <p>
             * 
             * *   **private**
             * *   **swap**
             */
            public Builder residentArea(String residentArea) {
                this.residentArea = residentArea;
                return this;
            }

            /**
             * The resource group ID.
             */
            public Builder resourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
                this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
                return this;
            }

            /**
             * The default maximum number of automatic reruns that are allowed after an error occurs.
             */
            public Builder schedulerMaxRetryTimes(Integer schedulerMaxRetryTimes) {
                this.schedulerMaxRetryTimes = schedulerMaxRetryTimes;
                return this;
            }

            /**
             * The default interval between automatic reruns after an error occurs. Unit: milliseconds. The maximum interval is 30 minutes. You must pay attention to the conversion between units.
             */
            public Builder schedulerRetryInterval(Integer schedulerRetryInterval) {
                this.schedulerRetryInterval = schedulerRetryInterval;
                return this;
            }

            /**
             * The status of the workspace. Valid values:
             * <p>
             * 
             * *   **0**: AVAILABLE, which indicates that the workspace runs as expected.
             * *   **1**: DELETED, which indicates that the workspace is deleted.
             * *   **2**: INITIALIZING, which indicates that the workspace is being initialized.
             * *   **3**: INIT_FAILED, which indicates that the workspace fails to be initialized.
             * *   **4**: FORBIDDEN, which indicates that the workspace is manually disabled.
             * *   **5**: DELETING, which indicates that the workspace is being deleted.
             * *   **6**: DEL_FAILED, which indicates that the workspace fails to be deleted.
             * *   **7**: FROZEN, which indicates that the workspace is frozen due to overdue payments.
             * *   **8**: UPDATING, which indicates that the workspace is being updated. The workspace enters this state after you associate a new compute engine with the workspace and the compute engine is initialized.
             * *   **9**: UPDATE_FAILED, which indicates that the workspace fails to be updated.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * Indicates whether the MaxCompute tables in the workspace are visible to the users within a tenant. Valid values:
             * <p>
             * 
             * *   **0**: invisible
             * *   **1**: visible
             */
            public Builder tablePrivacyMode(Integer tablePrivacyMode) {
                this.tablePrivacyMode = tablePrivacyMode;
                return this;
            }

            /**
             * The tags added to the workspace.
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * The tenant ID.
             */
            public Builder tenantId(Long tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            /**
             * Indicates whether a proxy account is used to access the MaxCompute compute engine associated with the workspace.
             */
            public Builder useProxyOdpsAccount(Boolean useProxyOdpsAccount) {
                this.useProxyOdpsAccount = useProxyOdpsAccount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
