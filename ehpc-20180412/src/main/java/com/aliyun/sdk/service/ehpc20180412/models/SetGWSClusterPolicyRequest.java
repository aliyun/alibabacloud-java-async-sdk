// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetGWSClusterPolicyRequest} extends {@link RequestModel}
 *
 * <p>SetGWSClusterPolicyRequest</p>
 */
public class SetGWSClusterPolicyRequest extends Request {
    @Query
    @NameInMap("AsyncMode")
    private Boolean asyncMode;

    @Query
    @NameInMap("Clipboard")
    @Validation(required = true)
    private String clipboard;

    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("LocalDrive")
    @Validation(required = true)
    private String localDrive;

    @Query
    @NameInMap("UdpPort")
    private String udpPort;

    @Query
    @NameInMap("UsbRedirect")
    @Validation(required = true)
    private String usbRedirect;

    @Query
    @NameInMap("Watermark")
    @Validation(required = true)
    private String watermark;

    private SetGWSClusterPolicyRequest(Builder builder) {
        super(builder);
        this.asyncMode = builder.asyncMode;
        this.clipboard = builder.clipboard;
        this.clusterId = builder.clusterId;
        this.localDrive = builder.localDrive;
        this.udpPort = builder.udpPort;
        this.usbRedirect = builder.usbRedirect;
        this.watermark = builder.watermark;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetGWSClusterPolicyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return asyncMode
     */
    public Boolean getAsyncMode() {
        return this.asyncMode;
    }

    /**
     * @return clipboard
     */
    public String getClipboard() {
        return this.clipboard;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return localDrive
     */
    public String getLocalDrive() {
        return this.localDrive;
    }

    /**
     * @return udpPort
     */
    public String getUdpPort() {
        return this.udpPort;
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

    public static final class Builder extends Request.Builder<SetGWSClusterPolicyRequest, Builder> {
        private Boolean asyncMode; 
        private String clipboard; 
        private String clusterId; 
        private String localDrive; 
        private String udpPort; 
        private String usbRedirect; 
        private String watermark; 

        private Builder() {
            super();
        } 

        private Builder(SetGWSClusterPolicyRequest request) {
            super(request);
            this.asyncMode = request.asyncMode;
            this.clipboard = request.clipboard;
            this.clusterId = request.clusterId;
            this.localDrive = request.localDrive;
            this.udpPort = request.udpPort;
            this.usbRedirect = request.usbRedirect;
            this.watermark = request.watermark;
        } 

        /**
         * Specifies whether to support the asynchronous calls.
         * <p>
         * 
         * *   false: not supported. The result is returned after the request is completed.
         * *   true: supported. The result is immediately returned while the request is being processed.
         * 
         * Default value: false.
         */
        public Builder asyncMode(Boolean asyncMode) {
            this.putQueryParameter("AsyncMode", asyncMode);
            this.asyncMode = asyncMode;
            return this;
        }

        /**
         * The permissions on the clipboard. Valid values:
         * <p>
         * 
         * *   read: read-only. You can copy data from your local computer to the cloud desktop, but cannot copy data from the cloud desktop to your local computer.
         * *   readwrite: read and write. You can copy data between your local computer and the cloud desktop.
         * *   off: disabled. You cannot copy data between your local computer and the cloud desktop.
         * 
         * Default value: off.
         */
        public Builder clipboard(String clipboard) {
            this.putQueryParameter("Clipboard", clipboard);
            this.clipboard = clipboard;
            return this;
        }

        /**
         * The ID of the visualization service.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The permissions on local disk mapping. Valid values:
         * <p>
         * 
         * *   read: read-only. The disks on your local computer are mapped to the cloud desktop. You can only read (copy) files on the local computer, but cannot modify the files.
         * *   readwrite: read and write. The disks on your local computer are mapped to the cloud desktop. You can read (copy) and modify files on your local computer.
         * *   off: disabled. The disks on your local computer are not mapped to the cloud desktop.
         * 
         * Default value: off.
         */
        public Builder localDrive(String localDrive) {
            this.putQueryParameter("LocalDrive", localDrive);
            this.localDrive = localDrive;
            return this;
        }

        /**
         * The UDP port. Valid values:
         * <p>
         * 
         * *   on
         * *   off
         * 
         * Default value: on.
         */
        public Builder udpPort(String udpPort) {
            this.putQueryParameter("UdpPort", udpPort);
            this.udpPort = udpPort;
            return this;
        }

        /**
         * The USB redirection feature. Valid values:
         * <p>
         * 
         * *   on
         * *   off
         * 
         * Default value: off.
         */
        public Builder usbRedirect(String usbRedirect) {
            this.putQueryParameter("UsbRedirect", usbRedirect);
            this.usbRedirect = usbRedirect;
            return this;
        }

        /**
         * The watermarking feature. Valid values:
         * <p>
         * 
         * *   on
         * *   off
         * 
         * Default value: off.
         */
        public Builder watermark(String watermark) {
            this.putQueryParameter("Watermark", watermark);
            this.watermark = watermark;
            return this;
        }

        @Override
        public SetGWSClusterPolicyRequest build() {
            return new SetGWSClusterPolicyRequest(this);
        } 

    } 

}
