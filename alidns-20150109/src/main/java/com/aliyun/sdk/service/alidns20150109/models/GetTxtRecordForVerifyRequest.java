// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTxtRecordForVerifyRequest} extends {@link RequestModel}
 *
 * <p>GetTxtRecordForVerifyRequest</p>
 */
public class GetTxtRecordForVerifyRequest extends Request {
    @Query
    @NameInMap("DomainName")
    private String domainName;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("Type")
    @Validation(required = true)
    private String type;

    private GetTxtRecordForVerifyRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
        this.lang = builder.lang;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTxtRecordForVerifyRequest create() {
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
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<GetTxtRecordForVerifyRequest, Builder> {
        private String domainName; 
        private String lang; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(GetTxtRecordForVerifyRequest request) {
            super(request);
            this.domainName = request.domainName;
            this.lang = request.lang;
            this.type = request.type;
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
         * The language.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The feature verified by using the TXT record. Valid values:
         * <p>
         * 
         * *   ADD_SUB_DOMAIN
         * *   RETRIEVAL
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public GetTxtRecordForVerifyRequest build() {
            return new GetTxtRecordForVerifyRequest(this);
        } 

    } 

}
