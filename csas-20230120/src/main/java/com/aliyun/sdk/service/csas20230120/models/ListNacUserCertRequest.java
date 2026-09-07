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
 * {@link ListNacUserCertRequest} extends {@link RequestModel}
 *
 * <p>ListNacUserCertRequest</p>
 */
public class ListNacUserCertRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private String currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Department")
    private String department;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeviceType")
    private String deviceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private String pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private Long startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Username")
    private String username;

    private ListNacUserCertRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.department = builder.department;
        this.deviceType = builder.deviceType;
        this.endTime = builder.endTime;
        this.pageSize = builder.pageSize;
        this.startTime = builder.startTime;
        this.status = builder.status;
        this.username = builder.username;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListNacUserCertRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentPage
     */
    public String getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return department
     */
    public String getDepartment() {
        return this.department;
    }

    /**
     * @return deviceType
     */
    public String getDeviceType() {
        return this.deviceType;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return username
     */
    public String getUsername() {
        return this.username;
    }

    public static final class Builder extends Request.Builder<ListNacUserCertRequest, Builder> {
        private String currentPage; 
        private String department; 
        private String deviceType; 
        private Long endTime; 
        private String pageSize; 
        private Long startTime; 
        private String status; 
        private String username; 

        private Builder() {
            super();
        } 

        private Builder(ListNacUserCertRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.department = request.department;
            this.deviceType = request.deviceType;
            this.endTime = request.endTime;
            this.pageSize = request.pageSize;
            this.startTime = request.startTime;
            this.status = request.status;
            this.username = request.username;
        } 

        /**
         * <p>Page number of the current page in a paged query. Valid values: 1 to 10000.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(String currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>Department that the user belongs to. The value must be 1 to 128 characters in length. It can contain Chinese characters, uppercase and lowercase letters, digits, periods (.), commas (,), semicolons (;), hyphens (-), underscores (_), forward slashes (/), at signs (@), and spaces.</p>
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
         * <p>Operating system type of the endpoint device. Valid values:</p>
         * <ul>
         * <li><p><strong>windows</strong>: Windows.</p>
         * </li>
         * <li><p><strong>macos</strong>: macOS.</p>
         * </li>
         * <li><p><strong>linux</strong>: Linux.</p>
         * </li>
         * <li><p><strong>android</strong>: Android.</p>
         * </li>
         * <li><p><strong>ios</strong>: iOS.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>windows</p>
         */
        public Builder deviceType(String deviceType) {
            this.putQueryParameter("DeviceType", deviceType);
            this.deviceType = deviceType;
            return this;
        }

        /**
         * <p>End time.</p>
         * 
         * <strong>example:</strong>
         * <p>1702770400</p>
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>Number of entries per page for a paged query. Valid values: 1 to 1000.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Start time.</p>
         * 
         * <strong>example:</strong>
         * <p>1702260834</p>
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>Certificate status. Valid values:</p>
         * <ul>
         * <li><p><strong>Enabled</strong>: Enabled.</p>
         * </li>
         * <li><p><strong>Disabled</strong>: Disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>Username.</p>
         * 
         * <strong>example:</strong>
         * <p>zhang**</p>
         */
        public Builder username(String username) {
            this.putQueryParameter("Username", username);
            this.username = username;
            return this;
        }

        @Override
        public ListNacUserCertRequest build() {
            return new ListNacUserCertRequest(this);
        } 

    } 

}
