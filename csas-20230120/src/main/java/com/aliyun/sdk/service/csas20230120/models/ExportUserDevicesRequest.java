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
         * <p>Collection of client statuses.</p>
         */
        public Builder appStatuses(java.util.List<String> appStatuses) {
            this.putBodyParameter("AppStatuses", appStatuses);
            this.appStatuses = appStatuses;
            return this;
        }

        /**
         * <p>Department name. Must be 1 to 128 characters long. Supports Chinese, uppercase and lowercase letters, digits, periods (.), commas (,), semicolons (;), hyphens (-), underscores (_), forward slashes (/), at signs (@), and spaces.</p>
         * 
         * <strong>example:</strong>
         * <p>测试部</p>
         */
        public Builder department(String department) {
            this.putBodyParameter("Department", department);
            this.department = department;
            return this;
        }

        /**
         * <p>Terminal device ownership. Valid values:</p>
         * <ul>
         * <li><p><strong>Personal</strong>: Personal device.</p>
         * </li>
         * <li><p><strong>Company</strong>: Company device.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Company</p>
         */
        public Builder deviceBelong(String deviceBelong) {
            this.putBodyParameter("DeviceBelong", deviceBelong);
            this.deviceBelong = deviceBelong;
            return this;
        }

        /**
         * <p>Collection of terminal device statuses.</p>
         */
        public Builder deviceStatuses(java.util.List<String> deviceStatuses) {
            this.putBodyParameter("DeviceStatuses", deviceStatuses);
            this.deviceStatuses = deviceStatuses;
            return this;
        }

        /**
         * <p>Collection of terminal device IDs.</p>
         */
        public Builder deviceTags(java.util.List<String> deviceTags) {
            this.putBodyParameter("DeviceTags", deviceTags);
            this.deviceTags = deviceTags;
            return this;
        }

        /**
         * <p>Collection of terminal device operating system types.</p>
         */
        public Builder deviceTypes(java.util.List<String> deviceTypes) {
            this.putBodyParameter("DeviceTypes", deviceTypes);
            this.deviceTypes = deviceTypes;
            return this;
        }

        /**
         * <p>Collection of office data protection statuses.</p>
         */
        public Builder dlpStatuses(java.util.List<String> dlpStatuses) {
            this.putBodyParameter("DlpStatuses", dlpStatuses);
            this.dlpStatuses = dlpStatuses;
            return this;
        }

        /**
         * <p>Terminal device name. Must be 1 to 128 characters long. Supports Chinese, uppercase and lowercase letters, digits, periods (.), commas (,), semicolons (;), hyphens (-), underscores (<em>), forward slashes (/), at signs (@), and spaces. If you enter only an underscore (</em>), the system returns all terminal devices whose names contain four-byte UTF-8 characters.</p>
         * 
         * <strong>example:</strong>
         * <p>win10-64bit</p>
         */
        public Builder hostname(String hostname) {
            this.putBodyParameter("Hostname", hostname);
            this.hostname = hostname;
            return this;
        }

        /**
         * <p>Collection of Internet access statuses.</p>
         */
        public Builder iaStatuses(java.util.List<String> iaStatuses) {
            this.putBodyParameter("IaStatuses", iaStatuses);
            this.iaStatuses = iaStatuses;
            return this;
        }

        /**
         * <p>MAC address of the terminal device.</p>
         * 
         * <strong>example:</strong>
         * <p>00:16:7c:46:<strong>:</strong></p>
         */
        public Builder mac(String mac) {
            this.putBodyParameter("Mac", mac);
            this.mac = mac;
            return this;
        }

        /**
         * <p>Collection of network admission statuses.</p>
         */
        public Builder nacStatuses(java.util.List<String> nacStatuses) {
            this.putBodyParameter("NacStatuses", nacStatuses);
            this.nacStatuses = nacStatuses;
            return this;
        }

        /**
         * <p>Collection of private network access statuses.</p>
         */
        public Builder paStatuses(java.util.List<String> paStatuses) {
            this.putBodyParameter("PaStatuses", paStatuses);
            this.paStatuses = paStatuses;
            return this;
        }

        /**
         * <p>User ID.</p>
         * 
         * <strong>example:</strong>
         * <p>su_e8f218fb171edd167c2ad917d21f53148bdefc510ca1f3c3cc0249d3643d****</p>
         */
        public Builder saseUserId(String saseUserId) {
            this.putBodyParameter("SaseUserId", saseUserId);
            this.saseUserId = saseUserId;
            return this;
        }

        /**
         * <p>Whether device sharing is enabled. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: Sharing is enabled.</p>
         * </li>
         * <li><p><strong>false</strong>: Sharing is disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder sharingStatus(Boolean sharingStatus) {
            this.putBodyParameter("SharingStatus", sharingStatus);
            this.sharingStatus = sharingStatus;
            return this;
        }

        /**
         * <p>Username. Must be 1 to 128 characters long. Supports Chinese, uppercase and lowercase letters, digits, periods (.), underscores (_), hyphens (-), asterisks (\*), at signs (@), and spaces.</p>
         * 
         * <strong>example:</strong>
         * <p>王先生</p>
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
