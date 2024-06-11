// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVulDefendCountStatisticsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVulDefendCountStatisticsResponseBody</p>
 */
public class DescribeVulDefendCountStatisticsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RaspDefendedCount")
    private Integer raspDefendedCount;

    @com.aliyun.core.annotation.NameInMap("RaspDefensibleCount")
    private Integer raspDefensibleCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeVulDefendCountStatisticsResponseBody(Builder builder) {
        this.raspDefendedCount = builder.raspDefendedCount;
        this.raspDefensibleCount = builder.raspDefensibleCount;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVulDefendCountStatisticsResponseBody create() {
        return builder().build();
    }

    /**
     * @return raspDefendedCount
     */
    public Integer getRaspDefendedCount() {
        return this.raspDefendedCount;
    }

    /**
     * @return raspDefensibleCount
     */
    public Integer getRaspDefensibleCount() {
        return this.raspDefensibleCount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer raspDefendedCount; 
        private Integer raspDefensibleCount; 
        private String requestId; 

        /**
         * RaspDefendedCount.
         */
        public Builder raspDefendedCount(Integer raspDefendedCount) {
            this.raspDefendedCount = raspDefendedCount;
            return this;
        }

        /**
         * RaspDefensibleCount.
         */
        public Builder raspDefensibleCount(Integer raspDefensibleCount) {
            this.raspDefensibleCount = raspDefensibleCount;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeVulDefendCountStatisticsResponseBody build() {
            return new DescribeVulDefendCountStatisticsResponseBody(this);
        } 

    } 

}
