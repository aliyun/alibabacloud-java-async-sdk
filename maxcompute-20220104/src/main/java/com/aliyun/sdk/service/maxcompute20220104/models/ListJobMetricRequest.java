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
 * {@link ListJobMetricRequest} extends {@link RequestModel}
 *
 * <p>ListJobMetricRequest</p>
 */
public class ListJobMetricRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("group")
    private String group;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("metric")
    private String metric;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("period")
    private Long period;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("project")
    private java.util.List<String> project;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("quota")
    private java.util.List<String> quota;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("endTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("startTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long startTime;

    private ListJobMetricRequest(Builder builder) {
        super(builder);
        this.group = builder.group;
        this.metric = builder.metric;
        this.period = builder.period;
        this.project = builder.project;
        this.quota = builder.quota;
        this.type = builder.type;
        this.endTime = builder.endTime;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListJobMetricRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return group
     */
    public String getGroup() {
        return this.group;
    }

    /**
     * @return metric
     */
    public String getMetric() {
        return this.metric;
    }

    /**
     * @return period
     */
    public Long getPeriod() {
        return this.period;
    }

    /**
     * @return project
     */
    public java.util.List<String> getProject() {
        return this.project;
    }

    /**
     * @return quota
     */
    public java.util.List<String> getQuota() {
        return this.quota;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
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

    public static final class Builder extends Request.Builder<ListJobMetricRequest, Builder> {
        private String group; 
        private String metric; 
        private Long period; 
        private java.util.List<String> project; 
        private java.util.List<String> quota; 
        private String type; 
        private Long endTime; 
        private Long startTime; 

        private Builder() {
            super();
        } 

        private Builder(ListJobMetricRequest request) {
            super(request);
            this.group = request.group;
            this.metric = request.metric;
            this.period = request.period;
            this.project = request.project;
            this.quota = request.quota;
            this.type = request.type;
            this.endTime = request.endTime;
            this.startTime = request.startTime;
        } 

        /**
         * <p>Grouping basis.</p>
         * <blockquote>
         * <p>Available values: project, quota, type, status. Meanings:</p>
         * <ul>
         * <li>project: Group and aggregate by project;</li>
         * <li>quota: Group and aggregate by quota;</li>
         * <li>type: Group and aggregate by job type;</li>
         * <li>status: Group and aggregate by job status.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>project</p>
         */
        public Builder group(String group) {
            this.putBodyParameter("group", group);
            this.group = group;
            return this;
        }

        /**
         * <p>The name of observation metric.</p>
         * 
         * <strong>example:</strong>
         * <p>num</p>
         */
        public Builder metric(String metric) {
            this.putBodyParameter("metric", metric);
            this.metric = metric;
            return this;
        }

        /**
         * <p>The monitoring statistical period.Unit:Second(s).</p>
         * 
         * <strong>example:</strong>
         * <p>3600</p>
         */
        public Builder period(Long period) {
            this.putBodyParameter("period", period);
            this.period = period;
            return this;
        }

        /**
         * <p>The name of MaxCompute projects (for filtering).</p>
         */
        public Builder project(java.util.List<String> project) {
            this.putBodyParameter("project", project);
            this.project = project;
            return this;
        }

        /**
         * <p>The nickname of computing Quota nickname used by the job (for filtering).</p>
         */
        public Builder quota(java.util.List<String> quota) {
            this.putBodyParameter("quota", quota);
            this.quota = quota;
            return this;
        }

        /**
         * <p>The type of observation metric.</p>
         * 
         * <strong>example:</strong>
         * <p>total</p>
         */
        public Builder type(String type) {
            this.putBodyParameter("type", type);
            this.type = type;
            return this;
        }

        /**
         * <p>The end time for the observation interval.</p>
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
         * <p>The start time for the observation interval.</p>
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
        public ListJobMetricRequest build() {
            return new ListJobMetricRequest(this);
        } 

    } 

}
