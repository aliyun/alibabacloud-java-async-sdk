// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
         * <p>The execution results of the commands.</p>
         */
        public Builder commandResults(CommandResults commandResults) {
            this.commandResults = commandResults;
            return this;
        }

        /**
         * <p>The index number of the scheduled virtual device (pod).</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder index(Integer index) {
            this.index = index;
            return this;
        }

        /**
         * <p>The ID of the scheduled instance.</p>
         * 
         * <strong>example:</strong>
         * <p>i-5qvji3mom4ec013dyygmtxlkj</p>
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The IP address of the scheduled instance.</p>
         * 
         * <strong>example:</strong>
         * <p>172.16.246.11</p>
         */
        public Builder instanceIp(String instanceIp) {
            this.instanceIp = instanceIp;
            return this;
        }

        /**
         * <p>The start port of the scheduled instance.</p>
         * 
         * <strong>example:</strong>
         * <p>1024</p>
         */
        public Builder instancePort(Integer instancePort) {
            this.instancePort = instancePort;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is repeated. This parameter is not returned if ServcieAction is set to Console.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder requestRepeated(String requestRepeated) {
            this.requestRepeated = requestRepeated;
            return this;
        }

        /**
         * <p>The TCP port range of the scheduled instance or container. The value is in the ${from}-$-{to} format. Example: 80-88.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;80-88&quot;</p>
         */
        public Builder tcpPorts(Boolean tcpPorts) {
            this.tcpPorts = tcpPorts;
            return this;
        }

        public RunServiceScheduleResponseBody build() {
            return new RunServiceScheduleResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link RunServiceScheduleResponseBody} extends {@link TeaModel}
     *
     * <p>RunServiceScheduleResponseBody</p>
     */
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
             * <p>The command.</p>
             * 
             * <strong>example:</strong>
             * <p>ls -l /data</p>
             */
            public Builder command(String command) {
                this.command = command;
                return this;
            }

            /**
             * <p>The name of the container.</p>
             * 
             * <strong>example:</strong>
             * <p>android</p>
             */
            public Builder containerName(String containerName) {
                this.containerName = containerName;
                return this;
            }

            /**
             * <p>The execution result of the command.</p>
             * 
             * <strong>example:</strong>
             * <p>success</p>
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
    /**
     * 
     * {@link RunServiceScheduleResponseBody} extends {@link TeaModel}
     *
     * <p>RunServiceScheduleResponseBody</p>
     */
    public static class CommandResults extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CommandResult")
        private java.util.List<CommandResult> commandResult;

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
        public java.util.List<CommandResult> getCommandResult() {
            return this.commandResult;
        }

        public static final class Builder {
            private java.util.List<CommandResult> commandResult; 

            /**
             * CommandResult.
             */
            public Builder commandResult(java.util.List<CommandResult> commandResult) {
                this.commandResult = commandResult;
                return this;
            }

            public CommandResults build() {
                return new CommandResults(this);
            } 

        } 

    }
}
