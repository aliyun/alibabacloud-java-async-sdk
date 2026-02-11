// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20210422.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(SearchAlertRulesResponseBody model) {
            this.pageBean = model.pageBean;
            this.requestId = model.requestId;
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

            private Builder() {
            } 

            private Builder(AlarmContext model) {
                this.alarmContentSubTitle = model.alarmContentSubTitle;
                this.alarmContentTemplate = model.alarmContentTemplate;
                this.content = model.content;
                this.subTitle = model.subTitle;
            } 

            /**
             * AlarmContentSubTitle.
             */
            public Builder alarmContentSubTitle(String alarmContentSubTitle) {
                this.alarmContentSubTitle = alarmContentSubTitle;
                return this;
            }

            /**
             * AlarmContentTemplate.
             */
            public Builder alarmContentTemplate(String alarmContentTemplate) {
                this.alarmContentTemplate = alarmContentTemplate;
                return this;
            }

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * SubTitle.
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

            private Builder() {
            } 

            private Builder(Rules model) {
                this.aggregates = model.aggregates;
                this.alias = model.alias;
                this.measure = model.measure;
                this.nValue = model.nValue;
                this.operator = model.operator;
                this.value = model.value;
            } 

            /**
             * Aggregates.
             */
            public Builder aggregates(String aggregates) {
                this.aggregates = aggregates;
                return this;
            }

            /**
             * Alias.
             */
            public Builder alias(String alias) {
                this.alias = alias;
                return this;
            }

            /**
             * Measure.
             */
            public Builder measure(String measure) {
                this.measure = measure;
                return this;
            }

            /**
             * NValue.
             */
            public Builder nValue(Integer nValue) {
                this.nValue = nValue;
                return this;
            }

            /**
             * Operator.
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * Value.
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

            private Builder() {
            } 

            private Builder(AlertRule model) {
                this.operator = model.operator;
                this.rules = model.rules;
            } 

            /**
             * Operator.
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * Rules.
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

            private Builder() {
            } 

            private Builder(Dimensions model) {
                this.key = model.key;
                this.type = model.type;
                this.value = model.value;
            } 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Value.
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

            private Builder() {
            } 

            private Builder(MetricParam model) {
                this.appGroupId = model.appGroupId;
                this.appId = model.appId;
                this.dimensions = model.dimensions;
                this.pid = model.pid;
                this.type = model.type;
            } 

            /**
             * AppGroupId.
             */
            public Builder appGroupId(String appGroupId) {
                this.appGroupId = appGroupId;
                return this;
            }

            /**
             * AppId.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * Dimensions.
             */
            public Builder dimensions(java.util.List<Dimensions> dimensions) {
                this.dimensions = dimensions;
                return this;
            }

            /**
             * Pid.
             */
            public Builder pid(String pid) {
                this.pid = pid;
                return this;
            }

            /**
             * Type.
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

            private Builder() {
            } 

            private Builder(Notice model) {
                this.endTime = model.endTime;
                this.noticeEndTime = model.noticeEndTime;
                this.noticeStartTime = model.noticeStartTime;
                this.startTime = model.startTime;
            } 

            /**
             * EndTime.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * NoticeEndTime.
             */
            public Builder noticeEndTime(Long noticeEndTime) {
                this.noticeEndTime = noticeEndTime;
                return this;
            }

            /**
             * NoticeStartTime.
             */
            public Builder noticeStartTime(Long noticeStartTime) {
                this.noticeStartTime = noticeStartTime;
                return this;
            }

            /**
             * StartTime.
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

        @com.aliyun.core.annotation.NameInMap("AlertWay")
        private java.util.List<String> alertWay;

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

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("MetricParam")
        private MetricParam metricParam;

        @com.aliyun.core.annotation.NameInMap("Notice")
        private Notice notice;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

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
            this.alertWay = builder.alertWay;
            this.alertWays = builder.alertWays;
            this.config = builder.config;
            this.contactGroupIdList = builder.contactGroupIdList;
            this.contactGroupIds = builder.contactGroupIds;
            this.createTime = builder.createTime;
            this.id = builder.id;
            this.metricParam = builder.metricParam;
            this.notice = builder.notice;
            this.regionId = builder.regionId;
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
         * @return alertWay
         */
        public java.util.List<String> getAlertWay() {
            return this.alertWay;
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
            private java.util.List<String> alertWay; 
            private java.util.List<String> alertWays; 
            private String config; 
            private String contactGroupIdList; 
            private String contactGroupIds; 
            private Long createTime; 
            private Long id; 
            private MetricParam metricParam; 
            private Notice notice; 
            private String regionId; 
            private String status; 
            private Long taskId; 
            private String taskStatus; 
            private String title; 
            private Long updateTime; 
            private String userId; 

            private Builder() {
            } 

            private Builder(AlertRules model) {
                this.alarmContext = model.alarmContext;
                this.alertLevel = model.alertLevel;
                this.alertRule = model.alertRule;
                this.alertTitle = model.alertTitle;
                this.alertType = model.alertType;
                this.alertVersion = model.alertVersion;
                this.alertWay = model.alertWay;
                this.alertWays = model.alertWays;
                this.config = model.config;
                this.contactGroupIdList = model.contactGroupIdList;
                this.contactGroupIds = model.contactGroupIds;
                this.createTime = model.createTime;
                this.id = model.id;
                this.metricParam = model.metricParam;
                this.notice = model.notice;
                this.regionId = model.regionId;
                this.status = model.status;
                this.taskId = model.taskId;
                this.taskStatus = model.taskStatus;
                this.title = model.title;
                this.updateTime = model.updateTime;
                this.userId = model.userId;
            } 

            /**
             * AlarmContext.
             */
            public Builder alarmContext(AlarmContext alarmContext) {
                this.alarmContext = alarmContext;
                return this;
            }

            /**
             * AlertLevel.
             */
            public Builder alertLevel(String alertLevel) {
                this.alertLevel = alertLevel;
                return this;
            }

            /**
             * AlertRule.
             */
            public Builder alertRule(AlertRule alertRule) {
                this.alertRule = alertRule;
                return this;
            }

            /**
             * AlertTitle.
             */
            public Builder alertTitle(String alertTitle) {
                this.alertTitle = alertTitle;
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
             * AlertVersion.
             */
            public Builder alertVersion(Integer alertVersion) {
                this.alertVersion = alertVersion;
                return this;
            }

            /**
             * AlertWay.
             */
            public Builder alertWay(java.util.List<String> alertWay) {
                this.alertWay = alertWay;
                return this;
            }

            /**
             * AlertWays.
             */
            public Builder alertWays(java.util.List<String> alertWays) {
                this.alertWays = alertWays;
                return this;
            }

            /**
             * Config.
             */
            public Builder config(String config) {
                this.config = config;
                return this;
            }

            /**
             * ContactGroupIdList.
             */
            public Builder contactGroupIdList(String contactGroupIdList) {
                this.contactGroupIdList = contactGroupIdList;
                return this;
            }

            /**
             * ContactGroupIds.
             */
            public Builder contactGroupIds(String contactGroupIds) {
                this.contactGroupIds = contactGroupIds;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
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
             * MetricParam.
             */
            public Builder metricParam(MetricParam metricParam) {
                this.metricParam = metricParam;
                return this;
            }

            /**
             * Notice.
             */
            public Builder notice(Notice notice) {
                this.notice = notice;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * TaskId.
             */
            public Builder taskId(Long taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * TaskStatus.
             */
            public Builder taskStatus(String taskStatus) {
                this.taskStatus = taskStatus;
                return this;
            }

            /**
             * Title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * UpdateTime.
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * UserId.
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

            private Builder() {
            } 

            private Builder(PageBean model) {
                this.alertRules = model.alertRules;
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

            /**
             * AlertRules.
             */
            public Builder alertRules(java.util.List<AlertRules> alertRules) {
                this.alertRules = alertRules;
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
