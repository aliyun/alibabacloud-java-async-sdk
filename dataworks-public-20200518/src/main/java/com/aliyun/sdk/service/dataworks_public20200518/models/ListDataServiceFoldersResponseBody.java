// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDataServiceFoldersResponseBody} extends {@link TeaModel}
 *
 * <p>ListDataServiceFoldersResponseBody</p>
 */
public class ListDataServiceFoldersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FolderPagingResult")
    private FolderPagingResult folderPagingResult;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListDataServiceFoldersResponseBody(Builder builder) {
        this.folderPagingResult = builder.folderPagingResult;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDataServiceFoldersResponseBody create() {
        return builder().build();
    }

    /**
     * @return folderPagingResult
     */
    public FolderPagingResult getFolderPagingResult() {
        return this.folderPagingResult;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private FolderPagingResult folderPagingResult; 
        private String requestId; 

        /**
         * The paging result for the folders.
         */
        public Builder folderPagingResult(FolderPagingResult folderPagingResult) {
            this.folderPagingResult = folderPagingResult;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListDataServiceFoldersResponseBody build() {
            return new ListDataServiceFoldersResponseBody(this);
        } 

    } 

    public static class Folders extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreatedTime")
        private String createdTime;

        @com.aliyun.core.annotation.NameInMap("FolderId")
        private Long folderId;

        @com.aliyun.core.annotation.NameInMap("FolderName")
        private String folderName;

        @com.aliyun.core.annotation.NameInMap("GroupId")
        private String groupId;

        @com.aliyun.core.annotation.NameInMap("ModifiedTime")
        private String modifiedTime;

        @com.aliyun.core.annotation.NameInMap("ParentId")
        private Long parentId;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private Long projectId;

        @com.aliyun.core.annotation.NameInMap("TenantId")
        private Long tenantId;

        private Folders(Builder builder) {
            this.createdTime = builder.createdTime;
            this.folderId = builder.folderId;
            this.folderName = builder.folderName;
            this.groupId = builder.groupId;
            this.modifiedTime = builder.modifiedTime;
            this.parentId = builder.parentId;
            this.projectId = builder.projectId;
            this.tenantId = builder.tenantId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Folders create() {
            return builder().build();
        }

        /**
         * @return createdTime
         */
        public String getCreatedTime() {
            return this.createdTime;
        }

        /**
         * @return folderId
         */
        public Long getFolderId() {
            return this.folderId;
        }

        /**
         * @return folderName
         */
        public String getFolderName() {
            return this.folderName;
        }

        /**
         * @return groupId
         */
        public String getGroupId() {
            return this.groupId;
        }

        /**
         * @return modifiedTime
         */
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        /**
         * @return parentId
         */
        public Long getParentId() {
            return this.parentId;
        }

        /**
         * @return projectId
         */
        public Long getProjectId() {
            return this.projectId;
        }

        /**
         * @return tenantId
         */
        public Long getTenantId() {
            return this.tenantId;
        }

        public static final class Builder {
            private String createdTime; 
            private Long folderId; 
            private String folderName; 
            private String groupId; 
            private String modifiedTime; 
            private Long parentId; 
            private Long projectId; 
            private Long tenantId; 

            /**
             * The time when the folder was created.
             */
            public Builder createdTime(String createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * The ID of the folder.
             */
            public Builder folderId(Long folderId) {
                this.folderId = folderId;
                return this;
            }

            /**
             * The name of the folder.
             */
            public Builder folderName(String folderName) {
                this.folderName = folderName;
                return this;
            }

            /**
             * The ID of the business process to which the folder belongs.
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * The time when the folder was last modified.
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * The ID of the parent folder. The ID of the root folder in a business process is 0, and the ID of a folder created by a user in a business process is greater than 0.
             */
            public Builder parentId(Long parentId) {
                this.parentId = parentId;
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
             * The ID of the tenant.
             */
            public Builder tenantId(Long tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            public Folders build() {
                return new Folders(this);
            } 

        } 

    }
    public static class FolderPagingResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Folders")
        private java.util.List < Folders> folders;

        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private FolderPagingResult(Builder builder) {
            this.folders = builder.folders;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FolderPagingResult create() {
            return builder().build();
        }

        /**
         * @return folders
         */
        public java.util.List < Folders> getFolders() {
            return this.folders;
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
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List < Folders> folders; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer totalCount; 

            /**
             * The folders.
             */
            public Builder folders(java.util.List < Folders> folders) {
                this.folders = folders;
                return this;
            }

            /**
             * The page number of the returned page. The value of this parameter is the same as that of the PageNumber parameter in the request.
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
             * The total number of returned entries.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public FolderPagingResult build() {
                return new FolderPagingResult(this);
            } 

        } 

    }
}
