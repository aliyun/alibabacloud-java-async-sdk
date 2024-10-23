// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

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
    @com.aliyun.core.annotation.NameInMap("IsTruncated")
    private Boolean isTruncated;

    @com.aliyun.core.annotation.NameInMap("Marker")
    private String marker;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("VirtualMFADevices")
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
         * <p>Indicates whether the response is truncated. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isTruncated(Boolean isTruncated) {
            this.isTruncated = isTruncated;
            return this;
        }

        /**
         * <p>The pagination token that is used in the next request to retrieve a new page of results.</p>
         * <blockquote>
         * <p> This parameter is returned only when <code>IsTruncated</code> is <code>true</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>EXAMPLE</p>
         */
        public Builder marker(String marker) {
            this.marker = marker;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>32272612-DF82-485E-8BA9-AFA4E0C3D0BA</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information about the MFA device.</p>
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

        @com.aliyun.core.annotation.NameInMap("UserPrincipalName")
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
             * <p>The display name of the RAM user.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * <p>The ID of the RAM user.</p>
             * 
             * <strong>example:</strong>
             * <p>20732900249392****</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * <p>The logon name of the RAM user.</p>
             * 
             * <strong>example:</strong>
             * <p>test@177242285274****.onaliyun.com</p>
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

            /**
             * <p>The time when the MFA device was activated.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-10-16T06:02:09Z</p>
             */
            public Builder activateDate(String activateDate) {
                this.activateDate = activateDate;
                return this;
            }

            /**
             * <p>The serial number of the MFA device.</p>
             * 
             * <strong>example:</strong>
             * <p>acs:ram::177242285274****:mfa/test</p>
             */
            public Builder serialNumber(String serialNumber) {
                this.serialNumber = serialNumber;
                return this;
            }

            /**
             * <p>The information of the RAM user that has an MFA device bound.</p>
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
