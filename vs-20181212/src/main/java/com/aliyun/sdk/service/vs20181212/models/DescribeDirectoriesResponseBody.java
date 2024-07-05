// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDirectoriesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDirectoriesResponseBody</p>
 */
public class DescribeDirectoriesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Directories")
    private java.util.List < Directories> directories;

    @com.aliyun.core.annotation.NameInMap("PageCount")
    private Long pageCount;

    @com.aliyun.core.annotation.NameInMap("PageNum")
    private Long pageNum;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private DescribeDirectoriesResponseBody(Builder builder) {
        this.directories = builder.directories;
        this.pageCount = builder.pageCount;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDirectoriesResponseBody create() {
        return builder().build();
    }

    /**
     * @return directories
     */
    public java.util.List < Directories> getDirectories() {
        return this.directories;
    }

    /**
     * @return pageCount
     */
    public Long getPageCount() {
        return this.pageCount;
    }

    /**
     * @return pageNum
     */
    public Long getPageNum() {
        return this.pageNum;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
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
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < Directories> directories; 
        private Long pageCount; 
        private Long pageNum; 
        private Long pageSize; 
        private String requestId; 
        private Long totalCount; 

        /**
         * Directories.
         */
        public Builder directories(java.util.List < Directories> directories) {
            this.directories = directories;
            return this;
        }

        /**
         * PageCount.
         */
        public Builder pageCount(Long pageCount) {
            this.pageCount = pageCount;
            return this;
        }

        /**
         * PageNum.
         */
        public Builder pageNum(Long pageNum) {
            this.pageNum = pageNum;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Long pageSize) {
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
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeDirectoriesResponseBody build() {
            return new DescribeDirectoriesResponseBody(this);
        } 

    } 

    public static class Directories extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreatedTime")
        private String createdTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("GroupId")
        private String groupId;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ParentId")
        private String parentId;

        private Directories(Builder builder) {
            this.createdTime = builder.createdTime;
            this.description = builder.description;
            this.groupId = builder.groupId;
            this.id = builder.id;
            this.name = builder.name;
            this.parentId = builder.parentId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Directories create() {
            return builder().build();
        }

        /**
         * @return createdTime
         */
        public String getCreatedTime() {
            return this.createdTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return groupId
         */
        public String getGroupId() {
            return this.groupId;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return parentId
         */
        public String getParentId() {
            return this.parentId;
        }

        public static final class Builder {
            private String createdTime; 
            private String description; 
            private String groupId; 
            private String id; 
            private String name; 
            private String parentId; 

            /**
             * CreatedTime.
             */
            public Builder createdTime(String createdTime) {
                this.createdTime = createdTime;
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
             * GroupId.
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
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
             * ParentId.
             */
            public Builder parentId(String parentId) {
                this.parentId = parentId;
                return this;
            }

            public Directories build() {
                return new Directories(this);
            } 

        } 

    }
}
