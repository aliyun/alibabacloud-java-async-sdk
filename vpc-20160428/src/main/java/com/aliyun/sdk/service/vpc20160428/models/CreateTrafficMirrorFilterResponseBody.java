// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateTrafficMirrorFilterResponseBody} extends {@link TeaModel}
 *
 * <p>CreateTrafficMirrorFilterResponseBody</p>
 */
public class CreateTrafficMirrorFilterResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @NameInMap("TrafficMirrorFilterId")
    private String trafficMirrorFilterId;

    private CreateTrafficMirrorFilterResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resourceGroupId = builder.resourceGroupId;
        this.trafficMirrorFilterId = builder.trafficMirrorFilterId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTrafficMirrorFilterResponseBody create() {
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
     * @return trafficMirrorFilterId
     */
    public String getTrafficMirrorFilterId() {
        return this.trafficMirrorFilterId;
    }

    public static final class Builder {
        private String requestId; 
        private String resourceGroupId; 
        private String trafficMirrorFilterId; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * TrafficMirrorFilterId.
         */
        public Builder trafficMirrorFilterId(String trafficMirrorFilterId) {
            this.trafficMirrorFilterId = trafficMirrorFilterId;
            return this;
        }

        public CreateTrafficMirrorFilterResponseBody build() {
            return new CreateTrafficMirrorFilterResponseBody(this);
        } 

    } 

}
