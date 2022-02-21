// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateCertificateStatusResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateCertificateStatusResponseBody</p>
 */
public class UpdateCertificateStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private UpdateCertificateStatusResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateCertificateStatusResponseBody create() {
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

        public UpdateCertificateStatusResponseBody build() {
            return new UpdateCertificateStatusResponseBody(this);
        } 

    } 

}
