// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220926.models;

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
 * {@link GetAiAppOverviewResponseBody} extends {@link TeaModel}
 *
 * <p>GetAiAppOverviewResponseBody</p>
 */
public class GetAiAppOverviewResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AppTotal")
    private Long appTotal;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RiskEventLevelDistribution")
    private java.util.Map<String, ?> riskEventLevelDistribution;

    @com.aliyun.core.annotation.NameInMap("RiskEventResolvedTotal")
    private Long riskEventResolvedTotal;

    @com.aliyun.core.annotation.NameInMap("RiskEventTotal")
    private Long riskEventTotal;

    @com.aliyun.core.annotation.NameInMap("RiskEventUnhandledTotal")
    private Long riskEventUnhandledTotal;

    private GetAiAppOverviewResponseBody(Builder builder) {
        this.appTotal = builder.appTotal;
        this.requestId = builder.requestId;
        this.riskEventLevelDistribution = builder.riskEventLevelDistribution;
        this.riskEventResolvedTotal = builder.riskEventResolvedTotal;
        this.riskEventTotal = builder.riskEventTotal;
        this.riskEventUnhandledTotal = builder.riskEventUnhandledTotal;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAiAppOverviewResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appTotal
     */
    public Long getAppTotal() {
        return this.appTotal;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return riskEventLevelDistribution
     */
    public java.util.Map<String, ?> getRiskEventLevelDistribution() {
        return this.riskEventLevelDistribution;
    }

    /**
     * @return riskEventResolvedTotal
     */
    public Long getRiskEventResolvedTotal() {
        return this.riskEventResolvedTotal;
    }

    /**
     * @return riskEventTotal
     */
    public Long getRiskEventTotal() {
        return this.riskEventTotal;
    }

    /**
     * @return riskEventUnhandledTotal
     */
    public Long getRiskEventUnhandledTotal() {
        return this.riskEventUnhandledTotal;
    }

    public static final class Builder {
        private Long appTotal; 
        private String requestId; 
        private java.util.Map<String, ?> riskEventLevelDistribution; 
        private Long riskEventResolvedTotal; 
        private Long riskEventTotal; 
        private Long riskEventUnhandledTotal; 

        private Builder() {
        } 

        private Builder(GetAiAppOverviewResponseBody model) {
            this.appTotal = model.appTotal;
            this.requestId = model.requestId;
            this.riskEventLevelDistribution = model.riskEventLevelDistribution;
            this.riskEventResolvedTotal = model.riskEventResolvedTotal;
            this.riskEventTotal = model.riskEventTotal;
            this.riskEventUnhandledTotal = model.riskEventUnhandledTotal;
        } 

        /**
         * AppTotal.
         */
        public Builder appTotal(Long appTotal) {
            this.appTotal = appTotal;
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
         * RiskEventLevelDistribution.
         */
        public Builder riskEventLevelDistribution(java.util.Map<String, ?> riskEventLevelDistribution) {
            this.riskEventLevelDistribution = riskEventLevelDistribution;
            return this;
        }

        /**
         * RiskEventResolvedTotal.
         */
        public Builder riskEventResolvedTotal(Long riskEventResolvedTotal) {
            this.riskEventResolvedTotal = riskEventResolvedTotal;
            return this;
        }

        /**
         * RiskEventTotal.
         */
        public Builder riskEventTotal(Long riskEventTotal) {
            this.riskEventTotal = riskEventTotal;
            return this;
        }

        /**
         * RiskEventUnhandledTotal.
         */
        public Builder riskEventUnhandledTotal(Long riskEventUnhandledTotal) {
            this.riskEventUnhandledTotal = riskEventUnhandledTotal;
            return this;
        }

        public GetAiAppOverviewResponseBody build() {
            return new GetAiAppOverviewResponseBody(this);
        } 

    } 

}
