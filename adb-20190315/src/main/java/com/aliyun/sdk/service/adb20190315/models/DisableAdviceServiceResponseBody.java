// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DisableAdviceServiceResponseBody model) {
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The returned message. Valid values:</p>
         * <ul>
         * <li>If the request was successful, a <strong>success</strong> message is returned.</li>
         * <li>If the request failed, an error message is returned.</li>
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
         * <p>The request ID.</p>
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
