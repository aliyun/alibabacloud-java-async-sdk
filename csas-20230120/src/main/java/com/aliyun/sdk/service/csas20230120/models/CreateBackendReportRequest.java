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
 * {@link CreateBackendReportRequest} extends {@link RequestModel}
 *
 * <p>CreateBackendReportRequest</p>
 */
public class CreateBackendReportRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EndTimestamp")
    private Long endTimestamp;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PolicyType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String policyType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Reason")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 1024, minLength = 1)
    private String reason;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ReportObjects")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<ReportObjects> reportObjects;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Targets")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Targets> targets;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ValidityType")
    private String validityType;

    private CreateBackendReportRequest(Builder builder) {
        super(builder);
        this.endTimestamp = builder.endTimestamp;
        this.policyType = builder.policyType;
        this.reason = builder.reason;
        this.reportObjects = builder.reportObjects;
        this.targets = builder.targets;
        this.validityType = builder.validityType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateBackendReportRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endTimestamp
     */
    public Long getEndTimestamp() {
        return this.endTimestamp;
    }

    /**
     * @return policyType
     */
    public String getPolicyType() {
        return this.policyType;
    }

    /**
     * @return reason
     */
    public String getReason() {
        return this.reason;
    }

    /**
     * @return reportObjects
     */
    public java.util.List<ReportObjects> getReportObjects() {
        return this.reportObjects;
    }

    /**
     * @return targets
     */
    public java.util.List<Targets> getTargets() {
        return this.targets;
    }

    /**
     * @return validityType
     */
    public String getValidityType() {
        return this.validityType;
    }

    public static final class Builder extends Request.Builder<CreateBackendReportRequest, Builder> {
        private Long endTimestamp; 
        private String policyType; 
        private String reason; 
        private java.util.List<ReportObjects> reportObjects; 
        private java.util.List<Targets> targets; 
        private String validityType; 

        private Builder() {
            super();
        } 

        private Builder(CreateBackendReportRequest request) {
            super(request);
            this.endTimestamp = request.endTimestamp;
            this.policyType = request.policyType;
            this.reason = request.reason;
            this.reportObjects = request.reportObjects;
            this.targets = request.targets;
            this.validityType = request.validityType;
        } 

        /**
         * <p>The filing expiration time as a UNIX timestamp in seconds. This parameter is required when ValidityType is set to FixedTime or ValidityType is not specified, and the value must be later than the current time. When ValidityType is set to Permanent, do not specify this parameter or set it to 0.</p>
         * 
         * <strong>example:</strong>
         * <p>1788192000</p>
         */
        public Builder endTimestamp(Long endTimestamp) {
            this.putBodyParameter("EndTimestamp", endTimestamp);
            this.endTimestamp = endTimestamp;
            return this;
        }

        /**
         * <p>The filing policy type. Valid values:</p>
         * <ul>
         * <li>PrivateAccessBlock: private access.</li>
         * <li>DomainWhitelist: domain name whitelist.</li>
         * <li>DomainBlacklist: domain name blacklist.</li>
         * <li>SoftwareBlock: software blocking.</li>
         * <li>DlpSend: file outbound transfer.</li>
         * <li>PeripheralBlock: peripheral control.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PrivateAccessBlock</p>
         */
        public Builder policyType(String policyType) {
            this.putBodyParameter("PolicyType", policyType);
            this.policyType = policyType;
            return this;
        }

        /**
         * <p>The filing reason. The value must be 1 to 1024 characters in length.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Temporary project access</p>
         */
        public Builder reason(String reason) {
            this.putBodyParameter("Reason", reason);
            this.reason = reason;
            return this;
        }

        /**
         * <p>The list of filing objects, serialized in Flat format. You can specify 1 to 100 filing objects of the same policy type. The object fields must match the PolicyType value.</p>
         * <p>This parameter is required.</p>
         */
        public Builder reportObjects(java.util.List<ReportObjects> reportObjects) {
            this.putBodyParameter("ReportObjects", reportObjects);
            this.reportObjects = reportObjects;
            return this;
        }

        /**
         * <p>The list of filing users, serialized in Flat format. You can specify 1 to 100 users. Only specific SASE users under the current Alibaba Cloud account are supported. The product of the number of deduplicated users and the number of filing objects cannot exceed 100.</p>
         * <p>This parameter is required.</p>
         */
        public Builder targets(java.util.List<Targets> targets) {
            this.putBodyParameter("Targets", targets);
            this.targets = targets;
            return this;
        }

        /**
         * <p>The validity duration type. Default value: FixedTime. Valid values:</p>
         * <ul>
         * <li>FixedTime: Expires at the specified time.</li>
         * <li>Permanent: Permanently valid.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FixedTime</p>
         */
        public Builder validityType(String validityType) {
            this.putBodyParameter("ValidityType", validityType);
            this.validityType = validityType;
            return this;
        }

        @Override
        public CreateBackendReportRequest build() {
            return new CreateBackendReportRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateBackendReportRequest} extends {@link TeaModel}
     *
     * <p>CreateBackendReportRequest</p>
     */
    public static class ReportObjects extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApplicationId")
        private String applicationId;

        @com.aliyun.core.annotation.NameInMap("DevType")
        private String devType;

        @com.aliyun.core.annotation.NameInMap("DeviceType")
        private String deviceType;

        @com.aliyun.core.annotation.NameInMap("FileMd5")
        private String fileMd5;

        @com.aliyun.core.annotation.NameInMap("ReportDomain")
        private String reportDomain;

        @com.aliyun.core.annotation.NameInMap("Scope")
        private String scope;

        @com.aliyun.core.annotation.NameInMap("SoftwareId")
        private String softwareId;

        private ReportObjects(Builder builder) {
            this.applicationId = builder.applicationId;
            this.devType = builder.devType;
            this.deviceType = builder.deviceType;
            this.fileMd5 = builder.fileMd5;
            this.reportDomain = builder.reportDomain;
            this.scope = builder.scope;
            this.softwareId = builder.softwareId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReportObjects create() {
            return builder().build();
        }

        /**
         * @return applicationId
         */
        public String getApplicationId() {
            return this.applicationId;
        }

        /**
         * @return devType
         */
        public String getDevType() {
            return this.devType;
        }

        /**
         * @return deviceType
         */
        public String getDeviceType() {
            return this.deviceType;
        }

        /**
         * @return fileMd5
         */
        public String getFileMd5() {
            return this.fileMd5;
        }

        /**
         * @return reportDomain
         */
        public String getReportDomain() {
            return this.reportDomain;
        }

        /**
         * @return scope
         */
        public String getScope() {
            return this.scope;
        }

        /**
         * @return softwareId
         */
        public String getSoftwareId() {
            return this.softwareId;
        }

        public static final class Builder {
            private String applicationId; 
            private String devType; 
            private String deviceType; 
            private String fileMd5; 
            private String reportDomain; 
            private String scope; 
            private String softwareId; 

            private Builder() {
            } 

            private Builder(ReportObjects model) {
                this.applicationId = model.applicationId;
                this.devType = model.devType;
                this.deviceType = model.deviceType;
                this.fileMd5 = model.fileMd5;
                this.reportDomain = model.reportDomain;
                this.scope = model.scope;
                this.softwareId = model.softwareId;
            } 

            /**
             * <p>The private access application ID. This parameter is required when PolicyType is set to PrivateAccessBlock. You can call ListPrivateAccessApplications to query the ID.</p>
             * 
             * <strong>example:</strong>
             * <p>pa-app-****************1234</p>
             */
            public Builder applicationId(String applicationId) {
                this.applicationId = applicationId;
                return this;
            }

            /**
             * <p>The endpoint operating system. This parameter is required when PolicyType is set to PeripheralBlock. Valid values:</p>
             * <ul>
             * <li>windows: Windows.</li>
             * <li>macOS: macOS.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>windows</p>
             */
            public Builder devType(String devType) {
                this.devType = devType;
                return this;
            }

            /**
             * <p>The peripheral channel. This parameter is required when PolicyType is set to PeripheralBlock. Windows supports usbStorage, printer, mobile, cardReader, cdrom, and bluetooth. macOS supports usbStorage, airDrop, mobile, and bluetooth.</p>
             * 
             * <strong>example:</strong>
             * <p>usbStorage</p>
             */
            public Builder deviceType(String deviceType) {
                this.deviceType = deviceType;
                return this;
            }

            /**
             * <p>The file MD5 hash. This parameter is required when PolicyType is set to DlpSend. The value must be a 32-character hexadecimal string and is case-insensitive.</p>
             * 
             * <strong>example:</strong>
             * <p>c936226c4745125b5786527d205a****</p>
             */
            public Builder fileMd5(String fileMd5) {
                this.fileMd5 = fileMd5;
                return this;
            }

            /**
             * <p>The filing domain name. This parameter is required when PolicyType is set to DomainWhitelist or DomainBlacklist. Regular domain names and wildcard domain names that start with *. are supported. Protocols, ports, and paths are not supported.</p>
             * 
             * <strong>example:</strong>
             * <p>*.example.com</p>
             */
            public Builder reportDomain(String reportDomain) {
                this.reportDomain = reportDomain;
                return this;
            }

            /**
             * <p>The peripheral filing granularity. This parameter is required when PolicyType is set to PeripheralBlock. Currently, only Channel is supported, which indicates filing by peripheral channel.</p>
             * 
             * <strong>example:</strong>
             * <p>Channel</p>
             */
            public Builder scope(String scope) {
                this.scope = scope;
                return this;
            }

            /**
             * <p>The blocked software ID. This parameter is required when PolicyType is set to SoftwareBlock.</p>
             * 
             * <strong>example:</strong>
             * <p>swb-c717ee516145****</p>
             */
            public Builder softwareId(String softwareId) {
                this.softwareId = softwareId;
                return this;
            }

            public ReportObjects build() {
                return new ReportObjects(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateBackendReportRequest} extends {@link TeaModel}
     *
     * <p>CreateBackendReportRequest</p>
     */
    public static class Targets extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("UserId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String userId;

        private Targets(Builder builder) {
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Targets create() {
            return builder().build();
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String userId; 

            private Builder() {
            } 

            private Builder(Targets model) {
                this.userId = model.userId;
            } 

            /**
             * <p>The SASE user ID. You can call ListUsers to query the ID.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>su_8548af20c3b30e931e75cd847a4c****</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public Targets build() {
                return new Targets(this);
            } 

        } 

    }
}
