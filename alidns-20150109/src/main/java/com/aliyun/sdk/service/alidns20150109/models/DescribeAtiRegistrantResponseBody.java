// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

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
 * {@link DescribeAtiRegistrantResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAtiRegistrantResponseBody</p>
 */
public class DescribeAtiRegistrantResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private AccessDeniedDetail accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Cc")
    private String cc;

    @com.aliyun.core.annotation.NameInMap("City")
    private String city;

    @com.aliyun.core.annotation.NameInMap("CreateTimestamp")
    private String createTimestamp;

    @com.aliyun.core.annotation.NameInMap("DocumentCode")
    private String documentCode;

    @com.aliyun.core.annotation.NameInMap("DocumentType")
    private String documentType;

    @com.aliyun.core.annotation.NameInMap("Email")
    private String email;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("Phone")
    private String phone;

    @com.aliyun.core.annotation.NameInMap("RegistrantId")
    private String registrantId;

    @com.aliyun.core.annotation.NameInMap("RejectReason")
    private String rejectReason;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("State")
    private String state;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("Street")
    private String street;

    @com.aliyun.core.annotation.NameInMap("UpdateTimestamp")
    private String updateTimestamp;

    private DescribeAtiRegistrantResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.cc = builder.cc;
        this.city = builder.city;
        this.createTimestamp = builder.createTimestamp;
        this.documentCode = builder.documentCode;
        this.documentType = builder.documentType;
        this.email = builder.email;
        this.name = builder.name;
        this.phone = builder.phone;
        this.registrantId = builder.registrantId;
        this.rejectReason = builder.rejectReason;
        this.requestId = builder.requestId;
        this.state = builder.state;
        this.status = builder.status;
        this.street = builder.street;
        this.updateTimestamp = builder.updateTimestamp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAtiRegistrantResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessDeniedDetail
     */
    public AccessDeniedDetail getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    /**
     * @return cc
     */
    public String getCc() {
        return this.cc;
    }

    /**
     * @return city
     */
    public String getCity() {
        return this.city;
    }

    /**
     * @return createTimestamp
     */
    public String getCreateTimestamp() {
        return this.createTimestamp;
    }

    /**
     * @return documentCode
     */
    public String getDocumentCode() {
        return this.documentCode;
    }

    /**
     * @return documentType
     */
    public String getDocumentType() {
        return this.documentType;
    }

    /**
     * @return email
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return phone
     */
    public String getPhone() {
        return this.phone;
    }

    /**
     * @return registrantId
     */
    public String getRegistrantId() {
        return this.registrantId;
    }

    /**
     * @return rejectReason
     */
    public String getRejectReason() {
        return this.rejectReason;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return state
     */
    public String getState() {
        return this.state;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return street
     */
    public String getStreet() {
        return this.street;
    }

    /**
     * @return updateTimestamp
     */
    public String getUpdateTimestamp() {
        return this.updateTimestamp;
    }

    public static final class Builder {
        private AccessDeniedDetail accessDeniedDetail; 
        private String cc; 
        private String city; 
        private String createTimestamp; 
        private String documentCode; 
        private String documentType; 
        private String email; 
        private String name; 
        private String phone; 
        private String registrantId; 
        private String rejectReason; 
        private String requestId; 
        private String state; 
        private String status; 
        private String street; 
        private String updateTimestamp; 

        private Builder() {
        } 

        private Builder(DescribeAtiRegistrantResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.cc = model.cc;
            this.city = model.city;
            this.createTimestamp = model.createTimestamp;
            this.documentCode = model.documentCode;
            this.documentType = model.documentType;
            this.email = model.email;
            this.name = model.name;
            this.phone = model.phone;
            this.registrantId = model.registrantId;
            this.rejectReason = model.rejectReason;
            this.requestId = model.requestId;
            this.state = model.state;
            this.status = model.status;
            this.street = model.street;
            this.updateTimestamp = model.updateTimestamp;
        } 

        /**
         * AccessDeniedDetail.
         */
        public Builder accessDeniedDetail(AccessDeniedDetail accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * Cc.
         */
        public Builder cc(String cc) {
            this.cc = cc;
            return this;
        }

        /**
         * City.
         */
        public Builder city(String city) {
            this.city = city;
            return this;
        }

        /**
         * CreateTimestamp.
         */
        public Builder createTimestamp(String createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }

        /**
         * DocumentCode.
         */
        public Builder documentCode(String documentCode) {
            this.documentCode = documentCode;
            return this;
        }

        /**
         * DocumentType.
         */
        public Builder documentType(String documentType) {
            this.documentType = documentType;
            return this;
        }

        /**
         * Email.
         */
        public Builder email(String email) {
            this.email = email;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Phone.
         */
        public Builder phone(String phone) {
            this.phone = phone;
            return this;
        }

        /**
         * RegistrantId.
         */
        public Builder registrantId(String registrantId) {
            this.registrantId = registrantId;
            return this;
        }

        /**
         * RejectReason.
         */
        public Builder rejectReason(String rejectReason) {
            this.rejectReason = rejectReason;
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
         * State.
         */
        public Builder state(String state) {
            this.state = state;
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
         * Street.
         */
        public Builder street(String street) {
            this.street = street;
            return this;
        }

        /**
         * UpdateTimestamp.
         */
        public Builder updateTimestamp(String updateTimestamp) {
            this.updateTimestamp = updateTimestamp;
            return this;
        }

        public DescribeAtiRegistrantResponseBody build() {
            return new DescribeAtiRegistrantResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAtiRegistrantResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAtiRegistrantResponseBody</p>
     */
    public static class AccessDeniedDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthAction")
        private String authAction;

        @com.aliyun.core.annotation.NameInMap("AuthPrincipalDisplayName")
        private String authPrincipalDisplayName;

        @com.aliyun.core.annotation.NameInMap("AuthPrincipalOwnerId")
        private String authPrincipalOwnerId;

        @com.aliyun.core.annotation.NameInMap("AuthPrincipalType")
        private String authPrincipalType;

        @com.aliyun.core.annotation.NameInMap("EncodedDiagnosticMessage")
        private String encodedDiagnosticMessage;

        @com.aliyun.core.annotation.NameInMap("NoPermissionType")
        private String noPermissionType;

        @com.aliyun.core.annotation.NameInMap("PolicyType")
        private String policyType;

        private AccessDeniedDetail(Builder builder) {
            this.authAction = builder.authAction;
            this.authPrincipalDisplayName = builder.authPrincipalDisplayName;
            this.authPrincipalOwnerId = builder.authPrincipalOwnerId;
            this.authPrincipalType = builder.authPrincipalType;
            this.encodedDiagnosticMessage = builder.encodedDiagnosticMessage;
            this.noPermissionType = builder.noPermissionType;
            this.policyType = builder.policyType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AccessDeniedDetail create() {
            return builder().build();
        }

        /**
         * @return authAction
         */
        public String getAuthAction() {
            return this.authAction;
        }

        /**
         * @return authPrincipalDisplayName
         */
        public String getAuthPrincipalDisplayName() {
            return this.authPrincipalDisplayName;
        }

        /**
         * @return authPrincipalOwnerId
         */
        public String getAuthPrincipalOwnerId() {
            return this.authPrincipalOwnerId;
        }

        /**
         * @return authPrincipalType
         */
        public String getAuthPrincipalType() {
            return this.authPrincipalType;
        }

        /**
         * @return encodedDiagnosticMessage
         */
        public String getEncodedDiagnosticMessage() {
            return this.encodedDiagnosticMessage;
        }

        /**
         * @return noPermissionType
         */
        public String getNoPermissionType() {
            return this.noPermissionType;
        }

        /**
         * @return policyType
         */
        public String getPolicyType() {
            return this.policyType;
        }

        public static final class Builder {
            private String authAction; 
            private String authPrincipalDisplayName; 
            private String authPrincipalOwnerId; 
            private String authPrincipalType; 
            private String encodedDiagnosticMessage; 
            private String noPermissionType; 
            private String policyType; 

            private Builder() {
            } 

            private Builder(AccessDeniedDetail model) {
                this.authAction = model.authAction;
                this.authPrincipalDisplayName = model.authPrincipalDisplayName;
                this.authPrincipalOwnerId = model.authPrincipalOwnerId;
                this.authPrincipalType = model.authPrincipalType;
                this.encodedDiagnosticMessage = model.encodedDiagnosticMessage;
                this.noPermissionType = model.noPermissionType;
                this.policyType = model.policyType;
            } 

            /**
             * AuthAction.
             */
            public Builder authAction(String authAction) {
                this.authAction = authAction;
                return this;
            }

            /**
             * AuthPrincipalDisplayName.
             */
            public Builder authPrincipalDisplayName(String authPrincipalDisplayName) {
                this.authPrincipalDisplayName = authPrincipalDisplayName;
                return this;
            }

            /**
             * AuthPrincipalOwnerId.
             */
            public Builder authPrincipalOwnerId(String authPrincipalOwnerId) {
                this.authPrincipalOwnerId = authPrincipalOwnerId;
                return this;
            }

            /**
             * AuthPrincipalType.
             */
            public Builder authPrincipalType(String authPrincipalType) {
                this.authPrincipalType = authPrincipalType;
                return this;
            }

            /**
             * EncodedDiagnosticMessage.
             */
            public Builder encodedDiagnosticMessage(String encodedDiagnosticMessage) {
                this.encodedDiagnosticMessage = encodedDiagnosticMessage;
                return this;
            }

            /**
             * NoPermissionType.
             */
            public Builder noPermissionType(String noPermissionType) {
                this.noPermissionType = noPermissionType;
                return this;
            }

            /**
             * PolicyType.
             */
            public Builder policyType(String policyType) {
                this.policyType = policyType;
                return this;
            }

            public AccessDeniedDetail build() {
                return new AccessDeniedDetail(this);
            } 

        } 

    }
}
