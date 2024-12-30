// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

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
         * <p>The content of the ticket.</p>
         */
        public Builder createOrderResult(CreateOrderResult createOrderResult) {
            this.createOrderResult = createOrderResult;
            return this;
        }

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>UnknownError</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message returned if the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>UnknownError</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The request ID. You can use the ID to query logs and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>7FAD400F-7A5C-4193-8F9A-39D86C4F0231</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public CreateDataExportOrderResponseBody build() {
            return new CreateDataExportOrderResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateDataExportOrderResponseBody} extends {@link TeaModel}
     *
     * <p>CreateDataExportOrderResponseBody</p>
     */
    public static class CreateOrderResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateOrderResult")
        private java.util.List<Long> createOrderResult;

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
        public java.util.List<Long> getCreateOrderResult() {
            return this.createOrderResult;
        }

        public static final class Builder {
            private java.util.List<Long> createOrderResult; 

            /**
             * <p>The content of the ticket.</p>
             */
            public Builder createOrderResult(java.util.List<Long> createOrderResult) {
                this.createOrderResult = createOrderResult;
                return this;
            }

            public CreateOrderResult build() {
                return new CreateOrderResult(this);
            } 

        } 

    }
}
