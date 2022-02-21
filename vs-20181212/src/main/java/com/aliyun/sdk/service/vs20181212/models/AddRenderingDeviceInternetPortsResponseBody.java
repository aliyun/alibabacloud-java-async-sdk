// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddRenderingDeviceInternetPortsResponseBody} extends {@link TeaModel}
 *
 * <p>AddRenderingDeviceInternetPortsResponseBody</p>
 */
public class AddRenderingDeviceInternetPortsResponseBody extends TeaModel {
    @NameInMap("InstanceIds")
    private java.util.List < String > instanceIds;

    @NameInMap("RequestId")
    private String requestId;

    private AddRenderingDeviceInternetPortsResponseBody(Builder builder) {
        this.instanceIds = builder.instanceIds;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddRenderingDeviceInternetPortsResponseBody create() {
        return builder().build();
    }

    /**
     * @return instanceIds
     */
    public java.util.List < String > getInstanceIds() {
        return this.instanceIds;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < String > instanceIds; 
        private String requestId; 

        /**
         * InstanceIds.
         */
        public Builder instanceIds(java.util.List < String > instanceIds) {
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public AddRenderingDeviceInternetPortsResponseBody build() {
            return new AddRenderingDeviceInternetPortsResponseBody(this);
        } 

    } 

}
