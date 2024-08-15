// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcedirectorymaster20220419.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SendVerificationCodeForBindSecureMobilePhoneResponseBody} extends {@link TeaModel}
 *
 * <p>SendVerificationCodeForBindSecureMobilePhoneResponseBody</p>
 */
public class SendVerificationCodeForBindSecureMobilePhoneResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ExpirationDate")
    private String expirationDate;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private SendVerificationCodeForBindSecureMobilePhoneResponseBody(Builder builder) {
        this.expirationDate = builder.expirationDate;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SendVerificationCodeForBindSecureMobilePhoneResponseBody create() {
        return builder().build();
    }

    /**
     * @return expirationDate
     */
    public String getExpirationDate() {
        return this.expirationDate;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String expirationDate; 
        private String requestId; 

        /**
         * The time when the verification code expires.
         */
        public Builder expirationDate(String expirationDate) {
            this.expirationDate = expirationDate;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public SendVerificationCodeForBindSecureMobilePhoneResponseBody build() {
            return new SendVerificationCodeForBindSecureMobilePhoneResponseBody(this);
        } 

    } 

}
