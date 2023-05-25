// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ValidateVpcConnectivityRequest} extends {@link RequestModel}
 *
 * <p>ValidateVpcConnectivityRequest</p>
 */
public class ValidateVpcConnectivityRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    @Query
    @NameInMap("VpcAccessId")
    @Validation(required = true)
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
         * InstanceId.
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
         * VpcAccessId.
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
