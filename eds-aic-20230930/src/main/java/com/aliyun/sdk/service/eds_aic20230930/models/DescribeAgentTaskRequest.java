// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_aic20230930.models;

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
 * {@link DescribeAgentTaskRequest} extends {@link RequestModel}
 *
 * <p>DescribeAgentTaskRequest</p>
 */
public class DescribeAgentTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskIds")
    private java.util.List<String> taskIds;

    private DescribeAgentTaskRequest(Builder builder) {
        super(builder);
        this.taskIds = builder.taskIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAgentTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return taskIds
     */
    public java.util.List<String> getTaskIds() {
        return this.taskIds;
    }

    public static final class Builder extends Request.Builder<DescribeAgentTaskRequest, Builder> {
        private java.util.List<String> taskIds; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAgentTaskRequest request) {
            super(request);
            this.taskIds = request.taskIds;
        } 

        /**
         * TaskIds.
         */
        public Builder taskIds(java.util.List<String> taskIds) {
            this.putQueryParameter("TaskIds", taskIds);
            this.taskIds = taskIds;
            return this;
        }

        @Override
        public DescribeAgentTaskRequest build() {
            return new DescribeAgentTaskRequest(this);
        } 

    } 

}
