// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.foasconsole20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstancesResponseBody</p>
 */
public class DescribeInstancesResponseBody extends TeaModel {
    @NameInMap("Instances")
    private java.util.List < Instances> instances;

    @NameInMap("PageIndex")
    private Integer pageIndex;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TotalCount")
    private Long totalCount;

    @NameInMap("TotalPage")
    private Integer totalPage;

    private DescribeInstancesResponseBody(Builder builder) {
        this.instances = builder.instances;
        this.pageIndex = builder.pageIndex;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
        this.totalPage = builder.totalPage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstancesResponseBody create() {
        return builder().build();
    }

    /**
     * @return instances
     */
    public java.util.List < Instances> getInstances() {
        return this.instances;
    }

    /**
     * @return pageIndex
     */
    public Integer getPageIndex() {
        return this.pageIndex;
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return totalPage
     */
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static final class Builder {
        private java.util.List < Instances> instances; 
        private Integer pageIndex; 
        private Integer pageSize; 
        private String requestId; 
        private Boolean success; 
        private Long totalCount; 
        private Integer totalPage; 

        /**
         * Instances.
         */
        public Builder instances(java.util.List < Instances> instances) {
            this.instances = instances;
            return this;
        }

        /**
         * PageIndex.
         */
        public Builder pageIndex(Integer pageIndex) {
            this.pageIndex = pageIndex;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * TotalPage.
         */
        public Builder totalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }

        public DescribeInstancesResponseBody build() {
            return new DescribeInstancesResponseBody(this);
        } 

    } 

    public static class HostAliases extends TeaModel {
        @NameInMap("HostNames")
        @Validation(required = true)
        private java.util.List < String > hostNames;

        @NameInMap("Ip")
        @Validation(required = true)
        private String ip;

        private HostAliases(Builder builder) {
            this.hostNames = builder.hostNames;
            this.ip = builder.ip;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HostAliases create() {
            return builder().build();
        }

        /**
         * @return hostNames
         */
        public java.util.List < String > getHostNames() {
            return this.hostNames;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        public static final class Builder {
            private java.util.List < String > hostNames; 
            private String ip; 

            /**
             * HostNames.
             */
            public Builder hostNames(java.util.List < String > hostNames) {
                this.hostNames = hostNames;
                return this;
            }

            /**
             * Ip.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            public HostAliases build() {
                return new HostAliases(this);
            } 

        } 

    }
    public static class ResourceSpec extends TeaModel {
        @NameInMap("Cpu")
        private Integer cpu;

        @NameInMap("MemoryGB")
        private Integer memoryGB;

        private ResourceSpec(Builder builder) {
            this.cpu = builder.cpu;
            this.memoryGB = builder.memoryGB;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceSpec create() {
            return builder().build();
        }

        /**
         * @return cpu
         */
        public Integer getCpu() {
            return this.cpu;
        }

        /**
         * @return memoryGB
         */
        public Integer getMemoryGB() {
            return this.memoryGB;
        }

        public static final class Builder {
            private Integer cpu; 
            private Integer memoryGB; 

            /**
             * Cpu.
             */
            public Builder cpu(Integer cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * MemoryGB.
             */
            public Builder memoryGB(Integer memoryGB) {
                this.memoryGB = memoryGB;
                return this;
            }

            public ResourceSpec build() {
                return new ResourceSpec(this);
            } 

        } 

    }
    public static class Oss extends TeaModel {
        @NameInMap("Bucket")
        private String bucket;

        private Oss(Builder builder) {
            this.bucket = builder.bucket;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Oss create() {
            return builder().build();
        }

        /**
         * @return bucket
         */
        public String getBucket() {
            return this.bucket;
        }

        public static final class Builder {
            private String bucket; 

            /**
             * Bucket.
             */
            public Builder bucket(String bucket) {
                this.bucket = bucket;
                return this;
            }

            public Oss build() {
                return new Oss(this);
            } 

        } 

    }
    public static class Storage extends TeaModel {
        @NameInMap("Oss")
        private Oss oss;

        private Storage(Builder builder) {
            this.oss = builder.oss;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Storage create() {
            return builder().build();
        }

        /**
         * @return oss
         */
        public Oss getOss() {
            return this.oss;
        }

        public static final class Builder {
            private Oss oss; 

            /**
             * Oss.
             */
            public Builder oss(Oss oss) {
                this.oss = oss;
                return this;
            }

            public Storage build() {
                return new Storage(this);
            } 

        } 

    }
    public static class Tags extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    public static class Instances extends TeaModel {
        @NameInMap("ArchitectureType")
        private String architectureType;

        @NameInMap("AskClusterId")
        private String askClusterId;

        @NameInMap("ChargeType")
        private String chargeType;

        @NameInMap("ClusterStatus")
        private String clusterStatus;

        @NameInMap("HostAliases")
        @Validation(required = true)
        private java.util.List < HostAliases> hostAliases;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("InstanceName")
        private String instanceName;

        @NameInMap("OrderState")
        private String orderState;

        @NameInMap("Region")
        private String region;

        @NameInMap("ResourceCreateTime")
        private Long resourceCreateTime;

        @NameInMap("ResourceExpiredTime")
        private Long resourceExpiredTime;

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @NameInMap("ResourceId")
        private String resourceId;

        @NameInMap("ResourceSpec")
        private ResourceSpec resourceSpec;

        @NameInMap("Storage")
        private Storage storage;

        @NameInMap("Tags")
        private java.util.List < Tags> tags;

        @NameInMap("Uid")
        private String uid;

        @NameInMap("VSwitchIds")
        private java.util.List < String > vSwitchIds;

        @NameInMap("VpcId")
        private String vpcId;

        @NameInMap("ZoneId")
        private String zoneId;

        private Instances(Builder builder) {
            this.architectureType = builder.architectureType;
            this.askClusterId = builder.askClusterId;
            this.chargeType = builder.chargeType;
            this.clusterStatus = builder.clusterStatus;
            this.hostAliases = builder.hostAliases;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.orderState = builder.orderState;
            this.region = builder.region;
            this.resourceCreateTime = builder.resourceCreateTime;
            this.resourceExpiredTime = builder.resourceExpiredTime;
            this.resourceGroupId = builder.resourceGroupId;
            this.resourceId = builder.resourceId;
            this.resourceSpec = builder.resourceSpec;
            this.storage = builder.storage;
            this.tags = builder.tags;
            this.uid = builder.uid;
            this.vSwitchIds = builder.vSwitchIds;
            this.vpcId = builder.vpcId;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Instances create() {
            return builder().build();
        }

        /**
         * @return architectureType
         */
        public String getArchitectureType() {
            return this.architectureType;
        }

        /**
         * @return askClusterId
         */
        public String getAskClusterId() {
            return this.askClusterId;
        }

        /**
         * @return chargeType
         */
        public String getChargeType() {
            return this.chargeType;
        }

        /**
         * @return clusterStatus
         */
        public String getClusterStatus() {
            return this.clusterStatus;
        }

        /**
         * @return hostAliases
         */
        public java.util.List < HostAliases> getHostAliases() {
            return this.hostAliases;
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
         * @return orderState
         */
        public String getOrderState() {
            return this.orderState;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return resourceCreateTime
         */
        public Long getResourceCreateTime() {
            return this.resourceCreateTime;
        }

        /**
         * @return resourceExpiredTime
         */
        public Long getResourceExpiredTime() {
            return this.resourceExpiredTime;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        /**
         * @return resourceSpec
         */
        public ResourceSpec getResourceSpec() {
            return this.resourceSpec;
        }

        /**
         * @return storage
         */
        public Storage getStorage() {
            return this.storage;
        }

        /**
         * @return tags
         */
        public java.util.List < Tags> getTags() {
            return this.tags;
        }

        /**
         * @return uid
         */
        public String getUid() {
            return this.uid;
        }

        /**
         * @return vSwitchIds
         */
        public java.util.List < String > getVSwitchIds() {
            return this.vSwitchIds;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String architectureType; 
            private String askClusterId; 
            private String chargeType; 
            private String clusterStatus; 
            private java.util.List < HostAliases> hostAliases; 
            private String instanceId; 
            private String instanceName; 
            private String orderState; 
            private String region; 
            private Long resourceCreateTime; 
            private Long resourceExpiredTime; 
            private String resourceGroupId; 
            private String resourceId; 
            private ResourceSpec resourceSpec; 
            private Storage storage; 
            private java.util.List < Tags> tags; 
            private String uid; 
            private java.util.List < String > vSwitchIds; 
            private String vpcId; 
            private String zoneId; 

            /**
             * ArchitectureType.
             */
            public Builder architectureType(String architectureType) {
                this.architectureType = architectureType;
                return this;
            }

            /**
             * AskClusterId.
             */
            public Builder askClusterId(String askClusterId) {
                this.askClusterId = askClusterId;
                return this;
            }

            /**
             * ChargeType.
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * ClusterStatus.
             */
            public Builder clusterStatus(String clusterStatus) {
                this.clusterStatus = clusterStatus;
                return this;
            }

            /**
             * HostAliases.
             */
            public Builder hostAliases(java.util.List < HostAliases> hostAliases) {
                this.hostAliases = hostAliases;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * InstanceName.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * OrderState.
             */
            public Builder orderState(String orderState) {
                this.orderState = orderState;
                return this;
            }

            /**
             * Region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * ResourceCreateTime.
             */
            public Builder resourceCreateTime(Long resourceCreateTime) {
                this.resourceCreateTime = resourceCreateTime;
                return this;
            }

            /**
             * ResourceExpiredTime.
             */
            public Builder resourceExpiredTime(Long resourceExpiredTime) {
                this.resourceExpiredTime = resourceExpiredTime;
                return this;
            }

            /**
             * ResourceGroupId.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * ResourceId.
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * ResourceSpec.
             */
            public Builder resourceSpec(ResourceSpec resourceSpec) {
                this.resourceSpec = resourceSpec;
                return this;
            }

            /**
             * Storage.
             */
            public Builder storage(Storage storage) {
                this.storage = storage;
                return this;
            }

            /**
             * Tags.
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * Uid.
             */
            public Builder uid(String uid) {
                this.uid = uid;
                return this;
            }

            /**
             * VSwitchIds.
             */
            public Builder vSwitchIds(java.util.List < String > vSwitchIds) {
                this.vSwitchIds = vSwitchIds;
                return this;
            }

            /**
             * VpcId.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * ZoneId.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public Instances build() {
                return new Instances(this);
            } 

        } 

    }
}
