// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.riskmanagement20260424.models;

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
 * {@link DescribeSuspEventsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSuspEventsResponseBody</p>
 */
public class DescribeSuspEventsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeSuspEventsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSuspEventsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(DescribeSuspEventsResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
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

        public DescribeSuspEventsResponseBody build() {
            return new DescribeSuspEventsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSuspEventsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSuspEventsResponseBody</p>
     */
    public static class Details extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NameDisplay")
        private String nameDisplay;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        @com.aliyun.core.annotation.NameInMap("ValueDisplay")
        private String valueDisplay;

        private Details(Builder builder) {
            this.nameDisplay = builder.nameDisplay;
            this.type = builder.type;
            this.value = builder.value;
            this.valueDisplay = builder.valueDisplay;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Details create() {
            return builder().build();
        }

        /**
         * @return nameDisplay
         */
        public String getNameDisplay() {
            return this.nameDisplay;
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

        /**
         * @return valueDisplay
         */
        public String getValueDisplay() {
            return this.valueDisplay;
        }

        public static final class Builder {
            private String nameDisplay; 
            private String type; 
            private String value; 
            private String valueDisplay; 

            private Builder() {
            } 

            private Builder(Details model) {
                this.nameDisplay = model.nameDisplay;
                this.type = model.type;
                this.value = model.value;
                this.valueDisplay = model.valueDisplay;
            } 

            /**
             * NameDisplay.
             */
            public Builder nameDisplay(String nameDisplay) {
                this.nameDisplay = nameDisplay;
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

            /**
             * ValueDisplay.
             */
            public Builder valueDisplay(String valueDisplay) {
                this.valueDisplay = valueDisplay;
                return this;
            }

            public Details build() {
                return new Details(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSuspEventsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSuspEventsResponseBody</p>
     */
    public static class EventNotes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Note")
        private String note;

        @com.aliyun.core.annotation.NameInMap("NoteId")
        private Long noteId;

        @com.aliyun.core.annotation.NameInMap("NoteTime")
        private String noteTime;

        private EventNotes(Builder builder) {
            this.note = builder.note;
            this.noteId = builder.noteId;
            this.noteTime = builder.noteTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EventNotes create() {
            return builder().build();
        }

        /**
         * @return note
         */
        public String getNote() {
            return this.note;
        }

        /**
         * @return noteId
         */
        public Long getNoteId() {
            return this.noteId;
        }

        /**
         * @return noteTime
         */
        public String getNoteTime() {
            return this.noteTime;
        }

        public static final class Builder {
            private String note; 
            private Long noteId; 
            private String noteTime; 

            private Builder() {
            } 

            private Builder(EventNotes model) {
                this.note = model.note;
                this.noteId = model.noteId;
                this.noteTime = model.noteTime;
            } 

            /**
             * Note.
             */
            public Builder note(String note) {
                this.note = note;
                return this;
            }

            /**
             * NoteId.
             */
            public Builder noteId(Long noteId) {
                this.noteId = noteId;
                return this;
            }

            /**
             * NoteTime.
             */
            public Builder noteTime(String noteTime) {
                this.noteTime = noteTime;
                return this;
            }

            public EventNotes build() {
                return new EventNotes(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSuspEventsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSuspEventsResponseBody</p>
     */
    public static class TacticItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TacticDisplayName")
        private String tacticDisplayName;

        @com.aliyun.core.annotation.NameInMap("TacticId")
        private String tacticId;

        private TacticItems(Builder builder) {
            this.tacticDisplayName = builder.tacticDisplayName;
            this.tacticId = builder.tacticId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TacticItems create() {
            return builder().build();
        }

        /**
         * @return tacticDisplayName
         */
        public String getTacticDisplayName() {
            return this.tacticDisplayName;
        }

        /**
         * @return tacticId
         */
        public String getTacticId() {
            return this.tacticId;
        }

        public static final class Builder {
            private String tacticDisplayName; 
            private String tacticId; 

            private Builder() {
            } 

            private Builder(TacticItems model) {
                this.tacticDisplayName = model.tacticDisplayName;
                this.tacticId = model.tacticId;
            } 

            /**
             * TacticDisplayName.
             */
            public Builder tacticDisplayName(String tacticDisplayName) {
                this.tacticDisplayName = tacticDisplayName;
                return this;
            }

            /**
             * TacticId.
             */
            public Builder tacticId(String tacticId) {
                this.tacticId = tacticId;
                return this;
            }

            public TacticItems build() {
                return new TacticItems(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSuspEventsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSuspEventsResponseBody</p>
     */
    public static class SuspEvents extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Advanced")
        private Boolean advanced;

        @com.aliyun.core.annotation.NameInMap("AlarmEventName")
        private String alarmEventName;

        @com.aliyun.core.annotation.NameInMap("AlarmEventNameDisplay")
        private String alarmEventNameDisplay;

        @com.aliyun.core.annotation.NameInMap("AlarmEventType")
        private String alarmEventType;

        @com.aliyun.core.annotation.NameInMap("AlarmEventTypeDisplay")
        private String alarmEventTypeDisplay;

        @com.aliyun.core.annotation.NameInMap("AlarmUniqueInfo")
        private String alarmUniqueInfo;

        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("AutoBreaking")
        private Boolean autoBreaking;

        @com.aliyun.core.annotation.NameInMap("CanBeDealOnLine")
        private Boolean canBeDealOnLine;

        @com.aliyun.core.annotation.NameInMap("CanCancelFault")
        private Boolean canCancelFault;

        @com.aliyun.core.annotation.NameInMap("ClusterId")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("ContainHwMode")
        private Boolean containHwMode;

        @com.aliyun.core.annotation.NameInMap("ContainerId")
        private String containerId;

        @com.aliyun.core.annotation.NameInMap("ContainerImageId")
        private String containerImageId;

        @com.aliyun.core.annotation.NameInMap("ContainerImageName")
        private String containerImageName;

        @com.aliyun.core.annotation.NameInMap("DataSource")
        private String dataSource;

        @com.aliyun.core.annotation.NameInMap("Desc")
        private String desc;

        @com.aliyun.core.annotation.NameInMap("Details")
        private java.util.List<Details> details;

        @com.aliyun.core.annotation.NameInMap("DetectSource")
        private String detectSource;

        @com.aliyun.core.annotation.NameInMap("DisplaySandboxResult")
        private Boolean displaySandboxResult;

        @com.aliyun.core.annotation.NameInMap("EventNotes")
        private java.util.List<EventNotes> eventNotes;

        @com.aliyun.core.annotation.NameInMap("EventStatus")
        private Integer eventStatus;

        @com.aliyun.core.annotation.NameInMap("EventSubType")
        private String eventSubType;

        @com.aliyun.core.annotation.NameInMap("HasTraceInfo")
        private Boolean hasTraceInfo;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("ImageUuid")
        private String imageUuid;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("InternetIp")
        private String internetIp;

        @com.aliyun.core.annotation.NameInMap("IntranetIp")
        private String intranetIp;

        @com.aliyun.core.annotation.NameInMap("K8sClusterId")
        private String k8sClusterId;

        @com.aliyun.core.annotation.NameInMap("K8sClusterName")
        private String k8sClusterName;

        @com.aliyun.core.annotation.NameInMap("K8sNamespace")
        private String k8sNamespace;

        @com.aliyun.core.annotation.NameInMap("K8sNodeId")
        private String k8sNodeId;

        @com.aliyun.core.annotation.NameInMap("K8sNodeName")
        private String k8sNodeName;

        @com.aliyun.core.annotation.NameInMap("K8sPodName")
        private String k8sPodName;

        @com.aliyun.core.annotation.NameInMap("LargeModel")
        private Boolean largeModel;

        @com.aliyun.core.annotation.NameInMap("LastTime")
        private String lastTime;

        @com.aliyun.core.annotation.NameInMap("LastTimeStamp")
        private Long lastTimeStamp;

        @com.aliyun.core.annotation.NameInMap("Level")
        private String level;

        @com.aliyun.core.annotation.NameInMap("MaliciousRuleStatus")
        private String maliciousRuleStatus;

        @com.aliyun.core.annotation.NameInMap("MarkList")
        private java.util.List<String> markList;

        @com.aliyun.core.annotation.NameInMap("MarkMisRules")
        private String markMisRules;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("OccurrenceTime")
        private String occurrenceTime;

        @com.aliyun.core.annotation.NameInMap("OccurrenceTimeStamp")
        private Long occurrenceTimeStamp;

        @com.aliyun.core.annotation.NameInMap("OperateErrorCode")
        private String operateErrorCode;

        @com.aliyun.core.annotation.NameInMap("OperateMsg")
        private String operateMsg;

        @com.aliyun.core.annotation.NameInMap("OperateTime")
        private Long operateTime;

        @com.aliyun.core.annotation.NameInMap("SaleVersion")
        private String saleVersion;

        @com.aliyun.core.annotation.NameInMap("SecurityEventIds")
        private String securityEventIds;

        @com.aliyun.core.annotation.NameInMap("SourceAliUid")
        private Long sourceAliUid;

        @com.aliyun.core.annotation.NameInMap("Stages")
        private String stages;

        @com.aliyun.core.annotation.NameInMap("SupportOperateCode")
        private String supportOperateCode;

        @com.aliyun.core.annotation.NameInMap("TacticItems")
        private java.util.List<TacticItems> tacticItems;

        @com.aliyun.core.annotation.NameInMap("UniqueInfo")
        private String uniqueInfo;

        @com.aliyun.core.annotation.NameInMap("Uuid")
        private String uuid;

        private SuspEvents(Builder builder) {
            this.advanced = builder.advanced;
            this.alarmEventName = builder.alarmEventName;
            this.alarmEventNameDisplay = builder.alarmEventNameDisplay;
            this.alarmEventType = builder.alarmEventType;
            this.alarmEventTypeDisplay = builder.alarmEventTypeDisplay;
            this.alarmUniqueInfo = builder.alarmUniqueInfo;
            this.appName = builder.appName;
            this.autoBreaking = builder.autoBreaking;
            this.canBeDealOnLine = builder.canBeDealOnLine;
            this.canCancelFault = builder.canCancelFault;
            this.clusterId = builder.clusterId;
            this.containHwMode = builder.containHwMode;
            this.containerId = builder.containerId;
            this.containerImageId = builder.containerImageId;
            this.containerImageName = builder.containerImageName;
            this.dataSource = builder.dataSource;
            this.desc = builder.desc;
            this.details = builder.details;
            this.detectSource = builder.detectSource;
            this.displaySandboxResult = builder.displaySandboxResult;
            this.eventNotes = builder.eventNotes;
            this.eventStatus = builder.eventStatus;
            this.eventSubType = builder.eventSubType;
            this.hasTraceInfo = builder.hasTraceInfo;
            this.id = builder.id;
            this.imageUuid = builder.imageUuid;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.internetIp = builder.internetIp;
            this.intranetIp = builder.intranetIp;
            this.k8sClusterId = builder.k8sClusterId;
            this.k8sClusterName = builder.k8sClusterName;
            this.k8sNamespace = builder.k8sNamespace;
            this.k8sNodeId = builder.k8sNodeId;
            this.k8sNodeName = builder.k8sNodeName;
            this.k8sPodName = builder.k8sPodName;
            this.largeModel = builder.largeModel;
            this.lastTime = builder.lastTime;
            this.lastTimeStamp = builder.lastTimeStamp;
            this.level = builder.level;
            this.maliciousRuleStatus = builder.maliciousRuleStatus;
            this.markList = builder.markList;
            this.markMisRules = builder.markMisRules;
            this.name = builder.name;
            this.occurrenceTime = builder.occurrenceTime;
            this.occurrenceTimeStamp = builder.occurrenceTimeStamp;
            this.operateErrorCode = builder.operateErrorCode;
            this.operateMsg = builder.operateMsg;
            this.operateTime = builder.operateTime;
            this.saleVersion = builder.saleVersion;
            this.securityEventIds = builder.securityEventIds;
            this.sourceAliUid = builder.sourceAliUid;
            this.stages = builder.stages;
            this.supportOperateCode = builder.supportOperateCode;
            this.tacticItems = builder.tacticItems;
            this.uniqueInfo = builder.uniqueInfo;
            this.uuid = builder.uuid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SuspEvents create() {
            return builder().build();
        }

        /**
         * @return advanced
         */
        public Boolean getAdvanced() {
            return this.advanced;
        }

        /**
         * @return alarmEventName
         */
        public String getAlarmEventName() {
            return this.alarmEventName;
        }

        /**
         * @return alarmEventNameDisplay
         */
        public String getAlarmEventNameDisplay() {
            return this.alarmEventNameDisplay;
        }

        /**
         * @return alarmEventType
         */
        public String getAlarmEventType() {
            return this.alarmEventType;
        }

        /**
         * @return alarmEventTypeDisplay
         */
        public String getAlarmEventTypeDisplay() {
            return this.alarmEventTypeDisplay;
        }

        /**
         * @return alarmUniqueInfo
         */
        public String getAlarmUniqueInfo() {
            return this.alarmUniqueInfo;
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return autoBreaking
         */
        public Boolean getAutoBreaking() {
            return this.autoBreaking;
        }

        /**
         * @return canBeDealOnLine
         */
        public Boolean getCanBeDealOnLine() {
            return this.canBeDealOnLine;
        }

        /**
         * @return canCancelFault
         */
        public Boolean getCanCancelFault() {
            return this.canCancelFault;
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return containHwMode
         */
        public Boolean getContainHwMode() {
            return this.containHwMode;
        }

        /**
         * @return containerId
         */
        public String getContainerId() {
            return this.containerId;
        }

        /**
         * @return containerImageId
         */
        public String getContainerImageId() {
            return this.containerImageId;
        }

        /**
         * @return containerImageName
         */
        public String getContainerImageName() {
            return this.containerImageName;
        }

        /**
         * @return dataSource
         */
        public String getDataSource() {
            return this.dataSource;
        }

        /**
         * @return desc
         */
        public String getDesc() {
            return this.desc;
        }

        /**
         * @return details
         */
        public java.util.List<Details> getDetails() {
            return this.details;
        }

        /**
         * @return detectSource
         */
        public String getDetectSource() {
            return this.detectSource;
        }

        /**
         * @return displaySandboxResult
         */
        public Boolean getDisplaySandboxResult() {
            return this.displaySandboxResult;
        }

        /**
         * @return eventNotes
         */
        public java.util.List<EventNotes> getEventNotes() {
            return this.eventNotes;
        }

        /**
         * @return eventStatus
         */
        public Integer getEventStatus() {
            return this.eventStatus;
        }

        /**
         * @return eventSubType
         */
        public String getEventSubType() {
            return this.eventSubType;
        }

        /**
         * @return hasTraceInfo
         */
        public Boolean getHasTraceInfo() {
            return this.hasTraceInfo;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return imageUuid
         */
        public String getImageUuid() {
            return this.imageUuid;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return internetIp
         */
        public String getInternetIp() {
            return this.internetIp;
        }

        /**
         * @return intranetIp
         */
        public String getIntranetIp() {
            return this.intranetIp;
        }

        /**
         * @return k8sClusterId
         */
        public String getK8sClusterId() {
            return this.k8sClusterId;
        }

        /**
         * @return k8sClusterName
         */
        public String getK8sClusterName() {
            return this.k8sClusterName;
        }

        /**
         * @return k8sNamespace
         */
        public String getK8sNamespace() {
            return this.k8sNamespace;
        }

        /**
         * @return k8sNodeId
         */
        public String getK8sNodeId() {
            return this.k8sNodeId;
        }

        /**
         * @return k8sNodeName
         */
        public String getK8sNodeName() {
            return this.k8sNodeName;
        }

        /**
         * @return k8sPodName
         */
        public String getK8sPodName() {
            return this.k8sPodName;
        }

        /**
         * @return largeModel
         */
        public Boolean getLargeModel() {
            return this.largeModel;
        }

        /**
         * @return lastTime
         */
        public String getLastTime() {
            return this.lastTime;
        }

        /**
         * @return lastTimeStamp
         */
        public Long getLastTimeStamp() {
            return this.lastTimeStamp;
        }

        /**
         * @return level
         */
        public String getLevel() {
            return this.level;
        }

        /**
         * @return maliciousRuleStatus
         */
        public String getMaliciousRuleStatus() {
            return this.maliciousRuleStatus;
        }

        /**
         * @return markList
         */
        public java.util.List<String> getMarkList() {
            return this.markList;
        }

        /**
         * @return markMisRules
         */
        public String getMarkMisRules() {
            return this.markMisRules;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return occurrenceTime
         */
        public String getOccurrenceTime() {
            return this.occurrenceTime;
        }

        /**
         * @return occurrenceTimeStamp
         */
        public Long getOccurrenceTimeStamp() {
            return this.occurrenceTimeStamp;
        }

        /**
         * @return operateErrorCode
         */
        public String getOperateErrorCode() {
            return this.operateErrorCode;
        }

        /**
         * @return operateMsg
         */
        public String getOperateMsg() {
            return this.operateMsg;
        }

        /**
         * @return operateTime
         */
        public Long getOperateTime() {
            return this.operateTime;
        }

        /**
         * @return saleVersion
         */
        public String getSaleVersion() {
            return this.saleVersion;
        }

        /**
         * @return securityEventIds
         */
        public String getSecurityEventIds() {
            return this.securityEventIds;
        }

        /**
         * @return sourceAliUid
         */
        public Long getSourceAliUid() {
            return this.sourceAliUid;
        }

        /**
         * @return stages
         */
        public String getStages() {
            return this.stages;
        }

        /**
         * @return supportOperateCode
         */
        public String getSupportOperateCode() {
            return this.supportOperateCode;
        }

        /**
         * @return tacticItems
         */
        public java.util.List<TacticItems> getTacticItems() {
            return this.tacticItems;
        }

        /**
         * @return uniqueInfo
         */
        public String getUniqueInfo() {
            return this.uniqueInfo;
        }

        /**
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        public static final class Builder {
            private Boolean advanced; 
            private String alarmEventName; 
            private String alarmEventNameDisplay; 
            private String alarmEventType; 
            private String alarmEventTypeDisplay; 
            private String alarmUniqueInfo; 
            private String appName; 
            private Boolean autoBreaking; 
            private Boolean canBeDealOnLine; 
            private Boolean canCancelFault; 
            private String clusterId; 
            private Boolean containHwMode; 
            private String containerId; 
            private String containerImageId; 
            private String containerImageName; 
            private String dataSource; 
            private String desc; 
            private java.util.List<Details> details; 
            private String detectSource; 
            private Boolean displaySandboxResult; 
            private java.util.List<EventNotes> eventNotes; 
            private Integer eventStatus; 
            private String eventSubType; 
            private Boolean hasTraceInfo; 
            private Long id; 
            private String imageUuid; 
            private String instanceId; 
            private String instanceName; 
            private String internetIp; 
            private String intranetIp; 
            private String k8sClusterId; 
            private String k8sClusterName; 
            private String k8sNamespace; 
            private String k8sNodeId; 
            private String k8sNodeName; 
            private String k8sPodName; 
            private Boolean largeModel; 
            private String lastTime; 
            private Long lastTimeStamp; 
            private String level; 
            private String maliciousRuleStatus; 
            private java.util.List<String> markList; 
            private String markMisRules; 
            private String name; 
            private String occurrenceTime; 
            private Long occurrenceTimeStamp; 
            private String operateErrorCode; 
            private String operateMsg; 
            private Long operateTime; 
            private String saleVersion; 
            private String securityEventIds; 
            private Long sourceAliUid; 
            private String stages; 
            private String supportOperateCode; 
            private java.util.List<TacticItems> tacticItems; 
            private String uniqueInfo; 
            private String uuid; 

            private Builder() {
            } 

            private Builder(SuspEvents model) {
                this.advanced = model.advanced;
                this.alarmEventName = model.alarmEventName;
                this.alarmEventNameDisplay = model.alarmEventNameDisplay;
                this.alarmEventType = model.alarmEventType;
                this.alarmEventTypeDisplay = model.alarmEventTypeDisplay;
                this.alarmUniqueInfo = model.alarmUniqueInfo;
                this.appName = model.appName;
                this.autoBreaking = model.autoBreaking;
                this.canBeDealOnLine = model.canBeDealOnLine;
                this.canCancelFault = model.canCancelFault;
                this.clusterId = model.clusterId;
                this.containHwMode = model.containHwMode;
                this.containerId = model.containerId;
                this.containerImageId = model.containerImageId;
                this.containerImageName = model.containerImageName;
                this.dataSource = model.dataSource;
                this.desc = model.desc;
                this.details = model.details;
                this.detectSource = model.detectSource;
                this.displaySandboxResult = model.displaySandboxResult;
                this.eventNotes = model.eventNotes;
                this.eventStatus = model.eventStatus;
                this.eventSubType = model.eventSubType;
                this.hasTraceInfo = model.hasTraceInfo;
                this.id = model.id;
                this.imageUuid = model.imageUuid;
                this.instanceId = model.instanceId;
                this.instanceName = model.instanceName;
                this.internetIp = model.internetIp;
                this.intranetIp = model.intranetIp;
                this.k8sClusterId = model.k8sClusterId;
                this.k8sClusterName = model.k8sClusterName;
                this.k8sNamespace = model.k8sNamespace;
                this.k8sNodeId = model.k8sNodeId;
                this.k8sNodeName = model.k8sNodeName;
                this.k8sPodName = model.k8sPodName;
                this.largeModel = model.largeModel;
                this.lastTime = model.lastTime;
                this.lastTimeStamp = model.lastTimeStamp;
                this.level = model.level;
                this.maliciousRuleStatus = model.maliciousRuleStatus;
                this.markList = model.markList;
                this.markMisRules = model.markMisRules;
                this.name = model.name;
                this.occurrenceTime = model.occurrenceTime;
                this.occurrenceTimeStamp = model.occurrenceTimeStamp;
                this.operateErrorCode = model.operateErrorCode;
                this.operateMsg = model.operateMsg;
                this.operateTime = model.operateTime;
                this.saleVersion = model.saleVersion;
                this.securityEventIds = model.securityEventIds;
                this.sourceAliUid = model.sourceAliUid;
                this.stages = model.stages;
                this.supportOperateCode = model.supportOperateCode;
                this.tacticItems = model.tacticItems;
                this.uniqueInfo = model.uniqueInfo;
                this.uuid = model.uuid;
            } 

            /**
             * Advanced.
             */
            public Builder advanced(Boolean advanced) {
                this.advanced = advanced;
                return this;
            }

            /**
             * AlarmEventName.
             */
            public Builder alarmEventName(String alarmEventName) {
                this.alarmEventName = alarmEventName;
                return this;
            }

            /**
             * AlarmEventNameDisplay.
             */
            public Builder alarmEventNameDisplay(String alarmEventNameDisplay) {
                this.alarmEventNameDisplay = alarmEventNameDisplay;
                return this;
            }

            /**
             * AlarmEventType.
             */
            public Builder alarmEventType(String alarmEventType) {
                this.alarmEventType = alarmEventType;
                return this;
            }

            /**
             * AlarmEventTypeDisplay.
             */
            public Builder alarmEventTypeDisplay(String alarmEventTypeDisplay) {
                this.alarmEventTypeDisplay = alarmEventTypeDisplay;
                return this;
            }

            /**
             * AlarmUniqueInfo.
             */
            public Builder alarmUniqueInfo(String alarmUniqueInfo) {
                this.alarmUniqueInfo = alarmUniqueInfo;
                return this;
            }

            /**
             * AppName.
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * AutoBreaking.
             */
            public Builder autoBreaking(Boolean autoBreaking) {
                this.autoBreaking = autoBreaking;
                return this;
            }

            /**
             * CanBeDealOnLine.
             */
            public Builder canBeDealOnLine(Boolean canBeDealOnLine) {
                this.canBeDealOnLine = canBeDealOnLine;
                return this;
            }

            /**
             * CanCancelFault.
             */
            public Builder canCancelFault(Boolean canCancelFault) {
                this.canCancelFault = canCancelFault;
                return this;
            }

            /**
             * ClusterId.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * ContainHwMode.
             */
            public Builder containHwMode(Boolean containHwMode) {
                this.containHwMode = containHwMode;
                return this;
            }

            /**
             * ContainerId.
             */
            public Builder containerId(String containerId) {
                this.containerId = containerId;
                return this;
            }

            /**
             * ContainerImageId.
             */
            public Builder containerImageId(String containerImageId) {
                this.containerImageId = containerImageId;
                return this;
            }

            /**
             * ContainerImageName.
             */
            public Builder containerImageName(String containerImageName) {
                this.containerImageName = containerImageName;
                return this;
            }

            /**
             * DataSource.
             */
            public Builder dataSource(String dataSource) {
                this.dataSource = dataSource;
                return this;
            }

            /**
             * Desc.
             */
            public Builder desc(String desc) {
                this.desc = desc;
                return this;
            }

            /**
             * Details.
             */
            public Builder details(java.util.List<Details> details) {
                this.details = details;
                return this;
            }

            /**
             * DetectSource.
             */
            public Builder detectSource(String detectSource) {
                this.detectSource = detectSource;
                return this;
            }

            /**
             * DisplaySandboxResult.
             */
            public Builder displaySandboxResult(Boolean displaySandboxResult) {
                this.displaySandboxResult = displaySandboxResult;
                return this;
            }

            /**
             * EventNotes.
             */
            public Builder eventNotes(java.util.List<EventNotes> eventNotes) {
                this.eventNotes = eventNotes;
                return this;
            }

            /**
             * EventStatus.
             */
            public Builder eventStatus(Integer eventStatus) {
                this.eventStatus = eventStatus;
                return this;
            }

            /**
             * EventSubType.
             */
            public Builder eventSubType(String eventSubType) {
                this.eventSubType = eventSubType;
                return this;
            }

            /**
             * HasTraceInfo.
             */
            public Builder hasTraceInfo(Boolean hasTraceInfo) {
                this.hasTraceInfo = hasTraceInfo;
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
             * ImageUuid.
             */
            public Builder imageUuid(String imageUuid) {
                this.imageUuid = imageUuid;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * InstanceName.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * InternetIp.
             */
            public Builder internetIp(String internetIp) {
                this.internetIp = internetIp;
                return this;
            }

            /**
             * IntranetIp.
             */
            public Builder intranetIp(String intranetIp) {
                this.intranetIp = intranetIp;
                return this;
            }

            /**
             * K8sClusterId.
             */
            public Builder k8sClusterId(String k8sClusterId) {
                this.k8sClusterId = k8sClusterId;
                return this;
            }

            /**
             * K8sClusterName.
             */
            public Builder k8sClusterName(String k8sClusterName) {
                this.k8sClusterName = k8sClusterName;
                return this;
            }

            /**
             * K8sNamespace.
             */
            public Builder k8sNamespace(String k8sNamespace) {
                this.k8sNamespace = k8sNamespace;
                return this;
            }

            /**
             * K8sNodeId.
             */
            public Builder k8sNodeId(String k8sNodeId) {
                this.k8sNodeId = k8sNodeId;
                return this;
            }

            /**
             * K8sNodeName.
             */
            public Builder k8sNodeName(String k8sNodeName) {
                this.k8sNodeName = k8sNodeName;
                return this;
            }

            /**
             * K8sPodName.
             */
            public Builder k8sPodName(String k8sPodName) {
                this.k8sPodName = k8sPodName;
                return this;
            }

            /**
             * LargeModel.
             */
            public Builder largeModel(Boolean largeModel) {
                this.largeModel = largeModel;
                return this;
            }

            /**
             * LastTime.
             */
            public Builder lastTime(String lastTime) {
                this.lastTime = lastTime;
                return this;
            }

            /**
             * LastTimeStamp.
             */
            public Builder lastTimeStamp(Long lastTimeStamp) {
                this.lastTimeStamp = lastTimeStamp;
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
             * MaliciousRuleStatus.
             */
            public Builder maliciousRuleStatus(String maliciousRuleStatus) {
                this.maliciousRuleStatus = maliciousRuleStatus;
                return this;
            }

            /**
             * MarkList.
             */
            public Builder markList(java.util.List<String> markList) {
                this.markList = markList;
                return this;
            }

            /**
             * MarkMisRules.
             */
            public Builder markMisRules(String markMisRules) {
                this.markMisRules = markMisRules;
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
             * OccurrenceTime.
             */
            public Builder occurrenceTime(String occurrenceTime) {
                this.occurrenceTime = occurrenceTime;
                return this;
            }

            /**
             * OccurrenceTimeStamp.
             */
            public Builder occurrenceTimeStamp(Long occurrenceTimeStamp) {
                this.occurrenceTimeStamp = occurrenceTimeStamp;
                return this;
            }

            /**
             * OperateErrorCode.
             */
            public Builder operateErrorCode(String operateErrorCode) {
                this.operateErrorCode = operateErrorCode;
                return this;
            }

            /**
             * OperateMsg.
             */
            public Builder operateMsg(String operateMsg) {
                this.operateMsg = operateMsg;
                return this;
            }

            /**
             * OperateTime.
             */
            public Builder operateTime(Long operateTime) {
                this.operateTime = operateTime;
                return this;
            }

            /**
             * SaleVersion.
             */
            public Builder saleVersion(String saleVersion) {
                this.saleVersion = saleVersion;
                return this;
            }

            /**
             * SecurityEventIds.
             */
            public Builder securityEventIds(String securityEventIds) {
                this.securityEventIds = securityEventIds;
                return this;
            }

            /**
             * SourceAliUid.
             */
            public Builder sourceAliUid(Long sourceAliUid) {
                this.sourceAliUid = sourceAliUid;
                return this;
            }

            /**
             * Stages.
             */
            public Builder stages(String stages) {
                this.stages = stages;
                return this;
            }

            /**
             * SupportOperateCode.
             */
            public Builder supportOperateCode(String supportOperateCode) {
                this.supportOperateCode = supportOperateCode;
                return this;
            }

            /**
             * TacticItems.
             */
            public Builder tacticItems(java.util.List<TacticItems> tacticItems) {
                this.tacticItems = tacticItems;
                return this;
            }

            /**
             * UniqueInfo.
             */
            public Builder uniqueInfo(String uniqueInfo) {
                this.uniqueInfo = uniqueInfo;
                return this;
            }

            /**
             * Uuid.
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            public SuspEvents build() {
                return new SuspEvents(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSuspEventsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSuspEventsResponseBody</p>
     */
    public static class DataBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("CurrentPage")
        private Integer currentPage;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("RequestId")
        private String requestId;

        @com.aliyun.core.annotation.NameInMap("SuspEvents")
        private java.util.List<SuspEvents> suspEvents;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private DataBody(Builder builder) {
            this.count = builder.count;
            this.currentPage = builder.currentPage;
            this.pageSize = builder.pageSize;
            this.requestId = builder.requestId;
            this.suspEvents = builder.suspEvents;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataBody create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return currentPage
         */
        public Integer getCurrentPage() {
            return this.currentPage;
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
         * @return suspEvents
         */
        public java.util.List<SuspEvents> getSuspEvents() {
            return this.suspEvents;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Integer count; 
            private Integer currentPage; 
            private Integer pageSize; 
            private String requestId; 
            private java.util.List<SuspEvents> suspEvents; 
            private Integer totalCount; 

            private Builder() {
            } 

            private Builder(DataBody model) {
                this.count = model.count;
                this.currentPage = model.currentPage;
                this.pageSize = model.pageSize;
                this.requestId = model.requestId;
                this.suspEvents = model.suspEvents;
                this.totalCount = model.totalCount;
            } 

            /**
             * Count.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * CurrentPage.
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
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
             * SuspEvents.
             */
            public Builder suspEvents(java.util.List<SuspEvents> suspEvents) {
                this.suspEvents = suspEvents;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public DataBody build() {
                return new DataBody(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSuspEventsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSuspEventsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Body")
        private DataBody body;

        private Data(Builder builder) {
            this.body = builder.body;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return body
         */
        public DataBody getBody() {
            return this.body;
        }

        public static final class Builder {
            private DataBody body; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.body = model.body;
            } 

            /**
             * Body.
             */
            public Builder body(DataBody body) {
                this.body = body;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
