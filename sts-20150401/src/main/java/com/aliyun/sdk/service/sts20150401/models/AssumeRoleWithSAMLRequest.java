// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sts20150401.models;

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
 * {@link AssumeRoleWithSAMLRequest} extends {@link RequestModel}
 *
 * <p>AssumeRoleWithSAMLRequest</p>
 */
public class AssumeRoleWithSAMLRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DurationSeconds")
    private Long durationSeconds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Policy")
    private String policy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RoleArn")
    private String roleArn;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SAMLAssertion")
    private String SAMLAssertion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SAMLProviderArn")
    private String SAMLProviderArn;

    private AssumeRoleWithSAMLRequest(Builder builder) {
        super(builder);
        this.durationSeconds = builder.durationSeconds;
        this.policy = builder.policy;
        this.roleArn = builder.roleArn;
        this.SAMLAssertion = builder.SAMLAssertion;
        this.SAMLProviderArn = builder.SAMLProviderArn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AssumeRoleWithSAMLRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return durationSeconds
     */
    public Long getDurationSeconds() {
        return this.durationSeconds;
    }

    /**
     * @return policy
     */
    public String getPolicy() {
        return this.policy;
    }

    /**
     * @return roleArn
     */
    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * @return SAMLAssertion
     */
    public String getSAMLAssertion() {
        return this.SAMLAssertion;
    }

    /**
     * @return SAMLProviderArn
     */
    public String getSAMLProviderArn() {
        return this.SAMLProviderArn;
    }

    public static final class Builder extends Request.Builder<AssumeRoleWithSAMLRequest, Builder> {
        private Long durationSeconds; 
        private String policy; 
        private String roleArn; 
        private String SAMLAssertion; 
        private String SAMLProviderArn; 

        private Builder() {
            super();
        } 

        private Builder(AssumeRoleWithSAMLRequest request) {
            super(request);
            this.durationSeconds = request.durationSeconds;
            this.policy = request.policy;
            this.roleArn = request.roleArn;
            this.SAMLAssertion = request.SAMLAssertion;
            this.SAMLProviderArn = request.SAMLProviderArn;
        } 

        /**
         * <p>The validity period of the STS token. Unit: seconds.</p>
         * <p>Minimum value: 900. Maximum value: the value of the <code>MaxSessionDuration</code> parameter. Default value: 3600.</p>
         * <p>You can call the CreateRole or UpdateRole operation to configure the <code>MaxSessionDuration</code> parameter. For more information, see <a href="https://help.aliyun.com/document_detail/28710.html">CreateRole</a> or <a href="https://help.aliyun.com/document_detail/28712.html">UpdateRole</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>3600</p>
         */
        public Builder durationSeconds(Long durationSeconds) {
            this.putQueryParameter("DurationSeconds", durationSeconds);
            this.durationSeconds = durationSeconds;
            return this;
        }

        /**
         * <p>The policy that specifies the permissions of the returned STS token. You can use this parameter to grant the STS token fewer permissions than the permissions granted to the RAM role.</p>
         * <ul>
         * <li>If you specify this parameter, the permissions of the returned STS token are the permissions that are included in the value of this parameter and owned by the RAM role.</li>
         * <li>If you do not specify this parameter, the returned STS token has all the permissions of the RAM role.</li>
         * </ul>
         * <p>The value must be 1 to 2,048 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>url_encoded_policy</p>
         */
        public Builder policy(String policy) {
            this.putQueryParameter("Policy", policy);
            this.policy = policy;
            return this;
        }

        /**
         * <p>The ARN of the RAM role.</p>
         * <p>The trust entity of the RAM role is a SAML IdP. For more information, see <a href="https://help.aliyun.com/document_detail/116805.html">Create a RAM role for a trusted IdP</a> or <a href="https://help.aliyun.com/document_detail/28710.html">CreateRole</a>.</p>
         * <p>Format: <code>acs:ram::&lt;account_id&gt;:role/&lt;role_name&gt;</code>.</p>
         * <p>You can view the ARN in the RAM console or by calling operations.</p>
         * <ul>
         * <li>For more information about how to view the ARN in the RAM console, see <a href="https://help.aliyun.com/document_detail/39744.html">How do I view the ARN of the RAM role?</a>.</li>
         * <li>For more information about how to view the ARN by calling operations, see <a href="https://help.aliyun.com/document_detail/28713.html">ListRoles</a> or <a href="https://help.aliyun.com/document_detail/28711.html">GetRole</a>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>acs:ram::123456789012****:role/adminrole</p>
         */
        public Builder roleArn(String roleArn) {
            this.putQueryParameter("RoleArn", roleArn);
            this.roleArn = roleArn;
            return this;
        }

        /**
         * <p>The Base64-encoded SAML assertion.</p>
         * <p>The value must be 4 to 100,000 characters in length.</p>
         * <blockquote>
         * <p>A complete SAML response rather than a single SAMLAssertion field must be retrieved from the external IdP.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>base64_encoded_saml_assertion</p>
         */
        public Builder SAMLAssertion(String SAMLAssertion) {
            this.putQueryParameter("SAMLAssertion", SAMLAssertion);
            this.SAMLAssertion = SAMLAssertion;
            return this;
        }

        /**
         * <p>The Alibaba Cloud Resource Name (ARN) of the SAML IdP that is created in the RAM console.</p>
         * <p>Format: <code>acs:ram::&lt;account_id&gt;:saml-provider/&lt;saml_provider_id&gt;</code>.</p>
         * <p>You can view the ARN in the RAM console or by calling operations.</p>
         * <ul>
         * <li>For more information about how to view the ARN in the RAM console, see <a href="https://help.aliyun.com/document_detail/116795.html">How do I view the ARN of a RAM role?</a></li>
         * <li>For more information about how to view the ARN by calling operations, see <a href="https://help.aliyun.com/document_detail/186833.html">GetSAMLProvider</a> or <a href="https://help.aliyun.com/document_detail/186851.html">ListSAMLProviders</a>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>acs:ram::123456789012****:saml-provider/company1</p>
         */
        public Builder SAMLProviderArn(String SAMLProviderArn) {
            this.putQueryParameter("SAMLProviderArn", SAMLProviderArn);
            this.SAMLProviderArn = SAMLProviderArn;
            return this;
        }

        @Override
        public AssumeRoleWithSAMLRequest build() {
            return new AssumeRoleWithSAMLRequest(this);
        } 

    } 

}
