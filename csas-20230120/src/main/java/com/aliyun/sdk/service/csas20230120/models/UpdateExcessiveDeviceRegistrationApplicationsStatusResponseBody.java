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
 * {@link UpdateExcessiveDeviceRegistrationApplicationsStatusResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateExcessiveDeviceRegistrationApplicationsStatusResponseBody</p>
 */
public class UpdateExcessiveDeviceRegistrationApplicationsStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Applications")
    private java.util.List<Applications> applications;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private UpdateExcessiveDeviceRegistrationApplicationsStatusResponseBody(Builder builder) {
        this.applications = builder.applications;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateExcessiveDeviceRegistrationApplicationsStatusResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applications
     */
    public java.util.List<Applications> getApplications() {
        return this.applications;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Applications> applications; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(UpdateExcessiveDeviceRegistrationApplicationsStatusResponseBody model) {
            this.applications = model.applications;
            this.requestId = model.requestId;
        } 

        /**
         * <p>List of device registration applications that exceed your quota.</p>
         */
        public Builder applications(java.util.List<Applications> applications) {
            this.applications = applications;
            return this;
        }

        /**
         * <p>ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>102350E7-1A20-58F5-9D63-ABEA820AE6E1</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateExcessiveDeviceRegistrationApplicationsStatusResponseBody build() {
            return new UpdateExcessiveDeviceRegistrationApplicationsStatusResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link UpdateExcessiveDeviceRegistrationApplicationsStatusResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateExcessiveDeviceRegistrationApplicationsStatusResponseBody</p>
     */
    public static class Applications extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApplicationId")
        private String applicationId;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Department")
        private String department;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DeviceTag")
        private String deviceTag;

        @com.aliyun.core.annotation.NameInMap("DeviceType")
        private String deviceType;

        @com.aliyun.core.annotation.NameInMap("Hostname")
        private String hostname;

        @com.aliyun.core.annotation.NameInMap("IsUsed")
        private Boolean isUsed;

        @com.aliyun.core.annotation.NameInMap("Mac")
        private String mac;

        @com.aliyun.core.annotation.NameInMap("SaseUserId")
        private String saseUserId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Username")
        private String username;

        private Applications(Builder builder) {
            this.applicationId = builder.applicationId;
            this.createTime = builder.createTime;
            this.department = builder.department;
            this.description = builder.description;
            this.deviceTag = builder.deviceTag;
            this.deviceType = builder.deviceType;
            this.hostname = builder.hostname;
            this.isUsed = builder.isUsed;
            this.mac = builder.mac;
            this.saseUserId = builder.saseUserId;
            this.status = builder.status;
            this.username = builder.username;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Applications create() {
            return builder().build();
        }

        /**
         * @return applicationId
         */
        public String getApplicationId() {
            return this.applicationId;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return department
         */
        public String getDepartment() {
            return this.department;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return deviceTag
         */
        public String getDeviceTag() {
            return this.deviceTag;
        }

        /**
         * @return deviceType
         */
        public String getDeviceType() {
            return this.deviceType;
        }

        /**
         * @return hostname
         */
        public String getHostname() {
            return this.hostname;
        }

        /**
         * @return isUsed
         */
        public Boolean getIsUsed() {
            return this.isUsed;
        }

        /**
         * @return mac
         */
        public String getMac() {
            return this.mac;
        }

        /**
         * @return saseUserId
         */
        public String getSaseUserId() {
            return this.saseUserId;
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

        public static final class Builder {
            private String applicationId; 
            private String createTime; 
            private String department; 
            private String description; 
            private String deviceTag; 
            private String deviceType; 
            private String hostname; 
            private Boolean isUsed; 
            private String mac; 
            private String saseUserId; 
            private String status; 
            private String username; 

            private Builder() {
            } 

            private Builder(Applications model) {
                this.applicationId = model.applicationId;
                this.createTime = model.createTime;
                this.department = model.department;
                this.description = model.description;
                this.deviceTag = model.deviceTag;
                this.deviceType = model.deviceType;
                this.hostname = model.hostname;
                this.isUsed = model.isUsed;
                this.mac = model.mac;
                this.saseUserId = model.saseUserId;
                this.status = model.status;
                this.username = model.username;
            } 

            /**
             * <p>ID of the device registration application.</p>
             * 
             * <strong>example:</strong>
             * <p>reg-application-0f4a127b7e78****</p>
             */
            public Builder applicationId(String applicationId) {
                this.applicationId = applicationId;
                return this;
            }

            /**
             * <p>Time when the device registration application was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-07-17 18:46:55</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>Department to which the user belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>测试部</p>
             */
            public Builder department(String department) {
                this.department = department;
                return this;
            }

            /**
             * <p>This field indicates the reason for the excessive device registration request.</p>
             * 
             * <strong>example:</strong>
             * <p>这是一条超额注册申请</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>ID of the endpoint device.</p>
             * 
             * <strong>example:</strong>
             * <p>36efa42d-2c32-c4dc-e3fc-8541e33a****</p>
             */
            public Builder deviceTag(String deviceTag) {
                this.deviceTag = deviceTag;
                return this;
            }

            /**
             * <p>Operating system of the endpoint device. Valid values:</p>
             * <ul>
             * <li><p><strong>Windows</strong>: Windows operating system.</p>
             * </li>
             * <li><p><strong>macOS</strong>: macOS operating system.</p>
             * </li>
             * <li><p><strong>Linux</strong>: Linux operating system.</p>
             * </li>
             * <li><p><strong>Android</strong>: Android operating system.</p>
             * </li>
             * <li><p><strong>iOS</strong>: iOS operating system.</p>
             * </li>
             * <li><p><strong>Windows_Wuying</strong>: Alibaba Cloud Cloud Desktop operating system.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Windows</p>
             */
            public Builder deviceType(String deviceType) {
                this.deviceType = deviceType;
                return this;
            }

            /**
             * <p>Name of the endpoint device.</p>
             * 
             * <strong>example:</strong>
             * <p>win10-64bit</p>
             */
            public Builder hostname(String hostname) {
                this.hostname = hostname;
                return this;
            }

            /**
             * <p>Indicates whether the device registration application has been used. Valid values:</p>
             * <ul>
             * <li><p><strong>true</strong>: Used.</p>
             * </li>
             * <li><p><strong>false</strong>: Not used.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isUsed(Boolean isUsed) {
                this.isUsed = isUsed;
                return this;
            }

            /**
             * <p>MAC address of the endpoint device.</p>
             * 
             * <strong>example:</strong>
             * <p>00:16:XX:XX:7c:46</p>
             */
            public Builder mac(String mac) {
                this.mac = mac;
                return this;
            }

            /**
             * <p>User ID.</p>
             * 
             * <strong>example:</strong>
             * <p>su_e8f218fb171edd167c2ad917d21f53148bdefc510ca1f3c3cc0249d3643d****</p>
             */
            public Builder saseUserId(String saseUserId) {
                this.saseUserId = saseUserId;
                return this;
            }

            /**
             * <p>Status of the device registration application. Valid values:</p>
             * <ul>
             * <li><p><strong>Pending</strong>: Pending review.</p>
             * </li>
             * <li><p><strong>Approved</strong>: Approved.</p>
             * </li>
             * <li><p><strong>Rejected</strong>: Rejected.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Approved</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>Username.</p>
             * 
             * <strong>example:</strong>
             * <p>王先生</p>
             */
            public Builder username(String username) {
                this.username = username;
                return this;
            }

            public Applications build() {
                return new Applications(this);
            } 

        } 

    }
}
