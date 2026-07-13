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
 * {@link VerifyAtiAgentDnsRecordsResponseBody} extends {@link TeaModel}
 *
 * <p>VerifyAtiAgentDnsRecordsResponseBody</p>
 */
public class VerifyAtiAgentDnsRecordsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private AccessDeniedDetail accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("AgentRegisterInfoId")
    private String agentRegisterInfoId;

    @com.aliyun.core.annotation.NameInMap("AgentStatus")
    private String agentStatus;

    @com.aliyun.core.annotation.NameInMap("AllVerified")
    private Boolean allVerified;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Results")
    private Results results;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private VerifyAtiAgentDnsRecordsResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.agentRegisterInfoId = builder.agentRegisterInfoId;
        this.agentStatus = builder.agentStatus;
        this.allVerified = builder.allVerified;
        this.requestId = builder.requestId;
        this.results = builder.results;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static VerifyAtiAgentDnsRecordsResponseBody create() {
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
     * @return agentStatus
     */
    public String getAgentStatus() {
        return this.agentStatus;
    }

    /**
     * @return allVerified
     */
    public Boolean getAllVerified() {
        return this.allVerified;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return results
     */
    public Results getResults() {
        return this.results;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private AccessDeniedDetail accessDeniedDetail; 
        private String agentRegisterInfoId; 
        private String agentStatus; 
        private Boolean allVerified; 
        private String requestId; 
        private Results results; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(VerifyAtiAgentDnsRecordsResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.agentRegisterInfoId = model.agentRegisterInfoId;
            this.agentStatus = model.agentStatus;
            this.allVerified = model.allVerified;
            this.requestId = model.requestId;
            this.results = model.results;
            this.success = model.success;
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
         * AgentStatus.
         */
        public Builder agentStatus(String agentStatus) {
            this.agentStatus = agentStatus;
            return this;
        }

        /**
         * AllVerified.
         */
        public Builder allVerified(Boolean allVerified) {
            this.allVerified = allVerified;
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
         * Results.
         */
        public Builder results(Results results) {
            this.results = results;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public VerifyAtiAgentDnsRecordsResponseBody build() {
            return new VerifyAtiAgentDnsRecordsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link VerifyAtiAgentDnsRecordsResponseBody} extends {@link TeaModel}
     *
     * <p>VerifyAtiAgentDnsRecordsResponseBody</p>
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
     * {@link VerifyAtiAgentDnsRecordsResponseBody} extends {@link TeaModel}
     *
     * <p>VerifyAtiAgentDnsRecordsResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FailReason")
        private String failReason;

        @com.aliyun.core.annotation.NameInMap("RecordName")
        private String recordName;

        @com.aliyun.core.annotation.NameInMap("RecordType")
        private String recordType;

        @com.aliyun.core.annotation.NameInMap("VerifyStatus")
        private String verifyStatus;

        private Result(Builder builder) {
            this.failReason = builder.failReason;
            this.recordName = builder.recordName;
            this.recordType = builder.recordType;
            this.verifyStatus = builder.verifyStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return failReason
         */
        public String getFailReason() {
            return this.failReason;
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
         * @return verifyStatus
         */
        public String getVerifyStatus() {
            return this.verifyStatus;
        }

        public static final class Builder {
            private String failReason; 
            private String recordName; 
            private String recordType; 
            private String verifyStatus; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.failReason = model.failReason;
                this.recordName = model.recordName;
                this.recordType = model.recordType;
                this.verifyStatus = model.verifyStatus;
            } 

            /**
             * FailReason.
             */
            public Builder failReason(String failReason) {
                this.failReason = failReason;
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
             * VerifyStatus.
             */
            public Builder verifyStatus(String verifyStatus) {
                this.verifyStatus = verifyStatus;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
    /**
     * 
     * {@link VerifyAtiAgentDnsRecordsResponseBody} extends {@link TeaModel}
     *
     * <p>VerifyAtiAgentDnsRecordsResponseBody</p>
     */
    public static class Results extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Result")
        private java.util.List<Result> result;

        private Results(Builder builder) {
            this.result = builder.result;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Results create() {
            return builder().build();
        }

        /**
         * @return result
         */
        public java.util.List<Result> getResult() {
            return this.result;
        }

        public static final class Builder {
            private java.util.List<Result> result; 

            private Builder() {
            } 

            private Builder(Results model) {
                this.result = model.result;
            } 

            /**
             * Result.
             */
            public Builder result(java.util.List<Result> result) {
                this.result = result;
                return this;
            }

            public Results build() {
                return new Results(this);
            } 

        } 

    }
}
