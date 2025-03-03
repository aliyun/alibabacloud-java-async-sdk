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
 * {@link UpdateAssociatedTransferSettingRequest} extends {@link RequestModel}
 *
 * <p>UpdateAssociatedTransferSettingRequest</p>
 */
public class UpdateAssociatedTransferSettingRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableExistingResourcesTransfer")
    private String enableExistingResourcesTransfer;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleSettings")
    private java.util.List<RuleSettings> ruleSettings;

    private UpdateAssociatedTransferSettingRequest(Builder builder) {
        super(builder);
        this.enableExistingResourcesTransfer = builder.enableExistingResourcesTransfer;
        this.ruleSettings = builder.ruleSettings;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAssociatedTransferSettingRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Request.Builder<UpdateAssociatedTransferSettingRequest, Builder> {
        private String enableExistingResourcesTransfer; 
        private java.util.List<RuleSettings> ruleSettings; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAssociatedTransferSettingRequest request) {
            super(request);
            this.enableExistingResourcesTransfer = request.enableExistingResourcesTransfer;
            this.ruleSettings = request.ruleSettings;
        } 

        /**
         * <p>Specifies whether to enable the Transfer Existing Associated Resources feature. Valid values:</p>
         * <ul>
         * <li>false</li>
         * <li>true</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder enableExistingResourcesTransfer(String enableExistingResourcesTransfer) {
            this.putQueryParameter("EnableExistingResourcesTransfer", enableExistingResourcesTransfer);
            this.enableExistingResourcesTransfer = enableExistingResourcesTransfer;
            return this;
        }

        /**
         * <p>The settings of transfer rules.</p>
         */
        public Builder ruleSettings(java.util.List<RuleSettings> ruleSettings) {
            this.putQueryParameter("RuleSettings", ruleSettings);
            this.ruleSettings = ruleSettings;
            return this;
        }

        @Override
        public UpdateAssociatedTransferSettingRequest build() {
            return new UpdateAssociatedTransferSettingRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateAssociatedTransferSettingRequest} extends {@link TeaModel}
     *
     * <p>UpdateAssociatedTransferSettingRequest</p>
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
        @com.aliyun.core.annotation.Validation(required = true)
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
             * <p>You can obtain the resource type from the <strong>Resource type</strong> column in <a href="https://help.aliyun.com/document_detail/94479.html">Services that work with Resource Group</a>.</p>
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
             * <p>You can obtain the service code from the <strong>Service code</strong> column in <a href="https://help.aliyun.com/document_detail/94479.html">Services that work with Resource Group</a>.</p>
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
             * <p>You can obtain the resource type from the <strong>Resource type</strong> column in <a href="https://help.aliyun.com/document_detail/94479.html">Services that work with Resource Group</a>.</p>
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
             * <p>You can obtain the service code from the <strong>Service code</strong> column in <a href="https://help.aliyun.com/document_detail/94479.html">Services that work with Resource Group</a>.</p>
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
             * <p>This parameter is required.</p>
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
}
