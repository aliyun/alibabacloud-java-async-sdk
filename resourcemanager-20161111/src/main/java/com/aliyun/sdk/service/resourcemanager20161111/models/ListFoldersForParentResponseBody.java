// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20161111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListFoldersForParentResponseBody} extends {@link TeaModel}
 *
 * <p>ListFoldersForParentResponseBody</p>
 */
public class ListFoldersForParentResponseBody extends TeaModel {
    @NameInMap("Folders")
    private Folders folders;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListFoldersForParentResponseBody(Builder builder) {
        this.folders = builder.folders;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFoldersForParentResponseBody create() {
        return builder().build();
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

        /**
         * Folders.
         */
        public Builder folders(Folders folders) {
            this.folders = folders;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListFoldersForParentResponseBody build() {
            return new ListFoldersForParentResponseBody(this);
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
