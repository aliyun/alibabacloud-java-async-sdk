// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tingwu20230930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTaskInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetTaskInfoResponseBody</p>
 */
public class GetTaskInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
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

    public static class Result extends TeaModel {
        @NameInMap("AutoChapters")
        private String autoChapters;

        @NameInMap("MeetingAssistance")
        private String meetingAssistance;

        @NameInMap("PptExtraction")
        private String pptExtraction;

        @NameInMap("Summarization")
        private String summarization;

        @NameInMap("Transcription")
        private String transcription;

        @NameInMap("Translation")
        private String translation;

        private Result(Builder builder) {
            this.autoChapters = builder.autoChapters;
            this.meetingAssistance = builder.meetingAssistance;
            this.pptExtraction = builder.pptExtraction;
            this.summarization = builder.summarization;
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
         * @return summarization
         */
        public String getSummarization() {
            return this.summarization;
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
            private String meetingAssistance; 
            private String pptExtraction; 
            private String summarization; 
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
             * Summarization.
             */
            public Builder summarization(String summarization) {
                this.summarization = summarization;
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
    public static class Data extends TeaModel {
        @NameInMap("Result")
        private Result result;

        @NameInMap("TaskId")
        private String taskId;

        @NameInMap("TaskKey")
        private String taskKey;

        @NameInMap("TaskStatus")
        private String taskStatus;

        private Data(Builder builder) {
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
            private Result result; 
            private String taskId; 
            private String taskKey; 
            private String taskStatus; 

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
