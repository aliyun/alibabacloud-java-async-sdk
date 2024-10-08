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
         * The returned HTTP status code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The data returned.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The message that is returned in response to the request.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The request ID.
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
             * Voice label.
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * The number of times that the label is matched.
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

        @com.aliyun.core.annotation.NameInMap("RiskLevel")
        private String riskLevel;

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
            this.riskLevel = builder.riskLevel;
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
         * @return riskLevel
         */
        public String getRiskLevel() {
            return this.riskLevel;
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
            private String riskLevel; 
            private String riskTips; 
            private String riskWords; 
            private Float score; 
            private Long startTime; 
            private Long startTimestamp; 
            private String text; 
            private String url; 

            /**
             * The end time of the text after voice-to-text conversion. Unit: seconds.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * The end timestamp of the segment. Unit: milliseconds.
             */
            public Builder endTimestamp(Long endTimestamp) {
                this.endTimestamp = endTimestamp;
                return this;
            }

            /**
             * A reserved parameter.
             */
            public Builder extend(String extend) {
                this.extend = extend;
                return this;
            }

            /**
             * The details of the labels.
             */
            public Builder labels(String labels) {
                this.labels = labels;
                return this;
            }

            /**
             * RiskLevel.
             */
            public Builder riskLevel(String riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            /**
             * Subcategory labels. Multiple labels are separated by commas (,).
             */
            public Builder riskTips(String riskTips) {
                this.riskTips = riskTips;
                return this;
            }

            /**
             * The risk words that are hit. Multiple words are separated by commas (,).
             */
            public Builder riskWords(String riskWords) {
                this.riskWords = riskWords;
                return this;
            }

            /**
             * Risk score, default range 0-99.
             */
            public Builder score(Float score) {
                this.score = score;
                return this;
            }

            /**
             * The start time of the text after voice-to-text conversion. Unit: seconds.
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * The start timestamp of the segment. Unit: milliseconds.
             */
            public Builder startTimestamp(Long startTimestamp) {
                this.startTimestamp = startTimestamp;
                return this;
            }

            /**
             * The text converted from voice.
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            /**
             * If the moderation object is a voice stream, this parameter indicates the temporary access URL of the voice stream to which the text entry corresponds. The validity period of the URL is 30 minutes. You must prepare another URL to store the audio stream at the earliest opportunity.
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

        @com.aliyun.core.annotation.NameInMap("RiskLevel")
        private String riskLevel;

        @com.aliyun.core.annotation.NameInMap("SliceDetails")
        private java.util.List < SliceDetails> sliceDetails;

        private AudioResult(Builder builder) {
            this.audioSummarys = builder.audioSummarys;
            this.riskLevel = builder.riskLevel;
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
         * @return riskLevel
         */
        public String getRiskLevel() {
            return this.riskLevel;
        }

        /**
         * @return sliceDetails
         */
        public java.util.List < SliceDetails> getSliceDetails() {
            return this.sliceDetails;
        }

        public static final class Builder {
            private java.util.List < AudioSummarys> audioSummarys; 
            private String riskLevel; 
            private java.util.List < SliceDetails> sliceDetails; 

            /**
             * Summary of voice labels.
             */
            public Builder audioSummarys(java.util.List < AudioSummarys> audioSummarys) {
                this.audioSummarys = audioSummarys;
                return this;
            }

            /**
             * RiskLevel.
             */
            public Builder riskLevel(String riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            /**
             * The details about the text in the moderated voice. The value is a JSON array that contains one or more elements. Each element corresponds to a text entry.
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
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        @com.aliyun.core.annotation.NameInMap("LabelSum")
        private Integer labelSum;

        private FrameSummarys(Builder builder) {
            this.description = builder.description;
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
         * @return description
         */
        public String getDescription() {
            return this.description;
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
            private String description; 
            private String label; 
            private Integer labelSum; 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The label against which a captured frame is matched.
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * The number of times that the label is matched.
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
             * The ID of the hit custom image.
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * The custom image library ID of the hit.
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
             * Identified person coding information.
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

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        private Result(Builder builder) {
            this.confidence = builder.confidence;
            this.description = builder.description;
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
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        public static final class Builder {
            private Float confidence; 
            private String description; 
            private String label; 

            /**
             * The score of the confidence level. Valid values: 0 to 100. The value is accurate to two decimal places.
             */
            public Builder confidence(Float confidence) {
                this.confidence = confidence;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The label returned after a frame is moderated. Multiple risk labels and the corresponding scores of confidence levels may be returned for a frame.
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
             * If a custom image library is hit, information about the hit custom image library is returned.
             */
            public Builder customImage(java.util.List < CustomImage> customImage) {
                this.customImage = customImage;
                return this;
            }

            /**
             * If the video contains a specific person, the recognized person code is returned.
             */
            public Builder publicFigure(java.util.List < PublicFigure> publicFigure) {
                this.publicFigure = publicFigure;
                return this;
            }

            /**
             * The results of frame moderation parameters such as the label parameter and the confidence parameter.
             */
            public Builder result(java.util.List < Result> result) {
                this.result = result;
                return this;
            }

            /**
             * The moderation service that is called.
             */
            public Builder service(String service) {
                this.service = service;
                return this;
            }

            /**
             * Returns the text information in the hit image.
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

        @com.aliyun.core.annotation.NameInMap("RiskLevel")
        private String riskLevel;

        @com.aliyun.core.annotation.NameInMap("TempUrl")
        private String tempUrl;

        @com.aliyun.core.annotation.NameInMap("Timestamp")
        private Long timestamp;

        private Frames(Builder builder) {
            this.offset = builder.offset;
            this.results = builder.results;
            this.riskLevel = builder.riskLevel;
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
         * @return riskLevel
         */
        public String getRiskLevel() {
            return this.riskLevel;
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
            private String riskLevel; 
            private String tempUrl; 
            private Long timestamp; 

            /**
             * The interval between the start of the video file and the captured frame. Unit: seconds.
             */
            public Builder offset(Float offset) {
                this.offset = offset;
                return this;
            }

            /**
             * The results of frame moderation parameters such as the label parameter and the confidence parameter.
             */
            public Builder results(java.util.List < Results> results) {
                this.results = results;
                return this;
            }

            /**
             * RiskLevel.
             */
            public Builder riskLevel(String riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            /**
             * The temporary URL of a captured frame. This URL is valid for 30 minutes.
             */
            public Builder tempUrl(String tempUrl) {
                this.tempUrl = tempUrl;
                return this;
            }

            /**
             * The absolute timestamp. Unit: milliseconds.
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

        @com.aliyun.core.annotation.NameInMap("RiskLevel")
        private String riskLevel;

        private FrameResult(Builder builder) {
            this.frameNum = builder.frameNum;
            this.frameSummarys = builder.frameSummarys;
            this.frames = builder.frames;
            this.riskLevel = builder.riskLevel;
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

        /**
         * @return riskLevel
         */
        public String getRiskLevel() {
            return this.riskLevel;
        }

        public static final class Builder {
            private Integer frameNum; 
            private java.util.List < FrameSummarys> frameSummarys; 
            private java.util.List < Frames> frames; 
            private String riskLevel; 

            /**
             * The number of captured frames that are returned for the video file.
             */
            public Builder frameNum(Integer frameNum) {
                this.frameNum = frameNum;
                return this;
            }

            /**
             * The summary of the labels against which captured frames are matched.
             */
            public Builder frameSummarys(java.util.List < FrameSummarys> frameSummarys) {
                this.frameSummarys = frameSummarys;
                return this;
            }

            /**
             * The information about the frames that match the labels.
             */
            public Builder frames(java.util.List < Frames> frames) {
                this.frames = frames;
                return this;
            }

            /**
             * RiskLevel.
             */
            public Builder riskLevel(String riskLevel) {
                this.riskLevel = riskLevel;
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

        @com.aliyun.core.annotation.NameInMap("RiskLevel")
        private String riskLevel;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        private Data(Builder builder) {
            this.audioResult = builder.audioResult;
            this.dataId = builder.dataId;
            this.frameResult = builder.frameResult;
            this.liveId = builder.liveId;
            this.riskLevel = builder.riskLevel;
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
         * @return riskLevel
         */
        public String getRiskLevel() {
            return this.riskLevel;
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
            private String riskLevel; 
            private String taskId; 

            /**
             * The voice moderation results. The moderation results contain a structure.
             */
            public Builder audioResult(AudioResult audioResult) {
                this.audioResult = audioResult;
                return this;
            }

            /**
             * The ID of the moderated object.
             */
            public Builder dataId(String dataId) {
                this.dataId = dataId;
                return this;
            }

            /**
             * The image moderation results. If the call is successful, the HTTP status code 200 and moderation results are returned. The moderation results contain a structure.
             */
            public Builder frameResult(FrameResult frameResult) {
                this.frameResult = frameResult;
                return this;
            }

            /**
             * The unique ID of the live stream.
             */
            public Builder liveId(String liveId) {
                this.liveId = liveId;
                return this;
            }

            /**
             * RiskLevel.
             */
            public Builder riskLevel(String riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            /**
             * The task ID.
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
