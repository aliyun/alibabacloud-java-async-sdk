// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iacservice20210806.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRamPolicyExportTaskVersionResponseBody} extends {@link TeaModel}
 *
 * <p>GetRamPolicyExportTaskVersionResponseBody</p>
 */
public class GetRamPolicyExportTaskVersionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ramPolicyExportTaskVersion")
    private RamPolicyExportTaskVersion ramPolicyExportTaskVersion;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetRamPolicyExportTaskVersionResponseBody(Builder builder) {
        this.ramPolicyExportTaskVersion = builder.ramPolicyExportTaskVersion;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRamPolicyExportTaskVersionResponseBody create() {
        return builder().build();
    }

    /**
     * @return ramPolicyExportTaskVersion
     */
    public RamPolicyExportTaskVersion getRamPolicyExportTaskVersion() {
        return this.ramPolicyExportTaskVersion;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private RamPolicyExportTaskVersion ramPolicyExportTaskVersion; 
        private String requestId; 

        /**
         * ramPolicyExportTaskVersion.
         */
        public Builder ramPolicyExportTaskVersion(RamPolicyExportTaskVersion ramPolicyExportTaskVersion) {
            this.ramPolicyExportTaskVersion = ramPolicyExportTaskVersion;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetRamPolicyExportTaskVersionResponseBody build() {
            return new GetRamPolicyExportTaskVersionResponseBody(this);
        } 

    } 

    public static class RamPolicyExportTaskVersion extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("authorizationAccountIds")
        private java.util.List < Long > authorizationAccountIds;

        @com.aliyun.core.annotation.NameInMap("authorizationActions")
        private java.util.List < String > authorizationActions;

        @com.aliyun.core.annotation.NameInMap("authorizationRegionIds")
        private java.util.List < String > authorizationRegionIds;

        @com.aliyun.core.annotation.NameInMap("createTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("elapsedTime")
        private Long elapsedTime;

        @com.aliyun.core.annotation.NameInMap("exportVersion")
        private String exportVersion;

        @com.aliyun.core.annotation.NameInMap("failedReason")
        private String failedReason;

        @com.aliyun.core.annotation.NameInMap("missingActions")
        private java.util.List < String > missingActions;

        @com.aliyun.core.annotation.NameInMap("moduleId")
        private String moduleId;

        @com.aliyun.core.annotation.NameInMap("moduleVersion")
        private String moduleVersion;

        @com.aliyun.core.annotation.NameInMap("noSupportResourceTypes")
        private java.util.List < String > noSupportResourceTypes;

        @com.aliyun.core.annotation.NameInMap("policyDocument")
        private String policyDocument;

        @com.aliyun.core.annotation.NameInMap("ramPolicyExportTaskId")
        private String ramPolicyExportTaskId;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("terraformProviderVersion")
        private String terraformProviderVersion;

        @com.aliyun.core.annotation.NameInMap("unauthorizedActions")
        private java.util.List < String > unauthorizedActions;

        @com.aliyun.core.annotation.NameInMap("warnMessage")
        private String warnMessage;

        private RamPolicyExportTaskVersion(Builder builder) {
            this.authorizationAccountIds = builder.authorizationAccountIds;
            this.authorizationActions = builder.authorizationActions;
            this.authorizationRegionIds = builder.authorizationRegionIds;
            this.createTime = builder.createTime;
            this.elapsedTime = builder.elapsedTime;
            this.exportVersion = builder.exportVersion;
            this.failedReason = builder.failedReason;
            this.missingActions = builder.missingActions;
            this.moduleId = builder.moduleId;
            this.moduleVersion = builder.moduleVersion;
            this.noSupportResourceTypes = builder.noSupportResourceTypes;
            this.policyDocument = builder.policyDocument;
            this.ramPolicyExportTaskId = builder.ramPolicyExportTaskId;
            this.status = builder.status;
            this.terraformProviderVersion = builder.terraformProviderVersion;
            this.unauthorizedActions = builder.unauthorizedActions;
            this.warnMessage = builder.warnMessage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RamPolicyExportTaskVersion create() {
            return builder().build();
        }

        /**
         * @return authorizationAccountIds
         */
        public java.util.List < Long > getAuthorizationAccountIds() {
            return this.authorizationAccountIds;
        }

        /**
         * @return authorizationActions
         */
        public java.util.List < String > getAuthorizationActions() {
            return this.authorizationActions;
        }

        /**
         * @return authorizationRegionIds
         */
        public java.util.List < String > getAuthorizationRegionIds() {
            return this.authorizationRegionIds;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return elapsedTime
         */
        public Long getElapsedTime() {
            return this.elapsedTime;
        }

        /**
         * @return exportVersion
         */
        public String getExportVersion() {
            return this.exportVersion;
        }

        /**
         * @return failedReason
         */
        public String getFailedReason() {
            return this.failedReason;
        }

        /**
         * @return missingActions
         */
        public java.util.List < String > getMissingActions() {
            return this.missingActions;
        }

        /**
         * @return moduleId
         */
        public String getModuleId() {
            return this.moduleId;
        }

        /**
         * @return moduleVersion
         */
        public String getModuleVersion() {
            return this.moduleVersion;
        }

        /**
         * @return noSupportResourceTypes
         */
        public java.util.List < String > getNoSupportResourceTypes() {
            return this.noSupportResourceTypes;
        }

        /**
         * @return policyDocument
         */
        public String getPolicyDocument() {
            return this.policyDocument;
        }

        /**
         * @return ramPolicyExportTaskId
         */
        public String getRamPolicyExportTaskId() {
            return this.ramPolicyExportTaskId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return terraformProviderVersion
         */
        public String getTerraformProviderVersion() {
            return this.terraformProviderVersion;
        }

        /**
         * @return unauthorizedActions
         */
        public java.util.List < String > getUnauthorizedActions() {
            return this.unauthorizedActions;
        }

        /**
         * @return warnMessage
         */
        public String getWarnMessage() {
            return this.warnMessage;
        }

        public static final class Builder {
            private java.util.List < Long > authorizationAccountIds; 
            private java.util.List < String > authorizationActions; 
            private java.util.List < String > authorizationRegionIds; 
            private String createTime; 
            private Long elapsedTime; 
            private String exportVersion; 
            private String failedReason; 
            private java.util.List < String > missingActions; 
            private String moduleId; 
            private String moduleVersion; 
            private java.util.List < String > noSupportResourceTypes; 
            private String policyDocument; 
            private String ramPolicyExportTaskId; 
            private String status; 
            private String terraformProviderVersion; 
            private java.util.List < String > unauthorizedActions; 
            private String warnMessage; 

            /**
             * authorizationAccountIds.
             */
            public Builder authorizationAccountIds(java.util.List < Long > authorizationAccountIds) {
                this.authorizationAccountIds = authorizationAccountIds;
                return this;
            }

            /**
             * authorizationActions.
             */
            public Builder authorizationActions(java.util.List < String > authorizationActions) {
                this.authorizationActions = authorizationActions;
                return this;
            }

            /**
             * authorizationRegionIds.
             */
            public Builder authorizationRegionIds(java.util.List < String > authorizationRegionIds) {
                this.authorizationRegionIds = authorizationRegionIds;
                return this;
            }

            /**
             * createTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * elapsedTime.
             */
            public Builder elapsedTime(Long elapsedTime) {
                this.elapsedTime = elapsedTime;
                return this;
            }

            /**
             * exportVersion.
             */
            public Builder exportVersion(String exportVersion) {
                this.exportVersion = exportVersion;
                return this;
            }

            /**
             * failedReason.
             */
            public Builder failedReason(String failedReason) {
                this.failedReason = failedReason;
                return this;
            }

            /**
             * missingActions.
             */
            public Builder missingActions(java.util.List < String > missingActions) {
                this.missingActions = missingActions;
                return this;
            }

            /**
             * moduleId.
             */
            public Builder moduleId(String moduleId) {
                this.moduleId = moduleId;
                return this;
            }

            /**
             * moduleVersion.
             */
            public Builder moduleVersion(String moduleVersion) {
                this.moduleVersion = moduleVersion;
                return this;
            }

            /**
             * noSupportResourceTypes.
             */
            public Builder noSupportResourceTypes(java.util.List < String > noSupportResourceTypes) {
                this.noSupportResourceTypes = noSupportResourceTypes;
                return this;
            }

            /**
             * policyDocument.
             */
            public Builder policyDocument(String policyDocument) {
                this.policyDocument = policyDocument;
                return this;
            }

            /**
             * ramPolicyExportTaskId.
             */
            public Builder ramPolicyExportTaskId(String ramPolicyExportTaskId) {
                this.ramPolicyExportTaskId = ramPolicyExportTaskId;
                return this;
            }

            /**
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * terraformProviderVersion.
             */
            public Builder terraformProviderVersion(String terraformProviderVersion) {
                this.terraformProviderVersion = terraformProviderVersion;
                return this;
            }

            /**
             * unauthorizedActions.
             */
            public Builder unauthorizedActions(java.util.List < String > unauthorizedActions) {
                this.unauthorizedActions = unauthorizedActions;
                return this;
            }

            /**
             * warnMessage.
             */
            public Builder warnMessage(String warnMessage) {
                this.warnMessage = warnMessage;
                return this;
            }

            public RamPolicyExportTaskVersion build() {
                return new RamPolicyExportTaskVersion(this);
            } 

        } 

    }
}
