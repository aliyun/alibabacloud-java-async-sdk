// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.webplus20190320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAppEnvInstanceHealthResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAppEnvInstanceHealthResponseBody</p>
 */
public class DescribeAppEnvInstanceHealthResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("EnvInstanceHealth")
    private EnvInstanceHealth envInstanceHealth;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeAppEnvInstanceHealthResponseBody(Builder builder) {
        this.code = builder.code;
        this.envInstanceHealth = builder.envInstanceHealth;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAppEnvInstanceHealthResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return envInstanceHealth
     */
    public EnvInstanceHealth getEnvInstanceHealth() {
        return this.envInstanceHealth;
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
        private EnvInstanceHealth envInstanceHealth; 
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
         * EnvInstanceHealth.
         */
        public Builder envInstanceHealth(EnvInstanceHealth envInstanceHealth) {
            this.envInstanceHealth = envInstanceHealth;
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

        public DescribeAppEnvInstanceHealthResponseBody build() {
            return new DescribeAppEnvInstanceHealthResponseBody(this);
        } 

    } 

    public static class InstanceHealth extends TeaModel {
        @NameInMap("AgentStatus")
        private String agentStatus;

        @NameInMap("AppStatus")
        private String appStatus;

        @NameInMap("DisconnectedTime")
        private String disconnectedTime;

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
        public String getDisconnectedTime() {
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
            private String disconnectedTime; 
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
            public Builder disconnectedTime(String disconnectedTime) {
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
    public static class InstanceHealthList extends TeaModel {
        @NameInMap("InstanceHealth")
        private java.util.List < InstanceHealth> instanceHealth;

        private InstanceHealthList(Builder builder) {
            this.instanceHealth = builder.instanceHealth;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceHealthList create() {
            return builder().build();
        }

        /**
         * @return instanceHealth
         */
        public java.util.List < InstanceHealth> getInstanceHealth() {
            return this.instanceHealth;
        }

        public static final class Builder {
            private java.util.List < InstanceHealth> instanceHealth; 

            /**
             * InstanceHealth.
             */
            public Builder instanceHealth(java.util.List < InstanceHealth> instanceHealth) {
                this.instanceHealth = instanceHealth;
                return this;
            }

            public InstanceHealthList build() {
                return new InstanceHealthList(this);
            } 

        } 

    }
    public static class EnvInstanceHealth extends TeaModel {
        @NameInMap("EnableHealthCheck")
        private Boolean enableHealthCheck;

        @NameInMap("EnvId")
        private String envId;

        @NameInMap("EnvName")
        private String envName;

        @NameInMap("InstanceHealthList")
        private InstanceHealthList instanceHealthList;

        private EnvInstanceHealth(Builder builder) {
            this.enableHealthCheck = builder.enableHealthCheck;
            this.envId = builder.envId;
            this.envName = builder.envName;
            this.instanceHealthList = builder.instanceHealthList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EnvInstanceHealth create() {
            return builder().build();
        }

        /**
         * @return enableHealthCheck
         */
        public Boolean getEnableHealthCheck() {
            return this.enableHealthCheck;
        }

        /**
         * @return envId
         */
        public String getEnvId() {
            return this.envId;
        }

        /**
         * @return envName
         */
        public String getEnvName() {
            return this.envName;
        }

        /**
         * @return instanceHealthList
         */
        public InstanceHealthList getInstanceHealthList() {
            return this.instanceHealthList;
        }

        public static final class Builder {
            private Boolean enableHealthCheck; 
            private String envId; 
            private String envName; 
            private InstanceHealthList instanceHealthList; 

            /**
             * EnableHealthCheck.
             */
            public Builder enableHealthCheck(Boolean enableHealthCheck) {
                this.enableHealthCheck = enableHealthCheck;
                return this;
            }

            /**
             * EnvId.
             */
            public Builder envId(String envId) {
                this.envId = envId;
                return this;
            }

            /**
             * EnvName.
             */
            public Builder envName(String envName) {
                this.envName = envName;
                return this;
            }

            /**
             * InstanceHealthList.
             */
            public Builder instanceHealthList(InstanceHealthList instanceHealthList) {
                this.instanceHealthList = instanceHealthList;
                return this;
            }

            public EnvInstanceHealth build() {
                return new EnvInstanceHealth(this);
            } 

        } 

    }
}
