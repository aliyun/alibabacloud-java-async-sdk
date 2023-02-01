// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetSignatureApisResponseBody} extends {@link TeaModel}
 *
 * <p>SetSignatureApisResponseBody</p>
 */
public class SetSignatureApisResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private SetSignatureApisResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetSignatureApisResponseBody create() {
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
         * *   This operation allows you to bind a signature key to an API. You can bind signature keys for up to 100 APIs at a time.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public SetSignatureApisResponseBody build() {
            return new SetSignatureApisResponseBody(this);
        } 

    } 

}
