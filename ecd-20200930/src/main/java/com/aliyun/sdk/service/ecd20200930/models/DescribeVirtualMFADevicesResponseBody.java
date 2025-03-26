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
    private java.util.List<VirtualMFADevices> virtualMFADevices;

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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<VirtualMFADevices> getVirtualMFADevices() {
        return this.virtualMFADevices;
    }

    public static final class Builder {
        private String nextToken; 
        private String requestId; 
        private java.util.List<VirtualMFADevices> virtualMFADevices; 

        private Builder() {
        } 

        private Builder(DescribeVirtualMFADevicesResponseBody model) {
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.virtualMFADevices = model.virtualMFADevices;
        } 

        /**
         * <p>A pagination token. It can be used in the next request to retrieve a new page of results.If NextToken is empty, no next page exists.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAV3MpHK1AP0pfERHZN5pu6nmB7qrRFJ8vmttjxPL23as</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>FB550AAB-FB36-4A91-93F6-F4374AF65403</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Details of the virtual MFA devices.</p>
         */
        public Builder virtualMFADevices(java.util.List<VirtualMFADevices> virtualMFADevices) {
            this.virtualMFADevices = virtualMFADevices;
            return this;
        }

        public DescribeVirtualMFADevicesResponseBody build() {
            return new DescribeVirtualMFADevicesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeVirtualMFADevicesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVirtualMFADevicesResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(VirtualMFADevices model) {
                this.consecutiveFails = model.consecutiveFails;
                this.directoryId = model.directoryId;
                this.endUserId = model.endUserId;
                this.gmtEnabled = model.gmtEnabled;
                this.gmtUnlock = model.gmtUnlock;
                this.officeSiteId = model.officeSiteId;
                this.serialNumber = model.serialNumber;
                this.status = model.status;
            } 

            /**
             * <p>The number of consecutive failures to bind the virtual MFA device, or the number of failures on the verification of the virtual MFA device.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder consecutiveFails(Integer consecutiveFails) {
                this.consecutiveFails = consecutiveFails;
                return this;
            }

            /**
             * <blockquote>
             * <p>This parameter is in invitational preview and is not publicly available.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou+dir-gx2x1dhsmu52rd****</p>
             */
            public Builder directoryId(String directoryId) {
                this.directoryId = directoryId;
                return this;
            }

            /**
             * <p>The name of the AD user who uses the virtual MFA device.</p>
             * 
             * <strong>example:</strong>
             * <p>usertest</p>
             */
            public Builder endUserId(String endUserId) {
                this.endUserId = endUserId;
                return this;
            }

            /**
             * <p>The time when the virtual MFA device was started. The time follows the <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a> standard in the YYYY-MM-DDThh:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-12-20T14:52:28Z</p>
             */
            public Builder gmtEnabled(String gmtEnabled) {
                this.gmtEnabled = gmtEnabled;
                return this;
            }

            /**
             * <p>The time when a locked virtual MFA device was automatically unlocked. The time follows the <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a> standard in the YYYY-MM-DDThh:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-12-21T15:21:28Z</p>
             */
            public Builder gmtUnlock(String gmtUnlock) {
                this.gmtUnlock = gmtUnlock;
                return this;
            }

            /**
             * <p>The ID of the workspace.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou+dir-269345****</p>
             */
            public Builder officeSiteId(String officeSiteId) {
                this.officeSiteId = officeSiteId;
                return this;
            }

            /**
             * <p>The serial number of the virtual MFA device, which is a unique identifier.</p>
             * 
             * <strong>example:</strong>
             * <p>a25f297f-f2e1-4a44-bbf1-5f48a6e5****</p>
             */
            public Builder serialNumber(String serialNumber) {
                this.serialNumber = serialNumber;
                return this;
            }

            /**
             * <p>The status of the virtual MFA device.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li><p>LOCKED</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- -->
             * </li>
             * <li><p>UNBOUND</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- -->
             * </li>
             * <li><p>NORMAL</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- --></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>NORMAL</p>
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
