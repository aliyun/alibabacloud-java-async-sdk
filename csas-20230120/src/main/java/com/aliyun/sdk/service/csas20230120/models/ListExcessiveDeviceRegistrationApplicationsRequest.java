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
 * {@link ListExcessiveDeviceRegistrationApplicationsRequest} extends {@link RequestModel}
 *
 * <p>ListExcessiveDeviceRegistrationApplicationsRequest</p>
 */
public class ListExcessiveDeviceRegistrationApplicationsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationIds")
    private java.util.List<String> applicationIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Department")
    private String department;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeviceTag")
    private String deviceTag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Hostname")
    private String hostname;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Mac")
    private String mac;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SaseUserId")
    private String saseUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Statuses")
    private java.util.List<String> statuses;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Username")
    private String username;

    private ListExcessiveDeviceRegistrationApplicationsRequest(Builder builder) {
        super(builder);
        this.applicationIds = builder.applicationIds;
        this.currentPage = builder.currentPage;
        this.department = builder.department;
        this.deviceTag = builder.deviceTag;
        this.hostname = builder.hostname;
        this.mac = builder.mac;
        this.pageSize = builder.pageSize;
        this.saseUserId = builder.saseUserId;
        this.statuses = builder.statuses;
        this.username = builder.username;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListExcessiveDeviceRegistrationApplicationsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationIds
     */
    public java.util.List<String> getApplicationIds() {
        return this.applicationIds;
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
     * @return deviceTag
     */
    public String getDeviceTag() {
        return this.deviceTag;
    }

    /**
     * @return hostname
     */
    public String getHostname() {
        return this.hostname;
    }

    /**
     * @return mac
     */
    public String getMac() {
        return this.mac;
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
     * @return statuses
     */
    public java.util.List<String> getStatuses() {
        return this.statuses;
    }

    /**
     * @return username
     */
    public String getUsername() {
        return this.username;
    }

    public static final class Builder extends Request.Builder<ListExcessiveDeviceRegistrationApplicationsRequest, Builder> {
        private java.util.List<String> applicationIds; 
        private Long currentPage; 
        private String department; 
        private String deviceTag; 
        private String hostname; 
        private String mac; 
        private Long pageSize; 
        private String saseUserId; 
        private java.util.List<String> statuses; 
        private String username; 

        private Builder() {
            super();
        } 

        private Builder(ListExcessiveDeviceRegistrationApplicationsRequest request) {
            super(request);
            this.applicationIds = request.applicationIds;
            this.currentPage = request.currentPage;
            this.department = request.department;
            this.deviceTag = request.deviceTag;
            this.hostname = request.hostname;
            this.mac = request.mac;
            this.pageSize = request.pageSize;
            this.saseUserId = request.saseUserId;
            this.statuses = request.statuses;
            this.username = request.username;
        } 

        /**
         * <p>The IDs of the excessive device registration applications.</p>
         */
        public Builder applicationIds(java.util.List<String> applicationIds) {
            this.putQueryParameter("ApplicationIds", applicationIds);
            this.applicationIds = applicationIds;
            return this;
        }

        /**
         * <p>The page number. Valid values: 1 to 10,000.</p>
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
         * <p>The user\&quot;s department. The value must be 1 to 128 characters long and can contain Chinese characters, uppercase and lowercase letters, digits, periods (.), commas (,), semicolons (;), hyphens (-), underscores (_), forward slashes (/), at signs (@), and spaces.</p>
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
         * <p>The device ID. You can get the device ID from the <code>DeviceTag</code> parameter returned by the following operations:</p>
         * <ul>
         * <li><p><a href="~~GetUserDevice~~">GetUserDevice</a>: Queries the details of a user\&quot;s device.</p>
         * </li>
         * <li><p><a href="~~ListUserDevices~~">ListUserDevices</a>: Queries a list of devices for a user.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>36efa42d-2c32-c4dc-e3fc-8541e33a****</p>
         */
        public Builder deviceTag(String deviceTag) {
            this.putQueryParameter("DeviceTag", deviceTag);
            this.deviceTag = deviceTag;
            return this;
        }

        /**
         * <p>The hostname of the device. The value must be 1 to 128 characters long and can contain Chinese characters, uppercase and lowercase letters, digits, periods (.), commas (,), semicolons (;), hyphens (-), underscores (<em>), forward slashes (/), at signs (@), and spaces. If you specify only an underscore (</em>), the query is extended to include devices whose hostnames contain 4-byte UTF-8 characters.</p>
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
         * <p>The MAC address of the device.</p>
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
         * <p>The number of entries on each page. Valid values: 1 to 500.</p>
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
         * <p>The user ID. You can get the user ID from the <code>SaseUserId</code> parameter returned by the following operations:</p>
         * <ul>
         * <li><p><a href="~~GetUserDevice~~">GetUserDevice</a>: Queries the details of a user\&quot;s device.</p>
         * </li>
         * <li><p><a href="~~ListUserDevices~~">ListUserDevices</a>: Queries a list of devices for a user.</p>
         * </li>
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
         * <p>The statuses of excessive device registration applications.</p>
         */
        public Builder statuses(java.util.List<String> statuses) {
            this.putQueryParameter("Statuses", statuses);
            this.statuses = statuses;
            return this;
        }

        /**
         * <p>The username. The value must be 1 to 128 characters long and can contain Chinese characters, uppercase and lowercase letters, digits, periods (.), underscores (_), hyphens (-), asterisks (\*), at signs (@), and spaces.</p>
         * 
         * <strong>example:</strong>
         * <p>王先生</p>
         */
        public Builder username(String username) {
            this.putQueryParameter("Username", username);
            this.username = username;
            return this;
        }

        @Override
        public ListExcessiveDeviceRegistrationApplicationsRequest build() {
            return new ListExcessiveDeviceRegistrationApplicationsRequest(this);
        } 

    } 

}
