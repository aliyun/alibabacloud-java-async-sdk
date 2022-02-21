// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetHttpErrorPageConfigResponseBody} extends {@link TeaModel}
 *
 * <p>SetHttpErrorPageConfigResponseBody</p>
 */
public class SetHttpErrorPageConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private SetHttpErrorPageConfigResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetHttpErrorPageConfigResponseBody create() {
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

        public SetHttpErrorPageConfigResponseBody build() {
            return new SetHttpErrorPageConfigResponseBody(this);
        } 

    } 

}
