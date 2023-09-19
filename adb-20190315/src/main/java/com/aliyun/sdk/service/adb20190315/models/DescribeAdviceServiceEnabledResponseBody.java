// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAdviceServiceEnabledResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAdviceServiceEnabledResponseBody</p>
 */
public class DescribeAdviceServiceEnabledResponseBody extends TeaModel {
    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Boolean result;

    private DescribeAdviceServiceEnabledResponseBody(Builder builder) {
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAdviceServiceEnabledResponseBody create() {
        return builder().build();
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

    /**
     * @return result
     */
    public Boolean getResult() {
        return this.result;
    }

    public static final class Builder {
        private String message; 
        private String requestId; 
        private Boolean result; 

        /**
         * The returned message.
         * <p>
         * 
         * *   If the request was successful, **Success** is returned.
         * *   If the request failed, an error message is returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the suggestion feature is enabled. Valid values:
         * <p>
         * 
         * *   **True**
         * *   **False**
         */
        public Builder result(Boolean result) {
            this.result = result;
            return this;
        }

        public DescribeAdviceServiceEnabledResponseBody build() {
            return new DescribeAdviceServiceEnabledResponseBody(this);
        } 

    } 

}
