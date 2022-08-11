// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeClusterEventsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeClusterEventsResponseBody</p>
 */
public class DescribeClusterEventsResponseBody extends TeaModel {
    @NameInMap("events")
    private java.util.List < Events> events;

    @NameInMap("page_info")
    private PageInfo pageInfo;

    private DescribeClusterEventsResponseBody(Builder builder) {
        this.events = builder.events;
        this.pageInfo = builder.pageInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeClusterEventsResponseBody create() {
        return builder().build();
    }

    /**
     * @return events
     */
    public java.util.List < Events> getEvents() {
        return this.events;
    }

    /**
     * @return pageInfo
     */
    public PageInfo getPageInfo() {
        return this.pageInfo;
    }

    public static final class Builder {
        private java.util.List < Events> events; 
        private PageInfo pageInfo; 

        /**
         * 事件列表。
         */
        public Builder events(java.util.List < Events> events) {
            this.events = events;
            return this;
        }

        /**
         * 分页信息。
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        public DescribeClusterEventsResponseBody build() {
            return new DescribeClusterEventsResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("level")
        private String level;

        @NameInMap("message")
        private String message;

        @NameInMap("reason")
        private String reason;

        private Data(Builder builder) {
            this.level = builder.level;
            this.message = builder.message;
            this.reason = builder.reason;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return level
         */
        public String getLevel() {
            return this.level;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return reason
         */
        public String getReason() {
            return this.reason;
        }

        public static final class Builder {
            private String level; 
            private String message; 
            private String reason; 

            /**
             * 事件级别。
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * 事件详情。
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * 事件状态。
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
    public static class Events extends TeaModel {
        @NameInMap("cluster_id")
        private String clusterId;

        @NameInMap("data")
        private Data data;

        @NameInMap("event_id")
        private String eventId;

        @NameInMap("source")
        private String source;

        @NameInMap("subject")
        private String subject;

        @NameInMap("time")
        private String time;

        @NameInMap("type")
        private String type;

        private Events(Builder builder) {
            this.clusterId = builder.clusterId;
            this.data = builder.data;
            this.eventId = builder.eventId;
            this.source = builder.source;
            this.subject = builder.subject;
            this.time = builder.time;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Events create() {
            return builder().build();
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return data
         */
        public Data getData() {
            return this.data;
        }

        /**
         * @return eventId
         */
        public String getEventId() {
            return this.eventId;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return subject
         */
        public String getSubject() {
            return this.subject;
        }

        /**
         * @return time
         */
        public String getTime() {
            return this.time;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String clusterId; 
            private Data data; 
            private String eventId; 
            private String source; 
            private String subject; 
            private String time; 
            private String type; 

            /**
             * 集群ID。
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * 事件描述。
             */
            public Builder data(Data data) {
                this.data = data;
                return this;
            }

            /**
             * 事件ID。
             */
            public Builder eventId(String eventId) {
                this.eventId = eventId;
                return this;
            }

            /**
             * 事件源。
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * 事件子项。
             */
            public Builder subject(String subject) {
                this.subject = subject;
                return this;
            }

            /**
             * 事件开始时间。
             */
            public Builder time(String time) {
                this.time = time;
                return this;
            }

            /**
             * 事件类型。
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Events build() {
                return new Events(this);
            } 

        } 

    }
    public static class PageInfo extends TeaModel {
        @NameInMap("page_number")
        private Long pageNumber;

        @NameInMap("page_size")
        private Long pageSize;

        @NameInMap("total_count")
        private Long totalCount;

        private PageInfo(Builder builder) {
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageInfo create() {
            return builder().build();
        }

        /**
         * @return pageNumber
         */
        public Long getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return pageSize
         */
        public Long getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Long pageNumber; 
            private Long pageSize; 
            private Long totalCount; 

            /**
             * 分页页数。
             */
            public Builder pageNumber(Long pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * 每页大小。
             */
            public Builder pageSize(Long pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * 结果总数。
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public PageInfo build() {
                return new PageInfo(this);
            } 

        } 

    }
}
