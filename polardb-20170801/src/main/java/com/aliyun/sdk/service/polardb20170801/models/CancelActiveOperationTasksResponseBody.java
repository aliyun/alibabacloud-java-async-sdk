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
 * {@link CancelActiveOperationTasksResponseBody} extends {@link TeaModel}
 *
 * <p>CancelActiveOperationTasksResponseBody</p>
 */
public class CancelActiveOperationTasksResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TaskIds")
    private String taskIds;

    private CancelActiveOperationTasksResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.taskIds = builder.taskIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CancelActiveOperationTasksResponseBody create() {
        return builder().build();
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

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TaskIds.
         */
        public Builder taskIds(String taskIds) {
            this.taskIds = taskIds;
            return this;
        }

        public CancelActiveOperationTasksResponseBody build() {
            return new CancelActiveOperationTasksResponseBody(this);
        } 

    } 

}
