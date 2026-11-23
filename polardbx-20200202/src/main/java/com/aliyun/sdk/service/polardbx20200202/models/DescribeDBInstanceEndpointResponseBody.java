// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202.models;

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
 * {@link DescribeDBInstanceEndpointResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBInstanceEndpointResponseBody</p>
 */
public class DescribeDBInstanceEndpointResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDBInstanceEndpointResponseBody(Builder builder) {
        this.data = builder.data;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBInstanceEndpointResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeDBInstanceEndpointResponseBody model) {
            this.data = model.data;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The monitoring data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The number of entries to return on each page in a paged query. Maximum value: 100. Default value: 10. If you do not specify a value in Settings or the specified value is less than 10, the default value 10 is used for paging. If the specified value is greater than 100, the default value 100 is used.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The token used to start the next query.</p>
         * 
         * <strong>example:</strong>
         * <p>xxdds</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>A501A191-BD70-5E50-98A9-C2A486A82****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDBInstanceEndpointResponseBody build() {
            return new DescribeDBInstanceEndpointResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDBInstanceEndpointResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBInstanceEndpointResponseBody</p>
     */
    public static class Endpoint extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Address")
        private String address;

        @com.aliyun.core.annotation.NameInMap("Class")
        private String _class;

        @com.aliyun.core.annotation.NameInMap("EndpointGroupId")
        private Long endpointGroupId;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("IsDefault")
        private Boolean isDefault;

        @com.aliyun.core.annotation.NameInMap("Kind")
        private String kind;

        @com.aliyun.core.annotation.NameInMap("NetType")
        private String netType;

        @com.aliyun.core.annotation.NameInMap("ReadType")
        private String readType;

        @com.aliyun.core.annotation.NameInMap("TargetName")
        private String targetName;

        @com.aliyun.core.annotation.NameInMap("TunnelId")
        private Long tunnelId;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("UserVisible")
        private Boolean userVisible;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("Vip")
        private String vip;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("Vport")
        private Long vport;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private Endpoint(Builder builder) {
            this.address = builder.address;
            this._class = builder._class;
            this.endpointGroupId = builder.endpointGroupId;
            this.id = builder.id;
            this.isDefault = builder.isDefault;
            this.kind = builder.kind;
            this.netType = builder.netType;
            this.readType = builder.readType;
            this.targetName = builder.targetName;
            this.tunnelId = builder.tunnelId;
            this.type = builder.type;
            this.userVisible = builder.userVisible;
            this.vSwitchId = builder.vSwitchId;
            this.vip = builder.vip;
            this.vpcId = builder.vpcId;
            this.vport = builder.vport;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Endpoint create() {
            return builder().build();
        }

        /**
         * @return address
         */
        public String getAddress() {
            return this.address;
        }

        /**
         * @return _class
         */
        public String get_class() {
            return this._class;
        }

        /**
         * @return endpointGroupId
         */
        public Long getEndpointGroupId() {
            return this.endpointGroupId;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return isDefault
         */
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        /**
         * @return kind
         */
        public String getKind() {
            return this.kind;
        }

        /**
         * @return netType
         */
        public String getNetType() {
            return this.netType;
        }

        /**
         * @return readType
         */
        public String getReadType() {
            return this.readType;
        }

        /**
         * @return targetName
         */
        public String getTargetName() {
            return this.targetName;
        }

        /**
         * @return tunnelId
         */
        public Long getTunnelId() {
            return this.tunnelId;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return userVisible
         */
        public Boolean getUserVisible() {
            return this.userVisible;
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        /**
         * @return vip
         */
        public String getVip() {
            return this.vip;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        /**
         * @return vport
         */
        public Long getVport() {
            return this.vport;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String address; 
            private String _class; 
            private Long endpointGroupId; 
            private Long id; 
            private Boolean isDefault; 
            private String kind; 
            private String netType; 
            private String readType; 
            private String targetName; 
            private Long tunnelId; 
            private String type; 
            private Boolean userVisible; 
            private String vSwitchId; 
            private String vip; 
            private String vpcId; 
            private Long vport; 
            private String zoneId; 

            private Builder() {
            } 

            private Builder(Endpoint model) {
                this.address = model.address;
                this._class = model._class;
                this.endpointGroupId = model.endpointGroupId;
                this.id = model.id;
                this.isDefault = model.isDefault;
                this.kind = model.kind;
                this.netType = model.netType;
                this.readType = model.readType;
                this.targetName = model.targetName;
                this.tunnelId = model.tunnelId;
                this.type = model.type;
                this.userVisible = model.userVisible;
                this.vSwitchId = model.vSwitchId;
                this.vip = model.vip;
                this.vpcId = model.vpcId;
                this.vport = model.vport;
                this.zoneId = model.zoneId;
            } 

            /**
             * <p>The address.</p>
             * 
             * <strong>example:</strong>
             * <p>10.21.1.82</p>
             */
            public Builder address(String address) {
                this.address = address;
                return this;
            }

            /**
             * <p>The instance type (instance type code).</p>
             * 
             * <strong>example:</strong>
             * <p>mdb.shard.4x.large.d</p>
             */
            public Builder _class(String _class) {
                this._class = _class;
                return this;
            }

            /**
             * <p>The ID of the endpoint group to which the endpoint belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>123456</p>
             */
            public Builder endpointGroupId(Long endpointGroupId) {
                this.endpointGroupId = endpointGroupId;
                return this;
            }

            /**
             * <p>The ID of the logical node.</p>
             * 
             * <strong>example:</strong>
             * <p>2899</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Indicates whether the vSwitch is the default vSwitch.</p>
             * 
             * <strong>example:</strong>
             * <p>True</p>
             */
            public Builder isDefault(Boolean isDefault) {
                this.isDefault = isDefault;
                return this;
            }

            /**
             * <p>The payload type. Valid values: <code>agentTurn</code> (agent conversation) and <code>systemEvent</code> (system event).</p>
             * 
             * <strong>example:</strong>
             * <p>instance</p>
             */
            public Builder kind(String kind) {
                this.kind = kind;
                return this;
            }

            /**
             * <p>The network type of the connection string. Valid values:</p>
             * <ul>
             * <li><strong>Public</strong>: public network address.</li>
             * <li><strong>Private</strong>: private network address.</li>
             * <li><strong>Inner</strong>: private network address (classic network).</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>VPC</p>
             */
            public Builder netType(String netType) {
                this.netType = netType;
                return this;
            }

            /**
             * <p>The read/write type. Valid values: ReadWrite (row store read/write) and ColumnarRead (column store read-only).</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder readType(String readType) {
                this.readType = readType;
                return this;
            }

            /**
             * <p>The object name.</p>
             * 
             * <strong>example:</strong>
             * <p>sas-app</p>
             */
            public Builder targetName(String targetName) {
                this.targetName = targetName;
                return this;
            }

            /**
             * <p>The tunnel ID.</p>
             * 
             * <strong>example:</strong>
             * <p>3522367</p>
             */
            public Builder tunnelId(Long tunnelId) {
                this.tunnelId = tunnelId;
                return this;
            }

            /**
             * <p>The instance type. Valid values:</p>
             * <ul>
             * <li><strong>ReadWrite</strong>: primary instance.</li>
             * <li><strong>ReadOnly</strong>: read-only instance.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>TXT</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>Indicates whether the endpoint is visible to users.</p>
             */
            public Builder userVisible(Boolean userVisible) {
                this.userVisible = userVisible;
                return this;
            }

            /**
             * <p>The vSwitch ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-2ze51hh6s8tsjgy19g5eu</p>
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * <p>The IP address of the Anti-DDoS instance protected by the policy.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://100.100.100.200/latest/meta-data">http://100.100.100.200/latest/meta-data</a></p>
             */
            public Builder vip(String vip) {
                this.vip = vip;
                return this;
            }

            /**
             * <p>The ID of the VPC where the endpoint resides.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-bp1s9j8s4h4uqejp9k2z3</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * <p>The VIP port, such as 80, 8080, or 443.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder vport(Long vport) {
                this.vport = vport;
                return this;
            }

            /**
             * <p>The zone ID.</p>
             * 
             * <strong>example:</strong>
             * <p><code>curl uUys2ThR.popscan.xaliyun.com</code></p>
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public Endpoint build() {
                return new Endpoint(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDBInstanceEndpointResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBInstanceEndpointResponseBody</p>
     */
    public static class RealServer extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Activated")
        private Boolean activated;

        @com.aliyun.core.annotation.NameInMap("Class")
        private String _class;

        @com.aliyun.core.annotation.NameInMap("Ip")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("Port")
        private String port;

        @com.aliyun.core.annotation.NameInMap("ReplicaId")
        private Long replicaId;

        @com.aliyun.core.annotation.NameInMap("Weight")
        private Long weight;

        private RealServer(Builder builder) {
            this.activated = builder.activated;
            this._class = builder._class;
            this.ip = builder.ip;
            this.port = builder.port;
            this.replicaId = builder.replicaId;
            this.weight = builder.weight;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RealServer create() {
            return builder().build();
        }

        /**
         * @return activated
         */
        public Boolean getActivated() {
            return this.activated;
        }

        /**
         * @return _class
         */
        public String get_class() {
            return this._class;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return port
         */
        public String getPort() {
            return this.port;
        }

        /**
         * @return replicaId
         */
        public Long getReplicaId() {
            return this.replicaId;
        }

        /**
         * @return weight
         */
        public Long getWeight() {
            return this.weight;
        }

        public static final class Builder {
            private Boolean activated; 
            private String _class; 
            private String ip; 
            private String port; 
            private Long replicaId; 
            private Long weight; 

            private Builder() {
            } 

            private Builder(RealServer model) {
                this.activated = model.activated;
                this._class = model._class;
                this.ip = model.ip;
                this.port = model.port;
                this.replicaId = model.replicaId;
                this.weight = model.weight;
            } 

            /**
             * <p>Indicates whether the node is enabled. In the compute layer, only nodes in the primary zone are enabled. After a primary/secondary switchover is performed on the instance, the secondary node in the compute layer is switched to the primary node. All nodes in the storage layer are enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>False</p>
             */
            public Builder activated(Boolean activated) {
                this.activated = activated;
                return this;
            }

            /**
             * <p>The instance type (instance type code).</p>
             * 
             * <strong>example:</strong>
             * <p>dds.cs.mid</p>
             */
            public Builder _class(String _class) {
                this._class = _class;
                return this;
            }

            /**
             * <p>The IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>172.29.32.166</p>
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * <p>The connection port number.</p>
             * 
             * <strong>example:</strong>
             * <p>3306</p>
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The replica ID.</p>
             * 
             * <strong>example:</strong>
             * <p>123456</p>
             */
            public Builder replicaId(Long replicaId) {
                this.replicaId = replicaId;
                return this;
            }

            /**
             * <p>The weight of the destination route.</p>
             * <ul>
             * <li>For VPN gateway instances that support the dual-tunnel mode for IPsec-VPN connections, the default weight of the destination route is <strong>100</strong>, which has no actual significance.</li>
             * <li>For VPN gateway instances that support the single-tunnel mode for IPsec-VPN connections, the weight of the destination route indicates the priority of the destination route:<ul>
             * <li><strong>100</strong>: high priority. If multiple destination routes have the same destination CIDR block, the IPsec-VPN connection associated with this destination route serves as the primary link.</li>
             * <li><strong>0</strong>: low priority. If multiple destination routes have the same destination CIDR block, the IPsec-VPN connection associated with this destination route serves as the secondary link.</li>
             * </ul>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>255</p>
             */
            public Builder weight(Long weight) {
                this.weight = weight;
                return this;
            }

            public RealServer build() {
                return new RealServer(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDBInstanceEndpointResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBInstanceEndpointResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Endpoint")
        private Endpoint endpoint;

        @com.aliyun.core.annotation.NameInMap("RealServer")
        private java.util.List<RealServer> realServer;

        private Items(Builder builder) {
            this.endpoint = builder.endpoint;
            this.realServer = builder.realServer;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return endpoint
         */
        public Endpoint getEndpoint() {
            return this.endpoint;
        }

        /**
         * @return realServer
         */
        public java.util.List<RealServer> getRealServer() {
            return this.realServer;
        }

        public static final class Builder {
            private Endpoint endpoint; 
            private java.util.List<RealServer> realServer; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.endpoint = model.endpoint;
                this.realServer = model.realServer;
            } 

            /**
             * <p>The endpoint of the instance.</p>
             */
            public Builder endpoint(Endpoint endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            /**
             * <p>The addresses of the origin server.</p>
             */
            public Builder realServer(java.util.List<RealServer> realServer) {
                this.realServer = realServer;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDBInstanceEndpointResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBInstanceEndpointResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Items")
        private java.util.List<Items> items;

        private Data(Builder builder) {
            this.items = builder.items;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return items
         */
        public java.util.List<Items> getItems() {
            return this.items;
        }

        public static final class Builder {
            private java.util.List<Items> items; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.items = model.items;
            } 

            /**
             * <p>The internal connection method. Fixed value: 1, which indicates the classic network.</p>
             */
            public Builder items(java.util.List<Items> items) {
                this.items = items;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
