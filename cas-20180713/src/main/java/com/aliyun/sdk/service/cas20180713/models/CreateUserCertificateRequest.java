// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20180713.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateUserCertificateRequest} extends {@link RequestModel}
 *
 * <p>CreateUserCertificateRequest</p>
 */
public class CreateUserCertificateRequest extends Request {
    @Query
    @NameInMap("Cert")
    @Validation(required = true)
    private String cert;

    @Query
    @NameInMap("Key")
    @Validation(required = true)
    private String key;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Query
    @NameInMap("SourceIp")
    private String sourceIp;

    private CreateUserCertificateRequest(Builder builder) {
        super(builder);
        this.cert = builder.cert;
        this.key = builder.key;
        this.lang = builder.lang;
        this.name = builder.name;
        this.sourceIp = builder.sourceIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateUserCertificateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cert
     */
    public String getCert() {
        return this.cert;
    }

    /**
     * @return key
     */
    public String getKey() {
        return this.key;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    public static final class Builder extends Request.Builder<CreateUserCertificateRequest, Builder> {
        private String cert; 
        private String key; 
        private String lang; 
        private String name; 
        private String sourceIp; 

        private Builder() {
            super();
        } 

        private Builder(CreateUserCertificateRequest response) {
            super(response);
            this.cert = response.cert;
            this.key = response.key;
            this.lang = response.lang;
            this.name = response.name;
            this.sourceIp = response.sourceIp;
        } 

        /**
         * Cert.
         */
        public Builder cert(String cert) {
            this.putQueryParameter("Cert", cert);
            this.cert = cert;
            return this;
        }

        /**
         * Key.
         */
        public Builder key(String key) {
            this.putQueryParameter("Key", key);
            this.key = key;
            return this;
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
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * SourceIp.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        @Override
        public CreateUserCertificateRequest build() {
            return new CreateUserCertificateRequest(this);
        } 

    } 

}
