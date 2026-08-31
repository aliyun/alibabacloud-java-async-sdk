// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202.models;

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
 * {@link QueryColumnarLogSSEResponseBody} extends {@link TeaModel}
 *
 * <p>QueryColumnarLogSSEResponseBody</p>
 */
public class QueryColumnarLogSSEResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private AccessDeniedDetail accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("AppliedOffset")
    private Long appliedOffset;

    @com.aliyun.core.annotation.NameInMap("AppliedRowLimit")
    private Long appliedRowLimit;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HasMore")
    private Boolean hasMore;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Partial")
    private Boolean partial;

    @com.aliyun.core.annotation.NameInMap("QueryElapsedTimeMilliseconds")
    private Long queryElapsedTimeMilliseconds;

    @com.aliyun.core.annotation.NameInMap("QueryId")
    private String queryId;

    @com.aliyun.core.annotation.NameInMap("Records")
    private java.util.List<java.util.Map<String, String>> records;

    @com.aliyun.core.annotation.NameInMap("RecordsSizeBytes")
    private Long recordsSizeBytes;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Retryable")
    private Boolean retryable;

    @com.aliyun.core.annotation.NameInMap("ReturnedRowCount")
    private Long returnedRowCount;

    @com.aliyun.core.annotation.NameInMap("Sequence")
    private Long sequence;

    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private QueryColumnarLogSSEResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.appliedOffset = builder.appliedOffset;
        this.appliedRowLimit = builder.appliedRowLimit;
        this.code = builder.code;
        this.hasMore = builder.hasMore;
        this.message = builder.message;
        this.partial = builder.partial;
        this.queryElapsedTimeMilliseconds = builder.queryElapsedTimeMilliseconds;
        this.queryId = builder.queryId;
        this.records = builder.records;
        this.recordsSizeBytes = builder.recordsSizeBytes;
        this.requestId = builder.requestId;
        this.retryable = builder.retryable;
        this.returnedRowCount = builder.returnedRowCount;
        this.sequence = builder.sequence;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryColumnarLogSSEResponseBody create() {
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
     * @return appliedOffset
     */
    public Long getAppliedOffset() {
        return this.appliedOffset;
    }

    /**
     * @return appliedRowLimit
     */
    public Long getAppliedRowLimit() {
        return this.appliedRowLimit;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return hasMore
     */
    public Boolean getHasMore() {
        return this.hasMore;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return partial
     */
    public Boolean getPartial() {
        return this.partial;
    }

    /**
     * @return queryElapsedTimeMilliseconds
     */
    public Long getQueryElapsedTimeMilliseconds() {
        return this.queryElapsedTimeMilliseconds;
    }

    /**
     * @return queryId
     */
    public String getQueryId() {
        return this.queryId;
    }

    /**
     * @return records
     */
    public java.util.List<java.util.Map<String, String>> getRecords() {
        return this.records;
    }

    /**
     * @return recordsSizeBytes
     */
    public Long getRecordsSizeBytes() {
        return this.recordsSizeBytes;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return retryable
     */
    public Boolean getRetryable() {
        return this.retryable;
    }

    /**
     * @return returnedRowCount
     */
    public Long getReturnedRowCount() {
        return this.returnedRowCount;
    }

    /**
     * @return sequence
     */
    public Long getSequence() {
        return this.sequence;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private AccessDeniedDetail accessDeniedDetail; 
        private Long appliedOffset; 
        private Long appliedRowLimit; 
        private String code; 
        private Boolean hasMore; 
        private String message; 
        private Boolean partial; 
        private Long queryElapsedTimeMilliseconds; 
        private String queryId; 
        private java.util.List<java.util.Map<String, String>> records; 
        private Long recordsSizeBytes; 
        private String requestId; 
        private Boolean retryable; 
        private Long returnedRowCount; 
        private Long sequence; 
        private String type; 

        private Builder() {
        } 

        private Builder(QueryColumnarLogSSEResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.appliedOffset = model.appliedOffset;
            this.appliedRowLimit = model.appliedRowLimit;
            this.code = model.code;
            this.hasMore = model.hasMore;
            this.message = model.message;
            this.partial = model.partial;
            this.queryElapsedTimeMilliseconds = model.queryElapsedTimeMilliseconds;
            this.queryId = model.queryId;
            this.records = model.records;
            this.recordsSizeBytes = model.recordsSizeBytes;
            this.requestId = model.requestId;
            this.retryable = model.retryable;
            this.returnedRowCount = model.returnedRowCount;
            this.sequence = model.sequence;
            this.type = model.type;
        } 

        /**
         * AccessDeniedDetail.
         */
        public Builder accessDeniedDetail(AccessDeniedDetail accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * AppliedOffset.
         */
        public Builder appliedOffset(Long appliedOffset) {
            this.appliedOffset = appliedOffset;
            return this;
        }

        /**
         * AppliedRowLimit.
         */
        public Builder appliedRowLimit(Long appliedRowLimit) {
            this.appliedRowLimit = appliedRowLimit;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * HasMore.
         */
        public Builder hasMore(Boolean hasMore) {
            this.hasMore = hasMore;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * Partial.
         */
        public Builder partial(Boolean partial) {
            this.partial = partial;
            return this;
        }

        /**
         * QueryElapsedTimeMilliseconds.
         */
        public Builder queryElapsedTimeMilliseconds(Long queryElapsedTimeMilliseconds) {
            this.queryElapsedTimeMilliseconds = queryElapsedTimeMilliseconds;
            return this;
        }

        /**
         * QueryId.
         */
        public Builder queryId(String queryId) {
            this.queryId = queryId;
            return this;
        }

        /**
         * Records.
         */
        public Builder records(java.util.List<java.util.Map<String, String>> records) {
            this.records = records;
            return this;
        }

        /**
         * RecordsSizeBytes.
         */
        public Builder recordsSizeBytes(Long recordsSizeBytes) {
            this.recordsSizeBytes = recordsSizeBytes;
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
         * Retryable.
         */
        public Builder retryable(Boolean retryable) {
            this.retryable = retryable;
            return this;
        }

        /**
         * ReturnedRowCount.
         */
        public Builder returnedRowCount(Long returnedRowCount) {
            this.returnedRowCount = returnedRowCount;
            return this;
        }

        /**
         * Sequence.
         */
        public Builder sequence(Long sequence) {
            this.sequence = sequence;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public QueryColumnarLogSSEResponseBody build() {
            return new QueryColumnarLogSSEResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryColumnarLogSSEResponseBody} extends {@link TeaModel}
     *
     * <p>QueryColumnarLogSSEResponseBody</p>
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
             * <p>NoPermissionType</p>
             * 
             * <strong>example:</strong>
             * <p>ImplicitDeny</p>
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
