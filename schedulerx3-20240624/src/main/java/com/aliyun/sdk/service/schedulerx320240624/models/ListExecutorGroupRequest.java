// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.schedulerx320240624.models;

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
 * {@link ListExecutorGroupRequest} extends {@link RequestModel}
 *
 * <p>ListExecutorGroupRequest</p>
 */
public class ListExecutorGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNum")
    private Integer pageNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TimeType")
    private java.util.List<Integer> timeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkerType")
    private String workerType;

    private ListExecutorGroupRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.maxResults = builder.maxResults;
        this.name = builder.name;
        this.nextToken = builder.nextToken;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.timeType = builder.timeType;
        this.workerType = builder.workerType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListExecutorGroupRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return pageNum
     */
    public Integer getPageNum() {
        return this.pageNum;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return timeType
     */
    public java.util.List<Integer> getTimeType() {
        return this.timeType;
    }

    /**
     * @return workerType
     */
    public String getWorkerType() {
        return this.workerType;
    }

    public static final class Builder extends Request.Builder<ListExecutorGroupRequest, Builder> {
        private String clusterId; 
        private Integer maxResults; 
        private String name; 
        private String nextToken; 
        private Integer pageNum; 
        private Integer pageSize; 
        private java.util.List<Integer> timeType; 
        private String workerType; 

        private Builder() {
            super();
        } 

        private Builder(ListExecutorGroupRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.maxResults = request.maxResults;
            this.name = request.name;
            this.nextToken = request.nextToken;
            this.pageNum = request.pageNum;
            this.pageSize = request.pageSize;
            this.timeType = request.timeType;
            this.workerType = request.workerType;
        } 

        /**
         * <p>The cluster ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>xxljob-b6ec1xxxx</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The maximum number of entries to return for this request. Default value: 10.</p>
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
         * <p>The name of the executor group.</p>
         * 
         * <strong>example:</strong>
         * <p>group1</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The token that specifies the position from which the current call returns data. An empty value indicates that all data has been read. You do not need to specify this parameter for the first query.</p>
         * 
         * <strong>example:</strong>
         * <p>eCKqVlS5FKF5EWGGOo8EgQ==</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNum(Integer pageNum) {
            this.putQueryParameter("PageNum", pageNum);
            this.pageNum = pageNum;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The list of time types.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder timeType(java.util.List<Integer> timeType) {
            this.putQueryParameter("TimeType", timeType);
            this.timeType = timeType;
            return this;
        }

        /**
         * <p>The executor type.</p>
         * 
         * <strong>example:</strong>
         * <p>openclaw</p>
         */
        public Builder workerType(String workerType) {
            this.putQueryParameter("WorkerType", workerType);
            this.workerType = workerType;
            return this;
        }

        @Override
        public ListExecutorGroupRequest build() {
            return new ListExecutorGroupRequest(this);
        } 

    } 

}
