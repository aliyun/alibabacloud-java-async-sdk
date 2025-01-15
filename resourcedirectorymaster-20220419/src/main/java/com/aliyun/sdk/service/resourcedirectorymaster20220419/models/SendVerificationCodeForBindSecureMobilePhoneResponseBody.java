// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcedirectorymaster20220419.models;

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
         * <p>The time when the verification code expires.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-12-17T07:38:41.747Z</p>
         */
        public Builder expirationDate(String expirationDate) {
            this.expirationDate = expirationDate;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>DCD43660-75DD-5D15-B342-1B83FCA5B913</p>
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
