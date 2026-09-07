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
 * {@link ListUserDevicesRequest} extends {@link RequestModel}
 *
 * <p>ListUserDevicesRequest</p>
 */
public class ListUserDevicesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppStatuses")
    private java.util.List<String> appStatuses;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppVersions")
    private java.util.List<String> appVersions;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoLoginStatuses")
    private java.util.List<String> autoLoginStatuses;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Department")
    private String department;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeviceBelong")
    private String deviceBelong;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeviceGroupId")
    private String deviceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeviceStatuses")
    private java.util.List<String> deviceStatuses;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeviceTags")
    private java.util.List<String> deviceTags;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeviceTypes")
    private java.util.List<String> deviceTypes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DlpStatuses")
    private java.util.List<String> dlpStatuses;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Hostname")
    private String hostname;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IaStatuses")
    private java.util.List<String> iaStatuses;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InnerIp")
    private String innerIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Mac")
    private String mac;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NacStatuses")
    private java.util.List<String> nacStatuses;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PaStatuses")
    private java.util.List<String> paStatuses;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SaseUserId")
    private String saseUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SharingStatus")
    private Boolean sharingStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SnBios")
    private String snBios;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SnSystem")
    private String snSystem;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SortBy")
    private String sortBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Username")
    private String username;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Workshop")
    private String workshop;

    private ListUserDevicesRequest(Builder builder) {
        super(builder);
        this.appStatuses = builder.appStatuses;
        this.appVersions = builder.appVersions;
        this.autoLoginStatuses = builder.autoLoginStatuses;
        this.currentPage = builder.currentPage;
        this.department = builder.department;
        this.deviceBelong = builder.deviceBelong;
        this.deviceGroupId = builder.deviceGroupId;
        this.deviceStatuses = builder.deviceStatuses;
        this.deviceTags = builder.deviceTags;
        this.deviceTypes = builder.deviceTypes;
        this.dlpStatuses = builder.dlpStatuses;
        this.hostname = builder.hostname;
        this.iaStatuses = builder.iaStatuses;
        this.innerIp = builder.innerIp;
        this.mac = builder.mac;
        this.nacStatuses = builder.nacStatuses;
        this.paStatuses = builder.paStatuses;
        this.pageSize = builder.pageSize;
        this.saseUserId = builder.saseUserId;
        this.sharingStatus = builder.sharingStatus;
        this.snBios = builder.snBios;
        this.snSystem = builder.snSystem;
        this.sortBy = builder.sortBy;
        this.username = builder.username;
        this.workshop = builder.workshop;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListUserDevicesRequest create() {
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
     * @return appVersions
     */
    public java.util.List<String> getAppVersions() {
        return this.appVersions;
    }

    /**
     * @return autoLoginStatuses
     */
    public java.util.List<String> getAutoLoginStatuses() {
        return this.autoLoginStatuses;
    }

    /**
     * @return currentPage
     */
    public Long getCurrentPage() {
        return this.currentPage;
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
     * @return deviceGroupId
     */
    public String getDeviceGroupId() {
        return this.deviceGroupId;
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
     * @return innerIp
     */
    public String getInnerIp() {
        return this.innerIp;
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
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
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
     * @return snBios
     */
    public String getSnBios() {
        return this.snBios;
    }

    /**
     * @return snSystem
     */
    public String getSnSystem() {
        return this.snSystem;
    }

    /**
     * @return sortBy
     */
    public String getSortBy() {
        return this.sortBy;
    }

    /**
     * @return username
     */
    public String getUsername() {
        return this.username;
    }

    /**
     * @return workshop
     */
    public String getWorkshop() {
        return this.workshop;
    }

    public static final class Builder extends Request.Builder<ListUserDevicesRequest, Builder> {
        private java.util.List<String> appStatuses; 
        private java.util.List<String> appVersions; 
        private java.util.List<String> autoLoginStatuses; 
        private Long currentPage; 
        private String department; 
        private String deviceBelong; 
        private String deviceGroupId; 
        private java.util.List<String> deviceStatuses; 
        private java.util.List<String> deviceTags; 
        private java.util.List<String> deviceTypes; 
        private java.util.List<String> dlpStatuses; 
        private String hostname; 
        private java.util.List<String> iaStatuses; 
        private String innerIp; 
        private String mac; 
        private java.util.List<String> nacStatuses; 
        private java.util.List<String> paStatuses; 
        private Long pageSize; 
        private String saseUserId; 
        private Boolean sharingStatus; 
        private String snBios; 
        private String snSystem; 
        private String sortBy; 
        private String username; 
        private String workshop; 

        private Builder() {
            super();
        } 

        private Builder(ListUserDevicesRequest request) {
            super(request);
            this.appStatuses = request.appStatuses;
            this.appVersions = request.appVersions;
            this.autoLoginStatuses = request.autoLoginStatuses;
            this.currentPage = request.currentPage;
            this.department = request.department;
            this.deviceBelong = request.deviceBelong;
            this.deviceGroupId = request.deviceGroupId;
            this.deviceStatuses = request.deviceStatuses;
            this.deviceTags = request.deviceTags;
            this.deviceTypes = request.deviceTypes;
            this.dlpStatuses = request.dlpStatuses;
            this.hostname = request.hostname;
            this.iaStatuses = request.iaStatuses;
            this.innerIp = request.innerIp;
            this.mac = request.mac;
            this.nacStatuses = request.nacStatuses;
            this.paStatuses = request.paStatuses;
            this.pageSize = request.pageSize;
            this.saseUserId = request.saseUserId;
            this.sharingStatus = request.sharingStatus;
            this.snBios = request.snBios;
            this.snSystem = request.snSystem;
            this.sortBy = request.sortBy;
            this.username = request.username;
            this.workshop = request.workshop;
        } 

        /**
         * <p>The collection of client statuses.</p>
         */
        public Builder appStatuses(java.util.List<String> appStatuses) {
            this.putQueryParameter("AppStatuses", appStatuses);
            this.appStatuses = appStatuses;
            return this;
        }

        /**
         * <p>The collection of client versions.</p>
         */
        public Builder appVersions(java.util.List<String> appVersions) {
            this.putQueryParameter("AppVersions", appVersions);
            this.appVersions = appVersions;
            return this;
        }

        /**
         * AutoLoginStatuses.
         */
        public Builder autoLoginStatuses(java.util.List<String> autoLoginStatuses) {
            this.putQueryParameter("AutoLoginStatuses", autoLoginStatuses);
            this.autoLoginStatuses = autoLoginStatuses;
            return this;
        }

        /**
         * <p>The page number of the current page in a paging query. Valid values: 1 to 10000.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Long currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The department to which the user belongs. The value is 1 to 128 characters in length and supports Chinese characters and uppercase and lowercase letters. It can contain digits, periods (.), commas (,), semicolons (;), hyphens (-), underscores (_), forward slashes (/), at signs (@), and spaces.</p>
         * 
         * <strong>example:</strong>
         * <p>测试部</p>
         */
        public Builder department(String department) {
            this.putQueryParameter("Department", department);
            this.department = department;
            return this;
        }

        /**
         * <p>The ownership of the endpoint device. Valid values:</p>
         * <ul>
         * <li><strong>Personal</strong>: personal device.</li>
         * <li><strong>Company</strong>: company device.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Company</p>
         */
        public Builder deviceBelong(String deviceBelong) {
            this.putQueryParameter("DeviceBelong", deviceBelong);
            this.deviceBelong = deviceBelong;
            return this;
        }

        /**
         * <p>The device group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>device-group-5191cf830a5e****</p>
         */
        public Builder deviceGroupId(String deviceGroupId) {
            this.putQueryParameter("DeviceGroupId", deviceGroupId);
            this.deviceGroupId = deviceGroupId;
            return this;
        }

        /**
         * <p>The collection of endpoint device statuses.</p>
         */
        public Builder deviceStatuses(java.util.List<String> deviceStatuses) {
            this.putQueryParameter("DeviceStatuses", deviceStatuses);
            this.deviceStatuses = deviceStatuses;
            return this;
        }

        /**
         * <p>The collection of endpoint device IDs.</p>
         */
        public Builder deviceTags(java.util.List<String> deviceTags) {
            this.putQueryParameter("DeviceTags", deviceTags);
            this.deviceTags = deviceTags;
            return this;
        }

        /**
         * <p>The collection of endpoint device operating system types.</p>
         */
        public Builder deviceTypes(java.util.List<String> deviceTypes) {
            this.putQueryParameter("DeviceTypes", deviceTypes);
            this.deviceTypes = deviceTypes;
            return this;
        }

        /**
         * <p>The collection of office data protection statuses.</p>
         */
        public Builder dlpStatuses(java.util.List<String> dlpStatuses) {
            this.putQueryParameter("DlpStatuses", dlpStatuses);
            this.dlpStatuses = dlpStatuses;
            return this;
        }

        /**
         * <p>The name of the endpoint device. The value is 1 to 128 characters in length and supports Chinese characters and uppercase and lowercase letters. It can contain digits, periods (.), commas (,), semicolons (;), hyphens (-), underscores (<em>), forward slashes (/), at signs (@), and spaces. If you enter only an underscore (</em>), endpoint devices whose names contain 4-byte UTF-8 characters are also queried.</p>
         * 
         * <strong>example:</strong>
         * <p>win10-64bit</p>
         */
        public Builder hostname(String hostname) {
            this.putQueryParameter("Hostname", hostname);
            this.hostname = hostname;
            return this;
        }

        /**
         * <p>The collection of Internet access statuses.</p>
         */
        public Builder iaStatuses(java.util.List<String> iaStatuses) {
            this.putQueryParameter("IaStatuses", iaStatuses);
            this.iaStatuses = iaStatuses;
            return this;
        }

        /**
         * <p>The internal IP address of the endpoint device.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.XX.XX</p>
         */
        public Builder innerIp(String innerIp) {
            this.putQueryParameter("InnerIp", innerIp);
            this.innerIp = innerIp;
            return this;
        }

        /**
         * <p>The MAC address of the endpoint device.</p>
         * 
         * <strong>example:</strong>
         * <p>00:16:XX:XX:7c:46</p>
         */
        public Builder mac(String mac) {
            this.putQueryParameter("Mac", mac);
            this.mac = mac;
            return this;
        }

        /**
         * <p>The collection of network access control statuses.</p>
         */
        public Builder nacStatuses(java.util.List<String> nacStatuses) {
            this.putQueryParameter("NacStatuses", nacStatuses);
            this.nacStatuses = nacStatuses;
            return this;
        }

        /**
         * <p>The collection of private access statuses.</p>
         */
        public Builder paStatuses(java.util.List<String> paStatuses) {
            this.putQueryParameter("PaStatuses", paStatuses);
            this.paStatuses = paStatuses;
            return this;
        }

        /**
         * <p>The number of entries per page in a paging query. Settings: 1 to 500.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The user ID. You can obtain this value from the following operations:</p>
         * <ul>
         * <li><a href="~~GetUserDevice~~">GetUserDevice</a>: Queries the details of a user endpoint device.</li>
         * <li><a href="~~ListUserDevices~~">ListUserDevices</a>: Lists user endpoint devices.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>su_e8f218fb171edd167c2ad917d21f53148bdefc510ca1f3c3cc0249d3643d****</p>
         */
        public Builder saseUserId(String saseUserId) {
            this.putQueryParameter("SaseUserId", saseUserId);
            this.saseUserId = saseUserId;
            return this;
        }

        /**
         * <p>Specifies whether sharing is enabled for the device. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Sharing is enabled.</li>
         * <li><strong>false</strong>: Sharing is disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder sharingStatus(Boolean sharingStatus) {
            this.putQueryParameter("SharingStatus", sharingStatus);
            this.sharingStatus = sharingStatus;
            return this;
        }

        /**
         * <p>The BIOS system serial number.</p>
         * 
         * <strong>example:</strong>
         * <p>5CG003****</p>
         */
        public Builder snBios(String snBios) {
            this.putQueryParameter("SnBios", snBios);
            this.snBios = snBios;
            return this;
        }

        /**
         * <p>The system serial number.</p>
         * 
         * <strong>example:</strong>
         * <p>KVN9C9****</p>
         */
        public Builder snSystem(String snSystem) {
            this.putQueryParameter("SnSystem", snSystem);
            this.snSystem = snSystem;
            return this;
        }

        /**
         * <p>The sort parameter. Valid values:</p>
         * <ul>
         * <li><strong>Username</strong>: sorted by Username in ascending order.</li>
         * <li><strong>AppVersion</strong>: sorted by AppVersion in descending order.</li>
         * <li><strong>UpdateTime</strong>: sorted by UpdateTime in descending order.</li>
         * <li><strong>CreateTime</strong>: sorted by CreateTime in descending order.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>UpdateTime</p>
         */
        public Builder sortBy(String sortBy) {
            this.putQueryParameter("SortBy", sortBy);
            this.sortBy = sortBy;
            return this;
        }

        /**
         * <p>The username. The value is 1 to 128 characters in length and supports Chinese characters and uppercase and lowercase letters. It can contain digits, periods (.), underscores (_), hyphens (-), asterisks (*), at signs (@), and spaces.</p>
         * 
         * <strong>example:</strong>
         * <p>王先生</p>
         */
        public Builder username(String username) {
            this.putQueryParameter("Username", username);
            this.username = username;
            return this;
        }

        /**
         * <p>The name of the office area.</p>
         * 
         * <strong>example:</strong>
         * <p>测试办公区</p>
         */
        public Builder workshop(String workshop) {
            this.putQueryParameter("Workshop", workshop);
            this.workshop = workshop;
            return this;
        }

        @Override
        public ListUserDevicesRequest build() {
            return new ListUserDevicesRequest(this);
        } 

    } 

}
