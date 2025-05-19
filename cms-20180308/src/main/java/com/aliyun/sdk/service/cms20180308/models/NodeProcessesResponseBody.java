// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20180308.models;

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
 * {@link NodeProcessesResponseBody} extends {@link TeaModel}
 *
 * <p>NodeProcessesResponseBody</p>
 */
public class NodeProcessesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private Integer errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("NodeProcesses")
    private NodeProcesses nodeProcesses;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private NodeProcessesResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.nodeProcesses = builder.nodeProcesses;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static NodeProcessesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return errorCode
     */
    public Integer getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
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
        private Integer errorCode; 
        private String errorMessage; 
        private NodeProcesses nodeProcesses; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(NodeProcessesResponseBody model) {
            this.errorCode = model.errorCode;
            this.errorMessage = model.errorMessage;
            this.nodeProcesses = model.nodeProcesses;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * ErrorCode.
         */
        public Builder errorCode(Integer errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * NodeProcesses.
         */
        public Builder nodeProcesses(NodeProcesses nodeProcesses) {
            this.nodeProcesses = nodeProcesses;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public NodeProcessesResponseBody build() {
            return new NodeProcessesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link NodeProcessesResponseBody} extends {@link TeaModel}
     *
     * <p>NodeProcessesResponseBody</p>
     */
    public static class NodeProcess extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Command")
        private String command;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ProcessName")
        private String processName;

        @com.aliyun.core.annotation.NameInMap("ProcessUser")
        private String processUser;

        private NodeProcess(Builder builder) {
            this.command = builder.command;
            this.id = builder.id;
            this.instanceId = builder.instanceId;
            this.name = builder.name;
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
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
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
            private Long id; 
            private String instanceId; 
            private String name; 
            private String processName; 
            private String processUser; 

            private Builder() {
            } 

            private Builder(NodeProcess model) {
                this.command = model.command;
                this.id = model.id;
                this.instanceId = model.instanceId;
                this.name = model.name;
                this.processName = model.processName;
                this.processUser = model.processUser;
            } 

            /**
             * Command.
             */
            public Builder command(String command) {
                this.command = command;
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
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * ProcessName.
             */
            public Builder processName(String processName) {
                this.processName = processName;
                return this;
            }

            /**
             * ProcessUser.
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
     * {@link NodeProcessesResponseBody} extends {@link TeaModel}
     *
     * <p>NodeProcessesResponseBody</p>
     */
    public static class NodeProcesses extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NodeProcess")
        private java.util.List<NodeProcess> nodeProcess;

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
        public java.util.List<NodeProcess> getNodeProcess() {
            return this.nodeProcess;
        }

        public static final class Builder {
            private java.util.List<NodeProcess> nodeProcess; 

            private Builder() {
            } 

            private Builder(NodeProcesses model) {
                this.nodeProcess = model.nodeProcess;
            } 

            /**
             * NodeProcess.
             */
            public Builder nodeProcess(java.util.List<NodeProcess> nodeProcess) {
                this.nodeProcess = nodeProcess;
                return this;
            }

            public NodeProcesses build() {
                return new NodeProcesses(this);
            } 

        } 

    }
}
