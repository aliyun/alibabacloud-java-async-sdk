// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rdsai20250507.models;

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
 * {@link ListSkillResponseBody} extends {@link TeaModel}
 *
 * <p>ListSkillResponseBody</p>
 */
public class ListSkillResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListSkillResponseBody(Builder builder) {
        this.data = builder.data;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSkillResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<Data> data; 
        private Long pageNumber; 
        private Long pageSize; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListSkillResponseBody model) {
            this.data = model.data;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The skill list.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The unique request identifier.</p>
         * 
         * <strong>example:</strong>
         * <p>FE9C65D7-930F-57A5-A207-8C396329****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListSkillResponseBody build() {
            return new ListSkillResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListSkillResponseBody} extends {@link TeaModel}
     *
     * <p>ListSkillResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActiveVersionId")
        private String activeVersionId;

        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("Content")
        private java.util.Map<String, ?> content;

        @com.aliyun.core.annotation.NameInMap("CreatedAt")
        private String createdAt;

        @com.aliyun.core.annotation.NameInMap("Dbtypes")
        private java.util.List<String> dbtypes;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("Icon")
        private String icon;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("IsDeleted")
        private Boolean isDeleted;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Scope")
        private String scope;

        @com.aliyun.core.annotation.NameInMap("SkillType")
        private String skillType;

        @com.aliyun.core.annotation.NameInMap("Slug")
        private String slug;

        @com.aliyun.core.annotation.NameInMap("UpdatedAt")
        private String updatedAt;

        private Data(Builder builder) {
            this.activeVersionId = builder.activeVersionId;
            this.category = builder.category;
            this.content = builder.content;
            this.createdAt = builder.createdAt;
            this.dbtypes = builder.dbtypes;
            this.description = builder.description;
            this.displayName = builder.displayName;
            this.icon = builder.icon;
            this.id = builder.id;
            this.isDeleted = builder.isDeleted;
            this.name = builder.name;
            this.scope = builder.scope;
            this.skillType = builder.skillType;
            this.slug = builder.slug;
            this.updatedAt = builder.updatedAt;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return activeVersionId
         */
        public String getActiveVersionId() {
            return this.activeVersionId;
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return content
         */
        public java.util.Map<String, ?> getContent() {
            return this.content;
        }

        /**
         * @return createdAt
         */
        public String getCreatedAt() {
            return this.createdAt;
        }

        /**
         * @return dbtypes
         */
        public java.util.List<String> getDbtypes() {
            return this.dbtypes;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return icon
         */
        public String getIcon() {
            return this.icon;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return isDeleted
         */
        public Boolean getIsDeleted() {
            return this.isDeleted;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return scope
         */
        public String getScope() {
            return this.scope;
        }

        /**
         * @return skillType
         */
        public String getSkillType() {
            return this.skillType;
        }

        /**
         * @return slug
         */
        public String getSlug() {
            return this.slug;
        }

        /**
         * @return updatedAt
         */
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public static final class Builder {
            private String activeVersionId; 
            private String category; 
            private java.util.Map<String, ?> content; 
            private String createdAt; 
            private java.util.List<String> dbtypes; 
            private String description; 
            private String displayName; 
            private String icon; 
            private String id; 
            private Boolean isDeleted; 
            private String name; 
            private String scope; 
            private String skillType; 
            private String slug; 
            private String updatedAt; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.activeVersionId = model.activeVersionId;
                this.category = model.category;
                this.content = model.content;
                this.createdAt = model.createdAt;
                this.dbtypes = model.dbtypes;
                this.description = model.description;
                this.displayName = model.displayName;
                this.icon = model.icon;
                this.id = model.id;
                this.isDeleted = model.isDeleted;
                this.name = model.name;
                this.scope = model.scope;
                this.skillType = model.skillType;
                this.slug = model.slug;
                this.updatedAt = model.updatedAt;
            } 

            /**
             * <p>The ID of the currently active version.</p>
             * 
             * <strong>example:</strong>
             * <p>version-example</p>
             */
            public Builder activeVersionId(String activeVersionId) {
                this.activeVersionId = activeVersionId;
                return this;
            }

            /**
             * <p>The skill category.</p>
             * 
             * <strong>example:</strong>
             * <p>productivity</p>
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * <p>The data content.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;MySQL&quot;: &quot;MySQL optimization guide...&quot;,&quot;PostgreSQL&quot;: &quot;PostgreSQL optimization guide...&quot;}</p>
             */
            public Builder content(java.util.Map<String, ?> content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-02-04T21:14:45Z</p>
             */
            public Builder createdAt(String createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * <p>The list of database types.</p>
             */
            public Builder dbtypes(java.util.List<String> dbtypes) {
                this.dbtypes = dbtypes;
                return this;
            }

            /**
             * <p>The description.</p>
             * 
             * <strong>example:</strong>
             * <p>SQL Review Expert: Comprehensively reviews SQL for security, performance, and compliance, identifies risks, and provides optimization suggestions. Activated immediately when a user submits SQL or asks about &quot;SQL review&quot;, &quot;SQL Review&quot;, &quot;any risks&quot;, or &quot;how to optimize&quot;</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The display name of the skill.</p>
             * 
             * <strong>example:</strong>
             * <p>Example Skill</p>
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * <p>The public HTTPS URL of the current icon. Empty if not configured.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example.com/skill-icon.png">https://example.com/skill-icon.png</a></p>
             */
            public Builder icon(String icon) {
                this.icon = icon;
                return this;
            }

            /**
             * <p>The unique identifier of the skill.</p>
             * 
             * <strong>example:</strong>
             * <p>9a2ba261-7bb2-41a7-9c6e-1799fb5b****</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Indicates whether the skill is deleted.</p>
             */
            public Builder isDeleted(Boolean isDeleted) {
                this.isDeleted = isDeleted;
                return this;
            }

            /**
             * <p>The skill name.</p>
             * 
             * <strong>example:</strong>
             * <p>sql-review</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The visibility scope of the skill.</p>
             * 
             * <strong>example:</strong>
             * <p>PRIVATE</p>
             */
            public Builder scope(String scope) {
                this.scope = scope;
                return this;
            }

            /**
             * <p>The skill type.</p>
             * 
             * <strong>example:</strong>
             * <p>system</p>
             */
            public Builder skillType(String skillType) {
                this.skillType = skillType;
                return this;
            }

            /**
             * <p>The stable identifier of the skill.</p>
             * 
             * <strong>example:</strong>
             * <p>example-skill</p>
             */
            public Builder slug(String slug) {
                this.slug = slug;
                return this;
            }

            /**
             * <p>The update time.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-02-04T21:14:45Z</p>
             */
            public Builder updatedAt(String updatedAt) {
                this.updatedAt = updatedAt;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
