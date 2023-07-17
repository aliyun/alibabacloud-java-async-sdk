// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20210422.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SearchEventsResponseBody} extends {@link TeaModel}
 *
 * <p>SearchEventsResponseBody</p>
 */
public class SearchEventsResponseBody extends TeaModel {
    @NameInMap("IsTrigger")
    private Integer isTrigger;

    @NameInMap("PageBean")
    private PageBean pageBean;

    @NameInMap("RequestId")
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
         * IsTrigger.
         */
        public Builder isTrigger(Integer isTrigger) {
            this.isTrigger = isTrigger;
            return this;
        }

        /**
         * PageBean.
         */
        public Builder pageBean(PageBean pageBean) {
            this.pageBean = pageBean;
            return this;
        }

        /**
         * RequestId.
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
        @NameInMap("AlertId")
        private Long alertId;

        @NameInMap("AlertName")
        private String alertName;

        @NameInMap("AlertRule")
        private String alertRule;

        @NameInMap("AlertType")
        private Integer alertType;

        @NameInMap("EventLevel")
        private String eventLevel;

        @NameInMap("EventTime")
        private Long eventTime;

        @NameInMap("Id")
        private Long id;

        @NameInMap("Links")
        private java.util.List < String > links;

        @NameInMap("Message")
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
             * AlertId.
             */
            public Builder alertId(Long alertId) {
                this.alertId = alertId;
                return this;
            }

            /**
             * AlertName.
             */
            public Builder alertName(String alertName) {
                this.alertName = alertName;
                return this;
            }

            /**
             * AlertRule.
             */
            public Builder alertRule(String alertRule) {
                this.alertRule = alertRule;
                return this;
            }

            /**
             * AlertType.
             */
            public Builder alertType(Integer alertType) {
                this.alertType = alertType;
                return this;
            }

            /**
             * EventLevel.
             */
            public Builder eventLevel(String eventLevel) {
                this.eventLevel = eventLevel;
                return this;
            }

            /**
             * EventTime.
             */
            public Builder eventTime(Long eventTime) {
                this.eventTime = eventTime;
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
             * Links.
             */
            public Builder links(java.util.List < String > links) {
                this.links = links;
                return this;
            }

            /**
             * Message.
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
        @NameInMap("Event")
        private java.util.List < Event> event;

        @NameInMap("PageNumber")
        private Integer pageNumber;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("TotalCount")
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
             * Event.
             */
            public Builder event(java.util.List < Event> event) {
                this.event = event;
                return this;
            }

            /**
             * PageNumber.
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
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

            public PageBean build() {
                return new PageBean(this);
            } 

        } 

    }
}
