// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link VpcRevokeAccessRequest} extends {@link RequestModel}
 *
 * <p>VpcRevokeAccessRequest</p>
 */
public class VpcRevokeAccessRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("InstancePort")
    @Validation(required = true)
    private String instancePort;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    @Query
    @NameInMap("Token")
    private String token;

    @Query
    @NameInMap("VpcId")
    @Validation(required = true)
    private String vpcId;

    private VpcRevokeAccessRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.instancePort = builder.instancePort;
        this.securityToken = builder.securityToken;
        this.token = builder.token;
        this.vpcId = builder.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static VpcRevokeAccessRequest create() {
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
     * @return instancePort
     */
    public String getInstancePort() {
        return this.instancePort;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    /**
     * @return token
     */
    public String getToken() {
        return this.token;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    public static final class Builder extends Request.Builder<VpcRevokeAccessRequest, Builder> {
        private String instanceId; 
        private String instancePort; 
        private String securityToken; 
        private String token; 
        private String vpcId; 

        private Builder() {
            super();
        } 

        private Builder(VpcRevokeAccessRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.instancePort = request.instancePort;
            this.securityToken = request.securityToken;
            this.token = request.token;
            this.vpcId = request.vpcId;
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
         * InstancePort.
         */
        public Builder instancePort(String instancePort) {
            this.putQueryParameter("InstancePort", instancePort);
            this.instancePort = instancePort;
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
         * Token.
         */
        public Builder token(String token) {
            this.putQueryParameter("Token", token);
            this.token = token;
            return this;
        }

        /**
         * VpcId.
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        @Override
        public VpcRevokeAccessRequest build() {
            return new VpcRevokeAccessRequest(this);
        } 

    } 

}
