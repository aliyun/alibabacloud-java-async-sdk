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
 * {@link GetVideoSegmentationTaskStatusResponseBody} extends {@link TeaModel}
 *
 * <p>GetVideoSegmentationTaskStatusResponseBody</p>
 */
public class GetVideoSegmentationTaskStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("latency")
    private Integer latency;

    @com.aliyun.core.annotation.NameInMap("request_id")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private Result result;

    @com.aliyun.core.annotation.NameInMap("usage")
    private Usage usage;

    private GetVideoSegmentationTaskStatusResponseBody(Builder builder) {
        this.latency = builder.latency;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.usage = builder.usage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetVideoSegmentationTaskStatusResponseBody create() {
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

        private Builder(GetVideoSegmentationTaskStatusResponseBody model) {
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

        public GetVideoSegmentationTaskStatusResponseBody build() {
            return new GetVideoSegmentationTaskStatusResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetVideoSegmentationTaskStatusResponseBody} extends {@link TeaModel}
     *
     * <p>GetVideoSegmentationTaskStatusResponseBody</p>
     */
    public static class Snapshots extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("frame_index")
        private Integer frameIndex;

        @com.aliyun.core.annotation.NameInMap("frame_time")
        private Float frameTime;

        @com.aliyun.core.annotation.NameInMap("path")
        private String path;

        private Snapshots(Builder builder) {
            this.frameIndex = builder.frameIndex;
            this.frameTime = builder.frameTime;
            this.path = builder.path;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Snapshots create() {
            return builder().build();
        }

        /**
         * @return frameIndex
         */
        public Integer getFrameIndex() {
            return this.frameIndex;
        }

        /**
         * @return frameTime
         */
        public Float getFrameTime() {
            return this.frameTime;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        public static final class Builder {
            private Integer frameIndex; 
            private Float frameTime; 
            private String path; 

            private Builder() {
            } 

            private Builder(Snapshots model) {
                this.frameIndex = model.frameIndex;
                this.frameTime = model.frameTime;
                this.path = model.path;
            } 

            /**
             * frame_index.
             */
            public Builder frameIndex(Integer frameIndex) {
                this.frameIndex = frameIndex;
                return this;
            }

            /**
             * frame_time.
             */
            public Builder frameTime(Float frameTime) {
                this.frameTime = frameTime;
                return this;
            }

            /**
             * path.
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            public Snapshots build() {
                return new Snapshots(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetVideoSegmentationTaskStatusResponseBody} extends {@link TeaModel}
     *
     * <p>GetVideoSegmentationTaskStatusResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("chunk_index")
        private Integer chunkIndex;

        @com.aliyun.core.annotation.NameInMap("end_time")
        private Float endTime;

        @com.aliyun.core.annotation.NameInMap("snapshots")
        private java.util.List<Snapshots> snapshots;

        @com.aliyun.core.annotation.NameInMap("start_time")
        private Float startTime;

        @com.aliyun.core.annotation.NameInMap("transcript")
        private String transcript;

        private Data(Builder builder) {
            this.chunkIndex = builder.chunkIndex;
            this.endTime = builder.endTime;
            this.snapshots = builder.snapshots;
            this.startTime = builder.startTime;
            this.transcript = builder.transcript;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return chunkIndex
         */
        public Integer getChunkIndex() {
            return this.chunkIndex;
        }

        /**
         * @return endTime
         */
        public Float getEndTime() {
            return this.endTime;
        }

        /**
         * @return snapshots
         */
        public java.util.List<Snapshots> getSnapshots() {
            return this.snapshots;
        }

        /**
         * @return startTime
         */
        public Float getStartTime() {
            return this.startTime;
        }

        /**
         * @return transcript
         */
        public String getTranscript() {
            return this.transcript;
        }

        public static final class Builder {
            private Integer chunkIndex; 
            private Float endTime; 
            private java.util.List<Snapshots> snapshots; 
            private Float startTime; 
            private String transcript; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.chunkIndex = model.chunkIndex;
                this.endTime = model.endTime;
                this.snapshots = model.snapshots;
                this.startTime = model.startTime;
                this.transcript = model.transcript;
            } 

            /**
             * chunk_index.
             */
            public Builder chunkIndex(Integer chunkIndex) {
                this.chunkIndex = chunkIndex;
                return this;
            }

            /**
             * end_time.
             */
            public Builder endTime(Float endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * snapshots.
             */
            public Builder snapshots(java.util.List<Snapshots> snapshots) {
                this.snapshots = snapshots;
                return this;
            }

            /**
             * start_time.
             */
            public Builder startTime(Float startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * transcript.
             */
            public Builder transcript(String transcript) {
                this.transcript = transcript;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetVideoSegmentationTaskStatusResponseBody} extends {@link TeaModel}
     *
     * <p>GetVideoSegmentationTaskStatusResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("data")
        private java.util.List<Data> data;

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
        public java.util.List<Data> getData() {
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
            private java.util.List<Data> data; 
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
            public Builder data(java.util.List<Data> data) {
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
     * {@link GetVideoSegmentationTaskStatusResponseBody} extends {@link TeaModel}
     *
     * <p>GetVideoSegmentationTaskStatusResponseBody</p>
     */
    public static class Usage extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("audio_token")
        private Long audioToken;

        @com.aliyun.core.annotation.NameInMap("image_token")
        private Long imageToken;

        private Usage(Builder builder) {
            this.audioToken = builder.audioToken;
            this.imageToken = builder.imageToken;
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

        public static final class Builder {
            private Long audioToken; 
            private Long imageToken; 

            private Builder() {
            } 

            private Builder(Usage model) {
                this.audioToken = model.audioToken;
                this.imageToken = model.imageToken;
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

            public Usage build() {
                return new Usage(this);
            } 

        } 

    }
}
