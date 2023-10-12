// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CliTask} extends {@link TeaModel}
 *
 * <p>CliTask</p>
 */
public class CliTask extends TeaModel {
    @NameInMap("AgentIp")
    private String agentIp;

    @NameInMap("CliTaskId")
    private String cliTaskId;

    @NameInMap("Command")
    private String command;

    @NameInMap("DeviceId")
    private String deviceId;

    @NameInMap("GmtCreate")
    private String gmtCreate;

    @NameInMap("GmtModify")
    private String gmtModify;

    @NameInMap("Output")
    private String output;

    @NameInMap("Protocol")
    private String protocol;

    @NameInMap("ResponseCode")
    private String responseCode;

    @NameInMap("Result")
    private String result;

    @NameInMap("SessionId")
    private String sessionId;

    @NameInMap("Status")
    private String status;

    @NameInMap("Timeout")
    private Integer timeout;

    private CliTask(Builder builder) {
        this.agentIp = builder.agentIp;
        this.cliTaskId = builder.cliTaskId;
        this.command = builder.command;
        this.deviceId = builder.deviceId;
        this.gmtCreate = builder.gmtCreate;
        this.gmtModify = builder.gmtModify;
        this.output = builder.output;
        this.protocol = builder.protocol;
        this.responseCode = builder.responseCode;
        this.result = builder.result;
        this.sessionId = builder.sessionId;
        this.status = builder.status;
        this.timeout = builder.timeout;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CliTask create() {
        return builder().build();
    }

    /**
     * @return agentIp
     */
    public String getAgentIp() {
        return this.agentIp;
    }

    /**
     * @return cliTaskId
     */
    public String getCliTaskId() {
        return this.cliTaskId;
    }

    /**
     * @return command
     */
    public String getCommand() {
        return this.command;
    }

    /**
     * @return deviceId
     */
    public String getDeviceId() {
        return this.deviceId;
    }

    /**
     * @return gmtCreate
     */
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    /**
     * @return gmtModify
     */
    public String getGmtModify() {
        return this.gmtModify;
    }

    /**
     * @return output
     */
    public String getOutput() {
        return this.output;
    }

    /**
     * @return protocol
     */
    public String getProtocol() {
        return this.protocol;
    }

    /**
     * @return responseCode
     */
    public String getResponseCode() {
        return this.responseCode;
    }

    /**
     * @return result
     */
    public String getResult() {
        return this.result;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return timeout
     */
    public Integer getTimeout() {
        return this.timeout;
    }

    public static final class Builder {
        private String agentIp; 
        private String cliTaskId; 
        private String command; 
        private String deviceId; 
        private String gmtCreate; 
        private String gmtModify; 
        private String output; 
        private String protocol; 
        private String responseCode; 
        private String result; 
        private String sessionId; 
        private String status; 
        private Integer timeout; 

        /**
         * AgentIp.
         */
        public Builder agentIp(String agentIp) {
            this.agentIp = agentIp;
            return this;
        }

        /**
         * CliTaskId.
         */
        public Builder cliTaskId(String cliTaskId) {
            this.cliTaskId = cliTaskId;
            return this;
        }

        /**
         * Command.
         */
        public Builder command(String command) {
            this.command = command;
            return this;
        }

        /**
         * DeviceId.
         */
        public Builder deviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }

        /**
         * GmtCreate.
         */
        public Builder gmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * GmtModify.
         */
        public Builder gmtModify(String gmtModify) {
            this.gmtModify = gmtModify;
            return this;
        }

        /**
         * Output.
         */
        public Builder output(String output) {
            this.output = output;
            return this;
        }

        /**
         * Protocol.
         */
        public Builder protocol(String protocol) {
            this.protocol = protocol;
            return this;
        }

        /**
         * ResponseCode.
         */
        public Builder responseCode(String responseCode) {
            this.responseCode = responseCode;
            return this;
        }

        /**
         * Result.
         */
        public Builder result(String result) {
            this.result = result;
            return this;
        }

        /**
         * SessionId.
         */
        public Builder sessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * Timeout.
         */
        public Builder timeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }

        public CliTask build() {
            return new CliTask(this);
        } 

    } 

}
