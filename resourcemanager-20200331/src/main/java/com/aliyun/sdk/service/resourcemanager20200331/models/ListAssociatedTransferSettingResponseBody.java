// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

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
 * {@link ListAssociatedTransferSettingResponseBody} extends {@link TeaModel}
 *
 * <p>ListAssociatedTransferSettingResponseBody</p>
 */
public class ListAssociatedTransferSettingResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AssociatedTransferSetting")
    private AssociatedTransferSetting associatedTransferSetting;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The settings of the Transfer Associated Resources feature.</p>
         */
        public Builder associatedTransferSetting(AssociatedTransferSetting associatedTransferSetting) {
            this.associatedTransferSetting = associatedTransferSetting;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7556FD65-45D2-5C45-9FC9-A7DE831C775C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListAssociatedTransferSettingResponseBody build() {
            return new ListAssociatedTransferSettingResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAssociatedTransferSettingResponseBody} extends {@link TeaModel}
     *
     * <p>ListAssociatedTransferSettingResponseBody</p>
     */
    public static class RuleSettings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AssociatedResourceType")
        private String associatedResourceType;

        @com.aliyun.core.annotation.NameInMap("AssociatedService")
        private String associatedService;

        @com.aliyun.core.annotation.NameInMap("MasterResourceType")
        private String masterResourceType;

        @com.aliyun.core.annotation.NameInMap("MasterService")
        private String masterService;

        @com.aliyun.core.annotation.NameInMap("Status")
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
             * <p>The type of the associated resource.</p>
             * 
             * <strong>example:</strong>
             * <p>disk</p>
             */
            public Builder associatedResourceType(String associatedResourceType) {
                this.associatedResourceType = associatedResourceType;
                return this;
            }

            /**
             * <p>The service code of the associated resource.</p>
             * 
             * <strong>example:</strong>
             * <p>ecs</p>
             */
            public Builder associatedService(String associatedService) {
                this.associatedService = associatedService;
                return this;
            }

            /**
             * <p>The type of the primary resource.</p>
             * 
             * <strong>example:</strong>
             * <p>instance</p>
             */
            public Builder masterResourceType(String masterResourceType) {
                this.masterResourceType = masterResourceType;
                return this;
            }

            /**
             * <p>The service code of the primary resource.</p>
             * 
             * <strong>example:</strong>
             * <p>ecs</p>
             */
            public Builder masterService(String masterService) {
                this.masterService = masterService;
                return this;
            }

            /**
             * <p>The status of the Transfer Associated Resources feature. Valid values:</p>
             * <ul>
             * <li>Enable: enabled</li>
             * <li>Disable: disabled</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Enable</p>
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
    /**
     * 
     * {@link ListAssociatedTransferSettingResponseBody} extends {@link TeaModel}
     *
     * <p>ListAssociatedTransferSettingResponseBody</p>
     */
    public static class AssociatedTransferSetting extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountId")
        private String accountId;

        @com.aliyun.core.annotation.NameInMap("EnableExistingResourcesTransfer")
        private String enableExistingResourcesTransfer;

        @com.aliyun.core.annotation.NameInMap("RuleSettings")
        private java.util.List<RuleSettings> ruleSettings;

        @com.aliyun.core.annotation.NameInMap("Status")
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
        public java.util.List<RuleSettings> getRuleSettings() {
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
            private java.util.List<RuleSettings> ruleSettings; 
            private String status; 

            /**
             * <p>The ID of the Alibaba Cloud account.</p>
             * 
             * <strong>example:</strong>
             * <p>121998723923****</p>
             */
            public Builder accountId(String accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * <p>Indicates whether the Transfer Existing Associated Resources feature is enabled. Valid values:</p>
             * <ul>
             * <li>false</li>
             * <li>true</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableExistingResourcesTransfer(String enableExistingResourcesTransfer) {
                this.enableExistingResourcesTransfer = enableExistingResourcesTransfer;
                return this;
            }

            /**
             * <p>The settings of transfer rules.</p>
             */
            public Builder ruleSettings(java.util.List<RuleSettings> ruleSettings) {
                this.ruleSettings = ruleSettings;
                return this;
            }

            /**
             * <p>The status of the Transfer Associated Resources feature. Valid values:</p>
             * <ul>
             * <li>Enable: enabled</li>
             * <li>Disable: disabled</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Enable</p>
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
