// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tingwu20230930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetTaskInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetTaskInfoResponseBody</p>
 */
public class GetTaskInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetTaskInfoResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTaskInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetTaskInfoResponseBody build() {
            return new GetTaskInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetTaskInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetTaskInfoResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutoChapters")
        private String autoChapters;

        @com.aliyun.core.annotation.NameInMap("CustomPrompt")
        private String customPrompt;

        @com.aliyun.core.annotation.NameInMap("MeetingAssistance")
        private String meetingAssistance;

        @com.aliyun.core.annotation.NameInMap("PptExtraction")
        private String pptExtraction;

        @com.aliyun.core.annotation.NameInMap("ServiceInspection")
        private String serviceInspection;

        @com.aliyun.core.annotation.NameInMap("Summarization")
        private String summarization;

        @com.aliyun.core.annotation.NameInMap("TextPolish")
        private String textPolish;

        @com.aliyun.core.annotation.NameInMap("Transcription")
        private String transcription;

        @com.aliyun.core.annotation.NameInMap("Translation")
        private String translation;

        private Result(Builder builder) {
            this.autoChapters = builder.autoChapters;
            this.customPrompt = builder.customPrompt;
            this.meetingAssistance = builder.meetingAssistance;
            this.pptExtraction = builder.pptExtraction;
            this.serviceInspection = builder.serviceInspection;
            this.summarization = builder.summarization;
            this.textPolish = builder.textPolish;
            this.transcription = builder.transcription;
            this.translation = builder.translation;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return autoChapters
         */
        public String getAutoChapters() {
            return this.autoChapters;
        }

        /**
         * @return customPrompt
         */
        public String getCustomPrompt() {
            return this.customPrompt;
        }

        /**
         * @return meetingAssistance
         */
        public String getMeetingAssistance() {
            return this.meetingAssistance;
        }

        /**
         * @return pptExtraction
         */
        public String getPptExtraction() {
            return this.pptExtraction;
        }

        /**
         * @return serviceInspection
         */
        public String getServiceInspection() {
            return this.serviceInspection;
        }

        /**
         * @return summarization
         */
        public String getSummarization() {
            return this.summarization;
        }

        /**
         * @return textPolish
         */
        public String getTextPolish() {
            return this.textPolish;
        }

        /**
         * @return transcription
         */
        public String getTranscription() {
            return this.transcription;
        }

        /**
         * @return translation
         */
        public String getTranslation() {
            return this.translation;
        }

        public static final class Builder {
            private String autoChapters; 
            private String customPrompt; 
            private String meetingAssistance; 
            private String pptExtraction; 
            private String serviceInspection; 
            private String summarization; 
            private String textPolish; 
            private String transcription; 
            private String translation; 

            /**
             * AutoChapters.
             */
            public Builder autoChapters(String autoChapters) {
                this.autoChapters = autoChapters;
                return this;
            }

            /**
             * CustomPrompt.
             */
            public Builder customPrompt(String customPrompt) {
                this.customPrompt = customPrompt;
                return this;
            }

            /**
             * MeetingAssistance.
             */
            public Builder meetingAssistance(String meetingAssistance) {
                this.meetingAssistance = meetingAssistance;
                return this;
            }

            /**
             * PptExtraction.
             */
            public Builder pptExtraction(String pptExtraction) {
                this.pptExtraction = pptExtraction;
                return this;
            }

            /**
             * ServiceInspection.
             */
            public Builder serviceInspection(String serviceInspection) {
                this.serviceInspection = serviceInspection;
                return this;
            }

            /**
             * Summarization.
             */
            public Builder summarization(String summarization) {
                this.summarization = summarization;
                return this;
            }

            /**
             * TextPolish.
             */
            public Builder textPolish(String textPolish) {
                this.textPolish = textPolish;
                return this;
            }

            /**
             * Transcription.
             */
            public Builder transcription(String transcription) {
                this.transcription = transcription;
                return this;
            }

            /**
             * Translation.
             */
            public Builder translation(String translation) {
                this.translation = translation;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTaskInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetTaskInfoResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("OutputMp3Path")
        private String outputMp3Path;

        @com.aliyun.core.annotation.NameInMap("OutputMp4Path")
        private String outputMp4Path;

        @com.aliyun.core.annotation.NameInMap("OutputSpectrumPath")
        private String outputSpectrumPath;

        @com.aliyun.core.annotation.NameInMap("OutputThumbnailPath")
        private String outputThumbnailPath;

        @com.aliyun.core.annotation.NameInMap("Result")
        private Result result;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("TaskKey")
        private String taskKey;

        @com.aliyun.core.annotation.NameInMap("TaskStatus")
        private String taskStatus;

        private Data(Builder builder) {
            this.errorCode = builder.errorCode;
            this.errorMessage = builder.errorMessage;
            this.outputMp3Path = builder.outputMp3Path;
            this.outputMp4Path = builder.outputMp4Path;
            this.outputSpectrumPath = builder.outputSpectrumPath;
            this.outputThumbnailPath = builder.outputThumbnailPath;
            this.result = builder.result;
            this.taskId = builder.taskId;
            this.taskKey = builder.taskKey;
            this.taskStatus = builder.taskStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return outputMp3Path
         */
        public String getOutputMp3Path() {
            return this.outputMp3Path;
        }

        /**
         * @return outputMp4Path
         */
        public String getOutputMp4Path() {
            return this.outputMp4Path;
        }

        /**
         * @return outputSpectrumPath
         */
        public String getOutputSpectrumPath() {
            return this.outputSpectrumPath;
        }

        /**
         * @return outputThumbnailPath
         */
        public String getOutputThumbnailPath() {
            return this.outputThumbnailPath;
        }

        /**
         * @return result
         */
        public Result getResult() {
            return this.result;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return taskKey
         */
        public String getTaskKey() {
            return this.taskKey;
        }

        /**
         * @return taskStatus
         */
        public String getTaskStatus() {
            return this.taskStatus;
        }

        public static final class Builder {
            private String errorCode; 
            private String errorMessage; 
            private String outputMp3Path; 
            private String outputMp4Path; 
            private String outputSpectrumPath; 
            private String outputThumbnailPath; 
            private Result result; 
            private String taskId; 
            private String taskKey; 
            private String taskStatus; 

            /**
             * ErrorCode.
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * ErrorMessage.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * OutputMp3Path.
             */
            public Builder outputMp3Path(String outputMp3Path) {
                this.outputMp3Path = outputMp3Path;
                return this;
            }

            /**
             * OutputMp4Path.
             */
            public Builder outputMp4Path(String outputMp4Path) {
                this.outputMp4Path = outputMp4Path;
                return this;
            }

            /**
             * OutputSpectrumPath.
             */
            public Builder outputSpectrumPath(String outputSpectrumPath) {
                this.outputSpectrumPath = outputSpectrumPath;
                return this;
            }

            /**
             * OutputThumbnailPath.
             */
            public Builder outputThumbnailPath(String outputThumbnailPath) {
                this.outputThumbnailPath = outputThumbnailPath;
                return this;
            }

            /**
             * Result.
             */
            public Builder result(Result result) {
                this.result = result;
                return this;
            }

            /**
             * TaskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * TaskKey.
             */
            public Builder taskKey(String taskKey) {
                this.taskKey = taskKey;
                return this;
            }

            /**
             * TaskStatus.
             */
            public Builder taskStatus(String taskStatus) {
                this.taskStatus = taskStatus;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
