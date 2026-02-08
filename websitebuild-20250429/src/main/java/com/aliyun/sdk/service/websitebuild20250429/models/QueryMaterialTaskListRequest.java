// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.websitebuild20250429.models;

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
 * {@link QueryMaterialTaskListRequest} extends {@link RequestModel}
 *
 * <p>QueryMaterialTaskListRequest</p>
 */
public class QueryMaterialTaskListRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderColumn")
    private String orderColumn;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderType")
    private String orderType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNum")
    private Integer pageNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StatusList")
    private java.util.List<String> statusList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskTypeList")
    private java.util.List<String> taskTypeList;

    private QueryMaterialTaskListRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.orderColumn = builder.orderColumn;
        this.orderType = builder.orderType;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.statusList = builder.statusList;
        this.taskTypeList = builder.taskTypeList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryMaterialTaskListRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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
     * @return orderColumn
     */
    public String getOrderColumn() {
        return this.orderColumn;
    }

    /**
     * @return orderType
     */
    public String getOrderType() {
        return this.orderType;
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
     * @return statusList
     */
    public java.util.List<String> getStatusList() {
        return this.statusList;
    }

    /**
     * @return taskTypeList
     */
    public java.util.List<String> getTaskTypeList() {
        return this.taskTypeList;
    }

    public static final class Builder extends Request.Builder<QueryMaterialTaskListRequest, Builder> {
        private String regionId; 
        private Integer maxResults; 
        private String nextToken; 
        private String orderColumn; 
        private String orderType; 
        private Integer pageNum; 
        private Integer pageSize; 
        private java.util.List<String> statusList; 
        private java.util.List<String> taskTypeList; 

        private Builder() {
            super();
        } 

        private Builder(QueryMaterialTaskListRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.orderColumn = request.orderColumn;
            this.orderType = request.orderType;
            this.pageNum = request.pageNum;
            this.pageSize = request.pageSize;
            this.statusList = request.statusList;
            this.taskTypeList = request.taskTypeList;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
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
         * OrderColumn.
         */
        public Builder orderColumn(String orderColumn) {
            this.putQueryParameter("OrderColumn", orderColumn);
            this.orderColumn = orderColumn;
            return this;
        }

        /**
         * OrderType.
         */
        public Builder orderType(String orderType) {
            this.putQueryParameter("OrderType", orderType);
            this.orderType = orderType;
            return this;
        }

        /**
         * PageNum.
         */
        public Builder pageNum(Integer pageNum) {
            this.putQueryParameter("PageNum", pageNum);
            this.pageNum = pageNum;
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
         * StatusList.
         */
        public Builder statusList(java.util.List<String> statusList) {
            String statusListShrink = shrink(statusList, "StatusList", "json");
            this.putQueryParameter("StatusList", statusListShrink);
            this.statusList = statusList;
            return this;
        }

        /**
         * TaskTypeList.
         */
        public Builder taskTypeList(java.util.List<String> taskTypeList) {
            String taskTypeListShrink = shrink(taskTypeList, "TaskTypeList", "json");
            this.putQueryParameter("TaskTypeList", taskTypeListShrink);
            this.taskTypeList = taskTypeList;
            return this;
        }

        @Override
        public QueryMaterialTaskListRequest build() {
            return new QueryMaterialTaskListRequest(this);
        } 

    } 

}
