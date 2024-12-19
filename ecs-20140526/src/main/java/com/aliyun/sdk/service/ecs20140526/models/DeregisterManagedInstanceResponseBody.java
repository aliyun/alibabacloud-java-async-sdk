// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

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
 * {@link DeregisterManagedInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>DeregisterManagedInstanceResponseBody</p>
 */
public class DeregisterManagedInstanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Instance")
    private Instance instance;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DeregisterManagedInstanceResponseBody(Builder builder) {
        this.instance = builder.instance;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeregisterManagedInstanceResponseBody create() {
        return builder().build();
    }

    /**
     * @return instance
     */
    public Instance getInstance() {
        return this.instance;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Instance instance; 
        private String requestId; 

        /**
         * <p>The managed instance.</p>
         */
        public Builder instance(Instance instance) {
            this.instance = instance;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4ECEEE12-56F1-4FBC-9AB1-890F74942176</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeregisterManagedInstanceResponseBody build() {
            return new DeregisterManagedInstanceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DeregisterManagedInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>DeregisterManagedInstanceResponseBody</p>
     */
    public static class Instance extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActivationId")
        private String activationId;

        @com.aliyun.core.annotation.NameInMap("AgentVersion")
        private String agentVersion;

        @com.aliyun.core.annotation.NameInMap("Hostname")
        private String hostname;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("InternetIp")
        private String internetIp;

        @com.aliyun.core.annotation.NameInMap("IntranetIp")
        private String intranetIp;

        @com.aliyun.core.annotation.NameInMap("InvocationCount")
        private Long invocationCount;

        @com.aliyun.core.annotation.NameInMap("LastInvokedTime")
        private String lastInvokedTime;

        @com.aliyun.core.annotation.NameInMap("MachineId")
        private String machineId;

        @com.aliyun.core.annotation.NameInMap("OsType")
        private String osType;

        @com.aliyun.core.annotation.NameInMap("OsVersion")
        private String osVersion;

        @com.aliyun.core.annotation.NameInMap("RegistrationTime")
        private String registrationTime;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        private Instance(Builder builder) {
            this.activationId = builder.activationId;
            this.agentVersion = builder.agentVersion;
            this.hostname = builder.hostname;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.internetIp = builder.internetIp;
            this.intranetIp = builder.intranetIp;
            this.invocationCount = builder.invocationCount;
            this.lastInvokedTime = builder.lastInvokedTime;
            this.machineId = builder.machineId;
            this.osType = builder.osType;
            this.osVersion = builder.osVersion;
            this.registrationTime = builder.registrationTime;
            this.resourceGroupId = builder.resourceGroupId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Instance create() {
            return builder().build();
        }

        /**
         * @return activationId
         */
        public String getActivationId() {
            return this.activationId;
        }

        /**
         * @return agentVersion
         */
        public String getAgentVersion() {
            return this.agentVersion;
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
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return internetIp
         */
        public String getInternetIp() {
            return this.internetIp;
        }

        /**
         * @return intranetIp
         */
        public String getIntranetIp() {
            return this.intranetIp;
        }

        /**
         * @return invocationCount
         */
        public Long getInvocationCount() {
            return this.invocationCount;
        }

        /**
         * @return lastInvokedTime
         */
        public String getLastInvokedTime() {
            return this.lastInvokedTime;
        }

        /**
         * @return machineId
         */
        public String getMachineId() {
            return this.machineId;
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
         * @return registrationTime
         */
        public String getRegistrationTime() {
            return this.registrationTime;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public static final class Builder {
            private String activationId; 
            private String agentVersion; 
            private String hostname; 
            private String instanceId; 
            private String instanceName; 
            private String internetIp; 
            private String intranetIp; 
            private Long invocationCount; 
            private String lastInvokedTime; 
            private String machineId; 
            private String osType; 
            private String osVersion; 
            private String registrationTime; 
            private String resourceGroupId; 

            /**
             * <p>The activation code ID.</p>
             * 
             * <strong>example:</strong>
             * <p>4ECEEE12-56F1-4FBC-9AB1-890F7494****</p>
             */
            public Builder activationId(String activationId) {
                this.activationId = activationId;
                return this;
            }

            /**
             * <p>The version number of Cloud Assistant Agent.</p>
             * 
             * <strong>example:</strong>
             * <p>2.2.0.102</p>
             */
            public Builder agentVersion(String agentVersion) {
                this.agentVersion = agentVersion;
                return this;
            }

            /**
             * <p>The hostname of the managed instance.</p>
             * 
             * <strong>example:</strong>
             * <p>test-Hostname</p>
             */
            public Builder hostname(String hostname) {
                this.hostname = hostname;
                return this;
            }

            /**
             * <p>The managed instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>mi-hz01axdfas****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The name of the managed instance.</p>
             * 
             * <strong>example:</strong>
             * <p>test-InstanceName-001</p>
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * <p>The public IP address of the managed instance.</p>
             * 
             * <strong>example:</strong>
             * <p><code>47.8.**.**</code></p>
             */
            public Builder internetIp(String internetIp) {
                this.internetIp = internetIp;
                return this;
            }

            /**
             * <p>The internal IP address of the managed instance.</p>
             * 
             * <strong>example:</strong>
             * <p><code>10.0.**.**</code></p>
             */
            public Builder intranetIp(String intranetIp) {
                this.intranetIp = intranetIp;
                return this;
            }

            /**
             * <p>The number of times that Cloud Assistant tasks were executed on the managed instance.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder invocationCount(Long invocationCount) {
                this.invocationCount = invocationCount;
                return this;
            }

            /**
             * <p>The time when the Cloud Assistant task was last executed.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-01-20T09:00:40Z</p>
             */
            public Builder lastInvokedTime(String lastInvokedTime) {
                this.lastInvokedTime = lastInvokedTime;
                return this;
            }

            /**
             * <p>The machine code of the managed instance.</p>
             * 
             * <strong>example:</strong>
             * <p>e03231b37ab14e53b5795ad625fc****</p>
             */
            public Builder machineId(String machineId) {
                this.machineId = machineId;
                return this;
            }

            /**
             * <p>The operating system type of the managed instance.</p>
             * 
             * <strong>example:</strong>
             * <p>linux</p>
             */
            public Builder osType(String osType) {
                this.osType = osType;
                return this;
            }

            /**
             * <p>The version information about the operating system.</p>
             * 
             * <strong>example:</strong>
             * <p>Linux_#38~18.04.1-Ubuntu SMP Wed Jan 6 18:26:30 UTC 2021_x86_64</p>
             */
            public Builder osVersion(String osVersion) {
                this.osVersion = osVersion;
                return this;
            }

            /**
             * <p>The time when the managed instance was registered.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-01-20T08:57:56Z</p>
             */
            public Builder registrationTime(String registrationTime) {
                this.registrationTime = registrationTime;
                return this;
            }

            /**
             * <p>The ID of the resource group to which the managed instance belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-123******</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            public Instance build() {
                return new Instance(this);
            } 

        } 

    }
}
