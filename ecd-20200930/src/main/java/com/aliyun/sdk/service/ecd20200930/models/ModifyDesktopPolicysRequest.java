// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDesktopPolicysRequest} extends {@link RequestModel}
 *
 * <p>ModifyDesktopPolicysRequest</p>
 */
public class ModifyDesktopPolicysRequest extends Request {
    @Query
    @NameInMap("Clipboard")
    private String clipboard;

    @Query
    @NameInMap("DesktopId")
    @Validation(required = true)
    private java.util.List < String > desktopId;

    @Query
    @NameInMap("LocalDrive")
    private String localDrive;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("UsbRedirect")
    private String usbRedirect;

    @Query
    @NameInMap("Watermark")
    private String watermark;

    private ModifyDesktopPolicysRequest(Builder builder) {
        super(builder);
        this.clipboard = builder.clipboard;
        this.desktopId = builder.desktopId;
        this.localDrive = builder.localDrive;
        this.regionId = builder.regionId;
        this.usbRedirect = builder.usbRedirect;
        this.watermark = builder.watermark;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDesktopPolicysRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List < String > getDesktopId() {
        return this.desktopId;
    }

    /**
     * @return localDrive
     */
    public String getLocalDrive() {
        return this.localDrive;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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

    public static final class Builder extends Request.Builder<ModifyDesktopPolicysRequest, Builder> {
        private String clipboard; 
        private java.util.List < String > desktopId; 
        private String localDrive; 
        private String regionId; 
        private String usbRedirect; 
        private String watermark; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDesktopPolicysRequest response) {
            super(response);
            this.clipboard = response.clipboard;
            this.desktopId = response.desktopId;
            this.localDrive = response.localDrive;
            this.regionId = response.regionId;
            this.usbRedirect = response.usbRedirect;
            this.watermark = response.watermark;
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
         * DesktopId.
         */
        public Builder desktopId(java.util.List < String > desktopId) {
            this.putQueryParameter("DesktopId", desktopId);
            this.desktopId = desktopId;
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
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
        public ModifyDesktopPolicysRequest build() {
            return new ModifyDesktopPolicysRequest(this);
        } 

    } 

}
