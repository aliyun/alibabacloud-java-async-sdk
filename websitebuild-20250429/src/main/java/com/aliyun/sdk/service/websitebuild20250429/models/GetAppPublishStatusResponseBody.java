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
 * {@link GetAppPublishStatusResponseBody} extends {@link TeaModel}
 *
 * <p>GetAppPublishStatusResponseBody</p>
 */
public class GetAppPublishStatusResponseBody extends TeaModel {
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

    private GetAppPublishStatusResponseBody(Builder builder) {
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

    public static GetAppPublishStatusResponseBody create() {
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

        private Builder(GetAppPublishStatusResponseBody model) {
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
         * <p>The details of the access denial.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * <p>Indicates whether retries are allowed.</p>
         * 
         * <strong>example:</strong>
         * <p>False</p>
         */
        public Builder allowRetry(Boolean allowRetry) {
            this.allowRetry = allowRetry;
            return this;
        }

        /**
         * <p>The application name.</p>
         * 
         * <strong>example:</strong>
         * <p>or</p>
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
         * <p>The dynamic message.</p>
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

        public GetAppPublishStatusResponseBody build() {
            return new GetAppPublishStatusResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAppPublishStatusResponseBody} extends {@link TeaModel}
     *
     * <p>GetAppPublishStatusResponseBody</p>
     */
    public static class Module extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ArtifactDigest")
        private String artifactDigest;

        @com.aliyun.core.annotation.NameInMap("AuditId")
        private String auditId;

        @com.aliyun.core.annotation.NameInMap("BindingId")
        private String bindingId;

        @com.aliyun.core.annotation.NameInMap("CanQuickRevert")
        private String canQuickRevert;

        @com.aliyun.core.annotation.NameInMap("CandidateId")
        private String candidateId;

        @com.aliyun.core.annotation.NameInMap("CandidateStatus")
        private String candidateStatus;

        @com.aliyun.core.annotation.NameInMap("CommitHash")
        private String commitHash;

        @com.aliyun.core.annotation.NameInMap("CurrentStep")
        private String currentStep;

        @com.aliyun.core.annotation.NameInMap("CurrentStepCode")
        private String currentStepCode;

        @com.aliyun.core.annotation.NameInMap("DeployChannel")
        private String deployChannel;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("ErrorStep")
        private String errorStep;

        @com.aliyun.core.annotation.NameInMap("ErrorStepCode")
        private String errorStepCode;

        @com.aliyun.core.annotation.NameInMap("IsFinish")
        private Boolean isFinish;

        @com.aliyun.core.annotation.NameInMap("IsSuccess")
        private Boolean isSuccess;

        @com.aliyun.core.annotation.NameInMap("Msg")
        private String msg;

        @com.aliyun.core.annotation.NameInMap("OrderType")
        private String orderType;

        @com.aliyun.core.annotation.NameInMap("OrderTypeCode")
        private String orderTypeCode;

        @com.aliyun.core.annotation.NameInMap("Percent")
        private Integer percent;

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

        @com.aliyun.core.annotation.NameInMap("PublishDiagnostics")
        private String publishDiagnostics;

        @com.aliyun.core.annotation.NameInMap("PublishEnv")
        private String publishEnv;

        @com.aliyun.core.annotation.NameInMap("PublishNumber")
        private String publishNumber;

        @com.aliyun.core.annotation.NameInMap("PublishOrderId")
        private Long publishOrderId;

        @com.aliyun.core.annotation.NameInMap("PublishTime")
        private String publishTime;

        @com.aliyun.core.annotation.NameInMap("ReadbackStatus")
        private String readbackStatus;

        @com.aliyun.core.annotation.NameInMap("SiteId")
        private String siteId;

        @com.aliyun.core.annotation.NameInMap("StepCodes")
        private java.util.List<String> stepCodes;

        @com.aliyun.core.annotation.NameInMap("Steps")
        private java.util.List<String> steps;

        @com.aliyun.core.annotation.NameInMap("Subchannel")
        private String subchannel;

        @com.aliyun.core.annotation.NameInMap("SubmitIntentStatus")
        private String submitIntentStatus;

        @com.aliyun.core.annotation.NameInMap("UpdatedAt")
        private Long updatedAt;

        @com.aliyun.core.annotation.NameInMap("UploadAttemptId")
        private String uploadAttemptId;

        @com.aliyun.core.annotation.NameInMap("UploadLeaseState")
        private String uploadLeaseState;

        @com.aliyun.core.annotation.NameInMap("UploadSequence")
        private Long uploadSequence;

        @com.aliyun.core.annotation.NameInMap("UploadTicketState")
        private String uploadTicketState;

        private Module(Builder builder) {
            this.artifactDigest = builder.artifactDigest;
            this.auditId = builder.auditId;
            this.bindingId = builder.bindingId;
            this.canQuickRevert = builder.canQuickRevert;
            this.candidateId = builder.candidateId;
            this.candidateStatus = builder.candidateStatus;
            this.commitHash = builder.commitHash;
            this.currentStep = builder.currentStep;
            this.currentStepCode = builder.currentStepCode;
            this.deployChannel = builder.deployChannel;
            this.description = builder.description;
            this.errorStep = builder.errorStep;
            this.errorStepCode = builder.errorStepCode;
            this.isFinish = builder.isFinish;
            this.isSuccess = builder.isSuccess;
            this.msg = builder.msg;
            this.orderType = builder.orderType;
            this.orderTypeCode = builder.orderTypeCode;
            this.percent = builder.percent;
            this.platformAppid = builder.platformAppid;
            this.pluginDeclarationHash = builder.pluginDeclarationHash;
            this.pluginState = builder.pluginState;
            this.privacyDraftId = builder.privacyDraftId;
            this.privacyRevision = builder.privacyRevision;
            this.publishDiagnostics = builder.publishDiagnostics;
            this.publishEnv = builder.publishEnv;
            this.publishNumber = builder.publishNumber;
            this.publishOrderId = builder.publishOrderId;
            this.publishTime = builder.publishTime;
            this.readbackStatus = builder.readbackStatus;
            this.siteId = builder.siteId;
            this.stepCodes = builder.stepCodes;
            this.steps = builder.steps;
            this.subchannel = builder.subchannel;
            this.submitIntentStatus = builder.submitIntentStatus;
            this.updatedAt = builder.updatedAt;
            this.uploadAttemptId = builder.uploadAttemptId;
            this.uploadLeaseState = builder.uploadLeaseState;
            this.uploadSequence = builder.uploadSequence;
            this.uploadTicketState = builder.uploadTicketState;
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
         * @return bindingId
         */
        public String getBindingId() {
            return this.bindingId;
        }

        /**
         * @return canQuickRevert
         */
        public String getCanQuickRevert() {
            return this.canQuickRevert;
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
         * @return currentStep
         */
        public String getCurrentStep() {
            return this.currentStep;
        }

        /**
         * @return currentStepCode
         */
        public String getCurrentStepCode() {
            return this.currentStepCode;
        }

        /**
         * @return deployChannel
         */
        public String getDeployChannel() {
            return this.deployChannel;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return errorStep
         */
        public String getErrorStep() {
            return this.errorStep;
        }

        /**
         * @return errorStepCode
         */
        public String getErrorStepCode() {
            return this.errorStepCode;
        }

        /**
         * @return isFinish
         */
        public Boolean getIsFinish() {
            return this.isFinish;
        }

        /**
         * @return isSuccess
         */
        public Boolean getIsSuccess() {
            return this.isSuccess;
        }

        /**
         * @return msg
         */
        public String getMsg() {
            return this.msg;
        }

        /**
         * @return orderType
         */
        public String getOrderType() {
            return this.orderType;
        }

        /**
         * @return orderTypeCode
         */
        public String getOrderTypeCode() {
            return this.orderTypeCode;
        }

        /**
         * @return percent
         */
        public Integer getPercent() {
            return this.percent;
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
         * @return publishDiagnostics
         */
        public String getPublishDiagnostics() {
            return this.publishDiagnostics;
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
         * @return publishTime
         */
        public String getPublishTime() {
            return this.publishTime;
        }

        /**
         * @return readbackStatus
         */
        public String getReadbackStatus() {
            return this.readbackStatus;
        }

        /**
         * @return siteId
         */
        public String getSiteId() {
            return this.siteId;
        }

        /**
         * @return stepCodes
         */
        public java.util.List<String> getStepCodes() {
            return this.stepCodes;
        }

        /**
         * @return steps
         */
        public java.util.List<String> getSteps() {
            return this.steps;
        }

        /**
         * @return subchannel
         */
        public String getSubchannel() {
            return this.subchannel;
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
         * @return uploadAttemptId
         */
        public String getUploadAttemptId() {
            return this.uploadAttemptId;
        }

        /**
         * @return uploadLeaseState
         */
        public String getUploadLeaseState() {
            return this.uploadLeaseState;
        }

        /**
         * @return uploadSequence
         */
        public Long getUploadSequence() {
            return this.uploadSequence;
        }

        /**
         * @return uploadTicketState
         */
        public String getUploadTicketState() {
            return this.uploadTicketState;
        }

        public static final class Builder {
            private String artifactDigest; 
            private String auditId; 
            private String bindingId; 
            private String canQuickRevert; 
            private String candidateId; 
            private String candidateStatus; 
            private String commitHash; 
            private String currentStep; 
            private String currentStepCode; 
            private String deployChannel; 
            private String description; 
            private String errorStep; 
            private String errorStepCode; 
            private Boolean isFinish; 
            private Boolean isSuccess; 
            private String msg; 
            private String orderType; 
            private String orderTypeCode; 
            private Integer percent; 
            private String platformAppid; 
            private String pluginDeclarationHash; 
            private String pluginState; 
            private String privacyDraftId; 
            private String privacyRevision; 
            private String publishDiagnostics; 
            private String publishEnv; 
            private String publishNumber; 
            private Long publishOrderId; 
            private String publishTime; 
            private String readbackStatus; 
            private String siteId; 
            private java.util.List<String> stepCodes; 
            private java.util.List<String> steps; 
            private String subchannel; 
            private String submitIntentStatus; 
            private Long updatedAt; 
            private String uploadAttemptId; 
            private String uploadLeaseState; 
            private Long uploadSequence; 
            private String uploadTicketState; 

            private Builder() {
            } 

            private Builder(Module model) {
                this.artifactDigest = model.artifactDigest;
                this.auditId = model.auditId;
                this.bindingId = model.bindingId;
                this.canQuickRevert = model.canQuickRevert;
                this.candidateId = model.candidateId;
                this.candidateStatus = model.candidateStatus;
                this.commitHash = model.commitHash;
                this.currentStep = model.currentStep;
                this.currentStepCode = model.currentStepCode;
                this.deployChannel = model.deployChannel;
                this.description = model.description;
                this.errorStep = model.errorStep;
                this.errorStepCode = model.errorStepCode;
                this.isFinish = model.isFinish;
                this.isSuccess = model.isSuccess;
                this.msg = model.msg;
                this.orderType = model.orderType;
                this.orderTypeCode = model.orderTypeCode;
                this.percent = model.percent;
                this.platformAppid = model.platformAppid;
                this.pluginDeclarationHash = model.pluginDeclarationHash;
                this.pluginState = model.pluginState;
                this.privacyDraftId = model.privacyDraftId;
                this.privacyRevision = model.privacyRevision;
                this.publishDiagnostics = model.publishDiagnostics;
                this.publishEnv = model.publishEnv;
                this.publishNumber = model.publishNumber;
                this.publishOrderId = model.publishOrderId;
                this.publishTime = model.publishTime;
                this.readbackStatus = model.readbackStatus;
                this.siteId = model.siteId;
                this.stepCodes = model.stepCodes;
                this.steps = model.steps;
                this.subchannel = model.subchannel;
                this.submitIntentStatus = model.submitIntentStatus;
                this.updatedAt = model.updatedAt;
                this.uploadAttemptId = model.uploadAttemptId;
                this.uploadLeaseState = model.uploadLeaseState;
                this.uploadSequence = model.uploadSequence;
                this.uploadTicketState = model.uploadTicketState;
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
             * BindingId.
             */
            public Builder bindingId(String bindingId) {
                this.bindingId = bindingId;
                return this;
            }

            /**
             * <p>Indicates whether quick rollback is supported.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder canQuickRevert(String canQuickRevert) {
                this.canQuickRevert = canQuickRevert;
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
             * <p>The current step number of the task.</p>
             * 
             * <strong>example:</strong>
             * <p>PRE_CHECK</p>
             */
            public Builder currentStep(String currentStep) {
                this.currentStep = currentStep;
                return this;
            }

            /**
             * <p>The code of the current publish step.</p>
             * 
             * <strong>example:</strong>
             * <p>INIT</p>
             */
            public Builder currentStepCode(String currentStepCode) {
                this.currentStepCode = currentStepCode;
                return this;
            }

            /**
             * <p>The deployment channel.</p>
             * 
             * <strong>example:</strong>
             * <p>PC,WEAPP</p>
             */
            public Builder deployChannel(String deployChannel) {
                this.deployChannel = deployChannel;
                return this;
            }

            /**
             * <p>The application description.</p>
             * 
             * <strong>example:</strong>
             * <p>/bak-&gt;serverless.handler(2020091300200279)</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The publish process.</p>
             * 
             * <strong>example:</strong>
             * <p>abc</p>
             */
            public Builder errorStep(String errorStep) {
                this.errorStep = errorStep;
                return this;
            }

            /**
             * <p>The code of the publish step where the error occurred.</p>
             * 
             * <strong>example:</strong>
             * <p>BUILDING</p>
             */
            public Builder errorStepCode(String errorStepCode) {
                this.errorStepCode = errorStepCode;
                return this;
            }

            /**
             * <p>Indicates whether the task is completed.</p>
             */
            public Builder isFinish(Boolean isFinish) {
                this.isFinish = isFinish;
                return this;
            }

            /**
             * <p>Indicates whether the call is successful. Valid values:</p>
             * <ul>
             * <li><p><code>true</code>: The call is successful.</p>
             * </li>
             * <li><p><code>false</code>: The call fails.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>True</p>
             */
            public Builder isSuccess(Boolean isSuccess) {
                this.isSuccess = isSuccess;
                return this;
            }

            /**
             * <p>The additional information.</p>
             * 
             * <strong>example:</strong>
             * <p>common notify successfully.</p>
             */
            public Builder msg(String msg) {
                this.msg = msg;
                return this;
            }

            /**
             * <p>The sort order. Valid values: ASC and DESC.</p>
             * 
             * <strong>example:</strong>
             * <p>DESC</p>
             */
            public Builder orderType(String orderType) {
                this.orderType = orderType;
                return this;
            }

            /**
             * <p>The code of the publish order type.</p>
             * 
             * <strong>example:</strong>
             * <p>DEPLOY</p>
             */
            public Builder orderTypeCode(String orderTypeCode) {
                this.orderTypeCode = orderTypeCode;
                return this;
            }

            /**
             * <p>The completion percentage of the task.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder percent(Integer percent) {
                this.percent = percent;
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
             * PublishDiagnostics.
             */
            public Builder publishDiagnostics(String publishDiagnostics) {
                this.publishDiagnostics = publishDiagnostics;
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
             * <p>The publish number.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder publishNumber(String publishNumber) {
                this.publishNumber = publishNumber;
                return this;
            }

            /**
             * <p>The publish order ID.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder publishOrderId(Long publishOrderId) {
                this.publishOrderId = publishOrderId;
                return this;
            }

            /**
             * <p>The scheduled publish time in UTC format yyyy-MM-dd&quot;T&quot;HH:mm:ss.SSS&quot;Z&quot;.</p>
             * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ss.SSSZ</p>
             * 
             * <strong>example:</strong>
             * <p>123123</p>
             */
            public Builder publishTime(String publishTime) {
                this.publishTime = publishTime;
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
             * <p>The site ID.</p>
             * 
             * <strong>example:</strong>
             * <p>865181640657408</p>
             */
            public Builder siteId(String siteId) {
                this.siteId = siteId;
                return this;
            }

            /**
             * <p>The list of publish step codes.</p>
             */
            public Builder stepCodes(java.util.List<String> stepCodes) {
                this.stepCodes = stepCodes;
                return this;
            }

            /**
             * <p>The error level. Valid values: FATAL, ERROR, WARNING, and CRITICAL.</p>
             */
            public Builder steps(java.util.List<String> steps) {
                this.steps = steps;
                return this;
            }

            /**
             * <p>The publish subchannel.</p>
             * 
             * <strong>example:</strong>
             * <p>wx0123456789abcdef</p>
             */
            public Builder subchannel(String subchannel) {
                this.subchannel = subchannel;
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
             * UploadAttemptId.
             */
            public Builder uploadAttemptId(String uploadAttemptId) {
                this.uploadAttemptId = uploadAttemptId;
                return this;
            }

            /**
             * UploadLeaseState.
             */
            public Builder uploadLeaseState(String uploadLeaseState) {
                this.uploadLeaseState = uploadLeaseState;
                return this;
            }

            /**
             * UploadSequence.
             */
            public Builder uploadSequence(Long uploadSequence) {
                this.uploadSequence = uploadSequence;
                return this;
            }

            /**
             * UploadTicketState.
             */
            public Builder uploadTicketState(String uploadTicketState) {
                this.uploadTicketState = uploadTicketState;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
