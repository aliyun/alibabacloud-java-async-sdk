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
 * {@link AssumeRoleWithOIDCRequest} extends {@link RequestModel}
 *
 * <p>AssumeRoleWithOIDCRequest</p>
 */
public class AssumeRoleWithOIDCRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DurationSeconds")
    private Long durationSeconds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OIDCProviderArn")
    private String OIDCProviderArn;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OIDCToken")
    private String OIDCToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Policy")
    private String policy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RoleArn")
    private String roleArn;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RoleSessionName")
    private String roleSessionName;

    private AssumeRoleWithOIDCRequest(Builder builder) {
        super(builder);
        this.durationSeconds = builder.durationSeconds;
        this.OIDCProviderArn = builder.OIDCProviderArn;
        this.OIDCToken = builder.OIDCToken;
        this.policy = builder.policy;
        this.roleArn = builder.roleArn;
        this.roleSessionName = builder.roleSessionName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AssumeRoleWithOIDCRequest create() {
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
     * @return OIDCProviderArn
     */
    public String getOIDCProviderArn() {
        return this.OIDCProviderArn;
    }

    /**
     * @return OIDCToken
     */
    public String getOIDCToken() {
        return this.OIDCToken;
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
     * @return roleSessionName
     */
    public String getRoleSessionName() {
        return this.roleSessionName;
    }

    public static final class Builder extends Request.Builder<AssumeRoleWithOIDCRequest, Builder> {
        private Long durationSeconds; 
        private String OIDCProviderArn; 
        private String OIDCToken; 
        private String policy; 
        private String roleArn; 
        private String roleSessionName; 

        private Builder() {
            super();
        } 

        private Builder(AssumeRoleWithOIDCRequest request) {
            super(request);
            this.durationSeconds = request.durationSeconds;
            this.OIDCProviderArn = request.OIDCProviderArn;
            this.OIDCToken = request.OIDCToken;
            this.policy = request.policy;
            this.roleArn = request.roleArn;
            this.roleSessionName = request.roleSessionName;
        } 

        /**
         * <p>The validity period of the STS token. Unit: seconds.</p>
         * <p>Default value: 3600. Minimum value: 900. Maximum value: the value of the <code>MaxSessionDuration</code> parameter.</p>
         * <p>For more information about how to specify <code>MaxSessionDuration</code>, see <a href="https://help.aliyun.com/document_detail/28710.html">CreateRole</a> or <a href="https://help.aliyun.com/document_detail/28712.html">UpdateRole</a>.</p>
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
         * <p>The Alibaba Cloud Resource Name (ARN) of the OIDC IdP.</p>
         * <p>You can view the ARN in the RAM console or by calling operations.</p>
         * <ul>
         * <li>For more information about how to view the ARN in the RAM console, see <a href="https://help.aliyun.com/document_detail/327123.html">View the information about an OIDC IdP</a>.</li>
         * <li>For more information about how to view the ARN by calling operations, see <a href="https://help.aliyun.com/document_detail/327126.html">GetOIDCProvider</a> or <a href="https://help.aliyun.com/document_detail/327127.html">ListOIDCProviders</a>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>acs:ram::113511544585****:oidc-provider/TestOidcIdp</p>
         */
        public Builder OIDCProviderArn(String OIDCProviderArn) {
            this.putQueryParameter("OIDCProviderArn", OIDCProviderArn);
            this.OIDCProviderArn = OIDCProviderArn;
            return this;
        }

        /**
         * <p>The OIDC token that is issued by the external IdP.</p>
         * <p>The OIDC token must be 4 to 20,000 characters in length.</p>
         * <blockquote>
         * <p>You must enter the original OIDC token. You do not need to enter the Base64-encoded OIDC token.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>eyJraWQiOiJKQzl3eHpyaHFKMGd0****</p>
         */
        public Builder OIDCToken(String OIDCToken) {
            this.putQueryParameter("OIDCToken", OIDCToken);
            this.OIDCToken = OIDCToken;
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
         * <p>{&quot;Statement&quot;: [{&quot;Action&quot;: [&quot;<em>&quot;],&quot;Effect&quot;: &quot;Allow&quot;,&quot;Resource&quot;: [&quot;</em>&quot;]}],&quot;Version&quot;:&quot;1&quot;}</p>
         */
        public Builder policy(String policy) {
            this.putQueryParameter("Policy", policy);
            this.policy = policy;
            return this;
        }

        /**
         * <p>The ARN of the RAM role.</p>
         * <p>You can view the ARN in the RAM console or by calling operations.</p>
         * <ul>
         * <li>For more information about how to view the ARN in the RAM console, see <a href="https://help.aliyun.com/document_detail/39744.html">How do I view the ARN of the RAM role?</a></li>
         * <li>For more information about how to view the ARN by calling operations, see <a href="https://help.aliyun.com/document_detail/28713.html">ListRoles</a> or <a href="https://help.aliyun.com/document_detail/28711.html">GetRole</a>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>acs:ram::113511544585****:role/testoidc</p>
         */
        public Builder roleArn(String roleArn) {
            this.putQueryParameter("RoleArn", roleArn);
            this.roleArn = roleArn;
            return this;
        }

        /**
         * <p>The custom name of the role session.</p>
         * <p>Set this parameter based on your business requirements. In most cases, this parameter is set to the identity of the user who calls the operation, for example, the username. In ActionTrail logs, you can distinguish the users who assume the same RAM role to perform operations based on the value of the RoleSessionName parameter. This way, you can perform user-specific auditing.</p>
         * <p>The value can contain letters, digits, periods (.), at signs (@), hyphens (-), and underscores (_).</p>
         * <p>The value must be 2 to 64 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>TestOidcAssumedRoleSession</p>
         */
        public Builder roleSessionName(String roleSessionName) {
            this.putQueryParameter("RoleSessionName", roleSessionName);
            this.roleSessionName = roleSessionName;
            return this;
        }

        @Override
        public AssumeRoleWithOIDCRequest build() {
            return new AssumeRoleWithOIDCRequest(this);
        } 

    } 

}
