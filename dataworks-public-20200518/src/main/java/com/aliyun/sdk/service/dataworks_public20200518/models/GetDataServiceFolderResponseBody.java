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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetDataServiceFolderResponseBody model) {
            this.folder = model.folder;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The details of the folder.</p>
         */
        public Builder folder(Folder folder) {
            this.folder = folder;
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

        public GetDataServiceFolderResponseBody build() {
            return new GetDataServiceFolderResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetDataServiceFolderResponseBody} extends {@link TeaModel}
     *
     * <p>GetDataServiceFolderResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Folder model) {
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
             * <p>The parent folder ID. The ID of the root folder in a business process is 0, and the ID of a folder created by a user in a business process is greater than 0.</p>
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

            public Folder build() {
                return new Folder(this);
            } 

        } 

    }
}
