// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ScaleClusterNodePoolResponseBody} extends {@link TeaModel}
 *
 * <p>ScaleClusterNodePoolResponseBody</p>
 */
public class ScaleClusterNodePoolResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("task_id")
    private String taskId;

    private ScaleClusterNodePoolResponseBody(Builder builder) {
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ScaleClusterNodePoolResponseBody create() {
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

        public ScaleClusterNodePoolResponseBody build() {
            return new ScaleClusterNodePoolResponseBody(this);
        } 

    } 

}
