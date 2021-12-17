// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link CreateTrafficMarkingPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>CreateTrafficMarkingPolicyResponseBody</p>
 */
public class CreateTrafficMarkingPolicyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TrafficMarkingPolicyId")
    private String trafficMarkingPolicyId;


    private CreateTrafficMarkingPolicyResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.trafficMarkingPolicyId = builder.trafficMarkingPolicyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTrafficMarkingPolicyResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return trafficMarkingPolicyId
     */
    public String getTrafficMarkingPolicyId() {
        return this.trafficMarkingPolicyId;
    }

    public static final class Builder {
        private String requestId; 
        private String trafficMarkingPolicyId; 

        /**
         * <p>RequestId.</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>TrafficMarkingPolicyId.</p>
         */
        public Builder trafficMarkingPolicyId(String trafficMarkingPolicyId) {
            this.trafficMarkingPolicyId = trafficMarkingPolicyId;
            return this;
        }

        public CreateTrafficMarkingPolicyResponseBody build() {
            return new CreateTrafficMarkingPolicyResponseBody(this);
        } 

    } 

}
