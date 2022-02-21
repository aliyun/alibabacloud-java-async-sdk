// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.slb20140515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteCACertificateResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteCACertificateResponseBody</p>
 */
public class DeleteCACertificateResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private DeleteCACertificateResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteCACertificateResponseBody create() {
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

        public DeleteCACertificateResponseBody build() {
            return new DeleteCACertificateResponseBody(this);
        } 

    } 

}
