// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateCACertificateStatusResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateCACertificateStatusResponseBody</p>
 */
public class UpdateCACertificateStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private UpdateCACertificateStatusResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateCACertificateStatusResponseBody create() {
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
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateCACertificateStatusResponseBody build() {
            return new UpdateCACertificateStatusResponseBody(this);
        } 

    } 

}
