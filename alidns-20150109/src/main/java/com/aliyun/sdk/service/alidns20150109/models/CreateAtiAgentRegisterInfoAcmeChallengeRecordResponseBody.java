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
 * {@link CreateAtiAgentRegisterInfoAcmeChallengeRecordResponseBody} extends {@link TeaModel}
 *
 * <p>CreateAtiAgentRegisterInfoAcmeChallengeRecordResponseBody</p>
 */
public class CreateAtiAgentRegisterInfoAcmeChallengeRecordResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private AccessDeniedDetail accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("AgentRegisterInfoId")
    private String agentRegisterInfoId;

    @com.aliyun.core.annotation.NameInMap("CreateTimestamp")
    private String createTimestamp;

    @com.aliyun.core.annotation.NameInMap("ExpireTimestamp")
    private String expireTimestamp;

    @com.aliyun.core.annotation.NameInMap("RecordName")
    private String recordName;

    @com.aliyun.core.annotation.NameInMap("RecordType")
    private String recordType;

    @com.aliyun.core.annotation.NameInMap("RecordValue")
    private String recordValue;

    @com.aliyun.core.annotation.NameInMap("Records")
    private Records records;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("UpdateTimestamp")
    private String updateTimestamp;

    private CreateAtiAgentRegisterInfoAcmeChallengeRecordResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.agentRegisterInfoId = builder.agentRegisterInfoId;
        this.createTimestamp = builder.createTimestamp;
        this.expireTimestamp = builder.expireTimestamp;
        this.recordName = builder.recordName;
        this.recordType = builder.recordType;
        this.recordValue = builder.recordValue;
        this.records = builder.records;
        this.requestId = builder.requestId;
        this.updateTimestamp = builder.updateTimestamp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAtiAgentRegisterInfoAcmeChallengeRecordResponseBody create() {
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
     * @return agentRegisterInfoId
     */
    public String getAgentRegisterInfoId() {
        return this.agentRegisterInfoId;
    }

    /**
     * @return createTimestamp
     */
    public String getCreateTimestamp() {
        return this.createTimestamp;
    }

    /**
     * @return expireTimestamp
     */
    public String getExpireTimestamp() {
        return this.expireTimestamp;
    }

    /**
     * @return recordName
     */
    public String getRecordName() {
        return this.recordName;
    }

    /**
     * @return recordType
     */
    public String getRecordType() {
        return this.recordType;
    }

    /**
     * @return recordValue
     */
    public String getRecordValue() {
        return this.recordValue;
    }

    /**
     * @return records
     */
    public Records getRecords() {
        return this.records;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return updateTimestamp
     */
    public String getUpdateTimestamp() {
        return this.updateTimestamp;
    }

    public static final class Builder {
        private AccessDeniedDetail accessDeniedDetail; 
        private String agentRegisterInfoId; 
        private String createTimestamp; 
        private String expireTimestamp; 
        private String recordName; 
        private String recordType; 
        private String recordValue; 
        private Records records; 
        private String requestId; 
        private String updateTimestamp; 

        private Builder() {
        } 

        private Builder(CreateAtiAgentRegisterInfoAcmeChallengeRecordResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.agentRegisterInfoId = model.agentRegisterInfoId;
            this.createTimestamp = model.createTimestamp;
            this.expireTimestamp = model.expireTimestamp;
            this.recordName = model.recordName;
            this.recordType = model.recordType;
            this.recordValue = model.recordValue;
            this.records = model.records;
            this.requestId = model.requestId;
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
         * AgentRegisterInfoId.
         */
        public Builder agentRegisterInfoId(String agentRegisterInfoId) {
            this.agentRegisterInfoId = agentRegisterInfoId;
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
         * ExpireTimestamp.
         */
        public Builder expireTimestamp(String expireTimestamp) {
            this.expireTimestamp = expireTimestamp;
            return this;
        }

        /**
         * RecordName.
         */
        public Builder recordName(String recordName) {
            this.recordName = recordName;
            return this;
        }

        /**
         * RecordType.
         */
        public Builder recordType(String recordType) {
            this.recordType = recordType;
            return this;
        }

        /**
         * RecordValue.
         */
        public Builder recordValue(String recordValue) {
            this.recordValue = recordValue;
            return this;
        }

        /**
         * Records.
         */
        public Builder records(Records records) {
            this.records = records;
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
         * UpdateTimestamp.
         */
        public Builder updateTimestamp(String updateTimestamp) {
            this.updateTimestamp = updateTimestamp;
            return this;
        }

        public CreateAtiAgentRegisterInfoAcmeChallengeRecordResponseBody build() {
            return new CreateAtiAgentRegisterInfoAcmeChallengeRecordResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateAtiAgentRegisterInfoAcmeChallengeRecordResponseBody} extends {@link TeaModel}
     *
     * <p>CreateAtiAgentRegisterInfoAcmeChallengeRecordResponseBody</p>
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
    /**
     * 
     * {@link CreateAtiAgentRegisterInfoAcmeChallengeRecordResponseBody} extends {@link TeaModel}
     *
     * <p>CreateAtiAgentRegisterInfoAcmeChallengeRecordResponseBody</p>
     */
    public static class Record extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DomainScope")
        private String domainScope;

        @com.aliyun.core.annotation.NameInMap("RecordName")
        private String recordName;

        @com.aliyun.core.annotation.NameInMap("RecordType")
        private String recordType;

        @com.aliyun.core.annotation.NameInMap("RecordValue")
        private String recordValue;

        private Record(Builder builder) {
            this.domainScope = builder.domainScope;
            this.recordName = builder.recordName;
            this.recordType = builder.recordType;
            this.recordValue = builder.recordValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Record create() {
            return builder().build();
        }

        /**
         * @return domainScope
         */
        public String getDomainScope() {
            return this.domainScope;
        }

        /**
         * @return recordName
         */
        public String getRecordName() {
            return this.recordName;
        }

        /**
         * @return recordType
         */
        public String getRecordType() {
            return this.recordType;
        }

        /**
         * @return recordValue
         */
        public String getRecordValue() {
            return this.recordValue;
        }

        public static final class Builder {
            private String domainScope; 
            private String recordName; 
            private String recordType; 
            private String recordValue; 

            private Builder() {
            } 

            private Builder(Record model) {
                this.domainScope = model.domainScope;
                this.recordName = model.recordName;
                this.recordType = model.recordType;
                this.recordValue = model.recordValue;
            } 

            /**
             * DomainScope.
             */
            public Builder domainScope(String domainScope) {
                this.domainScope = domainScope;
                return this;
            }

            /**
             * RecordName.
             */
            public Builder recordName(String recordName) {
                this.recordName = recordName;
                return this;
            }

            /**
             * RecordType.
             */
            public Builder recordType(String recordType) {
                this.recordType = recordType;
                return this;
            }

            /**
             * RecordValue.
             */
            public Builder recordValue(String recordValue) {
                this.recordValue = recordValue;
                return this;
            }

            public Record build() {
                return new Record(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateAtiAgentRegisterInfoAcmeChallengeRecordResponseBody} extends {@link TeaModel}
     *
     * <p>CreateAtiAgentRegisterInfoAcmeChallengeRecordResponseBody</p>
     */
    public static class Records extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Record")
        private java.util.List<Record> record;

        private Records(Builder builder) {
            this.record = builder.record;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Records create() {
            return builder().build();
        }

        /**
         * @return record
         */
        public java.util.List<Record> getRecord() {
            return this.record;
        }

        public static final class Builder {
            private java.util.List<Record> record; 

            private Builder() {
            } 

            private Builder(Records model) {
                this.record = model.record;
            } 

            /**
             * Record.
             */
            public Builder record(java.util.List<Record> record) {
                this.record = record;
                return this;
            }

            public Records build() {
                return new Records(this);
            } 

        } 

    }
}
