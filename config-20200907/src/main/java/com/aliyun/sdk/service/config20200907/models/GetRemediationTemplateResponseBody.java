// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

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
 * {@link GetRemediationTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>GetRemediationTemplateResponseBody</p>
 */
public class GetRemediationTemplateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RemediationTemplates")
    private java.util.List<RemediationTemplates> remediationTemplates;

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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return remediationTemplates
     */
    public java.util.List<RemediationTemplates> getRemediationTemplates() {
        return this.remediationTemplates;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<RemediationTemplates> remediationTemplates; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetRemediationTemplateResponseBody model) {
            this.remediationTemplates = model.remediationTemplates;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The information about the automatic remediation template.</p>
         */
        public Builder remediationTemplates(java.util.List<RemediationTemplates> remediationTemplates) {
            this.remediationTemplates = remediationTemplates;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>E232FC35-BD40-51E3-B2EB-09416A234939</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetRemediationTemplateResponseBody build() {
            return new GetRemediationTemplateResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetRemediationTemplateResponseBody} extends {@link TeaModel}
     *
     * <p>GetRemediationTemplateResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(RemediationTemplates model) {
                this.managedRuleIdentifier = model.managedRuleIdentifier;
                this.remediationType = model.remediationType;
                this.templateDefinition = model.templateDefinition;
                this.templateDescription = model.templateDescription;
                this.templateIdentifier = model.templateIdentifier;
                this.templateName = model.templateName;
            } 

            /**
             * <p>The ID of the supported rule template.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>alb-delete-protection-enabled</p>
             */
            public Builder managedRuleIdentifier(String managedRuleIdentifier) {
                this.managedRuleIdentifier = managedRuleIdentifier;
                return this;
            }

            /**
             * <p>The type of the automatic remediation template. The value is set to OOS.</p>
             * 
             * <strong>example:</strong>
             * <p>OOS</p>
             */
            public Builder remediationType(String remediationType) {
                this.remediationType = remediationType;
                return this;
            }

            /**
             * <p>The parameters of the automatic remediation template.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;Parameters&quot;:{&quot;regionId&quot;:{&quot;AssociationProperty&quot;:&quot;RegionId&quot;,&quot;CreateDated&quot;:&quot;2023-09-08T16:36:15&quot;,&quot;Default&quot;:&quot;{regionId}&quot;,&quot;Description&quot;:{&quot;en&quot;:&quot;regionId&quot;,&quot;zh-cn&quot;:&quot;regionId&quot;},&quot;Id&quot;:538,&quot;MaxKeyLength&quot;:&quot;125&quot;,&quot;MaxValueLength&quot;:&quot;255&quot;,&quot;ModifiedDate&quot;:&quot;2023-09-08T16:36:15&quot;,&quot;Name&quot;:&quot;regionId&quot;,&quot;Optional&quot;:1,&quot;TemplateIdentifier&quot;:&quot;ACS-ALB-BulkyEnableDeletionProtection&quot;,&quot;Type&quot;:&quot;String&quot;,&quot;Version&quot;:&quot;LASTEST&quot;},&quot;loadBalancerIds&quot;:{&quot;CreateDated&quot;:&quot;2023-09-08T16:36:16&quot;,&quot;Default&quot;:&quot;[\&quot;{resourceId}\&quot;]&quot;,&quot;Description&quot;:{&quot;en&quot;:&quot;loadBalancerIds&quot;,&quot;zh-cn&quot;:&quot;loadBalancerIds&quot;},&quot;Id&quot;:539,&quot;MaxKeyLength&quot;:&quot;125&quot;,&quot;MaxValueLength&quot;:&quot;255&quot;,&quot;ModifiedDate&quot;:&quot;2023-09-08T16:36:16&quot;,&quot;Name&quot;:&quot;loadBalancerIds&quot;,&quot;Optional&quot;:1,&quot;TemplateIdentifier&quot;:&quot;ACS-ALB-BulkyEnableDeletionProtection&quot;,&quot;Type&quot;:&quot;ARRAY&quot;,&quot;Version&quot;:&quot;LASTEST&quot;}}}</p>
             */
            public Builder templateDefinition(String templateDefinition) {
                this.templateDefinition = templateDefinition;
                return this;
            }

            /**
             * <p>The description of the automatic remediation template.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>调用接口EnableDeletionProtection，开启ALB实例删除保护，请您知晓风险谨慎操作。</p>
             */
            public Builder templateDescription(String templateDescription) {
                this.templateDescription = templateDescription;
                return this;
            }

            /**
             * <p>The ID of the automatic remediation template.</p>
             * 
             * <strong>example:</strong>
             * <p>ACS-ALB-BulkyEnableDeletionProtection</p>
             */
            public Builder templateIdentifier(String templateIdentifier) {
                this.templateIdentifier = templateIdentifier;
                return this;
            }

            /**
             * <p>The name of the automatic remediation template.</p>
             * 
             * <strong>example:</strong>
             * <p>开启ALB实例删除保护</p>
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
