// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListFunctionFilesResponseBody} extends {@link TeaModel}
 *
 * <p>ListFunctionFilesResponseBody</p>
 */
public class ListFunctionFilesResponseBody extends TeaModel {
    @NameInMap("FileList")
    private FileList fileList;

    @NameInMap("RequestId")
    private String requestId;

    private ListFunctionFilesResponseBody(Builder builder) {
        this.fileList = builder.fileList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFunctionFilesResponseBody create() {
        return builder().build();
    }

    /**
     * @return fileList
     */
    public FileList getFileList() {
        return this.fileList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private FileList fileList; 
        private String requestId; 

        /**
         * FileList.
         */
        public Builder fileList(FileList fileList) {
            this.fileList = fileList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListFunctionFilesResponseBody build() {
            return new ListFunctionFilesResponseBody(this);
        } 

    } 

    public static class Files extends TeaModel {
        @NameInMap("ContentId")
        private Long contentId;

        @NameInMap("Description")
        private String description;

        @NameInMap("GmtCreate")
        private Long gmtCreate;

        @NameInMap("GmtModified")
        private Long gmtModified;

        @NameInMap("Id")
        private Long id;

        @NameInMap("Name")
        private String name;

        @NameInMap("ProductionDeployStatus")
        private Integer productionDeployStatus;

        @NameInMap("ProductionDeployTime")
        private Long productionDeployTime;

        @NameInMap("SandboxDeployStatus")
        private Integer sandboxDeployStatus;

        @NameInMap("SandboxDeployTime")
        private Long sandboxDeployTime;

        @NameInMap("Status")
        private Integer status;

        private Files(Builder builder) {
            this.contentId = builder.contentId;
            this.description = builder.description;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.name = builder.name;
            this.productionDeployStatus = builder.productionDeployStatus;
            this.productionDeployTime = builder.productionDeployTime;
            this.sandboxDeployStatus = builder.sandboxDeployStatus;
            this.sandboxDeployTime = builder.sandboxDeployTime;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Files create() {
            return builder().build();
        }

        /**
         * @return contentId
         */
        public Long getContentId() {
            return this.contentId;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return gmtCreate
         */
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public Long getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return productionDeployStatus
         */
        public Integer getProductionDeployStatus() {
            return this.productionDeployStatus;
        }

        /**
         * @return productionDeployTime
         */
        public Long getProductionDeployTime() {
            return this.productionDeployTime;
        }

        /**
         * @return sandboxDeployStatus
         */
        public Integer getSandboxDeployStatus() {
            return this.sandboxDeployStatus;
        }

        /**
         * @return sandboxDeployTime
         */
        public Long getSandboxDeployTime() {
            return this.sandboxDeployTime;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Long contentId; 
            private String description; 
            private Long gmtCreate; 
            private Long gmtModified; 
            private Long id; 
            private String name; 
            private Integer productionDeployStatus; 
            private Long productionDeployTime; 
            private Integer sandboxDeployStatus; 
            private Long sandboxDeployTime; 
            private Integer status; 

            /**
             * ContentId.
             */
            public Builder contentId(Long contentId) {
                this.contentId = contentId;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * ProductionDeployStatus.
             */
            public Builder productionDeployStatus(Integer productionDeployStatus) {
                this.productionDeployStatus = productionDeployStatus;
                return this;
            }

            /**
             * ProductionDeployTime.
             */
            public Builder productionDeployTime(Long productionDeployTime) {
                this.productionDeployTime = productionDeployTime;
                return this;
            }

            /**
             * SandboxDeployStatus.
             */
            public Builder sandboxDeployStatus(Integer sandboxDeployStatus) {
                this.sandboxDeployStatus = sandboxDeployStatus;
                return this;
            }

            /**
             * SandboxDeployTime.
             */
            public Builder sandboxDeployTime(Long sandboxDeployTime) {
                this.sandboxDeployTime = sandboxDeployTime;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            public Files build() {
                return new Files(this);
            } 

        } 

    }
    public static class Pagination extends TeaModel {
        @NameInMap("PageIndex")
        private Integer pageIndex;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("TotalCount")
        private Integer totalCount;

        @NameInMap("TotalPageCount")
        private Integer totalPageCount;

        private Pagination(Builder builder) {
            this.pageIndex = builder.pageIndex;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
            this.totalPageCount = builder.totalPageCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Pagination create() {
            return builder().build();
        }

        /**
         * @return pageIndex
         */
        public Integer getPageIndex() {
            return this.pageIndex;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        /**
         * @return totalPageCount
         */
        public Integer getTotalPageCount() {
            return this.totalPageCount;
        }

        public static final class Builder {
            private Integer pageIndex; 
            private Integer pageSize; 
            private Integer totalCount; 
            private Integer totalPageCount; 

            /**
             * PageIndex.
             */
            public Builder pageIndex(Integer pageIndex) {
                this.pageIndex = pageIndex;
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
             * TotalCount.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            /**
             * TotalPageCount.
             */
            public Builder totalPageCount(Integer totalPageCount) {
                this.totalPageCount = totalPageCount;
                return this;
            }

            public Pagination build() {
                return new Pagination(this);
            } 

        } 

    }
    public static class FileList extends TeaModel {
        @NameInMap("Files")
        private java.util.List < Files> files;

        @NameInMap("Pagination")
        private Pagination pagination;

        private FileList(Builder builder) {
            this.files = builder.files;
            this.pagination = builder.pagination;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FileList create() {
            return builder().build();
        }

        /**
         * @return files
         */
        public java.util.List < Files> getFiles() {
            return this.files;
        }

        /**
         * @return pagination
         */
        public Pagination getPagination() {
            return this.pagination;
        }

        public static final class Builder {
            private java.util.List < Files> files; 
            private Pagination pagination; 

            /**
             * Files.
             */
            public Builder files(java.util.List < Files> files) {
                this.files = files;
                return this;
            }

            /**
             * Pagination.
             */
            public Builder pagination(Pagination pagination) {
                this.pagination = pagination;
                return this;
            }

            public FileList build() {
                return new FileList(this);
            } 

        } 

    }
}
