// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRecordStatisticsRequest} extends {@link RequestModel}
 *
 * <p>DescribeRecordStatisticsRequest</p>
 */
public class DescribeRecordStatisticsRequest extends Request {
    @Query
    @NameInMap("DomainName")
    @Validation(required = true)
    private String domainName;

    @Query
    @NameInMap("DomainType")
    private String domainType;

    @Query
    @NameInMap("EndDate")
    private String endDate;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("Rr")
    @Validation(required = true)
    private String rr;

    @Query
    @NameInMap("StartDate")
    @Validation(required = true)
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

        private Builder(DescribeRecordStatisticsRequest response) {
            super(response);
            this.domainName = response.domainName;
            this.domainType = response.domainType;
            this.endDate = response.endDate;
            this.lang = response.lang;
            this.rr = response.rr;
            this.startDate = response.startDate;
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
         * DomainType.
         */
        public Builder domainType(String domainType) {
            this.putQueryParameter("DomainType", domainType);
            this.domainType = domainType;
            return this;
        }

        /**
         * EndDate.
         */
        public Builder endDate(String endDate) {
            this.putQueryParameter("EndDate", endDate);
            this.endDate = endDate;
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
         * Rr.
         */
        public Builder rr(String rr) {
            this.putQueryParameter("Rr", rr);
            this.rr = rr;
            return this;
        }

        /**
         * StartDate.
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
