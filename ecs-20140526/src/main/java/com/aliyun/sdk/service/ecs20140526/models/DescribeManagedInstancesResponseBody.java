// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeManagedInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeManagedInstancesResponseBody</p>
 */
public class DescribeManagedInstancesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Instances")
    private java.util.List < Instances> instances;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private DescribeManagedInstancesResponseBody(Builder builder) {
        this.instances = builder.instances;
        this.nextToken = builder.nextToken;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeManagedInstancesResponseBody create() {
        return builder().build();
    }

    /**
     * @return instances
     */
    public java.util.List < Instances> getInstances() {
        return this.instances;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
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
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < Instances> instances; 
        private String nextToken; 
        private Long pageNumber; 
        private Long pageSize; 
        private String requestId; 
        private Long totalCount; 

        /**
         * The queried managed instances.
         */
        public Builder instances(java.util.List < Instances> instances) {
            this.instances = instances;
            return this;
        }

        /**
         * A pagination token. It can be used in the next request to retrieve a new page of results.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The page number.
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page.
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of queried managed instances.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeManagedInstancesResponseBody build() {
            return new DescribeManagedInstancesResponseBody(this);
        } 

    } 

    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TagKey")
        private String tagKey;

        @com.aliyun.core.annotation.NameInMap("TagValue")
        private String tagValue;

        private Tags(Builder builder) {
            this.tagKey = builder.tagKey;
            this.tagValue = builder.tagValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return tagKey
         */
        public String getTagKey() {
            return this.tagKey;
        }

        /**
         * @return tagValue
         */
        public String getTagValue() {
            return this.tagValue;
        }

        public static final class Builder {
            private String tagKey; 
            private String tagValue; 

            /**
             * The key of tag N of the managed instance. Valid values of N: 1 to 20. The tag key cannot be an empty string.
             * <p>
             * 
             * If a single tag is specified to query resources, up to 1,000 resources that have this tag added are returned. If multiple tags are specified to query resources, up to 1,000 resources that have all these tags added are returned. To query more than 1,000 resources that have the specified tags, call the [ListTagResources](~~110425~~) operation.
             * 
             * The tag key can be up to 64 characters in length and cannot contain `http://` or `https://`. The tag key cannot start with `acs:` or `aliyun`.
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * The value of tag N of the managed instance. Valid values of N: 1 to 20. The tag value can be an empty string.
             * <p>
             * 
             * The tag value can be up to 128 characters in length and cannot contain `http://` or `https://`.
             */
            public Builder tagValue(String tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    public static class Instances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActivationId")
        private String activationId;

        @com.aliyun.core.annotation.NameInMap("AgentVersion")
        private String agentVersion;

        @com.aliyun.core.annotation.NameInMap("Connected")
        private Boolean connected;

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

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List < Tags> tags;

        private Instances(Builder builder) {
            this.activationId = builder.activationId;
            this.agentVersion = builder.agentVersion;
            this.connected = builder.connected;
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
            this.tags = builder.tags;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Instances create() {
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
         * @return connected
         */
        public Boolean getConnected() {
            return this.connected;
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

        /**
         * @return tags
         */
        public java.util.List < Tags> getTags() {
            return this.tags;
        }

        public static final class Builder {
            private String activationId; 
            private String agentVersion; 
            private Boolean connected; 
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
            private java.util.List < Tags> tags; 

            /**
             * The ID of the activation code.
             */
            public Builder activationId(String activationId) {
                this.activationId = activationId;
                return this;
            }

            /**
             * The version number of Cloud Assistant Agent.
             */
            public Builder agentVersion(String agentVersion) {
                this.agentVersion = agentVersion;
                return this;
            }

            /**
             * Indicates whether the managed instance is connected. Valid values:
             * <p>
             * 
             * *   true: The managed instance is connected. You can manage the instance by using Cloud Assistant.
             * *   false: The managed instance is not connected. The managed instance may be down or Cloud Assistant Agent may be incorrectly installed.
             */
            public Builder connected(Boolean connected) {
                this.connected = connected;
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
             * The name of the managed instance.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
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
             * The internal IP address of the managed instance.
             */
            public Builder intranetIp(String intranetIp) {
                this.intranetIp = intranetIp;
                return this;
            }

            /**
             * The number of times that Cloud Assistant tasks were executed on the managed instance.
             */
            public Builder invocationCount(Long invocationCount) {
                this.invocationCount = invocationCount;
                return this;
            }

            /**
             * The time when the last Cloud Assistant task was executed.
             */
            public Builder lastInvokedTime(String lastInvokedTime) {
                this.lastInvokedTime = lastInvokedTime;
                return this;
            }

            /**
             * The machine code of the managed instance.
             */
            public Builder machineId(String machineId) {
                this.machineId = machineId;
                return this;
            }

            /**
             * The operating system type of the managed instance.
             */
            public Builder osType(String osType) {
                this.osType = osType;
                return this;
            }

            /**
             * The version information of the operating system.
             */
            public Builder osVersion(String osVersion) {
                this.osVersion = osVersion;
                return this;
            }

            /**
             * The time when the managed instance was registered.
             */
            public Builder registrationTime(String registrationTime) {
                this.registrationTime = registrationTime;
                return this;
            }

            /**
             * The ID of the resource group to which the managed instance belongs.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * The tags of the managed instance.
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
                return this;
            }

            public Instances build() {
                return new Instances(this);
            } 

        } 

    }
}
