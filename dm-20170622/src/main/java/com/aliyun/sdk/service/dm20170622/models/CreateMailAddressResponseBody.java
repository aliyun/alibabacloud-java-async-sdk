// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20170622.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateMailAddressResponseBody} extends {@link TeaModel}
 *
 * <p>CreateMailAddressResponseBody</p>
 */
public class CreateMailAddressResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MailAddressId")
    private String mailAddressId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateMailAddressResponseBody(Builder builder) {
        this.mailAddressId = builder.mailAddressId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMailAddressResponseBody create() {
        return builder().build();
    }

    /**
     * @return mailAddressId
     */
    public String getMailAddressId() {
        return this.mailAddressId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String mailAddressId; 
        private String requestId; 

        /**
         * MailAddressId.
         */
        public Builder mailAddressId(String mailAddressId) {
            this.mailAddressId = mailAddressId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateMailAddressResponseBody build() {
            return new CreateMailAddressResponseBody(this);
        } 

    } 

}
