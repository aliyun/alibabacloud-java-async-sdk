// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210218.models;

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
 * {@link GetAuthCodeRequest} extends {@link RequestModel}
 *
 * <p>GetAuthCodeRequest</p>
 */
public class GetAuthCodeRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AccountType")
    private String accountType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AdDomain")
    private String adDomain;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AdPassword")
    private String adPassword;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AutoCreateUser")
    private Boolean autoCreateUser;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EndUserId")
    private String endUserId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExternalUserId")
    private String externalUserId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Policy")
    private String policy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TokenType")
    private String tokenType;

    private GetAuthCodeRequest(Builder builder) {
        super(builder);
        this.accountType = builder.accountType;
        this.adDomain = builder.adDomain;
        this.adPassword = builder.adPassword;
        this.autoCreateUser = builder.autoCreateUser;
        this.endUserId = builder.endUserId;
        this.externalUserId = builder.externalUserId;
        this.policy = builder.policy;
        this.tokenType = builder.tokenType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAuthCodeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountType
     */
    public String getAccountType() {
        return this.accountType;
    }

    /**
     * @return adDomain
     */
    public String getAdDomain() {
        return this.adDomain;
    }

    /**
     * @return adPassword
     */
    public String getAdPassword() {
        return this.adPassword;
    }

    /**
     * @return autoCreateUser
     */
    public Boolean getAutoCreateUser() {
        return this.autoCreateUser;
    }

    /**
     * @return endUserId
     */
    public String getEndUserId() {
        return this.endUserId;
    }

    /**
     * @return externalUserId
     */
    public String getExternalUserId() {
        return this.externalUserId;
    }

    /**
     * @return policy
     */
    public String getPolicy() {
        return this.policy;
    }

    /**
     * @return tokenType
     */
    public String getTokenType() {
        return this.tokenType;
    }

    public static final class Builder extends Request.Builder<GetAuthCodeRequest, Builder> {
        private String accountType; 
        private String adDomain; 
        private String adPassword; 
        private Boolean autoCreateUser; 
        private String endUserId; 
        private String externalUserId; 
        private String policy; 
        private String tokenType; 

        private Builder() {
            super();
        } 

        private Builder(GetAuthCodeRequest request) {
            super(request);
            this.accountType = request.accountType;
            this.adDomain = request.adDomain;
            this.adPassword = request.adPassword;
            this.autoCreateUser = request.autoCreateUser;
            this.endUserId = request.endUserId;
            this.externalUserId = request.externalUserId;
            this.policy = request.policy;
            this.tokenType = request.tokenType;
        } 

        /**
         * <p>The account type. Valid values: ad (enterprise AD account) and simple (convenience account).</p>
         * 
         * <strong>example:</strong>
         * <p>simple</p>
         */
        public Builder accountType(String accountType) {
            this.putBodyParameter("AccountType", accountType);
            this.accountType = accountType;
            return this;
        }

        /**
         * <p>The Active Directory domain name. This parameter is required when the account type is ad.</p>
         * 
         * <strong>example:</strong>
         * <p>ad.example.com</p>
         */
        public Builder adDomain(String adDomain) {
            this.putBodyParameter("AdDomain", adDomain);
            this.adDomain = adDomain;
            return this;
        }

        /**
         * <p>The password of the enterprise AD account.</p>
         * 
         * <strong>example:</strong>
         * <p>Qa****7!Z9</p>
         */
        public Builder adPassword(String adPassword) {
            this.putBodyParameter("AdPassword", adPassword);
            this.adPassword = adPassword;
            return this;
        }

        /**
         * <p>Specifies whether to synchronously create an EndUserId based on ExternalUserId. This parameter takes effect only when EndUserId is left empty.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder autoCreateUser(Boolean autoCreateUser) {
            this.putBodyParameter("AutoCreateUser", autoCreateUser);
            this.autoCreateUser = autoCreateUser;
            return this;
        }

        /**
         * <p>The username of the Wuying convenience account. The username must be unique within an Alibaba Cloud account. This parameter and ExternalUserId cannot be left empty at the same time.</p>
         * 
         * <strong>example:</strong>
         * <p>alice</p>
         */
        public Builder endUserId(String endUserId) {
            this.putBodyParameter("EndUserId", endUserId);
            this.endUserId = endUserId;
            return this;
        }

        /**
         * <p>The external user ID. This ID is customized by the caller and must be unique within an Alibaba Cloud account. This parameter and ExternalUserId cannot be left empty at the same time.</p>
         * 
         * <strong>example:</strong>
         * <p>alice</p>
         */
        public Builder externalUserId(String externalUserId) {
            this.putBodyParameter("ExternalUserId", externalUserId);
            this.externalUserId = externalUserId;
            return this;
        }

        /**
         * <p>The access policy that restricts the access permissions of the authorization code. If this parameter is left empty, no restrictions are applied.</p>
         * <p>Syntax:</p>
         * <pre><code class="language-json">{
         *       &quot;Version&quot;: &quot;1&quot;,
         *       &quot;Resource&quot;: {
         *             &quot;Type&quot;: &quot;&lt;resource type&gt;&quot;,
         *             &quot;Id&quot;: &quot;&lt;resource ID&gt;&quot;
         *       }
         * }
         * </code></pre>
         * <p>Valid values for <resource type>:</p>
         * <ul>
         * <li>AppInstanceGroup: app instance group. You can call the ListAppInstanceGroup operation to obtain the ID.</li>
         * <li>AppInstance: app instance. This is a dedicated field.</li>
         * <li>App: application. You can call the ListAppInstanceGroup operation to obtain the ID.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{
         *       &quot;Version&quot;: &quot;1&quot;,
         *       &quot;Resource&quot;: {
         *             &quot;Type&quot;: &quot;AppInstanceGroup&quot;,
         *             &quot;Id&quot;: &quot;aig-9ciijz60n4xsv****&quot;
         *       }
         * }</p>
         */
        public Builder policy(String policy) {
            this.putBodyParameter("Policy", policy);
            this.policy = policy;
            return this;
        }

        /**
         * <p>The token type. Valid values: LoginToken (logon token) and StsToken (temporary identity credential).</p>
         * 
         * <strong>example:</strong>
         * <p>StsToken</p>
         */
        public Builder tokenType(String tokenType) {
            this.putQueryParameter("TokenType", tokenType);
            this.tokenType = tokenType;
            return this;
        }

        @Override
        public GetAuthCodeRequest build() {
            return new GetAuthCodeRequest(this);
        } 

    } 

}
