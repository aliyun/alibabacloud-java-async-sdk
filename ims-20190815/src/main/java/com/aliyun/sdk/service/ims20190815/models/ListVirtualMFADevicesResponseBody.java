// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListVirtualMFADevicesResponseBody} extends {@link TeaModel}
 *
 * <p>ListVirtualMFADevicesResponseBody</p>
 */
public class ListVirtualMFADevicesResponseBody extends TeaModel {
    @NameInMap("IsTruncated")
    private Boolean isTruncated;

    @NameInMap("Marker")
    private String marker;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("VirtualMFADevices")
    private VirtualMFADevices virtualMFADevices;

    private ListVirtualMFADevicesResponseBody(Builder builder) {
        this.isTruncated = builder.isTruncated;
        this.marker = builder.marker;
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
     * @return isTruncated
     */
    public Boolean getIsTruncated() {
        return this.isTruncated;
    }

    /**
     * @return marker
     */
    public String getMarker() {
        return this.marker;
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
        private Boolean isTruncated; 
        private String marker; 
        private String requestId; 
        private VirtualMFADevices virtualMFADevices; 

        /**
         * Indicates whether the response is truncated. Valid values:
         * <p>
         * 
         * *   true
         * *   false
         */
        public Builder isTruncated(Boolean isTruncated) {
            this.isTruncated = isTruncated;
            return this;
        }

        /**
         * The `marker`. This parameter is returned only if the value of `IsTruncated` is `true`. If the parameter is returned, you can call this operation again and set this parameter to obtain the truncated part.
         */
        public Builder marker(String marker) {
            this.marker = marker;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The information of the MFA device.
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
        @NameInMap("DisplayName")
        private String displayName;

        @NameInMap("UserId")
        private String userId;

        @NameInMap("UserPrincipalName")
        private String userPrincipalName;

        private User(Builder builder) {
            this.displayName = builder.displayName;
            this.userId = builder.userId;
            this.userPrincipalName = builder.userPrincipalName;
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
         * @return userPrincipalName
         */
        public String getUserPrincipalName() {
            return this.userPrincipalName;
        }

        public static final class Builder {
            private String displayName; 
            private String userId; 
            private String userPrincipalName; 

            /**
             * The display name of the RAM user.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * The ID of the RAM user.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * The logon name of the RAM user.
             */
            public Builder userPrincipalName(String userPrincipalName) {
                this.userPrincipalName = userPrincipalName;
                return this;
            }

            public User build() {
                return new User(this);
            } 

        } 

    }
    public static class VirtualMFADevice extends TeaModel {
        @NameInMap("ActivateDate")
        private String activateDate;

        @NameInMap("SerialNumber")
        private String serialNumber;

        @NameInMap("User")
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
             * The time when the MFA device was activated.
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
             * The information of the RAM user that has an MFA device bound.
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
        @NameInMap("VirtualMFADevice")
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
