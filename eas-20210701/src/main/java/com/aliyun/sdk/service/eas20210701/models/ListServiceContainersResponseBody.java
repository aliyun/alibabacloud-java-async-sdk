// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListServiceContainersResponseBody} extends {@link TeaModel}
 *
 * <p>ListServiceContainersResponseBody</p>
 */
public class ListServiceContainersResponseBody extends TeaModel {
    @NameInMap("Containers")
    private java.util.List < ContainerInfo > containers;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ServiceName")
    private String serviceName;

    private ListServiceContainersResponseBody(Builder builder) {
        this.containers = builder.containers;
        this.requestId = builder.requestId;
        this.serviceName = builder.serviceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListServiceContainersResponseBody create() {
        return builder().build();
    }

    /**
     * @return containers
     */
    public java.util.List < ContainerInfo > getContainers() {
        return this.containers;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return serviceName
     */
    public String getServiceName() {
        return this.serviceName;
    }

    public static final class Builder {
        private java.util.List < ContainerInfo > containers; 
        private String requestId; 
        private String serviceName; 

        /**
         * The containers of the service.
         */
        public Builder containers(java.util.List < ContainerInfo > containers) {
            this.containers = containers;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ServiceName.
         */
        public Builder serviceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }

        public ListServiceContainersResponseBody build() {
            return new ListServiceContainersResponseBody(this);
        } 

    } 

}
