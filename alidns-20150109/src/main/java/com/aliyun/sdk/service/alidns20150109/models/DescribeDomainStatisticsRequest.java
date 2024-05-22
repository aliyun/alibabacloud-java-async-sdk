// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDomainStatisticsRequest} extends {@link RequestModel}
 *
 * <p>DescribeDomainStatisticsRequest</p>
 */
public class DescribeDomainStatisticsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainType")
    private String domainType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndDate")
    private String endDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartDate")
    @com.aliyun.core.annotation.Validation(required = true)
    private String startDate;

    private DescribeDomainStatisticsRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
        this.domainType = builder.domainType;
        this.endDate = builder.endDate;
        this.lang = builder.lang;
        this.startDate = builder.startDate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDomainStatisticsRequest create() {
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
     * @return domainType
     */
    public String getDomainType() {
        return this.domainType;
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

    public static final class Builder extends Request.Builder<DescribeDomainStatisticsRequest, Builder> {
        private String domainName; 
        private String domainType; 
        private String endDate; 
        private String lang; 
        private String startDate; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDomainStatisticsRequest request) {
            super(request);
            this.domainName = request.domainName;
            this.domainType = request.domainType;
            this.endDate = request.endDate;
            this.lang = request.lang;
            this.startDate = request.startDate;
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
         * The type of the domain name. Valid values:
         * <p>
         * 
         * *   PUBLIC (default): hosted public domain name
         * *   CACHE: cached public domain name
         */
        public Builder domainType(String domainType) {
            this.putQueryParameter("DomainType", domainType);
            this.domainType = domainType;
            return this;
        }

        /**
         * The end date of the query. Specify the end date in the **YYYY-MM-DD** format.
         * <p>
         * 
         * The default value is the day when you query the data.
         */
        public Builder endDate(String endDate) {
            this.putQueryParameter("EndDate", endDate);
            this.endDate = endDate;
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
         * The start date of the query. Specify the start date in the **YYYY-MM-DD** format.
         * <p>
         * 
         * You can only query the DNS records within the last 90 days.``
         */
        public Builder startDate(String startDate) {
            this.putQueryParameter("StartDate", startDate);
            this.startDate = startDate;
            return this;
        }

        @Override
        public DescribeDomainStatisticsRequest build() {
            return new DescribeDomainStatisticsRequest(this);
        } 

    } 

}
