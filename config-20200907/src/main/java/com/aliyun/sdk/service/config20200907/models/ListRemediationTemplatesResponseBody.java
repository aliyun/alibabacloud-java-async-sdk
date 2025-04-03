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
    private java.util.List<RemediationTemplates> remediationTemplates;

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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<RemediationTemplates> getRemediationTemplates() {
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
        private java.util.List<RemediationTemplates> remediationTemplates; 
        private String requestId; 
        private String totalCount; 

        private Builder() {
        } 

        private Builder(ListRemediationTemplatesResponseBody model) {
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.remediationTemplates = model.remediationTemplates;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The page number. Pages start from page 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page. Valid values: 1 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The queried remediation templates.</p>
         */
        public Builder remediationTemplates(java.util.List<RemediationTemplates> remediationTemplates) {
            this.remediationTemplates = remediationTemplates;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>FC2C4750-7024-499C-A69F-763543D1CBE3</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of remediation templates.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListRemediationTemplatesResponseBody build() {
            return new ListRemediationTemplatesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListRemediationTemplatesResponseBody} extends {@link TeaModel}
     *
     * <p>ListRemediationTemplatesResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(RemediationTemplates model) {
                this.remediationType = model.remediationType;
                this.templateDefinition = model.templateDefinition;
                this.templateDescription = model.templateDescription;
                this.templateIdentifier = model.templateIdentifier;
                this.templateName = model.templateName;
            } 

            /**
             * <p>The type of the remediation template. Valid value: OOS, which indicates Operation Orchestration Service.</p>
             * 
             * <strong>example:</strong>
             * <p>OOS</p>
             */
            public Builder remediationType(String remediationType) {
                this.remediationType = remediationType;
                return this;
            }

            /**
             * <p>The definition of the remediation template.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *     &quot;Parameters&quot;: {
             *         &quot;bucketName&quot;: {
             *             &quot;Default&quot;: &quot;{resourceId}&quot;,
             *             &quot;Description&quot;: {
             *                 &quot;zh-cn&quot;: &quot;[Required]OSS Bucket Name.&quot;,
             *                 &quot;en&quot;: &quot;[Required]OSS Bucket Name.&quot;
             *             },
             *             &quot;Type&quot;: &quot;String&quot;
             *         },
             *         &quot;regionId&quot;: {
             *             &quot;AssociationProperty&quot;: &quot;RegionId&quot;,
             *             &quot;Default&quot;: &quot;{regionId}&quot;,
             *             &quot;Description&quot;: {
             *                 &quot;zh-cn&quot;: &quot;[Required]The id of target region.&quot;,
             *                 &quot;en&quot;: &quot;[Required]The id of target region.&quot;
             *             },
             *             &quot;Type&quot;: &quot;String&quot;
             *         },
             *         &quot;permissionName&quot;: {
             *             &quot;AllowValues&quot;: &quot;[&quot;public-read-write&quot;,&quot;public-read&quot;,&quot;private&quot;]&quot;,
             *             &quot;Default&quot;: &quot;private&quot;,
             *             &quot;Description&quot;: {
             *                 &quot;zh-cn&quot;: &quot;[Required]ACL Permission Name.&quot;,
             *                 &quot;en&quot;: &quot;[Required]ACL Permission Name.&quot;
             *             },
             *             &quot;Type&quot;: &quot;String&quot;
             *         }
             *     }
             * }</p>
             */
            public Builder templateDefinition(String templateDefinition) {
                this.templateDefinition = templateDefinition;
                return this;
            }

            /**
             * <p>The description of the remediation template.</p>
             * 
             * <strong>example:</strong>
             * <p>Configure encryption rules for OSSBucket through the PutBucketEncryption interface. Be aware of the risks and exercise caution.</p>
             */
            public Builder templateDescription(String templateDescription) {
                this.templateDescription = templateDescription;
                return this;
            }

            /**
             * <p>The ID of the remediation template.</p>
             * 
             * <strong>example:</strong>
             * <p>ACS-OSS-PutBucketAcl</p>
             */
            public Builder templateIdentifier(String templateIdentifier) {
                this.templateIdentifier = templateIdentifier;
                return this;
            }

            /**
             * <p>The name of the remediation template.</p>
             * 
             * <strong>example:</strong>
             * <p>Set the ACL of an OSS bucket to private</p>
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
