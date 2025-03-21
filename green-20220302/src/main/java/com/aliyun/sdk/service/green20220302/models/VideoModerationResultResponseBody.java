// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220302.models;

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
         * <p>The returned HTTP status code. The status code 200 indicates that the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The moderation results.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The message that is returned in response to the request.</p>
         * 
         * <strong>example:</strong>
         * <p>success finished</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>6CF2815C-C8C7-4A01-B52E-FF6E24F53492</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public VideoModerationResultResponseBody build() {
            return new VideoModerationResultResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link VideoModerationResultResponseBody} extends {@link TeaModel}
     *
     * <p>VideoModerationResultResponseBody</p>
     */
    public static class AudioSummarys extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        @com.aliyun.core.annotation.NameInMap("LabelSum")
        private Integer labelSum;

        private AudioSummarys(Builder builder) {
            this.description = builder.description;
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
             * <p>The voice label.</p>
             * 
             * <strong>example:</strong>
             * <p>profanity</p>
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * <p>The number of times that the label is matched.</p>
             * 
             * <strong>example:</strong>
             * <p>8</p>
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
    /**
     * 
     * {@link VideoModerationResultResponseBody} extends {@link TeaModel}
     *
     * <p>VideoModerationResultResponseBody</p>
     */
    public static class SliceDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Descriptions")
        private String descriptions;

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
            this.descriptions = builder.descriptions;
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
         * @return descriptions
         */
        public String getDescriptions() {
            return this.descriptions;
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
            private String descriptions; 
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
             * Descriptions.
             */
            public Builder descriptions(String descriptions) {
                this.descriptions = descriptions;
                return this;
            }

            /**
             * <p>The end time of the text after voice-to-text conversion. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The end timestamp of the segment. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1685245261939</p>
             */
            public Builder endTimestamp(Long endTimestamp) {
                this.endTimestamp = endTimestamp;
                return this;
            }

            /**
             * <p>A reserved parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;consoleProduct&quot;:&quot;slbnext&quot;}</p>
             */
            public Builder extend(String extend) {
                this.extend = extend;
                return this;
            }

            /**
             * <p>The details of the labels.</p>
             * 
             * <strong>example:</strong>
             * <p>porn</p>
             */
            public Builder labels(String labels) {
                this.labels = labels;
                return this;
            }

            /**
             * <p>Risk Level.</p>
             * 
             * <strong>example:</strong>
             * <p>high</p>
             */
            public Builder riskLevel(String riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            /**
             * <p>Subcategory labels. Multiple labels are separated by commas (,).</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;&quot;</p>
             */
            public Builder riskTips(String riskTips) {
                this.riskTips = riskTips;
                return this;
            }

            /**
             * <p>The risk words that are hit. Multiple words are separated by commas (,).</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;&quot;</p>
             */
            public Builder riskWords(String riskWords) {
                this.riskWords = riskWords;
                return this;
            }

            /**
             * <p>The risk score. Default range: 0 to 99.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder score(Float score) {
                this.score = score;
                return this;
            }

            /**
             * <p>The start time of the text after voice-to-text conversion. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The start timestamp of the segment. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1659935002123</p>
             */
            public Builder startTimestamp(Long startTimestamp) {
                this.startTimestamp = startTimestamp;
                return this;
            }

            /**
             * <p>The text converted from voice.</p>
             * 
             * <strong>example:</strong>
             * <p>Disgusting</p>
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            /**
             * <p>If the moderation object is a voice stream, this parameter indicates the temporary access URL of the voice stream to which the text entry corresponds. The validity period of the URL is 30 minutes. You must prepare another URL to store the voice stream at the earliest opportunity.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://xxxx.abc.img">http://xxxx.abc.img</a></p>
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
    /**
     * 
     * {@link VideoModerationResultResponseBody} extends {@link TeaModel}
     *
     * <p>VideoModerationResultResponseBody</p>
     */
    public static class AudioResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AudioSummarys")
        private java.util.List<AudioSummarys> audioSummarys;

        @com.aliyun.core.annotation.NameInMap("RiskLevel")
        private String riskLevel;

        @com.aliyun.core.annotation.NameInMap("SliceDetails")
        private java.util.List<SliceDetails> sliceDetails;

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
        public java.util.List<AudioSummarys> getAudioSummarys() {
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
        public java.util.List<SliceDetails> getSliceDetails() {
            return this.sliceDetails;
        }

        public static final class Builder {
            private java.util.List<AudioSummarys> audioSummarys; 
            private String riskLevel; 
            private java.util.List<SliceDetails> sliceDetails; 

            /**
             * <p>Summary of voice labels.</p>
             */
            public Builder audioSummarys(java.util.List<AudioSummarys> audioSummarys) {
                this.audioSummarys = audioSummarys;
                return this;
            }

            /**
             * <p>Risk Level.</p>
             * 
             * <strong>example:</strong>
             * <p>high</p>
             */
            public Builder riskLevel(String riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            /**
             * <p>The details about the text in the moderated voice. The value is a JSON array that contains one or more elements. Each element corresponds to a text entry.</p>
             */
            public Builder sliceDetails(java.util.List<SliceDetails> sliceDetails) {
                this.sliceDetails = sliceDetails;
                return this;
            }

            public AudioResult build() {
                return new AudioResult(this);
            } 

        } 

    }
    /**
     * 
     * {@link VideoModerationResultResponseBody} extends {@link TeaModel}
     *
     * <p>VideoModerationResultResponseBody</p>
     */
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
             * <p>The description of the result.</p>
             * 
             * <strong>example:</strong>
             * <p>no risk</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The label against which a captured frame is matched.</p>
             * 
             * <strong>example:</strong>
             * <p>violent_armedForces</p>
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * <p>The number of times that the label is matched.</p>
             * 
             * <strong>example:</strong>
             * <p>8</p>
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
    /**
     * 
     * {@link VideoModerationResultResponseBody} extends {@link TeaModel}
     *
     * <p>VideoModerationResultResponseBody</p>
     */
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
             * <p>The ID of the custom image that is hit.</p>
             * 
             * <strong>example:</strong>
             * <p>1234</p>
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * <p>The ID of the custom image library that is hit.</p>
             * 
             * <strong>example:</strong>
             * <p>12345678</p>
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
    /**
     * 
     * {@link VideoModerationResultResponseBody} extends {@link TeaModel}
     *
     * <p>VideoModerationResultResponseBody</p>
     */
    public static class Location extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("H")
        private Integer h;

        @com.aliyun.core.annotation.NameInMap("W")
        private Integer w;

        @com.aliyun.core.annotation.NameInMap("X")
        private Integer x;

        @com.aliyun.core.annotation.NameInMap("Y")
        private Integer y;

        private Location(Builder builder) {
            this.h = builder.h;
            this.w = builder.w;
            this.x = builder.x;
            this.y = builder.y;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Location create() {
            return builder().build();
        }

        /**
         * @return h
         */
        public Integer getH() {
            return this.h;
        }

        /**
         * @return w
         */
        public Integer getW() {
            return this.w;
        }

        /**
         * @return x
         */
        public Integer getX() {
            return this.x;
        }

        /**
         * @return y
         */
        public Integer getY() {
            return this.y;
        }

        public static final class Builder {
            private Integer h; 
            private Integer w; 
            private Integer x; 
            private Integer y; 

            /**
             * H.
             */
            public Builder h(Integer h) {
                this.h = h;
                return this;
            }

            /**
             * W.
             */
            public Builder w(Integer w) {
                this.w = w;
                return this;
            }

            /**
             * X.
             */
            public Builder x(Integer x) {
                this.x = x;
                return this;
            }

            /**
             * Y.
             */
            public Builder y(Integer y) {
                this.y = y;
                return this;
            }

            public Location build() {
                return new Location(this);
            } 

        } 

    }
    /**
     * 
     * {@link VideoModerationResultResponseBody} extends {@link TeaModel}
     *
     * <p>VideoModerationResultResponseBody</p>
     */
    public static class Logo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("confidence")
        private Long confidence;

        @com.aliyun.core.annotation.NameInMap("label")
        private String label;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        private Logo(Builder builder) {
            this.confidence = builder.confidence;
            this.label = builder.label;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Logo create() {
            return builder().build();
        }

        /**
         * @return confidence
         */
        public Long getConfidence() {
            return this.confidence;
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private Long confidence; 
            private String label; 
            private String name; 

            /**
             * confidence.
             */
            public Builder confidence(Long confidence) {
                this.confidence = confidence;
                return this;
            }

            /**
             * label.
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Logo build() {
                return new Logo(this);
            } 

        } 

    }
    /**
     * 
     * {@link VideoModerationResultResponseBody} extends {@link TeaModel}
     *
     * <p>VideoModerationResultResponseBody</p>
     */
    public static class LogoData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Location")
        private Location location;

        @com.aliyun.core.annotation.NameInMap("Logo")
        private java.util.List<Logo> logo;

        private LogoData(Builder builder) {
            this.location = builder.location;
            this.logo = builder.logo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LogoData create() {
            return builder().build();
        }

        /**
         * @return location
         */
        public Location getLocation() {
            return this.location;
        }

        /**
         * @return logo
         */
        public java.util.List<Logo> getLogo() {
            return this.logo;
        }

        public static final class Builder {
            private Location location; 
            private java.util.List<Logo> logo; 

            /**
             * Location.
             */
            public Builder location(Location location) {
                this.location = location;
                return this;
            }

            /**
             * Logo.
             */
            public Builder logo(java.util.List<Logo> logo) {
                this.logo = logo;
                return this;
            }

            public LogoData build() {
                return new LogoData(this);
            } 

        } 

    }
    /**
     * 
     * {@link VideoModerationResultResponseBody} extends {@link TeaModel}
     *
     * <p>VideoModerationResultResponseBody</p>
     */
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
             * <p>The information about the code of the identified figure.</p>
             * 
             * <strong>example:</strong>
             * <p>xxx001</p>
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
    /**
     * 
     * {@link VideoModerationResultResponseBody} extends {@link TeaModel}
     *
     * <p>VideoModerationResultResponseBody</p>
     */
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
             * <p>The score of the confidence level. Valid values: 0 to 100. The value is accurate to two decimal places.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder confidence(Float confidence) {
                this.confidence = confidence;
                return this;
            }

            /**
             * <p>The description of the result.</p>
             * 
             * <strong>example:</strong>
             * <p>no risk</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The label returned after a frame is moderated. Multiple risk labels and the corresponding scores of confidence levels may be returned for a frame.</p>
             * 
             * <strong>example:</strong>
             * <p>bloody</p>
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
    /**
     * 
     * {@link VideoModerationResultResponseBody} extends {@link TeaModel}
     *
     * <p>VideoModerationResultResponseBody</p>
     */
    public static class Results extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CustomImage")
        private java.util.List<CustomImage> customImage;

        @com.aliyun.core.annotation.NameInMap("LogoData")
        private java.util.List<LogoData> logoData;

        @com.aliyun.core.annotation.NameInMap("PublicFigure")
        private java.util.List<PublicFigure> publicFigure;

        @com.aliyun.core.annotation.NameInMap("Result")
        private java.util.List<Result> result;

        @com.aliyun.core.annotation.NameInMap("Service")
        private String service;

        @com.aliyun.core.annotation.NameInMap("TextInImage")
        private java.util.Map<String, ?> textInImage;

        private Results(Builder builder) {
            this.customImage = builder.customImage;
            this.logoData = builder.logoData;
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
        public java.util.List<CustomImage> getCustomImage() {
            return this.customImage;
        }

        /**
         * @return logoData
         */
        public java.util.List<LogoData> getLogoData() {
            return this.logoData;
        }

        /**
         * @return publicFigure
         */
        public java.util.List<PublicFigure> getPublicFigure() {
            return this.publicFigure;
        }

        /**
         * @return result
         */
        public java.util.List<Result> getResult() {
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
        public java.util.Map<String, ?> getTextInImage() {
            return this.textInImage;
        }

        public static final class Builder {
            private java.util.List<CustomImage> customImage; 
            private java.util.List<LogoData> logoData; 
            private java.util.List<PublicFigure> publicFigure; 
            private java.util.List<Result> result; 
            private String service; 
            private java.util.Map<String, ?> textInImage; 

            /**
             * <p>If a custom image library is hit, information about the custom image library is returned.</p>
             */
            public Builder customImage(java.util.List<CustomImage> customImage) {
                this.customImage = customImage;
                return this;
            }

            /**
             * LogoData.
             */
            public Builder logoData(java.util.List<LogoData> logoData) {
                this.logoData = logoData;
                return this;
            }

            /**
             * <p>If the video contains a specific figure, the code of the identified figure is returned.</p>
             */
            public Builder publicFigure(java.util.List<PublicFigure> publicFigure) {
                this.publicFigure = publicFigure;
                return this;
            }

            /**
             * <p>The results of frame moderation parameters such as the label parameter and the confidence parameter.</p>
             */
            public Builder result(java.util.List<Result> result) {
                this.result = result;
                return this;
            }

            /**
             * <p>The moderation service that is called.</p>
             * 
             * <strong>example:</strong>
             * <p>tonalityImprove</p>
             */
            public Builder service(String service) {
                this.service = service;
                return this;
            }

            /**
             * <p>The information about the text hit in the image is returned.</p>
             */
            public Builder textInImage(java.util.Map<String, ?> textInImage) {
                this.textInImage = textInImage;
                return this;
            }

            public Results build() {
                return new Results(this);
            } 

        } 

    }
    /**
     * 
     * {@link VideoModerationResultResponseBody} extends {@link TeaModel}
     *
     * <p>VideoModerationResultResponseBody</p>
     */
    public static class Frames extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Offset")
        private Float offset;

        @com.aliyun.core.annotation.NameInMap("Results")
        private java.util.List<Results> results;

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
        public java.util.List<Results> getResults() {
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
            private java.util.List<Results> results; 
            private String riskLevel; 
            private String tempUrl; 
            private Long timestamp; 

            /**
             * <p>The interval between the start of the video file and the captured frame. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>338</p>
             */
            public Builder offset(Float offset) {
                this.offset = offset;
                return this;
            }

            /**
             * <p>The results of frame moderation parameters such as the label parameter and the confidence parameter.</p>
             */
            public Builder results(java.util.List<Results> results) {
                this.results = results;
                return this;
            }

            /**
             * <p>Risk Level.</p>
             * 
             * <strong>example:</strong>
             * <p>high</p>
             */
            public Builder riskLevel(String riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            /**
             * <p>The temporary URL of a captured frame.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://xxxx.abc.jpg">http://xxxx.abc.jpg</a></p>
             */
            public Builder tempUrl(String tempUrl) {
                this.tempUrl = tempUrl;
                return this;
            }

            /**
             * <p>The absolute timestamp. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1684559739000</p>
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
    /**
     * 
     * {@link VideoModerationResultResponseBody} extends {@link TeaModel}
     *
     * <p>VideoModerationResultResponseBody</p>
     */
    public static class FrameResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FrameNum")
        private Integer frameNum;

        @com.aliyun.core.annotation.NameInMap("FrameSummarys")
        private java.util.List<FrameSummarys> frameSummarys;

        @com.aliyun.core.annotation.NameInMap("Frames")
        private java.util.List<Frames> frames;

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
        public java.util.List<FrameSummarys> getFrameSummarys() {
            return this.frameSummarys;
        }

        /**
         * @return frames
         */
        public java.util.List<Frames> getFrames() {
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
            private java.util.List<FrameSummarys> frameSummarys; 
            private java.util.List<Frames> frames; 
            private String riskLevel; 

            /**
             * <p>The number of captured frames that are returned for the video file.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder frameNum(Integer frameNum) {
                this.frameNum = frameNum;
                return this;
            }

            /**
             * <p>The summary of the labels against which captured frames are matched.</p>
             */
            public Builder frameSummarys(java.util.List<FrameSummarys> frameSummarys) {
                this.frameSummarys = frameSummarys;
                return this;
            }

            /**
             * <p>The information about the frames that match the labels.</p>
             */
            public Builder frames(java.util.List<Frames> frames) {
                this.frames = frames;
                return this;
            }

            /**
             * <p>Risk Level.</p>
             * 
             * <strong>example:</strong>
             * <p>high</p>
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
    /**
     * 
     * {@link VideoModerationResultResponseBody} extends {@link TeaModel}
     *
     * <p>VideoModerationResultResponseBody</p>
     */
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
             * <p>The voice moderation results. The moderation results contain a structure.</p>
             */
            public Builder audioResult(AudioResult audioResult) {
                this.audioResult = audioResult;
                return this;
            }

            /**
             * <p>The value of dataId that is specified in the API request. If this parameter is not specified in the API request, the dataId field is not available in the response.</p>
             * 
             * <strong>example:</strong>
             * <p>product_content-2055763</p>
             */
            public Builder dataId(String dataId) {
                this.dataId = dataId;
                return this;
            }

            /**
             * <p>The image moderation results. If the call is successful, the HTTP status code 200 and moderation results are returned. The moderation results contain a structure.</p>
             */
            public Builder frameResult(FrameResult frameResult) {
                this.frameResult = frameResult;
                return this;
            }

            /**
             * <p>The unique ID of the live stream.</p>
             * 
             * <strong>example:</strong>
             * <p>liveId</p>
             */
            public Builder liveId(String liveId) {
                this.liveId = liveId;
                return this;
            }

            /**
             * <p>Risk Level.</p>
             * 
             * <strong>example:</strong>
             * <p>high</p>
             */
            public Builder riskLevel(String riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            /**
             * <p>The task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>xxxxx-xxxxx</p>
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
