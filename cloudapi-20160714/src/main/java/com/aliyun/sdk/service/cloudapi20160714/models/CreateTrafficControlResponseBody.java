// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateTrafficControlResponseBody} extends {@link TeaModel}
 *
 * <p>CreateTrafficControlResponseBody</p>
 */
public class CreateTrafficControlResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TrafficControlId")
    private String trafficControlId;

    private CreateTrafficControlResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.trafficControlId = builder.trafficControlId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTrafficControlResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return trafficControlId
     */
    public String getTrafficControlId() {
        return this.trafficControlId;
    }

    public static final class Builder {
        private String requestId; 
        private String trafficControlId; 

        /**
         * Creates a custom throttling policy.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * *   This API is intended for API providers.
         * <p>
         * *   Throttling policies must be bound to APIs to take effect. After a policy is bound to an API, it goes into effect on that API immediately.
         * *   The QPS limit on this operation is 50 per user.
         */
        public Builder trafficControlId(String trafficControlId) {
            this.trafficControlId = trafficControlId;
            return this;
        }

        public CreateTrafficControlResponseBody build() {
            return new CreateTrafficControlResponseBody(this);
        } 

    } 

}
