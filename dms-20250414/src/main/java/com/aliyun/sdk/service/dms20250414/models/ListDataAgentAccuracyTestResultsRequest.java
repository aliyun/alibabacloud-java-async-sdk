// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms20250414.models;

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
 * {@link ListDataAgentAccuracyTestResultsRequest} extends {@link RequestModel}
 *
 * <p>ListDataAgentAccuracyTestResultsRequest</p>
 */
public class ListDataAgentAccuracyTestResultsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccuracyTestInsId")
    private String accuracyTestInsId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccuracyTestResultId")
    private String accuracyTestResultId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccuracyTestSubtaskId")
    private String accuracyTestSubtaskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccuracyTestTaskId")
    private String accuracyTestTaskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private String pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private String pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private ListDataAgentAccuracyTestResultsRequest(Builder builder) {
        super(builder);
        this.accuracyTestInsId = builder.accuracyTestInsId;
        this.accuracyTestResultId = builder.accuracyTestResultId;
        this.accuracyTestSubtaskId = builder.accuracyTestSubtaskId;
        this.accuracyTestTaskId = builder.accuracyTestTaskId;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDataAgentAccuracyTestResultsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accuracyTestInsId
     */
    public String getAccuracyTestInsId() {
        return this.accuracyTestInsId;
    }

    /**
     * @return accuracyTestResultId
     */
    public String getAccuracyTestResultId() {
        return this.accuracyTestResultId;
    }

    /**
     * @return accuracyTestSubtaskId
     */
    public String getAccuracyTestSubtaskId() {
        return this.accuracyTestSubtaskId;
    }

    /**
     * @return accuracyTestTaskId
     */
    public String getAccuracyTestTaskId() {
        return this.accuracyTestTaskId;
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
     * @return pageNumber
     */
    public String getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<ListDataAgentAccuracyTestResultsRequest, Builder> {
        private String accuracyTestInsId; 
        private String accuracyTestResultId; 
        private String accuracyTestSubtaskId; 
        private String accuracyTestTaskId; 
        private Integer maxResults; 
        private String nextToken; 
        private String pageNumber; 
        private String pageSize; 
        private String regionId; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(ListDataAgentAccuracyTestResultsRequest request) {
            super(request);
            this.accuracyTestInsId = request.accuracyTestInsId;
            this.accuracyTestResultId = request.accuracyTestResultId;
            this.accuracyTestSubtaskId = request.accuracyTestSubtaskId;
            this.accuracyTestTaskId = request.accuracyTestTaskId;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * AccuracyTestInsId.
         */
        public Builder accuracyTestInsId(String accuracyTestInsId) {
            this.putQueryParameter("AccuracyTestInsId", accuracyTestInsId);
            this.accuracyTestInsId = accuracyTestInsId;
            return this;
        }

        /**
         * AccuracyTestResultId.
         */
        public Builder accuracyTestResultId(String accuracyTestResultId) {
            this.putQueryParameter("AccuracyTestResultId", accuracyTestResultId);
            this.accuracyTestResultId = accuracyTestResultId;
            return this;
        }

        /**
         * AccuracyTestSubtaskId.
         */
        public Builder accuracyTestSubtaskId(String accuracyTestSubtaskId) {
            this.putQueryParameter("AccuracyTestSubtaskId", accuracyTestSubtaskId);
            this.accuracyTestSubtaskId = accuracyTestSubtaskId;
            return this;
        }

        /**
         * AccuracyTestTaskId.
         */
        public Builder accuracyTestTaskId(String accuracyTestTaskId) {
            this.putQueryParameter("AccuracyTestTaskId", accuracyTestTaskId);
            this.accuracyTestTaskId = accuracyTestTaskId;
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
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(String pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * WorkspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public ListDataAgentAccuracyTestResultsRequest build() {
            return new ListDataAgentAccuracyTestResultsRequest(this);
        } 

    } 

}
