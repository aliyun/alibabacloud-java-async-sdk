// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateFolderResponseBody} extends {@link TeaModel}
 *
 * <p>CreateFolderResponseBody</p>
 */
public class CreateFolderResponseBody extends TeaModel {
    @NameInMap("Folder")
    private Folder folder;

    @NameInMap("RequestId")
    private String requestId;

    private CreateFolderResponseBody(Builder builder) {
        this.folder = builder.folder;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateFolderResponseBody create() {
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
         * Folder.
         */
        public Builder folder(Folder folder) {
            this.folder = folder;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateFolderResponseBody build() {
            return new CreateFolderResponseBody(this);
        } 

    } 

    public static class Folder extends TeaModel {
        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("FolderId")
        private String folderId;

        @NameInMap("FolderName")
        private String folderName;

        @NameInMap("ParentFolderId")
        private String parentFolderId;

        private Folder(Builder builder) {
            this.createTime = builder.createTime;
            this.folderId = builder.folderId;
            this.folderName = builder.folderName;
            this.parentFolderId = builder.parentFolderId;
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

        public static final class Builder {
            private String createTime; 
            private String folderId; 
            private String folderName; 
            private String parentFolderId; 

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * FolderId.
             */
            public Builder folderId(String folderId) {
                this.folderId = folderId;
                return this;
            }

            /**
             * FolderName.
             */
            public Builder folderName(String folderName) {
                this.folderName = folderName;
                return this;
            }

            /**
             * ParentFolderId.
             */
            public Builder parentFolderId(String parentFolderId) {
                this.parentFolderId = parentFolderId;
                return this;
            }

            public Folder build() {
                return new Folder(this);
            } 

        } 

    }
}
