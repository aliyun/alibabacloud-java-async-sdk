// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nlb20220430.models;

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
 * {@link LoadBalancerLeaveSecurityGroupRequest} extends {@link RequestModel}
 *
 * <p>LoadBalancerLeaveSecurityGroupRequest</p>
 */
public class LoadBalancerLeaveSecurityGroupRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LoadBalancerId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String loadBalancerId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SecurityGroupIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> securityGroupIds;

    private LoadBalancerLeaveSecurityGroupRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.loadBalancerId = builder.loadBalancerId;
        this.regionId = builder.regionId;
        this.securityGroupIds = builder.securityGroupIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LoadBalancerLeaveSecurityGroupRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return loadBalancerId
     */
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return securityGroupIds
     */
    public java.util.List<String> getSecurityGroupIds() {
        return this.securityGroupIds;
    }

    public static final class Builder extends Request.Builder<LoadBalancerLeaveSecurityGroupRequest, Builder> {
        private String clientToken; 
        private Boolean dryRun; 
        private String loadBalancerId; 
        private String regionId; 
        private java.util.List<String> securityGroupIds; 

        private Builder() {
            super();
        } 

        private Builder(LoadBalancerLeaveSecurityGroupRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.loadBalancerId = request.loadBalancerId;
            this.regionId = request.regionId;
            this.securityGroupIds = request.securityGroupIds;
        } 

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>You can use the client to generate the token. Ensure that the token is unique among different requests. The client token can contain only ASCII characters.</p>
         * <blockquote>
         * <p> If you do not specify this parameter, the system uses the <strong>request ID</strong> as the <strong>client token</strong>. The <strong>request ID</strong> is different for each request.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>123e4567-e89b-12d3-a456-426655440000</p>
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>Specifies whether to perform a dry run, without sending the actual request. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: checks the request without performing the operation. The system checks the required parameters, request syntax, and limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the <code>DryRunOperation</code> error code is returned.</li>
         * <li><strong>false</strong> (default): performs a dry run and sends the actual request. If the request passes the dry run, a 2xx HTTP status code is returned and the operation is performed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putBodyParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>The NLB instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>nlb-83ckzc8d4xlp8o****</p>
         */
        public Builder loadBalancerId(String loadBalancerId) {
            this.putBodyParameter("LoadBalancerId", loadBalancerId);
            this.loadBalancerId = loadBalancerId;
            return this;
        }

        /**
         * <p>The region ID of the NLB instance.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/443657.html">DescribeRegions</a> operation to query the most recent region list.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the security group to be disassociated.</p>
         * <p>This parameter is required.</p>
         */
        public Builder securityGroupIds(java.util.List<String> securityGroupIds) {
            this.putBodyParameter("SecurityGroupIds", securityGroupIds);
            this.securityGroupIds = securityGroupIds;
            return this;
        }

        @Override
        public LoadBalancerLeaveSecurityGroupRequest build() {
            return new LoadBalancerLeaveSecurityGroupRequest(this);
        } 

    } 

}
