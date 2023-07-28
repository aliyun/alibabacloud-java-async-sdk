// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SearchAlertRulesResponseBody} extends {@link TeaModel}
 *
 * <p>SearchAlertRulesResponseBody</p>
 */
public class SearchAlertRulesResponseBody extends TeaModel {
    @NameInMap("PageBean")
    private PageBean pageBean;

    @NameInMap("RequestId")
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
         * The returned struct.
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

        public SearchAlertRulesResponseBody build() {
            return new SearchAlertRulesResponseBody(this);
        } 

    } 

    public static class AlarmContext extends TeaModel {
        @NameInMap("AlarmContentSubTitle")
        private String alarmContentSubTitle;

        @NameInMap("AlarmContentTemplate")
        private String alarmContentTemplate;

        @NameInMap("Content")
        private String content;

        @NameInMap("SubTitle")
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
             * The sub-title of the alert notification content.
             */
            public Builder alarmContentSubTitle(String alarmContentSubTitle) {
                this.alarmContentSubTitle = alarmContentSubTitle;
                return this;
            }

            /**
             * The template of the alert notification.
             */
            public Builder alarmContentTemplate(String alarmContentTemplate) {
                this.alarmContentTemplate = alarmContentTemplate;
                return this;
            }

            /**
             * The content of the alert notification.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * The sub-title of the alert notification.
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
    public static class Rules extends TeaModel {
        @NameInMap("Aggregates")
        private String aggregates;

        @NameInMap("Alias")
        private String alias;

        @NameInMap("Measure")
        private String measure;

        @NameInMap("NValue")
        private Integer nValue;

        @NameInMap("Operator")
        private String operator;

        @NameInMap("Value")
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
             * The aggregation logic of the metric data of the alert rule. Valid values:
             * <p>
             * 
             * *   `AVG`: calculates the average value for each minute
             * *   `SUM`: calculates the total value for each minute
             * *   `MAX`: calculates the maximum value for each minute
             * *   `MIN`: calculates the minimum value for each minute
             */
            public Builder aggregates(String aggregates) {
                this.aggregates = aggregates;
                return this;
            }

            /**
             * The displayed description of the alert metric.
             */
            public Builder alias(String alias) {
                this.alias = alias;
                return this;
            }

            /**
             * The metric based on which alerts are triggered. For more information, see the "[Alert metrics](https://help.aliyun.com/document_detail/175825.html#h2-url-4)" section in this topic.
             */
            public Builder measure(String measure) {
                this.measure = measure;
                return this;
            }

            /**
             * The time range when data is requested. Unit: minutes. For example, a value of 5 indicates that the alert rule applies to the data in the last 5 minutes.
             */
            public Builder nValue(Integer nValue) {
                this.nValue = nValue;
                return this;
            }

            /**
             * The operation logic of the condition. Valid values:
             * <p>
             * 
             * *   CURRENT_GTE: greater than or equal to
             * *   CURRENT_LTE: less than or equal to
             * *   PREVIOUS_UP: the increase percentage compared with the last period
             * *   PREVIOUS_DOWN: the decrease percentage compared with the last period
             * *   HOH_UP: the increase percentage compared with the last hour
             * *   HOH_DOWN: the decrease percentage compared with the last hour
             * *   DOD_UP: the increase percentage compared with the last day
             * *   DOD_DOWN: the decrease percentage compared with the last day
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * The threshold of the condition.
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
    public static class AlertRule extends TeaModel {
        @NameInMap("Operator")
        private String operator;

        @NameInMap("Rules")
        private java.util.List < Rules> rules;

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
        public java.util.List < Rules> getRules() {
            return this.rules;
        }

        public static final class Builder {
            private String operator; 
            private java.util.List < Rules> rules; 

            /**
             * The logical operator between conditions. Valid values: `&`: AND. `|`: OR.
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * The condition of the alert rule.
             */
            public Builder rules(java.util.List < Rules> rules) {
                this.rules = rules;
                return this;
            }

            public AlertRule build() {
                return new AlertRule(this);
            } 

        } 

    }
    public static class Dimensions extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Type")
        private String type;

        @NameInMap("Value")
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
             * The key of the dimension. Valid values:
             * <p>
             * 
             * *   `rpc`: the name of the API
             * *   `rpcType`: the type of the API call, such as HTTP or DUBBO
             * *   `endpoint`: the name of the database
             * *   `rootIp`: the IP address of the host
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The type of the dimension. Valid values:
             * <p>
             * 
             * *   `STATIC`: checks only the value of this dimension. In this case, you must set the **dimensions.value** parameter.
             * *   `ALL`: checks the values of all dimensions. The metrics of all API calls are checked. If an API call triggers an alert, the name of the API is displayed in the alert notification. In this case, you do not need to set the **dimensions.value** parameter.
             * *   `DISABLE`: aggregates the values of all dimensions. In this case, you do not need to set the **dimensions.value** parameter.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * The value of the dimension.
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
    public static class MetricParam extends TeaModel {
        @NameInMap("AppGroupId")
        private String appGroupId;

        @NameInMap("AppId")
        private String appId;

        @NameInMap("Dimensions")
        private java.util.List < Dimensions> dimensions;

        @NameInMap("Pid")
        private String pid;

        @NameInMap("Type")
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
        public java.util.List < Dimensions> getDimensions() {
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
            private java.util.List < Dimensions> dimensions; 
            private String pid; 
            private String type; 

            /**
             * The ID of the application group that is associated with the alert rule. This parameter is applicable to Enterprise Distributed Application Service (EDAS) applications.
             */
            public Builder appGroupId(String appGroupId) {
                this.appGroupId = appGroupId;
                return this;
            }

            /**
             * The auto-increment ID of the ARMS application. You can ignore this ID.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * The dimensions in the condition.
             */
            public Builder dimensions(java.util.List < Dimensions> dimensions) {
                this.dimensions = dimensions;
                return this;
            }

            /**
             * The PID of the application that is associated with the alert rule.
             */
            public Builder pid(String pid) {
                this.pid = pid;
                return this;
            }

            /**
             * The type of the metric. Valid values:
             * <p>
             * 
             * *   `txn`: the number of API calls during application monitoring
             * *   `txn_type`: the types of API calls during application monitoring
             * *   `db`: database metrics
             * *   `jvm`: Java virtual machine (JVM) metrics
             * *   `host`: host metrics
             * *   `exception`: API call errors
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
    public static class Notice extends TeaModel {
        @NameInMap("EndTime")
        private Long endTime;

        @NameInMap("NoticeEndTime")
        private Long noticeEndTime;

        @NameInMap("NoticeStartTime")
        private Long noticeStartTime;

        @NameInMap("StartTime")
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
             * The end of the time range when the alert rule takes effect within 24 hours per day. This value is a UNIX timestamp. The year, month, and day that are indicated by the timestamp are not displayed in this value. Only the hour, minute, and second are displayed.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * The end of the time range when alert notifications are sent based on the alert rule within 24 hours per day. This value is a UNIX timestamp. The year, month, and day that are indicated by the timestamp are not displayed in this value. Only the hour, minute, and second are displayed.
             */
            public Builder noticeEndTime(Long noticeEndTime) {
                this.noticeEndTime = noticeEndTime;
                return this;
            }

            /**
             * The beginning of the time range when alert notifications are sent based on the alert rule within 24 hours per day. This value is a UNIX timestamp. The year, month, and day that are indicated by the timestamp are not displayed in this value. Only the hour, minute, and second are displayed.
             */
            public Builder noticeStartTime(Long noticeStartTime) {
                this.noticeStartTime = noticeStartTime;
                return this;
            }

            /**
             * The beginning of the time range when the alert rule takes effect within 24 hours per day. This value is a UNIX timestamp. The year, month, and day that are indicated by the timestamp are not displayed in this value. Only the hour, minute, and second are displayed.
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
    public static class AlertRules extends TeaModel {
        @NameInMap("AlarmContext")
        private AlarmContext alarmContext;

        @NameInMap("AlertLevel")
        private String alertLevel;

        @NameInMap("AlertRule")
        private AlertRule alertRule;

        @NameInMap("AlertTitle")
        private String alertTitle;

        @NameInMap("AlertType")
        private Integer alertType;

        @NameInMap("AlertVersion")
        private Integer alertVersion;

        @NameInMap("AlertWays")
        private java.util.List < String > alertWays;

        @NameInMap("Config")
        private String config;

        @NameInMap("ContactGroupIdList")
        private String contactGroupIdList;

        @NameInMap("ContactGroupIds")
        private String contactGroupIds;

        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("HostByAlertManager")
        private Boolean hostByAlertManager;

        @NameInMap("Id")
        private Long id;

        @NameInMap("MetricParam")
        private MetricParam metricParam;

        @NameInMap("Notice")
        private Notice notice;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @NameInMap("Status")
        private String status;

        @NameInMap("TaskId")
        private Long taskId;

        @NameInMap("TaskStatus")
        private String taskStatus;

        @NameInMap("Title")
        private String title;

        @NameInMap("UpdateTime")
        private Long updateTime;

        @NameInMap("UserId")
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
        public java.util.List < String > getAlertWays() {
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
            private java.util.List < String > alertWays; 
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
             * The format of the alert notification.
             */
            public Builder alarmContext(AlarmContext alarmContext) {
                this.alarmContext = alarmContext;
                return this;
            }

            /**
             * The severity of the alerts. Only the value `WARN` is supported.
             */
            public Builder alertLevel(String alertLevel) {
                this.alertLevel = alertLevel;
                return this;
            }

            /**
             * The conditions of the alert rule. Multiple conditions are separated by the AND or OR logical operators.
             */
            public Builder alertRule(AlertRule alertRule) {
                this.alertRule = alertRule;
                return this;
            }

            /**
             * The name of the alert rule.
             */
            public Builder alertTitle(String alertTitle) {
                this.alertTitle = alertTitle;
                return this;
            }

            /**
             * The type of the alert rule. Valid values:
             * <p>
             * 
             * *   `1`: custom alert rules that are used to monitor drill-down data sets
             * *   `3`: custom alert rules that are used to monitor tiled data sets
             * *   `4`: alert rules that are used to monitor the browser, including the default frontend alert rules
             * *   `5`: alert rules that are used to monitor applications, including the default application alert rules
             * *   `6`: the default browser alert rules
             * *   `7`: the default application alert rules
             * *   `8`: Tracing Analysis alert rules
             * *   `101`: Prometheus alert rules
             */
            public Builder alertType(Integer alertType) {
                this.alertType = alertType;
                return this;
            }

            /**
             * The version of the alert rule. Default value: `1`.
             */
            public Builder alertVersion(Integer alertVersion) {
                this.alertVersion = alertVersion;
                return this;
            }

            /**
             * AlertWays.
             */
            public Builder alertWays(java.util.List < String > alertWays) {
                this.alertWays = alertWays;
                return this;
            }

            /**
             * The configuration items of the alert rule. The value is a JSON string.
             * <p>
             * 
             * The configuration item **continuous** indicates whether alert notifications are continuously sent. Valid values:
             * 
             * *   `true`: Alert notifications are sent every minute.
             * *   `false`: The alert silence feature is enabled.
             * 
             * The configuration item **dataRevision** indicates the data revision policy that is used if no data is obtained or the data is null. Default value: 2. Valid values:
             * 
             * *   `0`: overwrites the data by using the value 0
             * *   `1`: overwrites the data by using the value 1
             * *   `2`: overwrites the data by using the value null. This value indicates that no alert is triggered if no data exists
             */
            public Builder config(String config) {
                this.config = config;
                return this;
            }

            /**
             * The ID of the contact group. Multiple IDs are separated by commas (,).
             */
            public Builder contactGroupIdList(String contactGroupIdList) {
                this.contactGroupIdList = contactGroupIdList;
                return this;
            }

            /**
             * The IDs of the alert contact groups. The value is a JSON array.
             */
            public Builder contactGroupIds(String contactGroupIds) {
                this.contactGroupIds = contactGroupIds;
                return this;
            }

            /**
             * The timestamp that shows when the alert rule was created.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Indicates whether the alert is sent through the alert center. Valid values:
             * <p>
             * 
             * *   `true`
             * *   `false`
             */
            public Builder hostByAlertManager(Boolean hostByAlertManager) {
                this.hostByAlertManager = hostByAlertManager;
                return this;
            }

            /**
             * The ID of the alert rule.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * The information about the application that is associated with the alert rule.
             */
            public Builder metricParam(MetricParam metricParam) {
                this.metricParam = metricParam;
                return this;
            }

            /**
             * The time ranges when the alert rule takes effect and when alert notifications are sent.
             */
            public Builder notice(Notice notice) {
                this.notice = notice;
                return this;
            }

            /**
             * The ID of the region to which the alert rule belongs.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * ResourceGroupId.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * The status of the alert rule. `RUNNING`: The alert rule is enabled. `STOPPED`: The alert rule is disabled.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The ID of the Application Real-Time Monitoring Service (ARMS) task that is associated with the alert rule.
             */
            public Builder taskId(Long taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * The status of the task. This parameter is hidden from users.
             */
            public Builder taskStatus(String taskStatus) {
                this.taskStatus = taskStatus;
                return this;
            }

            /**
             * The name of the alert.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * The timestamp that shows when the alert rule was updated.
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * The ID of the user to which the alert rule belongs.
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
    public static class PageBean extends TeaModel {
        @NameInMap("AlertRules")
        private java.util.List < AlertRules> alertRules;

        @NameInMap("PageNumber")
        private Integer pageNumber;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("TotalCount")
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
        public java.util.List < AlertRules> getAlertRules() {
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
            private java.util.List < AlertRules> alertRules; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer totalCount; 

            /**
             * The details of the alert rules.
             */
            public Builder alertRules(java.util.List < AlertRules> alertRules) {
                this.alertRules = alertRules;
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
             * The total number of returned entries.
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
