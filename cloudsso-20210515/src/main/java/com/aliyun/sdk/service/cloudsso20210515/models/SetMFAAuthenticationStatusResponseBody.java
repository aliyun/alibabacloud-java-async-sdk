// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SetMFAAuthenticationStatusResponseBody} extends {@link TeaModel}
 *
 * <p>SetMFAAuthenticationStatusResponseBody</p>
 */
public class SetMFAAuthenticationStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private SetMFAAuthenticationStatusResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetMFAAuthenticationStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String requestId; 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>14E2B1A9-7713-5E6F-8409-8DE12DF51AF4</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public SetMFAAuthenticationStatusResponseBody build() {
            return new SetMFAAuthenticationStatusResponseBody(this);
        } 

    } 

}
