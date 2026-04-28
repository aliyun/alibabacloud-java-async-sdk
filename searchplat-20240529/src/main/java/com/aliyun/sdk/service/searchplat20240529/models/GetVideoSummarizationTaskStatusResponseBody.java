// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchplat20240529.models;

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
 * {@link GetVideoSummarizationTaskStatusResponseBody} extends {@link TeaModel}
 *
 * <p>GetVideoSummarizationTaskStatusResponseBody</p>
 */
public class GetVideoSummarizationTaskStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("latency")
    private Integer latency;

    @com.aliyun.core.annotation.NameInMap("request_id")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private Result result;

    @com.aliyun.core.annotation.NameInMap("usage")
    private Usage usage;

    private GetVideoSummarizationTaskStatusResponseBody(Builder builder) {
        this.latency = builder.latency;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.usage = builder.usage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetVideoSummarizationTaskStatusResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return latency
     */
    public Integer getLatency() {
        return this.latency;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    /**
     * @return usage
     */
    public Usage getUsage() {
        return this.usage;
    }

    public static final class Builder {
        private Integer latency; 
        private String requestId; 
        private Result result; 
        private Usage usage; 

        private Builder() {
        } 

        private Builder(GetVideoSummarizationTaskStatusResponseBody model) {
            this.latency = model.latency;
            this.requestId = model.requestId;
            this.result = model.result;
            this.usage = model.usage;
        } 

        /**
         * latency.
         */
        public Builder latency(Integer latency) {
            this.latency = latency;
            return this;
        }

        /**
         * request_id.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * result.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        /**
         * usage.
         */
        public Builder usage(Usage usage) {
            this.usage = usage;
            return this;
        }

        public GetVideoSummarizationTaskStatusResponseBody build() {
            return new GetVideoSummarizationTaskStatusResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetVideoSummarizationTaskStatusResponseBody} extends {@link TeaModel}
     *
     * <p>GetVideoSummarizationTaskStatusResponseBody</p>
     */
    public static class Metadata extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("summary")
        private String summary;

        @com.aliyun.core.annotation.NameInMap("tags")
        private java.util.List<String> tags;

        @com.aliyun.core.annotation.NameInMap("title")
        private String title;

        private Metadata(Builder builder) {
            this.summary = builder.summary;
            this.tags = builder.tags;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Metadata create() {
            return builder().build();
        }

        /**
         * @return summary
         */
        public String getSummary() {
            return this.summary;
        }

        /**
         * @return tags
         */
        public java.util.List<String> getTags() {
            return this.tags;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String summary; 
            private java.util.List<String> tags; 
            private String title; 

            private Builder() {
            } 

            private Builder(Metadata model) {
                this.summary = model.summary;
                this.tags = model.tags;
                this.title = model.title;
            } 

            /**
             * summary.
             */
            public Builder summary(String summary) {
                this.summary = summary;
                return this;
            }

            /**
             * tags.
             */
            public Builder tags(java.util.List<String> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public Metadata build() {
                return new Metadata(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetVideoSummarizationTaskStatusResponseBody} extends {@link TeaModel}
     *
     * <p>GetVideoSummarizationTaskStatusResponseBody</p>
     */
    public static class Chunks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("enhanced_transcript")
        private String enhancedTranscript;

        @com.aliyun.core.annotation.NameInMap("index")
        private Integer index;

        @com.aliyun.core.annotation.NameInMap("metadata")
        private Metadata metadata;

        private Chunks(Builder builder) {
            this.enhancedTranscript = builder.enhancedTranscript;
            this.index = builder.index;
            this.metadata = builder.metadata;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Chunks create() {
            return builder().build();
        }

        /**
         * @return enhancedTranscript
         */
        public String getEnhancedTranscript() {
            return this.enhancedTranscript;
        }

        /**
         * @return index
         */
        public Integer getIndex() {
            return this.index;
        }

        /**
         * @return metadata
         */
        public Metadata getMetadata() {
            return this.metadata;
        }

        public static final class Builder {
            private String enhancedTranscript; 
            private Integer index; 
            private Metadata metadata; 

            private Builder() {
            } 

            private Builder(Chunks model) {
                this.enhancedTranscript = model.enhancedTranscript;
                this.index = model.index;
                this.metadata = model.metadata;
            } 

            /**
             * enhanced_transcript.
             */
            public Builder enhancedTranscript(String enhancedTranscript) {
                this.enhancedTranscript = enhancedTranscript;
                return this;
            }

            /**
             * index.
             */
            public Builder index(Integer index) {
                this.index = index;
                return this;
            }

            /**
             * metadata.
             */
            public Builder metadata(Metadata metadata) {
                this.metadata = metadata;
                return this;
            }

            public Chunks build() {
                return new Chunks(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetVideoSummarizationTaskStatusResponseBody} extends {@link TeaModel}
     *
     * <p>GetVideoSummarizationTaskStatusResponseBody</p>
     */
    public static class VideoMetadata extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("summary")
        private String summary;

        @com.aliyun.core.annotation.NameInMap("tags")
        private java.util.List<String> tags;

        @com.aliyun.core.annotation.NameInMap("title")
        private String title;

        private VideoMetadata(Builder builder) {
            this.summary = builder.summary;
            this.tags = builder.tags;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VideoMetadata create() {
            return builder().build();
        }

        /**
         * @return summary
         */
        public String getSummary() {
            return this.summary;
        }

        /**
         * @return tags
         */
        public java.util.List<String> getTags() {
            return this.tags;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String summary; 
            private java.util.List<String> tags; 
            private String title; 

            private Builder() {
            } 

            private Builder(VideoMetadata model) {
                this.summary = model.summary;
                this.tags = model.tags;
                this.title = model.title;
            } 

            /**
             * summary.
             */
            public Builder summary(String summary) {
                this.summary = summary;
                return this;
            }

            /**
             * tags.
             */
            public Builder tags(java.util.List<String> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public VideoMetadata build() {
                return new VideoMetadata(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetVideoSummarizationTaskStatusResponseBody} extends {@link TeaModel}
     *
     * <p>GetVideoSummarizationTaskStatusResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("chunks")
        private java.util.List<Chunks> chunks;

        @com.aliyun.core.annotation.NameInMap("video_metadata")
        private VideoMetadata videoMetadata;

        private Data(Builder builder) {
            this.chunks = builder.chunks;
            this.videoMetadata = builder.videoMetadata;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return chunks
         */
        public java.util.List<Chunks> getChunks() {
            return this.chunks;
        }

        /**
         * @return videoMetadata
         */
        public VideoMetadata getVideoMetadata() {
            return this.videoMetadata;
        }

        public static final class Builder {
            private java.util.List<Chunks> chunks; 
            private VideoMetadata videoMetadata; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.chunks = model.chunks;
                this.videoMetadata = model.videoMetadata;
            } 

            /**
             * chunks.
             */
            public Builder chunks(java.util.List<Chunks> chunks) {
                this.chunks = chunks;
                return this;
            }

            /**
             * video_metadata.
             */
            public Builder videoMetadata(VideoMetadata videoMetadata) {
                this.videoMetadata = videoMetadata;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetVideoSummarizationTaskStatusResponseBody} extends {@link TeaModel}
     *
     * <p>GetVideoSummarizationTaskStatusResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("data")
        private Data data;

        @com.aliyun.core.annotation.NameInMap("error")
        private String error;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("task_id")
        private String taskId;

        private Result(Builder builder) {
            this.data = builder.data;
            this.error = builder.error;
            this.status = builder.status;
            this.taskId = builder.taskId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public Data getData() {
            return this.data;
        }

        /**
         * @return error
         */
        public String getError() {
            return this.error;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        public static final class Builder {
            private Data data; 
            private String error; 
            private String status; 
            private String taskId; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.data = model.data;
                this.error = model.error;
                this.status = model.status;
                this.taskId = model.taskId;
            } 

            /**
             * data.
             */
            public Builder data(Data data) {
                this.data = data;
                return this;
            }

            /**
             * error.
             */
            public Builder error(String error) {
                this.error = error;
                return this;
            }

            /**
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * task_id.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetVideoSummarizationTaskStatusResponseBody} extends {@link TeaModel}
     *
     * <p>GetVideoSummarizationTaskStatusResponseBody</p>
     */
    public static class Usage extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("audio_token")
        private Long audioToken;

        @com.aliyun.core.annotation.NameInMap("image_token")
        private Long imageToken;

        @com.aliyun.core.annotation.NameInMap("input_token")
        private Long inputToken;

        @com.aliyun.core.annotation.NameInMap("output_token")
        private Long outputToken;

        private Usage(Builder builder) {
            this.audioToken = builder.audioToken;
            this.imageToken = builder.imageToken;
            this.inputToken = builder.inputToken;
            this.outputToken = builder.outputToken;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Usage create() {
            return builder().build();
        }

        /**
         * @return audioToken
         */
        public Long getAudioToken() {
            return this.audioToken;
        }

        /**
         * @return imageToken
         */
        public Long getImageToken() {
            return this.imageToken;
        }

        /**
         * @return inputToken
         */
        public Long getInputToken() {
            return this.inputToken;
        }

        /**
         * @return outputToken
         */
        public Long getOutputToken() {
            return this.outputToken;
        }

        public static final class Builder {
            private Long audioToken; 
            private Long imageToken; 
            private Long inputToken; 
            private Long outputToken; 

            private Builder() {
            } 

            private Builder(Usage model) {
                this.audioToken = model.audioToken;
                this.imageToken = model.imageToken;
                this.inputToken = model.inputToken;
                this.outputToken = model.outputToken;
            } 

            /**
             * audio_token.
             */
            public Builder audioToken(Long audioToken) {
                this.audioToken = audioToken;
                return this;
            }

            /**
             * image_token.
             */
            public Builder imageToken(Long imageToken) {
                this.imageToken = imageToken;
                return this;
            }

            /**
             * input_token.
             */
            public Builder inputToken(Long inputToken) {
                this.inputToken = inputToken;
                return this;
            }

            /**
             * output_token.
             */
            public Builder outputToken(Long outputToken) {
                this.outputToken = outputToken;
                return this;
            }

            public Usage build() {
                return new Usage(this);
            } 

        } 

    }
}
