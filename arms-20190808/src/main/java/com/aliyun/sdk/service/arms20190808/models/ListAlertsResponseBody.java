// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAlertsResponseBody} extends {@link TeaModel}
 *
 * <p>ListAlertsResponseBody</p>
 */
public class ListAlertsResponseBody extends TeaModel {
    @NameInMap("PageBean")
    private PageBean pageBean;

    @NameInMap("RequestId")
    private String requestId;

    private ListAlertsResponseBody(Builder builder) {
        this.pageBean = builder.pageBean;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAlertsResponseBody create() {
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

        public ListAlertsResponseBody build() {
            return new ListAlertsResponseBody(this);
        } 

    } 

    public static class Activities extends TeaModel {
        @NameInMap("Content")
        private String content;

        @NameInMap("Description")
        private String description;

        @NameInMap("HandlerName")
        private String handlerName;

        @NameInMap("Time")
        private String time;

        @NameInMap("Type")
        private Long type;

        private Activities(Builder builder) {
            this.content = builder.content;
            this.description = builder.description;
            this.handlerName = builder.handlerName;
            this.time = builder.time;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Activities create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return handlerName
         */
        public String getHandlerName() {
            return this.handlerName;
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
        public Long getType() {
            return this.type;
        }

        public static final class Builder {
            private String content; 
            private String description; 
            private String handlerName; 
            private String time; 
            private Long type; 

            /**
             * 通知内容
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * 描述
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * 处理人名称
             */
            public Builder handlerName(String handlerName) {
                this.handlerName = handlerName;
                return this;
            }

            /**
             * 时间
             */
            public Builder time(String time) {
                this.time = time;
                return this;
            }

            /**
             * 活动类型
             */
            public Builder type(Long type) {
                this.type = type;
                return this;
            }

            public Activities build() {
                return new Activities(this);
            } 

        } 

    }
    public static class AlertEvents extends TeaModel {
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

        @NameInMap("State")
        private String state;

        private AlertEvents(Builder builder) {
            this.alertName = builder.alertName;
            this.annotations = builder.annotations;
            this.description = builder.description;
            this.endTime = builder.endTime;
            this.generatorURL = builder.generatorURL;
            this.integrationName = builder.integrationName;
            this.integrationType = builder.integrationType;
            this.labels = builder.labels;
            this.receiveTime = builder.receiveTime;
            this.severity = builder.severity;
            this.startTime = builder.startTime;
            this.state = builder.state;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AlertEvents create() {
            return builder().build();
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
         * @return state
         */
        public String getState() {
            return this.state;
        }

        public static final class Builder {
            private String alertName; 
            private String annotations; 
            private String description; 
            private String endTime; 
            private String generatorURL; 
            private String integrationName; 
            private String integrationType; 
            private String labels; 
            private String receiveTime; 
            private String severity; 
            private String startTime; 
            private String state; 

            /**
             * 事件名称
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
             * 事件等级
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
             * 告警状态Active("Active"),      * Inhibited("Inhibited"),      * Silenced("Silenced"),      * Resolved("Resolved")
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            public AlertEvents build() {
                return new AlertEvents(this);
            } 

        } 

    }
    public static class ListAlerts extends TeaModel {
        @NameInMap("Activities")
        private java.util.List < Activities> activities;

        @NameInMap("AlertEvents")
        private java.util.List < AlertEvents> alertEvents;

        @NameInMap("AlertId")
        private Long alertId;

        @NameInMap("AlertName")
        private String alertName;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("DispatchRuleId")
        private Float dispatchRuleId;

        @NameInMap("DispatchRuleName")
        private String dispatchRuleName;

        @NameInMap("Severity")
        private String severity;

        @NameInMap("State")
        private Long state;

        private ListAlerts(Builder builder) {
            this.activities = builder.activities;
            this.alertEvents = builder.alertEvents;
            this.alertId = builder.alertId;
            this.alertName = builder.alertName;
            this.createTime = builder.createTime;
            this.dispatchRuleId = builder.dispatchRuleId;
            this.dispatchRuleName = builder.dispatchRuleName;
            this.severity = builder.severity;
            this.state = builder.state;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ListAlerts create() {
            return builder().build();
        }

        /**
         * @return activities
         */
        public java.util.List < Activities> getActivities() {
            return this.activities;
        }

        /**
         * @return alertEvents
         */
        public java.util.List < AlertEvents> getAlertEvents() {
            return this.alertEvents;
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
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return dispatchRuleId
         */
        public Float getDispatchRuleId() {
            return this.dispatchRuleId;
        }

        /**
         * @return dispatchRuleName
         */
        public String getDispatchRuleName() {
            return this.dispatchRuleName;
        }

        /**
         * @return severity
         */
        public String getSeverity() {
            return this.severity;
        }

        /**
         * @return state
         */
        public Long getState() {
            return this.state;
        }

        public static final class Builder {
            private java.util.List < Activities> activities; 
            private java.util.List < AlertEvents> alertEvents; 
            private Long alertId; 
            private String alertName; 
            private String createTime; 
            private Float dispatchRuleId; 
            private String dispatchRuleName; 
            private String severity; 
            private Long state; 

            /**
             * 活动列表
             */
            public Builder activities(java.util.List < Activities> activities) {
                this.activities = activities;
                return this;
            }

            /**
             * 事件列表
             */
            public Builder alertEvents(java.util.List < AlertEvents> alertEvents) {
                this.alertEvents = alertEvents;
                return this;
            }

            /**
             * 告警ID
             */
            public Builder alertId(Long alertId) {
                this.alertId = alertId;
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
             * 创建时间
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * 通知策略ID
             */
            public Builder dispatchRuleId(Float dispatchRuleId) {
                this.dispatchRuleId = dispatchRuleId;
                return this;
            }

            /**
             * 通知策略名称
             */
            public Builder dispatchRuleName(String dispatchRuleName) {
                this.dispatchRuleName = dispatchRuleName;
                return this;
            }

            /**
             * 告警等级(P1~P6)
             */
            public Builder severity(String severity) {
                this.severity = severity;
                return this;
            }

            /**
             * 告警状态(0 - 待处理， 1 - 处理中， 2 - 已处理)
             */
            public Builder state(Long state) {
                this.state = state;
                return this;
            }

            public ListAlerts build() {
                return new ListAlerts(this);
            } 

        } 

    }
    public static class PageBean extends TeaModel {
        @NameInMap("ListAlerts")
        private java.util.List < ListAlerts> listAlerts;

        @NameInMap("Page")
        private Long page;

        @NameInMap("Size")
        private Long size;

        @NameInMap("Total")
        private Long total;

        private PageBean(Builder builder) {
            this.listAlerts = builder.listAlerts;
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
         * @return listAlerts
         */
        public java.util.List < ListAlerts> getListAlerts() {
            return this.listAlerts;
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
            private java.util.List < ListAlerts> listAlerts; 
            private Long page; 
            private Long size; 
            private Long total; 

            /**
             * 告警发送历史信息组
             */
            public Builder listAlerts(java.util.List < ListAlerts> listAlerts) {
                this.listAlerts = listAlerts;
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
