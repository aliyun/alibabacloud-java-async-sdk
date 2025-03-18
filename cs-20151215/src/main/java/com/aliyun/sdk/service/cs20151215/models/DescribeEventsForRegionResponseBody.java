// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

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
 * {@link DescribeEventsForRegionResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEventsForRegionResponseBody</p>
 */
public class DescribeEventsForRegionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("events")
    private java.util.List<Events> events;

    @com.aliyun.core.annotation.NameInMap("page_info")
    private PageInfo pageInfo;

    private DescribeEventsForRegionResponseBody(Builder builder) {
        this.events = builder.events;
        this.pageInfo = builder.pageInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEventsForRegionResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return events
     */
    public java.util.List<Events> getEvents() {
        return this.events;
    }

    /**
     * @return pageInfo
     */
    public PageInfo getPageInfo() {
        return this.pageInfo;
    }

    public static final class Builder {
        private java.util.List<Events> events; 
        private PageInfo pageInfo; 

        private Builder() {
        } 

        private Builder(DescribeEventsForRegionResponseBody model) {
            this.events = model.events;
            this.pageInfo = model.pageInfo;
        } 

        /**
         * <p>The events.</p>
         */
        public Builder events(java.util.List<Events> events) {
            this.events = events;
            return this;
        }

        /**
         * <p>The pagination details.</p>
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        public DescribeEventsForRegionResponseBody build() {
            return new DescribeEventsForRegionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeEventsForRegionResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEventsForRegionResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("level")
        private String level;

        @com.aliyun.core.annotation.NameInMap("message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("reason")
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

            private Builder() {
            } 

            private Builder(Data model) {
                this.level = model.level;
                this.message = model.message;
                this.reason = model.reason;
            } 

            /**
             * <p>The severity level of the event.</p>
             * 
             * <strong>example:</strong>
             * <p>info</p>
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * <p>The details of the event.</p>
             * 
             * <strong>example:</strong>
             * <p>Start to upgrade NodePool nodePool/nodePool-A</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The event status.</p>
             * 
             * <strong>example:</strong>
             * <p>Started</p>
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
    /**
     * 
     * {@link DescribeEventsForRegionResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEventsForRegionResponseBody</p>
     */
    public static class Events extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cluster_id")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("data")
        private Data data;

        @com.aliyun.core.annotation.NameInMap("event_id")
        private String eventId;

        @com.aliyun.core.annotation.NameInMap("source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("subject")
        private String subject;

        @com.aliyun.core.annotation.NameInMap("time")
        private String time;

        @com.aliyun.core.annotation.NameInMap("type")
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

            private Builder() {
            } 

            private Builder(Events model) {
                this.clusterId = model.clusterId;
                this.data = model.data;
                this.eventId = model.eventId;
                this.source = model.source;
                this.subject = model.subject;
                this.time = model.time;
                this.type = model.type;
            } 

            /**
             * <p>The cluster ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cluster-id</p>
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * <p>The description of the event.</p>
             */
            public Builder data(Data data) {
                this.data = data;
                return this;
            }

            /**
             * <p>The event ID.</p>
             * 
             * <strong>example:</strong>
             * <p>A234-1234-1234</p>
             */
            public Builder eventId(String eventId) {
                this.eventId = eventId;
                return this;
            }

            /**
             * <p>The event source.</p>
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * <p>The object associated with the event.</p>
             * 
             * <strong>example:</strong>
             * <p>nodePool-id</p>
             */
            public Builder subject(String subject) {
                this.subject = subject;
                return this;
            }

            /**
             * <p>The time when the event was generated.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-12-01T17:31:00Z</p>
             */
            public Builder time(String time) {
                this.time = time;
                return this;
            }

            /**
             * <p>The event type.</p>
             * 
             * <strong>example:</strong>
             * <p>nodePool_upgrade</p>
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
    /**
     * 
     * {@link DescribeEventsForRegionResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEventsForRegionResponseBody</p>
     */
    public static class PageInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("page_number")
        private Long pageNumber;

        @com.aliyun.core.annotation.NameInMap("page_size")
        private Long pageSize;

        @com.aliyun.core.annotation.NameInMap("total_count")
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

            private Builder() {
            } 

            private Builder(PageInfo model) {
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The number of pages.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNumber(Long pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * <p>The number of records on each page.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder pageSize(Long pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
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
