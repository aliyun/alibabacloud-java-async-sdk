// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateTrafficMirrorSessionResponseBody} extends {@link TeaModel}
 *
 * <p>CreateTrafficMirrorSessionResponseBody</p>
 */
public class CreateTrafficMirrorSessionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.NameInMap("TrafficMirrorSessionId")
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
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>0ED8D006-F706-4D23-88ED-E11ED28DCAC0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the resource group to which the mirrored traffic belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-bp67acfmxazb4ph****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The ID of the traffic mirror session.</p>
         * 
         * <strong>example:</strong>
         * <p>tms-j6ce5di4w7nvigfjz****</p>
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
