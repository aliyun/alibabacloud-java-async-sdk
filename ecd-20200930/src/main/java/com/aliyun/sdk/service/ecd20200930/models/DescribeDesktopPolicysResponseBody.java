// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDesktopPolicysResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDesktopPolicysResponseBody</p>
 */
public class DescribeDesktopPolicysResponseBody extends TeaModel {
    @NameInMap("DescribeDesktopPolicys")
    private java.util.List < DescribeDesktopPolicys> describeDesktopPolicys;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeDesktopPolicysResponseBody(Builder builder) {
        this.describeDesktopPolicys = builder.describeDesktopPolicys;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDesktopPolicysResponseBody create() {
        return builder().build();
    }

    /**
     * @return describeDesktopPolicys
     */
    public java.util.List < DescribeDesktopPolicys> getDescribeDesktopPolicys() {
        return this.describeDesktopPolicys;
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

    public static final class Builder {
        private java.util.List < DescribeDesktopPolicys> describeDesktopPolicys; 
        private String nextToken; 
        private String requestId; 

        /**
         * DescribeDesktopPolicys.
         */
        public Builder describeDesktopPolicys(java.util.List < DescribeDesktopPolicys> describeDesktopPolicys) {
            this.describeDesktopPolicys = describeDesktopPolicys;
            return this;
        }

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

        public DescribeDesktopPolicysResponseBody build() {
            return new DescribeDesktopPolicysResponseBody(this);
        } 

    } 

    public static class DescribeDesktopPolicys extends TeaModel {
        @NameInMap("Clipboard")
        private String clipboard;

        @NameInMap("DesktopId")
        private String desktopId;

        @NameInMap("LocalDrive")
        private String localDrive;

        @NameInMap("UsbRedirect")
        private String usbRedirect;

        @NameInMap("Watermark")
        private String watermark;

        private DescribeDesktopPolicys(Builder builder) {
            this.clipboard = builder.clipboard;
            this.desktopId = builder.desktopId;
            this.localDrive = builder.localDrive;
            this.usbRedirect = builder.usbRedirect;
            this.watermark = builder.watermark;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DescribeDesktopPolicys create() {
            return builder().build();
        }

        /**
         * @return clipboard
         */
        public String getClipboard() {
            return this.clipboard;
        }

        /**
         * @return desktopId
         */
        public String getDesktopId() {
            return this.desktopId;
        }

        /**
         * @return localDrive
         */
        public String getLocalDrive() {
            return this.localDrive;
        }

        /**
         * @return usbRedirect
         */
        public String getUsbRedirect() {
            return this.usbRedirect;
        }

        /**
         * @return watermark
         */
        public String getWatermark() {
            return this.watermark;
        }

        public static final class Builder {
            private String clipboard; 
            private String desktopId; 
            private String localDrive; 
            private String usbRedirect; 
            private String watermark; 

            /**
             * Clipboard.
             */
            public Builder clipboard(String clipboard) {
                this.clipboard = clipboard;
                return this;
            }

            /**
             * DesktopId.
             */
            public Builder desktopId(String desktopId) {
                this.desktopId = desktopId;
                return this;
            }

            /**
             * LocalDrive.
             */
            public Builder localDrive(String localDrive) {
                this.localDrive = localDrive;
                return this;
            }

            /**
             * UsbRedirect.
             */
            public Builder usbRedirect(String usbRedirect) {
                this.usbRedirect = usbRedirect;
                return this;
            }

            /**
             * Watermark.
             */
            public Builder watermark(String watermark) {
                this.watermark = watermark;
                return this;
            }

            public DescribeDesktopPolicys build() {
                return new DescribeDesktopPolicys(this);
            } 

        } 

    }
}
