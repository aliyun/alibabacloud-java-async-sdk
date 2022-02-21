// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteRenderingDeviceInternetPortsResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteRenderingDeviceInternetPortsResponseBody</p>
 */
public class DeleteRenderingDeviceInternetPortsResponseBody extends TeaModel {
    @NameInMap("InstanceIds")
    private InstanceIds instanceIds;

    @NameInMap("RequestId")
    private String requestId;

    private DeleteRenderingDeviceInternetPortsResponseBody(Builder builder) {
        this.instanceIds = builder.instanceIds;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteRenderingDeviceInternetPortsResponseBody create() {
        return builder().build();
    }

    /**
     * @return instanceIds
     */
    public InstanceIds getInstanceIds() {
        return this.instanceIds;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private InstanceIds instanceIds; 
        private String requestId; 

        /**
         * InstanceIds.
         */
        public Builder instanceIds(InstanceIds instanceIds) {
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

        public DeleteRenderingDeviceInternetPortsResponseBody build() {
            return new DeleteRenderingDeviceInternetPortsResponseBody(this);
        } 

    } 

    public static class InstanceIds extends TeaModel {
        @NameInMap("instanceIds")
        private java.util.List < String > instanceIds;

        private InstanceIds(Builder builder) {
            this.instanceIds = builder.instanceIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceIds create() {
            return builder().build();
        }

        /**
         * @return instanceIds
         */
        public java.util.List < String > getInstanceIds() {
            return this.instanceIds;
        }

        public static final class Builder {
            private java.util.List < String > instanceIds; 

            /**
             * instanceIds.
             */
            public Builder instanceIds(java.util.List < String > instanceIds) {
                this.instanceIds = instanceIds;
                return this;
            }

            public InstanceIds build() {
                return new InstanceIds(this);
            } 

        } 

    }
}
