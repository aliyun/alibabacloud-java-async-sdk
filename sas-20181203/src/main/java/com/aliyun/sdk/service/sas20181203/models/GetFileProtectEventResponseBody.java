// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetFileProtectEventResponseBody} extends {@link TeaModel}
 *
 * <p>GetFileProtectEventResponseBody</p>
 */
public class GetFileProtectEventResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
    private String requestId;

    private GetFileProtectEventResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFileProtectEventResponseBody create() {
        return builder().build();
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

    public static final class Builder {
        private Data data; 
        private String requestId; 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetFileProtectEventResponseBody build() {
            return new GetFileProtectEventResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("AlertLevel")
        private Integer alertLevel;

        @NameInMap("CmdLine")
        private String cmdLine;

        @NameInMap("FilePath")
        private String filePath;

        @NameInMap("FilePermission")
        private String filePermission;

        @NameInMap("FirstTime")
        private Long firstTime;

        @NameInMap("HandleTime")
        private Long handleTime;

        @NameInMap("Id")
        private Long id;

        @NameInMap("InstanceName")
        private String instanceName;

        @NameInMap("InternetIp")
        private String internetIp;

        @NameInMap("IntranetIp")
        private String intranetIp;

        @NameInMap("LatestTime")
        private Long latestTime;

        @NameInMap("Operation")
        private String operation;

        @NameInMap("ProcPath")
        private String procPath;

        @NameInMap("ProcessId")
        private String processId;

        @NameInMap("Remark")
        private String remark;

        @NameInMap("RuleName")
        private String ruleName;

        @NameInMap("Status")
        private Integer status;

        @NameInMap("Uuid")
        private String uuid;

        private Data(Builder builder) {
            this.alertLevel = builder.alertLevel;
            this.cmdLine = builder.cmdLine;
            this.filePath = builder.filePath;
            this.filePermission = builder.filePermission;
            this.firstTime = builder.firstTime;
            this.handleTime = builder.handleTime;
            this.id = builder.id;
            this.instanceName = builder.instanceName;
            this.internetIp = builder.internetIp;
            this.intranetIp = builder.intranetIp;
            this.latestTime = builder.latestTime;
            this.operation = builder.operation;
            this.procPath = builder.procPath;
            this.processId = builder.processId;
            this.remark = builder.remark;
            this.ruleName = builder.ruleName;
            this.status = builder.status;
            this.uuid = builder.uuid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return alertLevel
         */
        public Integer getAlertLevel() {
            return this.alertLevel;
        }

        /**
         * @return cmdLine
         */
        public String getCmdLine() {
            return this.cmdLine;
        }

        /**
         * @return filePath
         */
        public String getFilePath() {
            return this.filePath;
        }

        /**
         * @return filePermission
         */
        public String getFilePermission() {
            return this.filePermission;
        }

        /**
         * @return firstTime
         */
        public Long getFirstTime() {
            return this.firstTime;
        }

        /**
         * @return handleTime
         */
        public Long getHandleTime() {
            return this.handleTime;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
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
         * @return latestTime
         */
        public Long getLatestTime() {
            return this.latestTime;
        }

        /**
         * @return operation
         */
        public String getOperation() {
            return this.operation;
        }

        /**
         * @return procPath
         */
        public String getProcPath() {
            return this.procPath;
        }

        /**
         * @return processId
         */
        public String getProcessId() {
            return this.processId;
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        /**
         * @return ruleName
         */
        public String getRuleName() {
            return this.ruleName;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        public static final class Builder {
            private Integer alertLevel; 
            private String cmdLine; 
            private String filePath; 
            private String filePermission; 
            private Long firstTime; 
            private Long handleTime; 
            private Long id; 
            private String instanceName; 
            private String internetIp; 
            private String intranetIp; 
            private Long latestTime; 
            private String operation; 
            private String procPath; 
            private String processId; 
            private String remark; 
            private String ruleName; 
            private Integer status; 
            private String uuid; 

            /**
             * AlertLevel.
             */
            public Builder alertLevel(Integer alertLevel) {
                this.alertLevel = alertLevel;
                return this;
            }

            /**
             * CmdLine.
             */
            public Builder cmdLine(String cmdLine) {
                this.cmdLine = cmdLine;
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
             * FilePermission.
             */
            public Builder filePermission(String filePermission) {
                this.filePermission = filePermission;
                return this;
            }

            /**
             * FirstTime.
             */
            public Builder firstTime(Long firstTime) {
                this.firstTime = firstTime;
                return this;
            }

            /**
             * HandleTime.
             */
            public Builder handleTime(Long handleTime) {
                this.handleTime = handleTime;
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
             * LatestTime.
             */
            public Builder latestTime(Long latestTime) {
                this.latestTime = latestTime;
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
             * ProcPath.
             */
            public Builder procPath(String procPath) {
                this.procPath = procPath;
                return this;
            }

            /**
             * ProcessId.
             */
            public Builder processId(String processId) {
                this.processId = processId;
                return this;
            }

            /**
             * Remark.
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * RuleName.
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * Uuid.
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
