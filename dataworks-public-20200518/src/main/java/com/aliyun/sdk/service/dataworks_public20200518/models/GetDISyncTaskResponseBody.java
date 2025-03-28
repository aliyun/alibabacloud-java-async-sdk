// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

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
 * {@link GetDISyncTaskResponseBody} extends {@link TeaModel}
 *
 * <p>GetDISyncTaskResponseBody</p>
 */
public class GetDISyncTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetDISyncTaskResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDISyncTaskResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetDISyncTaskResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The returned results.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID. You can locate logs and troubleshoot issues based on the ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0bc1411515937635973****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li>True</li>
         * <li>False</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetDISyncTaskResponseBody build() {
            return new GetDISyncTaskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetDISyncTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetDISyncTaskResponseBody</p>
     */
    public static class AlarmRuleList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Aggregator")
        private String aggregator;

        @com.aliyun.core.annotation.NameInMap("Comparator")
        private String comparator;

        @com.aliyun.core.annotation.NameInMap("Duration")
        private Long duration;

        @com.aliyun.core.annotation.NameInMap("Level")
        private String level;

        @com.aliyun.core.annotation.NameInMap("Threshold")
        private Long threshold;

        private AlarmRuleList(Builder builder) {
            this.aggregator = builder.aggregator;
            this.comparator = builder.comparator;
            this.duration = builder.duration;
            this.level = builder.level;
            this.threshold = builder.threshold;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AlarmRuleList create() {
            return builder().build();
        }

        /**
         * @return aggregator
         */
        public String getAggregator() {
            return this.aggregator;
        }

        /**
         * @return comparator
         */
        public String getComparator() {
            return this.comparator;
        }

        /**
         * @return duration
         */
        public Long getDuration() {
            return this.duration;
        }

        /**
         * @return level
         */
        public String getLevel() {
            return this.level;
        }

        /**
         * @return threshold
         */
        public Long getThreshold() {
            return this.threshold;
        }

        public static final class Builder {
            private String aggregator; 
            private String comparator; 
            private Long duration; 
            private String level; 
            private Long threshold; 

            private Builder() {
            } 

            private Builder(AlarmRuleList model) {
                this.aggregator = model.aggregator;
                this.comparator = model.comparator;
                this.duration = model.duration;
                this.level = model.level;
                this.threshold = model.threshold;
            } 

            /**
             * <p>The calculation method of a metric. Valid values:</p>
             * <ul>
             * <li>avg</li>
             * <li>max</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>avg</p>
             */
            public Builder aggregator(String aggregator) {
                this.aggregator = aggregator;
                return this;
            }

            /**
             * <p>The comparison operator, which indicates the method used to compare a metric with the alert rule.</p>
             * <ul>
             * <li>&quot;=&quot;</li>
             * <li>&quot;&lt;&quot;</li>
             * <li>&quot;&gt;&quot;</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>=</p>
             */
            public Builder comparator(String comparator) {
                this.comparator = comparator;
                return this;
            }

            /**
             * <p>The duration that a condition is met before an alert is triggered. Unit: minutes.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder duration(Long duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <ul>
             * <li>WARNING</li>
             * <li>CRITICAL</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>WARNING</p>
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * <p>The threshold for the comparison between a metric and the alert rule.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder threshold(Long threshold) {
                this.threshold = threshold;
                return this;
            }

            public AlarmRuleList build() {
                return new AlarmRuleList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDISyncTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetDISyncTaskResponseBody</p>
     */
    public static class NotifyRule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Critical")
        private java.util.List<String> critical;

        @com.aliyun.core.annotation.NameInMap("Interval")
        private Long interval;

        @com.aliyun.core.annotation.NameInMap("Warning")
        private java.util.List<String> warning;

        private NotifyRule(Builder builder) {
            this.critical = builder.critical;
            this.interval = builder.interval;
            this.warning = builder.warning;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NotifyRule create() {
            return builder().build();
        }

        /**
         * @return critical
         */
        public java.util.List<String> getCritical() {
            return this.critical;
        }

        /**
         * @return interval
         */
        public Long getInterval() {
            return this.interval;
        }

        /**
         * @return warning
         */
        public java.util.List<String> getWarning() {
            return this.warning;
        }

        public static final class Builder {
            private java.util.List<String> critical; 
            private Long interval; 
            private java.util.List<String> warning; 

            private Builder() {
            } 

            private Builder(NotifyRule model) {
                this.critical = model.critical;
                this.interval = model.interval;
                this.warning = model.warning;
            } 

            /**
             * <p>The settings for Critical-level alert notifications.</p>
             */
            public Builder critical(java.util.List<String> critical) {
                this.critical = critical;
                return this;
            }

            /**
             * <p>The alert interval. Unit: minutes.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder interval(Long interval) {
                this.interval = interval;
                return this;
            }

            /**
             * <p>The settings for Warning-level alert notifications.</p>
             */
            public Builder warning(java.util.List<String> warning) {
                this.warning = warning;
                return this;
            }

            public NotifyRule build() {
                return new NotifyRule(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDISyncTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetDISyncTaskResponseBody</p>
     */
    public static class AlarmList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlarmRuleList")
        private java.util.List<AlarmRuleList> alarmRuleList;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Metric")
        private String metric;

        @com.aliyun.core.annotation.NameInMap("NotifyRule")
        private NotifyRule notifyRule;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        private String ruleName;

        private AlarmList(Builder builder) {
            this.alarmRuleList = builder.alarmRuleList;
            this.description = builder.description;
            this.enabled = builder.enabled;
            this.id = builder.id;
            this.metric = builder.metric;
            this.notifyRule = builder.notifyRule;
            this.ruleName = builder.ruleName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AlarmList create() {
            return builder().build();
        }

        /**
         * @return alarmRuleList
         */
        public java.util.List<AlarmRuleList> getAlarmRuleList() {
            return this.alarmRuleList;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return metric
         */
        public String getMetric() {
            return this.metric;
        }

        /**
         * @return notifyRule
         */
        public NotifyRule getNotifyRule() {
            return this.notifyRule;
        }

        /**
         * @return ruleName
         */
        public String getRuleName() {
            return this.ruleName;
        }

        public static final class Builder {
            private java.util.List<AlarmRuleList> alarmRuleList; 
            private String description; 
            private Boolean enabled; 
            private Long id; 
            private String metric; 
            private NotifyRule notifyRule; 
            private String ruleName; 

            private Builder() {
            } 

            private Builder(AlarmList model) {
                this.alarmRuleList = model.alarmRuleList;
                this.description = model.description;
                this.enabled = model.enabled;
                this.id = model.id;
                this.metric = model.metric;
                this.notifyRule = model.notifyRule;
                this.ruleName = model.ruleName;
            } 

            /**
             * <p>The alert notification settings. The value of this parameter is an array.</p>
             */
            public Builder alarmRuleList(java.util.List<AlarmRuleList> alarmRuleList) {
                this.alarmRuleList = alarmRuleList;
                return this;
            }

            /**
             * <p>The description of the alert rule.</p>
             * 
             * <strong>example:</strong>
             * <p>Description</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Indicates whether the alert rule is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * <p>The ID of the alert rule.</p>
             * 
             * <strong>example:</strong>
             * <p>45242</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The alert type. Valid values:</p>
             * <ul>
             * <li>taskStatus</li>
             * <li>bizDelay</li>
             * <li>taskFailoverCount</li>
             * <li>ddlUnsupport</li>
             * <li>ddlReport</li>
             * <li>totalDirtyRecordWriteInLines</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>taskStatus</p>
             */
            public Builder metric(String metric) {
                this.metric = metric;
                return this;
            }

            /**
             * <p>The settings for alert notification rules. The value of this parameter is an array.</p>
             */
            public Builder notifyRule(NotifyRule notifyRule) {
                this.notifyRule = notifyRule;
                return this;
            }

            /**
             * <p>The name of the alert rule.</p>
             * 
             * <strong>example:</strong>
             * <p>Delay alert rule name 1</p>
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            public AlarmList build() {
                return new AlarmList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDISyncTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetDISyncTaskResponseBody</p>
     */
    public static class SolutionDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreatorName")
        private String creatorName;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ProcessContent")
        private String processContent;

        @com.aliyun.core.annotation.NameInMap("ProcessExtra")
        private String processExtra;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private Long projectId;

        @com.aliyun.core.annotation.NameInMap("SourceType")
        private String sourceType;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("SubmitTime")
        private String submitTime;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private SolutionDetail(Builder builder) {
            this.creatorName = builder.creatorName;
            this.id = builder.id;
            this.name = builder.name;
            this.processContent = builder.processContent;
            this.processExtra = builder.processExtra;
            this.projectId = builder.projectId;
            this.sourceType = builder.sourceType;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.submitTime = builder.submitTime;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SolutionDetail create() {
            return builder().build();
        }

        /**
         * @return creatorName
         */
        public String getCreatorName() {
            return this.creatorName;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return processContent
         */
        public String getProcessContent() {
            return this.processContent;
        }

        /**
         * @return processExtra
         */
        public String getProcessExtra() {
            return this.processExtra;
        }

        /**
         * @return projectId
         */
        public Long getProjectId() {
            return this.projectId;
        }

        /**
         * @return sourceType
         */
        public String getSourceType() {
            return this.sourceType;
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

        /**
         * @return submitTime
         */
        public String getSubmitTime() {
            return this.submitTime;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String creatorName; 
            private Long id; 
            private String name; 
            private String processContent; 
            private String processExtra; 
            private Long projectId; 
            private String sourceType; 
            private String startTime; 
            private String status; 
            private String submitTime; 
            private String type; 

            private Builder() {
            } 

            private Builder(SolutionDetail model) {
                this.creatorName = model.creatorName;
                this.id = model.id;
                this.name = model.name;
                this.processContent = model.processContent;
                this.processExtra = model.processExtra;
                this.projectId = model.projectId;
                this.sourceType = model.sourceType;
                this.startTime = model.startTime;
                this.status = model.status;
                this.submitTime = model.submitTime;
                this.type = model.type;
            } 

            /**
             * <p>The creator of the data synchronization solution.</p>
             * 
             * <strong>example:</strong>
             * <p>dataworks_di</p>
             */
            public Builder creatorName(String creatorName) {
                this.creatorName = creatorName;
                return this;
            }

            /**
             * <p>The ID of the data synchronization solution.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The name of the data synchronization solution.</p>
             * 
             * <strong>example:</strong>
             * <p>holo_20211206161025</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The configuration details of the data synchronization solution.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;holoDatasource&quot;:&quot;holo&quot;,&quot;offlineSyncConfig&quot;:{&quot;nodeNameRule&quot;:&quot;oneclick_holo_di_${db_table_name_src}<em>to</em>${db_table_name_dest}&quot;,&quot;resourceGroup&quot;:&quot;group_219193793999490&quot;},&quot;processRuleId&quot;:1007,&quot;readerConcurrent&quot;:10,&quot;realtimeSyncConfig&quot;:{&quot;content&quot;:{&quot;order&quot;:{&quot;hops&quot;:[{&quot;from&quot;:&quot;reader&quot;,&quot;to&quot;:&quot;writer&quot;}]},&quot;setting&quot;:{&quot;speed&quot;:{&quot;readerConcurrent&quot;:10}},&quot;steps&quot;:[{&quot;stepType&quot;:&quot;mysql&quot;,&quot;name&quot;:&quot;reader&quot;,&quot;category&quot;:&quot;reader&quot;,&quot;parameter&quot;:{&quot;connection&quot;:[{&quot;datasource&quot;:&quot;mm&quot;,&quot;datasourceType&quot;:&quot;mysql&quot;,&quot;table&quot;:[]}]}},{&quot;stepType&quot;:&quot;holo&quot;,&quot;name&quot;:&quot;writer&quot;,&quot;category&quot;:&quot;writer&quot;,&quot;parameter&quot;:{&quot;datasource&quot;:&quot;holo&quot;,&quot;writeMode&quot;:&quot;replay&quot;,&quot;datasourceSchema&quot;:&quot;public&quot;,&quot;tableMappingRule&quot;:{&quot;datasource&quot;:[{&quot;tableRule&quot;:[],&quot;srcDatasourceName&quot;:&quot;mm&quot;}]}}}]},&quot;extend&quot;:{&quot;mode&quot;:&quot;migration_holo&quot;,&quot;resourceGroup&quot;:&quot;group_219193793999490&quot;}},&quot;setting&quot;:{&quot;autoCreateWorkflow&quot;:true,&quot;userDefinedFileNameExpression&quot;:&quot;oneclick&quot;},&quot;srcType&quot;:&quot;mysql&quot;,&quot;tableMappingRuleFromRealtimeSyncConfig&quot;:{&quot;datasource&quot;:[{&quot;srcDatasourceName&quot;:&quot;mm&quot;,&quot;tableRule&quot;:[]}]}}</p>
             */
            public Builder processContent(String processContent) {
                this.processContent = processContent;
                return this;
            }

            /**
             * <p>The additional parameters of the data synchronization solution.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;processType&quot;:&quot;new&quot;,&quot;tableNum&quot;:300}</p>
             */
            public Builder processExtra(String processExtra) {
                this.processExtra = processExtra;
                return this;
            }

            /**
             * <p>The ID of the project to which the data synchronization solution belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>10000</p>
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * <p>The type of the source of the data synchronization solution.</p>
             * 
             * <strong>example:</strong>
             * <p>mysql</p>
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            /**
             * <p>The start time of the data synchronization solution.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-12-07 14:40:51</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The status of the data synchronization solution. Valid values:</p>
             * <ul>
             * <li>0: successful</li>
             * <li>1: not running</li>
             * <li>2: running</li>
             * <li>3: failed</li>
             * <li>4: committed</li>
             * <li>5: pending manual confirmation</li>
             * <li>6: manually confirmed</li>
             * <li>7: others</li>
             * <li>8: waiting</li>
             * <li>9: deleted</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The time when the data synchronization solution was committed.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-12-07 14:40:51</p>
             */
            public Builder submitTime(String submitTime) {
                this.submitTime = submitTime;
                return this;
            }

            /**
             * <p>The type of the data synchronization solution.</p>
             * 
             * <strong>example:</strong>
             * <p>holo</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public SolutionDetail build() {
                return new SolutionDetail(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDISyncTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetDISyncTaskResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlarmList")
        private java.util.List<AlarmList> alarmList;

        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("SolutionDetail")
        private SolutionDetail solutionDetail;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Data(Builder builder) {
            this.alarmList = builder.alarmList;
            this.code = builder.code;
            this.message = builder.message;
            this.solutionDetail = builder.solutionDetail;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return alarmList
         */
        public java.util.List<AlarmList> getAlarmList() {
            return this.alarmList;
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return solutionDetail
         */
        public SolutionDetail getSolutionDetail() {
            return this.solutionDetail;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private java.util.List<AlarmList> alarmList; 
            private String code; 
            private String message; 
            private SolutionDetail solutionDetail; 
            private String status; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.alarmList = model.alarmList;
                this.code = model.code;
                this.message = model.message;
                this.solutionDetail = model.solutionDetail;
                this.status = model.status;
            } 

            /**
             * <p>The alert rules that are associated with the real-time synchronization task. The value of this parameter is an array.</p>
             */
            public Builder alarmList(java.util.List<AlarmList> alarmList) {
                this.alarmList = alarmList;
                return this;
            }

            /**
             * <ul>
             * <li>If the TaskType parameter is set to DI_REALTIME, the details of the real-time synchronization task are returned.</li>
             * <li>If the TaskType parameter is set to DI_SOLUTION, the value null is returned.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>{&quot;extend&quot;:{&quot;mode&quot;:&quot;wizard&quot;,&quot;resourceGroup&quot;:&quot;S_res_group_287114642182658_1560324290517&quot;},&quot;nodeDef&quot;:{},&quot;order&quot;:{&quot;hops&quot;:[{&quot;from&quot;:&quot;datahub_8htXSsfiS2vtZCVG&quot;,&quot;to&quot;:&quot;datahub_CRHBAyGfhSaLmv2f&quot;}]},&quot;setting&quot;:{&quot;errorLimit&quot;:{},&quot;jvmOption&quot;:&quot;&quot;},&quot;steps&quot;:[{&quot;stepType&quot;:&quot;datahub&quot;,&quot;category&quot;:&quot;writer&quot;,&quot;displayName&quot;:&quot;DataHub1&quot;,&quot;parameter&quot;:{&quot;batchSize&quot;:1000,&quot;datasource&quot;:&quot;datahub_cloud_dev_test&quot;,&quot;topic&quot;:&quot;dwd_tfc_opt_speed_rid_amap_rt&quot;},&quot;name&quot;:&quot;datahub_CRHBAyGfhSaLmv2f&quot;,&quot;gui&quot;:{&quot;x&quot;:262,&quot;y&quot;:325}},{&quot;stepType&quot;:&quot;datahub&quot;,&quot;displayName&quot;:&quot;DataHub2&quot;,&quot;parameter&quot;:{&quot;datasource&quot;:&quot;datahub_uric_test&quot;,&quot;topic&quot;:&quot;dwd_tfc_opt_speed_rid_amap_rt_330000&quot;,&quot;batchSize&quot;:1000},&quot;name&quot;:&quot;datahub_8htXSsfiS2vtZCVG&quot;,&quot;gui&quot;:{&quot;x&quot;:268,&quot;y&quot;:160.5},&quot;category&quot;:&quot;writer&quot;}]}</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The cause of the failure to obtain the details of the real-time synchronization task or data synchronization solution.</p>
             * <p>If the details of the real-time synchronization task or data synchronization solution are obtained, the value null is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>fileId:[100] is invalid.</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <ul>
             * <li>If the TaskType parameter is set to DI_REALTIME, the value null is returned.</li>
             * <li>If the TaskType parameter is set to DI_SOLUTION, the details of the data synchronization solution are returned.</li>
             * </ul>
             */
            public Builder solutionDetail(SolutionDetail solutionDetail) {
                this.solutionDetail = solutionDetail;
                return this;
            }

            /**
             * <p>Indicates whether the details of the real-time synchronization task or data synchronization solution are obtained. Valid values:</p>
             * <p>success: The details are obtained. fail: The details fail to be obtained.</p>
             * 
             * <strong>example:</strong>
             * <p>success</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
