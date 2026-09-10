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
 * {@link ListVirusScanMachineEventResponseBody} extends {@link TeaModel}
 *
 * <p>ListVirusScanMachineEventResponseBody</p>
 */
public class ListVirusScanMachineEventResponseBody extends TeaModel {
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

    private ListVirusScanMachineEventResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListVirusScanMachineEventResponseBody create() {
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

        private Builder(ListVirusScanMachineEventResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>code</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The message information.</p>
         * 
         * <strong>example:</strong>
         * <p>successful‌</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>F0AD8096-E7A2-573D-ACF0-7CE9050CDE38</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call was successful. Valid values:</p>
         * <ul>
         * <li>true: The call was successful.</li>
         * <li>false: The call failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListVirusScanMachineEventResponseBody build() {
            return new ListVirusScanMachineEventResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListVirusScanMachineEventResponseBody} extends {@link TeaModel}
     *
     * <p>ListVirusScanMachineEventResponseBody</p>
     */
    public static class VirusScanLatestTaskStatistic extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CompleteMachine")
        private Integer completeMachine;

        @com.aliyun.core.annotation.NameInMap("MachineName")
        private String machineName;

        @com.aliyun.core.annotation.NameInMap("Progress")
        private String progress;

        @com.aliyun.core.annotation.NameInMap("RiskLevel")
        private String riskLevel;

        @com.aliyun.core.annotation.NameInMap("SafeMachine")
        private Integer safeMachine;

        @com.aliyun.core.annotation.NameInMap("ScanMachine")
        private Integer scanMachine;

        @com.aliyun.core.annotation.NameInMap("ScanPath")
        private java.util.List<String> scanPath;

        @com.aliyun.core.annotation.NameInMap("ScanTime")
        private Long scanTime;

        @com.aliyun.core.annotation.NameInMap("ScanType")
        private String scanType;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("SuspiciousCount")
        private Integer suspiciousCount;

        @com.aliyun.core.annotation.NameInMap("SuspiciousMachine")
        private Integer suspiciousMachine;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("UnCompleteMachine")
        private Integer unCompleteMachine;

        private VirusScanLatestTaskStatistic(Builder builder) {
            this.completeMachine = builder.completeMachine;
            this.machineName = builder.machineName;
            this.progress = builder.progress;
            this.riskLevel = builder.riskLevel;
            this.safeMachine = builder.safeMachine;
            this.scanMachine = builder.scanMachine;
            this.scanPath = builder.scanPath;
            this.scanTime = builder.scanTime;
            this.scanType = builder.scanType;
            this.status = builder.status;
            this.suspiciousCount = builder.suspiciousCount;
            this.suspiciousMachine = builder.suspiciousMachine;
            this.taskId = builder.taskId;
            this.unCompleteMachine = builder.unCompleteMachine;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VirusScanLatestTaskStatistic create() {
            return builder().build();
        }

        /**
         * @return completeMachine
         */
        public Integer getCompleteMachine() {
            return this.completeMachine;
        }

        /**
         * @return machineName
         */
        public String getMachineName() {
            return this.machineName;
        }

        /**
         * @return progress
         */
        public String getProgress() {
            return this.progress;
        }

        /**
         * @return riskLevel
         */
        public String getRiskLevel() {
            return this.riskLevel;
        }

        /**
         * @return safeMachine
         */
        public Integer getSafeMachine() {
            return this.safeMachine;
        }

        /**
         * @return scanMachine
         */
        public Integer getScanMachine() {
            return this.scanMachine;
        }

        /**
         * @return scanPath
         */
        public java.util.List<String> getScanPath() {
            return this.scanPath;
        }

        /**
         * @return scanTime
         */
        public Long getScanTime() {
            return this.scanTime;
        }

        /**
         * @return scanType
         */
        public String getScanType() {
            return this.scanType;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return suspiciousCount
         */
        public Integer getSuspiciousCount() {
            return this.suspiciousCount;
        }

        /**
         * @return suspiciousMachine
         */
        public Integer getSuspiciousMachine() {
            return this.suspiciousMachine;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return unCompleteMachine
         */
        public Integer getUnCompleteMachine() {
            return this.unCompleteMachine;
        }

        public static final class Builder {
            private Integer completeMachine; 
            private String machineName; 
            private String progress; 
            private String riskLevel; 
            private Integer safeMachine; 
            private Integer scanMachine; 
            private java.util.List<String> scanPath; 
            private Long scanTime; 
            private String scanType; 
            private Integer status; 
            private Integer suspiciousCount; 
            private Integer suspiciousMachine; 
            private String taskId; 
            private Integer unCompleteMachine; 

            private Builder() {
            } 

            private Builder(VirusScanLatestTaskStatistic model) {
                this.completeMachine = model.completeMachine;
                this.machineName = model.machineName;
                this.progress = model.progress;
                this.riskLevel = model.riskLevel;
                this.safeMachine = model.safeMachine;
                this.scanMachine = model.scanMachine;
                this.scanPath = model.scanPath;
                this.scanTime = model.scanTime;
                this.scanType = model.scanType;
                this.status = model.status;
                this.suspiciousCount = model.suspiciousCount;
                this.suspiciousMachine = model.suspiciousMachine;
                this.taskId = model.taskId;
                this.unCompleteMachine = model.unCompleteMachine;
            } 

            /**
             * <p>The number of machines that completed scanning.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder completeMachine(Integer completeMachine) {
                this.completeMachine = completeMachine;
                return this;
            }

            /**
             * <p>The server machine name.</p>
             * 
             * <strong>example:</strong>
             * <p>testMahine1</p>
             */
            public Builder machineName(String machineName) {
                this.machineName = machineName;
                return this;
            }

            /**
             * <p>The percentage of the scan task progress.</p>
             * 
             * <strong>example:</strong>
             * <p>92</p>
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * <p>The highest risk level of the detected alerts. Valid values:</p>
             * 
             * <strong>example:</strong>
             * <p>medium</p>
             */
            public Builder riskLevel(String riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            /**
             * <p>The number of machines on which no risks were detected.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder safeMachine(Integer safeMachine) {
                this.safeMachine = safeMachine;
                return this;
            }

            /**
             * <p>The number of machines scanned in this virus scan.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder scanMachine(Integer scanMachine) {
                this.scanMachine = scanMachine;
                return this;
            }

            /**
             * <p>The file paths specified for scanning when the user-defined scan type is used.</p>
             */
            public Builder scanPath(java.util.List<String> scanPath) {
                this.scanPath = scanPath;
                return this;
            }

            /**
             * <p>The scan timestamp, in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1681145862000</p>
             */
            public Builder scanTime(Long scanTime) {
                this.scanTime = scanTime;
                return this;
            }

            /**
             * <p>The scan type of this virus scan. Valid values:</p>
             * 
             * <strong>example:</strong>
             * <p>system</p>
             */
            public Builder scanType(String scanType) {
                this.scanType = scanType;
                return this;
            }

            /**
             * <p>The status of the scan task.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The number of security alerts detected during the scan.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder suspiciousCount(Integer suspiciousCount) {
                this.suspiciousCount = suspiciousCount;
                return this;
            }

            /**
             * <p>The number of machines on which risks were detected.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder suspiciousMachine(Integer suspiciousMachine) {
                this.suspiciousMachine = suspiciousMachine;
                return this;
            }

            /**
             * <p>The ID of the scan task.</p>
             * 
             * <strong>example:</strong>
             * <p>t-0mqu9dhpi365dp5iyf</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>The number of machines that did not complete scanning or failed during scanning.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder unCompleteMachine(Integer unCompleteMachine) {
                this.unCompleteMachine = unCompleteMachine;
                return this;
            }

            public VirusScanLatestTaskStatistic build() {
                return new VirusScanLatestTaskStatistic(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListVirusScanMachineEventResponseBody} extends {@link TeaModel}
     *
     * <p>ListVirusScanMachineEventResponseBody</p>
     */
    public static class Details extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InfoType")
        private String infoType;

        @com.aliyun.core.annotation.NameInMap("NameDisplay")
        private String nameDisplay;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("ValueDisplay")
        private String valueDisplay;

        private Details(Builder builder) {
            this.infoType = builder.infoType;
            this.nameDisplay = builder.nameDisplay;
            this.type = builder.type;
            this.valueDisplay = builder.valueDisplay;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Details create() {
            return builder().build();
        }

        /**
         * @return infoType
         */
        public String getInfoType() {
            return this.infoType;
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
         * @return valueDisplay
         */
        public String getValueDisplay() {
            return this.valueDisplay;
        }

        public static final class Builder {
            private String infoType; 
            private String nameDisplay; 
            private String type; 
            private String valueDisplay; 

            private Builder() {
            } 

            private Builder(Details model) {
                this.infoType = model.infoType;
                this.nameDisplay = model.nameDisplay;
                this.type = model.type;
                this.valueDisplay = model.valueDisplay;
            } 

            /**
             * <p>The display type of valueDisplay. Valid values:</p>
             * 
             * <strong>example:</strong>
             * <p>download_url</p>
             */
            public Builder infoType(String infoType) {
                this.infoType = infoType;
                return this;
            }

            /**
             * <p>The display name of the alert event.</p>
             * 
             * <strong>example:</strong>
             * <p>Trojan Path</p>
             */
            public Builder nameDisplay(String nameDisplay) {
                this.nameDisplay = nameDisplay;
                return this;
            }

            /**
             * <p>The display method of the anomalous event details.</p>
             * 
             * <strong>example:</strong>
             * <p>text</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The additional attribute information of the anomalous event, such as the logon time or logon location for abnormal logon alerts, or the trojan file path or trojan type for trojan alerts.</p>
             * 
             * <strong>example:</strong>
             * <p>getopt</p>
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
     * {@link ListVirusScanMachineEventResponseBody} extends {@link TeaModel}
     *
     * <p>ListVirusScanMachineEventResponseBody</p>
     */
    public static class VirusScanMachineEventListData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Details")
        private java.util.List<Details> details;

        @com.aliyun.core.annotation.NameInMap("EventId")
        private Long eventId;

        @com.aliyun.core.annotation.NameInMap("EventName")
        private String eventName;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("InternetIp")
        private String internetIp;

        @com.aliyun.core.annotation.NameInMap("IntranetIp")
        private String intranetIp;

        @com.aliyun.core.annotation.NameInMap("LastTimeStamp")
        private Long lastTimeStamp;

        @com.aliyun.core.annotation.NameInMap("Level")
        private String level;

        private VirusScanMachineEventListData(Builder builder) {
            this.details = builder.details;
            this.eventId = builder.eventId;
            this.eventName = builder.eventName;
            this.instanceName = builder.instanceName;
            this.internetIp = builder.internetIp;
            this.intranetIp = builder.intranetIp;
            this.lastTimeStamp = builder.lastTimeStamp;
            this.level = builder.level;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VirusScanMachineEventListData create() {
            return builder().build();
        }

        /**
         * @return details
         */
        public java.util.List<Details> getDetails() {
            return this.details;
        }

        /**
         * @return eventId
         */
        public Long getEventId() {
            return this.eventId;
        }

        /**
         * @return eventName
         */
        public String getEventName() {
            return this.eventName;
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

        public static final class Builder {
            private java.util.List<Details> details; 
            private Long eventId; 
            private String eventName; 
            private String instanceName; 
            private String internetIp; 
            private String intranetIp; 
            private Long lastTimeStamp; 
            private String level; 

            private Builder() {
            } 

            private Builder(VirusScanMachineEventListData model) {
                this.details = model.details;
                this.eventId = model.eventId;
                this.eventName = model.eventName;
                this.instanceName = model.instanceName;
                this.internetIp = model.internetIp;
                this.intranetIp = model.intranetIp;
                this.lastTimeStamp = model.lastTimeStamp;
                this.level = model.level;
            } 

            /**
             * <p>The details of the anomalous event.</p>
             */
            public Builder details(java.util.List<Details> details) {
                this.details = details;
                return this;
            }

            /**
             * <p>The ID of the alert event.</p>
             * 
             * <strong>example:</strong>
             * <p>123-2CcoavZnCXrJKqk2KQKxp9WGwup</p>
             */
            public Builder eventId(Long eventId) {
                this.eventId = eventId;
                return this;
            }

            /**
             * <p>The name (subtype) of the alert event.</p>
             * 
             * <strong>example:</strong>
             * <p>Malicious script code execution.</p>
             */
            public Builder eventName(String eventName) {
                this.eventName = eventName;
                return this;
            }

            /**
             * <p>The instance name.</p>
             * 
             * <strong>example:</strong>
             * <p>i-wz92q7m5hsbgfhdss***</p>
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * <p>The public IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>47.57.*1.65</p>
             */
            public Builder internetIp(String internetIp) {
                this.internetIp = internetIp;
                return this;
            }

            /**
             * <p>The private IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>47.57.*1.65</p>
             */
            public Builder intranetIp(String intranetIp) {
                this.intranetIp = intranetIp;
                return this;
            }

            /**
             * <p>The timestamp of the last occurrence, in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1682046733628</p>
             */
            public Builder lastTimeStamp(Long lastTimeStamp) {
                this.lastTimeStamp = lastTimeStamp;
                return this;
            }

            /**
             * <p>The risk level of the alert event. Valid values:</p>
             * 
             * <strong>example:</strong>
             * <p>remind</p>
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            public VirusScanMachineEventListData build() {
                return new VirusScanMachineEventListData(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListVirusScanMachineEventResponseBody} extends {@link TeaModel}
     *
     * <p>ListVirusScanMachineEventResponseBody</p>
     */
    public static class PageInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CurrentPage")
        private Integer currentPage;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private PageInfo(Builder builder) {
            this.currentPage = builder.currentPage;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageInfo create() {
            return builder().build();
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
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Integer currentPage; 
            private Integer pageSize; 
            private Integer totalCount; 

            private Builder() {
            } 

            private Builder(PageInfo model) {
                this.currentPage = model.currentPage;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The page number of the current page in a paged query.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * <p>The maximum number of entries displayed per page in a paged query.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of alert events returned.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public PageInfo build() {
                return new PageInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListVirusScanMachineEventResponseBody} extends {@link TeaModel}
     *
     * <p>ListVirusScanMachineEventResponseBody</p>
     */
    public static class VirusScanMachineEventList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Data")
        private java.util.List<VirusScanMachineEventListData> data;

        @com.aliyun.core.annotation.NameInMap("PageInfo")
        private PageInfo pageInfo;

        private VirusScanMachineEventList(Builder builder) {
            this.data = builder.data;
            this.pageInfo = builder.pageInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VirusScanMachineEventList create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public java.util.List<VirusScanMachineEventListData> getData() {
            return this.data;
        }

        /**
         * @return pageInfo
         */
        public PageInfo getPageInfo() {
            return this.pageInfo;
        }

        public static final class Builder {
            private java.util.List<VirusScanMachineEventListData> data; 
            private PageInfo pageInfo; 

            private Builder() {
            } 

            private Builder(VirusScanMachineEventList model) {
                this.data = model.data;
                this.pageInfo = model.pageInfo;
            } 

            /**
             * <p>The details of the alert events.</p>
             */
            public Builder data(java.util.List<VirusScanMachineEventListData> data) {
                this.data = data;
                return this;
            }

            /**
             * <p>The pagination information.</p>
             */
            public Builder pageInfo(PageInfo pageInfo) {
                this.pageInfo = pageInfo;
                return this;
            }

            public VirusScanMachineEventList build() {
                return new VirusScanMachineEventList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListVirusScanMachineEventResponseBody} extends {@link TeaModel}
     *
     * <p>ListVirusScanMachineEventResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RequestId")
        private String requestId;

        @com.aliyun.core.annotation.NameInMap("VirusScanLatestTaskStatistic")
        private VirusScanLatestTaskStatistic virusScanLatestTaskStatistic;

        @com.aliyun.core.annotation.NameInMap("VirusScanMachineEventList")
        private VirusScanMachineEventList virusScanMachineEventList;

        private Data(Builder builder) {
            this.requestId = builder.requestId;
            this.virusScanLatestTaskStatistic = builder.virusScanLatestTaskStatistic;
            this.virusScanMachineEventList = builder.virusScanMachineEventList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return requestId
         */
        public String getRequestId() {
            return this.requestId;
        }

        /**
         * @return virusScanLatestTaskStatistic
         */
        public VirusScanLatestTaskStatistic getVirusScanLatestTaskStatistic() {
            return this.virusScanLatestTaskStatistic;
        }

        /**
         * @return virusScanMachineEventList
         */
        public VirusScanMachineEventList getVirusScanMachineEventList() {
            return this.virusScanMachineEventList;
        }

        public static final class Builder {
            private String requestId; 
            private VirusScanLatestTaskStatistic virusScanLatestTaskStatistic; 
            private VirusScanMachineEventList virusScanMachineEventList; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.requestId = model.requestId;
                this.virusScanLatestTaskStatistic = model.virusScanLatestTaskStatistic;
                this.virusScanMachineEventList = model.virusScanMachineEventList;
            } 

            /**
             * <p>The request ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1E222AB5-5C2B-50AD-8A96-E704AF80F2A0</p>
             */
            public Builder requestId(String requestId) {
                this.requestId = requestId;
                return this;
            }

            /**
             * <p>The information about the latest virus scan task.</p>
             */
            public Builder virusScanLatestTaskStatistic(VirusScanLatestTaskStatistic virusScanLatestTaskStatistic) {
                this.virusScanLatestTaskStatistic = virusScanLatestTaskStatistic;
                return this;
            }

            /**
             * <p>The virus alerts detected on specific machines during virus scanning.</p>
             */
            public Builder virusScanMachineEventList(VirusScanMachineEventList virusScanMachineEventList) {
                this.virusScanMachineEventList = virusScanMachineEventList;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
