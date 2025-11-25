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
 * {@link DescribeOutgoingRiskTrendResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeOutgoingRiskTrendResponseBody</p>
 */
public class DescribeOutgoingRiskTrendResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataList")
    private java.util.List<DataList> dataList;

    @com.aliyun.core.annotation.NameInMap("Interval")
    private Integer interval;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalRiskDomain")
    private Integer totalRiskDomain;

    @com.aliyun.core.annotation.NameInMap("TotalRiskIp")
    private Integer totalRiskIp;

    private DescribeOutgoingRiskTrendResponseBody(Builder builder) {
        this.dataList = builder.dataList;
        this.interval = builder.interval;
        this.requestId = builder.requestId;
        this.totalRiskDomain = builder.totalRiskDomain;
        this.totalRiskIp = builder.totalRiskIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeOutgoingRiskTrendResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dataList
     */
    public java.util.List<DataList> getDataList() {
        return this.dataList;
    }

    /**
     * @return interval
     */
    public Integer getInterval() {
        return this.interval;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalRiskDomain
     */
    public Integer getTotalRiskDomain() {
        return this.totalRiskDomain;
    }

    /**
     * @return totalRiskIp
     */
    public Integer getTotalRiskIp() {
        return this.totalRiskIp;
    }

    public static final class Builder {
        private java.util.List<DataList> dataList; 
        private Integer interval; 
        private String requestId; 
        private Integer totalRiskDomain; 
        private Integer totalRiskIp; 

        private Builder() {
        } 

        private Builder(DescribeOutgoingRiskTrendResponseBody model) {
            this.dataList = model.dataList;
            this.interval = model.interval;
            this.requestId = model.requestId;
            this.totalRiskDomain = model.totalRiskDomain;
            this.totalRiskIp = model.totalRiskIp;
        } 

        /**
         * DataList.
         */
        public Builder dataList(java.util.List<DataList> dataList) {
            this.dataList = dataList;
            return this;
        }

        /**
         * Interval.
         */
        public Builder interval(Integer interval) {
            this.interval = interval;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalRiskDomain.
         */
        public Builder totalRiskDomain(Integer totalRiskDomain) {
            this.totalRiskDomain = totalRiskDomain;
            return this;
        }

        /**
         * TotalRiskIp.
         */
        public Builder totalRiskIp(Integer totalRiskIp) {
            this.totalRiskIp = totalRiskIp;
            return this;
        }

        public DescribeOutgoingRiskTrendResponseBody build() {
            return new DescribeOutgoingRiskTrendResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeOutgoingRiskTrendResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeOutgoingRiskTrendResponseBody</p>
     */
    public static class DataList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RiskDomain")
        private Integer riskDomain;

        @com.aliyun.core.annotation.NameInMap("RiskIp")
        private Integer riskIp;

        @com.aliyun.core.annotation.NameInMap("Time")
        private Long time;

        private DataList(Builder builder) {
            this.riskDomain = builder.riskDomain;
            this.riskIp = builder.riskIp;
            this.time = builder.time;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataList create() {
            return builder().build();
        }

        /**
         * @return riskDomain
         */
        public Integer getRiskDomain() {
            return this.riskDomain;
        }

        /**
         * @return riskIp
         */
        public Integer getRiskIp() {
            return this.riskIp;
        }

        /**
         * @return time
         */
        public Long getTime() {
            return this.time;
        }

        public static final class Builder {
            private Integer riskDomain; 
            private Integer riskIp; 
            private Long time; 

            private Builder() {
            } 

            private Builder(DataList model) {
                this.riskDomain = model.riskDomain;
                this.riskIp = model.riskIp;
                this.time = model.time;
            } 

            /**
             * RiskDomain.
             */
            public Builder riskDomain(Integer riskDomain) {
                this.riskDomain = riskDomain;
                return this;
            }

            /**
             * RiskIp.
             */
            public Builder riskIp(Integer riskIp) {
                this.riskIp = riskIp;
                return this;
            }

            /**
             * Time.
             */
            public Builder time(Long time) {
                this.time = time;
                return this;
            }

            public DataList build() {
                return new DataList(this);
            } 

        } 

    }
}
