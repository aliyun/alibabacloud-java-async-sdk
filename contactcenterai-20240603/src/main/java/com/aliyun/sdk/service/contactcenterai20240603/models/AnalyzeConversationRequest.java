// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.contactcenterai20240603.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
    @com.aliyun.core.annotation.NameInMap("dialogue")
    @com.aliyun.core.annotation.Validation(required = true)
    private Dialogue dialogue;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("exampleList")
    private java.util.List < ExampleList> exampleList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("fields")
    private java.util.List < Fields> fields;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("modelCode")
    private String modelCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("resultTypes")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < String > resultTypes;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sceneName")
    private String sceneName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("serviceInspection")
    private ServiceInspection serviceInspection;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("stream")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean stream;

    private AnalyzeConversationRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.appId = builder.appId;
        this.regionId = builder.regionId;
        this.dialogue = builder.dialogue;
        this.exampleList = builder.exampleList;
        this.fields = builder.fields;
        this.modelCode = builder.modelCode;
        this.resultTypes = builder.resultTypes;
        this.sceneName = builder.sceneName;
        this.serviceInspection = builder.serviceInspection;
        this.stream = builder.stream;
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
     * @return dialogue
     */
    public Dialogue getDialogue() {
        return this.dialogue;
    }

    /**
     * @return exampleList
     */
    public java.util.List < ExampleList> getExampleList() {
        return this.exampleList;
    }

    /**
     * @return fields
     */
    public java.util.List < Fields> getFields() {
        return this.fields;
    }

    /**
     * @return modelCode
     */
    public String getModelCode() {
        return this.modelCode;
    }

    /**
     * @return resultTypes
     */
    public java.util.List < String > getResultTypes() {
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
     * @return stream
     */
    public Boolean getStream() {
        return this.stream;
    }

    public static final class Builder extends Request.Builder<AnalyzeConversationRequest, Builder> {
        private String workspaceId; 
        private String appId; 
        private String regionId; 
        private Dialogue dialogue; 
        private java.util.List < ExampleList> exampleList; 
        private java.util.List < Fields> fields; 
        private String modelCode; 
        private java.util.List < String > resultTypes; 
        private String sceneName; 
        private ServiceInspection serviceInspection; 
        private Boolean stream; 

        private Builder() {
            super();
        } 

        private Builder(AnalyzeConversationRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.appId = request.appId;
            this.regionId = request.regionId;
            this.dialogue = request.dialogue;
            this.exampleList = request.exampleList;
            this.fields = request.fields;
            this.modelCode = request.modelCode;
            this.resultTypes = request.resultTypes;
            this.sceneName = request.sceneName;
            this.serviceInspection = request.serviceInspection;
            this.stream = request.stream;
        } 

        /**
         * workspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * appId.
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
         * dialogue.
         */
        public Builder dialogue(Dialogue dialogue) {
            this.putBodyParameter("dialogue", dialogue);
            this.dialogue = dialogue;
            return this;
        }

        /**
         * exampleList.
         */
        public Builder exampleList(java.util.List < ExampleList> exampleList) {
            this.putBodyParameter("exampleList", exampleList);
            this.exampleList = exampleList;
            return this;
        }

        /**
         * fields.
         */
        public Builder fields(java.util.List < Fields> fields) {
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
         * resultTypes.
         */
        public Builder resultTypes(java.util.List < String > resultTypes) {
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
         * stream.
         */
        public Builder stream(Boolean stream) {
            this.putBodyParameter("stream", stream);
            this.stream = stream;
            return this;
        }

        @Override
        public AnalyzeConversationRequest build() {
            return new AnalyzeConversationRequest(this);
        } 

    } 

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

            /**
             * role.
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * text.
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
    public static class Dialogue extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("sentences")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List < Sentences> sentences;

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
        public java.util.List < Sentences> getSentences() {
            return this.sentences;
        }

        /**
         * @return sessionId
         */
        public String getSessionId() {
            return this.sessionId;
        }

        public static final class Builder {
            private java.util.List < Sentences> sentences; 
            private String sessionId; 

            /**
             * sentences.
             */
            public Builder sentences(java.util.List < Sentences> sentences) {
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
    public static class SentenceList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("chatId")
        private String chatId;

        @com.aliyun.core.annotation.NameInMap("role")
        @com.aliyun.core.annotation.Validation(required = true)
        private String role;

        @com.aliyun.core.annotation.NameInMap("text")
        @com.aliyun.core.annotation.Validation(required = true)
        private String text;

        private SentenceList(Builder builder) {
            this.chatId = builder.chatId;
            this.role = builder.role;
            this.text = builder.text;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SentenceList create() {
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

            /**
             * chatId.
             */
            public Builder chatId(String chatId) {
                this.chatId = chatId;
                return this;
            }

            /**
             * role.
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * text.
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            public SentenceList build() {
                return new SentenceList(this);
            } 

        } 

    }
    public static class ExampleList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("output")
        @com.aliyun.core.annotation.Validation(required = true)
        private String output;

        @com.aliyun.core.annotation.NameInMap("sentenceList")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List < SentenceList> sentenceList;

        private ExampleList(Builder builder) {
            this.output = builder.output;
            this.sentenceList = builder.sentenceList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExampleList create() {
            return builder().build();
        }

        /**
         * @return output
         */
        public String getOutput() {
            return this.output;
        }

        /**
         * @return sentenceList
         */
        public java.util.List < SentenceList> getSentenceList() {
            return this.sentenceList;
        }

        public static final class Builder {
            private String output; 
            private java.util.List < SentenceList> sentenceList; 

            /**
             * output.
             */
            public Builder output(String output) {
                this.output = output;
                return this;
            }

            /**
             * sentenceList.
             */
            public Builder sentenceList(java.util.List < SentenceList> sentenceList) {
                this.sentenceList = sentenceList;
                return this;
            }

            public ExampleList build() {
                return new ExampleList(this);
            } 

        } 

    }
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

            /**
             * desc.
             */
            public Builder desc(String desc) {
                this.desc = desc;
                return this;
            }

            /**
             * enumValue.
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
    public static class Fields extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("desc")
        @com.aliyun.core.annotation.Validation(required = true)
        private String desc;

        @com.aliyun.core.annotation.NameInMap("enumValues")
        private java.util.List < EnumValues> enumValues;

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
        public java.util.List < EnumValues> getEnumValues() {
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
            private java.util.List < EnumValues> enumValues; 
            private String name; 

            /**
             * code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * desc.
             */
            public Builder desc(String desc) {
                this.desc = desc;
                return this;
            }

            /**
             * enumValues.
             */
            public Builder enumValues(java.util.List < EnumValues> enumValues) {
                this.enumValues = enumValues;
                return this;
            }

            /**
             * name.
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

            /**
             * content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * title.
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
    public static class ServiceInspection extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("inspectionContents")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List < InspectionContents> inspectionContents;

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
        public java.util.List < InspectionContents> getInspectionContents() {
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
            private java.util.List < InspectionContents> inspectionContents; 
            private String inspectionIntroduction; 
            private String sceneIntroduction; 

            /**
             * inspectionContents.
             */
            public Builder inspectionContents(java.util.List < InspectionContents> inspectionContents) {
                this.inspectionContents = inspectionContents;
                return this;
            }

            /**
             * inspectionIntroduction.
             */
            public Builder inspectionIntroduction(String inspectionIntroduction) {
                this.inspectionIntroduction = inspectionIntroduction;
                return this;
            }

            /**
             * sceneIntroduction.
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
}
