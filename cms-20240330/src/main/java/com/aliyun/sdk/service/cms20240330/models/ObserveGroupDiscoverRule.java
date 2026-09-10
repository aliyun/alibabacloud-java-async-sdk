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
    @com.aliyun.core.annotation.NameInMap("enabled")
    private Boolean enabled;

    @com.aliyun.core.annotation.NameInMap("entityType")
    private String entityType;

    @com.aliyun.core.annotation.NameInMap("entityTypes")
    private java.util.List<String> entityTypes;

    @com.aliyun.core.annotation.NameInMap("gmtCreate")
    private Long gmtCreate;

    @com.aliyun.core.annotation.NameInMap("instanceIds")
    private java.util.List<String> instanceIds;

    @com.aliyun.core.annotation.NameInMap("nameRules")
    private NameRules nameRules;

    @com.aliyun.core.annotation.NameInMap("regionIds")
    private java.util.List<String> regionIds;

    @com.aliyun.core.annotation.NameInMap("resourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.NameInMap("ruleId")
    private String ruleId;

    @com.aliyun.core.annotation.NameInMap("ruleType")
    private String ruleType;

    @com.aliyun.core.annotation.NameInMap("scope")
    private String scope;

    @com.aliyun.core.annotation.NameInMap("spl")
    private String spl;

    @com.aliyun.core.annotation.NameInMap("tagRules")
    private TagRules tagRules;

    @com.aliyun.core.annotation.NameInMap("userId")
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
         * <p>Indicates whether the rule is enabled. If set to false, the data plane skips this rule and does not perform matching, tagging, or delivery.</p>
         */
        public Builder enabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        /**
         * <p>The entity type (legacy). Retained for backward compatibility. Use entityTypes instead.</p>
         */
        public Builder entityType(String entityType) {
            this.entityType = entityType;
            return this;
        }

        /**
         * <p>The list of entity types. A single rule can match multiple types, such as acs.ecs.instance, acs.rds.instance, and acs.arms.service.</p>
         */
        public Builder entityTypes(java.util.List<String> entityTypes) {
            this.entityTypes = entityTypes;
            return this;
        }

        /**
         * <p>The time when the rule was created, in UNIX millisecond timestamp format. This value is used for display in the console.</p>
         */
        public Builder gmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * <p>The list of manually specified instance IDs in enumeration mode, including instances synchronized manually in version 1.0.</p>
         */
        public Builder instanceIds(java.util.List<String> instanceIds) {
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * <p>The name matching rules.</p>
         */
        public Builder nameRules(NameRules nameRules) {
            this.nameRules = nameRules;
            return this;
        }

        /**
         * <p>The list of region IDs used for filtering by region.</p>
         */
        public Builder regionIds(java.util.List<String> regionIds) {
            this.regionIds = regionIds;
            return this;
        }

        /**
         * <p>The resource group ID used for filtering.</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The stable rule ID used as an anchor for editing, deleting, and enabling or disabling operations. Format: dr-&lt;16-character hash&gt;.</p>
         */
        public Builder ruleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }

        /**
         * <p>The matching method. Valid values: byTag, byResourceGroup, byInstanceName, byManual, and bySpl.</p>
         */
        public Builder ruleType(String ruleType) {
            this.ruleType = ruleType;
            return this;
        }

        /**
         * <p>The applicable scope. Valid values: all (all entity types, exclusive) and entity (specified entity types).</p>
         */
        public Builder scope(String scope) {
            this.scope = scope;
            return this;
        }

        /**
         * <p>The full SPL expression for advanced configuration. If this parameter is not empty, it takes precedence over other filter fields.</p>
         */
        public Builder spl(String spl) {
            this.spl = spl;
            return this;
        }

        /**
         * <p>The tag matching rules.</p>
         */
        public Builder tagRules(TagRules tagRules) {
            this.tagRules = tagRules;
            return this;
        }

        /**
         * <p>The UID of the user to whom the rule belongs.</p>
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
        @com.aliyun.core.annotation.NameInMap("op")
        private String op;

        @com.aliyun.core.annotation.NameInMap("tagValues")
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
             * <p>The matching operation.</p>
             */
            public Builder op(String op) {
                this.op = op;
                return this;
            }

            /**
             * <p>The matching value list.</p>
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
        @com.aliyun.core.annotation.NameInMap("op")
        private String op;

        @com.aliyun.core.annotation.NameInMap("tags")
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
             * <p>The name matching logic.</p>
             */
            public Builder op(String op) {
                this.op = op;
                return this;
            }

            /**
             * <p>The name condition list.</p>
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
        @com.aliyun.core.annotation.NameInMap("op")
        private String op;

        @com.aliyun.core.annotation.NameInMap("tagKey")
        private String tagKey;

        @com.aliyun.core.annotation.NameInMap("tagValues")
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
             * <p>The matching operation.</p>
             */
            public Builder op(String op) {
                this.op = op;
                return this;
            }

            /**
             * <p>The tag key.</p>
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * <p>The tag value list.</p>
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
        @com.aliyun.core.annotation.NameInMap("op")
        private String op;

        @com.aliyun.core.annotation.NameInMap("tags")
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
             * <p>The tag matching logic.</p>
             */
            public Builder op(String op) {
                this.op = op;
                return this;
            }

            /**
             * <p>The tag condition list.</p>
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
