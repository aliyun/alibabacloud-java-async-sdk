// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListRemediationTemplatesResponseBody} extends {@link TeaModel}
 *
 * <p>ListRemediationTemplatesResponseBody</p>
 */
public class ListRemediationTemplatesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("RemediationTemplates")
    private java.util.List < RemediationTemplates> remediationTemplates;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private String totalCount;

    private ListRemediationTemplatesResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.remediationTemplates = builder.remediationTemplates;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRemediationTemplatesResponseBody create() {
        return builder().build();
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
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

    /**
     * @return totalCount
     */
    public String getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Long pageNumber; 
        private Long pageSize; 
        private java.util.List < RemediationTemplates> remediationTemplates; 
        private String requestId; 
        private String totalCount; 

        /**
         * The page number. Pages start from page 1.
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page. Valid values: 1 to 100.
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The queried remediation templates.
         */
        public Builder remediationTemplates(java.util.List < RemediationTemplates> remediationTemplates) {
            this.remediationTemplates = remediationTemplates;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of remediation templates.
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListRemediationTemplatesResponseBody build() {
            return new ListRemediationTemplatesResponseBody(this);
        } 

    } 

    public static class RemediationTemplates extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RemediationType")
        private String remediationType;

        @com.aliyun.core.annotation.NameInMap("TemplateDefinition")
        private String templateDefinition;

        @com.aliyun.core.annotation.NameInMap("TemplateDescription")
        private String templateDescription;

        @com.aliyun.core.annotation.NameInMap("TemplateIdentifier")
        private String templateIdentifier;

        @com.aliyun.core.annotation.NameInMap("TemplateName")
        private String templateName;

        private RemediationTemplates(Builder builder) {
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
            private String remediationType; 
            private String templateDefinition; 
            private String templateDescription; 
            private String templateIdentifier; 
            private String templateName; 

            /**
             * The type of the remediation template. Valid value: OOS, which indicates Operation Orchestration Service.
             */
            public Builder remediationType(String remediationType) {
                this.remediationType = remediationType;
                return this;
            }

            /**
             * The definition of the remediation template.
             */
            public Builder templateDefinition(String templateDefinition) {
                this.templateDefinition = templateDefinition;
                return this;
            }

            /**
             * The description of the remediation template.
             */
            public Builder templateDescription(String templateDescription) {
                this.templateDescription = templateDescription;
                return this;
            }

            /**
             * The ID of the remediation template.
             */
            public Builder templateIdentifier(String templateIdentifier) {
                this.templateIdentifier = templateIdentifier;
                return this;
            }

            /**
             * The name of the remediation template.
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
