// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rtc20180111.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link StartCloudNoteRequest} extends {@link RequestModel}
 *
 * <p>StartCloudNoteRequest</p>
 */
public class StartCloudNoteRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoChapters")
    private AutoChapters autoChapters;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChannelId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String channelId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomPrompt")
    private CustomPrompt customPrompt;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LanguageHints")
    private java.util.List < String > languageHints;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MeetingAssistance")
    private MeetingAssistance meetingAssistance;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceInspection")
    private ServiceInspection serviceInspection;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceLanguage")
    private String sourceLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StorageConfig")
    @com.aliyun.core.annotation.Validation(required = true)
    private StorageConfig storageConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Summarization")
    private Summarization summarization;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 55, minLength = 1)
    private String taskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TextPolish")
    private TextPolish textPolish;

    private StartCloudNoteRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.autoChapters = builder.autoChapters;
        this.channelId = builder.channelId;
        this.customPrompt = builder.customPrompt;
        this.languageHints = builder.languageHints;
        this.meetingAssistance = builder.meetingAssistance;
        this.serviceInspection = builder.serviceInspection;
        this.sourceLanguage = builder.sourceLanguage;
        this.storageConfig = builder.storageConfig;
        this.summarization = builder.summarization;
        this.taskId = builder.taskId;
        this.textPolish = builder.textPolish;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartCloudNoteRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return autoChapters
     */
    public AutoChapters getAutoChapters() {
        return this.autoChapters;
    }

    /**
     * @return channelId
     */
    public String getChannelId() {
        return this.channelId;
    }

    /**
     * @return customPrompt
     */
    public CustomPrompt getCustomPrompt() {
        return this.customPrompt;
    }

    /**
     * @return languageHints
     */
    public java.util.List < String > getLanguageHints() {
        return this.languageHints;
    }

    /**
     * @return meetingAssistance
     */
    public MeetingAssistance getMeetingAssistance() {
        return this.meetingAssistance;
    }

    /**
     * @return serviceInspection
     */
    public ServiceInspection getServiceInspection() {
        return this.serviceInspection;
    }

    /**
     * @return sourceLanguage
     */
    public String getSourceLanguage() {
        return this.sourceLanguage;
    }

    /**
     * @return storageConfig
     */
    public StorageConfig getStorageConfig() {
        return this.storageConfig;
    }

    /**
     * @return summarization
     */
    public Summarization getSummarization() {
        return this.summarization;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return textPolish
     */
    public TextPolish getTextPolish() {
        return this.textPolish;
    }

    public static final class Builder extends Request.Builder<StartCloudNoteRequest, Builder> {
        private String appId; 
        private AutoChapters autoChapters; 
        private String channelId; 
        private CustomPrompt customPrompt; 
        private java.util.List < String > languageHints; 
        private MeetingAssistance meetingAssistance; 
        private ServiceInspection serviceInspection; 
        private String sourceLanguage; 
        private StorageConfig storageConfig; 
        private Summarization summarization; 
        private String taskId; 
        private TextPolish textPolish; 

        private Builder() {
            super();
        } 

        private Builder(StartCloudNoteRequest request) {
            super(request);
            this.appId = request.appId;
            this.autoChapters = request.autoChapters;
            this.channelId = request.channelId;
            this.customPrompt = request.customPrompt;
            this.languageHints = request.languageHints;
            this.meetingAssistance = request.meetingAssistance;
            this.serviceInspection = request.serviceInspection;
            this.sourceLanguage = request.sourceLanguage;
            this.storageConfig = request.storageConfig;
            this.summarization = request.summarization;
            this.taskId = request.taskId;
            this.textPolish = request.textPolish;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2ws***z3</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * AutoChapters.
         */
        public Builder autoChapters(AutoChapters autoChapters) {
            String autoChaptersShrink = shrink(autoChapters, "AutoChapters", "json");
            this.putQueryParameter("AutoChapters", autoChaptersShrink);
            this.autoChapters = autoChapters;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder channelId(String channelId) {
            this.putQueryParameter("ChannelId", channelId);
            this.channelId = channelId;
            return this;
        }

        /**
         * CustomPrompt.
         */
        public Builder customPrompt(CustomPrompt customPrompt) {
            String customPromptShrink = shrink(customPrompt, "CustomPrompt", "json");
            this.putQueryParameter("CustomPrompt", customPromptShrink);
            this.customPrompt = customPrompt;
            return this;
        }

        /**
         * LanguageHints.
         */
        public Builder languageHints(java.util.List < String > languageHints) {
            this.putQueryParameter("LanguageHints", languageHints);
            this.languageHints = languageHints;
            return this;
        }

        /**
         * MeetingAssistance.
         */
        public Builder meetingAssistance(MeetingAssistance meetingAssistance) {
            String meetingAssistanceShrink = shrink(meetingAssistance, "MeetingAssistance", "json");
            this.putQueryParameter("MeetingAssistance", meetingAssistanceShrink);
            this.meetingAssistance = meetingAssistance;
            return this;
        }

        /**
         * ServiceInspection.
         */
        public Builder serviceInspection(ServiceInspection serviceInspection) {
            String serviceInspectionShrink = shrink(serviceInspection, "ServiceInspection", "json");
            this.putQueryParameter("ServiceInspection", serviceInspectionShrink);
            this.serviceInspection = serviceInspection;
            return this;
        }

        /**
         * SourceLanguage.
         */
        public Builder sourceLanguage(String sourceLanguage) {
            this.putQueryParameter("SourceLanguage", sourceLanguage);
            this.sourceLanguage = sourceLanguage;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder storageConfig(StorageConfig storageConfig) {
            this.putQueryParameter("StorageConfig", storageConfig);
            this.storageConfig = storageConfig;
            return this;
        }

        /**
         * Summarization.
         */
        public Builder summarization(Summarization summarization) {
            String summarizationShrink = shrink(summarization, "Summarization", "json");
            this.putQueryParameter("Summarization", summarizationShrink);
            this.summarization = summarization;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rtc</p>
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        /**
         * TextPolish.
         */
        public Builder textPolish(TextPolish textPolish) {
            String textPolishShrink = shrink(textPolish, "TextPolish", "json");
            this.putQueryParameter("TextPolish", textPolishShrink);
            this.textPolish = textPolish;
            return this;
        }

        @Override
        public StartCloudNoteRequest build() {
            return new StartCloudNoteRequest(this);
        } 

    } 

    /**
     * 
     * {@link StartCloudNoteRequest} extends {@link TeaModel}
     *
     * <p>StartCloudNoteRequest</p>
     */
    public static class AutoChapters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Enabled")
        private Boolean enabled;

        private AutoChapters(Builder builder) {
            this.enabled = builder.enabled;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AutoChapters create() {
            return builder().build();
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        public static final class Builder {
            private Boolean enabled; 

            /**
             * Enabled.
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            public AutoChapters build() {
                return new AutoChapters(this);
            } 

        } 

    }
    /**
     * 
     * {@link StartCloudNoteRequest} extends {@link TeaModel}
     *
     * <p>StartCloudNoteRequest</p>
     */
    public static class CustomPromptContents extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Model")
        private String model;

        @com.aliyun.core.annotation.NameInMap("Name")
        @com.aliyun.core.annotation.Validation(required = true)
        private String name;

        @com.aliyun.core.annotation.NameInMap("Prompt")
        @com.aliyun.core.annotation.Validation(required = true)
        private String prompt;

        @com.aliyun.core.annotation.NameInMap("TransType")
        private String transType;

        private CustomPromptContents(Builder builder) {
            this.model = builder.model;
            this.name = builder.name;
            this.prompt = builder.prompt;
            this.transType = builder.transType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomPromptContents create() {
            return builder().build();
        }

        /**
         * @return model
         */
        public String getModel() {
            return this.model;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return prompt
         */
        public String getPrompt() {
            return this.prompt;
        }

        /**
         * @return transType
         */
        public String getTransType() {
            return this.transType;
        }

        public static final class Builder {
            private String model; 
            private String name; 
            private String prompt; 
            private String transType; 

            /**
             * Model.
             */
            public Builder model(String model) {
                this.model = model;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>split-summary-demo</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>请帮我将下面的对话进行总结，根据发言人来总结:\n {Transcription}</p>
             */
            public Builder prompt(String prompt) {
                this.prompt = prompt;
                return this;
            }

            /**
             * TransType.
             */
            public Builder transType(String transType) {
                this.transType = transType;
                return this;
            }

            public CustomPromptContents build() {
                return new CustomPromptContents(this);
            } 

        } 

    }
    /**
     * 
     * {@link StartCloudNoteRequest} extends {@link TeaModel}
     *
     * <p>StartCloudNoteRequest</p>
     */
    public static class CustomPrompt extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CustomPromptContents")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List < CustomPromptContents> customPromptContents;

        @com.aliyun.core.annotation.NameInMap("Enabled")
        private Boolean enabled;

        private CustomPrompt(Builder builder) {
            this.customPromptContents = builder.customPromptContents;
            this.enabled = builder.enabled;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomPrompt create() {
            return builder().build();
        }

        /**
         * @return customPromptContents
         */
        public java.util.List < CustomPromptContents> getCustomPromptContents() {
            return this.customPromptContents;
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        public static final class Builder {
            private java.util.List < CustomPromptContents> customPromptContents; 
            private Boolean enabled; 

            /**
             * <p>This parameter is required.</p>
             */
            public Builder customPromptContents(java.util.List < CustomPromptContents> customPromptContents) {
                this.customPromptContents = customPromptContents;
                return this;
            }

            /**
             * Enabled.
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            public CustomPrompt build() {
                return new CustomPrompt(this);
            } 

        } 

    }
    /**
     * 
     * {@link StartCloudNoteRequest} extends {@link TeaModel}
     *
     * <p>StartCloudNoteRequest</p>
     */
    public static class MeetingAssistance extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("MeetingAssistanceType")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List < String > meetingAssistanceType;

        private MeetingAssistance(Builder builder) {
            this.enabled = builder.enabled;
            this.meetingAssistanceType = builder.meetingAssistanceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MeetingAssistance create() {
            return builder().build();
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return meetingAssistanceType
         */
        public java.util.List < String > getMeetingAssistanceType() {
            return this.meetingAssistanceType;
        }

        public static final class Builder {
            private Boolean enabled; 
            private java.util.List < String > meetingAssistanceType; 

            /**
             * Enabled.
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder meetingAssistanceType(java.util.List < String > meetingAssistanceType) {
                this.meetingAssistanceType = meetingAssistanceType;
                return this;
            }

            public MeetingAssistance build() {
                return new MeetingAssistance(this);
            } 

        } 

    }
    /**
     * 
     * {@link StartCloudNoteRequest} extends {@link TeaModel}
     *
     * <p>StartCloudNoteRequest</p>
     */
    public static class InspectionContents extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        @com.aliyun.core.annotation.Validation(required = true)
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
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>销售在开场白的时候主动向客户打招呼进行欢迎</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>到店欢迎-欢迎语</p>
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
     * {@link StartCloudNoteRequest} extends {@link TeaModel}
     *
     * <p>StartCloudNoteRequest</p>
     */
    public static class ServiceInspection extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("InspectionContents")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List < InspectionContents> inspectionContents;

        @com.aliyun.core.annotation.NameInMap("InspectionIntroduction")
        @com.aliyun.core.annotation.Validation(required = true, maxLength = 1024)
        private String inspectionIntroduction;

        @com.aliyun.core.annotation.NameInMap("SceneIntroduction")
        @com.aliyun.core.annotation.Validation(required = true, maxLength = 1024)
        private String sceneIntroduction;

        private ServiceInspection(Builder builder) {
            this.enabled = builder.enabled;
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
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
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
            private Boolean enabled; 
            private java.util.List < InspectionContents> inspectionContents; 
            private String inspectionIntroduction; 
            private String sceneIntroduction; 

            /**
             * Enabled.
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder inspectionContents(java.util.List < InspectionContents> inspectionContents) {
                this.inspectionContents = inspectionContents;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>请监测对话中销售人员表现是否接待热情、态度良好</p>
             */
            public Builder inspectionIntroduction(String inspectionIntroduction) {
                this.inspectionIntroduction = inspectionIntroduction;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>汽车门店线下销售场景</p>
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
     * {@link StartCloudNoteRequest} extends {@link TeaModel}
     *
     * <p>StartCloudNoteRequest</p>
     */
    public static class StorageConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessKey")
        @com.aliyun.core.annotation.Validation(required = true, minLength = 1)
        private String accessKey;

        @com.aliyun.core.annotation.NameInMap("Bucket")
        @com.aliyun.core.annotation.Validation(required = true, minLength = 1)
        private String bucket;

        @com.aliyun.core.annotation.NameInMap("Region")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer region;

        @com.aliyun.core.annotation.NameInMap("SecretKey")
        @com.aliyun.core.annotation.Validation(required = true, minLength = 1)
        private String secretKey;

        @com.aliyun.core.annotation.NameInMap("Vendor")
        @com.aliyun.core.annotation.Validation(required = true, minimum = 1)
        private Integer vendor;

        private StorageConfig(Builder builder) {
            this.accessKey = builder.accessKey;
            this.bucket = builder.bucket;
            this.region = builder.region;
            this.secretKey = builder.secretKey;
            this.vendor = builder.vendor;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StorageConfig create() {
            return builder().build();
        }

        /**
         * @return accessKey
         */
        public String getAccessKey() {
            return this.accessKey;
        }

        /**
         * @return bucket
         */
        public String getBucket() {
            return this.bucket;
        }

        /**
         * @return region
         */
        public Integer getRegion() {
            return this.region;
        }

        /**
         * @return secretKey
         */
        public String getSecretKey() {
            return this.secretKey;
        }

        /**
         * @return vendor
         */
        public Integer getVendor() {
            return this.vendor;
        }

        public static final class Builder {
            private String accessKey; 
            private String bucket; 
            private Integer region; 
            private String secretKey; 
            private Integer vendor; 

            /**
             * <p>accessKey。</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>LTAX***</p>
             */
            public Builder accessKey(String accessKey) {
                this.accessKey = accessKey;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>test-bucket-for-recording</p>
             */
            public Builder bucket(String bucket) {
                this.bucket = bucket;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder region(Integer region) {
                this.region = region;
                return this;
            }

            /**
             * <p>secretKey。</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>APb6qWYEzKtYxE***</p>
             */
            public Builder secretKey(String secretKey) {
                this.secretKey = secretKey;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder vendor(Integer vendor) {
                this.vendor = vendor;
                return this;
            }

            public StorageConfig build() {
                return new StorageConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link StartCloudNoteRequest} extends {@link TeaModel}
     *
     * <p>StartCloudNoteRequest</p>
     */
    public static class Summarization extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("Type")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List < String > type;

        private Summarization(Builder builder) {
            this.enabled = builder.enabled;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Summarization create() {
            return builder().build();
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return type
         */
        public java.util.List < String > getType() {
            return this.type;
        }

        public static final class Builder {
            private Boolean enabled; 
            private java.util.List < String > type; 

            /**
             * Enabled.
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder type(java.util.List < String > type) {
                this.type = type;
                return this;
            }

            public Summarization build() {
                return new Summarization(this);
            } 

        } 

    }
    /**
     * 
     * {@link StartCloudNoteRequest} extends {@link TeaModel}
     *
     * <p>StartCloudNoteRequest</p>
     */
    public static class TextPolish extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Enabled")
        private Boolean enabled;

        private TextPolish(Builder builder) {
            this.enabled = builder.enabled;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TextPolish create() {
            return builder().build();
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        public static final class Builder {
            private Boolean enabled; 

            /**
             * Enabled.
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            public TextPolish build() {
                return new TextPolish(this);
            } 

        } 

    }
}
