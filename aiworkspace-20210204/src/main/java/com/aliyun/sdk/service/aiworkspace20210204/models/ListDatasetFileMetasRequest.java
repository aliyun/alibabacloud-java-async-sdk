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
 * {@link ListDatasetFileMetasRequest} extends {@link RequestModel}
 *
 * <p>ListDatasetFileMetasRequest</p>
 */
public class ListDatasetFileMetasRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("DatasetId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String datasetId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DatasetVersion")
    @com.aliyun.core.annotation.Validation(required = true)
    private String datasetVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndFileUpdateTime")
    private String endFileUpdateTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Order")
    private String order;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueryText")
    private String queryText;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueryType")
    private String queryType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScoreThreshold")
    private Float scoreThreshold;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SortBy")
    private String sortBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartFileUpdateTime")
    private String startFileUpdateTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TopK")
    @com.aliyun.core.annotation.Validation(maximum = 1000, minimum = 1)
    private Integer topK;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private ListDatasetFileMetasRequest(Builder builder) {
        super(builder);
        this.datasetId = builder.datasetId;
        this.datasetVersion = builder.datasetVersion;
        this.endFileUpdateTime = builder.endFileUpdateTime;
        this.nextToken = builder.nextToken;
        this.order = builder.order;
        this.pageSize = builder.pageSize;
        this.queryText = builder.queryText;
        this.queryType = builder.queryType;
        this.scoreThreshold = builder.scoreThreshold;
        this.sortBy = builder.sortBy;
        this.startFileUpdateTime = builder.startFileUpdateTime;
        this.topK = builder.topK;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDatasetFileMetasRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return datasetId
     */
    public String getDatasetId() {
        return this.datasetId;
    }

    /**
     * @return datasetVersion
     */
    public String getDatasetVersion() {
        return this.datasetVersion;
    }

    /**
     * @return endFileUpdateTime
     */
    public String getEndFileUpdateTime() {
        return this.endFileUpdateTime;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return order
     */
    public String getOrder() {
        return this.order;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return queryText
     */
    public String getQueryText() {
        return this.queryText;
    }

    /**
     * @return queryType
     */
    public String getQueryType() {
        return this.queryType;
    }

    /**
     * @return scoreThreshold
     */
    public Float getScoreThreshold() {
        return this.scoreThreshold;
    }

    /**
     * @return sortBy
     */
    public String getSortBy() {
        return this.sortBy;
    }

    /**
     * @return startFileUpdateTime
     */
    public String getStartFileUpdateTime() {
        return this.startFileUpdateTime;
    }

    /**
     * @return topK
     */
    public Integer getTopK() {
        return this.topK;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<ListDatasetFileMetasRequest, Builder> {
        private String datasetId; 
        private String datasetVersion; 
        private String endFileUpdateTime; 
        private String nextToken; 
        private String order; 
        private Integer pageSize; 
        private String queryText; 
        private String queryType; 
        private Float scoreThreshold; 
        private String sortBy; 
        private String startFileUpdateTime; 
        private Integer topK; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(ListDatasetFileMetasRequest request) {
            super(request);
            this.datasetId = request.datasetId;
            this.datasetVersion = request.datasetVersion;
            this.endFileUpdateTime = request.endFileUpdateTime;
            this.nextToken = request.nextToken;
            this.order = request.order;
            this.pageSize = request.pageSize;
            this.queryText = request.queryText;
            this.queryType = request.queryType;
            this.scoreThreshold = request.scoreThreshold;
            this.sortBy = request.sortBy;
            this.startFileUpdateTime = request.startFileUpdateTime;
            this.topK = request.topK;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>d-rbvg5*****jhc9ks92</p>
         */
        public Builder datasetId(String datasetId) {
            this.putPathParameter("DatasetId", datasetId);
            this.datasetId = datasetId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        public Builder datasetVersion(String datasetVersion) {
            this.putQueryParameter("DatasetVersion", datasetVersion);
            this.datasetVersion = datasetVersion;
            return this;
        }

        /**
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ss.SSSZ</p>
         * 
         * <strong>example:</strong>
         * <p>2025-01-12T14:36:01Z</p>
         */
        public Builder endFileUpdateTime(String endFileUpdateTime) {
            this.putQueryParameter("EndFileUpdateTime", endFileUpdateTime);
            this.endFileUpdateTime = endFileUpdateTime;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * Order.
         */
        public Builder order(String order) {
            this.putQueryParameter("Order", order);
            this.order = order;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * QueryText.
         */
        public Builder queryText(String queryText) {
            this.putQueryParameter("QueryText", queryText);
            this.queryText = queryText;
            return this;
        }

        /**
         * QueryType.
         */
        public Builder queryType(String queryType) {
            this.putQueryParameter("QueryType", queryType);
            this.queryType = queryType;
            return this;
        }

        /**
         * ScoreThreshold.
         */
        public Builder scoreThreshold(Float scoreThreshold) {
            this.putQueryParameter("ScoreThreshold", scoreThreshold);
            this.scoreThreshold = scoreThreshold;
            return this;
        }

        /**
         * SortBy.
         */
        public Builder sortBy(String sortBy) {
            this.putQueryParameter("SortBy", sortBy);
            this.sortBy = sortBy;
            return this;
        }

        /**
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ss.SSSZ</p>
         * 
         * <strong>example:</strong>
         * <p>2025-01-12T14:36:01Z</p>
         */
        public Builder startFileUpdateTime(String startFileUpdateTime) {
            this.putQueryParameter("StartFileUpdateTime", startFileUpdateTime);
            this.startFileUpdateTime = startFileUpdateTime;
            return this;
        }

        /**
         * TopK.
         */
        public Builder topK(Integer topK) {
            this.putQueryParameter("TopK", topK);
            this.topK = topK;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>105173</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public ListDatasetFileMetasRequest build() {
            return new ListDatasetFileMetasRequest(this);
        } 

    } 

}
