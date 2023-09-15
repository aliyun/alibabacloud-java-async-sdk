// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SaveBatchTaskForModifyingDomainDnsRequest} extends {@link RequestModel}
 *
 * <p>SaveBatchTaskForModifyingDomainDnsRequest</p>
 */
public class SaveBatchTaskForModifyingDomainDnsRequest extends Request {
    @Query
    @NameInMap("AliyunDns")
    @Validation(required = true)
    private Boolean aliyunDns;

    @Query
    @NameInMap("DomainName")
    @Validation(required = true)
    private java.util.List < String > domainName;

    @Query
    @NameInMap("DomainNameServer")
    private java.util.List < String > domainNameServer;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("UserClientIp")
    private String userClientIp;

    private SaveBatchTaskForModifyingDomainDnsRequest(Builder builder) {
        super(builder);
        this.aliyunDns = builder.aliyunDns;
        this.domainName = builder.domainName;
        this.domainNameServer = builder.domainNameServer;
        this.lang = builder.lang;
        this.userClientIp = builder.userClientIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SaveBatchTaskForModifyingDomainDnsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aliyunDns
     */
    public Boolean getAliyunDns() {
        return this.aliyunDns;
    }

    /**
     * @return domainName
     */
    public java.util.List < String > getDomainName() {
        return this.domainName;
    }

    /**
     * @return domainNameServer
     */
    public java.util.List < String > getDomainNameServer() {
        return this.domainNameServer;
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

    public static final class Builder extends Request.Builder<SaveBatchTaskForModifyingDomainDnsRequest, Builder> {
        private Boolean aliyunDns; 
        private java.util.List < String > domainName; 
        private java.util.List < String > domainNameServer; 
        private String lang; 
        private String userClientIp; 

        private Builder() {
            super();
        } 

        private Builder(SaveBatchTaskForModifyingDomainDnsRequest request) {
            super(request);
            this.aliyunDns = request.aliyunDns;
            this.domainName = request.domainName;
            this.domainNameServer = request.domainNameServer;
            this.lang = request.lang;
            this.userClientIp = request.userClientIp;
        } 

        /**
         * AliyunDns.
         */
        public Builder aliyunDns(Boolean aliyunDns) {
            this.putQueryParameter("AliyunDns", aliyunDns);
            this.aliyunDns = aliyunDns;
            return this;
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
         * DomainNameServer.
         */
        public Builder domainNameServer(java.util.List < String > domainNameServer) {
            this.putQueryParameter("DomainNameServer", domainNameServer);
            this.domainNameServer = domainNameServer;
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

        @Override
        public SaveBatchTaskForModifyingDomainDnsRequest build() {
            return new SaveBatchTaskForModifyingDomainDnsRequest(this);
        } 

    } 

}
