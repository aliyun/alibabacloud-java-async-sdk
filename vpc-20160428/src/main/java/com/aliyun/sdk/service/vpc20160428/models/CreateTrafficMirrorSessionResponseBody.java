// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateTrafficMirrorSessionResponseBody} extends {@link TeaModel}
 *
 * <p>CreateTrafficMirrorSessionResponseBody</p>
 */
public class CreateTrafficMirrorSessionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @NameInMap("TrafficMirrorSessionId")
    private String trafficMirrorSessionId;

    private CreateTrafficMirrorSessionResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resourceGroupId = builder.resourceGroupId;
        this.trafficMirrorSessionId = builder.trafficMirrorSessionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTrafficMirrorSessionResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return trafficMirrorSessionId
     */
    public String getTrafficMirrorSessionId() {
        return this.trafficMirrorSessionId;
    }

    public static final class Builder {
        private String requestId; 
        private String resourceGroupId; 
        private String trafficMirrorSessionId; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The ID of the resource group to which the mirrored traffic belongs.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * The ID of the traffic mirror session.
         */
        public Builder trafficMirrorSessionId(String trafficMirrorSessionId) {
            this.trafficMirrorSessionId = trafficMirrorSessionId;
            return this;
        }

        public CreateTrafficMirrorSessionResponseBody build() {
            return new CreateTrafficMirrorSessionResponseBody(this);
        } 

    } 

}
