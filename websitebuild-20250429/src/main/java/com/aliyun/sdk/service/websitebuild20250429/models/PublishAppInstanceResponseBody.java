// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.websitebuild20250429.models;

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
 * {@link PublishAppInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>PublishAppInstanceResponseBody</p>
 */
public class PublishAppInstanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("AllowRetry")
    private Boolean allowRetry;

    @com.aliyun.core.annotation.NameInMap("AppName")
    private String appName;

    @com.aliyun.core.annotation.NameInMap("DynamicCode")
    private String dynamicCode;

    @com.aliyun.core.annotation.NameInMap("DynamicMessage")
    private String dynamicMessage;

    @com.aliyun.core.annotation.NameInMap("ErrorArgs")
    private java.util.List<?> errorArgs;

    @com.aliyun.core.annotation.NameInMap("Module")
    private Module module;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RootErrorCode")
    private String rootErrorCode;

    @com.aliyun.core.annotation.NameInMap("RootErrorMsg")
    private String rootErrorMsg;

    @com.aliyun.core.annotation.NameInMap("Synchro")
    private Boolean synchro;

    private PublishAppInstanceResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.allowRetry = builder.allowRetry;
        this.appName = builder.appName;
        this.dynamicCode = builder.dynamicCode;
        this.dynamicMessage = builder.dynamicMessage;
        this.errorArgs = builder.errorArgs;
        this.module = builder.module;
        this.requestId = builder.requestId;
        this.rootErrorCode = builder.rootErrorCode;
        this.rootErrorMsg = builder.rootErrorMsg;
        this.synchro = builder.synchro;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PublishAppInstanceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    /**
     * @return allowRetry
     */
    public Boolean getAllowRetry() {
        return this.allowRetry;
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return dynamicCode
     */
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    /**
     * @return dynamicMessage
     */
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    /**
     * @return errorArgs
     */
    public java.util.List<?> getErrorArgs() {
        return this.errorArgs;
    }

    /**
     * @return module
     */
    public Module getModule() {
        return this.module;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return rootErrorCode
     */
    public String getRootErrorCode() {
        return this.rootErrorCode;
    }

    /**
     * @return rootErrorMsg
     */
    public String getRootErrorMsg() {
        return this.rootErrorMsg;
    }

    /**
     * @return synchro
     */
    public Boolean getSynchro() {
        return this.synchro;
    }

    public static final class Builder {
        private String accessDeniedDetail; 
        private Boolean allowRetry; 
        private String appName; 
        private String dynamicCode; 
        private String dynamicMessage; 
        private java.util.List<?> errorArgs; 
        private Module module; 
        private String requestId; 
        private String rootErrorCode; 
        private String rootErrorMsg; 
        private Boolean synchro; 

        private Builder() {
        } 

        private Builder(PublishAppInstanceResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.allowRetry = model.allowRetry;
            this.appName = model.appName;
            this.dynamicCode = model.dynamicCode;
            this.dynamicMessage = model.dynamicMessage;
            this.errorArgs = model.errorArgs;
            this.module = model.module;
            this.requestId = model.requestId;
            this.rootErrorCode = model.rootErrorCode;
            this.rootErrorMsg = model.rootErrorMsg;
            this.synchro = model.synchro;
        } 

        /**
         * <p>The access denial information.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * <p>Specifies whether retries are allowed.</p>
         * 
         * <strong>example:</strong>
         * <p>False</p>
         */
        public Builder allowRetry(Boolean allowRetry) {
            this.allowRetry = allowRetry;
            return this;
        }

        /**
         * <p>The app name.</p>
         * 
         * <strong>example:</strong>
         * <p>dewuApp</p>
         */
        public Builder appName(String appName) {
            this.appName = appName;
            return this;
        }

        /**
         * <p>The dynamic error code.</p>
         * 
         * <strong>example:</strong>
         * <p>ERROR-oo1</p>
         */
        public Builder dynamicCode(String dynamicCode) {
            this.dynamicCode = dynamicCode;
            return this;
        }

        /**
         * <p>The dynamic message. This parameter is currently unused and can be ignored.</p>
         * 
         * <strong>example:</strong>
         * <p>SYSTEM_ERROR</p>
         */
        public Builder dynamicMessage(String dynamicMessage) {
            this.dynamicMessage = dynamicMessage;
            return this;
        }

        /**
         * <p>The returned error parameters.</p>
         */
        public Builder errorArgs(java.util.List<?> errorArgs) {
            this.errorArgs = errorArgs;
            return this;
        }

        /**
         * <p>The response data.</p>
         */
        public Builder module(Module module) {
            this.module = module;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>6C6B99AC-39EC-5350-874C-204128C905E6</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>SYSTEM.ERROR</p>
         */
        public Builder rootErrorCode(String rootErrorCode) {
            this.rootErrorCode = rootErrorCode;
            return this;
        }

        /**
         * <p>The exception message.</p>
         * 
         * <strong>example:</strong>
         * <p>System exception</p>
         */
        public Builder rootErrorMsg(String rootErrorMsg) {
            this.rootErrorMsg = rootErrorMsg;
            return this;
        }

        /**
         * <p>The reserved parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder synchro(Boolean synchro) {
            this.synchro = synchro;
            return this;
        }

        public PublishAppInstanceResponseBody build() {
            return new PublishAppInstanceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link PublishAppInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>PublishAppInstanceResponseBody</p>
     */
    public static class Module extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ArtifactDigest")
        private String artifactDigest;

        @com.aliyun.core.annotation.NameInMap("AuditId")
        private String auditId;

        @com.aliyun.core.annotation.NameInMap("CandidateId")
        private String candidateId;

        @com.aliyun.core.annotation.NameInMap("CandidateStatus")
        private String candidateStatus;

        @com.aliyun.core.annotation.NameInMap("CommitHash")
        private String commitHash;

        @com.aliyun.core.annotation.NameInMap("PlatformAppid")
        private String platformAppid;

        @com.aliyun.core.annotation.NameInMap("PluginDeclarationHash")
        private String pluginDeclarationHash;

        @com.aliyun.core.annotation.NameInMap("PluginState")
        private String pluginState;

        @com.aliyun.core.annotation.NameInMap("PrivacyDraftId")
        private String privacyDraftId;

        @com.aliyun.core.annotation.NameInMap("PrivacyRevision")
        private String privacyRevision;

        @com.aliyun.core.annotation.NameInMap("PublishEnv")
        private String publishEnv;

        @com.aliyun.core.annotation.NameInMap("PublishNumber")
        private String publishNumber;

        @com.aliyun.core.annotation.NameInMap("PublishOrderId")
        private Long publishOrderId;

        @com.aliyun.core.annotation.NameInMap("ReadbackStatus")
        private String readbackStatus;

        @com.aliyun.core.annotation.NameInMap("SubmitIntentStatus")
        private String submitIntentStatus;

        @com.aliyun.core.annotation.NameInMap("UpdatedAt")
        private Long updatedAt;

        @com.aliyun.core.annotation.NameInMap("UploadSequence")
        private Long uploadSequence;

        private Module(Builder builder) {
            this.artifactDigest = builder.artifactDigest;
            this.auditId = builder.auditId;
            this.candidateId = builder.candidateId;
            this.candidateStatus = builder.candidateStatus;
            this.commitHash = builder.commitHash;
            this.platformAppid = builder.platformAppid;
            this.pluginDeclarationHash = builder.pluginDeclarationHash;
            this.pluginState = builder.pluginState;
            this.privacyDraftId = builder.privacyDraftId;
            this.privacyRevision = builder.privacyRevision;
            this.publishEnv = builder.publishEnv;
            this.publishNumber = builder.publishNumber;
            this.publishOrderId = builder.publishOrderId;
            this.readbackStatus = builder.readbackStatus;
            this.submitIntentStatus = builder.submitIntentStatus;
            this.updatedAt = builder.updatedAt;
            this.uploadSequence = builder.uploadSequence;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return artifactDigest
         */
        public String getArtifactDigest() {
            return this.artifactDigest;
        }

        /**
         * @return auditId
         */
        public String getAuditId() {
            return this.auditId;
        }

        /**
         * @return candidateId
         */
        public String getCandidateId() {
            return this.candidateId;
        }

        /**
         * @return candidateStatus
         */
        public String getCandidateStatus() {
            return this.candidateStatus;
        }

        /**
         * @return commitHash
         */
        public String getCommitHash() {
            return this.commitHash;
        }

        /**
         * @return platformAppid
         */
        public String getPlatformAppid() {
            return this.platformAppid;
        }

        /**
         * @return pluginDeclarationHash
         */
        public String getPluginDeclarationHash() {
            return this.pluginDeclarationHash;
        }

        /**
         * @return pluginState
         */
        public String getPluginState() {
            return this.pluginState;
        }

        /**
         * @return privacyDraftId
         */
        public String getPrivacyDraftId() {
            return this.privacyDraftId;
        }

        /**
         * @return privacyRevision
         */
        public String getPrivacyRevision() {
            return this.privacyRevision;
        }

        /**
         * @return publishEnv
         */
        public String getPublishEnv() {
            return this.publishEnv;
        }

        /**
         * @return publishNumber
         */
        public String getPublishNumber() {
            return this.publishNumber;
        }

        /**
         * @return publishOrderId
         */
        public Long getPublishOrderId() {
            return this.publishOrderId;
        }

        /**
         * @return readbackStatus
         */
        public String getReadbackStatus() {
            return this.readbackStatus;
        }

        /**
         * @return submitIntentStatus
         */
        public String getSubmitIntentStatus() {
            return this.submitIntentStatus;
        }

        /**
         * @return updatedAt
         */
        public Long getUpdatedAt() {
            return this.updatedAt;
        }

        /**
         * @return uploadSequence
         */
        public Long getUploadSequence() {
            return this.uploadSequence;
        }

        public static final class Builder {
            private String artifactDigest; 
            private String auditId; 
            private String candidateId; 
            private String candidateStatus; 
            private String commitHash; 
            private String platformAppid; 
            private String pluginDeclarationHash; 
            private String pluginState; 
            private String privacyDraftId; 
            private String privacyRevision; 
            private String publishEnv; 
            private String publishNumber; 
            private Long publishOrderId; 
            private String readbackStatus; 
            private String submitIntentStatus; 
            private Long updatedAt; 
            private Long uploadSequence; 

            private Builder() {
            } 

            private Builder(Module model) {
                this.artifactDigest = model.artifactDigest;
                this.auditId = model.auditId;
                this.candidateId = model.candidateId;
                this.candidateStatus = model.candidateStatus;
                this.commitHash = model.commitHash;
                this.platformAppid = model.platformAppid;
                this.pluginDeclarationHash = model.pluginDeclarationHash;
                this.pluginState = model.pluginState;
                this.privacyDraftId = model.privacyDraftId;
                this.privacyRevision = model.privacyRevision;
                this.publishEnv = model.publishEnv;
                this.publishNumber = model.publishNumber;
                this.publishOrderId = model.publishOrderId;
                this.readbackStatus = model.readbackStatus;
                this.submitIntentStatus = model.submitIntentStatus;
                this.updatedAt = model.updatedAt;
                this.uploadSequence = model.uploadSequence;
            } 

            /**
             * ArtifactDigest.
             */
            public Builder artifactDigest(String artifactDigest) {
                this.artifactDigest = artifactDigest;
                return this;
            }

            /**
             * AuditId.
             */
            public Builder auditId(String auditId) {
                this.auditId = auditId;
                return this;
            }

            /**
             * CandidateId.
             */
            public Builder candidateId(String candidateId) {
                this.candidateId = candidateId;
                return this;
            }

            /**
             * CandidateStatus.
             */
            public Builder candidateStatus(String candidateStatus) {
                this.candidateStatus = candidateStatus;
                return this;
            }

            /**
             * CommitHash.
             */
            public Builder commitHash(String commitHash) {
                this.commitHash = commitHash;
                return this;
            }

            /**
             * PlatformAppid.
             */
            public Builder platformAppid(String platformAppid) {
                this.platformAppid = platformAppid;
                return this;
            }

            /**
             * PluginDeclarationHash.
             */
            public Builder pluginDeclarationHash(String pluginDeclarationHash) {
                this.pluginDeclarationHash = pluginDeclarationHash;
                return this;
            }

            /**
             * PluginState.
             */
            public Builder pluginState(String pluginState) {
                this.pluginState = pluginState;
                return this;
            }

            /**
             * PrivacyDraftId.
             */
            public Builder privacyDraftId(String privacyDraftId) {
                this.privacyDraftId = privacyDraftId;
                return this;
            }

            /**
             * PrivacyRevision.
             */
            public Builder privacyRevision(String privacyRevision) {
                this.privacyRevision = privacyRevision;
                return this;
            }

            /**
             * PublishEnv.
             */
            public Builder publishEnv(String publishEnv) {
                this.publishEnv = publishEnv;
                return this;
            }

            /**
             * PublishNumber.
             */
            public Builder publishNumber(String publishNumber) {
                this.publishNumber = publishNumber;
                return this;
            }

            /**
             * <p>The publish order ID.</p>
             * 
             * <strong>example:</strong>
             * <p>231</p>
             */
            public Builder publishOrderId(Long publishOrderId) {
                this.publishOrderId = publishOrderId;
                return this;
            }

            /**
             * ReadbackStatus.
             */
            public Builder readbackStatus(String readbackStatus) {
                this.readbackStatus = readbackStatus;
                return this;
            }

            /**
             * SubmitIntentStatus.
             */
            public Builder submitIntentStatus(String submitIntentStatus) {
                this.submitIntentStatus = submitIntentStatus;
                return this;
            }

            /**
             * UpdatedAt.
             */
            public Builder updatedAt(Long updatedAt) {
                this.updatedAt = updatedAt;
                return this;
            }

            /**
             * UploadSequence.
             */
            public Builder uploadSequence(Long uploadSequence) {
                this.uploadSequence = uploadSequence;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
