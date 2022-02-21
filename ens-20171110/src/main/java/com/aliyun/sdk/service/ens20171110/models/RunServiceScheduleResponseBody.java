// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RunServiceScheduleResponseBody} extends {@link TeaModel}
 *
 * <p>RunServiceScheduleResponseBody</p>
 */
public class RunServiceScheduleResponseBody extends TeaModel {
    @NameInMap("CommandResults")
    private CommandResults commandResults;

    @NameInMap("Index")
    private Integer index;

    @NameInMap("InstanceId")
    private String instanceId;

    @NameInMap("InstanceIp")
    private String instanceIp;

    @NameInMap("InstancePort")
    private Integer instancePort;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("RequestRepeated")
    private String requestRepeated;

    @NameInMap("TcpPorts")
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
         * CommandResults.
         */
        public Builder commandResults(CommandResults commandResults) {
            this.commandResults = commandResults;
            return this;
        }

        /**
         * Index.
         */
        public Builder index(Integer index) {
            this.index = index;
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
         * InstanceIp.
         */
        public Builder instanceIp(String instanceIp) {
            this.instanceIp = instanceIp;
            return this;
        }

        /**
         * InstancePort.
         */
        public Builder instancePort(Integer instancePort) {
            this.instancePort = instancePort;
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
         * RequestRepeated.
         */
        public Builder requestRepeated(String requestRepeated) {
            this.requestRepeated = requestRepeated;
            return this;
        }

        /**
         * TcpPorts.
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
        @NameInMap("Command")
        private String command;

        @NameInMap("ContainerName")
        private String containerName;

        @NameInMap("ResultMsg")
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
             * Command.
             */
            public Builder command(String command) {
                this.command = command;
                return this;
            }

            /**
             * ContainerName.
             */
            public Builder containerName(String containerName) {
                this.containerName = containerName;
                return this;
            }

            /**
             * ResultMsg.
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
        @NameInMap("CommandResult")
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
