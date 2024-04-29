// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDevicesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDevicesResponseBody</p>
 */
public class DescribeDevicesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Devices")
    private java.util.List < Devices> devices;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDevicesResponseBody(Builder builder) {
        this.devices = builder.devices;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDevicesResponseBody create() {
        return builder().build();
    }

    /**
     * @return devices
     */
    public java.util.List < Devices> getDevices() {
        return this.devices;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Devices> devices; 
        private String requestId; 

        /**
         * Details of the devices that are returned.
         */
        public Builder devices(java.util.List < Devices> devices) {
            this.devices = devices;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDevicesResponseBody build() {
            return new DescribeDevicesResponseBody(this);
        } 

    } 

    public static class EndUserList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AdDomain")
        private String adDomain;

        @com.aliyun.core.annotation.NameInMap("DirectoryId")
        private String directoryId;

        @com.aliyun.core.annotation.NameInMap("EndUserId")
        private String endUserId;

        @com.aliyun.core.annotation.NameInMap("UserType")
        private String userType;

        private EndUserList(Builder builder) {
            this.adDomain = builder.adDomain;
            this.directoryId = builder.directoryId;
            this.endUserId = builder.endUserId;
            this.userType = builder.userType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EndUserList create() {
            return builder().build();
        }

        /**
         * @return adDomain
         */
        public String getAdDomain() {
            return this.adDomain;
        }

        /**
         * @return directoryId
         */
        public String getDirectoryId() {
            return this.directoryId;
        }

        /**
         * @return endUserId
         */
        public String getEndUserId() {
            return this.endUserId;
        }

        /**
         * @return userType
         */
        public String getUserType() {
            return this.userType;
        }

        public static final class Builder {
            private String adDomain; 
            private String directoryId; 
            private String endUserId; 
            private String userType; 

            /**
             * The address of the AD workspace.
             */
            public Builder adDomain(String adDomain) {
                this.adDomain = adDomain;
                return this;
            }

            /**
             * The ID of the workspace.
             */
            public Builder directoryId(String directoryId) {
                this.directoryId = directoryId;
                return this;
            }

            /**
             * The ID of the user.
             */
            public Builder endUserId(String endUserId) {
                this.endUserId = endUserId;
                return this;
            }

            /**
             * The type of the account.
             */
            public Builder userType(String userType) {
                this.userType = userType;
                return this;
            }

            public EndUserList build() {
                return new EndUserList(this);
            } 

        } 

    }
    public static class Devices extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DeviceId")
        private String deviceId;

        @com.aliyun.core.annotation.NameInMap("EndUserList")
        private java.util.List < EndUserList> endUserList;

        private Devices(Builder builder) {
            this.deviceId = builder.deviceId;
            this.endUserList = builder.endUserList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Devices create() {
            return builder().build();
        }

        /**
         * @return deviceId
         */
        public String getDeviceId() {
            return this.deviceId;
        }

        /**
         * @return endUserList
         */
        public java.util.List < EndUserList> getEndUserList() {
            return this.endUserList;
        }

        public static final class Builder {
            private String deviceId; 
            private java.util.List < EndUserList> endUserList; 

            /**
             * The ID of the device.
             */
            public Builder deviceId(String deviceId) {
                this.deviceId = deviceId;
                return this;
            }

            /**
             * The users who are bound to the device.
             */
            public Builder endUserList(java.util.List < EndUserList> endUserList) {
                this.endUserList = endUserList;
                return this;
            }

            public Devices build() {
                return new Devices(this);
            } 

        } 

    }
}
