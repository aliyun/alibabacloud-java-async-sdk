// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sgw20180511.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeployCSGClientsRequest} extends {@link RequestModel}
 *
 * <p>DeployCSGClientsRequest</p>
 */
public class DeployCSGClientsRequest extends Request {
    @Query
    @NameInMap("ClientRegionId")
    @Validation(required = true)
    private String clientRegionId;

    @Query
    @NameInMap("EcsInstanceIds")
    private java.util.List < String > ecsInstanceIds;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    @Query
    @NameInMap("VpcId")
    private String vpcId;

    private DeployCSGClientsRequest(Builder builder) {
        super(builder);
        this.clientRegionId = builder.clientRegionId;
        this.ecsInstanceIds = builder.ecsInstanceIds;
        this.securityToken = builder.securityToken;
        this.vpcId = builder.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeployCSGClientsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientRegionId
     */
    public String getClientRegionId() {
        return this.clientRegionId;
    }

    /**
     * @return ecsInstanceIds
     */
    public java.util.List < String > getEcsInstanceIds() {
        return this.ecsInstanceIds;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    public static final class Builder extends Request.Builder<DeployCSGClientsRequest, Builder> {
        private String clientRegionId; 
        private java.util.List < String > ecsInstanceIds; 
        private String securityToken; 
        private String vpcId; 

        private Builder() {
            super();
        } 

        private Builder(DeployCSGClientsRequest request) {
            super(request);
            this.clientRegionId = request.clientRegionId;
            this.ecsInstanceIds = request.ecsInstanceIds;
            this.securityToken = request.securityToken;
            this.vpcId = request.vpcId;
        } 

        /**
         * ClientRegionId.
         */
        public Builder clientRegionId(String clientRegionId) {
            this.putQueryParameter("ClientRegionId", clientRegionId);
            this.clientRegionId = clientRegionId;
            return this;
        }

        /**
         * EcsInstanceIds.
         */
        public Builder ecsInstanceIds(java.util.List < String > ecsInstanceIds) {
            String ecsInstanceIdsShrink = shrink(ecsInstanceIds, "EcsInstanceIds", "json");
            this.putQueryParameter("EcsInstanceIds", ecsInstanceIdsShrink);
            this.ecsInstanceIds = ecsInstanceIds;
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
         * VpcId.
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        @Override
        public DeployCSGClientsRequest build() {
            return new DeployCSGClientsRequest(this);
        } 

    } 

}
