// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220302.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link VideoModerationResultResponseBody} extends {@link TeaModel}
 *
 * <p>VideoModerationResultResponseBody</p>
 */
public class VideoModerationResultResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private VideoModerationResultResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static VideoModerationResultResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer code; 
        private Data data; 
        private String message; 
        private String requestId; 

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public VideoModerationResultResponseBody build() {
            return new VideoModerationResultResponseBody(this);
        } 

    } 

    public static class AudioSummarys extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        @com.aliyun.core.annotation.NameInMap("LabelSum")
        private Integer labelSum;

        private AudioSummarys(Builder builder) {
            this.label = builder.label;
            this.labelSum = builder.labelSum;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AudioSummarys create() {
            return builder().build();
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        /**
         * @return labelSum
         */
        public Integer getLabelSum() {
            return this.labelSum;
        }

        public static final class Builder {
            private String label; 
            private Integer labelSum; 

            /**
             * Label.
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * LabelSum.
             */
            public Builder labelSum(Integer labelSum) {
                this.labelSum = labelSum;
                return this;
            }

            public AudioSummarys build() {
                return new AudioSummarys(this);
            } 

        } 

    }
    public static class SliceDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("EndTimestamp")
        private Long endTimestamp;

        @com.aliyun.core.annotation.NameInMap("Extend")
        private String extend;

        @com.aliyun.core.annotation.NameInMap("Labels")
        private String labels;

        @com.aliyun.core.annotation.NameInMap("RiskTips")
        private String riskTips;

        @com.aliyun.core.annotation.NameInMap("RiskWords")
        private String riskWords;

        @com.aliyun.core.annotation.NameInMap("Score")
        private Float score;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        @com.aliyun.core.annotation.NameInMap("StartTimestamp")
        private Long startTimestamp;

        @com.aliyun.core.annotation.NameInMap("Text")
        private String text;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private SliceDetails(Builder builder) {
            this.endTime = builder.endTime;
            this.endTimestamp = builder.endTimestamp;
            this.extend = builder.extend;
            this.labels = builder.labels;
            this.riskTips = builder.riskTips;
            this.riskWords = builder.riskWords;
            this.score = builder.score;
            this.startTime = builder.startTime;
            this.startTimestamp = builder.startTimestamp;
            this.text = builder.text;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SliceDetails create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return endTimestamp
         */
        public Long getEndTimestamp() {
            return this.endTimestamp;
        }

        /**
         * @return extend
         */
        public String getExtend() {
            return this.extend;
        }

        /**
         * @return labels
         */
        public String getLabels() {
            return this.labels;
        }

        /**
         * @return riskTips
         */
        public String getRiskTips() {
            return this.riskTips;
        }

        /**
         * @return riskWords
         */
        public String getRiskWords() {
            return this.riskWords;
        }

        /**
         * @return score
         */
        public Float getScore() {
            return this.score;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        /**
         * @return startTimestamp
         */
        public Long getStartTimestamp() {
            return this.startTimestamp;
        }

        /**
         * @return text
         */
        public String getText() {
            return this.text;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private Long endTime; 
            private Long endTimestamp; 
            private String extend; 
            private String labels; 
            private String riskTips; 
            private String riskWords; 
            private Float score; 
            private Long startTime; 
            private Long startTimestamp; 
            private String text; 
            private String url; 

            /**
             * EndTime.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * EndTimestamp.
             */
            public Builder endTimestamp(Long endTimestamp) {
                this.endTimestamp = endTimestamp;
                return this;
            }

            /**
             * Extend.
             */
            public Builder extend(String extend) {
                this.extend = extend;
                return this;
            }

            /**
             * Labels.
             */
            public Builder labels(String labels) {
                this.labels = labels;
                return this;
            }

            /**
             * RiskTips.
             */
            public Builder riskTips(String riskTips) {
                this.riskTips = riskTips;
                return this;
            }

            /**
             * RiskWords.
             */
            public Builder riskWords(String riskWords) {
                this.riskWords = riskWords;
                return this;
            }

            /**
             * Score.
             */
            public Builder score(Float score) {
                this.score = score;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * StartTimestamp.
             */
            public Builder startTimestamp(Long startTimestamp) {
                this.startTimestamp = startTimestamp;
                return this;
            }

            /**
             * Text.
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            /**
             * Url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public SliceDetails build() {
                return new SliceDetails(this);
            } 

        } 

    }
    public static class AudioResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AudioSummarys")
        private java.util.List < AudioSummarys> audioSummarys;

        @com.aliyun.core.annotation.NameInMap("SliceDetails")
        private java.util.List < SliceDetails> sliceDetails;

        private AudioResult(Builder builder) {
            this.audioSummarys = builder.audioSummarys;
            this.sliceDetails = builder.sliceDetails;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AudioResult create() {
            return builder().build();
        }

        /**
         * @return audioSummarys
         */
        public java.util.List < AudioSummarys> getAudioSummarys() {
            return this.audioSummarys;
        }

        /**
         * @return sliceDetails
         */
        public java.util.List < SliceDetails> getSliceDetails() {
            return this.sliceDetails;
        }

        public static final class Builder {
            private java.util.List < AudioSummarys> audioSummarys; 
            private java.util.List < SliceDetails> sliceDetails; 

            /**
             * AudioSummarys.
             */
            public Builder audioSummarys(java.util.List < AudioSummarys> audioSummarys) {
                this.audioSummarys = audioSummarys;
                return this;
            }

            /**
             * SliceDetails.
             */
            public Builder sliceDetails(java.util.List < SliceDetails> sliceDetails) {
                this.sliceDetails = sliceDetails;
                return this;
            }

            public AudioResult build() {
                return new AudioResult(this);
            } 

        } 

    }
    public static class FrameSummarys extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        @com.aliyun.core.annotation.NameInMap("LabelSum")
        private Integer labelSum;

        private FrameSummarys(Builder builder) {
            this.label = builder.label;
            this.labelSum = builder.labelSum;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FrameSummarys create() {
            return builder().build();
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        /**
         * @return labelSum
         */
        public Integer getLabelSum() {
            return this.labelSum;
        }

        public static final class Builder {
            private String label; 
            private Integer labelSum; 

            /**
             * Label.
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * LabelSum.
             */
            public Builder labelSum(Integer labelSum) {
                this.labelSum = labelSum;
                return this;
            }

            public FrameSummarys build() {
                return new FrameSummarys(this);
            } 

        } 

    }
    public static class CustomImage extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ImageId")
        private String imageId;

        @com.aliyun.core.annotation.NameInMap("LibId")
        private String libId;

        private CustomImage(Builder builder) {
            this.imageId = builder.imageId;
            this.libId = builder.libId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomImage create() {
            return builder().build();
        }

        /**
         * @return imageId
         */
        public String getImageId() {
            return this.imageId;
        }

        /**
         * @return libId
         */
        public String getLibId() {
            return this.libId;
        }

        public static final class Builder {
            private String imageId; 
            private String libId; 

            /**
             * ImageId.
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * LibId.
             */
            public Builder libId(String libId) {
                this.libId = libId;
                return this;
            }

            public CustomImage build() {
                return new CustomImage(this);
            } 

        } 

    }
    public static class PublicFigure extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FigureId")
        private String figureId;

        private PublicFigure(Builder builder) {
            this.figureId = builder.figureId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PublicFigure create() {
            return builder().build();
        }

        /**
         * @return figureId
         */
        public String getFigureId() {
            return this.figureId;
        }

        public static final class Builder {
            private String figureId; 

            /**
             * FigureId.
             */
            public Builder figureId(String figureId) {
                this.figureId = figureId;
                return this;
            }

            public PublicFigure build() {
                return new PublicFigure(this);
            } 

        } 

    }
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Confidence")
        private Float confidence;

        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        private Result(Builder builder) {
            this.confidence = builder.confidence;
            this.label = builder.label;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return confidence
         */
        public Float getConfidence() {
            return this.confidence;
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        public static final class Builder {
            private Float confidence; 
            private String label; 

            /**
             * Confidence.
             */
            public Builder confidence(Float confidence) {
                this.confidence = confidence;
                return this;
            }

            /**
             * Label.
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
    public static class Results extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CustomImage")
        private java.util.List < CustomImage> customImage;

        @com.aliyun.core.annotation.NameInMap("PublicFigure")
        private java.util.List < PublicFigure> publicFigure;

        @com.aliyun.core.annotation.NameInMap("Result")
        private java.util.List < Result> result;

        @com.aliyun.core.annotation.NameInMap("Service")
        private String service;

        @com.aliyun.core.annotation.NameInMap("TextInImage")
        private java.util.Map < String, ? > textInImage;

        private Results(Builder builder) {
            this.customImage = builder.customImage;
            this.publicFigure = builder.publicFigure;
            this.result = builder.result;
            this.service = builder.service;
            this.textInImage = builder.textInImage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Results create() {
            return builder().build();
        }

        /**
         * @return customImage
         */
        public java.util.List < CustomImage> getCustomImage() {
            return this.customImage;
        }

        /**
         * @return publicFigure
         */
        public java.util.List < PublicFigure> getPublicFigure() {
            return this.publicFigure;
        }

        /**
         * @return result
         */
        public java.util.List < Result> getResult() {
            return this.result;
        }

        /**
         * @return service
         */
        public String getService() {
            return this.service;
        }

        /**
         * @return textInImage
         */
        public java.util.Map < String, ? > getTextInImage() {
            return this.textInImage;
        }

        public static final class Builder {
            private java.util.List < CustomImage> customImage; 
            private java.util.List < PublicFigure> publicFigure; 
            private java.util.List < Result> result; 
            private String service; 
            private java.util.Map < String, ? > textInImage; 

            /**
             * CustomImage.
             */
            public Builder customImage(java.util.List < CustomImage> customImage) {
                this.customImage = customImage;
                return this;
            }

            /**
             * PublicFigure.
             */
            public Builder publicFigure(java.util.List < PublicFigure> publicFigure) {
                this.publicFigure = publicFigure;
                return this;
            }

            /**
             * Result.
             */
            public Builder result(java.util.List < Result> result) {
                this.result = result;
                return this;
            }

            /**
             * Service.
             */
            public Builder service(String service) {
                this.service = service;
                return this;
            }

            /**
             * TextInImage.
             */
            public Builder textInImage(java.util.Map < String, ? > textInImage) {
                this.textInImage = textInImage;
                return this;
            }

            public Results build() {
                return new Results(this);
            } 

        } 

    }
    public static class Frames extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Offset")
        private Float offset;

        @com.aliyun.core.annotation.NameInMap("Results")
        private java.util.List < Results> results;

        @com.aliyun.core.annotation.NameInMap("TempUrl")
        private String tempUrl;

        @com.aliyun.core.annotation.NameInMap("Timestamp")
        private Long timestamp;

        private Frames(Builder builder) {
            this.offset = builder.offset;
            this.results = builder.results;
            this.tempUrl = builder.tempUrl;
            this.timestamp = builder.timestamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Frames create() {
            return builder().build();
        }

        /**
         * @return offset
         */
        public Float getOffset() {
            return this.offset;
        }

        /**
         * @return results
         */
        public java.util.List < Results> getResults() {
            return this.results;
        }

        /**
         * @return tempUrl
         */
        public String getTempUrl() {
            return this.tempUrl;
        }

        /**
         * @return timestamp
         */
        public Long getTimestamp() {
            return this.timestamp;
        }

        public static final class Builder {
            private Float offset; 
            private java.util.List < Results> results; 
            private String tempUrl; 
            private Long timestamp; 

            /**
             * Offset.
             */
            public Builder offset(Float offset) {
                this.offset = offset;
                return this;
            }

            /**
             * Results.
             */
            public Builder results(java.util.List < Results> results) {
                this.results = results;
                return this;
            }

            /**
             * TempUrl.
             */
            public Builder tempUrl(String tempUrl) {
                this.tempUrl = tempUrl;
                return this;
            }

            /**
             * Timestamp.
             */
            public Builder timestamp(Long timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            public Frames build() {
                return new Frames(this);
            } 

        } 

    }
    public static class FrameResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FrameNum")
        private Integer frameNum;

        @com.aliyun.core.annotation.NameInMap("FrameSummarys")
        private java.util.List < FrameSummarys> frameSummarys;

        @com.aliyun.core.annotation.NameInMap("Frames")
        private java.util.List < Frames> frames;

        private FrameResult(Builder builder) {
            this.frameNum = builder.frameNum;
            this.frameSummarys = builder.frameSummarys;
            this.frames = builder.frames;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FrameResult create() {
            return builder().build();
        }

        /**
         * @return frameNum
         */
        public Integer getFrameNum() {
            return this.frameNum;
        }

        /**
         * @return frameSummarys
         */
        public java.util.List < FrameSummarys> getFrameSummarys() {
            return this.frameSummarys;
        }

        /**
         * @return frames
         */
        public java.util.List < Frames> getFrames() {
            return this.frames;
        }

        public static final class Builder {
            private Integer frameNum; 
            private java.util.List < FrameSummarys> frameSummarys; 
            private java.util.List < Frames> frames; 

            /**
             * FrameNum.
             */
            public Builder frameNum(Integer frameNum) {
                this.frameNum = frameNum;
                return this;
            }

            /**
             * FrameSummarys.
             */
            public Builder frameSummarys(java.util.List < FrameSummarys> frameSummarys) {
                this.frameSummarys = frameSummarys;
                return this;
            }

            /**
             * Frames.
             */
            public Builder frames(java.util.List < Frames> frames) {
                this.frames = frames;
                return this;
            }

            public FrameResult build() {
                return new FrameResult(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AudioResult")
        private AudioResult audioResult;

        @com.aliyun.core.annotation.NameInMap("DataId")
        private String dataId;

        @com.aliyun.core.annotation.NameInMap("FrameResult")
        private FrameResult frameResult;

        @com.aliyun.core.annotation.NameInMap("LiveId")
        private String liveId;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        private Data(Builder builder) {
            this.audioResult = builder.audioResult;
            this.dataId = builder.dataId;
            this.frameResult = builder.frameResult;
            this.liveId = builder.liveId;
            this.taskId = builder.taskId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return audioResult
         */
        public AudioResult getAudioResult() {
            return this.audioResult;
        }

        /**
         * @return dataId
         */
        public String getDataId() {
            return this.dataId;
        }

        /**
         * @return frameResult
         */
        public FrameResult getFrameResult() {
            return this.frameResult;
        }

        /**
         * @return liveId
         */
        public String getLiveId() {
            return this.liveId;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        public static final class Builder {
            private AudioResult audioResult; 
            private String dataId; 
            private FrameResult frameResult; 
            private String liveId; 
            private String taskId; 

            /**
             * AudioResult.
             */
            public Builder audioResult(AudioResult audioResult) {
                this.audioResult = audioResult;
                return this;
            }

            /**
             * DataId.
             */
            public Builder dataId(String dataId) {
                this.dataId = dataId;
                return this;
            }

            /**
             * FrameResult.
             */
            public Builder frameResult(FrameResult frameResult) {
                this.frameResult = frameResult;
                return this;
            }

            /**
             * LiveId.
             */
            public Builder liveId(String liveId) {
                this.liveId = liveId;
                return this;
            }

            /**
             * TaskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
