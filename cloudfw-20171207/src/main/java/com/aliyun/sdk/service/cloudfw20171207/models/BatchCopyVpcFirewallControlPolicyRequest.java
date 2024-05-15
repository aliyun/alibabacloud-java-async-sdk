// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchCopyVpcFirewallControlPolicyRequest} extends {@link RequestModel}
 *
 * <p>BatchCopyVpcFirewallControlPolicyRequest</p>
 */
public class BatchCopyVpcFirewallControlPolicyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceIp")
    @Deprecated
    private String sourceIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceVpcFirewallId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourceVpcFirewallId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetVpcFirewallId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String targetVpcFirewallId;

    private BatchCopyVpcFirewallControlPolicyRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.sourceIp = builder.sourceIp;
        this.sourceVpcFirewallId = builder.sourceVpcFirewallId;
        this.targetVpcFirewallId = builder.targetVpcFirewallId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchCopyVpcFirewallControlPolicyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    /**
     * @return sourceVpcFirewallId
     */
    public String getSourceVpcFirewallId() {
        return this.sourceVpcFirewallId;
    }

    /**
     * @return targetVpcFirewallId
     */
    public String getTargetVpcFirewallId() {
        return this.targetVpcFirewallId;
    }

    public static final class Builder extends Request.Builder<BatchCopyVpcFirewallControlPolicyRequest, Builder> {
        private String lang; 
        private String sourceIp; 
        private String sourceVpcFirewallId; 
        private String targetVpcFirewallId; 

        private Builder() {
            super();
        } 

        private Builder(BatchCopyVpcFirewallControlPolicyRequest request) {
            super(request);
            this.lang = request.lang;
            this.sourceIp = request.sourceIp;
            this.sourceVpcFirewallId = request.sourceVpcFirewallId;
            this.targetVpcFirewallId = request.targetVpcFirewallId;
        } 

        /**
         * The language of the content within the request and response. Valid values:
         * <p>
         * 
         * *   **zh**: Chinese (default)
         * *   **en**: English
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The source IP address of the request.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * The ID of the policy group of the source VPC firewall. Valid values:
         * <p>
         * 
         * *   If the VPC firewall protects mutual access traffic between a VPC and a specified network instance that is attached to a Cloud Enterprise Network (CEN) instance, the value of this parameter is the ID of the CEN instance. The network instance can be a VPC, a virtual border router (VBR), or a Cloud Connect Network (CCN) instance.
         * *   If the VPC firewall protects traffic between two VPCs that are connected by using an Express Connect circuit, the value of this parameter is the instance ID of the VPC firewall.
         * 
         * >  You can call the [DescribeVpcFirewallAclGroupList](~~159760~~) operation to query the IDs of policy groups.
         */
        public Builder sourceVpcFirewallId(String sourceVpcFirewallId) {
            this.putQueryParameter("SourceVpcFirewallId", sourceVpcFirewallId);
            this.sourceVpcFirewallId = sourceVpcFirewallId;
            return this;
        }

        /**
         * The ID of the policy group of the destination VPC firewall. Valid values:
         * <p>
         * 
         * *   If the VPC firewall protects mutual access traffic between a VPC and a specified network instance that is attached to a CEN instance, the value of this parameter is the ID of the CEN instance. The network instance can be a VPC, a VBR, or a CCN instance.
         * *   If the VPC firewall protects traffic between two VPCs that are connected by using an Express Connect circuit, the value of this parameter is the instance ID of the VPC firewall.
         * 
         * >  You can call the [DescribeVpcFirewallAclGroupList](~~159760~~) operation to query the IDs of policy groups.
         */
        public Builder targetVpcFirewallId(String targetVpcFirewallId) {
            this.putQueryParameter("TargetVpcFirewallId", targetVpcFirewallId);
            this.targetVpcFirewallId = targetVpcFirewallId;
            return this;
        }

        @Override
        public BatchCopyVpcFirewallControlPolicyRequest build() {
            return new BatchCopyVpcFirewallControlPolicyRequest(this);
        } 

    } 

}
