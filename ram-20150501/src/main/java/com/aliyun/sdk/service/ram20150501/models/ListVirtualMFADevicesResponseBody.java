// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ram20150501.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListVirtualMFADevicesResponseBody} extends {@link TeaModel}
 *
 * <p>ListVirtualMFADevicesResponseBody</p>
 */
public class ListVirtualMFADevicesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("VirtualMFADevices")
    private VirtualMFADevices virtualMFADevices;

    private ListVirtualMFADevicesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.virtualMFADevices = builder.virtualMFADevices;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListVirtualMFADevicesResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return virtualMFADevices
     */
    public VirtualMFADevices getVirtualMFADevices() {
        return this.virtualMFADevices;
    }

    public static final class Builder {
        private String requestId; 
        private VirtualMFADevices virtualMFADevices; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The list of MFA devices.
         */
        public Builder virtualMFADevices(VirtualMFADevices virtualMFADevices) {
            this.virtualMFADevices = virtualMFADevices;
            return this;
        }

        public ListVirtualMFADevicesResponseBody build() {
            return new ListVirtualMFADevicesResponseBody(this);
        } 

    } 

    public static class User extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("UserName")
        private String userName;

        private User(Builder builder) {
            this.displayName = builder.displayName;
            this.userId = builder.userId;
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static User create() {
            return builder().build();
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        public static final class Builder {
            private String displayName; 
            private String userId; 
            private String userName; 

            /**
             * The display name of the RAM user.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * The unique ID of the RAM user.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * The name of the RAM user.
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            public User build() {
                return new User(this);
            } 

        } 

    }
    public static class VirtualMFADevice extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActivateDate")
        private String activateDate;

        @com.aliyun.core.annotation.NameInMap("SerialNumber")
        private String serialNumber;

        @com.aliyun.core.annotation.NameInMap("User")
        private User user;

        private VirtualMFADevice(Builder builder) {
            this.activateDate = builder.activateDate;
            this.serialNumber = builder.serialNumber;
            this.user = builder.user;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VirtualMFADevice create() {
            return builder().build();
        }

        /**
         * @return activateDate
         */
        public String getActivateDate() {
            return this.activateDate;
        }

        /**
         * @return serialNumber
         */
        public String getSerialNumber() {
            return this.serialNumber;
        }

        /**
         * @return user
         */
        public User getUser() {
            return this.user;
        }

        public static final class Builder {
            private String activateDate; 
            private String serialNumber; 
            private User user; 

            /**
             * The time when the MFA device was enabled.
             */
            public Builder activateDate(String activateDate) {
                this.activateDate = activateDate;
                return this;
            }

            /**
             * The serial number of the MFA device.
             */
            public Builder serialNumber(String serialNumber) {
                this.serialNumber = serialNumber;
                return this;
            }

            /**
             * The basic information of the RAM user to which the MFA device is attached.
             */
            public Builder user(User user) {
                this.user = user;
                return this;
            }

            public VirtualMFADevice build() {
                return new VirtualMFADevice(this);
            } 

        } 

    }
    public static class VirtualMFADevices extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("VirtualMFADevice")
        private java.util.List < VirtualMFADevice> virtualMFADevice;

        private VirtualMFADevices(Builder builder) {
            this.virtualMFADevice = builder.virtualMFADevice;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VirtualMFADevices create() {
            return builder().build();
        }

        /**
         * @return virtualMFADevice
         */
        public java.util.List < VirtualMFADevice> getVirtualMFADevice() {
            return this.virtualMFADevice;
        }

        public static final class Builder {
            private java.util.List < VirtualMFADevice> virtualMFADevice; 

            /**
             * VirtualMFADevice.
             */
            public Builder virtualMFADevice(java.util.List < VirtualMFADevice> virtualMFADevice) {
                this.virtualMFADevice = virtualMFADevice;
                return this;
            }

            public VirtualMFADevices build() {
                return new VirtualMFADevices(this);
            } 

        } 

    }
}
