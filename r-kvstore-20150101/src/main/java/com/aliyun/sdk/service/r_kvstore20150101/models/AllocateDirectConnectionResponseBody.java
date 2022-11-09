// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AllocateDirectConnectionResponseBody} extends {@link TeaModel}
 *
 * <p>AllocateDirectConnectionResponseBody</p>
 */
public class AllocateDirectConnectionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private AllocateDirectConnectionResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AllocateDirectConnectionResponseBody create() {
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

        public AllocateDirectConnectionResponseBody build() {
            return new AllocateDirectConnectionResponseBody(this);
        } 

    } 

}
