// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.intelligentcreation20240313.models;

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
 * {@link CreateTrainTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateTrainTaskRequest</p>
 */
public class CreateTrainTaskRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("aliyunMainId")
    private String aliyunMainId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("resSpecType")
    private String resSpecType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("taskType")
    private String taskType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("useScene")
    private String useScene;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("voiceGender")
    private String voiceGender;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("voiceLanguage")
    private String voiceLanguage;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("voiceName")
    private String voiceName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("voicePath")
    private String voicePath;

    private CreateTrainTaskRequest(Builder builder) {
        super(builder);
        this.aliyunMainId = builder.aliyunMainId;
        this.resSpecType = builder.resSpecType;
        this.taskType = builder.taskType;
        this.useScene = builder.useScene;
        this.voiceGender = builder.voiceGender;
        this.voiceLanguage = builder.voiceLanguage;
        this.voiceName = builder.voiceName;
        this.voicePath = builder.voicePath;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTrainTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aliyunMainId
     */
    public String getAliyunMainId() {
        return this.aliyunMainId;
    }

    /**
     * @return resSpecType
     */
    public String getResSpecType() {
        return this.resSpecType;
    }

    /**
     * @return taskType
     */
    public String getTaskType() {
        return this.taskType;
    }

    /**
     * @return useScene
     */
    public String getUseScene() {
        return this.useScene;
    }

    /**
     * @return voiceGender
     */
    public String getVoiceGender() {
        return this.voiceGender;
    }

    /**
     * @return voiceLanguage
     */
    public String getVoiceLanguage() {
        return this.voiceLanguage;
    }

    /**
     * @return voiceName
     */
    public String getVoiceName() {
        return this.voiceName;
    }

    /**
     * @return voicePath
     */
    public String getVoicePath() {
        return this.voicePath;
    }

    public static final class Builder extends Request.Builder<CreateTrainTaskRequest, Builder> {
        private String aliyunMainId; 
        private String resSpecType; 
        private String taskType; 
        private String useScene; 
        private String voiceGender; 
        private String voiceLanguage; 
        private String voiceName; 
        private String voicePath; 

        private Builder() {
            super();
        } 

        private Builder(CreateTrainTaskRequest request) {
            super(request);
            this.aliyunMainId = request.aliyunMainId;
            this.resSpecType = request.resSpecType;
            this.taskType = request.taskType;
            this.useScene = request.useScene;
            this.voiceGender = request.voiceGender;
            this.voiceLanguage = request.voiceLanguage;
            this.voiceName = request.voiceName;
            this.voicePath = request.voicePath;
        } 

        /**
         * aliyunMainId.
         */
        public Builder aliyunMainId(String aliyunMainId) {
            this.putBodyParameter("aliyunMainId", aliyunMainId);
            this.aliyunMainId = aliyunMainId;
            return this;
        }

        /**
         * resSpecType.
         */
        public Builder resSpecType(String resSpecType) {
            this.putBodyParameter("resSpecType", resSpecType);
            this.resSpecType = resSpecType;
            return this;
        }

        /**
         * taskType.
         */
        public Builder taskType(String taskType) {
            this.putBodyParameter("taskType", taskType);
            this.taskType = taskType;
            return this;
        }

        /**
         * useScene.
         */
        public Builder useScene(String useScene) {
            this.putBodyParameter("useScene", useScene);
            this.useScene = useScene;
            return this;
        }

        /**
         * voiceGender.
         */
        public Builder voiceGender(String voiceGender) {
            this.putBodyParameter("voiceGender", voiceGender);
            this.voiceGender = voiceGender;
            return this;
        }

        /**
         * voiceLanguage.
         */
        public Builder voiceLanguage(String voiceLanguage) {
            this.putBodyParameter("voiceLanguage", voiceLanguage);
            this.voiceLanguage = voiceLanguage;
            return this;
        }

        /**
         * voiceName.
         */
        public Builder voiceName(String voiceName) {
            this.putBodyParameter("voiceName", voiceName);
            this.voiceName = voiceName;
            return this;
        }

        /**
         * voicePath.
         */
        public Builder voicePath(String voicePath) {
            this.putBodyParameter("voicePath", voicePath);
            this.voicePath = voicePath;
            return this;
        }

        @Override
        public CreateTrainTaskRequest build() {
            return new CreateTrainTaskRequest(this);
        } 

    } 

}
