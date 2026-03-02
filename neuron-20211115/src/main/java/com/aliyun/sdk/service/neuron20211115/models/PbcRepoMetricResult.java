// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.neuron20211115.models;

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
 * {@link PbcRepoMetricResult} extends {@link TeaModel}
 *
 * <p>PbcRepoMetricResult</p>
 */
public class PbcRepoMetricResult extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("repoMetrics")
    private java.util.List<RepoMetric> repoMetrics;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private PbcRepoMetricResult(Builder builder) {
        this.repoMetrics = builder.repoMetrics;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PbcRepoMetricResult create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return repoMetrics
     */
    public java.util.List<RepoMetric> getRepoMetrics() {
        return this.repoMetrics;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<RepoMetric> repoMetrics; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(PbcRepoMetricResult model) {
            this.repoMetrics = model.repoMetrics;
            this.requestId = model.requestId;
        } 

        /**
         * repoMetrics.
         */
        public Builder repoMetrics(java.util.List<RepoMetric> repoMetrics) {
            this.repoMetrics = repoMetrics;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public PbcRepoMetricResult build() {
            return new PbcRepoMetricResult(this);
        } 

    } 

}
