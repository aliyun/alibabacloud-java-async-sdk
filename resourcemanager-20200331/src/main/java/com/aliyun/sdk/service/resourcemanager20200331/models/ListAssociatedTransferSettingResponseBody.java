// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAssociatedTransferSettingResponseBody} extends {@link TeaModel}
 *
 * <p>ListAssociatedTransferSettingResponseBody</p>
 */
public class ListAssociatedTransferSettingResponseBody extends TeaModel {
    @NameInMap("AssociatedTransferSetting")
    private AssociatedTransferSetting associatedTransferSetting;

    @NameInMap("RequestId")
    private String requestId;

    private ListAssociatedTransferSettingResponseBody(Builder builder) {
        this.associatedTransferSetting = builder.associatedTransferSetting;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAssociatedTransferSettingResponseBody create() {
        return builder().build();
    }

    /**
     * @return associatedTransferSetting
     */
    public AssociatedTransferSetting getAssociatedTransferSetting() {
        return this.associatedTransferSetting;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private AssociatedTransferSetting associatedTransferSetting; 
        private String requestId; 

        /**
         * The settings of the Transfer Associated Resources feature.
         */
        public Builder associatedTransferSetting(AssociatedTransferSetting associatedTransferSetting) {
            this.associatedTransferSetting = associatedTransferSetting;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListAssociatedTransferSettingResponseBody build() {
            return new ListAssociatedTransferSettingResponseBody(this);
        } 

    } 

    public static class RuleSettings extends TeaModel {
        @NameInMap("AssociatedResourceType")
        private String associatedResourceType;

        @NameInMap("AssociatedService")
        private String associatedService;

        @NameInMap("MasterResourceType")
        private String masterResourceType;

        @NameInMap("MasterService")
        private String masterService;

        @NameInMap("Status")
        private String status;

        private RuleSettings(Builder builder) {
            this.associatedResourceType = builder.associatedResourceType;
            this.associatedService = builder.associatedService;
            this.masterResourceType = builder.masterResourceType;
            this.masterService = builder.masterService;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RuleSettings create() {
            return builder().build();
        }

        /**
         * @return associatedResourceType
         */
        public String getAssociatedResourceType() {
            return this.associatedResourceType;
        }

        /**
         * @return associatedService
         */
        public String getAssociatedService() {
            return this.associatedService;
        }

        /**
         * @return masterResourceType
         */
        public String getMasterResourceType() {
            return this.masterResourceType;
        }

        /**
         * @return masterService
         */
        public String getMasterService() {
            return this.masterService;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String associatedResourceType; 
            private String associatedService; 
            private String masterResourceType; 
            private String masterService; 
            private String status; 

            /**
             * The type of the associated resource.
             */
            public Builder associatedResourceType(String associatedResourceType) {
                this.associatedResourceType = associatedResourceType;
                return this;
            }

            /**
             * The service code of the associated resource.
             */
            public Builder associatedService(String associatedService) {
                this.associatedService = associatedService;
                return this;
            }

            /**
             * The type of the primary resource.
             */
            public Builder masterResourceType(String masterResourceType) {
                this.masterResourceType = masterResourceType;
                return this;
            }

            /**
             * The service code of the primary resource.
             */
            public Builder masterService(String masterService) {
                this.masterService = masterService;
                return this;
            }

            /**
             * The status of the Transfer Associated Resources feature. Valid values:
             * <p>
             * 
             * - Enable: enabled
             * - Disable: disabled
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public RuleSettings build() {
                return new RuleSettings(this);
            } 

        } 

    }
    public static class AssociatedTransferSetting extends TeaModel {
        @NameInMap("AccountId")
        private String accountId;

        @NameInMap("EnableExistingResourcesTransfer")
        private String enableExistingResourcesTransfer;

        @NameInMap("RuleSettings")
        private java.util.List < RuleSettings> ruleSettings;

        @NameInMap("Status")
        private String status;

        private AssociatedTransferSetting(Builder builder) {
            this.accountId = builder.accountId;
            this.enableExistingResourcesTransfer = builder.enableExistingResourcesTransfer;
            this.ruleSettings = builder.ruleSettings;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AssociatedTransferSetting create() {
            return builder().build();
        }

        /**
         * @return accountId
         */
        public String getAccountId() {
            return this.accountId;
        }

        /**
         * @return enableExistingResourcesTransfer
         */
        public String getEnableExistingResourcesTransfer() {
            return this.enableExistingResourcesTransfer;
        }

        /**
         * @return ruleSettings
         */
        public java.util.List < RuleSettings> getRuleSettings() {
            return this.ruleSettings;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String accountId; 
            private String enableExistingResourcesTransfer; 
            private java.util.List < RuleSettings> ruleSettings; 
            private String status; 

            /**
             * The settings of the Transfer Associated Resources feature.
             */
            public Builder accountId(String accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * EnableExistingResourcesTransfer.
             */
            public Builder enableExistingResourcesTransfer(String enableExistingResourcesTransfer) {
                this.enableExistingResourcesTransfer = enableExistingResourcesTransfer;
                return this;
            }

            /**
             * The settings of the transfer rules.
             */
            public Builder ruleSettings(java.util.List < RuleSettings> ruleSettings) {
                this.ruleSettings = ruleSettings;
                return this;
            }

            /**
             * The status of the Transfer Associated Resources feature. Valid values:
             * <p>
             * 
             * - Enable: enabled
             * - Disable: disabled
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public AssociatedTransferSetting build() {
                return new AssociatedTransferSetting(this);
            } 

        } 

    }
}
