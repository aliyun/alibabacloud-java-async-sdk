// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.slb20140515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetTLSCipherPolicyAttributeRequest} extends {@link RequestModel}
 *
 * <p>SetTLSCipherPolicyAttributeRequest</p>
 */
public class SetTLSCipherPolicyAttributeRequest extends Request {
    @Query
    @NameInMap("Ciphers")
    @Validation(required = true)
    private java.util.List < String > ciphers;

    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("TLSCipherPolicyId")
    @Validation(required = true)
    private String TLSCipherPolicyId;

    @Query
    @NameInMap("TLSVersions")
    @Validation(required = true)
    private java.util.List < String > TLSVersions;

    private SetTLSCipherPolicyAttributeRequest(Builder builder) {
        super(builder);
        this.ciphers = builder.ciphers;
        this.name = builder.name;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.TLSCipherPolicyId = builder.TLSCipherPolicyId;
        this.TLSVersions = builder.TLSVersions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetTLSCipherPolicyAttributeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ciphers
     */
    public java.util.List < String > getCiphers() {
        return this.ciphers;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
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
     * @return TLSCipherPolicyId
     */
    public String getTLSCipherPolicyId() {
        return this.TLSCipherPolicyId;
    }

    /**
     * @return TLSVersions
     */
    public java.util.List < String > getTLSVersions() {
        return this.TLSVersions;
    }

    public static final class Builder extends Request.Builder<SetTLSCipherPolicyAttributeRequest, Builder> {
        private java.util.List < String > ciphers; 
        private String name; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String TLSCipherPolicyId; 
        private java.util.List < String > TLSVersions; 

        private Builder() {
            super();
        } 

        private Builder(SetTLSCipherPolicyAttributeRequest request) {
            super(request);
            this.ciphers = request.ciphers;
            this.name = request.name;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.TLSCipherPolicyId = request.TLSCipherPolicyId;
            this.TLSVersions = request.TLSVersions;
        } 

        /**
         * The cipher suites supported by the TLS version.
         * <p>
         * 
         * The specified cipher suites must be supported by at least one TLS protocol version that you specify. For example, if you set the TLSVersions parameter to TLSv1.3, you must specify cipher suites that are supported by this protocol version.
         * 
         * TLS 1.0 and TLS 1.1 support the following cipher suites:
         * 
         * *   ECDHE-ECDSA-AES128-SHA
         * *   ECDHE-ECDSA-AES256-SHA
         * *   ECDHE-RSA-AES128-SHA
         * *   ECDHE-RSA-AES256-SHA
         * *   AES128-SHA AES256-SHA
         * *   DES-CBC3-SHA
         * 
         * TLS 1.2 supports the following cipher suites:
         * 
         * *   ECDHE-ECDSA-AES128-SHA
         * *   ECDHE-ECDSA-AES256-SHA
         * *   ECDHE-RSA-AES128-SHA
         * *   ECDHE-RSA-AES256-SHA
         * *   AES128-SHA AES256-SHA
         * *   DES-CBC3-SHA
         * *   ECDHE-ECDSA-AES128-GCM-SHA256
         * *   ECDHE-ECDSA-AES256-GCM-SHA384
         * *   ECDHE-ECDSA-AES128-SHA256
         * *   ECDHE-ECDSA-AES256-SHA384
         * *   ECDHE-RSA-AES128-GCM-SHA256
         * *   ECDHE-RSA-AES256-GCM-SHA384
         * *   ECDHE-RSA-AES128-SHA256
         * *   ECDHE-RSA-AES256-SHA384
         * *   AES128-GCM-SHA256
         * *   AES256-GCM-SHA384
         * *   AES128-SHA256 AES256-SHA256
         * 
         * TLS 1.3 supports the following cipher suites:
         * 
         * *   TLS_AES\_128\_GCM_SHA256
         * *   TLS_AES\_256\_GCM_SHA384
         * *   TLS_CHACHA20\_POLY1305\_SHA256
         * *   TLS_AES\_128\_CCM_SHA256
         * *   TLS_AES\_128\_CCM\_8\_SHA256
         */
        public Builder ciphers(java.util.List < String > ciphers) {
            this.putQueryParameter("Ciphers", ciphers);
            this.ciphers = ciphers;
            return this;
        }

        /**
         * The name of the TLS policy. The name must be 2 to 128 characters in length and can contain letters, digits, periods (.), underscores (\_), and hyphens (-). The name must start with a letter.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
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
         * The ID of the region where the Server Load Balancer (SLB) instance is deployed.
         * <p>
         * 
         * You can call the [DescribeRegions](~~36063~~) operation to query the most recent region list.
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
         * The ID of the TLS policy.
         */
        public Builder TLSCipherPolicyId(String TLSCipherPolicyId) {
            this.putQueryParameter("TLSCipherPolicyId", TLSCipherPolicyId);
            this.TLSCipherPolicyId = TLSCipherPolicyId;
            return this;
        }

        /**
         * The version of the TLS protocol. Valid values: **TLSv1.0**, **TLSv1.1**, **TLSv1.2**, and **TLSv1.3**.
         */
        public Builder TLSVersions(java.util.List < String > TLSVersions) {
            this.putQueryParameter("TLSVersions", TLSVersions);
            this.TLSVersions = TLSVersions;
            return this;
        }

        @Override
        public SetTLSCipherPolicyAttributeRequest build() {
            return new SetTLSCipherPolicyAttributeRequest(this);
        } 

    } 

}
