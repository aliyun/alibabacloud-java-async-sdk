// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SwitchSecurityProxyRequest} extends {@link RequestModel}
 *
 * <p>SwitchSecurityProxyRequest</p>
 */
public class SwitchSecurityProxyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProxyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String proxyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Switch")
    @com.aliyun.core.annotation.Validation(required = true)
    private String _switch;

    private SwitchSecurityProxyRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.proxyId = builder.proxyId;
        this._switch = builder._switch;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SwitchSecurityProxyRequest create() {
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

    /**
     * @return _switch
     */
    public String get_switch() {
        return this._switch;
    }

    public static final class Builder extends Request.Builder<SwitchSecurityProxyRequest, Builder> {
        private String lang; 
        private String proxyId; 
        private String _switch; 

        private Builder() {
            super();
        } 

        private Builder(SwitchSecurityProxyRequest request) {
            super(request);
            this.lang = request.lang;
            this.proxyId = request.proxyId;
            this._switch = request._switch;
        } 

        /**
         * The language of the content within the request and the response. Valid values:
         * <p>
         * 
         * *   **zh** (default)
         * *   **en**
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The ID of the NAT firewall.
         */
        public Builder proxyId(String proxyId) {
            this.putQueryParameter("ProxyId", proxyId);
            this.proxyId = proxyId;
            return this;
        }

        /**
         * Specifies whether to enable the NAT firewall. Valid values:
         * <p>
         * 
         * *   open: yes
         * *   close: no
         */
        public Builder _switch(String _switch) {
            this.putQueryParameter("Switch", _switch);
            this._switch = _switch;
            return this;
        }

        @Override
        public SwitchSecurityProxyRequest build() {
            return new SwitchSecurityProxyRequest(this);
        } 

    } 

}
