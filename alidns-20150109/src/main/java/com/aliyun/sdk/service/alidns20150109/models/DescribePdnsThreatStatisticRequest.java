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
 * {@link DescribePdnsThreatStatisticRequest} extends {@link RequestModel}
 *
 * <p>DescribePdnsThreatStatisticRequest</p>
 */
public class DescribePdnsThreatStatisticRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("ThreatSourceIp")
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

        private Builder(DescribePdnsThreatStatisticRequest request) {
            super(request);
            this.endDate = request.endDate;
            this.lang = request.lang;
            this.startDate = request.startDate;
            this.threatSourceIp = request.threatSourceIp;
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
