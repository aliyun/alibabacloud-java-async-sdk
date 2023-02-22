// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link Configuration} extends {@link TeaModel}
 *
 * <p>Configuration</p>
 */
public class Configuration extends TeaModel {
    @NameInMap("annotations")
    private java.util.List < Annotations> annotations;

    @NameInMap("autoAnnotation")
    @Validation(required = true)
    private Boolean autoAnnotation;

    @NameInMap("dashboard")
    private String dashboard;

    @NameInMap("groupConfiguration")
    @Validation(required = true)
    private GroupConfiguration groupConfiguration;

    @NameInMap("joinConfigurations")
    private java.util.List < JoinConfigurations> joinConfigurations;

    @NameInMap("labels")
    private java.util.List < Labels> labels;

    @NameInMap("noDataFire")
    private Boolean noDataFire;

    @NameInMap("noDataSeverity")
    private Long noDataSeverity;

    @NameInMap("policyConfiguration")
    @Validation(required = true)
    private PolicyConfiguration policyConfiguration;

    @NameInMap("queryList")
    @Validation(required = true)
    private QueryList queryList;

    @NameInMap("sendResolved")
    private Boolean sendResolved;

    @NameInMap("severityConfigurations")
    @Validation(required = true)
    private java.util.List < SeverityConfigurations> severityConfigurations;

    @NameInMap("tags")
    private java.util.List < String > tags;

    @NameInMap("threshold")
    @Validation(required = true)
    private Long threshold;

    @NameInMap("type")
    @Validation(required = true)
    private String type;

    @NameInMap("version")
    @Validation(required = true)
    private String version;

    private Configuration(Builder builder) {
        this.annotations = builder.annotations;
        this.autoAnnotation = builder.autoAnnotation;
        this.dashboard = builder.dashboard;
        this.groupConfiguration = builder.groupConfiguration;
        this.joinConfigurations = builder.joinConfigurations;
        this.labels = builder.labels;
        this.noDataFire = builder.noDataFire;
        this.noDataSeverity = builder.noDataSeverity;
        this.policyConfiguration = builder.policyConfiguration;
        this.queryList = builder.queryList;
        this.sendResolved = builder.sendResolved;
        this.severityConfigurations = builder.severityConfigurations;
        this.tags = builder.tags;
        this.threshold = builder.threshold;
        this.type = builder.type;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Configuration create() {
        return builder().build();
    }

    /**
     * @return annotations
     */
    public java.util.List < Annotations> getAnnotations() {
        return this.annotations;
    }

    /**
     * @return autoAnnotation
     */
    public Boolean getAutoAnnotation() {
        return this.autoAnnotation;
    }

    /**
     * @return dashboard
     */
    public String getDashboard() {
        return this.dashboard;
    }

    /**
     * @return groupConfiguration
     */
    public GroupConfiguration getGroupConfiguration() {
        return this.groupConfiguration;
    }

    /**
     * @return joinConfigurations
     */
    public java.util.List < JoinConfigurations> getJoinConfigurations() {
        return this.joinConfigurations;
    }

    /**
     * @return labels
     */
    public java.util.List < Labels> getLabels() {
        return this.labels;
    }

    /**
     * @return noDataFire
     */
    public Boolean getNoDataFire() {
        return this.noDataFire;
    }

    /**
     * @return noDataSeverity
     */
    public Long getNoDataSeverity() {
        return this.noDataSeverity;
    }

    /**
     * @return policyConfiguration
     */
    public PolicyConfiguration getPolicyConfiguration() {
        return this.policyConfiguration;
    }

    /**
     * @return queryList
     */
    public QueryList getQueryList() {
        return this.queryList;
    }

    /**
     * @return sendResolved
     */
    public Boolean getSendResolved() {
        return this.sendResolved;
    }

    /**
     * @return severityConfigurations
     */
    public java.util.List < SeverityConfigurations> getSeverityConfigurations() {
        return this.severityConfigurations;
    }

    /**
     * @return tags
     */
    public java.util.List < String > getTags() {
        return this.tags;
    }

    /**
     * @return threshold
     */
    public Long getThreshold() {
        return this.threshold;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    public static final class Builder {
        private java.util.List < Annotations> annotations; 
        private Boolean autoAnnotation; 
        private String dashboard; 
        private GroupConfiguration groupConfiguration; 
        private java.util.List < JoinConfigurations> joinConfigurations; 
        private java.util.List < Labels> labels; 
        private Boolean noDataFire; 
        private Long noDataSeverity; 
        private PolicyConfiguration policyConfiguration; 
        private QueryList queryList; 
        private Boolean sendResolved; 
        private java.util.List < SeverityConfigurations> severityConfigurations; 
        private java.util.List < String > tags; 
        private Long threshold; 
        private String type; 
        private String version; 

        /**
         * 标注。
         */
        public Builder annotations(java.util.List < Annotations> annotations) {
            this.annotations = annotations;
            return this;
        }

        /**
         * 是否开启自动添加标注。
         */
        public Builder autoAnnotation(Boolean autoAnnotation) {
            this.autoAnnotation = autoAnnotation;
            return this;
        }

        /**
         * 告警历史仪表盘。
         */
        public Builder dashboard(String dashboard) {
            this.dashboard = dashboard;
            return this;
        }

        /**
         * 分组评估配置。
         */
        public Builder groupConfiguration(GroupConfiguration groupConfiguration) {
            this.groupConfiguration = groupConfiguration;
            return this;
        }

        /**
         * 集合操作配置。
         */
        public Builder joinConfigurations(java.util.List < JoinConfigurations> joinConfigurations) {
            this.joinConfigurations = joinConfigurations;
            return this;
        }

        /**
         * 标签。
         */
        public Builder labels(java.util.List < Labels> labels) {
            this.labels = labels;
            return this;
        }

        /**
         * 无数据是否触发告警。
         */
        public Builder noDataFire(Boolean noDataFire) {
            this.noDataFire = noDataFire;
            return this;
        }

        /**
         * 无数据触发告警时的告警严重度。
         */
        public Builder noDataSeverity(Long noDataSeverity) {
            this.noDataSeverity = noDataSeverity;
            return this;
        }

        /**
         * 告警策略配置。
         */
        public Builder policyConfiguration(PolicyConfiguration policyConfiguration) {
            this.policyConfiguration = policyConfiguration;
            return this;
        }

        /**
         * 查询统计列表。
         */
        public Builder queryList(QueryList queryList) {
            this.queryList = queryList;
            return this;
        }

        /**
         * 是否发送恢复通知。
         */
        public Builder sendResolved(Boolean sendResolved) {
            this.sendResolved = sendResolved;
            return this;
        }

        /**
         * 触发条件，至少设置一条触发条件。
         */
        public Builder severityConfigurations(java.util.List < SeverityConfigurations> severityConfigurations) {
            this.severityConfigurations = severityConfigurations;
            return this;
        }

        /**
         * 自定义设置告警监控规则的类别。
         */
        public Builder tags(java.util.List < String > tags) {
            this.tags = tags;
            return this;
        }

        /**
         * 设置连续触发阈值。当累计的触发次数达到该值时，产生一条告警。不满足触发条件时不计入统计。
         */
        public Builder threshold(Long threshold) {
            this.threshold = threshold;
            return this;
        }

        /**
         * 固定为default。
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * 固定为2.0。
         */
        public Builder version(String version) {
            this.version = version;
            return this;
        }

        public Configuration build() {
            return new Configuration(this);
        } 

    } 

    public static class Annotations extends TeaModel {
        @NameInMap("key")
        @Validation(required = true)
        private String key;

        @NameInMap("value")
        @Validation(required = true)
        private String value;

        private Annotations(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Annotations create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * 字段名称。
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * 字段值。
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Annotations build() {
                return new Annotations(this);
            } 

        } 

    }
    public static class GroupConfiguration extends TeaModel {
        @NameInMap("fields")
        private java.util.List < String > fields;

        @NameInMap("type")
        @Validation(required = true)
        private String type;

        private GroupConfiguration(Builder builder) {
            this.fields = builder.fields;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GroupConfiguration create() {
            return builder().build();
        }

        /**
         * @return fields
         */
        public java.util.List < String > getFields() {
            return this.fields;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private java.util.List < String > fields; 
            private String type; 

            /**
             * 用于分组评估的字段。
             */
            public Builder fields(java.util.List < String > fields) {
                this.fields = fields;
                return this;
            }

            /**
             * 分组评估类型。
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public GroupConfiguration build() {
                return new GroupConfiguration(this);
            } 

        } 

    }
    public static class JoinConfigurations extends TeaModel {
        @NameInMap("condition")
        private String condition;

        @NameInMap("type")
        private String type;

        private JoinConfigurations(Builder builder) {
            this.condition = builder.condition;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static JoinConfigurations create() {
            return builder().build();
        }

        /**
         * @return condition
         */
        public String getCondition() {
            return this.condition;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String condition; 
            private String type; 

            /**
             * 当type被设置为inner_join、left_join、right_join、full_join、left_exclude或right_exclude时，必须设置condition，例如设置为$0.host == $1.ip。
             */
            public Builder condition(String condition) {
                this.condition = condition;
                return this;
            }

            /**
             * 集合操作类型。
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public JoinConfigurations build() {
                return new JoinConfigurations(this);
            } 

        } 

    }
    public static class Labels extends TeaModel {
        @NameInMap("key")
        @Validation(required = true)
        private String key;

        @NameInMap("value")
        @Validation(required = true)
        private String value;

        private Labels(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Labels create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * 字段名称。
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * 字段值。
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Labels build() {
                return new Labels(this);
            } 

        } 

    }
    public static class PolicyConfiguration extends TeaModel {
        @NameInMap("actionPolicyId")
        private String actionPolicyId;

        @NameInMap("alertPolicyId")
        private String alertPolicyId;

        @NameInMap("repeatInterval")
        private String repeatInterval;

        @NameInMap("useDefault")
        private Boolean useDefault;

        private PolicyConfiguration(Builder builder) {
            this.actionPolicyId = builder.actionPolicyId;
            this.alertPolicyId = builder.alertPolicyId;
            this.repeatInterval = builder.repeatInterval;
            this.useDefault = builder.useDefault;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PolicyConfiguration create() {
            return builder().build();
        }

        /**
         * @return actionPolicyId
         */
        public String getActionPolicyId() {
            return this.actionPolicyId;
        }

        /**
         * @return alertPolicyId
         */
        public String getAlertPolicyId() {
            return this.alertPolicyId;
        }

        /**
         * @return repeatInterval
         */
        public String getRepeatInterval() {
            return this.repeatInterval;
        }

        /**
         * @return useDefault
         */
        public Boolean getUseDefault() {
            return this.useDefault;
        }

        public static final class Builder {
            private String actionPolicyId; 
            private String alertPolicyId; 
            private String repeatInterval; 
            private Boolean useDefault; 

            /**
             * 使用的行动策略ID
             */
            public Builder actionPolicyId(String actionPolicyId) {
                this.actionPolicyId = actionPolicyId;
                return this;
            }

            /**
             * 告警策略ID
             */
            public Builder alertPolicyId(String alertPolicyId) {
                this.alertPolicyId = alertPolicyId;
                return this;
            }

            /**
             * 重复等待时间。例如5m、1h等。
             */
            public Builder repeatInterval(String repeatInterval) {
                this.repeatInterval = repeatInterval;
                return this;
            }

            /**
             * 兼容字段，固定为false。
             */
            public Builder useDefault(Boolean useDefault) {
                this.useDefault = useDefault;
                return this;
            }

            public PolicyConfiguration build() {
                return new PolicyConfiguration(this);
            } 

        } 

    }
    public static class QueryList extends TeaModel {
        @NameInMap("powerSqlMode")
        private String powerSqlMode;

        @NameInMap("project")
        private String project;

        @NameInMap("query")
        private String query;

        @NameInMap("region")
        private String region;

        @NameInMap("roleArn")
        private String roleArn;

        @NameInMap("start")
        private String start;

        @NameInMap("store")
        private String store;

        @NameInMap("storeType")
        private String storeType;

        @NameInMap("timeSpanType")
        private String timeSpanType;

        private QueryList(Builder builder) {
            this.powerSqlMode = builder.powerSqlMode;
            this.project = builder.project;
            this.query = builder.query;
            this.region = builder.region;
            this.roleArn = builder.roleArn;
            this.start = builder.start;
            this.store = builder.store;
            this.storeType = builder.storeType;
            this.timeSpanType = builder.timeSpanType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QueryList create() {
            return builder().build();
        }

        /**
         * @return powerSqlMode
         */
        public String getPowerSqlMode() {
            return this.powerSqlMode;
        }

        /**
         * @return project
         */
        public String getProject() {
            return this.project;
        }

        /**
         * @return query
         */
        public String getQuery() {
            return this.query;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return roleArn
         */
        public String getRoleArn() {
            return this.roleArn;
        }

        /**
         * @return start
         */
        public String getStart() {
            return this.start;
        }

        /**
         * @return store
         */
        public String getStore() {
            return this.store;
        }

        /**
         * @return storeType
         */
        public String getStoreType() {
            return this.storeType;
        }

        /**
         * @return timeSpanType
         */
        public String getTimeSpanType() {
            return this.timeSpanType;
        }

        public static final class Builder {
            private String powerSqlMode; 
            private String project; 
            private String query; 
            private String region; 
            private String roleArn; 
            private String start; 
            private String store; 
            private String storeType; 
            private String timeSpanType; 

            /**
             * 是否使用独享SQL。
             */
            public Builder powerSqlMode(String powerSqlMode) {
                this.powerSqlMode = powerSqlMode;
                return this;
            }

            /**
             * 查询统计所关联的Project。
             */
            public Builder project(String project) {
                this.project = project;
                return this;
            }

            /**
             * 查询分析语句。
             */
            public Builder query(String query) {
                this.query = query;
                return this;
            }

            /**
             * 目标Project所在地域。
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * 访问数据所需的RAM角色的ARN。
             */
            public Builder roleArn(String roleArn) {
                this.roleArn = roleArn;
                return this;
            }

            /**
             * 结束时间。
             */
            public Builder start(String start) {
                this.start = start;
                return this;
            }

            /**
             * 查询统计所关联的Logstore、Metricstore或资源数据。
             */
            public Builder store(String store) {
                this.store = store;
                return this;
            }

            /**
             * 查询数据源类型。
             */
            public Builder storeType(String storeType) {
                this.storeType = storeType;
                return this;
            }

            /**
             * 时间类型。
             */
            public Builder timeSpanType(String timeSpanType) {
                this.timeSpanType = timeSpanType;
                return this;
            }

            public QueryList build() {
                return new QueryList(this);
            } 

        } 

    }
    public static class EvalCondition extends TeaModel {
        @NameInMap("condition")
        private String condition;

        @NameInMap("countCondition")
        private String countCondition;

        private EvalCondition(Builder builder) {
            this.condition = builder.condition;
            this.countCondition = builder.countCondition;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EvalCondition create() {
            return builder().build();
        }

        /**
         * @return condition
         */
        public String getCondition() {
            return this.condition;
        }

        /**
         * @return countCondition
         */
        public String getCountCondition() {
            return this.countCondition;
        }

        public static final class Builder {
            private String condition; 
            private String countCondition; 

            /**
             * 数据匹配表达式。
             */
            public Builder condition(String condition) {
                this.condition = condition;
                return this;
            }

            /**
             * 数据条数判断表达式，表示有多少条数据满足条件。
             */
            public Builder countCondition(String countCondition) {
                this.countCondition = countCondition;
                return this;
            }

            public EvalCondition build() {
                return new EvalCondition(this);
            } 

        } 

    }
    public static class SeverityConfigurations extends TeaModel {
        @NameInMap("evalCondition")
        private EvalCondition evalCondition;

        @NameInMap("severity")
        private Long severity;

        private SeverityConfigurations(Builder builder) {
            this.evalCondition = builder.evalCondition;
            this.severity = builder.severity;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SeverityConfigurations create() {
            return builder().build();
        }

        /**
         * @return evalCondition
         */
        public EvalCondition getEvalCondition() {
            return this.evalCondition;
        }

        /**
         * @return severity
         */
        public Long getSeverity() {
            return this.severity;
        }

        public static final class Builder {
            private EvalCondition evalCondition; 
            private Long severity; 

            /**
             * 触发条件。
             */
            public Builder evalCondition(EvalCondition evalCondition) {
                this.evalCondition = evalCondition;
                return this;
            }

            /**
             * 告警严重度
             */
            public Builder severity(Long severity) {
                this.severity = severity;
                return this;
            }

            public SeverityConfigurations build() {
                return new SeverityConfigurations(this);
            } 

        } 

    }
}
