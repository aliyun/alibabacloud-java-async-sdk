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
         * <p>The information about the folder.</p>
         */
        public Builder folder(Folder folder) {
            this.folder = folder;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>C2CBCA30-C8DD-423E-B4AD-4FB694C9180C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetFolderResponseBody build() {
            return new GetFolderResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetFolderResponseBody} extends {@link TeaModel}
     *
     * <p>GetFolderResponseBody</p>
     */
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
             * <p>The time when the folder was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-06-15T06:39:08.521Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The ID of the folder.</p>
             * 
             * <strong>example:</strong>
             * <p>fd-Jyl5U7****</p>
             */
            public Builder folderId(String folderId) {
                this.folderId = folderId;
                return this;
            }

            /**
             * <p>The name of the folder.</p>
             * 
             * <strong>example:</strong>
             * <p>Applications</p>
             */
            public Builder folderName(String folderName) {
                this.folderName = folderName;
                return this;
            }

            /**
             * <p>The ID of the parent folder.</p>
             * 
             * <strong>example:</strong>
             * <p>r-Wm****</p>
             */
            public Builder parentFolderId(String parentFolderId) {
                this.parentFolderId = parentFolderId;
                return this;
            }

            /**
             * <p>The path of the folder in the resource directory.</p>
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
