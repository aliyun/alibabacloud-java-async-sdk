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
         * <p>The dataset ID. For more information about how to obtain a dataset ID, see <a href="https://help.aliyun.com/document_detail/457222.html">ListDatasets</a>.</p>
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
         * <p>The metadata field used for statistical aggregation. The value is not case-sensitive. If you do not specify this parameter, the total number of file metadata entries in the dataset is returned, and the aggregation list is not returned.
         * Valid values:</p>
         * <ul>
         * <li><p>filedir: The directory path of the file.</p>
         * </li>
         * <li><p>filetype: The file type.</p>
         * </li>
         * <li><p>tags.user: Custom user tags.</p>
         * </li>
         * <li><p>tags.user-delete-ai-tags: Algorithm tags deleted by the user.</p>
         * </li>
         * <li><p>tags.ai: Algorithm tags that are aggregated from all labeling tasks.</p>
         * </li>
         * <li><p>tags.all: A combination of algorithm tags and custom user tags, excluding any algorithm tags deleted by the user.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>filedir</p>
         */
        public Builder aggregateBy(String aggregateBy) {
            this.putQueryParameter("AggregateBy", aggregateBy);
            this.aggregateBy = aggregateBy;
            return this;
        }

        /**
         * <p>The name of the dataset version.</p>
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
         * <p>The maximum number of results to return for each query that uses the NextToken parameter. Valid values: 1 to 100. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The workspace ID. For more information about how to obtain a workspace ID, see <a href="https://help.aliyun.com/document_detail/449124.html">ListWorkspaces</a>.</p>
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
