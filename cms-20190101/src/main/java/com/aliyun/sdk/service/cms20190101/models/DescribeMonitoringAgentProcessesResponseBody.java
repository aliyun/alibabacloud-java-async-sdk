// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMonitoringAgentProcessesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMonitoringAgentProcessesResponseBody</p>
 */
public class DescribeMonitoringAgentProcessesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("NodeProcesses")
    private NodeProcesses nodeProcesses;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeMonitoringAgentProcessesResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.nodeProcesses = builder.nodeProcesses;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMonitoringAgentProcessesResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return nodeProcesses
     */
    public NodeProcesses getNodeProcesses() {
        return this.nodeProcesses;
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
        private String message; 
        private NodeProcesses nodeProcesses; 
        private String requestId; 
        private Boolean success; 

        /**
         * The HTTP status code.
         * <p>
         * 
         * >  The value 200 indicates that the call was successful.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The returned message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The information about the processes.
         */
        public Builder nodeProcesses(NodeProcesses nodeProcesses) {
            this.nodeProcesses = nodeProcesses;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the call was successful. Valid values:
         * <p>
         * 
         * *   true: The call was successful.
         * *   false: The call failed.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeMonitoringAgentProcessesResponseBody build() {
            return new DescribeMonitoringAgentProcessesResponseBody(this);
        } 

    } 

    public static class NodeProcess extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Command")
        private String command;

        @com.aliyun.core.annotation.NameInMap("GroupId")
        private String groupId;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("ProcessId")
        private Long processId;

        @com.aliyun.core.annotation.NameInMap("ProcessName")
        private String processName;

        @com.aliyun.core.annotation.NameInMap("ProcessUser")
        private String processUser;

        private NodeProcess(Builder builder) {
            this.command = builder.command;
            this.groupId = builder.groupId;
            this.instanceId = builder.instanceId;
            this.processId = builder.processId;
            this.processName = builder.processName;
            this.processUser = builder.processUser;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NodeProcess create() {
            return builder().build();
        }

        /**
         * @return command
         */
        public String getCommand() {
            return this.command;
        }

        /**
         * @return groupId
         */
        public String getGroupId() {
            return this.groupId;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return processId
         */
        public Long getProcessId() {
            return this.processId;
        }

        /**
         * @return processName
         */
        public String getProcessName() {
            return this.processName;
        }

        /**
         * @return processUser
         */
        public String getProcessUser() {
            return this.processUser;
        }

        public static final class Builder {
            private String command; 
            private String groupId; 
            private String instanceId; 
            private Long processId; 
            private String processName; 
            private String processUser; 

            /**
             * The command used to obtain the number of processes. Valid value: `number`.
             * <p>
             * 
             * >  The `number` command obtains the number of processes that match the condition.
             */
            public Builder command(String command) {
                this.command = command;
                return this;
            }

            /**
             * The ID of the application group.
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * The ID of the instance.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The ID of the process.
             */
            public Builder processId(Long processId) {
                this.processId = processId;
                return this;
            }

            /**
             * The name of the process.
             */
            public Builder processName(String processName) {
                this.processName = processName;
                return this;
            }

            /**
             * The user who launched the process.
             */
            public Builder processUser(String processUser) {
                this.processUser = processUser;
                return this;
            }

            public NodeProcess build() {
                return new NodeProcess(this);
            } 

        } 

    }
    public static class NodeProcesses extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NodeProcess")
        private java.util.List < NodeProcess> nodeProcess;

        private NodeProcesses(Builder builder) {
            this.nodeProcess = builder.nodeProcess;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NodeProcesses create() {
            return builder().build();
        }

        /**
         * @return nodeProcess
         */
        public java.util.List < NodeProcess> getNodeProcess() {
            return this.nodeProcess;
        }

        public static final class Builder {
            private java.util.List < NodeProcess> nodeProcess; 

            /**
             * NodeProcess.
             */
            public Builder nodeProcess(java.util.List < NodeProcess> nodeProcess) {
                this.nodeProcess = nodeProcess;
                return this;
            }

            public NodeProcesses build() {
                return new NodeProcesses(this);
            } 

        } 

    }
}
