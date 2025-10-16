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
 * {@link UpdateSecurityProxyRequest} extends {@link RequestModel}
 *
 * <p>UpdateSecurityProxyRequest</p>
 */
public class UpdateSecurityProxyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProxyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String proxyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProxyName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String proxyName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StrictMode")
    private Integer strictMode;

    private UpdateSecurityProxyRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.proxyId = builder.proxyId;
        this.proxyName = builder.proxyName;
        this.strictMode = builder.strictMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateSecurityProxyRequest create() {
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
     * @return proxyName
     */
    public String getProxyName() {
        return this.proxyName;
    }

    /**
     * @return strictMode
     */
    public Integer getStrictMode() {
        return this.strictMode;
    }

    public static final class Builder extends Request.Builder<UpdateSecurityProxyRequest, Builder> {
        private String lang; 
        private String proxyId; 
        private String proxyName; 
        private Integer strictMode; 

        private Builder() {
            super();
        } 

        private Builder(UpdateSecurityProxyRequest request) {
            super(request);
            this.lang = request.lang;
            this.proxyId = request.proxyId;
            this.proxyName = request.proxyName;
            this.strictMode = request.strictMode;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>proxy-natfdc73073e031****8e0d</p>
         */
        public Builder proxyId(String proxyId) {
            this.putQueryParameter("ProxyId", proxyId);
            this.proxyId = proxyId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>proxy_auto_heyuan</p>
         */
        public Builder proxyName(String proxyName) {
            this.putQueryParameter("ProxyName", proxyName);
            this.proxyName = proxyName;
            return this;
        }

        /**
         * StrictMode.
         */
        public Builder strictMode(Integer strictMode) {
            this.putQueryParameter("StrictMode", strictMode);
            this.strictMode = strictMode;
            return this;
        }

        @Override
        public UpdateSecurityProxyRequest build() {
            return new UpdateSecurityProxyRequest(this);
        } 

    } 

}
