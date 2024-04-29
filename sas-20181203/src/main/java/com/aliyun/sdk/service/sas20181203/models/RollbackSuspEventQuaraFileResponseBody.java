// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RollbackSuspEventQuaraFileResponseBody} extends {@link TeaModel}
 *
 * <p>RollbackSuspEventQuaraFileResponseBody</p>
 */
public class RollbackSuspEventQuaraFileResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * RequestId.
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
