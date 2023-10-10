// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTemplatesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTemplatesResponseBody</p>
 */
public class DescribeTemplatesResponseBody extends TeaModel {
    @NameInMap("page_info")
    private PageInfo pageInfo;

    @NameInMap("templates")
    private java.util.List < Templates> templates;

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

    /**
     * @return pageInfo
     */
    public PageInfo getPageInfo() {
        return this.pageInfo;
    }

    /**
     * @return templates
     */
    public java.util.List < Templates> getTemplates() {
        return this.templates;
    }

    public static final class Builder {
        private PageInfo pageInfo; 
        private java.util.List < Templates> templates; 

        /**
         * The pagination information.
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * The list of returned templates.
         */
        public Builder templates(java.util.List < Templates> templates) {
            this.templates = templates;
            return this;
        }

        public DescribeTemplatesResponseBody build() {
            return new DescribeTemplatesResponseBody(this);
        } 

    } 

    public static class PageInfo extends TeaModel {
        @NameInMap("page_number")
        private Long pageNumber;

        @NameInMap("page_size")
        private Long pageSize;

        @NameInMap("total_count")
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

            /**
             * The page number.
             */
            public Builder pageNumber(Long pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * The number of entries per page.
             */
            public Builder pageSize(Long pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * The total number of entries returned.
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
    public static class Templates extends TeaModel {
        @NameInMap("acl")
        private String acl;

        @NameInMap("created")
        private String created;

        @NameInMap("description")
        private String description;

        @NameInMap("id")
        private String id;

        @NameInMap("name")
        private String name;

        @NameInMap("tags")
        private String tags;

        @NameInMap("template")
        private String template;

        @NameInMap("template_type")
        private String templateType;

        @NameInMap("template_with_hist_id")
        private String templateWithHistId;

        @NameInMap("updated")
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

            /**
             * The access control policy of the template. Valid values:
             * <p>
             * 
             * *   `private`: The template is private.
             * *   `public`: The template is public.
             * *   `shared`: The template can be shared.
             * 
             * Default value: `private`.
             */
            public Builder acl(String acl) {
                this.acl = acl;
                return this;
            }

            /**
             * The time when the template was created.
             */
            public Builder created(String created) {
                this.created = created;
                return this;
            }

            /**
             * The description of the template.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The ID of the template.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * The name of the template.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The label of the template. By default, the value is the name of the template.
             */
            public Builder tags(String tags) {
                this.tags = tags;
                return this;
            }

            /**
             * The template content in the YAML format.
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * The type of template. This parameter can be set to a custom value.
             * <p>
             * 
             * *   If the parameter is set to `kubernetes`, the template is displayed on the Templates page in the console.
             * *   If the parameter is set to `compose`, the template is displayed on the Container Service - Swarm page in the console. However, Container Service for Swarm is deprecated.
             */
            public Builder templateType(String templateType) {
                this.templateType = templateType;
                return this;
            }

            /**
             * The ID of the parent template. The value of `template_with_hist_id` is the same for each template version. This allows you to manage different template versions.
             */
            public Builder templateWithHistId(String templateWithHistId) {
                this.templateWithHistId = templateWithHistId;
                return this;
            }

            /**
             * The time when the template was updated.
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
