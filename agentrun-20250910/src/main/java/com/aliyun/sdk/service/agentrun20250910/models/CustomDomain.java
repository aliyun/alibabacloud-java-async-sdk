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
 * {@link CustomDomain} extends {@link TeaModel}
 *
 * <p>CustomDomain</p>
 */
public class CustomDomain extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("certConfig")
    private CertConfig certConfig;

    @com.aliyun.core.annotation.NameInMap("createdAt")
    private String createdAt;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("domainName")
    private String domainName;

    @com.aliyun.core.annotation.NameInMap("protocol")
    private String protocol;

    @com.aliyun.core.annotation.NameInMap("routeConfig")
    private RouteConfig routeConfig;

    @com.aliyun.core.annotation.NameInMap("tlsConfig")
    private TLSConfig tlsConfig;

    @com.aliyun.core.annotation.NameInMap("updatedAt")
    private String updatedAt;

    private CustomDomain(Builder builder) {
        this.certConfig = builder.certConfig;
        this.createdAt = builder.createdAt;
        this.description = builder.description;
        this.domainName = builder.domainName;
        this.protocol = builder.protocol;
        this.routeConfig = builder.routeConfig;
        this.tlsConfig = builder.tlsConfig;
        this.updatedAt = builder.updatedAt;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CustomDomain create() {
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
     * @return createdAt
     */
    public String getCreatedAt() {
        return this.createdAt;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
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

    /**
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    public static final class Builder {
        private CertConfig certConfig; 
        private String createdAt; 
        private String description; 
        private String domainName; 
        private String protocol; 
        private RouteConfig routeConfig; 
        private TLSConfig tlsConfig; 
        private String updatedAt; 

        private Builder() {
        } 

        private Builder(CustomDomain model) {
            this.certConfig = model.certConfig;
            this.createdAt = model.createdAt;
            this.description = model.description;
            this.domainName = model.domainName;
            this.protocol = model.protocol;
            this.routeConfig = model.routeConfig;
            this.tlsConfig = model.tlsConfig;
            this.updatedAt = model.updatedAt;
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
         * <p>创建时间</p>
         * 
         * <strong>example:</strong>
         * <p>2025-01-10T10:30:00Z</p>
         */
        public Builder createdAt(String createdAt) {
            this.createdAt = createdAt;
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
         * <p>域名。填写已在阿里云备案或接入备案的自定义域名名称。</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        public Builder domainName(String domainName) {
            this.domainName = domainName;
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

        /**
         * <p>更新时间</p>
         * 
         * <strong>example:</strong>
         * <p>2025-01-10T11:45:00Z</p>
         */
        public Builder updatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        public CustomDomain build() {
            return new CustomDomain(this);
        } 

    } 

}
