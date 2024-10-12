// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListRunMetricsRequest} extends {@link RequestModel}
 *
 * <p>ListRunMetricsRequest</p>
 */
public class ListRunMetricsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("RunId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String runId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Key")
    @com.aliyun.core.annotation.Validation(required = true)
    private String key;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Long maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageToken")
    private Long pageToken;

    private ListRunMetricsRequest(Builder builder) {
        super(builder);
        this.runId = builder.runId;
        this.key = builder.key;
        this.maxResults = builder.maxResults;
        this.pageToken = builder.pageToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRunMetricsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return runId
     */
    public String getRunId() {
        return this.runId;
    }

    /**
     * @return key
     */
    public String getKey() {
        return this.key;
    }

    /**
     * @return maxResults
     */
    public Long getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return pageToken
     */
    public Long getPageToken() {
        return this.pageToken;
    }

    public static final class Builder extends Request.Builder<ListRunMetricsRequest, Builder> {
        private String runId; 
        private String key; 
        private Long maxResults; 
        private Long pageToken; 

        private Builder() {
            super();
        } 

        private Builder(ListRunMetricsRequest request) {
            super(request);
            this.runId = request.runId;
            this.key = request.key;
            this.maxResults = request.maxResults;
            this.pageToken = request.pageToken;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>run-1qJhzJ2YXgX****</p>
         */
        public Builder runId(String runId) {
            this.putPathParameter("RunId", runId);
            this.runId = runId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>loss</p>
         */
        public Builder key(String key) {
            this.putQueryParameter("Key", key);
            this.key = key;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Long maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * PageToken.
         */
        public Builder pageToken(Long pageToken) {
            this.putQueryParameter("PageToken", pageToken);
            this.pageToken = pageToken;
            return this;
        }

        @Override
        public ListRunMetricsRequest build() {
            return new ListRunMetricsRequest(this);
        } 

    } 

}
