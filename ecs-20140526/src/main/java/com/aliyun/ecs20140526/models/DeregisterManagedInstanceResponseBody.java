// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeregisterManagedInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>DeregisterManagedInstanceResponseBody</p>
 */
public class DeregisterManagedInstanceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Instance")
    private Instance instance;

    private DeregisterManagedInstanceResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.instance = builder.instance;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeregisterManagedInstanceResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return instance
     */
    public Instance getInstance() {
        return this.instance;
    }

    public static final class Builder {
        private String requestId; 
        private Instance instance; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * A collection of managed instance information.
         */
        public Builder instance(Instance instance) {
            this.instance = instance;
            return this;
        }

        public DeregisterManagedInstanceResponseBody build() {
            return new DeregisterManagedInstanceResponseBody(this);
        } 

    } 

    public static class Instance extends TeaModel {
        @NameInMap("LastInvokedTime")
        private String lastInvokedTime;

        @NameInMap("InternetIp")
        private String internetIp;

        @NameInMap("Hostname")
        private String hostname;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("ActivationId")
        private String activationId;

        @NameInMap("IntranetIp")
        private String intranetIp;

        @NameInMap("AgentVersion")
        private String agentVersion;

        @NameInMap("RegistrationTime")
        private String registrationTime;

        @NameInMap("InstanceName")
        private String instanceName;

        @NameInMap("OsType")
        private String osType;

        @NameInMap("OsVersion")
        private String osVersion;

        @NameInMap("InvocationCount")
        private Long invocationCount;

        @NameInMap("MachineId")
        private String machineId;

        private Instance(Builder builder) {
            this.lastInvokedTime = builder.lastInvokedTime;
            this.internetIp = builder.internetIp;
            this.hostname = builder.hostname;
            this.instanceId = builder.instanceId;
            this.activationId = builder.activationId;
            this.intranetIp = builder.intranetIp;
            this.agentVersion = builder.agentVersion;
            this.registrationTime = builder.registrationTime;
            this.instanceName = builder.instanceName;
            this.osType = builder.osType;
            this.osVersion = builder.osVersion;
            this.invocationCount = builder.invocationCount;
            this.machineId = builder.machineId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Instance create() {
            return builder().build();
        }

        /**
         * @return lastInvokedTime
         */
        public String getLastInvokedTime() {
            return this.lastInvokedTime;
        }

        /**
         * @return internetIp
         */
        public String getInternetIp() {
            return this.internetIp;
        }

        /**
         * @return hostname
         */
        public String getHostname() {
            return this.hostname;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return activationId
         */
        public String getActivationId() {
            return this.activationId;
        }

        /**
         * @return intranetIp
         */
        public String getIntranetIp() {
            return this.intranetIp;
        }

        /**
         * @return agentVersion
         */
        public String getAgentVersion() {
            return this.agentVersion;
        }

        /**
         * @return registrationTime
         */
        public String getRegistrationTime() {
            return this.registrationTime;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return osType
         */
        public String getOsType() {
            return this.osType;
        }

        /**
         * @return osVersion
         */
        public String getOsVersion() {
            return this.osVersion;
        }

        /**
         * @return invocationCount
         */
        public Long getInvocationCount() {
            return this.invocationCount;
        }

        /**
         * @return machineId
         */
        public String getMachineId() {
            return this.machineId;
        }

        public static final class Builder {
            private String lastInvokedTime; 
            private String internetIp; 
            private String hostname; 
            private String instanceId; 
            private String activationId; 
            private String intranetIp; 
            private String agentVersion; 
            private String registrationTime; 
            private String instanceName; 
            private String osType; 
            private String osVersion; 
            private Long invocationCount; 
            private String machineId; 

            /**
             * The time when the cloud assistant task was last executed.
             */
            public Builder lastInvokedTime(String lastInvokedTime) {
                this.lastInvokedTime = lastInvokedTime;
                return this;
            }

            /**
             * The public IP address of the managed instance.
             */
            public Builder internetIp(String internetIp) {
                this.internetIp = internetIp;
                return this;
            }

            /**
             * The hostname of the managed instance.
             */
            public Builder hostname(String hostname) {
                this.hostname = hostname;
                return this;
            }

            /**
             * The ID of the managed instance.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * Activation Code ID.
             */
            public Builder activationId(String activationId) {
                this.activationId = activationId;
                return this;
            }

            /**
             * The internal IP address of the managed instance.
             */
            public Builder intranetIp(String intranetIp) {
                this.intranetIp = intranetIp;
                return this;
            }

            /**
             * The version number of the cloud assistant client.
             */
            public Builder agentVersion(String agentVersion) {
                this.agentVersion = agentVersion;
                return this;
            }

            /**
             * The registration time of the managed instance.
             */
            public Builder registrationTime(String registrationTime) {
                this.registrationTime = registrationTime;
                return this;
            }

            /**
             * The name of the managed instance.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * The operating system of the managed instance.
             */
            public Builder osType(String osType) {
                this.osType = osType;
                return this;
            }

            /**
             * The version of the operating system.
             */
            public Builder osVersion(String osVersion) {
                this.osVersion = osVersion;
                return this;
            }

            /**
             * The number of times that the managed instance performs cloud assistant tasks.
             */
            public Builder invocationCount(Long invocationCount) {
                this.invocationCount = invocationCount;
                return this;
            }

            /**
             * The machine code of the managed instance.
             */
            public Builder machineId(String machineId) {
                this.machineId = machineId;
                return this;
            }

            public Instance build() {
                return new Instance(this);
            } 

        } 

    }
}
