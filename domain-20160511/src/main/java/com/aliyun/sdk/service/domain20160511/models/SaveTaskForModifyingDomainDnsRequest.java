// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20160511.models;

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
 * {@link SaveTaskForModifyingDomainDnsRequest} extends {@link RequestModel}
 *
 * <p>SaveTaskForModifyingDomainDnsRequest</p>
 */
public class SaveTaskForModifyingDomainDnsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AliyunDns")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean aliyunDns;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DnsList")
    private java.util.List<String> dnsList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SaleId")
    private String saleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserClientIp")
    private String userClientIp;

    private SaveTaskForModifyingDomainDnsRequest(Builder builder) {
        super(builder);
        this.aliyunDns = builder.aliyunDns;
        this.dnsList = builder.dnsList;
        this.domainName = builder.domainName;
        this.lang = builder.lang;
        this.saleId = builder.saleId;
        this.userClientIp = builder.userClientIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SaveTaskForModifyingDomainDnsRequest create() {
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
     * @return dnsList
     */
    public java.util.List<String> getDnsList() {
        return this.dnsList;
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
     * @return saleId
     */
    public String getSaleId() {
        return this.saleId;
    }

    /**
     * @return userClientIp
     */
    public String getUserClientIp() {
        return this.userClientIp;
    }

    public static final class Builder extends Request.Builder<SaveTaskForModifyingDomainDnsRequest, Builder> {
        private Boolean aliyunDns; 
        private java.util.List<String> dnsList; 
        private String domainName; 
        private String lang; 
        private String saleId; 
        private String userClientIp; 

        private Builder() {
            super();
        } 

        private Builder(SaveTaskForModifyingDomainDnsRequest request) {
            super(request);
            this.aliyunDns = request.aliyunDns;
            this.dnsList = request.dnsList;
            this.domainName = request.domainName;
            this.lang = request.lang;
            this.saleId = request.saleId;
            this.userClientIp = request.userClientIp;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder aliyunDns(Boolean aliyunDns) {
            this.putQueryParameter("AliyunDns", aliyunDns);
            this.aliyunDns = aliyunDns;
            return this;
        }

        /**
         * DnsList.
         */
        public Builder dnsList(java.util.List<String> dnsList) {
            this.putQueryParameter("DnsList", dnsList);
            this.dnsList = dnsList;
            return this;
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
         * SaleId.
         */
        public Builder saleId(String saleId) {
            this.putQueryParameter("SaleId", saleId);
            this.saleId = saleId;
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
        public SaveTaskForModifyingDomainDnsRequest build() {
            return new SaveTaskForModifyingDomainDnsRequest(this);
        } 

    } 

}
