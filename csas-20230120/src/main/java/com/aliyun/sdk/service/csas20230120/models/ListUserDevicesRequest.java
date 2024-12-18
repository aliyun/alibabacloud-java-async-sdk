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
    @com.aliyun.core.annotation.NameInMap("SortBy")
    private String sortBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Username")
    private String username;

    private ListUserDevicesRequest(Builder builder) {
        super(builder);
        this.appStatuses = builder.appStatuses;
        this.currentPage = builder.currentPage;
        this.department = builder.department;
        this.deviceBelong = builder.deviceBelong;
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
        this.sortBy = builder.sortBy;
        this.username = builder.username;
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

    public static final class Builder extends Request.Builder<ListUserDevicesRequest, Builder> {
        private java.util.List<String> appStatuses; 
        private Long currentPage; 
        private String department; 
        private String deviceBelong; 
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
        private String sortBy; 
        private String username; 

        private Builder() {
            super();
        } 

        private Builder(ListUserDevicesRequest request) {
            super(request);
            this.appStatuses = request.appStatuses;
            this.currentPage = request.currentPage;
            this.department = request.department;
            this.deviceBelong = request.deviceBelong;
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
            this.sortBy = request.sortBy;
            this.username = request.username;
        } 

        /**
         * AppStatuses.
         */
        public Builder appStatuses(java.util.List<String> appStatuses) {
            this.putQueryParameter("AppStatuses", appStatuses);
            this.appStatuses = appStatuses;
            return this;
        }

        /**
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
         * Department.
         */
        public Builder department(String department) {
            this.putQueryParameter("Department", department);
            this.department = department;
            return this;
        }

        /**
         * DeviceBelong.
         */
        public Builder deviceBelong(String deviceBelong) {
            this.putQueryParameter("DeviceBelong", deviceBelong);
            this.deviceBelong = deviceBelong;
            return this;
        }

        /**
         * DeviceStatuses.
         */
        public Builder deviceStatuses(java.util.List<String> deviceStatuses) {
            this.putQueryParameter("DeviceStatuses", deviceStatuses);
            this.deviceStatuses = deviceStatuses;
            return this;
        }

        /**
         * DeviceTags.
         */
        public Builder deviceTags(java.util.List<String> deviceTags) {
            this.putQueryParameter("DeviceTags", deviceTags);
            this.deviceTags = deviceTags;
            return this;
        }

        /**
         * DeviceTypes.
         */
        public Builder deviceTypes(java.util.List<String> deviceTypes) {
            this.putQueryParameter("DeviceTypes", deviceTypes);
            this.deviceTypes = deviceTypes;
            return this;
        }

        /**
         * DlpStatuses.
         */
        public Builder dlpStatuses(java.util.List<String> dlpStatuses) {
            this.putQueryParameter("DlpStatuses", dlpStatuses);
            this.dlpStatuses = dlpStatuses;
            return this;
        }

        /**
         * Hostname.
         */
        public Builder hostname(String hostname) {
            this.putQueryParameter("Hostname", hostname);
            this.hostname = hostname;
            return this;
        }

        /**
         * IaStatuses.
         */
        public Builder iaStatuses(java.util.List<String> iaStatuses) {
            this.putQueryParameter("IaStatuses", iaStatuses);
            this.iaStatuses = iaStatuses;
            return this;
        }

        /**
         * InnerIp.
         */
        public Builder innerIp(String innerIp) {
            this.putQueryParameter("InnerIp", innerIp);
            this.innerIp = innerIp;
            return this;
        }

        /**
         * Mac.
         */
        public Builder mac(String mac) {
            this.putQueryParameter("Mac", mac);
            this.mac = mac;
            return this;
        }

        /**
         * NacStatuses.
         */
        public Builder nacStatuses(java.util.List<String> nacStatuses) {
            this.putQueryParameter("NacStatuses", nacStatuses);
            this.nacStatuses = nacStatuses;
            return this;
        }

        /**
         * PaStatuses.
         */
        public Builder paStatuses(java.util.List<String> paStatuses) {
            this.putQueryParameter("PaStatuses", paStatuses);
            this.paStatuses = paStatuses;
            return this;
        }

        /**
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
         * SaseUserId.
         */
        public Builder saseUserId(String saseUserId) {
            this.putQueryParameter("SaseUserId", saseUserId);
            this.saseUserId = saseUserId;
            return this;
        }

        /**
         * SharingStatus.
         */
        public Builder sharingStatus(Boolean sharingStatus) {
            this.putQueryParameter("SharingStatus", sharingStatus);
            this.sharingStatus = sharingStatus;
            return this;
        }

        /**
         * SortBy.
         */
        public Builder sortBy(String sortBy) {
            this.putQueryParameter("SortBy", sortBy);
            this.sortBy = sortBy;
            return this;
        }

        /**
         * Username.
         */
        public Builder username(String username) {
            this.putQueryParameter("Username", username);
            this.username = username;
            return this;
        }

        @Override
        public ListUserDevicesRequest build() {
            return new ListUserDevicesRequest(this);
        } 

    } 

}
