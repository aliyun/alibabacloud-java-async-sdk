// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link GetFileProtectClientEventResponseBody} extends {@link TeaModel}
 *
 * <p>GetFileProtectClientEventResponseBody</p>
 */
public class GetFileProtectClientEventResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetFileProtectClientEventResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFileProtectClientEventResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetFileProtectClientEventResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The data details.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>1383B0DB-D5D6-4B0C-9E6B-75939C8****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetFileProtectClientEventResponseBody build() {
            return new GetFileProtectClientEventResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetFileProtectClientEventResponseBody} extends {@link TeaModel}
     *
     * <p>GetFileProtectClientEventResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlertLevel")
        private Integer alertLevel;

        @com.aliyun.core.annotation.NameInMap("CmdLine")
        private String cmdLine;

        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

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

        @com.aliyun.core.annotation.NameInMap("RuleAction")
        private String ruleAction;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        private String ruleName;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("UserName")
        private String userName;

        @com.aliyun.core.annotation.NameInMap("Uuid")
        private String uuid;

        private Data(Builder builder) {
            this.alertLevel = builder.alertLevel;
            this.cmdLine = builder.cmdLine;
            this.count = builder.count;
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
            this.ruleAction = builder.ruleAction;
            this.ruleName = builder.ruleName;
            this.status = builder.status;
            this.userId = builder.userId;
            this.userName = builder.userName;
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
         * @return count
         */
        public Integer getCount() {
            return this.count;
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
         * @return ruleAction
         */
        public String getRuleAction() {
            return this.ruleAction;
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
         * @return userId
         */
        public String getUserId() {
            return this.userId;
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
            private Integer alertLevel; 
            private String cmdLine; 
            private Integer count; 
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
            private String ruleAction; 
            private String ruleName; 
            private Integer status; 
            private String userId; 
            private String userName; 
            private String uuid; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.alertLevel = model.alertLevel;
                this.cmdLine = model.cmdLine;
                this.count = model.count;
                this.filePath = model.filePath;
                this.filePermission = model.filePermission;
                this.firstTime = model.firstTime;
                this.handleTime = model.handleTime;
                this.id = model.id;
                this.instanceName = model.instanceName;
                this.internetIp = model.internetIp;
                this.intranetIp = model.intranetIp;
                this.latestTime = model.latestTime;
                this.operation = model.operation;
                this.platform = model.platform;
                this.procPath = model.procPath;
                this.processId = model.processId;
                this.remark = model.remark;
                this.ruleAction = model.ruleAction;
                this.ruleName = model.ruleName;
                this.status = model.status;
                this.userId = model.userId;
                this.userName = model.userName;
                this.uuid = model.uuid;
            } 

            /**
             * <p>The alert notification level. Valid values:</p>
             * <ul>
             * <li>0: no alert</li>
             * <li>1: reminder</li>
             * <li>2: suspicious</li>
             * <li>3: high-risk.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder alertLevel(Integer alertLevel) {
                this.alertLevel = alertLevel;
                return this;
            }

            /**
             * <p>The command line of the event.</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;touch&quot;,&quot;/usr/local/aaaa&quot;]</p>
             */
            public Builder cmdLine(String cmdLine) {
                this.cmdLine = cmdLine;
                return this;
            }

            /**
             * <p>The number of times the alert occurred.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The file path.</p>
             * 
             * <strong>example:</strong>
             * <p>/usr/local</p>
             */
            public Builder filePath(String filePath) {
                this.filePath = filePath;
                return this;
            }

            /**
             * <p>The process permissions.</p>
             * 
             * <strong>example:</strong>
             * <p>rwxr-xr-x</p>
             */
            public Builder filePermission(String filePermission) {
                this.filePermission = filePermission;
                return this;
            }

            /**
             * <p>The timestamp when the event first occurred.</p>
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
             * <p>The event ID.</p>
             * 
             * <strong>example:</strong>
             * <p>3454</p>
             */
            public Builder id(Long id) {
                this.id = id;
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
             * <p>The public IP address of the associated instance.</p>
             * 
             * <strong>example:</strong>
             * <p>17.16.XX.XX</p>
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
             * <p>The time when the event most recently occurred.</p>
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
             * <p>The operating system type.</p>
             * 
             * <strong>example:</strong>
             * <p>linux</p>
             */
            public Builder platform(String platform) {
                this.platform = platform;
                return this;
            }

            /**
             * <p>The process path.</p>
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
             * <p>test</p>
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * <p>The action of the blocking rule.</p>
             * 
             * <strong>example:</strong>
             * <p>block</p>
             */
            public Builder ruleAction(String ruleAction) {
                this.ruleAction = ruleAction;
                return this;
            }

            /**
             * <p>The rule name.</p>
             * 
             * <strong>example:</strong>
             * <p>test-000</p>
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * <p>The event status. Valid values:</p>
             * <ul>
             * <li>0: unhandled </li>
             * <li>1: handled</li>
             * <li>2: whitelisted.</li>
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
             * <p>The user ID of the event.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * <p>The username of the event.</p>
             * 
             * <strong>example:</strong>
             * <p>root</p>
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            /**
             * <p>The UUID of the asset instance.</p>
             * 
             * <strong>example:</strong>
             * <p>6690a46c-0edb-4663-a641-3629d1a9****</p>
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
