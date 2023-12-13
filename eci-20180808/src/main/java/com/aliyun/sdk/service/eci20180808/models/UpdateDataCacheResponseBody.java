// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eci20180808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateDataCacheResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateDataCacheResponseBody</p>
 */
public class UpdateDataCacheResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private UpdateDataCacheResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDataCacheResponseBody create() {
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

        public UpdateDataCacheResponseBody build() {
            return new UpdateDataCacheResponseBody(this);
        } 

    } 

}
