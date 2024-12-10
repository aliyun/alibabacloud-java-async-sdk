// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateGatewayIntranetLinkedVpcPeerRequest} extends {@link RequestModel}
 *
 * <p>CreateGatewayIntranetLinkedVpcPeerRequest</p>
 */
public class CreateGatewayIntranetLinkedVpcPeerRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("GatewayId")
    private String gatewayId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PeerVpcs")
    private java.util.List < PeerVpcs> peerVpcs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcId")
    private String vpcId;

    private CreateGatewayIntranetLinkedVpcPeerRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.gatewayId = builder.gatewayId;
        this.peerVpcs = builder.peerVpcs;
        this.vpcId = builder.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateGatewayIntranetLinkedVpcPeerRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return gatewayId
     */
    public String getGatewayId() {
        return this.gatewayId;
    }

    /**
     * @return peerVpcs
     */
    public java.util.List < PeerVpcs> getPeerVpcs() {
        return this.peerVpcs;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    public static final class Builder extends Request.Builder<CreateGatewayIntranetLinkedVpcPeerRequest, Builder> {
        private String clusterId; 
        private String gatewayId; 
        private java.util.List < PeerVpcs> peerVpcs; 
        private String vpcId; 

        private Builder() {
            super();
        } 

        private Builder(CreateGatewayIntranetLinkedVpcPeerRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.gatewayId = request.gatewayId;
            this.peerVpcs = request.peerVpcs;
            this.vpcId = request.vpcId;
        } 

        /**
         * <p>The region where the private gateway resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-wulanchabu</p>
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The ID of the private gateway. To obtain the private gateway ID, see <a href="https://help.aliyun.com/document_detail/2841911.html">ListGateway</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-1uhcqmsc7x22******</p>
         */
        public Builder gatewayId(String gatewayId) {
            this.putPathParameter("GatewayId", gatewayId);
            this.gatewayId = gatewayId;
            return this;
        }

        /**
         * <p>The list of VPC peers.</p>
         */
        public Builder peerVpcs(java.util.List < PeerVpcs> peerVpcs) {
            String peerVpcsShrink = shrink(peerVpcs, "PeerVpcs", "json");
            this.putQueryParameter("PeerVpcs", peerVpcsShrink);
            this.peerVpcs = peerVpcs;
            return this;
        }

        /**
         * <p>The VPC ID. To obtain the VPC ID, see <a href="https://help.aliyun.com/document_detail/2621223.html">ListGatewayIntranetLinkedVpc</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-2zetuli9ws0qgjd******</p>
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        @Override
        public CreateGatewayIntranetLinkedVpcPeerRequest build() {
            return new CreateGatewayIntranetLinkedVpcPeerRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateGatewayIntranetLinkedVpcPeerRequest} extends {@link TeaModel}
     *
     * <p>CreateGatewayIntranetLinkedVpcPeerRequest</p>
     */
    public static class PeerVpcs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        private PeerVpcs(Builder builder) {
            this.region = builder.region;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PeerVpcs create() {
            return builder().build();
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private String region; 
            private String vpcId; 

            /**
             * <p>The region where the VPC peer resides.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * <p>The ID of the VPC peer. To obtain the VPC ID, see <a href="https://help.aliyun.com/document_detail/35739.html">DescribeVpcs</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-uf66uio7md****</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public PeerVpcs build() {
                return new PeerVpcs(this);
            } 

        } 

    }
}
