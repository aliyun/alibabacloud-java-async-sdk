// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAggregatorResponseBody} extends {@link TeaModel}
 *
 * <p>CreateAggregatorResponseBody</p>
 */
public class CreateAggregatorResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AggregatorId")
    private String aggregatorId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateAggregatorResponseBody(Builder builder) {
        this.aggregatorId = builder.aggregatorId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAggregatorResponseBody create() {
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
         * The account group ID.
         */
        public Builder aggregatorId(String aggregatorId) {
            this.aggregatorId = aggregatorId;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateAggregatorResponseBody build() {
            return new CreateAggregatorResponseBody(this);
        } 

    } 

}
