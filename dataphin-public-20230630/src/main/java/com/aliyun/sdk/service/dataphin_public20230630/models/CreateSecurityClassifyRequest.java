// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataphin_public20230630.models;

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
 * {@link CreateSecurityClassifyRequest} extends {@link RequestModel}
 *
 * <p>CreateSecurityClassifyRequest</p>
 */
public class CreateSecurityClassifyRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CreateCommand")
    @com.aliyun.core.annotation.Validation(required = true)
    private CreateCommand createCommand;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpTenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long opTenantId;

    private CreateSecurityClassifyRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.createCommand = builder.createCommand;
        this.opTenantId = builder.opTenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSecurityClassifyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return createCommand
     */
    public CreateCommand getCreateCommand() {
        return this.createCommand;
    }

    /**
     * @return opTenantId
     */
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public static final class Builder extends Request.Builder<CreateSecurityClassifyRequest, Builder> {
        private String regionId; 
        private CreateCommand createCommand; 
        private Long opTenantId; 

        private Builder() {
            super();
        } 

        private Builder(CreateSecurityClassifyRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.createCommand = request.createCommand;
            this.opTenantId = request.opTenantId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder createCommand(CreateCommand createCommand) {
            String createCommandShrink = shrink(createCommand, "CreateCommand", "json");
            this.putBodyParameter("CreateCommand", createCommandShrink);
            this.createCommand = createCommand;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>30001011</p>
         */
        public Builder opTenantId(Long opTenantId) {
            this.putQueryParameter("OpTenantId", opTenantId);
            this.opTenantId = opTenantId;
            return this;
        }

        @Override
        public CreateSecurityClassifyRequest build() {
            return new CreateSecurityClassifyRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateSecurityClassifyRequest} extends {@link TeaModel}
     *
     * <p>CreateSecurityClassifyRequest</p>
     */
    public static class OptionList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        @com.aliyun.core.annotation.Validation(required = true)
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        @com.aliyun.core.annotation.Validation(required = true)
        private String value;

        private OptionList(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OptionList create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(OptionList model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>k1</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>v1</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public OptionList build() {
                return new OptionList(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateSecurityClassifyRequest} extends {@link TeaModel}
     *
     * <p>CreateSecurityClassifyRequest</p>
     */
    public static class AdvancedConditionList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        @com.aliyun.core.annotation.Validation(required = true)
        private String id;

        @com.aliyun.core.annotation.NameInMap("Operate")
        @com.aliyun.core.annotation.Validation(required = true)
        private String operate;

        @com.aliyun.core.annotation.NameInMap("OptionList")
        private java.util.List<OptionList> optionList;

        @com.aliyun.core.annotation.NameInMap("ParentId")
        private String parentId;

        @com.aliyun.core.annotation.NameInMap("Property")
        private String property;

        @com.aliyun.core.annotation.NameInMap("Relation")
        @com.aliyun.core.annotation.Validation(required = true)
        private String relation;

        @com.aliyun.core.annotation.NameInMap("ValueList")
        private java.util.List<String> valueList;

        private AdvancedConditionList(Builder builder) {
            this.id = builder.id;
            this.operate = builder.operate;
            this.optionList = builder.optionList;
            this.parentId = builder.parentId;
            this.property = builder.property;
            this.relation = builder.relation;
            this.valueList = builder.valueList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AdvancedConditionList create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return operate
         */
        public String getOperate() {
            return this.operate;
        }

        /**
         * @return optionList
         */
        public java.util.List<OptionList> getOptionList() {
            return this.optionList;
        }

        /**
         * @return parentId
         */
        public String getParentId() {
            return this.parentId;
        }

        /**
         * @return property
         */
        public String getProperty() {
            return this.property;
        }

        /**
         * @return relation
         */
        public String getRelation() {
            return this.relation;
        }

        /**
         * @return valueList
         */
        public java.util.List<String> getValueList() {
            return this.valueList;
        }

        public static final class Builder {
            private String id; 
            private String operate; 
            private java.util.List<OptionList> optionList; 
            private String parentId; 
            private String property; 
            private String relation; 
            private java.util.List<String> valueList; 

            private Builder() {
            } 

            private Builder(AdvancedConditionList model) {
                this.id = model.id;
                this.operate = model.operate;
                this.optionList = model.optionList;
                this.parentId = model.parentId;
                this.property = model.property;
                this.relation = model.relation;
                this.valueList = model.valueList;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>234</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>AND</p>
             */
            public Builder operate(String operate) {
                this.operate = operate;
                return this;
            }

            /**
             * OptionList.
             */
            public Builder optionList(java.util.List<OptionList> optionList) {
                this.optionList = optionList;
                return this;
            }

            /**
             * ParentId.
             */
            public Builder parentId(String parentId) {
                this.parentId = parentId;
                return this;
            }

            /**
             * Property.
             */
            public Builder property(String property) {
                this.property = property;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>EXPRESSION</p>
             */
            public Builder relation(String relation) {
                this.relation = relation;
                return this;
            }

            /**
             * ValueList.
             */
            public Builder valueList(java.util.List<String> valueList) {
                this.valueList = valueList;
                return this;
            }

            public AdvancedConditionList build() {
                return new AdvancedConditionList(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateSecurityClassifyRequest} extends {@link TeaModel}
     *
     * <p>CreateSecurityClassifyRequest</p>
     */
    public static class CreateCommand extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Abbreviation")
        private String abbreviation;

        @com.aliyun.core.annotation.NameInMap("AdvancedConditionList")
        private java.util.List<AdvancedConditionList> advancedConditionList;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("FeatureNameList")
        private java.util.List<String> featureNameList;

        @com.aliyun.core.annotation.NameInMap("LevelName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String levelName;

        @com.aliyun.core.annotation.NameInMap("Name")
        @com.aliyun.core.annotation.Validation(required = true)
        private String name;

        @com.aliyun.core.annotation.NameInMap("ParentPath")
        private String parentPath;

        @com.aliyun.core.annotation.NameInMap("Priority")
        private Integer priority;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private CreateCommand(Builder builder) {
            this.abbreviation = builder.abbreviation;
            this.advancedConditionList = builder.advancedConditionList;
            this.description = builder.description;
            this.featureNameList = builder.featureNameList;
            this.levelName = builder.levelName;
            this.name = builder.name;
            this.parentPath = builder.parentPath;
            this.priority = builder.priority;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CreateCommand create() {
            return builder().build();
        }

        /**
         * @return abbreviation
         */
        public String getAbbreviation() {
            return this.abbreviation;
        }

        /**
         * @return advancedConditionList
         */
        public java.util.List<AdvancedConditionList> getAdvancedConditionList() {
            return this.advancedConditionList;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return featureNameList
         */
        public java.util.List<String> getFeatureNameList() {
            return this.featureNameList;
        }

        /**
         * @return levelName
         */
        public String getLevelName() {
            return this.levelName;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return parentPath
         */
        public String getParentPath() {
            return this.parentPath;
        }

        /**
         * @return priority
         */
        public Integer getPriority() {
            return this.priority;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String abbreviation; 
            private java.util.List<AdvancedConditionList> advancedConditionList; 
            private String description; 
            private java.util.List<String> featureNameList; 
            private String levelName; 
            private String name; 
            private String parentPath; 
            private Integer priority; 
            private String status; 

            private Builder() {
            } 

            private Builder(CreateCommand model) {
                this.abbreviation = model.abbreviation;
                this.advancedConditionList = model.advancedConditionList;
                this.description = model.description;
                this.featureNameList = model.featureNameList;
                this.levelName = model.levelName;
                this.name = model.name;
                this.parentPath = model.parentPath;
                this.priority = model.priority;
                this.status = model.status;
            } 

            /**
             * Abbreviation.
             */
            public Builder abbreviation(String abbreviation) {
                this.abbreviation = abbreviation;
                return this;
            }

            /**
             * AdvancedConditionList.
             */
            public Builder advancedConditionList(java.util.List<AdvancedConditionList> advancedConditionList) {
                this.advancedConditionList = advancedConditionList;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * FeatureNameList.
             */
            public Builder featureNameList(java.util.List<String> featureNameList) {
                this.featureNameList = featureNameList;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>L2</p>
             */
            public Builder levelName(String levelName) {
                this.levelName = levelName;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * ParentPath.
             */
            public Builder parentPath(String parentPath) {
                this.parentPath = parentPath;
                return this;
            }

            /**
             * Priority.
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public CreateCommand build() {
                return new CreateCommand(this);
            } 

        } 

    }
}
