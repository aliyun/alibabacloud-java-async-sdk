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
 * {@link ListAncestorsResponseBody} extends {@link TeaModel}
 *
 * <p>ListAncestorsResponseBody</p>
 */
public class ListAncestorsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Folders")
    private Folders folders;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The information of the folders.</p>
         */
        public Builder folders(Folders folders) {
            this.folders = folders;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>83AFBEB6-DC03-406E-9686-867461FF6698</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListAncestorsResponseBody build() {
            return new ListAncestorsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAncestorsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAncestorsResponseBody</p>
     */
    public static class Folder extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("FolderId")
        private String folderId;

        @com.aliyun.core.annotation.NameInMap("FolderName")
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
             * <p>The time when the folder was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-01-18T10:03:35.217Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The ID of the folder.</p>
             * 
             * <strong>example:</strong>
             * <p>r-b1****</p>
             */
            public Builder folderId(String folderId) {
                this.folderId = folderId;
                return this;
            }

            /**
             * <p>The name of the folder.</p>
             * 
             * <strong>example:</strong>
             * <p>root</p>
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
    /**
     * 
     * {@link ListAncestorsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAncestorsResponseBody</p>
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
