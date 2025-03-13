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
 * {@link BatchGetTrainTaskResponseBody} extends {@link TeaModel}
 *
 * <p>BatchGetTrainTaskResponseBody</p>
 */
public class BatchGetTrainTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("voiceList")
    private java.util.List<VoiceList> voiceList;

    private BatchGetTrainTaskResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.voiceList = builder.voiceList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchGetTrainTaskResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return voiceList
     */
    public java.util.List<VoiceList> getVoiceList() {
        return this.voiceList;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<VoiceList> voiceList; 

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * voiceList.
         */
        public Builder voiceList(java.util.List<VoiceList> voiceList) {
            this.voiceList = voiceList;
            return this;
        }

        public BatchGetTrainTaskResponseBody build() {
            return new BatchGetTrainTaskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link BatchGetTrainTaskResponseBody} extends {@link TeaModel}
     *
     * <p>BatchGetTrainTaskResponseBody</p>
     */
    public static class VoiceMaterial extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("voiceId")
        private Long voiceId;

        @com.aliyun.core.annotation.NameInMap("voiceLanguage")
        private String voiceLanguage;

        @com.aliyun.core.annotation.NameInMap("voiceUrl")
        private String voiceUrl;

        private VoiceMaterial(Builder builder) {
            this.voiceId = builder.voiceId;
            this.voiceLanguage = builder.voiceLanguage;
            this.voiceUrl = builder.voiceUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VoiceMaterial create() {
            return builder().build();
        }

        /**
         * @return voiceId
         */
        public Long getVoiceId() {
            return this.voiceId;
        }

        /**
         * @return voiceLanguage
         */
        public String getVoiceLanguage() {
            return this.voiceLanguage;
        }

        /**
         * @return voiceUrl
         */
        public String getVoiceUrl() {
            return this.voiceUrl;
        }

        public static final class Builder {
            private Long voiceId; 
            private String voiceLanguage; 
            private String voiceUrl; 

            /**
             * voiceId.
             */
            public Builder voiceId(Long voiceId) {
                this.voiceId = voiceId;
                return this;
            }

            /**
             * voiceLanguage.
             */
            public Builder voiceLanguage(String voiceLanguage) {
                this.voiceLanguage = voiceLanguage;
                return this;
            }

            /**
             * voiceUrl.
             */
            public Builder voiceUrl(String voiceUrl) {
                this.voiceUrl = voiceUrl;
                return this;
            }

            public VoiceMaterial build() {
                return new VoiceMaterial(this);
            } 

        } 

    }
    /**
     * 
     * {@link BatchGetTrainTaskResponseBody} extends {@link TeaModel}
     *
     * <p>BatchGetTrainTaskResponseBody</p>
     */
    public static class VoiceList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("aliyunSubId")
        private String aliyunSubId;

        @com.aliyun.core.annotation.NameInMap("auditFailMessage")
        private String auditFailMessage;

        @com.aliyun.core.annotation.NameInMap("auditStatus")
        private String auditStatus;

        @com.aliyun.core.annotation.NameInMap("createTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("gender")
        private String gender;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("resSpecType")
        private String resSpecType;

        @com.aliyun.core.annotation.NameInMap("taskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("taskType")
        private String taskType;

        @com.aliyun.core.annotation.NameInMap("trainFailMessage")
        private String trainFailMessage;

        @com.aliyun.core.annotation.NameInMap("trainStatus")
        private String trainStatus;

        @com.aliyun.core.annotation.NameInMap("useScene")
        private String useScene;

        @com.aliyun.core.annotation.NameInMap("voiceMaterial")
        private VoiceMaterial voiceMaterial;

        private VoiceList(Builder builder) {
            this.aliyunSubId = builder.aliyunSubId;
            this.auditFailMessage = builder.auditFailMessage;
            this.auditStatus = builder.auditStatus;
            this.createTime = builder.createTime;
            this.gender = builder.gender;
            this.name = builder.name;
            this.resSpecType = builder.resSpecType;
            this.taskId = builder.taskId;
            this.taskType = builder.taskType;
            this.trainFailMessage = builder.trainFailMessage;
            this.trainStatus = builder.trainStatus;
            this.useScene = builder.useScene;
            this.voiceMaterial = builder.voiceMaterial;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VoiceList create() {
            return builder().build();
        }

        /**
         * @return aliyunSubId
         */
        public String getAliyunSubId() {
            return this.aliyunSubId;
        }

        /**
         * @return auditFailMessage
         */
        public String getAuditFailMessage() {
            return this.auditFailMessage;
        }

        /**
         * @return auditStatus
         */
        public String getAuditStatus() {
            return this.auditStatus;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return gender
         */
        public String getGender() {
            return this.gender;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return resSpecType
         */
        public String getResSpecType() {
            return this.resSpecType;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return taskType
         */
        public String getTaskType() {
            return this.taskType;
        }

        /**
         * @return trainFailMessage
         */
        public String getTrainFailMessage() {
            return this.trainFailMessage;
        }

        /**
         * @return trainStatus
         */
        public String getTrainStatus() {
            return this.trainStatus;
        }

        /**
         * @return useScene
         */
        public String getUseScene() {
            return this.useScene;
        }

        /**
         * @return voiceMaterial
         */
        public VoiceMaterial getVoiceMaterial() {
            return this.voiceMaterial;
        }

        public static final class Builder {
            private String aliyunSubId; 
            private String auditFailMessage; 
            private String auditStatus; 
            private String createTime; 
            private String gender; 
            private String name; 
            private String resSpecType; 
            private String taskId; 
            private String taskType; 
            private String trainFailMessage; 
            private String trainStatus; 
            private String useScene; 
            private VoiceMaterial voiceMaterial; 

            /**
             * aliyunSubId.
             */
            public Builder aliyunSubId(String aliyunSubId) {
                this.aliyunSubId = aliyunSubId;
                return this;
            }

            /**
             * auditFailMessage.
             */
            public Builder auditFailMessage(String auditFailMessage) {
                this.auditFailMessage = auditFailMessage;
                return this;
            }

            /**
             * auditStatus.
             */
            public Builder auditStatus(String auditStatus) {
                this.auditStatus = auditStatus;
                return this;
            }

            /**
             * createTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * gender.
             */
            public Builder gender(String gender) {
                this.gender = gender;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * resSpecType.
             */
            public Builder resSpecType(String resSpecType) {
                this.resSpecType = resSpecType;
                return this;
            }

            /**
             * taskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * taskType.
             */
            public Builder taskType(String taskType) {
                this.taskType = taskType;
                return this;
            }

            /**
             * trainFailMessage.
             */
            public Builder trainFailMessage(String trainFailMessage) {
                this.trainFailMessage = trainFailMessage;
                return this;
            }

            /**
             * trainStatus.
             */
            public Builder trainStatus(String trainStatus) {
                this.trainStatus = trainStatus;
                return this;
            }

            /**
             * useScene.
             */
            public Builder useScene(String useScene) {
                this.useScene = useScene;
                return this;
            }

            /**
             * voiceMaterial.
             */
            public Builder voiceMaterial(VoiceMaterial voiceMaterial) {
                this.voiceMaterial = voiceMaterial;
                return this;
            }

            public VoiceList build() {
                return new VoiceList(this);
            } 

        } 

    }
}
