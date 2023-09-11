// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nlb20220430.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSecurityPolicyRequest} extends {@link RequestModel}
 *
 * <p>CreateSecurityPolicyRequest</p>
 */
public class CreateSecurityPolicyRequest extends Request {
    @Body
    @NameInMap("Ciphers")
    @Validation(required = true)
    private java.util.List < String > ciphers;

    @Body
    @NameInMap("ClientToken")
    private String clientToken;

    @Body
    @NameInMap("DryRun")
    private Boolean dryRun;

    @Body
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Body
    @NameInMap("SecurityPolicyName")
    private String securityPolicyName;

    @Body
    @NameInMap("Tag")
    private java.util.List < Tag> tag;

    @Body
    @NameInMap("TlsVersions")
    @Validation(required = true)
    private java.util.List < String > tlsVersions;

    private CreateSecurityPolicyRequest(Builder builder) {
        super(builder);
        this.ciphers = builder.ciphers;
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.securityPolicyName = builder.securityPolicyName;
        this.tag = builder.tag;
        this.tlsVersions = builder.tlsVersions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSecurityPolicyRequest create() {
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
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return securityPolicyName
     */
    public String getSecurityPolicyName() {
        return this.securityPolicyName;
    }

    /**
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
    }

    /**
     * @return tlsVersions
     */
    public java.util.List < String > getTlsVersions() {
        return this.tlsVersions;
    }

    public static final class Builder extends Request.Builder<CreateSecurityPolicyRequest, Builder> {
        private java.util.List < String > ciphers; 
        private String clientToken; 
        private Boolean dryRun; 
        private String regionId; 
        private String resourceGroupId; 
        private String securityPolicyName; 
        private java.util.List < Tag> tag; 
        private java.util.List < String > tlsVersions; 

        private Builder() {
            super();
        } 

        private Builder(CreateSecurityPolicyRequest request) {
            super(request);
            this.ciphers = request.ciphers;
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.securityPolicyName = request.securityPolicyName;
            this.tag = request.tag;
            this.tlsVersions = request.tlsVersions;
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
            this.putBodyParameter("Ciphers", ciphers);
            this.ciphers = ciphers;
            return this;
        }

        /**
         * The client token that is used to ensure the idempotence of the request.
         * <p>
         * 
         * You can use the client to generate the value, but you must ensure that it is unique among all requests. ClientToken can contain only ASCII characters.
         * 
         * >  If you do not set this parameter, **ClientToken** is set to the value of **RequestId**. The value of **RequestId** for each API request may be different.
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * Specifies whether only to precheck the request. Valid values:
         * <p>
         * 
         * *   **true**: checks the request but does not create the security policy. The system prechecks the required parameters, request syntax, and limits. If the request fails the precheck, an error message is returned. If the request passes the precheck, the `DryRunOperation` error code is returned.
         * *   **false** (default): sends the request. If the request passes the precheck, an HTTP 2xx status code is returned and the operation is performed.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putBodyParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * The ID of the region where the NLB instance is deployed.
         * <p>
         * 
         * You can call the [DescribeRegions](~~443657~~) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the resource group.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putBodyParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * The name of the security policy.
         * <p>
         * 
         * The name must be 1 to 200 characters in length, and can contain letters, digits, periods (.), underscores (\_), and hyphens (-).
         */
        public Builder securityPolicyName(String securityPolicyName) {
            this.putBodyParameter("SecurityPolicyName", securityPolicyName);
            this.securityPolicyName = securityPolicyName;
            return this;
        }

        /**
         * 标签列表。
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putBodyParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * The supported versions of the Transport Layer Security (TLS) protocol. Valid values: **TLSv1.0**, **TLSv1.1**, **TLSv1.2**, and **TLSv1.3**.
         */
        public Builder tlsVersions(java.util.List < String > tlsVersions) {
            this.putBodyParameter("TlsVersions", tlsVersions);
            this.tlsVersions = tlsVersions;
            return this;
        }

        @Override
        public CreateSecurityPolicyRequest build() {
            return new CreateSecurityPolicyRequest(this);
        } 

    } 

    public static class Tag extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * 标签键。最多支持128个字符，不能以`aliyun`或`acs:`开头，不能包含`http://`或`https://`。
             * <p>
             * 
             * 一次调用最多支持添加20个标签。
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * 标签值。最多支持128个字符，不能以`aliyun`或`acs:`开头，不能包含`http://`或`https://`。
             * <p>
             * 
             * 一次调用最多支持添加20个标签。
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
}
