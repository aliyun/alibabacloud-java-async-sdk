// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateAssociatedTransferSettingRequest} extends {@link RequestModel}
 *
 * <p>UpdateAssociatedTransferSettingRequest</p>
 */
public class UpdateAssociatedTransferSettingRequest extends Request {
    @Query
    @NameInMap("RuleSettings")
    private java.util.List < RuleSettings> ruleSettings;

    private UpdateAssociatedTransferSettingRequest(Builder builder) {
        super(builder);
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
     * @return ruleSettings
     */
    public java.util.List < RuleSettings> getRuleSettings() {
        return this.ruleSettings;
    }

    public static final class Builder extends Request.Builder<UpdateAssociatedTransferSettingRequest, Builder> {
        private java.util.List < RuleSettings> ruleSettings; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAssociatedTransferSettingRequest request) {
            super(request);
            this.ruleSettings = request.ruleSettings;
        } 

        /**
         * RuleSettings.
         */
        public Builder ruleSettings(java.util.List < RuleSettings> ruleSettings) {
            this.putQueryParameter("RuleSettings", ruleSettings);
            this.ruleSettings = ruleSettings;
            return this;
        }

        @Override
        public UpdateAssociatedTransferSettingRequest build() {
            return new UpdateAssociatedTransferSettingRequest(this);
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
        @Validation(required = true)
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
             * AssociatedResourceType.
             */
            public Builder associatedResourceType(String associatedResourceType) {
                this.associatedResourceType = associatedResourceType;
                return this;
            }

            /**
             * AssociatedService.
             */
            public Builder associatedService(String associatedService) {
                this.associatedService = associatedService;
                return this;
            }

            /**
             * MasterResourceType.
             */
            public Builder masterResourceType(String masterResourceType) {
                this.masterResourceType = masterResourceType;
                return this;
            }

            /**
             * MasterService.
             */
            public Builder masterService(String masterService) {
                this.masterService = masterService;
                return this;
            }

            /**
             * Status.
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
