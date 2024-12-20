// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

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
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ciphers")
    private java.util.List<String> ciphers;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityPolicyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String securityPolicyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityPolicyName")
    private String securityPolicyName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TLSVersions")
    private java.util.List<String> TLSVersions;

    private UpdateSecurityPolicyAttributeRequest(Builder builder) {
        super(builder);
        this.ciphers = builder.ciphers;
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.securityPolicyId = builder.securityPolicyId;
        this.securityPolicyName = builder.securityPolicyName;
        this.TLSVersions = builder.TLSVersions;
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
     * @return TLSVersions
     */
    public java.util.List<String> getTLSVersions() {
        return this.TLSVersions;
    }

    public static final class Builder extends Request.Builder<UpdateSecurityPolicyAttributeRequest, Builder> {
        private java.util.List<String> ciphers; 
        private String clientToken; 
        private Boolean dryRun; 
        private String securityPolicyId; 
        private String securityPolicyName; 
        private java.util.List<String> TLSVersions; 

        private Builder() {
            super();
        } 

        private Builder(UpdateSecurityPolicyAttributeRequest request) {
            super(request);
            this.ciphers = request.ciphers;
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.securityPolicyId = request.securityPolicyId;
            this.securityPolicyName = request.securityPolicyName;
            this.TLSVersions = request.TLSVersions;
        } 

        /**
         * <p>The supported cipher suites.</p>
         */
        public Builder ciphers(java.util.List<String> ciphers) {
            this.putQueryParameter("Ciphers", ciphers);
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
         * <p>593B0448-D13E-4C56-AC0D-FDF0FDE0E9A3</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>Specifies whether to perform only a dry run, without performing the actual request. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the <code>DryRunOperation</code> error code is returned.</li>
         * <li><strong>false</strong> (default): performs a dry run and performs the actual request. If the request passes the dry run, a 2xx HTTP status code is returned and the operation is performed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>The security policy ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>spy-n0kn923****</p>
         */
        public Builder securityPolicyId(String securityPolicyId) {
            this.putQueryParameter("SecurityPolicyId", securityPolicyId);
            this.securityPolicyId = securityPolicyId;
            return this;
        }

        /**
         * <p>The name of the security policy.</p>
         * <p>The name must be 2 to 128 characters in length, and can contain letters, digits, periods (.), underscores (_), and hyphens (-). The name must start with a letter.</p>
         * 
         * <strong>example:</strong>
         * <p>test-secrity</p>
         */
        public Builder securityPolicyName(String securityPolicyName) {
            this.putQueryParameter("SecurityPolicyName", securityPolicyName);
            this.securityPolicyName = securityPolicyName;
            return this;
        }

        /**
         * <p>The supported TLS protocol versions.</p>
         */
        public Builder TLSVersions(java.util.List<String> TLSVersions) {
            this.putQueryParameter("TLSVersions", TLSVersions);
            this.TLSVersions = TLSVersions;
            return this;
        }

        @Override
        public UpdateSecurityPolicyAttributeRequest build() {
            return new UpdateSecurityPolicyAttributeRequest(this);
        } 

    } 

}
