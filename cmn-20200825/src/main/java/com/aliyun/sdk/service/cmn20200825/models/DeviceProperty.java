// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeviceProperty} extends {@link TeaModel}
 *
 * <p>DeviceProperty</p>
 */
public class DeviceProperty extends TeaModel {
    @NameInMap("Content")
    private String content;

    @NameInMap("DeviceForm")
    private String deviceForm;

    @NameInMap("Format")
    private String format;

    @NameInMap("NameCn")
    private String nameCn;

    @NameInMap("NameEn")
    private String nameEn;

    @NameInMap("PropertyId")
    private String propertyId;

    private DeviceProperty(Builder builder) {
        this.content = builder.content;
        this.deviceForm = builder.deviceForm;
        this.format = builder.format;
        this.nameCn = builder.nameCn;
        this.nameEn = builder.nameEn;
        this.propertyId = builder.propertyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeviceProperty create() {
        return builder().build();
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return deviceForm
     */
    public String getDeviceForm() {
        return this.deviceForm;
    }

    /**
     * @return format
     */
    public String getFormat() {
        return this.format;
    }

    /**
     * @return nameCn
     */
    public String getNameCn() {
        return this.nameCn;
    }

    /**
     * @return nameEn
     */
    public String getNameEn() {
        return this.nameEn;
    }

    /**
     * @return propertyId
     */
    public String getPropertyId() {
        return this.propertyId;
    }

    public static final class Builder {
        private String content; 
        private String deviceForm; 
        private String format; 
        private String nameCn; 
        private String nameEn; 
        private String propertyId; 

        /**
         * Content.
         */
        public Builder content(String content) {
            this.content = content;
            return this;
        }

        /**
         * DeviceForm.
         */
        public Builder deviceForm(String deviceForm) {
            this.deviceForm = deviceForm;
            return this;
        }

        /**
         * Format.
         */
        public Builder format(String format) {
            this.format = format;
            return this;
        }

        /**
         * NameCn.
         */
        public Builder nameCn(String nameCn) {
            this.nameCn = nameCn;
            return this;
        }

        /**
         * NameEn.
         */
        public Builder nameEn(String nameEn) {
            this.nameEn = nameEn;
            return this;
        }

        /**
         * PropertyId.
         */
        public Builder propertyId(String propertyId) {
            this.propertyId = propertyId;
            return this;
        }

        public DeviceProperty build() {
            return new DeviceProperty(this);
        } 

    } 

}
