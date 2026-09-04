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
 * {@link DescribePxfsTenantResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePxfsTenantResponseBody</p>
 */
public class DescribePxfsTenantResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private AccessDeniedDetail accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribePxfsTenantResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePxfsTenantResponseBody create() {
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

        private Builder(DescribePxfsTenantResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * AccessDeniedDetail.
         */
        public Builder accessDeniedDetail(AccessDeniedDetail accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * <p>接口返回的业务数据。</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>请求的唯一标识，可用于排查问题。</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribePxfsTenantResponseBody build() {
            return new DescribePxfsTenantResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribePxfsTenantResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePxfsTenantResponseBody</p>
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
     * {@link DescribePxfsTenantResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePxfsTenantResponseBody</p>
     */
    public static class Data extends TeaModel {
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

        @com.aliyun.core.annotation.NameInMap("UsedBytes")
        private Long usedBytes;

        @com.aliyun.core.annotation.NameInMap("UsedFiles")
        private Long usedFiles;

        private Data(Builder builder) {
            this.quotaBytes = builder.quotaBytes;
            this.quotaFiles = builder.quotaFiles;
            this.rateLimitRps = builder.rateLimitRps;
            this.rateLimitWbps = builder.rateLimitWbps;
            this.status = builder.status;
            this.tenantId = builder.tenantId;
            this.tenantName = builder.tenantName;
            this.usedBytes = builder.usedBytes;
            this.usedFiles = builder.usedFiles;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
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

        /**
         * @return usedBytes
         */
        public Long getUsedBytes() {
            return this.usedBytes;
        }

        /**
         * @return usedFiles
         */
        public Long getUsedFiles() {
            return this.usedFiles;
        }

        public static final class Builder {
            private Long quotaBytes; 
            private Long quotaFiles; 
            private Long rateLimitRps; 
            private Long rateLimitWbps; 
            private String status; 
            private String tenantId; 
            private String tenantName; 
            private Long usedBytes; 
            private Long usedFiles; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.quotaBytes = model.quotaBytes;
                this.quotaFiles = model.quotaFiles;
                this.rateLimitRps = model.rateLimitRps;
                this.rateLimitWbps = model.rateLimitWbps;
                this.status = model.status;
                this.tenantId = model.tenantId;
                this.tenantName = model.tenantName;
                this.usedBytes = model.usedBytes;
                this.usedFiles = model.usedFiles;
            } 

            /**
             * <p>租户容量配额，单位为字节；0表示禁止新增数据。</p>
             * 
             * <strong>example:</strong>
             * <p>107374182400</p>
             */
            public Builder quotaBytes(Long quotaBytes) {
                this.quotaBytes = quotaBytes;
                return this;
            }

            /**
             * <p>租户文件数量配额；0表示禁止新增文件。</p>
             * 
             * <strong>example:</strong>
             * <p>1000000</p>
             */
            public Builder quotaFiles(Long quotaFiles) {
                this.quotaFiles = quotaFiles;
                return this;
            }

            /**
             * <p>租户每秒请求数上限；0表示不限制。</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder rateLimitRps(Long rateLimitRps) {
                this.rateLimitRps = rateLimitRps;
                return this;
            }

            /**
             * <p>租户每秒写入字节数上限；0表示不限制。</p>
             * 
             * <strong>example:</strong>
             * <p>104857600</p>
             */
            public Builder rateLimitWbps(Long rateLimitWbps) {
                this.rateLimitWbps = rateLimitWbps;
                return this;
            }

            /**
             * <p>当前资源状态。</p>
             * 
             * <strong>example:</strong>
             * <p>ACTIVE</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>Agent文件服务的租户ID。</p>
             * 
             * <strong>example:</strong>
             * <p>tenant-001</p>
             */
            public Builder tenantId(String tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            /**
             * <p>Agent文件服务的租户名称。</p>
             * 
             * <strong>example:</strong>
             * <p>agent-files</p>
             */
            public Builder tenantName(String tenantName) {
                this.tenantName = tenantName;
                return this;
            }

            /**
             * <p>租户已使用的容量，单位为字节。</p>
             * 
             * <strong>example:</strong>
             * <p>1048576</p>
             */
            public Builder usedBytes(Long usedBytes) {
                this.usedBytes = usedBytes;
                return this;
            }

            /**
             * <p>租户已使用的文件数量。</p>
             * 
             * <strong>example:</strong>
             * <p>128</p>
             */
            public Builder usedFiles(Long usedFiles) {
                this.usedFiles = usedFiles;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
