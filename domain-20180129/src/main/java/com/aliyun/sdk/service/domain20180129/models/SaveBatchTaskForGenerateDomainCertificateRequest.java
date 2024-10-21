// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SaveBatchTaskForGenerateDomainCertificateRequest} extends {@link RequestModel}
 *
 * <p>SaveBatchTaskForGenerateDomainCertificateRequest</p>
 */
public class SaveBatchTaskForGenerateDomainCertificateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainNames")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < String > domainNames;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserClientIp")
    private String userClientIp;

    private SaveBatchTaskForGenerateDomainCertificateRequest(Builder builder) {
        super(builder);
        this.domainNames = builder.domainNames;
        this.lang = builder.lang;
        this.userClientIp = builder.userClientIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SaveBatchTaskForGenerateDomainCertificateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainNames
     */
    public java.util.List < String > getDomainNames() {
        return this.domainNames;
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

    public static final class Builder extends Request.Builder<SaveBatchTaskForGenerateDomainCertificateRequest, Builder> {
        private java.util.List < String > domainNames; 
        private String lang; 
        private String userClientIp; 

        private Builder() {
            super();
        } 

        private Builder(SaveBatchTaskForGenerateDomainCertificateRequest request) {
            super(request);
            this.domainNames = request.domainNames;
            this.lang = request.lang;
            this.userClientIp = request.userClientIp;
        } 

        /**
         * <p>The domain names.</p>
         * <p>This parameter is required.</p>
         */
        public Builder domainNames(java.util.List < String > domainNames) {
            String domainNamesShrink = shrink(domainNames, "DomainNames", "json");
            this.putQueryParameter("DomainNames", domainNamesShrink);
            this.domainNames = domainNames;
            return this;
        }

        /**
         * <p>The language of the error message to return if the request fails. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese.</li>
         * <li><strong>en</strong>: English.</li>
         * </ul>
         * <p>Default value: <strong>en</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>en</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The IP address of the client.</p>
         * 
         * <strong>example:</strong>
         * <p>127.0.0.1</p>
         */
        public Builder userClientIp(String userClientIp) {
            this.putQueryParameter("UserClientIp", userClientIp);
            this.userClientIp = userClientIp;
            return this;
        }

        @Override
        public SaveBatchTaskForGenerateDomainCertificateRequest build() {
            return new SaveBatchTaskForGenerateDomainCertificateRequest(this);
        } 

    } 

}
