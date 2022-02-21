// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20180713.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteUserCertificateResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteUserCertificateResponseBody</p>
 */
public class DeleteUserCertificateResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private DeleteUserCertificateResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteUserCertificateResponseBody create() {
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

        public DeleteUserCertificateResponseBody build() {
            return new DeleteUserCertificateResponseBody(this);
        } 

    } 

}
