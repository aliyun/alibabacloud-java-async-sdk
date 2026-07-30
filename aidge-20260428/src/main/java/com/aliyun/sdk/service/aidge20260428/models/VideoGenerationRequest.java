// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aidge20260428.models;

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
 * {@link VideoGenerationRequest} extends {@link RequestModel}
 *
 * <p>VideoGenerationRequest</p>
 */
public class VideoGenerationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Input")
    @com.aliyun.core.annotation.Validation(required = true)
    private Input input;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Intent")
    private Intent intent;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Output")
    @com.aliyun.core.annotation.Validation(required = true)
    private Output output;

    private VideoGenerationRequest(Builder builder) {
        super(builder);
        this.input = builder.input;
        this.intent = builder.intent;
        this.output = builder.output;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static VideoGenerationRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return input
     */
    public Input getInput() {
        return this.input;
    }

    /**
     * @return intent
     */
    public Intent getIntent() {
        return this.intent;
    }

    /**
     * @return output
     */
    public Output getOutput() {
        return this.output;
    }

    public static final class Builder extends Request.Builder<VideoGenerationRequest, Builder> {
        private Input input; 
        private Intent intent; 
        private Output output; 

        private Builder() {
            super();
        } 

        private Builder(VideoGenerationRequest request) {
            super(request);
            this.input = request.input;
            this.intent = request.intent;
            this.output = request.output;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder input(Input input) {
            String inputShrink = shrink(input, "Input", "json");
            this.putQueryParameter("Input", inputShrink);
            this.input = input;
            return this;
        }

        /**
         * Intent.
         */
        public Builder intent(Intent intent) {
            String intentShrink = shrink(intent, "Intent", "json");
            this.putQueryParameter("Intent", intentShrink);
            this.intent = intent;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder output(Output output) {
            String outputShrink = shrink(output, "Output", "json");
            this.putQueryParameter("Output", outputShrink);
            this.output = output;
            return this;
        }

        @Override
        public VideoGenerationRequest build() {
            return new VideoGenerationRequest(this);
        } 

    } 

    /**
     * 
     * {@link VideoGenerationRequest} extends {@link TeaModel}
     *
     * <p>VideoGenerationRequest</p>
     */
    public static class Input extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Extra")
        private java.util.Map<String, ?> extra;

        @com.aliyun.core.annotation.NameInMap("Images")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<String> images;

        @com.aliyun.core.annotation.NameInMap("Title")
        @com.aliyun.core.annotation.Validation(required = true)
        private String title;

        private Input(Builder builder) {
            this.extra = builder.extra;
            this.images = builder.images;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Input create() {
            return builder().build();
        }

        /**
         * @return extra
         */
        public java.util.Map<String, ?> getExtra() {
            return this.extra;
        }

        /**
         * @return images
         */
        public java.util.List<String> getImages() {
            return this.images;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private java.util.Map<String, ?> extra; 
            private java.util.List<String> images; 
            private String title; 

            private Builder() {
            } 

            private Builder(Input model) {
                this.extra = model.extra;
                this.images = model.images;
                this.title = model.title;
            } 

            /**
             * Extra.
             */
            public Builder extra(java.util.Map<String, ?> extra) {
                this.extra = extra;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder images(java.util.List<String> images) {
                this.images = images;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>2026 New Slimming Women&quot;s Summer Dress with Mid-Length Design, High-Quality Waist Definition for a Slender Look</p>
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public Input build() {
                return new Input(this);
            } 

        } 

    }
    /**
     * 
     * {@link VideoGenerationRequest} extends {@link TeaModel}
     *
     * <p>VideoGenerationRequest</p>
     */
    public static class Intent extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Channel")
        private String channel;

        @com.aliyun.core.annotation.NameInMap("Goal")
        private String goal;

        private Intent(Builder builder) {
            this.channel = builder.channel;
            this.goal = builder.goal;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Intent create() {
            return builder().build();
        }

        /**
         * @return channel
         */
        public String getChannel() {
            return this.channel;
        }

        /**
         * @return goal
         */
        public String getGoal() {
            return this.goal;
        }

        public static final class Builder {
            private String channel; 
            private String goal; 

            private Builder() {
            } 

            private Builder(Intent model) {
                this.channel = model.channel;
                this.goal = model.goal;
            } 

            /**
             * Channel.
             */
            public Builder channel(String channel) {
                this.channel = channel;
                return this;
            }

            /**
             * Goal.
             */
            public Builder goal(String goal) {
                this.goal = goal;
                return this;
            }

            public Intent build() {
                return new Intent(this);
            } 

        } 

    }
    /**
     * 
     * {@link VideoGenerationRequest} extends {@link TeaModel}
     *
     * <p>VideoGenerationRequest</p>
     */
    public static class Output extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Duration")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long duration;

        @com.aliyun.core.annotation.NameInMap("Quality")
        @com.aliyun.core.annotation.Validation(required = true)
        private String quality;

        @com.aliyun.core.annotation.NameInMap("Ratio")
        private String ratio;

        private Output(Builder builder) {
            this.duration = builder.duration;
            this.quality = builder.quality;
            this.ratio = builder.ratio;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Output create() {
            return builder().build();
        }

        /**
         * @return duration
         */
        public Long getDuration() {
            return this.duration;
        }

        /**
         * @return quality
         */
        public String getQuality() {
            return this.quality;
        }

        /**
         * @return ratio
         */
        public String getRatio() {
            return this.ratio;
        }

        public static final class Builder {
            private Long duration; 
            private String quality; 
            private String ratio; 

            private Builder() {
            } 

            private Builder(Output model) {
                this.duration = model.duration;
                this.quality = model.quality;
                this.ratio = model.ratio;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder duration(Long duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1080p</p>
             */
            public Builder quality(String quality) {
                this.quality = quality;
                return this;
            }

            /**
             * Ratio.
             */
            public Builder ratio(String ratio) {
                this.ratio = ratio;
                return this;
            }

            public Output build() {
                return new Output(this);
            } 

        } 

    }
}
