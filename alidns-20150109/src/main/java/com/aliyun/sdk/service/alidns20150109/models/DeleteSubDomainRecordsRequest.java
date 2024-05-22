// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteSubDomainRecordsRequest} extends {@link RequestModel}
 *
 * <p>DeleteSubDomainRecordsRequest</p>
 */
public class DeleteSubDomainRecordsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RR")
    @com.aliyun.core.annotation.Validation(required = true)
    private String rr;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserClientIp")
    private String userClientIp;

    private DeleteSubDomainRecordsRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
        this.lang = builder.lang;
        this.rr = builder.rr;
        this.type = builder.type;
        this.userClientIp = builder.userClientIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteSubDomainRecordsRequest create() {
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
     * @return rr
     */
    public String getRr() {
        return this.rr;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return userClientIp
     */
    public String getUserClientIp() {
        return this.userClientIp;
    }

    public static final class Builder extends Request.Builder<DeleteSubDomainRecordsRequest, Builder> {
        private String domainName; 
        private String lang; 
        private String rr; 
        private String type; 
        private String userClientIp; 

        private Builder() {
            super();
        } 

        private Builder(DeleteSubDomainRecordsRequest request) {
            super(request);
            this.domainName = request.domainName;
            this.lang = request.lang;
            this.rr = request.rr;
            this.type = request.type;
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
         * The language type.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The host record.
         * <p>
         * 
         * For example, to resolve @.example.com, you must set RR to an at sign (@) instead of leaving it blank.
         */
        public Builder rr(String rr) {
            this.putQueryParameter("RR", rr);
            this.rr = rr;
            return this;
        }

        /**
         * The type of the DNS record. If you do not specify this parameter, all DNS record types corresponding to the subdomain name are returned.
         * <p>
         * 
         * DNS record types include **A, MX, CNAME, TXT, REDIRECT_URL, FORWORD_URL, NS, AAAA, and SRV**. The value is not case-sensitive.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
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
        public DeleteSubDomainRecordsRequest build() {
            return new DeleteSubDomainRecordsRequest(this);
        } 

    } 

}
