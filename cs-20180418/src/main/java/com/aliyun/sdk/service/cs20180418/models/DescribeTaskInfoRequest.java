// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20180418.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTaskInfoRequest} extends {@link RequestModel}
 *
 * <p>DescribeTaskInfoRequest</p>
 */
public class DescribeTaskInfoRequest extends Request {
    @Path
    @NameInMap("TaskId")
    @Validation(required = true)
    private String taskId;

    private DescribeTaskInfoRequest(Builder builder) {
        super(builder);
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTaskInfoRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeTaskInfoRequest, Builder> {
        private String taskId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeTaskInfoRequest response) {
            super(response);
            this.taskId = response.taskId;
        } 

        /**
         * TaskId.
         */
        public Builder taskId(String taskId) {
            this.putPathParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public DescribeTaskInfoRequest build() {
            return new DescribeTaskInfoRequest(this);
        } 

    } 

}
