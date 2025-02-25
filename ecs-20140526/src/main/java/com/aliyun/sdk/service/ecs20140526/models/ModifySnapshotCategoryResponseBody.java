// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

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
 * {@link ModifySnapshotCategoryResponseBody} extends {@link TeaModel}
 *
 * <p>ModifySnapshotCategoryResponseBody</p>
 */
public class ModifySnapshotCategoryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    private ModifySnapshotCategoryResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifySnapshotCategoryResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder {
        private String requestId; 
        private String taskId; 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>B48A12CD-1295-4A38-A8F0-0E92C937****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the archive task. You can call the DescribeTasks operation to query the status and progress of the archive task.</p>
         * 
         * <strong>example:</strong>
         * <p>t-dxh34xds**d</p>
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        public ModifySnapshotCategoryResponseBody build() {
            return new ModifySnapshotCategoryResponseBody(this);
        } 

    } 

}
