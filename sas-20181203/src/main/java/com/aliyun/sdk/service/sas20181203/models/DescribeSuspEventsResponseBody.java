// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSuspEventsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSuspEventsResponseBody</p>
 */
public class DescribeSuspEventsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Count")
    private Integer count;

    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SuspEvents")
    private java.util.List < SuspEvents> suspEvents;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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
         * The number of entries returned on the current page.
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * The page number of the returned page.
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
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
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The information about the alert event.
         */
        public Builder suspEvents(java.util.List < SuspEvents> suspEvents) {
            this.suspEvents = suspEvents;
            return this;
        }

        /**
         * The total number of alert events.
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

            /**
             * The display name of the alert event.
             */
            public Builder nameDisplay(String nameDisplay) {
                this.nameDisplay = nameDisplay;
                return this;
            }

            /**
             * The type of the alert event.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * The path of the alert event.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            /**
             * The display name of the path of the alert event.
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

            /**
             * The note.
             */
            public Builder note(String note) {
                this.note = note;
                return this;
            }

            /**
             * The ID of the note.
             */
            public Builder noteId(Long noteId) {
                this.noteId = noteId;
                return this;
            }

            /**
             * The time when the note was created.
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

            /**
             * The ATT\&CK tactic name.
             */
            public Builder tacticDisplayName(String tacticDisplayName) {
                this.tacticDisplayName = tacticDisplayName;
                return this;
            }

            /**
             * The ATT\&CK stage information.
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
        private java.util.List < Details> details;

        @com.aliyun.core.annotation.NameInMap("DisplaySandboxResult")
        private Boolean displaySandboxResult;

        @com.aliyun.core.annotation.NameInMap("EventNotes")
        private java.util.List < EventNotes> eventNotes;

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
        private java.util.List < String > markList;

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

        @com.aliyun.core.annotation.NameInMap("Stages")
        private String stages;

        @com.aliyun.core.annotation.NameInMap("TacticItems")
        private java.util.List < TacticItems> tacticItems;

        @com.aliyun.core.annotation.NameInMap("UniqueInfo")
        private String uniqueInfo;

        @com.aliyun.core.annotation.NameInMap("Uuid")
        private String uuid;

        @com.aliyun.core.annotation.NameInMap("clusterId")
        private String clusterId;

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
            this.stages = builder.stages;
            this.tacticItems = builder.tacticItems;
            this.uniqueInfo = builder.uniqueInfo;
            this.uuid = builder.uuid;
            this.clusterId = builder.clusterId;
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
         * @return displaySandboxResult
         */
        public Boolean getDisplaySandboxResult() {
            return this.displaySandboxResult;
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
        public java.util.List < String > getMarkList() {
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

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
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
            private Boolean displaySandboxResult; 
            private java.util.List < EventNotes> eventNotes; 
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
            private java.util.List < String > markList; 
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
            private String clusterId; 

            /**
             * Indicates whether the alert event was analyzed offline.
             */
            public Builder advanced(Boolean advanced) {
                this.advanced = advanced;
                return this;
            }

            /**
             * The name of the alert event.
             */
            public Builder alarmEventName(String alarmEventName) {
                this.alarmEventName = alarmEventName;
                return this;
            }

            /**
             * The name of the alert.
             */
            public Builder alarmEventNameDisplay(String alarmEventNameDisplay) {
                this.alarmEventNameDisplay = alarmEventNameDisplay;
                return this;
            }

            /**
             * The type of the alert event.
             */
            public Builder alarmEventType(String alarmEventType) {
                this.alarmEventType = alarmEventType;
                return this;
            }

            /**
             * The display name of the type of the alert event.
             */
            public Builder alarmEventTypeDisplay(String alarmEventTypeDisplay) {
                this.alarmEventTypeDisplay = alarmEventTypeDisplay;
                return this;
            }

            /**
             * The unique ID of the alert event.
             */
            public Builder alarmUniqueInfo(String alarmUniqueInfo) {
                this.alarmUniqueInfo = alarmUniqueInfo;
                return this;
            }

            /**
             * The name of the application to which the alert event belongs.
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * Indicates whether automatic defense is enabled.
             */
            public Builder autoBreaking(Boolean autoBreaking) {
                this.autoBreaking = autoBreaking;
                return this;
            }

            /**
             * Indicates whether you can handle the alert event online, such as quarantining the source file of the malicious process. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder canBeDealOnLine(Boolean canBeDealOnLine) {
                this.canBeDealOnLine = canBeDealOnLine;
                return this;
            }

            /**
             * Indicates whether you can cancel marking the alert event as a false positive. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder canCancelFault(Boolean canCancelFault) {
                this.canCancelFault = canCancelFault;
                return this;
            }

            /**
             * Indicates whether the safeguard mode for major activities is enabled for the server. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder containHwMode(Boolean containHwMode) {
                this.containHwMode = containHwMode;
                return this;
            }

            /**
             * The ID of the container.
             */
            public Builder containerId(String containerId) {
                this.containerId = containerId;
                return this;
            }

            /**
             * The ID of the image to which the container belongs.
             */
            public Builder containerImageId(String containerImageId) {
                this.containerImageId = containerImageId;
                return this;
            }

            /**
             * The name of the image to which the container belongs.
             */
            public Builder containerImageName(String containerImageName) {
                this.containerImageName = containerImageName;
                return this;
            }

            /**
             * The source of data. This parameter can be ignored.
             */
            public Builder dataSource(String dataSource) {
                this.dataSource = dataSource;
                return this;
            }

            /**
             * The impact of the alert event.
             */
            public Builder desc(String desc) {
                this.desc = desc;
                return this;
            }

            /**
             * The details of the alert event.
             */
            public Builder details(java.util.List < Details> details) {
                this.details = details;
                return this;
            }

            /**
             * Indicates whether the alert event can be detected by cloud sandbox. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder displaySandboxResult(Boolean displaySandboxResult) {
                this.displaySandboxResult = displaySandboxResult;
                return this;
            }

            /**
             * The note information about the alert event.
             */
            public Builder eventNotes(java.util.List < EventNotes> eventNotes) {
                this.eventNotes = eventNotes;
                return this;
            }

            /**
             * The status of the alert event. Valid values:
             * <p>
             * 
             * *   **1**: pending handling
             * *   **2**: ignored
             * *   **4**: confirmed
             * *   **8**: marked as a false positive
             * *   **16**: handling
             * *   **32**: handled
             * *   **64**: expired
             */
            public Builder eventStatus(Integer eventStatus) {
                this.eventStatus = eventStatus;
                return this;
            }

            /**
             * The subtype of the alert event.
             */
            public Builder eventSubType(String eventSubType) {
                this.eventSubType = eventSubType;
                return this;
            }

            /**
             * Indicates whether the alert event has tracing information. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder hasTraceInfo(Boolean hasTraceInfo) {
                this.hasTraceInfo = hasTraceInfo;
                return this;
            }

            /**
             * The unique ID of the alert event.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * The UUID of the image.
             */
            public Builder imageUuid(String imageUuid) {
                this.imageUuid = imageUuid;
                return this;
            }

            /**
             * The ID of the affected asset.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The name of the associated instance.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * The public IP address that is associated with instance.
             */
            public Builder internetIp(String internetIp) {
                this.internetIp = internetIp;
                return this;
            }

            /**
             * The private IP address of the associated instance.
             */
            public Builder intranetIp(String intranetIp) {
                this.intranetIp = intranetIp;
                return this;
            }

            /**
             * The ID of the Kubernetes cluster.
             */
            public Builder k8sClusterId(String k8sClusterId) {
                this.k8sClusterId = k8sClusterId;
                return this;
            }

            /**
             * The name of the Kubernetes cluster.
             */
            public Builder k8sClusterName(String k8sClusterName) {
                this.k8sClusterName = k8sClusterName;
                return this;
            }

            /**
             * The namespace of the Kubernetes cluster.
             */
            public Builder k8sNamespace(String k8sNamespace) {
                this.k8sNamespace = k8sNamespace;
                return this;
            }

            /**
             * The ID of the Kubernetes node.
             */
            public Builder k8sNodeId(String k8sNodeId) {
                this.k8sNodeId = k8sNodeId;
                return this;
            }

            /**
             * The name of the Kubernetes node.
             */
            public Builder k8sNodeName(String k8sNodeName) {
                this.k8sNodeName = k8sNodeName;
                return this;
            }

            /**
             * The name of the Kubernetes pod.
             */
            public Builder k8sPodName(String k8sPodName) {
                this.k8sPodName = k8sPodName;
                return this;
            }

            /**
             * Indicates whether the large model analysis tag is supported. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder largeModel(Boolean largeModel) {
                this.largeModel = largeModel;
                return this;
            }

            /**
             * The time when the alert event was last detected.
             */
            public Builder lastTime(String lastTime) {
                this.lastTime = lastTime;
                return this;
            }

            /**
             * The timestamp when the alert event was last detected. Unit: milliseconds.
             */
            public Builder lastTimeStamp(Long lastTimeStamp) {
                this.lastTimeStamp = lastTimeStamp;
                return this;
            }

            /**
             * The severity of the alert event. Valid values:
             * <p>
             * 
             * *   **serious**
             * *   **suspicious**
             * *   **remind**
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * The status of the malicious behavior defense rule. Valid values:
             * <p>
             * 
             * *   **open**
             * *   **close**
             */
            public Builder maliciousRuleStatus(String maliciousRuleStatus) {
                this.maliciousRuleStatus = maliciousRuleStatus;
                return this;
            }

            /**
             * MarkList.
             */
            public Builder markList(java.util.List < String > markList) {
                this.markList = markList;
                return this;
            }

            /**
             * The advanced whitelist rule.
             */
            public Builder markMisRules(String markMisRules) {
                this.markMisRules = markMisRules;
                return this;
            }

            /**
             * The complete name of the alert event.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The time when the alert event was first detected.
             */
            public Builder occurrenceTime(String occurrenceTime) {
                this.occurrenceTime = occurrenceTime;
                return this;
            }

            /**
             * The timestamp when the alert event was first detected. Unit: milliseconds.
             */
            public Builder occurrenceTimeStamp(Long occurrenceTimeStamp) {
                this.occurrenceTimeStamp = occurrenceTimeStamp;
                return this;
            }

            /**
             * The handling result code of the alert event.
             */
            public Builder operateErrorCode(String operateErrorCode) {
                this.operateErrorCode = operateErrorCode;
                return this;
            }

            /**
             * The handing result message of the alert event.
             */
            public Builder operateMsg(String operateMsg) {
                this.operateMsg = operateMsg;
                return this;
            }

            /**
             * The handling timestamp of the alert event. Unit: milliseconds.
             */
            public Builder operateTime(Long operateTime) {
                this.operateTime = operateTime;
                return this;
            }

            /**
             * The edition of Security Center in which the alert event can be detected. Valid values:
             * <p>
             * 
             * *   **0**: Basic edition
             * *   **1**: Enterprise edition
             */
            public Builder saleVersion(String saleVersion) {
                this.saleVersion = saleVersion;
                return this;
            }

            /**
             * The ID of the associated alert event.
             */
            public Builder securityEventIds(String securityEventIds) {
                this.securityEventIds = securityEventIds;
                return this;
            }

            /**
             * The stage at which the attack is detected.
             */
            public Builder stages(String stages) {
                this.stages = stages;
                return this;
            }

            /**
             * The display name of the attack stage.
             */
            public Builder tacticItems(java.util.List < TacticItems> tacticItems) {
                this.tacticItems = tacticItems;
                return this;
            }

            /**
             * The unique key of the alert.
             */
            public Builder uniqueInfo(String uniqueInfo) {
                this.uniqueInfo = uniqueInfo;
                return this;
            }

            /**
             * The unique ID of the associated instance.
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            /**
             * The ID of the cluster.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            public SuspEvents build() {
                return new SuspEvents(this);
            } 

        } 

    }
}
