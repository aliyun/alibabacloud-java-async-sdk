// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDiskSpecResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyDiskSpecResponseBody</p>
 */
public class ModifyDiskSpecResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TaskId")
    private String taskId;

    @NameInMap("OrderId")
    private String orderId;

    private ModifyDiskSpecResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.taskId = builder.taskId;
        this.orderId = builder.orderId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDiskSpecResponseBody create() {
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

    /**
     * @return orderId
     */
    public String getOrderId() {
        return this.orderId;
    }

    public static final class Builder {
        private String requestId; 
        private String taskId; 
        private String orderId; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The ID of the task to change the disk configuration.
         * <p>
         * 
         * > This parameter is not returned if you modify the performance level of only one ESSD disk.
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        /**
         * The ID of the generated order.
         * <p>
         * 
         * > The Order ID is returned only when you change or modify a subscription disk.
         */
        public Builder orderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        public ModifyDiskSpecResponseBody build() {
            return new ModifyDiskSpecResponseBody(this);
        } 

    } 

}
