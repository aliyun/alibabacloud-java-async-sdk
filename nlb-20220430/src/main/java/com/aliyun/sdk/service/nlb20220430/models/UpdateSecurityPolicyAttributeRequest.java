// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nlb20220430.models;

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
 * {@link UpdateSecurityPolicyAttributeRequest} extends {@link RequestModel}
 *
 * <p>UpdateSecurityPolicyAttributeRequest</p>
 */
public class UpdateSecurityPolicyAttributeRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Ciphers")
    private java.util.List<String> ciphers;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SecurityPolicyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String securityPolicyId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SecurityPolicyName")
    private String securityPolicyName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TlsVersions")
    private java.util.List<String> tlsVersions;

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
    public java.util.List<String> getCiphers() {
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
    public java.util.List<String> getTlsVersions() {
        return this.tlsVersions;
    }

    public static final class Builder extends Request.Builder<UpdateSecurityPolicyAttributeRequest, Builder> {
        private java.util.List<String> ciphers; 
        private String clientToken; 
        private Boolean dryRun; 
        private String regionId; 
        private String securityPolicyId; 
        private String securityPolicyName; 
        private java.util.List<String> tlsVersions; 

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
         */
        public Builder ciphers(java.util.List<String> ciphers) {
            this.putBodyParameter("Ciphers", ciphers);
            this.ciphers = ciphers;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
         * <blockquote>
         * <p>If you do not specify this parameter, the system automatically uses the <strong>request ID</strong> as the <strong>client token</strong>. The <strong>request ID</strong> may be different for each request.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>123e4567-e89b-12d3-a456-426655440000</p>
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>Specifies whether to perform a dry run, without performing the actual request. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the <code>DryRunOperation</code> error code is returned.</li>
         * <li><strong>false</strong>(default): performs a dry run and performs the actual request. If the request passes the dry run, a 2xx HTTP status code is returned and the operation is performed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putBodyParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>The region ID of the NLB instance.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/443657.html">DescribeRegions</a> operation to obtain the region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the TLS security policy.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>tls-bp14bb1e7dll4f****</p>
         */
        public Builder securityPolicyId(String securityPolicyId) {
            this.putBodyParameter("SecurityPolicyId", securityPolicyId);
            this.securityPolicyId = securityPolicyId;
            return this;
        }

        /**
         * <p>The name of the security policy.</p>
         * <p>The name must be 1 to 200 characters in length, and can contain letters, digits, periods (.), underscores (_), and hyphens (-).</p>
         * 
         * <strong>example:</strong>
         * <p>TLSCipherPolicy</p>
         */
        public Builder securityPolicyName(String securityPolicyName) {
            this.putBodyParameter("SecurityPolicyName", securityPolicyName);
            this.securityPolicyName = securityPolicyName;
            return this;
        }

        /**
         * <p>The supported versions of the Transport Layer Security (TLS) protocol. Valid values: <strong>TLSv1.0</strong>, <strong>TLSv1.1</strong>, <strong>TLSv1.2</strong>, and <strong>TLSv1.3</strong>. You can specify at most four TLS protocol versions.</p>
         */
        public Builder tlsVersions(java.util.List<String> tlsVersions) {
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
