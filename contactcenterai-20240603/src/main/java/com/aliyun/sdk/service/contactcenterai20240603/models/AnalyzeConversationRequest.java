// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.contactcenterai20240603.models;

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
 * {@link AnalyzeConversationRequest} extends {@link RequestModel}
 *
 * <p>AnalyzeConversationRequest</p>
 */
public class AnalyzeConversationRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("appId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("categoryTags")
    private java.util.List<CategoryTags> categoryTags;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("customPrompt")
    private String customPrompt;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dialogue")
    private Dialogue dialogue;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("examples")
    private java.util.List<Examples> examples;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("fields")
    private java.util.List<Fields> fields;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("modelCode")
    private String modelCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("responseFormatType")
    private String responseFormatType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("resultTypes")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> resultTypes;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sceneName")
    private String sceneName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("serviceInspection")
    private ServiceInspection serviceInspection;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sourceCallerUid")
    private String sourceCallerUid;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("stream")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean stream;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("timeConstraintList")
    private java.util.List<String> timeConstraintList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("userProfiles")
    private java.util.List<UserProfiles> userProfiles;

    private AnalyzeConversationRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.appId = builder.appId;
        this.regionId = builder.regionId;
        this.categoryTags = builder.categoryTags;
        this.customPrompt = builder.customPrompt;
        this.dialogue = builder.dialogue;
        this.examples = builder.examples;
        this.fields = builder.fields;
        this.modelCode = builder.modelCode;
        this.responseFormatType = builder.responseFormatType;
        this.resultTypes = builder.resultTypes;
        this.sceneName = builder.sceneName;
        this.serviceInspection = builder.serviceInspection;
        this.sourceCallerUid = builder.sourceCallerUid;
        this.stream = builder.stream;
        this.timeConstraintList = builder.timeConstraintList;
        this.userProfiles = builder.userProfiles;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AnalyzeConversationRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return categoryTags
     */
    public java.util.List<CategoryTags> getCategoryTags() {
        return this.categoryTags;
    }

    /**
     * @return customPrompt
     */
    public String getCustomPrompt() {
        return this.customPrompt;
    }

    /**
     * @return dialogue
     */
    public Dialogue getDialogue() {
        return this.dialogue;
    }

    /**
     * @return examples
     */
    public java.util.List<Examples> getExamples() {
        return this.examples;
    }

    /**
     * @return fields
     */
    public java.util.List<Fields> getFields() {
        return this.fields;
    }

    /**
     * @return modelCode
     */
    public String getModelCode() {
        return this.modelCode;
    }

    /**
     * @return responseFormatType
     */
    public String getResponseFormatType() {
        return this.responseFormatType;
    }

    /**
     * @return resultTypes
     */
    public java.util.List<String> getResultTypes() {
        return this.resultTypes;
    }

    /**
     * @return sceneName
     */
    public String getSceneName() {
        return this.sceneName;
    }

    /**
     * @return serviceInspection
     */
    public ServiceInspection getServiceInspection() {
        return this.serviceInspection;
    }

    /**
     * @return sourceCallerUid
     */
    public String getSourceCallerUid() {
        return this.sourceCallerUid;
    }

    /**
     * @return stream
     */
    public Boolean getStream() {
        return this.stream;
    }

    /**
     * @return timeConstraintList
     */
    public java.util.List<String> getTimeConstraintList() {
        return this.timeConstraintList;
    }

    /**
     * @return userProfiles
     */
    public java.util.List<UserProfiles> getUserProfiles() {
        return this.userProfiles;
    }

    public static final class Builder extends Request.Builder<AnalyzeConversationRequest, Builder> {
        private String workspaceId; 
        private String appId; 
        private String regionId; 
        private java.util.List<CategoryTags> categoryTags; 
        private String customPrompt; 
        private Dialogue dialogue; 
        private java.util.List<Examples> examples; 
        private java.util.List<Fields> fields; 
        private String modelCode; 
        private String responseFormatType; 
        private java.util.List<String> resultTypes; 
        private String sceneName; 
        private ServiceInspection serviceInspection; 
        private String sourceCallerUid; 
        private Boolean stream; 
        private java.util.List<String> timeConstraintList; 
        private java.util.List<UserProfiles> userProfiles; 

        private Builder() {
            super();
        } 

        private Builder(AnalyzeConversationRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.appId = request.appId;
            this.regionId = request.regionId;
            this.categoryTags = request.categoryTags;
            this.customPrompt = request.customPrompt;
            this.dialogue = request.dialogue;
            this.examples = request.examples;
            this.fields = request.fields;
            this.modelCode = request.modelCode;
            this.responseFormatType = request.responseFormatType;
            this.resultTypes = request.resultTypes;
            this.sceneName = request.sceneName;
            this.serviceInspection = request.serviceInspection;
            this.sourceCallerUid = request.sourceCallerUid;
            this.stream = request.stream;
            this.timeConstraintList = request.timeConstraintList;
            this.userProfiles = request.userProfiles;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>llm-368******3ifum</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>a070a49c681f4a95a0f0*********35c</p>
         */
        public Builder appId(String appId) {
            this.putPathParameter("appId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * regionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("regionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * categoryTags.
         */
        public Builder categoryTags(java.util.List<CategoryTags> categoryTags) {
            this.putBodyParameter("categoryTags", categoryTags);
            this.categoryTags = categoryTags;
            return this;
        }

        /**
         * customPrompt.
         */
        public Builder customPrompt(String customPrompt) {
            this.putBodyParameter("customPrompt", customPrompt);
            this.customPrompt = customPrompt;
            return this;
        }

        /**
         * dialogue.
         */
        public Builder dialogue(Dialogue dialogue) {
            this.putBodyParameter("dialogue", dialogue);
            this.dialogue = dialogue;
            return this;
        }

        /**
         * examples.
         */
        public Builder examples(java.util.List<Examples> examples) {
            this.putBodyParameter("examples", examples);
            this.examples = examples;
            return this;
        }

        /**
         * fields.
         */
        public Builder fields(java.util.List<Fields> fields) {
            this.putBodyParameter("fields", fields);
            this.fields = fields;
            return this;
        }

        /**
         * modelCode.
         */
        public Builder modelCode(String modelCode) {
            this.putBodyParameter("modelCode", modelCode);
            this.modelCode = modelCode;
            return this;
        }

        /**
         * responseFormatType.
         */
        public Builder responseFormatType(String responseFormatType) {
            this.putBodyParameter("responseFormatType", responseFormatType);
            this.responseFormatType = responseFormatType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder resultTypes(java.util.List<String> resultTypes) {
            this.putBodyParameter("resultTypes", resultTypes);
            this.resultTypes = resultTypes;
            return this;
        }

        /**
         * sceneName.
         */
        public Builder sceneName(String sceneName) {
            this.putBodyParameter("sceneName", sceneName);
            this.sceneName = sceneName;
            return this;
        }

        /**
         * serviceInspection.
         */
        public Builder serviceInspection(ServiceInspection serviceInspection) {
            this.putBodyParameter("serviceInspection", serviceInspection);
            this.serviceInspection = serviceInspection;
            return this;
        }

        /**
         * sourceCallerUid.
         */
        public Builder sourceCallerUid(String sourceCallerUid) {
            this.putBodyParameter("sourceCallerUid", sourceCallerUid);
            this.sourceCallerUid = sourceCallerUid;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder stream(Boolean stream) {
            this.putBodyParameter("stream", stream);
            this.stream = stream;
            return this;
        }

        /**
         * timeConstraintList.
         */
        public Builder timeConstraintList(java.util.List<String> timeConstraintList) {
            this.putBodyParameter("timeConstraintList", timeConstraintList);
            this.timeConstraintList = timeConstraintList;
            return this;
        }

        /**
         * userProfiles.
         */
        public Builder userProfiles(java.util.List<UserProfiles> userProfiles) {
            this.putBodyParameter("userProfiles", userProfiles);
            this.userProfiles = userProfiles;
            return this;
        }

        @Override
        public AnalyzeConversationRequest build() {
            return new AnalyzeConversationRequest(this);
        } 

    } 

    /**
     * 
     * {@link AnalyzeConversationRequest} extends {@link TeaModel}
     *
     * <p>AnalyzeConversationRequest</p>
     */
    public static class CategoryTags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("tagDesc")
        private String tagDesc;

        @com.aliyun.core.annotation.NameInMap("tagName")
        private String tagName;

        private CategoryTags(Builder builder) {
            this.tagDesc = builder.tagDesc;
            this.tagName = builder.tagName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CategoryTags create() {
            return builder().build();
        }

        /**
         * @return tagDesc
         */
        public String getTagDesc() {
            return this.tagDesc;
        }

        /**
         * @return tagName
         */
        public String getTagName() {
            return this.tagName;
        }

        public static final class Builder {
            private String tagDesc; 
            private String tagName; 

            private Builder() {
            } 

            private Builder(CategoryTags model) {
                this.tagDesc = model.tagDesc;
                this.tagName = model.tagName;
            } 

            /**
             * tagDesc.
             */
            public Builder tagDesc(String tagDesc) {
                this.tagDesc = tagDesc;
                return this;
            }

            /**
             * tagName.
             */
            public Builder tagName(String tagName) {
                this.tagName = tagName;
                return this;
            }

            public CategoryTags build() {
                return new CategoryTags(this);
            } 

        } 

    }
    /**
     * 
     * {@link AnalyzeConversationRequest} extends {@link TeaModel}
     *
     * <p>AnalyzeConversationRequest</p>
     */
    public static class Sentences extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("role")
        @com.aliyun.core.annotation.Validation(required = true)
        private String role;

        @com.aliyun.core.annotation.NameInMap("text")
        @com.aliyun.core.annotation.Validation(required = true)
        private String text;

        private Sentences(Builder builder) {
            this.role = builder.role;
            this.text = builder.text;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Sentences create() {
            return builder().build();
        }

        /**
         * @return role
         */
        public String getRole() {
            return this.role;
        }

        /**
         * @return text
         */
        public String getText() {
            return this.text;
        }

        public static final class Builder {
            private String role; 
            private String text; 

            private Builder() {
            } 

            private Builder(Sentences model) {
                this.role = model.role;
                this.text = model.text;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>user</p>
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            public Sentences build() {
                return new Sentences(this);
            } 

        } 

    }
    /**
     * 
     * {@link AnalyzeConversationRequest} extends {@link TeaModel}
     *
     * <p>AnalyzeConversationRequest</p>
     */
    public static class Dialogue extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("sentences")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<Sentences> sentences;

        @com.aliyun.core.annotation.NameInMap("sessionId")
        private String sessionId;

        private Dialogue(Builder builder) {
            this.sentences = builder.sentences;
            this.sessionId = builder.sessionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Dialogue create() {
            return builder().build();
        }

        /**
         * @return sentences
         */
        public java.util.List<Sentences> getSentences() {
            return this.sentences;
        }

        /**
         * @return sessionId
         */
        public String getSessionId() {
            return this.sessionId;
        }

        public static final class Builder {
            private java.util.List<Sentences> sentences; 
            private String sessionId; 

            private Builder() {
            } 

            private Builder(Dialogue model) {
                this.sentences = model.sentences;
                this.sessionId = model.sessionId;
            } 

            /**
             * <p>This parameter is required.</p>
             */
            public Builder sentences(java.util.List<Sentences> sentences) {
                this.sentences = sentences;
                return this;
            }

            /**
             * sessionId.
             */
            public Builder sessionId(String sessionId) {
                this.sessionId = sessionId;
                return this;
            }

            public Dialogue build() {
                return new Dialogue(this);
            } 

        } 

    }
    /**
     * 
     * {@link AnalyzeConversationRequest} extends {@link TeaModel}
     *
     * <p>AnalyzeConversationRequest</p>
     */
    public static class ExamplesSentences extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("chatId")
        private String chatId;

        @com.aliyun.core.annotation.NameInMap("role")
        @com.aliyun.core.annotation.Validation(required = true)
        private String role;

        @com.aliyun.core.annotation.NameInMap("text")
        @com.aliyun.core.annotation.Validation(required = true)
        private String text;

        private ExamplesSentences(Builder builder) {
            this.chatId = builder.chatId;
            this.role = builder.role;
            this.text = builder.text;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExamplesSentences create() {
            return builder().build();
        }

        /**
         * @return chatId
         */
        public String getChatId() {
            return this.chatId;
        }

        /**
         * @return role
         */
        public String getRole() {
            return this.role;
        }

        /**
         * @return text
         */
        public String getText() {
            return this.text;
        }

        public static final class Builder {
            private String chatId; 
            private String role; 
            private String text; 

            private Builder() {
            } 

            private Builder(ExamplesSentences model) {
                this.chatId = model.chatId;
                this.role = model.role;
                this.text = model.text;
            } 

            /**
             * chatId.
             */
            public Builder chatId(String chatId) {
                this.chatId = chatId;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            public ExamplesSentences build() {
                return new ExamplesSentences(this);
            } 

        } 

    }
    /**
     * 
     * {@link AnalyzeConversationRequest} extends {@link TeaModel}
     *
     * <p>AnalyzeConversationRequest</p>
     */
    public static class Examples extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("output")
        @com.aliyun.core.annotation.Validation(required = true)
        private String output;

        @com.aliyun.core.annotation.NameInMap("sentences")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<ExamplesSentences> sentences;

        private Examples(Builder builder) {
            this.output = builder.output;
            this.sentences = builder.sentences;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Examples create() {
            return builder().build();
        }

        /**
         * @return output
         */
        public String getOutput() {
            return this.output;
        }

        /**
         * @return sentences
         */
        public java.util.List<ExamplesSentences> getSentences() {
            return this.sentences;
        }

        public static final class Builder {
            private String output; 
            private java.util.List<ExamplesSentences> sentences; 

            private Builder() {
            } 

            private Builder(Examples model) {
                this.output = model.output;
                this.sentences = model.sentences;
            } 

            /**
             * <p>This parameter is required.</p>
             */
            public Builder output(String output) {
                this.output = output;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder sentences(java.util.List<ExamplesSentences> sentences) {
                this.sentences = sentences;
                return this;
            }

            public Examples build() {
                return new Examples(this);
            } 

        } 

    }
    /**
     * 
     * {@link AnalyzeConversationRequest} extends {@link TeaModel}
     *
     * <p>AnalyzeConversationRequest</p>
     */
    public static class EnumValues extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("desc")
        @com.aliyun.core.annotation.Validation(required = true)
        private String desc;

        @com.aliyun.core.annotation.NameInMap("enumValue")
        @com.aliyun.core.annotation.Validation(required = true)
        private String enumValue;

        private EnumValues(Builder builder) {
            this.desc = builder.desc;
            this.enumValue = builder.enumValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EnumValues create() {
            return builder().build();
        }

        /**
         * @return desc
         */
        public String getDesc() {
            return this.desc;
        }

        /**
         * @return enumValue
         */
        public String getEnumValue() {
            return this.enumValue;
        }

        public static final class Builder {
            private String desc; 
            private String enumValue; 

            private Builder() {
            } 

            private Builder(EnumValues model) {
                this.desc = model.desc;
                this.enumValue = model.enumValue;
            } 

            /**
             * <p>This parameter is required.</p>
             */
            public Builder desc(String desc) {
                this.desc = desc;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder enumValue(String enumValue) {
                this.enumValue = enumValue;
                return this;
            }

            public EnumValues build() {
                return new EnumValues(this);
            } 

        } 

    }
    /**
     * 
     * {@link AnalyzeConversationRequest} extends {@link TeaModel}
     *
     * <p>AnalyzeConversationRequest</p>
     */
    public static class Fields extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("desc")
        @com.aliyun.core.annotation.Validation(required = true)
        private String desc;

        @com.aliyun.core.annotation.NameInMap("enumValues")
        private java.util.List<EnumValues> enumValues;

        @com.aliyun.core.annotation.NameInMap("name")
        @com.aliyun.core.annotation.Validation(required = true)
        private String name;

        private Fields(Builder builder) {
            this.code = builder.code;
            this.desc = builder.desc;
            this.enumValues = builder.enumValues;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Fields create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return desc
         */
        public String getDesc() {
            return this.desc;
        }

        /**
         * @return enumValues
         */
        public java.util.List<EnumValues> getEnumValues() {
            return this.enumValues;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String code; 
            private String desc; 
            private java.util.List<EnumValues> enumValues; 
            private String name; 

            private Builder() {
            } 

            private Builder(Fields model) {
                this.code = model.code;
                this.desc = model.desc;
                this.enumValues = model.enumValues;
                this.name = model.name;
            } 

            /**
             * code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder desc(String desc) {
                this.desc = desc;
                return this;
            }

            /**
             * enumValues.
             */
            public Builder enumValues(java.util.List<EnumValues> enumValues) {
                this.enumValues = enumValues;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Fields build() {
                return new Fields(this);
            } 

        } 

    }
    /**
     * 
     * {@link AnalyzeConversationRequest} extends {@link TeaModel}
     *
     * <p>AnalyzeConversationRequest</p>
     */
    public static class InspectionContents extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("content")
        @com.aliyun.core.annotation.Validation(required = true)
        private String content;

        @com.aliyun.core.annotation.NameInMap("title")
        @com.aliyun.core.annotation.Validation(required = true)
        private String title;

        private InspectionContents(Builder builder) {
            this.content = builder.content;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InspectionContents create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String content; 
            private String title; 

            private Builder() {
            } 

            private Builder(InspectionContents model) {
                this.content = model.content;
                this.title = model.title;
            } 

            /**
             * <p>This parameter is required.</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public InspectionContents build() {
                return new InspectionContents(this);
            } 

        } 

    }
    /**
     * 
     * {@link AnalyzeConversationRequest} extends {@link TeaModel}
     *
     * <p>AnalyzeConversationRequest</p>
     */
    public static class ServiceInspection extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("inspectionContents")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<InspectionContents> inspectionContents;

        @com.aliyun.core.annotation.NameInMap("inspectionIntroduction")
        @com.aliyun.core.annotation.Validation(required = true)
        private String inspectionIntroduction;

        @com.aliyun.core.annotation.NameInMap("sceneIntroduction")
        @com.aliyun.core.annotation.Validation(required = true)
        private String sceneIntroduction;

        private ServiceInspection(Builder builder) {
            this.inspectionContents = builder.inspectionContents;
            this.inspectionIntroduction = builder.inspectionIntroduction;
            this.sceneIntroduction = builder.sceneIntroduction;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ServiceInspection create() {
            return builder().build();
        }

        /**
         * @return inspectionContents
         */
        public java.util.List<InspectionContents> getInspectionContents() {
            return this.inspectionContents;
        }

        /**
         * @return inspectionIntroduction
         */
        public String getInspectionIntroduction() {
            return this.inspectionIntroduction;
        }

        /**
         * @return sceneIntroduction
         */
        public String getSceneIntroduction() {
            return this.sceneIntroduction;
        }

        public static final class Builder {
            private java.util.List<InspectionContents> inspectionContents; 
            private String inspectionIntroduction; 
            private String sceneIntroduction; 

            private Builder() {
            } 

            private Builder(ServiceInspection model) {
                this.inspectionContents = model.inspectionContents;
                this.inspectionIntroduction = model.inspectionIntroduction;
                this.sceneIntroduction = model.sceneIntroduction;
            } 

            /**
             * <p>This parameter is required.</p>
             */
            public Builder inspectionContents(java.util.List<InspectionContents> inspectionContents) {
                this.inspectionContents = inspectionContents;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder inspectionIntroduction(String inspectionIntroduction) {
                this.inspectionIntroduction = inspectionIntroduction;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder sceneIntroduction(String sceneIntroduction) {
                this.sceneIntroduction = sceneIntroduction;
                return this;
            }

            public ServiceInspection build() {
                return new ServiceInspection(this);
            } 

        } 

    }
    /**
     * 
     * {@link AnalyzeConversationRequest} extends {@link TeaModel}
     *
     * <p>AnalyzeConversationRequest</p>
     */
    public static class UserProfiles extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("value")
        private String value;

        private UserProfiles(Builder builder) {
            this.name = builder.name;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserProfiles create() {
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

            private Builder(UserProfiles model) {
                this.name = model.name;
                this.value = model.value;
            } 

            /**
             * <p>This parameter is required.</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public UserProfiles build() {
                return new UserProfiles(this);
            } 

        } 

    }
}
