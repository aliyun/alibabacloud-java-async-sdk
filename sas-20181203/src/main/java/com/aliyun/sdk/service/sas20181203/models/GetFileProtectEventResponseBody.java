// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetFileProtectEventResponseBody} extends {@link TeaModel}
 *
 * <p>GetFileProtectEventResponseBody</p>
 */
public class GetFileProtectEventResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The details of the returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0B48AB3C-84FC-424D-A01D-B9270EF46038</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetFileProtectEventResponseBody build() {
            return new GetFileProtectEventResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetFileProtectEventResponseBody} extends {@link TeaModel}
     *
     * <p>GetFileProtectEventResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlertLevel")
        private Integer alertLevel;

        @com.aliyun.core.annotation.NameInMap("CmdLine")
        private String cmdLine;

        @com.aliyun.core.annotation.NameInMap("FilePath")
        private String filePath;

        @com.aliyun.core.annotation.NameInMap("FilePermission")
        private String filePermission;

        @com.aliyun.core.annotation.NameInMap("FirstTime")
        private Long firstTime;

        @com.aliyun.core.annotation.NameInMap("HandleTime")
        private Long handleTime;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("InternetIp")
        private String internetIp;

        @com.aliyun.core.annotation.NameInMap("IntranetIp")
        private String intranetIp;

        @com.aliyun.core.annotation.NameInMap("LatestTime")
        private Long latestTime;

        @com.aliyun.core.annotation.NameInMap("Operation")
        private String operation;

        @com.aliyun.core.annotation.NameInMap("Platform")
        private String platform;

        @com.aliyun.core.annotation.NameInMap("ProcPath")
        private String procPath;

        @com.aliyun.core.annotation.NameInMap("ProcessId")
        private String processId;

        @com.aliyun.core.annotation.NameInMap("Remark")
        private String remark;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        private String ruleName;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("Uuid")
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
            this.platform = builder.platform;
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
         * @return platform
         */
        public String getPlatform() {
            return this.platform;
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
            private String platform; 
            private String procPath; 
            private String processId; 
            private String remark; 
            private String ruleName; 
            private Integer status; 
            private String uuid; 

            /**
             * <p>The severity of alerts. Valid values:</p>
             * <ul>
             * <li>0: does not generate alerts</li>
             * <li>1: sends notifications</li>
             * <li>2: suspicious</li>
             * <li>3: high-risk</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder alertLevel(Integer alertLevel) {
                this.alertLevel = alertLevel;
                return this;
            }

            /**
             * <p>The event command line.</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;touch&quot;,&quot;/usr/local/aaaa&quot;]</p>
             */
            public Builder cmdLine(String cmdLine) {
                this.cmdLine = cmdLine;
                return this;
            }

            /**
             * <p>The path to the file.</p>
             * 
             * <strong>example:</strong>
             * <p>/usr/local</p>
             */
            public Builder filePath(String filePath) {
                this.filePath = filePath;
                return this;
            }

            /**
             * <p>The permissions to run the process.</p>
             * 
             * <strong>example:</strong>
             * <p>rwxr-xr-x</p>
             */
            public Builder filePermission(String filePermission) {
                this.filePermission = filePermission;
                return this;
            }

            /**
             * <p>The timestamp at which the event was first detected.</p>
             * 
             * <strong>example:</strong>
             * <p>1694576692000</p>
             */
            public Builder firstTime(Long firstTime) {
                this.firstTime = firstTime;
                return this;
            }

            /**
             * <p>The time when the event was handled.</p>
             * 
             * <strong>example:</strong>
             * <p>1694576692000</p>
             */
            public Builder handleTime(Long handleTime) {
                this.handleTime = handleTime;
                return this;
            }

            /**
             * <p>The ID of the event.</p>
             * 
             * <strong>example:</strong>
             * <p>55037</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The name of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>i-wz92q7m5hsbgfhdss***</p>
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * <p>The public IP address of the associated instance.</p>
             * 
             * <strong>example:</strong>
             * <p>172.16.XX.XX</p>
             */
            public Builder internetIp(String internetIp) {
                this.internetIp = internetIp;
                return this;
            }

            /**
             * <p>The private IP address of the associated instance.</p>
             * 
             * <strong>example:</strong>
             * <p>10.42.XX.XX</p>
             */
            public Builder intranetIp(String intranetIp) {
                this.intranetIp = intranetIp;
                return this;
            }

            /**
             * <p>The time when the event last occurred.</p>
             * 
             * <strong>example:</strong>
             * <p>1694576692000</p>
             */
            public Builder latestTime(Long latestTime) {
                this.latestTime = latestTime;
                return this;
            }

            /**
             * <p>The operation that the process performed on the file.</p>
             * 
             * <strong>example:</strong>
             * <p>DELETE</p>
             */
            public Builder operation(String operation) {
                this.operation = operation;
                return this;
            }

            /**
             * <p>The type of the operating system. Valid values:</p>
             * <ul>
             * <li><strong>windows</strong>: Windows</li>
             * <li><strong>linux</strong>: Linux</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>linux</p>
             */
            public Builder platform(String platform) {
                this.platform = platform;
                return this;
            }

            /**
             * <p>The path to the process.</p>
             * 
             * <strong>example:</strong>
             * <p>/bin/bash33</p>
             */
            public Builder procPath(String procPath) {
                this.procPath = procPath;
                return this;
            }

            /**
             * <p>The process ID of the event.</p>
             * 
             * <strong>example:</strong>
             * <p>3453</p>
             */
            public Builder processId(String processId) {
                this.processId = processId;
                return this;
            }

            /**
             * <p>The remarks.</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;test&quot;]</p>
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * <p>The name of the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>test-000</p>
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * <p>The status of the event. Valid values:</p>
             * <ul>
             * <li>0: not handled</li>
             * <li>1: handled</li>
             * <li>2: added to the whitelist</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The UUID of the asset.</p>
             * 
             * <strong>example:</strong>
             * <p>49f1360f-62c8-4b48-a24c-5cc317656419</p>
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
