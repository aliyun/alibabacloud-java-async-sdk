// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SearchEventsResponseBody} extends {@link TeaModel}
 *
 * <p>SearchEventsResponseBody</p>
 */
public class SearchEventsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("IsTrigger")
    private Integer isTrigger;

    @com.aliyun.core.annotation.NameInMap("PageBean")
    private PageBean pageBean;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private SearchEventsResponseBody(Builder builder) {
        this.isTrigger = builder.isTrigger;
        this.pageBean = builder.pageBean;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchEventsResponseBody create() {
        return builder().build();
    }

    /**
     * @return isTrigger
     */
    public Integer getIsTrigger() {
        return this.isTrigger;
    }

    /**
     * @return pageBean
     */
    public PageBean getPageBean() {
        return this.pageBean;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer isTrigger; 
        private PageBean pageBean; 
        private String requestId; 

        /**
         * Specifies whether the alert event is triggered. If you do not set this parameter, all alert events are queried. Valid values:
         * <p>
         * 
         * *   `1`: The event is triggered.
         * *   `0`: The event is not triggered.
         */
        public Builder isTrigger(Integer isTrigger) {
            this.isTrigger = isTrigger;
            return this;
        }

        /**
         * The struct returned.
         */
        public Builder pageBean(PageBean pageBean) {
            this.pageBean = pageBean;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public SearchEventsResponseBody build() {
            return new SearchEventsResponseBody(this);
        } 

    } 

    public static class Event extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlertId")
        private Long alertId;

        @com.aliyun.core.annotation.NameInMap("AlertName")
        private String alertName;

        @com.aliyun.core.annotation.NameInMap("AlertRule")
        private String alertRule;

        @com.aliyun.core.annotation.NameInMap("AlertType")
        private Integer alertType;

        @com.aliyun.core.annotation.NameInMap("EventLevel")
        private String eventLevel;

        @com.aliyun.core.annotation.NameInMap("EventTime")
        private Long eventTime;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Links")
        private java.util.List < String > links;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        private Event(Builder builder) {
            this.alertId = builder.alertId;
            this.alertName = builder.alertName;
            this.alertRule = builder.alertRule;
            this.alertType = builder.alertType;
            this.eventLevel = builder.eventLevel;
            this.eventTime = builder.eventTime;
            this.id = builder.id;
            this.links = builder.links;
            this.message = builder.message;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Event create() {
            return builder().build();
        }

        /**
         * @return alertId
         */
        public Long getAlertId() {
            return this.alertId;
        }

        /**
         * @return alertName
         */
        public String getAlertName() {
            return this.alertName;
        }

        /**
         * @return alertRule
         */
        public String getAlertRule() {
            return this.alertRule;
        }

        /**
         * @return alertType
         */
        public Integer getAlertType() {
            return this.alertType;
        }

        /**
         * @return eventLevel
         */
        public String getEventLevel() {
            return this.eventLevel;
        }

        /**
         * @return eventTime
         */
        public Long getEventTime() {
            return this.eventTime;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return links
         */
        public java.util.List < String > getLinks() {
            return this.links;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        public static final class Builder {
            private Long alertId; 
            private String alertName; 
            private String alertRule; 
            private Integer alertType; 
            private String eventLevel; 
            private Long eventTime; 
            private Long id; 
            private java.util.List < String > links; 
            private String message; 

            /**
             * The ID of the alert rule that is associated with the event.
             */
            public Builder alertId(Long alertId) {
                this.alertId = alertId;
                return this;
            }

            /**
             * The name of the alert rule that is associated with the event.
             */
            public Builder alertName(String alertName) {
                this.alertName = alertName;
                return this;
            }

            /**
             * The condition of the alert rule.
             */
            public Builder alertRule(String alertRule) {
                this.alertRule = alertRule;
                return this;
            }

            /**
             * The type of the alert rule. This parameter is not returned. Valid values:
             * <p>
             * 
             * *   `1`: custom alert rules to monitor drill-down data sets
             * *   `3`: custom alert rules to monitor tiled data sets
             * *   `4`: alert rules to monitor the frontend, including the default frontend alert rules
             * *   `5`: alert rules to monitor applications, including the default application alert rules
             * *   `6`: the default frontend alert rules
             * *   `7`: the default application alert rules
             * *   `8`: Tracing Analysis alert rules
             * *   `101`: Prometheus alert rules
             */
            public Builder alertType(Integer alertType) {
                this.alertType = alertType;
                return this;
            }

            /**
             * The severity of the event.
             */
            public Builder eventLevel(String eventLevel) {
                this.eventLevel = eventLevel;
                return this;
            }

            /**
             * The timestamp when the event occurred.
             */
            public Builder eventTime(Long eventTime) {
                this.eventTime = eventTime;
                return this;
            }

            /**
             * The ID of the event record.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * The list of event URLs.
             */
            public Builder links(java.util.List < String > links) {
                this.links = links;
                return this;
            }

            /**
             * The event content. The parameter value is a JSON string. Each key indicates a dimension and each value indicates the alert content in the dimension.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            public Event build() {
                return new Event(this);
            } 

        } 

    }
    public static class PageBean extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Event")
        private java.util.List < Event> event;

        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private PageBean(Builder builder) {
            this.event = builder.event;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageBean create() {
            return builder().build();
        }

        /**
         * @return event
         */
        public java.util.List < Event> getEvent() {
            return this.event;
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
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List < Event> event; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer totalCount; 

            /**
             * The information about the alert events.
             */
            public Builder event(java.util.List < Event> event) {
                this.event = event;
                return this;
            }

            /**
             * The page number of the returned page.
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * The number of entries returned per page.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * The total number of entries returned.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public PageBean build() {
                return new PageBean(this);
            } 

        } 

    }
}
