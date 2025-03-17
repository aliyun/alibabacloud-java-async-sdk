// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
 * {@link DescribeDevicesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDevicesResponseBody</p>
 */
public class DescribeDevicesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Devices")
    private java.util.List<Devices> devices;

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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return devices
     */
    public java.util.List<Devices> getDevices() {
        return this.devices;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Devices> devices; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeDevicesResponseBody model) {
            this.devices = model.devices;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The information about devices that you queried.</p>
         */
        public Builder devices(java.util.List<Devices> devices) {
            this.devices = devices;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>5BEFE642-A383-4A18-8939-FB7DE452****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDevicesResponseBody build() {
            return new DescribeDevicesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDevicesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDevicesResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(EndUserList model) {
                this.adDomain = model.adDomain;
                this.directoryId = model.directoryId;
                this.endUserId = model.endUserId;
                this.userType = model.userType;
            } 

            /**
             * <p>The address of the AD office network.</p>
             * 
             * <strong>example:</strong>
             * <p>xn--0zw****</p>
             */
            public Builder adDomain(String adDomain) {
                this.adDomain = adDomain;
                return this;
            }

            /**
             * <p>The ID of the convenient office network.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou+dir-jedbpr4sl9l37****</p>
             */
            public Builder directoryId(String directoryId) {
                this.directoryId = directoryId;
                return this;
            }

            /**
             * <p>The ID of the user.</p>
             * 
             * <strong>example:</strong>
             * <p>moli</p>
             */
            public Builder endUserId(String endUserId) {
                this.endUserId = endUserId;
                return this;
            }

            /**
             * <p>The account type of the user.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>AD: enterprise AD account.</li>
             * <li>SIMPLE: convenience account</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SIMPLE</p>
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
    /**
     * 
     * {@link DescribeDevicesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDevicesResponseBody</p>
     */
    public static class Devices extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DeviceId")
        private String deviceId;

        @com.aliyun.core.annotation.NameInMap("EndUserList")
        private java.util.List<EndUserList> endUserList;

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
        public java.util.List<EndUserList> getEndUserList() {
            return this.endUserList;
        }

        public static final class Builder {
            private String deviceId; 
            private java.util.List<EndUserList> endUserList; 

            private Builder() {
            } 

            private Builder(Devices model) {
                this.deviceId = model.deviceId;
                this.endUserList = model.endUserList;
            } 

            /**
             * <p>The ID of the device. The serial number (SN) of the hardware client or the UUID of the software client.</p>
             * 
             * <strong>example:</strong>
             * <p>5F52817BE267A43C608D245070D2****</p>
             */
            public Builder deviceId(String deviceId) {
                this.deviceId = deviceId;
                return this;
            }

            /**
             * <p>The users who are bound to the device.</p>
             */
            public Builder endUserList(java.util.List<EndUserList> endUserList) {
                this.endUserList = endUserList;
                return this;
            }

            public Devices build() {
                return new Devices(this);
            } 

        } 

    }
}
