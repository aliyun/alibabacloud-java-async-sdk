// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

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
 * {@link DescribeCloudbenchTaskConfigRequest} extends {@link RequestModel}
 *
 * <p>DescribeCloudbenchTaskConfigRequest</p>
 */
public class DescribeCloudbenchTaskConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskId;

    private DescribeCloudbenchTaskConfigRequest(Builder builder) {
        super(builder);
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCloudbenchTaskConfigRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeCloudbenchTaskConfigRequest, Builder> {
        private String taskId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCloudbenchTaskConfigRequest request) {
            super(request);
            this.taskId = request.taskId;
        } 

        /**
         * <p>The task ID. You can call the <a href="https://help.aliyun.com/document_detail/230670.html">DescribeCloudBenchTasks</a> operation to query the task ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>e5cec704-0518-430f-8263-76f4dcds****</p>
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public DescribeCloudbenchTaskConfigRequest build() {
            return new DescribeCloudbenchTaskConfigRequest(this);
        } 

    } 

}
