// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link RestartPolarClawGatewayResponseBody} extends {@link TeaModel}
 *
 * <p>RestartPolarClawGatewayResponseBody</p>
 */
public class RestartPolarClawGatewayResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    private String applicationId;

    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("DowntimeMs")
    private Long downtimeMs;

    @com.aliyun.core.annotation.NameInMap("GatewayVersion")
    private String gatewayVersion;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Mode")
    private String mode;

    @com.aliyun.core.annotation.NameInMap("Ok")
    private Boolean ok;

    @com.aliyun.core.annotation.NameInMap("Operation")
    private String operation;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Restarted")
    private Boolean restarted;

    @com.aliyun.core.annotation.NameInMap("State")
    private String state;

    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    private RestartPolarClawGatewayResponseBody(Builder builder) {
        this.applicationId = builder.applicationId;
        this.code = builder.code;
        this.downtimeMs = builder.downtimeMs;
        this.gatewayVersion = builder.gatewayVersion;
        this.message = builder.message;
        this.mode = builder.mode;
        this.ok = builder.ok;
        this.operation = builder.operation;
        this.requestId = builder.requestId;
        this.restarted = builder.restarted;
        this.state = builder.state;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RestartPolarClawGatewayResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationId
     */
    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return downtimeMs
     */
    public Long getDowntimeMs() {
        return this.downtimeMs;
    }

    /**
     * @return gatewayVersion
     */
    public String getGatewayVersion() {
        return this.gatewayVersion;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return mode
     */
    public String getMode() {
        return this.mode;
    }

    /**
     * @return ok
     */
    public Boolean getOk() {
        return this.ok;
    }

    /**
     * @return operation
     */
    public String getOperation() {
        return this.operation;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return restarted
     */
    public Boolean getRestarted() {
        return this.restarted;
    }

    /**
     * @return state
     */
    public String getState() {
        return this.state;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder {
        private String applicationId; 
        private Integer code; 
        private Long downtimeMs; 
        private String gatewayVersion; 
        private String message; 
        private String mode; 
        private Boolean ok; 
        private String operation; 
        private String requestId; 
        private Boolean restarted; 
        private String state; 
        private String taskId; 

        private Builder() {
        } 

        private Builder(RestartPolarClawGatewayResponseBody model) {
            this.applicationId = model.applicationId;
            this.code = model.code;
            this.downtimeMs = model.downtimeMs;
            this.gatewayVersion = model.gatewayVersion;
            this.message = model.message;
            this.mode = model.mode;
            this.ok = model.ok;
            this.operation = model.operation;
            this.requestId = model.requestId;
            this.restarted = model.restarted;
            this.state = model.state;
            this.taskId = model.taskId;
        } 

        /**
         * ApplicationId.
         */
        public Builder applicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * DowntimeMs.
         */
        public Builder downtimeMs(Long downtimeMs) {
            this.downtimeMs = downtimeMs;
            return this;
        }

        /**
         * GatewayVersion.
         */
        public Builder gatewayVersion(String gatewayVersion) {
            this.gatewayVersion = gatewayVersion;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * Mode.
         */
        public Builder mode(String mode) {
            this.mode = mode;
            return this;
        }

        /**
         * Ok.
         */
        public Builder ok(Boolean ok) {
            this.ok = ok;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Restarted.
         */
        public Builder restarted(Boolean restarted) {
            this.restarted = restarted;
            return this;
        }

        /**
         * State.
         */
        public Builder state(String state) {
            this.state = state;
            return this;
        }

        /**
         * TaskId.
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        public RestartPolarClawGatewayResponseBody build() {
            return new RestartPolarClawGatewayResponseBody(this);
        } 

    } 

}
