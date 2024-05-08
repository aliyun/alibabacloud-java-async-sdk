// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePluginSchemasRequest} extends {@link RequestModel}
 *
 * <p>DescribePluginSchemasRequest</p>
 */
public class DescribePluginSchemasRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Language")
    private String language;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityToken")
    private String securityToken;

    private DescribePluginSchemasRequest(Builder builder) {
        super(builder);
        this.language = builder.language;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePluginSchemasRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return language
     */
    public String getLanguage() {
        return this.language;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    public static final class Builder extends Request.Builder<DescribePluginSchemasRequest, Builder> {
        private String language; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(DescribePluginSchemasRequest request) {
            super(request);
            this.language = request.language;
            this.securityToken = request.securityToken;
        } 

        /**
         * Language.
         */
        public Builder language(String language) {
            this.putQueryParameter("Language", language);
            this.language = language;
            return this;
        }

        /**
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        @Override
        public DescribePluginSchemasRequest build() {
            return new DescribePluginSchemasRequest(this);
        } 

    } 

}
