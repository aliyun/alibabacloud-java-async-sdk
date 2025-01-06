// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateTrafficMarkingPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>CreateTrafficMarkingPolicyResponseBody</p>
 */
public class CreateTrafficMarkingPolicyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TrafficMarkingPolicyId")
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
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>0876E54E-3E36-5C31-89F0-9EE8A9266F9A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the traffic marking policy.</p>
         * 
         * <strong>example:</strong>
         * <p>tm-u9nxup5kww5po8****</p>
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
