// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The HTTP status code.</p>
         * <blockquote>
         * <p> The value 200 indicates that the call was successful.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>The specified resource is not found.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The information about the processes.</p>
         */
        public Builder nodeProcesses(NodeProcesses nodeProcesses) {
            this.nodeProcesses = nodeProcesses;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>C11C0E85-6862-4F25-8D66-D6A5E0882984</p>
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
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeMonitoringAgentProcessesResponseBody build() {
            return new DescribeMonitoringAgentProcessesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeMonitoringAgentProcessesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMonitoringAgentProcessesResponseBody</p>
     */
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
             * <p>The command used to obtain the number of processes. Valid value: <code>number</code>.</p>
             * <blockquote>
             * <p> The <code>number</code> command obtains the number of processes that match the condition.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>number</p>
             */
            public Builder command(String command) {
                this.command = command;
                return this;
            }

            /**
             * <p>The ID of the application group.</p>
             * 
             * <strong>example:</strong>
             * <p>3619****</p>
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * <p>The ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>i-hp3hl3cx1pbahzy8****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The ID of the process.</p>
             * 
             * <strong>example:</strong>
             * <p>234567</p>
             */
            public Builder processId(Long processId) {
                this.processId = processId;
                return this;
            }

            /**
             * <p>The name of the process.</p>
             * 
             * <strong>example:</strong>
             * <p>Nginx</p>
             */
            public Builder processName(String processName) {
                this.processName = processName;
                return this;
            }

            /**
             * <p>The user who launched the process.</p>
             * 
             * <strong>example:</strong>
             * <p>alice</p>
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
    /**
     * 
     * {@link DescribeMonitoringAgentProcessesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMonitoringAgentProcessesResponseBody</p>
     */
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
