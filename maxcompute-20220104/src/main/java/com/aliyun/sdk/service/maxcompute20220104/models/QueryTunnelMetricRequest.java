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
 * {@link QueryTunnelMetricRequest} extends {@link RequestModel}
 *
 * <p>QueryTunnelMetricRequest</p>
 */
public class QueryTunnelMetricRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("metric")
    @com.aliyun.core.annotation.Validation(required = true)
    private String metric;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("codeList")
    private java.util.List<Integer> codeList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("groupList")
    private java.util.List<String> groupList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("operationList")
    private java.util.List<String> operationList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("project")
    private String project;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("quotaNickname")
    private String quotaNickname;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("tableList")
    private java.util.List<String> tableList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("topN")
    private Integer topN;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("endTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("startTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("strategy")
    private String strategy;

    private QueryTunnelMetricRequest(Builder builder) {
        super(builder);
        this.metric = builder.metric;
        this.codeList = builder.codeList;
        this.groupList = builder.groupList;
        this.operationList = builder.operationList;
        this.project = builder.project;
        this.quotaNickname = builder.quotaNickname;
        this.tableList = builder.tableList;
        this.topN = builder.topN;
        this.endTime = builder.endTime;
        this.startTime = builder.startTime;
        this.strategy = builder.strategy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryTunnelMetricRequest create() {
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
     * @return codeList
     */
    public java.util.List<Integer> getCodeList() {
        return this.codeList;
    }

    /**
     * @return groupList
     */
    public java.util.List<String> getGroupList() {
        return this.groupList;
    }

    /**
     * @return operationList
     */
    public java.util.List<String> getOperationList() {
        return this.operationList;
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
     * @return topN
     */
    public Integer getTopN() {
        return this.topN;
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

    /**
     * @return strategy
     */
    public String getStrategy() {
        return this.strategy;
    }

    public static final class Builder extends Request.Builder<QueryTunnelMetricRequest, Builder> {
        private String metric; 
        private java.util.List<Integer> codeList; 
        private java.util.List<String> groupList; 
        private java.util.List<String> operationList; 
        private String project; 
        private String quotaNickname; 
        private java.util.List<String> tableList; 
        private Integer topN; 
        private Long endTime; 
        private Long startTime; 
        private String strategy; 

        private Builder() {
            super();
        } 

        private Builder(QueryTunnelMetricRequest request) {
            super(request);
            this.metric = request.metric;
            this.codeList = request.codeList;
            this.groupList = request.groupList;
            this.operationList = request.operationList;
            this.project = request.project;
            this.quotaNickname = request.quotaNickname;
            this.tableList = request.tableList;
            this.topN = request.topN;
            this.endTime = request.endTime;
            this.startTime = request.startTime;
            this.strategy = request.strategy;
        } 

        /**
         * <p>The name of the metric.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>slot_usage</p>
         */
        public Builder metric(String metric) {
            this.putPathParameter("metric", metric);
            this.metric = metric;
            return this;
        }

        /**
         * <p>A list of HTTP status codes for requests.</p>
         */
        public Builder codeList(java.util.List<Integer> codeList) {
            this.putBodyParameter("codeList", codeList);
            this.codeList = codeList;
            return this;
        }

        /**
         * <p>A list of grouping criteria.</p>
         */
        public Builder groupList(java.util.List<String> groupList) {
            this.putBodyParameter("groupList", groupList);
            this.groupList = groupList;
            return this;
        }

        /**
         * <p>A list of operation types.</p>
         */
        public Builder operationList(java.util.List<String> operationList) {
            this.putBodyParameter("operationList", operationList);
            this.operationList = operationList;
            return this;
        }

        /**
         * <p>The name of the project.</p>
         * 
         * <strong>example:</strong>
         * <p>project_a</p>
         */
        public Builder project(String project) {
            this.putBodyParameter("project", project);
            this.project = project;
            return this;
        }

        /**
         * <p>The nickname of the level-2 Tunnel quota.</p>
         * <p>The nickname of a shared quota is <code>default</code>.</p>
         * <p>The format of a dedicated quota nickname is <code>quotaNickname#subQuotaNickname</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        public Builder quotaNickname(String quotaNickname) {
            this.putBodyParameter("quotaNickname", quotaNickname);
            this.quotaNickname = quotaNickname;
            return this;
        }

        /**
         * <p>A list of table names.</p>
         * <p>The tables belong to a project. Therefore, if <code>tableList</code> is not empty, <code>project</code> cannot be empty.</p>
         */
        public Builder tableList(java.util.List<String> tableList) {
            this.putBodyParameter("tableList", tableList);
            this.tableList = tableList;
            return this;
        }

        /**
         * <p>The maximum number of data entries to return.</p>
         * <p>This parameter takes effect when the grouping criterion includes <code>table</code> or <code>ip</code>.</p>
         * <p>The default value is 10. The maximum value is 100.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder topN(Integer topN) {
            this.putBodyParameter("topN", topN);
            this.topN = topN;
            return this;
        }

        /**
         * <p>The end of the time range for the query.</p>
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
         * <p>The start of the time range for the query.</p>
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

        /**
         * <p>The data aggregation policy. The default value is <code>max</code>.</p>
         * <p>Data is collected at a frequency of 1 minute. If you query data over a long time range, the automatic step size for data display may exceed 1 minute. In this case, metrics are aggregated. This parameter specifies the aggregation logic.</p>
         * 
         * <strong>example:</strong>
         * <p>max</p>
         */
        public Builder strategy(String strategy) {
            this.putQueryParameter("strategy", strategy);
            this.strategy = strategy;
            return this;
        }

        @Override
        public QueryTunnelMetricRequest build() {
            return new QueryTunnelMetricRequest(this);
        } 

    } 

}
