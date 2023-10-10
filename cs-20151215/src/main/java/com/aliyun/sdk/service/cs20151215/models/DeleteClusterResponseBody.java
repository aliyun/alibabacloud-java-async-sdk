// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteClusterResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteClusterResponseBody</p>
 */
public class DeleteClusterResponseBody extends TeaModel {
    @NameInMap("task_id")
    private String taskId;

    private DeleteClusterResponseBody(Builder builder) {
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteClusterResponseBody create() {
        return builder().build();
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder {
        private String taskId; 

        /**
         * The task ID.
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        public DeleteClusterResponseBody build() {
            return new DeleteClusterResponseBody(this);
        } 

    } 

}
