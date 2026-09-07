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
 * {@link UpdateUninstallApplicationsStatusResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateUninstallApplicationsStatusResponseBody</p>
 */
public class UpdateUninstallApplicationsStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Applications")
    private java.util.List<Applications> applications;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private UpdateUninstallApplicationsStatusResponseBody(Builder builder) {
        this.applications = builder.applications;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateUninstallApplicationsStatusResponseBody create() {
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

        private Builder(UpdateUninstallApplicationsStatusResponseBody model) {
            this.applications = model.applications;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The list of uninstall applications.</p>
         */
        public Builder applications(java.util.List<Applications> applications) {
            this.applications = applications;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9B769522-D50C-5978-8981-52BE800D6099</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateUninstallApplicationsStatusResponseBody build() {
            return new UpdateUninstallApplicationsStatusResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link UpdateUninstallApplicationsStatusResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateUninstallApplicationsStatusResponseBody</p>
     */
    public static class Applications extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApplicationId")
        private String applicationId;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Department")
        private String department;

        @com.aliyun.core.annotation.NameInMap("DevTag")
        private String devTag;

        @com.aliyun.core.annotation.NameInMap("DevType")
        private String devType;

        @com.aliyun.core.annotation.NameInMap("Hostname")
        private String hostname;

        @com.aliyun.core.annotation.NameInMap("IdpName")
        private String idpName;

        @com.aliyun.core.annotation.NameInMap("IsUninstall")
        private Boolean isUninstall;

        @com.aliyun.core.annotation.NameInMap("Mac")
        private String mac;

        @com.aliyun.core.annotation.NameInMap("Reason")
        private String reason;

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
            this.devTag = builder.devTag;
            this.devType = builder.devType;
            this.hostname = builder.hostname;
            this.idpName = builder.idpName;
            this.isUninstall = builder.isUninstall;
            this.mac = builder.mac;
            this.reason = builder.reason;
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
         * @return devTag
         */
        public String getDevTag() {
            return this.devTag;
        }

        /**
         * @return devType
         */
        public String getDevType() {
            return this.devType;
        }

        /**
         * @return hostname
         */
        public String getHostname() {
            return this.hostname;
        }

        /**
         * @return idpName
         */
        public String getIdpName() {
            return this.idpName;
        }

        /**
         * @return isUninstall
         */
        public Boolean getIsUninstall() {
            return this.isUninstall;
        }

        /**
         * @return mac
         */
        public String getMac() {
            return this.mac;
        }

        /**
         * @return reason
         */
        public String getReason() {
            return this.reason;
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
            private String devTag; 
            private String devType; 
            private String hostname; 
            private String idpName; 
            private Boolean isUninstall; 
            private String mac; 
            private String reason; 
            private String saseUserId; 
            private String status; 
            private String username; 

            private Builder() {
            } 

            private Builder(Applications model) {
                this.applicationId = model.applicationId;
                this.createTime = model.createTime;
                this.department = model.department;
                this.devTag = model.devTag;
                this.devType = model.devType;
                this.hostname = model.hostname;
                this.idpName = model.idpName;
                this.isUninstall = model.isUninstall;
                this.mac = model.mac;
                this.reason = model.reason;
                this.saseUserId = model.saseUserId;
                this.status = model.status;
                this.username = model.username;
            } 

            /**
             * <p>The uninstall application ID.</p>
             * 
             * <strong>example:</strong>
             * <p>uninstall-app-6646831ac314****</p>
             */
            public Builder applicationId(String applicationId) {
                this.applicationId = applicationId;
                return this;
            }

            /**
             * <p>The time when the uninstall application was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-07-17 18:46:55</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The department to which the user belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>Testing Department</p>
             */
            public Builder department(String department) {
                this.department = department;
                return this;
            }

            /**
             * <p>The ID of the endpoint device.</p>
             * 
             * <strong>example:</strong>
             * <p>36efa42d-2c32-c4dc-e3fc-8541e33a****</p>
             */
            public Builder devTag(String devTag) {
                this.devTag = devTag;
                return this;
            }

            /**
             * <p>The operating system type of the endpoint device. Valid values:</p>
             * <ul>
             * <li><strong>Windows</strong>: Windows.</li>
             * <li><strong>macOS</strong>: macOS.</li>
             * <li><strong>Linux</strong>: Linux.</li>
             * <li><strong>Android</strong>: Android.</li>
             * <li><strong>iOS</strong>: iOS.</li>
             * <li><strong>Windows_Wuying</strong>: WUYING Workspace.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Windows</p>
             */
            public Builder devType(String devType) {
                this.devType = devType;
                return this;
            }

            /**
             * <p>The name of the endpoint device.</p>
             * 
             * <strong>example:</strong>
             * <p>win10-64bit</p>
             */
            public Builder hostname(String hostname) {
                this.hostname = hostname;
                return this;
            }

            /**
             * <p>The name of the identity provider.</p>
             * 
             * <strong>example:</strong>
             * <p>Test Identity Provider</p>
             */
            public Builder idpName(String idpName) {
                this.idpName = idpName;
                return this;
            }

            /**
             * <p>Indicates whether the uninstallation has been performed.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isUninstall(Boolean isUninstall) {
                this.isUninstall = isUninstall;
                return this;
            }

            /**
             * <p>The MAC address of the endpoint device.</p>
             * 
             * <strong>example:</strong>
             * <p>00:16:XX:XX:7c:46</p>
             */
            public Builder mac(String mac) {
                this.mac = mac;
                return this;
            }

            /**
             * <p>The reason for the application.</p>
             * 
             * <strong>example:</strong>
             * <p>This is a test</p>
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * <p>The user ID.</p>
             * 
             * <strong>example:</strong>
             * <p>su_e8f218fb171edd167c2ad917d21f53148bdefc510ca1f3c3cc0249d3643d****</p>
             */
            public Builder saseUserId(String saseUserId) {
                this.saseUserId = saseUserId;
                return this;
            }

            /**
             * <p>The status of the uninstall application. Valid values:</p>
             * <ul>
             * <li><strong>Pending</strong>: Pending.</li>
             * <li><strong>Approved</strong>: Approved.</li>
             * <li><strong>Rejected</strong>: Rejected.</li>
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
             * <p>The username.</p>
             * 
             * <strong>example:</strong>
             * <p>Mr. Wang</p>
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
