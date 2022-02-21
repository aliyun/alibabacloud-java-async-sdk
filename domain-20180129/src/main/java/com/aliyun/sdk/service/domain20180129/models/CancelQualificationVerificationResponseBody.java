// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CancelQualificationVerificationResponseBody} extends {@link TeaModel}
 *
 * <p>CancelQualificationVerificationResponseBody</p>
 */
public class CancelQualificationVerificationResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private CancelQualificationVerificationResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CancelQualificationVerificationResponseBody create() {
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

        public CancelQualificationVerificationResponseBody build() {
            return new CancelQualificationVerificationResponseBody(this);
        } 

    } 

}
