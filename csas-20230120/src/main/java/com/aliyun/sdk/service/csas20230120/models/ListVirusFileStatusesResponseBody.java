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
         * FileStatuses.
         */
        public Builder fileStatuses(java.util.List<FileStatuses> fileStatuses) {
            this.fileStatuses = fileStatuses;
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
         * TotalNum.
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
             * ConsoleOperationTime.
             */
            public Builder consoleOperationTime(String consoleOperationTime) {
                this.consoleOperationTime = consoleOperationTime;
                return this;
            }

            /**
             * Department.
             */
            public Builder department(String department) {
                this.department = department;
                return this;
            }

            /**
             * DevTag.
             */
            public Builder devTag(String devTag) {
                this.devTag = devTag;
                return this;
            }

            /**
             * DevType.
             */
            public Builder devType(String devType) {
                this.devType = devType;
                return this;
            }

            /**
             * DiscoveryTime.
             */
            public Builder discoveryTime(String discoveryTime) {
                this.discoveryTime = discoveryTime;
                return this;
            }

            /**
             * FileMd5.
             */
            public Builder fileMd5(String fileMd5) {
                this.fileMd5 = fileMd5;
                return this;
            }

            /**
             * FilePath.
             */
            public Builder filePath(String filePath) {
                this.filePath = filePath;
                return this;
            }

            /**
             * FileProcessStatus.
             */
            public Builder fileProcessStatus(String fileProcessStatus) {
                this.fileProcessStatus = fileProcessStatus;
                return this;
            }

            /**
             * FileSize.
             */
            public Builder fileSize(Integer fileSize) {
                this.fileSize = fileSize;
                return this;
            }

            /**
             * Hostname.
             */
            public Builder hostname(String hostname) {
                this.hostname = hostname;
                return this;
            }

            /**
             * Operation.
             */
            public Builder operation(String operation) {
                this.operation = operation;
                return this;
            }

            /**
             * OperationTime.
             */
            public Builder operationTime(String operationTime) {
                this.operationTime = operationTime;
                return this;
            }

            /**
             * RiskLevel.
             */
            public Builder riskLevel(String riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            /**
             * SaseUserId.
             */
            public Builder saseUserId(String saseUserId) {
                this.saseUserId = saseUserId;
                return this;
            }

            /**
             * ScanTaskId.
             */
            public Builder scanTaskId(String scanTaskId) {
                this.scanTaskId = scanTaskId;
                return this;
            }

            /**
             * TaskExecutionInfo.
             */
            public Builder taskExecutionInfo(String taskExecutionInfo) {
                this.taskExecutionInfo = taskExecutionInfo;
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
             * VirusFileSource.
             */
            public Builder virusFileSource(String virusFileSource) {
                this.virusFileSource = virusFileSource;
                return this;
            }

            /**
             * VirusType.
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
