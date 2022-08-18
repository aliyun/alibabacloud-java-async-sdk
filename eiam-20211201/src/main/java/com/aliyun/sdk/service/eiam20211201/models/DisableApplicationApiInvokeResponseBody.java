// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DisableApplicationApiInvokeResponseBody} extends {@link TeaModel}
 *
 * <p>DisableApplicationApiInvokeResponseBody</p>
 */
public class DisableApplicationApiInvokeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private DisableApplicationApiInvokeResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DisableApplicationApiInvokeResponseBody create() {
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
         * 请求Id
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DisableApplicationApiInvokeResponseBody build() {
            return new DisableApplicationApiInvokeResponseBody(this);
        } 

    } 

}
