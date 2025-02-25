// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link UpdateUserDeliveryTaskStatusResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateUserDeliveryTaskStatusResponseBody</p>
 */
public class UpdateUserDeliveryTaskStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("TaskName")
    private String taskName;

    private UpdateUserDeliveryTaskStatusResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.status = builder.status;
        this.taskName = builder.taskName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateUserDeliveryTaskStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return taskName
     */
    public String getTaskName() {
        return this.taskName;
    }

    public static final class Builder {
        private String requestId; 
        private String status; 
        private String taskName; 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>34DCBC8A-<strong><strong>-</strong></strong>-****-6DAA11D7DDBD</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The status of the delivery task.</p>
         * 
         * <strong>example:</strong>
         * <p>online</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The name of the delivery task.</p>
         * 
         * <strong>example:</strong>
         * <p>test_project</p>
         */
        public Builder taskName(String taskName) {
            this.taskName = taskName;
            return this;
        }

        public UpdateUserDeliveryTaskStatusResponseBody build() {
            return new UpdateUserDeliveryTaskStatusResponseBody(this);
        } 

    } 

}
