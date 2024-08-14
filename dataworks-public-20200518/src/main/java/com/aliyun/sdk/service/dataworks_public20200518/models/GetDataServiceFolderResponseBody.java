// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDataServiceFolderResponseBody} extends {@link TeaModel}
 *
 * <p>GetDataServiceFolderResponseBody</p>
 */
public class GetDataServiceFolderResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Folder")
    private Folder folder;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetDataServiceFolderResponseBody(Builder builder) {
        this.folder = builder.folder;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDataServiceFolderResponseBody create() {
        return builder().build();
    }

    /**
     * @return folder
     */
    public Folder getFolder() {
        return this.folder;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Folder folder; 
        private String requestId; 

        /**
         * The details of the folder.
         */
        public Builder folder(Folder folder) {
            this.folder = folder;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetDataServiceFolderResponseBody build() {
            return new GetDataServiceFolderResponseBody(this);
        } 

    } 

    public static class Folder extends TeaModel {
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

        private Folder(Builder builder) {
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

        public static Folder create() {
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
             * The folder ID.
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
             * The parent folder ID. The ID of the root folder in a business process is 0, and the ID of a folder created by a user in a business process is greater than 0.
             */
            public Builder parentId(Long parentId) {
                this.parentId = parentId;
                return this;
            }

            /**
             * The workspace ID.
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * The tenant ID.
             */
            public Builder tenantId(Long tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            public Folder build() {
                return new Folder(this);
            } 

        } 

    }
}
