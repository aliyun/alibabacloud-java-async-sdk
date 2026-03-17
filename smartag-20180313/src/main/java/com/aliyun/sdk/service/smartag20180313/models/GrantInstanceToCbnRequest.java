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
 * {@link GrantInstanceToCbnRequest} extends {@link RequestModel}
 *
 * <p>GrantInstanceToCbnRequest</p>
 */
public class GrantInstanceToCbnRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CcnInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ccnInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CenInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String cenInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CenUid")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long cenUid;

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

    private GrantInstanceToCbnRequest(Builder builder) {
        super(builder);
        this.ccnInstanceId = builder.ccnInstanceId;
        this.cenInstanceId = builder.cenInstanceId;
        this.cenUid = builder.cenUid;
        this.grantTrafficService = builder.grantTrafficService;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GrantInstanceToCbnRequest create() {
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
     * @return cenInstanceId
     */
    public String getCenInstanceId() {
        return this.cenInstanceId;
    }

    /**
     * @return cenUid
     */
    public Long getCenUid() {
        return this.cenUid;
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

    public static final class Builder extends Request.Builder<GrantInstanceToCbnRequest, Builder> {
        private String ccnInstanceId; 
        private String cenInstanceId; 
        private Long cenUid; 
        private Boolean grantTrafficService; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(GrantInstanceToCbnRequest request) {
            super(request);
            this.ccnInstanceId = request.ccnInstanceId;
            this.cenInstanceId = request.cenInstanceId;
            this.cenUid = request.cenUid;
            this.grantTrafficService = request.grantTrafficService;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
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
         * <p>The ID of the CEN instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cen-7qthudw0ll6jm*****</p>
         */
        public Builder cenInstanceId(String cenInstanceId) {
            this.putQueryParameter("CenInstanceId", cenInstanceId);
            this.cenInstanceId = cenInstanceId;
            return this;
        }

        /**
         * <p>The ID of the Alibaba Cloud account to which the CEN instance belongs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1250123456123456</p>
         */
        public Builder cenUid(Long cenUid) {
            this.putQueryParameter("CenUid", cenUid);
            this.cenUid = cenUid;
            return this;
        }

        /**
         * <p>Specifies whether to grant the CEN instance permissions to manage network traffic from the CCN instance. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: grants permissions.</li>
         * <li><strong>false</strong>: does not grant permissions. This is the default value.</li>
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
         * <p>The ID of the region where the CCN instance is deployed.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/69813.htmll">DescribeRegions</a> operation to query the most recent region list.</p>
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

        @Override
        public GrantInstanceToCbnRequest build() {
            return new GrantInstanceToCbnRequest(this);
        } 

    } 

}
