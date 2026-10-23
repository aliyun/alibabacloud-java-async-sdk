// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csasedr20241122.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder(DescribeSuspEventsResponseBody model) {
            this.count = model.count;
            this.currentPage = model.currentPage;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.suspEvents = model.suspEvents;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The number of entries returned on the current page in a paging query.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * <p>The page number of the current page in a paging query.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The maximum number of entries that can be displayed on each page in a paging query.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>0D6E20E4-8326-1D03-A553-2182BE9E82F9</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The list of endpoint security alert events returned on the current page.</p>
         */
        public Builder suspEvents(java.util.List<SuspEvents> suspEvents) {
            this.suspEvents = suspEvents;
            return this;
        }

        /**
         * <p>The total number of alert events.</p>
         * 
         * <strong>example:</strong>
         * <p>70</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
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
             * <p>The display text of the detail item name, such as ATT&amp;CK attack phase, Process path, or Handling suggestion.</p>
             * 
             * <strong>example:</strong>
             * <p>ATT&amp;CK attack phase</p>
             */
            public Builder nameDisplay(String nameDisplay) {
                this.nameDisplay = nameDisplay;
                return this;
            }

            /**
             * <p>The data display type of the detail item. Valid values:</p>
             * <ul>
             * <li><code>text</code>: Text.</li>
             * <li><code>processChain</code>: Process chain (parent process relationship).</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>text</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The raw value of the detail item. The meaning is determined by Name and Type. For example, the value is the phase name for an attack phase item, and the path for a process path item. When Type is <code>processChain</code>, the value is a process chain data string.</p>
             * 
             * <strong>example:</strong>
             * <p>Code execution</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            /**
             * <p>The display value of the detail item, which may be the same as Value. The specific meaning depends on the detail item and is not strictly fixed as a file path.</p>
             * 
             * <strong>example:</strong>
             * <p>Code execution</p>
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
             * <p>The note content.</p>
             * 
             * <strong>example:</strong>
             * <p>Test</p>
             */
            public Builder note(String note) {
                this.note = note;
                return this;
            }

            /**
             * <p>The ID of the event record.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder noteId(Long noteId) {
                this.noteId = noteId;
                return this;
            }

            /**
             * <p>The time when the event was recorded. The format is YYYY-MM-DD HH:mm:ss.</p>
             * 
             * <strong>example:</strong>
             * <p>2018-09-26 01:51:01</p>
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
             * <p>The display name of the ATT&amp;CK tactic (attack stage).</p>
             * 
             * <strong>example:</strong>
             * <p>Code execution</p>
             */
            public Builder tacticDisplayName(String tacticDisplayName) {
                this.tacticDisplayName = tacticDisplayName;
                return this;
            }

            /**
             * <p>The ID of the ATT&amp;CK tactic (attack stage). For example, <code>TA0002</code> corresponds to Execution.</p>
             * 
             * <strong>example:</strong>
             * <p>TA0002</p>
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

        @com.aliyun.core.annotation.NameInMap("Department")
        private String department;

        @com.aliyun.core.annotation.NameInMap("Desc")
        private String desc;

        @com.aliyun.core.annotation.NameInMap("Details")
        private java.util.List<Details> details;

        @com.aliyun.core.annotation.NameInMap("DevTag")
        private String devTag;

        @com.aliyun.core.annotation.NameInMap("DevType")
        private String devType;

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

        @com.aliyun.core.annotation.NameInMap("HostName")
        private String hostName;

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

        @com.aliyun.core.annotation.NameInMap("Mac")
        private String mac;

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

        @com.aliyun.core.annotation.NameInMap("SrcIp")
        private String srcIp;

        @com.aliyun.core.annotation.NameInMap("Stages")
        private String stages;

        @com.aliyun.core.annotation.NameInMap("TacticItems")
        private java.util.List<TacticItems> tacticItems;

        @com.aliyun.core.annotation.NameInMap("UniqueInfo")
        private String uniqueInfo;

        @com.aliyun.core.annotation.NameInMap("UserName")
        private String userName;

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
            this.department = builder.department;
            this.desc = builder.desc;
            this.details = builder.details;
            this.devTag = builder.devTag;
            this.devType = builder.devType;
            this.displaySandboxResult = builder.displaySandboxResult;
            this.eventNotes = builder.eventNotes;
            this.eventStatus = builder.eventStatus;
            this.eventSubType = builder.eventSubType;
            this.hasTraceInfo = builder.hasTraceInfo;
            this.hostName = builder.hostName;
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
            this.mac = builder.mac;
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
            this.srcIp = builder.srcIp;
            this.stages = builder.stages;
            this.tacticItems = builder.tacticItems;
            this.uniqueInfo = builder.uniqueInfo;
            this.userName = builder.userName;
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
         * @return department
         */
        public String getDepartment() {
            return this.department;
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
         * @return devTag
         */
        public String getDevTag() {
            return this.devTag;
        }

        /**
         * @return devType
         */
        public String getDevType() {
            return this.devType;
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
         * @return hostName
         */
        public String getHostName() {
            return this.hostName;
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
         * @return mac
         */
        public String getMac() {
            return this.mac;
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
         * @return srcIp
         */
        public String getSrcIp() {
            return this.srcIp;
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
         * @return userName
         */
        public String getUserName() {
            return this.userName;
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
            private String department; 
            private String desc; 
            private java.util.List<Details> details; 
            private String devTag; 
            private String devType; 
            private Boolean displaySandboxResult; 
            private java.util.List<EventNotes> eventNotes; 
            private Integer eventStatus; 
            private String eventSubType; 
            private Boolean hasTraceInfo; 
            private String hostName; 
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
            private String mac; 
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
            private String srcIp; 
            private String stages; 
            private java.util.List<TacticItems> tacticItems; 
            private String uniqueInfo; 
            private String userName; 
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
                this.department = model.department;
                this.desc = model.desc;
                this.details = model.details;
                this.devTag = model.devTag;
                this.devType = model.devType;
                this.displaySandboxResult = model.displaySandboxResult;
                this.eventNotes = model.eventNotes;
                this.eventStatus = model.eventStatus;
                this.eventSubType = model.eventSubType;
                this.hasTraceInfo = model.hasTraceInfo;
                this.hostName = model.hostName;
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
                this.mac = model.mac;
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
                this.srcIp = model.srcIp;
                this.stages = model.stages;
                this.tacticItems = model.tacticItems;
                this.uniqueInfo = model.uniqueInfo;
                this.userName = model.userName;
                this.uuid = model.uuid;
            } 

            /**
             * <p>Indicates whether the alert is generated by offline analysis.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder advanced(Boolean advanced) {
                this.advanced = advanced;
                return this;
            }

            /**
             * <p>The internal name or rule name of the alert event. For the user-facing alert name, see AlarmEventNameDisplay.</p>
             * 
             * <strong>example:</strong>
             * <p>SASE non-whitelisted startup interception_PC</p>
             */
            public Builder alarmEventName(String alarmEventName) {
                this.alarmEventName = alarmEventName;
                return this;
            }

            /**
             * <p>The user-facing name of the alert event.</p>
             * 
             * <strong>example:</strong>
             * <p>Untrusted process startup</p>
             */
            public Builder alarmEventNameDisplay(String alarmEventNameDisplay) {
                this.alarmEventNameDisplay = alarmEventNameDisplay;
                return this;
            }

            /**
             * <p>The type of the alert event.</p>
             * 
             * <strong>example:</strong>
             * <p>Precision defense</p>
             */
            public Builder alarmEventType(String alarmEventType) {
                this.alarmEventType = alarmEventType;
                return this;
            }

            /**
             * <p>The user-facing name of the alert type.</p>
             * 
             * <strong>example:</strong>
             * <p>Precision defense</p>
             */
            public Builder alarmEventTypeDisplay(String alarmEventTypeDisplay) {
                this.alarmEventTypeDisplay = alarmEventTypeDisplay;
                return this;
            }

            /**
             * <p>The unique ID of the alert event.</p>
             * 
             * <strong>example:</strong>
             * <p>c37dd8bb7f5d24105f7499abf8fc****</p>
             */
            public Builder alarmUniqueInfo(String alarmUniqueInfo) {
                this.alarmUniqueInfo = alarmUniqueInfo;
                return this;
            }

            /**
             * <p>The name of the application to which the alert event belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>pro-deploy-tibasic</p>
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * <p>The completion status of automatic blocking. Returns true when the alert status is AUTO_DEALING_DONE (513), and returns false for other statuses. This field cannot be used to determine whether automatic defense has occurred. Even if OperateErrorCode is auto_defense.Success, this field may return false.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder autoBreaking(Boolean autoBreaking) {
                this.autoBreaking = autoBreaking;
                return this;
            }

            /**
             * <p>Indicates whether the legacy online scan and kill capability is supported. This operation returns false. This field is not a list of executable operations for the alert. A value of false does not mean that the alert cannot be ignored, added to the whitelist, or marked as manually handled. To query executable operations, call DescribeSecurityEventOperations.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder canBeDealOnLine(Boolean canBeDealOnLine) {
                this.canBeDealOnLine = canBeDealOnLine;
                return this;
            }

            /**
             * <p>Indicates whether the alert is in a state where the false positive mark can be canceled. Returns true when the alert status is FAULT (8), and returns false for other statuses. This status indicator does not replace full capability checks such as feature switches and operation configurations. To query the actual executable operations for canceling the whitelist, call DescribeSecurityEventOperations.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder canCancelFault(Boolean canCancelFault) {
                this.canCancelFault = canCancelFault;
                return this;
            }

            /**
             * <p>The ID of the container cluster. Not supported by SASE-EDR.</p>
             * 
             * <strong>example:</strong>
             * <p>c-45c926ddacXXXXXX</p>
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * <p>Indicates whether the enhanced protection mode is enabled for the server. Not supported by SASE-EDR.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder containHwMode(Boolean containHwMode) {
                this.containHwMode = containHwMode;
                return this;
            }

            /**
             * <p>The ID of the container. Not supported by SASE-EDR.</p>
             * 
             * <strong>example:</strong>
             * <p>container_1648601865161_14925_02_000****</p>
             */
            public Builder containerId(String containerId) {
                this.containerId = containerId;
                return this;
            }

            /**
             * <p>The ID of the container image. Not supported by SASE-EDR.</p>
             * 
             * <strong>example:</strong>
             * <p>sha256:2e5a3b0ae5f452b3cb458789a9a7542ef40035a84318469a8528c5e444db1****</p>
             */
            public Builder containerImageId(String containerImageId) {
                this.containerImageId = containerImageId;
                return this;
            }

            /**
             * <p>The name of the container image. Not supported by SASE-EDR.</p>
             * 
             * <strong>example:</strong>
             * <p>centos7_apache:v1.0.1</p>
             */
            public Builder containerImageName(String containerImageName) {
                this.containerImageName = containerImageName;
                return this;
            }

            /**
             * <p>The identifier of the alert data source. The return example for endpoint alerts is <code>aegis_suspicious_event_pc</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>aegis_suspicious_event_pc</p>
             */
            public Builder dataSource(String dataSource) {
                this.dataSource = dataSource;
                return this;
            }

            /**
             * <p>The name of the department.</p>
             * 
             * <strong>example:</strong>
             * <p>Technology Operations Department</p>
             */
            public Builder department(String department) {
                this.department = department;
                return this;
            }

            /**
             * <p>The summary of the alert event, which describes the detected or blocked behavior.</p>
             * 
             * <strong>example:</strong>
             * <p>Blocked the startup of a non-whitelisted process</p>
             */
            public Builder desc(String desc) {
                this.desc = desc;
                return this;
            }

            /**
             * <p>The list of alert detail items, which may include prompts, attack phases, malicious behaviors, process paths, command lines, handling suggestions, and parent process relationships. The detail items and their quantities may vary for different alerts.</p>
             */
            public Builder details(java.util.List<Details> details) {
                this.details = details;
                return this;
            }

            /**
             * <p><strong>[Deprecated]</strong> This field is deprecated.</p>
             * 
             * <strong>example:</strong>
             * <p>Deprecated field</p>
             */
            public Builder devTag(String devTag) {
                this.devTag = devTag;
                return this;
            }

            /**
             * <p><strong>[Deprecated]</strong> This field is deprecated.</p>
             * 
             * <strong>example:</strong>
             * <p>Deprecated field</p>
             */
            public Builder devType(String devType) {
                this.devType = devType;
                return this;
            }

            /**
             * <p>Indicates whether cloud sandbox detection is supported. Not supported by SASE-EDR.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder displaySandboxResult(Boolean displaySandboxResult) {
                this.displaySandboxResult = displaySandboxResult;
                return this;
            }

            /**
             * <p>The list of notes for the alert event. An empty array <code>[]</code> is returned if there are no notes.</p>
             */
            public Builder eventNotes(java.util.List<EventNotes> eventNotes) {
                this.eventNotes = eventNotes;
                return this;
            }

            /**
             * <p>The handling status of the endpoint alert. Valid values:</p>
             * <ul>
             * <li><code>1</code>: Pending.</li>
             * <li><code>2</code>: Ignored.</li>
             * <li><code>4</code>: Manually handled.</li>
             * <li><code>8</code>: Whitelisted (marked as a false positive).</li>
             * <li><code>32</code>: Handled, such as successful blocking by automatic defense.</li>
             * <li><code>64</code>: Expired.</li>
             * </ul>
             * <p>The system may change the status of an unhandled alert to Expired if more than 31 days have passed since its last occurrence.</p>
             * <p>The actual statuses that appear depend on the alert template and the actual handling results.</p>
             * 
             * <strong>example:</strong>
             * <p>32</p>
             */
            public Builder eventStatus(Integer eventStatus) {
                this.eventStatus = eventStatus;
                return this;
            }

            /**
             * <p>The subtype identifier of the alert event. The value of this field may be the same as AlarmEventName.</p>
             * 
             * <strong>example:</strong>
             * <p>SASE non-whitelisted startup interception_PC</p>
             */
            public Builder eventSubType(String eventSubType) {
                this.eventSubType = eventSubType;
                return this;
            }

            /**
             * <p>Indicates whether the alert event has tracing information. Not supported by SASE-EDR.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder hasTraceInfo(Boolean hasTraceInfo) {
                this.hasTraceInfo = hasTraceInfo;
                return this;
            }

            /**
             * <p>The name of the device.</p>
             * 
             * <strong>example:</strong>
             * <p>FW-NAT-1A-ZZMY</p>
             */
            public Builder hostName(String hostName) {
                this.hostName = hostName;
                return this;
            }

            /**
             * <p>The numeric ID of the alert event.</p>
             * 
             * <strong>example:</strong>
             * <p>123456789</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The UUID of the image. Not supported by SASE-EDR.</p>
             * 
             * <strong>example:</strong>
             * <p>70489fb520cea585ad9761d5a842****</p>
             */
            public Builder imageUuid(String imageUuid) {
                this.imageUuid = imageUuid;
                return this;
            }

            /**
             * <p>The instance identifier of the endpoint or asset affected by the alert event.</p>
             * 
             * <strong>example:</strong>
             * <p>c208107c-3b39-4fc1-bbdb-************</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The instance name of the endpoint or asset affected by the alert event.</p>
             * 
             * <strong>example:</strong>
             * <p>iZ0rqjt4wqw****</p>
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * <p>The public IP address of the associated instance.</p>
             * 
             * <strong>example:</strong>
             * <p>1.2.XX.XX</p>
             */
            public Builder internetIp(String internetIp) {
                this.internetIp = internetIp;
                return this;
            }

            /**
             * <p>The private IP address of the endpoint or asset affected by the alert event.</p>
             * 
             * <strong>example:</strong>
             * <p>172.18.XX.XX</p>
             */
            public Builder intranetIp(String intranetIp) {
                this.intranetIp = intranetIp;
                return this;
            }

            /**
             * <p>The ID of the K8s cluster. Not supported by SASE-EDR.</p>
             * 
             * <strong>example:</strong>
             * <p>c517b37e1401e4961b3951863a49a****</p>
             */
            public Builder k8sClusterId(String k8sClusterId) {
                this.k8sClusterId = k8sClusterId;
                return this;
            }

            /**
             * <p>The name of the K8s cluster. Not supported by SASE-EDR.</p>
             * 
             * <strong>example:</strong>
             * <p>test-daily</p>
             */
            public Builder k8sClusterName(String k8sClusterName) {
                this.k8sClusterName = k8sClusterName;
                return this;
            }

            /**
             * <p>The K8s namespace. Not supported by SASE-EDR.</p>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder k8sNamespace(String k8sNamespace) {
                this.k8sNamespace = k8sNamespace;
                return this;
            }

            /**
             * <p>The ID of the K8s node. Not supported by SASE-EDR.</p>
             * 
             * <strong>example:</strong>
             * <p>i-bp14a1ay8e0aa9t0****</p>
             */
            public Builder k8sNodeId(String k8sNodeId) {
                this.k8sNodeId = k8sNodeId;
                return this;
            }

            /**
             * <p>The name of the K8s node. Not supported by SASE-EDR.</p>
             * 
             * <strong>example:</strong>
             * <p>N/A</p>
             */
            public Builder k8sNodeName(String k8sNodeName) {
                this.k8sNodeName = k8sNodeName;
                return this;
            }

            /**
             * <p>The name of the K8s pod. Not supported by SASE-EDR.</p>
             * 
             * <strong>example:</strong>
             * <p>myapp-pod</p>
             */
            public Builder k8sPodName(String k8sPodName) {
                this.k8sPodName = k8sPodName;
                return this;
            }

            /**
             * <p>Indicates whether large model analysis tags are supported. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: Supported.</li>
             * <li><strong>false</strong>: Not supported.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder largeModel(Boolean largeModel) {
                this.largeModel = largeModel;
                return this;
            }

            /**
             * <p>The last time the alert event occurred. The format is YYYY-MM-DD HH:mm:ss.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-10-19 20:52:13</p>
             */
            public Builder lastTime(String lastTime) {
                this.lastTime = lastTime;
                return this;
            }

            /**
             * <p>The timestamp of the last occurrence, in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1792414333000</p>
             */
            public Builder lastTimeStamp(Long lastTimeStamp) {
                this.lastTimeStamp = lastTimeStamp;
                return this;
            }

            /**
             * <p>The risk level of the alert event. Valid values:</p>
             * <ul>
             * <li><strong>serious</strong>: Urgent.</li>
             * <li><strong>suspicious</strong>: Suspicious.</li>
             * <li><strong>remind</strong>: Reminder.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>serious</p>
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * <p><strong>[Deprecated]</strong> This field is deprecated.</p>
             * 
             * <strong>example:</strong>
             * <p>Deprecated field</p>
             */
            public Builder mac(String mac) {
                this.mac = mac;
                return this;
            }

            /**
             * <p>The status of the malicious behavior defense rule. Valid values:</p>
             * <ul>
             * <li><strong>open</strong>: Enabled.</li>
             * <li><strong>close</strong>: Disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>open</p>
             */
            public Builder maliciousRuleStatus(String maliciousRuleStatus) {
                this.maliciousRuleStatus = maliciousRuleStatus;
                return this;
            }

            /**
             * <p>The collection of tags for the alert event.</p>
             */
            public Builder markList(java.util.List<String> markList) {
                this.markList = markList;
                return this;
            }

            /**
             * <p>The advanced whitelist rules.</p>
             * 
             * <strong>example:</strong>
             * <p><strong>1.</strong>  path  contain  232</p>
             */
            public Builder markMisRules(String markMisRules) {
                this.markMisRules = markMisRules;
                return this;
            }

            /**
             * <p>The full name of the alert event, such as Precise defense - untrusted process startup.</p>
             * 
             * <strong>example:</strong>
             * <p>Precise defense - untrusted process startup</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The time when the alert event first occurred. The format is YYYY-MM-DD HH:mm:ss.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-10-19 14:09:24</p>
             */
            public Builder occurrenceTime(String occurrenceTime) {
                this.occurrenceTime = occurrenceTime;
                return this;
            }

            /**
             * <p>The timestamp of the first occurrence, in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1792390164000</p>
             */
            public Builder occurrenceTimeStamp(Long occurrenceTimeStamp) {
                this.occurrenceTimeStamp = occurrenceTimeStamp;
                return this;
            }

            /**
             * <p>The result code of the alert handling operation, in the format of Operation type.Result code. For example, <code>auto_defense.Success</code> indicates that automatic defense is successful. This field also returns success results and does not only indicate errors.</p>
             * 
             * <strong>example:</strong>
             * <p>auto_defense.Success</p>
             */
            public Builder operateErrorCode(String operateErrorCode) {
                this.operateErrorCode = operateErrorCode;
                return this;
            }

            /**
             * <p>The note for the alert event operation.</p>
             * 
             * <strong>example:</strong>
             * <p>success</p>
             */
            public Builder operateMsg(String operateMsg) {
                this.operateMsg = operateMsg;
                return this;
            }

            /**
             * <p>The timestamp of the alert event operation, in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1792414333000</p>
             */
            public Builder operateTime(Long operateTime) {
                this.operateTime = operateTime;
                return this;
            }

            /**
             * <p>The product edition supported for alert event detection. SASE-EDR is not supported.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder saleVersion(String saleVersion) {
                this.saleVersion = saleVersion;
                return this;
            }

            /**
             * <p>The IDs of the associated alert events, returned as strings.</p>
             * 
             * <strong>example:</strong>
             * <p>123456789</p>
             */
            public Builder securityEventIds(String securityEventIds) {
                this.securityEventIds = securityEventIds;
                return this;
            }

            /**
             * <p>The source IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>10.205.XXX.XXX</p>
             */
            public Builder srcIp(String srcIp) {
                this.srcIp = srcIp;
                return this;
            }

            /**
             * <p>The list of ATT&amp;CK attack stage names, returned as a serialized JSON array string. For example, if the field value is <code>[&quot;Execution&quot;]</code>, parsing it yields a string array.</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;Execution&quot;]</p>
             */
            public Builder stages(String stages) {
                this.stages = stages;
                return this;
            }

            /**
             * <p>The list of ATT&amp;CK attack stage details. Each item contains the stage ID and display name.</p>
             */
            public Builder tacticItems(java.util.List<TacticItems> tacticItems) {
                this.tacticItems = tacticItems;
                return this;
            }

            /**
             * <p>The unique key of the security alert.</p>
             * 
             * <strong>example:</strong>
             * <p>33ead328b4c3c2c6ddb5a6925ec9****</p>
             */
            public Builder uniqueInfo(String uniqueInfo) {
                this.uniqueInfo = uniqueInfo;
                return this;
            }

            /**
             * <p>The username of the endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p>user</p>
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            /**
             * <p>The unique identifier of the endpoint or asset affected by the alert event. For endpoint alerts, the identifier may start with <code>inet-pc-</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>inet-pc-c6641e3e-2646-4688-ac38-************</p>
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
