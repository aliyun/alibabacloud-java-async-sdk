// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agency20221216.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EditZeroCreditShutdownResponseBody} extends {@link TeaModel}
 *
 * <p>EditZeroCreditShutdownResponseBody</p>
 */
public class EditZeroCreditShutdownResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private String data;

    @NameInMap("Message")
    private String message;

    @NameInMap("Msg")
    private String msg;

    @NameInMap("RequestId")
    private String requestId;

    private EditZeroCreditShutdownResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.msg = builder.msg;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EditZeroCreditShutdownResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
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
     * @return msg
     */
    public String getMsg() {
        return this.msg;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private String data; 
        private String message; 
        private String msg; 
        private String requestId; 

        /**
         * Success or not</br>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Request ID</br>
         */
        public Builder data(String data) {
            this.data = data;
            return this;
        }

        /**
         * Message</br>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * NO_STOP
         */
        public Builder msg(String msg) {
            this.msg = msg;
            return this;
        }

        /**
         * success
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public EditZeroCreditShutdownResponseBody build() {
            return new EditZeroCreditShutdownResponseBody(this);
        } 

    } 

}
