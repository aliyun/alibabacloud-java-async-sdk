// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20190108.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListRemediationTemplatesResponseBody} extends {@link TeaModel}
 *
 * <p>ListRemediationTemplatesResponseBody</p>
 */
public class ListRemediationTemplatesResponseBody extends TeaModel {
    @NameInMap("RemediationTemplates")
    private java.util.List < RemediationTemplates> remediationTemplates;

    @NameInMap("RequestId")
    private String requestId;

    private ListRemediationTemplatesResponseBody(Builder builder) {
        this.remediationTemplates = builder.remediationTemplates;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRemediationTemplatesResponseBody create() {
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
         * RemediationTemplates.
         */
        public Builder remediationTemplates(java.util.List < RemediationTemplates> remediationTemplates) {
            this.remediationTemplates = remediationTemplates;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListRemediationTemplatesResponseBody build() {
            return new ListRemediationTemplatesResponseBody(this);
        } 

    } 

    public static class RemediationTemplates extends TeaModel {
        @NameInMap("RemediationType")
        private String remediationType;

        @NameInMap("TemplateDefinition")
        private String templateDefinition;

        @NameInMap("TemplateIdentifier")
        private String templateIdentifier;

        @NameInMap("TemplateName")
        private String templateName;

        private RemediationTemplates(Builder builder) {
            this.remediationType = builder.remediationType;
            this.templateDefinition = builder.templateDefinition;
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
            private String remediationType; 
            private String templateDefinition; 
            private String templateIdentifier; 
            private String templateName; 

            /**
             * RemediationType.
             */
            public Builder remediationType(String remediationType) {
                this.remediationType = remediationType;
                return this;
            }

            /**
             * TemplateDefinition.
             */
            public Builder templateDefinition(String templateDefinition) {
                this.templateDefinition = templateDefinition;
                return this;
            }

            /**
             * TemplateIdentifier.
             */
            public Builder templateIdentifier(String templateIdentifier) {
                this.templateIdentifier = templateIdentifier;
                return this;
            }

            /**
             * TemplateName.
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
