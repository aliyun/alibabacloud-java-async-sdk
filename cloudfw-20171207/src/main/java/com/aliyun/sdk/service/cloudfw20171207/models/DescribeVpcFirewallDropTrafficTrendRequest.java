// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link DescribeVpcFirewallDropTrafficTrendRequest} extends {@link RequestModel}
 *
 * <p>DescribeVpcFirewallDropTrafficTrendRequest</p>
 */
public class DescribeVpcFirewallDropTrafficTrendRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Order")
    private String order;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Sort")
    private String sort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceIp")
    private String sourceIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private Long startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TrafficTime")
    private Long trafficTime;

    private DescribeVpcFirewallDropTrafficTrendRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.order = builder.order;
        this.sort = builder.sort;
        this.sourceIp = builder.sourceIp;
        this.startTime = builder.startTime;
        this.trafficTime = builder.trafficTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVpcFirewallDropTrafficTrendRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return order
     */
    public String getOrder() {
        return this.order;
    }

    /**
     * @return sort
     */
    public String getSort() {
        return this.sort;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * @return trafficTime
     */
    public Long getTrafficTime() {
        return this.trafficTime;
    }

    public static final class Builder extends Request.Builder<DescribeVpcFirewallDropTrafficTrendRequest, Builder> {
        private Long endTime; 
        private String order; 
        private String sort; 
        private String sourceIp; 
        private Long startTime; 
        private Long trafficTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeVpcFirewallDropTrafficTrendRequest request) {
            super(request);
            this.endTime = request.endTime;
            this.order = request.order;
            this.sort = request.sort;
            this.sourceIp = request.sourceIp;
            this.startTime = request.startTime;
            this.trafficTime = request.trafficTime;
        } 

        /**
         * EndTime.
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * Order.
         */
        public Builder order(String order) {
            this.putQueryParameter("Order", order);
            this.order = order;
            return this;
        }

        /**
         * Sort.
         */
        public Builder sort(String sort) {
            this.putQueryParameter("Sort", sort);
            this.sort = sort;
            return this;
        }

        /**
         * SourceIp.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * TrafficTime.
         */
        public Builder trafficTime(Long trafficTime) {
            this.putQueryParameter("TrafficTime", trafficTime);
            this.trafficTime = trafficTime;
            return this;
        }

        @Override
        public DescribeVpcFirewallDropTrafficTrendRequest build() {
            return new DescribeVpcFirewallDropTrafficTrendRequest(this);
        } 

    } 

}
