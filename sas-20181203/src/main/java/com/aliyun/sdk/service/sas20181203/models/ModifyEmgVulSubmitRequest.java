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
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

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
        this.dryRun = builder.dryRun;
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
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
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
        private Boolean dryRun; 
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
            this.dryRun = request.dryRun;
            this.lang = request.lang;
            this.name = request.name;
            this.resourceDirectoryAccountId = request.resourceDirectoryAccountId;
            this.userAgreement = request.userAgreement;
        } 

        /**
         * <p>The client token used to ensure the idempotence of the request. Use a different token for different requests. Only ASCII characters are supported. The token can be up to 64 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>02fb3da4-130e-11e9-8e44-0016e04115b</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>Specifies whether to perform only a dry run for this request. Valid values: true: performs only a dry run without executing the actual operation. false: executes the request normally. Default value: false.</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>The language of the request and response messages. Default value: <strong>zh</strong>. Valid values:</p>
         * <ul>
         * <li><p><strong>zh</strong>: Chinese</p>
         * </li>
         * <li><p><strong>en</strong>: English</p>
         * </li>
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
         * <p>The name of the vulnerability to query.</p>
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
         * <p>The ID of the member accounts in the resource directory (Alibaba Cloud account).</p>
         * <blockquote>
         * <p>Call the <a href="~~DescribeMonitorAccounts~~">DescribeMonitorAccounts</a> operation to obtain this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>16670360956*****</p>
         */
        public Builder resourceDirectoryAccountId(Long resourceDirectoryAccountId) {
            this.putQueryParameter("ResourceDirectoryAccountId", resourceDirectoryAccountId);
            this.resourceDirectoryAccountId = resourceDirectoryAccountId;
            return this;
        }

        /**
         * <p>Specifies whether to run vulnerability detection. Valid values:</p>
         * <ul>
         * <li><p><strong>yes</strong>: Run.</p>
         * </li>
         * <li><p><strong>no</strong>: Do not run.</p>
         * </li>
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
