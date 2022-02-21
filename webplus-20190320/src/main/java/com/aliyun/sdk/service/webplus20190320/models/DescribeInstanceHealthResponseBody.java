// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.webplus20190320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstanceHealthResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceHealthResponseBody</p>
 */
public class DescribeInstanceHealthResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("InstanceHealth")
    private InstanceHealth instanceHealth;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeInstanceHealthResponseBody(Builder builder) {
        this.code = builder.code;
        this.instanceHealth = builder.instanceHealth;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceHealthResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return instanceHealth
     */
    public InstanceHealth getInstanceHealth() {
        return this.instanceHealth;
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

    public static final class Builder {
        private String code; 
        private InstanceHealth instanceHealth; 
        private String message; 
        private String requestId; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * InstanceHealth.
         */
        public Builder instanceHealth(InstanceHealth instanceHealth) {
            this.instanceHealth = instanceHealth;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeInstanceHealthResponseBody build() {
            return new DescribeInstanceHealthResponseBody(this);
        } 

    } 

    public static class InstanceHealth extends TeaModel {
        @NameInMap("AgentStatus")
        private String agentStatus;

        @NameInMap("AppStatus")
        private String appStatus;

        @NameInMap("DisconnectedTime")
        private Long disconnectedTime;

        @NameInMap("InstanceId")
        private String instanceId;

        private InstanceHealth(Builder builder) {
            this.agentStatus = builder.agentStatus;
            this.appStatus = builder.appStatus;
            this.disconnectedTime = builder.disconnectedTime;
            this.instanceId = builder.instanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceHealth create() {
            return builder().build();
        }

        /**
         * @return agentStatus
         */
        public String getAgentStatus() {
            return this.agentStatus;
        }

        /**
         * @return appStatus
         */
        public String getAppStatus() {
            return this.appStatus;
        }

        /**
         * @return disconnectedTime
         */
        public Long getDisconnectedTime() {
            return this.disconnectedTime;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        public static final class Builder {
            private String agentStatus; 
            private String appStatus; 
            private Long disconnectedTime; 
            private String instanceId; 

            /**
             * AgentStatus.
             */
            public Builder agentStatus(String agentStatus) {
                this.agentStatus = agentStatus;
                return this;
            }

            /**
             * AppStatus.
             */
            public Builder appStatus(String appStatus) {
                this.appStatus = appStatus;
                return this;
            }

            /**
             * DisconnectedTime.
             */
            public Builder disconnectedTime(Long disconnectedTime) {
                this.disconnectedTime = disconnectedTime;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            public InstanceHealth build() {
                return new InstanceHealth(this);
            } 

        } 

    }
}
