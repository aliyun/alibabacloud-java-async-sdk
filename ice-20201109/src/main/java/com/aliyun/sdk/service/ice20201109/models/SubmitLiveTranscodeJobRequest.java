// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link SubmitLiveTranscodeJobRequest} extends {@link RequestModel}
 *
 * <p>SubmitLiveTranscodeJobRequest</p>
 */
public class SubmitLiveTranscodeJobRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 128, minLength = 1)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartMode")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer startMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StreamInput")
    @com.aliyun.core.annotation.Validation(required = true)
    private StreamInput streamInput;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String templateId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TimedConfig")
    private TimedConfig timedConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TranscodeOutput")
    @com.aliyun.core.annotation.Validation(required = true)
    private TranscodeOutput transcodeOutput;

    private SubmitLiveTranscodeJobRequest(Builder builder) {
        super(builder);
        this.name = builder.name;
        this.startMode = builder.startMode;
        this.streamInput = builder.streamInput;
        this.templateId = builder.templateId;
        this.timedConfig = builder.timedConfig;
        this.transcodeOutput = builder.transcodeOutput;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitLiveTranscodeJobRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return startMode
     */
    public Integer getStartMode() {
        return this.startMode;
    }

    /**
     * @return streamInput
     */
    public StreamInput getStreamInput() {
        return this.streamInput;
    }

    /**
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
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

    public static final class Builder extends Request.Builder<SubmitLiveTranscodeJobRequest, Builder> {
        private String name; 
        private Integer startMode; 
        private StreamInput streamInput; 
        private String templateId; 
        private TimedConfig timedConfig; 
        private TranscodeOutput transcodeOutput; 

        private Builder() {
            super();
        } 

        private Builder(SubmitLiveTranscodeJobRequest request) {
            super(request);
            this.name = request.name;
            this.startMode = request.startMode;
            this.streamInput = request.streamInput;
            this.templateId = request.templateId;
            this.timedConfig = request.timedConfig;
            this.transcodeOutput = request.transcodeOutput;
        } 

        /**
         * <p>The name of the transcoding job.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>task1</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The start mode of the transcoding job.</p>
         * <ul>
         * <li>0: The transcoding job immediately starts.</li>
         * <li>1: The transcoding job starts at the scheduled time.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder startMode(Integer startMode) {
            this.putQueryParameter("StartMode", startMode);
            this.startMode = startMode;
            return this;
        }

        /**
         * <p>The information about the input stream.</p>
         * <p>This parameter is required.</p>
         */
        public Builder streamInput(StreamInput streamInput) {
            String streamInputShrink = shrink(streamInput, "StreamInput", "json");
            this.putQueryParameter("StreamInput", streamInputShrink);
            this.streamInput = streamInput;
            return this;
        }

        /**
         * <p>The template ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>96e8864746a0b6f3</strong></strong></p>
         */
        public Builder templateId(String templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        /**
         * <p>The configuration of a timed transcoding job. This parameter is required if you set StartMode to 1.</p>
         */
        public Builder timedConfig(TimedConfig timedConfig) {
            String timedConfigShrink = shrink(timedConfig, "TimedConfig", "json");
            this.putQueryParameter("TimedConfig", timedConfigShrink);
            this.timedConfig = timedConfig;
            return this;
        }

        /**
         * <p>The information about the transcoding output.</p>
         * <p>This parameter is required.</p>
         */
        public Builder transcodeOutput(TranscodeOutput transcodeOutput) {
            String transcodeOutputShrink = shrink(transcodeOutput, "TranscodeOutput", "json");
            this.putQueryParameter("TranscodeOutput", transcodeOutputShrink);
            this.transcodeOutput = transcodeOutput;
            return this;
        }

        @Override
        public SubmitLiveTranscodeJobRequest build() {
            return new SubmitLiveTranscodeJobRequest(this);
        } 

    } 

    /**
     * 
     * {@link SubmitLiveTranscodeJobRequest} extends {@link TeaModel}
     *
     * <p>SubmitLiveTranscodeJobRequest</p>
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
     * {@link SubmitLiveTranscodeJobRequest} extends {@link TeaModel}
     *
     * <p>SubmitLiveTranscodeJobRequest</p>
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
             * <p>2022-07-20T08:20:32Z</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The start time of the transcoding job. Note: The time span between the start time and the current time cannot exceed seven days.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-02-21T00:00:00Z</p>
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
     * {@link SubmitLiveTranscodeJobRequest} extends {@link TeaModel}
     *
     * <p>SubmitLiveTranscodeJobRequest</p>
     */
    public static class TranscodeOutput extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DomainName")
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
