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
 * {@link ListProjectsResponseBody} extends {@link TeaModel}
 *
 * <p>ListProjectsResponseBody</p>
 */
public class ListProjectsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageResult")
    private PageResult pageResult;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListProjectsResponseBody(Builder builder) {
        this.pageResult = builder.pageResult;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProjectsResponseBody create() {
        return builder().build();
    }

    /**
     * @return pageResult
     */
    public PageResult getPageResult() {
        return this.pageResult;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private PageResult pageResult; 
        private String requestId; 

        /**
         * <p>The results that are returned.</p>
         */
        public Builder pageResult(PageResult pageResult) {
            this.pageResult = pageResult;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>20658801***</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListProjectsResponseBody build() {
            return new ListProjectsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListProjectsResponseBody} extends {@link TeaModel}
     *
     * <p>ListProjectsResponseBody</p>
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
             * <p>The key of tag N added to the workspace.</p>
             * 
             * <strong>example:</strong>
             * <p>Env</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of tag N added to the workspace.</p>
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
     * {@link ListProjectsResponseBody} extends {@link TeaModel}
     *
     * <p>ListProjectsResponseBody</p>
     */
    public static class ProjectList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DisableDevelopment")
        private Boolean disableDevelopment;

        @com.aliyun.core.annotation.NameInMap("IsDefault")
        private Integer isDefault;

        @com.aliyun.core.annotation.NameInMap("ProjectDescription")
        private String projectDescription;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private Long projectId;

        @com.aliyun.core.annotation.NameInMap("ProjectIdentifier")
        private String projectIdentifier;

        @com.aliyun.core.annotation.NameInMap("ProjectName")
        private String projectName;

        @com.aliyun.core.annotation.NameInMap("ProjectOwnerBaseId")
        private String projectOwnerBaseId;

        @com.aliyun.core.annotation.NameInMap("ProjectStatus")
        private Integer projectStatus;

        @com.aliyun.core.annotation.NameInMap("ProjectStatusCode")
        private String projectStatusCode;

        @com.aliyun.core.annotation.NameInMap("ResourceManagerResourceGroupId")
        private String resourceManagerResourceGroupId;

        @com.aliyun.core.annotation.NameInMap("TablePrivacyMode")
        private Integer tablePrivacyMode;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<Tags> tags;

        @com.aliyun.core.annotation.NameInMap("UseProxyOdpsAccount")
        private Boolean useProxyOdpsAccount;

        private ProjectList(Builder builder) {
            this.disableDevelopment = builder.disableDevelopment;
            this.isDefault = builder.isDefault;
            this.projectDescription = builder.projectDescription;
            this.projectId = builder.projectId;
            this.projectIdentifier = builder.projectIdentifier;
            this.projectName = builder.projectName;
            this.projectOwnerBaseId = builder.projectOwnerBaseId;
            this.projectStatus = builder.projectStatus;
            this.projectStatusCode = builder.projectStatusCode;
            this.resourceManagerResourceGroupId = builder.resourceManagerResourceGroupId;
            this.tablePrivacyMode = builder.tablePrivacyMode;
            this.tags = builder.tags;
            this.useProxyOdpsAccount = builder.useProxyOdpsAccount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProjectList create() {
            return builder().build();
        }

        /**
         * @return disableDevelopment
         */
        public Boolean getDisableDevelopment() {
            return this.disableDevelopment;
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
        public Long getProjectId() {
            return this.projectId;
        }

        /**
         * @return projectIdentifier
         */
        public String getProjectIdentifier() {
            return this.projectIdentifier;
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
         * @return projectStatus
         */
        public Integer getProjectStatus() {
            return this.projectStatus;
        }

        /**
         * @return projectStatusCode
         */
        public String getProjectStatusCode() {
            return this.projectStatusCode;
        }

        /**
         * @return resourceManagerResourceGroupId
         */
        public String getResourceManagerResourceGroupId() {
            return this.resourceManagerResourceGroupId;
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
         * @return useProxyOdpsAccount
         */
        public Boolean getUseProxyOdpsAccount() {
            return this.useProxyOdpsAccount;
        }

        public static final class Builder {
            private Boolean disableDevelopment; 
            private Integer isDefault; 
            private String projectDescription; 
            private Long projectId; 
            private String projectIdentifier; 
            private String projectName; 
            private String projectOwnerBaseId; 
            private Integer projectStatus; 
            private String projectStatusCode; 
            private String resourceManagerResourceGroupId; 
            private Integer tablePrivacyMode; 
            private java.util.List<Tags> tags; 
            private Boolean useProxyOdpsAccount; 

            /**
             * <p>Indicates whether the Development role is disabled. Valid values:</p>
             * <ul>
             * <li><strong>false</strong>: enabled</li>
             * <li><strong>true</strong>: disabled</li>
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
             * <p>Indicates whether the workspace is a default workspace. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: The workspace is a default workspace.</li>
             * <li><strong>0</strong>: The workspace is not a default workspace.</li>
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
             * <p>1212</p>
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * <p>The name of the workspace.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder projectIdentifier(String projectIdentifier) {
                this.projectIdentifier = projectIdentifier;
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
             * <p>The ID of the user used by the workspace owner.</p>
             * 
             * <strong>example:</strong>
             * <p>122222</p>
             */
            public Builder projectOwnerBaseId(String projectOwnerBaseId) {
                this.projectOwnerBaseId = projectOwnerBaseId;
                return this;
            }

            /**
             * <p>The status of the workspace. Valid values:</p>
             * <ul>
             * <li>0: AVAILABLE, which indicates that the workspace is running as expected.</li>
             * <li>1: DELETED, which indicates that the workspace is deleted.</li>
             * <li>2: INITIALIZING, which indicates that the workspace is being initialized.</li>
             * <li>3: INIT_FAILED, which indicates that the workspace fails to be initialized.</li>
             * <li>4: FORBIDDEN, which indicates that the workspace is manually disabled.</li>
             * <li>5: DELETING, which indicates that the workspace is being deleted.</li>
             * <li>6: DEL_FAILED, which indicates that the workspace fails to be deleted.</li>
             * <li>7: FROZEN, which indicates that the workspace is frozen due to overdue payments.</li>
             * <li>8: UPDATING, which indicates that the workspace is being updated. After you associate a compute engine with the workspace, the system initializes the compute engine and updates the workspace.</li>
             * <li>9: UPDATE_FAILED, which indicates that the workspace fails to be updated.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder projectStatus(Integer projectStatus) {
                this.projectStatus = projectStatus;
                return this;
            }

            /**
             * <p>The status code of the workspace. Valid values:</p>
             * <ul>
             * <li>AVAILABLE: 0, which indicates that the workspace is running as expected.</li>
             * <li>DELETED: 1, which indicates that the workspace is deleted.</li>
             * <li>INITIALIZING: 2, which indicates that the workspace is being initialized.</li>
             * <li>INIT_FAILED: 3, which indicates that the workspace fails to be initialized.</li>
             * <li>FORBIDDEN: 4, which indicates that the workspace is manually disabled.</li>
             * <li>DELETING: 5, which indicates that the workspace is being deleted.</li>
             * <li>DEL_FAILED: 6, which indicates that the workspace fails to be deleted.</li>
             * <li>FROZEN: 7, which indicates that the workspace is frozen due to overdue payments.</li>
             * <li>UPDATING: 8, which indicates that the workspace is being updated. After you associate a compute engine with the workspace, the system initializes the compute engine and updates the workspace.</li>
             * <li>UPDATE_FAILED: 9, which indicates that the workspace fails to be updated.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>AVAILABLE</p>
             */
            public Builder projectStatusCode(String projectStatusCode) {
                this.projectStatusCode = projectStatusCode;
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
             * <p>Indicates whether the MaxCompute tables in the workspace are visible to the users within a tenant. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: invisible</li>
             * <li><strong>1</strong>: visible</li>
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
             * <p>The tags added to the workspace.</p>
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>Indicates whether a proxy account is used to access the MaxCompute compute engine associated with the workspace. Valid values:</p>
             * <ul>
             * <li><strong>false</strong></li>
             * <li><strong>true</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder useProxyOdpsAccount(Boolean useProxyOdpsAccount) {
                this.useProxyOdpsAccount = useProxyOdpsAccount;
                return this;
            }

            public ProjectList build() {
                return new ProjectList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListProjectsResponseBody} extends {@link TeaModel}
     *
     * <p>ListProjectsResponseBody</p>
     */
    public static class PageResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("ProjectList")
        private java.util.List<ProjectList> projectList;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private PageResult(Builder builder) {
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.projectList = builder.projectList;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageResult create() {
            return builder().build();
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
         * @return projectList
         */
        public java.util.List<ProjectList> getProjectList() {
            return this.projectList;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Integer pageNumber; 
            private Integer pageSize; 
            private java.util.List<ProjectList> projectList; 
            private Integer totalCount; 

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
             * <p>The number of entries per page. Default value: 10. Maximum value: 100.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The DataWorks workspaces.</p>
             */
            public Builder projectList(java.util.List<ProjectList> projectList) {
                this.projectList = projectList;
                return this;
            }

            /**
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public PageResult build() {
                return new PageResult(this);
            } 

        } 

    }
}
