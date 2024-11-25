// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateLiveTranscodeJobRequest} extends {@link RequestModel}
 *
 * <p>UpdateLiveTranscodeJobRequest</p>
 */
public class UpdateLiveTranscodeJobRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String jobId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(maxLength = 128, minLength = 1)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StreamInput")
    private StreamInput streamInput;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TimedConfig")
    private TimedConfig timedConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TranscodeOutput")
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
         * <p>The job ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>20b48fb04483915d4f2cd8ac</strong></strong></p>
         */
        public Builder jobId(String jobId) {
            this.putQueryParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        /**
         * <p>The name of the job.</p>
         * 
         * <strong>example:</strong>
         * <p>mytest3</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The information about the input stream.</p>
         */
        public Builder streamInput(StreamInput streamInput) {
            String streamInputShrink = shrink(streamInput, "StreamInput", "json");
            this.putQueryParameter("StreamInput", streamInputShrink);
            this.streamInput = streamInput;
            return this;
        }

        /**
         * <p>The configuration of a timed transcoding job.</p>
         */
        public Builder timedConfig(TimedConfig timedConfig) {
            String timedConfigShrink = shrink(timedConfig, "TimedConfig", "json");
            this.putQueryParameter("TimedConfig", timedConfigShrink);
            this.timedConfig = timedConfig;
            return this;
        }

        /**
         * <p>The information about the transcoding output.</p>
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

    /**
     * 
     * {@link UpdateLiveTranscodeJobRequest} extends {@link TeaModel}
     *
     * <p>UpdateLiveTranscodeJobRequest</p>
     */
    public static class StreamInput extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InputUrl")
        @com.aliyun.core.annotation.Validation(required = true)
        private String inputUrl;

        @com.aliyun.core.annotation.NameInMap("Type")
        @com.aliyun.core.annotation.Validation(required = true)
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
             * <p>The URL of the input stream.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>rtmp://mydomain/app/stream1</p>
             */
            public Builder inputUrl(String inputUrl) {
                this.inputUrl = inputUrl;
                return this;
            }

            /**
             * <p>The type of the input stream. The value can only be rtmp.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>rtmp</p>
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
    /**
     * 
     * {@link UpdateLiveTranscodeJobRequest} extends {@link TeaModel}
     *
     * <p>UpdateLiveTranscodeJobRequest</p>
     */
    public static class TimedConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("StartTime")
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
             * <p>The stop time of the transcoding job. Note: The time span between the stop time and the current time cannot exceed seven days.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-08-05T06:08:31Z</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The start time of the transcoding job. Note: The time span between the start time and the current time cannot exceed seven days.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-06-19T02:16:41Z</p>
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
    /**
     * 
     * {@link UpdateLiveTranscodeJobRequest} extends {@link TeaModel}
     *
     * <p>UpdateLiveTranscodeJobRequest</p>
     */
    public static class TranscodeOutput extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DomainName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String domainName;

        @com.aliyun.core.annotation.NameInMap("Type")
        @com.aliyun.core.annotation.Validation(required = true)
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
             * <p>The streaming domain name of ApsaraVideo Live.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>mydomain</p>
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * <p>The type of the output stream. A value of LiveCenter indicates that the URL of the output stream is generated based on the domain name of ApsaraVideo Live. The value can only be LiveCenter.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>LiveCenter</p>
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
