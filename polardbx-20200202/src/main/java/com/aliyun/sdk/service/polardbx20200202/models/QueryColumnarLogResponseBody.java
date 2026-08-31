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
 * {@link QueryColumnarLogResponseBody} extends {@link TeaModel}
 *
 * <p>QueryColumnarLogResponseBody</p>
 */
public class QueryColumnarLogResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private AccessDeniedDetail accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("AppliedOffset")
    private Long appliedOffset;

    @com.aliyun.core.annotation.NameInMap("AppliedRowLimit")
    private Long appliedRowLimit;

    @com.aliyun.core.annotation.NameInMap("HasMore")
    private Boolean hasMore;

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

    @com.aliyun.core.annotation.NameInMap("ReturnedRowCount")
    private Long returnedRowCount;

    private QueryColumnarLogResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.appliedOffset = builder.appliedOffset;
        this.appliedRowLimit = builder.appliedRowLimit;
        this.hasMore = builder.hasMore;
        this.queryElapsedTimeMilliseconds = builder.queryElapsedTimeMilliseconds;
        this.queryId = builder.queryId;
        this.records = builder.records;
        this.recordsSizeBytes = builder.recordsSizeBytes;
        this.requestId = builder.requestId;
        this.returnedRowCount = builder.returnedRowCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryColumnarLogResponseBody create() {
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
     * @return hasMore
     */
    public Boolean getHasMore() {
        return this.hasMore;
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
     * @return returnedRowCount
     */
    public Long getReturnedRowCount() {
        return this.returnedRowCount;
    }

    public static final class Builder {
        private AccessDeniedDetail accessDeniedDetail; 
        private Long appliedOffset; 
        private Long appliedRowLimit; 
        private Boolean hasMore; 
        private Long queryElapsedTimeMilliseconds; 
        private String queryId; 
        private java.util.List<java.util.Map<String, String>> records; 
        private Long recordsSizeBytes; 
        private String requestId; 
        private Long returnedRowCount; 

        private Builder() {
        } 

        private Builder(QueryColumnarLogResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.appliedOffset = model.appliedOffset;
            this.appliedRowLimit = model.appliedRowLimit;
            this.hasMore = model.hasMore;
            this.queryElapsedTimeMilliseconds = model.queryElapsedTimeMilliseconds;
            this.queryId = model.queryId;
            this.records = model.records;
            this.recordsSizeBytes = model.recordsSizeBytes;
            this.requestId = model.requestId;
            this.returnedRowCount = model.returnedRowCount;
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
         * HasMore.
         */
        public Builder hasMore(Boolean hasMore) {
            this.hasMore = hasMore;
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
         * ReturnedRowCount.
         */
        public Builder returnedRowCount(Long returnedRowCount) {
            this.returnedRowCount = returnedRowCount;
            return this;
        }

        public QueryColumnarLogResponseBody build() {
            return new QueryColumnarLogResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryColumnarLogResponseBody} extends {@link TeaModel}
     *
     * <p>QueryColumnarLogResponseBody</p>
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
