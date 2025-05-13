// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20230516.models;

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
 * {@link UpdateTaskCustomerResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateTaskCustomerResponseBody</p>
 */
public class UpdateTaskCustomerResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Long code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Model")
    private Model model;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private String success;

    @com.aliyun.core.annotation.NameInMap("Timestamp")
    private Long timestamp;

    private UpdateTaskCustomerResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.model = builder.model;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.timestamp = builder.timestamp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateTaskCustomerResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public Long getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return model
     */
    public Model getModel() {
        return this.model;
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
    public String getSuccess() {
        return this.success;
    }

    /**
     * @return timestamp
     */
    public Long getTimestamp() {
        return this.timestamp;
    }

    public static final class Builder {
        private Long code; 
        private String message; 
        private Model model; 
        private String requestId; 
        private String success; 
        private Long timestamp; 

        private Builder() {
        } 

        private Builder(UpdateTaskCustomerResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.model = model.model;
            this.requestId = model.requestId;
            this.success = model.success;
            this.timestamp = model.timestamp;
        } 

        /**
         * Code.
         */
        public Builder code(Long code) {
            this.code = code;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * Model.
         */
        public Builder model(Model model) {
            this.model = model;
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
         * Success.
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        /**
         * Timestamp.
         */
        public Builder timestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        public UpdateTaskCustomerResponseBody build() {
            return new UpdateTaskCustomerResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link UpdateTaskCustomerResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateTaskCustomerResponseBody</p>
     */
    public static class Model extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("UnHandleNumbers")
        private java.util.List<String> unHandleNumbers;

        private Model(Builder builder) {
            this.unHandleNumbers = builder.unHandleNumbers;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Model create() {
            return builder().build();
        }

        /**
         * @return unHandleNumbers
         */
        public java.util.List<String> getUnHandleNumbers() {
            return this.unHandleNumbers;
        }

        public static final class Builder {
            private java.util.List<String> unHandleNumbers; 

            private Builder() {
            } 

            private Builder(Model model) {
                this.unHandleNumbers = model.unHandleNumbers;
            } 

            /**
             * <p>错误手机列表</p>
             */
            public Builder unHandleNumbers(java.util.List<String> unHandleNumbers) {
                this.unHandleNumbers = unHandleNumbers;
                return this;
            }

            public Model build() {
                return new Model(this);
            } 

        } 

    }
}
