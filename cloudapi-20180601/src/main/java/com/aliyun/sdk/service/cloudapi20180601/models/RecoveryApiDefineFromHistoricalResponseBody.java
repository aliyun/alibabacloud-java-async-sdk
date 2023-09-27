// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20180601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RecoveryApiDefineFromHistoricalResponseBody} extends {@link TeaModel}
 *
 * <p>RecoveryApiDefineFromHistoricalResponseBody</p>
 */
public class RecoveryApiDefineFromHistoricalResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private RecoveryApiDefineFromHistoricalResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RecoveryApiDefineFromHistoricalResponseBody create() {
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

        public RecoveryApiDefineFromHistoricalResponseBody build() {
            return new RecoveryApiDefineFromHistoricalResponseBody(this);
        } 

    } 

}
