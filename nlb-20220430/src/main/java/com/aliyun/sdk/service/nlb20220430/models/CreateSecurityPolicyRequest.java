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
 * {@link CreateSecurityPolicyRequest} extends {@link RequestModel}
 *
 * <p>CreateSecurityPolicyRequest</p>
 */
public class CreateSecurityPolicyRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Ciphers")
    @com.aliyun.core.annotation.Validation(required = true)
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
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SecurityPolicyName")
    private String securityPolicyName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TlsVersions")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> tlsVersions;

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
    public java.util.List<Tag> getTag() {
        return this.tag;
    }

    /**
     * @return tlsVersions
     */
    public java.util.List<String> getTlsVersions() {
        return this.tlsVersions;
    }

    public static final class Builder extends Request.Builder<CreateSecurityPolicyRequest, Builder> {
        private java.util.List<String> ciphers; 
        private String clientToken; 
        private Boolean dryRun; 
        private String regionId; 
        private String resourceGroupId; 
        private String securityPolicyName; 
        private java.util.List<Tag> tag; 
        private java.util.List<String> tlsVersions; 

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
         * <p>The cipher suites supported by the security policy. Valid values of this parameter vary based on TlsVersions. A security policy supports up to 32 cipher suites.</p>
         * <p>TLSv1.0 and TLSv1.1 support the following cipher suites:</p>
         * <ul>
         * <li><strong>ECDHE-ECDSA-AES128-SHA</strong></li>
         * <li><strong>ECDHE-ECDSA-AES256-SHA</strong></li>
         * <li><strong>ECDHE-RSA-AES128-SHA</strong></li>
         * <li><strong>ECDHE-RSA-AES256-SHA</strong></li>
         * <li><strong>AES128-SHA</strong></li>
         * <li><strong>AES256-SHA</strong></li>
         * <li><strong>DES-CBC3-SHA</strong></li>
         * </ul>
         * <p>TLSv1.2 supports the following cipher suites:</p>
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
         * <p>TLSv1.3 supports the following cipher suites:</p>
         * <ul>
         * <li><strong>TLS_AES_128_GCM_SHA256</strong></li>
         * <li><strong>TLS_AES_256_GCM_SHA384</strong></li>
         * <li><strong>TLS_CHACHA20_POLY1305_SHA256</strong></li>
         * <li><strong>TLS_AES_128_CCM_SHA256</strong></li>
         * <li><strong>TLS_AES_128_CCM_8_SHA256</strong></li>
         * </ul>
         * <p>This parameter is required.</p>
         */
        public Builder ciphers(java.util.List<String> ciphers) {
            this.putBodyParameter("Ciphers", ciphers);
            this.ciphers = ciphers;
            return this;
        }

        /**
         * <p>The client token used to ensure the idempotence of the request.</p>
         * <p>You can use the client to generate the token. Ensure that the token is unique among different requests. Only ASCII characters are allowed.</p>
         * <blockquote>
         * <p> If you do not set this parameter, the value of <strong>RequestId</strong> is used.**** The value of <strong>RequestId</strong> is different for each request.</p>
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
         * <p>Specifies whether to perform a dry run. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: validates the request without performing the operation. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the validation, the corresponding error message is returned. If the request passes the validation, the <code>DryRunOperation</code> error code is returned.</li>
         * <li><strong>false</strong> (default): validates the request and performs the operation. If the request passes the validation, a 2xx HTTP status code is returned and the operation is performed.</li>
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
         * <p>The ID of the region where the NLB instance is deployed.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/443657.html">DescribeRegions</a> operation to query the most recent region list.</p>
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
         * <p>The ID of the resource group to which the security policy belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-atstuj3rtop****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putBodyParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The name of the security policy.</p>
         * <p>It must be 1 to 200 characters in length, and can contain letters, digits, periods (.), underscores (_), and hyphens (-).</p>
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
         * <p>The tags.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putBodyParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * <p>The Transport Layer Security (TLS) versions supported by the security policy. Valid values: <strong>TLSv1.0</strong>, <strong>TLSv1.1</strong>, <strong>TLSv1.2</strong>, and <strong>TLSv1.3</strong>.</p>
         * <p>This parameter is required.</p>
         */
        public Builder tlsVersions(java.util.List<String> tlsVersions) {
            this.putBodyParameter("TlsVersions", tlsVersions);
            this.tlsVersions = tlsVersions;
            return this;
        }

        @Override
        public CreateSecurityPolicyRequest build() {
            return new CreateSecurityPolicyRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateSecurityPolicyRequest} extends {@link TeaModel}
     *
     * <p>CreateSecurityPolicyRequest</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
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

            private Builder() {
            } 

            private Builder(Tag model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The key of the tag. It must be 1 to 64 characters in length, cannot start with <code>aliyun</code> or <code>acs:</code>, and cannot contain <code>http://</code> or <code>https://</code>. It can contain letters, digits, underscores (_), periods (.), colons (:), forward slashes (/), equal signs (=), plus signs (+), minus signs (-), and at signs (@).</p>
             * <p>You can add up to 20 tags for the security policy in each call.</p>
             * 
             * <strong>example:</strong>
             * <p>KeyTest</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the tag. It must be 1 to 128 characters in length, cannot start with <code>acs:</code> or <code>aliyun</code>, and cannot contain <code>http://</code> or <code>https://</code>. It can contain letters, digits, underscores (_), periods (.), colons (:), forward slashes (/), equal signs (=), plus signs (+), minus signs (-), and at signs (@).</p>
             * <p>You can add up to 20 tags for the security policy in each call.</p>
             * 
             * <strong>example:</strong>
             * <p>ValueTest</p>
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
