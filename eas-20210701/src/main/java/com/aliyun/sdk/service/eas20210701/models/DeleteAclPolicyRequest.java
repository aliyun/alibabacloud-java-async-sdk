// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteAclPolicyRequest} extends {@link RequestModel}
 *
 * <p>DeleteAclPolicyRequest</p>
 */
public class DeleteAclPolicyRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("GatewayId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String gatewayId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AclPolicyList")
    private java.util.List < AclPolicyList> aclPolicyList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcId")
    private String vpcId;

    private DeleteAclPolicyRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.gatewayId = builder.gatewayId;
        this.aclPolicyList = builder.aclPolicyList;
        this.vpcId = builder.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAclPolicyRequest create() {
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
     * @return aclPolicyList
     */
    public java.util.List < AclPolicyList> getAclPolicyList() {
        return this.aclPolicyList;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    public static final class Builder extends Request.Builder<DeleteAclPolicyRequest, Builder> {
        private String clusterId; 
        private String gatewayId; 
        private java.util.List < AclPolicyList> aclPolicyList; 
        private String vpcId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteAclPolicyRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.gatewayId = request.gatewayId;
            this.aclPolicyList = request.aclPolicyList;
            this.vpcId = request.vpcId;
        } 

        /**
         * <p>The region ID of the private gateway.</p>
         * <p>This parameter is required.</p>
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
         * <p>The private gateway ID. To obtain the private gateway ID, see the private_gateway_id parameter in the response parameters of the ListResources operation.</p>
         * <p>This parameter is required.</p>
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
         * <p>The whitelisted IP CIDR blocks in the VPC that can access the private gateway.</p>
         */
        public Builder aclPolicyList(java.util.List < AclPolicyList> aclPolicyList) {
            String aclPolicyListShrink = shrink(aclPolicyList, "AclPolicyList", "json");
            this.putQueryParameter("AclPolicyList", aclPolicyListShrink);
            this.aclPolicyList = aclPolicyList;
            return this;
        }

        /**
         * <p>The ID of the virtual private cloud (VPC). For more information about how to obtain the VPC ID, see DescribeVpcs.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-uf66uio7md****</p>
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        @Override
        public DeleteAclPolicyRequest build() {
            return new DeleteAclPolicyRequest(this);
        } 

    } 

    /**
     * 
     * {@link DeleteAclPolicyRequest} extends {@link TeaModel}
     *
     * <p>DeleteAclPolicyRequest</p>
     */
    public static class AclPolicyList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Comment")
        private String comment;

        @com.aliyun.core.annotation.NameInMap("Entry")
        private String entry;

        private AclPolicyList(Builder builder) {
            this.comment = builder.comment;
            this.entry = builder.entry;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AclPolicyList create() {
            return builder().build();
        }

        /**
         * @return comment
         */
        public String getComment() {
            return this.comment;
        }

        /**
         * @return entry
         */
        public String getEntry() {
            return this.entry;
        }

        public static final class Builder {
            private String comment; 
            private String entry; 

            /**
             * <p>The comment on the IP CIDR block in the VPC that can access the private gateway.</p>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * <p>The IP CIDR block in the VPC that can access the private gateway.</p>
             * 
             * <strong>example:</strong>
             * <p>10.23.XX.XX/32</p>
             */
            public Builder entry(String entry) {
                this.entry = entry;
                return this;
            }

            public AclPolicyList build() {
                return new AclPolicyList(this);
            } 

        } 

    }
}
