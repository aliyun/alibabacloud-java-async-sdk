// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain_intl20171218.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RegistrantProfileRealNameVerificationResponseBody} extends {@link TeaModel}
 *
 * <p>RegistrantProfileRealNameVerificationResponseBody</p>
 */
public class RegistrantProfileRealNameVerificationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private RegistrantProfileRealNameVerificationResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RegistrantProfileRealNameVerificationResponseBody create() {
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public RegistrantProfileRealNameVerificationResponseBody build() {
            return new RegistrantProfileRealNameVerificationResponseBody(this);
        } 

    } 

}
