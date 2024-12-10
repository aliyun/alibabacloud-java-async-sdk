// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListGatewayIntranetLinkedVpcPeerRequest} extends {@link RequestModel}
 *
 * <p>ListGatewayIntranetLinkedVpcPeerRequest</p>
 */
public class ListGatewayIntranetLinkedVpcPeerRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("GatewayId")
    private String gatewayId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcId")
    private String vpcId;

    private ListGatewayIntranetLinkedVpcPeerRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.gatewayId = builder.gatewayId;
        this.vpcId = builder.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListGatewayIntranetLinkedVpcPeerRequest create() {
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
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    public static final class Builder extends Request.Builder<ListGatewayIntranetLinkedVpcPeerRequest, Builder> {
        private String clusterId; 
        private String gatewayId; 
        private String vpcId; 

        private Builder() {
            super();
        } 

        private Builder(ListGatewayIntranetLinkedVpcPeerRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.gatewayId = request.gatewayId;
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
         * <p>The ID of the associated VPC. To obtain the VPC ID, see <a href="https://help.aliyun.com/document_detail/2621223.html">ListGatewayIntranetLinkedVpc</a>.</p>
         * <ul>
         * <li>If you specify a VPC ID, only VPC peers corresponding to the ID are queried.</li>
         * <li>Otherwise, all VPC peers are queried.</li>
         * </ul>
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
        public ListGatewayIntranetLinkedVpcPeerRequest build() {
            return new ListGatewayIntranetLinkedVpcPeerRequest(this);
        } 

    } 

}
