// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetProjectResponseBody model) {
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The details of the workspace.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1AFAE64E-D1BE-432B-A9****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The request was successful.</li>
         * <li><strong>false</strong>: The request failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetProjectResponseBody build() {
            return new GetProjectResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetProjectResponseBody} extends {@link TeaModel}
     *
     * <p>GetProjectResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Tags model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>key</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>value</p>
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
    /**
     * 
     * {@link GetProjectResponseBody} extends {@link TeaModel}
     *
     * <p>GetProjectResponseBody</p>
     */
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
        private java.util.List<String> envTypes;

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
        private java.util.List<Tags> tags;

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
        public java.util.List<String> getEnvTypes() {
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
        public java.util.List<Tags> getTags() {
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
            private java.util.List<String> envTypes; 
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
            private java.util.List<Tags> tags; 
            private Long tenantId; 
            private Boolean useProxyOdpsAccount; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.appkey = model.appkey;
                this.baseProject = model.baseProject;
                this.defaultDiResourceGroupIdentifier = model.defaultDiResourceGroupIdentifier;
                this.destination = model.destination;
                this.devStorageQuota = model.devStorageQuota;
                this.developmentType = model.developmentType;
                this.disableDevelopment = model.disableDevelopment;
                this.envTypes = model.envTypes;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.isAllowDownload = model.isAllowDownload;
                this.isDefault = model.isDefault;
                this.maxFlowNode = model.maxFlowNode;
                this.prodStorageQuota = model.prodStorageQuota;
                this.projectDescription = model.projectDescription;
                this.projectId = model.projectId;
                this.projectIdentifier = model.projectIdentifier;
                this.projectMode = model.projectMode;
                this.projectName = model.projectName;
                this.projectOwnerBaseId = model.projectOwnerBaseId;
                this.protectedMode = model.protectedMode;
                this.residentArea = model.residentArea;
                this.resourceManagerResourceGroupId = model.resourceManagerResourceGroupId;
                this.schedulerMaxRetryTimes = model.schedulerMaxRetryTimes;
                this.schedulerRetryInterval = model.schedulerRetryInterval;
                this.status = model.status;
                this.tablePrivacyMode = model.tablePrivacyMode;
                this.tags = model.tags;
                this.tenantId = model.tenantId;
                this.useProxyOdpsAccount = model.useProxyOdpsAccount;
            } 

            /**
             * <p>This parameter is deprecated.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder appkey(String appkey) {
                this.appkey = appkey;
                return this;
            }

            /**
             * <p>This parameter is deprecated.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder baseProject(Boolean baseProject) {
                this.baseProject = baseProject;
                return this;
            }

            /**
             * <p>The identifier of the default resource group that is automatically assigned when you purchase a MaxCompute exclusive resource group.</p>
             * 
             * <strong>example:</strong>
             * <p>group_280749521****</p>
             */
            public Builder defaultDiResourceGroupIdentifier(String defaultDiResourceGroupIdentifier) {
                this.defaultDiResourceGroupIdentifier = defaultDiResourceGroupIdentifier;
                return this;
            }

            /**
             * <p>This parameter is deprecated.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder destination(Integer destination) {
                this.destination = destination;
                return this;
            }

            /**
             * <p>This parameter is deprecated.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder devStorageQuota(String devStorageQuota) {
                this.devStorageQuota = devStorageQuota;
                return this;
            }

            /**
             * <p>This parameter is deprecated.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder developmentType(Integer developmentType) {
                this.developmentType = developmentType;
                return this;
            }

            /**
             * <p>Indicates whether the development role is disabled. Valid values:</p>
             * <ul>
             * <li><strong>false</strong> (default): The development role is enabled.</li>
             * <li><strong>true</strong>: The development role is disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder disableDevelopment(Boolean disableDevelopment) {
                this.disableDevelopment = disableDevelopment;
                return this;
            }

            /**
             * <p>The environment context of the workspace.</p>
             */
            public Builder envTypes(java.util.List<String> envTypes) {
                this.envTypes = envTypes;
                return this;
            }

            /**
             * <p>The time when the workspace was created. Example: <code>Dec 3, 2019 9:12:20 PM</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>Oct 10, 2019 3:42:53 PM</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The time when the workspace was last modified. Example: <code>Dec 3, 2019 9:12:20 PM</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>Dec 3, 2019 9:12:20 PM</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>Indicates whether downloading query results from the IDE is allowed. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: Downloading is allowed.</li>
             * <li><strong>0</strong>: Downloading is not allowed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder isAllowDownload(Integer isAllowDownload) {
                this.isAllowDownload = isAllowDownload;
                return this;
            }

            /**
             * <p>Indicates whether the workspace is the default workspace. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: Yes.</li>
             * <li><strong>0</strong>: No.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder isDefault(Integer isDefault) {
                this.isDefault = isDefault;
                return this;
            }

            /**
             * <p>This parameter is deprecated.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder maxFlowNode(Integer maxFlowNode) {
                this.maxFlowNode = maxFlowNode;
                return this;
            }

            /**
             * <p>This parameter is deprecated.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder prodStorageQuota(String prodStorageQuota) {
                this.prodStorageQuota = prodStorageQuota;
                return this;
            }

            /**
             * <p>The description of the workspace.</p>
             * 
             * <strong>example:</strong>
             * <p>test_describe</p>
             */
            public Builder projectDescription(String projectDescription) {
                this.projectDescription = projectDescription;
                return this;
            }

            /**
             * <p>The workspace ID.</p>
             * 
             * <strong>example:</strong>
             * <p>466230</p>
             */
            public Builder projectId(Integer projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * <p>The name of the workspace.</p>
             * 
             * <strong>example:</strong>
             * <p>test_project</p>
             */
            public Builder projectIdentifier(String projectIdentifier) {
                this.projectIdentifier = projectIdentifier;
                return this;
            }

            /**
             * <p>The mode of the workspace. Valid values:</p>
             * <ul>
             * <li><strong>2</strong>: basic mode.</li>
             * <li><strong>3</strong>: standard mode.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder projectMode(Integer projectMode) {
                this.projectMode = projectMode;
                return this;
            }

            /**
             * <p>The display name of the workspace.</p>
             * 
             * <strong>example:</strong>
             * <p>test_project</p>
             */
            public Builder projectName(String projectName) {
                this.projectName = projectName;
                return this;
            }

            /**
             * <p>The Alibaba Cloud ID of the workspace owner.</p>
             * 
             * <strong>example:</strong>
             * <p>18229311****</p>
             */
            public Builder projectOwnerBaseId(String projectOwnerBaseId) {
                this.projectOwnerBaseId = projectOwnerBaseId;
                return this;
            }

            /**
             * <p>Indicates whether protected mode is enabled for the workspace. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: Protected mode is enabled.</li>
             * <li><strong>0</strong>: Protected mode is not enabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder protectedMode(Integer protectedMode) {
                this.protectedMode = protectedMode;
                return this;
            }

            /**
             * <p>The type of the workspace. Valid values:</p>
             * <ul>
             * <li><strong>private</strong>: private zone.</li>
             * <li><strong>swap</strong>: swap zone.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>private</p>
             */
            public Builder residentArea(String residentArea) {
                this.residentArea = residentArea;
                return this;
            }

            /**
             * <p>The resource group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-acfmzbn7****</p>
             */
            public Builder resourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
                this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
                return this;
            }

            /**
             * <p>The default maximum number of automatic reruns upon an error.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder schedulerMaxRetryTimes(Integer schedulerMaxRetryTimes) {
                this.schedulerMaxRetryTimes = schedulerMaxRetryTimes;
                return this;
            }

            /**
             * <p>The default interval between automatic reruns upon an error. Unit: ms. The maximum value is 30 minutes. Note the unit conversion.</p>
             * 
             * <strong>example:</strong>
             * <p>120000</p>
             */
            public Builder schedulerRetryInterval(Integer schedulerRetryInterval) {
                this.schedulerRetryInterval = schedulerRetryInterval;
                return this;
            }

            /**
             * <p>The status of the workspace. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: AVAILABLE. The workspace is running normally.</li>
             * <li><strong>1</strong>: DELETED. The workspace has been deleted.</li>
             * <li><strong>2</strong>: INITIALIZING. The workspace is being initialized.</li>
             * <li><strong>3</strong>: INIT_FAILED. The workspace failed to be initialized.</li>
             * <li><strong>4</strong>: FORBIDDEN. The workspace is manually disabled.</li>
             * <li><strong>5</strong>: DELETING. The workspace is being deleted.</li>
             * <li><strong>6</strong>: DEL_FAILED. The workspace failed to be deleted.</li>
             * <li><strong>7</strong>: FROZEN. The workspace is frozen due to overdue payment.</li>
             * <li><strong>8</strong>: UPDATING. The workspace is being updated (a compute engine is being added and initialized).</li>
             * <li><strong>9</strong>: UPDATE_FAILED. The workspace failed to be updated (a compute engine failed to be added and initialized).</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The visibility of MaxCompute tables. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: MaxCompute tables are not visible to users within the tenant.</li>
             * <li><strong>1</strong>: MaxCompute tables are visible to users within the tenant.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder tablePrivacyMode(Integer tablePrivacyMode) {
                this.tablePrivacyMode = tablePrivacyMode;
                return this;
            }

            /**
             * <p>The list of tags bound to the workspace.</p>
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The tenant ID.</p>
             * 
             * <strong>example:</strong>
             * <p>280749521</p>
             */
            public Builder tenantId(Long tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            /**
             * <p>Indicates whether a proxy account is used to access the MaxCompute engine.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
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
