// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link DescribeHoneyPotSuspStatisticsRequest} extends {@link RequestModel}
 *
 * <p>DescribeHoneyPotSuspStatisticsRequest</p>
 */
public class DescribeHoneyPotSuspStatisticsRequest extends Request {
    @Query
    @NameInMap("From")
    private String from;

    @Query
    @NameInMap("StatisticsDays")
    private Integer statisticsDays;

    @Query
    @NameInMap("StatisticsKeyType")
    private String statisticsKeyType;


    private DescribeHoneyPotSuspStatisticsRequest(Builder builder) {
        super(builder);
        this.from = builder.from;
        this.statisticsDays = builder.statisticsDays;
        this.statisticsKeyType = builder.statisticsKeyType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeHoneyPotSuspStatisticsRequest create() {
        return builder().build();
    }

    /**
     * @return from
     */
    public String getFrom() {
        return this.from;
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

    public static final class Builder extends Request.Builder<Builder> {
        private String from; 
        private Integer statisticsDays; 
        private String statisticsKeyType; 

        /**
         * <p>From.</p>
         */
        public Builder from(String from) {
            this.putQueryParameter("From", from);
            this.from = from;
            return this;
        }

        /**
         * <p>StatisticsDays.</p>
         */
        public Builder statisticsDays(Integer statisticsDays) {
            this.putQueryParameter("StatisticsDays", statisticsDays);
            this.statisticsDays = statisticsDays;
            return this;
        }

        /**
         * <p>StatisticsKeyType.</p>
         */
        public Builder statisticsKeyType(String statisticsKeyType) {
            this.putQueryParameter("StatisticsKeyType", statisticsKeyType);
            this.statisticsKeyType = statisticsKeyType;
            return this;
        }

        public DescribeHoneyPotSuspStatisticsRequest build() {
            return new DescribeHoneyPotSuspStatisticsRequest(this);
        } 

    } 

}
