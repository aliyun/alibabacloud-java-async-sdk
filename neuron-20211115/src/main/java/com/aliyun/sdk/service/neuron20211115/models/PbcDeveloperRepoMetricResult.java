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
 * {@link PbcDeveloperRepoMetricResult} extends {@link TeaModel}
 *
 * <p>PbcDeveloperRepoMetricResult</p>
 */
public class PbcDeveloperRepoMetricResult extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("developerRepoMetrics")
    private java.util.List<ReposDeveloperGroupMetric> developerRepoMetrics;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private PbcDeveloperRepoMetricResult(Builder builder) {
        this.developerRepoMetrics = builder.developerRepoMetrics;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PbcDeveloperRepoMetricResult create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return developerRepoMetrics
     */
    public java.util.List<ReposDeveloperGroupMetric> getDeveloperRepoMetrics() {
        return this.developerRepoMetrics;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<ReposDeveloperGroupMetric> developerRepoMetrics; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(PbcDeveloperRepoMetricResult model) {
            this.developerRepoMetrics = model.developerRepoMetrics;
            this.requestId = model.requestId;
        } 

        /**
         * developerRepoMetrics.
         */
        public Builder developerRepoMetrics(java.util.List<ReposDeveloperGroupMetric> developerRepoMetrics) {
            this.developerRepoMetrics = developerRepoMetrics;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public PbcDeveloperRepoMetricResult build() {
            return new PbcDeveloperRepoMetricResult(this);
        } 

    } 

}
