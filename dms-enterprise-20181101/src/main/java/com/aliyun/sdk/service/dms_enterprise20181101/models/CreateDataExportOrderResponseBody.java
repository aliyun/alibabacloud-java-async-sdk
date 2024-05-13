// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDataExportOrderResponseBody} extends {@link TeaModel}
 *
 * <p>CreateDataExportOrderResponseBody</p>
 */
public class CreateDataExportOrderResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CreateOrderResult")
    private CreateOrderResult createOrderResult;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private CreateDataExportOrderResponseBody(Builder builder) {
        this.createOrderResult = builder.createOrderResult;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDataExportOrderResponseBody create() {
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
         * The content of the ticket.
         */
        public Builder createOrderResult(CreateOrderResult createOrderResult) {
            this.createOrderResult = createOrderResult;
            return this;
        }

        /**
         * The error code.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * The error message returned if the request failed.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * The request ID. You can use the ID to query logs and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   true
         * *   false
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public CreateDataExportOrderResponseBody build() {
            return new CreateDataExportOrderResponseBody(this);
        } 

    } 

    public static class CreateOrderResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateOrderResult")
        private java.util.List < Long > createOrderResult;

        private CreateOrderResult(Builder builder) {
            this.createOrderResult = builder.createOrderResult;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CreateOrderResult create() {
            return builder().build();
        }

        /**
         * @return createOrderResult
         */
        public java.util.List < Long > getCreateOrderResult() {
            return this.createOrderResult;
        }

        public static final class Builder {
            private java.util.List < Long > createOrderResult; 

            /**
             * The content of the ticket.
             */
            public Builder createOrderResult(java.util.List < Long > createOrderResult) {
                this.createOrderResult = createOrderResult;
                return this;
            }

            public CreateOrderResult build() {
                return new CreateOrderResult(this);
            } 

        } 

    }
}
