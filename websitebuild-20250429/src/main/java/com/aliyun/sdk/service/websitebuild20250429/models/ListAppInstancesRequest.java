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
 * {@link ListAppInstancesRequest} extends {@link RequestModel}
 *
 * <p>ListAppInstancesRequest</p>
 */
public class ListAppInstancesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizId")
    private String bizId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizIds")
    private java.util.List<String> bizIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTimeBegin")
    private String endTimeBegin;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTimeEnd")
    private String endTimeEnd;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Extend")
    private String extend;

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
    @com.aliyun.core.annotation.NameInMap("Query")
    private String query;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueryMode")
    private String queryMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StatusList")
    private java.util.List<String> statusList;

    private ListAppInstancesRequest(Builder builder) {
        super(builder);
        this.bizId = builder.bizId;
        this.bizIds = builder.bizIds;
        this.endTimeBegin = builder.endTimeBegin;
        this.endTimeEnd = builder.endTimeEnd;
        this.extend = builder.extend;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.orderColumn = builder.orderColumn;
        this.orderType = builder.orderType;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.query = builder.query;
        this.queryMode = builder.queryMode;
        this.statusList = builder.statusList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAppInstancesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    /**
     * @return bizIds
     */
    public java.util.List<String> getBizIds() {
        return this.bizIds;
    }

    /**
     * @return endTimeBegin
     */
    public String getEndTimeBegin() {
        return this.endTimeBegin;
    }

    /**
     * @return endTimeEnd
     */
    public String getEndTimeEnd() {
        return this.endTimeEnd;
    }

    /**
     * @return extend
     */
    public String getExtend() {
        return this.extend;
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
     * @return query
     */
    public String getQuery() {
        return this.query;
    }

    /**
     * @return queryMode
     */
    public String getQueryMode() {
        return this.queryMode;
    }

    /**
     * @return statusList
     */
    public java.util.List<String> getStatusList() {
        return this.statusList;
    }

    public static final class Builder extends Request.Builder<ListAppInstancesRequest, Builder> {
        private String bizId; 
        private java.util.List<String> bizIds; 
        private String endTimeBegin; 
        private String endTimeEnd; 
        private String extend; 
        private Integer maxResults; 
        private String nextToken; 
        private String orderColumn; 
        private String orderType; 
        private Integer pageNum; 
        private Integer pageSize; 
        private String query; 
        private String queryMode; 
        private java.util.List<String> statusList; 

        private Builder() {
            super();
        } 

        private Builder(ListAppInstancesRequest request) {
            super(request);
            this.bizId = request.bizId;
            this.bizIds = request.bizIds;
            this.endTimeBegin = request.endTimeBegin;
            this.endTimeEnd = request.endTimeEnd;
            this.extend = request.extend;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.orderColumn = request.orderColumn;
            this.orderType = request.orderType;
            this.pageNum = request.pageNum;
            this.pageSize = request.pageSize;
            this.query = request.query;
            this.queryMode = request.queryMode;
            this.statusList = request.statusList;
        } 

        /**
         * <p>The business ID.</p>
         * 
         * <strong>example:</strong>
         * <p>WS20250731233102000001</p>
         */
        public Builder bizId(String bizId) {
            this.putQueryParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
        }

        /**
         * <p>The list of business IDs for the application instances.</p>
         */
        public Builder bizIds(java.util.List<String> bizIds) {
            String bizIdsShrink = shrink(bizIds, "BizIds", "json");
            this.putQueryParameter("BizIds", bizIdsShrink);
            this.bizIds = bizIds;
            return this;
        }

        /**
         * <p>The expiration start time.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-12-18T14:30:00Z</p>
         */
        public Builder endTimeBegin(String endTimeBegin) {
            this.putQueryParameter("EndTimeBegin", endTimeBegin);
            this.endTimeBegin = endTimeBegin;
            return this;
        }

        /**
         * <p>The expiration end time.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-12-31T14:30:00Z</p>
         */
        public Builder endTimeEnd(String endTimeEnd) {
            this.putQueryParameter("EndTimeEnd", endTimeEnd);
            this.endTimeEnd = endTimeEnd;
            return this;
        }

        /**
         * <p>The extended information.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder extend(String extend) {
            this.putQueryParameter("Extend", extend);
            this.extend = extend;
            return this;
        }

        /**
         * <p>The maximum number of results to return for each query.</p>
         * <p>Valid values: 10 to 100. Default value: 20.</p>
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
         * <p>The token that is used to start the next query. This parameter is empty if no subsequent query is required.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAARbaCuN6hiD08qrLdwJ9Fh3BFw8paIJ7ylB6A7Qn9JjM</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The sort field.</p>
         * 
         * <strong>example:</strong>
         * <p>gmtCreated</p>
         */
        public Builder orderColumn(String orderColumn) {
            this.putQueryParameter("OrderColumn", orderColumn);
            this.orderColumn = orderColumn;
            return this;
        }

        /**
         * <p>The sort order. Valid values: ASC and DESC.</p>
         * 
         * <strong>example:</strong>
         * <p>DOWNGRADE</p>
         */
        public Builder orderType(String orderType) {
            this.putQueryParameter("OrderType", orderType);
            this.orderType = orderType;
            return this;
        }

        /**
         * <p>The page number. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder pageNum(Integer pageNum) {
            this.putQueryParameter("PageNum", pageNum);
            this.pageNum = pageNum;
            return this;
        }

        /**
         * <p>The number of entries per page. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The query parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;RequestId\&quot;:\&quot;\&quot;}</p>
         */
        public Builder query(String query) {
            this.putQueryParameter("Query", query);
            this.query = query;
            return this;
        }

        /**
         * <p>The query mode. A value of CONTENT_CREATION indicates a lightweight query for the content creation site selector, which queries only published sites and does not load aggregated information such as profiles, services, and AI staff.</p>
         * 
         * <strong>example:</strong>
         * <p>CONTENT_CREATION</p>
         */
        public Builder queryMode(String queryMode) {
            this.putQueryParameter("QueryMode", queryMode);
            this.queryMode = queryMode;
            return this;
        }

        /**
         * <p>The status range.</p>
         */
        public Builder statusList(java.util.List<String> statusList) {
            String statusListShrink = shrink(statusList, "StatusList", "json");
            this.putQueryParameter("StatusList", statusListShrink);
            this.statusList = statusList;
            return this;
        }

        @Override
        public ListAppInstancesRequest build() {
            return new ListAppInstancesRequest(this);
        } 

    } 

}
