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
 * {@link QueryStorageMetricRequest} extends {@link RequestModel}
 *
 * <p>QueryStorageMetricRequest</p>
 */
public class QueryStorageMetricRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("metric")
    @com.aliyun.core.annotation.Validation(required = true)
    private String metric;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("projectList")
    private java.util.List<String> projectList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("typeList")
    private java.util.List<String> typeList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("endTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("startTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long startTime;

    private QueryStorageMetricRequest(Builder builder) {
        super(builder);
        this.metric = builder.metric;
        this.projectList = builder.projectList;
        this.typeList = builder.typeList;
        this.endTime = builder.endTime;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryStorageMetricRequest create() {
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
     * @return projectList
     */
    public java.util.List<String> getProjectList() {
        return this.projectList;
    }

    /**
     * @return typeList
     */
    public java.util.List<String> getTypeList() {
        return this.typeList;
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

    public static final class Builder extends Request.Builder<QueryStorageMetricRequest, Builder> {
        private String metric; 
        private java.util.List<String> projectList; 
        private java.util.List<String> typeList; 
        private Long endTime; 
        private Long startTime; 

        private Builder() {
            super();
        } 

        private Builder(QueryStorageMetricRequest request) {
            super(request);
            this.metric = request.metric;
            this.projectList = request.projectList;
            this.typeList = request.typeList;
            this.endTime = request.endTime;
            this.startTime = request.startTime;
        } 

        /**
         * <p>The name of the metric. Valid value:</p>
         * <ul>
         * <li>summary</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>summary</p>
         */
        public Builder metric(String metric) {
            this.putPathParameter("metric", metric);
            this.metric = metric;
            return this;
        }

        /**
         * <p>The names of the projects.</p>
         */
        public Builder projectList(java.util.List<String> projectList) {
            this.putBodyParameter("projectList", projectList);
            this.projectList = projectList;
            return this;
        }

        /**
         * <p>The storage class. Valid values include the following:</p>
         * <ul>
         * <li><p>totalStorage</p>
         * </li>
         * <li><p>longTermStorage</p>
         * </li>
         * <li><p>lowFreqStorage</p>
         * </li>
         * <li><p>standardStorage</p>
         * </li>
         * <li><p>recycleBinStorage</p>
         * </li>
         * </ul>
         */
        public Builder typeList(java.util.List<String> typeList) {
            this.putBodyParameter("typeList", typeList);
            this.typeList = typeList;
            return this;
        }

        /**
         * <p>The end of the time range to query.</p>
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
         * <p>The start of the time range to query.</p>
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
        public QueryStorageMetricRequest build() {
            return new QueryStorageMetricRequest(this);
        } 

    } 

}
