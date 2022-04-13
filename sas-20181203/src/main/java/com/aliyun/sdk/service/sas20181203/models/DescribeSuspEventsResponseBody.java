// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSuspEventsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSuspEventsResponseBody</p>
 */
public class DescribeSuspEventsResponseBody extends TeaModel {
    @NameInMap("Count")
    private Integer count;

    @NameInMap("CurrentPage")
    private Integer currentPage;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SuspEvents")
    private java.util.List < SuspEvents> suspEvents;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeSuspEventsResponseBody(Builder builder) {
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

    public static DescribeSuspEventsResponseBody create() {
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
    public java.util.List < SuspEvents> getSuspEvents() {
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
        private java.util.List < SuspEvents> suspEvents; 
        private Integer totalCount; 

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
        public Builder suspEvents(java.util.List < SuspEvents> suspEvents) {
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

        public DescribeSuspEventsResponseBody build() {
            return new DescribeSuspEventsResponseBody(this);
        } 

    } 

    public static class Details extends TeaModel {
        @NameInMap("NameDisplay")
        private String nameDisplay;

        @NameInMap("Type")
        private String type;

        @NameInMap("Value")
        private String value;

        @NameInMap("ValueDisplay")
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
    public static class EventNotes extends TeaModel {
        @NameInMap("Note")
        private String note;

        @NameInMap("NoteId")
        private Long noteId;

        @NameInMap("NoteTime")
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
    public static class TacticItems extends TeaModel {
        @NameInMap("TacticDisplayName")
        private String tacticDisplayName;

        @NameInMap("TacticId")
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
    public static class SuspEvents extends TeaModel {
        @NameInMap("Advanced")
        private Boolean advanced;

        @NameInMap("AlarmEventName")
        private String alarmEventName;

        @NameInMap("AlarmEventNameDisplay")
        private String alarmEventNameDisplay;

        @NameInMap("AlarmEventType")
        private String alarmEventType;

        @NameInMap("AlarmEventTypeDisplay")
        private String alarmEventTypeDisplay;

        @NameInMap("AlarmUniqueInfo")
        private String alarmUniqueInfo;

        @NameInMap("AppName")
        private String appName;

        @NameInMap("AutoBreaking")
        private Boolean autoBreaking;

        @NameInMap("CanBeDealOnLine")
        private Boolean canBeDealOnLine;

        @NameInMap("CanCancelFault")
        private Boolean canCancelFault;

        @NameInMap("ContainHwMode")
        private Boolean containHwMode;

        @NameInMap("ContainerId")
        private String containerId;

        @NameInMap("ContainerImageId")
        private String containerImageId;

        @NameInMap("ContainerImageName")
        private String containerImageName;

        @NameInMap("DataSource")
        private String dataSource;

        @NameInMap("Desc")
        private String desc;

        @NameInMap("Details")
        private java.util.List < Details> details;

        @NameInMap("EventNotes")
        private java.util.List < EventNotes> eventNotes;

        @NameInMap("EventStatus")
        private Integer eventStatus;

        @NameInMap("EventSubType")
        private String eventSubType;

        @NameInMap("HasTraceInfo")
        private Boolean hasTraceInfo;

        @NameInMap("Id")
        private Long id;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("InstanceName")
        private String instanceName;

        @NameInMap("InternetIp")
        private String internetIp;

        @NameInMap("IntranetIp")
        private String intranetIp;

        @NameInMap("K8sClusterId")
        private String k8sClusterId;

        @NameInMap("K8sClusterName")
        private String k8sClusterName;

        @NameInMap("K8sNamespace")
        private String k8sNamespace;

        @NameInMap("K8sNodeId")
        private String k8sNodeId;

        @NameInMap("K8sNodeName")
        private String k8sNodeName;

        @NameInMap("K8sPodName")
        private String k8sPodName;

        @NameInMap("LastTime")
        private String lastTime;

        @NameInMap("LastTimeStamp")
        private Long lastTimeStamp;

        @NameInMap("Level")
        private String level;

        @NameInMap("MaliciousRuleStatus")
        private String maliciousRuleStatus;

        @NameInMap("MarkMisRules")
        private String markMisRules;

        @NameInMap("Name")
        private String name;

        @NameInMap("OccurrenceTime")
        private String occurrenceTime;

        @NameInMap("OccurrenceTimeStamp")
        private Long occurrenceTimeStamp;

        @NameInMap("OperateErrorCode")
        private String operateErrorCode;

        @NameInMap("OperateMsg")
        private String operateMsg;

        @NameInMap("OperateTime")
        private Long operateTime;

        @NameInMap("SaleVersion")
        private String saleVersion;

        @NameInMap("SecurityEventIds")
        private String securityEventIds;

        @NameInMap("Stages")
        private String stages;

        @NameInMap("TacticItems")
        private java.util.List < TacticItems> tacticItems;

        @NameInMap("UniqueInfo")
        private String uniqueInfo;

        @NameInMap("Uuid")
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
            this.containHwMode = builder.containHwMode;
            this.containerId = builder.containerId;
            this.containerImageId = builder.containerImageId;
            this.containerImageName = builder.containerImageName;
            this.dataSource = builder.dataSource;
            this.desc = builder.desc;
            this.details = builder.details;
            this.eventNotes = builder.eventNotes;
            this.eventStatus = builder.eventStatus;
            this.eventSubType = builder.eventSubType;
            this.hasTraceInfo = builder.hasTraceInfo;
            this.id = builder.id;
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
            this.lastTime = builder.lastTime;
            this.lastTimeStamp = builder.lastTimeStamp;
            this.level = builder.level;
            this.maliciousRuleStatus = builder.maliciousRuleStatus;
            this.markMisRules = builder.markMisRules;
            this.name = builder.name;
            this.occurrenceTime = builder.occurrenceTime;
            this.occurrenceTimeStamp = builder.occurrenceTimeStamp;
            this.operateErrorCode = builder.operateErrorCode;
            this.operateMsg = builder.operateMsg;
            this.operateTime = builder.operateTime;
            this.saleVersion = builder.saleVersion;
            this.securityEventIds = builder.securityEventIds;
            this.stages = builder.stages;
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
        public java.util.List < Details> getDetails() {
            return this.details;
        }

        /**
         * @return eventNotes
         */
        public java.util.List < EventNotes> getEventNotes() {
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
         * @return stages
         */
        public String getStages() {
            return this.stages;
        }

        /**
         * @return tacticItems
         */
        public java.util.List < TacticItems> getTacticItems() {
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
            private Boolean containHwMode; 
            private String containerId; 
            private String containerImageId; 
            private String containerImageName; 
            private String dataSource; 
            private String desc; 
            private java.util.List < Details> details; 
            private java.util.List < EventNotes> eventNotes; 
            private Integer eventStatus; 
            private String eventSubType; 
            private Boolean hasTraceInfo; 
            private Long id; 
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
            private String lastTime; 
            private Long lastTimeStamp; 
            private String level; 
            private String maliciousRuleStatus; 
            private String markMisRules; 
            private String name; 
            private String occurrenceTime; 
            private Long occurrenceTimeStamp; 
            private String operateErrorCode; 
            private String operateMsg; 
            private Long operateTime; 
            private String saleVersion; 
            private String securityEventIds; 
            private String stages; 
            private java.util.List < TacticItems> tacticItems; 
            private String uniqueInfo; 
            private String uuid; 

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
            public Builder details(java.util.List < Details> details) {
                this.details = details;
                return this;
            }

            /**
             * EventNotes.
             */
            public Builder eventNotes(java.util.List < EventNotes> eventNotes) {
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
             * Stages.
             */
            public Builder stages(String stages) {
                this.stages = stages;
                return this;
            }

            /**
             * 攻击阶段展示名
             */
            public Builder tacticItems(java.util.List < TacticItems> tacticItems) {
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
}
