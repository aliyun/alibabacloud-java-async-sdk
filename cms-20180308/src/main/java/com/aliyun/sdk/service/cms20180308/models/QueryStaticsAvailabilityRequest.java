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
 * {@link QueryStaticsAvailabilityRequest} extends {@link RequestModel}
 *
 * <p>QueryStaticsAvailabilityRequest</p>
 */
public class QueryStaticsAvailabilityRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TimeRange")
    private String timeRange;

    private QueryStaticsAvailabilityRequest(Builder builder) {
        super(builder);
        this.taskId = builder.taskId;
        this.timeRange = builder.timeRange;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryStaticsAvailabilityRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return timeRange
     */
    public String getTimeRange() {
        return this.timeRange;
    }

    public static final class Builder extends Request.Builder<QueryStaticsAvailabilityRequest, Builder> {
        private String taskId; 
        private String timeRange; 

        private Builder() {
            super();
        } 

        private Builder(QueryStaticsAvailabilityRequest request) {
            super(request);
            this.taskId = request.taskId;
            this.timeRange = request.timeRange;
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
         * TimeRange.
         */
        public Builder timeRange(String timeRange) {
            this.putQueryParameter("TimeRange", timeRange);
            this.timeRange = timeRange;
            return this;
        }

        @Override
        public QueryStaticsAvailabilityRequest build() {
            return new QueryStaticsAvailabilityRequest(this);
        } 

    } 

}
