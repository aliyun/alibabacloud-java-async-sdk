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

        private Builder(CancelActiveOperationTasksResponseBody model) {
            this.requestId = model.requestId;
            this.taskIds = model.taskIds;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>25C70FF3-D49B-594D-BECE-0DE2BA1D8BBB</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The IDs of O&amp;M events that are canceled at a time. Separate multiple IDs with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>2355,2352</p>
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
