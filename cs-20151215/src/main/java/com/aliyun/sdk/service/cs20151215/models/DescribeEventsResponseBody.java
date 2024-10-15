// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeEventsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEventsResponseBody</p>
 */
public class DescribeEventsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("events")
    private java.util.List < Events> events;

    @com.aliyun.core.annotation.NameInMap("page_info")
    private PageInfo pageInfo;

    private DescribeEventsResponseBody(Builder builder) {
        this.events = builder.events;
        this.pageInfo = builder.pageInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEventsResponseBody create() {
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
         * <p>The details of the event.</p>
         */
        public Builder events(java.util.List < Events> events) {
            this.events = events;
            return this;
        }

        /**
         * <p>The pagination information.</p>
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        public DescribeEventsResponseBody build() {
            return new DescribeEventsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeEventsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEventsResponseBody</p>
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
             * <p>The status of the event.</p>
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
     * {@link DescribeEventsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEventsResponseBody</p>
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

            /**
             * <p>The ID of the cluster.</p>
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
             * <p>The source of the event.</p>
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * <p>The subject of the event.</p>
             * 
             * <strong>example:</strong>
             * <p>nodePool-id</p>
             */
            public Builder subject(String subject) {
                this.subject = subject;
                return this;
            }

            /**
             * <p>The time when the event started.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-11-23T20:48:01+08:00</p>
             */
            public Builder time(String time) {
                this.time = time;
                return this;
            }

            /**
             * <p>The event type. Valid values:</p>
             * <ul>
             * <li><code>cluster_create</code>: cluster creation.</li>
             * <li><code>cluster_scaleout</code>: cluster scale-out.</li>
             * <li><code>cluster_attach</code>: node addition.</li>
             * <li><code>cluster_delete</code>: cluster deletion.</li>
             * <li><code>cluster_upgrade</code>: cluster upgrades.</li>
             * <li><code>cluster_migrate</code>: cluster migration.</li>
             * <li><code>cluster_node_delete</code>: node removal.</li>
             * <li><code>cluster_node_drain</code>: node draining.</li>
             * <li><code>cluster_modify</code>: cluster modifications.</li>
             * <li><code>cluster_configuration_modify</code>: modifications of control plane configurations.</li>
             * <li><code>cluster_addon_install</code>: component installation.</li>
             * <li><code>cluster_addon_upgrade</code>: component updates.</li>
             * <li><code>cluster_addon_uninstall</code>: component uninstallation.</li>
             * <li><code>runtime_upgrade</code>: runtime updates.</li>
             * <li><code>nodepool_upgrade</code>: node pool upgrades.</li>
             * <li><code>nodepool_update</code>: node pool updates.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>nodepool_upgrade</p>
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
     * {@link DescribeEventsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEventsResponseBody</p>
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

            /**
             * <p>The page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNumber(Long pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * <p>The number of entries per page.</p>
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
