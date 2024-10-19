// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ValidateVpcConnectivityRequest} extends {@link RequestModel}
 *
 * <p>ValidateVpcConnectivityRequest</p>
 */
public class ValidateVpcConnectivityRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityToken")
    private String securityToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcAccessId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vpcAccessId;

    private ValidateVpcConnectivityRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.securityToken = builder.securityToken;
        this.vpcAccessId = builder.vpcAccessId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ValidateVpcConnectivityRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    /**
     * @return vpcAccessId
     */
    public String getVpcAccessId() {
        return this.vpcAccessId;
    }

    public static final class Builder extends Request.Builder<ValidateVpcConnectivityRequest, Builder> {
        private String instanceId; 
        private String securityToken; 
        private String vpcAccessId; 

        private Builder() {
            super();
        } 

        private Builder(ValidateVpcConnectivityRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.securityToken = request.securityToken;
            this.vpcAccessId = request.vpcAccessId;
        } 

        /**
         * <p>The ID of the API Gateway instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>apigateway-hz-72bc18******</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        /**
         * <p>The ID of the VPC access authorization.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>5f1b3216f9********e2c1297b6741dc</p>
         */
        public Builder vpcAccessId(String vpcAccessId) {
            this.putQueryParameter("VpcAccessId", vpcAccessId);
            this.vpcAccessId = vpcAccessId;
            return this;
        }

        @Override
        public ValidateVpcConnectivityRequest build() {
            return new ValidateVpcConnectivityRequest(this);
        } 

    } 

}
