// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20180601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AbolishApiResponseBody} extends {@link TeaModel}
 *
 * <p>AbolishApiResponseBody</p>
 */
public class AbolishApiResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private AbolishApiResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AbolishApiResponseBody create() {
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

        public AbolishApiResponseBody build() {
            return new AbolishApiResponseBody(this);
        } 

    } 

}
