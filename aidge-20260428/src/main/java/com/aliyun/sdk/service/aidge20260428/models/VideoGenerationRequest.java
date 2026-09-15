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
         * <p>The product input.</p>
         * <p>This parameter is required.</p>
         */
        public Builder input(Input input) {
            String inputShrink = shrink(input, "Input", "json");
            this.putQueryParameter("Input", inputShrink);
            this.input = input;
            return this;
        }

        /**
         * <p>The intent parameters. Currently unavailable.</p>
         */
        public Builder intent(Intent intent) {
            String intentShrink = shrink(intent, "Intent", "json");
            this.putQueryParameter("Intent", intentShrink);
            this.intent = intent;
            return this;
        }

        /**
         * <p>The output parameters.</p>
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
    public static class AssetBindings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AssetIndex")
        private Integer assetIndex;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Slot")
        private String slot;

        private AssetBindings(Builder builder) {
            this.assetIndex = builder.assetIndex;
            this.description = builder.description;
            this.slot = builder.slot;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AssetBindings create() {
            return builder().build();
        }

        /**
         * @return assetIndex
         */
        public Integer getAssetIndex() {
            return this.assetIndex;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return slot
         */
        public String getSlot() {
            return this.slot;
        }

        public static final class Builder {
            private Integer assetIndex; 
            private String description; 
            private String slot; 

            private Builder() {
            } 

            private Builder(AssetBindings model) {
                this.assetIndex = model.assetIndex;
                this.description = model.description;
                this.slot = model.slot;
            } 

            /**
             * <p>The asset index.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder assetIndex(Integer assetIndex) {
                this.assetIndex = assetIndex;
                return this;
            }

            /**
             * <p>The asset description.</p>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li></li>
             * </ul>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The asset usage.</p>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li></li>
             * </ul>
             */
            public Builder slot(String slot) {
                this.slot = slot;
                return this;
            }

            public AssetBindings build() {
                return new AssetBindings(this);
            } 

        } 

    }
    /**
     * 
     * {@link VideoGenerationRequest} extends {@link TeaModel}
     *
     * <p>VideoGenerationRequest</p>
     */
    public static class Input extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AssetBindings")
        private java.util.List<AssetBindings> assetBindings;

        @com.aliyun.core.annotation.NameInMap("Extra")
        private java.util.Map<String, ?> extra;

        @com.aliyun.core.annotation.NameInMap("Images")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<String> images;

        @com.aliyun.core.annotation.NameInMap("Title")
        @com.aliyun.core.annotation.Validation(required = true)
        private String title;

        private Input(Builder builder) {
            this.assetBindings = builder.assetBindings;
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
         * @return assetBindings
         */
        public java.util.List<AssetBindings> getAssetBindings() {
            return this.assetBindings;
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
            private java.util.List<AssetBindings> assetBindings; 
            private java.util.Map<String, ?> extra; 
            private java.util.List<String> images; 
            private String title; 

            private Builder() {
            } 

            private Builder(Input model) {
                this.assetBindings = model.assetBindings;
                this.extra = model.extra;
                this.images = model.images;
                this.title = model.title;
            } 

            /**
             * <p>The asset binding list.</p>
             */
            public Builder assetBindings(java.util.List<AssetBindings> assetBindings) {
                this.assetBindings = assetBindings;
                return this;
            }

            /**
             * <p>The extended information.</p>
             */
            public Builder extra(java.util.Map<String, ?> extra) {
                this.extra = extra;
                return this;
            }

            /**
             * <p>The list of product image URLs (1 to 6 images). The URLs must be publicly accessible.</p>
             * <p>This parameter is required.</p>
             */
            public Builder images(java.util.List<String> images) {
                this.images = images;
                return this;
            }

            /**
             * <p>The product title. A maximum of the first 60 characters are used.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>2026 New Slimming Women\&quot;s Summer Dress with Mid-Length Design, High-Quality Waist Definition for a Slender Look</p>
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

        @com.aliyun.core.annotation.NameInMap("Script")
        private String script;

        private Intent(Builder builder) {
            this.channel = builder.channel;
            this.goal = builder.goal;
            this.script = builder.script;
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

        /**
         * @return script
         */
        public String getScript() {
            return this.script;
        }

        public static final class Builder {
            private String channel; 
            private String goal; 
            private String script; 

            private Builder() {
            } 

            private Builder(Intent model) {
                this.channel = model.channel;
                this.goal = model.goal;
                this.script = model.script;
            } 

            /**
             * <p>The distribution channel.</p>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li></li>
             * </ul>
             */
            public Builder channel(String channel) {
                this.channel = channel;
                return this;
            }

            /**
             * <p>The business goal. Valid values:</p>
             * <p>camera_motion: Camera movement mode. Generates video based on fixed 360° camera movement logic.</p>
             * <p>scripted_video: Scripted mode. Provides a script or prompt, and the system generates video based on the script.</p>
             * <p>auto_video: Unscripted mode. No script is provided. The system automatically plans the script and then generates the video.</p>
             * 
             * <strong>example:</strong>
             * <p>auto_video</p>
             */
            public Builder goal(String goal) {
                this.goal = goal;
                return this;
            }

            /**
             * <p>The script or prompt.</p>
             * 
             * <strong>example:</strong>
             * <p>【2. Shot Breakdown】<br>[0-1s]【Eye-level close-up, static camera】Summer commute trousers folded on a clean tabletop; one corner is quickly unfolded to reveal the solid-color fabric and crisp crease line. The frame focuses on the trouser leg\&quot;s surface smoothness and sharp appearance. [BGM/SFX: Upbeat, crisp commute-vibe background music begins]</p>
             * <p>[1-2s]【Low-angle mid-shot, static camera】The full pair of trousers hangs freely in the air with a slight swing, showcasing the natural drape of the lightweight fabric and the complete straight-leg silhouette, then returns to a still, hanging state.</p>
             * <p>[2-3s]【Eye-level mid-shot, static camera】A commute-styled model stands in a fitting area, holding the folded trousers at waist level with both hands, performing one up-and-down sizing gesture before holding them steady, displaying the overall proportions of the trousers in their folded state and the expected fit. [[Voiceover]: Who says wearing trousers in summer has to be stuffy? Most likely you just haven\&quot;t picked the right pair.]</p>
             * <p>[3-5s]【Eye-level full shot, slight pullback】The commute-styled model, now wearing the trousers paired with a clean commute top, takes two steps forward in a modern office building corridor, dynamically showcasing the front straight-leg silhouette, trouser leg lines, and commute outfit coordination.</p>
             * <p>[5-7s]【Low-angle mid-shot, static camera】The commute-styled model shifts to an angled side stance, one hand in the front pocket and the other in the back pocket, displaying the cut from waist and hip down to the knee, the solid-color surface, and the clean lateral lines.</p>
             * <p>[7-9s]【Eye-level mid-shot, static camera】The commute-styled model lifts one foot onto a low step, one hand brushes down the lower-leg trouser fabric and lightly lifts the hem, briefly exposing the ankle, showcasing the hem edge, side-seam details, and the wearing state during movement. [[Voiceover]: These ice-skin trousers are lightweight and breathable, solid-color straight-leg — looking sharp and at ease even when walking around at work.]</p>
             * <p>[9-11s]【Overhead close-up, static camera】The lens focuses closely on the waistband area; the commute-styled model presses both hands along the waistband contour and smooths it, then pauses to display the seams and actual wearing state, clearly presenting the waistband shape and structural details.</p>
             * <p>[11-13s]【Eye-level close-up, static camera】The commute-styled model gently lifts the fabric on both sides of the thigh with both hands, then raises one knee with a slight lateral turn before returning to a natural stance, demonstrating the actual range of motion during knee-lift and side-turn, as well as how the straight-leg trouser recovers after the foot lands.</p>
             * <p>[13-15s]【Eye-level close-up, static camera】The commute-styled model enters the frame from the rear side, places one hand in the back pocket, then lightly traces along the back pocket edge and rear waist seam, showcasing the back pocket contour, pocket opening edge, and rear waist seam details up close. [[Voiceover]: If you\&quot;re always on the move, there\&quot;s room for knee lifts and side turns — commuting just got easier.]</p>
             * <p>[15-17s]【Eye-level mid-shot, static camera】The commute-styled model faces away to display the rear silhouette of the trousers, hands naturally in pockets with a slight weight shift, then turns slightly to an angled side view so both the rear and lateral trouser lines are visible, fully presenting the rear cut and the overall line from hip and thigh down to the hem.</p>
             * <p>[17-19s]【Eye-level full shot, smooth follow】The commute-styled model first walks sideways to the right, then transitions into a forward stride to complete the full presentation, finishing in the modern office building corridor in full commute attire, clearly showing the front straight-leg silhouette, clean lines, and overall fit. [[Voiceover]: If you like this fit, go check out the details.]</p>
             * <p>【3. Negative/Constraint Instructions】<br>The entire video centers on the summer commute trousers; no unrelated products or multi-person interactions are allowed.</p>
             */
            public Builder script(String script) {
                this.script = script;
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
             * <p>The video duration in seconds. Currently supports integers between 5 and 15. More options will be available in the future.</p>
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
             * <p>The output resolution.</p>
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
             * <p>The video aspect ratio.</p>
             * 
             * <strong>example:</strong>
             * <p>9:16</p>
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
