// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

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
 * {@link GetTxtRecordForVerifyRequest} extends {@link RequestModel}
 *
 * <p>GetTxtRecordForVerifyRequest</p>
 */
public class GetTxtRecordForVerifyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The ID of the Domain Name System (DNS) record. You can call the <a href="https://www.alibabacloud.com/help/zh/dns/api-alidns-2015-01-09-describedomainrecords?spm=a2c63.p38356.help-menu-search-29697.d_0">DescribeDomainRecords</a> operation to obtain the ID.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * <p>The language of the content within the request and response. Default value: <strong>zh</strong>. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese</li>
         * <li><strong>en</strong>: English</li>
         * </ul>
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
         * <p>The feature verified by using the TXT record. Valid values:</p>
         * <ul>
         * <li>ADD_SUB_DOMAIN: add a subdomain for verification.</li>
         * <li>RETRIEVAL: add other subdomains for verification</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ADD_SUB_DOMAIN</p>
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
