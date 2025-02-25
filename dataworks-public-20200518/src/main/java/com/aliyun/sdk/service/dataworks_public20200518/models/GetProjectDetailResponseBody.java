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
 * {@link GetProjectDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetProjectDetailResponseBody</p>
 */
public class GetProjectDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetProjectDetailResponseBody(Builder builder) {
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetProjectDetailResponseBody create() {
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
         * <p>The information about the workspace.</p>
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
         * <p>0bc1411515937635973****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetProjectDetailResponseBody build() {
            return new GetProjectDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetProjectDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetProjectDetailResponseBody</p>
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

            /**
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>Env</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>Test</p>
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
     * {@link GetProjectDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetProjectDetailResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DefaultDiResourceGroupIdentifier")
        private String defaultDiResourceGroupIdentifier;

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
            this.defaultDiResourceGroupIdentifier = builder.defaultDiResourceGroupIdentifier;
            this.developmentType = builder.developmentType;
            this.disableDevelopment = builder.disableDevelopment;
            this.envTypes = builder.envTypes;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.isAllowDownload = builder.isAllowDownload;
            this.isDefault = builder.isDefault;
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
         * @return defaultDiResourceGroupIdentifier
         */
        public String getDefaultDiResourceGroupIdentifier() {
            return this.defaultDiResourceGroupIdentifier;
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
            private String defaultDiResourceGroupIdentifier; 
            private Integer developmentType; 
            private Boolean disableDevelopment; 
            private java.util.List<String> envTypes; 
            private String gmtCreate; 
            private String gmtModified; 
            private Integer isAllowDownload; 
            private Integer isDefault; 
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

            /**
             * <p>The identifier of the shared resource group for Data Integration on which nodes are run.</p>
             * 
             * <strong>example:</strong>
             * <p>group_280749521****</p>
             */
            public Builder defaultDiResourceGroupIdentifier(String defaultDiResourceGroupIdentifier) {
                this.defaultDiResourceGroupIdentifier = defaultDiResourceGroupIdentifier;
                return this;
            }

            /**
             * <p>The development type of the workspace. The value is fixed to 4.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder developmentType(Integer developmentType) {
                this.developmentType = developmentType;
                return this;
            }

            /**
             * <p>Indicates whether the Develop role is disabled. Valid values:</p>
             * <ul>
             * <li><strong>false</strong> (default)</li>
             * <li><strong>true</strong></li>
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
             * <p>The environments of workspaces in different modes. Workspaces in basic mode provide only the production environment. Workspaces in standard mode provide both the development environment and the production environment.</p>
             */
            public Builder envTypes(java.util.List<String> envTypes) {
                this.envTypes = envTypes;
                return this;
            }

            /**
             * <p>The time when the workspace was created.</p>
             * 
             * <strong>example:</strong>
             * <p>Oct 10, 2019 3:42:53 PM</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The time when the workspace was last modified.</p>
             * 
             * <strong>example:</strong>
             * <p>Dec 3, 2019 9:12:20 PM</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>Indicates whether the download operation is allowed.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder isAllowDownload(Integer isAllowDownload) {
                this.isAllowDownload = isAllowDownload;
                return this;
            }

            /**
             * <p>Indicates whether the workspace is a default workspace. Valid values:</p>
             * <ul>
             * <li>1: The workspace is a default workspace.</li>
             * <li>0: The workspace is not a default workspace.</li>
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
             * <p>The description of the workspace.</p>
             * 
             * <strong>example:</strong>
             * <p>abc</p>
             */
            public Builder projectDescription(String projectDescription) {
                this.projectDescription = projectDescription;
                return this;
            }

            /**
             * <p>The workspace ID.</p>
             * 
             * <strong>example:</strong>
             * <p>27</p>
             */
            public Builder projectId(Integer projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * <p>The unique identifier of the workspace.</p>
             * 
             * <strong>example:</strong>
             * <p>abc</p>
             */
            public Builder projectIdentifier(String projectIdentifier) {
                this.projectIdentifier = projectIdentifier;
                return this;
            }

            /**
             * <p>The mode of the workspace. The value 2 indicates that the workspace is in basic mode. The value 3 indicates that the workspace is in standard mode.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder projectMode(Integer projectMode) {
                this.projectMode = projectMode;
                return this;
            }

            /**
             * <p>The display name of the workspace.</p>
             * 
             * <strong>example:</strong>
             * <p>abc</p>
             */
            public Builder projectName(String projectName) {
                this.projectName = projectName;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account used by the workspace owner.</p>
             * 
             * <strong>example:</strong>
             * <p>18229311****</p>
             */
            public Builder projectOwnerBaseId(String projectOwnerBaseId) {
                this.projectOwnerBaseId = projectOwnerBaseId;
                return this;
            }

            /**
             * <p>Indicates whether the workspace protection feature is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder protectedMode(Integer protectedMode) {
                this.protectedMode = protectedMode;
                return this;
            }

            /**
             * <p>The type of the workspace. Valid values: private and swap.</p>
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
             * <p>rg-acfmzbn7pti3zfa</p>
             */
            public Builder resourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
                this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
                return this;
            }

            /**
             * <p>The default maximum number of automatic reruns that are allowed after an error occurs.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder schedulerMaxRetryTimes(Integer schedulerMaxRetryTimes) {
                this.schedulerMaxRetryTimes = schedulerMaxRetryTimes;
                return this;
            }

            /**
             * <p>The interval between automatic reruns after an error occurs.</p>
             * 
             * <strong>example:</strong>
             * <p>120000</p>
             */
            public Builder schedulerRetryInterval(Integer schedulerRetryInterval) {
                this.schedulerRetryInterval = schedulerRetryInterval;
                return this;
            }

            /**
             * <p>The status of the workspace.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * <p>Indicates whether the MaxCompute tables in the workspace are visible to the users within a tenant. Valid values:</p>
             * <ul>
             * <li>0: The MaxCompute tables in the workspace are not visible to the users within a tenant.</li>
             * <li>1: The MaxCompute tables in the workspace are visible to the users within a tenant.</li>
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
             * <p>The tag information.</p>
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The tenant ID.</p>
             * 
             * <strong>example:</strong>
             * <p>280749521950784</p>
             */
            public Builder tenantId(Long tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            /**
             * <p>Indicates whether a proxy account is used to access the MaxCompute compute engine.</p>
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
