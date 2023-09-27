// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ververica20220718.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AsyncResourcePlanOperationResult} extends {@link TeaModel}
 *
 * <p>AsyncResourcePlanOperationResult</p>
 */
public class AsyncResourcePlanOperationResult extends TeaModel {
    @NameInMap("message")
    private String message;

    @NameInMap("plan")
    private String plan;

    @NameInMap("ticketStatus")
    private String ticketStatus;

    private AsyncResourcePlanOperationResult(Builder builder) {
        this.message = builder.message;
        this.plan = builder.plan;
        this.ticketStatus = builder.ticketStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AsyncResourcePlanOperationResult create() {
        return builder().build();
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return plan
     */
    public String getPlan() {
        return this.plan;
    }

    /**
     * @return ticketStatus
     */
    public String getTicketStatus() {
        return this.ticketStatus;
    }

    public static final class Builder {
        private String message; 
        private String plan; 
        private String ticketStatus; 

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * plan.
         */
        public Builder plan(String plan) {
            this.plan = plan;
            return this;
        }

        /**
         * ticketStatus.
         */
        public Builder ticketStatus(String ticketStatus) {
            this.ticketStatus = ticketStatus;
            return this;
        }

        public AsyncResourcePlanOperationResult build() {
            return new AsyncResourcePlanOperationResult(this);
        } 

    } 

}
