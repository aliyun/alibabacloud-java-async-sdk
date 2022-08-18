// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetDomainDnssecStatusRequest} extends {@link RequestModel}
 *
 * <p>SetDomainDnssecStatusRequest</p>
 */
public class SetDomainDnssecStatusRequest extends Request {
    @Query
    @NameInMap("DomainName")
    @Validation(required = true)
    private String domainName;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("Status")
    @Validation(required = true)
    private String status;

    private SetDomainDnssecStatusRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
        this.lang = builder.lang;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetDomainDnssecStatusRequest create() {
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
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<SetDomainDnssecStatusRequest, Builder> {
        private String domainName; 
        private String lang; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(SetDomainDnssecStatusRequest request) {
            super(request);
            this.domainName = request.domainName;
            this.lang = request.lang;
            this.status = request.status;
        } 

        /**
         * DomainName.
         */
        public Builder domainName(String domainName) {
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
         * Status.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public SetDomainDnssecStatusRequest build() {
            return new SetDomainDnssecStatusRequest(this);
        } 

    } 

}
