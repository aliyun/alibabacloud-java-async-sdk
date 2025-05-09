// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

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
 * {@link CreateSimilarImageClusterTaskResponseBody} extends {@link TeaModel}
 *
 * <p>CreateSimilarImageClusterTaskResponseBody</p>
 */
public class CreateSimilarImageClusterTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("task_id")
    private String taskId;

    private CreateSimilarImageClusterTaskResponseBody(Builder builder) {
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSimilarImageClusterTaskResponseBody create() {
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

        private Builder(CreateSimilarImageClusterTaskResponseBody model) {
            this.taskId = model.taskId;
        } 

        /**
         * task_id.
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        public CreateSimilarImageClusterTaskResponseBody build() {
            return new CreateSimilarImageClusterTaskResponseBody(this);
        } 

    } 

}
