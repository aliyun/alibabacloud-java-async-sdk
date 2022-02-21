// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateUpstreamAppKeyRelationsResponseBody} extends {@link TeaModel}
 *
 * <p>CreateUpstreamAppKeyRelationsResponseBody</p>
 */
public class CreateUpstreamAppKeyRelationsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private CreateUpstreamAppKeyRelationsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateUpstreamAppKeyRelationsResponseBody create() {
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

        public CreateUpstreamAppKeyRelationsResponseBody build() {
            return new CreateUpstreamAppKeyRelationsResponseBody(this);
        } 

    } 

}
