// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pvtz20180101.models;

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
 * {@link AddResolverRuleRequest} extends {@link RequestModel}
 *
 * <p>AddResolverRuleRequest</p>
 */
public class AddResolverRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EdgeDnsClusters")
    private java.util.List<EdgeDnsClusters> edgeDnsClusters;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndpointId")
    private String endpointId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ForwardIp")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<ForwardIp> forwardIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Vpcs")
    private java.util.List<Vpcs> vpcs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String zoneName;

    private AddResolverRuleRequest(Builder builder) {
        super(builder);
        this.edgeDnsClusters = builder.edgeDnsClusters;
        this.endpointId = builder.endpointId;
        this.forwardIp = builder.forwardIp;
        this.lang = builder.lang;
        this.name = builder.name;
        this.type = builder.type;
        this.vpcs = builder.vpcs;
        this.zoneName = builder.zoneName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddResolverRuleRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return edgeDnsClusters
     */
    public java.util.List<EdgeDnsClusters> getEdgeDnsClusters() {
        return this.edgeDnsClusters;
    }

    /**
     * @return endpointId
     */
    public String getEndpointId() {
        return this.endpointId;
    }

    /**
     * @return forwardIp
     */
    public java.util.List<ForwardIp> getForwardIp() {
        return this.forwardIp;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return vpcs
     */
    public java.util.List<Vpcs> getVpcs() {
        return this.vpcs;
    }

    /**
     * @return zoneName
     */
    public String getZoneName() {
        return this.zoneName;
    }

    public static final class Builder extends Request.Builder<AddResolverRuleRequest, Builder> {
        private java.util.List<EdgeDnsClusters> edgeDnsClusters; 
        private String endpointId; 
        private java.util.List<ForwardIp> forwardIp; 
        private String lang; 
        private String name; 
        private String type; 
        private java.util.List<Vpcs> vpcs; 
        private String zoneName; 

        private Builder() {
            super();
        } 

        private Builder(AddResolverRuleRequest request) {
            super(request);
            this.edgeDnsClusters = request.edgeDnsClusters;
            this.endpointId = request.endpointId;
            this.forwardIp = request.forwardIp;
            this.lang = request.lang;
            this.name = request.name;
            this.type = request.type;
            this.vpcs = request.vpcs;
            this.zoneName = request.zoneName;
        } 

        /**
         * EdgeDnsClusters.
         */
        public Builder edgeDnsClusters(java.util.List<EdgeDnsClusters> edgeDnsClusters) {
            this.putQueryParameter("EdgeDnsClusters", edgeDnsClusters);
            this.edgeDnsClusters = edgeDnsClusters;
            return this;
        }

        /**
         * <p>The outbound endpoint ID. The outbound endpoint is used to forward the DNS requests to the specified destination IP addresses.</p>
         * 
         * <strong>example:</strong>
         * <p>hr****</p>
         */
        public Builder endpointId(String endpointId) {
            this.putQueryParameter("EndpointId", endpointId);
            this.endpointId = endpointId;
            return this;
        }

        /**
         * <p>The IP addresses and ports of the external DNS servers. Enter the IP addresses and ports of the destination servers to which the DNS requests are forwarded. You can enter up to <strong>six</strong> IP addresses and ports. Both private and public IP addresses are supported.</p>
         * <blockquote>
         * <p> If you specify public IP addresses as the IP addresses of the external DNS servers and Elastic Compute Service (ECS) instances in the outbound VPC are not assigned public IP addresses, you need to activate NAT Gateway for the VPC and create and manage SNAT entries on a NAT gateway.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         */
        public Builder forwardIp(java.util.List<ForwardIp> forwardIp) {
            this.putQueryParameter("ForwardIp", forwardIp);
            this.forwardIp = forwardIp;
            return this;
        }

        /**
         * <p>The language of the response. Valid values:</p>
         * <ul>
         * <li>zh: Chinese</li>
         * <li>en: English</li>
         * </ul>
         * <p>Default value: en.</p>
         * 
         * <strong>example:</strong>
         * <p>en</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The name of the forwarding rule. You can name the rule based on your business requirements.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The type of the forwarding rule. The parameter value can only be OUTBOUND, which indicates that DNS requests are forwarded to one or more external IP addresses.</p>
         * <blockquote>
         * <p> You cannot change the value of Type after you create the forwarding rule.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>OUTBOUND</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * Vpcs.
         */
        public Builder vpcs(java.util.List<Vpcs> vpcs) {
            this.putQueryParameter("Vpcs", vpcs);
            this.vpcs = vpcs;
            return this;
        }

        /**
         * <p>The zone for which you want to forward DNS requests.</p>
         * <blockquote>
         * <p> You cannot change the value of ZoneName after you create the forwarding rule.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        public Builder zoneName(String zoneName) {
            this.putQueryParameter("ZoneName", zoneName);
            this.zoneName = zoneName;
            return this;
        }

        @Override
        public AddResolverRuleRequest build() {
            return new AddResolverRuleRequest(this);
        } 

    } 

    /**
     * 
     * {@link AddResolverRuleRequest} extends {@link TeaModel}
     *
     * <p>AddResolverRuleRequest</p>
     */
    public static class EdgeDnsClusters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClusterId")
        private String clusterId;

        private EdgeDnsClusters(Builder builder) {
            this.clusterId = builder.clusterId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EdgeDnsClusters create() {
            return builder().build();
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        public static final class Builder {
            private String clusterId; 

            private Builder() {
            } 

            private Builder(EdgeDnsClusters model) {
                this.clusterId = model.clusterId;
            } 

            /**
             * ClusterId.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            public EdgeDnsClusters build() {
                return new EdgeDnsClusters(this);
            } 

        } 

    }
    /**
     * 
     * {@link AddResolverRuleRequest} extends {@link TeaModel}
     *
     * <p>AddResolverRuleRequest</p>
     */
    public static class ForwardIp extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Ip")
        @com.aliyun.core.annotation.Validation(required = true)
        private String ip;

        @com.aliyun.core.annotation.NameInMap("Port")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer port;

        private ForwardIp(Builder builder) {
            this.ip = builder.ip;
            this.port = builder.port;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ForwardIp create() {
            return builder().build();
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
        public Integer getPort() {
            return this.port;
        }

        public static final class Builder {
            private String ip; 
            private Integer port; 

            private Builder() {
            } 

            private Builder(ForwardIp model) {
                this.ip = model.ip;
                this.port = model.port;
            } 

            /**
             * <p>The IP address of the destination server.</p>
             * <blockquote>
             * <p> The following CIDR blocks are reserved by the system: 100.100.2.136 to 100.100.2.138 and 100.100.2.116 to 100.100.2.118. You cannot specify the IP addresses within these CIDR blocks for the external DNS servers.</p>
             * </blockquote>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>172.16.XX.XX</p>
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * <p>The port of the destination server.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>8080</p>
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            public ForwardIp build() {
                return new ForwardIp(this);
            } 

        } 

    }
    /**
     * 
     * {@link AddResolverRuleRequest} extends {@link TeaModel}
     *
     * <p>AddResolverRuleRequest</p>
     */
    public static class Vpcs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("VpcType")
        private String vpcType;

        @com.aliyun.core.annotation.NameInMap("VpcUserId")
        private Long vpcUserId;

        private Vpcs(Builder builder) {
            this.regionId = builder.regionId;
            this.vpcId = builder.vpcId;
            this.vpcType = builder.vpcType;
            this.vpcUserId = builder.vpcUserId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Vpcs create() {
            return builder().build();
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        /**
         * @return vpcType
         */
        public String getVpcType() {
            return this.vpcType;
        }

        /**
         * @return vpcUserId
         */
        public Long getVpcUserId() {
            return this.vpcUserId;
        }

        public static final class Builder {
            private String regionId; 
            private String vpcId; 
            private String vpcType; 
            private Long vpcUserId; 

            private Builder() {
            } 

            private Builder(Vpcs model) {
                this.regionId = model.regionId;
                this.vpcId = model.vpcId;
                this.vpcType = model.vpcType;
                this.vpcUserId = model.vpcUserId;
            } 

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
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
             * VpcType.
             */
            public Builder vpcType(String vpcType) {
                this.vpcType = vpcType;
                return this;
            }

            /**
             * VpcUserId.
             */
            public Builder vpcUserId(Long vpcUserId) {
                this.vpcUserId = vpcUserId;
                return this;
            }

            public Vpcs build() {
                return new Vpcs(this);
            } 

        } 

    }
}
