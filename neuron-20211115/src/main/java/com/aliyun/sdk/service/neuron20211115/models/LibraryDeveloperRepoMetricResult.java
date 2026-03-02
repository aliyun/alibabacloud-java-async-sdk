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
 * {@link LibraryDeveloperRepoMetricResult} extends {@link TeaModel}
 *
 * <p>LibraryDeveloperRepoMetricResult</p>
 */
public class LibraryDeveloperRepoMetricResult extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("developerRepoMetrics")
    private java.util.List<ReposDeveloperGroupMetric> developerRepoMetrics;

    private LibraryDeveloperRepoMetricResult(Builder builder) {
        this.developerRepoMetrics = builder.developerRepoMetrics;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LibraryDeveloperRepoMetricResult create() {
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

    public static final class Builder {
        private java.util.List<ReposDeveloperGroupMetric> developerRepoMetrics; 

        private Builder() {
        } 

        private Builder(LibraryDeveloperRepoMetricResult model) {
            this.developerRepoMetrics = model.developerRepoMetrics;
        } 

        /**
         * developerRepoMetrics.
         */
        public Builder developerRepoMetrics(java.util.List<ReposDeveloperGroupMetric> developerRepoMetrics) {
            this.developerRepoMetrics = developerRepoMetrics;
            return this;
        }

        public LibraryDeveloperRepoMetricResult build() {
            return new LibraryDeveloperRepoMetricResult(this);
        } 

    } 

}
