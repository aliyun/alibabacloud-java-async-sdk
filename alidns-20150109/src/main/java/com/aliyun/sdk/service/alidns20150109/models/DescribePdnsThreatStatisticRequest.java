// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePdnsThreatStatisticRequest} extends {@link RequestModel}
 *
 * <p>DescribePdnsThreatStatisticRequest</p>
 */
public class DescribePdnsThreatStatisticRequest extends Request {
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
    @NameInMap("ThreatSourceIp")
    private String threatSourceIp;

    private DescribePdnsThreatStatisticRequest(Builder builder) {
        super(builder);
        this.endDate = builder.endDate;
        this.lang = builder.lang;
        this.startDate = builder.startDate;
        this.threatSourceIp = builder.threatSourceIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePdnsThreatStatisticRequest create() {
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
     * @return threatSourceIp
     */
    public String getThreatSourceIp() {
        return this.threatSourceIp;
    }

    public static final class Builder extends Request.Builder<DescribePdnsThreatStatisticRequest, Builder> {
        private String endDate; 
        private String lang; 
        private String startDate; 
        private String threatSourceIp; 

        private Builder() {
            super();
        } 

        private Builder(DescribePdnsThreatStatisticRequest response) {
            super(response);
            this.endDate = response.endDate;
            this.lang = response.lang;
            this.startDate = response.startDate;
            this.threatSourceIp = response.threatSourceIp;
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
         * ThreatSourceIp.
         */
        public Builder threatSourceIp(String threatSourceIp) {
            this.putQueryParameter("ThreatSourceIp", threatSourceIp);
            this.threatSourceIp = threatSourceIp;
            return this;
        }

        @Override
        public DescribePdnsThreatStatisticRequest build() {
            return new DescribePdnsThreatStatisticRequest(this);
        } 

    } 

}
