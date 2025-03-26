// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

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
 * {@link AssociateEipAddressBatchRequest} extends {@link RequestModel}
 *
 * <p>AssociateEipAddressBatchRequest</p>
 */
public class AssociateEipAddressBatchRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BindedInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bindedInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BindedInstanceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bindedInstanceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> instanceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Mode")
    private String mode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private AssociateEipAddressBatchRequest(Builder builder) {
        super(builder);
        this.bindedInstanceId = builder.bindedInstanceId;
        this.bindedInstanceType = builder.bindedInstanceType;
        this.clientToken = builder.clientToken;
        this.instanceIds = builder.instanceIds;
        this.mode = builder.mode;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AssociateEipAddressBatchRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bindedInstanceId
     */
    public String getBindedInstanceId() {
        return this.bindedInstanceId;
    }

    /**
     * @return bindedInstanceType
     */
    public String getBindedInstanceType() {
        return this.bindedInstanceType;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return instanceIds
     */
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    /**
     * @return mode
     */
    public String getMode() {
        return this.mode;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public static final class Builder extends Request.Builder<AssociateEipAddressBatchRequest, Builder> {
        private String bindedInstanceId; 
        private String bindedInstanceType; 
        private String clientToken; 
        private java.util.List<String> instanceIds; 
        private String mode; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(AssociateEipAddressBatchRequest request) {
            super(request);
            this.bindedInstanceId = request.bindedInstanceId;
            this.bindedInstanceType = request.bindedInstanceType;
            this.clientToken = request.clientToken;
            this.instanceIds = request.instanceIds;
            this.mode = request.mode;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * <p>The ID of the instance with which you want to associate the EIPs.</p>
         * <p>The instance can be a NAT gateway or a secondary ENI.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ngw-hp3akk9irtd69jad****</p>
         */
        public Builder bindedInstanceId(String bindedInstanceId) {
            this.putQueryParameter("BindedInstanceId", bindedInstanceId);
            this.bindedInstanceId = bindedInstanceId;
            return this;
        }

        /**
         * <p>The type of the instance with which you want to associate the EIPs. Valid values:</p>
         * <ul>
         * <li><strong>Nat</strong>: NAT gateway</li>
         * <li><strong>NetworkInterface</strong>: secondary ENI</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Nat</p>
         */
        public Builder bindedInstanceType(String bindedInstanceType) {
            this.putQueryParameter("BindedInstanceType", bindedInstanceType);
            this.bindedInstanceType = bindedInstanceType;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>You can use the client to generate a token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
         * <blockquote>
         * <p> If you do not specify this parameter, the system automatically uses the <strong>request ID</strong> as the <strong>client token</strong>. The <strong>request ID</strong> may be different for each request.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>02fb3da4-130e-11e9-8e44-0016e04115b</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The EIPs to be associated with the instance.</p>
         * <p>You must enter at least one EIP. You can enter up to 50 EIPs.</p>
         * <p>This parameter is required.</p>
         */
        public Builder instanceIds(java.util.List<String> instanceIds) {
            this.putQueryParameter("InstanceIds", instanceIds);
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * <p>The association mode. Set the value to <strong>MULTI_BINDED</strong>, which specifies the Multi-EIP-to-ENI mode.</p>
         * <p>This parameter is required only when <strong>BindedInstanceType</strong> is set to <strong>NetworkInterface</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>MULTI_BINDED</p>
         */
        public Builder mode(String mode) {
            this.putQueryParameter("Mode", mode);
            this.mode = mode;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>The ID of the region to which the EIPs belong. You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the region ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        @Override
        public AssociateEipAddressBatchRequest build() {
            return new AssociateEipAddressBatchRequest(this);
        } 

    } 

}
