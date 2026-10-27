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
         * <p>The details about the access denial.</p>
         */
        public Builder accessDeniedDetail(AccessDeniedDetail accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * <p>The top-level SQL LIMIT offset that the service actually applied. The value is 0 if the SQL statement does not specify an offset.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder appliedOffset(Long appliedOffset) {
            this.appliedOffset = appliedOffset;
            return this;
        }

        /**
         * <p>The maximum number of rows that the service actually returns after evaluating the top-level SQL LIMIT clause, MaxResultRows, the default value of the synchronous API, and the current service policy. This value does not include the extra row used to detect HasMore.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        public Builder appliedRowLimit(Long appliedRowLimit) {
            this.appliedRowLimit = appliedRowLimit;
            return this;
        }

        /**
         * <p>Indicates whether the service or API row limit truncated the SQL statement submitted by the caller. The value is false when the SQL statement with a smaller LIMIT clause is fully executed, which does not indicate that no more data exists in the underlying table.</p>
         * 
         * <strong>example:</strong>
         * <p>False</p>
         */
        public Builder hasMore(Boolean hasMore) {
            this.hasMore = hasMore;
            return this;
        }

        /**
         * <p>The elapsed time from the start of the JDBC statement execution to the completion of reading the last result row or probe row. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>125</p>
         */
        public Builder queryElapsedTimeMilliseconds(Long queryElapsedTimeMilliseconds) {
            this.queryElapsedTimeMilliseconds = queryElapsedTimeMilliseconds;
            return this;
        }

        /**
         * <p>The unique identifier generated by the service for this JDBC query.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;NodeId\&quot;:\&quot;n_7844571364614995969\&quot;}</p>
         */
        public Builder queryId(String queryId) {
            this.queryId = queryId;
            return this;
        }

        /**
         * <p>The list of query results. Each row is a JSON key-value object that maps column names to text values. All scalars are returned as strings. SQL NULL is encoded as the string null, and empty strings remain as empty strings.</p>
         */
        public Builder records(java.util.List<java.util.Map<String, String>> records) {
            this.records = records;
            return this;
        }

        /**
         * <p>The total number of UTF-8 bytes of the JSON objects across all returned rows, excluding the array and fixed response fields. The complete JSON response of the synchronous API is also subject to a 16 MiB upper limit.</p>
         * 
         * <strong>example:</strong>
         * <p>8192</p>
         */
        public Builder recordsSizeBytes(Long recordsSizeBytes) {
            this.recordsSizeBytes = recordsSizeBytes;
            return this;
        }

        /**
         * <p>The request ID. This ID is used throughout the entire process from access, authentication, and routing to query completion, which facilitates end-to-end troubleshooting.</p>
         * 
         * <strong>example:</strong>
         * <p>9B2F3840-****-475C-B269-2D5C3A31797C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The actual number of result rows returned in this synchronous response.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
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
             * <p>The authentication action.</p>
             * 
             * <strong>example:</strong>
             * <p>polardbx:QueryColumnarLog</p>
             */
            public Builder authAction(String authAction) {
                this.authAction = authAction;
                return this;
            }

            /**
             * <p>The display name of the authentication principal.</p>
             * 
             * <strong>example:</strong>
             * <p>Sample RAM user</p>
             */
            public Builder authPrincipalDisplayName(String authPrincipalDisplayName) {
                this.authPrincipalDisplayName = authPrincipalDisplayName;
                return this;
            }

            /**
             * <p>The owner ID of the authentication principal.</p>
             * 
             * <strong>example:</strong>
             * <p>111</p>
             */
            public Builder authPrincipalOwnerId(String authPrincipalOwnerId) {
                this.authPrincipalOwnerId = authPrincipalOwnerId;
                return this;
            }

            /**
             * <p>The type of the authentication principal.</p>
             * 
             * <strong>example:</strong>
             * <p>222</p>
             */
            public Builder authPrincipalType(String authPrincipalType) {
                this.authPrincipalType = authPrincipalType;
                return this;
            }

            /**
             * <p>The diagnostic information.</p>
             * 
             * <strong>example:</strong>
             * <p>AQEAAAAAaKPfwjY0MzMyODRGLUZCQkQtNTA1RS04MUUxLTc5NTkzODk2MUIzMg==</p>
             */
            public Builder encodedDiagnosticMessage(String encodedDiagnosticMessage) {
                this.encodedDiagnosticMessage = encodedDiagnosticMessage;
                return this;
            }

            /**
             * <p>The type of the missing permission.</p>
             * 
             * <strong>example:</strong>
             * <p>ImplicitDeny</p>
             */
            public Builder noPermissionType(String noPermissionType) {
                this.noPermissionType = noPermissionType;
                return this;
            }

            /**
             * <p>The policy type.</p>
             * 
             * <strong>example:</strong>
             * <p>PRIORITY</p>
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
