// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AllocateReadWriteSplittingConnectionResponseBody} extends {@link TeaModel}
 *
 * <p>AllocateReadWriteSplittingConnectionResponseBody</p>
 */
public class AllocateReadWriteSplittingConnectionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private AllocateReadWriteSplittingConnectionResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AllocateReadWriteSplittingConnectionResponseBody create() {
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
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public AllocateReadWriteSplittingConnectionResponseBody build() {
            return new AllocateReadWriteSplittingConnectionResponseBody(this);
        } 

    } 

}
