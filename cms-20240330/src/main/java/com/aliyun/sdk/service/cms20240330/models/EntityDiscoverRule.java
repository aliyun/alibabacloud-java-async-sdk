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
 * {@link EntityDiscoverRule} extends {@link TeaModel}
 *
 * <p>EntityDiscoverRule</p>
 */
public class EntityDiscoverRule extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("annotations")
    private java.util.List<Annotations> annotations;

    @com.aliyun.core.annotation.NameInMap("entityTypes")
    private java.util.List<String> entityTypes;

    @com.aliyun.core.annotation.NameInMap("fieldRules")
    private java.util.List<FieldRules> fieldRules;

    @com.aliyun.core.annotation.NameInMap("instanceIds")
    private java.util.List<String> instanceIds;

    @com.aliyun.core.annotation.NameInMap("ipMatchRule")
    private java.util.List<IpMatchRule> ipMatchRule;

    @com.aliyun.core.annotation.NameInMap("labels")
    private java.util.List<Labels> labels;

    @com.aliyun.core.annotation.NameInMap("regionIds")
    private java.util.List<String> regionIds;

    @com.aliyun.core.annotation.NameInMap("resourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.NameInMap("tags")
    private java.util.List<Tags> tags;

    private EntityDiscoverRule(Builder builder) {
        this.annotations = builder.annotations;
        this.entityTypes = builder.entityTypes;
        this.fieldRules = builder.fieldRules;
        this.instanceIds = builder.instanceIds;
        this.ipMatchRule = builder.ipMatchRule;
        this.labels = builder.labels;
        this.regionIds = builder.regionIds;
        this.resourceGroupId = builder.resourceGroupId;
        this.tags = builder.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EntityDiscoverRule create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return annotations
     */
    public java.util.List<Annotations> getAnnotations() {
        return this.annotations;
    }

    /**
     * @return entityTypes
     */
    public java.util.List<String> getEntityTypes() {
        return this.entityTypes;
    }

    /**
     * @return fieldRules
     */
    public java.util.List<FieldRules> getFieldRules() {
        return this.fieldRules;
    }

    /**
     * @return instanceIds
     */
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    /**
     * @return ipMatchRule
     */
    public java.util.List<IpMatchRule> getIpMatchRule() {
        return this.ipMatchRule;
    }

    /**
     * @return labels
     */
    public java.util.List<Labels> getLabels() {
        return this.labels;
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
     * @return tags
     */
    public java.util.List<Tags> getTags() {
        return this.tags;
    }

    public static final class Builder {
        private java.util.List<Annotations> annotations; 
        private java.util.List<String> entityTypes; 
        private java.util.List<FieldRules> fieldRules; 
        private java.util.List<String> instanceIds; 
        private java.util.List<IpMatchRule> ipMatchRule; 
        private java.util.List<Labels> labels; 
        private java.util.List<String> regionIds; 
        private String resourceGroupId; 
        private java.util.List<Tags> tags; 

        private Builder() {
        } 

        private Builder(EntityDiscoverRule model) {
            this.annotations = model.annotations;
            this.entityTypes = model.entityTypes;
            this.fieldRules = model.fieldRules;
            this.instanceIds = model.instanceIds;
            this.ipMatchRule = model.ipMatchRule;
            this.labels = model.labels;
            this.regionIds = model.regionIds;
            this.resourceGroupId = model.resourceGroupId;
            this.tags = model.tags;
        } 

        /**
         * annotations.
         */
        public Builder annotations(java.util.List<Annotations> annotations) {
            this.annotations = annotations;
            return this;
        }

        /**
         * entityTypes.
         */
        public Builder entityTypes(java.util.List<String> entityTypes) {
            this.entityTypes = entityTypes;
            return this;
        }

        /**
         * fieldRules.
         */
        public Builder fieldRules(java.util.List<FieldRules> fieldRules) {
            this.fieldRules = fieldRules;
            return this;
        }

        /**
         * instanceIds.
         */
        public Builder instanceIds(java.util.List<String> instanceIds) {
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * ipMatchRule.
         */
        public Builder ipMatchRule(java.util.List<IpMatchRule> ipMatchRule) {
            this.ipMatchRule = ipMatchRule;
            return this;
        }

        /**
         * labels.
         */
        public Builder labels(java.util.List<Labels> labels) {
            this.labels = labels;
            return this;
        }

        /**
         * regionIds.
         */
        public Builder regionIds(java.util.List<String> regionIds) {
            this.regionIds = regionIds;
            return this;
        }

        /**
         * resourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * tags.
         */
        public Builder tags(java.util.List<Tags> tags) {
            this.tags = tags;
            return this;
        }

        public EntityDiscoverRule build() {
            return new EntityDiscoverRule(this);
        } 

    } 

    /**
     * 
     * {@link EntityDiscoverRule} extends {@link TeaModel}
     *
     * <p>EntityDiscoverRule</p>
     */
    public static class Annotations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("op")
        private String op;

        @com.aliyun.core.annotation.NameInMap("tagKey")
        private String tagKey;

        @com.aliyun.core.annotation.NameInMap("tagValues")
        private java.util.List<String> tagValues;

        private Annotations(Builder builder) {
            this.op = builder.op;
            this.tagKey = builder.tagKey;
            this.tagValues = builder.tagValues;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Annotations create() {
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

            private Builder(Annotations model) {
                this.op = model.op;
                this.tagKey = model.tagKey;
                this.tagValues = model.tagValues;
            } 

            /**
             * op.
             */
            public Builder op(String op) {
                this.op = op;
                return this;
            }

            /**
             * tagKey.
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * tagValues.
             */
            public Builder tagValues(java.util.List<String> tagValues) {
                this.tagValues = tagValues;
                return this;
            }

            public Annotations build() {
                return new Annotations(this);
            } 

        } 

    }
    /**
     * 
     * {@link EntityDiscoverRule} extends {@link TeaModel}
     *
     * <p>EntityDiscoverRule</p>
     */
    public static class FieldRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("fieldKey")
        private String fieldKey;

        @com.aliyun.core.annotation.NameInMap("fieldValues")
        private java.util.List<String> fieldValues;

        @com.aliyun.core.annotation.NameInMap("op")
        private String op;

        private FieldRules(Builder builder) {
            this.fieldKey = builder.fieldKey;
            this.fieldValues = builder.fieldValues;
            this.op = builder.op;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FieldRules create() {
            return builder().build();
        }

        /**
         * @return fieldKey
         */
        public String getFieldKey() {
            return this.fieldKey;
        }

        /**
         * @return fieldValues
         */
        public java.util.List<String> getFieldValues() {
            return this.fieldValues;
        }

        /**
         * @return op
         */
        public String getOp() {
            return this.op;
        }

        public static final class Builder {
            private String fieldKey; 
            private java.util.List<String> fieldValues; 
            private String op; 

            private Builder() {
            } 

            private Builder(FieldRules model) {
                this.fieldKey = model.fieldKey;
                this.fieldValues = model.fieldValues;
                this.op = model.op;
            } 

            /**
             * fieldKey.
             */
            public Builder fieldKey(String fieldKey) {
                this.fieldKey = fieldKey;
                return this;
            }

            /**
             * fieldValues.
             */
            public Builder fieldValues(java.util.List<String> fieldValues) {
                this.fieldValues = fieldValues;
                return this;
            }

            /**
             * op.
             */
            public Builder op(String op) {
                this.op = op;
                return this;
            }

            public FieldRules build() {
                return new FieldRules(this);
            } 

        } 

    }
    /**
     * 
     * {@link EntityDiscoverRule} extends {@link TeaModel}
     *
     * <p>EntityDiscoverRule</p>
     */
    public static class IpMatchRule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ipCIDR")
        private String ipCIDR;

        @com.aliyun.core.annotation.NameInMap("ipFieldKey")
        private String ipFieldKey;

        private IpMatchRule(Builder builder) {
            this.ipCIDR = builder.ipCIDR;
            this.ipFieldKey = builder.ipFieldKey;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IpMatchRule create() {
            return builder().build();
        }

        /**
         * @return ipCIDR
         */
        public String getIpCIDR() {
            return this.ipCIDR;
        }

        /**
         * @return ipFieldKey
         */
        public String getIpFieldKey() {
            return this.ipFieldKey;
        }

        public static final class Builder {
            private String ipCIDR; 
            private String ipFieldKey; 

            private Builder() {
            } 

            private Builder(IpMatchRule model) {
                this.ipCIDR = model.ipCIDR;
                this.ipFieldKey = model.ipFieldKey;
            } 

            /**
             * ipCIDR.
             */
            public Builder ipCIDR(String ipCIDR) {
                this.ipCIDR = ipCIDR;
                return this;
            }

            /**
             * ipFieldKey.
             */
            public Builder ipFieldKey(String ipFieldKey) {
                this.ipFieldKey = ipFieldKey;
                return this;
            }

            public IpMatchRule build() {
                return new IpMatchRule(this);
            } 

        } 

    }
    /**
     * 
     * {@link EntityDiscoverRule} extends {@link TeaModel}
     *
     * <p>EntityDiscoverRule</p>
     */
    public static class Labels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("op")
        private String op;

        @com.aliyun.core.annotation.NameInMap("tagKey")
        private String tagKey;

        @com.aliyun.core.annotation.NameInMap("tagValues")
        private java.util.List<String> tagValues;

        private Labels(Builder builder) {
            this.op = builder.op;
            this.tagKey = builder.tagKey;
            this.tagValues = builder.tagValues;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Labels create() {
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

            private Builder(Labels model) {
                this.op = model.op;
                this.tagKey = model.tagKey;
                this.tagValues = model.tagValues;
            } 

            /**
             * op.
             */
            public Builder op(String op) {
                this.op = op;
                return this;
            }

            /**
             * tagKey.
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * tagValues.
             */
            public Builder tagValues(java.util.List<String> tagValues) {
                this.tagValues = tagValues;
                return this;
            }

            public Labels build() {
                return new Labels(this);
            } 

        } 

    }
    /**
     * 
     * {@link EntityDiscoverRule} extends {@link TeaModel}
     *
     * <p>EntityDiscoverRule</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("op")
        private String op;

        @com.aliyun.core.annotation.NameInMap("tagKey")
        private String tagKey;

        @com.aliyun.core.annotation.NameInMap("tagValues")
        private java.util.List<String> tagValues;

        private Tags(Builder builder) {
            this.op = builder.op;
            this.tagKey = builder.tagKey;
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

            private Builder(Tags model) {
                this.op = model.op;
                this.tagKey = model.tagKey;
                this.tagValues = model.tagValues;
            } 

            /**
             * op.
             */
            public Builder op(String op) {
                this.op = op;
                return this;
            }

            /**
             * tagKey.
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * tagValues.
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
}
