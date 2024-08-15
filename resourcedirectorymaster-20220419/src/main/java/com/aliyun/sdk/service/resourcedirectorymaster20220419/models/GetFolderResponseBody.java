// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcedirectorymaster20220419.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetFolderResponseBody} extends {@link TeaModel}
 *
 * <p>GetFolderResponseBody</p>
 */
public class GetFolderResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Folder")
    private Folder folder;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetFolderResponseBody(Builder builder) {
        this.folder = builder.folder;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFolderResponseBody create() {
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
         * The information about the folder.
         */
        public Builder folder(Folder folder) {
            this.folder = folder;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetFolderResponseBody build() {
            return new GetFolderResponseBody(this);
        } 

    } 

    public static class Folder extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("FolderId")
        private String folderId;

        @com.aliyun.core.annotation.NameInMap("FolderName")
        private String folderName;

        @com.aliyun.core.annotation.NameInMap("ParentFolderId")
        private String parentFolderId;

        @com.aliyun.core.annotation.NameInMap("ResourceDirectoryPath")
        private String resourceDirectoryPath;

        private Folder(Builder builder) {
            this.createTime = builder.createTime;
            this.folderId = builder.folderId;
            this.folderName = builder.folderName;
            this.parentFolderId = builder.parentFolderId;
            this.resourceDirectoryPath = builder.resourceDirectoryPath;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Folder create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return folderId
         */
        public String getFolderId() {
            return this.folderId;
        }

        /**
         * @return folderName
         */
        public String getFolderName() {
            return this.folderName;
        }

        /**
         * @return parentFolderId
         */
        public String getParentFolderId() {
            return this.parentFolderId;
        }

        /**
         * @return resourceDirectoryPath
         */
        public String getResourceDirectoryPath() {
            return this.resourceDirectoryPath;
        }

        public static final class Builder {
            private String createTime; 
            private String folderId; 
            private String folderName; 
            private String parentFolderId; 
            private String resourceDirectoryPath; 

            /**
             * The time when the folder was created.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The ID of the folder.
             */
            public Builder folderId(String folderId) {
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
             * The ID of the parent folder.
             */
            public Builder parentFolderId(String parentFolderId) {
                this.parentFolderId = parentFolderId;
                return this;
            }

            /**
             * The path of the folder in the resource directory.
             */
            public Builder resourceDirectoryPath(String resourceDirectoryPath) {
                this.resourceDirectoryPath = resourceDirectoryPath;
                return this;
            }

            public Folder build() {
                return new Folder(this);
            } 

        } 

    }
}
