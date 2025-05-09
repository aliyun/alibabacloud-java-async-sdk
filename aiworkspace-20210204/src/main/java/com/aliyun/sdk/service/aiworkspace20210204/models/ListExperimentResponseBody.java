// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

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
 * {@link ListExperimentResponseBody} extends {@link TeaModel}
 *
 * <p>ListExperimentResponseBody</p>
 */
public class ListExperimentResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Experiments")
    private java.util.List<Experiment> experiments;

    @com.aliyun.core.annotation.NameInMap("NextPageToken")
    private Long nextPageToken;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private ListExperimentResponseBody(Builder builder) {
        this.experiments = builder.experiments;
        this.nextPageToken = builder.nextPageToken;
        this.totalCount = builder.totalCount;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListExperimentResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return experiments
     */
    public java.util.List<Experiment> getExperiments() {
        return this.experiments;
    }

    /**
     * @return nextPageToken
     */
    public Long getNextPageToken() {
        return this.nextPageToken;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Experiment> experiments; 
        private Long nextPageToken; 
        private Long totalCount; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListExperimentResponseBody model) {
            this.experiments = model.experiments;
            this.nextPageToken = model.nextPageToken;
            this.totalCount = model.totalCount;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The list of experiments.</p>
         */
        public Builder experiments(java.util.List<Experiment> experiments) {
            this.experiments = experiments;
            return this;
        }

        /**
         * <p>The pagination token. It can be used in the next request to retrieve a new page of results.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder nextPageToken(Long nextPageToken) {
            this.nextPageToken = nextPageToken;
            return this;
        }

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0C6835C5-A424-5AFB-ACC2-F1E3CA1ABF7C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListExperimentResponseBody build() {
            return new ListExperimentResponseBody(this);
        } 

    } 

}
