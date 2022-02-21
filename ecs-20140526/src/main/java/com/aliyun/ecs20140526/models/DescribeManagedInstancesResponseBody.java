// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeManagedInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeManagedInstancesResponseBody</p>
 */
public class DescribeManagedInstancesResponseBody extends TeaModel {
    @NameInMap("PageSize")
    private Long pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("PageNumber")
    private Long pageNumber;

    @NameInMap("TotalCount")
    private Long totalCount;

    @NameInMap("Instances")
    private java.util.List < Instances> instances;

    private DescribeManagedInstancesResponseBody(Builder builder) {
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.pageNumber = builder.pageNumber;
        this.totalCount = builder.totalCount;
        this.instances = builder.instances;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeManagedInstancesResponseBody create() {
        return builder().build();
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return instances
     */
    public java.util.List < Instances> getInstances() {
        return this.instances;
    }

    public static final class Builder {
        private Long pageSize; 
        private String requestId; 
        private Long pageNumber; 
        private Long totalCount; 
        private java.util.List < Instances> instances; 

        /**
         * The number of entries to return on each page.
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
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
         * The page number of the managed instance list.
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The total number of managed instances queried.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * By Instances array of format, return managed instance information.
         * <p>
         * 
         * 
         * 
         * 
         * 
         * 
         * 
         * 
         * 
         * 
         * 
         * 
         * 
         * 
         * 
         * 
         * 
         * 
         * 
         * 
         * 
         * 
         * 
         * 
         * 
         * 
         * 
         * 
         * 
         * 
         * 
         * 
         * 
         * 
         * 
         * 
         * 
         * 
         * 
         * 
         * 
         * 
         * 
         * 
         * 
         * 
         * 
         * 
         * 
         * 
         * 
         * 
         * 
         * 
         * 
         * 
         * 
         * 
         * 
         * 
         * 
         * 
         * 
         * 
         * 
         * 
         * 
         * 
         * 
         * 
         * 
         * 
         * 
         * 
         * 
         * 
         * 
         * 
         * 
         * 
         * 
         * 
         * 
         * 
         * 
         * 
         * 
         * 
         * 
         * 
         * 
         * 
         * 
         * 
         * 
         * 
         * 
         */
        public Builder instances(java.util.List < Instances> instances) {
            this.instances = instances;
            return this;
        }

        public DescribeManagedInstancesResponseBody build() {
            return new DescribeManagedInstancesResponseBody(this);
        } 

    } 

    public static class Instances extends TeaModel {
        @NameInMap("LastInvokedTime")
        private String lastInvokedTime;

        @NameInMap("Connected")
        private Boolean connected;

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

        private Instances(Builder builder) {
            this.lastInvokedTime = builder.lastInvokedTime;
            this.connected = builder.connected;
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

        public static Instances create() {
            return builder().build();
        }

        /**
         * @return lastInvokedTime
         */
        public String getLastInvokedTime() {
            return this.lastInvokedTime;
        }

        /**
         * @return connected
         */
        public Boolean getConnected() {
            return this.connected;
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
            private Boolean connected; 
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
             * Indicates whether the managed instance is connected.
             * <p>
             * 
             * -true: the managed instance is connected. You can use cloud assistant to manage the managed instance.
             * 
             * -false: The managed instance is not connected, the server may be stopped, or the cloud assistant client is not installed correctly.
             */
            public Builder connected(Boolean connected) {
                this.connected = connected;
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

            public Instances build() {
                return new Instances(this);
            } 

        } 

    }
}
