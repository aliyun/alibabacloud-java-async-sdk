// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteSecurityProxyRequest} extends {@link RequestModel}
 *
 * <p>DeleteSecurityProxyRequest</p>
 */
public class DeleteSecurityProxyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProxyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String proxyId;

    private DeleteSecurityProxyRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.proxyId = builder.proxyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteSecurityProxyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return proxyId
     */
    public String getProxyId() {
        return this.proxyId;
    }

    public static final class Builder extends Request.Builder<DeleteSecurityProxyRequest, Builder> {
        private String lang; 
        private String proxyId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteSecurityProxyRequest request) {
            super(request);
            this.lang = request.lang;
            this.proxyId = request.proxyId;
        } 

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * ProxyId.
         */
        public Builder proxyId(String proxyId) {
            this.putQueryParameter("ProxyId", proxyId);
            this.proxyId = proxyId;
            return this;
        }

        @Override
        public DeleteSecurityProxyRequest build() {
            return new DeleteSecurityProxyRequest(this);
        } 

    } 

}
