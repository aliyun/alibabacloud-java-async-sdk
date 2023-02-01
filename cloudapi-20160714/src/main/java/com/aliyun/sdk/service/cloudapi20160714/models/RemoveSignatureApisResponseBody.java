// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveSignatureApisResponseBody} extends {@link TeaModel}
 *
 * <p>RemoveSignatureApisResponseBody</p>
 */
public class RemoveSignatureApisResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private RemoveSignatureApisResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveSignatureApisResponseBody create() {
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
         * *   This API is intended for API providers.
         * <p>
         * *   The operation takes effect immediately. The request sent from API Gateway to the backend service does not contain the signature string. The corresponding verification step can be removed from the backend.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public RemoveSignatureApisResponseBody build() {
            return new RemoveSignatureApisResponseBody(this);
        } 

    } 

}
