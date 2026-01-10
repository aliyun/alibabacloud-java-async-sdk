// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentrun20250910.models;

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
 * {@link UpdateCustomDomainInput} extends {@link TeaModel}
 *
 * <p>UpdateCustomDomainInput</p>
 */
public class UpdateCustomDomainInput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("certConfig")
    private CertConfig certConfig;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("protocol")
    private String protocol;

    @com.aliyun.core.annotation.NameInMap("routeConfig")
    private RouteConfig routeConfig;

    @com.aliyun.core.annotation.NameInMap("tlsConfig")
    private TLSConfig tlsConfig;

    private UpdateCustomDomainInput(Builder builder) {
        this.certConfig = builder.certConfig;
        this.description = builder.description;
        this.protocol = builder.protocol;
        this.routeConfig = builder.routeConfig;
        this.tlsConfig = builder.tlsConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateCustomDomainInput create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return certConfig
     */
    public CertConfig getCertConfig() {
        return this.certConfig;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return protocol
     */
    public String getProtocol() {
        return this.protocol;
    }

    /**
     * @return routeConfig
     */
    public RouteConfig getRouteConfig() {
        return this.routeConfig;
    }

    /**
     * @return tlsConfig
     */
    public TLSConfig getTlsConfig() {
        return this.tlsConfig;
    }

    public static final class Builder {
        private CertConfig certConfig; 
        private String description; 
        private String protocol; 
        private RouteConfig routeConfig; 
        private TLSConfig tlsConfig; 

        private Builder() {
        } 

        private Builder(UpdateCustomDomainInput model) {
            this.certConfig = model.certConfig;
            this.description = model.description;
            this.protocol = model.protocol;
            this.routeConfig = model.routeConfig;
            this.tlsConfig = model.tlsConfig;
        } 

        /**
         * <p>HTTPS 证书的信息。</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder certConfig(CertConfig certConfig) {
            this.certConfig = certConfig;
            return this;
        }

        /**
         * <p>描述</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>域名支持的协议类型：● HTTP：仅支持 HTTP 协议。● HTTPS：仅支持 HTTPS 协议。● HTTP,HTTPS：支持 HTTP 及 HTTPS 协议。</p>
         * 
         * <strong>example:</strong>
         * <p>HTTP</p>
         */
        public Builder protocol(String protocol) {
            this.protocol = protocol;
            return this;
        }

        /**
         * <p>路由表：自定义域名访问时的 PATH 到 资源 的映射。</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder routeConfig(RouteConfig routeConfig) {
            this.routeConfig = routeConfig;
            return this;
        }

        /**
         * <p>TLS 配置信息。</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder tlsConfig(TLSConfig tlsConfig) {
            this.tlsConfig = tlsConfig;
            return this;
        }

        public UpdateCustomDomainInput build() {
            return new UpdateCustomDomainInput(this);
        } 

    } 

}
