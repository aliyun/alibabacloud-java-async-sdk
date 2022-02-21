// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AgreeLinkMicResponseBody} extends {@link TeaModel}
 *
 * <p>AgreeLinkMicResponseBody</p>
 */
public class AgreeLinkMicResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private AgreeLinkMicResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AgreeLinkMicResponseBody create() {
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
         * 请求ID
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public AgreeLinkMicResponseBody build() {
            return new AgreeLinkMicResponseBody(this);
        } 

    } 

}
