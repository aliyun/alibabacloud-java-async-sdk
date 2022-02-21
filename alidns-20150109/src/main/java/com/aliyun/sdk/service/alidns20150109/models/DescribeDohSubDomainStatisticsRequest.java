// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDohSubDomainStatisticsRequest} extends {@link RequestModel}
 *
 * <p>DescribeDohSubDomainStatisticsRequest</p>
 */
public class DescribeDohSubDomainStatisticsRequest extends Request {
    @Query
    @NameInMap("EndDate")
    private String endDate;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("StartDate")
    private String startDate;

    @Query
    @NameInMap("SubDomain")
    @Validation(required = true)
    private String subDomain;

    private DescribeDohSubDomainStatisticsRequest(Builder builder) {
        super(builder);
        this.endDate = builder.endDate;
        this.lang = builder.lang;
        this.startDate = builder.startDate;
        this.subDomain = builder.subDomain;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDohSubDomainStatisticsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Request.Builder<DescribeDohSubDomainStatisticsRequest, Builder> {
        private String endDate; 
        private String lang; 
        private String startDate; 
        private String subDomain; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDohSubDomainStatisticsRequest response) {
            super(response);
            this.endDate = response.endDate;
            this.lang = response.lang;
            this.startDate = response.startDate;
            this.subDomain = response.subDomain;
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
         * StartDate.
         */
        public Builder startDate(String startDate) {
            this.putQueryParameter("StartDate", startDate);
            this.startDate = startDate;
            return this;
        }

        /**
         * SubDomain.
         */
        public Builder subDomain(String subDomain) {
            this.putQueryParameter("SubDomain", subDomain);
            this.subDomain = subDomain;
            return this;
        }

        @Override
        public DescribeDohSubDomainStatisticsRequest build() {
            return new DescribeDohSubDomainStatisticsRequest(this);
        } 

    } 

}
