// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

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
 * {@link DescribeTemplatesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTemplatesResponseBody</p>
 */
public class DescribeTemplatesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("page_info")
    private PageInfo pageInfo;

    @com.aliyun.core.annotation.NameInMap("templates")
    private java.util.List<Templates> templates;

    private DescribeTemplatesResponseBody(Builder builder) {
        this.pageInfo = builder.pageInfo;
        this.templates = builder.templates;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTemplatesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pageInfo
     */
    public PageInfo getPageInfo() {
        return this.pageInfo;
    }

    /**
     * @return templates
     */
    public java.util.List<Templates> getTemplates() {
        return this.templates;
    }

    public static final class Builder {
        private PageInfo pageInfo; 
        private java.util.List<Templates> templates; 

        private Builder() {
        } 

        private Builder(DescribeTemplatesResponseBody model) {
            this.pageInfo = model.pageInfo;
            this.templates = model.templates;
        } 

        /**
         * <p>The pagination information.</p>
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * <p>The list of templates.</p>
         */
        public Builder templates(java.util.List<Templates> templates) {
            this.templates = templates;
            return this;
        }

        public DescribeTemplatesResponseBody build() {
            return new DescribeTemplatesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeTemplatesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeTemplatesResponseBody</p>
     */
    public static class PageInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("page_number")
        private Long pageNumber;

        @com.aliyun.core.annotation.NameInMap("page_size")
        private Long pageSize;

        @com.aliyun.core.annotation.NameInMap("total_count")
        private Long totalCount;

        private PageInfo(Builder builder) {
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageInfo create() {
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
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Long pageNumber; 
            private Long pageSize; 
            private Long totalCount; 

            private Builder() {
            } 

            private Builder(PageInfo model) {
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The current page number.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder pageNumber(Long pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * <p>The maximum number of entries per page.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder pageSize(Long pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of results.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public PageInfo build() {
                return new PageInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeTemplatesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeTemplatesResponseBody</p>
     */
    public static class Templates extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("acl")
        private String acl;

        @com.aliyun.core.annotation.NameInMap("created")
        private String created;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("tags")
        private String tags;

        @com.aliyun.core.annotation.NameInMap("template")
        private String template;

        @com.aliyun.core.annotation.NameInMap("template_type")
        private String templateType;

        @com.aliyun.core.annotation.NameInMap("template_with_hist_id")
        private String templateWithHistId;

        @com.aliyun.core.annotation.NameInMap("updated")
        private String updated;

        private Templates(Builder builder) {
            this.acl = builder.acl;
            this.created = builder.created;
            this.description = builder.description;
            this.id = builder.id;
            this.name = builder.name;
            this.tags = builder.tags;
            this.template = builder.template;
            this.templateType = builder.templateType;
            this.templateWithHistId = builder.templateWithHistId;
            this.updated = builder.updated;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Templates create() {
            return builder().build();
        }

        /**
         * @return acl
         */
        public String getAcl() {
            return this.acl;
        }

        /**
         * @return created
         */
        public String getCreated() {
            return this.created;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return tags
         */
        public String getTags() {
            return this.tags;
        }

        /**
         * @return template
         */
        public String getTemplate() {
            return this.template;
        }

        /**
         * @return templateType
         */
        public String getTemplateType() {
            return this.templateType;
        }

        /**
         * @return templateWithHistId
         */
        public String getTemplateWithHistId() {
            return this.templateWithHistId;
        }

        /**
         * @return updated
         */
        public String getUpdated() {
            return this.updated;
        }

        public static final class Builder {
            private String acl; 
            private String created; 
            private String description; 
            private String id; 
            private String name; 
            private String tags; 
            private String template; 
            private String templateType; 
            private String templateWithHistId; 
            private String updated; 

            private Builder() {
            } 

            private Builder(Templates model) {
                this.acl = model.acl;
                this.created = model.created;
                this.description = model.description;
                this.id = model.id;
                this.name = model.name;
                this.tags = model.tags;
                this.template = model.template;
                this.templateType = model.templateType;
                this.templateWithHistId = model.templateWithHistId;
                this.updated = model.updated;
            } 

            /**
             * <p>The access permissions of the deployment template. Valid values:</p>
             * <ul>
             * <li><code>private</code>: Private.</li>
             * <li><code>public</code>: Public.</li>
             * <li><code>shared</code>: Shared.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>private</p>
             */
            public Builder acl(String acl) {
                this.acl = acl;
                return this;
            }

            /**
             * <p>The time when the orchestration template was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-04-25T16:56:33+08:00</p>
             */
            public Builder created(String created) {
                this.created = created;
                return this;
            }

            /**
             * <p>The description of the orchestration template.</p>
             * 
             * <strong>example:</strong>
             * <p>a web server</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The orchestration template ID.</p>
             * 
             * <strong>example:</strong>
             * <p>874ec485-e7e6-4373-8a3b-47bde8******</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The orchestration template name.</p>
             * 
             * <strong>example:</strong>
             * <p>webserver</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The tag of the orchestration template. If not explicitly specified, the tag defaults to the template name.</p>
             * 
             * <strong>example:</strong>
             * <p>kubernetes</p>
             */
            public Builder tags(String tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The template content in YAML format.</p>
             * 
             * <strong>example:</strong>
             * <p>apiVersion: apps/v1\nkind: Deployment\nmetadata:\n  name: nginx-deployment-basic\n  labels:\n    app: nginx\nspec:\n  replicas: 2\n  selector:\n    matchLabels:\n      app: nginx\n  template:\n    metadata:\n      labels:\n        app: nginx\n    spec:\n      containers:\n      - name: nginx\n        image: busybox:latest\n        ports:\n        - containerPort: 80</p>
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * <p>The templatetype.</p>
             * <ul>
             * <li><p>If the value is kubernetes, the template is displayed on the Orchestration Templates page in the console.</p>
             * </li>
             * <li><p>If this parameter is left empty or set to other values, the template is not displayed on the Orchestration Templates page in the console.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>kubernetes</p>
             */
            public Builder templateType(String templateType) {
                this.templateType = templateType;
                return this;
            }

            /**
             * <p>The ID of the parent template associated with the template. This parameter is used to implement the multi-version feature for templates. Different versions of the same template share the same <code>template_with_hist_id</code> value.</p>
             * 
             * <strong>example:</strong>
             * <p>ad81d115-7c8b-47e7-a222-9c28d7******</p>
             */
            public Builder templateWithHistId(String templateWithHistId) {
                this.templateWithHistId = templateWithHistId;
                return this;
            }

            /**
             * <p>The time when the orchestration template was last updated.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-04-25T16:56:33+08:00</p>
             */
            public Builder updated(String updated) {
                this.updated = updated;
                return this;
            }

            public Templates build() {
                return new Templates(this);
            } 

        } 

    }
}
