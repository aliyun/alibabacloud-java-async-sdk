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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(ListDataServiceFoldersResponseBody model) {
            this.folderPagingResult = model.folderPagingResult;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The paging result for the folders.</p>
         */
        public Builder folderPagingResult(FolderPagingResult folderPagingResult) {
            this.folderPagingResult = folderPagingResult;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0000-ABCD-EF****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListDataServiceFoldersResponseBody build() {
            return new ListDataServiceFoldersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDataServiceFoldersResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataServiceFoldersResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Folders model) {
                this.createdTime = model.createdTime;
                this.folderId = model.folderId;
                this.folderName = model.folderName;
                this.groupId = model.groupId;
                this.modifiedTime = model.modifiedTime;
                this.parentId = model.parentId;
                this.projectId = model.projectId;
                this.tenantId = model.tenantId;
            } 

            /**
             * <p>The time when the folder was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-09-24T18:37:51+0800</p>
             */
            public Builder createdTime(String createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * <p>The folder ID.</p>
             * 
             * <strong>example:</strong>
             * <p>11</p>
             */
            public Builder folderId(Long folderId) {
                this.folderId = folderId;
                return this;
            }

            /**
             * <p>The name of the folder.</p>
             * 
             * <strong>example:</strong>
             * <p>test1</p>
             */
            public Builder folderName(String folderName) {
                this.folderName = folderName;
                return this;
            }

            /**
             * <p>The ID of the business process to which the folder belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>ds_1234</p>
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * <p>The time when the folder was last modified.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-09-24T18:37:51+0800</p>
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * <p>The ID of the parent folder. The ID of the root folder in a business process is 0, and the ID of a folder created by a user in a business process is greater than 0.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder parentId(Long parentId) {
                this.parentId = parentId;
                return this;
            }

            /**
             * <p>The workspace ID.</p>
             * 
             * <strong>example:</strong>
             * <p>10001</p>
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * <p>The tenant ID.</p>
             * 
             * <strong>example:</strong>
             * <p>10002</p>
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
    /**
     * 
     * {@link ListDataServiceFoldersResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataServiceFoldersResponseBody</p>
     */
    public static class FolderPagingResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Folders")
        private java.util.List<Folders> folders;

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
        public java.util.List<Folders> getFolders() {
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
            private java.util.List<Folders> folders; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer totalCount; 

            private Builder() {
            } 

            private Builder(FolderPagingResult model) {
                this.folders = model.folders;
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The folders.</p>
             */
            public Builder folders(java.util.List<Folders> folders) {
                this.folders = folders;
                return this;
            }

            /**
             * <p>The page number. The value of this parameter is the same as that of the PageNumber parameter in the request.</p>
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
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
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
