// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rdsai20250507.models;

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
 * {@link EnableAgentRuntimeRequest} extends {@link RequestModel}
 *
 * <p>EnableAgentRuntimeRequest</p>
 */
public class EnableAgentRuntimeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BranchName")
    private String branchName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
    private String securityGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VSwitchId")
    private String vSwitchId;

    private EnableAgentRuntimeRequest(Builder builder) {
        super(builder);
        this.branchName = builder.branchName;
        this.clientToken = builder.clientToken;
        this.instanceName = builder.instanceName;
        this.regionId = builder.regionId;
        this.securityGroupId = builder.securityGroupId;
        this.vSwitchId = builder.vSwitchId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnableAgentRuntimeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return branchName
     */
    public String getBranchName() {
        return this.branchName;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    /**
     * @return vSwitchId
     */
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public static final class Builder extends Request.Builder<EnableAgentRuntimeRequest, Builder> {
        private String branchName; 
        private String clientToken; 
        private String instanceName; 
        private String regionId; 
        private String securityGroupId; 
        private String vSwitchId; 

        private Builder() {
            super();
        } 

        private Builder(EnableAgentRuntimeRequest request) {
            super(request);
            this.branchName = request.branchName;
            this.clientToken = request.clientToken;
            this.instanceName = request.instanceName;
            this.regionId = request.regionId;
            this.securityGroupId = request.securityGroupId;
            this.vSwitchId = request.vSwitchId;
        } 

        /**
         * BranchName.
         */
        public Builder branchName(String branchName) {
            this.putQueryParameter("BranchName", branchName);
            this.branchName = branchName;
            return this;
        }

        /**
         * <p>The idempotency parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>0c593ea1-3bea-11e9-b96b-88e9fe637760</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The instance ID of the AI application.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ra-supabase-8moov5lxba****</p>
         */
        public Builder instanceName(String instanceName) {
            this.putQueryParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * <p>The region ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The security group ID used to create an endpoint.</p>
         * <p><strong>If not specified</strong>: The system performs automatic creation of a security group named <strong>sg-aliyun-rds-created-supabase-sandbox</strong> in the VPC where the instance resides. No manual operation is required.</p>
         * <p><strong>If specified</strong>: Make sure that the specified security group allows the CIDR block of the VPC where the Supabase instance resides (both inbound and outbound directions must be allowed). Otherwise, network connectivity issues may occur.</p>
         * <blockquote>
         * <p>Notice: The endpoint is created only once. When the first Supabase instance in a VPC enables the sandbox and Edge Routine function, the system performs automatic creation of the endpoint. When other Supabase instances in the same VPC enable this capability later, the existing endpoint is reused and no new endpoint is created.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>sg-bp179qkbvlj8ym*****</p>
         */
        public Builder securityGroupId(String securityGroupId) {
            this.putQueryParameter("SecurityGroupId", securityGroupId);
            this.securityGroupId = securityGroupId;
            return this;
        }

        /**
         * <p>The vSwitch ID used to create an endpoint. If this parameter is not specified, the vSwitch of the Supabase instance is used by default.</p>
         * <blockquote>
         * <p>Notice: The endpoint is created only once. When the first Supabase instance in a VPC enables the sandbox and Edge Routine function, the system performs automatic creation of the endpoint. When other Supabase instances in the same VPC enable this capability later, the existing endpoint is reused and no new endpoint is created.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>vsw-9dp2hkpm22gxscfgy****</p>
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        @Override
        public EnableAgentRuntimeRequest build() {
            return new EnableAgentRuntimeRequest(this);
        } 

    } 

}
