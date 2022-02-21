// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVirtualMFADevicesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVirtualMFADevicesResponseBody</p>
 */
public class DescribeVirtualMFADevicesResponseBody extends TeaModel {
    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("VirtualMFADevices")
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
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * VirtualMFADevices.
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
        @NameInMap("ConsecutiveFails")
        private Integer consecutiveFails;

        @NameInMap("DirectoryId")
        private String directoryId;

        @NameInMap("EndUserId")
        private String endUserId;

        @NameInMap("GmtEnabled")
        private String gmtEnabled;

        @NameInMap("GmtUnlock")
        private String gmtUnlock;

        @NameInMap("OfficeSiteId")
        private String officeSiteId;

        @NameInMap("SerialNumber")
        private String serialNumber;

        @NameInMap("status")
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
             * ConsecutiveFails.
             */
            public Builder consecutiveFails(Integer consecutiveFails) {
                this.consecutiveFails = consecutiveFails;
                return this;
            }

            /**
             * DirectoryId.
             */
            public Builder directoryId(String directoryId) {
                this.directoryId = directoryId;
                return this;
            }

            /**
             * EndUserId.
             */
            public Builder endUserId(String endUserId) {
                this.endUserId = endUserId;
                return this;
            }

            /**
             * GmtEnabled.
             */
            public Builder gmtEnabled(String gmtEnabled) {
                this.gmtEnabled = gmtEnabled;
                return this;
            }

            /**
             * GmtUnlock.
             */
            public Builder gmtUnlock(String gmtUnlock) {
                this.gmtUnlock = gmtUnlock;
                return this;
            }

            /**
             * OfficeSiteId.
             */
            public Builder officeSiteId(String officeSiteId) {
                this.officeSiteId = officeSiteId;
                return this;
            }

            /**
             * SerialNumber.
             */
            public Builder serialNumber(String serialNumber) {
                this.serialNumber = serialNumber;
                return this;
            }

            /**
             * status.
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
