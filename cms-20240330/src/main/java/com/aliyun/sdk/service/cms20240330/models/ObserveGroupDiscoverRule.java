// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link ObserveGroupDiscoverRule} extends {@link TeaModel}
 *
 * <p>ObserveGroupDiscoverRule</p>
 */
public class ObserveGroupDiscoverRule extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Enabled")
    private Boolean enabled;

    @com.aliyun.core.annotation.NameInMap("EntityType")
    private String entityType;

    @com.aliyun.core.annotation.NameInMap("EntityTypes")
    private java.util.List<String> entityTypes;

    @com.aliyun.core.annotation.NameInMap("GmtCreate")
    private Long gmtCreate;

    @com.aliyun.core.annotation.NameInMap("InstanceIds")
    private java.util.List<String> instanceIds;

    @com.aliyun.core.annotation.NameInMap("NameRules")
    private NameRules nameRules;

    @com.aliyun.core.annotation.NameInMap("RegionIds")
    private java.util.List<String> regionIds;

    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.NameInMap("RuleId")
    private String ruleId;

    @com.aliyun.core.annotation.NameInMap("RuleType")
    private String ruleType;

    @com.aliyun.core.annotation.NameInMap("Scope")
    private String scope;

    @com.aliyun.core.annotation.NameInMap("Spl")
    private String spl;

    @com.aliyun.core.annotation.NameInMap("TagRules")
    private TagRules tagRules;

    @com.aliyun.core.annotation.NameInMap("UserId")
    private String userId;

    private ObserveGroupDiscoverRule(Builder builder) {
        this.enabled = builder.enabled;
        this.entityType = builder.entityType;
        this.entityTypes = builder.entityTypes;
        this.gmtCreate = builder.gmtCreate;
        this.instanceIds = builder.instanceIds;
        this.nameRules = builder.nameRules;
        this.regionIds = builder.regionIds;
        this.resourceGroupId = builder.resourceGroupId;
        this.ruleId = builder.ruleId;
        this.ruleType = builder.ruleType;
        this.scope = builder.scope;
        this.spl = builder.spl;
        this.tagRules = builder.tagRules;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ObserveGroupDiscoverRule create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return enabled
     */
    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * @return entityType
     */
    public String getEntityType() {
        return this.entityType;
    }

    /**
     * @return entityTypes
     */
    public java.util.List<String> getEntityTypes() {
        return this.entityTypes;
    }

    /**
     * @return gmtCreate
     */
    public Long getGmtCreate() {
        return this.gmtCreate;
    }

    /**
     * @return instanceIds
     */
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    /**
     * @return nameRules
     */
    public NameRules getNameRules() {
        return this.nameRules;
    }

    /**
     * @return regionIds
     */
    public java.util.List<String> getRegionIds() {
        return this.regionIds;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return ruleId
     */
    public String getRuleId() {
        return this.ruleId;
    }

    /**
     * @return ruleType
     */
    public String getRuleType() {
        return this.ruleType;
    }

    /**
     * @return scope
     */
    public String getScope() {
        return this.scope;
    }

    /**
     * @return spl
     */
    public String getSpl() {
        return this.spl;
    }

    /**
     * @return tagRules
     */
    public TagRules getTagRules() {
        return this.tagRules;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder {
        private Boolean enabled; 
        private String entityType; 
        private java.util.List<String> entityTypes; 
        private Long gmtCreate; 
        private java.util.List<String> instanceIds; 
        private NameRules nameRules; 
        private java.util.List<String> regionIds; 
        private String resourceGroupId; 
        private String ruleId; 
        private String ruleType; 
        private String scope; 
        private String spl; 
        private TagRules tagRules; 
        private String userId; 

        private Builder() {
        } 

        private Builder(ObserveGroupDiscoverRule model) {
            this.enabled = model.enabled;
            this.entityType = model.entityType;
            this.entityTypes = model.entityTypes;
            this.gmtCreate = model.gmtCreate;
            this.instanceIds = model.instanceIds;
            this.nameRules = model.nameRules;
            this.regionIds = model.regionIds;
            this.resourceGroupId = model.resourceGroupId;
            this.ruleId = model.ruleId;
            this.ruleType = model.ruleType;
            this.scope = model.scope;
            this.spl = model.spl;
            this.tagRules = model.tagRules;
            this.userId = model.userId;
        } 

        /**
         * <p>规则是否启用；false 时数据面跳过该规则（不匹配 / 不打标 / 不下发）。</p>
         */
        public Builder enabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        /**
         * <p>（旧）单实体类型，向后兼容，优先用 entityTypes。</p>
         */
        public Builder entityType(String entityType) {
            this.entityType = entityType;
            return this;
        }

        /**
         * <p>实体类型列表，支持一条规则跨多类型匹配（如 acs.ecs.instance/acs.rds.instance/acs.arms.service）。</p>
         */
        public Builder entityTypes(java.util.List<String> entityTypes) {
            this.entityTypes = entityTypes;
            return this;
        }

        /**
         * <p>规则创建时间（Unix 毫秒时间戳），控制台展示用。</p>
         */
        public Builder gmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * <p>手动指定的实例 ID 列表（枚举型，含 1.0 手动实例同步）。</p>
         */
        public Builder instanceIds(java.util.List<String> instanceIds) {
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * <p>名称匹配规则。</p>
         */
        public Builder nameRules(NameRules nameRules) {
            this.nameRules = nameRules;
            return this;
        }

        /**
         * <p>按地域过滤的 region ID 列表。</p>
         */
        public Builder regionIds(java.util.List<String> regionIds) {
            this.regionIds = regionIds;
            return this;
        }

        /**
         * <p>按资源组过滤。</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>规则稳定 ID（编辑/删除/启停锚点），格式 dr-&lt;16位hash&gt;。</p>
         */
        public Builder ruleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }

        /**
         * <p>匹配方式：byTag / byResourceGroup / byInstanceName / byManual / bySpl。</p>
         */
        public Builder ruleType(String ruleType) {
            this.ruleType = ruleType;
            return this;
        }

        /**
         * <p>适用范围：all（全部实体类型，独占）/ entity（指定实体类型）。</p>
         */
        public Builder scope(String scope) {
            this.scope = scope;
            return this;
        }

        /**
         * <p>完整 SPL 表达式（高级配置）；非空时优先生效，覆盖其它过滤字段。</p>
         */
        public Builder spl(String spl) {
            this.spl = spl;
            return this;
        }

        /**
         * <p>标签匹配规则。</p>
         */
        public Builder tagRules(TagRules tagRules) {
            this.tagRules = tagRules;
            return this;
        }

        /**
         * <p>规则所属用户 UID。</p>
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        public ObserveGroupDiscoverRule build() {
            return new ObserveGroupDiscoverRule(this);
        } 

    } 

    /**
     * 
     * {@link ObserveGroupDiscoverRule} extends {@link TeaModel}
     *
     * <p>ObserveGroupDiscoverRule</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Op")
        private String op;

        @com.aliyun.core.annotation.NameInMap("TagValues")
        private java.util.List<String> tagValues;

        private Tags(Builder builder) {
            this.op = builder.op;
            this.tagValues = builder.tagValues;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return op
         */
        public String getOp() {
            return this.op;
        }

        /**
         * @return tagValues
         */
        public java.util.List<String> getTagValues() {
            return this.tagValues;
        }

        public static final class Builder {
            private String op; 
            private java.util.List<String> tagValues; 

            private Builder() {
            } 

            private Builder(Tags model) {
                this.op = model.op;
                this.tagValues = model.tagValues;
            } 

            /**
             * <p>匹配操作。</p>
             */
            public Builder op(String op) {
                this.op = op;
                return this;
            }

            /**
             * <p>匹配值列表。</p>
             */
            public Builder tagValues(java.util.List<String> tagValues) {
                this.tagValues = tagValues;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link ObserveGroupDiscoverRule} extends {@link TeaModel}
     *
     * <p>ObserveGroupDiscoverRule</p>
     */
    public static class NameRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Op")
        private String op;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<Tags> tags;

        private NameRules(Builder builder) {
            this.op = builder.op;
            this.tags = builder.tags;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NameRules create() {
            return builder().build();
        }

        /**
         * @return op
         */
        public String getOp() {
            return this.op;
        }

        /**
         * @return tags
         */
        public java.util.List<Tags> getTags() {
            return this.tags;
        }

        public static final class Builder {
            private String op; 
            private java.util.List<Tags> tags; 

            private Builder() {
            } 

            private Builder(NameRules model) {
                this.op = model.op;
                this.tags = model.tags;
            } 

            /**
             * <p>名称匹配逻辑。</p>
             */
            public Builder op(String op) {
                this.op = op;
                return this;
            }

            /**
             * <p>名称条件列表。</p>
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            public NameRules build() {
                return new NameRules(this);
            } 

        } 

    }
    /**
     * 
     * {@link ObserveGroupDiscoverRule} extends {@link TeaModel}
     *
     * <p>ObserveGroupDiscoverRule</p>
     */
    public static class TagRulesTags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Op")
        private String op;

        @com.aliyun.core.annotation.NameInMap("TagKey")
        private String tagKey;

        @com.aliyun.core.annotation.NameInMap("TagValues")
        private java.util.List<String> tagValues;

        private TagRulesTags(Builder builder) {
            this.op = builder.op;
            this.tagKey = builder.tagKey;
            this.tagValues = builder.tagValues;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TagRulesTags create() {
            return builder().build();
        }

        /**
         * @return op
         */
        public String getOp() {
            return this.op;
        }

        /**
         * @return tagKey
         */
        public String getTagKey() {
            return this.tagKey;
        }

        /**
         * @return tagValues
         */
        public java.util.List<String> getTagValues() {
            return this.tagValues;
        }

        public static final class Builder {
            private String op; 
            private String tagKey; 
            private java.util.List<String> tagValues; 

            private Builder() {
            } 

            private Builder(TagRulesTags model) {
                this.op = model.op;
                this.tagKey = model.tagKey;
                this.tagValues = model.tagValues;
            } 

            /**
             * <p>匹配操作。</p>
             */
            public Builder op(String op) {
                this.op = op;
                return this;
            }

            /**
             * <p>标签键。</p>
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * <p>标签值列表。</p>
             */
            public Builder tagValues(java.util.List<String> tagValues) {
                this.tagValues = tagValues;
                return this;
            }

            public TagRulesTags build() {
                return new TagRulesTags(this);
            } 

        } 

    }
    /**
     * 
     * {@link ObserveGroupDiscoverRule} extends {@link TeaModel}
     *
     * <p>ObserveGroupDiscoverRule</p>
     */
    public static class TagRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Op")
        private String op;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<TagRulesTags> tags;

        private TagRules(Builder builder) {
            this.op = builder.op;
            this.tags = builder.tags;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TagRules create() {
            return builder().build();
        }

        /**
         * @return op
         */
        public String getOp() {
            return this.op;
        }

        /**
         * @return tags
         */
        public java.util.List<TagRulesTags> getTags() {
            return this.tags;
        }

        public static final class Builder {
            private String op; 
            private java.util.List<TagRulesTags> tags; 

            private Builder() {
            } 

            private Builder(TagRules model) {
                this.op = model.op;
                this.tags = model.tags;
            } 

            /**
             * <p>标签匹配逻辑。</p>
             */
            public Builder op(String op) {
                this.op = op;
                return this;
            }

            /**
             * <p>标签条件列表。</p>
             */
            public Builder tags(java.util.List<TagRulesTags> tags) {
                this.tags = tags;
                return this;
            }

            public TagRules build() {
                return new TagRules(this);
            } 

        } 

    }
}
