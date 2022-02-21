// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListUpstreamAppServersResponseBody} extends {@link TeaModel}
 *
 * <p>ListUpstreamAppServersResponseBody</p>
 */
public class ListUpstreamAppServersResponseBody extends TeaModel {
    @NameInMap("AppServers")
    private AppServers appServers;

    @NameInMap("RequestId")
    private String requestId;

    private ListUpstreamAppServersResponseBody(Builder builder) {
        this.appServers = builder.appServers;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListUpstreamAppServersResponseBody create() {
        return builder().build();
    }

    /**
     * @return appServers
     */
    public AppServers getAppServers() {
        return this.appServers;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private AppServers appServers; 
        private String requestId; 

        /**
         * AppServers.
         */
        public Builder appServers(AppServers appServers) {
            this.appServers = appServers;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListUpstreamAppServersResponseBody build() {
            return new ListUpstreamAppServersResponseBody(this);
        } 

    } 

    public static class List extends TeaModel {
        @NameInMap("GmtCreate")
        private Long gmtCreate;

        @NameInMap("GmtModified")
        private Long gmtModified;

        @NameInMap("Id")
        private Long id;

        @NameInMap("Name")
        private String name;

        @NameInMap("PAppKey")
        private String PAppKey;

        @NameInMap("ProjectId")
        private String projectId;

        @NameInMap("QueueNameList")
        private String queueNameList;

        @NameInMap("Tags")
        private String tags;

        private List(Builder builder) {
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.name = builder.name;
            this.PAppKey = builder.PAppKey;
            this.projectId = builder.projectId;
            this.queueNameList = builder.queueNameList;
            this.tags = builder.tags;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
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
         * @return PAppKey
         */
        public String getPAppKey() {
            return this.PAppKey;
        }

        /**
         * @return projectId
         */
        public String getProjectId() {
            return this.projectId;
        }

        /**
         * @return queueNameList
         */
        public String getQueueNameList() {
            return this.queueNameList;
        }

        /**
         * @return tags
         */
        public String getTags() {
            return this.tags;
        }

        public static final class Builder {
            private Long gmtCreate; 
            private Long gmtModified; 
            private Long id; 
            private String name; 
            private String PAppKey; 
            private String projectId; 
            private String queueNameList; 
            private String tags; 

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
             * PAppKey.
             */
            public Builder PAppKey(String PAppKey) {
                this.PAppKey = PAppKey;
                return this;
            }

            /**
             * ProjectId.
             */
            public Builder projectId(String projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * QueueNameList.
             */
            public Builder queueNameList(String queueNameList) {
                this.queueNameList = queueNameList;
                return this;
            }

            /**
             * Tags.
             */
            public Builder tags(String tags) {
                this.tags = tags;
                return this;
            }

            public List build() {
                return new List(this);
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
    public static class AppServers extends TeaModel {
        @NameInMap("List")
        private java.util.List < List> list;

        @NameInMap("Pagination")
        private Pagination pagination;

        private AppServers(Builder builder) {
            this.list = builder.list;
            this.pagination = builder.pagination;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AppServers create() {
            return builder().build();
        }

        /**
         * @return list
         */
        public java.util.List < List> getList() {
            return this.list;
        }

        /**
         * @return pagination
         */
        public Pagination getPagination() {
            return this.pagination;
        }

        public static final class Builder {
            private java.util.List < List> list; 
            private Pagination pagination; 

            /**
             * List.
             */
            public Builder list(java.util.List < List> list) {
                this.list = list;
                return this;
            }

            /**
             * Pagination.
             */
            public Builder pagination(Pagination pagination) {
                this.pagination = pagination;
                return this;
            }

            public AppServers build() {
                return new AppServers(this);
            } 

        } 

    }
}
