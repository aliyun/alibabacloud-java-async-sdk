// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link ModifyActiveOperationTasksResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyActiveOperationTasksResponseBody</p>
 */
public class ModifyActiveOperationTasksResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TaskIds")
    private String taskIds;

    private ModifyActiveOperationTasksResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.taskIds = builder.taskIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyActiveOperationTasksResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return taskIds
     */
    public String getTaskIds() {
        return this.taskIds;
    }

    public static final class Builder {
        private String requestId; 
        private String taskIds; 

        private Builder() {
        } 

        private Builder(ModifyActiveOperationTasksResponseBody model) {
            this.requestId = model.requestId;
            this.taskIds = model.taskIds;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>42CD2EF5-D77E-5AD4-961B-159330D98286</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The task IDs.</p>
         * 
         * <strong>example:</strong>
         * <p>11111,22222</p>
         */
        public Builder taskIds(String taskIds) {
            this.taskIds = taskIds;
            return this;
        }

        public ModifyActiveOperationTasksResponseBody build() {
            return new ModifyActiveOperationTasksResponseBody(this);
        } 

    } 

}
