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
 * {@link DescribeOutgoingRiskDomainAndIpCountResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeOutgoingRiskDomainAndIpCountResponseBody</p>
 */
public class DescribeOutgoingRiskDomainAndIpCountResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RiskDomainCount")
    private Long riskDomainCount;

    @com.aliyun.core.annotation.NameInMap("RiskIpCount")
    private Long riskIpCount;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private DescribeOutgoingRiskDomainAndIpCountResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.riskDomainCount = builder.riskDomainCount;
        this.riskIpCount = builder.riskIpCount;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeOutgoingRiskDomainAndIpCountResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return riskDomainCount
     */
    public Long getRiskDomainCount() {
        return this.riskDomainCount;
    }

    /**
     * @return riskIpCount
     */
    public Long getRiskIpCount() {
        return this.riskIpCount;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String requestId; 
        private Long riskDomainCount; 
        private Long riskIpCount; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(DescribeOutgoingRiskDomainAndIpCountResponseBody model) {
            this.requestId = model.requestId;
            this.riskDomainCount = model.riskDomainCount;
            this.riskIpCount = model.riskIpCount;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>EE258AC0-6EDD-5929-AB47-165E9B54****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The number of risk domain names.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        public Builder riskDomainCount(Long riskDomainCount) {
            this.riskDomainCount = riskDomainCount;
            return this;
        }

        /**
         * <p>The number of risk IP addresses.</p>
         * 
         * <strong>example:</strong>
         * <p>47</p>
         */
        public Builder riskIpCount(Long riskIpCount) {
            this.riskIpCount = riskIpCount;
            return this;
        }

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeOutgoingRiskDomainAndIpCountResponseBody build() {
            return new DescribeOutgoingRiskDomainAndIpCountResponseBody(this);
        } 

    } 

}
