// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * StartMode.
         */
        public Builder startMode(Integer startMode) {
            this.putQueryParameter("StartMode", startMode);
            this.startMode = startMode;
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
         * TemplateId.
         */
        public Builder templateId(String templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
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
        public SubmitLiveTranscodeJobRequest build() {
            return new SubmitLiveTranscodeJobRequest(this);
        } 

    } 

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
