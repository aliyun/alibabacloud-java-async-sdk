// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202.models;

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
 * {@link ModifyDBInstanceClassResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyDBInstanceClassResponseBody</p>
 */
public class ModifyDBInstanceClassResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("OrderId")
    private String orderId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TaskId")
    private Integer taskId;

    private ModifyDBInstanceClassResponseBody(Builder builder) {
        this.orderId = builder.orderId;
        this.requestId = builder.requestId;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDBInstanceClassResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return orderId
     */
    public String getOrderId() {
        return this.orderId;
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
    public Integer getTaskId() {
        return this.taskId;
    }

    public static final class Builder {
        private String orderId; 
        private String requestId; 
        private Integer taskId; 

        private Builder() {
        } 

        private Builder(ModifyDBInstanceClassResponseBody model) {
            this.orderId = model.orderId;
            this.requestId = model.requestId;
            this.taskId = model.taskId;
        } 

        /**
         * <p>The order ID. An order is generated when you upgrade or downgrade an instance, or change the instance specifications.</p>
         * 
         * <strong>example:</strong>
         * <p>20211103105558</p>
         */
        public Builder orderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>FEA5DC20-6D8A-5979-97AA-FC57546ADC20</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the instance specification change task.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder taskId(Integer taskId) {
            this.taskId = taskId;
            return this;
        }

        public ModifyDBInstanceClassResponseBody build() {
            return new ModifyDBInstanceClassResponseBody(this);
        } 

    } 

}
