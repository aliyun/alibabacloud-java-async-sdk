// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeGWSClusterPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeGWSClusterPolicyResponseBody</p>
 */
public class DescribeGWSClusterPolicyResponseBody extends TeaModel {
    @NameInMap("Clipboard")
    private String clipboard;

    @NameInMap("LocalDrive")
    private String localDrive;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("UsbRedirect")
    private String usbRedirect;

    @NameInMap("Watermark")
    private String watermark;

    private DescribeGWSClusterPolicyResponseBody(Builder builder) {
        this.clipboard = builder.clipboard;
        this.localDrive = builder.localDrive;
        this.requestId = builder.requestId;
        this.usbRedirect = builder.usbRedirect;
        this.watermark = builder.watermark;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeGWSClusterPolicyResponseBody create() {
        return builder().build();
    }

    /**
     * @return clipboard
     */
    public String getClipboard() {
        return this.clipboard;
    }

    /**
     * @return localDrive
     */
    public String getLocalDrive() {
        return this.localDrive;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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
        private String localDrive; 
        private String requestId; 
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
         * LocalDrive.
         */
        public Builder localDrive(String localDrive) {
            this.localDrive = localDrive;
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

        public DescribeGWSClusterPolicyResponseBody build() {
            return new DescribeGWSClusterPolicyResponseBody(this);
        } 

    } 

}
