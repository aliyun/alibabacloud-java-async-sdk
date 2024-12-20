// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

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
 * {@link SearchAlertRulesResponseBody} extends {@link TeaModel}
 *
 * <p>SearchAlertRulesResponseBody</p>
 */
public class SearchAlertRulesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageBean")
    private PageBean pageBean;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private SearchAlertRulesResponseBody(Builder builder) {
        this.pageBean = builder.pageBean;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchAlertRulesResponseBody create() {
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
         * <p>The returned struct.</p>
         */
        public Builder pageBean(PageBean pageBean) {
            this.pageBean = pageBean;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>34ED024E-9E31-434A-9E4E-D9D15C3****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public SearchAlertRulesResponseBody build() {
            return new SearchAlertRulesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link SearchAlertRulesResponseBody} extends {@link TeaModel}
     *
     * <p>SearchAlertRulesResponseBody</p>
     */
    public static class AlarmContext extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlarmContentSubTitle")
        private String alarmContentSubTitle;

        @com.aliyun.core.annotation.NameInMap("AlarmContentTemplate")
        private String alarmContentTemplate;

        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("SubTitle")
        private String subTitle;

        private AlarmContext(Builder builder) {
            this.alarmContentSubTitle = builder.alarmContentSubTitle;
            this.alarmContentTemplate = builder.alarmContentTemplate;
            this.content = builder.content;
            this.subTitle = builder.subTitle;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AlarmContext create() {
            return builder().build();
        }

        /**
         * @return alarmContentSubTitle
         */
        public String getAlarmContentSubTitle() {
            return this.alarmContentSubTitle;
        }

        /**
         * @return alarmContentTemplate
         */
        public String getAlarmContentTemplate() {
            return this.alarmContentTemplate;
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return subTitle
         */
        public String getSubTitle() {
            return this.subTitle;
        }

        public static final class Builder {
            private String alarmContentSubTitle; 
            private String alarmContentTemplate; 
            private String content; 
            private String subTitle; 

            /**
             * <p>The sub-title of the alert notification content.</p>
             * 
             * <strong>example:</strong>
             * <p>TestSubTitle</p>
             */
            public Builder alarmContentSubTitle(String alarmContentSubTitle) {
                this.alarmContentSubTitle = alarmContentSubTitle;
                return this;
            }

            /**
             * <p>The template of the alert notification.</p>
             * 
             * <strong>example:</strong>
             * <p>Alert name: $Alert name\nFilter condition: $Filter\nAlert time: $Alert time\nAlert content: $Alert content\nNote: The alert persists until a reply email is received. The system will remind you again in 24 hours.</p>
             */
            public Builder alarmContentTemplate(String alarmContentTemplate) {
                this.alarmContentTemplate = alarmContentTemplate;
                return this;
            }

            /**
             * <p>The content of the alert notification.</p>
             * 
             * <strong>example:</strong>
             * <p>Alert name: $Alert name\nFilter condition: $Filter\nAlert time: $Alert time\nAlert content: $Alert content\nNote: The alert persists until a reply email is received. The system will remind you again in 24 hours.</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The sub-title of the alert notification.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder subTitle(String subTitle) {
                this.subTitle = subTitle;
                return this;
            }

            public AlarmContext build() {
                return new AlarmContext(this);
            } 

        } 

    }
    /**
     * 
     * {@link SearchAlertRulesResponseBody} extends {@link TeaModel}
     *
     * <p>SearchAlertRulesResponseBody</p>
     */
    public static class Rules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Aggregates")
        private String aggregates;

        @com.aliyun.core.annotation.NameInMap("Alias")
        private String alias;

        @com.aliyun.core.annotation.NameInMap("Measure")
        private String measure;

        @com.aliyun.core.annotation.NameInMap("NValue")
        private Integer nValue;

        @com.aliyun.core.annotation.NameInMap("Operator")
        private String operator;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Float value;

        private Rules(Builder builder) {
            this.aggregates = builder.aggregates;
            this.alias = builder.alias;
            this.measure = builder.measure;
            this.nValue = builder.nValue;
            this.operator = builder.operator;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Rules create() {
            return builder().build();
        }

        /**
         * @return aggregates
         */
        public String getAggregates() {
            return this.aggregates;
        }

        /**
         * @return alias
         */
        public String getAlias() {
            return this.alias;
        }

        /**
         * @return measure
         */
        public String getMeasure() {
            return this.measure;
        }

        /**
         * @return nValue
         */
        public Integer getNValue() {
            return this.nValue;
        }

        /**
         * @return operator
         */
        public String getOperator() {
            return this.operator;
        }

        /**
         * @return value
         */
        public Float getValue() {
            return this.value;
        }

        public static final class Builder {
            private String aggregates; 
            private String alias; 
            private String measure; 
            private Integer nValue; 
            private String operator; 
            private Float value; 

            /**
             * <p>The aggregation logic of the metric data of the alert rule. Valid values:</p>
             * <ul>
             * <li><code>AVG</code>: calculates the average value for each minute</li>
             * <li><code>SUM</code>: calculates the total value for each minute</li>
             * <li><code>MAX</code>: calculates the maximum value for each minute</li>
             * <li><code>MIN</code>: calculates the minimum value for each minute</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>AVG</p>
             */
            public Builder aggregates(String aggregates) {
                this.aggregates = aggregates;
                return this;
            }

            /**
             * <p>The displayed description of the alert metric.</p>
             * 
             * <strong>example:</strong>
             * <p>response time_ms</p>
             */
            public Builder alias(String alias) {
                this.alias = alias;
                return this;
            }

            /**
             * <p>The metric based on which alerts are triggered. For more information, see the &quot;<a href="https://help.aliyun.com/document_detail/175825.html#h2-url-4">Alert metrics</a>&quot; section in this topic.</p>
             * 
             * <strong>example:</strong>
             * <p>appstat.jvm.SystemDiskFree</p>
             */
            public Builder measure(String measure) {
                this.measure = measure;
                return this;
            }

            /**
             * <p>The time range when data is requested. Unit: minutes. For example, a value of 5 indicates that the alert rule applies to the data in the last 5 minutes.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder nValue(Integer nValue) {
                this.nValue = nValue;
                return this;
            }

            /**
             * <p>The operation logic of the condition. Valid values:</p>
             * <ul>
             * <li>CURRENT_GTE: greater than or equal to</li>
             * <li>CURRENT_LTE: less than or equal to</li>
             * <li>PREVIOUS_UP: the increase percentage compared with the last period</li>
             * <li>PREVIOUS_DOWN: the decrease percentage compared with the last period</li>
             * <li>HOH_UP: the increase percentage compared with the last hour</li>
             * <li>HOH_DOWN: the decrease percentage compared with the last hour</li>
             * <li>DOD_UP: the increase percentage compared with the last day</li>
             * <li>DOD_DOWN: the decrease percentage compared with the last day</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>CURRENT_GTE</p>
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * <p>The threshold of the condition.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder value(Float value) {
                this.value = value;
                return this;
            }

            public Rules build() {
                return new Rules(this);
            } 

        } 

    }
    /**
     * 
     * {@link SearchAlertRulesResponseBody} extends {@link TeaModel}
     *
     * <p>SearchAlertRulesResponseBody</p>
     */
    public static class AlertRule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Operator")
        private String operator;

        @com.aliyun.core.annotation.NameInMap("Rules")
        private java.util.List<Rules> rules;

        private AlertRule(Builder builder) {
            this.operator = builder.operator;
            this.rules = builder.rules;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AlertRule create() {
            return builder().build();
        }

        /**
         * @return operator
         */
        public String getOperator() {
            return this.operator;
        }

        /**
         * @return rules
         */
        public java.util.List<Rules> getRules() {
            return this.rules;
        }

        public static final class Builder {
            private String operator; 
            private java.util.List<Rules> rules; 

            /**
             * <p>The logical operator between conditions. Valid values: <code>&amp;</code>: AND. <code>|</code>: OR.</p>
             * 
             * <strong>example:</strong>
             * <p>|</p>
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * <p>The condition of the alert rule.</p>
             */
            public Builder rules(java.util.List<Rules> rules) {
                this.rules = rules;
                return this;
            }

            public AlertRule build() {
                return new AlertRule(this);
            } 

        } 

    }
    /**
     * 
     * {@link SearchAlertRulesResponseBody} extends {@link TeaModel}
     *
     * <p>SearchAlertRulesResponseBody</p>
     */
    public static class Dimensions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Dimensions(Builder builder) {
            this.key = builder.key;
            this.type = builder.type;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Dimensions create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String type; 
            private String value; 

            /**
             * <p>The key of the dimension. Valid values:</p>
             * <ul>
             * <li><code>rpc</code>: the name of the API</li>
             * <li><code>rpcType</code>: the type of the API call, such as HTTP or DUBBO</li>
             * <li><code>endpoint</code>: the name of the database</li>
             * <li><code>rootIp</code>: the IP address of the host</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>rootIp</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The type of the dimension. Valid values:</p>
             * <ul>
             * <li><code>STATIC</code>: checks only the value of this dimension. In this case, you must set the <strong>dimensions.value</strong> parameter.</li>
             * <li><code>ALL</code>: checks the values of all dimensions. The metrics of all API calls are checked. If an API call triggers an alert, the name of the API is displayed in the alert notification. In this case, you do not need to set the <strong>dimensions.value</strong> parameter.</li>
             * <li><code>DISABLE</code>: aggregates the values of all dimensions. In this case, you do not need to set the <strong>dimensions.value</strong> parameter.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>DISABLE</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The value of the dimension.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;127.0.0.1&quot;</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Dimensions build() {
                return new Dimensions(this);
            } 

        } 

    }
    /**
     * 
     * {@link SearchAlertRulesResponseBody} extends {@link TeaModel}
     *
     * <p>SearchAlertRulesResponseBody</p>
     */
    public static class MetricParam extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppGroupId")
        private String appGroupId;

        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("Dimensions")
        private java.util.List<Dimensions> dimensions;

        @com.aliyun.core.annotation.NameInMap("Pid")
        private String pid;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private MetricParam(Builder builder) {
            this.appGroupId = builder.appGroupId;
            this.appId = builder.appId;
            this.dimensions = builder.dimensions;
            this.pid = builder.pid;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MetricParam create() {
            return builder().build();
        }

        /**
         * @return appGroupId
         */
        public String getAppGroupId() {
            return this.appGroupId;
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return dimensions
         */
        public java.util.List<Dimensions> getDimensions() {
            return this.dimensions;
        }

        /**
         * @return pid
         */
        public String getPid() {
            return this.pid;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String appGroupId; 
            private String appId; 
            private java.util.List<Dimensions> dimensions; 
            private String pid; 
            private String type; 

            /**
             * <p>The ID of the application group that is associated with the alert rule. This parameter is applicable to Enterprise Distributed Application Service (EDAS) applications.</p>
             * 
             * <strong>example:</strong>
             * <p>DEFAULT</p>
             */
            public Builder appGroupId(String appGroupId) {
                this.appGroupId = appGroupId;
                return this;
            }

            /**
             * <p>The auto-increment ID of the ARMS application. You can ignore this ID.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>The dimensions in the condition.</p>
             */
            public Builder dimensions(java.util.List<Dimensions> dimensions) {
                this.dimensions = dimensions;
                return this;
            }

            /**
             * <p>The PID of the application that is associated with the alert rule.</p>
             * 
             * <strong>example:</strong>
             * <p>9870ca99-8105-4da7-a3a4-d72dd1b1****</p>
             */
            public Builder pid(String pid) {
                this.pid = pid;
                return this;
            }

            /**
             * <p>The type of the metric. Valid values:</p>
             * <ul>
             * <li><code>txn</code>: the number of API calls during application monitoring</li>
             * <li><code>txn_type</code>: the types of API calls during application monitoring</li>
             * <li><code>db</code>: database metrics</li>
             * <li><code>jvm</code>: Java virtual machine (JVM) metrics</li>
             * <li><code>host</code>: host metrics</li>
             * <li><code>exception</code>: API call errors</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>DB</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public MetricParam build() {
                return new MetricParam(this);
            } 

        } 

    }
    /**
     * 
     * {@link SearchAlertRulesResponseBody} extends {@link TeaModel}
     *
     * <p>SearchAlertRulesResponseBody</p>
     */
    public static class Notice extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("NoticeEndTime")
        private Long noticeEndTime;

        @com.aliyun.core.annotation.NameInMap("NoticeStartTime")
        private Long noticeStartTime;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        private Notice(Builder builder) {
            this.endTime = builder.endTime;
            this.noticeEndTime = builder.noticeEndTime;
            this.noticeStartTime = builder.noticeStartTime;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Notice create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return noticeEndTime
         */
        public Long getNoticeEndTime() {
            return this.noticeEndTime;
        }

        /**
         * @return noticeStartTime
         */
        public Long getNoticeStartTime() {
            return this.noticeStartTime;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private Long endTime; 
            private Long noticeEndTime; 
            private Long noticeStartTime; 
            private Long startTime; 

            /**
             * <p>The end of the time range when the alert rule takes effect within 24 hours per day. This value is a UNIX timestamp. The year, month, and day that are indicated by the timestamp are not displayed in this value. Only the hour, minute, and second are displayed.</p>
             * 
             * <strong>example:</strong>
             * <p>1480607940000</p>
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The end of the time range when alert notifications are sent based on the alert rule within 24 hours per day. This value is a UNIX timestamp. The year, month, and day that are indicated by the timestamp are not displayed in this value. Only the hour, minute, and second are displayed.</p>
             * 
             * <strong>example:</strong>
             * <p>1480607940000</p>
             */
            public Builder noticeEndTime(Long noticeEndTime) {
                this.noticeEndTime = noticeEndTime;
                return this;
            }

            /**
             * <p>The beginning of the time range when alert notifications are sent based on the alert rule within 24 hours per day. This value is a UNIX timestamp. The year, month, and day that are indicated by the timestamp are not displayed in this value. Only the hour, minute, and second are displayed.</p>
             * 
             * <strong>example:</strong>
             * <p>1480521600000</p>
             */
            public Builder noticeStartTime(Long noticeStartTime) {
                this.noticeStartTime = noticeStartTime;
                return this;
            }

            /**
             * <p>The beginning of the time range when the alert rule takes effect within 24 hours per day. This value is a UNIX timestamp. The year, month, and day that are indicated by the timestamp are not displayed in this value. Only the hour, minute, and second are displayed.</p>
             * 
             * <strong>example:</strong>
             * <p>1480521600000</p>
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            public Notice build() {
                return new Notice(this);
            } 

        } 

    }
    /**
     * 
     * {@link SearchAlertRulesResponseBody} extends {@link TeaModel}
     *
     * <p>SearchAlertRulesResponseBody</p>
     */
    public static class AlertRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlarmContext")
        private AlarmContext alarmContext;

        @com.aliyun.core.annotation.NameInMap("AlertLevel")
        private String alertLevel;

        @com.aliyun.core.annotation.NameInMap("AlertRule")
        private AlertRule alertRule;

        @com.aliyun.core.annotation.NameInMap("AlertTitle")
        private String alertTitle;

        @com.aliyun.core.annotation.NameInMap("AlertType")
        private Integer alertType;

        @com.aliyun.core.annotation.NameInMap("AlertVersion")
        private Integer alertVersion;

        @com.aliyun.core.annotation.NameInMap("AlertWays")
        private java.util.List<String> alertWays;

        @com.aliyun.core.annotation.NameInMap("Config")
        private String config;

        @com.aliyun.core.annotation.NameInMap("ContactGroupIdList")
        private String contactGroupIdList;

        @com.aliyun.core.annotation.NameInMap("ContactGroupIds")
        private String contactGroupIds;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("HostByAlertManager")
        private Boolean hostByAlertManager;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("MetricParam")
        private MetricParam metricParam;

        @com.aliyun.core.annotation.NameInMap("Notice")
        private Notice notice;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private Long taskId;

        @com.aliyun.core.annotation.NameInMap("TaskStatus")
        private String taskStatus;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private Long updateTime;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        private AlertRules(Builder builder) {
            this.alarmContext = builder.alarmContext;
            this.alertLevel = builder.alertLevel;
            this.alertRule = builder.alertRule;
            this.alertTitle = builder.alertTitle;
            this.alertType = builder.alertType;
            this.alertVersion = builder.alertVersion;
            this.alertWays = builder.alertWays;
            this.config = builder.config;
            this.contactGroupIdList = builder.contactGroupIdList;
            this.contactGroupIds = builder.contactGroupIds;
            this.createTime = builder.createTime;
            this.hostByAlertManager = builder.hostByAlertManager;
            this.id = builder.id;
            this.metricParam = builder.metricParam;
            this.notice = builder.notice;
            this.regionId = builder.regionId;
            this.resourceGroupId = builder.resourceGroupId;
            this.status = builder.status;
            this.taskId = builder.taskId;
            this.taskStatus = builder.taskStatus;
            this.title = builder.title;
            this.updateTime = builder.updateTime;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AlertRules create() {
            return builder().build();
        }

        /**
         * @return alarmContext
         */
        public AlarmContext getAlarmContext() {
            return this.alarmContext;
        }

        /**
         * @return alertLevel
         */
        public String getAlertLevel() {
            return this.alertLevel;
        }

        /**
         * @return alertRule
         */
        public AlertRule getAlertRule() {
            return this.alertRule;
        }

        /**
         * @return alertTitle
         */
        public String getAlertTitle() {
            return this.alertTitle;
        }

        /**
         * @return alertType
         */
        public Integer getAlertType() {
            return this.alertType;
        }

        /**
         * @return alertVersion
         */
        public Integer getAlertVersion() {
            return this.alertVersion;
        }

        /**
         * @return alertWays
         */
        public java.util.List<String> getAlertWays() {
            return this.alertWays;
        }

        /**
         * @return config
         */
        public String getConfig() {
            return this.config;
        }

        /**
         * @return contactGroupIdList
         */
        public String getContactGroupIdList() {
            return this.contactGroupIdList;
        }

        /**
         * @return contactGroupIds
         */
        public String getContactGroupIds() {
            return this.contactGroupIds;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return hostByAlertManager
         */
        public Boolean getHostByAlertManager() {
            return this.hostByAlertManager;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return metricParam
         */
        public MetricParam getMetricParam() {
            return this.metricParam;
        }

        /**
         * @return notice
         */
        public Notice getNotice() {
            return this.notice;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return taskId
         */
        public Long getTaskId() {
            return this.taskId;
        }

        /**
         * @return taskStatus
         */
        public String getTaskStatus() {
            return this.taskStatus;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private AlarmContext alarmContext; 
            private String alertLevel; 
            private AlertRule alertRule; 
            private String alertTitle; 
            private Integer alertType; 
            private Integer alertVersion; 
            private java.util.List<String> alertWays; 
            private String config; 
            private String contactGroupIdList; 
            private String contactGroupIds; 
            private Long createTime; 
            private Boolean hostByAlertManager; 
            private Long id; 
            private MetricParam metricParam; 
            private Notice notice; 
            private String regionId; 
            private String resourceGroupId; 
            private String status; 
            private Long taskId; 
            private String taskStatus; 
            private String title; 
            private Long updateTime; 
            private String userId; 

            /**
             * <p>The format of the alert notification.</p>
             */
            public Builder alarmContext(AlarmContext alarmContext) {
                this.alarmContext = alarmContext;
                return this;
            }

            /**
             * <p>The severity of the alerts. Only the value <code>WARN</code> is supported.</p>
             * 
             * <strong>example:</strong>
             * <p>WARN</p>
             */
            public Builder alertLevel(String alertLevel) {
                this.alertLevel = alertLevel;
                return this;
            }

            /**
             * <p>The conditions of the alert rule. Multiple conditions are separated by the AND or OR logical operators.</p>
             */
            public Builder alertRule(AlertRule alertRule) {
                this.alertRule = alertRule;
                return this;
            }

            /**
             * <p>The name of the alert rule.</p>
             * 
             * <strong>example:</strong>
             * <p>TestAlertRule</p>
             */
            public Builder alertTitle(String alertTitle) {
                this.alertTitle = alertTitle;
                return this;
            }

            /**
             * <p>The type of the alert rule. Valid values:</p>
             * <ul>
             * <li><code>1</code>: custom alert rules that are used to monitor drill-down data sets</li>
             * <li><code>3</code>: custom alert rules that are used to monitor tiled data sets</li>
             * <li><code>4</code>: alert rules that are used to monitor the browser, including the default frontend alert rules</li>
             * <li><code>5</code>: alert rules that are used to monitor applications, including the default application alert rules</li>
             * <li><code>6</code>: the default browser alert rules</li>
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
             * <p>The version of the alert rule. Default value: <code>1</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder alertVersion(Integer alertVersion) {
                this.alertVersion = alertVersion;
                return this;
            }

            /**
             * <p>Sending method of alarm notification.</p>
             */
            public Builder alertWays(java.util.List<String> alertWays) {
                this.alertWays = alertWays;
                return this;
            }

            /**
             * <p>The configuration items of the alert rule. The value is a JSON string.</p>
             * <p>The configuration item <strong>continuous</strong> indicates whether alert notifications are continuously sent. Valid values:</p>
             * <ul>
             * <li><code>true</code>: Alert notifications are sent every minute.</li>
             * <li><code>false</code>: The alert silence feature is enabled.</li>
             * </ul>
             * <p>The configuration item <strong>dataRevision</strong> indicates the data revision policy that is used if no data is obtained or the data is null. Default value: 2. Valid values:</p>
             * <ul>
             * <li><code>0</code>: overwrites the data by using the value 0</li>
             * <li><code>1</code>: overwrites the data by using the value 1</li>
             * <li><code>2</code>: overwrites the data by using the value null. This value indicates that no alert is triggered if no data exists</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>{&quot;continuous&quot;:true,&quot;dataRevision&quot;:2}</p>
             */
            public Builder config(String config) {
                this.config = config;
                return this;
            }

            /**
             * <p>The ID of the contact group. Multiple IDs are separated by commas (,).</p>
             * 
             * <strong>example:</strong>
             * <p>381*,572*</p>
             */
            public Builder contactGroupIdList(String contactGroupIdList) {
                this.contactGroupIdList = contactGroupIdList;
                return this;
            }

            /**
             * <p>The IDs of the alert contact groups. The value is a JSON array.</p>
             * 
             * <strong>example:</strong>
             * <p>[123, 234]</p>
             */
            public Builder contactGroupIds(String contactGroupIds) {
                this.contactGroupIds = contactGroupIds;
                return this;
            }

            /**
             * <p>The timestamp that shows when the alert rule was created.</p>
             * 
             * <strong>example:</strong>
             * <p>1579508519683</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>Indicates whether the alert is sent through the alert center. Valid values:</p>
             * <ul>
             * <li><code>true</code></li>
             * <li><code>false</code></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder hostByAlertManager(Boolean hostByAlertManager) {
                this.hostByAlertManager = hostByAlertManager;
                return this;
            }

            /**
             * <p>The ID of the alert rule.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The information about the application that is associated with the alert rule.</p>
             */
            public Builder metricParam(MetricParam metricParam) {
                this.metricParam = metricParam;
                return this;
            }

            /**
             * <p>The time ranges when the alert rule takes effect and when alert notifications are sent.</p>
             */
            public Builder notice(Notice notice) {
                this.notice = notice;
                return this;
            }

            /**
             * <p>The ID of the region to which the alert rule belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The ID of the resource group.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-acfmxyexli2****</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The status of the alert rule. <code>RUNNING</code>: The alert rule is enabled. <code>STOPPED</code>: The alert rule is disabled.</p>
             * 
             * <strong>example:</strong>
             * <p>RUNNING</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The ID of the Application Real-Time Monitoring Service (ARMS) task that is associated with the alert rule.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder taskId(Long taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>The status of the task. This parameter is hidden from users.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;&quot;</p>
             */
            public Builder taskStatus(String taskStatus) {
                this.taskStatus = taskStatus;
                return this;
            }

            /**
             * <p>The name of the alert.</p>
             * 
             * <strong>example:</strong>
             * <p>AlertTest</p>
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * <p>The timestamp that shows when the alert rule was updated.</p>
             * 
             * <strong>example:</strong>
             * <p>1480521600000</p>
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * <p>The ID of the user to which the alert rule belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>113197164949****</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public AlertRules build() {
                return new AlertRules(this);
            } 

        } 

    }
    /**
     * 
     * {@link SearchAlertRulesResponseBody} extends {@link TeaModel}
     *
     * <p>SearchAlertRulesResponseBody</p>
     */
    public static class PageBean extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlertRules")
        private java.util.List<AlertRules> alertRules;

        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private PageBean(Builder builder) {
            this.alertRules = builder.alertRules;
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
         * @return alertRules
         */
        public java.util.List<AlertRules> getAlertRules() {
            return this.alertRules;
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
            private java.util.List<AlertRules> alertRules; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer totalCount; 

            /**
             * <p>The details of the alert rules.</p>
             */
            public Builder alertRules(java.util.List<AlertRules> alertRules) {
                this.alertRules = alertRules;
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
             * <p>20</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of returned entries.</p>
             * 
             * <strong>example:</strong>
             * <p>23</p>
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
