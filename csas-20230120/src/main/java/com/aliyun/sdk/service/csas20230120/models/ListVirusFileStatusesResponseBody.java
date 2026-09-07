// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link ListVirusFileStatusesResponseBody} extends {@link TeaModel}
 *
 * <p>ListVirusFileStatusesResponseBody</p>
 */
public class ListVirusFileStatusesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FileStatuses")
    private java.util.List<FileStatuses> fileStatuses;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalNum")
    private String totalNum;

    private ListVirusFileStatusesResponseBody(Builder builder) {
        this.fileStatuses = builder.fileStatuses;
        this.requestId = builder.requestId;
        this.totalNum = builder.totalNum;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListVirusFileStatusesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return fileStatuses
     */
    public java.util.List<FileStatuses> getFileStatuses() {
        return this.fileStatuses;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalNum
     */
    public String getTotalNum() {
        return this.totalNum;
    }

    public static final class Builder {
        private java.util.List<FileStatuses> fileStatuses; 
        private String requestId; 
        private String totalNum; 

        private Builder() {
        } 

        private Builder(ListVirusFileStatusesResponseBody model) {
            this.fileStatuses = model.fileStatuses;
            this.requestId = model.requestId;
            this.totalNum = model.totalNum;
        } 

        /**
         * <p>The list of virus files.</p>
         */
        public Builder fileStatuses(java.util.List<FileStatuses> fileStatuses) {
            this.fileStatuses = fileStatuses;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>3D7EC0AF-DB2A-5D9C-90EC-F090A6BAAEA7</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of virus files that match the query conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>37</p>
         */
        public Builder totalNum(String totalNum) {
            this.totalNum = totalNum;
            return this;
        }

        public ListVirusFileStatusesResponseBody build() {
            return new ListVirusFileStatusesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListVirusFileStatusesResponseBody} extends {@link TeaModel}
     *
     * <p>ListVirusFileStatusesResponseBody</p>
     */
    public static class FileStatuses extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConsoleOperationTime")
        private String consoleOperationTime;

        @com.aliyun.core.annotation.NameInMap("Department")
        private String department;

        @com.aliyun.core.annotation.NameInMap("DevTag")
        private String devTag;

        @com.aliyun.core.annotation.NameInMap("DevType")
        private String devType;

        @com.aliyun.core.annotation.NameInMap("DiscoveryTime")
        private String discoveryTime;

        @com.aliyun.core.annotation.NameInMap("FileMd5")
        private String fileMd5;

        @com.aliyun.core.annotation.NameInMap("FilePath")
        private String filePath;

        @com.aliyun.core.annotation.NameInMap("FileProcessStatus")
        private String fileProcessStatus;

        @com.aliyun.core.annotation.NameInMap("FileSize")
        private Integer fileSize;

        @com.aliyun.core.annotation.NameInMap("Hostname")
        private String hostname;

        @com.aliyun.core.annotation.NameInMap("Operation")
        private String operation;

        @com.aliyun.core.annotation.NameInMap("OperationTime")
        private String operationTime;

        @com.aliyun.core.annotation.NameInMap("RiskLevel")
        private String riskLevel;

        @com.aliyun.core.annotation.NameInMap("SaseUserId")
        private String saseUserId;

        @com.aliyun.core.annotation.NameInMap("ScanTaskId")
        private String scanTaskId;

        @com.aliyun.core.annotation.NameInMap("TaskExecutionInfo")
        private String taskExecutionInfo;

        @com.aliyun.core.annotation.NameInMap("Username")
        private String username;

        @com.aliyun.core.annotation.NameInMap("VirusFileSource")
        private String virusFileSource;

        @com.aliyun.core.annotation.NameInMap("VirusType")
        private String virusType;

        private FileStatuses(Builder builder) {
            this.consoleOperationTime = builder.consoleOperationTime;
            this.department = builder.department;
            this.devTag = builder.devTag;
            this.devType = builder.devType;
            this.discoveryTime = builder.discoveryTime;
            this.fileMd5 = builder.fileMd5;
            this.filePath = builder.filePath;
            this.fileProcessStatus = builder.fileProcessStatus;
            this.fileSize = builder.fileSize;
            this.hostname = builder.hostname;
            this.operation = builder.operation;
            this.operationTime = builder.operationTime;
            this.riskLevel = builder.riskLevel;
            this.saseUserId = builder.saseUserId;
            this.scanTaskId = builder.scanTaskId;
            this.taskExecutionInfo = builder.taskExecutionInfo;
            this.username = builder.username;
            this.virusFileSource = builder.virusFileSource;
            this.virusType = builder.virusType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FileStatuses create() {
            return builder().build();
        }

        /**
         * @return consoleOperationTime
         */
        public String getConsoleOperationTime() {
            return this.consoleOperationTime;
        }

        /**
         * @return department
         */
        public String getDepartment() {
            return this.department;
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
         * @return discoveryTime
         */
        public String getDiscoveryTime() {
            return this.discoveryTime;
        }

        /**
         * @return fileMd5
         */
        public String getFileMd5() {
            return this.fileMd5;
        }

        /**
         * @return filePath
         */
        public String getFilePath() {
            return this.filePath;
        }

        /**
         * @return fileProcessStatus
         */
        public String getFileProcessStatus() {
            return this.fileProcessStatus;
        }

        /**
         * @return fileSize
         */
        public Integer getFileSize() {
            return this.fileSize;
        }

        /**
         * @return hostname
         */
        public String getHostname() {
            return this.hostname;
        }

        /**
         * @return operation
         */
        public String getOperation() {
            return this.operation;
        }

        /**
         * @return operationTime
         */
        public String getOperationTime() {
            return this.operationTime;
        }

        /**
         * @return riskLevel
         */
        public String getRiskLevel() {
            return this.riskLevel;
        }

        /**
         * @return saseUserId
         */
        public String getSaseUserId() {
            return this.saseUserId;
        }

        /**
         * @return scanTaskId
         */
        public String getScanTaskId() {
            return this.scanTaskId;
        }

        /**
         * @return taskExecutionInfo
         */
        public String getTaskExecutionInfo() {
            return this.taskExecutionInfo;
        }

        /**
         * @return username
         */
        public String getUsername() {
            return this.username;
        }

        /**
         * @return virusFileSource
         */
        public String getVirusFileSource() {
            return this.virusFileSource;
        }

        /**
         * @return virusType
         */
        public String getVirusType() {
            return this.virusType;
        }

        public static final class Builder {
            private String consoleOperationTime; 
            private String department; 
            private String devTag; 
            private String devType; 
            private String discoveryTime; 
            private String fileMd5; 
            private String filePath; 
            private String fileProcessStatus; 
            private Integer fileSize; 
            private String hostname; 
            private String operation; 
            private String operationTime; 
            private String riskLevel; 
            private String saseUserId; 
            private String scanTaskId; 
            private String taskExecutionInfo; 
            private String username; 
            private String virusFileSource; 
            private String virusType; 

            private Builder() {
            } 

            private Builder(FileStatuses model) {
                this.consoleOperationTime = model.consoleOperationTime;
                this.department = model.department;
                this.devTag = model.devTag;
                this.devType = model.devType;
                this.discoveryTime = model.discoveryTime;
                this.fileMd5 = model.fileMd5;
                this.filePath = model.filePath;
                this.fileProcessStatus = model.fileProcessStatus;
                this.fileSize = model.fileSize;
                this.hostname = model.hostname;
                this.operation = model.operation;
                this.operationTime = model.operationTime;
                this.riskLevel = model.riskLevel;
                this.saseUserId = model.saseUserId;
                this.scanTaskId = model.scanTaskId;
                this.taskExecutionInfo = model.taskExecutionInfo;
                this.username = model.username;
                this.virusFileSource = model.virusFileSource;
                this.virusType = model.virusType;
            } 

            /**
             * <p>The time when the administrator initiated the disposition, in the format yyyy-MM-dd HH:mm:ss (UTC+8). An empty string is returned when the disposition was not initiated by an administrator.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-08-21 09:30:12</p>
             */
            public Builder consoleOperationTime(String consoleOperationTime) {
                this.consoleOperationTime = consoleOperationTime;
                return this;
            }

            /**
             * <p>The name of the department to which the user belongs. Multiple departments are separated by commas (,). The nearest department name in the organizational structure is returned, not the full path.</p>
             * 
             * <strong>example:</strong>
             * <p>R&amp;D Department,Security Team</p>
             */
            public Builder department(String department) {
                this.department = department;
                return this;
            }

            /**
             * <p>The unique identifier of the user\&quot;s endpoint device that detected this virus file.</p>
             * 
             * <strong>example:</strong>
             * <p>36efa42d-2c32-c4dc-e3fc-8541e33a****</p>
             */
            public Builder devTag(String devTag) {
                this.devTag = devTag;
                return this;
            }

            /**
             * <p>The operating system type of the user terminal device. Valid values:</p>
             * <ul>
             * <li><strong>windows</strong>: Windows.</li>
             * <li><strong>macOS</strong>: macOS.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>windows</p>
             */
            public Builder devType(String devType) {
                this.devType = devType;
                return this;
            }

            /**
             * <p>The time when the virus file was discovered, in the format yyyy-MM-dd HH:mm:ss (UTC+8). A hyphen (-) is returned when no record exists.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-08-21 03:12:07</p>
             */
            public Builder discoveryTime(String discoveryTime) {
                this.discoveryTime = discoveryTime;
                return this;
            }

            /**
             * <p>The MD5 hash of the virus file.</p>
             * 
             * <strong>example:</strong>
             * <p>d41d8cd98f00b204e9800998ecf8427e</p>
             */
            public Builder fileMd5(String fileMd5) {
                this.fileMd5 = fileMd5;
                return this;
            }

            /**
             * <p>The absolute path of the virus file on the user\&quot;s endpoint device.</p>
             * 
             * <strong>example:</strong>
             * <p>C:\Users\Public\Downloads\setup.exe</p>
             */
            public Builder filePath(String filePath) {
                this.filePath = filePath;
                return this;
            }

            /**
             * <p>The disposition status. Valid values:</p>
             * <ul>
             * <li><strong>Pending</strong>: Pending disposition.</li>
             * <li><strong>Processed</strong>: Disposed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Pending</p>
             */
            public Builder fileProcessStatus(String fileProcessStatus) {
                this.fileProcessStatus = fileProcessStatus;
                return this;
            }

            /**
             * <p>The size of the virus file, in bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>20480</p>
             */
            public Builder fileSize(Integer fileSize) {
                this.fileSize = fileSize;
                return this;
            }

            /**
             * <p>The hostname of the user\&quot;s endpoint device.</p>
             * 
             * <strong>example:</strong>
             * <p>DESKTOP-8A3F</p>
             */
            public Builder hostname(String hostname) {
                this.hostname = hostname;
                return this;
            }

            /**
             * <p>The disposition action that has been performed. An empty string is returned when no disposition has been performed. Valid values:</p>
             * <ul>
             * <li><strong>AdminQuarantine</strong>: Quarantined by administrator.</li>
             * <li><strong>AdminTrust</strong>: Trusted by administrator.</li>
             * <li><strong>UserQuarantine</strong>: Quarantined by endpoint user.</li>
             * <li><strong>UserTrust</strong>: Trusted by endpoint user.</li>
             * <li><strong>AutoQuarantine</strong>: Automatically quarantined based on policy.</li>
             * <li><strong>Fail</strong>: Disposition failed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>AdminQuarantine</p>
             */
            public Builder operation(String operation) {
                this.operation = operation;
                return this;
            }

            /**
             * <p>The effective period of the disposition, in the format yyyy-MM-dd HH:mm:ss (UTC+8). The later of the actual disposition time on the user\&quot;s endpoint device and the time when the administrator initiated the disposition is used. A hyphen (-) is returned when no disposition has been performed.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-08-21 09:31:45</p>
             */
            public Builder operationTime(String operationTime) {
                this.operationTime = operationTime;
                return this;
            }

            /**
             * <p>The risk level. Valid values:</p>
             * <ul>
             * <li><strong>High</strong>: High risk.</li>
             * <li><strong>Mid</strong>: Medium risk.</li>
             * <li><strong>Low</strong>: Low risk.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>High</p>
             */
            public Builder riskLevel(String riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            /**
             * <p>The user ID.</p>
             * 
             * <strong>example:</strong>
             * <p>su_e8f218fb171edd167c2ad917d21f53148bdefc510ca1f3c3cc0249d3643d****</p>
             */
            public Builder saseUserId(String saseUserId) {
                this.saseUserId = saseUserId;
                return this;
            }

            /**
             * <p>The ID of the virus scan task that detected this virus file. An empty string is returned when the file is detected by real-time protection.</p>
             * 
             * <strong>example:</strong>
             * <p>v1:1024772</p>
             */
            public Builder scanTaskId(String scanTaskId) {
                this.scanTaskId = scanTaskId;
                return this;
            }

            /**
             * <p>The execution result description of the disposition or scan, reported by the user\&quot;s endpoint device. If a disposition record exists, the execution result of the disposition task is returned. Otherwise, the execution result of the scan task is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>quarantine success</p>
             */
            public Builder taskExecutionInfo(String taskExecutionInfo) {
                this.taskExecutionInfo = taskExecutionInfo;
                return this;
            }

            /**
             * <p>The username.</p>
             * 
             * <strong>example:</strong>
             * <p>John Smith</p>
             */
            public Builder username(String username) {
                this.username = username;
                return this;
            }

            /**
             * <p>The detection source of the virus file. Valid values:</p>
             * <ul>
             * <li><strong>Task</strong>: Detected by a virus scan task.</li>
             * <li><strong>Download</strong>: Detected by real-time protection during file download.</li>
             * <li><strong>Process</strong>: Detected by real-time protection during process execution.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Task</p>
             */
            public Builder virusFileSource(String virusFileSource) {
                this.virusFileSource = virusFileSource;
                return this;
            }

            /**
             * <p>The virus type. Valid values:</p>
             * <ul>
             * <li><strong>Backdoor</strong>: Backdoor program.</li>
             * <li><strong>DDoS</strong>: DDoS Trojan.</li>
             * <li><strong>Downloader</strong>: Downloader Trojan.</li>
             * <li><strong>Engtest</strong>: DPI engine test program.</li>
             * <li><strong>Hacktool</strong>: Hacking tool.</li>
             * <li><strong>Trojan</strong>: Self-mutating Trojan.</li>
             * <li><strong>Malbaseware</strong>: Contaminated base software.</li>
             * <li><strong>MalScript</strong>: Malicious script.</li>
             * <li><strong>Malware</strong>: Malicious program.</li>
             * <li><strong>Miner</strong>: Mining programs.</li>
             * <li><strong>Proxytool</strong>: Proxy tool.</li>
             * <li><strong>RansomWare</strong>: Ransomware.</li>
             * <li><strong>RiskWare</strong>: Risky software.</li>
             * <li><strong>Rootkit</strong>: Kernel-hidden program.</li>
             * <li><strong>Stealer</strong>: Credential-stealing tool.</li>
             * <li><strong>Scanner</strong>: Scanner.</li>
             * <li><strong>Suspicious</strong>: Suspicious program.</li>
             * <li><strong>Virus</strong>: File-infecting virus.</li>
             * <li><strong>WebShell</strong>: Web shell.</li>
             * <li><strong>Worm</strong>: Worms.</li>
             * <li><strong>BlackList</strong>: File that hit the blacklist.</li>
             * <li><strong>Exp</strong>: Vulnerability exploits program.</li>
             * <li><strong>Patcher</strong>: Cracking program.</li>
             * <li><strong>Gametool</strong>: Private server tool.</li>
             * <li><strong>AdWare</strong>: Adware.</li>
             * <li><strong>Maldoc</strong>: Malicious document.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Virus</p>
             */
            public Builder virusType(String virusType) {
                this.virusType = virusType;
                return this;
            }

            public FileStatuses build() {
                return new FileStatuses(this);
            } 

        } 

    }
}
