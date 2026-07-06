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
         * certConfig.
         */
        public Builder certConfig(CertConfig certConfig) {
            this.certConfig = certConfig;
            return this;
        }

        /**
         * createdAt.
         */
        public Builder createdAt(Long createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * domainName.
         */
        public Builder domainName(String domainName) {
            this.domainName = domainName;
            return this;
        }

        /**
         * tlsConfig.
         */
        public Builder tlsConfig(TLSConfig tlsConfig) {
            this.tlsConfig = tlsConfig;
            return this;
        }

        /**
         * updatedAt.
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
