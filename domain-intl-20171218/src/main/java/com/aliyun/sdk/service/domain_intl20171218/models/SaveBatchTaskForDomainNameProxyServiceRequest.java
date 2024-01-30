// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain_intl20171218.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SaveBatchTaskForDomainNameProxyServiceRequest} extends {@link RequestModel}
 *
 * <p>SaveBatchTaskForDomainNameProxyServiceRequest</p>
 */
public class SaveBatchTaskForDomainNameProxyServiceRequest extends Request {
    @Query
    @NameInMap("DomainName")
    @Validation(required = true)
    private java.util.List < String > domainName;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("UserClientIp")
    private String userClientIp;

    @Query
    @NameInMap("status")
    @Validation(required = true)
    private Boolean status;

    private SaveBatchTaskForDomainNameProxyServiceRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
        this.lang = builder.lang;
        this.userClientIp = builder.userClientIp;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SaveBatchTaskForDomainNameProxyServiceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainName
     */
    public java.util.List < String > getDomainName() {
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

    /**
     * @return status
     */
    public Boolean getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<SaveBatchTaskForDomainNameProxyServiceRequest, Builder> {
        private java.util.List < String > domainName; 
        private String lang; 
        private String userClientIp; 
        private Boolean status; 

        private Builder() {
            super();
        } 

        private Builder(SaveBatchTaskForDomainNameProxyServiceRequest request) {
            super(request);
            this.domainName = request.domainName;
            this.lang = request.lang;
            this.userClientIp = request.userClientIp;
            this.status = request.status;
        } 

        /**
         * DomainName.
         */
        public Builder domainName(java.util.List < String > domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
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
         * UserClientIp.
         */
        public Builder userClientIp(String userClientIp) {
            this.putQueryParameter("UserClientIp", userClientIp);
            this.userClientIp = userClientIp;
            return this;
        }

        /**
         * status.
         */
        public Builder status(Boolean status) {
            this.putQueryParameter("status", status);
            this.status = status;
            return this;
        }

        @Override
        public SaveBatchTaskForDomainNameProxyServiceRequest build() {
            return new SaveBatchTaskForDomainNameProxyServiceRequest(this);
        } 

    } 

}
