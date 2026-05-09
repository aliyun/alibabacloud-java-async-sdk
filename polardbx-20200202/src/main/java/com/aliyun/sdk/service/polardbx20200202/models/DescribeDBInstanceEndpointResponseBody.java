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
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
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
             * Address.
             */
            public Builder address(String address) {
                this.address = address;
                return this;
            }

            /**
             * Class.
             */
            public Builder _class(String _class) {
                this._class = _class;
                return this;
            }

            /**
             * EndpointGroupId.
             */
            public Builder endpointGroupId(Long endpointGroupId) {
                this.endpointGroupId = endpointGroupId;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * IsDefault.
             */
            public Builder isDefault(Boolean isDefault) {
                this.isDefault = isDefault;
                return this;
            }

            /**
             * Kind.
             */
            public Builder kind(String kind) {
                this.kind = kind;
                return this;
            }

            /**
             * NetType.
             */
            public Builder netType(String netType) {
                this.netType = netType;
                return this;
            }

            /**
             * ReadType.
             */
            public Builder readType(String readType) {
                this.readType = readType;
                return this;
            }

            /**
             * TargetName.
             */
            public Builder targetName(String targetName) {
                this.targetName = targetName;
                return this;
            }

            /**
             * TunnelId.
             */
            public Builder tunnelId(Long tunnelId) {
                this.tunnelId = tunnelId;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * UserVisible.
             */
            public Builder userVisible(Boolean userVisible) {
                this.userVisible = userVisible;
                return this;
            }

            /**
             * VSwitchId.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * Vip.
             */
            public Builder vip(String vip) {
                this.vip = vip;
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
             * Vport.
             */
            public Builder vport(Long vport) {
                this.vport = vport;
                return this;
            }

            /**
             * ZoneId.
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
             * Activated.
             */
            public Builder activated(Boolean activated) {
                this.activated = activated;
                return this;
            }

            /**
             * Class.
             */
            public Builder _class(String _class) {
                this._class = _class;
                return this;
            }

            /**
             * Ip.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * Port.
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * ReplicaId.
             */
            public Builder replicaId(Long replicaId) {
                this.replicaId = replicaId;
                return this;
            }

            /**
             * Weight.
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
             * Endpoint.
             */
            public Builder endpoint(Endpoint endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            /**
             * RealServer.
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
             * Items.
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
