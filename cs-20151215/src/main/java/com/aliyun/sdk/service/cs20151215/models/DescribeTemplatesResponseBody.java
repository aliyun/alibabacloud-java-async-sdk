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
    @NameInMap("templates")
    private java.util.List < Templates> templates;

    @NameInMap("page_info")
    private PageInfo pageInfo;

    private DescribeTemplatesResponseBody(Builder builder) {
        this.templates = builder.templates;
        this.pageInfo = builder.pageInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTemplatesResponseBody create() {
        return builder().build();
    }

    /**
     * @return templates
     */
    public java.util.List < Templates> getTemplates() {
        return this.templates;
    }

    /**
     * @return pageInfo
     */
    public PageInfo getPageInfo() {
        return this.pageInfo;
    }

    public static final class Builder {
        private java.util.List < Templates> templates; 
        private PageInfo pageInfo; 

        /**
         * The list of templates.
         */
        public Builder templates(java.util.List < Templates> templates) {
            this.templates = templates;
            return this;
        }

        /**
         * The page information.
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        public DescribeTemplatesResponseBody build() {
            return new DescribeTemplatesResponseBody(this);
        } 

    } 

    public static class Templates extends TeaModel {
        @NameInMap("acl")
        private String acl;

        @NameInMap("id")
        private String id;

        @NameInMap("name")
        private String name;

        @NameInMap("description")
        private String description;

        @NameInMap("tags")
        private String tags;

        @NameInMap("template")
        private String template;

        @NameInMap("template_type")
        private String templateType;

        @NameInMap("created")
        private String created;

        @NameInMap("updated")
        private String updated;

        @NameInMap("template_with_hist_id")
        private String templateWithHistId;

        private Templates(Builder builder) {
            this.acl = builder.acl;
            this.id = builder.id;
            this.name = builder.name;
            this.description = builder.description;
            this.tags = builder.tags;
            this.template = builder.template;
            this.templateType = builder.templateType;
            this.created = builder.created;
            this.updated = builder.updated;
            this.templateWithHistId = builder.templateWithHistId;
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
         * @return description
         */
        public String getDescription() {
            return this.description;
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
         * @return created
         */
        public String getCreated() {
            return this.created;
        }

        /**
         * @return updated
         */
        public String getUpdated() {
            return this.updated;
        }

        /**
         * @return templateWithHistId
         */
        public String getTemplateWithHistId() {
            return this.templateWithHistId;
        }

        public static final class Builder {
            private String acl; 
            private String id; 
            private String name; 
            private String description; 
            private String tags; 
            private String template; 
            private String templateType; 
            private String created; 
            private String updated; 
            private String templateWithHistId; 

            /**
             * The access permission of the user deployment template. Valid values:
             * <p>
             * 
             * -"private": private.
             * -"public": public.
             * -"shared": shareable.
             * 
             * Default value: "private ".
             */
            public Builder acl(String acl) {
                this.acl = acl;
                return this;
            }

            /**
             * The ID of the deployment template.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * The name of the deployment template.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The description of the deployment template.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The tag of the deployment template. If you do not specify the tag, the template name is used by default.
             */
            public Builder tags(String tags) {
                this.tags = tags;
                return this;
            }

            /**
             * The content of the YAML template.
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * The type of the template. The value can be any value.
             * <p>
             * 
             * -If the value is "kubernetes", the template is displayed on the orchestration Template page in the console.
             * 
             * -If the value is "compose", the template is displayed on the Swarm cluster page in the console (deprecated).
             */
            public Builder templateType(String templateType) {
                this.templateType = templateType;
                return this;
            }

            /**
             * The time when the deployment template was created.
             */
            public Builder created(String created) {
                this.created = created;
                return this;
            }

            /**
             * The time when the deployment template was updated.
             */
            public Builder updated(String updated) {
                this.updated = updated;
                return this;
            }

            /**
             * The ID of the parent template associated with the template, which is used to implement the multi-version feature of the template. Different versions of the same template have the same "template_with_hist_id" value.
             */
            public Builder templateWithHistId(String templateWithHistId) {
                this.templateWithHistId = templateWithHistId;
                return this;
            }

            public Templates build() {
                return new Templates(this);
            } 

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
             * Displays the current page count.
             */
            public Builder pageNumber(Long pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * The maximum number of data entries per page.
             */
            public Builder pageSize(Long pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * The total number of results.
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
}
