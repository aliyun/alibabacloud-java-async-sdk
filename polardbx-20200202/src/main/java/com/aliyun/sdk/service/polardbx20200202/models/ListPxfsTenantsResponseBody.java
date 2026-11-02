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
 * {@link ListPxfsTenantsResponseBody} extends {@link TeaModel}
 *
 * <p>ListPxfsTenantsResponseBody</p>
 */
public class ListPxfsTenantsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private AccessDeniedDetail accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListPxfsTenantsResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPxfsTenantsResponseBody create() {
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private AccessDeniedDetail accessDeniedDetail; 
        private Data data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListPxfsTenantsResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The access denial details.</p>
         */
        public Builder accessDeniedDetail(AccessDeniedDetail accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * <p>The data struct.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>C458B1E8-1683-3645-B154-6BA32080EEA</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListPxfsTenantsResponseBody build() {
            return new ListPxfsTenantsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListPxfsTenantsResponseBody} extends {@link TeaModel}
     *
     * <p>ListPxfsTenantsResponseBody</p>
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
             * <p>xxx</p>
             */
            public Builder authAction(String authAction) {
                this.authAction = authAction;
                return this;
            }

            /**
             * <p>The display name of the authentication principal.</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder authPrincipalDisplayName(String authPrincipalDisplayName) {
                this.authPrincipalDisplayName = authPrincipalDisplayName;
                return this;
            }

            /**
             * <p>The ID of the owner of the authentication principal.</p>
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
             * <p>The encoded diagnostic message.</p>
             * 
             * <strong>example:</strong>
             * <p>AQEAAAAAaKPfwjY0MzMyODRGLUZCQkQtNTA1RS04MUUxLTc5NTkzODk2MUIzMg==</p>
             */
            public Builder encodedDiagnosticMessage(String encodedDiagnosticMessage) {
                this.encodedDiagnosticMessage = encodedDiagnosticMessage;
                return this;
            }

            /**
             * <p>The type of the access denial.</p>
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
    /**
     * 
     * {@link ListPxfsTenantsResponseBody} extends {@link TeaModel}
     *
     * <p>ListPxfsTenantsResponseBody</p>
     */
    public static class Tenants extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DedupBytes")
        private Long dedupBytes;

        @com.aliyun.core.annotation.NameInMap("LogicalBytes")
        private Long logicalBytes;

        @com.aliyun.core.annotation.NameInMap("LogicalFiles")
        private Long logicalFiles;

        @com.aliyun.core.annotation.NameInMap("PhysicalBytes")
        private Long physicalBytes;

        @com.aliyun.core.annotation.NameInMap("QuotaBytes")
        private Long quotaBytes;

        @com.aliyun.core.annotation.NameInMap("QuotaFiles")
        private Long quotaFiles;

        @com.aliyun.core.annotation.NameInMap("RateLimitRps")
        private Long rateLimitRps;

        @com.aliyun.core.annotation.NameInMap("RateLimitWbps")
        private Long rateLimitWbps;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TenantId")
        private String tenantId;

        @com.aliyun.core.annotation.NameInMap("TenantName")
        private String tenantName;

        private Tenants(Builder builder) {
            this.dedupBytes = builder.dedupBytes;
            this.logicalBytes = builder.logicalBytes;
            this.logicalFiles = builder.logicalFiles;
            this.physicalBytes = builder.physicalBytes;
            this.quotaBytes = builder.quotaBytes;
            this.quotaFiles = builder.quotaFiles;
            this.rateLimitRps = builder.rateLimitRps;
            this.rateLimitWbps = builder.rateLimitWbps;
            this.status = builder.status;
            this.tenantId = builder.tenantId;
            this.tenantName = builder.tenantName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tenants create() {
            return builder().build();
        }

        /**
         * @return dedupBytes
         */
        public Long getDedupBytes() {
            return this.dedupBytes;
        }

        /**
         * @return logicalBytes
         */
        public Long getLogicalBytes() {
            return this.logicalBytes;
        }

        /**
         * @return logicalFiles
         */
        public Long getLogicalFiles() {
            return this.logicalFiles;
        }

        /**
         * @return physicalBytes
         */
        public Long getPhysicalBytes() {
            return this.physicalBytes;
        }

        /**
         * @return quotaBytes
         */
        public Long getQuotaBytes() {
            return this.quotaBytes;
        }

        /**
         * @return quotaFiles
         */
        public Long getQuotaFiles() {
            return this.quotaFiles;
        }

        /**
         * @return rateLimitRps
         */
        public Long getRateLimitRps() {
            return this.rateLimitRps;
        }

        /**
         * @return rateLimitWbps
         */
        public Long getRateLimitWbps() {
            return this.rateLimitWbps;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return tenantId
         */
        public String getTenantId() {
            return this.tenantId;
        }

        /**
         * @return tenantName
         */
        public String getTenantName() {
            return this.tenantName;
        }

        public static final class Builder {
            private Long dedupBytes; 
            private Long logicalBytes; 
            private Long logicalFiles; 
            private Long physicalBytes; 
            private Long quotaBytes; 
            private Long quotaFiles; 
            private Long rateLimitRps; 
            private Long rateLimitWbps; 
            private String status; 
            private String tenantId; 
            private String tenantName; 

            private Builder() {
            } 

            private Builder(Tenants model) {
                this.dedupBytes = model.dedupBytes;
                this.logicalBytes = model.logicalBytes;
                this.logicalFiles = model.logicalFiles;
                this.physicalBytes = model.physicalBytes;
                this.quotaBytes = model.quotaBytes;
                this.quotaFiles = model.quotaFiles;
                this.rateLimitRps = model.rateLimitRps;
                this.rateLimitWbps = model.rateLimitWbps;
                this.status = model.status;
                this.tenantId = model.tenantId;
                this.tenantName = model.tenantName;
            } 

            /**
             * <p>The number of bytes saved for the tenant after data deduplication.</p>
             * 
             * <strong>example:</strong>
             * <p>268435456</p>
             */
            public Builder dedupBytes(Long dedupBytes) {
                this.dedupBytes = dedupBytes;
                return this;
            }

            /**
             * <p>The current logical usage of the tenant, in bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>1073741824</p>
             */
            public Builder logicalBytes(Long logicalBytes) {
                this.logicalBytes = logicalBytes;
                return this;
            }

            /**
             * <p>The current number of logical files for the tenant.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder logicalFiles(Long logicalFiles) {
                this.logicalFiles = logicalFiles;
                return this;
            }

            /**
             * <p>The actual physical storage space occupied by the tenant, in bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>805306368</p>
             */
            public Builder physicalBytes(Long physicalBytes) {
                this.physicalBytes = physicalBytes;
                return this;
            }

            /**
             * <p>The capacity quota.</p>
             * 
             * <strong>example:</strong>
             * <p>107374182400</p>
             */
            public Builder quotaBytes(Long quotaBytes) {
                this.quotaBytes = quotaBytes;
                return this;
            }

            /**
             * <p>The file count quota.</p>
             * 
             * <strong>example:</strong>
             * <p>1000000</p>
             */
            public Builder quotaFiles(Long quotaFiles) {
                this.quotaFiles = quotaFiles;
                return this;
            }

            /**
             * <p>The request rate limit.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder rateLimitRps(Long rateLimitRps) {
                this.rateLimitRps = rateLimitRps;
                return this;
            }

            /**
             * <p>The write bandwidth limit.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder rateLimitWbps(Long rateLimitWbps) {
                this.rateLimitWbps = rateLimitWbps;
                return this;
            }

            /**
             * <p>The status.</p>
             * 
             * <strong>example:</strong>
             * <p>enabled</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The tenant ID.</p>
             * 
             * <strong>example:</strong>
             * <p>zero-v1zhme7mtddrkfn40hrr9ifk</p>
             */
            public Builder tenantId(String tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            /**
             * <p>The tenant name.</p>
             * 
             * <strong>example:</strong>
             * <p>zero-v1zhme7mtddrkfn40hrr9ifk</p>
             */
            public Builder tenantName(String tenantName) {
                this.tenantName = tenantName;
                return this;
            }

            public Tenants build() {
                return new Tenants(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListPxfsTenantsResponseBody} extends {@link TeaModel}
     *
     * <p>ListPxfsTenantsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Tenants")
        private java.util.List<Tenants> tenants;

        private Data(Builder builder) {
            this.tenants = builder.tenants;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return tenants
         */
        public java.util.List<Tenants> getTenants() {
            return this.tenants;
        }

        public static final class Builder {
            private java.util.List<Tenants> tenants; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.tenants = model.tenants;
            } 

            /**
             * <p>The list of PXFS tenants.</p>
             */
            public Builder tenants(java.util.List<Tenants> tenants) {
                this.tenants = tenants;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
