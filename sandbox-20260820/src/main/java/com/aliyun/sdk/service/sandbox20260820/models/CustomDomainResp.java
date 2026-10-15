// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sandbox20260820.models;

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
 * {@link CustomDomainResp} extends {@link TeaModel}
 *
 * <p>CustomDomainResp</p>
 */
public class CustomDomainResp extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("certConfig")
    private CertConfig certConfig;

    @com.aliyun.core.annotation.NameInMap("createdAt")
    private Long createdAt;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("domainName")
    private String domainName;

    @com.aliyun.core.annotation.NameInMap("tlsConfig")
    private TLSConfig tlsConfig;

    @com.aliyun.core.annotation.NameInMap("updatedAt")
    private Long updatedAt;

    private CustomDomainResp(Builder builder) {
        this.certConfig = builder.certConfig;
        this.createdAt = builder.createdAt;
        this.description = builder.description;
        this.domainName = builder.domainName;
        this.tlsConfig = builder.tlsConfig;
        this.updatedAt = builder.updatedAt;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CustomDomainResp create() {
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
    public Long getCreatedAt() {
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
     * @return tlsConfig
     */
    public TLSConfig getTlsConfig() {
        return this.tlsConfig;
    }

    /**
     * @return updatedAt
     */
    public Long getUpdatedAt() {
        return this.updatedAt;
    }

    public static final class Builder {
        private CertConfig certConfig; 
        private Long createdAt; 
        private String description; 
        private String domainName; 
        private TLSConfig tlsConfig; 
        private Long updatedAt; 

        private Builder() {
        } 

        private Builder(CustomDomainResp model) {
            this.certConfig = model.certConfig;
            this.createdAt = model.createdAt;
            this.description = model.description;
            this.domainName = model.domainName;
            this.tlsConfig = model.tlsConfig;
            this.updatedAt = model.updatedAt;
        } 

        /**
         * <p>The HTTPS certificate configuration used by the domain name.</p>
         */
        public Builder certConfig(CertConfig certConfig) {
            this.certConfig = certConfig;
            return this;
        }

        /**
         * <p>The time when the domain name was created. The value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1755676800000</p>
         */
        public Builder createdAt(Long createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * <p>The description of the custom domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>Domain name for the sandbox preview environment</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The custom domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>sandbox.example.com</p>
         */
        public Builder domainName(String domainName) {
            this.domainName = domainName;
            return this;
        }

        /**
         * <p>The TLS protocol configuration used by the domain name.</p>
         */
        public Builder tlsConfig(TLSConfig tlsConfig) {
            this.tlsConfig = tlsConfig;
            return this;
        }

        /**
         * <p>The time when the domain name was last updated. The value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1755763200000</p>
         */
        public Builder updatedAt(Long updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        public CustomDomainResp build() {
            return new CustomDomainResp(this);
        } 

    } 

}
