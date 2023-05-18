// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAncestorsResponseBody} extends {@link TeaModel}
 *
 * <p>ListAncestorsResponseBody</p>
 */
public class ListAncestorsResponseBody extends TeaModel {
    @NameInMap("Folders")
    private Folders folders;

    @NameInMap("RequestId")
    private String requestId;

    private ListAncestorsResponseBody(Builder builder) {
        this.folders = builder.folders;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAncestorsResponseBody create() {
        return builder().build();
    }

    /**
     * @return folders
     */
    public Folders getFolders() {
        return this.folders;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Folders folders; 
        private String requestId; 

        /**
         * The information of the folders.
         */
        public Builder folders(Folders folders) {
            this.folders = folders;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListAncestorsResponseBody build() {
            return new ListAncestorsResponseBody(this);
        } 

    } 

    public static class Folder extends TeaModel {
        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("FolderId")
        private String folderId;

        @NameInMap("FolderName")
        private String folderName;

        private Folder(Builder builder) {
            this.createTime = builder.createTime;
            this.folderId = builder.folderId;
            this.folderName = builder.folderName;
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

        public static final class Builder {
            private String createTime; 
            private String folderId; 
            private String folderName; 

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

            public Folder build() {
                return new Folder(this);
            } 

        } 

    }
    public static class Folders extends TeaModel {
        @NameInMap("Folder")
        private java.util.List < Folder> folder;

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
        public java.util.List < Folder> getFolder() {
            return this.folder;
        }

        public static final class Builder {
            private java.util.List < Folder> folder; 

            /**
             * Folder.
             */
            public Builder folder(java.util.List < Folder> folder) {
                this.folder = folder;
                return this;
            }

            public Folders build() {
                return new Folders(this);
            } 

        } 

    }
}
