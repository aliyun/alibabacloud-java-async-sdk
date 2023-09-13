// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitSnapshotJobRequest} extends {@link RequestModel}
 *
 * <p>SubmitSnapshotJobRequest</p>
 */
public class SubmitSnapshotJobRequest extends Request {
    @Query
    @NameInMap("Input")
    @Validation(required = true)
    private Input input;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("Output")
    @Validation(required = true)
    private Output output;

    @Query
    @NameInMap("ScheduleConfig")
    private ScheduleConfig scheduleConfig;

    @Query
    @NameInMap("TemplateConfig")
    @Validation(required = true)
    private TemplateConfig templateConfig;

    @Query
    @NameInMap("UserData")
    private String userData;

    private SubmitSnapshotJobRequest(Builder builder) {
        super(builder);
        this.input = builder.input;
        this.name = builder.name;
        this.output = builder.output;
        this.scheduleConfig = builder.scheduleConfig;
        this.templateConfig = builder.templateConfig;
        this.userData = builder.userData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitSnapshotJobRequest create() {
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
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return output
     */
    public Output getOutput() {
        return this.output;
    }

    /**
     * @return scheduleConfig
     */
    public ScheduleConfig getScheduleConfig() {
        return this.scheduleConfig;
    }

    /**
     * @return templateConfig
     */
    public TemplateConfig getTemplateConfig() {
        return this.templateConfig;
    }

    /**
     * @return userData
     */
    public String getUserData() {
        return this.userData;
    }

    public static final class Builder extends Request.Builder<SubmitSnapshotJobRequest, Builder> {
        private Input input; 
        private String name; 
        private Output output; 
        private ScheduleConfig scheduleConfig; 
        private TemplateConfig templateConfig; 
        private String userData; 

        private Builder() {
            super();
        } 

        private Builder(SubmitSnapshotJobRequest request) {
            super(request);
            this.input = request.input;
            this.name = request.name;
            this.output = request.output;
            this.scheduleConfig = request.scheduleConfig;
            this.templateConfig = request.templateConfig;
            this.userData = request.userData;
        } 

        /**
         * Input.
         */
        public Builder input(Input input) {
            String inputShrink = shrink(input, "Input", "json");
            this.putQueryParameter("Input", inputShrink);
            this.input = input;
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
         * Output.
         */
        public Builder output(Output output) {
            String outputShrink = shrink(output, "Output", "json");
            this.putQueryParameter("Output", outputShrink);
            this.output = output;
            return this;
        }

        /**
         * ScheduleConfig.
         */
        public Builder scheduleConfig(ScheduleConfig scheduleConfig) {
            String scheduleConfigShrink = shrink(scheduleConfig, "ScheduleConfig", "json");
            this.putQueryParameter("ScheduleConfig", scheduleConfigShrink);
            this.scheduleConfig = scheduleConfig;
            return this;
        }

        /**
         * TemplateConfig.
         */
        public Builder templateConfig(TemplateConfig templateConfig) {
            String templateConfigShrink = shrink(templateConfig, "TemplateConfig", "json");
            this.putQueryParameter("TemplateConfig", templateConfigShrink);
            this.templateConfig = templateConfig;
            return this;
        }

        /**
         * UserData.
         */
        public Builder userData(String userData) {
            this.putQueryParameter("UserData", userData);
            this.userData = userData;
            return this;
        }

        @Override
        public SubmitSnapshotJobRequest build() {
            return new SubmitSnapshotJobRequest(this);
        } 

    } 

    public static class Input extends TeaModel {
        @NameInMap("Media")
        @Validation(required = true)
        private String media;

        @NameInMap("Type")
        @Validation(required = true)
        private String type;

        private Input(Builder builder) {
            this.media = builder.media;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Input create() {
            return builder().build();
        }

        /**
         * @return media
         */
        public String getMedia() {
            return this.media;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String media; 
            private String type; 

            /**
             * Media.
             */
            public Builder media(String media) {
                this.media = media;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Input build() {
                return new Input(this);
            } 

        } 

    }
    public static class Output extends TeaModel {
        @NameInMap("Media")
        @Validation(required = true)
        private String media;

        @NameInMap("Type")
        @Validation(required = true)
        private String type;

        private Output(Builder builder) {
            this.media = builder.media;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Output create() {
            return builder().build();
        }

        /**
         * @return media
         */
        public String getMedia() {
            return this.media;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String media; 
            private String type; 

            /**
             * Media.
             */
            public Builder media(String media) {
                this.media = media;
                return this;
            }

            /**
             * Type.
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
    public static class ScheduleConfig extends TeaModel {
        @NameInMap("PipelineId")
        private String pipelineId;

        private ScheduleConfig(Builder builder) {
            this.pipelineId = builder.pipelineId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScheduleConfig create() {
            return builder().build();
        }

        /**
         * @return pipelineId
         */
        public String getPipelineId() {
            return this.pipelineId;
        }

        public static final class Builder {
            private String pipelineId; 

            /**
             * PipelineId.
             */
            public Builder pipelineId(String pipelineId) {
                this.pipelineId = pipelineId;
                return this;
            }

            public ScheduleConfig build() {
                return new ScheduleConfig(this);
            } 

        } 

    }
    public static class SpriteSnapshotConfig extends TeaModel {
        @NameInMap("CellHeight")
        private Integer cellHeight;

        @NameInMap("CellWidth")
        private Integer cellWidth;

        @NameInMap("Color")
        private String color;

        @NameInMap("Columns")
        private Integer columns;

        @NameInMap("Lines")
        private Integer lines;

        @NameInMap("Margin")
        private Integer margin;

        @NameInMap("Padding")
        private Integer padding;

        private SpriteSnapshotConfig(Builder builder) {
            this.cellHeight = builder.cellHeight;
            this.cellWidth = builder.cellWidth;
            this.color = builder.color;
            this.columns = builder.columns;
            this.lines = builder.lines;
            this.margin = builder.margin;
            this.padding = builder.padding;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SpriteSnapshotConfig create() {
            return builder().build();
        }

        /**
         * @return cellHeight
         */
        public Integer getCellHeight() {
            return this.cellHeight;
        }

        /**
         * @return cellWidth
         */
        public Integer getCellWidth() {
            return this.cellWidth;
        }

        /**
         * @return color
         */
        public String getColor() {
            return this.color;
        }

        /**
         * @return columns
         */
        public Integer getColumns() {
            return this.columns;
        }

        /**
         * @return lines
         */
        public Integer getLines() {
            return this.lines;
        }

        /**
         * @return margin
         */
        public Integer getMargin() {
            return this.margin;
        }

        /**
         * @return padding
         */
        public Integer getPadding() {
            return this.padding;
        }

        public static final class Builder {
            private Integer cellHeight; 
            private Integer cellWidth; 
            private String color; 
            private Integer columns; 
            private Integer lines; 
            private Integer margin; 
            private Integer padding; 

            /**
             * CellHeight.
             */
            public Builder cellHeight(Integer cellHeight) {
                this.cellHeight = cellHeight;
                return this;
            }

            /**
             * CellWidth.
             */
            public Builder cellWidth(Integer cellWidth) {
                this.cellWidth = cellWidth;
                return this;
            }

            /**
             * Color.
             */
            public Builder color(String color) {
                this.color = color;
                return this;
            }

            /**
             * Columns.
             */
            public Builder columns(Integer columns) {
                this.columns = columns;
                return this;
            }

            /**
             * Lines.
             */
            public Builder lines(Integer lines) {
                this.lines = lines;
                return this;
            }

            /**
             * Margin.
             */
            public Builder margin(Integer margin) {
                this.margin = margin;
                return this;
            }

            /**
             * Padding.
             */
            public Builder padding(Integer padding) {
                this.padding = padding;
                return this;
            }

            public SpriteSnapshotConfig build() {
                return new SpriteSnapshotConfig(this);
            } 

        } 

    }
    public static class OverwriteParams extends TeaModel {
        @NameInMap("BlackLevel")
        private Integer blackLevel;

        @NameInMap("Count")
        private Long count;

        @NameInMap("FrameType")
        private String frameType;

        @NameInMap("Height")
        private Integer height;

        @NameInMap("Interval")
        private Long interval;

        @NameInMap("IsSptFrag")
        private Boolean isSptFrag;

        @NameInMap("PixelBlackThreshold")
        private Integer pixelBlackThreshold;

        @NameInMap("SpriteSnapshotConfig")
        private SpriteSnapshotConfig spriteSnapshotConfig;

        @NameInMap("Time")
        private Long time;

        @NameInMap("Type")
        private String type;

        @NameInMap("Width")
        private Integer width;

        private OverwriteParams(Builder builder) {
            this.blackLevel = builder.blackLevel;
            this.count = builder.count;
            this.frameType = builder.frameType;
            this.height = builder.height;
            this.interval = builder.interval;
            this.isSptFrag = builder.isSptFrag;
            this.pixelBlackThreshold = builder.pixelBlackThreshold;
            this.spriteSnapshotConfig = builder.spriteSnapshotConfig;
            this.time = builder.time;
            this.type = builder.type;
            this.width = builder.width;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OverwriteParams create() {
            return builder().build();
        }

        /**
         * @return blackLevel
         */
        public Integer getBlackLevel() {
            return this.blackLevel;
        }

        /**
         * @return count
         */
        public Long getCount() {
            return this.count;
        }

        /**
         * @return frameType
         */
        public String getFrameType() {
            return this.frameType;
        }

        /**
         * @return height
         */
        public Integer getHeight() {
            return this.height;
        }

        /**
         * @return interval
         */
        public Long getInterval() {
            return this.interval;
        }

        /**
         * @return isSptFrag
         */
        public Boolean getIsSptFrag() {
            return this.isSptFrag;
        }

        /**
         * @return pixelBlackThreshold
         */
        public Integer getPixelBlackThreshold() {
            return this.pixelBlackThreshold;
        }

        /**
         * @return spriteSnapshotConfig
         */
        public SpriteSnapshotConfig getSpriteSnapshotConfig() {
            return this.spriteSnapshotConfig;
        }

        /**
         * @return time
         */
        public Long getTime() {
            return this.time;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return width
         */
        public Integer getWidth() {
            return this.width;
        }

        public static final class Builder {
            private Integer blackLevel; 
            private Long count; 
            private String frameType; 
            private Integer height; 
            private Long interval; 
            private Boolean isSptFrag; 
            private Integer pixelBlackThreshold; 
            private SpriteSnapshotConfig spriteSnapshotConfig; 
            private Long time; 
            private String type; 
            private Integer width; 

            /**
             * BlackLevel.
             */
            public Builder blackLevel(Integer blackLevel) {
                this.blackLevel = blackLevel;
                return this;
            }

            /**
             * Count.
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * FrameType.
             */
            public Builder frameType(String frameType) {
                this.frameType = frameType;
                return this;
            }

            /**
             * Height.
             */
            public Builder height(Integer height) {
                this.height = height;
                return this;
            }

            /**
             * Interval.
             */
            public Builder interval(Long interval) {
                this.interval = interval;
                return this;
            }

            /**
             * IsSptFrag.
             */
            public Builder isSptFrag(Boolean isSptFrag) {
                this.isSptFrag = isSptFrag;
                return this;
            }

            /**
             * PixelBlackThreshold.
             */
            public Builder pixelBlackThreshold(Integer pixelBlackThreshold) {
                this.pixelBlackThreshold = pixelBlackThreshold;
                return this;
            }

            /**
             * SpriteSnapshotConfig.
             */
            public Builder spriteSnapshotConfig(SpriteSnapshotConfig spriteSnapshotConfig) {
                this.spriteSnapshotConfig = spriteSnapshotConfig;
                return this;
            }

            /**
             * Time.
             */
            public Builder time(Long time) {
                this.time = time;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Width.
             */
            public Builder width(Integer width) {
                this.width = width;
                return this;
            }

            public OverwriteParams build() {
                return new OverwriteParams(this);
            } 

        } 

    }
    public static class TemplateConfig extends TeaModel {
        @NameInMap("OverwriteParams")
        private OverwriteParams overwriteParams;

        @NameInMap("TemplateId")
        @Validation(required = true)
        private String templateId;

        private TemplateConfig(Builder builder) {
            this.overwriteParams = builder.overwriteParams;
            this.templateId = builder.templateId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TemplateConfig create() {
            return builder().build();
        }

        /**
         * @return overwriteParams
         */
        public OverwriteParams getOverwriteParams() {
            return this.overwriteParams;
        }

        /**
         * @return templateId
         */
        public String getTemplateId() {
            return this.templateId;
        }

        public static final class Builder {
            private OverwriteParams overwriteParams; 
            private String templateId; 

            /**
             * OverwriteParams.
             */
            public Builder overwriteParams(OverwriteParams overwriteParams) {
                this.overwriteParams = overwriteParams;
                return this;
            }

            /**
             * TemplateId.
             */
            public Builder templateId(String templateId) {
                this.templateId = templateId;
                return this;
            }

            public TemplateConfig build() {
                return new TemplateConfig(this);
            } 

        } 

    }
}
