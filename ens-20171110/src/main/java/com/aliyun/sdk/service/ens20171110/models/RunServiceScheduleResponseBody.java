// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RunServiceScheduleResponseBody} extends {@link TeaModel}
 *
 * <p>RunServiceScheduleResponseBody</p>
 */
public class RunServiceScheduleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CommandResults")
    private CommandResults commandResults;

    @com.aliyun.core.annotation.NameInMap("Index")
    private Integer index;

    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("InstanceIp")
    private String instanceIp;

    @com.aliyun.core.annotation.NameInMap("InstancePort")
    private Integer instancePort;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RequestRepeated")
    private String requestRepeated;

    @com.aliyun.core.annotation.NameInMap("TcpPorts")
    private Boolean tcpPorts;

    private RunServiceScheduleResponseBody(Builder builder) {
        this.commandResults = builder.commandResults;
        this.index = builder.index;
        this.instanceId = builder.instanceId;
        this.instanceIp = builder.instanceIp;
        this.instancePort = builder.instancePort;
        this.requestId = builder.requestId;
        this.requestRepeated = builder.requestRepeated;
        this.tcpPorts = builder.tcpPorts;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunServiceScheduleResponseBody create() {
        return builder().build();
    }

    /**
     * @return commandResults
     */
    public CommandResults getCommandResults() {
        return this.commandResults;
    }

    /**
     * @return index
     */
    public Integer getIndex() {
        return this.index;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return instanceIp
     */
    public String getInstanceIp() {
        return this.instanceIp;
    }

    /**
     * @return instancePort
     */
    public Integer getInstancePort() {
        return this.instancePort;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return requestRepeated
     */
    public String getRequestRepeated() {
        return this.requestRepeated;
    }

    /**
     * @return tcpPorts
     */
    public Boolean getTcpPorts() {
        return this.tcpPorts;
    }

    public static final class Builder {
        private CommandResults commandResults; 
        private Integer index; 
        private String instanceId; 
        private String instanceIp; 
        private Integer instancePort; 
        private String requestId; 
        private String requestRepeated; 
        private Boolean tcpPorts; 

        /**
         * The execution results of the commands.
         */
        public Builder commandResults(CommandResults commandResults) {
            this.commandResults = commandResults;
            return this;
        }

        /**
         * The index number of the scheduled virtual device (pod).
         */
        public Builder index(Integer index) {
            this.index = index;
            return this;
        }

        /**
         * The ID of the scheduled instance.
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The IP address of the scheduled instance.
         */
        public Builder instanceIp(String instanceIp) {
            this.instanceIp = instanceIp;
            return this;
        }

        /**
         * The start port of the scheduled instance.
         */
        public Builder instancePort(Integer instancePort) {
            this.instancePort = instancePort;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request is repeated. This parameter is not returned if ServcieAction is set to Console.
         */
        public Builder requestRepeated(String requestRepeated) {
            this.requestRepeated = requestRepeated;
            return this;
        }

        /**
         * The TCP port range of the scheduled instance or container. The value is in the ${from}-$-{to} format. Example: 80-88.
         */
        public Builder tcpPorts(Boolean tcpPorts) {
            this.tcpPorts = tcpPorts;
            return this;
        }

        public RunServiceScheduleResponseBody build() {
            return new RunServiceScheduleResponseBody(this);
        } 

    } 

    public static class CommandResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Command")
        private String command;

        @com.aliyun.core.annotation.NameInMap("ContainerName")
        private String containerName;

        @com.aliyun.core.annotation.NameInMap("ResultMsg")
        private String resultMsg;

        private CommandResult(Builder builder) {
            this.command = builder.command;
            this.containerName = builder.containerName;
            this.resultMsg = builder.resultMsg;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CommandResult create() {
            return builder().build();
        }

        /**
         * @return command
         */
        public String getCommand() {
            return this.command;
        }

        /**
         * @return containerName
         */
        public String getContainerName() {
            return this.containerName;
        }

        /**
         * @return resultMsg
         */
        public String getResultMsg() {
            return this.resultMsg;
        }

        public static final class Builder {
            private String command; 
            private String containerName; 
            private String resultMsg; 

            /**
             * The command.
             */
            public Builder command(String command) {
                this.command = command;
                return this;
            }

            /**
             * The name of the container.
             */
            public Builder containerName(String containerName) {
                this.containerName = containerName;
                return this;
            }

            /**
             * The execution result of the command.
             */
            public Builder resultMsg(String resultMsg) {
                this.resultMsg = resultMsg;
                return this;
            }

            public CommandResult build() {
                return new CommandResult(this);
            } 

        } 

    }
    public static class CommandResults extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CommandResult")
        private java.util.List < CommandResult> commandResult;

        private CommandResults(Builder builder) {
            this.commandResult = builder.commandResult;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CommandResults create() {
            return builder().build();
        }

        /**
         * @return commandResult
         */
        public java.util.List < CommandResult> getCommandResult() {
            return this.commandResult;
        }

        public static final class Builder {
            private java.util.List < CommandResult> commandResult; 

            /**
             * CommandResult.
             */
            public Builder commandResult(java.util.List < CommandResult> commandResult) {
                this.commandResult = commandResult;
                return this;
            }

            public CommandResults build() {
                return new CommandResults(this);
            } 

        } 

    }
}
