// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeRecordStatisticsRequest} extends {@link RequestModel}
 *
 * <p>DescribeRecordStatisticsRequest</p>
 */
public class DescribeRecordStatisticsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    @com.aliyun.core.annotation.Validation(required = true)
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
    @com.aliyun.core.annotation.NameInMap("Rr")
    @com.aliyun.core.annotation.Validation(required = true)
    private String rr;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartDate")
    @com.aliyun.core.annotation.Validation(required = true)
    private String startDate;

    private DescribeRecordStatisticsRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
        this.domainType = builder.domainType;
        this.endDate = builder.endDate;
        this.lang = builder.lang;
        this.rr = builder.rr;
        this.startDate = builder.startDate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRecordStatisticsRequest create() {
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
     * @return rr
     */
    public String getRr() {
        return this.rr;
    }

    /**
     * @return startDate
     */
    public String getStartDate() {
        return this.startDate;
    }

    public static final class Builder extends Request.Builder<DescribeRecordStatisticsRequest, Builder> {
        private String domainName; 
        private String domainType; 
        private String endDate; 
        private String lang; 
        private String rr; 
        private String startDate; 

        private Builder() {
            super();
        } 

        private Builder(DescribeRecordStatisticsRequest request) {
            super(request);
            this.domainName = request.domainName;
            this.domainType = request.domainType;
            this.endDate = request.endDate;
            this.lang = request.lang;
            this.rr = request.rr;
            this.startDate = request.startDate;
        } 

        /**
         * <p>The primary domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>dns-example.com</p>
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * <p>The type of the domain name. The parameter value is not case-sensitive. Valid values:</p>
         * <ul>
         * <li>PUBLIC (default): hosted public domain name</li>
         * <li>CACHE: cache-accelerated domain name</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PUBLIC</p>
         */
        public Builder domainType(String domainType) {
            this.putQueryParameter("DomainType", domainType);
            this.domainType = domainType;
            return this;
        }

        /**
         * <p>The end date of the query. Specify the end date in the <strong>YYYY-MM-DD</strong> format.</p>
         * <p>The default value is the day when you query the data.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-07-04</p>
         */
        public Builder endDate(String endDate) {
            this.putQueryParameter("EndDate", endDate);
            this.endDate = endDate;
            return this;
        }

        /**
         * <p>The language.</p>
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
         * <p>The hostname. If you want to resolve <a href="http://www.dns-exmaple.top">www.dns-exmaple.top</a>, set Rr to www.</p>
         * 
         * <strong>example:</strong>
         * <p>www</p>
         */
        public Builder rr(String rr) {
            this.putQueryParameter("Rr", rr);
            this.rr = rr;
            return this;
        }

        /**
         * <p>The start date of the query. Specify the start date in the <strong>YYYY-MM-DD</strong> format.</p>
         * <p>You can only query the DNS records within the last 90 days.``</p>
         * <p>If the time range is less than or equal to seven days, data is returned on an hourly basis.````</p>
         * <p>If the time range is greater than seven days, data is returned on a daily basis.````</p>
         * 
         * <strong>example:</strong>
         * <p>2019-07-04</p>
         */
        public Builder startDate(String startDate) {
            this.putQueryParameter("StartDate", startDate);
            this.startDate = startDate;
            return this;
        }

        @Override
        public DescribeRecordStatisticsRequest build() {
            return new DescribeRecordStatisticsRequest(this);
        } 

    } 

}
