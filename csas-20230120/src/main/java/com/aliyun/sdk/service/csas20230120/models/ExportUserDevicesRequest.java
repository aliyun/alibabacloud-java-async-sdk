// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link ExportUserDevicesRequest} extends {@link RequestModel}
 *
 * <p>ExportUserDevicesRequest</p>
 */
public class ExportUserDevicesRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppStatuses")
    private java.util.List<String> appStatuses;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Department")
    private String department;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DeviceBelong")
    private String deviceBelong;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DeviceStatuses")
    private java.util.List<String> deviceStatuses;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DeviceTags")
    private java.util.List<String> deviceTags;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DeviceTypes")
    private java.util.List<String> deviceTypes;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DlpStatuses")
    private java.util.List<String> dlpStatuses;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Hostname")
    private String hostname;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IaStatuses")
    private java.util.List<String> iaStatuses;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Mac")
    private String mac;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NacStatuses")
    private java.util.List<String> nacStatuses;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PaStatuses")
    private java.util.List<String> paStatuses;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SaseUserId")
    private String saseUserId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SharingStatus")
    private Boolean sharingStatus;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Username")
    private String username;

    private ExportUserDevicesRequest(Builder builder) {
        super(builder);
        this.appStatuses = builder.appStatuses;
        this.department = builder.department;
        this.deviceBelong = builder.deviceBelong;
        this.deviceStatuses = builder.deviceStatuses;
        this.deviceTags = builder.deviceTags;
        this.deviceTypes = builder.deviceTypes;
        this.dlpStatuses = builder.dlpStatuses;
        this.hostname = builder.hostname;
        this.iaStatuses = builder.iaStatuses;
        this.mac = builder.mac;
        this.nacStatuses = builder.nacStatuses;
        this.paStatuses = builder.paStatuses;
        this.saseUserId = builder.saseUserId;
        this.sharingStatus = builder.sharingStatus;
        this.username = builder.username;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExportUserDevicesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appStatuses
     */
    public java.util.List<String> getAppStatuses() {
        return this.appStatuses;
    }

    /**
     * @return department
     */
    public String getDepartment() {
        return this.department;
    }

    /**
     * @return deviceBelong
     */
    public String getDeviceBelong() {
        return this.deviceBelong;
    }

    /**
     * @return deviceStatuses
     */
    public java.util.List<String> getDeviceStatuses() {
        return this.deviceStatuses;
    }

    /**
     * @return deviceTags
     */
    public java.util.List<String> getDeviceTags() {
        return this.deviceTags;
    }

    /**
     * @return deviceTypes
     */
    public java.util.List<String> getDeviceTypes() {
        return this.deviceTypes;
    }

    /**
     * @return dlpStatuses
     */
    public java.util.List<String> getDlpStatuses() {
        return this.dlpStatuses;
    }

    /**
     * @return hostname
     */
    public String getHostname() {
        return this.hostname;
    }

    /**
     * @return iaStatuses
     */
    public java.util.List<String> getIaStatuses() {
        return this.iaStatuses;
    }

    /**
     * @return mac
     */
    public String getMac() {
        return this.mac;
    }

    /**
     * @return nacStatuses
     */
    public java.util.List<String> getNacStatuses() {
        return this.nacStatuses;
    }

    /**
     * @return paStatuses
     */
    public java.util.List<String> getPaStatuses() {
        return this.paStatuses;
    }

    /**
     * @return saseUserId
     */
    public String getSaseUserId() {
        return this.saseUserId;
    }

    /**
     * @return sharingStatus
     */
    public Boolean getSharingStatus() {
        return this.sharingStatus;
    }

    /**
     * @return username
     */
    public String getUsername() {
        return this.username;
    }

    public static final class Builder extends Request.Builder<ExportUserDevicesRequest, Builder> {
        private java.util.List<String> appStatuses; 
        private String department; 
        private String deviceBelong; 
        private java.util.List<String> deviceStatuses; 
        private java.util.List<String> deviceTags; 
        private java.util.List<String> deviceTypes; 
        private java.util.List<String> dlpStatuses; 
        private String hostname; 
        private java.util.List<String> iaStatuses; 
        private String mac; 
        private java.util.List<String> nacStatuses; 
        private java.util.List<String> paStatuses; 
        private String saseUserId; 
        private Boolean sharingStatus; 
        private String username; 

        private Builder() {
            super();
        } 

        private Builder(ExportUserDevicesRequest request) {
            super(request);
            this.appStatuses = request.appStatuses;
            this.department = request.department;
            this.deviceBelong = request.deviceBelong;
            this.deviceStatuses = request.deviceStatuses;
            this.deviceTags = request.deviceTags;
            this.deviceTypes = request.deviceTypes;
            this.dlpStatuses = request.dlpStatuses;
            this.hostname = request.hostname;
            this.iaStatuses = request.iaStatuses;
            this.mac = request.mac;
            this.nacStatuses = request.nacStatuses;
            this.paStatuses = request.paStatuses;
            this.saseUserId = request.saseUserId;
            this.sharingStatus = request.sharingStatus;
            this.username = request.username;
        } 

        /**
         * AppStatuses.
         */
        public Builder appStatuses(java.util.List<String> appStatuses) {
            this.putBodyParameter("AppStatuses", appStatuses);
            this.appStatuses = appStatuses;
            return this;
        }

        /**
         * Department.
         */
        public Builder department(String department) {
            this.putBodyParameter("Department", department);
            this.department = department;
            return this;
        }

        /**
         * DeviceBelong.
         */
        public Builder deviceBelong(String deviceBelong) {
            this.putBodyParameter("DeviceBelong", deviceBelong);
            this.deviceBelong = deviceBelong;
            return this;
        }

        /**
         * DeviceStatuses.
         */
        public Builder deviceStatuses(java.util.List<String> deviceStatuses) {
            this.putBodyParameter("DeviceStatuses", deviceStatuses);
            this.deviceStatuses = deviceStatuses;
            return this;
        }

        /**
         * DeviceTags.
         */
        public Builder deviceTags(java.util.List<String> deviceTags) {
            this.putBodyParameter("DeviceTags", deviceTags);
            this.deviceTags = deviceTags;
            return this;
        }

        /**
         * DeviceTypes.
         */
        public Builder deviceTypes(java.util.List<String> deviceTypes) {
            this.putBodyParameter("DeviceTypes", deviceTypes);
            this.deviceTypes = deviceTypes;
            return this;
        }

        /**
         * DlpStatuses.
         */
        public Builder dlpStatuses(java.util.List<String> dlpStatuses) {
            this.putBodyParameter("DlpStatuses", dlpStatuses);
            this.dlpStatuses = dlpStatuses;
            return this;
        }

        /**
         * Hostname.
         */
        public Builder hostname(String hostname) {
            this.putBodyParameter("Hostname", hostname);
            this.hostname = hostname;
            return this;
        }

        /**
         * IaStatuses.
         */
        public Builder iaStatuses(java.util.List<String> iaStatuses) {
            this.putBodyParameter("IaStatuses", iaStatuses);
            this.iaStatuses = iaStatuses;
            return this;
        }

        /**
         * Mac.
         */
        public Builder mac(String mac) {
            this.putBodyParameter("Mac", mac);
            this.mac = mac;
            return this;
        }

        /**
         * NacStatuses.
         */
        public Builder nacStatuses(java.util.List<String> nacStatuses) {
            this.putBodyParameter("NacStatuses", nacStatuses);
            this.nacStatuses = nacStatuses;
            return this;
        }

        /**
         * PaStatuses.
         */
        public Builder paStatuses(java.util.List<String> paStatuses) {
            this.putBodyParameter("PaStatuses", paStatuses);
            this.paStatuses = paStatuses;
            return this;
        }

        /**
         * SaseUserId.
         */
        public Builder saseUserId(String saseUserId) {
            this.putBodyParameter("SaseUserId", saseUserId);
            this.saseUserId = saseUserId;
            return this;
        }

        /**
         * SharingStatus.
         */
        public Builder sharingStatus(Boolean sharingStatus) {
            this.putBodyParameter("SharingStatus", sharingStatus);
            this.sharingStatus = sharingStatus;
            return this;
        }

        /**
         * Username.
         */
        public Builder username(String username) {
            this.putBodyParameter("Username", username);
            this.username = username;
            return this;
        }

        @Override
        public ExportUserDevicesRequest build() {
            return new ExportUserDevicesRequest(this);
        } 

    } 

}
