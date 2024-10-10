// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The number of defended vulnerabilities.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder raspDefendedCount(Integer raspDefendedCount) {
            this.raspDefendedCount = raspDefendedCount;
            return this;
        }

        /**
         * <p>The number of supported vulnerabilities.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder raspDefensibleCount(Integer raspDefensibleCount) {
            this.raspDefensibleCount = raspDefensibleCount;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>CE500770-42D3-442E-9DDD-156E0F9F3B45</p>
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
