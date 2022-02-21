// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListOuterOrderedNumbersResponseBody} extends {@link TeaModel}
 *
 * <p>ListOuterOrderedNumbersResponseBody</p>
 */
public class ListOuterOrderedNumbersResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("Numbers")
    private java.util.List < String > numbers;

    @NameInMap("RequestId")
    private String requestId;

    private ListOuterOrderedNumbersResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.numbers = builder.numbers;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListOuterOrderedNumbersResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return numbers
     */
    public java.util.List < String > getNumbers() {
        return this.numbers;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private java.util.List < String > numbers; 
        private String requestId; 

        /**
         * Code.
         */
        public Builder code(String code) {
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
         * Numbers.
         */
        public Builder numbers(java.util.List < String > numbers) {
            this.numbers = numbers;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListOuterOrderedNumbersResponseBody build() {
            return new ListOuterOrderedNumbersResponseBody(this);
        } 

    } 

}
