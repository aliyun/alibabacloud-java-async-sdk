// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEventsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEventsResponseBody</p>
 */
public class DescribeEventsResponseBody extends TeaModel {
    @NameInMap("events")
    private java.util.List < Events> events;

    @NameInMap("page_info")
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
         * The event details.
         */
        public Builder events(java.util.List < Events> events) {
            this.events = events;
            return this;
        }

        /**
         * The page information.
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        public DescribeEventsResponseBody build() {
            return new DescribeEventsResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("level")
        private String level;

        @NameInMap("reason")
        private String reason;

        @NameInMap("message")
        private String message;

        private Data(Builder builder) {
            this.level = builder.level;
            this.reason = builder.reason;
            this.message = builder.message;
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
         * @return reason
         */
        public String getReason() {
            return this.reason;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        public static final class Builder {
            private String level; 
            private String reason; 
            private String message; 

            /**
             * The level of the event.
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * The status of the event.
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * The event details.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
    public static class Events extends TeaModel {
        @NameInMap("event_id")
        private String eventId;

        @NameInMap("type")
        private String type;

        @NameInMap("source")
        private String source;

        @NameInMap("subject")
        private String subject;

        @NameInMap("time")
        private String time;

        @NameInMap("cluster_id")
        private String clusterId;

        @NameInMap("data")
        private Data data;

        private Events(Builder builder) {
            this.eventId = builder.eventId;
            this.type = builder.type;
            this.source = builder.source;
            this.subject = builder.subject;
            this.time = builder.time;
            this.clusterId = builder.clusterId;
            this.data = builder.data;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Events create() {
            return builder().build();
        }

        /**
         * @return eventId
         */
        public String getEventId() {
            return this.eventId;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
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

        public static final class Builder {
            private String eventId; 
            private String type; 
            private String source; 
            private String subject; 
            private String time; 
            private String clusterId; 
            private Data data; 

            /**
             * The ID of the event.
             */
            public Builder eventId(String eventId) {
                this.eventId = eventId;
                return this;
            }

            /**
             * The type of the event. Valid values:
             * <p>
             * -"Cluster_create": Creates a cluster.
             * -"Cluster_scaleout": scale out the cluster.
             * -"Cluster_attach ": adds an existing node.
             * -"Cluster_delete ": deletes a cluster.
             * -"Cluster_upgrade ": upgrades the cluster.
             * -"Cluster_migrate ": migrates the cluster.
             * -"Cluster_node_delete ": removes a node.
             * -"Cluster_node_drain ": clears the node.
             * -"Cluster_modig": modifies the cluster.
             * -"Cluster_configuration_modif": modifies the cluster control configuration.
             * -"Cluster_addon_install ": install components.
             * -"Cluster_addon_upgrade ": upgrades components.
             * -"Cluster_addon_uninstall ": uninstall the component.
             * -"Runtime_upgrade ": upgrades the runtime.
             * -"Nodepool_upgrade ": upgrades the node pool.
             * -"Nodepool_update": updates the node pool.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * The source of the event.
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * The subject of the event.
             */
            public Builder subject(String subject) {
                this.subject = subject;
                return this;
            }

            /**
             * The start time of the event.
             */
            public Builder time(String time) {
                this.time = time;
                return this;
            }

            /**
             * The ID of the cluster.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * The description of the event.
             */
            public Builder data(Data data) {
                this.data = data;
                return this;
            }

            public Events build() {
                return new Events(this);
            } 

        } 

    }
    public static class PageInfo extends TeaModel {
        @NameInMap("page_size")
        private Long pageSize;

        @NameInMap("page_number")
        private Long pageNumber;

        @NameInMap("total_count")
        private Long totalCount;

        private PageInfo(Builder builder) {
            this.pageSize = builder.pageSize;
            this.pageNumber = builder.pageNumber;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageInfo create() {
            return builder().build();
        }

        /**
         * @return pageSize
         */
        public Long getPageSize() {
            return this.pageSize;
        }

        /**
         * @return pageNumber
         */
        public Long getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Long pageSize; 
            private Long pageNumber; 
            private Long totalCount; 

            /**
             * The number of entries to return on each page.
             */
            public Builder pageSize(Long pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * The number of pages to return.
             */
            public Builder pageNumber(Long pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * The total number of results.
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
