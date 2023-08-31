// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenestsupplier20210521.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PushMeteringDataResponseBody} extends {@link TeaModel}
 *
 * <p>PushMeteringDataResponseBody</p>
 */
public class PushMeteringDataResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private PushMeteringDataResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PushMeteringDataResponseBody create() {
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

        public PushMeteringDataResponseBody build() {
            return new PushMeteringDataResponseBody(this);
        } 

    } 

}
