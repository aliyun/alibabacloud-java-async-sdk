// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.smartag20180313.models;

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
 * {@link GrantSagInstanceToCcnRequest} extends {@link RequestModel}
 *
 * <p>GrantSagInstanceToCcnRequest</p>
 */
public class GrantSagInstanceToCcnRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CcnInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ccnInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CcnUid")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long ccnUid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GrantTrafficService")
    private Boolean grantTrafficService;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SmartAGId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String smartAGId;

    private GrantSagInstanceToCcnRequest(Builder builder) {
        super(builder);
        this.ccnInstanceId = builder.ccnInstanceId;
        this.ccnUid = builder.ccnUid;
        this.grantTrafficService = builder.grantTrafficService;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.smartAGId = builder.smartAGId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GrantSagInstanceToCcnRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ccnInstanceId
     */
    public String getCcnInstanceId() {
        return this.ccnInstanceId;
    }

    /**
     * @return ccnUid
     */
    public Long getCcnUid() {
        return this.ccnUid;
    }

    /**
     * @return grantTrafficService
     */
    public Boolean getGrantTrafficService() {
        return this.grantTrafficService;
    }

    /**
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
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

    /**
     * @return smartAGId
     */
    public String getSmartAGId() {
        return this.smartAGId;
    }

    public static final class Builder extends Request.Builder<GrantSagInstanceToCcnRequest, Builder> {
        private String ccnInstanceId; 
        private Long ccnUid; 
        private Boolean grantTrafficService; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String smartAGId; 

        private Builder() {
            super();
        } 

        private Builder(GrantSagInstanceToCcnRequest request) {
            super(request);
            this.ccnInstanceId = request.ccnInstanceId;
            this.ccnUid = request.ccnUid;
            this.grantTrafficService = request.grantTrafficService;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.smartAGId = request.smartAGId;
        } 

        /**
         * <p>The ID of the CCN instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ccn-n2935s1mnwv8i*****</p>
         */
        public Builder ccnInstanceId(String ccnInstanceId) {
            this.putQueryParameter("CcnInstanceId", ccnInstanceId);
            this.ccnInstanceId = ccnInstanceId;
            return this;
        }

        /**
         * <p>The ID of the Alibaba Cloud account to which the CCN instance belongs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1210123456123456</p>
         */
        public Builder ccnUid(Long ccnUid) {
            this.putQueryParameter("CcnUid", ccnUid);
            this.ccnUid = ccnUid;
            return this;
        }

        /**
         * <p>Specifies whether to grant the CCN instance permissions to manage network traffic from the SAG instance.</p>
         * <p>After the CCN instance is granted the permissions, the CCN instance can redirect the network traffic sent from the SAG instance to the Internet to Cloud Security Access Service (CSAS) for security audit.</p>
         * <ul>
         * <li><strong>true</strong>: grants permissions.</li>
         * <li><strong>false</strong>: does not grant permissions.</li>
         * </ul>
         * <blockquote>
         * <p> If you set the value to true and the SAG instance connected to the CCN instance has the secure rerouting feature enabled, you cannot revoke the permissions.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder grantTrafficService(Boolean grantTrafficService) {
            this.putQueryParameter("GrantTrafficService", grantTrafficService);
            this.grantTrafficService = grantTrafficService;
            return this;
        }

        /**
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
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
         * <p>The ID of the region where the SAG instance is deployed.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
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

        /**
         * <p>The ID of the SAG instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sag-tzirqx07bvcngm****</p>
         */
        public Builder smartAGId(String smartAGId) {
            this.putQueryParameter("SmartAGId", smartAGId);
            this.smartAGId = smartAGId;
            return this;
        }

        @Override
        public GrantSagInstanceToCcnRequest build() {
            return new GrantSagInstanceToCcnRequest(this);
        } 

    } 

}
