// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link DescribeTaskDispatchStatusRequest} extends {@link RequestModel}
 *
 * <p>DescribeTaskDispatchStatusRequest</p>
 */
public class DescribeTaskDispatchStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    private DescribeTaskDispatchStatusRequest(Builder builder) {
        super(builder);
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTaskDispatchStatusRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeTaskDispatchStatusRequest, Builder> {
        private String taskId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeTaskDispatchStatusRequest request) {
            super(request);
            this.taskId = request.taskId;
        } 

        /**
         * <p>The task ID, which is the unique identifier of the log configuration modification task. Obtain this value from the TaskId response parameter of the ModifySlsDispatchConfig operation.</p>
         * 
         * <strong>example:</strong>
         * <p>65db4ce2418b44b3be7c3xxxxx</p>
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public DescribeTaskDispatchStatusRequest build() {
            return new DescribeTaskDispatchStatusRequest(this);
        } 

    } 

}
