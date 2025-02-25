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
 * {@link SetTLSCipherPolicyAttributeRequest} extends {@link RequestModel}
 *
 * <p>SetTLSCipherPolicyAttributeRequest</p>
 */
public class SetTLSCipherPolicyAttributeRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("TLSCipherPolicyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String TLSCipherPolicyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TLSVersions")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> TLSVersions;

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
     * @return TLSCipherPolicyId
     */
    public String getTLSCipherPolicyId() {
        return this.TLSCipherPolicyId;
    }

    /**
     * @return TLSVersions
     */
    public java.util.List<String> getTLSVersions() {
        return this.TLSVersions;
    }

    public static final class Builder extends Request.Builder<SetTLSCipherPolicyAttributeRequest, Builder> {
        private java.util.List<String> ciphers; 
        private String name; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String TLSCipherPolicyId; 
        private java.util.List<String> TLSVersions; 

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
         * <p>The cipher suites supported by the TLS version.</p>
         * <p>The specified cipher suites must be supported by at least one TLS protocol version that you specify. For example, if you set the TLSVersions parameter to TLSv1.3, you must specify cipher suites that are supported by this protocol version.</p>
         * <p>TLS 1.0 and TLS 1.1 support the following cipher suites:</p>
         * <ul>
         * <li>ECDHE-ECDSA-AES128-SHA</li>
         * <li>ECDHE-ECDSA-AES256-SHA</li>
         * <li>ECDHE-RSA-AES128-SHA</li>
         * <li>ECDHE-RSA-AES256-SHA</li>
         * <li>AES128-SHA AES256-SHA</li>
         * <li>DES-CBC3-SHA</li>
         * </ul>
         * <p>TLS 1.2 supports the following cipher suites:</p>
         * <ul>
         * <li>ECDHE-ECDSA-AES128-SHA</li>
         * <li>ECDHE-ECDSA-AES256-SHA</li>
         * <li>ECDHE-RSA-AES128-SHA</li>
         * <li>ECDHE-RSA-AES256-SHA</li>
         * <li>AES128-SHA AES256-SHA</li>
         * <li>DES-CBC3-SHA</li>
         * <li>ECDHE-ECDSA-AES128-GCM-SHA256</li>
         * <li>ECDHE-ECDSA-AES256-GCM-SHA384</li>
         * <li>ECDHE-ECDSA-AES128-SHA256</li>
         * <li>ECDHE-ECDSA-AES256-SHA384</li>
         * <li>ECDHE-RSA-AES128-GCM-SHA256</li>
         * <li>ECDHE-RSA-AES256-GCM-SHA384</li>
         * <li>ECDHE-RSA-AES128-SHA256</li>
         * <li>ECDHE-RSA-AES256-SHA384</li>
         * <li>AES128-GCM-SHA256</li>
         * <li>AES256-GCM-SHA384</li>
         * <li>AES128-SHA256 AES256-SHA256</li>
         * </ul>
         * <p>TLS 1.3 supports the following cipher suites:</p>
         * <ul>
         * <li>TLS_AES_128_GCM_SHA256</li>
         * <li>TLS_AES_256_GCM_SHA384</li>
         * <li>TLS_CHACHA20_POLY1305_SHA256</li>
         * <li>TLS_AES_128_CCM_SHA256</li>
         * <li>TLS_AES_128_CCM_8_SHA256</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DES-CBC3-SHA</p>
         */
        public Builder ciphers(java.util.List<String> ciphers) {
            this.putQueryParameter("Ciphers", ciphers);
            this.ciphers = ciphers;
            return this;
        }

        /**
         * <p>The name of the TLS policy. The name must be 2 to 128 characters in length and can contain letters, digits, periods (.), underscores (_), and hyphens (-). The name must start with a letter.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>tls-policy*****-test</p>
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
         * <p>The ID of the region where the Server Load Balancer (SLB) instance is deployed.</p>
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
         * <p>The ID of the TLS policy.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>tls-bp1lp2076qx4e******bridp</p>
         */
        public Builder TLSCipherPolicyId(String TLSCipherPolicyId) {
            this.putQueryParameter("TLSCipherPolicyId", TLSCipherPolicyId);
            this.TLSCipherPolicyId = TLSCipherPolicyId;
            return this;
        }

        /**
         * <p>The version of the TLS protocol. Valid values: <strong>TLSv1.0</strong>, <strong>TLSv1.1</strong>, <strong>TLSv1.2</strong>, and <strong>TLSv1.3</strong>.</p>
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
        public SetTLSCipherPolicyAttributeRequest build() {
            return new SetTLSCipherPolicyAttributeRequest(this);
        } 

    } 

}
