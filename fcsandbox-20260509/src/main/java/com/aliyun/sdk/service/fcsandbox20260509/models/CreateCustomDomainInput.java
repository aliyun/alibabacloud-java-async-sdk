// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fcsandbox20260509.models;

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
 * {@link CreateCustomDomainInput} extends {@link TeaModel}
 *
 * <p>CreateCustomDomainInput</p>
 */
public class CreateCustomDomainInput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("certConfig")
    private CertConfig certConfig;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("domainName")
    private String domainName;

    @com.aliyun.core.annotation.NameInMap("tlsConfig")
    private TLSConfig tlsConfig;

    private CreateCustomDomainInput(Builder builder) {
        this.certConfig = builder.certConfig;
        this.description = builder.description;
        this.domainName = builder.domainName;
        this.tlsConfig = builder.tlsConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCustomDomainInput create() {
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

    public static final class Builder {
        private CertConfig certConfig; 
        private String description; 
        private String domainName; 
        private TLSConfig tlsConfig; 

        private Builder() {
        } 

        private Builder(CreateCustomDomainInput model) {
            this.certConfig = model.certConfig;
            this.description = model.description;
            this.domainName = model.domainName;
            this.tlsConfig = model.tlsConfig;
        } 

        /**
         * <p>The certificate configuration for the domain name.</p>
         */
        public Builder certConfig(CertConfig certConfig) {
            this.certConfig = certConfig;
            return this;
        }

        /**
         * <p>The description of the custom domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>生产环境云沙箱自定义域名</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The custom domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>api.example.com</p>
         */
        public Builder domainName(String domainName) {
            this.domainName = domainName;
            return this;
        }

        /**
         * <p>The TLS configuration for the domain name.</p>
         */
        public Builder tlsConfig(TLSConfig tlsConfig) {
            this.tlsConfig = tlsConfig;
            return this;
        }

        public CreateCustomDomainInput build() {
            return new CreateCustomDomainInput(this);
        } 

    } 

}
