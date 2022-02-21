// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSearchStrategyResponseBody} extends {@link TeaModel}
 *
 * <p>CreateSearchStrategyResponseBody</p>
 */
public class CreateSearchStrategyResponseBody extends TeaModel {
    @NameInMap("requestId")
    private String requestId;

    private CreateSearchStrategyResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSearchStrategyResponseBody create() {
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

        public CreateSearchStrategyResponseBody build() {
            return new CreateSearchStrategyResponseBody(this);
        } 

    } 

}
