// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20180308.models;

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
 * {@link QueryTaskMonitorDataRequest} extends {@link RequestModel}
 *
 * <p>QueryTaskMonitorDataRequest</p>
 */
public class QueryTaskMonitorDataRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Cursor")
    private String cursor;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Length")
    private Integer length;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Period")
    private String period;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("metricName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String metricName;

    private QueryTaskMonitorDataRequest(Builder builder) {
        super(builder);
        this.cursor = builder.cursor;
        this.endTime = builder.endTime;
        this.length = builder.length;
        this.period = builder.period;
        this.startTime = builder.startTime;
        this.taskId = builder.taskId;
        this.type = builder.type;
        this.metricName = builder.metricName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryTaskMonitorDataRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cursor
     */
    public String getCursor() {
        return this.cursor;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return length
     */
    public Integer getLength() {
        return this.length;
    }

    /**
     * @return period
     */
    public String getPeriod() {
        return this.period;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return metricName
     */
    public String getMetricName() {
        return this.metricName;
    }

    public static final class Builder extends Request.Builder<QueryTaskMonitorDataRequest, Builder> {
        private String cursor; 
        private String endTime; 
        private Integer length; 
        private String period; 
        private String startTime; 
        private String taskId; 
        private String type; 
        private String metricName; 

        private Builder() {
            super();
        } 

        private Builder(QueryTaskMonitorDataRequest request) {
            super(request);
            this.cursor = request.cursor;
            this.endTime = request.endTime;
            this.length = request.length;
            this.period = request.period;
            this.startTime = request.startTime;
            this.taskId = request.taskId;
            this.type = request.type;
            this.metricName = request.metricName;
        } 

        /**
         * Cursor.
         */
        public Builder cursor(String cursor) {
            this.putQueryParameter("Cursor", cursor);
            this.cursor = cursor;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * Length.
         */
        public Builder length(Integer length) {
            this.putQueryParameter("Length", length);
            this.length = length;
            return this;
        }

        /**
         * Period.
         */
        public Builder period(String period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder metricName(String metricName) {
            this.putQueryParameter("metricName", metricName);
            this.metricName = metricName;
            return this;
        }

        @Override
        public QueryTaskMonitorDataRequest build() {
            return new QueryTaskMonitorDataRequest(this);
        } 

    } 

}
