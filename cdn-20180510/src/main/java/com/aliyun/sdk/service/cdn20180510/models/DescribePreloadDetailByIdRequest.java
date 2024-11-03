// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribePreloadDetailByIdRequest} extends {@link RequestModel}
 *
 * <p>DescribePreloadDetailByIdRequest</p>
 */
public class DescribePreloadDetailByIdRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskId;

    private DescribePreloadDetailByIdRequest(Builder builder) {
        super(builder);
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePreloadDetailByIdRequest create() {
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

    public static final class Builder extends Request.Builder<DescribePreloadDetailByIdRequest, Builder> {
        private String taskId; 

        private Builder() {
            super();
        } 

        private Builder(DescribePreloadDetailByIdRequest request) {
            super(request);
            this.taskId = request.taskId;
        } 

        /**
         * <p>Queries the details of a preload task by task ID. You can query one task ID at a time.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>15423123921</p>
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public DescribePreloadDetailByIdRequest build() {
            return new DescribePreloadDetailByIdRequest(this);
        } 

    } 

}
