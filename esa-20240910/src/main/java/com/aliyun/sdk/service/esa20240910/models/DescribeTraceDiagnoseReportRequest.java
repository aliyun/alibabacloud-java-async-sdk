// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link DescribeTraceDiagnoseReportRequest} extends {@link RequestModel}
 *
 * <p>DescribeTraceDiagnoseReportRequest</p>
 */
public class DescribeTraceDiagnoseReportRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TraceId")
    private String traceId;

    private DescribeTraceDiagnoseReportRequest(Builder builder) {
        super(builder);
        this.taskId = builder.taskId;
        this.traceId = builder.traceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTraceDiagnoseReportRequest create() {
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
     * @return traceId
     */
    public String getTraceId() {
        return this.traceId;
    }

    public static final class Builder extends Request.Builder<DescribeTraceDiagnoseReportRequest, Builder> {
        private String taskId; 
        private String traceId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeTraceDiagnoseReportRequest request) {
            super(request);
            this.taskId = request.taskId;
            this.traceId = request.traceId;
        } 

        /**
         * TaskId.
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        /**
         * TraceId.
         */
        public Builder traceId(String traceId) {
            this.putQueryParameter("TraceId", traceId);
            this.traceId = traceId;
            return this;
        }

        @Override
        public DescribeTraceDiagnoseReportRequest build() {
            return new DescribeTraceDiagnoseReportRequest(this);
        } 

    } 

}
