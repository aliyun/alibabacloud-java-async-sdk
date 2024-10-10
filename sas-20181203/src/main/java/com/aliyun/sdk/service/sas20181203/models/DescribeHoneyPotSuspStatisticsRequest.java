// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeHoneyPotSuspStatisticsRequest} extends {@link RequestModel}
 *
 * <p>DescribeHoneyPotSuspStatisticsRequest</p>
 */
public class DescribeHoneyPotSuspStatisticsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("From")
    @com.aliyun.core.annotation.Validation(required = true)
    private String from;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StatisticsDays")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer statisticsDays;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StatisticsKeyType")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The source of the request. Set the value to <strong>honeypot</strong>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>honeypot</p>
         */
        public Builder from(String from) {
            this.putQueryParameter("From", from);
            this.from = from;
            return this;
        }

        /**
         * <p>The language of the content within the request and response. Default value: <strong>zh</strong>. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese.</li>
         * <li><strong>en</strong>: English.</li>
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
         * <p>The time range of the data to query. Unit: days.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder statisticsDays(Integer statisticsDays) {
            this.putQueryParameter("StatisticsDays", statisticsDays);
            this.statisticsDays = statisticsDays;
            return this;
        }

        /**
         * <p>The type of the asset to query. Valid values:</p>
         * <ul>
         * <li><strong>vpcInstanceId</strong>: VPC</li>
         * <li><strong>uuid</strong>: server</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vpcInstanceId</p>
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
