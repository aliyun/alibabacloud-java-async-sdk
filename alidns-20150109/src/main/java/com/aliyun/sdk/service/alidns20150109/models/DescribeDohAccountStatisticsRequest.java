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
 * {@link DescribeDohAccountStatisticsRequest} extends {@link RequestModel}
 *
 * <p>DescribeDohAccountStatisticsRequest</p>
 */
public class DescribeDohAccountStatisticsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndDate")
    private String endDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartDate")
    private String startDate;

    private DescribeDohAccountStatisticsRequest(Builder builder) {
        super(builder);
        this.endDate = builder.endDate;
        this.lang = builder.lang;
        this.startDate = builder.startDate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDohAccountStatisticsRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeDohAccountStatisticsRequest, Builder> {
        private String endDate; 
        private String lang; 
        private String startDate; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDohAccountStatisticsRequest request) {
            super(request);
            this.endDate = request.endDate;
            this.lang = request.lang;
            this.startDate = request.startDate;
        } 

        /**
         * <p>The end of the time range to query. Specify the time in the YYYY-MM-DD format.</p>
         * <p>The default value is the day when you perform the operation.</p>
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
         * <p>The language type.</p>
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
         * <p>The beginning of the time range to query. Specify the time in the YYYY-MM-DD format.</p>
         * <p>You can query only the DNS records of the latest 90 days.<code>The value of StartDate must be greater than or equal to the difference between the current date and 90</code>.</p>
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
        public DescribeDohAccountStatisticsRequest build() {
            return new DescribeDohAccountStatisticsRequest(this);
        } 

    } 

}
