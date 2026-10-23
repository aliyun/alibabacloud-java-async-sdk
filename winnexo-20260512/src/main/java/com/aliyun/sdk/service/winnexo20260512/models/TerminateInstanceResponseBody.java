// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.winnexo20260512.models;

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
 * {@link TerminateInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>TerminateInstanceResponseBody</p>
 */
public class TerminateInstanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("instanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("instanceStatus")
    private String instanceStatus;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("stateVersion")
    private Long stateVersion;

    @com.aliyun.core.annotation.NameInMap("terminated")
    private Boolean terminated;

    private TerminateInstanceResponseBody(Builder builder) {
        this.code = builder.code;
        this.instanceId = builder.instanceId;
        this.instanceStatus = builder.instanceStatus;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.stateVersion = builder.stateVersion;
        this.terminated = builder.terminated;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TerminateInstanceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return instanceStatus
     */
    public String getInstanceStatus() {
        return this.instanceStatus;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return stateVersion
     */
    public Long getStateVersion() {
        return this.stateVersion;
    }

    /**
     * @return terminated
     */
    public Boolean getTerminated() {
        return this.terminated;
    }

    public static final class Builder {
        private String code; 
        private String instanceId; 
        private String instanceStatus; 
        private String message; 
        private String requestId; 
        private Long stateVersion; 
        private Boolean terminated; 

        private Builder() {
        } 

        private Builder(TerminateInstanceResponseBody model) {
            this.code = model.code;
            this.instanceId = model.instanceId;
            this.instanceStatus = model.instanceStatus;
            this.message = model.message;
            this.requestId = model.requestId;
            this.stateVersion = model.stateVersion;
            this.terminated = model.terminated;
        } 

        /**
         * <p>The business status code. A value of 200 indicates success.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The physical instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>plan_example</p>
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The status after termination.</p>
         * 
         * <strong>example:</strong>
         * <p>Terminated</p>
         */
        public Builder instanceStatus(String instanceStatus) {
            this.instanceStatus = instanceStatus;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>The requested resource does not exist</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request tracking ID.</p>
         * 
         * <strong>example:</strong>
         * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The state version.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder stateVersion(Long stateVersion) {
            this.stateVersion = stateVersion;
            return this;
        }

        /**
         * <p>Indicates whether the termination was successful. A value of true indicates success. If the termination fails, the error code and message are returned.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder terminated(Boolean terminated) {
            this.terminated = terminated;
            return this;
        }

        public TerminateInstanceResponseBody build() {
            return new TerminateInstanceResponseBody(this);
        } 

    } 

}
