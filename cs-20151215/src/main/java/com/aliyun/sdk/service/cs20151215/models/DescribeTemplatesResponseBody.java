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
         * 分页信息。
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * 模板列表。
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
             * 当前页数。
             */
            public Builder pageNumber(Long pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * 单页最大数据条数。
             */
            public Builder pageSize(Long pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * 结果总数。
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
             * 模板访问权限，取值为：private、pubilc或shared。。
             */
            public Builder acl(String acl) {
                this.acl = acl;
                return this;
            }

            /**
             * 模板创建时间。
             */
            public Builder created(String created) {
                this.created = created;
                return this;
            }

            /**
             * 模板描述信息。
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * 模板ID。会模板随着更新而变化。
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * 模板名称。
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * 模板标签，如果不显式指定了，默认为模板名称。
             */
            public Builder tags(String tags) {
                this.tags = tags;
                return this;
            }

            /**
             * 模板详情。
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * 部署模板类型。
             */
            public Builder templateType(String templateType) {
                this.templateType = templateType;
                return this;
            }

            /**
             * 模板唯一ID。
             */
            public Builder templateWithHistId(String templateWithHistId) {
                this.templateWithHistId = templateWithHistId;
                return this;
            }

            /**
             * 模板修改时间。
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
