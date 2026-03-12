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
 * {@link QueryFailReasonListRequest} extends {@link RequestModel}
 *
 * <p>QueryFailReasonListRequest</p>
 */
public class QueryFailReasonListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContactTemplateId")
    private Long contactTemplateId;

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

    private QueryFailReasonListRequest(Builder builder) {
        super(builder);
        this.contactTemplateId = builder.contactTemplateId;
        this.domainName = builder.domainName;
        this.lang = builder.lang;
        this.saleId = builder.saleId;
        this.userClientIp = builder.userClientIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryFailReasonListRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return contactTemplateId
     */
    public Long getContactTemplateId() {
        return this.contactTemplateId;
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

    public static final class Builder extends Request.Builder<QueryFailReasonListRequest, Builder> {
        private Long contactTemplateId; 
        private String domainName; 
        private String lang; 
        private String saleId; 
        private String userClientIp; 

        private Builder() {
            super();
        } 

        private Builder(QueryFailReasonListRequest request) {
            super(request);
            this.contactTemplateId = request.contactTemplateId;
            this.domainName = request.domainName;
            this.lang = request.lang;
            this.saleId = request.saleId;
            this.userClientIp = request.userClientIp;
        } 

        /**
         * ContactTemplateId.
         */
        public Builder contactTemplateId(Long contactTemplateId) {
            this.putQueryParameter("ContactTemplateId", contactTemplateId);
            this.contactTemplateId = contactTemplateId;
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
        public QueryFailReasonListRequest build() {
            return new QueryFailReasonListRequest(this);
        } 

    } 

}
