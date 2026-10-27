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
 * {@link ExecuteMetaQueryResponseBody} extends {@link TeaModel}
 *
 * <p>ExecuteMetaQueryResponseBody</p>
 */
public class ExecuteMetaQueryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private AccessDeniedDetail accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ExecuteMetaQueryResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExecuteMetaQueryResponseBody create() {
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
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private AccessDeniedDetail accessDeniedDetail; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ExecuteMetaQueryResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The detailed information about the access denial.</p>
         */
        public Builder accessDeniedDetail(AccessDeniedDetail accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * <p>The list of instance details.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The additional message returned by the API operation. If the request is successful, success is returned. If an error occurs, the corresponding error code is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>A501A191-BD70-5E50-98A9-C2A486A82****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ExecuteMetaQueryResponseBody build() {
            return new ExecuteMetaQueryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ExecuteMetaQueryResponseBody} extends {@link TeaModel}
     *
     * <p>ExecuteMetaQueryResponseBody</p>
     */
    public static class AccessDeniedDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthAction")
        private String authAction;

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
            private String authPrincipalType; 
            private String encodedDiagnosticMessage; 
            private String noPermissionType; 
            private String policyType; 

            private Builder() {
            } 

            private Builder(AccessDeniedDetail model) {
                this.authAction = model.authAction;
                this.authPrincipalType = model.authPrincipalType;
                this.encodedDiagnosticMessage = model.encodedDiagnosticMessage;
                this.noPermissionType = model.noPermissionType;
                this.policyType = model.policyType;
            } 

            /**
             * <p>Same as above.</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder authAction(String authAction) {
                this.authAction = authAction;
                return this;
            }

            /**
             * <p>Same as above.</p>
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
             * <p>PolicyType</p>
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
    /**
     * 
     * {@link ExecuteMetaQueryResponseBody} extends {@link TeaModel}
     *
     * <p>ExecuteMetaQueryResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppliedOffset")
        private Long appliedOffset;

        @com.aliyun.core.annotation.NameInMap("AppliedRowLimit")
        private Long appliedRowLimit;

        @com.aliyun.core.annotation.NameInMap("Columns")
        private java.util.List<String> columns;

        @com.aliyun.core.annotation.NameInMap("HasMore")
        private Boolean hasMore;

        @com.aliyun.core.annotation.NameInMap("RecordsSizeBytes")
        private Long recordsSizeBytes;

        @com.aliyun.core.annotation.NameInMap("ReturnedRowCount")
        private Long returnedRowCount;

        @com.aliyun.core.annotation.NameInMap("RowCount")
        private Integer rowCount;

        @com.aliyun.core.annotation.NameInMap("Rows")
        private java.util.List<java.util.Map<String, ?>> rows;

        private Data(Builder builder) {
            this.appliedOffset = builder.appliedOffset;
            this.appliedRowLimit = builder.appliedRowLimit;
            this.columns = builder.columns;
            this.hasMore = builder.hasMore;
            this.recordsSizeBytes = builder.recordsSizeBytes;
            this.returnedRowCount = builder.returnedRowCount;
            this.rowCount = builder.rowCount;
            this.rows = builder.rows;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
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
         * @return columns
         */
        public java.util.List<String> getColumns() {
            return this.columns;
        }

        /**
         * @return hasMore
         */
        public Boolean getHasMore() {
            return this.hasMore;
        }

        /**
         * @return recordsSizeBytes
         */
        public Long getRecordsSizeBytes() {
            return this.recordsSizeBytes;
        }

        /**
         * @return returnedRowCount
         */
        public Long getReturnedRowCount() {
            return this.returnedRowCount;
        }

        /**
         * @return rowCount
         */
        public Integer getRowCount() {
            return this.rowCount;
        }

        /**
         * @return rows
         */
        public java.util.List<java.util.Map<String, ?>> getRows() {
            return this.rows;
        }

        public static final class Builder {
            private Long appliedOffset; 
            private Long appliedRowLimit; 
            private java.util.List<String> columns; 
            private Boolean hasMore; 
            private Long recordsSizeBytes; 
            private Long returnedRowCount; 
            private Integer rowCount; 
            private java.util.List<java.util.Map<String, ?>> rows; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.appliedOffset = model.appliedOffset;
                this.appliedRowLimit = model.appliedRowLimit;
                this.columns = model.columns;
                this.hasMore = model.hasMore;
                this.recordsSizeBytes = model.recordsSizeBytes;
                this.returnedRowCount = model.returnedRowCount;
                this.rowCount = model.rowCount;
                this.rows = model.rows;
            } 

            /**
             * <p>The actual top-level LIMIT offset applied to the SQL statement. If no offset is specified, the value is 0.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder appliedOffset(Long appliedOffset) {
                this.appliedOffset = appliedOffset;
                return this;
            }

            /**
             * <p>The effective upper limit of returned rows for this request.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder appliedRowLimit(Long appliedRowLimit) {
                this.appliedRowLimit = appliedRowLimit;
                return this;
            }

            /**
             * <p>The column names.</p>
             */
            public Builder columns(java.util.List<String> columns) {
                this.columns = columns;
                return this;
            }

            /**
             * <p>Indicates whether the query result contains at least one more row beyond the effective row limit for this request.</p>
             */
            public Builder hasMore(Boolean hasMore) {
                this.hasMore = hasMore;
                return this;
            }

            /**
             * <p>The size in bytes of the Rows JSON array in the returned result after UTF-8 encoding, excluding protocol overhead.</p>
             * 
             * <strong>example:</strong>
             * <p>2048</p>
             */
            public Builder recordsSizeBytes(Long recordsSizeBytes) {
                this.recordsSizeBytes = recordsSizeBytes;
                return this;
            }

            /**
             * <p>The actual number of result rows returned for this request.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder returnedRowCount(Long returnedRowCount) {
                this.returnedRowCount = returnedRowCount;
                return this;
            }

            /**
             * <p>The total number of data rows.</p>
             * 
             * <strong>example:</strong>
             * <p>97901</p>
             */
            public Builder rowCount(Integer rowCount) {
                this.rowCount = rowCount;
                return this;
            }

            /**
             * <p>The number of affected or returned rows. This field is available only for CN.</p>
             */
            public Builder rows(java.util.List<java.util.Map<String, ?>> rows) {
                this.rows = rows;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
