// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListMqttRootTopicsResponseBody} extends {@link TeaModel}
 *
 * <p>ListMqttRootTopicsResponseBody</p>
 */
public class ListMqttRootTopicsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("RootTopics")
    private RootTopics rootTopics;

    private ListMqttRootTopicsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.rootTopics = builder.rootTopics;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMqttRootTopicsResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return rootTopics
     */
    public RootTopics getRootTopics() {
        return this.rootTopics;
    }

    public static final class Builder {
        private String requestId; 
        private RootTopics rootTopics; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * RootTopics.
         */
        public Builder rootTopics(RootTopics rootTopics) {
            this.rootTopics = rootTopics;
            return this;
        }

        public ListMqttRootTopicsResponseBody build() {
            return new ListMqttRootTopicsResponseBody(this);
        } 

    } 

    public static class List extends TeaModel {
        @NameInMap("AppKey")
        private String appKey;

        @NameInMap("CreateTime")
        private Integer createTime;

        @NameInMap("QueueName")
        private String queueName;

        @NameInMap("RootTopic")
        private String rootTopic;

        @NameInMap("Type")
        private String type;

        private List(Builder builder) {
            this.appKey = builder.appKey;
            this.createTime = builder.createTime;
            this.queueName = builder.queueName;
            this.rootTopic = builder.rootTopic;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return appKey
         */
        public String getAppKey() {
            return this.appKey;
        }

        /**
         * @return createTime
         */
        public Integer getCreateTime() {
            return this.createTime;
        }

        /**
         * @return queueName
         */
        public String getQueueName() {
            return this.queueName;
        }

        /**
         * @return rootTopic
         */
        public String getRootTopic() {
            return this.rootTopic;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String appKey; 
            private Integer createTime; 
            private String queueName; 
            private String rootTopic; 
            private String type; 

            /**
             * AppKey.
             */
            public Builder appKey(String appKey) {
                this.appKey = appKey;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(Integer createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * QueueName.
             */
            public Builder queueName(String queueName) {
                this.queueName = queueName;
                return this;
            }

            /**
             * RootTopic.
             */
            public Builder rootTopic(String rootTopic) {
                this.rootTopic = rootTopic;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
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
    public static class RootTopics extends TeaModel {
        @NameInMap("List")
        private java.util.List < List> list;

        @NameInMap("Pagination")
        private Pagination pagination;

        private RootTopics(Builder builder) {
            this.list = builder.list;
            this.pagination = builder.pagination;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RootTopics create() {
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

            public RootTopics build() {
                return new RootTopics(this);
            } 

        } 

    }
}
