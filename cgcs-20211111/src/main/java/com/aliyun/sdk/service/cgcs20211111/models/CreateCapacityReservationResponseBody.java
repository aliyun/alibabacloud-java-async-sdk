// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cgcs20211111.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCapacityReservationResponseBody} extends {@link TeaModel}
 *
 * <p>CreateCapacityReservationResponseBody</p>
 */
public class CreateCapacityReservationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CurrMaxAllocatableSessionCapacity")
    private Integer currMaxAllocatableSessionCapacity;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    private CreateCapacityReservationResponseBody(Builder builder) {
        this.currMaxAllocatableSessionCapacity = builder.currMaxAllocatableSessionCapacity;
        this.requestId = builder.requestId;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCapacityReservationResponseBody create() {
        return builder().build();
    }

    /**
     * @return currMaxAllocatableSessionCapacity
     */
    public Integer getCurrMaxAllocatableSessionCapacity() {
        return this.currMaxAllocatableSessionCapacity;
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
        private Integer currMaxAllocatableSessionCapacity; 
        private String requestId; 
        private String taskId; 

        /**
         * CurrMaxAllocatableSessionCapacity.
         */
        public Builder currMaxAllocatableSessionCapacity(Integer currMaxAllocatableSessionCapacity) {
            this.currMaxAllocatableSessionCapacity = currMaxAllocatableSessionCapacity;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TaskId.
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        public CreateCapacityReservationResponseBody build() {
            return new CreateCapacityReservationResponseBody(this);
        } 

    } 

}
