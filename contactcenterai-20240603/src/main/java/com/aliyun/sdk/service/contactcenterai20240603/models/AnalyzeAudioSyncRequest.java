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
 * {@link AnalyzeAudioSyncRequest} extends {@link RequestModel}
 *
 * <p>AnalyzeAudioSyncRequest</p>
 */
public class AnalyzeAudioSyncRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("appId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("categoryTags")
    private java.util.List<CategoryTags> categoryTags;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("customPrompt")
    private String customPrompt;

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
    private java.util.List<String> resultTypes;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("serviceInspection")
    private ServiceInspection serviceInspection;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("stream")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean stream;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("templateIds")
    private java.util.List<String> templateIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("transcription")
    private Transcription transcription;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("variables")
    private java.util.List<Variables> variables;

    private AnalyzeAudioSyncRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.workspaceId = builder.workspaceId;
        this.appId = builder.appId;
        this.categoryTags = builder.categoryTags;
        this.customPrompt = builder.customPrompt;
        this.fields = builder.fields;
        this.modelCode = builder.modelCode;
        this.responseFormatType = builder.responseFormatType;
        this.resultTypes = builder.resultTypes;
        this.serviceInspection = builder.serviceInspection;
        this.stream = builder.stream;
        this.templateIds = builder.templateIds;
        this.transcription = builder.transcription;
        this.variables = builder.variables;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AnalyzeAudioSyncRequest create() {
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
    public java.util.List<String> getTemplateIds() {
        return this.templateIds;
    }

    /**
     * @return transcription
     */
    public Transcription getTranscription() {
        return this.transcription;
    }

    /**
     * @return variables
     */
    public java.util.List<Variables> getVariables() {
        return this.variables;
    }

    public static final class Builder extends Request.Builder<AnalyzeAudioSyncRequest, Builder> {
        private String regionId; 
        private String workspaceId; 
        private String appId; 
        private java.util.List<CategoryTags> categoryTags; 
        private String customPrompt; 
        private java.util.List<Fields> fields; 
        private String modelCode; 
        private String responseFormatType; 
        private java.util.List<String> resultTypes; 
        private ServiceInspection serviceInspection; 
        private Boolean stream; 
        private java.util.List<String> templateIds; 
        private Transcription transcription; 
        private java.util.List<Variables> variables; 

        private Builder() {
            super();
        } 

        private Builder(AnalyzeAudioSyncRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.workspaceId = request.workspaceId;
            this.appId = request.appId;
            this.categoryTags = request.categoryTags;
            this.customPrompt = request.customPrompt;
            this.fields = request.fields;
            this.modelCode = request.modelCode;
            this.responseFormatType = request.responseFormatType;
            this.resultTypes = request.resultTypes;
            this.serviceInspection = request.serviceInspection;
            this.stream = request.stream;
            this.templateIds = request.templateIds;
            this.transcription = request.transcription;
            this.variables = request.variables;
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
         * <p>a070a49c681f4a95a0f0*********35c</p>
         */
        public Builder appId(String appId) {
            this.putPathParameter("appId", appId);
            this.appId = appId;
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
         * resultTypes.
         */
        public Builder resultTypes(java.util.List<String> resultTypes) {
            this.putBodyParameter("resultTypes", resultTypes);
            this.resultTypes = resultTypes;
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
         * templateIds.
         */
        public Builder templateIds(java.util.List<String> templateIds) {
            this.putBodyParameter("templateIds", templateIds);
            this.templateIds = templateIds;
            return this;
        }

        /**
         * transcription.
         */
        public Builder transcription(Transcription transcription) {
            this.putBodyParameter("transcription", transcription);
            this.transcription = transcription;
            return this;
        }

        /**
         * variables.
         */
        public Builder variables(java.util.List<Variables> variables) {
            this.putBodyParameter("variables", variables);
            this.variables = variables;
            return this;
        }

        @Override
        public AnalyzeAudioSyncRequest build() {
            return new AnalyzeAudioSyncRequest(this);
        } 

    } 

    /**
     * 
     * {@link AnalyzeAudioSyncRequest} extends {@link TeaModel}
     *
     * <p>AnalyzeAudioSyncRequest</p>
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
     * {@link AnalyzeAudioSyncRequest} extends {@link TeaModel}
     *
     * <p>AnalyzeAudioSyncRequest</p>
     */
    public static class EnumValues extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("desc")
        private String desc;

        @com.aliyun.core.annotation.NameInMap("enumValue")
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
    /**
     * 
     * {@link AnalyzeAudioSyncRequest} extends {@link TeaModel}
     *
     * <p>AnalyzeAudioSyncRequest</p>
     */
    public static class Fields extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("desc")
        private String desc;

        @com.aliyun.core.annotation.NameInMap("enumValues")
        private java.util.List<EnumValues> enumValues;

        @com.aliyun.core.annotation.NameInMap("name")
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
             * desc.
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
    /**
     * 
     * {@link AnalyzeAudioSyncRequest} extends {@link TeaModel}
     *
     * <p>AnalyzeAudioSyncRequest</p>
     */
    public static class InspectionContents extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("title")
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
    /**
     * 
     * {@link AnalyzeAudioSyncRequest} extends {@link TeaModel}
     *
     * <p>AnalyzeAudioSyncRequest</p>
     */
    public static class ServiceInspection extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("inspectionContents")
        private java.util.List<InspectionContents> inspectionContents;

        @com.aliyun.core.annotation.NameInMap("inspectionIntroduction")
        private String inspectionIntroduction;

        @com.aliyun.core.annotation.NameInMap("sceneIntroduction")
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
             * inspectionContents.
             */
            public Builder inspectionContents(java.util.List<InspectionContents> inspectionContents) {
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
    /**
     * 
     * {@link AnalyzeAudioSyncRequest} extends {@link TeaModel}
     *
     * <p>AnalyzeAudioSyncRequest</p>
     */
    public static class Transcription extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("asrModelCode")
        private String asrModelCode;

        @com.aliyun.core.annotation.NameInMap("autoSplit")
        private Integer autoSplit;

        @com.aliyun.core.annotation.NameInMap("clientChannel")
        private Integer clientChannel;

        @com.aliyun.core.annotation.NameInMap("fileName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("level")
        private String level;

        @com.aliyun.core.annotation.NameInMap("serviceChannel")
        private Integer serviceChannel;

        @com.aliyun.core.annotation.NameInMap("serviceChannelKeywords")
        private java.util.List<String> serviceChannelKeywords;

        @com.aliyun.core.annotation.NameInMap("vocabularyId")
        private String vocabularyId;

        @com.aliyun.core.annotation.NameInMap("voiceFileUrl")
        @com.aliyun.core.annotation.Validation(required = true)
        private String voiceFileUrl;

        private Transcription(Builder builder) {
            this.asrModelCode = builder.asrModelCode;
            this.autoSplit = builder.autoSplit;
            this.clientChannel = builder.clientChannel;
            this.fileName = builder.fileName;
            this.level = builder.level;
            this.serviceChannel = builder.serviceChannel;
            this.serviceChannelKeywords = builder.serviceChannelKeywords;
            this.vocabularyId = builder.vocabularyId;
            this.voiceFileUrl = builder.voiceFileUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Transcription create() {
            return builder().build();
        }

        /**
         * @return asrModelCode
         */
        public String getAsrModelCode() {
            return this.asrModelCode;
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
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        /**
         * @return level
         */
        public String getLevel() {
            return this.level;
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
        public java.util.List<String> getServiceChannelKeywords() {
            return this.serviceChannelKeywords;
        }

        /**
         * @return vocabularyId
         */
        public String getVocabularyId() {
            return this.vocabularyId;
        }

        /**
         * @return voiceFileUrl
         */
        public String getVoiceFileUrl() {
            return this.voiceFileUrl;
        }

        public static final class Builder {
            private String asrModelCode; 
            private Integer autoSplit; 
            private Integer clientChannel; 
            private String fileName; 
            private String level; 
            private Integer serviceChannel; 
            private java.util.List<String> serviceChannelKeywords; 
            private String vocabularyId; 
            private String voiceFileUrl; 

            private Builder() {
            } 

            private Builder(Transcription model) {
                this.asrModelCode = model.asrModelCode;
                this.autoSplit = model.autoSplit;
                this.clientChannel = model.clientChannel;
                this.fileName = model.fileName;
                this.level = model.level;
                this.serviceChannel = model.serviceChannel;
                this.serviceChannelKeywords = model.serviceChannelKeywords;
                this.vocabularyId = model.vocabularyId;
                this.voiceFileUrl = model.voiceFileUrl;
            } 

            /**
             * asrModelCode.
             */
            public Builder asrModelCode(String asrModelCode) {
                this.asrModelCode = asrModelCode;
                return this;
            }

            /**
             * autoSplit.
             */
            public Builder autoSplit(Integer autoSplit) {
                this.autoSplit = autoSplit;
                return this;
            }

            /**
             * clientChannel.
             */
            public Builder clientChannel(Integer clientChannel) {
                this.clientChannel = clientChannel;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>sss.mp3</p>
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * level.
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * serviceChannel.
             */
            public Builder serviceChannel(Integer serviceChannel) {
                this.serviceChannel = serviceChannel;
                return this;
            }

            /**
             * serviceChannelKeywords.
             */
            public Builder serviceChannelKeywords(java.util.List<String> serviceChannelKeywords) {
                this.serviceChannelKeywords = serviceChannelKeywords;
                return this;
            }

            /**
             * vocabularyId.
             */
            public Builder vocabularyId(String vocabularyId) {
                this.vocabularyId = vocabularyId;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://1111.com/sss.mp3">http://1111.com/sss.mp3</a></p>
             */
            public Builder voiceFileUrl(String voiceFileUrl) {
                this.voiceFileUrl = voiceFileUrl;
                return this;
            }

            public Transcription build() {
                return new Transcription(this);
            } 

        } 

    }
    /**
     * 
     * {@link AnalyzeAudioSyncRequest} extends {@link TeaModel}
     *
     * <p>AnalyzeAudioSyncRequest</p>
     */
    public static class Variables extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("variableCode")
        private String variableCode;

        @com.aliyun.core.annotation.NameInMap("variableValue")
        private String variableValue;

        private Variables(Builder builder) {
            this.variableCode = builder.variableCode;
            this.variableValue = builder.variableValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Variables create() {
            return builder().build();
        }

        /**
         * @return variableCode
         */
        public String getVariableCode() {
            return this.variableCode;
        }

        /**
         * @return variableValue
         */
        public String getVariableValue() {
            return this.variableValue;
        }

        public static final class Builder {
            private String variableCode; 
            private String variableValue; 

            private Builder() {
            } 

            private Builder(Variables model) {
                this.variableCode = model.variableCode;
                this.variableValue = model.variableValue;
            } 

            /**
             * variableCode.
             */
            public Builder variableCode(String variableCode) {
                this.variableCode = variableCode;
                return this;
            }

            /**
             * variableValue.
             */
            public Builder variableValue(String variableValue) {
                this.variableValue = variableValue;
                return this;
            }

            public Variables build() {
                return new Variables(this);
            } 

        } 

    }
}
