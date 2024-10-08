// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agency20221216.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EditEndUserStatusResponseBody} extends {@link TeaModel}
 *
 * <p>EditEndUserStatusResponseBody</p>
 */
public class EditEndUserStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private String data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Msg")
    private String msg;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private EditEndUserStatusResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.msg = builder.msg;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EditEndUserStatusResponseBody create() {
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
         * Status Code</br>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Success or not</br>
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
         * Message</br>
         */
        public Builder msg(String msg) {
            this.msg = msg;
            return this;
        }

        /**
         * Request ID</br>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public EditEndUserStatusResponseBody build() {
            return new EditEndUserStatusResponseBody(this);
        } 

    } 

}
