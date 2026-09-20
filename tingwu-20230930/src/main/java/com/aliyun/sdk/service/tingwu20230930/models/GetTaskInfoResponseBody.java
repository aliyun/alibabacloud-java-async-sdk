// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tingwu20230930.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetTaskInfoResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The status code.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Returned object.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Status description.</p>
         * 
         * <strong>example:</strong>
         * <p>Success.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Request ID, used only for joint debugging.</p>
         * 
         * <strong>example:</strong>
         * <p>35124E1C-AE99-5D6C-A52E-BD689D8D****</p>
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

        @com.aliyun.core.annotation.NameInMap("ContentExtraction")
        private String contentExtraction;

        @com.aliyun.core.annotation.NameInMap("CustomPrompt")
        private String customPrompt;

        @com.aliyun.core.annotation.NameInMap("IdentityRecognition")
        private String identityRecognition;

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
            this.contentExtraction = builder.contentExtraction;
            this.customPrompt = builder.customPrompt;
            this.identityRecognition = builder.identityRecognition;
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
         * @return contentExtraction
         */
        public String getContentExtraction() {
            return this.contentExtraction;
        }

        /**
         * @return customPrompt
         */
        public String getCustomPrompt() {
            return this.customPrompt;
        }

        /**
         * @return identityRecognition
         */
        public String getIdentityRecognition() {
            return this.identityRecognition;
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
            private String contentExtraction; 
            private String customPrompt; 
            private String identityRecognition; 
            private String meetingAssistance; 
            private String pptExtraction; 
            private String serviceInspection; 
            private String summarization; 
            private String textPolish; 
            private String transcription; 
            private String translation; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.autoChapters = model.autoChapters;
                this.contentExtraction = model.contentExtraction;
                this.customPrompt = model.customPrompt;
                this.identityRecognition = model.identityRecognition;
                this.meetingAssistance = model.meetingAssistance;
                this.pptExtraction = model.pptExtraction;
                this.serviceInspection = model.serviceInspection;
                this.summarization = model.summarization;
                this.textPolish = model.textPolish;
                this.transcription = model.transcription;
                this.translation = model.translation;
            } 

            /**
             * <p>Link to the result of the Auto Chapters feature.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://xxxx.com/tingwu/output/1738248324/094e964bf0e04e39/094e964bf0e04e39_AutoChapters_20231222101215.json?Expires=1706064016">http://xxxx.com/tingwu/output/1738248324/094e964bf0e04e39/094e964bf0e04e39_AutoChapters_20231222101215.json?Expires=1706064016</a></p>
             */
            public Builder autoChapters(String autoChapters) {
                this.autoChapters = autoChapters;
                return this;
            }

            /**
             * <p>URL link to the result of conversation content extraction</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://xxxx.com/tingwu/output/1738248324/094e964bf0e04e39/094e964bf0e04e39">http://xxxx.com/tingwu/output/1738248324/094e964bf0e04e39/094e964bf0e04e39</a>_ ContentExtraction_20231222101215.json?Expires=1706064016</p>
             */
            public Builder contentExtraction(String contentExtraction) {
                this.contentExtraction = contentExtraction;
                return this;
            }

            /**
             * <p>Link to the result of the Custom prompt</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://xxxx.com/tingwu/output/1738248324/094e964bf0e04e39/094e964bf0e04e39">http://xxxx.com/tingwu/output/1738248324/094e964bf0e04e39/094e964bf0e04e39</a>_ CustomPrompt_20231222101215.json?Expires=1706064016</p>
             */
            public Builder customPrompt(String customPrompt) {
                this.customPrompt = customPrompt;
                return this;
            }

            /**
             * <p>The URL link to the identity recognition result.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://xxxx.com/tingwu/output/1738248324/094e964bf0e04e39/094e964bf0e04e39">http://xxxx.com/tingwu/output/1738248324/094e964bf0e04e39/094e964bf0e04e39</a>_ IdentityRecognition_20231222101215.json?Expires=1706064016</p>
             */
            public Builder identityRecognition(String identityRecognition) {
                this.identityRecognition = identityRecognition;
                return this;
            }

            /**
             * <p>URL link to the result of Intelligent Meeting Summary</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://xxxx.com/tingwu/output/1738248324/094e964bf0e04e39/094e964bf0e04e39_MeetingAssistance_20231222101112.json?Expires=1706064016">http://xxxx.com/tingwu/output/1738248324/094e964bf0e04e39/094e964bf0e04e39_MeetingAssistance_20231222101112.json?Expires=1706064016</a></p>
             */
            public Builder meetingAssistance(String meetingAssistance) {
                this.meetingAssistance = meetingAssistance;
                return this;
            }

            /**
             * <p>URL link to the result of video PPT extraction and summarization</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://xxxx.com/tingwu/output/1738248324/094e964bf0e04e39/094e964bf0e04e39_PptExtraction_20231222101215.json?Expires=1706064016">http://xxxx.com/tingwu/output/1738248324/094e964bf0e04e39/094e964bf0e04e39_PptExtraction_20231222101215.json?Expires=1706064016</a></p>
             */
            public Builder pptExtraction(String pptExtraction) {
                this.pptExtraction = pptExtraction;
                return this;
            }

            /**
             * <p>Link to the result of service inspection</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://xxxx.com/tingwu/output/1738248324/094e964bf0e04e39/094e964bf0e04e39">http://xxxx.com/tingwu/output/1738248324/094e964bf0e04e39/094e964bf0e04e39</a>_ ServiceInspection_20231222101215.json?Expires=1706064016</p>
             */
            public Builder serviceInspection(String serviceInspection) {
                this.serviceInspection = serviceInspection;
                return this;
            }

            /**
             * <p>Link to the result of LLM-based summarization.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://xxxx.com/tingwu/output/1738248324/094e964bf0e04e39/094e964bf0e04e39_Summarization_20231222101215.json?Expires=1706064016">http://xxxx.com/tingwu/output/1738248324/094e964bf0e04e39/094e964bf0e04e39_Summarization_20231222101215.json?Expires=1706064016</a></p>
             */
            public Builder summarization(String summarization) {
                this.summarization = summarization;
                return this;
            }

            /**
             * <p>Link to the result of spoken-to-written text conversion</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://xxxx.com/tingwu/output/1738248324/094e964bf0e04e39/094e964bf0e04e39_TextPolish_20231222101215.json?Expires=1706064016">http://xxxx.com/tingwu/output/1738248324/094e964bf0e04e39/094e964bf0e04e39_TextPolish_20231222101215.json?Expires=1706064016</a></p>
             */
            public Builder textPolish(String textPolish) {
                this.textPolish = textPolish;
                return this;
            }

            /**
             * <p>Link to the result of speech transcription.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://xxxx.com/tingwu/output/1738248324/094e964bf0e04e39/094e964bf0e04e39_Transcription_20231222101008.json?Expires=1706064016">http://xxxx.com/tingwu/output/1738248324/094e964bf0e04e39/094e964bf0e04e39_Transcription_20231222101008.json?Expires=1706064016</a></p>
             */
            public Builder transcription(String transcription) {
                this.transcription = transcription;
                return this;
            }

            /**
             * <p>URL link to the result of text translation</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://xxxx.com/tingwu/output/1738248324/094e964bf0e04e39/094e964bf0e04e39_Translation_20231222101215.json?Expires=1706064016">http://xxxx.com/tingwu/output/1738248324/094e964bf0e04e39/094e964bf0e04e39_Translation_20231222101215.json?Expires=1706064016</a></p>
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

            private Builder() {
            } 

            private Builder(Data model) {
                this.errorCode = model.errorCode;
                this.errorMessage = model.errorMessage;
                this.outputMp3Path = model.outputMp3Path;
                this.outputMp4Path = model.outputMp4Path;
                this.outputSpectrumPath = model.outputSpectrumPath;
                this.outputThumbnailPath = model.outputThumbnailPath;
                this.result = model.result;
                this.taskId = model.taskId;
                this.taskKey = model.taskKey;
                this.taskStatus = model.taskStatus;
            } 

            /**
             * <p>Error code</p>
             * 
             * <strong>example:</strong>
             * <p>TSC.AudioFormat</p>
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * <p>Error message</p>
             * 
             * <strong>example:</strong>
             * <p>Audio format invalid.</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>URL link to the MP3 conversion result</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://xxxx.com/tingwu/output/1738248324/094e964bf0e04e39/094e964bf0e04e39_20231222101008.mp3?Expires=1706064016">http://xxxx.com/tingwu/output/1738248324/094e964bf0e04e39/094e964bf0e04e39_20231222101008.mp3?Expires=1706064016</a></p>
             */
            public Builder outputMp3Path(String outputMp3Path) {
                this.outputMp3Path = outputMp3Path;
                return this;
            }

            /**
             * <p>URL link to the MP4 conversion result</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://xxxx.com/tingwu/output/1738248324/094e964bf0e04e39/094e964bf0e04e39_20231222101008.mp4?Expires=1706064016">http://xxxx.com/tingwu/output/1738248324/094e964bf0e04e39/094e964bf0e04e39_20231222101008.mp4?Expires=1706064016</a></p>
             */
            public Builder outputMp4Path(String outputMp4Path) {
                this.outputMp4Path = outputMp4Path;
                return this;
            }

            /**
             * <p>URL link to the audio waveform graph</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://xxxx.com/tingwu/output/1738248324/094e964bf0e04e39/094e964bf0e04e39_20231222101008.spectrum?Expires=1706064016">http://xxxx.com/tingwu/output/1738248324/094e964bf0e04e39/094e964bf0e04e39_20231222101008.spectrum?Expires=1706064016</a></p>
             */
            public Builder outputSpectrumPath(String outputSpectrumPath) {
                this.outputSpectrumPath = outputSpectrumPath;
                return this;
            }

            /**
             * <p>URL link to the video thumbnail</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://xxxx.com/tingwu/output/1738248324/094e964bf0e04e39/094e964bf0e04e39_20231222101008.png?Expires=1706064016">http://xxxx.com/tingwu/output/1738248324/094e964bf0e04e39/094e964bf0e04e39_20231222101008.png?Expires=1706064016</a></p>
             */
            public Builder outputThumbnailPath(String outputThumbnailPath) {
                this.outputThumbnailPath = outputThumbnailPath;
                return this;
            }

            /**
             * <p>A collection of results from various algorithm processing tasks. The result is returned as an HTTP link, which the user can use to parse the native result.</p>
             */
            public Builder result(Result result) {
                this.result = result;
                return this;
            }

            /**
             * <p>Job ID.</p>
             * 
             * <strong>example:</strong>
             * <p>c5394c6ee0fb474899d42215a3925c7e</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>The custom ID set by the user when creating the job.</p>
             * 
             * <strong>example:</strong>
             * <p>task_tingwu_123</p>
             */
            public Builder taskKey(String taskKey) {
                this.taskKey = taskKey;
                return this;
            }

            /**
             * <p>Task Status.</p>
             * <ul>
             * <li>ONGOING: The job is in progress.</li>
             * <li>COMPLETED: The job is completed.</li>
             * <li>FAILED: The job has failed.</li>
             * <li>INVALID: The job is invalid.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>COMPLETED</p>
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
