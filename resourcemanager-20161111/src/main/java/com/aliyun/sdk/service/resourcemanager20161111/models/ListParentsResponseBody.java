// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20161111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListParentsResponseBody} extends {@link TeaModel}
 *
 * <p>ListParentsResponseBody</p>
 */
public class ListParentsResponseBody extends TeaModel {
    @NameInMap("Folders")
    private Folders folders;

    @NameInMap("RequestId")
    private String requestId;

    private ListParentsResponseBody(Builder builder) {
        this.folders = builder.folders;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListParentsResponseBody create() {
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
         * Folders.
         */
        public Builder folders(Folders folders) {
            this.folders = folders;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListParentsResponseBody build() {
            return new ListParentsResponseBody(this);
        } 

    } 

    public static class Folder extends TeaModel {
        @NameInMap("CreateDate")
        private String createDate;

        @NameInMap("FolderId")
        private String folderId;

        @NameInMap("Name")
        private String name;

        private Folder(Builder builder) {
            this.createDate = builder.createDate;
            this.folderId = builder.folderId;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Folder create() {
            return builder().build();
        }

        /**
         * @return createDate
         */
        public String getCreateDate() {
            return this.createDate;
        }

        /**
         * @return folderId
         */
        public String getFolderId() {
            return this.folderId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String createDate; 
            private String folderId; 
            private String name; 

            /**
             * CreateDate.
             */
            public Builder createDate(String createDate) {
                this.createDate = createDate;
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
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
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
