// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.contactcenterai20240603.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link RunCompletionRequest} extends {@link RequestModel}
 *
 * <p>RunCompletionRequest</p>
 */
public class RunCompletionRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("appId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Dialogue")
    @com.aliyun.core.annotation.Validation(required = true)
    private Dialogue dialogue;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Fields")
    private java.util.List < Fields> fields;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ModelCode")
    private String modelCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ServiceInspection")
    private ServiceInspection serviceInspection;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Stream")
    private Boolean stream;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TemplateIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < Long > templateIds;

    private RunCompletionRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.appId = builder.appId;
        this.regionId = builder.regionId;
        this.dialogue = builder.dialogue;
        this.fields = builder.fields;
        this.modelCode = builder.modelCode;
        this.serviceInspection = builder.serviceInspection;
        this.stream = builder.stream;
        this.templateIds = builder.templateIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunCompletionRequest create() {
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

    /**
     * @return templateIds
     */
    public java.util.List < Long > getTemplateIds() {
        return this.templateIds;
    }

    public static final class Builder extends Request.Builder<RunCompletionRequest, Builder> {
        private String workspaceId; 
        private String appId; 
        private String regionId; 
        private Dialogue dialogue; 
        private java.util.List < Fields> fields; 
        private String modelCode; 
        private ServiceInspection serviceInspection; 
        private Boolean stream; 
        private java.util.List < Long > templateIds; 

        private Builder() {
            super();
        } 

        private Builder(RunCompletionRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.appId = request.appId;
            this.regionId = request.regionId;
            this.dialogue = request.dialogue;
            this.fields = request.fields;
            this.modelCode = request.modelCode;
            this.serviceInspection = request.serviceInspection;
            this.stream = request.stream;
            this.templateIds = request.templateIds;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>llm-ik******RVYCKzt</p>
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
         * <p>097d65c9c7004f8dad2b454850ac232b</p>
         */
        public Builder appId(String appId) {
            this.putPathParameter("appId", appId);
            this.appId = appId;
            return this;
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
        public Builder dialogue(Dialogue dialogue) {
            this.putBodyParameter("Dialogue", dialogue);
            this.dialogue = dialogue;
            return this;
        }

        /**
         * Fields.
         */
        public Builder fields(java.util.List < Fields> fields) {
            this.putBodyParameter("Fields", fields);
            this.fields = fields;
            return this;
        }

        /**
         * ModelCode.
         */
        public Builder modelCode(String modelCode) {
            this.putBodyParameter("ModelCode", modelCode);
            this.modelCode = modelCode;
            return this;
        }

        /**
         * ServiceInspection.
         */
        public Builder serviceInspection(ServiceInspection serviceInspection) {
            this.putBodyParameter("ServiceInspection", serviceInspection);
            this.serviceInspection = serviceInspection;
            return this;
        }

        /**
         * Stream.
         */
        public Builder stream(Boolean stream) {
            this.putBodyParameter("Stream", stream);
            this.stream = stream;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder templateIds(java.util.List < Long > templateIds) {
            this.putBodyParameter("TemplateIds", templateIds);
            this.templateIds = templateIds;
            return this;
        }

        @Override
        public RunCompletionRequest build() {
            return new RunCompletionRequest(this);
        } 

    } 

    /**
     * 
     * {@link RunCompletionRequest} extends {@link TeaModel}
     *
     * <p>RunCompletionRequest</p>
     */
    public static class Sentences extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ChatId")
        private String chatId;

        @com.aliyun.core.annotation.NameInMap("Role")
        @com.aliyun.core.annotation.Validation(required = true)
        private String role;

        @com.aliyun.core.annotation.NameInMap("Text")
        @com.aliyun.core.annotation.Validation(required = true)
        private String text;

        private Sentences(Builder builder) {
            this.chatId = builder.chatId;
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
             * ChatId.
             */
            public Builder chatId(String chatId) {
                this.chatId = chatId;
                return this;
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
     * {@link RunCompletionRequest} extends {@link TeaModel}
     *
     * <p>RunCompletionRequest</p>
     */
    public static class Dialogue extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Sentences")
        private java.util.List < Sentences> sentences;

        @com.aliyun.core.annotation.NameInMap("SessionId")
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
             * Sentences.
             */
            public Builder sentences(java.util.List < Sentences> sentences) {
                this.sentences = sentences;
                return this;
            }

            /**
             * SessionId.
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
     * {@link RunCompletionRequest} extends {@link TeaModel}
     *
     * <p>RunCompletionRequest</p>
     */
    public static class EnumValues extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Desc")
        private String desc;

        @com.aliyun.core.annotation.NameInMap("EnumValue")
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
             * Desc.
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
     * {@link RunCompletionRequest} extends {@link TeaModel}
     *
     * <p>RunCompletionRequest</p>
     */
    public static class Fields extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Desc")
        private String desc;

        @com.aliyun.core.annotation.NameInMap("EnumValues")
        private java.util.List < EnumValues> enumValues;

        @com.aliyun.core.annotation.NameInMap("Name")
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
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * Desc.
             */
            public Builder desc(String desc) {
                this.desc = desc;
                return this;
            }

            /**
             * EnumValues.
             */
            public Builder enumValues(java.util.List < EnumValues> enumValues) {
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
     * {@link RunCompletionRequest} extends {@link TeaModel}
     *
     * <p>RunCompletionRequest</p>
     */
    public static class InspectionContents extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("Title")
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
             * Content.
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
     * {@link RunCompletionRequest} extends {@link TeaModel}
     *
     * <p>RunCompletionRequest</p>
     */
    public static class ServiceInspection extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InspectionContents")
        private java.util.List < InspectionContents> inspectionContents;

        @com.aliyun.core.annotation.NameInMap("InspectionIntroduction")
        private String inspectionIntroduction;

        @com.aliyun.core.annotation.NameInMap("SceneIntroduction")
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
             * InspectionContents.
             */
            public Builder inspectionContents(java.util.List < InspectionContents> inspectionContents) {
                this.inspectionContents = inspectionContents;
                return this;
            }

            /**
             * InspectionIntroduction.
             */
            public Builder inspectionIntroduction(String inspectionIntroduction) {
                this.inspectionIntroduction = inspectionIntroduction;
                return this;
            }

            /**
             * SceneIntroduction.
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
