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
 * {@link GetDatasetFileMetasStatisticsRequest} extends {@link RequestModel}
 *
 * <p>GetDatasetFileMetasStatisticsRequest</p>
 */
public class GetDatasetFileMetasStatisticsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("DatasetId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String datasetId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AggregateBy")
    private String aggregateBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DatasetVersion")
    @com.aliyun.core.annotation.Validation(required = true)
    private String datasetVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private GetDatasetFileMetasStatisticsRequest(Builder builder) {
        super(builder);
        this.datasetId = builder.datasetId;
        this.aggregateBy = builder.aggregateBy;
        this.datasetVersion = builder.datasetVersion;
        this.maxResults = builder.maxResults;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDatasetFileMetasStatisticsRequest create() {
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
     * @return aggregateBy
     */
    public String getAggregateBy() {
        return this.aggregateBy;
    }

    /**
     * @return datasetVersion
     */
    public String getDatasetVersion() {
        return this.datasetVersion;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<GetDatasetFileMetasStatisticsRequest, Builder> {
        private String datasetId; 
        private String aggregateBy; 
        private String datasetVersion; 
        private Integer maxResults; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(GetDatasetFileMetasStatisticsRequest request) {
            super(request);
            this.datasetId = request.datasetId;
            this.aggregateBy = request.aggregateBy;
            this.datasetVersion = request.datasetVersion;
            this.maxResults = request.maxResults;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>d-rbvg5wz****c9ks92</p>
         */
        public Builder datasetId(String datasetId) {
            this.putPathParameter("DatasetId", datasetId);
            this.datasetId = datasetId;
            return this;
        }

        /**
         * AggregateBy.
         */
        public Builder aggregateBy(String aggregateBy) {
            this.putQueryParameter("AggregateBy", aggregateBy);
            this.aggregateBy = aggregateBy;
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
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>145883</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public GetDatasetFileMetasStatisticsRequest build() {
            return new GetDatasetFileMetasStatisticsRequest(this);
        } 

    } 

}
