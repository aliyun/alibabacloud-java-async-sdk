// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bpstudio20210931.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ExecuteOperationASyncResponseBody} extends {@link TeaModel}
 *
 * <p>ExecuteOperationASyncResponseBody</p>
 */
public class ExecuteOperationASyncResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Data")
    private String data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private ExecuteOperationASyncResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExecuteOperationASyncResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public String getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer code; 
        private String data; 
        private String message; 
        private String requestId; 

        /**
         * Result code, 200 for success; Other representatives fail.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The ID of the operation.
         */
        public Builder data(String data) {
            this.data = data;
            return this;
        }

        /**
         * Error message
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * Request ID
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ExecuteOperationASyncResponseBody build() {
            return new ExecuteOperationASyncResponseBody(this);
        } 

    } 

}
