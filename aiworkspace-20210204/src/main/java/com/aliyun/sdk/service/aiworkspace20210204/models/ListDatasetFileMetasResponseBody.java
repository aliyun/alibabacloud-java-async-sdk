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
 * {@link ListDatasetFileMetasResponseBody} extends {@link TeaModel}
 *
 * <p>ListDatasetFileMetasResponseBody</p>
 */
public class ListDatasetFileMetasResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DatasetFileMetas")
    private java.util.List<DatasetFileMeta> datasetFileMetas;

    @com.aliyun.core.annotation.NameInMap("DatasetId")
    private String datasetId;

    @com.aliyun.core.annotation.NameInMap("DatasetVersion")
    private String datasetVersion;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    @Deprecated
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private ListDatasetFileMetasResponseBody(Builder builder) {
        this.datasetFileMetas = builder.datasetFileMetas;
        this.datasetId = builder.datasetId;
        this.datasetVersion = builder.datasetVersion;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.pageSize = builder.pageSize;
        this.totalCount = builder.totalCount;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDatasetFileMetasResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return datasetFileMetas
     */
    public java.util.List<DatasetFileMeta> getDatasetFileMetas() {
        return this.datasetFileMetas;
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

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder {
        private java.util.List<DatasetFileMeta> datasetFileMetas; 
        private String datasetId; 
        private String datasetVersion; 
        private Integer maxResults; 
        private String nextToken; 
        private Integer pageSize; 
        private Integer totalCount; 
        private String workspaceId; 

        private Builder() {
        } 

        private Builder(ListDatasetFileMetasResponseBody model) {
            this.datasetFileMetas = model.datasetFileMetas;
            this.datasetId = model.datasetId;
            this.datasetVersion = model.datasetVersion;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.pageSize = model.pageSize;
            this.totalCount = model.totalCount;
            this.workspaceId = model.workspaceId;
        } 

        /**
         * <p>The list of dataset file metadata details.</p>
         */
        public Builder datasetFileMetas(java.util.List<DatasetFileMeta> datasetFileMetas) {
            this.datasetFileMetas = datasetFileMetas;
            return this;
        }

        /**
         * <p>The dataset ID.</p>
         * 
         * <strong>example:</strong>
         * <p>d-rbvg5*****jhc9ks92</p>
         */
        public Builder datasetId(String datasetId) {
            this.datasetId = datasetId;
            return this;
        }

        /**
         * <p>The dataset version name.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        public Builder datasetVersion(String datasetVersion) {
            this.datasetVersion = datasetVersion;
            return this;
        }

        /**
         * <p>The maximum number of results returned per request when using NextToken-based pagination.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token. If the number of results that match the query conditions exceeds the page size, this pagination token is returned. To retrieve the next page of data, pass the returned token value as a request parameter until no token value is returned, which indicates that all data has been retrieved.</p>
         * 
         * <strong>example:</strong>
         * <p>90******-f5c5-4cd4-927e-1f45e1cb8b62_1729644433000</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The current page size.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>105173</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }

        public ListDatasetFileMetasResponseBody build() {
            return new ListDatasetFileMetasResponseBody(this);
        } 

    } 

}
