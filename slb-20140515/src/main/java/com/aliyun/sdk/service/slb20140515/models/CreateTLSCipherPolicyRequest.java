// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.slb20140515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateTLSCipherPolicyRequest} extends {@link RequestModel}
 *
 * <p>CreateTLSCipherPolicyRequest</p>
 */
public class CreateTLSCipherPolicyRequest extends Request {
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
    @NameInMap("TLSVersions")
    @Validation(required = true)
    private java.util.List < String > TLSVersions;

    private CreateTLSCipherPolicyRequest(Builder builder) {
        super(builder);
        this.ciphers = builder.ciphers;
        this.name = builder.name;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.TLSVersions = builder.TLSVersions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTLSCipherPolicyRequest create() {
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
     * @return TLSVersions
     */
    public java.util.List < String > getTLSVersions() {
        return this.TLSVersions;
    }

    public static final class Builder extends Request.Builder<CreateTLSCipherPolicyRequest, Builder> {
        private java.util.List < String > ciphers; 
        private String name; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private java.util.List < String > TLSVersions; 

        private Builder() {
            super();
        } 

        private Builder(CreateTLSCipherPolicyRequest request) {
            super(request);
            this.ciphers = request.ciphers;
            this.name = request.name;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.TLSVersions = request.TLSVersions;
        } 

        /**
         * The supported cipher suites, which are determined by the TLS protocol version. You can specify at most 32 cipher suites.
         * <p>
         * 
         * TLS 1.0 and TLS 1.1 support the following cipher suites:
         * 
         * *   **ECDHE-ECDSA-AES128-SHA**
         * *   **ECDHE-ECDSA-AES256-SHA**
         * *   **ECDHE-RSA-AES128-SHA**
         * *   **ECDHE-RSA-AES256-SHA**
         * *   **AES128-SHA**
         * *   **AES256-SHA**
         * *   **DES-CBC3-SHA**
         * 
         * TLS 1.2 supports the following cipher suites:
         * 
         * *   **ECDHE-ECDSA-AES128-SHA**
         * *   **ECDHE-ECDSA-AES256-SHA**
         * *   **ECDHE-RSA-AES128-SHA**
         * *   **ECDHE-RSA-AES256-SHA**
         * *   **AES128-SHA**
         * *   **AES256-SHA**
         * *   **DES-CBC3-SHA**
         * *   **ECDHE-ECDSA-AES128-GCM-SHA256**
         * *   **ECDHE-ECDSA-AES256-GCM-SHA384**
         * *   **ECDHE-ECDSA-AES128-SHA256**
         * *   **ECDHE-ECDSA-AES256-SHA384**
         * *   **ECDHE-RSA-AES128-GCM-SHA256**
         * *   **ECDHE-RSA-AES256-GCM-SHA384**
         * *   **ECDHE-RSA-AES128-SHA256**
         * *   **ECDHE-RSA-AES256-SHA384**
         * *   **AES128-GCM-SHA256**
         * *   **AES256-GCM-SHA384**
         * *   **AES128-SHA256**
         * *   **AES256-SHA256**
         * 
         * TLS 1.3 supports the following cipher suites:
         * 
         * *   **TLS_AES\_128\_GCM_SHA256**
         * *   **TLS_AES\_256\_GCM_SHA384**
         * *   **TLS_CHACHA20\_POLY1305\_SHA256**
         * *   **TLS_AES\_128\_CCM_SHA256**
         * *   **TLS_AES\_128\_CCM\_8\_SHA256**
         */
        public Builder ciphers(java.util.List < String > ciphers) {
            this.putQueryParameter("Ciphers", ciphers);
            this.ciphers = ciphers;
            return this;
        }

        /**
         * The name of the TLS policy. The name must be 1 to 200 characters in length, and can contain letters, digits, periods (.), underscores (\_), and hyphens (-).
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
         * The ID of the region where the Server Load Balancer (SLB) instance is created.
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
         * The version of the TLS protocol. Valid values: **TLSv1.0**, **TLSv1.1**, **TLSv1.2**, and **TLSv1.3**. You can specify at most four TLS versions.
         */
        public Builder TLSVersions(java.util.List < String > TLSVersions) {
            this.putQueryParameter("TLSVersions", TLSVersions);
            this.TLSVersions = TLSVersions;
            return this;
        }

        @Override
        public CreateTLSCipherPolicyRequest build() {
            return new CreateTLSCipherPolicyRequest(this);
        } 

    } 

}
