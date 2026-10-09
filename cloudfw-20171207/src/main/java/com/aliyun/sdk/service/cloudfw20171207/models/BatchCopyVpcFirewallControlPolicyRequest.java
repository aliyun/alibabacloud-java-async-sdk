// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
         * <p>The language of the request and response. Valid values:</p>
         * <ul>
         * <li><p><strong>zh</strong> (default): Chinese.</p>
         * </li>
         * <li><p><strong>en</strong>: English.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The source IP address of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>192.0.XX.XX</p>
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * <p>The ID of the access control policy group for the source virtual private cloud (VPC) firewall of this operation. Valid values:</p>
         * <ul>
         * <li><p>If the VPC firewall protects traffic between a network instance in a Cloud Enterprise Network (CEN) instance (network instances include VPCs, VBRs, and CCNs) and a specified VPC, the policy group ID is the CEN instance ID.</p>
         * </li>
         * <li><p>If the VPC firewall protects traffic between two VPCs that are connected through Express Connect, the policy group ID is the VPC firewall instance ID.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>You can invoke the <a href="https://help.aliyun.com/document_detail/159760.html">DescribeVpcFirewallAclGroupList</a> operation to obtain this ID.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vfw-a42bbb7b887148c9****</p>
         */
        public Builder sourceVpcFirewallId(String sourceVpcFirewallId) {
            this.putQueryParameter("SourceVpcFirewallId", sourceVpcFirewallId);
            this.sourceVpcFirewallId = sourceVpcFirewallId;
            return this;
        }

        /**
         * <p>The ID of the access control policy group for the destination virtual private cloud (VPC) firewall of this operation. Valid values:</p>
         * <ul>
         * <li><p>If the VPC firewall protects traffic between a network instance in a Cloud Enterprise Network (CEN) instance (network instances include VPCs, VBRs, and CCNs) and a specified VPC, the policy group ID is the CEN instance ID.</p>
         * </li>
         * <li><p>If the VPC firewall protects traffic between two VPCs that are connected through Express Connect, the policy group ID is the VPC firewall instance ID.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>You can invoke the <a href="https://help.aliyun.com/document_detail/159760.html">DescribeVpcFirewallAclGroupList</a> operation to obtain this ID.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vfw-e37d3a04cf79446a****</p>
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
