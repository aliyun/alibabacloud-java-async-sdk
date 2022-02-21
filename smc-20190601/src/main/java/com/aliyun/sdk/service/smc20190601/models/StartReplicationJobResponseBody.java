// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.smc20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartReplicationJobResponseBody} extends {@link TeaModel}
 *
 * <p>StartReplicationJobResponseBody</p>
 */
public class StartReplicationJobResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private StartReplicationJobResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartReplicationJobResponseBody create() {
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

        public StartReplicationJobResponseBody build() {
            return new StartReplicationJobResponseBody(this);
        } 

    } 

}
