// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nlb20220430.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateSecurityPolicyAttributeRequest} extends {@link RequestModel}
 *
 * <p>UpdateSecurityPolicyAttributeRequest</p>
 */
public class UpdateSecurityPolicyAttributeRequest extends Request {
    @Body
    @NameInMap("Ciphers")
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
    @NameInMap("SecurityPolicyId")
    @Validation(required = true)
    private String securityPolicyId;

    @Body
    @NameInMap("SecurityPolicyName")
    private String securityPolicyName;

    @Body
    @NameInMap("TlsVersions")
    private java.util.List < String > tlsVersions;

    private UpdateSecurityPolicyAttributeRequest(Builder builder) {
        super(builder);
        this.ciphers = builder.ciphers;
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.regionId = builder.regionId;
        this.securityPolicyId = builder.securityPolicyId;
        this.securityPolicyName = builder.securityPolicyName;
        this.tlsVersions = builder.tlsVersions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateSecurityPolicyAttributeRequest create() {
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
     * @return securityPolicyId
     */
    public String getSecurityPolicyId() {
        return this.securityPolicyId;
    }

    /**
     * @return securityPolicyName
     */
    public String getSecurityPolicyName() {
        return this.securityPolicyName;
    }

    /**
     * @return tlsVersions
     */
    public java.util.List < String > getTlsVersions() {
        return this.tlsVersions;
    }

    public static final class Builder extends Request.Builder<UpdateSecurityPolicyAttributeRequest, Builder> {
        private java.util.List < String > ciphers; 
        private String clientToken; 
        private Boolean dryRun; 
        private String regionId; 
        private String securityPolicyId; 
        private String securityPolicyName; 
        private java.util.List < String > tlsVersions; 

        private Builder() {
            super();
        } 

        private Builder(UpdateSecurityPolicyAttributeRequest request) {
            super(request);
            this.ciphers = request.ciphers;
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.regionId = request.regionId;
            this.securityPolicyId = request.securityPolicyId;
            this.securityPolicyName = request.securityPolicyName;
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
         * You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.
         * 
         * > If you do not specify this parameter, the system automatically uses the **request ID** as the **client token**. The **request ID** may be different for each request.
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * Specifies whether to perform a dry run, without performing the actual request. Valid values:
         * <p>
         * 
         * *   **true**: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the `DryRunOperation` error code is returned.
         * *   **false**(default): performs a dry run and performs the actual request. If the request passes the dry run, a 2xx HTTP status code is returned and the operation is performed.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putBodyParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * The region ID of the NLB instance.
         * <p>
         * 
         * You can call the [DescribeRegions](~~443657~~) operation to obtain the region ID.
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the TLS security policy.
         */
        public Builder securityPolicyId(String securityPolicyId) {
            this.putBodyParameter("SecurityPolicyId", securityPolicyId);
            this.securityPolicyId = securityPolicyId;
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
         * The supported versions of the Transport Layer Security (TLS) protocol. Valid values: **TLSv1.0**, **TLSv1.1**, **TLSv1.2**, and **TLSv1.3**. You can specify at most four TLS protocol versions.
         */
        public Builder tlsVersions(java.util.List < String > tlsVersions) {
            this.putBodyParameter("TlsVersions", tlsVersions);
            this.tlsVersions = tlsVersions;
            return this;
        }

        @Override
        public UpdateSecurityPolicyAttributeRequest build() {
            return new UpdateSecurityPolicyAttributeRequest(this);
        } 

    } 

}
