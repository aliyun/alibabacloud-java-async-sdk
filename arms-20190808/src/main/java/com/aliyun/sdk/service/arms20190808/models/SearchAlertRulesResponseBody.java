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
             * Operator.
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * Rules.
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
            public Builder dimensions(java.util.List < Dimensions> dimensions) {
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
             * AlertWays.
             */
            public Builder alertWays(java.util.List < String > alertWays) {
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
             * HostByAlertManager.
             */
            public Builder hostByAlertManager(Boolean hostByAlertManager) {
                this.hostByAlertManager = hostByAlertManager;
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
             * ResourceGroupId.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
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
             * AlertRules.
             */
            public Builder alertRules(java.util.List < AlertRules> alertRules) {
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
