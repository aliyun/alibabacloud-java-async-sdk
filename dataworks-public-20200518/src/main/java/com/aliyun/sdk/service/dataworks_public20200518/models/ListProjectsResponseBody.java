// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListProjectsResponseBody} extends {@link TeaModel}
 *
 * <p>ListProjectsResponseBody</p>
 */
public class ListProjectsResponseBody extends TeaModel {
    @NameInMap("PageResult")
    private PageResult pageResult;

    @NameInMap("RequestId")
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
         * The results that are returned.
         */
        public Builder pageResult(PageResult pageResult) {
            this.pageResult = pageResult;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListProjectsResponseBody build() {
            return new ListProjectsResponseBody(this);
        } 

    } 

    public static class Tags extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
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
    public static class ProjectList extends TeaModel {
        @NameInMap("DisableDevelopment")
        private Boolean disableDevelopment;

        @NameInMap("IsDefault")
        private Integer isDefault;

        @NameInMap("ProjectDescription")
        private String projectDescription;

        @NameInMap("ProjectId")
        private Long projectId;

        @NameInMap("ProjectIdentifier")
        private String projectIdentifier;

        @NameInMap("ProjectName")
        private String projectName;

        @NameInMap("ProjectOwnerBaseId")
        private String projectOwnerBaseId;

        @NameInMap("ProjectStatus")
        private Integer projectStatus;

        @NameInMap("ProjectStatusCode")
        private String projectStatusCode;

        @NameInMap("ResourceManagerResourceGroupId")
        private String resourceManagerResourceGroupId;

        @NameInMap("TablePrivacyMode")
        private Integer tablePrivacyMode;

        @NameInMap("Tags")
        private java.util.List < Tags> tags;

        @NameInMap("UseProxyOdpsAccount")
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
        public java.util.List < Tags> getTags() {
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
            private java.util.List < Tags> tags; 
            private Boolean useProxyOdpsAccount; 

            /**
             * Indicates whether the Development role is disabled. Valid values:
             * <p>
             * 
             * *   false: enabled
             * *   true: disabled
             * *   Default value: false
             */
            public Builder disableDevelopment(Boolean disableDevelopment) {
                this.disableDevelopment = disableDevelopment;
                return this;
            }

            /**
             * Indicates whether the workspace is a default workspace. Valid values:
             * <p>
             * 
             * *   1: The workspace is a default workspace.
             * *   0: The workspace is not a default workspace.
             */
            public Builder isDefault(Integer isDefault) {
                this.isDefault = isDefault;
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
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * The identifier of the workspace.
             */
            public Builder projectIdentifier(String projectIdentifier) {
                this.projectIdentifier = projectIdentifier;
                return this;
            }

            /**
             * The name of the workspace.
             */
            public Builder projectName(String projectName) {
                this.projectName = projectName;
                return this;
            }

            /**
             * The ID of the user used by the workspace owner.
             */
            public Builder projectOwnerBaseId(String projectOwnerBaseId) {
                this.projectOwnerBaseId = projectOwnerBaseId;
                return this;
            }

            /**
             * The status of the workspace. Valid values:
             * <p>
             * 
             * *   0: AVAILABLE, which indicates that the workspace is running as expected.
             * *   1: DELETED, which indicates that the workspace is deleted.
             * *   2: INITIALIZING, which indicates that the workspace is being initialized.
             * *   3: INIT_FAILED, which indicates that the workspace fails to be initialized.
             * *   4: FORBIDDEN, which indicates that the workspace is manually disabled.
             * *   5: DELETING, which indicates that the workspace is being deleted.
             * *   6: DEL_FAILED, which indicates that the workspace fails to be deleted.
             * *   7: FROZEN, which indicates that the workspace is frozen due to overdue payments.
             * *   8: UPDATING, which indicates that the workspace is being updated. After you associate a compute engine with the workspace, the system initializes compute engine and updates the workspace.
             * *   9: UPDATE_FAILED, which indicates that the workspace fails to be updated.
             */
            public Builder projectStatus(Integer projectStatus) {
                this.projectStatus = projectStatus;
                return this;
            }

            /**
             * The status code of the workspace. Valid values:
             * <p>
             * 
             * *   AVAILABLE: 0, which indicates that the workspace is running as expected.
             * *   DELETED: 1, which indicates that the workspace is deleted.
             * *   INITIALIZING: 2, which indicates that the workspace is being initialized.
             * *   INIT_FAILED: 3, which indicates that the workspace fails to be initialized.
             * *   FORBIDDEN: 4, which indicates that the workspace is manually disabled.
             * *   DELETING: 5, which indicates that the workspace is being deleted.
             * *   DEL_FAILED: 6, which indicates that the workspace fails to be deleted.
             * *   FROZEN: 7, which indicates that the workspace is frozen due to overdue payments.
             * *   UPDATING: 8, which indicates that the workspace is being updated. After you associate a compute engine with the workspace, the system initializes compute engine and updates the workspace.
             * *   UPDATE_FAILED: 9, which indicates that the workspace fails to be updated.
             */
            public Builder projectStatusCode(String projectStatusCode) {
                this.projectStatusCode = projectStatusCode;
                return this;
            }

            /**
             * The ID of the resource group.
             */
            public Builder resourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
                this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
                return this;
            }

            /**
             * Indicates whether the MaxCompute tables in the workspace are visible to the users within a tenant. Valid values:
             * <p>
             * 
             * *   0: invisible
             * *   1: visible
             */
            public Builder tablePrivacyMode(Integer tablePrivacyMode) {
                this.tablePrivacyMode = tablePrivacyMode;
                return this;
            }

            /**
             * The tags.
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * Indicates whether a proxy account is used to access the MaxCompute compute engine associated with the workspace.
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
    public static class PageResult extends TeaModel {
        @NameInMap("PageNumber")
        private Integer pageNumber;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("ProjectList")
        private java.util.List < ProjectList> projectList;

        @NameInMap("TotalCount")
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
        public java.util.List < ProjectList> getProjectList() {
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
            private java.util.List < ProjectList> projectList; 
            private Integer totalCount; 

            /**
             * The page number of the returned page.
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * The number of entries returned per page. Default value: 10. Maximum value: 100.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * The DataWorks workspaces returned.
             */
            public Builder projectList(java.util.List < ProjectList> projectList) {
                this.projectList = projectList;
                return this;
            }

            /**
             * The total number of entries returned.
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
