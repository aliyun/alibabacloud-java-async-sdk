// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datahub20191120.models;

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
 * {@link ListProjectsResponseBody} extends {@link TeaModel}
 *
 * <p>ListProjectsResponseBody</p>
 */
public class ListProjectsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("List")
    private List list;

    @com.aliyun.core.annotation.NameInMap("PageCount")
    private String pageCount;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private String pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private String pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private String totalCount;

    private ListProjectsResponseBody(Builder builder) {
        this.list = builder.list;
        this.pageCount = builder.pageCount;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProjectsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return list
     */
    public List getList() {
        return this.list;
    }

    /**
     * @return pageCount
     */
    public String getPageCount() {
        return this.pageCount;
    }

    /**
     * @return pageNumber
     */
    public String getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return totalCount
     */
    public String getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private List list; 
        private String pageCount; 
        private String pageNumber; 
        private String pageSize; 
        private String requestId; 
        private Boolean success; 
        private String totalCount; 

        private Builder() {
        } 

        private Builder(ListProjectsResponseBody model) {
            this.list = model.list;
            this.pageCount = model.pageCount;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.success = model.success;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>Project name</p>
         */
        public Builder list(List list) {
            this.list = list;
            return this;
        }

        /**
         * <p>Total number of pages</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageCount(String pageCount) {
            this.pageCount = pageCount;
            return this;
        }

        /**
         * <p>Current page number</p>
         * 
         * <strong>example:</strong>
         * <p>84</p>
         */
        public Builder pageNumber(String pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>Page size</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(String pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Request ID</p>
         * 
         * <strong>example:</strong>
         * <p>20250401102332e68e3d0b04ab4904</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Whether the operation was successful</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>Total number of query results</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListProjectsResponseBody build() {
            return new ListProjectsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListProjectsResponseBody} extends {@link TeaModel}
     *
     * <p>ListProjectsResponseBody</p>
     */
    public static class Project extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Comment")
        private String comment;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("Creator")
        private String creator;

        @com.aliyun.core.annotation.NameInMap("CreatorName")
        private String creatorName;

        @com.aliyun.core.annotation.NameInMap("ProjectName")
        private String projectName;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private Long updateTime;

        private Project(Builder builder) {
            this.comment = builder.comment;
            this.createTime = builder.createTime;
            this.creator = builder.creator;
            this.creatorName = builder.creatorName;
            this.projectName = builder.projectName;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Project create() {
            return builder().build();
        }

        /**
         * @return comment
         */
        public String getComment() {
            return this.comment;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return creator
         */
        public String getCreator() {
            return this.creator;
        }

        /**
         * @return creatorName
         */
        public String getCreatorName() {
            return this.creatorName;
        }

        /**
         * @return projectName
         */
        public String getProjectName() {
            return this.projectName;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String comment; 
            private Long createTime; 
            private String creator; 
            private String creatorName; 
            private String projectName; 
            private Long updateTime; 

            private Builder() {
            } 

            private Builder(Project model) {
                this.comment = model.comment;
                this.createTime = model.createTime;
                this.creator = model.creator;
                this.creatorName = model.creatorName;
                this.projectName = model.projectName;
                this.updateTime = model.updateTime;
            } 

            /**
             * <p>Text comment for the field</p>
             * 
             * <strong>example:</strong>
             * <p>测试专用</p>
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * <p>Creation time</p>
             * 
             * <strong>example:</strong>
             * <p>1708171905000</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>Creator ID</p>
             * 
             * <strong>example:</strong>
             * <p>1048133943212399</p>
             */
            public Builder creator(String creator) {
                this.creator = creator;
                return this;
            }

            /**
             * <p>Creator&quot;s name</p>
             * 
             * <strong>example:</strong>
             * <p>user_name</p>
             */
            public Builder creatorName(String creatorName) {
                this.creatorName = creatorName;
                return this;
            }

            /**
             * <p>Project name</p>
             * 
             * <strong>example:</strong>
             * <p>poc_test</p>
             */
            public Builder projectName(String projectName) {
                this.projectName = projectName;
                return this;
            }

            /**
             * <p>Update time</p>
             * 
             * <strong>example:</strong>
             * <p>1708171905000</p>
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public Project build() {
                return new Project(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListProjectsResponseBody} extends {@link TeaModel}
     *
     * <p>ListProjectsResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Project")
        private java.util.List<Project> project;

        private List(Builder builder) {
            this.project = builder.project;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return project
         */
        public java.util.List<Project> getProject() {
            return this.project;
        }

        public static final class Builder {
            private java.util.List<Project> project; 

            private Builder() {
            } 

            private Builder(List model) {
                this.project = model.project;
            } 

            /**
             * Project.
             */
            public Builder project(java.util.List<Project> project) {
                this.project = project;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
}
