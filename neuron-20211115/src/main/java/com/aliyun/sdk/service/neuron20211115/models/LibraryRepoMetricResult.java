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
 * {@link LibraryRepoMetricResult} extends {@link TeaModel}
 *
 * <p>LibraryRepoMetricResult</p>
 */
public class LibraryRepoMetricResult extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("repoMetrics")
    private java.util.List<RepoMetric> repoMetrics;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private LibraryRepoMetricResult(Builder builder) {
        this.repoMetrics = builder.repoMetrics;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LibraryRepoMetricResult create() {
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

        private Builder(LibraryRepoMetricResult model) {
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

        public LibraryRepoMetricResult build() {
            return new LibraryRepoMetricResult(this);
        } 

    } 

}
