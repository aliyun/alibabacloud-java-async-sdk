// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder {
        private String taskId; 

        private Builder() {
        } 

        private Builder(ScaleClusterNodePoolResponseBody model) {
            this.taskId = model.taskId;
        } 

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>T-5faa48fb31b6b8078d00****</p>
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
