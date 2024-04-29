// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVirtualMFADevicesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVirtualMFADevicesResponseBody</p>
 */
public class DescribeVirtualMFADevicesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("VirtualMFADevices")
    private java.util.List < VirtualMFADevices> virtualMFADevices;

    private DescribeVirtualMFADevicesResponseBody(Builder builder) {
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.virtualMFADevices = builder.virtualMFADevices;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVirtualMFADevicesResponseBody create() {
        return builder().build();
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
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
    public java.util.List < VirtualMFADevices> getVirtualMFADevices() {
        return this.virtualMFADevices;
    }

    public static final class Builder {
        private String nextToken; 
        private String requestId; 
        private java.util.List < VirtualMFADevices> virtualMFADevices; 

        /**
         * A pagination token. It can be used in the next request to retrieve a new page of results.If NextToken is empty, no next page exists.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Details of the virtual MFA devices.
         */
        public Builder virtualMFADevices(java.util.List < VirtualMFADevices> virtualMFADevices) {
            this.virtualMFADevices = virtualMFADevices;
            return this;
        }

        public DescribeVirtualMFADevicesResponseBody build() {
            return new DescribeVirtualMFADevicesResponseBody(this);
        } 

    } 

    public static class VirtualMFADevices extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConsecutiveFails")
        private Integer consecutiveFails;

        @com.aliyun.core.annotation.NameInMap("DirectoryId")
        private String directoryId;

        @com.aliyun.core.annotation.NameInMap("EndUserId")
        private String endUserId;

        @com.aliyun.core.annotation.NameInMap("GmtEnabled")
        private String gmtEnabled;

        @com.aliyun.core.annotation.NameInMap("GmtUnlock")
        private String gmtUnlock;

        @com.aliyun.core.annotation.NameInMap("OfficeSiteId")
        private String officeSiteId;

        @com.aliyun.core.annotation.NameInMap("SerialNumber")
        private String serialNumber;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        private VirtualMFADevices(Builder builder) {
            this.consecutiveFails = builder.consecutiveFails;
            this.directoryId = builder.directoryId;
            this.endUserId = builder.endUserId;
            this.gmtEnabled = builder.gmtEnabled;
            this.gmtUnlock = builder.gmtUnlock;
            this.officeSiteId = builder.officeSiteId;
            this.serialNumber = builder.serialNumber;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VirtualMFADevices create() {
            return builder().build();
        }

        /**
         * @return consecutiveFails
         */
        public Integer getConsecutiveFails() {
            return this.consecutiveFails;
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
         * @return gmtEnabled
         */
        public String getGmtEnabled() {
            return this.gmtEnabled;
        }

        /**
         * @return gmtUnlock
         */
        public String getGmtUnlock() {
            return this.gmtUnlock;
        }

        /**
         * @return officeSiteId
         */
        public String getOfficeSiteId() {
            return this.officeSiteId;
        }

        /**
         * @return serialNumber
         */
        public String getSerialNumber() {
            return this.serialNumber;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Integer consecutiveFails; 
            private String directoryId; 
            private String endUserId; 
            private String gmtEnabled; 
            private String gmtUnlock; 
            private String officeSiteId; 
            private String serialNumber; 
            private String status; 

            /**
             * The number of consecutive failures to bind the virtual MFA device, or the number of failures on the verification of the virtual MFA device.
             */
            public Builder consecutiveFails(Integer consecutiveFails) {
                this.consecutiveFails = consecutiveFails;
                return this;
            }

            /**
             * > This parameter is in invitational preview and is not publicly available.
             */
            public Builder directoryId(String directoryId) {
                this.directoryId = directoryId;
                return this;
            }

            /**
             * The name of the AD user who uses the virtual MFA device.
             */
            public Builder endUserId(String endUserId) {
                this.endUserId = endUserId;
                return this;
            }

            /**
             * The time when the virtual MFA device was started. The time follows the [ISO 8601](~~25696~~) standard in the YYYY-MM-DDThh:mm:ssZ format. The time is displayed in UTC.
             */
            public Builder gmtEnabled(String gmtEnabled) {
                this.gmtEnabled = gmtEnabled;
                return this;
            }

            /**
             * The time when a locked virtual MFA device was automatically unlocked. The time follows the [ISO 8601](~~25696~~) standard in the YYYY-MM-DDThh:mm:ssZ format. The time is displayed in UTC.
             */
            public Builder gmtUnlock(String gmtUnlock) {
                this.gmtUnlock = gmtUnlock;
                return this;
            }

            /**
             * The ID of the workspace.
             */
            public Builder officeSiteId(String officeSiteId) {
                this.officeSiteId = officeSiteId;
                return this;
            }

            /**
             * The serial number of the virtual MFA device, which is a unique identifier.
             */
            public Builder serialNumber(String serialNumber) {
                this.serialNumber = serialNumber;
                return this;
            }

            /**
             * The status of the virtual MFA device.
             * <p>
             * 
             * Valid values:
             * 
             * *   LOCKED
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   UNBOUND
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   NORMAL
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public VirtualMFADevices build() {
                return new VirtualMFADevices(this);
            } 

        } 

    }
}
