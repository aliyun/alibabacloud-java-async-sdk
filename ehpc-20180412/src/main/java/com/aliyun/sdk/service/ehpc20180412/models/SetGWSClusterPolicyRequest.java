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

        private Builder(SetGWSClusterPolicyRequest response) {
            super(response);
            this.asyncMode = response.asyncMode;
            this.clipboard = response.clipboard;
            this.clusterId = response.clusterId;
            this.localDrive = response.localDrive;
            this.udpPort = response.udpPort;
            this.usbRedirect = response.usbRedirect;
            this.watermark = response.watermark;
        } 

        /**
         * AsyncMode.
         */
        public Builder asyncMode(Boolean asyncMode) {
            this.putQueryParameter("AsyncMode", asyncMode);
            this.asyncMode = asyncMode;
            return this;
        }

        /**
         * Clipboard.
         */
        public Builder clipboard(String clipboard) {
            this.putQueryParameter("Clipboard", clipboard);
            this.clipboard = clipboard;
            return this;
        }

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * LocalDrive.
         */
        public Builder localDrive(String localDrive) {
            this.putQueryParameter("LocalDrive", localDrive);
            this.localDrive = localDrive;
            return this;
        }

        /**
         * UdpPort.
         */
        public Builder udpPort(String udpPort) {
            this.putQueryParameter("UdpPort", udpPort);
            this.udpPort = udpPort;
            return this;
        }

        /**
         * UsbRedirect.
         */
        public Builder usbRedirect(String usbRedirect) {
            this.putQueryParameter("UsbRedirect", usbRedirect);
            this.usbRedirect = usbRedirect;
            return this;
        }

        /**
         * Watermark.
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
