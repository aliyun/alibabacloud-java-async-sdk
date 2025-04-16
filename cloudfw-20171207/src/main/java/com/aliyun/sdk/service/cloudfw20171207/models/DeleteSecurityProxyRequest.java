// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
         * <p>The language of the content within the response. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong> (default): Chinese</li>
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
         * <p>The ID of the NAT firewall.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>proxy-nat00ab412ef93d4275a6b5</p>
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
