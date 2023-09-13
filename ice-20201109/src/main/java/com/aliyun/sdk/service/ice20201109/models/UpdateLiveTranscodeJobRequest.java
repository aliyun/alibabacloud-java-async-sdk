// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateLiveTranscodeJobRequest} extends {@link RequestModel}
 *
 * <p>UpdateLiveTranscodeJobRequest</p>
 */
public class UpdateLiveTranscodeJobRequest extends Request {
    @Query
    @NameInMap("JobId")
    @Validation(required = true)
    private String jobId;

    @Query
    @NameInMap("Name")
    @Validation(maxLength = 128, minLength = 1)
    private String name;

    @Query
    @NameInMap("StreamInput")
    private StreamInput streamInput;

    @Query
    @NameInMap("TimedConfig")
    private TimedConfig timedConfig;

    @Query
    @NameInMap("TranscodeOutput")
    private TranscodeOutput transcodeOutput;

    private UpdateLiveTranscodeJobRequest(Builder builder) {
        super(builder);
        this.jobId = builder.jobId;
        this.name = builder.name;
        this.streamInput = builder.streamInput;
        this.timedConfig = builder.timedConfig;
        this.transcodeOutput = builder.transcodeOutput;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateLiveTranscodeJobRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return streamInput
     */
    public StreamInput getStreamInput() {
        return this.streamInput;
    }

    /**
     * @return timedConfig
     */
    public TimedConfig getTimedConfig() {
        return this.timedConfig;
    }

    /**
     * @return transcodeOutput
     */
    public TranscodeOutput getTranscodeOutput() {
        return this.transcodeOutput;
    }

    public static final class Builder extends Request.Builder<UpdateLiveTranscodeJobRequest, Builder> {
        private String jobId; 
        private String name; 
        private StreamInput streamInput; 
        private TimedConfig timedConfig; 
        private TranscodeOutput transcodeOutput; 

        private Builder() {
            super();
        } 

        private Builder(UpdateLiveTranscodeJobRequest request) {
            super(request);
            this.jobId = request.jobId;
            this.name = request.name;
            this.streamInput = request.streamInput;
            this.timedConfig = request.timedConfig;
            this.transcodeOutput = request.transcodeOutput;
        } 

        /**
         * JobId.
         */
        public Builder jobId(String jobId) {
            this.putQueryParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * StreamInput.
         */
        public Builder streamInput(StreamInput streamInput) {
            String streamInputShrink = shrink(streamInput, "StreamInput", "json");
            this.putQueryParameter("StreamInput", streamInputShrink);
            this.streamInput = streamInput;
            return this;
        }

        /**
         * TimedConfig.
         */
        public Builder timedConfig(TimedConfig timedConfig) {
            String timedConfigShrink = shrink(timedConfig, "TimedConfig", "json");
            this.putQueryParameter("TimedConfig", timedConfigShrink);
            this.timedConfig = timedConfig;
            return this;
        }

        /**
         * TranscodeOutput.
         */
        public Builder transcodeOutput(TranscodeOutput transcodeOutput) {
            String transcodeOutputShrink = shrink(transcodeOutput, "TranscodeOutput", "json");
            this.putQueryParameter("TranscodeOutput", transcodeOutputShrink);
            this.transcodeOutput = transcodeOutput;
            return this;
        }

        @Override
        public UpdateLiveTranscodeJobRequest build() {
            return new UpdateLiveTranscodeJobRequest(this);
        } 

    } 

    public static class StreamInput extends TeaModel {
        @NameInMap("InputUrl")
        @Validation(required = true)
        private String inputUrl;

        @NameInMap("Type")
        @Validation(required = true)
        private String type;

        private StreamInput(Builder builder) {
            this.inputUrl = builder.inputUrl;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StreamInput create() {
            return builder().build();
        }

        /**
         * @return inputUrl
         */
        public String getInputUrl() {
            return this.inputUrl;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String inputUrl; 
            private String type; 

            /**
             * InputUrl.
             */
            public Builder inputUrl(String inputUrl) {
                this.inputUrl = inputUrl;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public StreamInput build() {
                return new StreamInput(this);
            } 

        } 

    }
    public static class TimedConfig extends TeaModel {
        @NameInMap("EndTime")
        private String endTime;

        @NameInMap("StartTime")
        private String startTime;

        private TimedConfig(Builder builder) {
            this.endTime = builder.endTime;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TimedConfig create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private String endTime; 
            private String startTime; 

            /**
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            public TimedConfig build() {
                return new TimedConfig(this);
            } 

        } 

    }
    public static class TranscodeOutput extends TeaModel {
        @NameInMap("DomainName")
        @Validation(required = true)
        private String domainName;

        @NameInMap("Type")
        @Validation(required = true)
        private String type;

        private TranscodeOutput(Builder builder) {
            this.domainName = builder.domainName;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TranscodeOutput create() {
            return builder().build();
        }

        /**
         * @return domainName
         */
        public String getDomainName() {
            return this.domainName;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String domainName; 
            private String type; 

            /**
             * DomainName.
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public TranscodeOutput build() {
                return new TranscodeOutput(this);
            } 

        } 

    }
}
