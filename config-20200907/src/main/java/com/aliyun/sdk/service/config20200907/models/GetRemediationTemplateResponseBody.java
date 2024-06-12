// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRemediationTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>GetRemediationTemplateResponseBody</p>
 */
public class GetRemediationTemplateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RemediationTemplates")
    private java.util.List < RemediationTemplates> remediationTemplates;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetRemediationTemplateResponseBody(Builder builder) {
        this.remediationTemplates = builder.remediationTemplates;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRemediationTemplateResponseBody create() {
        return builder().build();
    }

    /**
     * @return remediationTemplates
     */
    public java.util.List < RemediationTemplates> getRemediationTemplates() {
        return this.remediationTemplates;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < RemediationTemplates> remediationTemplates; 
        private String requestId; 

        /**
         * The information about the automatic remediation template.
         */
        public Builder remediationTemplates(java.util.List < RemediationTemplates> remediationTemplates) {
            this.remediationTemplates = remediationTemplates;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetRemediationTemplateResponseBody build() {
            return new GetRemediationTemplateResponseBody(this);
        } 

    } 

    public static class RemediationTemplates extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ManagedRuleIdentifier")
        @com.aliyun.core.annotation.Validation(required = true)
        private String managedRuleIdentifier;

        @com.aliyun.core.annotation.NameInMap("RemediationType")
        private String remediationType;

        @com.aliyun.core.annotation.NameInMap("TemplateDefinition")
        private String templateDefinition;

        @com.aliyun.core.annotation.NameInMap("TemplateDescription")
        @com.aliyun.core.annotation.Validation(required = true)
        private String templateDescription;

        @com.aliyun.core.annotation.NameInMap("TemplateIdentifier")
        private String templateIdentifier;

        @com.aliyun.core.annotation.NameInMap("TemplateName")
        private String templateName;

        private RemediationTemplates(Builder builder) {
            this.managedRuleIdentifier = builder.managedRuleIdentifier;
            this.remediationType = builder.remediationType;
            this.templateDefinition = builder.templateDefinition;
            this.templateDescription = builder.templateDescription;
            this.templateIdentifier = builder.templateIdentifier;
            this.templateName = builder.templateName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RemediationTemplates create() {
            return builder().build();
        }

        /**
         * @return managedRuleIdentifier
         */
        public String getManagedRuleIdentifier() {
            return this.managedRuleIdentifier;
        }

        /**
         * @return remediationType
         */
        public String getRemediationType() {
            return this.remediationType;
        }

        /**
         * @return templateDefinition
         */
        public String getTemplateDefinition() {
            return this.templateDefinition;
        }

        /**
         * @return templateDescription
         */
        public String getTemplateDescription() {
            return this.templateDescription;
        }

        /**
         * @return templateIdentifier
         */
        public String getTemplateIdentifier() {
            return this.templateIdentifier;
        }

        /**
         * @return templateName
         */
        public String getTemplateName() {
            return this.templateName;
        }

        public static final class Builder {
            private String managedRuleIdentifier; 
            private String remediationType; 
            private String templateDefinition; 
            private String templateDescription; 
            private String templateIdentifier; 
            private String templateName; 

            /**
             * The ID of the supported rule template.
             */
            public Builder managedRuleIdentifier(String managedRuleIdentifier) {
                this.managedRuleIdentifier = managedRuleIdentifier;
                return this;
            }

            /**
             * The type of the automatic remediation template. The value is set to OOS.
             */
            public Builder remediationType(String remediationType) {
                this.remediationType = remediationType;
                return this;
            }

            /**
             * The parameters of the automatic remediation template.
             */
            public Builder templateDefinition(String templateDefinition) {
                this.templateDefinition = templateDefinition;
                return this;
            }

            /**
             * The description of the automatic remediation template.
             */
            public Builder templateDescription(String templateDescription) {
                this.templateDescription = templateDescription;
                return this;
            }

            /**
             * The ID of the automatic remediation template.
             */
            public Builder templateIdentifier(String templateIdentifier) {
                this.templateIdentifier = templateIdentifier;
                return this;
            }

            /**
             * The name of the automatic remediation template.
             */
            public Builder templateName(String templateName) {
                this.templateName = templateName;
                return this;
            }

            public RemediationTemplates build() {
                return new RemediationTemplates(this);
            } 

        } 

    }
}
