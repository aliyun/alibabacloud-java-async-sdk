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
 * {@link CreateVideoSummarizationTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateVideoSummarizationTaskRequest</p>
 */
public class CreateVideoSummarizationTaskRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspace_name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceName;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("service_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("input")
    private Input input;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("output")
    private Output output;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("parameters")
    private java.util.Map<String, ?> parameters;

    private CreateVideoSummarizationTaskRequest(Builder builder) {
        super(builder);
        this.workspaceName = builder.workspaceName;
        this.serviceId = builder.serviceId;
        this.input = builder.input;
        this.output = builder.output;
        this.parameters = builder.parameters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateVideoSummarizationTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspaceName
     */
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    /**
     * @return serviceId
     */
    public String getServiceId() {
        return this.serviceId;
    }

    /**
     * @return input
     */
    public Input getInput() {
        return this.input;
    }

    /**
     * @return output
     */
    public Output getOutput() {
        return this.output;
    }

    /**
     * @return parameters
     */
    public java.util.Map<String, ?> getParameters() {
        return this.parameters;
    }

    public static final class Builder extends Request.Builder<CreateVideoSummarizationTaskRequest, Builder> {
        private String workspaceName; 
        private String serviceId; 
        private Input input; 
        private Output output; 
        private java.util.Map<String, ?> parameters; 

        private Builder() {
            super();
        } 

        private Builder(CreateVideoSummarizationTaskRequest request) {
            super(request);
            this.workspaceName = request.workspaceName;
            this.serviceId = request.serviceId;
            this.input = request.input;
            this.output = request.output;
            this.parameters = request.parameters;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder workspaceName(String workspaceName) {
            this.putPathParameter("workspace_name", workspaceName);
            this.workspaceName = workspaceName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder serviceId(String serviceId) {
            this.putPathParameter("service_id", serviceId);
            this.serviceId = serviceId;
            return this;
        }

        /**
         * input.
         */
        public Builder input(Input input) {
            this.putBodyParameter("input", input);
            this.input = input;
            return this;
        }

        /**
         * output.
         */
        public Builder output(Output output) {
            this.putBodyParameter("output", output);
            this.output = output;
            return this;
        }

        /**
         * parameters.
         */
        public Builder parameters(java.util.Map<String, ?> parameters) {
            this.putBodyParameter("parameters", parameters);
            this.parameters = parameters;
            return this;
        }

        @Override
        public CreateVideoSummarizationTaskRequest build() {
            return new CreateVideoSummarizationTaskRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateVideoSummarizationTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateVideoSummarizationTaskRequest</p>
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
     * {@link CreateVideoSummarizationTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateVideoSummarizationTaskRequest</p>
     */
    public static class Chunks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("end_time")
        private Float endTime;

        @com.aliyun.core.annotation.NameInMap("snapshots")
        private java.util.List<Snapshots> snapshots;

        @com.aliyun.core.annotation.NameInMap("start_time")
        private Float startTime;

        @com.aliyun.core.annotation.NameInMap("transcript")
        private String transcript;

        private Chunks(Builder builder) {
            this.endTime = builder.endTime;
            this.snapshots = builder.snapshots;
            this.startTime = builder.startTime;
            this.transcript = builder.transcript;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Chunks create() {
            return builder().build();
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
            private Float endTime; 
            private java.util.List<Snapshots> snapshots; 
            private Float startTime; 
            private String transcript; 

            private Builder() {
            } 

            private Builder(Chunks model) {
                this.endTime = model.endTime;
                this.snapshots = model.snapshots;
                this.startTime = model.startTime;
                this.transcript = model.transcript;
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

            public Chunks build() {
                return new Chunks(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateVideoSummarizationTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateVideoSummarizationTaskRequest</p>
     */
    public static class Input extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("chunks")
        private java.util.List<Chunks> chunks;

        @com.aliyun.core.annotation.NameInMap("file_name")
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("oss")
        private String oss;

        @com.aliyun.core.annotation.NameInMap("url")
        private String url;

        private Input(Builder builder) {
            this.chunks = builder.chunks;
            this.fileName = builder.fileName;
            this.oss = builder.oss;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Input create() {
            return builder().build();
        }

        /**
         * @return chunks
         */
        public java.util.List<Chunks> getChunks() {
            return this.chunks;
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        /**
         * @return oss
         */
        public String getOss() {
            return this.oss;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private java.util.List<Chunks> chunks; 
            private String fileName; 
            private String oss; 
            private String url; 

            private Builder() {
            } 

            private Builder(Input model) {
                this.chunks = model.chunks;
                this.fileName = model.fileName;
                this.oss = model.oss;
                this.url = model.url;
            } 

            /**
             * chunks.
             */
            public Builder chunks(java.util.List<Chunks> chunks) {
                this.chunks = chunks;
                return this;
            }

            /**
             * file_name.
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * oss.
             */
            public Builder oss(String oss) {
                this.oss = oss;
                return this;
            }

            /**
             * url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public Input build() {
                return new Input(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateVideoSummarizationTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateVideoSummarizationTaskRequest</p>
     */
    public static class Output extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("oss")
        private String oss;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private Output(Builder builder) {
            this.oss = builder.oss;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Output create() {
            return builder().build();
        }

        /**
         * @return oss
         */
        public String getOss() {
            return this.oss;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String oss; 
            private String type; 

            private Builder() {
            } 

            private Builder(Output model) {
                this.oss = model.oss;
                this.type = model.type;
            } 

            /**
             * oss.
             */
            public Builder oss(String oss) {
                this.oss = oss;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Output build() {
                return new Output(this);
            } 

        } 

    }
}
