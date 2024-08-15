// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcedirectorymaster20220419.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SendPhoneVerificationForMessageContactResponseBody} extends {@link TeaModel}
 *
 * <p>SendPhoneVerificationForMessageContactResponseBody</p>
 */
public class SendPhoneVerificationForMessageContactResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private SendPhoneVerificationForMessageContactResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SendPhoneVerificationForMessageContactResponseBody create() {
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
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public SendPhoneVerificationForMessageContactResponseBody build() {
            return new SendPhoneVerificationForMessageContactResponseBody(this);
        } 

    } 

}
