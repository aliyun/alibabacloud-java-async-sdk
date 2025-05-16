// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20240730.models;

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
 * {@link ListNodesResponseBody} extends {@link TeaModel}
 *
 * <p>ListNodesResponseBody</p>
 */
public class ListNodesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Nodes")
    private java.util.List<Nodes> nodes;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListNodesResponseBody(Builder builder) {
        this.nodes = builder.nodes;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListNodesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return nodes
     */
    public java.util.List<Nodes> getNodes() {
        return this.nodes;
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
        private java.util.List<Nodes> nodes; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListNodesResponseBody model) {
            this.nodes = model.nodes;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The information about the nodes.</p>
         */
        public Builder nodes(java.util.List<Nodes> nodes) {
            this.nodes = nodes;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>89A1AC0F-4A6C-4F3D-98F9-BEF9A823****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListNodesResponseBody build() {
            return new ListNodesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListNodesResponseBody} extends {@link TeaModel}
     *
     * <p>ListNodesResponseBody</p>
     */
    public static class TotalResources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cpu")
        private Integer cpu;

        @com.aliyun.core.annotation.NameInMap("Gpu")
        private Integer gpu;

        @com.aliyun.core.annotation.NameInMap("Memory")
        private Integer memory;

        private TotalResources(Builder builder) {
            this.cpu = builder.cpu;
            this.gpu = builder.gpu;
            this.memory = builder.memory;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TotalResources create() {
            return builder().build();
        }

        /**
         * @return cpu
         */
        public Integer getCpu() {
            return this.cpu;
        }

        /**
         * @return gpu
         */
        public Integer getGpu() {
            return this.gpu;
        }

        /**
         * @return memory
         */
        public Integer getMemory() {
            return this.memory;
        }

        public static final class Builder {
            private Integer cpu; 
            private Integer gpu; 
            private Integer memory; 

            private Builder() {
            } 

            private Builder(TotalResources model) {
                this.cpu = model.cpu;
                this.gpu = model.gpu;
                this.memory = model.memory;
            } 

            /**
             * <p>The number of vCPUs.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder cpu(Integer cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * <p>The number of GPUs.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder gpu(Integer gpu) {
                this.gpu = gpu;
                return this;
            }

            /**
             * <p>The amount of memory. Unit: GiB.</p>
             * 
             * <strong>example:</strong>
             * <p>1024</p>
             */
            public Builder memory(Integer memory) {
                this.memory = memory;
                return this;
            }

            public TotalResources build() {
                return new TotalResources(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListNodesResponseBody} extends {@link TeaModel}
     *
     * <p>ListNodesResponseBody</p>
     */
    public static class Nodes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AddTime")
        private String addTime;

        @com.aliyun.core.annotation.NameInMap("DeploymentSetId")
        private String deploymentSetId;

        @com.aliyun.core.annotation.NameInMap("ExpiredTime")
        private String expiredTime;

        @com.aliyun.core.annotation.NameInMap("Hostname")
        private String hostname;

        @com.aliyun.core.annotation.NameInMap("HtEnabled")
        private Boolean htEnabled;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("ImageId")
        private String imageId;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("IpAddress")
        private String ipAddress;

        @com.aliyun.core.annotation.NameInMap("KeepAlive")
        private Boolean keepAlive;

        @com.aliyun.core.annotation.NameInMap("PublicIpAddress")
        private String publicIpAddress;

        @com.aliyun.core.annotation.NameInMap("QueueName")
        private String queueName;

        @com.aliyun.core.annotation.NameInMap("SpotStrategy")
        private String spotStrategy;

        @com.aliyun.core.annotation.NameInMap("StateInSched")
        private String stateInSched;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TotalResources")
        private TotalResources totalResources;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private Nodes(Builder builder) {
            this.addTime = builder.addTime;
            this.deploymentSetId = builder.deploymentSetId;
            this.expiredTime = builder.expiredTime;
            this.hostname = builder.hostname;
            this.htEnabled = builder.htEnabled;
            this.id = builder.id;
            this.imageId = builder.imageId;
            this.instanceType = builder.instanceType;
            this.ipAddress = builder.ipAddress;
            this.keepAlive = builder.keepAlive;
            this.publicIpAddress = builder.publicIpAddress;
            this.queueName = builder.queueName;
            this.spotStrategy = builder.spotStrategy;
            this.stateInSched = builder.stateInSched;
            this.status = builder.status;
            this.totalResources = builder.totalResources;
            this.vSwitchId = builder.vSwitchId;
            this.vpcId = builder.vpcId;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Nodes create() {
            return builder().build();
        }

        /**
         * @return addTime
         */
        public String getAddTime() {
            return this.addTime;
        }

        /**
         * @return deploymentSetId
         */
        public String getDeploymentSetId() {
            return this.deploymentSetId;
        }

        /**
         * @return expiredTime
         */
        public String getExpiredTime() {
            return this.expiredTime;
        }

        /**
         * @return hostname
         */
        public String getHostname() {
            return this.hostname;
        }

        /**
         * @return htEnabled
         */
        public Boolean getHtEnabled() {
            return this.htEnabled;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return imageId
         */
        public String getImageId() {
            return this.imageId;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return ipAddress
         */
        public String getIpAddress() {
            return this.ipAddress;
        }

        /**
         * @return keepAlive
         */
        public Boolean getKeepAlive() {
            return this.keepAlive;
        }

        /**
         * @return publicIpAddress
         */
        public String getPublicIpAddress() {
            return this.publicIpAddress;
        }

        /**
         * @return queueName
         */
        public String getQueueName() {
            return this.queueName;
        }

        /**
         * @return spotStrategy
         */
        public String getSpotStrategy() {
            return this.spotStrategy;
        }

        /**
         * @return stateInSched
         */
        public String getStateInSched() {
            return this.stateInSched;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return totalResources
         */
        public TotalResources getTotalResources() {
            return this.totalResources;
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
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
            private String addTime; 
            private String deploymentSetId; 
            private String expiredTime; 
            private String hostname; 
            private Boolean htEnabled; 
            private String id; 
            private String imageId; 
            private String instanceType; 
            private String ipAddress; 
            private Boolean keepAlive; 
            private String publicIpAddress; 
            private String queueName; 
            private String spotStrategy; 
            private String stateInSched; 
            private String status; 
            private TotalResources totalResources; 
            private String vSwitchId; 
            private String vpcId; 
            private String zoneId; 

            private Builder() {
            } 

            private Builder(Nodes model) {
                this.addTime = model.addTime;
                this.deploymentSetId = model.deploymentSetId;
                this.expiredTime = model.expiredTime;
                this.hostname = model.hostname;
                this.htEnabled = model.htEnabled;
                this.id = model.id;
                this.imageId = model.imageId;
                this.instanceType = model.instanceType;
                this.ipAddress = model.ipAddress;
                this.keepAlive = model.keepAlive;
                this.publicIpAddress = model.publicIpAddress;
                this.queueName = model.queueName;
                this.spotStrategy = model.spotStrategy;
                this.stateInSched = model.stateInSched;
                this.status = model.status;
                this.totalResources = model.totalResources;
                this.vSwitchId = model.vSwitchId;
                this.vpcId = model.vpcId;
                this.zoneId = model.zoneId;
            } 

            /**
             * <p>The time when the node was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-06-09T06:22:02.000Z</p>
             */
            public Builder addTime(String addTime) {
                this.addTime = addTime;
                return this;
            }

            /**
             * <p>The deployment set ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ds-8vbe4av4gededlqg****</p>
             */
            public Builder deploymentSetId(String deploymentSetId) {
                this.deploymentSetId = deploymentSetId;
                return this;
            }

            /**
             * <p>The time when the node expires.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-06-09T06:22:02.000Z</p>
             */
            public Builder expiredTime(String expiredTime) {
                this.expiredTime = expiredTime;
                return this;
            }

            /**
             * <p>The hostname of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>edas.cn-shanghai.aliyuncs.com</p>
             */
            public Builder hostname(String hostname) {
                this.hostname = hostname;
                return this;
            }

            /**
             * <p>Indicates whether hyper-threading is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder htEnabled(Boolean htEnabled) {
                this.htEnabled = htEnabled;
                return this;
            }

            /**
             * <p>The instance ID of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>i-bp15707mys2rsy0j****</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The image ID of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>centos_7_06_64_20G_alibase_20190711.vhd</p>
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * <p>The instance type of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>ecs.c5.large</p>
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * <p>The VPC IP address of the node.</p>
             * 
             * <strong>example:</strong>
             * <p><code>172.16.**.**</code></p>
             */
            public Builder ipAddress(String ipAddress) {
                this.ipAddress = ipAddress;
                return this;
            }

            /**
             * <p>Indicates whether deletion protection is enabled for the node. Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder keepAlive(Boolean keepAlive) {
                this.keepAlive = keepAlive;
                return this;
            }

            /**
             * <p>The public IP address of the node.</p>
             * 
             * <strong>example:</strong>
             * <p><code>172.16.**.**</code></p>
             */
            public Builder publicIpAddress(String publicIpAddress) {
                this.publicIpAddress = publicIpAddress;
                return this;
            }

            /**
             * <p>The name of the queue to which the node belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>autoque3</p>
             */
            public Builder queueName(String queueName) {
                this.queueName = queueName;
                return this;
            }

            /**
             * <p>The bidding policy of the node. Valid values:</p>
             * <ul>
             * <li>NoSpot: The instances of the compute node are pay-as-you-go instances.</li>
             * <li>SpotWithPriceLimit: The instances are created as preemptible instances with a user-defined maximum hourly price.</li>
             * <li>SpotAsPriceGo: The node is a preemptible instance for which the market price at the time of purchase is automatically used as the bidding price.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>NoSpot</p>
             */
            public Builder spotStrategy(String spotStrategy) {
                this.spotStrategy = spotStrategy;
                return this;
            }

            /**
             * <p>The node state in the scheduler.</p>
             * 
             * <strong>example:</strong>
             * <p>active</p>
             */
            public Builder stateInSched(String stateInSched) {
                this.stateInSched = stateInSched;
                return this;
            }

            /**
             * <p>The node state. Valid values:</p>
             * <ul>
             * <li>uninit: The node is being installed.</li>
             * <li>initing: The node is being initialized.</li>
             * <li>running: The node is running.</li>
             * <li>releasing: The node is being released.</li>
             * <li>stopped: The node is stopped.</li>
             * <li>exception: The node has run into an exception.</li>
             * <li>untracking: The node is not added to the cluster.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>running</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The hardware configurations of the node.</p>
             */
            public Builder totalResources(TotalResources totalResources) {
                this.totalResources = totalResources;
                return this;
            }

            /**
             * <p>The vSwitch ID of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-bp1e47optm9g58zcu****</p>
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * <p>The VPC ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-bp1gnu8br4ay7beb2w****</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * <p>The zone ID of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-b</p>
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public Nodes build() {
                return new Nodes(this);
            } 

        } 

    }
}
