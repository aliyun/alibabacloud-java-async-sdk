// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rdsai20250507.models;

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
 * {@link GetContextDatabaseSyncConnectionAuthorizationResponseBody} extends {@link TeaModel}
 *
 * <p>GetContextDatabaseSyncConnectionAuthorizationResponseBody</p>
 */
public class GetContextDatabaseSyncConnectionAuthorizationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Long httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetContextDatabaseSyncConnectionAuthorizationResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetContextDatabaseSyncConnectionAuthorizationResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
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
        private String code; 
        private Data data; 
        private Long httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetContextDatabaseSyncConnectionAuthorizationResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>Sample value</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder httpStatusCode(Long httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The message.</p>
         * 
         * <strong>example:</strong>
         * <p>Sample value</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>id-001</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetContextDatabaseSyncConnectionAuthorizationResponseBody build() {
            return new GetContextDatabaseSyncConnectionAuthorizationResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetContextDatabaseSyncConnectionAuthorizationResponseBody} extends {@link TeaModel}
     *
     * <p>GetContextDatabaseSyncConnectionAuthorizationResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthKind")
        private String authKind;

        @com.aliyun.core.annotation.NameInMap("AuthState")
        private String authState;

        @com.aliyun.core.annotation.NameInMap("CreatedAt")
        private String createdAt;

        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("PluginId")
        private String pluginId;

        @com.aliyun.core.annotation.NameInMap("Remediation")
        private String remediation;

        @com.aliyun.core.annotation.NameInMap("ScopeReport")
        private java.util.Map<String, ?> scopeReport;

        @com.aliyun.core.annotation.NameInMap("SecretFingerprint")
        private String secretFingerprint;

        @com.aliyun.core.annotation.NameInMap("SecretUpdatedAt")
        private String secretUpdatedAt;

        @com.aliyun.core.annotation.NameInMap("UpdatedAt")
        private String updatedAt;

        @com.aliyun.core.annotation.NameInMap("VerifiedAt")
        private String verifiedAt;

        private Data(Builder builder) {
            this.authKind = builder.authKind;
            this.authState = builder.authState;
            this.createdAt = builder.createdAt;
            this.displayName = builder.displayName;
            this.id = builder.id;
            this.pluginId = builder.pluginId;
            this.remediation = builder.remediation;
            this.scopeReport = builder.scopeReport;
            this.secretFingerprint = builder.secretFingerprint;
            this.secretUpdatedAt = builder.secretUpdatedAt;
            this.updatedAt = builder.updatedAt;
            this.verifiedAt = builder.verifiedAt;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return authKind
         */
        public String getAuthKind() {
            return this.authKind;
        }

        /**
         * @return authState
         */
        public String getAuthState() {
            return this.authState;
        }

        /**
         * @return createdAt
         */
        public String getCreatedAt() {
            return this.createdAt;
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return pluginId
         */
        public String getPluginId() {
            return this.pluginId;
        }

        /**
         * @return remediation
         */
        public String getRemediation() {
            return this.remediation;
        }

        /**
         * @return scopeReport
         */
        public java.util.Map<String, ?> getScopeReport() {
            return this.scopeReport;
        }

        /**
         * @return secretFingerprint
         */
        public String getSecretFingerprint() {
            return this.secretFingerprint;
        }

        /**
         * @return secretUpdatedAt
         */
        public String getSecretUpdatedAt() {
            return this.secretUpdatedAt;
        }

        /**
         * @return updatedAt
         */
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        /**
         * @return verifiedAt
         */
        public String getVerifiedAt() {
            return this.verifiedAt;
        }

        public static final class Builder {
            private String authKind; 
            private String authState; 
            private String createdAt; 
            private String displayName; 
            private String id; 
            private String pluginId; 
            private String remediation; 
            private java.util.Map<String, ?> scopeReport; 
            private String secretFingerprint; 
            private String secretUpdatedAt; 
            private String updatedAt; 
            private String verifiedAt; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.authKind = model.authKind;
                this.authState = model.authState;
                this.createdAt = model.createdAt;
                this.displayName = model.displayName;
                this.id = model.id;
                this.pluginId = model.pluginId;
                this.remediation = model.remediation;
                this.scopeReport = model.scopeReport;
                this.secretFingerprint = model.secretFingerprint;
                this.secretUpdatedAt = model.secretUpdatedAt;
                this.updatedAt = model.updatedAt;
                this.verifiedAt = model.verifiedAt;
            } 

            /**
             * <p>The authorization method. Valid values: app, pasted-url, static-secret, and none.</p>
             * 
             * <strong>example:</strong>
             * <p>app</p>
             */
            public Builder authKind(String authKind) {
                this.authKind = authKind;
                return this;
            }

            /**
             * <p>The authorization status.</p>
             * 
             * <strong>example:</strong>
             * <p>ready</p>
             */
            public Builder authState(String authState) {
                this.authState = authState;
                return this;
            }

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-09-23T10:00:00+08:00</p>
             */
            public Builder createdAt(String createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * <p>The display name.</p>
             * 
             * <strong>example:</strong>
             * <p>R&amp;D team DingTalk data source</p>
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * <p>The connection ID, which is a system-generated UUID.</p>
             * 
             * <strong>example:</strong>
             * <p>550e8400-e29b-41d4-a716-446655440000</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The plugin ID.</p>
             * 
             * <strong>example:</strong>
             * <p>dingtalk</p>
             */
            public Builder pluginId(String pluginId) {
                this.pluginId = pluginId;
                return this;
            }

            /**
             * <p>The remediation suggestion.</p>
             * 
             * <strong>example:</strong>
             * <p>Re-authorize the data source</p>
             */
            public Builder remediation(String remediation) {
                this.remediation = remediation;
                return this;
            }

            /**
             * <p>The authorization scope report.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder scopeReport(java.util.Map<String, ?> scopeReport) {
                this.scopeReport = scopeReport;
                return this;
            }

            /**
             * <p>The credential fingerprint.</p>
             * 
             * <strong>example:</strong>
             * <p>sha256:4b3b7b2e5f6a1c9d8e0f1234567890abcdef1234567890abcdef1234567890ab</p>
             */
            public Builder secretFingerprint(String secretFingerprint) {
                this.secretFingerprint = secretFingerprint;
                return this;
            }

            /**
             * <p>The credential update time.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-09-23T10:00:00+08:00</p>
             */
            public Builder secretUpdatedAt(String secretUpdatedAt) {
                this.secretUpdatedAt = secretUpdatedAt;
                return this;
            }

            /**
             * <p>The update time.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-09-23T10:00:00+08:00</p>
             */
            public Builder updatedAt(String updatedAt) {
                this.updatedAt = updatedAt;
                return this;
            }

            /**
             * <p>The verification time.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-09-23T10:00:00+08:00</p>
             */
            public Builder verifiedAt(String verifiedAt) {
                this.verifiedAt = verifiedAt;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
