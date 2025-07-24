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
 * {@link DescribeDedicatedHostsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDedicatedHostsResponseBody</p>
 */
public class DescribeDedicatedHostsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DedicatedHosts")
    private DedicatedHosts dedicatedHosts;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeDedicatedHostsResponseBody(Builder builder) {
        this.dedicatedHosts = builder.dedicatedHosts;
        this.nextToken = builder.nextToken;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDedicatedHostsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dedicatedHosts
     */
    public DedicatedHosts getDedicatedHosts() {
        return this.dedicatedHosts;
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
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
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
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private DedicatedHosts dedicatedHosts; 
        private String nextToken; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeDedicatedHostsResponseBody model) {
            this.dedicatedHosts = model.dedicatedHosts;
            this.nextToken = model.nextToken;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>Details about the DDH.</p>
         */
        public Builder dedicatedHosts(DedicatedHosts dedicatedHosts) {
            this.dedicatedHosts = dedicatedHosts;
            return this;
        }

        /**
         * <p>A pagination token. It can be used in the next request to retrieve a new page of results. If NextToken is empty, no next page exists. If the return value of this parameter is empty when you specify MaxResults and NextToken for a paged query, no more results are to be returned.</p>
         * 
         * <strong>example:</strong>
         * <p>e71d8a535bd9cc11</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>7654525A-9964-4ABB-8BCD-98F8835E809A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of dedicated hosts.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeDedicatedHostsResponseBody build() {
            return new DescribeDedicatedHostsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDedicatedHostsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDedicatedHostsResponseBody</p>
     */
    public static class AvailableInstanceType extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AvailableInstanceCapacity")
        private Integer availableInstanceCapacity;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        private AvailableInstanceType(Builder builder) {
            this.availableInstanceCapacity = builder.availableInstanceCapacity;
            this.instanceType = builder.instanceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AvailableInstanceType create() {
            return builder().build();
        }

        /**
         * @return availableInstanceCapacity
         */
        public Integer getAvailableInstanceCapacity() {
            return this.availableInstanceCapacity;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        public static final class Builder {
            private Integer availableInstanceCapacity; 
            private String instanceType; 

            private Builder() {
            } 

            private Builder(AvailableInstanceType model) {
                this.availableInstanceCapacity = model.availableInstanceCapacity;
                this.instanceType = model.instanceType;
            } 

            /**
             * AvailableInstanceCapacity.
             */
            public Builder availableInstanceCapacity(Integer availableInstanceCapacity) {
                this.availableInstanceCapacity = availableInstanceCapacity;
                return this;
            }

            /**
             * InstanceType.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            public AvailableInstanceType build() {
                return new AvailableInstanceType(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDedicatedHostsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDedicatedHostsResponseBody</p>
     */
    public static class AvailableInstanceTypes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AvailableInstanceType")
        private java.util.List<AvailableInstanceType> availableInstanceType;

        private AvailableInstanceTypes(Builder builder) {
            this.availableInstanceType = builder.availableInstanceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AvailableInstanceTypes create() {
            return builder().build();
        }

        /**
         * @return availableInstanceType
         */
        public java.util.List<AvailableInstanceType> getAvailableInstanceType() {
            return this.availableInstanceType;
        }

        public static final class Builder {
            private java.util.List<AvailableInstanceType> availableInstanceType; 

            private Builder() {
            } 

            private Builder(AvailableInstanceTypes model) {
                this.availableInstanceType = model.availableInstanceType;
            } 

            /**
             * AvailableInstanceType.
             */
            public Builder availableInstanceType(java.util.List<AvailableInstanceType> availableInstanceType) {
                this.availableInstanceType = availableInstanceType;
                return this;
            }

            public AvailableInstanceTypes build() {
                return new AvailableInstanceTypes(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDedicatedHostsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDedicatedHostsResponseBody</p>
     */
    public static class SocketCapacity extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AvailableMemory")
        private Float availableMemory;

        @com.aliyun.core.annotation.NameInMap("AvailableVcpu")
        private Integer availableVcpu;

        @com.aliyun.core.annotation.NameInMap("SocketId")
        private Integer socketId;

        @com.aliyun.core.annotation.NameInMap("TotalMemory")
        private Float totalMemory;

        @com.aliyun.core.annotation.NameInMap("TotalVcpu")
        private Integer totalVcpu;

        private SocketCapacity(Builder builder) {
            this.availableMemory = builder.availableMemory;
            this.availableVcpu = builder.availableVcpu;
            this.socketId = builder.socketId;
            this.totalMemory = builder.totalMemory;
            this.totalVcpu = builder.totalVcpu;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SocketCapacity create() {
            return builder().build();
        }

        /**
         * @return availableMemory
         */
        public Float getAvailableMemory() {
            return this.availableMemory;
        }

        /**
         * @return availableVcpu
         */
        public Integer getAvailableVcpu() {
            return this.availableVcpu;
        }

        /**
         * @return socketId
         */
        public Integer getSocketId() {
            return this.socketId;
        }

        /**
         * @return totalMemory
         */
        public Float getTotalMemory() {
            return this.totalMemory;
        }

        /**
         * @return totalVcpu
         */
        public Integer getTotalVcpu() {
            return this.totalVcpu;
        }

        public static final class Builder {
            private Float availableMemory; 
            private Integer availableVcpu; 
            private Integer socketId; 
            private Float totalMemory; 
            private Integer totalVcpu; 

            private Builder() {
            } 

            private Builder(SocketCapacity model) {
                this.availableMemory = model.availableMemory;
                this.availableVcpu = model.availableVcpu;
                this.socketId = model.socketId;
                this.totalMemory = model.totalMemory;
                this.totalVcpu = model.totalVcpu;
            } 

            /**
             * <p>The amount of available memory. Unit: GiB.</p>
             * 
             * <strong>example:</strong>
             * <p>65</p>
             */
            public Builder availableMemory(Float availableMemory) {
                this.availableMemory = availableMemory;
                return this;
            }

            /**
             * <p>The number of available vCPUs.</p>
             * 
             * <strong>example:</strong>
             * <p>64</p>
             */
            public Builder availableVcpu(Integer availableVcpu) {
                this.availableVcpu = availableVcpu;
                return this;
            }

            /**
             * <p>The socket ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder socketId(Integer socketId) {
                this.socketId = socketId;
                return this;
            }

            /**
             * <p>The total amount of memory. Unit: GiB.</p>
             * 
             * <strong>example:</strong>
             * <p>128</p>
             */
            public Builder totalMemory(Float totalMemory) {
                this.totalMemory = totalMemory;
                return this;
            }

            /**
             * <p>The total number of vCPUs.</p>
             * 
             * <strong>example:</strong>
             * <p>128</p>
             */
            public Builder totalVcpu(Integer totalVcpu) {
                this.totalVcpu = totalVcpu;
                return this;
            }

            public SocketCapacity build() {
                return new SocketCapacity(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDedicatedHostsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDedicatedHostsResponseBody</p>
     */
    public static class SocketCapacities extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SocketCapacity")
        private java.util.List<SocketCapacity> socketCapacity;

        private SocketCapacities(Builder builder) {
            this.socketCapacity = builder.socketCapacity;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SocketCapacities create() {
            return builder().build();
        }

        /**
         * @return socketCapacity
         */
        public java.util.List<SocketCapacity> getSocketCapacity() {
            return this.socketCapacity;
        }

        public static final class Builder {
            private java.util.List<SocketCapacity> socketCapacity; 

            private Builder() {
            } 

            private Builder(SocketCapacities model) {
                this.socketCapacity = model.socketCapacity;
            } 

            /**
             * SocketCapacity.
             */
            public Builder socketCapacity(java.util.List<SocketCapacity> socketCapacity) {
                this.socketCapacity = socketCapacity;
                return this;
            }

            public SocketCapacities build() {
                return new SocketCapacities(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDedicatedHostsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDedicatedHostsResponseBody</p>
     */
    public static class Capacity extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AvailableInstanceTypes")
        private AvailableInstanceTypes availableInstanceTypes;

        @com.aliyun.core.annotation.NameInMap("AvailableLocalStorage")
        private Integer availableLocalStorage;

        @com.aliyun.core.annotation.NameInMap("AvailableMemory")
        private Float availableMemory;

        @com.aliyun.core.annotation.NameInMap("AvailableVcpus")
        private Integer availableVcpus;

        @com.aliyun.core.annotation.NameInMap("AvailableVgpus")
        private Integer availableVgpus;

        @com.aliyun.core.annotation.NameInMap("LocalStorageCategory")
        private String localStorageCategory;

        @com.aliyun.core.annotation.NameInMap("SocketCapacities")
        private SocketCapacities socketCapacities;

        @com.aliyun.core.annotation.NameInMap("TotalLocalStorage")
        private Integer totalLocalStorage;

        @com.aliyun.core.annotation.NameInMap("TotalMemory")
        private Float totalMemory;

        @com.aliyun.core.annotation.NameInMap("TotalVcpus")
        private Integer totalVcpus;

        @com.aliyun.core.annotation.NameInMap("TotalVgpus")
        private Integer totalVgpus;

        private Capacity(Builder builder) {
            this.availableInstanceTypes = builder.availableInstanceTypes;
            this.availableLocalStorage = builder.availableLocalStorage;
            this.availableMemory = builder.availableMemory;
            this.availableVcpus = builder.availableVcpus;
            this.availableVgpus = builder.availableVgpus;
            this.localStorageCategory = builder.localStorageCategory;
            this.socketCapacities = builder.socketCapacities;
            this.totalLocalStorage = builder.totalLocalStorage;
            this.totalMemory = builder.totalMemory;
            this.totalVcpus = builder.totalVcpus;
            this.totalVgpus = builder.totalVgpus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Capacity create() {
            return builder().build();
        }

        /**
         * @return availableInstanceTypes
         */
        public AvailableInstanceTypes getAvailableInstanceTypes() {
            return this.availableInstanceTypes;
        }

        /**
         * @return availableLocalStorage
         */
        public Integer getAvailableLocalStorage() {
            return this.availableLocalStorage;
        }

        /**
         * @return availableMemory
         */
        public Float getAvailableMemory() {
            return this.availableMemory;
        }

        /**
         * @return availableVcpus
         */
        public Integer getAvailableVcpus() {
            return this.availableVcpus;
        }

        /**
         * @return availableVgpus
         */
        public Integer getAvailableVgpus() {
            return this.availableVgpus;
        }

        /**
         * @return localStorageCategory
         */
        public String getLocalStorageCategory() {
            return this.localStorageCategory;
        }

        /**
         * @return socketCapacities
         */
        public SocketCapacities getSocketCapacities() {
            return this.socketCapacities;
        }

        /**
         * @return totalLocalStorage
         */
        public Integer getTotalLocalStorage() {
            return this.totalLocalStorage;
        }

        /**
         * @return totalMemory
         */
        public Float getTotalMemory() {
            return this.totalMemory;
        }

        /**
         * @return totalVcpus
         */
        public Integer getTotalVcpus() {
            return this.totalVcpus;
        }

        /**
         * @return totalVgpus
         */
        public Integer getTotalVgpus() {
            return this.totalVgpus;
        }

        public static final class Builder {
            private AvailableInstanceTypes availableInstanceTypes; 
            private Integer availableLocalStorage; 
            private Float availableMemory; 
            private Integer availableVcpus; 
            private Integer availableVgpus; 
            private String localStorageCategory; 
            private SocketCapacities socketCapacities; 
            private Integer totalLocalStorage; 
            private Float totalMemory; 
            private Integer totalVcpus; 
            private Integer totalVgpus; 

            private Builder() {
            } 

            private Builder(Capacity model) {
                this.availableInstanceTypes = model.availableInstanceTypes;
                this.availableLocalStorage = model.availableLocalStorage;
                this.availableMemory = model.availableMemory;
                this.availableVcpus = model.availableVcpus;
                this.availableVgpus = model.availableVgpus;
                this.localStorageCategory = model.localStorageCategory;
                this.socketCapacities = model.socketCapacities;
                this.totalLocalStorage = model.totalLocalStorage;
                this.totalMemory = model.totalMemory;
                this.totalVcpus = model.totalVcpus;
                this.totalVgpus = model.totalVgpus;
            } 

            /**
             * AvailableInstanceTypes.
             */
            public Builder availableInstanceTypes(AvailableInstanceTypes availableInstanceTypes) {
                this.availableInstanceTypes = availableInstanceTypes;
                return this;
            }

            /**
             * <p>The amount of available space on the local disks. Unit: GiB</p>
             * 
             * <strong>example:</strong>
             * <p>65</p>
             */
            public Builder availableLocalStorage(Integer availableLocalStorage) {
                this.availableLocalStorage = availableLocalStorage;
                return this;
            }

            /**
             * <p>The amount of available memory. Unit: GiB.</p>
             * 
             * <strong>example:</strong>
             * <p>25</p>
             */
            public Builder availableMemory(Float availableMemory) {
                this.availableMemory = availableMemory;
                return this;
            }

            /**
             * <p>The number of available vCPUs.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder availableVcpus(Integer availableVcpus) {
                this.availableVcpus = availableVcpus;
                return this;
            }

            /**
             * <p>The number of available vGPUs.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder availableVgpus(Integer availableVgpus) {
                this.availableVgpus = availableVgpus;
                return this;
            }

            /**
             * <p>The category of local disks.</p>
             * 
             * <strong>example:</strong>
             * <p>i2</p>
             */
            public Builder localStorageCategory(String localStorageCategory) {
                this.localStorageCategory = localStorageCategory;
                return this;
            }

            /**
             * <p>The socket capacities.</p>
             */
            public Builder socketCapacities(SocketCapacities socketCapacities) {
                this.socketCapacities = socketCapacities;
                return this;
            }

            /**
             * <p>The total capacity of local disks. Unit: GiB.</p>
             * 
             * <strong>example:</strong>
             * <p>512</p>
             */
            public Builder totalLocalStorage(Integer totalLocalStorage) {
                this.totalLocalStorage = totalLocalStorage;
                return this;
            }

            /**
             * <p>The total amount of memory. Unit: GiB.</p>
             * 
             * <strong>example:</strong>
             * <p>1024</p>
             */
            public Builder totalMemory(Float totalMemory) {
                this.totalMemory = totalMemory;
                return this;
            }

            /**
             * <p>The total number of vCPUs.</p>
             * 
             * <strong>example:</strong>
             * <p>56</p>
             */
            public Builder totalVcpus(Integer totalVcpus) {
                this.totalVcpus = totalVcpus;
                return this;
            }

            /**
             * <p>The total number of vGPUs.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder totalVgpus(Integer totalVgpus) {
                this.totalVgpus = totalVgpus;
                return this;
            }

            public Capacity build() {
                return new Capacity(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDedicatedHostsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDedicatedHostsResponseBody</p>
     */
    public static class HostDetailInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SerialNumber")
        private String serialNumber;

        private HostDetailInfo(Builder builder) {
            this.serialNumber = builder.serialNumber;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HostDetailInfo create() {
            return builder().build();
        }

        /**
         * @return serialNumber
         */
        public String getSerialNumber() {
            return this.serialNumber;
        }

        public static final class Builder {
            private String serialNumber; 

            private Builder() {
            } 

            private Builder(HostDetailInfo model) {
                this.serialNumber = model.serialNumber;
            } 

            /**
             * <p>This parameter will be removed in the future. We recommend that you use other parameters to ensure future compatibility.</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder serialNumber(String serialNumber) {
                this.serialNumber = serialNumber;
                return this;
            }

            public HostDetailInfo build() {
                return new HostDetailInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDedicatedHostsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDedicatedHostsResponseBody</p>
     */
    public static class Instance extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceOwnerId")
        private Long instanceOwnerId;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("SocketId")
        private String socketId;

        private Instance(Builder builder) {
            this.instanceId = builder.instanceId;
            this.instanceOwnerId = builder.instanceOwnerId;
            this.instanceType = builder.instanceType;
            this.socketId = builder.socketId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Instance create() {
            return builder().build();
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceOwnerId
         */
        public Long getInstanceOwnerId() {
            return this.instanceOwnerId;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return socketId
         */
        public String getSocketId() {
            return this.socketId;
        }

        public static final class Builder {
            private String instanceId; 
            private Long instanceOwnerId; 
            private String instanceType; 
            private String socketId; 

            private Builder() {
            } 

            private Builder(Instance model) {
                this.instanceId = model.instanceId;
                this.instanceOwnerId = model.instanceOwnerId;
                this.instanceType = model.instanceType;
                this.socketId = model.socketId;
            } 

            /**
             * <p>The ID of the ECS instance.</p>
             * 
             * <strong>example:</strong>
             * <p>i-bp14ot0ykf8w13a1****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The ID of the ECS instance owner.</p>
             * 
             * <strong>example:</strong>
             * <p>128************0</p>
             */
            public Builder instanceOwnerId(Long instanceOwnerId) {
                this.instanceOwnerId = instanceOwnerId;
                return this;
            }

            /**
             * <p>The instance type of the ECS instance that was created on the dedicated host.</p>
             * 
             * <strong>example:</strong>
             * <p>ecs.g5.large</p>
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * <p>The ID of the socket to which the ECS instance belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>0,1</p>
             */
            public Builder socketId(String socketId) {
                this.socketId = socketId;
                return this;
            }

            public Instance build() {
                return new Instance(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDedicatedHostsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDedicatedHostsResponseBody</p>
     */
    public static class Instances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Instance")
        private java.util.List<Instance> instance;

        private Instances(Builder builder) {
            this.instance = builder.instance;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Instances create() {
            return builder().build();
        }

        /**
         * @return instance
         */
        public java.util.List<Instance> getInstance() {
            return this.instance;
        }

        public static final class Builder {
            private java.util.List<Instance> instance; 

            private Builder() {
            } 

            private Builder(Instances model) {
                this.instance = model.instance;
            } 

            /**
             * Instance.
             */
            public Builder instance(java.util.List<Instance> instance) {
                this.instance = instance;
                return this;
            }

            public Instances build() {
                return new Instances(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDedicatedHostsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDedicatedHostsResponseBody</p>
     */
    public static class NetworkAttributes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SlbUdpTimeout")
        private Integer slbUdpTimeout;

        @com.aliyun.core.annotation.NameInMap("UdpTimeout")
        private Integer udpTimeout;

        private NetworkAttributes(Builder builder) {
            this.slbUdpTimeout = builder.slbUdpTimeout;
            this.udpTimeout = builder.udpTimeout;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NetworkAttributes create() {
            return builder().build();
        }

        /**
         * @return slbUdpTimeout
         */
        public Integer getSlbUdpTimeout() {
            return this.slbUdpTimeout;
        }

        /**
         * @return udpTimeout
         */
        public Integer getUdpTimeout() {
            return this.udpTimeout;
        }

        public static final class Builder {
            private Integer slbUdpTimeout; 
            private Integer udpTimeout; 

            private Builder() {
            } 

            private Builder(NetworkAttributes model) {
                this.slbUdpTimeout = model.slbUdpTimeout;
                this.udpTimeout = model.udpTimeout;
            } 

            /**
             * <p>The timeout period of the UDP session that is established between Server Load Balancer (SLB) and the dedicated host. Unit: seconds. Only 60 is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>60</p>
             */
            public Builder slbUdpTimeout(Integer slbUdpTimeout) {
                this.slbUdpTimeout = slbUdpTimeout;
                return this;
            }

            /**
             * <p>The timeout period of the UDP session that is established between a user and an Alibaba Cloud service on the dedicated host. Unit: seconds. Only 60 is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>60</p>
             */
            public Builder udpTimeout(Integer udpTimeout) {
                this.udpTimeout = udpTimeout;
                return this;
            }

            public NetworkAttributes build() {
                return new NetworkAttributes(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDedicatedHostsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDedicatedHostsResponseBody</p>
     */
    public static class OperationLock extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LockReason")
        private String lockReason;

        private OperationLock(Builder builder) {
            this.lockReason = builder.lockReason;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OperationLock create() {
            return builder().build();
        }

        /**
         * @return lockReason
         */
        public String getLockReason() {
            return this.lockReason;
        }

        public static final class Builder {
            private String lockReason; 

            private Builder() {
            } 

            private Builder(OperationLock model) {
                this.lockReason = model.lockReason;
            } 

            /**
             * <p>The reason why the dedicated host was locked. Valid values:</p>
             * <ul>
             * <li>financial: The dedicated host was locked due to overdue payments.</li>
             * <li>security: The dedicated host was locked due to security reasons.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>financial</p>
             */
            public Builder lockReason(String lockReason) {
                this.lockReason = lockReason;
                return this;
            }

            public OperationLock build() {
                return new OperationLock(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDedicatedHostsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDedicatedHostsResponseBody</p>
     */
    public static class OperationLocks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OperationLock")
        private java.util.List<OperationLock> operationLock;

        private OperationLocks(Builder builder) {
            this.operationLock = builder.operationLock;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OperationLocks create() {
            return builder().build();
        }

        /**
         * @return operationLock
         */
        public java.util.List<OperationLock> getOperationLock() {
            return this.operationLock;
        }

        public static final class Builder {
            private java.util.List<OperationLock> operationLock; 

            private Builder() {
            } 

            private Builder(OperationLocks model) {
                this.operationLock = model.operationLock;
            } 

            /**
             * OperationLock.
             */
            public Builder operationLock(java.util.List<OperationLock> operationLock) {
                this.operationLock = operationLock;
                return this;
            }

            public OperationLocks build() {
                return new OperationLocks(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDedicatedHostsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDedicatedHostsResponseBody</p>
     */
    public static class SupportedCustomInstanceTypeFamilies extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SupportedCustomInstanceTypeFamily")
        private java.util.List<String> supportedCustomInstanceTypeFamily;

        private SupportedCustomInstanceTypeFamilies(Builder builder) {
            this.supportedCustomInstanceTypeFamily = builder.supportedCustomInstanceTypeFamily;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SupportedCustomInstanceTypeFamilies create() {
            return builder().build();
        }

        /**
         * @return supportedCustomInstanceTypeFamily
         */
        public java.util.List<String> getSupportedCustomInstanceTypeFamily() {
            return this.supportedCustomInstanceTypeFamily;
        }

        public static final class Builder {
            private java.util.List<String> supportedCustomInstanceTypeFamily; 

            private Builder() {
            } 

            private Builder(SupportedCustomInstanceTypeFamilies model) {
                this.supportedCustomInstanceTypeFamily = model.supportedCustomInstanceTypeFamily;
            } 

            /**
             * SupportedCustomInstanceTypeFamily.
             */
            public Builder supportedCustomInstanceTypeFamily(java.util.List<String> supportedCustomInstanceTypeFamily) {
                this.supportedCustomInstanceTypeFamily = supportedCustomInstanceTypeFamily;
                return this;
            }

            public SupportedCustomInstanceTypeFamilies build() {
                return new SupportedCustomInstanceTypeFamilies(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDedicatedHostsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDedicatedHostsResponseBody</p>
     */
    public static class SupportedInstanceTypeFamilies extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SupportedInstanceTypeFamily")
        private java.util.List<String> supportedInstanceTypeFamily;

        private SupportedInstanceTypeFamilies(Builder builder) {
            this.supportedInstanceTypeFamily = builder.supportedInstanceTypeFamily;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SupportedInstanceTypeFamilies create() {
            return builder().build();
        }

        /**
         * @return supportedInstanceTypeFamily
         */
        public java.util.List<String> getSupportedInstanceTypeFamily() {
            return this.supportedInstanceTypeFamily;
        }

        public static final class Builder {
            private java.util.List<String> supportedInstanceTypeFamily; 

            private Builder() {
            } 

            private Builder(SupportedInstanceTypeFamilies model) {
                this.supportedInstanceTypeFamily = model.supportedInstanceTypeFamily;
            } 

            /**
             * SupportedInstanceTypeFamily.
             */
            public Builder supportedInstanceTypeFamily(java.util.List<String> supportedInstanceTypeFamily) {
                this.supportedInstanceTypeFamily = supportedInstanceTypeFamily;
                return this;
            }

            public SupportedInstanceTypeFamilies build() {
                return new SupportedInstanceTypeFamilies(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDedicatedHostsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDedicatedHostsResponseBody</p>
     */
    public static class SupportedInstanceTypesList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SupportedInstanceTypesList")
        private java.util.List<String> supportedInstanceTypesList;

        private SupportedInstanceTypesList(Builder builder) {
            this.supportedInstanceTypesList = builder.supportedInstanceTypesList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SupportedInstanceTypesList create() {
            return builder().build();
        }

        /**
         * @return supportedInstanceTypesList
         */
        public java.util.List<String> getSupportedInstanceTypesList() {
            return this.supportedInstanceTypesList;
        }

        public static final class Builder {
            private java.util.List<String> supportedInstanceTypesList; 

            private Builder() {
            } 

            private Builder(SupportedInstanceTypesList model) {
                this.supportedInstanceTypesList = model.supportedInstanceTypesList;
            } 

            /**
             * SupportedInstanceTypesList.
             */
            public Builder supportedInstanceTypesList(java.util.List<String> supportedInstanceTypesList) {
                this.supportedInstanceTypesList = supportedInstanceTypesList;
                return this;
            }

            public SupportedInstanceTypesList build() {
                return new SupportedInstanceTypesList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDedicatedHostsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDedicatedHostsResponseBody</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TagKey")
        private String tagKey;

        @com.aliyun.core.annotation.NameInMap("TagValue")
        private String tagValue;

        private Tag(Builder builder) {
            this.tagKey = builder.tagKey;
            this.tagValue = builder.tagValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
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

            private Builder() {
            } 

            private Builder(Tag model) {
                this.tagKey = model.tagKey;
                this.tagValue = model.tagValue;
            } 

            /**
             * <p>The tag key of the dedicated host.</p>
             * 
             * <strong>example:</strong>
             * <p>TestKey</p>
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * <p>The tag value of the dedicated host.</p>
             * 
             * <strong>example:</strong>
             * <p>TestValue</p>
             */
            public Builder tagValue(String tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDedicatedHostsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDedicatedHostsResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Tag")
        private java.util.List<Tag> tag;

        private Tags(Builder builder) {
            this.tag = builder.tag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return tag
         */
        public java.util.List<Tag> getTag() {
            return this.tag;
        }

        public static final class Builder {
            private java.util.List<Tag> tag; 

            private Builder() {
            } 

            private Builder(Tags model) {
                this.tag = model.tag;
            } 

            /**
             * Tag.
             */
            public Builder tag(java.util.List<Tag> tag) {
                this.tag = tag;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDedicatedHostsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDedicatedHostsResponseBody</p>
     */
    public static class DedicatedHost extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActionOnMaintenance")
        private String actionOnMaintenance;

        @com.aliyun.core.annotation.NameInMap("AutoPlacement")
        private String autoPlacement;

        @com.aliyun.core.annotation.NameInMap("AutoReleaseTime")
        private String autoReleaseTime;

        @com.aliyun.core.annotation.NameInMap("Capacity")
        private Capacity capacity;

        @com.aliyun.core.annotation.NameInMap("ChargeType")
        private String chargeType;

        @com.aliyun.core.annotation.NameInMap("Cores")
        private Integer cores;

        @com.aliyun.core.annotation.NameInMap("CpuOverCommitRatio")
        private Float cpuOverCommitRatio;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("DedicatedHostClusterId")
        private String dedicatedHostClusterId;

        @com.aliyun.core.annotation.NameInMap("DedicatedHostId")
        private String dedicatedHostId;

        @com.aliyun.core.annotation.NameInMap("DedicatedHostName")
        private String dedicatedHostName;

        @com.aliyun.core.annotation.NameInMap("DedicatedHostOwnerId")
        private Long dedicatedHostOwnerId;

        @com.aliyun.core.annotation.NameInMap("DedicatedHostType")
        private String dedicatedHostType;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("ExpiredTime")
        private String expiredTime;

        @com.aliyun.core.annotation.NameInMap("GPUSpec")
        private String GPUSpec;

        @com.aliyun.core.annotation.NameInMap("HostDetailInfo")
        private HostDetailInfo hostDetailInfo;

        @com.aliyun.core.annotation.NameInMap("Instances")
        private Instances instances;

        @com.aliyun.core.annotation.NameInMap("MachineId")
        private String machineId;

        @com.aliyun.core.annotation.NameInMap("NetworkAttributes")
        private NetworkAttributes networkAttributes;

        @com.aliyun.core.annotation.NameInMap("OperationLocks")
        private OperationLocks operationLocks;

        @com.aliyun.core.annotation.NameInMap("PhysicalGpus")
        private Integer physicalGpus;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("SaleCycle")
        private String saleCycle;

        @com.aliyun.core.annotation.NameInMap("SchedulerOptions.ManagedPrivateSpaceId")
        private String schedulerOptions_managedPrivateSpaceId;

        @com.aliyun.core.annotation.NameInMap("Sockets")
        private Integer sockets;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("SupportedCustomInstanceTypeFamilies")
        private SupportedCustomInstanceTypeFamilies supportedCustomInstanceTypeFamilies;

        @com.aliyun.core.annotation.NameInMap("SupportedInstanceTypeFamilies")
        private SupportedInstanceTypeFamilies supportedInstanceTypeFamilies;

        @com.aliyun.core.annotation.NameInMap("SupportedInstanceTypesList")
        private SupportedInstanceTypesList supportedInstanceTypesList;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private Tags tags;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private DedicatedHost(Builder builder) {
            this.actionOnMaintenance = builder.actionOnMaintenance;
            this.autoPlacement = builder.autoPlacement;
            this.autoReleaseTime = builder.autoReleaseTime;
            this.capacity = builder.capacity;
            this.chargeType = builder.chargeType;
            this.cores = builder.cores;
            this.cpuOverCommitRatio = builder.cpuOverCommitRatio;
            this.creationTime = builder.creationTime;
            this.dedicatedHostClusterId = builder.dedicatedHostClusterId;
            this.dedicatedHostId = builder.dedicatedHostId;
            this.dedicatedHostName = builder.dedicatedHostName;
            this.dedicatedHostOwnerId = builder.dedicatedHostOwnerId;
            this.dedicatedHostType = builder.dedicatedHostType;
            this.description = builder.description;
            this.expiredTime = builder.expiredTime;
            this.GPUSpec = builder.GPUSpec;
            this.hostDetailInfo = builder.hostDetailInfo;
            this.instances = builder.instances;
            this.machineId = builder.machineId;
            this.networkAttributes = builder.networkAttributes;
            this.operationLocks = builder.operationLocks;
            this.physicalGpus = builder.physicalGpus;
            this.regionId = builder.regionId;
            this.resourceGroupId = builder.resourceGroupId;
            this.saleCycle = builder.saleCycle;
            this.schedulerOptions_managedPrivateSpaceId = builder.schedulerOptions_managedPrivateSpaceId;
            this.sockets = builder.sockets;
            this.status = builder.status;
            this.supportedCustomInstanceTypeFamilies = builder.supportedCustomInstanceTypeFamilies;
            this.supportedInstanceTypeFamilies = builder.supportedInstanceTypeFamilies;
            this.supportedInstanceTypesList = builder.supportedInstanceTypesList;
            this.tags = builder.tags;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DedicatedHost create() {
            return builder().build();
        }

        /**
         * @return actionOnMaintenance
         */
        public String getActionOnMaintenance() {
            return this.actionOnMaintenance;
        }

        /**
         * @return autoPlacement
         */
        public String getAutoPlacement() {
            return this.autoPlacement;
        }

        /**
         * @return autoReleaseTime
         */
        public String getAutoReleaseTime() {
            return this.autoReleaseTime;
        }

        /**
         * @return capacity
         */
        public Capacity getCapacity() {
            return this.capacity;
        }

        /**
         * @return chargeType
         */
        public String getChargeType() {
            return this.chargeType;
        }

        /**
         * @return cores
         */
        public Integer getCores() {
            return this.cores;
        }

        /**
         * @return cpuOverCommitRatio
         */
        public Float getCpuOverCommitRatio() {
            return this.cpuOverCommitRatio;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return dedicatedHostClusterId
         */
        public String getDedicatedHostClusterId() {
            return this.dedicatedHostClusterId;
        }

        /**
         * @return dedicatedHostId
         */
        public String getDedicatedHostId() {
            return this.dedicatedHostId;
        }

        /**
         * @return dedicatedHostName
         */
        public String getDedicatedHostName() {
            return this.dedicatedHostName;
        }

        /**
         * @return dedicatedHostOwnerId
         */
        public Long getDedicatedHostOwnerId() {
            return this.dedicatedHostOwnerId;
        }

        /**
         * @return dedicatedHostType
         */
        public String getDedicatedHostType() {
            return this.dedicatedHostType;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return expiredTime
         */
        public String getExpiredTime() {
            return this.expiredTime;
        }

        /**
         * @return GPUSpec
         */
        public String getGPUSpec() {
            return this.GPUSpec;
        }

        /**
         * @return hostDetailInfo
         */
        public HostDetailInfo getHostDetailInfo() {
            return this.hostDetailInfo;
        }

        /**
         * @return instances
         */
        public Instances getInstances() {
            return this.instances;
        }

        /**
         * @return machineId
         */
        public String getMachineId() {
            return this.machineId;
        }

        /**
         * @return networkAttributes
         */
        public NetworkAttributes getNetworkAttributes() {
            return this.networkAttributes;
        }

        /**
         * @return operationLocks
         */
        public OperationLocks getOperationLocks() {
            return this.operationLocks;
        }

        /**
         * @return physicalGpus
         */
        public Integer getPhysicalGpus() {
            return this.physicalGpus;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return saleCycle
         */
        public String getSaleCycle() {
            return this.saleCycle;
        }

        /**
         * @return schedulerOptions_managedPrivateSpaceId
         */
        public String getSchedulerOptions_managedPrivateSpaceId() {
            return this.schedulerOptions_managedPrivateSpaceId;
        }

        /**
         * @return sockets
         */
        public Integer getSockets() {
            return this.sockets;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return supportedCustomInstanceTypeFamilies
         */
        public SupportedCustomInstanceTypeFamilies getSupportedCustomInstanceTypeFamilies() {
            return this.supportedCustomInstanceTypeFamilies;
        }

        /**
         * @return supportedInstanceTypeFamilies
         */
        public SupportedInstanceTypeFamilies getSupportedInstanceTypeFamilies() {
            return this.supportedInstanceTypeFamilies;
        }

        /**
         * @return supportedInstanceTypesList
         */
        public SupportedInstanceTypesList getSupportedInstanceTypesList() {
            return this.supportedInstanceTypesList;
        }

        /**
         * @return tags
         */
        public Tags getTags() {
            return this.tags;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String actionOnMaintenance; 
            private String autoPlacement; 
            private String autoReleaseTime; 
            private Capacity capacity; 
            private String chargeType; 
            private Integer cores; 
            private Float cpuOverCommitRatio; 
            private String creationTime; 
            private String dedicatedHostClusterId; 
            private String dedicatedHostId; 
            private String dedicatedHostName; 
            private Long dedicatedHostOwnerId; 
            private String dedicatedHostType; 
            private String description; 
            private String expiredTime; 
            private String GPUSpec; 
            private HostDetailInfo hostDetailInfo; 
            private Instances instances; 
            private String machineId; 
            private NetworkAttributes networkAttributes; 
            private OperationLocks operationLocks; 
            private Integer physicalGpus; 
            private String regionId; 
            private String resourceGroupId; 
            private String saleCycle; 
            private String schedulerOptions_managedPrivateSpaceId; 
            private Integer sockets; 
            private String status; 
            private SupportedCustomInstanceTypeFamilies supportedCustomInstanceTypeFamilies; 
            private SupportedInstanceTypeFamilies supportedInstanceTypeFamilies; 
            private SupportedInstanceTypesList supportedInstanceTypesList; 
            private Tags tags; 
            private String zoneId; 

            private Builder() {
            } 

            private Builder(DedicatedHost model) {
                this.actionOnMaintenance = model.actionOnMaintenance;
                this.autoPlacement = model.autoPlacement;
                this.autoReleaseTime = model.autoReleaseTime;
                this.capacity = model.capacity;
                this.chargeType = model.chargeType;
                this.cores = model.cores;
                this.cpuOverCommitRatio = model.cpuOverCommitRatio;
                this.creationTime = model.creationTime;
                this.dedicatedHostClusterId = model.dedicatedHostClusterId;
                this.dedicatedHostId = model.dedicatedHostId;
                this.dedicatedHostName = model.dedicatedHostName;
                this.dedicatedHostOwnerId = model.dedicatedHostOwnerId;
                this.dedicatedHostType = model.dedicatedHostType;
                this.description = model.description;
                this.expiredTime = model.expiredTime;
                this.GPUSpec = model.GPUSpec;
                this.hostDetailInfo = model.hostDetailInfo;
                this.instances = model.instances;
                this.machineId = model.machineId;
                this.networkAttributes = model.networkAttributes;
                this.operationLocks = model.operationLocks;
                this.physicalGpus = model.physicalGpus;
                this.regionId = model.regionId;
                this.resourceGroupId = model.resourceGroupId;
                this.saleCycle = model.saleCycle;
                this.schedulerOptions_managedPrivateSpaceId = model.schedulerOptions_managedPrivateSpaceId;
                this.sockets = model.sockets;
                this.status = model.status;
                this.supportedCustomInstanceTypeFamilies = model.supportedCustomInstanceTypeFamilies;
                this.supportedInstanceTypeFamilies = model.supportedInstanceTypeFamilies;
                this.supportedInstanceTypesList = model.supportedInstanceTypesList;
                this.tags = model.tags;
                this.zoneId = model.zoneId;
            } 

            /**
             * <p>The policy used to migrate the ECS instances deployed on the dedicated host when the dedicated host fails. Valid values:</p>
             * <ul>
             * <li>Migrate: The instances are migrated to another physical machine. Instances that are not in the Stopped state when the dedicated host fails are restarted.</li>
             * <li>Stop: The instances are stopped. If the dedicated host cannot be repaired, the instances are migrated to another physical machine and then restarted.</li>
             * </ul>
             * <p>If the dedicated host has cloud disks attached, the default value is Migrate. If the dedicated host has local disks attached, the default value is Stop.</p>
             * 
             * <strong>example:</strong>
             * <p>Migrate</p>
             */
            public Builder actionOnMaintenance(String actionOnMaintenance) {
                this.actionOnMaintenance = actionOnMaintenance;
                return this;
            }

            /**
             * <p>Indicates whether the dedicated host is added to the resource pool for automatic deployment. Valid values:</p>
             * <ul>
             * <li>on: The dedicated host is added to the resource pool for automatic deployment.</li>
             * <li>off: The dedicated host is not added to the resource pool for automatic deployment.</li>
             * </ul>
             * <p>For information about automatic deployment, see the &quot;Automatic deployment&quot; section in <a href="https://help.aliyun.com/document_detail/118938.html">Functions and features</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>on</p>
             */
            public Builder autoPlacement(String autoPlacement) {
                this.autoPlacement = autoPlacement;
                return this;
            }

            /**
             * <p>The automatic release time of the dedicated host. The time follows the <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a> standard in the <code>yyyy-MM-ddTHH:mmZ</code> format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2017-01-01T12:00Z</p>
             */
            public Builder autoReleaseTime(String autoReleaseTime) {
                this.autoReleaseTime = autoReleaseTime;
                return this;
            }

            /**
             * <p>The performance specifications of the dedicated host.</p>
             */
            public Builder capacity(Capacity capacity) {
                this.capacity = capacity;
                return this;
            }

            /**
             * <p>The billing method of the dedicated host.</p>
             * 
             * <strong>example:</strong>
             * <p>Prepaid</p>
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * <p>The number of physical cores per CPU.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder cores(Integer cores) {
                this.cores = cores;
                return this;
            }

            /**
             * <p>The CPU overcommit ratio. Valid values: 1 to 5.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder cpuOverCommitRatio(Float cpuOverCommitRatio) {
                this.cpuOverCommitRatio = cpuOverCommitRatio;
                return this;
            }

            /**
             * <p>The time when the dedicated host was created. The time follows the <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a> standard in the <code>yyyy-MM-ddTHH:mmZ</code> format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2018-01-01T12:00Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The ID of the dedicated host cluster to which the dedicated host belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>dc-bp12wlf6am0vz9v2****</p>
             */
            public Builder dedicatedHostClusterId(String dedicatedHostClusterId) {
                this.dedicatedHostClusterId = dedicatedHostClusterId;
                return this;
            }

            /**
             * <p>The ID of the dedicated host.</p>
             * 
             * <strong>example:</strong>
             * <p>dh-bp165p6xk2tlw61e****</p>
             */
            public Builder dedicatedHostId(String dedicatedHostId) {
                this.dedicatedHostId = dedicatedHostId;
                return this;
            }

            /**
             * <p>The name of the dedicated host.</p>
             * 
             * <strong>example:</strong>
             * <p>MyDDHTestName</p>
             */
            public Builder dedicatedHostName(String dedicatedHostName) {
                this.dedicatedHostName = dedicatedHostName;
                return this;
            }

            /**
             * <p>The ID of the dedicated host owner.</p>
             * 
             * <strong>example:</strong>
             * <p>100************7</p>
             */
            public Builder dedicatedHostOwnerId(Long dedicatedHostOwnerId) {
                this.dedicatedHostOwnerId = dedicatedHostOwnerId;
                return this;
            }

            /**
             * <p>The type of the dedicated host.</p>
             * 
             * <strong>example:</strong>
             * <p>ddh.g5</p>
             */
            public Builder dedicatedHostType(String dedicatedHostType) {
                this.dedicatedHostType = dedicatedHostType;
                return this;
            }

            /**
             * <p>The description of the dedicated host.</p>
             * 
             * <strong>example:</strong>
             * <p>this-is-my-DDH</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The expiration time of the subscription dedicated host. The time follows the <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a> standard in the <code>yyyy-MM-ddTHH:mmZ</code> format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-01-01T12:00Z</p>
             */
            public Builder expiredTime(String expiredTime) {
                this.expiredTime = expiredTime;
                return this;
            }

            /**
             * <p>The GPU model.</p>
             * 
             * <strong>example:</strong>
             * <p>gpu</p>
             */
            public Builder GPUSpec(String GPUSpec) {
                this.GPUSpec = GPUSpec;
                return this;
            }

            /**
             * <p>This parameter will be removed in the future. We recommend that you use other parameters to ensure future compatibility.</p>
             */
            public Builder hostDetailInfo(HostDetailInfo hostDetailInfo) {
                this.hostDetailInfo = hostDetailInfo;
                return this;
            }

            /**
             * <p>The ECS instances that were created on the dedicated host.</p>
             */
            public Builder instances(Instances instances) {
                this.instances = instances;
                return this;
            }

            /**
             * <p>The machine code of the dedicated host.</p>
             * 
             * <strong>example:</strong>
             * <p>12aaa123456ff19dec12345d3026e****</p>
             */
            public Builder machineId(String machineId) {
                this.machineId = machineId;
                return this;
            }

            /**
             * <p>The network attributes of the dedicated host.</p>
             */
            public Builder networkAttributes(NetworkAttributes networkAttributes) {
                this.networkAttributes = networkAttributes;
                return this;
            }

            /**
             * <p>The reasons why the resources of the dedicated host were locked.</p>
             */
            public Builder operationLocks(OperationLocks operationLocks) {
                this.operationLocks = operationLocks;
                return this;
            }

            /**
             * <p>The number of physical GPUs.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder physicalGpus(Integer physicalGpus) {
                this.physicalGpus = physicalGpus;
                return this;
            }

            /**
             * <p>The region ID of the dedicated host.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The ID of the resource group to which the dedicated host belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-aek3b6jzp66****</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The unit of the subscription duration. Valid values:</p>
             * <ul>
             * <li>Month</li>
             * <li>Year</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Month</p>
             */
            public Builder saleCycle(String saleCycle) {
                this.saleCycle = saleCycle;
                return this;
            }

            /**
             * SchedulerOptions.ManagedPrivateSpaceId.
             */
            public Builder schedulerOptions_managedPrivateSpaceId(String schedulerOptions_managedPrivateSpaceId) {
                this.schedulerOptions_managedPrivateSpaceId = schedulerOptions_managedPrivateSpaceId;
                return this;
            }

            /**
             * <p>The number of physical CPUs.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder sockets(Integer sockets) {
                this.sockets = sockets;
                return this;
            }

            /**
             * <p>The status of the dedicated host. Valid values:</p>
             * <ul>
             * <li>Available: The dedicated host is running as expected.</li>
             * <li>UnderAssessment: The dedicated host is available but has potential risks that may cause the ECS instances on the dedicated host to fail.</li>
             * <li>PermanentFailure: The dedicated host has permanent failures and is unavailable.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Available</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The custom ECS instance families that are supported by the dedicated host.</p>
             */
            public Builder supportedCustomInstanceTypeFamilies(SupportedCustomInstanceTypeFamilies supportedCustomInstanceTypeFamilies) {
                this.supportedCustomInstanceTypeFamilies = supportedCustomInstanceTypeFamilies;
                return this;
            }

            /**
             * <p>The ECS instance families that are supported by the dedicated host.</p>
             */
            public Builder supportedInstanceTypeFamilies(SupportedInstanceTypeFamilies supportedInstanceTypeFamilies) {
                this.supportedInstanceTypeFamilies = supportedInstanceTypeFamilies;
                return this;
            }

            /**
             * <p>The ECS instance types that are supported by the dedicated host.</p>
             */
            public Builder supportedInstanceTypesList(SupportedInstanceTypesList supportedInstanceTypesList) {
                this.supportedInstanceTypesList = supportedInstanceTypesList;
                return this;
            }

            /**
             * <p>The tags of the dedicated host.</p>
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The zone ID of the dedicated host.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-g</p>
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public DedicatedHost build() {
                return new DedicatedHost(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDedicatedHostsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDedicatedHostsResponseBody</p>
     */
    public static class DedicatedHosts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DedicatedHost")
        private java.util.List<DedicatedHost> dedicatedHost;

        private DedicatedHosts(Builder builder) {
            this.dedicatedHost = builder.dedicatedHost;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DedicatedHosts create() {
            return builder().build();
        }

        /**
         * @return dedicatedHost
         */
        public java.util.List<DedicatedHost> getDedicatedHost() {
            return this.dedicatedHost;
        }

        public static final class Builder {
            private java.util.List<DedicatedHost> dedicatedHost; 

            private Builder() {
            } 

            private Builder(DedicatedHosts model) {
                this.dedicatedHost = model.dedicatedHost;
            } 

            /**
             * DedicatedHost.
             */
            public Builder dedicatedHost(java.util.List<DedicatedHost> dedicatedHost) {
                this.dedicatedHost = dedicatedHost;
                return this;
            }

            public DedicatedHosts build() {
                return new DedicatedHosts(this);
            } 

        } 

    }
}
