// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

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
 * {@link AgentInfo} extends {@link TeaModel}
 *
 * <p>AgentInfo</p>
 */
public class AgentInfo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AgentDescription")
    private String agentDescription;

    @com.aliyun.core.annotation.NameInMap("AgentName")
    private String agentName;

    @com.aliyun.core.annotation.NameInMap("Id")
    private Long id;

    @com.aliyun.core.annotation.NameInMap("InputType")
    private String inputType;

    @com.aliyun.core.annotation.NameInMap("InstructionType")
    private String instructionType;

    @com.aliyun.core.annotation.NameInMap("InstructionTypeParam")
    private InstructionTypeParam instructionTypeParam;

    @com.aliyun.core.annotation.NameInMap("ModelType")
    private String modelType;

    private AgentInfo(Builder builder) {
        this.agentDescription = builder.agentDescription;
        this.agentName = builder.agentName;
        this.id = builder.id;
        this.inputType = builder.inputType;
        this.instructionType = builder.instructionType;
        this.instructionTypeParam = builder.instructionTypeParam;
        this.modelType = builder.modelType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AgentInfo create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentDescription
     */
    public String getAgentDescription() {
        return this.agentDescription;
    }

    /**
     * @return agentName
     */
    public String getAgentName() {
        return this.agentName;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return inputType
     */
    public String getInputType() {
        return this.inputType;
    }

    /**
     * @return instructionType
     */
    public String getInstructionType() {
        return this.instructionType;
    }

    /**
     * @return instructionTypeParam
     */
    public InstructionTypeParam getInstructionTypeParam() {
        return this.instructionTypeParam;
    }

    /**
     * @return modelType
     */
    public String getModelType() {
        return this.modelType;
    }

    public static final class Builder {
        private String agentDescription; 
        private String agentName; 
        private Long id; 
        private String inputType; 
        private String instructionType; 
        private InstructionTypeParam instructionTypeParam; 
        private String modelType; 

        private Builder() {
        } 

        private Builder(AgentInfo model) {
            this.agentDescription = model.agentDescription;
            this.agentName = model.agentName;
            this.id = model.id;
            this.inputType = model.inputType;
            this.instructionType = model.instructionType;
            this.instructionTypeParam = model.instructionTypeParam;
            this.modelType = model.modelType;
        } 

        /**
         * AgentDescription.
         */
        public Builder agentDescription(String agentDescription) {
            this.agentDescription = agentDescription;
            return this;
        }

        /**
         * AgentName.
         */
        public Builder agentName(String agentName) {
            this.agentName = agentName;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        /**
         * InputType.
         */
        public Builder inputType(String inputType) {
            this.inputType = inputType;
            return this;
        }

        /**
         * InstructionType.
         */
        public Builder instructionType(String instructionType) {
            this.instructionType = instructionType;
            return this;
        }

        /**
         * InstructionTypeParam.
         */
        public Builder instructionTypeParam(InstructionTypeParam instructionTypeParam) {
            this.instructionTypeParam = instructionTypeParam;
            return this;
        }

        /**
         * ModelType.
         */
        public Builder modelType(String modelType) {
            this.modelType = modelType;
            return this;
        }

        public AgentInfo build() {
            return new AgentInfo(this);
        } 

    } 

    /**
     * 
     * {@link AgentInfo} extends {@link TeaModel}
     *
     * <p>AgentInfo</p>
     */
    public static class NameDescPairList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private NameDescPairList(Builder builder) {
            this.name = builder.name;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NameDescPairList create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String name; 
            private String value; 

            private Builder() {
            } 

            private Builder(NameDescPairList model) {
                this.name = model.name;
                this.value = model.value;
            } 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public NameDescPairList build() {
                return new NameDescPairList(this);
            } 

        } 

    }
    /**
     * 
     * {@link AgentInfo} extends {@link TeaModel}
     *
     * <p>AgentInfo</p>
     */
    public static class CustomPromptParam extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CustomPrompt")
        private String customPrompt;

        @com.aliyun.core.annotation.NameInMap("NameDescPairList")
        private java.util.List<NameDescPairList> nameDescPairList;

        private CustomPromptParam(Builder builder) {
            this.customPrompt = builder.customPrompt;
            this.nameDescPairList = builder.nameDescPairList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomPromptParam create() {
            return builder().build();
        }

        /**
         * @return customPrompt
         */
        public String getCustomPrompt() {
            return this.customPrompt;
        }

        /**
         * @return nameDescPairList
         */
        public java.util.List<NameDescPairList> getNameDescPairList() {
            return this.nameDescPairList;
        }

        public static final class Builder {
            private String customPrompt; 
            private java.util.List<NameDescPairList> nameDescPairList; 

            private Builder() {
            } 

            private Builder(CustomPromptParam model) {
                this.customPrompt = model.customPrompt;
                this.nameDescPairList = model.nameDescPairList;
            } 

            /**
             * CustomPrompt.
             */
            public Builder customPrompt(String customPrompt) {
                this.customPrompt = customPrompt;
                return this;
            }

            /**
             * NameDescPairList.
             */
            public Builder nameDescPairList(java.util.List<NameDescPairList> nameDescPairList) {
                this.nameDescPairList = nameDescPairList;
                return this;
            }

            public CustomPromptParam build() {
                return new CustomPromptParam(this);
            } 

        } 

    }
    /**
     * 
     * {@link AgentInfo} extends {@link TeaModel}
     *
     * <p>AgentInfo</p>
     */
    public static class FieldsParamNameDescPairList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Desc")
        private String desc;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private FieldsParamNameDescPairList(Builder builder) {
            this.desc = builder.desc;
            this.name = builder.name;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FieldsParamNameDescPairList create() {
            return builder().build();
        }

        /**
         * @return desc
         */
        public String getDesc() {
            return this.desc;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String desc; 
            private String name; 
            private String value; 

            private Builder() {
            } 

            private Builder(FieldsParamNameDescPairList model) {
                this.desc = model.desc;
                this.name = model.name;
                this.value = model.value;
            } 

            /**
             * Desc.
             */
            public Builder desc(String desc) {
                this.desc = desc;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public FieldsParamNameDescPairList build() {
                return new FieldsParamNameDescPairList(this);
            } 

        } 

    }
    /**
     * 
     * {@link AgentInfo} extends {@link TeaModel}
     *
     * <p>AgentInfo</p>
     */
    public static class FieldsParam extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NameDescPairList")
        private java.util.List<FieldsParamNameDescPairList> nameDescPairList;

        private FieldsParam(Builder builder) {
            this.nameDescPairList = builder.nameDescPairList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FieldsParam create() {
            return builder().build();
        }

        /**
         * @return nameDescPairList
         */
        public java.util.List<FieldsParamNameDescPairList> getNameDescPairList() {
            return this.nameDescPairList;
        }

        public static final class Builder {
            private java.util.List<FieldsParamNameDescPairList> nameDescPairList; 

            private Builder() {
            } 

            private Builder(FieldsParam model) {
                this.nameDescPairList = model.nameDescPairList;
            } 

            /**
             * NameDescPairList.
             */
            public Builder nameDescPairList(java.util.List<FieldsParamNameDescPairList> nameDescPairList) {
                this.nameDescPairList = nameDescPairList;
                return this;
            }

            public FieldsParam build() {
                return new FieldsParam(this);
            } 

        } 

    }
    /**
     * 
     * {@link AgentInfo} extends {@link TeaModel}
     *
     * <p>AgentInfo</p>
     */
    public static class Dimensions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Desc")
        private String desc;

        @com.aliyun.core.annotation.NameInMap("Dimension")
        private String dimension;

        private Dimensions(Builder builder) {
            this.desc = builder.desc;
            this.dimension = builder.dimension;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Dimensions create() {
            return builder().build();
        }

        /**
         * @return desc
         */
        public String getDesc() {
            return this.desc;
        }

        /**
         * @return dimension
         */
        public String getDimension() {
            return this.dimension;
        }

        public static final class Builder {
            private String desc; 
            private String dimension; 

            private Builder() {
            } 

            private Builder(Dimensions model) {
                this.desc = model.desc;
                this.dimension = model.dimension;
            } 

            /**
             * Desc.
             */
            public Builder desc(String desc) {
                this.desc = desc;
                return this;
            }

            /**
             * Dimension.
             */
            public Builder dimension(String dimension) {
                this.dimension = dimension;
                return this;
            }

            public Dimensions build() {
                return new Dimensions(this);
            } 

        } 

    }
    /**
     * 
     * {@link AgentInfo} extends {@link TeaModel}
     *
     * <p>AgentInfo</p>
     */
    public static class ServiceInspectionParam extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Dimensions")
        private java.util.List<Dimensions> dimensions;

        @com.aliyun.core.annotation.NameInMap("SceneDescription")
        private String sceneDescription;

        @com.aliyun.core.annotation.NameInMap("SceneName")
        private String sceneName;

        private ServiceInspectionParam(Builder builder) {
            this.dimensions = builder.dimensions;
            this.sceneDescription = builder.sceneDescription;
            this.sceneName = builder.sceneName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ServiceInspectionParam create() {
            return builder().build();
        }

        /**
         * @return dimensions
         */
        public java.util.List<Dimensions> getDimensions() {
            return this.dimensions;
        }

        /**
         * @return sceneDescription
         */
        public String getSceneDescription() {
            return this.sceneDescription;
        }

        /**
         * @return sceneName
         */
        public String getSceneName() {
            return this.sceneName;
        }

        public static final class Builder {
            private java.util.List<Dimensions> dimensions; 
            private String sceneDescription; 
            private String sceneName; 

            private Builder() {
            } 

            private Builder(ServiceInspectionParam model) {
                this.dimensions = model.dimensions;
                this.sceneDescription = model.sceneDescription;
                this.sceneName = model.sceneName;
            } 

            /**
             * Dimensions.
             */
            public Builder dimensions(java.util.List<Dimensions> dimensions) {
                this.dimensions = dimensions;
                return this;
            }

            /**
             * SceneDescription.
             */
            public Builder sceneDescription(String sceneDescription) {
                this.sceneDescription = sceneDescription;
                return this;
            }

            /**
             * SceneName.
             */
            public Builder sceneName(String sceneName) {
                this.sceneName = sceneName;
                return this;
            }

            public ServiceInspectionParam build() {
                return new ServiceInspectionParam(this);
            } 

        } 

    }
    /**
     * 
     * {@link AgentInfo} extends {@link TeaModel}
     *
     * <p>AgentInfo</p>
     */
    public static class TagCategoryParamNameDescPairList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Desc")
        private String desc;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ValueList")
        private java.util.List<String> valueList;

        private TagCategoryParamNameDescPairList(Builder builder) {
            this.desc = builder.desc;
            this.name = builder.name;
            this.valueList = builder.valueList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TagCategoryParamNameDescPairList create() {
            return builder().build();
        }

        /**
         * @return desc
         */
        public String getDesc() {
            return this.desc;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return valueList
         */
        public java.util.List<String> getValueList() {
            return this.valueList;
        }

        public static final class Builder {
            private String desc; 
            private String name; 
            private java.util.List<String> valueList; 

            private Builder() {
            } 

            private Builder(TagCategoryParamNameDescPairList model) {
                this.desc = model.desc;
                this.name = model.name;
                this.valueList = model.valueList;
            } 

            /**
             * Desc.
             */
            public Builder desc(String desc) {
                this.desc = desc;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * ValueList.
             */
            public Builder valueList(java.util.List<String> valueList) {
                this.valueList = valueList;
                return this;
            }

            public TagCategoryParamNameDescPairList build() {
                return new TagCategoryParamNameDescPairList(this);
            } 

        } 

    }
    /**
     * 
     * {@link AgentInfo} extends {@link TeaModel}
     *
     * <p>AgentInfo</p>
     */
    public static class TagCategoryParam extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NameDescPairList")
        private java.util.List<TagCategoryParamNameDescPairList> nameDescPairList;

        private TagCategoryParam(Builder builder) {
            this.nameDescPairList = builder.nameDescPairList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TagCategoryParam create() {
            return builder().build();
        }

        /**
         * @return nameDescPairList
         */
        public java.util.List<TagCategoryParamNameDescPairList> getNameDescPairList() {
            return this.nameDescPairList;
        }

        public static final class Builder {
            private java.util.List<TagCategoryParamNameDescPairList> nameDescPairList; 

            private Builder() {
            } 

            private Builder(TagCategoryParam model) {
                this.nameDescPairList = model.nameDescPairList;
            } 

            /**
             * NameDescPairList.
             */
            public Builder nameDescPairList(java.util.List<TagCategoryParamNameDescPairList> nameDescPairList) {
                this.nameDescPairList = nameDescPairList;
                return this;
            }

            public TagCategoryParam build() {
                return new TagCategoryParam(this);
            } 

        } 

    }
    /**
     * 
     * {@link AgentInfo} extends {@link TeaModel}
     *
     * <p>AgentInfo</p>
     */
    public static class InstructionTypeParam extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CustomPromptParam")
        private CustomPromptParam customPromptParam;

        @com.aliyun.core.annotation.NameInMap("FieldsParam")
        private FieldsParam fieldsParam;

        @com.aliyun.core.annotation.NameInMap("ServiceInspectionParam")
        private ServiceInspectionParam serviceInspectionParam;

        @com.aliyun.core.annotation.NameInMap("TagCategoryParam")
        private TagCategoryParam tagCategoryParam;

        private InstructionTypeParam(Builder builder) {
            this.customPromptParam = builder.customPromptParam;
            this.fieldsParam = builder.fieldsParam;
            this.serviceInspectionParam = builder.serviceInspectionParam;
            this.tagCategoryParam = builder.tagCategoryParam;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstructionTypeParam create() {
            return builder().build();
        }

        /**
         * @return customPromptParam
         */
        public CustomPromptParam getCustomPromptParam() {
            return this.customPromptParam;
        }

        /**
         * @return fieldsParam
         */
        public FieldsParam getFieldsParam() {
            return this.fieldsParam;
        }

        /**
         * @return serviceInspectionParam
         */
        public ServiceInspectionParam getServiceInspectionParam() {
            return this.serviceInspectionParam;
        }

        /**
         * @return tagCategoryParam
         */
        public TagCategoryParam getTagCategoryParam() {
            return this.tagCategoryParam;
        }

        public static final class Builder {
            private CustomPromptParam customPromptParam; 
            private FieldsParam fieldsParam; 
            private ServiceInspectionParam serviceInspectionParam; 
            private TagCategoryParam tagCategoryParam; 

            private Builder() {
            } 

            private Builder(InstructionTypeParam model) {
                this.customPromptParam = model.customPromptParam;
                this.fieldsParam = model.fieldsParam;
                this.serviceInspectionParam = model.serviceInspectionParam;
                this.tagCategoryParam = model.tagCategoryParam;
            } 

            /**
             * CustomPromptParam.
             */
            public Builder customPromptParam(CustomPromptParam customPromptParam) {
                this.customPromptParam = customPromptParam;
                return this;
            }

            /**
             * FieldsParam.
             */
            public Builder fieldsParam(FieldsParam fieldsParam) {
                this.fieldsParam = fieldsParam;
                return this;
            }

            /**
             * ServiceInspectionParam.
             */
            public Builder serviceInspectionParam(ServiceInspectionParam serviceInspectionParam) {
                this.serviceInspectionParam = serviceInspectionParam;
                return this;
            }

            /**
             * TagCategoryParam.
             */
            public Builder tagCategoryParam(TagCategoryParam tagCategoryParam) {
                this.tagCategoryParam = tagCategoryParam;
                return this;
            }

            public InstructionTypeParam build() {
                return new InstructionTypeParam(this);
            } 

        } 

    }
}
