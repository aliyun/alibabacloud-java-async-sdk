// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link DescribeNetworkPeerConnectionsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeNetworkPeerConnectionsResponseBody</p>
 */
public class DescribeNetworkPeerConnectionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NetworkPeerConnects")
    private java.util.List<NetworkPeerConnects> networkPeerConnects;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private String pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private String pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private String totalCount;

    private DescribeNetworkPeerConnectionsResponseBody(Builder builder) {
        this.networkPeerConnects = builder.networkPeerConnects;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNetworkPeerConnectionsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return networkPeerConnects
     */
    public java.util.List<NetworkPeerConnects> getNetworkPeerConnects() {
        return this.networkPeerConnects;
    }

    /**
     * @return pageNumber
     */
    public String getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
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
    public String getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<NetworkPeerConnects> networkPeerConnects; 
        private String pageNumber; 
        private String pageSize; 
        private String requestId; 
        private String totalCount; 

        private Builder() {
        } 

        private Builder(DescribeNetworkPeerConnectionsResponseBody model) {
            this.networkPeerConnects = model.networkPeerConnects;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>A list of the network peering connections.</p>
         */
        public Builder networkPeerConnects(java.util.List<NetworkPeerConnects> networkPeerConnects) {
            this.networkPeerConnects = networkPeerConnects;
            return this;
        }

        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(String pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder pageSize(String pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>CEF72CEB-54B6-4AE8-B225-F876FF7BA984</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeNetworkPeerConnectionsResponseBody build() {
            return new DescribeNetworkPeerConnectionsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeNetworkPeerConnectionsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNetworkPeerConnectionsResponseBody</p>
     */
    public static class AcceptingNetwork extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Ipv4Cidrs")
        private java.util.List<String> ipv4Cidrs;

        @com.aliyun.core.annotation.NameInMap("NetworkId")
        private String networkId;

        private AcceptingNetwork(Builder builder) {
            this.ipv4Cidrs = builder.ipv4Cidrs;
            this.networkId = builder.networkId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AcceptingNetwork create() {
            return builder().build();
        }

        /**
         * @return ipv4Cidrs
         */
        public java.util.List<String> getIpv4Cidrs() {
            return this.ipv4Cidrs;
        }

        /**
         * @return networkId
         */
        public String getNetworkId() {
            return this.networkId;
        }

        public static final class Builder {
            private java.util.List<String> ipv4Cidrs; 
            private String networkId; 

            private Builder() {
            } 

            private Builder(AcceptingNetwork model) {
                this.ipv4Cidrs = model.ipv4Cidrs;
                this.networkId = model.networkId;
            } 

            /**
             * <p>The CIDR blocks of the accepter network.</p>
             */
            public Builder ipv4Cidrs(java.util.List<String> ipv4Cidrs) {
                this.ipv4Cidrs = ipv4Cidrs;
                return this;
            }

            /**
             * <p>The network ID of the accepter.</p>
             * 
             * <strong>example:</strong>
             * <p>n-5q28114****</p>
             */
            public Builder networkId(String networkId) {
                this.networkId = networkId;
                return this;
            }

            public AcceptingNetwork build() {
                return new AcceptingNetwork(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeNetworkPeerConnectionsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNetworkPeerConnectionsResponseBody</p>
     */
    public static class Network extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Ipv4Cidrs")
        private java.util.List<String> ipv4Cidrs;

        @com.aliyun.core.annotation.NameInMap("NetworkId")
        private String networkId;

        private Network(Builder builder) {
            this.ipv4Cidrs = builder.ipv4Cidrs;
            this.networkId = builder.networkId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Network create() {
            return builder().build();
        }

        /**
         * @return ipv4Cidrs
         */
        public java.util.List<String> getIpv4Cidrs() {
            return this.ipv4Cidrs;
        }

        /**
         * @return networkId
         */
        public String getNetworkId() {
            return this.networkId;
        }

        public static final class Builder {
            private java.util.List<String> ipv4Cidrs; 
            private String networkId; 

            private Builder() {
            } 

            private Builder(Network model) {
                this.ipv4Cidrs = model.ipv4Cidrs;
                this.networkId = model.networkId;
            } 

            /**
             * <p>The CIDR blocks of the requester network.</p>
             */
            public Builder ipv4Cidrs(java.util.List<String> ipv4Cidrs) {
                this.ipv4Cidrs = ipv4Cidrs;
                return this;
            }

            /**
             * <p>The network ID of the requester.</p>
             * 
             * <strong>example:</strong>
             * <p>n-5q73bm****</p>
             */
            public Builder networkId(String networkId) {
                this.networkId = networkId;
                return this;
            }

            public Network build() {
                return new Network(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeNetworkPeerConnectionsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNetworkPeerConnectionsResponseBody</p>
     */
    public static class NetworkPeerConnects extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AcceptingNetwork")
        private AcceptingNetwork acceptingNetwork;

        @com.aliyun.core.annotation.NameInMap("AcceptingNetworkId")
        private String acceptingNetworkId;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("EnsRegionId")
        private String ensRegionId;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Network")
        private Network network;

        @com.aliyun.core.annotation.NameInMap("NetworkId")
        private String networkId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private NetworkPeerConnects(Builder builder) {
            this.acceptingNetwork = builder.acceptingNetwork;
            this.acceptingNetworkId = builder.acceptingNetworkId;
            this.creationTime = builder.creationTime;
            this.description = builder.description;
            this.ensRegionId = builder.ensRegionId;
            this.instanceId = builder.instanceId;
            this.name = builder.name;
            this.network = builder.network;
            this.networkId = builder.networkId;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NetworkPeerConnects create() {
            return builder().build();
        }

        /**
         * @return acceptingNetwork
         */
        public AcceptingNetwork getAcceptingNetwork() {
            return this.acceptingNetwork;
        }

        /**
         * @return acceptingNetworkId
         */
        public String getAcceptingNetworkId() {
            return this.acceptingNetworkId;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return ensRegionId
         */
        public String getEnsRegionId() {
            return this.ensRegionId;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return network
         */
        public Network getNetwork() {
            return this.network;
        }

        /**
         * @return networkId
         */
        public String getNetworkId() {
            return this.networkId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private AcceptingNetwork acceptingNetwork; 
            private String acceptingNetworkId; 
            private String creationTime; 
            private String description; 
            private String ensRegionId; 
            private String instanceId; 
            private String name; 
            private Network network; 
            private String networkId; 
            private String status; 

            private Builder() {
            } 

            private Builder(NetworkPeerConnects model) {
                this.acceptingNetwork = model.acceptingNetwork;
                this.acceptingNetworkId = model.acceptingNetworkId;
                this.creationTime = model.creationTime;
                this.description = model.description;
                this.ensRegionId = model.ensRegionId;
                this.instanceId = model.instanceId;
                this.name = model.name;
                this.network = model.network;
                this.networkId = model.networkId;
                this.status = model.status;
            } 

            /**
             * <p>Details of the accepter network.</p>
             */
            public Builder acceptingNetwork(AcceptingNetwork acceptingNetwork) {
                this.acceptingNetwork = acceptingNetwork;
                return this;
            }

            /**
             * <p>The network ID of the accepter.</p>
             * 
             * <strong>example:</strong>
             * <p>n-5q28114****</p>
             */
            public Builder acceptingNetworkId(String acceptingNetworkId) {
                this.acceptingNetworkId = acceptingNetworkId;
                return this;
            }

            /**
             * <p>The creation time in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-05-31T06:43:29Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The description of the network peering connection.</p>
             * 
             * <strong>example:</strong>
             * <p>desc</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The ID of the ENS node.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-dongguan-9</p>
             */
            public Builder ensRegionId(String ensRegionId) {
                this.ensRegionId = ensRegionId;
                return this;
            }

            /**
             * <p>The ID of the network peering connection.</p>
             * 
             * <strong>example:</strong>
             * <p>pcc-521pzxdg****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The name of the network peering connection.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Details of the requester network.</p>
             */
            public Builder network(Network network) {
                this.network = network;
                return this;
            }

            /**
             * <p>The network ID of the requester.</p>
             * 
             * <strong>example:</strong>
             * <p>n-5q73bm****</p>
             */
            public Builder networkId(String networkId) {
                this.networkId = networkId;
                return this;
            }

            /**
             * <p>The status of the network peering connection. Valid values:</p>
             * <ul>
             * <li><p><code>Creating</code>: The connection is being created.</p>
             * </li>
             * <li><p><code>Activated</code>: The connection is active.</p>
             * </li>
             * <li><p><code>Deleting</code>: The connection is being deleted.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Activated</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public NetworkPeerConnects build() {
                return new NetworkPeerConnects(this);
            } 

        } 

    }
}
