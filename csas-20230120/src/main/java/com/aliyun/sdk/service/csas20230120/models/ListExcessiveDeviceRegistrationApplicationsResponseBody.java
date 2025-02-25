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
 * {@link ListExcessiveDeviceRegistrationApplicationsResponseBody} extends {@link TeaModel}
 *
 * <p>ListExcessiveDeviceRegistrationApplicationsResponseBody</p>
 */
public class ListExcessiveDeviceRegistrationApplicationsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Applications")
    private java.util.List<Applications> applications;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalNum")
    private Long totalNum;

    private ListExcessiveDeviceRegistrationApplicationsResponseBody(Builder builder) {
        this.applications = builder.applications;
        this.requestId = builder.requestId;
        this.totalNum = builder.totalNum;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListExcessiveDeviceRegistrationApplicationsResponseBody create() {
        return builder().build();
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

    /**
     * @return totalNum
     */
    public Long getTotalNum() {
        return this.totalNum;
    }

    public static final class Builder {
        private java.util.List<Applications> applications; 
        private String requestId; 
        private Long totalNum; 

        /**
         * Applications.
         */
        public Builder applications(java.util.List<Applications> applications) {
            this.applications = applications;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalNum.
         */
        public Builder totalNum(Long totalNum) {
            this.totalNum = totalNum;
            return this;
        }

        public ListExcessiveDeviceRegistrationApplicationsResponseBody build() {
            return new ListExcessiveDeviceRegistrationApplicationsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListExcessiveDeviceRegistrationApplicationsResponseBody} extends {@link TeaModel}
     *
     * <p>ListExcessiveDeviceRegistrationApplicationsResponseBody</p>
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

            /**
             * ApplicationId.
             */
            public Builder applicationId(String applicationId) {
                this.applicationId = applicationId;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Department.
             */
            public Builder department(String department) {
                this.department = department;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * DeviceTag.
             */
            public Builder deviceTag(String deviceTag) {
                this.deviceTag = deviceTag;
                return this;
            }

            /**
             * DeviceType.
             */
            public Builder deviceType(String deviceType) {
                this.deviceType = deviceType;
                return this;
            }

            /**
             * Hostname.
             */
            public Builder hostname(String hostname) {
                this.hostname = hostname;
                return this;
            }

            /**
             * IsUsed.
             */
            public Builder isUsed(Boolean isUsed) {
                this.isUsed = isUsed;
                return this;
            }

            /**
             * Mac.
             */
            public Builder mac(String mac) {
                this.mac = mac;
                return this;
            }

            /**
             * SaseUserId.
             */
            public Builder saseUserId(String saseUserId) {
                this.saseUserId = saseUserId;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Username.
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
