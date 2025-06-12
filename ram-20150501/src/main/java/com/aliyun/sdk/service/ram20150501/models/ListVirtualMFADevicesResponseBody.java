// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ram20150501.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(ListVirtualMFADevicesResponseBody model) {
            this.requestId = model.requestId;
            this.virtualMFADevices = model.virtualMFADevices;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information about the MFA devices.</p>
         */
        public Builder virtualMFADevices(VirtualMFADevices virtualMFADevices) {
            this.virtualMFADevices = virtualMFADevices;
            return this;
        }

        public ListVirtualMFADevicesResponseBody build() {
            return new ListVirtualMFADevicesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListVirtualMFADevicesResponseBody} extends {@link TeaModel}
     *
     * <p>ListVirtualMFADevicesResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(User model) {
                this.displayName = model.displayName;
                this.userId = model.userId;
                this.userName = model.userName;
            } 

            /**
             * <p>The display name of the RAM user.</p>
             * 
             * <strong>example:</strong>
             * <p>zhangq****</p>
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * <p>The unique ID of the RAM user.</p>
             * 
             * <strong>example:</strong>
             * <p>122748924538****</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * <p>The name of the RAM user.</p>
             * 
             * <strong>example:</strong>
             * <p>zhangq****</p>
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
    /**
     * 
     * {@link ListVirtualMFADevicesResponseBody} extends {@link TeaModel}
     *
     * <p>ListVirtualMFADevicesResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(VirtualMFADevice model) {
                this.activateDate = model.activateDate;
                this.serialNumber = model.serialNumber;
                this.user = model.user;
            } 

            /**
             * <p>The time when the MFA device was enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>2015-02-18T17:22:08Z</p>
             */
            public Builder activateDate(String activateDate) {
                this.activateDate = activateDate;
                return this;
            }

            /**
             * <p>The serial number of the MFA device.</p>
             * 
             * <strong>example:</strong>
             * <p>acs:ram::123456789012****:mfa/device002</p>
             */
            public Builder serialNumber(String serialNumber) {
                this.serialNumber = serialNumber;
                return this;
            }

            /**
             * <p>The basic information about the Resource Access Management (RAM) user to which the MFA device is bound.</p>
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
    /**
     * 
     * {@link ListVirtualMFADevicesResponseBody} extends {@link TeaModel}
     *
     * <p>ListVirtualMFADevicesResponseBody</p>
     */
    public static class VirtualMFADevices extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("VirtualMFADevice")
        private java.util.List<VirtualMFADevice> virtualMFADevice;

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
        public java.util.List<VirtualMFADevice> getVirtualMFADevice() {
            return this.virtualMFADevice;
        }

        public static final class Builder {
            private java.util.List<VirtualMFADevice> virtualMFADevice; 

            private Builder() {
            } 

            private Builder(VirtualMFADevices model) {
                this.virtualMFADevice = model.virtualMFADevice;
            } 

            /**
             * VirtualMFADevice.
             */
            public Builder virtualMFADevice(java.util.List<VirtualMFADevice> virtualMFADevice) {
                this.virtualMFADevice = virtualMFADevice;
                return this;
            }

            public VirtualMFADevices build() {
                return new VirtualMFADevices(this);
            } 

        } 

    }
}
