// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SaveSingleTaskForGenerateDomainCertificateRequest} extends {@link RequestModel}
 *
 * <p>SaveSingleTaskForGenerateDomainCertificateRequest</p>
 */
public class SaveSingleTaskForGenerateDomainCertificateRequest extends Request {
    @Query
    @NameInMap("DomainName")
    @Validation(required = true)
    private String domainName;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("UserClientIp")
    private String userClientIp;

    private SaveSingleTaskForGenerateDomainCertificateRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
        this.lang = builder.lang;
        this.userClientIp = builder.userClientIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SaveSingleTaskForGenerateDomainCertificateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return userClientIp
     */
    public String getUserClientIp() {
        return this.userClientIp;
    }

    public static final class Builder extends Request.Builder<SaveSingleTaskForGenerateDomainCertificateRequest, Builder> {
        private String domainName; 
        private String lang; 
        private String userClientIp; 

        private Builder() {
            super();
        } 

        private Builder(SaveSingleTaskForGenerateDomainCertificateRequest request) {
            super(request);
            this.domainName = request.domainName;
            this.lang = request.lang;
            this.userClientIp = request.userClientIp;
        } 

        /**
         * The domain name.
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * The language of the error message to return if the request fails. Valid values:
         * <p>
         * 
         * *   **zh**: Chinese.
         * *   **en**: English.
         * 
         * Default value: **en**.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The IP address of the client.
         */
        public Builder userClientIp(String userClientIp) {
            this.putQueryParameter("UserClientIp", userClientIp);
            this.userClientIp = userClientIp;
            return this;
        }

        @Override
        public SaveSingleTaskForGenerateDomainCertificateRequest build() {
            return new SaveSingleTaskForGenerateDomainCertificateRequest(this);
        } 

    } 

}
