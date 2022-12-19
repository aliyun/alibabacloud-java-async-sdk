// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RollbackSuspEventQuaraFileResponseBody} extends {@link TeaModel}
 *
 * <p>RollbackSuspEventQuaraFileResponseBody</p>
 */
public class RollbackSuspEventQuaraFileResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private RollbackSuspEventQuaraFileResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RollbackSuspEventQuaraFileResponseBody create() {
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
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public RollbackSuspEventQuaraFileResponseBody build() {
            return new RollbackSuspEventQuaraFileResponseBody(this);
        } 

    } 

}
