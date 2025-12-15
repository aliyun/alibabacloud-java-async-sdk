// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcedirectorymaster20220419.models;

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
 * {@link ListAuthorizedFoldersResponseBody} extends {@link TeaModel}
 *
 * <p>ListAuthorizedFoldersResponseBody</p>
 */
public class ListAuthorizedFoldersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Folders")
    private Folders folders;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListAuthorizedFoldersResponseBody(Builder builder) {
        this.folders = builder.folders;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAuthorizedFoldersResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return folders
     */
    public Folders getFolders() {
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Folders folders; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListAuthorizedFoldersResponseBody model) {
            this.folders = model.folders;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The folders.</p>
         */
        public Builder folders(Folders folders) {
            this.folders = folders;
            return this;
        }

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
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7B8A4E7D-6CFF-471D-84DF-195A7A241ECB</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListAuthorizedFoldersResponseBody build() {
            return new ListAuthorizedFoldersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAuthorizedFoldersResponseBody} extends {@link TeaModel}
     *
     * <p>ListAuthorizedFoldersResponseBody</p>
     */
    public static class Folder extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FolderId")
        private String folderId;

        @com.aliyun.core.annotation.NameInMap("FolderName")
        private String folderName;

        @com.aliyun.core.annotation.NameInMap("ResourceDirectoryPath")
        private String resourceDirectoryPath;

        private Folder(Builder builder) {
            this.folderId = builder.folderId;
            this.folderName = builder.folderName;
            this.resourceDirectoryPath = builder.resourceDirectoryPath;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Folder create() {
            return builder().build();
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
         * @return resourceDirectoryPath
         */
        public String getResourceDirectoryPath() {
            return this.resourceDirectoryPath;
        }

        public static final class Builder {
            private String folderId; 
            private String folderName; 
            private String resourceDirectoryPath; 

            private Builder() {
            } 

            private Builder(Folder model) {
                this.folderId = model.folderId;
                this.folderName = model.folderName;
                this.resourceDirectoryPath = model.resourceDirectoryPath;
            } 

            /**
             * <p>The ID of the folder.</p>
             * 
             * <strong>example:</strong>
             * <p>fd-bVaRIG****</p>
             */
            public Builder folderId(String folderId) {
                this.folderId = folderId;
                return this;
            }

            /**
             * <p>The name of the folder.</p>
             * 
             * <strong>example:</strong>
             * <p>project-1</p>
             */
            public Builder folderName(String folderName) {
                this.folderName = folderName;
                return this;
            }

            /**
             * <p>The RDPath of the folder.</p>
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
    /**
     * 
     * {@link ListAuthorizedFoldersResponseBody} extends {@link TeaModel}
     *
     * <p>ListAuthorizedFoldersResponseBody</p>
     */
    public static class Folders extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Folder")
        private java.util.List<Folder> folder;

        private Folders(Builder builder) {
            this.folder = builder.folder;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Folders create() {
            return builder().build();
        }

        /**
         * @return folder
         */
        public java.util.List<Folder> getFolder() {
            return this.folder;
        }

        public static final class Builder {
            private java.util.List<Folder> folder; 

            private Builder() {
            } 

            private Builder(Folders model) {
                this.folder = model.folder;
            } 

            /**
             * Folder.
             */
            public Builder folder(java.util.List<Folder> folder) {
                this.folder = folder;
                return this;
            }

            public Folders build() {
                return new Folders(this);
            } 

        } 

    }
}
