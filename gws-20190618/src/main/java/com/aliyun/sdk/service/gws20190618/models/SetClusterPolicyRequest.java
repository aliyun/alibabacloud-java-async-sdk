// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gws20190618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetClusterPolicyRequest} extends {@link RequestModel}
 *
 * <p>SetClusterPolicyRequest</p>
 */
public class SetClusterPolicyRequest extends Request {
    @Query
    @NameInMap("AsyncMode")
    private Boolean asyncMode;

    @Query
    @NameInMap("Audio")
    private String audio;

    @Query
    @NameInMap("Clipboard")
    @Validation(required = true)
    private String clipboard;

    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("DomainList")
    private String domainList;

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

    private SetClusterPolicyRequest(Builder builder) {
        super(builder);
        this.asyncMode = builder.asyncMode;
        this.audio = builder.audio;
        this.clipboard = builder.clipboard;
        this.clusterId = builder.clusterId;
        this.domainList = builder.domainList;
        this.localDrive = builder.localDrive;
        this.udpPort = builder.udpPort;
        this.usbRedirect = builder.usbRedirect;
        this.watermark = builder.watermark;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetClusterPolicyRequest create() {
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
     * @return audio
     */
    public String getAudio() {
        return this.audio;
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
     * @return domainList
     */
    public String getDomainList() {
        return this.domainList;
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

    public static final class Builder extends Request.Builder<SetClusterPolicyRequest, Builder> {
        private Boolean asyncMode; 
        private String audio; 
        private String clipboard; 
        private String clusterId; 
        private String domainList; 
        private String localDrive; 
        private String udpPort; 
        private String usbRedirect; 
        private String watermark; 

        private Builder() {
            super();
        } 

        private Builder(SetClusterPolicyRequest response) {
            super(response);
            this.asyncMode = response.asyncMode;
            this.audio = response.audio;
            this.clipboard = response.clipboard;
            this.clusterId = response.clusterId;
            this.domainList = response.domainList;
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
         * Audio.
         */
        public Builder audio(String audio) {
            this.putQueryParameter("Audio", audio);
            this.audio = audio;
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
         * DomainList.
         */
        public Builder domainList(String domainList) {
            this.putQueryParameter("DomainList", domainList);
            this.domainList = domainList;
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
        public SetClusterPolicyRequest build() {
            return new SetClusterPolicyRequest(this);
        } 

    } 

}
