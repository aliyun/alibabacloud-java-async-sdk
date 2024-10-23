// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DisableAdviceServiceResponseBody} extends {@link TeaModel}
 *
 * <p>DisableAdviceServiceResponseBody</p>
 */
public class DisableAdviceServiceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DisableAdviceServiceResponseBody(Builder builder) {
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DisableAdviceServiceResponseBody create() {
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

    public static final class Builder {
        private String message; 
        private String requestId; 

        /**
         * <p>The message returned for the operation. Valid values:</p>
         * <ul>
         * <li><strong>Success</strong> is returned if the operation is successful.</li>
         * <li>An error message is returned if the operation fails.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>57EC6CCA-A582-572C-A33D-F61845CBC03C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DisableAdviceServiceResponseBody build() {
            return new DisableAdviceServiceResponseBody(this);
        } 

    } 

}
