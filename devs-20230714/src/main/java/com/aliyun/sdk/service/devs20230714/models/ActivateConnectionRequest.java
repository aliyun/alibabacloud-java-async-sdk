// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devs20230714.models;

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
 * {@link ActivateConnectionRequest} extends {@link RequestModel}
 *
 * <p>ActivateConnectionRequest</p>
 */
public class ActivateConnectionRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("account")
    private GitAccount account;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("credential")
    private OAuthCredential credential;

    private ActivateConnectionRequest(Builder builder) {
        super(builder);
        this.name = builder.name;
        this.account = builder.account;
        this.credential = builder.credential;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ActivateConnectionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return account
     */
    public GitAccount getAccount() {
        return this.account;
    }

    /**
     * @return credential
     */
    public OAuthCredential getCredential() {
        return this.credential;
    }

    public static final class Builder extends Request.Builder<ActivateConnectionRequest, Builder> {
        private String name; 
        private GitAccount account; 
        private OAuthCredential credential; 

        private Builder() {
            super();
        } 

        private Builder(ActivateConnectionRequest request) {
            super(request);
            this.name = request.name;
            this.account = request.account;
            this.credential = request.credential;
        } 

        /**
         * name.
         */
        public Builder name(String name) {
            this.putPathParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * account.
         */
        public Builder account(GitAccount account) {
            this.putBodyParameter("account", account);
            this.account = account;
            return this;
        }

        /**
         * credential.
         */
        public Builder credential(OAuthCredential credential) {
            this.putBodyParameter("credential", credential);
            this.credential = credential;
            return this;
        }

        @Override
        public ActivateConnectionRequest build() {
            return new ActivateConnectionRequest(this);
        } 

    } 

}
