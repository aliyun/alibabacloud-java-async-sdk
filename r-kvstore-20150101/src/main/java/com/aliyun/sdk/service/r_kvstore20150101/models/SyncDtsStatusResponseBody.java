// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SyncDtsStatusResponseBody} extends {@link TeaModel}
 *
 * <p>SyncDtsStatusResponseBody</p>
 */
public class SyncDtsStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private SyncDtsStatusResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SyncDtsStatusResponseBody create() {
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
         * The region ID of the instance.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public SyncDtsStatusResponseBody build() {
            return new SyncDtsStatusResponseBody(this);
        } 

    } 

}
