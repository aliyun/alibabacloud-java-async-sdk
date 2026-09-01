// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link ModifyEmgVulSubmitRequest} extends {@link RequestModel}
 *
 * <p>ModifyEmgVulSubmitRequest</p>
 */
public class ModifyEmgVulSubmitRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    @com.aliyun.core.annotation.Validation(maxLength = 64)
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceDirectoryAccountId")
    private Long resourceDirectoryAccountId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserAgreement")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userAgreement;

    private ModifyEmgVulSubmitRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.lang = builder.lang;
        this.name = builder.name;
        this.resourceDirectoryAccountId = builder.resourceDirectoryAccountId;
        this.userAgreement = builder.userAgreement;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyEmgVulSubmitRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return resourceDirectoryAccountId
     */
    public Long getResourceDirectoryAccountId() {
        return this.resourceDirectoryAccountId;
    }

    /**
     * @return userAgreement
     */
    public String getUserAgreement() {
        return this.userAgreement;
    }

    public static final class Builder extends Request.Builder<ModifyEmgVulSubmitRequest, Builder> {
        private String clientToken; 
        private String lang; 
        private String name; 
        private Long resourceDirectoryAccountId; 
        private String userAgreement; 

        private Builder() {
            super();
        } 

        private Builder(ModifyEmgVulSubmitRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.lang = request.lang;
            this.name = request.name;
            this.resourceDirectoryAccountId = request.resourceDirectoryAccountId;
            this.userAgreement = request.userAgreement;
        } 

        /**
         * <p>客户端 Token，用于保证请求幂等性。不同请求应使用不同的 Token；只支持 ASCII 字符，长度不超过 64 个字符。</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The language of the content within the request and response. Default value: <strong>zh</strong>. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese</li>
         * <li><strong>en</strong>: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The name of the vulnerability.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>scan:ASCV-2019-032401</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The Alibaba Cloud account ID of the member in the resource directory.</p>
         * <blockquote>
         * <p> You can call the <a href="~~DescribeMonitorAccounts~~">DescribeMonitorAccounts</a> operation to obtain the IDs.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1232428423234****</p>
         */
        public Builder resourceDirectoryAccountId(Long resourceDirectoryAccountId) {
            this.putQueryParameter("ResourceDirectoryAccountId", resourceDirectoryAccountId);
            this.resourceDirectoryAccountId = resourceDirectoryAccountId;
            return this;
        }

        /**
         * <p>Specifies whether to scan for urgent vulnerabilities. Valid values:</p>
         * <ul>
         * <li><strong>yes</strong></li>
         * <li><strong>no</strong></li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>yes</p>
         */
        public Builder userAgreement(String userAgreement) {
            this.putQueryParameter("UserAgreement", userAgreement);
            this.userAgreement = userAgreement;
            return this;
        }

        @Override
        public ModifyEmgVulSubmitRequest build() {
            return new ModifyEmgVulSubmitRequest(this);
        } 

    } 

}
