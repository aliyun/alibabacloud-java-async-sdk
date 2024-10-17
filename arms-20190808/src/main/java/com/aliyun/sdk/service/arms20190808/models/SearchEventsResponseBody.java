// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>Specifies whether the alert event is triggered. If you do not set this parameter, all alert events are queried. Valid values:</p>
         * <ul>
         * <li><code>1</code>: The event is triggered.</li>
         * <li><code>0</code>: The event is not triggered.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder isTrigger(Integer isTrigger) {
            this.isTrigger = isTrigger;
            return this;
        }

        /**
         * <p>The struct returned.</p>
         */
        public Builder pageBean(PageBean pageBean) {
            this.pageBean = pageBean;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>32940175-181B-4B93-966E-4BB69176****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public SearchEventsResponseBody build() {
            return new SearchEventsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link SearchEventsResponseBody} extends {@link TeaModel}
     *
     * <p>SearchEventsResponseBody</p>
     */
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
             * <p>The ID of the alert rule that is associated with the event.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder alertId(Long alertId) {
                this.alertId = alertId;
                return this;
            }

            /**
             * <p>The name of the alert rule that is associated with the event.</p>
             * 
             * <strong>example:</strong>
             * <p>alertName</p>
             */
            public Builder alertName(String alertName) {
                this.alertName = alertName;
                return this;
            }

            /**
             * <p>The condition of the alert rule.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;operator&quot;:&quot;&amp;&quot;,&quot;rules&quot;:[{&quot;aggregates&quot;:&quot;AVG&quot;,&quot;alias&quot;:&quot;JVM_线程总数&quot;,&quot;measure&quot;:&quot;appstat.jvm.ThreadCount&quot;,&quot;nValue&quot;:1,&quot;operator&quot;:&quot;HOH_DOWN&quot;,&quot;value&quot;:50.0}]}</p>
             */
            public Builder alertRule(String alertRule) {
                this.alertRule = alertRule;
                return this;
            }

            /**
             * <p>The type of the alert rule. This parameter is not returned. Valid values:</p>
             * <ul>
             * <li><code>1</code>: custom alert rules to monitor drill-down data sets</li>
             * <li><code>3</code>: custom alert rules to monitor tiled data sets</li>
             * <li><code>4</code>: alert rules to monitor the frontend, including the default frontend alert rules</li>
             * <li><code>5</code>: alert rules to monitor applications, including the default application alert rules</li>
             * <li><code>6</code>: the default frontend alert rules</li>
             * <li><code>7</code>: the default application alert rules</li>
             * <li><code>8</code>: Tracing Analysis alert rules</li>
             * <li><code>101</code>: Prometheus alert rules</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder alertType(Integer alertType) {
                this.alertType = alertType;
                return this;
            }

            /**
             * <p>The severity of the event.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder eventLevel(String eventLevel) {
                this.eventLevel = eventLevel;
                return this;
            }

            /**
             * <p>The timestamp when the event occurred.</p>
             * 
             * <strong>example:</strong>
             * <p>1595569020000</p>
             */
            public Builder eventTime(Long eventTime) {
                this.eventTime = eventTime;
                return this;
            }

            /**
             * <p>The ID of the event record.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The list of event URLs.</p>
             */
            public Builder links(java.util.List < String > links) {
                this.links = links;
                return this;
            }

            /**
             * <p>The event content. The parameter value is a JSON string. Each key indicates a dimension and each value indicates the alert content in the dimension.</p>
             * 
             * <strong>example:</strong>
             * <p>unknow紧急报警\nip：172.27.XX.XX\n应用名 = test\nRegion = cn-shenzhen\n异常信息 = {&quot;timestamp&quot;：&quot;1615447972235&quot;}</p>
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
    /**
     * 
     * {@link SearchEventsResponseBody} extends {@link TeaModel}
     *
     * <p>SearchEventsResponseBody</p>
     */
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
             * <p>The information about the alert events.</p>
             */
            public Builder event(java.util.List < Event> event) {
                this.event = event;
                return this;
            }

            /**
             * <p>The page number of the returned page.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * <p>The number of entries returned per page.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
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
