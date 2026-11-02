// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link AiRtcAuthCodeDTO} extends {@link TeaModel}
 *
 * <p>AiRtcAuthCodeDTO</p>
 */
public class AiRtcAuthCodeDTO extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ActivatedTime")
    private String activatedTime;

    @com.aliyun.core.annotation.NameInMap("AuthCode")
    private String authCode;

    @com.aliyun.core.annotation.NameInMap("CreationTime")
    private String creationTime;

    @com.aliyun.core.annotation.NameInMap("DeviceId")
    private String deviceId;

    @com.aliyun.core.annotation.NameInMap("License")
    private String license;

    @com.aliyun.core.annotation.NameInMap("LicenseItemId")
    private String licenseItemId;

    @com.aliyun.core.annotation.NameInMap("ModificationTime")
    private String modificationTime;

    @com.aliyun.core.annotation.NameInMap("Status")
    private Integer status;

    @com.aliyun.core.annotation.NameInMap("Type")
    private Integer type;

    private AiRtcAuthCodeDTO(Builder builder) {
        this.activatedTime = builder.activatedTime;
        this.authCode = builder.authCode;
        this.creationTime = builder.creationTime;
        this.deviceId = builder.deviceId;
        this.license = builder.license;
        this.licenseItemId = builder.licenseItemId;
        this.modificationTime = builder.modificationTime;
        this.status = builder.status;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AiRtcAuthCodeDTO create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return activatedTime
     */
    public String getActivatedTime() {
        return this.activatedTime;
    }

    /**
     * @return authCode
     */
    public String getAuthCode() {
        return this.authCode;
    }

    /**
     * @return creationTime
     */
    public String getCreationTime() {
        return this.creationTime;
    }

    /**
     * @return deviceId
     */
    public String getDeviceId() {
        return this.deviceId;
    }

    /**
     * @return license
     */
    public String getLicense() {
        return this.license;
    }

    /**
     * @return licenseItemId
     */
    public String getLicenseItemId() {
        return this.licenseItemId;
    }

    /**
     * @return modificationTime
     */
    public String getModificationTime() {
        return this.modificationTime;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * @return type
     */
    public Integer getType() {
        return this.type;
    }

    public static final class Builder {
        private String activatedTime; 
        private String authCode; 
        private String creationTime; 
        private String deviceId; 
        private String license; 
        private String licenseItemId; 
        private String modificationTime; 
        private Integer status; 
        private Integer type; 

        private Builder() {
        } 

        private Builder(AiRtcAuthCodeDTO model) {
            this.activatedTime = model.activatedTime;
            this.authCode = model.authCode;
            this.creationTime = model.creationTime;
            this.deviceId = model.deviceId;
            this.license = model.license;
            this.licenseItemId = model.licenseItemId;
            this.modificationTime = model.modificationTime;
            this.status = model.status;
            this.type = model.type;
        } 

        /**
         * <p>Activation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-01-01 06:57:43</p>
         */
        public Builder activatedTime(String activatedTime) {
            this.activatedTime = activatedTime;
            return this;
        }

        /**
         * <p>Authorization code.</p>
         * 
         * <strong>example:</strong>
         * <p>iU1IeJech7***</p>
         */
        public Builder authCode(String authCode) {
            this.authCode = authCode;
            return this;
        }

        /**
         * <p>Creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-12-23T13:33:49Z</p>
         */
        public Builder creationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }

        /**
         * <p>Device ID.</p>
         * 
         * <strong>example:</strong>
         * <p>device-***</p>
         */
        public Builder deviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }

        /**
         * <p>license。</p>
         * 
         * <strong>example:</strong>
         * <p>a659a06659a***</p>
         */
        public Builder license(String license) {
            this.license = license;
            return this;
        }

        /**
         * <p>Batch ID.</p>
         * 
         * <strong>example:</strong>
         * <p>11096067***</p>
         */
        public Builder licenseItemId(String licenseItemId) {
            this.licenseItemId = licenseItemId;
            return this;
        }

        /**
         * <p>Update time.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-12-23T13:33:49Z</p>
         */
        public Builder modificationTime(String modificationTime) {
            this.modificationTime = modificationTime;
            return this;
        }

        /**
         * <p>Status:</p>
         * <ul>
         * <li>1 - Activated</li>
         * <li>2 - Not activated</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder status(Integer status) {
            this.status = status;
            return this;
        }

        /**
         * <p>Type:</p>
         * <ul>
         * <li>1 - Voice call</li>
         * <li>2 - Visual understanding</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder type(Integer type) {
            this.type = type;
            return this;
        }

        public AiRtcAuthCodeDTO build() {
            return new AiRtcAuthCodeDTO(this);
        } 

    } 

}
