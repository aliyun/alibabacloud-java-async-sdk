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
         * <p>The total number of agents.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder appTotal(Long appTotal) {
            this.appTotal = appTotal;
            return this;
        }

        /**
         * <p>The ID assigned by the backend to uniquely identify a request. You can use this ID to troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAA-BBBB-CCCCC-DDDD-EEEEEEEE****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The distribution of risk events by level.</p>
         */
        public Builder riskEventLevelDistribution(java.util.Map<String, ?> riskEventLevelDistribution) {
            this.riskEventLevelDistribution = riskEventLevelDistribution;
            return this;
        }

        /**
         * <p>The total number of resolved risk events.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder riskEventResolvedTotal(Long riskEventResolvedTotal) {
            this.riskEventResolvedTotal = riskEventResolvedTotal;
            return this;
        }

        /**
         * <p>The total number of risk events.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder riskEventTotal(Long riskEventTotal) {
            this.riskEventTotal = riskEventTotal;
            return this;
        }

        /**
         * <p>The total number of unhandled risk events.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
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
