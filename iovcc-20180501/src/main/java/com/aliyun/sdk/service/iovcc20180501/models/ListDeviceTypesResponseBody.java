// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDeviceTypesResponseBody} extends {@link TeaModel}
 *
 * <p>ListDeviceTypesResponseBody</p>
 */
public class ListDeviceTypesResponseBody extends TeaModel {
    @NameInMap("DeviceTypes")
    private java.util.List < DeviceTypes> deviceTypes;

    @NameInMap("RequestId")
    private String requestId;

    private ListDeviceTypesResponseBody(Builder builder) {
        this.deviceTypes = builder.deviceTypes;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDeviceTypesResponseBody create() {
        return builder().build();
    }

    /**
     * @return deviceTypes
     */
    public java.util.List < DeviceTypes> getDeviceTypes() {
        return this.deviceTypes;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < DeviceTypes> deviceTypes; 
        private String requestId; 

        /**
         * DeviceTypes.
         */
        public Builder deviceTypes(java.util.List < DeviceTypes> deviceTypes) {
            this.deviceTypes = deviceTypes;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListDeviceTypesResponseBody build() {
            return new ListDeviceTypesResponseBody(this);
        } 

    } 

    public static class DeviceTypes extends TeaModel {
        @NameInMap("DeviceType")
        private String deviceType;

        @NameInMap("Name")
        private String name;

        private DeviceTypes(Builder builder) {
            this.deviceType = builder.deviceType;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeviceTypes create() {
            return builder().build();
        }

        /**
         * @return deviceType
         */
        public String getDeviceType() {
            return this.deviceType;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String deviceType; 
            private String name; 

            /**
             * DeviceType.
             */
            public Builder deviceType(String deviceType) {
                this.deviceType = deviceType;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public DeviceTypes build() {
                return new DeviceTypes(this);
            } 

        } 

    }
}
