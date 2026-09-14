// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentloop20260520.models;

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
 * {@link ListDatasetsRequest} extends {@link RequestModel}
 *
 * <p>ListDatasetsRequest</p>
 */
public class ListDatasetsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("agentSpace")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64, minLength = 2)
    private String agentSpace;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("datasetName")
    private String datasetName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("labels")
    private java.util.Map<String, java.util.List<String>> labels;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    private ListDatasetsRequest(Builder builder) {
        super(builder);
        this.agentSpace = builder.agentSpace;
        this.datasetName = builder.datasetName;
        this.labels = builder.labels;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDatasetsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentSpace
     */
    public String getAgentSpace() {
        return this.agentSpace;
    }

    /**
     * @return datasetName
     */
    public String getDatasetName() {
        return this.datasetName;
    }

    /**
     * @return labels
     */
    public java.util.Map<String, java.util.List<String>> getLabels() {
        return this.labels;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    public static final class Builder extends Request.Builder<ListDatasetsRequest, Builder> {
        private String agentSpace; 
        private String datasetName; 
        private java.util.Map<String, java.util.List<String>> labels; 
        private Integer maxResults; 
        private String nextToken; 

        private Builder() {
            super();
        } 

        private Builder(ListDatasetsRequest request) {
            super(request);
            this.agentSpace = request.agentSpace;
            this.datasetName = request.datasetName;
            this.labels = request.labels;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
        } 

        /**
         * <p>The agent space name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sop-agent</p>
         */
        public Builder agentSpace(String agentSpace) {
            this.putPathParameter("agentSpace", agentSpace);
            this.agentSpace = agentSpace;
            return this;
        }

        /**
         * <p>The dataset name.</p>
         * 
         * <strong>example:</strong>
         * <p>product_faq_dataset</p>
         */
        public Builder datasetName(String datasetName) {
            this.putQueryParameter("datasetName", datasetName);
            this.datasetName = datasetName;
            return this;
        }

        /**
         * labels.
         */
        public Builder labels(java.util.Map<String, java.util.List<String>> labels) {
            String labelsShrink = shrink(labels, "labels", "json");
            this.putQueryParameter("labels", labelsShrink);
            this.labels = labels;
            return this;
        }

        /**
         * <p>The maximum number of results to return.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("maxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token. You do not need to set this parameter for the first request. For subsequent requests, set this parameter to the nextToken value returned in the previous response.</p>
         * 
         * <strong>example:</strong>
         * <p>RsfoUqpOJd5nd0F1e4OquY/7dKNGp1JMgsKtvCagmtY=</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("nextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        @Override
        public ListDatasetsRequest build() {
            return new ListDatasetsRequest(this);
        } 

    } 

}
