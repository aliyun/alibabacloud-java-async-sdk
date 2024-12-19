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
 * {@link DescribeManagedInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeManagedInstancesResponseBody</p>
 */
public class DescribeManagedInstancesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Instances")
    private java.util.List<Instances> instances;

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
    public java.util.List<Instances> getInstances() {
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
        private java.util.List<Instances> instances; 
        private String nextToken; 
        private Long pageNumber; 
        private Long pageSize; 
        private String requestId; 
        private Long totalCount; 

        /**
         * <p>The queried managed instances.</p>
         */
        public Builder instances(java.util.List<Instances> instances) {
            this.instances = instances;
            return this;
        }

        /**
         * <p>A pagination token. It can be used in the next request to retrieve a new page of results.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAdDWBF2</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>77115469-F2C5-4ECA-94F7-FA04F2FD****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of queried managed instances.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeManagedInstancesResponseBody build() {
            return new DescribeManagedInstancesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeManagedInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeManagedInstancesResponseBody</p>
     */
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
             * <p>The key of tag N of the managed instance. Valid values of N: 1 to 20. The tag key cannot be an empty string.</p>
             * <p>If a single tag is specified to query resources, up to 1,000 resources that have this tag added are returned. If multiple tags are specified to query resources, up to 1,000 resources that have all these tags added are returned. To query more than 1,000 resources that have the specified tags, call the <a href="https://help.aliyun.com/document_detail/110425.html">ListTagResources</a> operation.</p>
             * <p>The tag key can be up to 64 characters in length and cannot contain <code>http://</code> or <code>https://</code>. The tag key cannot start with <code>acs:</code> or <code>aliyun</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>TestKey</p>
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * <p>The value of tag N of the managed instance. Valid values of N: 1 to 20. The tag value can be an empty string.</p>
             * <p>The tag value can be up to 128 characters in length and cannot contain <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>TestValue</p>
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
    /**
     * 
     * {@link DescribeManagedInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeManagedInstancesResponseBody</p>
     */
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
        private java.util.List<Tags> tags;

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
        public java.util.List<Tags> getTags() {
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
            private java.util.List<Tags> tags; 

            /**
             * <p>The ID of the activation code.</p>
             * 
             * <strong>example:</strong>
             * <p>3704F543-F768-43FA-9864-897F75B3****</p>
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
             * <p>Indicates whether the managed instance is connected. Valid values:</p>
             * <ul>
             * <li>true: The managed instance is connected. You can manage the instance by using Cloud Assistant.</li>
             * <li>false: The managed instance is not connected. The managed instance may be down or Cloud Assistant Agent may be incorrectly installed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder connected(Boolean connected) {
                this.connected = connected;
                return this;
            }

            /**
             * <p>The hostname of the managed instance.</p>
             * 
             * <strong>example:</strong>
             * <p>demo</p>
             */
            public Builder hostname(String hostname) {
                this.hostname = hostname;
                return this;
            }

            /**
             * <p>The ID of the managed instance.</p>
             * 
             * <strong>example:</strong>
             * <p>mi-hz018jrc1o0****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The name of the managed instance.</p>
             * 
             * <strong>example:</strong>
             * <p>webAPP-linux-01</p>
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * <p>The public IP address of the managed instance.</p>
             * 
             * <strong>example:</strong>
             * <p><code>40.65.**.**</code></p>
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
             * <p>1</p>
             */
            public Builder invocationCount(Long invocationCount) {
                this.invocationCount = invocationCount;
                return this;
            }

            /**
             * <p>The time when the last Cloud Assistant task was executed.</p>
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
             * <p>Linux</p>
             */
            public Builder osType(String osType) {
                this.osType = osType;
                return this;
            }

            /**
             * <p>The version information of the operating system.</p>
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

            /**
             * <p>The tags of the managed instance.</p>
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            public Instances build() {
                return new Instances(this);
            } 

        } 

    }
}
