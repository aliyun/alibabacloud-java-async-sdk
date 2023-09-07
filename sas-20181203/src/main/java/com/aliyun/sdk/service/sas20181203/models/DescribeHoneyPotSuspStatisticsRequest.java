// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeHoneyPotSuspStatisticsRequest} extends {@link RequestModel}
 *
 * <p>DescribeHoneyPotSuspStatisticsRequest</p>
 */
public class DescribeHoneyPotSuspStatisticsRequest extends Request {
    @Query
    @NameInMap("From")
    @Validation(required = true)
    private String from;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("StatisticsDays")
    @Validation(required = true)
    private Integer statisticsDays;

    @Query
    @NameInMap("StatisticsKeyType")
    @Validation(required = true)
    private String statisticsKeyType;

    private DescribeHoneyPotSuspStatisticsRequest(Builder builder) {
        super(builder);
        this.from = builder.from;
        this.lang = builder.lang;
        this.statisticsDays = builder.statisticsDays;
        this.statisticsKeyType = builder.statisticsKeyType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeHoneyPotSuspStatisticsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return from
     */
    public String getFrom() {
        return this.from;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return statisticsDays
     */
    public Integer getStatisticsDays() {
        return this.statisticsDays;
    }

    /**
     * @return statisticsKeyType
     */
    public String getStatisticsKeyType() {
        return this.statisticsKeyType;
    }

    public static final class Builder extends Request.Builder<DescribeHoneyPotSuspStatisticsRequest, Builder> {
        private String from; 
        private String lang; 
        private Integer statisticsDays; 
        private String statisticsKeyType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeHoneyPotSuspStatisticsRequest request) {
            super(request);
            this.from = request.from;
            this.lang = request.lang;
            this.statisticsDays = request.statisticsDays;
            this.statisticsKeyType = request.statisticsKeyType;
        } 

        /**
         * The source of the request. Set the value to **honeypot**.
         */
        public Builder from(String from) {
            this.putQueryParameter("From", from);
            this.from = from;
            return this;
        }

        /**
         * The language of the content within the request and response. Default value: **zh**. Valid values:
         * <p>
         * 
         * *   **zh**: Chinese.
         * *   **en**: English.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The time range of the data to query. Unit: days.
         */
        public Builder statisticsDays(Integer statisticsDays) {
            this.putQueryParameter("StatisticsDays", statisticsDays);
            this.statisticsDays = statisticsDays;
            return this;
        }

        /**
         * The type of the asset to query. Valid values:
         * <p>
         * 
         * *   **vpcInstanceId**: VPC
         * *   **uuid**: server
         */
        public Builder statisticsKeyType(String statisticsKeyType) {
            this.putQueryParameter("StatisticsKeyType", statisticsKeyType);
            this.statisticsKeyType = statisticsKeyType;
            return this;
        }

        @Override
        public DescribeHoneyPotSuspStatisticsRequest build() {
            return new DescribeHoneyPotSuspStatisticsRequest(this);
        } 

    } 

}
