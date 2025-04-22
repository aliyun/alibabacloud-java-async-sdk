// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maxcompute20220104.models;

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
 * {@link QueryTunnelMetricDetailRequest} extends {@link RequestModel}
 *
 * <p>QueryTunnelMetricDetailRequest</p>
 */
public class QueryTunnelMetricDetailRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("metric")
    @com.aliyun.core.annotation.Validation(required = true)
    private String metric;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ascOrder")
    private Boolean ascOrder;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("groupList")
    private java.util.List<String> groupList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("limit")
    private Long limit;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("operationList")
    private java.util.List<String> operationList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("orderColumn")
    private String orderColumn;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("project")
    private String project;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("quotaNickname")
    private String quotaNickname;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("tableList")
    private java.util.List<String> tableList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("endTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("startTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long startTime;

    private QueryTunnelMetricDetailRequest(Builder builder) {
        super(builder);
        this.metric = builder.metric;
        this.ascOrder = builder.ascOrder;
        this.groupList = builder.groupList;
        this.limit = builder.limit;
        this.operationList = builder.operationList;
        this.orderColumn = builder.orderColumn;
        this.project = builder.project;
        this.quotaNickname = builder.quotaNickname;
        this.tableList = builder.tableList;
        this.endTime = builder.endTime;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryTunnelMetricDetailRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return metric
     */
    public String getMetric() {
        return this.metric;
    }

    /**
     * @return ascOrder
     */
    public Boolean getAscOrder() {
        return this.ascOrder;
    }

    /**
     * @return groupList
     */
    public java.util.List<String> getGroupList() {
        return this.groupList;
    }

    /**
     * @return limit
     */
    public Long getLimit() {
        return this.limit;
    }

    /**
     * @return operationList
     */
    public java.util.List<String> getOperationList() {
        return this.operationList;
    }

    /**
     * @return orderColumn
     */
    public String getOrderColumn() {
        return this.orderColumn;
    }

    /**
     * @return project
     */
    public String getProject() {
        return this.project;
    }

    /**
     * @return quotaNickname
     */
    public String getQuotaNickname() {
        return this.quotaNickname;
    }

    /**
     * @return tableList
     */
    public java.util.List<String> getTableList() {
        return this.tableList;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<QueryTunnelMetricDetailRequest, Builder> {
        private String metric; 
        private Boolean ascOrder; 
        private java.util.List<String> groupList; 
        private Long limit; 
        private java.util.List<String> operationList; 
        private String orderColumn; 
        private String project; 
        private String quotaNickname; 
        private java.util.List<String> tableList; 
        private Long endTime; 
        private Long startTime; 

        private Builder() {
            super();
        } 

        private Builder(QueryTunnelMetricDetailRequest request) {
            super(request);
            this.metric = request.metric;
            this.ascOrder = request.ascOrder;
            this.groupList = request.groupList;
            this.limit = request.limit;
            this.operationList = request.operationList;
            this.orderColumn = request.orderColumn;
            this.project = request.project;
            this.quotaNickname = request.quotaNickname;
            this.tableList = request.tableList;
            this.endTime = request.endTime;
            this.startTime = request.startTime;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>slot_usage_detail</p>
         */
        public Builder metric(String metric) {
            this.putPathParameter("metric", metric);
            this.metric = metric;
            return this;
        }

        /**
         * ascOrder.
         */
        public Builder ascOrder(Boolean ascOrder) {
            this.putBodyParameter("ascOrder", ascOrder);
            this.ascOrder = ascOrder;
            return this;
        }

        /**
         * groupList.
         */
        public Builder groupList(java.util.List<String> groupList) {
            this.putBodyParameter("groupList", groupList);
            this.groupList = groupList;
            return this;
        }

        /**
         * limit.
         */
        public Builder limit(Long limit) {
            this.putBodyParameter("limit", limit);
            this.limit = limit;
            return this;
        }

        /**
         * operationList.
         */
        public Builder operationList(java.util.List<String> operationList) {
            this.putBodyParameter("operationList", operationList);
            this.operationList = operationList;
            return this;
        }

        /**
         * orderColumn.
         */
        public Builder orderColumn(String orderColumn) {
            this.putBodyParameter("orderColumn", orderColumn);
            this.orderColumn = orderColumn;
            return this;
        }

        /**
         * project.
         */
        public Builder project(String project) {
            this.putBodyParameter("project", project);
            this.project = project;
            return this;
        }

        /**
         * quotaNickname.
         */
        public Builder quotaNickname(String quotaNickname) {
            this.putBodyParameter("quotaNickname", quotaNickname);
            this.quotaNickname = quotaNickname;
            return this;
        }

        /**
         * tableList.
         */
        public Builder tableList(java.util.List<String> tableList) {
            this.putBodyParameter("tableList", tableList);
            this.tableList = tableList;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1735536322</p>
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("endTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1735534322</p>
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("startTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public QueryTunnelMetricDetailRequest build() {
            return new QueryTunnelMetricDetailRequest(this);
        } 

    } 

}
