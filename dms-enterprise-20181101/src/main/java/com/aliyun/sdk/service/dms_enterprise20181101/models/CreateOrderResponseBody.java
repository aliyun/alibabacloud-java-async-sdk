// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateOrderResponseBody} extends {@link TeaModel}
 *
 * <p>CreateOrderResponseBody</p>
 */
public class CreateOrderResponseBody extends TeaModel {
    @NameInMap("CreateOrderResult")
    private CreateOrderResult createOrderResult;

    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private CreateOrderResponseBody(Builder builder) {
        this.createOrderResult = builder.createOrderResult;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateOrderResponseBody create() {
        return builder().build();
    }

    /**
     * @return createOrderResult
     */
    public CreateOrderResult getCreateOrderResult() {
        return this.createOrderResult;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private CreateOrderResult createOrderResult; 
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

        /**
         * The ID of the request.
         */
        public Builder createOrderResult(CreateOrderResult createOrderResult) {
            this.createOrderResult = createOrderResult;
            return this;
        }

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * ## PluginParam parameter
         * <p>
         * 
         * ```
         * 
         * # Change a schema design.
         *  {
         *     "title": "test", // The name of the ticket.
         *     "description": "test", // The description of the ticket.
         *     "dbId": 11****, // The database to which changes are made.
         *     "logic": false, // Specifies whether the database is a logical database.
         *     "relatedIds": [], // The IDs of the stakeholders that are involved in the ticket.
         *   }
         * 
         * # Export data.
         *  {
         *   "classify": "Reason", // The purpose of the ticket.
         *   "dbId": 17****, // The ID of the database from which data is exported.
         *   "exeSQL": "select 1", // The SQL statement that is executed to export data.
         *   "logic": false, // Specifies whether the database is a logical database.
         *   "ignoreAffectRows": false, // Specifies whether to ignore the affected rows.
         *   "affectRows": 1, // The estimated number of affected rows.
         *   "ignoreAffectRowsReason": "" // The reason for ignoring the affected rows.
         *  }
         * 
         * If you need to create more types of tickets, submit a ticket for consultation. 
         * ```
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public CreateOrderResponseBody build() {
            return new CreateOrderResponseBody(this);
        } 

    } 

    public static class CreateOrderResult extends TeaModel {
        @NameInMap("OrderIds")
        private java.util.List < Long > orderIds;

        private CreateOrderResult(Builder builder) {
            this.orderIds = builder.orderIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CreateOrderResult create() {
            return builder().build();
        }

        /**
         * @return orderIds
         */
        public java.util.List < Long > getOrderIds() {
            return this.orderIds;
        }

        public static final class Builder {
            private java.util.List < Long > orderIds; 

            /**
             * OrderIds.
             */
            public Builder orderIds(java.util.List < Long > orderIds) {
                this.orderIds = orderIds;
                return this;
            }

            public CreateOrderResult build() {
                return new CreateOrderResult(this);
            } 

        } 

    }
}
