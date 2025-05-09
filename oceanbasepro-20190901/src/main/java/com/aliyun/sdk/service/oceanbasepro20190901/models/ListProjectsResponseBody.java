// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

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
 * {@link ListProjectsResponseBody} extends {@link TeaModel}
 *
 * <p>ListProjectsResponseBody</p>
 */
public class ListProjectsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Advice")
    private String advice;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Cost")
    private String cost;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("ErrorDetail")
    private ErrorDetail errorDetail;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListProjectsResponseBody(Builder builder) {
        this.advice = builder.advice;
        this.code = builder.code;
        this.cost = builder.cost;
        this.data = builder.data;
        this.errorDetail = builder.errorDetail;
        this.message = builder.message;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProjectsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return advice
     */
    public String getAdvice() {
        return this.advice;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return cost
     */
    public String getCost() {
        return this.cost;
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return errorDetail
     */
    public ErrorDetail getErrorDetail() {
        return this.errorDetail;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String advice; 
        private String code; 
        private String cost; 
        private java.util.List<Data> data; 
        private ErrorDetail errorDetail; 
        private String message; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Boolean success; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListProjectsResponseBody model) {
            this.advice = model.advice;
            this.code = model.code;
            this.cost = model.cost;
            this.data = model.data;
            this.errorDetail = model.errorDetail;
            this.message = model.message;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.success = model.success;
            this.totalCount = model.totalCount;
        } 

        /**
         * Advice.
         */
        public Builder advice(String advice) {
            this.advice = advice;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Cost.
         */
        public Builder cost(String cost) {
            this.cost = cost;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * ErrorDetail.
         */
        public Builder errorDetail(ErrorDetail errorDetail) {
            this.errorDetail = errorDetail;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListProjectsResponseBody build() {
            return new ListProjectsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListProjectsResponseBody} extends {@link TeaModel}
     *
     * <p>ListProjectsResponseBody</p>
     */
    public static class AlarmStats extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlarmContent")
        private String alarmContent;

        @com.aliyun.core.annotation.NameInMap("Alarming")
        private Boolean alarming;

        @com.aliyun.core.annotation.NameInMap("OpenMonitor")
        private Boolean openMonitor;

        @com.aliyun.core.annotation.NameInMap("RecentlyTriggerCount")
        private Integer recentlyTriggerCount;

        @com.aliyun.core.annotation.NameInMap("RuleToRecentlyTriggerCount")
        private java.util.Map<String, Integer> ruleToRecentlyTriggerCount;

        @com.aliyun.core.annotation.NameInMap("Target")
        private String target;

        private AlarmStats(Builder builder) {
            this.alarmContent = builder.alarmContent;
            this.alarming = builder.alarming;
            this.openMonitor = builder.openMonitor;
            this.recentlyTriggerCount = builder.recentlyTriggerCount;
            this.ruleToRecentlyTriggerCount = builder.ruleToRecentlyTriggerCount;
            this.target = builder.target;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AlarmStats create() {
            return builder().build();
        }

        /**
         * @return alarmContent
         */
        public String getAlarmContent() {
            return this.alarmContent;
        }

        /**
         * @return alarming
         */
        public Boolean getAlarming() {
            return this.alarming;
        }

        /**
         * @return openMonitor
         */
        public Boolean getOpenMonitor() {
            return this.openMonitor;
        }

        /**
         * @return recentlyTriggerCount
         */
        public Integer getRecentlyTriggerCount() {
            return this.recentlyTriggerCount;
        }

        /**
         * @return ruleToRecentlyTriggerCount
         */
        public java.util.Map<String, Integer> getRuleToRecentlyTriggerCount() {
            return this.ruleToRecentlyTriggerCount;
        }

        /**
         * @return target
         */
        public String getTarget() {
            return this.target;
        }

        public static final class Builder {
            private String alarmContent; 
            private Boolean alarming; 
            private Boolean openMonitor; 
            private Integer recentlyTriggerCount; 
            private java.util.Map<String, Integer> ruleToRecentlyTriggerCount; 
            private String target; 

            private Builder() {
            } 

            private Builder(AlarmStats model) {
                this.alarmContent = model.alarmContent;
                this.alarming = model.alarming;
                this.openMonitor = model.openMonitor;
                this.recentlyTriggerCount = model.recentlyTriggerCount;
                this.ruleToRecentlyTriggerCount = model.ruleToRecentlyTriggerCount;
                this.target = model.target;
            } 

            /**
             * AlarmContent.
             */
            public Builder alarmContent(String alarmContent) {
                this.alarmContent = alarmContent;
                return this;
            }

            /**
             * Alarming.
             */
            public Builder alarming(Boolean alarming) {
                this.alarming = alarming;
                return this;
            }

            /**
             * OpenMonitor.
             */
            public Builder openMonitor(Boolean openMonitor) {
                this.openMonitor = openMonitor;
                return this;
            }

            /**
             * RecentlyTriggerCount.
             */
            public Builder recentlyTriggerCount(Integer recentlyTriggerCount) {
                this.recentlyTriggerCount = recentlyTriggerCount;
                return this;
            }

            /**
             * RuleToRecentlyTriggerCount.
             */
            public Builder ruleToRecentlyTriggerCount(java.util.Map<String, Integer> ruleToRecentlyTriggerCount) {
                this.ruleToRecentlyTriggerCount = ruleToRecentlyTriggerCount;
                return this;
            }

            /**
             * Target.
             */
            public Builder target(String target) {
                this.target = target;
                return this;
            }

            public AlarmStats build() {
                return new AlarmStats(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListProjectsResponseBody} extends {@link TeaModel}
     *
     * <p>ListProjectsResponseBody</p>
     */
    public static class CommonTransferConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActiveActive")
        private Boolean activeActive;

        @com.aliyun.core.annotation.NameInMap("DataWorksBusinessName")
        private String dataWorksBusinessName;

        @com.aliyun.core.annotation.NameInMap("DatahubTopicType")
        private String datahubTopicType;

        @com.aliyun.core.annotation.NameInMap("MqPartition")
        private Integer mqPartition;

        @com.aliyun.core.annotation.NameInMap("MqPartitionMode")
        private String mqPartitionMode;

        @com.aliyun.core.annotation.NameInMap("MqSerializerType")
        private String mqSerializerType;

        @com.aliyun.core.annotation.NameInMap("RocketMqEnableMsgTrace")
        private Boolean rocketMqEnableMsgTrace;

        @com.aliyun.core.annotation.NameInMap("RocketMqMsgTags")
        private String rocketMqMsgTags;

        @com.aliyun.core.annotation.NameInMap("RocketMqProducerGroup")
        private String rocketMqProducerGroup;

        @com.aliyun.core.annotation.NameInMap("RocketMqSendMsgTimeout")
        private Long rocketMqSendMsgTimeout;

        @com.aliyun.core.annotation.NameInMap("TableCategory")
        private String tableCategory;

        private CommonTransferConfig(Builder builder) {
            this.activeActive = builder.activeActive;
            this.dataWorksBusinessName = builder.dataWorksBusinessName;
            this.datahubTopicType = builder.datahubTopicType;
            this.mqPartition = builder.mqPartition;
            this.mqPartitionMode = builder.mqPartitionMode;
            this.mqSerializerType = builder.mqSerializerType;
            this.rocketMqEnableMsgTrace = builder.rocketMqEnableMsgTrace;
            this.rocketMqMsgTags = builder.rocketMqMsgTags;
            this.rocketMqProducerGroup = builder.rocketMqProducerGroup;
            this.rocketMqSendMsgTimeout = builder.rocketMqSendMsgTimeout;
            this.tableCategory = builder.tableCategory;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CommonTransferConfig create() {
            return builder().build();
        }

        /**
         * @return activeActive
         */
        public Boolean getActiveActive() {
            return this.activeActive;
        }

        /**
         * @return dataWorksBusinessName
         */
        public String getDataWorksBusinessName() {
            return this.dataWorksBusinessName;
        }

        /**
         * @return datahubTopicType
         */
        public String getDatahubTopicType() {
            return this.datahubTopicType;
        }

        /**
         * @return mqPartition
         */
        public Integer getMqPartition() {
            return this.mqPartition;
        }

        /**
         * @return mqPartitionMode
         */
        public String getMqPartitionMode() {
            return this.mqPartitionMode;
        }

        /**
         * @return mqSerializerType
         */
        public String getMqSerializerType() {
            return this.mqSerializerType;
        }

        /**
         * @return rocketMqEnableMsgTrace
         */
        public Boolean getRocketMqEnableMsgTrace() {
            return this.rocketMqEnableMsgTrace;
        }

        /**
         * @return rocketMqMsgTags
         */
        public String getRocketMqMsgTags() {
            return this.rocketMqMsgTags;
        }

        /**
         * @return rocketMqProducerGroup
         */
        public String getRocketMqProducerGroup() {
            return this.rocketMqProducerGroup;
        }

        /**
         * @return rocketMqSendMsgTimeout
         */
        public Long getRocketMqSendMsgTimeout() {
            return this.rocketMqSendMsgTimeout;
        }

        /**
         * @return tableCategory
         */
        public String getTableCategory() {
            return this.tableCategory;
        }

        public static final class Builder {
            private Boolean activeActive; 
            private String dataWorksBusinessName; 
            private String datahubTopicType; 
            private Integer mqPartition; 
            private String mqPartitionMode; 
            private String mqSerializerType; 
            private Boolean rocketMqEnableMsgTrace; 
            private String rocketMqMsgTags; 
            private String rocketMqProducerGroup; 
            private Long rocketMqSendMsgTimeout; 
            private String tableCategory; 

            private Builder() {
            } 

            private Builder(CommonTransferConfig model) {
                this.activeActive = model.activeActive;
                this.dataWorksBusinessName = model.dataWorksBusinessName;
                this.datahubTopicType = model.datahubTopicType;
                this.mqPartition = model.mqPartition;
                this.mqPartitionMode = model.mqPartitionMode;
                this.mqSerializerType = model.mqSerializerType;
                this.rocketMqEnableMsgTrace = model.rocketMqEnableMsgTrace;
                this.rocketMqMsgTags = model.rocketMqMsgTags;
                this.rocketMqProducerGroup = model.rocketMqProducerGroup;
                this.rocketMqSendMsgTimeout = model.rocketMqSendMsgTimeout;
                this.tableCategory = model.tableCategory;
            } 

            /**
             * ActiveActive.
             */
            public Builder activeActive(Boolean activeActive) {
                this.activeActive = activeActive;
                return this;
            }

            /**
             * DataWorksBusinessName.
             */
            public Builder dataWorksBusinessName(String dataWorksBusinessName) {
                this.dataWorksBusinessName = dataWorksBusinessName;
                return this;
            }

            /**
             * DatahubTopicType.
             */
            public Builder datahubTopicType(String datahubTopicType) {
                this.datahubTopicType = datahubTopicType;
                return this;
            }

            /**
             * MqPartition.
             */
            public Builder mqPartition(Integer mqPartition) {
                this.mqPartition = mqPartition;
                return this;
            }

            /**
             * MqPartitionMode.
             */
            public Builder mqPartitionMode(String mqPartitionMode) {
                this.mqPartitionMode = mqPartitionMode;
                return this;
            }

            /**
             * MqSerializerType.
             */
            public Builder mqSerializerType(String mqSerializerType) {
                this.mqSerializerType = mqSerializerType;
                return this;
            }

            /**
             * RocketMqEnableMsgTrace.
             */
            public Builder rocketMqEnableMsgTrace(Boolean rocketMqEnableMsgTrace) {
                this.rocketMqEnableMsgTrace = rocketMqEnableMsgTrace;
                return this;
            }

            /**
             * RocketMqMsgTags.
             */
            public Builder rocketMqMsgTags(String rocketMqMsgTags) {
                this.rocketMqMsgTags = rocketMqMsgTags;
                return this;
            }

            /**
             * RocketMqProducerGroup.
             */
            public Builder rocketMqProducerGroup(String rocketMqProducerGroup) {
                this.rocketMqProducerGroup = rocketMqProducerGroup;
                return this;
            }

            /**
             * RocketMqSendMsgTimeout.
             */
            public Builder rocketMqSendMsgTimeout(Long rocketMqSendMsgTimeout) {
                this.rocketMqSendMsgTimeout = rocketMqSendMsgTimeout;
                return this;
            }

            /**
             * TableCategory.
             */
            public Builder tableCategory(String tableCategory) {
                this.tableCategory = tableCategory;
                return this;
            }

            public CommonTransferConfig build() {
                return new CommonTransferConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListProjectsResponseBody} extends {@link TeaModel}
     *
     * <p>ListProjectsResponseBody</p>
     */
    public static class ExtraInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessObSource")
        private Boolean accessObSource;

        @com.aliyun.core.annotation.NameInMap("IgnoreUnsupportDdl")
        private Boolean ignoreUnsupportDdl;

        @com.aliyun.core.annotation.NameInMap("IncrSyncTimestamp")
        private Long incrSyncTimestamp;

        @com.aliyun.core.annotation.NameInMap("LogServiceStartCheckpoint")
        private Long logServiceStartCheckpoint;

        @com.aliyun.core.annotation.NameInMap("MaxConnectorCount")
        private Integer maxConnectorCount;

        @com.aliyun.core.annotation.NameInMap("MonitoringIncr")
        private Boolean monitoringIncr;

        @com.aliyun.core.annotation.NameInMap("OverwriteConfig")
        private Boolean overwriteConfig;

        @com.aliyun.core.annotation.NameInMap("ReverseSubtopics")
        private java.util.List<String> reverseSubtopics;

        @com.aliyun.core.annotation.NameInMap("RunningProgress")
        private Integer runningProgress;

        @com.aliyun.core.annotation.NameInMap("RunningStep")
        private String runningStep;

        @com.aliyun.core.annotation.NameInMap("SourceStoreKeptHour")
        private Integer sourceStoreKeptHour;

        @com.aliyun.core.annotation.NameInMap("StoreIncr")
        private Boolean storeIncr;

        @com.aliyun.core.annotation.NameInMap("SubConds")
        private java.util.Map<String, java.util.List<DataExtraInfoSubCondsValue>> subConds;

        @com.aliyun.core.annotation.NameInMap("SubDbs")
        private java.util.Map<String, java.util.List<DataExtraInfoSubDbsValue>> subDbs;

        @com.aliyun.core.annotation.NameInMap("SubIds")
        private java.util.Map<String, String> subIds;

        @com.aliyun.core.annotation.NameInMap("Subtopics")
        private java.util.List<String> subtopics;

        @com.aliyun.core.annotation.NameInMap("SyncDelay")
        private Long syncDelay;

        @com.aliyun.core.annotation.NameInMap("SyncDelaySampleTimestamp")
        private Long syncDelaySampleTimestamp;

        private ExtraInfo(Builder builder) {
            this.accessObSource = builder.accessObSource;
            this.ignoreUnsupportDdl = builder.ignoreUnsupportDdl;
            this.incrSyncTimestamp = builder.incrSyncTimestamp;
            this.logServiceStartCheckpoint = builder.logServiceStartCheckpoint;
            this.maxConnectorCount = builder.maxConnectorCount;
            this.monitoringIncr = builder.monitoringIncr;
            this.overwriteConfig = builder.overwriteConfig;
            this.reverseSubtopics = builder.reverseSubtopics;
            this.runningProgress = builder.runningProgress;
            this.runningStep = builder.runningStep;
            this.sourceStoreKeptHour = builder.sourceStoreKeptHour;
            this.storeIncr = builder.storeIncr;
            this.subConds = builder.subConds;
            this.subDbs = builder.subDbs;
            this.subIds = builder.subIds;
            this.subtopics = builder.subtopics;
            this.syncDelay = builder.syncDelay;
            this.syncDelaySampleTimestamp = builder.syncDelaySampleTimestamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExtraInfo create() {
            return builder().build();
        }

        /**
         * @return accessObSource
         */
        public Boolean getAccessObSource() {
            return this.accessObSource;
        }

        /**
         * @return ignoreUnsupportDdl
         */
        public Boolean getIgnoreUnsupportDdl() {
            return this.ignoreUnsupportDdl;
        }

        /**
         * @return incrSyncTimestamp
         */
        public Long getIncrSyncTimestamp() {
            return this.incrSyncTimestamp;
        }

        /**
         * @return logServiceStartCheckpoint
         */
        public Long getLogServiceStartCheckpoint() {
            return this.logServiceStartCheckpoint;
        }

        /**
         * @return maxConnectorCount
         */
        public Integer getMaxConnectorCount() {
            return this.maxConnectorCount;
        }

        /**
         * @return monitoringIncr
         */
        public Boolean getMonitoringIncr() {
            return this.monitoringIncr;
        }

        /**
         * @return overwriteConfig
         */
        public Boolean getOverwriteConfig() {
            return this.overwriteConfig;
        }

        /**
         * @return reverseSubtopics
         */
        public java.util.List<String> getReverseSubtopics() {
            return this.reverseSubtopics;
        }

        /**
         * @return runningProgress
         */
        public Integer getRunningProgress() {
            return this.runningProgress;
        }

        /**
         * @return runningStep
         */
        public String getRunningStep() {
            return this.runningStep;
        }

        /**
         * @return sourceStoreKeptHour
         */
        public Integer getSourceStoreKeptHour() {
            return this.sourceStoreKeptHour;
        }

        /**
         * @return storeIncr
         */
        public Boolean getStoreIncr() {
            return this.storeIncr;
        }

        /**
         * @return subConds
         */
        public java.util.Map<String, java.util.List<DataExtraInfoSubCondsValue>> getSubConds() {
            return this.subConds;
        }

        /**
         * @return subDbs
         */
        public java.util.Map<String, java.util.List<DataExtraInfoSubDbsValue>> getSubDbs() {
            return this.subDbs;
        }

        /**
         * @return subIds
         */
        public java.util.Map<String, String> getSubIds() {
            return this.subIds;
        }

        /**
         * @return subtopics
         */
        public java.util.List<String> getSubtopics() {
            return this.subtopics;
        }

        /**
         * @return syncDelay
         */
        public Long getSyncDelay() {
            return this.syncDelay;
        }

        /**
         * @return syncDelaySampleTimestamp
         */
        public Long getSyncDelaySampleTimestamp() {
            return this.syncDelaySampleTimestamp;
        }

        public static final class Builder {
            private Boolean accessObSource; 
            private Boolean ignoreUnsupportDdl; 
            private Long incrSyncTimestamp; 
            private Long logServiceStartCheckpoint; 
            private Integer maxConnectorCount; 
            private Boolean monitoringIncr; 
            private Boolean overwriteConfig; 
            private java.util.List<String> reverseSubtopics; 
            private Integer runningProgress; 
            private String runningStep; 
            private Integer sourceStoreKeptHour; 
            private Boolean storeIncr; 
            private java.util.Map<String, java.util.List<DataExtraInfoSubCondsValue>> subConds; 
            private java.util.Map<String, java.util.List<DataExtraInfoSubDbsValue>> subDbs; 
            private java.util.Map<String, String> subIds; 
            private java.util.List<String> subtopics; 
            private Long syncDelay; 
            private Long syncDelaySampleTimestamp; 

            private Builder() {
            } 

            private Builder(ExtraInfo model) {
                this.accessObSource = model.accessObSource;
                this.ignoreUnsupportDdl = model.ignoreUnsupportDdl;
                this.incrSyncTimestamp = model.incrSyncTimestamp;
                this.logServiceStartCheckpoint = model.logServiceStartCheckpoint;
                this.maxConnectorCount = model.maxConnectorCount;
                this.monitoringIncr = model.monitoringIncr;
                this.overwriteConfig = model.overwriteConfig;
                this.reverseSubtopics = model.reverseSubtopics;
                this.runningProgress = model.runningProgress;
                this.runningStep = model.runningStep;
                this.sourceStoreKeptHour = model.sourceStoreKeptHour;
                this.storeIncr = model.storeIncr;
                this.subConds = model.subConds;
                this.subDbs = model.subDbs;
                this.subIds = model.subIds;
                this.subtopics = model.subtopics;
                this.syncDelay = model.syncDelay;
                this.syncDelaySampleTimestamp = model.syncDelaySampleTimestamp;
            } 

            /**
             * AccessObSource.
             */
            public Builder accessObSource(Boolean accessObSource) {
                this.accessObSource = accessObSource;
                return this;
            }

            /**
             * IgnoreUnsupportDdl.
             */
            public Builder ignoreUnsupportDdl(Boolean ignoreUnsupportDdl) {
                this.ignoreUnsupportDdl = ignoreUnsupportDdl;
                return this;
            }

            /**
             * IncrSyncTimestamp.
             */
            public Builder incrSyncTimestamp(Long incrSyncTimestamp) {
                this.incrSyncTimestamp = incrSyncTimestamp;
                return this;
            }

            /**
             * LogServiceStartCheckpoint.
             */
            public Builder logServiceStartCheckpoint(Long logServiceStartCheckpoint) {
                this.logServiceStartCheckpoint = logServiceStartCheckpoint;
                return this;
            }

            /**
             * MaxConnectorCount.
             */
            public Builder maxConnectorCount(Integer maxConnectorCount) {
                this.maxConnectorCount = maxConnectorCount;
                return this;
            }

            /**
             * MonitoringIncr.
             */
            public Builder monitoringIncr(Boolean monitoringIncr) {
                this.monitoringIncr = monitoringIncr;
                return this;
            }

            /**
             * OverwriteConfig.
             */
            public Builder overwriteConfig(Boolean overwriteConfig) {
                this.overwriteConfig = overwriteConfig;
                return this;
            }

            /**
             * ReverseSubtopics.
             */
            public Builder reverseSubtopics(java.util.List<String> reverseSubtopics) {
                this.reverseSubtopics = reverseSubtopics;
                return this;
            }

            /**
             * RunningProgress.
             */
            public Builder runningProgress(Integer runningProgress) {
                this.runningProgress = runningProgress;
                return this;
            }

            /**
             * RunningStep.
             */
            public Builder runningStep(String runningStep) {
                this.runningStep = runningStep;
                return this;
            }

            /**
             * SourceStoreKeptHour.
             */
            public Builder sourceStoreKeptHour(Integer sourceStoreKeptHour) {
                this.sourceStoreKeptHour = sourceStoreKeptHour;
                return this;
            }

            /**
             * StoreIncr.
             */
            public Builder storeIncr(Boolean storeIncr) {
                this.storeIncr = storeIncr;
                return this;
            }

            /**
             * SubConds.
             */
            public Builder subConds(java.util.Map<String, java.util.List<DataExtraInfoSubCondsValue>> subConds) {
                this.subConds = subConds;
                return this;
            }

            /**
             * SubDbs.
             */
            public Builder subDbs(java.util.Map<String, java.util.List<DataExtraInfoSubDbsValue>> subDbs) {
                this.subDbs = subDbs;
                return this;
            }

            /**
             * SubIds.
             */
            public Builder subIds(java.util.Map<String, String> subIds) {
                this.subIds = subIds;
                return this;
            }

            /**
             * Subtopics.
             */
            public Builder subtopics(java.util.List<String> subtopics) {
                this.subtopics = subtopics;
                return this;
            }

            /**
             * SyncDelay.
             */
            public Builder syncDelay(Long syncDelay) {
                this.syncDelay = syncDelay;
                return this;
            }

            /**
             * SyncDelaySampleTimestamp.
             */
            public Builder syncDelaySampleTimestamp(Long syncDelaySampleTimestamp) {
                this.syncDelaySampleTimestamp = syncDelaySampleTimestamp;
                return this;
            }

            public ExtraInfo build() {
                return new ExtraInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListProjectsResponseBody} extends {@link TeaModel}
     *
     * <p>ListProjectsResponseBody</p>
     */
    public static class FullTransferConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllowDestTableNotEmpty")
        private Boolean allowDestTableNotEmpty;

        @com.aliyun.core.annotation.NameInMap("FullTransferSpeedMode")
        private String fullTransferSpeedMode;

        @com.aliyun.core.annotation.NameInMap("FullVerifySpeedMode")
        private String fullVerifySpeedMode;

        @com.aliyun.core.annotation.NameInMap("NonePkUkTruncateDstTable")
        private Boolean nonePkUkTruncateDstTable;

        private FullTransferConfig(Builder builder) {
            this.allowDestTableNotEmpty = builder.allowDestTableNotEmpty;
            this.fullTransferSpeedMode = builder.fullTransferSpeedMode;
            this.fullVerifySpeedMode = builder.fullVerifySpeedMode;
            this.nonePkUkTruncateDstTable = builder.nonePkUkTruncateDstTable;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FullTransferConfig create() {
            return builder().build();
        }

        /**
         * @return allowDestTableNotEmpty
         */
        public Boolean getAllowDestTableNotEmpty() {
            return this.allowDestTableNotEmpty;
        }

        /**
         * @return fullTransferSpeedMode
         */
        public String getFullTransferSpeedMode() {
            return this.fullTransferSpeedMode;
        }

        /**
         * @return fullVerifySpeedMode
         */
        public String getFullVerifySpeedMode() {
            return this.fullVerifySpeedMode;
        }

        /**
         * @return nonePkUkTruncateDstTable
         */
        public Boolean getNonePkUkTruncateDstTable() {
            return this.nonePkUkTruncateDstTable;
        }

        public static final class Builder {
            private Boolean allowDestTableNotEmpty; 
            private String fullTransferSpeedMode; 
            private String fullVerifySpeedMode; 
            private Boolean nonePkUkTruncateDstTable; 

            private Builder() {
            } 

            private Builder(FullTransferConfig model) {
                this.allowDestTableNotEmpty = model.allowDestTableNotEmpty;
                this.fullTransferSpeedMode = model.fullTransferSpeedMode;
                this.fullVerifySpeedMode = model.fullVerifySpeedMode;
                this.nonePkUkTruncateDstTable = model.nonePkUkTruncateDstTable;
            } 

            /**
             * AllowDestTableNotEmpty.
             */
            public Builder allowDestTableNotEmpty(Boolean allowDestTableNotEmpty) {
                this.allowDestTableNotEmpty = allowDestTableNotEmpty;
                return this;
            }

            /**
             * FullTransferSpeedMode.
             */
            public Builder fullTransferSpeedMode(String fullTransferSpeedMode) {
                this.fullTransferSpeedMode = fullTransferSpeedMode;
                return this;
            }

            /**
             * FullVerifySpeedMode.
             */
            public Builder fullVerifySpeedMode(String fullVerifySpeedMode) {
                this.fullVerifySpeedMode = fullVerifySpeedMode;
                return this;
            }

            /**
             * NonePkUkTruncateDstTable.
             */
            public Builder nonePkUkTruncateDstTable(Boolean nonePkUkTruncateDstTable) {
                this.nonePkUkTruncateDstTable = nonePkUkTruncateDstTable;
                return this;
            }

            public FullTransferConfig build() {
                return new FullTransferConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListProjectsResponseBody} extends {@link TeaModel}
     *
     * <p>ListProjectsResponseBody</p>
     */
    public static class IncrTransferConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EnableIncrSyncStatistics")
        private Boolean enableIncrSyncStatistics;

        @com.aliyun.core.annotation.NameInMap("EnableSequencingWithinTxn")
        private Boolean enableSequencingWithinTxn;

        @com.aliyun.core.annotation.NameInMap("IncrSyncConcurrency")
        private Integer incrSyncConcurrency;

        @com.aliyun.core.annotation.NameInMap("RecordTypeWhiteList")
        private java.util.List<String> recordTypeWhiteList;

        @com.aliyun.core.annotation.NameInMap("StartTimestamp")
        private Long startTimestamp;

        @com.aliyun.core.annotation.NameInMap("StoreLogKeptHour")
        private Integer storeLogKeptHour;

        private IncrTransferConfig(Builder builder) {
            this.enableIncrSyncStatistics = builder.enableIncrSyncStatistics;
            this.enableSequencingWithinTxn = builder.enableSequencingWithinTxn;
            this.incrSyncConcurrency = builder.incrSyncConcurrency;
            this.recordTypeWhiteList = builder.recordTypeWhiteList;
            this.startTimestamp = builder.startTimestamp;
            this.storeLogKeptHour = builder.storeLogKeptHour;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IncrTransferConfig create() {
            return builder().build();
        }

        /**
         * @return enableIncrSyncStatistics
         */
        public Boolean getEnableIncrSyncStatistics() {
            return this.enableIncrSyncStatistics;
        }

        /**
         * @return enableSequencingWithinTxn
         */
        public Boolean getEnableSequencingWithinTxn() {
            return this.enableSequencingWithinTxn;
        }

        /**
         * @return incrSyncConcurrency
         */
        public Integer getIncrSyncConcurrency() {
            return this.incrSyncConcurrency;
        }

        /**
         * @return recordTypeWhiteList
         */
        public java.util.List<String> getRecordTypeWhiteList() {
            return this.recordTypeWhiteList;
        }

        /**
         * @return startTimestamp
         */
        public Long getStartTimestamp() {
            return this.startTimestamp;
        }

        /**
         * @return storeLogKeptHour
         */
        public Integer getStoreLogKeptHour() {
            return this.storeLogKeptHour;
        }

        public static final class Builder {
            private Boolean enableIncrSyncStatistics; 
            private Boolean enableSequencingWithinTxn; 
            private Integer incrSyncConcurrency; 
            private java.util.List<String> recordTypeWhiteList; 
            private Long startTimestamp; 
            private Integer storeLogKeptHour; 

            private Builder() {
            } 

            private Builder(IncrTransferConfig model) {
                this.enableIncrSyncStatistics = model.enableIncrSyncStatistics;
                this.enableSequencingWithinTxn = model.enableSequencingWithinTxn;
                this.incrSyncConcurrency = model.incrSyncConcurrency;
                this.recordTypeWhiteList = model.recordTypeWhiteList;
                this.startTimestamp = model.startTimestamp;
                this.storeLogKeptHour = model.storeLogKeptHour;
            } 

            /**
             * EnableIncrSyncStatistics.
             */
            public Builder enableIncrSyncStatistics(Boolean enableIncrSyncStatistics) {
                this.enableIncrSyncStatistics = enableIncrSyncStatistics;
                return this;
            }

            /**
             * EnableSequencingWithinTxn.
             */
            public Builder enableSequencingWithinTxn(Boolean enableSequencingWithinTxn) {
                this.enableSequencingWithinTxn = enableSequencingWithinTxn;
                return this;
            }

            /**
             * IncrSyncConcurrency.
             */
            public Builder incrSyncConcurrency(Integer incrSyncConcurrency) {
                this.incrSyncConcurrency = incrSyncConcurrency;
                return this;
            }

            /**
             * RecordTypeWhiteList.
             */
            public Builder recordTypeWhiteList(java.util.List<String> recordTypeWhiteList) {
                this.recordTypeWhiteList = recordTypeWhiteList;
                return this;
            }

            /**
             * StartTimestamp.
             */
            public Builder startTimestamp(Long startTimestamp) {
                this.startTimestamp = startTimestamp;
                return this;
            }

            /**
             * StoreLogKeptHour.
             */
            public Builder storeLogKeptHour(Integer storeLogKeptHour) {
                this.storeLogKeptHour = storeLogKeptHour;
                return this;
            }

            public IncrTransferConfig build() {
                return new IncrTransferConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListProjectsResponseBody} extends {@link TeaModel}
     *
     * <p>ListProjectsResponseBody</p>
     */
    public static class Labels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("Creator")
        private String creator;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Type")
        private Integer type;

        private Labels(Builder builder) {
            this.count = builder.count;
            this.creator = builder.creator;
            this.id = builder.id;
            this.name = builder.name;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Labels create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return creator
         */
        public String getCreator() {
            return this.creator;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return type
         */
        public Integer getType() {
            return this.type;
        }

        public static final class Builder {
            private Integer count; 
            private String creator; 
            private String id; 
            private String name; 
            private Integer type; 

            private Builder() {
            } 

            private Builder(Labels model) {
                this.count = model.count;
                this.creator = model.creator;
                this.id = model.id;
                this.name = model.name;
                this.type = model.type;
            } 

            /**
             * Count.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * Creator.
             */
            public Builder creator(String creator) {
                this.creator = creator;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(Integer type) {
                this.type = type;
                return this;
            }

            public Labels build() {
                return new Labels(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListProjectsResponseBody} extends {@link TeaModel}
     *
     * <p>ListProjectsResponseBody</p>
     */
    public static class SinkConnectInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Charset")
        private String charset;

        @com.aliyun.core.annotation.NameInMap("ConnExtraAttributes")
        private Object connExtraAttributes;

        @com.aliyun.core.annotation.NameInMap("ConnectionInfo")
        private String connectionInfo;

        @com.aliyun.core.annotation.NameInMap("DbEngine")
        private String dbEngine;

        @com.aliyun.core.annotation.NameInMap("EndpointId")
        private String endpointId;

        @com.aliyun.core.annotation.NameInMap("EndpointName")
        private String endpointName;

        @com.aliyun.core.annotation.NameInMap("EndpointSide")
        private String endpointSide;

        @com.aliyun.core.annotation.NameInMap("Host")
        private String host;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("NlsLengthSemantics")
        private String nlsLengthSemantics;

        @com.aliyun.core.annotation.NameInMap("OcpName")
        private String ocpName;

        @com.aliyun.core.annotation.NameInMap("OperatingSystem")
        private String operatingSystem;

        @com.aliyun.core.annotation.NameInMap("Owner")
        private String owner;

        @com.aliyun.core.annotation.NameInMap("Port")
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("ResourceOwner")
        private String resourceOwner;

        @com.aliyun.core.annotation.NameInMap("Timezone")
        private String timezone;

        @com.aliyun.core.annotation.NameInMap("Username")
        private String username;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        private SinkConnectInfo(Builder builder) {
            this.charset = builder.charset;
            this.connExtraAttributes = builder.connExtraAttributes;
            this.connectionInfo = builder.connectionInfo;
            this.dbEngine = builder.dbEngine;
            this.endpointId = builder.endpointId;
            this.endpointName = builder.endpointName;
            this.endpointSide = builder.endpointSide;
            this.host = builder.host;
            this.id = builder.id;
            this.nlsLengthSemantics = builder.nlsLengthSemantics;
            this.ocpName = builder.ocpName;
            this.operatingSystem = builder.operatingSystem;
            this.owner = builder.owner;
            this.port = builder.port;
            this.region = builder.region;
            this.resourceOwner = builder.resourceOwner;
            this.timezone = builder.timezone;
            this.username = builder.username;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SinkConnectInfo create() {
            return builder().build();
        }

        /**
         * @return charset
         */
        public String getCharset() {
            return this.charset;
        }

        /**
         * @return connExtraAttributes
         */
        public Object getConnExtraAttributes() {
            return this.connExtraAttributes;
        }

        /**
         * @return connectionInfo
         */
        public String getConnectionInfo() {
            return this.connectionInfo;
        }

        /**
         * @return dbEngine
         */
        public String getDbEngine() {
            return this.dbEngine;
        }

        /**
         * @return endpointId
         */
        public String getEndpointId() {
            return this.endpointId;
        }

        /**
         * @return endpointName
         */
        public String getEndpointName() {
            return this.endpointName;
        }

        /**
         * @return endpointSide
         */
        public String getEndpointSide() {
            return this.endpointSide;
        }

        /**
         * @return host
         */
        public String getHost() {
            return this.host;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return nlsLengthSemantics
         */
        public String getNlsLengthSemantics() {
            return this.nlsLengthSemantics;
        }

        /**
         * @return ocpName
         */
        public String getOcpName() {
            return this.ocpName;
        }

        /**
         * @return operatingSystem
         */
        public String getOperatingSystem() {
            return this.operatingSystem;
        }

        /**
         * @return owner
         */
        public String getOwner() {
            return this.owner;
        }

        /**
         * @return port
         */
        public Integer getPort() {
            return this.port;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return resourceOwner
         */
        public String getResourceOwner() {
            return this.resourceOwner;
        }

        /**
         * @return timezone
         */
        public String getTimezone() {
            return this.timezone;
        }

        /**
         * @return username
         */
        public String getUsername() {
            return this.username;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String charset; 
            private Object connExtraAttributes; 
            private String connectionInfo; 
            private String dbEngine; 
            private String endpointId; 
            private String endpointName; 
            private String endpointSide; 
            private String host; 
            private String id; 
            private String nlsLengthSemantics; 
            private String ocpName; 
            private String operatingSystem; 
            private String owner; 
            private Integer port; 
            private String region; 
            private String resourceOwner; 
            private String timezone; 
            private String username; 
            private String version; 

            private Builder() {
            } 

            private Builder(SinkConnectInfo model) {
                this.charset = model.charset;
                this.connExtraAttributes = model.connExtraAttributes;
                this.connectionInfo = model.connectionInfo;
                this.dbEngine = model.dbEngine;
                this.endpointId = model.endpointId;
                this.endpointName = model.endpointName;
                this.endpointSide = model.endpointSide;
                this.host = model.host;
                this.id = model.id;
                this.nlsLengthSemantics = model.nlsLengthSemantics;
                this.ocpName = model.ocpName;
                this.operatingSystem = model.operatingSystem;
                this.owner = model.owner;
                this.port = model.port;
                this.region = model.region;
                this.resourceOwner = model.resourceOwner;
                this.timezone = model.timezone;
                this.username = model.username;
                this.version = model.version;
            } 

            /**
             * Charset.
             */
            public Builder charset(String charset) {
                this.charset = charset;
                return this;
            }

            /**
             * ConnExtraAttributes.
             */
            public Builder connExtraAttributes(Object connExtraAttributes) {
                this.connExtraAttributes = connExtraAttributes;
                return this;
            }

            /**
             * ConnectionInfo.
             */
            public Builder connectionInfo(String connectionInfo) {
                this.connectionInfo = connectionInfo;
                return this;
            }

            /**
             * DbEngine.
             */
            public Builder dbEngine(String dbEngine) {
                this.dbEngine = dbEngine;
                return this;
            }

            /**
             * EndpointId.
             */
            public Builder endpointId(String endpointId) {
                this.endpointId = endpointId;
                return this;
            }

            /**
             * EndpointName.
             */
            public Builder endpointName(String endpointName) {
                this.endpointName = endpointName;
                return this;
            }

            /**
             * EndpointSide.
             */
            public Builder endpointSide(String endpointSide) {
                this.endpointSide = endpointSide;
                return this;
            }

            /**
             * Host.
             */
            public Builder host(String host) {
                this.host = host;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * NlsLengthSemantics.
             */
            public Builder nlsLengthSemantics(String nlsLengthSemantics) {
                this.nlsLengthSemantics = nlsLengthSemantics;
                return this;
            }

            /**
             * OcpName.
             */
            public Builder ocpName(String ocpName) {
                this.ocpName = ocpName;
                return this;
            }

            /**
             * OperatingSystem.
             */
            public Builder operatingSystem(String operatingSystem) {
                this.operatingSystem = operatingSystem;
                return this;
            }

            /**
             * <p>Owner。</p>
             * 
             * <strong>example:</strong>
             * <p>admin</p>
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * Port.
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * Region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * ResourceOwner.
             */
            public Builder resourceOwner(String resourceOwner) {
                this.resourceOwner = resourceOwner;
                return this;
            }

            /**
             * Timezone.
             */
            public Builder timezone(String timezone) {
                this.timezone = timezone;
                return this;
            }

            /**
             * Username.
             */
            public Builder username(String username) {
                this.username = username;
                return this;
            }

            /**
             * Version.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public SinkConnectInfo build() {
                return new SinkConnectInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListProjectsResponseBody} extends {@link TeaModel}
     *
     * <p>ListProjectsResponseBody</p>
     */
    public static class SourceConnectInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Charset")
        private String charset;

        @com.aliyun.core.annotation.NameInMap("ConnExtraAttributes")
        private Object connExtraAttributes;

        @com.aliyun.core.annotation.NameInMap("ConnectionInfo")
        private String connectionInfo;

        @com.aliyun.core.annotation.NameInMap("DbEngine")
        private String dbEngine;

        @com.aliyun.core.annotation.NameInMap("EndpointId")
        private String endpointId;

        @com.aliyun.core.annotation.NameInMap("EndpointName")
        private String endpointName;

        @com.aliyun.core.annotation.NameInMap("EndpointSide")
        private String endpointSide;

        @com.aliyun.core.annotation.NameInMap("Host")
        private String host;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("NlsLengthSemantics")
        private String nlsLengthSemantics;

        @com.aliyun.core.annotation.NameInMap("OcpName")
        private String ocpName;

        @com.aliyun.core.annotation.NameInMap("OperatingSystem")
        private String operatingSystem;

        @com.aliyun.core.annotation.NameInMap("Owner")
        private String owner;

        @com.aliyun.core.annotation.NameInMap("Port")
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("ResourceOwner")
        private String resourceOwner;

        @com.aliyun.core.annotation.NameInMap("Timezone")
        private String timezone;

        @com.aliyun.core.annotation.NameInMap("Username")
        private String username;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        private SourceConnectInfo(Builder builder) {
            this.charset = builder.charset;
            this.connExtraAttributes = builder.connExtraAttributes;
            this.connectionInfo = builder.connectionInfo;
            this.dbEngine = builder.dbEngine;
            this.endpointId = builder.endpointId;
            this.endpointName = builder.endpointName;
            this.endpointSide = builder.endpointSide;
            this.host = builder.host;
            this.id = builder.id;
            this.nlsLengthSemantics = builder.nlsLengthSemantics;
            this.ocpName = builder.ocpName;
            this.operatingSystem = builder.operatingSystem;
            this.owner = builder.owner;
            this.port = builder.port;
            this.region = builder.region;
            this.resourceOwner = builder.resourceOwner;
            this.timezone = builder.timezone;
            this.username = builder.username;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SourceConnectInfo create() {
            return builder().build();
        }

        /**
         * @return charset
         */
        public String getCharset() {
            return this.charset;
        }

        /**
         * @return connExtraAttributes
         */
        public Object getConnExtraAttributes() {
            return this.connExtraAttributes;
        }

        /**
         * @return connectionInfo
         */
        public String getConnectionInfo() {
            return this.connectionInfo;
        }

        /**
         * @return dbEngine
         */
        public String getDbEngine() {
            return this.dbEngine;
        }

        /**
         * @return endpointId
         */
        public String getEndpointId() {
            return this.endpointId;
        }

        /**
         * @return endpointName
         */
        public String getEndpointName() {
            return this.endpointName;
        }

        /**
         * @return endpointSide
         */
        public String getEndpointSide() {
            return this.endpointSide;
        }

        /**
         * @return host
         */
        public String getHost() {
            return this.host;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return nlsLengthSemantics
         */
        public String getNlsLengthSemantics() {
            return this.nlsLengthSemantics;
        }

        /**
         * @return ocpName
         */
        public String getOcpName() {
            return this.ocpName;
        }

        /**
         * @return operatingSystem
         */
        public String getOperatingSystem() {
            return this.operatingSystem;
        }

        /**
         * @return owner
         */
        public String getOwner() {
            return this.owner;
        }

        /**
         * @return port
         */
        public Integer getPort() {
            return this.port;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return resourceOwner
         */
        public String getResourceOwner() {
            return this.resourceOwner;
        }

        /**
         * @return timezone
         */
        public String getTimezone() {
            return this.timezone;
        }

        /**
         * @return username
         */
        public String getUsername() {
            return this.username;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String charset; 
            private Object connExtraAttributes; 
            private String connectionInfo; 
            private String dbEngine; 
            private String endpointId; 
            private String endpointName; 
            private String endpointSide; 
            private String host; 
            private String id; 
            private String nlsLengthSemantics; 
            private String ocpName; 
            private String operatingSystem; 
            private String owner; 
            private Integer port; 
            private String region; 
            private String resourceOwner; 
            private String timezone; 
            private String username; 
            private String version; 

            private Builder() {
            } 

            private Builder(SourceConnectInfo model) {
                this.charset = model.charset;
                this.connExtraAttributes = model.connExtraAttributes;
                this.connectionInfo = model.connectionInfo;
                this.dbEngine = model.dbEngine;
                this.endpointId = model.endpointId;
                this.endpointName = model.endpointName;
                this.endpointSide = model.endpointSide;
                this.host = model.host;
                this.id = model.id;
                this.nlsLengthSemantics = model.nlsLengthSemantics;
                this.ocpName = model.ocpName;
                this.operatingSystem = model.operatingSystem;
                this.owner = model.owner;
                this.port = model.port;
                this.region = model.region;
                this.resourceOwner = model.resourceOwner;
                this.timezone = model.timezone;
                this.username = model.username;
                this.version = model.version;
            } 

            /**
             * Charset.
             */
            public Builder charset(String charset) {
                this.charset = charset;
                return this;
            }

            /**
             * ConnExtraAttributes.
             */
            public Builder connExtraAttributes(Object connExtraAttributes) {
                this.connExtraAttributes = connExtraAttributes;
                return this;
            }

            /**
             * ConnectionInfo.
             */
            public Builder connectionInfo(String connectionInfo) {
                this.connectionInfo = connectionInfo;
                return this;
            }

            /**
             * DbEngine.
             */
            public Builder dbEngine(String dbEngine) {
                this.dbEngine = dbEngine;
                return this;
            }

            /**
             * EndpointId.
             */
            public Builder endpointId(String endpointId) {
                this.endpointId = endpointId;
                return this;
            }

            /**
             * EndpointName.
             */
            public Builder endpointName(String endpointName) {
                this.endpointName = endpointName;
                return this;
            }

            /**
             * EndpointSide.
             */
            public Builder endpointSide(String endpointSide) {
                this.endpointSide = endpointSide;
                return this;
            }

            /**
             * Host.
             */
            public Builder host(String host) {
                this.host = host;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * NlsLengthSemantics.
             */
            public Builder nlsLengthSemantics(String nlsLengthSemantics) {
                this.nlsLengthSemantics = nlsLengthSemantics;
                return this;
            }

            /**
             * OcpName.
             */
            public Builder ocpName(String ocpName) {
                this.ocpName = ocpName;
                return this;
            }

            /**
             * OperatingSystem.
             */
            public Builder operatingSystem(String operatingSystem) {
                this.operatingSystem = operatingSystem;
                return this;
            }

            /**
             * <p>Owner。</p>
             * 
             * <strong>example:</strong>
             * <p>admin</p>
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * Port.
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * Region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * ResourceOwner.
             */
            public Builder resourceOwner(String resourceOwner) {
                this.resourceOwner = resourceOwner;
                return this;
            }

            /**
             * Timezone.
             */
            public Builder timezone(String timezone) {
                this.timezone = timezone;
                return this;
            }

            /**
             * Username.
             */
            public Builder username(String username) {
                this.username = username;
                return this;
            }

            /**
             * Version.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public SourceConnectInfo build() {
                return new SourceConnectInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListProjectsResponseBody} extends {@link TeaModel}
     *
     * <p>ListProjectsResponseBody</p>
     */
    public static class ErrorDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("ExtraContext")
        private java.util.Map<String, ?> extraContext;

        @com.aliyun.core.annotation.NameInMap("Level")
        private String level;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("MessageMcmsContext")
        private java.util.Map<String, String> messageMcmsContext;

        @com.aliyun.core.annotation.NameInMap("MessageMcmsKey")
        private String messageMcmsKey;

        @com.aliyun.core.annotation.NameInMap("Proposal")
        private String proposal;

        @com.aliyun.core.annotation.NameInMap("ProposalMcmsContext")
        private java.util.Map<String, String> proposalMcmsContext;

        @com.aliyun.core.annotation.NameInMap("ProposalMcmsKey")
        private String proposalMcmsKey;

        @com.aliyun.core.annotation.NameInMap("Reason")
        private String reason;

        @com.aliyun.core.annotation.NameInMap("ReasonMcmsContext")
        private java.util.Map<String, String> reasonMcmsContext;

        @com.aliyun.core.annotation.NameInMap("ReasonMcmsKey")
        private String reasonMcmsKey;

        @com.aliyun.core.annotation.NameInMap("UpstreamErrorDetail")
        private Object upstreamErrorDetail;

        private ErrorDetails(Builder builder) {
            this.code = builder.code;
            this.extraContext = builder.extraContext;
            this.level = builder.level;
            this.message = builder.message;
            this.messageMcmsContext = builder.messageMcmsContext;
            this.messageMcmsKey = builder.messageMcmsKey;
            this.proposal = builder.proposal;
            this.proposalMcmsContext = builder.proposalMcmsContext;
            this.proposalMcmsKey = builder.proposalMcmsKey;
            this.reason = builder.reason;
            this.reasonMcmsContext = builder.reasonMcmsContext;
            this.reasonMcmsKey = builder.reasonMcmsKey;
            this.upstreamErrorDetail = builder.upstreamErrorDetail;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ErrorDetails create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return extraContext
         */
        public java.util.Map<String, ?> getExtraContext() {
            return this.extraContext;
        }

        /**
         * @return level
         */
        public String getLevel() {
            return this.level;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return messageMcmsContext
         */
        public java.util.Map<String, String> getMessageMcmsContext() {
            return this.messageMcmsContext;
        }

        /**
         * @return messageMcmsKey
         */
        public String getMessageMcmsKey() {
            return this.messageMcmsKey;
        }

        /**
         * @return proposal
         */
        public String getProposal() {
            return this.proposal;
        }

        /**
         * @return proposalMcmsContext
         */
        public java.util.Map<String, String> getProposalMcmsContext() {
            return this.proposalMcmsContext;
        }

        /**
         * @return proposalMcmsKey
         */
        public String getProposalMcmsKey() {
            return this.proposalMcmsKey;
        }

        /**
         * @return reason
         */
        public String getReason() {
            return this.reason;
        }

        /**
         * @return reasonMcmsContext
         */
        public java.util.Map<String, String> getReasonMcmsContext() {
            return this.reasonMcmsContext;
        }

        /**
         * @return reasonMcmsKey
         */
        public String getReasonMcmsKey() {
            return this.reasonMcmsKey;
        }

        /**
         * @return upstreamErrorDetail
         */
        public Object getUpstreamErrorDetail() {
            return this.upstreamErrorDetail;
        }

        public static final class Builder {
            private String code; 
            private java.util.Map<String, ?> extraContext; 
            private String level; 
            private String message; 
            private java.util.Map<String, String> messageMcmsContext; 
            private String messageMcmsKey; 
            private String proposal; 
            private java.util.Map<String, String> proposalMcmsContext; 
            private String proposalMcmsKey; 
            private String reason; 
            private java.util.Map<String, String> reasonMcmsContext; 
            private String reasonMcmsKey; 
            private Object upstreamErrorDetail; 

            private Builder() {
            } 

            private Builder(ErrorDetails model) {
                this.code = model.code;
                this.extraContext = model.extraContext;
                this.level = model.level;
                this.message = model.message;
                this.messageMcmsContext = model.messageMcmsContext;
                this.messageMcmsKey = model.messageMcmsKey;
                this.proposal = model.proposal;
                this.proposalMcmsContext = model.proposalMcmsContext;
                this.proposalMcmsKey = model.proposalMcmsKey;
                this.reason = model.reason;
                this.reasonMcmsContext = model.reasonMcmsContext;
                this.reasonMcmsKey = model.reasonMcmsKey;
                this.upstreamErrorDetail = model.upstreamErrorDetail;
            } 

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * ExtraContext.
             */
            public Builder extraContext(java.util.Map<String, ?> extraContext) {
                this.extraContext = extraContext;
                return this;
            }

            /**
             * Level.
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * Message.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * MessageMcmsContext.
             */
            public Builder messageMcmsContext(java.util.Map<String, String> messageMcmsContext) {
                this.messageMcmsContext = messageMcmsContext;
                return this;
            }

            /**
             * MessageMcmsKey.
             */
            public Builder messageMcmsKey(String messageMcmsKey) {
                this.messageMcmsKey = messageMcmsKey;
                return this;
            }

            /**
             * Proposal.
             */
            public Builder proposal(String proposal) {
                this.proposal = proposal;
                return this;
            }

            /**
             * ProposalMcmsContext.
             */
            public Builder proposalMcmsContext(java.util.Map<String, String> proposalMcmsContext) {
                this.proposalMcmsContext = proposalMcmsContext;
                return this;
            }

            /**
             * ProposalMcmsKey.
             */
            public Builder proposalMcmsKey(String proposalMcmsKey) {
                this.proposalMcmsKey = proposalMcmsKey;
                return this;
            }

            /**
             * Reason.
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * ReasonMcmsContext.
             */
            public Builder reasonMcmsContext(java.util.Map<String, String> reasonMcmsContext) {
                this.reasonMcmsContext = reasonMcmsContext;
                return this;
            }

            /**
             * ReasonMcmsKey.
             */
            public Builder reasonMcmsKey(String reasonMcmsKey) {
                this.reasonMcmsKey = reasonMcmsKey;
                return this;
            }

            /**
             * UpstreamErrorDetail.
             */
            public Builder upstreamErrorDetail(Object upstreamErrorDetail) {
                this.upstreamErrorDetail = upstreamErrorDetail;
                return this;
            }

            public ErrorDetails build() {
                return new ErrorDetails(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListProjectsResponseBody} extends {@link TeaModel}
     *
     * <p>ListProjectsResponseBody</p>
     */
    public static class StepsExtraInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("ErrorDetails")
        private java.util.List<ErrorDetails> errorDetails;

        @com.aliyun.core.annotation.NameInMap("ErrorMsg")
        private String errorMsg;

        @com.aliyun.core.annotation.NameInMap("ErrorParam")
        private java.util.Map<String, String> errorParam;

        @com.aliyun.core.annotation.NameInMap("FailedTime")
        private String failedTime;

        private StepsExtraInfo(Builder builder) {
            this.errorCode = builder.errorCode;
            this.errorDetails = builder.errorDetails;
            this.errorMsg = builder.errorMsg;
            this.errorParam = builder.errorParam;
            this.failedTime = builder.failedTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StepsExtraInfo create() {
            return builder().build();
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return errorDetails
         */
        public java.util.List<ErrorDetails> getErrorDetails() {
            return this.errorDetails;
        }

        /**
         * @return errorMsg
         */
        public String getErrorMsg() {
            return this.errorMsg;
        }

        /**
         * @return errorParam
         */
        public java.util.Map<String, String> getErrorParam() {
            return this.errorParam;
        }

        /**
         * @return failedTime
         */
        public String getFailedTime() {
            return this.failedTime;
        }

        public static final class Builder {
            private String errorCode; 
            private java.util.List<ErrorDetails> errorDetails; 
            private String errorMsg; 
            private java.util.Map<String, String> errorParam; 
            private String failedTime; 

            private Builder() {
            } 

            private Builder(StepsExtraInfo model) {
                this.errorCode = model.errorCode;
                this.errorDetails = model.errorDetails;
                this.errorMsg = model.errorMsg;
                this.errorParam = model.errorParam;
                this.failedTime = model.failedTime;
            } 

            /**
             * ErrorCode.
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * ErrorDetails.
             */
            public Builder errorDetails(java.util.List<ErrorDetails> errorDetails) {
                this.errorDetails = errorDetails;
                return this;
            }

            /**
             * ErrorMsg.
             */
            public Builder errorMsg(String errorMsg) {
                this.errorMsg = errorMsg;
                return this;
            }

            /**
             * ErrorParam.
             */
            public Builder errorParam(java.util.Map<String, String> errorParam) {
                this.errorParam = errorParam;
                return this;
            }

            /**
             * FailedTime.
             */
            public Builder failedTime(String failedTime) {
                this.failedTime = failedTime;
                return this;
            }

            public StepsExtraInfo build() {
                return new StepsExtraInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListProjectsResponseBody} extends {@link TeaModel}
     *
     * <p>ListProjectsResponseBody</p>
     */
    public static class Steps extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("ExtraInfo")
        private StepsExtraInfo extraInfo;

        @com.aliyun.core.annotation.NameInMap("FinishTime")
        private String finishTime;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Order")
        private Integer order;

        @com.aliyun.core.annotation.NameInMap("Progress")
        private Integer progress;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StepInfo")
        private java.util.Map<String, ?> stepInfo;

        private Steps(Builder builder) {
            this.description = builder.description;
            this.extraInfo = builder.extraInfo;
            this.finishTime = builder.finishTime;
            this.name = builder.name;
            this.order = builder.order;
            this.progress = builder.progress;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.stepInfo = builder.stepInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Steps create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return extraInfo
         */
        public StepsExtraInfo getExtraInfo() {
            return this.extraInfo;
        }

        /**
         * @return finishTime
         */
        public String getFinishTime() {
            return this.finishTime;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return order
         */
        public Integer getOrder() {
            return this.order;
        }

        /**
         * @return progress
         */
        public Integer getProgress() {
            return this.progress;
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
         * @return stepInfo
         */
        public java.util.Map<String, ?> getStepInfo() {
            return this.stepInfo;
        }

        public static final class Builder {
            private String description; 
            private StepsExtraInfo extraInfo; 
            private String finishTime; 
            private String name; 
            private Integer order; 
            private Integer progress; 
            private String startTime; 
            private String status; 
            private java.util.Map<String, ?> stepInfo; 

            private Builder() {
            } 

            private Builder(Steps model) {
                this.description = model.description;
                this.extraInfo = model.extraInfo;
                this.finishTime = model.finishTime;
                this.name = model.name;
                this.order = model.order;
                this.progress = model.progress;
                this.startTime = model.startTime;
                this.status = model.status;
                this.stepInfo = model.stepInfo;
            } 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * ExtraInfo.
             */
            public Builder extraInfo(StepsExtraInfo extraInfo) {
                this.extraInfo = extraInfo;
                return this;
            }

            /**
             * FinishTime.
             */
            public Builder finishTime(String finishTime) {
                this.finishTime = finishTime;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Order.
             */
            public Builder order(Integer order) {
                this.order = order;
                return this;
            }

            /**
             * Progress.
             */
            public Builder progress(Integer progress) {
                this.progress = progress;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
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
             * StepInfo.
             */
            public Builder stepInfo(java.util.Map<String, ?> stepInfo) {
                this.stepInfo = stepInfo;
                return this;
            }

            public Steps build() {
                return new Steps(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListProjectsResponseBody} extends {@link TeaModel}
     *
     * <p>ListProjectsResponseBody</p>
     */
    public static class StructTransferConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ByteCharConvertStrategy")
        private String byteCharConvertStrategy;

        @com.aliyun.core.annotation.NameInMap("DeferIndexCreation")
        private Boolean deferIndexCreation;

        private StructTransferConfig(Builder builder) {
            this.byteCharConvertStrategy = builder.byteCharConvertStrategy;
            this.deferIndexCreation = builder.deferIndexCreation;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StructTransferConfig create() {
            return builder().build();
        }

        /**
         * @return byteCharConvertStrategy
         */
        public String getByteCharConvertStrategy() {
            return this.byteCharConvertStrategy;
        }

        /**
         * @return deferIndexCreation
         */
        public Boolean getDeferIndexCreation() {
            return this.deferIndexCreation;
        }

        public static final class Builder {
            private String byteCharConvertStrategy; 
            private Boolean deferIndexCreation; 

            private Builder() {
            } 

            private Builder(StructTransferConfig model) {
                this.byteCharConvertStrategy = model.byteCharConvertStrategy;
                this.deferIndexCreation = model.deferIndexCreation;
            } 

            /**
             * ByteCharConvertStrategy.
             */
            public Builder byteCharConvertStrategy(String byteCharConvertStrategy) {
                this.byteCharConvertStrategy = byteCharConvertStrategy;
                return this;
            }

            /**
             * DeferIndexCreation.
             */
            public Builder deferIndexCreation(Boolean deferIndexCreation) {
                this.deferIndexCreation = deferIndexCreation;
                return this;
            }

            public StructTransferConfig build() {
                return new StructTransferConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListProjectsResponseBody} extends {@link TeaModel}
     *
     * <p>ListProjectsResponseBody</p>
     */
    public static class TransferMapping extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Mode")
        private String mode;

        private TransferMapping(Builder builder) {
            this.mode = builder.mode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TransferMapping create() {
            return builder().build();
        }

        /**
         * @return mode
         */
        public String getMode() {
            return this.mode;
        }

        public static final class Builder {
            private String mode; 

            private Builder() {
            } 

            private Builder(TransferMapping model) {
                this.mode = model.mode;
            } 

            /**
             * Mode.
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            public TransferMapping build() {
                return new TransferMapping(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListProjectsResponseBody} extends {@link TeaModel}
     *
     * <p>ListProjectsResponseBody</p>
     */
    public static class WorkerGradeInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutoRenewal")
        private Boolean autoRenewal;

        @com.aliyun.core.annotation.NameInMap("ChargeType")
        private String chargeType;

        @com.aliyun.core.annotation.NameInMap("DestRegion")
        private String destRegion;

        @com.aliyun.core.annotation.NameInMap("DestType")
        private String destType;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("Expired")
        private Boolean expired;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("Grade")
        private String grade;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("SourceRegion")
        private String sourceRegion;

        @com.aliyun.core.annotation.NameInMap("SourceType")
        private String sourceType;

        @com.aliyun.core.annotation.NameInMap("Spec")
        private String spec;

        @com.aliyun.core.annotation.NameInMap("SpecName")
        private String specName;

        private WorkerGradeInfo(Builder builder) {
            this.autoRenewal = builder.autoRenewal;
            this.chargeType = builder.chargeType;
            this.destRegion = builder.destRegion;
            this.destType = builder.destType;
            this.endTime = builder.endTime;
            this.expired = builder.expired;
            this.gmtCreate = builder.gmtCreate;
            this.grade = builder.grade;
            this.id = builder.id;
            this.name = builder.name;
            this.sourceRegion = builder.sourceRegion;
            this.sourceType = builder.sourceType;
            this.spec = builder.spec;
            this.specName = builder.specName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WorkerGradeInfo create() {
            return builder().build();
        }

        /**
         * @return autoRenewal
         */
        public Boolean getAutoRenewal() {
            return this.autoRenewal;
        }

        /**
         * @return chargeType
         */
        public String getChargeType() {
            return this.chargeType;
        }

        /**
         * @return destRegion
         */
        public String getDestRegion() {
            return this.destRegion;
        }

        /**
         * @return destType
         */
        public String getDestType() {
            return this.destType;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return expired
         */
        public Boolean getExpired() {
            return this.expired;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return grade
         */
        public String getGrade() {
            return this.grade;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return sourceRegion
         */
        public String getSourceRegion() {
            return this.sourceRegion;
        }

        /**
         * @return sourceType
         */
        public String getSourceType() {
            return this.sourceType;
        }

        /**
         * @return spec
         */
        public String getSpec() {
            return this.spec;
        }

        /**
         * @return specName
         */
        public String getSpecName() {
            return this.specName;
        }

        public static final class Builder {
            private Boolean autoRenewal; 
            private String chargeType; 
            private String destRegion; 
            private String destType; 
            private String endTime; 
            private Boolean expired; 
            private String gmtCreate; 
            private String grade; 
            private String id; 
            private String name; 
            private String sourceRegion; 
            private String sourceType; 
            private String spec; 
            private String specName; 

            private Builder() {
            } 

            private Builder(WorkerGradeInfo model) {
                this.autoRenewal = model.autoRenewal;
                this.chargeType = model.chargeType;
                this.destRegion = model.destRegion;
                this.destType = model.destType;
                this.endTime = model.endTime;
                this.expired = model.expired;
                this.gmtCreate = model.gmtCreate;
                this.grade = model.grade;
                this.id = model.id;
                this.name = model.name;
                this.sourceRegion = model.sourceRegion;
                this.sourceType = model.sourceType;
                this.spec = model.spec;
                this.specName = model.specName;
            } 

            /**
             * AutoRenewal.
             */
            public Builder autoRenewal(Boolean autoRenewal) {
                this.autoRenewal = autoRenewal;
                return this;
            }

            /**
             * ChargeType.
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * DestRegion.
             */
            public Builder destRegion(String destRegion) {
                this.destRegion = destRegion;
                return this;
            }

            /**
             * DestType.
             */
            public Builder destType(String destType) {
                this.destType = destType;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * Expired.
             */
            public Builder expired(Boolean expired) {
                this.expired = expired;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * Grade.
             */
            public Builder grade(String grade) {
                this.grade = grade;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * SourceRegion.
             */
            public Builder sourceRegion(String sourceRegion) {
                this.sourceRegion = sourceRegion;
                return this;
            }

            /**
             * SourceType.
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            /**
             * Spec.
             */
            public Builder spec(String spec) {
                this.spec = spec;
                return this;
            }

            /**
             * SpecName.
             */
            public Builder specName(String specName) {
                this.specName = specName;
                return this;
            }

            public WorkerGradeInfo build() {
                return new WorkerGradeInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListProjectsResponseBody} extends {@link TeaModel}
     *
     * <p>ListProjectsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlarmStats")
        private AlarmStats alarmStats;

        @com.aliyun.core.annotation.NameInMap("CommonTransferConfig")
        private CommonTransferConfig commonTransferConfig;

        @com.aliyun.core.annotation.NameInMap("DestConnId")
        private String destConnId;

        @com.aliyun.core.annotation.NameInMap("EnableFullTransfer")
        private Boolean enableFullTransfer;

        @com.aliyun.core.annotation.NameInMap("EnableFullVerify")
        private Boolean enableFullVerify;

        @com.aliyun.core.annotation.NameInMap("EnableIncrTransfer")
        private Boolean enableIncrTransfer;

        @com.aliyun.core.annotation.NameInMap("EnableIncrVerify")
        private Boolean enableIncrVerify;

        @com.aliyun.core.annotation.NameInMap("EnableReverseIncrTransfer")
        private Boolean enableReverseIncrTransfer;

        @com.aliyun.core.annotation.NameInMap("EnableStructTransfer")
        private Boolean enableStructTransfer;

        @com.aliyun.core.annotation.NameInMap("ExtraInfo")
        private ExtraInfo extraInfo;

        @com.aliyun.core.annotation.NameInMap("FullTransferConfig")
        private FullTransferConfig fullTransferConfig;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtFinish")
        private String gmtFinish;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("GmtStart")
        private String gmtStart;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Importance")
        private String importance;

        @com.aliyun.core.annotation.NameInMap("IncrTransferConfig")
        private IncrTransferConfig incrTransferConfig;

        @com.aliyun.core.annotation.NameInMap("IsMerging")
        private Boolean isMerging;

        @com.aliyun.core.annotation.NameInMap("IsModifying")
        private Boolean isModifying;

        @com.aliyun.core.annotation.NameInMap("IsSubProject")
        private Boolean isSubProject;

        @com.aliyun.core.annotation.NameInMap("Labels")
        private java.util.List<Labels> labels;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Owner")
        private String owner;

        @com.aliyun.core.annotation.NameInMap("SinkConnectInfo")
        private SinkConnectInfo sinkConnectInfo;

        @com.aliyun.core.annotation.NameInMap("SinkEndpointType")
        private String sinkEndpointType;

        @com.aliyun.core.annotation.NameInMap("SourceConnectInfo")
        private SourceConnectInfo sourceConnectInfo;

        @com.aliyun.core.annotation.NameInMap("SourceEndpointType")
        private String sourceEndpointType;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Steps")
        private java.util.List<Steps> steps;

        @com.aliyun.core.annotation.NameInMap("StructTransferConfig")
        private StructTransferConfig structTransferConfig;

        @com.aliyun.core.annotation.NameInMap("TransferMapping")
        private TransferMapping transferMapping;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("WorkerGradeId")
        private String workerGradeId;

        @com.aliyun.core.annotation.NameInMap("WorkerGradeInfo")
        private WorkerGradeInfo workerGradeInfo;

        private Data(Builder builder) {
            this.alarmStats = builder.alarmStats;
            this.commonTransferConfig = builder.commonTransferConfig;
            this.destConnId = builder.destConnId;
            this.enableFullTransfer = builder.enableFullTransfer;
            this.enableFullVerify = builder.enableFullVerify;
            this.enableIncrTransfer = builder.enableIncrTransfer;
            this.enableIncrVerify = builder.enableIncrVerify;
            this.enableReverseIncrTransfer = builder.enableReverseIncrTransfer;
            this.enableStructTransfer = builder.enableStructTransfer;
            this.extraInfo = builder.extraInfo;
            this.fullTransferConfig = builder.fullTransferConfig;
            this.gmtCreate = builder.gmtCreate;
            this.gmtFinish = builder.gmtFinish;
            this.gmtModified = builder.gmtModified;
            this.gmtStart = builder.gmtStart;
            this.id = builder.id;
            this.importance = builder.importance;
            this.incrTransferConfig = builder.incrTransferConfig;
            this.isMerging = builder.isMerging;
            this.isModifying = builder.isModifying;
            this.isSubProject = builder.isSubProject;
            this.labels = builder.labels;
            this.name = builder.name;
            this.owner = builder.owner;
            this.sinkConnectInfo = builder.sinkConnectInfo;
            this.sinkEndpointType = builder.sinkEndpointType;
            this.sourceConnectInfo = builder.sourceConnectInfo;
            this.sourceEndpointType = builder.sourceEndpointType;
            this.status = builder.status;
            this.steps = builder.steps;
            this.structTransferConfig = builder.structTransferConfig;
            this.transferMapping = builder.transferMapping;
            this.type = builder.type;
            this.workerGradeId = builder.workerGradeId;
            this.workerGradeInfo = builder.workerGradeInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return alarmStats
         */
        public AlarmStats getAlarmStats() {
            return this.alarmStats;
        }

        /**
         * @return commonTransferConfig
         */
        public CommonTransferConfig getCommonTransferConfig() {
            return this.commonTransferConfig;
        }

        /**
         * @return destConnId
         */
        public String getDestConnId() {
            return this.destConnId;
        }

        /**
         * @return enableFullTransfer
         */
        public Boolean getEnableFullTransfer() {
            return this.enableFullTransfer;
        }

        /**
         * @return enableFullVerify
         */
        public Boolean getEnableFullVerify() {
            return this.enableFullVerify;
        }

        /**
         * @return enableIncrTransfer
         */
        public Boolean getEnableIncrTransfer() {
            return this.enableIncrTransfer;
        }

        /**
         * @return enableIncrVerify
         */
        public Boolean getEnableIncrVerify() {
            return this.enableIncrVerify;
        }

        /**
         * @return enableReverseIncrTransfer
         */
        public Boolean getEnableReverseIncrTransfer() {
            return this.enableReverseIncrTransfer;
        }

        /**
         * @return enableStructTransfer
         */
        public Boolean getEnableStructTransfer() {
            return this.enableStructTransfer;
        }

        /**
         * @return extraInfo
         */
        public ExtraInfo getExtraInfo() {
            return this.extraInfo;
        }

        /**
         * @return fullTransferConfig
         */
        public FullTransferConfig getFullTransferConfig() {
            return this.fullTransferConfig;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtFinish
         */
        public String getGmtFinish() {
            return this.gmtFinish;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return gmtStart
         */
        public String getGmtStart() {
            return this.gmtStart;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return importance
         */
        public String getImportance() {
            return this.importance;
        }

        /**
         * @return incrTransferConfig
         */
        public IncrTransferConfig getIncrTransferConfig() {
            return this.incrTransferConfig;
        }

        /**
         * @return isMerging
         */
        public Boolean getIsMerging() {
            return this.isMerging;
        }

        /**
         * @return isModifying
         */
        public Boolean getIsModifying() {
            return this.isModifying;
        }

        /**
         * @return isSubProject
         */
        public Boolean getIsSubProject() {
            return this.isSubProject;
        }

        /**
         * @return labels
         */
        public java.util.List<Labels> getLabels() {
            return this.labels;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return owner
         */
        public String getOwner() {
            return this.owner;
        }

        /**
         * @return sinkConnectInfo
         */
        public SinkConnectInfo getSinkConnectInfo() {
            return this.sinkConnectInfo;
        }

        /**
         * @return sinkEndpointType
         */
        public String getSinkEndpointType() {
            return this.sinkEndpointType;
        }

        /**
         * @return sourceConnectInfo
         */
        public SourceConnectInfo getSourceConnectInfo() {
            return this.sourceConnectInfo;
        }

        /**
         * @return sourceEndpointType
         */
        public String getSourceEndpointType() {
            return this.sourceEndpointType;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return steps
         */
        public java.util.List<Steps> getSteps() {
            return this.steps;
        }

        /**
         * @return structTransferConfig
         */
        public StructTransferConfig getStructTransferConfig() {
            return this.structTransferConfig;
        }

        /**
         * @return transferMapping
         */
        public TransferMapping getTransferMapping() {
            return this.transferMapping;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return workerGradeId
         */
        public String getWorkerGradeId() {
            return this.workerGradeId;
        }

        /**
         * @return workerGradeInfo
         */
        public WorkerGradeInfo getWorkerGradeInfo() {
            return this.workerGradeInfo;
        }

        public static final class Builder {
            private AlarmStats alarmStats; 
            private CommonTransferConfig commonTransferConfig; 
            private String destConnId; 
            private Boolean enableFullTransfer; 
            private Boolean enableFullVerify; 
            private Boolean enableIncrTransfer; 
            private Boolean enableIncrVerify; 
            private Boolean enableReverseIncrTransfer; 
            private Boolean enableStructTransfer; 
            private ExtraInfo extraInfo; 
            private FullTransferConfig fullTransferConfig; 
            private String gmtCreate; 
            private String gmtFinish; 
            private String gmtModified; 
            private String gmtStart; 
            private String id; 
            private String importance; 
            private IncrTransferConfig incrTransferConfig; 
            private Boolean isMerging; 
            private Boolean isModifying; 
            private Boolean isSubProject; 
            private java.util.List<Labels> labels; 
            private String name; 
            private String owner; 
            private SinkConnectInfo sinkConnectInfo; 
            private String sinkEndpointType; 
            private SourceConnectInfo sourceConnectInfo; 
            private String sourceEndpointType; 
            private String status; 
            private java.util.List<Steps> steps; 
            private StructTransferConfig structTransferConfig; 
            private TransferMapping transferMapping; 
            private String type; 
            private String workerGradeId; 
            private WorkerGradeInfo workerGradeInfo; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.alarmStats = model.alarmStats;
                this.commonTransferConfig = model.commonTransferConfig;
                this.destConnId = model.destConnId;
                this.enableFullTransfer = model.enableFullTransfer;
                this.enableFullVerify = model.enableFullVerify;
                this.enableIncrTransfer = model.enableIncrTransfer;
                this.enableIncrVerify = model.enableIncrVerify;
                this.enableReverseIncrTransfer = model.enableReverseIncrTransfer;
                this.enableStructTransfer = model.enableStructTransfer;
                this.extraInfo = model.extraInfo;
                this.fullTransferConfig = model.fullTransferConfig;
                this.gmtCreate = model.gmtCreate;
                this.gmtFinish = model.gmtFinish;
                this.gmtModified = model.gmtModified;
                this.gmtStart = model.gmtStart;
                this.id = model.id;
                this.importance = model.importance;
                this.incrTransferConfig = model.incrTransferConfig;
                this.isMerging = model.isMerging;
                this.isModifying = model.isModifying;
                this.isSubProject = model.isSubProject;
                this.labels = model.labels;
                this.name = model.name;
                this.owner = model.owner;
                this.sinkConnectInfo = model.sinkConnectInfo;
                this.sinkEndpointType = model.sinkEndpointType;
                this.sourceConnectInfo = model.sourceConnectInfo;
                this.sourceEndpointType = model.sourceEndpointType;
                this.status = model.status;
                this.steps = model.steps;
                this.structTransferConfig = model.structTransferConfig;
                this.transferMapping = model.transferMapping;
                this.type = model.type;
                this.workerGradeId = model.workerGradeId;
                this.workerGradeInfo = model.workerGradeInfo;
            } 

            /**
             * AlarmStats.
             */
            public Builder alarmStats(AlarmStats alarmStats) {
                this.alarmStats = alarmStats;
                return this;
            }

            /**
             * CommonTransferConfig.
             */
            public Builder commonTransferConfig(CommonTransferConfig commonTransferConfig) {
                this.commonTransferConfig = commonTransferConfig;
                return this;
            }

            /**
             * DestConnId.
             */
            public Builder destConnId(String destConnId) {
                this.destConnId = destConnId;
                return this;
            }

            /**
             * EnableFullTransfer.
             */
            public Builder enableFullTransfer(Boolean enableFullTransfer) {
                this.enableFullTransfer = enableFullTransfer;
                return this;
            }

            /**
             * EnableFullVerify.
             */
            public Builder enableFullVerify(Boolean enableFullVerify) {
                this.enableFullVerify = enableFullVerify;
                return this;
            }

            /**
             * EnableIncrTransfer.
             */
            public Builder enableIncrTransfer(Boolean enableIncrTransfer) {
                this.enableIncrTransfer = enableIncrTransfer;
                return this;
            }

            /**
             * EnableIncrVerify.
             */
            public Builder enableIncrVerify(Boolean enableIncrVerify) {
                this.enableIncrVerify = enableIncrVerify;
                return this;
            }

            /**
             * EnableReverseIncrTransfer.
             */
            public Builder enableReverseIncrTransfer(Boolean enableReverseIncrTransfer) {
                this.enableReverseIncrTransfer = enableReverseIncrTransfer;
                return this;
            }

            /**
             * EnableStructTransfer.
             */
            public Builder enableStructTransfer(Boolean enableStructTransfer) {
                this.enableStructTransfer = enableStructTransfer;
                return this;
            }

            /**
             * ExtraInfo.
             */
            public Builder extraInfo(ExtraInfo extraInfo) {
                this.extraInfo = extraInfo;
                return this;
            }

            /**
             * FullTransferConfig.
             */
            public Builder fullTransferConfig(FullTransferConfig fullTransferConfig) {
                this.fullTransferConfig = fullTransferConfig;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtFinish.
             */
            public Builder gmtFinish(String gmtFinish) {
                this.gmtFinish = gmtFinish;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * GmtStart.
             */
            public Builder gmtStart(String gmtStart) {
                this.gmtStart = gmtStart;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Importance.
             */
            public Builder importance(String importance) {
                this.importance = importance;
                return this;
            }

            /**
             * IncrTransferConfig.
             */
            public Builder incrTransferConfig(IncrTransferConfig incrTransferConfig) {
                this.incrTransferConfig = incrTransferConfig;
                return this;
            }

            /**
             * IsMerging.
             */
            public Builder isMerging(Boolean isMerging) {
                this.isMerging = isMerging;
                return this;
            }

            /**
             * IsModifying.
             */
            public Builder isModifying(Boolean isModifying) {
                this.isModifying = isModifying;
                return this;
            }

            /**
             * IsSubProject.
             */
            public Builder isSubProject(Boolean isSubProject) {
                this.isSubProject = isSubProject;
                return this;
            }

            /**
             * Labels.
             */
            public Builder labels(java.util.List<Labels> labels) {
                this.labels = labels;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Owner。</p>
             * 
             * <strong>example:</strong>
             * <p>admin</p>
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * SinkConnectInfo.
             */
            public Builder sinkConnectInfo(SinkConnectInfo sinkConnectInfo) {
                this.sinkConnectInfo = sinkConnectInfo;
                return this;
            }

            /**
             * SinkEndpointType.
             */
            public Builder sinkEndpointType(String sinkEndpointType) {
                this.sinkEndpointType = sinkEndpointType;
                return this;
            }

            /**
             * SourceConnectInfo.
             */
            public Builder sourceConnectInfo(SourceConnectInfo sourceConnectInfo) {
                this.sourceConnectInfo = sourceConnectInfo;
                return this;
            }

            /**
             * SourceEndpointType.
             */
            public Builder sourceEndpointType(String sourceEndpointType) {
                this.sourceEndpointType = sourceEndpointType;
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
             * Steps.
             */
            public Builder steps(java.util.List<Steps> steps) {
                this.steps = steps;
                return this;
            }

            /**
             * StructTransferConfig.
             */
            public Builder structTransferConfig(StructTransferConfig structTransferConfig) {
                this.structTransferConfig = structTransferConfig;
                return this;
            }

            /**
             * TransferMapping.
             */
            public Builder transferMapping(TransferMapping transferMapping) {
                this.transferMapping = transferMapping;
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
             * WorkerGradeId.
             */
            public Builder workerGradeId(String workerGradeId) {
                this.workerGradeId = workerGradeId;
                return this;
            }

            /**
             * WorkerGradeInfo.
             */
            public Builder workerGradeInfo(WorkerGradeInfo workerGradeInfo) {
                this.workerGradeInfo = workerGradeInfo;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListProjectsResponseBody} extends {@link TeaModel}
     *
     * <p>ListProjectsResponseBody</p>
     */
    public static class ErrorDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("ExtraContext")
        private java.util.Map<String, ?> extraContext;

        @com.aliyun.core.annotation.NameInMap("Level")
        private String level;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("MessageMcmsContext")
        private java.util.Map<String, String> messageMcmsContext;

        @com.aliyun.core.annotation.NameInMap("MessageMcmsKey")
        private String messageMcmsKey;

        @com.aliyun.core.annotation.NameInMap("Proposal")
        private String proposal;

        @com.aliyun.core.annotation.NameInMap("ProposalMcmsContext")
        private java.util.Map<String, String> proposalMcmsContext;

        @com.aliyun.core.annotation.NameInMap("ProposalMcmsKey")
        private String proposalMcmsKey;

        @com.aliyun.core.annotation.NameInMap("Reason")
        private String reason;

        @com.aliyun.core.annotation.NameInMap("ReasonMcmsContext")
        private java.util.Map<String, String> reasonMcmsContext;

        @com.aliyun.core.annotation.NameInMap("ReasonMcmsKey")
        private String reasonMcmsKey;

        @com.aliyun.core.annotation.NameInMap("UpstreamErrorDetail")
        private Object upstreamErrorDetail;

        private ErrorDetail(Builder builder) {
            this.code = builder.code;
            this.extraContext = builder.extraContext;
            this.level = builder.level;
            this.message = builder.message;
            this.messageMcmsContext = builder.messageMcmsContext;
            this.messageMcmsKey = builder.messageMcmsKey;
            this.proposal = builder.proposal;
            this.proposalMcmsContext = builder.proposalMcmsContext;
            this.proposalMcmsKey = builder.proposalMcmsKey;
            this.reason = builder.reason;
            this.reasonMcmsContext = builder.reasonMcmsContext;
            this.reasonMcmsKey = builder.reasonMcmsKey;
            this.upstreamErrorDetail = builder.upstreamErrorDetail;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ErrorDetail create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return extraContext
         */
        public java.util.Map<String, ?> getExtraContext() {
            return this.extraContext;
        }

        /**
         * @return level
         */
        public String getLevel() {
            return this.level;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return messageMcmsContext
         */
        public java.util.Map<String, String> getMessageMcmsContext() {
            return this.messageMcmsContext;
        }

        /**
         * @return messageMcmsKey
         */
        public String getMessageMcmsKey() {
            return this.messageMcmsKey;
        }

        /**
         * @return proposal
         */
        public String getProposal() {
            return this.proposal;
        }

        /**
         * @return proposalMcmsContext
         */
        public java.util.Map<String, String> getProposalMcmsContext() {
            return this.proposalMcmsContext;
        }

        /**
         * @return proposalMcmsKey
         */
        public String getProposalMcmsKey() {
            return this.proposalMcmsKey;
        }

        /**
         * @return reason
         */
        public String getReason() {
            return this.reason;
        }

        /**
         * @return reasonMcmsContext
         */
        public java.util.Map<String, String> getReasonMcmsContext() {
            return this.reasonMcmsContext;
        }

        /**
         * @return reasonMcmsKey
         */
        public String getReasonMcmsKey() {
            return this.reasonMcmsKey;
        }

        /**
         * @return upstreamErrorDetail
         */
        public Object getUpstreamErrorDetail() {
            return this.upstreamErrorDetail;
        }

        public static final class Builder {
            private String code; 
            private java.util.Map<String, ?> extraContext; 
            private String level; 
            private String message; 
            private java.util.Map<String, String> messageMcmsContext; 
            private String messageMcmsKey; 
            private String proposal; 
            private java.util.Map<String, String> proposalMcmsContext; 
            private String proposalMcmsKey; 
            private String reason; 
            private java.util.Map<String, String> reasonMcmsContext; 
            private String reasonMcmsKey; 
            private Object upstreamErrorDetail; 

            private Builder() {
            } 

            private Builder(ErrorDetail model) {
                this.code = model.code;
                this.extraContext = model.extraContext;
                this.level = model.level;
                this.message = model.message;
                this.messageMcmsContext = model.messageMcmsContext;
                this.messageMcmsKey = model.messageMcmsKey;
                this.proposal = model.proposal;
                this.proposalMcmsContext = model.proposalMcmsContext;
                this.proposalMcmsKey = model.proposalMcmsKey;
                this.reason = model.reason;
                this.reasonMcmsContext = model.reasonMcmsContext;
                this.reasonMcmsKey = model.reasonMcmsKey;
                this.upstreamErrorDetail = model.upstreamErrorDetail;
            } 

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * ExtraContext.
             */
            public Builder extraContext(java.util.Map<String, ?> extraContext) {
                this.extraContext = extraContext;
                return this;
            }

            /**
             * Level.
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * Message.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * MessageMcmsContext.
             */
            public Builder messageMcmsContext(java.util.Map<String, String> messageMcmsContext) {
                this.messageMcmsContext = messageMcmsContext;
                return this;
            }

            /**
             * MessageMcmsKey.
             */
            public Builder messageMcmsKey(String messageMcmsKey) {
                this.messageMcmsKey = messageMcmsKey;
                return this;
            }

            /**
             * Proposal.
             */
            public Builder proposal(String proposal) {
                this.proposal = proposal;
                return this;
            }

            /**
             * ProposalMcmsContext.
             */
            public Builder proposalMcmsContext(java.util.Map<String, String> proposalMcmsContext) {
                this.proposalMcmsContext = proposalMcmsContext;
                return this;
            }

            /**
             * ProposalMcmsKey.
             */
            public Builder proposalMcmsKey(String proposalMcmsKey) {
                this.proposalMcmsKey = proposalMcmsKey;
                return this;
            }

            /**
             * Reason.
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * ReasonMcmsContext.
             */
            public Builder reasonMcmsContext(java.util.Map<String, String> reasonMcmsContext) {
                this.reasonMcmsContext = reasonMcmsContext;
                return this;
            }

            /**
             * ReasonMcmsKey.
             */
            public Builder reasonMcmsKey(String reasonMcmsKey) {
                this.reasonMcmsKey = reasonMcmsKey;
                return this;
            }

            /**
             * UpstreamErrorDetail.
             */
            public Builder upstreamErrorDetail(Object upstreamErrorDetail) {
                this.upstreamErrorDetail = upstreamErrorDetail;
                return this;
            }

            public ErrorDetail build() {
                return new ErrorDetail(this);
            } 

        } 

    }
}
