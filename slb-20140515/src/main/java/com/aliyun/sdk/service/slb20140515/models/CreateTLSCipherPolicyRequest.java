// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.slb20140515.models;

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
 * {@link CreateTLSCipherPolicyRequest} extends {@link RequestModel}
 *
 * <p>CreateTLSCipherPolicyRequest</p>
 */
public class CreateTLSCipherPolicyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ciphers")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> ciphers;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

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
    @com.aliyun.core.annotation.NameInMap("TLSVersions")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> TLSVersions;

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
    public java.util.List<String> getCiphers() {
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
    public java.util.List<String> getTLSVersions() {
        return this.TLSVersions;
    }

    public static final class Builder extends Request.Builder<CreateTLSCipherPolicyRequest, Builder> {
        private java.util.List<String> ciphers; 
        private String name; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private java.util.List<String> TLSVersions; 

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
         * <p>The supported cipher suites, which are determined by the TLS protocol version. You can specify at most 32 cipher suites.</p>
         * <p>TLS 1.0 and TLS 1.1 support the following cipher suites:</p>
         * <ul>
         * <li><strong>ECDHE-ECDSA-AES128-SHA</strong></li>
         * <li><strong>ECDHE-ECDSA-AES256-SHA</strong></li>
         * <li><strong>ECDHE-RSA-AES128-SHA</strong></li>
         * <li><strong>ECDHE-RSA-AES256-SHA</strong></li>
         * <li><strong>AES128-SHA</strong></li>
         * <li><strong>AES256-SHA</strong></li>
         * <li><strong>DES-CBC3-SHA</strong></li>
         * </ul>
         * <p>TLS 1.2 supports the following cipher suites:</p>
         * <ul>
         * <li><strong>ECDHE-ECDSA-AES128-SHA</strong></li>
         * <li><strong>ECDHE-ECDSA-AES256-SHA</strong></li>
         * <li><strong>ECDHE-RSA-AES128-SHA</strong></li>
         * <li><strong>ECDHE-RSA-AES256-SHA</strong></li>
         * <li><strong>AES128-SHA</strong></li>
         * <li><strong>AES256-SHA</strong></li>
         * <li><strong>DES-CBC3-SHA</strong></li>
         * <li><strong>ECDHE-ECDSA-AES128-GCM-SHA256</strong></li>
         * <li><strong>ECDHE-ECDSA-AES256-GCM-SHA384</strong></li>
         * <li><strong>ECDHE-ECDSA-AES128-SHA256</strong></li>
         * <li><strong>ECDHE-ECDSA-AES256-SHA384</strong></li>
         * <li><strong>ECDHE-RSA-AES128-GCM-SHA256</strong></li>
         * <li><strong>ECDHE-RSA-AES256-GCM-SHA384</strong></li>
         * <li><strong>ECDHE-RSA-AES128-SHA256</strong></li>
         * <li><strong>ECDHE-RSA-AES256-SHA384</strong></li>
         * <li><strong>AES128-GCM-SHA256</strong></li>
         * <li><strong>AES256-GCM-SHA384</strong></li>
         * <li><strong>AES128-SHA256</strong></li>
         * <li><strong>AES256-SHA256</strong></li>
         * </ul>
         * <p>TLS 1.3 supports the following cipher suites:</p>
         * <ul>
         * <li><strong>TLS_AES_128_GCM_SHA256</strong></li>
         * <li><strong>TLS_AES_256_GCM_SHA384</strong></li>
         * <li><strong>TLS_CHACHA20_POLY1305_SHA256</strong></li>
         * <li><strong>TLS_AES_128_CCM_SHA256</strong></li>
         * <li><strong>TLS_AES_128_CCM_8_SHA256</strong></li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>AES256-SHA256</p>
         */
        public Builder ciphers(java.util.List<String> ciphers) {
            this.putQueryParameter("Ciphers", ciphers);
            this.ciphers = ciphers;
            return this;
        }

        /**
         * <p>The name of the TLS policy. The name must be 1 to 200 characters in length, and can contain letters, digits, periods (.), underscores (_), and hyphens (-).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>TLSPolicy-test</p>
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
         * <p>The ID of the region where the Server Load Balancer (SLB) instance is created.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the most recent region list.</p>
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

        /**
         * <p>The version of the TLS protocol. Valid values: <strong>TLSv1.0</strong>, <strong>TLSv1.1</strong>, <strong>TLSv1.2</strong>, and <strong>TLSv1.3</strong>. You can specify at most four TLS versions.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>TLSv1.0</p>
         */
        public Builder TLSVersions(java.util.List<String> TLSVersions) {
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
