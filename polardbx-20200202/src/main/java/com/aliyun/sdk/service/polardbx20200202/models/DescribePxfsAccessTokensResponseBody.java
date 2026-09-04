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
 * {@link DescribePxfsAccessTokensResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePxfsAccessTokensResponseBody</p>
 */
public class DescribePxfsAccessTokensResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private AccessDeniedDetail accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribePxfsAccessTokensResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePxfsAccessTokensResponseBody create() {
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

        private Builder(DescribePxfsAccessTokensResponseBody model) {
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

        public DescribePxfsAccessTokensResponseBody build() {
            return new DescribePxfsAccessTokensResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribePxfsAccessTokensResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePxfsAccessTokensResponseBody</p>
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
    /**
     * 
     * {@link DescribePxfsAccessTokensResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePxfsAccessTokensResponseBody</p>
     */
    public static class AccessTokens extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("ExpiresAt")
        private String expiresAt;

        @com.aliyun.core.annotation.NameInMap("IdentityName")
        private String identityName;

        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TokenId")
        private String tokenId;

        private AccessTokens(Builder builder) {
            this.createTime = builder.createTime;
            this.expiresAt = builder.expiresAt;
            this.identityName = builder.identityName;
            this.label = builder.label;
            this.status = builder.status;
            this.tokenId = builder.tokenId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AccessTokens create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return expiresAt
         */
        public String getExpiresAt() {
            return this.expiresAt;
        }

        /**
         * @return identityName
         */
        public String getIdentityName() {
            return this.identityName;
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return tokenId
         */
        public String getTokenId() {
            return this.tokenId;
        }

        public static final class Builder {
            private String createTime; 
            private String expiresAt; 
            private String identityName; 
            private String label; 
            private String status; 
            private String tokenId; 

            private Builder() {
            } 

            private Builder(AccessTokens model) {
                this.createTime = model.createTime;
                this.expiresAt = model.expiresAt;
                this.identityName = model.identityName;
                this.label = model.label;
                this.status = model.status;
                this.tokenId = model.tokenId;
            } 

            /**
             * <p>资源的创建时间。</p>
             * 
             * <strong>example:</strong>
             * <p>2026-09-03T12:00:00Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>访问Token的过期时间。</p>
             * 
             * <strong>example:</strong>
             * <p>2026-12-31T23:59:59Z</p>
             */
            public Builder expiresAt(String expiresAt) {
                this.expiresAt = expiresAt;
                return this;
            }

            /**
             * <p>Agent文件服务租户内的身份名称，不是阿里云账号UID。</p>
             * 
             * <strong>example:</strong>
             * <p>agent-runtime</p>
             */
            public Builder identityName(String identityName) {
                this.identityName = identityName;
                return this;
            }

            /**
             * <p>访问Token的用途标签。</p>
             * 
             * <strong>example:</strong>
             * <p>production-agent</p>
             */
            public Builder label(String label) {
                this.label = label;
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
             * <p>Token ID</p>
             * 
             * <strong>example:</strong>
             * <p>token-001</p>
             */
            public Builder tokenId(String tokenId) {
                this.tokenId = tokenId;
                return this;
            }

            public AccessTokens build() {
                return new AccessTokens(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribePxfsAccessTokensResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePxfsAccessTokensResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessTokens")
        private java.util.List<AccessTokens> accessTokens;

        private Data(Builder builder) {
            this.accessTokens = builder.accessTokens;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return accessTokens
         */
        public java.util.List<AccessTokens> getAccessTokens() {
            return this.accessTokens;
        }

        public static final class Builder {
            private java.util.List<AccessTokens> accessTokens; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.accessTokens = model.accessTokens;
            } 

            /**
             * <p>访问Token元数据列表，不包含Token明文。</p>
             */
            public Builder accessTokens(java.util.List<AccessTokens> accessTokens) {
                this.accessTokens = accessTokens;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
