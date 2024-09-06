// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.contactcenterai20240603.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateConversationAnalysisTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateConversationAnalysisTaskRequest</p>
 */
public class CreateConversationAnalysisTaskRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    private String workspaceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("appId")
    private String appId;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("autoSplit")
    private Integer autoSplit;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("clientChannel")
    private Integer clientChannel;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("examples")
    private Examples examples;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("fields")
    private java.util.List < Fields> fields;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("fileName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("modelCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String modelCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("resultTypes")
    private java.util.List < String > resultTypes;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sceneName")
    private String sceneName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("serviceChannel")
    private Integer serviceChannel;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("serviceChannelKeywords")
    private java.util.List < String > serviceChannelKeywords;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("serviceInspection")
    private ServiceInspection serviceInspection;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("templateIds")
    private java.util.List < String > templateIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("voiceFileUrl")
    @com.aliyun.core.annotation.Validation(required = true)
    private String voiceFileUrl;

    private CreateConversationAnalysisTaskRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.appId = builder.appId;
        this.regionId = builder.regionId;
        this.autoSplit = builder.autoSplit;
        this.clientChannel = builder.clientChannel;
        this.examples = builder.examples;
        this.fields = builder.fields;
        this.fileName = builder.fileName;
        this.modelCode = builder.modelCode;
        this.resultTypes = builder.resultTypes;
        this.sceneName = builder.sceneName;
        this.serviceChannel = builder.serviceChannel;
        this.serviceChannelKeywords = builder.serviceChannelKeywords;
        this.serviceInspection = builder.serviceInspection;
        this.templateIds = builder.templateIds;
        this.voiceFileUrl = builder.voiceFileUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateConversationAnalysisTaskRequest create() {
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
     * @return autoSplit
     */
    public Integer getAutoSplit() {
        return this.autoSplit;
    }

    /**
     * @return clientChannel
     */
    public Integer getClientChannel() {
        return this.clientChannel;
    }

    /**
     * @return examples
     */
    public Examples getExamples() {
        return this.examples;
    }

    /**
     * @return fields
     */
    public java.util.List < Fields> getFields() {
        return this.fields;
    }

    /**
     * @return fileName
     */
    public String getFileName() {
        return this.fileName;
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
     * @return serviceChannel
     */
    public Integer getServiceChannel() {
        return this.serviceChannel;
    }

    /**
     * @return serviceChannelKeywords
     */
    public java.util.List < String > getServiceChannelKeywords() {
        return this.serviceChannelKeywords;
    }

    /**
     * @return serviceInspection
     */
    public ServiceInspection getServiceInspection() {
        return this.serviceInspection;
    }

    /**
     * @return templateIds
     */
    public java.util.List < String > getTemplateIds() {
        return this.templateIds;
    }

    /**
     * @return voiceFileUrl
     */
    public String getVoiceFileUrl() {
        return this.voiceFileUrl;
    }

    public static final class Builder extends Request.Builder<CreateConversationAnalysisTaskRequest, Builder> {
        private String workspaceId; 
        private String appId; 
        private String regionId; 
        private Integer autoSplit; 
        private Integer clientChannel; 
        private Examples examples; 
        private java.util.List < Fields> fields; 
        private String fileName; 
        private String modelCode; 
        private java.util.List < String > resultTypes; 
        private String sceneName; 
        private Integer serviceChannel; 
        private java.util.List < String > serviceChannelKeywords; 
        private ServiceInspection serviceInspection; 
        private java.util.List < String > templateIds; 
        private String voiceFileUrl; 

        private Builder() {
            super();
        } 

        private Builder(CreateConversationAnalysisTaskRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.appId = request.appId;
            this.regionId = request.regionId;
            this.autoSplit = request.autoSplit;
            this.clientChannel = request.clientChannel;
            this.examples = request.examples;
            this.fields = request.fields;
            this.fileName = request.fileName;
            this.modelCode = request.modelCode;
            this.resultTypes = request.resultTypes;
            this.sceneName = request.sceneName;
            this.serviceChannel = request.serviceChannel;
            this.serviceChannelKeywords = request.serviceChannelKeywords;
            this.serviceInspection = request.serviceInspection;
            this.templateIds = request.templateIds;
            this.voiceFileUrl = request.voiceFileUrl;
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
         * autoSplit.
         */
        public Builder autoSplit(Integer autoSplit) {
            this.putBodyParameter("autoSplit", autoSplit);
            this.autoSplit = autoSplit;
            return this;
        }

        /**
         * clientChannel.
         */
        public Builder clientChannel(Integer clientChannel) {
            this.putBodyParameter("clientChannel", clientChannel);
            this.clientChannel = clientChannel;
            return this;
        }

        /**
         * examples.
         */
        public Builder examples(Examples examples) {
            this.putBodyParameter("examples", examples);
            this.examples = examples;
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
         * fileName.
         */
        public Builder fileName(String fileName) {
            this.putBodyParameter("fileName", fileName);
            this.fileName = fileName;
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
         * serviceChannel.
         */
        public Builder serviceChannel(Integer serviceChannel) {
            this.putBodyParameter("serviceChannel", serviceChannel);
            this.serviceChannel = serviceChannel;
            return this;
        }

        /**
         * serviceChannelKeywords.
         */
        public Builder serviceChannelKeywords(java.util.List < String > serviceChannelKeywords) {
            this.putBodyParameter("serviceChannelKeywords", serviceChannelKeywords);
            this.serviceChannelKeywords = serviceChannelKeywords;
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
         * templateIds.
         */
        public Builder templateIds(java.util.List < String > templateIds) {
            this.putBodyParameter("templateIds", templateIds);
            this.templateIds = templateIds;
            return this;
        }

        /**
         * voiceFileUrl.
         */
        public Builder voiceFileUrl(String voiceFileUrl) {
            this.putBodyParameter("voiceFileUrl", voiceFileUrl);
            this.voiceFileUrl = voiceFileUrl;
            return this;
        }

        @Override
        public CreateConversationAnalysisTaskRequest build() {
            return new CreateConversationAnalysisTaskRequest(this);
        } 

    } 

    public static class Sentences extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("chatId")
        private String chatId;

        @com.aliyun.core.annotation.NameInMap("role")
        @com.aliyun.core.annotation.Validation(required = true)
        private String role;

        @com.aliyun.core.annotation.NameInMap("text")
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

            public Sentences build() {
                return new Sentences(this);
            } 

        } 

    }
    public static class Examples extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("output")
        private String output;

        @com.aliyun.core.annotation.NameInMap("sentences")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List < Sentences> sentences;

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
        public java.util.List < Sentences> getSentences() {
            return this.sentences;
        }

        public static final class Builder {
            private String output; 
            private java.util.List < Sentences> sentences; 

            /**
             * output.
             */
            public Builder output(String output) {
                this.output = output;
                return this;
            }

            /**
             * sentences.
             */
            public Builder sentences(java.util.List < Sentences> sentences) {
                this.sentences = sentences;
                return this;
            }

            public Examples build() {
                return new Examples(this);
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
        @com.aliyun.core.annotation.Validation(required = true)
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
