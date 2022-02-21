// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateSearchStrategyResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateSearchStrategyResponseBody</p>
 */
public class UpdateSearchStrategyResponseBody extends TeaModel {
    @NameInMap("requestId")
    private String requestId;

    private UpdateSearchStrategyResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateSearchStrategyResponseBody create() {
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
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateSearchStrategyResponseBody build() {
            return new UpdateSearchStrategyResponseBody(this);
        } 

    } 

}
