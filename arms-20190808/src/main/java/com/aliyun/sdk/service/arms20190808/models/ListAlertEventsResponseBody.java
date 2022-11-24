// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAlertEventsResponseBody} extends {@link TeaModel}
 *
 * <p>ListAlertEventsResponseBody</p>
 */
public class ListAlertEventsResponseBody extends TeaModel {
    @NameInMap("PageBean")
    private PageBean pageBean;

    @NameInMap("RequestId")
    private String requestId;

    private ListAlertEventsResponseBody(Builder builder) {
        this.pageBean = builder.pageBean;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAlertEventsResponseBody create() {
        return builder().build();
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
        private PageBean pageBean; 
        private String requestId; 

        /**
         * 返回结构体
         */
        public Builder pageBean(PageBean pageBean) {
            this.pageBean = pageBean;
            return this;
        }

        /**
         * 请求ID
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListAlertEventsResponseBody build() {
            return new ListAlertEventsResponseBody(this);
        } 

    } 

    public static class Alarms extends TeaModel {
        @NameInMap("AlarmId")
        private Long alarmId;

        @NameInMap("AlarmName")
        private String alarmName;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("State")
        private Integer state;

        private Alarms(Builder builder) {
            this.alarmId = builder.alarmId;
            this.alarmName = builder.alarmName;
            this.createTime = builder.createTime;
            this.state = builder.state;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Alarms create() {
            return builder().build();
        }

        /**
         * @return alarmId
         */
        public Long getAlarmId() {
            return this.alarmId;
        }

        /**
         * @return alarmName
         */
        public String getAlarmName() {
            return this.alarmName;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return state
         */
        public Integer getState() {
            return this.state;
        }

        public static final class Builder {
            private Long alarmId; 
            private String alarmName; 
            private String createTime; 
            private Integer state; 

            /**
             * 告警ID
             */
            public Builder alarmId(Long alarmId) {
                this.alarmId = alarmId;
                return this;
            }

            /**
             * 告警名称
             */
            public Builder alarmName(String alarmName) {
                this.alarmName = alarmName;
                return this;
            }

            /**
             * 告警创建时间
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * 告警状态(0-待处理，1-处理中，2-已解决）
             */
            public Builder state(Integer state) {
                this.state = state;
                return this;
            }

            public Alarms build() {
                return new Alarms(this);
            } 

        } 

    }
    public static class Events extends TeaModel {
        @NameInMap("Alarms")
        private java.util.List < Alarms> alarms;

        @NameInMap("AlertName")
        private String alertName;

        @NameInMap("Annotations")
        private String annotations;

        @NameInMap("Description")
        private String description;

        @NameInMap("EndTime")
        private String endTime;

        @NameInMap("GeneratorURL")
        private String generatorURL;

        @NameInMap("HandlerName")
        private String handlerName;

        @NameInMap("IntegrationName")
        private String integrationName;

        @NameInMap("IntegrationType")
        private String integrationType;

        @NameInMap("Labels")
        private String labels;

        @NameInMap("ReceiveTime")
        private String receiveTime;

        @NameInMap("Severity")
        private String severity;

        @NameInMap("StartTime")
        private String startTime;

        @NameInMap("Status")
        private String status;

        private Events(Builder builder) {
            this.alarms = builder.alarms;
            this.alertName = builder.alertName;
            this.annotations = builder.annotations;
            this.description = builder.description;
            this.endTime = builder.endTime;
            this.generatorURL = builder.generatorURL;
            this.handlerName = builder.handlerName;
            this.integrationName = builder.integrationName;
            this.integrationType = builder.integrationType;
            this.labels = builder.labels;
            this.receiveTime = builder.receiveTime;
            this.severity = builder.severity;
            this.startTime = builder.startTime;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Events create() {
            return builder().build();
        }

        /**
         * @return alarms
         */
        public java.util.List < Alarms> getAlarms() {
            return this.alarms;
        }

        /**
         * @return alertName
         */
        public String getAlertName() {
            return this.alertName;
        }

        /**
         * @return annotations
         */
        public String getAnnotations() {
            return this.annotations;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return generatorURL
         */
        public String getGeneratorURL() {
            return this.generatorURL;
        }

        /**
         * @return handlerName
         */
        public String getHandlerName() {
            return this.handlerName;
        }

        /**
         * @return integrationName
         */
        public String getIntegrationName() {
            return this.integrationName;
        }

        /**
         * @return integrationType
         */
        public String getIntegrationType() {
            return this.integrationType;
        }

        /**
         * @return labels
         */
        public String getLabels() {
            return this.labels;
        }

        /**
         * @return receiveTime
         */
        public String getReceiveTime() {
            return this.receiveTime;
        }

        /**
         * @return severity
         */
        public String getSeverity() {
            return this.severity;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private java.util.List < Alarms> alarms; 
            private String alertName; 
            private String annotations; 
            private String description; 
            private String endTime; 
            private String generatorURL; 
            private String handlerName; 
            private String integrationName; 
            private String integrationType; 
            private String labels; 
            private String receiveTime; 
            private String severity; 
            private String startTime; 
            private String status; 

            /**
             * 关联告警
             */
            public Builder alarms(java.util.List < Alarms> alarms) {
                this.alarms = alarms;
                return this;
            }

            /**
             * 告警名称
             */
            public Builder alertName(String alertName) {
                this.alertName = alertName;
                return this;
            }

            /**
             * 注释列表
             */
            public Builder annotations(String annotations) {
                this.annotations = annotations;
                return this;
            }

            /**
             * 事件描述
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * 结束时间
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * 事件地址
             */
            public Builder generatorURL(String generatorURL) {
                this.generatorURL = generatorURL;
                return this;
            }

            /**
             * HandlerName.
             */
            public Builder handlerName(String handlerName) {
                this.handlerName = handlerName;
                return this;
            }

            /**
             * 集成名称
             */
            public Builder integrationName(String integrationName) {
                this.integrationName = integrationName;
                return this;
            }

            /**
             * 集成类型
             */
            public Builder integrationType(String integrationType) {
                this.integrationType = integrationType;
                return this;
            }

            /**
             * 标签列表
             */
            public Builder labels(String labels) {
                this.labels = labels;
                return this;
            }

            /**
             * 事件接受时间
             */
            public Builder receiveTime(String receiveTime) {
                this.receiveTime = receiveTime;
                return this;
            }

            /**
             * 告警等级(critical - p1 , error - p2, warning - p3, page - p4, default - p6)
             */
            public Builder severity(String severity) {
                this.severity = severity;
                return this;
            }

            /**
             * 开始时间
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * 告警状态(Active - 正在发生, Silenced - 被静默, Resolved - 已恢复 )
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Events build() {
                return new Events(this);
            } 

        } 

    }
    public static class PageBean extends TeaModel {
        @NameInMap("Events")
        private java.util.List < Events> events;

        @NameInMap("Page")
        private Long page;

        @NameInMap("Size")
        private Long size;

        @NameInMap("Total")
        private Long total;

        private PageBean(Builder builder) {
            this.events = builder.events;
            this.page = builder.page;
            this.size = builder.size;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageBean create() {
            return builder().build();
        }

        /**
         * @return events
         */
        public java.util.List < Events> getEvents() {
            return this.events;
        }

        /**
         * @return page
         */
        public Long getPage() {
            return this.page;
        }

        /**
         * @return size
         */
        public Long getSize() {
            return this.size;
        }

        /**
         * @return total
         */
        public Long getTotal() {
            return this.total;
        }

        public static final class Builder {
            private java.util.List < Events> events; 
            private Long page; 
            private Long size; 
            private Long total; 

            /**
             * 告警事件历史信息组
             */
            public Builder events(java.util.List < Events> events) {
                this.events = events;
                return this;
            }

            /**
             * 页数
             */
            public Builder page(Long page) {
                this.page = page;
                return this;
            }

            /**
             * 每页展示数目
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            /**
             * 总数
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            public PageBean build() {
                return new PageBean(this);
            } 

        } 

    }
}
