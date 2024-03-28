// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLogStoreOfEndpointGroupResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLogStoreOfEndpointGroupResponseBody</p>
 */
public class DescribeLogStoreOfEndpointGroupResponseBody extends TeaModel {
    @NameInMap("AcceleratorId")
    private String acceleratorId;

    @NameInMap("EndpointGroupId")
    private String endpointGroupId;

    @NameInMap("ListenerId")
    private String listenerId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SlsLogStoreName")
    private String slsLogStoreName;

    @NameInMap("SlsProjectName")
    private String slsProjectName;

    @NameInMap("SlsRegionId")
    private String slsRegionId;

    @NameInMap("Status")
    private String status;

    private DescribeLogStoreOfEndpointGroupResponseBody(Builder builder) {
        this.acceleratorId = builder.acceleratorId;
        this.endpointGroupId = builder.endpointGroupId;
        this.listenerId = builder.listenerId;
        this.requestId = builder.requestId;
        this.slsLogStoreName = builder.slsLogStoreName;
        this.slsProjectName = builder.slsProjectName;
        this.slsRegionId = builder.slsRegionId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLogStoreOfEndpointGroupResponseBody create() {
        return builder().build();
    }

    /**
     * @return acceleratorId
     */
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    /**
     * @return endpointGroupId
     */
    public String getEndpointGroupId() {
        return this.endpointGroupId;
    }

    /**
     * @return listenerId
     */
    public String getListenerId() {
        return this.listenerId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return slsLogStoreName
     */
    public String getSlsLogStoreName() {
        return this.slsLogStoreName;
    }

    /**
     * @return slsProjectName
     */
    public String getSlsProjectName() {
        return this.slsProjectName;
    }

    /**
     * @return slsRegionId
     */
    public String getSlsRegionId() {
        return this.slsRegionId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String acceleratorId; 
        private String endpointGroupId; 
        private String listenerId; 
        private String requestId; 
        private String slsLogStoreName; 
        private String slsProjectName; 
        private String slsRegionId; 
        private String status; 

        /**
         * The ID of the GA instance.
         */
        public Builder acceleratorId(String acceleratorId) {
            this.acceleratorId = acceleratorId;
            return this;
        }

        /**
         * The ID of the endpoint group.
         */
        public Builder endpointGroupId(String endpointGroupId) {
            this.endpointGroupId = endpointGroupId;
            return this;
        }

        /**
         * The ID of the listener.
         */
        public Builder listenerId(String listenerId) {
            this.listenerId = listenerId;
            return this;
        }

        /**
         * The response parameters.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The name of the Logstore.
         */
        public Builder slsLogStoreName(String slsLogStoreName) {
            this.slsLogStoreName = slsLogStoreName;
            return this;
        }

        /**
         * The name of the Simple Log Service project.
         */
        public Builder slsProjectName(String slsProjectName) {
            this.slsProjectName = slsProjectName;
            return this;
        }

        /**
         * The region ID of the Simple Log Service project.
         */
        public Builder slsRegionId(String slsRegionId) {
            this.slsRegionId = slsRegionId;
            return this;
        }

        /**
         * Indicates whether the endpoint group is bound to the Simple Log Service project.
         * <p>
         * 
         * *   **on:** The endpoint group is bound to the Simple Log Service project.
         * *   **off:** The endpoint group is not bound to the Simple Log Service project.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public DescribeLogStoreOfEndpointGroupResponseBody build() {
            return new DescribeLogStoreOfEndpointGroupResponseBody(this);
        } 

    } 

}
