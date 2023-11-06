// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateAggregatorResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateAggregatorResponseBody</p>
 */
public class UpdateAggregatorResponseBody extends TeaModel {
    @NameInMap("AggregatorId")
    private String aggregatorId;

    @NameInMap("RequestId")
    private String requestId;

    private UpdateAggregatorResponseBody(Builder builder) {
        this.aggregatorId = builder.aggregatorId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAggregatorResponseBody create() {
        return builder().build();
    }

    /**
     * @return aggregatorId
     */
    public String getAggregatorId() {
        return this.aggregatorId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String aggregatorId; 
        private String requestId; 

        /**
         * The ID of the account group.
         */
        public Builder aggregatorId(String aggregatorId) {
            this.aggregatorId = aggregatorId;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateAggregatorResponseBody build() {
            return new UpdateAggregatorResponseBody(this);
        } 

    } 

}
