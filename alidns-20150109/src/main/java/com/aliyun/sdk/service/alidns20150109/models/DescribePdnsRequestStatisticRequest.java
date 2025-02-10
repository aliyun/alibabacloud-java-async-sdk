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
 * {@link DescribePdnsRequestStatisticRequest} extends {@link RequestModel}
 *
 * <p>DescribePdnsRequestStatisticRequest</p>
 */
public class DescribePdnsRequestStatisticRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndDate")
    private String endDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartDate")
    private String startDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubDomain")
    private String subDomain;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private DescribePdnsRequestStatisticRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
        this.endDate = builder.endDate;
        this.lang = builder.lang;
        this.startDate = builder.startDate;
        this.subDomain = builder.subDomain;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePdnsRequestStatisticRequest create() {
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
     * @return endDate
     */
    public String getEndDate() {
        return this.endDate;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return startDate
     */
    public String getStartDate() {
        return this.startDate;
    }

    /**
     * @return subDomain
     */
    public String getSubDomain() {
        return this.subDomain;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<DescribePdnsRequestStatisticRequest, Builder> {
        private String domainName; 
        private String endDate; 
        private String lang; 
        private String startDate; 
        private String subDomain; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(DescribePdnsRequestStatisticRequest request) {
            super(request);
            this.domainName = request.domainName;
            this.endDate = request.endDate;
            this.lang = request.lang;
            this.startDate = request.startDate;
            this.subDomain = request.subDomain;
            this.type = request.type;
        } 

        /**
         * <p>The primary domain name whose statistics you want to query.</p>
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
         * <p>The end of the time range to query. Specify the time in the <strong>YYYY-MM-DD</strong> format.</p>
         * <p>The default value is the day when you query the data.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-7-1 00:00:00</p>
         */
        public Builder endDate(String endDate) {
            this.putQueryParameter("EndDate", endDate);
            this.endDate = endDate;
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
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The beginning of the time range to query. Specify the time in the <strong>YYYY-MM-DD</strong> format.</p>
         * <p>You can query only records of the last 90 days.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-06-14 00:00:00</p>
         */
        public Builder startDate(String startDate) {
            this.putQueryParameter("StartDate", startDate);
            this.startDate = startDate;
            return this;
        }

        /**
         * <p>The subdomain name whose statistics you want to query.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.example.com">www.example.com</a></p>
         */
        public Builder subDomain(String subDomain) {
            this.putQueryParameter("SubDomain", subDomain);
            this.subDomain = subDomain;
            return this;
        }

        /**
         * <p>The type of the request statistics that you want to query. Valid values:</p>
         * <ul>
         * <li><strong>ACCOUNT</strong>: queries the request statistics by account.</li>
         * <li><strong>DOMAIN</strong>: queries the request statistics by domain name.</li>
         * <li><strong>SUB_DOMAIN</strong>: queries the request statistics by subdomain name.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ACCOUNT</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public DescribePdnsRequestStatisticRequest build() {
            return new DescribePdnsRequestStatisticRequest(this);
        } 

    } 

}
