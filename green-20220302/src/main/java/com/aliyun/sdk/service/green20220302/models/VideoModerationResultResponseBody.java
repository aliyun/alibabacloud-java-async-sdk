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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(VideoModerationResultResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The response code. A value of 200 indicates success.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The moderation result data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The response message.</p>
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

            private Builder() {
            } 

            private Builder(AudioSummarys model) {
                this.description = model.description;
                this.label = model.label;
                this.labelSum = model.labelSum;
            } 

            /**
             * <p>The label description.</p>
             * 
             * <strong>example:</strong>
             * <p>Suspected prohibited content</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The video audio label.</p>
             * 
             * <strong>example:</strong>
             * <p>profanity</p>
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * <p>The number of times the label appears.</p>
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
    public static class CustomizedHit extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("KeyWords")
        private String keyWords;

        @com.aliyun.core.annotation.NameInMap("LibName")
        private String libName;

        private CustomizedHit(Builder builder) {
            this.keyWords = builder.keyWords;
            this.libName = builder.libName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomizedHit create() {
            return builder().build();
        }

        /**
         * @return keyWords
         */
        public String getKeyWords() {
            return this.keyWords;
        }

        /**
         * @return libName
         */
        public String getLibName() {
            return this.libName;
        }

        public static final class Builder {
            private String keyWords; 
            private String libName; 

            private Builder() {
            } 

            private Builder(CustomizedHit model) {
                this.keyWords = model.keyWords;
                this.libName = model.libName;
            } 

            /**
             * <p>The custom keywords.</p>
             * 
             * <strong>example:</strong>
             * <p>fxxk</p>
             */
            public Builder keyWords(String keyWords) {
                this.keyWords = keyWords;
                return this;
            }

            /**
             * <p>The name of the custom library.</p>
             * 
             * <strong>example:</strong>
             * <p>Backup_Lexicon_02</p>
             */
            public Builder libName(String libName) {
                this.libName = libName;
                return this;
            }

            public CustomizedHit build() {
                return new CustomizedHit(this);
            } 

        } 

    }
    /**
     * 
     * {@link VideoModerationResultResponseBody} extends {@link TeaModel}
     *
     * <p>VideoModerationResultResponseBody</p>
     */
    public static class RiskPositions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndPos")
        private Integer endPos;

        @com.aliyun.core.annotation.NameInMap("RiskWord")
        private String riskWord;

        @com.aliyun.core.annotation.NameInMap("StartPos")
        private Integer startPos;

        private RiskPositions(Builder builder) {
            this.endPos = builder.endPos;
            this.riskWord = builder.riskWord;
            this.startPos = builder.startPos;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RiskPositions create() {
            return builder().build();
        }

        /**
         * @return endPos
         */
        public Integer getEndPos() {
            return this.endPos;
        }

        /**
         * @return riskWord
         */
        public String getRiskWord() {
            return this.riskWord;
        }

        /**
         * @return startPos
         */
        public Integer getStartPos() {
            return this.startPos;
        }

        public static final class Builder {
            private Integer endPos; 
            private String riskWord; 
            private Integer startPos; 

            private Builder() {
            } 

            private Builder(RiskPositions model) {
                this.endPos = model.endPos;
                this.riskWord = model.riskWord;
                this.startPos = model.startPos;
            } 

            /**
             * <p>The end position.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder endPos(Integer endPos) {
                this.endPos = endPos;
                return this;
            }

            /**
             * <p>The detected sensitive word.</p>
             * 
             * <strong>example:</strong>
             * <p>fxxk</p>
             */
            public Builder riskWord(String riskWord) {
                this.riskWord = riskWord;
                return this;
            }

            /**
             * <p>The start position.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder startPos(Integer startPos) {
                this.startPos = startPos;
                return this;
            }

            public RiskPositions build() {
                return new RiskPositions(this);
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

        @com.aliyun.core.annotation.NameInMap("CustomizedHit")
        private java.util.List<CustomizedHit> customizedHit;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        @com.aliyun.core.annotation.NameInMap("RiskLevel")
        private String riskLevel;

        @com.aliyun.core.annotation.NameInMap("RiskPositions")
        private java.util.List<RiskPositions> riskPositions;

        @com.aliyun.core.annotation.NameInMap("RiskWords")
        private String riskWords;

        private Result(Builder builder) {
            this.confidence = builder.confidence;
            this.customizedHit = builder.customizedHit;
            this.description = builder.description;
            this.label = builder.label;
            this.riskLevel = builder.riskLevel;
            this.riskPositions = builder.riskPositions;
            this.riskWords = builder.riskWords;
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
         * @return customizedHit
         */
        public java.util.List<CustomizedHit> getCustomizedHit() {
            return this.customizedHit;
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
         * @return riskLevel
         */
        public String getRiskLevel() {
            return this.riskLevel;
        }

        /**
         * @return riskPositions
         */
        public java.util.List<RiskPositions> getRiskPositions() {
            return this.riskPositions;
        }

        /**
         * @return riskWords
         */
        public String getRiskWords() {
            return this.riskWords;
        }

        public static final class Builder {
            private Float confidence; 
            private java.util.List<CustomizedHit> customizedHit; 
            private String description; 
            private String label; 
            private String riskLevel; 
            private java.util.List<RiskPositions> riskPositions; 
            private String riskWords; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.confidence = model.confidence;
                this.customizedHit = model.customizedHit;
                this.description = model.description;
                this.label = model.label;
                this.riskLevel = model.riskLevel;
                this.riskPositions = model.riskPositions;
                this.riskWords = model.riskWords;
            } 

            /**
             * <p>The confidence level.</p>
             * 
             * <strong>example:</strong>
             * <p>99.9</p>
             */
            public Builder confidence(Float confidence) {
                this.confidence = confidence;
                return this;
            }

            /**
             * <p>The list of hit custom libraries.</p>
             */
            public Builder customizedHit(java.util.List<CustomizedHit> customizedHit) {
                this.customizedHit = customizedHit;
                return this;
            }

            /**
             * <p>The description.</p>
             * 
             * <strong>example:</strong>
             * <p>Suspected prohibited content</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The label.</p>
             * 
             * <strong>example:</strong>
             * <p>profanity</p>
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * <p>The risk level.</p>
             * 
             * <strong>example:</strong>
             * <p>high</p>
             */
            public Builder riskLevel(String riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            /**
             * <p>The list of risk positions.</p>
             */
            public Builder riskPositions(java.util.List<RiskPositions> riskPositions) {
                this.riskPositions = riskPositions;
                return this;
            }

            /**
             * <p>The hit risk content.</p>
             * 
             * <strong>example:</strong>
             * <p>fxxk</p>
             */
            public Builder riskWords(String riskWords) {
                this.riskWords = riskWords;
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

        @com.aliyun.core.annotation.NameInMap("Result")
        private java.util.List<Result> result;

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
            this.result = builder.result;
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
         * @return result
         */
        public java.util.List<Result> getResult() {
            return this.result;
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
            private java.util.List<Result> result; 
            private String riskLevel; 
            private String riskTips; 
            private String riskWords; 
            private Float score; 
            private Long startTime; 
            private Long startTimestamp; 
            private String text; 
            private String url; 

            private Builder() {
            } 

            private Builder(SliceDetails model) {
                this.descriptions = model.descriptions;
                this.endTime = model.endTime;
                this.endTimestamp = model.endTimestamp;
                this.extend = model.extend;
                this.labels = model.labels;
                this.result = model.result;
                this.riskLevel = model.riskLevel;
                this.riskTips = model.riskTips;
                this.riskWords = model.riskWords;
                this.score = model.score;
                this.startTime = model.startTime;
                this.startTimestamp = model.startTimestamp;
                this.text = model.text;
                this.url = model.url;
            } 

            /**
             * <p>The label description.</p>
             * 
             * <strong>example:</strong>
             * <p>Suspected prohibited content</p>
             */
            public Builder descriptions(String descriptions) {
                this.descriptions = descriptions;
                return this;
            }

            /**
             * <p>The end time of the segment, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The end timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>1685245261939</p>
             */
            public Builder endTimestamp(Long endTimestamp) {
                this.endTimestamp = endTimestamp;
                return this;
            }

            /**
             * <p>The extended field.</p>
             * 
             * <strong>example:</strong>
             * <p>{\&quot;consoleProduct\&quot;:\&quot;slbnext\&quot;}</p>
             */
            public Builder extend(String extend) {
                this.extend = extend;
                return this;
            }

            /**
             * <p>The violated labels that were hit.</p>
             * 
             * <strong>example:</strong>
             * <p>porn</p>
             */
            public Builder labels(String labels) {
                this.labels = labels;
                return this;
            }

            /**
             * <p>The text detection result.</p>
             */
            public Builder result(java.util.List<Result> result) {
                this.result = result;
                return this;
            }

            /**
             * <p>The risk level, which is returned based on the configured risk score thresholds. Valid values:</p>
             * <ul>
             * <li><p>high: high risk.</p>
             * </li>
             * <li><p>medium: medium risk.</p>
             * </li>
             * <li><p>low: low risk.</p>
             * </li>
             * <li><p>none: no risk detected.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>high</p>
             */
            public Builder riskLevel(String riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            /**
             * <p>The details of the hit risk.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;&quot;</p>
             */
            public Builder riskTips(String riskTips) {
                this.riskTips = riskTips;
                return this;
            }

            /**
             * <p>The risk keywords that were hit.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;&quot;</p>
             */
            public Builder riskWords(String riskWords) {
                this.riskWords = riskWords;
                return this;
            }

            /**
             * <p>The risk score. The default range is 0-99.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder score(Float score) {
                this.score = score;
                return this;
            }

            /**
             * <p>The start time of the segment, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The start timestamp, accurate to milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1659935002123</p>
             */
            public Builder startTimestamp(Long startTimestamp) {
                this.startTimestamp = startTimestamp;
                return this;
            }

            /**
             * <p>The transcribed text of the audio segment.</p>
             * 
             * <strong>example:</strong>
             * <p>The weather is really nice today</p>
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            /**
             * <p>The temporary URL of the audio segment file.</p>
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

            private Builder() {
            } 

            private Builder(AudioResult model) {
                this.audioSummarys = model.audioSummarys;
                this.riskLevel = model.riskLevel;
                this.sliceDetails = model.sliceDetails;
            } 

            /**
             * <p>The audio label summary.</p>
             */
            public Builder audioSummarys(java.util.List<AudioSummarys> audioSummarys) {
                this.audioSummarys = audioSummarys;
                return this;
            }

            /**
             * <p>The risk level, returned based on the configured high and low risk score thresholds. Valid values:</p>
             * 
             * <strong>example:</strong>
             * <p>high</p>
             */
            public Builder riskLevel(String riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            /**
             * <p>The list of audio segments.</p>
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
    public static class AIGC extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ContentProducer")
        private String contentProducer;

        @com.aliyun.core.annotation.NameInMap("ContentPropagator")
        private String contentPropagator;

        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        @com.aliyun.core.annotation.NameInMap("ProduceID")
        private String produceID;

        @com.aliyun.core.annotation.NameInMap("PropagateID")
        private String propagateID;

        @com.aliyun.core.annotation.NameInMap("ReservedCode1")
        private String reservedCode1;

        @com.aliyun.core.annotation.NameInMap("ReservedCode2")
        private String reservedCode2;

        private AIGC(Builder builder) {
            this.contentProducer = builder.contentProducer;
            this.contentPropagator = builder.contentPropagator;
            this.label = builder.label;
            this.produceID = builder.produceID;
            this.propagateID = builder.propagateID;
            this.reservedCode1 = builder.reservedCode1;
            this.reservedCode2 = builder.reservedCode2;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AIGC create() {
            return builder().build();
        }

        /**
         * @return contentProducer
         */
        public String getContentProducer() {
            return this.contentProducer;
        }

        /**
         * @return contentPropagator
         */
        public String getContentPropagator() {
            return this.contentPropagator;
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        /**
         * @return produceID
         */
        public String getProduceID() {
            return this.produceID;
        }

        /**
         * @return propagateID
         */
        public String getPropagateID() {
            return this.propagateID;
        }

        /**
         * @return reservedCode1
         */
        public String getReservedCode1() {
            return this.reservedCode1;
        }

        /**
         * @return reservedCode2
         */
        public String getReservedCode2() {
            return this.reservedCode2;
        }

        public static final class Builder {
            private String contentProducer; 
            private String contentPropagator; 
            private String label; 
            private String produceID; 
            private String propagateID; 
            private String reservedCode1; 
            private String reservedCode2; 

            private Builder() {
            } 

            private Builder(AIGC model) {
                this.contentProducer = model.contentProducer;
                this.contentPropagator = model.contentPropagator;
                this.label = model.label;
                this.produceID = model.produceID;
                this.propagateID = model.propagateID;
                this.reservedCode1 = model.reservedCode1;
                this.reservedCode2 = model.reservedCode2;
            } 

            /**
             * <p>The code or name of the service provider, used to identify the content producer.</p>
             * 
             * <strong>example:</strong>
             * <p>001191******M000100Y43</p>
             */
            public Builder contentProducer(String contentProducer) {
                this.contentProducer = contentProducer;
                return this;
            }

            /**
             * <p>The name, ID, or code of the propagation platform. For services that provide artificial intelligence generated or synthesized content, this value can be the same as ContentProducer.</p>
             * 
             * <strong>example:</strong>
             * <p>001191******M000100Y43</p>
             */
            public Builder contentPropagator(String contentPropagator) {
                this.contentPropagator = contentPropagator;
                return this;
            }

            /**
             * <p>Indicates whether the content is AI-generated. Valid values:</p>
             * <ul>
             * <li><p>1: The content is AI-generated.</p>
             * </li>
             * <li><p>2: (Dissemination platforms only) The content is likely AI-generated.</p>
             * </li>
             * <li><p>3: (Dissemination platforms only) The content is suspected to be AI-generated.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * <p>The content production ID, which is a unique identifier used by the production platform to trace synthesized content.</p>
             * 
             * <strong>example:</strong>
             * <p>123******456</p>
             */
            public Builder produceID(String produceID) {
                this.produceID = produceID;
                return this;
            }

            /**
             * <p>The content propagation ID, which is a unique identifier assigned by the propagation platform to the generated or synthesized content being distributed.</p>
             * 
             * <strong>example:</strong>
             * <p>123******456</p>
             */
            public Builder propagateID(String propagateID) {
                this.propagateID = propagateID;
                return this;
            }

            /**
             * <p>A reserved field.</p>
             * <p>This field can store information used by the content synthesis service provider to independently conduct security protection and protect the integrity of content and identifiers. Secure storage and verification of critical information can be achieved through a hash mechanism based on ContentProducer and ProduceID.</p>
             * 
             * <strong>example:</strong>
             * <p>d41d**********427e</p>
             */
            public Builder reservedCode1(String reservedCode1) {
                this.reservedCode1 = reservedCode1;
                return this;
            }

            /**
             * <p>A reserved field.</p>
             * <p>This field can be used by content distribution service providers to independently implement security protection and preserve the integrity of content and identifiers. A hashing mechanism based on ContentProducer and ProduceID can be used to achieve secure storage and verification of critical information.</p>
             * 
             * <strong>example:</strong>
             * <p>d41d**********427e</p>
             */
            public Builder reservedCode2(String reservedCode2) {
                this.reservedCode2 = reservedCode2;
                return this;
            }

            public AIGC build() {
                return new AIGC(this);
            } 

        } 

    }
    /**
     * 
     * {@link VideoModerationResultResponseBody} extends {@link TeaModel}
     *
     * <p>VideoModerationResultResponseBody</p>
     */
    public static class AigcData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AIGC")
        private AIGC AIGC;

        @com.aliyun.core.annotation.NameInMap("Result")
        private String result;

        private AigcData(Builder builder) {
            this.AIGC = builder.AIGC;
            this.result = builder.result;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AigcData create() {
            return builder().build();
        }

        /**
         * @return AIGC
         */
        public AIGC getAIGC() {
            return this.AIGC;
        }

        /**
         * @return result
         */
        public String getResult() {
            return this.result;
        }

        public static final class Builder {
            private AIGC AIGC; 
            private String result; 

            private Builder() {
            } 

            private Builder(AigcData model) {
                this.AIGC = model.AIGC;
                this.result = model.result;
            } 

            /**
             * <p>The AIGC metadata.</p>
             */
            public Builder AIGC(AIGC AIGC) {
                this.AIGC = AIGC;
                return this;
            }

            /**
             * <p>The detection result.</p>
             * 
             * <strong>example:</strong>
             * <p>None</p>
             */
            public Builder result(String result) {
                this.result = result;
                return this;
            }

            public AigcData build() {
                return new AigcData(this);
            } 

        } 

    }
    /**
     * 
     * {@link VideoModerationResultResponseBody} extends {@link TeaModel}
     *
     * <p>VideoModerationResultResponseBody</p>
     */
    public static class Ext extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AigcData")
        private AigcData aigcData;

        private Ext(Builder builder) {
            this.aigcData = builder.aigcData;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Ext create() {
            return builder().build();
        }

        /**
         * @return aigcData
         */
        public AigcData getAigcData() {
            return this.aigcData;
        }

        public static final class Builder {
            private AigcData aigcData; 

            private Builder() {
            } 

            private Builder(Ext model) {
                this.aigcData = model.aigcData;
            } 

            /**
             * <p>The AIGC metadata detection result.</p>
             */
            public Builder aigcData(AigcData aigcData) {
                this.aigcData = aigcData;
                return this;
            }

            public Ext build() {
                return new Ext(this);
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

            private Builder() {
            } 

            private Builder(FrameSummarys model) {
                this.description = model.description;
                this.label = model.label;
                this.labelSum = model.labelSum;
            } 

            /**
             * <p>The description of the Label field.</p>
             * 
             * <strong>example:</strong>
             * <p>No risk detected</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The video frame label.</p>
             * 
             * <strong>example:</strong>
             * <p>violent_armedForces</p>
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * <p>The number of times the label appears.</p>
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
    public static class ResultsAigcData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Explain")
        private String explain;

        private ResultsAigcData(Builder builder) {
            this.explain = builder.explain;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultsAigcData create() {
            return builder().build();
        }

        /**
         * @return explain
         */
        public String getExplain() {
            return this.explain;
        }

        public static final class Builder {
            private String explain; 

            private Builder() {
            } 

            private Builder(ResultsAigcData model) {
                this.explain = model.explain;
            } 

            /**
             * <p>The detailed explanation.</p>
             * 
             * <strong>example:</strong>
             * <h4>AIGC General Detection Analysis</h4>
             * <ul>
             * <li><strong>Tool Rating</strong>: Low (0.152)</li>
             * <li><strong>AI Visible Watermark</strong>: None</li>
             * <li><strong>Visual Key Points</strong>: The document layout is standard, font rendering is normal, and no structural distortion or logical errors commonly seen in AIGC are detected.</li>
             * </ul>
             */
            public Builder explain(String explain) {
                this.explain = explain;
                return this;
            }

            public ResultsAigcData build() {
                return new ResultsAigcData(this);
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

            private Builder() {
            } 

            private Builder(CustomImage model) {
                this.imageId = model.imageId;
                this.libId = model.libId;
            } 

            /**
             * <p>The ID of the matched custom image.</p>
             * 
             * <strong>example:</strong>
             * <p>1234</p>
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * <p>The ID of the matched custom image library.</p>
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

            private Builder() {
            } 

            private Builder(Location model) {
                this.h = model.h;
                this.w = model.w;
                this.x = model.x;
                this.y = model.y;
            } 

            /**
             * <p>The height of the text area. Unit: pixels.</p>
             * 
             * <strong>example:</strong>
             * <p>111</p>
             */
            public Builder h(Integer h) {
                this.h = h;
                return this;
            }

            /**
             * <p>The width of the text area. Unit: pixels.</p>
             * 
             * <strong>example:</strong>
             * <p>111</p>
             */
            public Builder w(Integer w) {
                this.w = w;
                return this;
            }

            /**
             * <p>The distance from the upper-left corner of the text area to the y-axis, with the upper-left corner of the image as the origin. Unit: pixels.</p>
             * 
             * <strong>example:</strong>
             * <p>111</p>
             */
            public Builder x(Integer x) {
                this.x = x;
                return this;
            }

            /**
             * <p>The distance from the upper-left corner of the text area to the x-axis, with the upper-left corner of the image as the origin. Unit: pixels.</p>
             * 
             * <strong>example:</strong>
             * <p>222</p>
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

            private Builder() {
            } 

            private Builder(Logo model) {
                this.confidence = model.confidence;
                this.label = model.label;
                this.name = model.name;
            } 

            /**
             * <p>The confidence score, ranging from 0 to 100, rounded to two decimal places.</p>
             * 
             * <strong>example:</strong>
             * <p>99.1</p>
             */
            public Builder confidence(Long confidence) {
                this.confidence = confidence;
                return this;
            }

            /**
             * <p>The matched label.</p>
             * 
             * <strong>example:</strong>
             * <p>pt_logotoSocialNetwork</p>
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * <p>The logo name.</p>
             * 
             * <strong>example:</strong>
             * <p>**卫视</p>
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

            private Builder() {
            } 

            private Builder(LogoData model) {
                this.location = model.location;
                this.logo = model.logo;
            } 

            /**
             * <p>The text line and coordinate information.</p>
             */
            public Builder location(Location location) {
                this.location = location;
                return this;
            }

            /**
             * <p>The logo identification information.</p>
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
    public static class PublicFigureLocation extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("H")
        private Integer h;

        @com.aliyun.core.annotation.NameInMap("W")
        private Integer w;

        @com.aliyun.core.annotation.NameInMap("X")
        private Integer x;

        @com.aliyun.core.annotation.NameInMap("Y")
        private Integer y;

        private PublicFigureLocation(Builder builder) {
            this.h = builder.h;
            this.w = builder.w;
            this.x = builder.x;
            this.y = builder.y;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PublicFigureLocation create() {
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

            private Builder() {
            } 

            private Builder(PublicFigureLocation model) {
                this.h = model.h;
                this.w = model.w;
                this.x = model.x;
                this.y = model.y;
            } 

            /**
             * <p>The height.</p>
             * 
             * <strong>example:</strong>
             * <p>222</p>
             */
            public Builder h(Integer h) {
                this.h = h;
                return this;
            }

            /**
             * <p>The width.</p>
             * 
             * <strong>example:</strong>
             * <p>111</p>
             */
            public Builder w(Integer w) {
                this.w = w;
                return this;
            }

            /**
             * <p>The x-coordinate of the starting point.</p>
             * 
             * <strong>example:</strong>
             * <p>111</p>
             */
            public Builder x(Integer x) {
                this.x = x;
                return this;
            }

            /**
             * <p>The y-coordinate of the starting point.</p>
             * 
             * <strong>example:</strong>
             * <p>222</p>
             */
            public Builder y(Integer y) {
                this.y = y;
                return this;
            }

            public PublicFigureLocation build() {
                return new PublicFigureLocation(this);
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

        @com.aliyun.core.annotation.NameInMap("FigureName")
        private String figureName;

        @com.aliyun.core.annotation.NameInMap("Location")
        private java.util.List<PublicFigureLocation> location;

        private PublicFigure(Builder builder) {
            this.figureId = builder.figureId;
            this.figureName = builder.figureName;
            this.location = builder.location;
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

        /**
         * @return figureName
         */
        public String getFigureName() {
            return this.figureName;
        }

        /**
         * @return location
         */
        public java.util.List<PublicFigureLocation> getLocation() {
            return this.location;
        }

        public static final class Builder {
            private String figureId; 
            private String figureName; 
            private java.util.List<PublicFigureLocation> location; 

            private Builder() {
            } 

            private Builder(PublicFigure model) {
                this.figureId = model.figureId;
                this.figureName = model.figureName;
                this.location = model.location;
            } 

            /**
             * <p>The code of the identified public figure.</p>
             * 
             * <strong>example:</strong>
             * <p>xxx001</p>
             */
            public Builder figureId(String figureId) {
                this.figureId = figureId;
                return this;
            }

            /**
             * <p>The name of the identified public figure.</p>
             * 
             * <strong>example:</strong>
             * <p>John Smith</p>
             */
            public Builder figureName(String figureName) {
                this.figureName = figureName;
                return this;
            }

            /**
             * <p>The location of the identified public figure.</p>
             */
            public Builder location(java.util.List<PublicFigureLocation> location) {
                this.location = location;
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
    public static class ResultsResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Confidence")
        private Float confidence;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        private ResultsResult(Builder builder) {
            this.confidence = builder.confidence;
            this.description = builder.description;
            this.label = builder.label;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultsResult create() {
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

            private Builder() {
            } 

            private Builder(ResultsResult model) {
                this.confidence = model.confidence;
                this.description = model.description;
                this.label = model.label;
            } 

            /**
             * <p>The confidence score, ranging from 0 to 100, rounded to two decimal places.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder confidence(Float confidence) {
                this.confidence = confidence;
                return this;
            }

            /**
             * <p>The description of the Label field.</p>
             * 
             * <strong>example:</strong>
             * <p>No risk detected</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The classification of the detection result.</p>
             * 
             * <strong>example:</strong>
             * <p>bloody</p>
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            public ResultsResult build() {
                return new ResultsResult(this);
            } 

        } 

    }
    /**
     * 
     * {@link VideoModerationResultResponseBody} extends {@link TeaModel}
     *
     * <p>VideoModerationResultResponseBody</p>
     */
    public static class VlContent extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OutputText")
        private String outputText;

        private VlContent(Builder builder) {
            this.outputText = builder.outputText;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VlContent create() {
            return builder().build();
        }

        /**
         * @return outputText
         */
        public String getOutputText() {
            return this.outputText;
        }

        public static final class Builder {
            private String outputText; 

            private Builder() {
            } 

            private Builder(VlContent model) {
                this.outputText = model.outputText;
            } 

            /**
             * <p>The output text generated by the large model.</p>
             * 
             * <strong>example:</strong>
             * <p>in the picture XXX</p>
             */
            public Builder outputText(String outputText) {
                this.outputText = outputText;
                return this;
            }

            public VlContent build() {
                return new VlContent(this);
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
        @com.aliyun.core.annotation.NameInMap("AigcData")
        private ResultsAigcData aigcData;

        @com.aliyun.core.annotation.NameInMap("CustomImage")
        private java.util.List<CustomImage> customImage;

        @com.aliyun.core.annotation.NameInMap("LogoData")
        private java.util.List<LogoData> logoData;

        @com.aliyun.core.annotation.NameInMap("PublicFigure")
        private java.util.List<PublicFigure> publicFigure;

        @com.aliyun.core.annotation.NameInMap("Result")
        private java.util.List<ResultsResult> result;

        @com.aliyun.core.annotation.NameInMap("Service")
        private String service;

        @com.aliyun.core.annotation.NameInMap("TextInImage")
        private java.util.Map<String, ?> textInImage;

        @com.aliyun.core.annotation.NameInMap("VlContent")
        private VlContent vlContent;

        private Results(Builder builder) {
            this.aigcData = builder.aigcData;
            this.customImage = builder.customImage;
            this.logoData = builder.logoData;
            this.publicFigure = builder.publicFigure;
            this.result = builder.result;
            this.service = builder.service;
            this.textInImage = builder.textInImage;
            this.vlContent = builder.vlContent;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Results create() {
            return builder().build();
        }

        /**
         * @return aigcData
         */
        public ResultsAigcData getAigcData() {
            return this.aigcData;
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
        public java.util.List<ResultsResult> getResult() {
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

        /**
         * @return vlContent
         */
        public VlContent getVlContent() {
            return this.vlContent;
        }

        public static final class Builder {
            private ResultsAigcData aigcData; 
            private java.util.List<CustomImage> customImage; 
            private java.util.List<LogoData> logoData; 
            private java.util.List<PublicFigure> publicFigure; 
            private java.util.List<ResultsResult> result; 
            private String service; 
            private java.util.Map<String, ?> textInImage; 
            private VlContent vlContent; 

            private Builder() {
            } 

            private Builder(Results model) {
                this.aigcData = model.aigcData;
                this.customImage = model.customImage;
                this.logoData = model.logoData;
                this.publicFigure = model.publicFigure;
                this.result = model.result;
                this.service = model.service;
                this.textInImage = model.textInImage;
                this.vlContent = model.vlContent;
            } 

            /**
             * <p>The AIGC-related detection result.</p>
             */
            public Builder aigcData(ResultsAigcData aigcData) {
                this.aigcData = aigcData;
                return this;
            }

            /**
             * <p>The custom image library information returned when a custom image library is matched.</p>
             */
            public Builder customImage(java.util.List<CustomImage> customImage) {
                this.customImage = customImage;
                return this;
            }

            /**
             * <p>The logo information returned when the video contains logos.</p>
             */
            public Builder logoData(java.util.List<LogoData> logoData) {
                this.logoData = logoData;
                return this;
            }

            /**
             * <p>The identified public figure codes returned when the video contains specific public figures.</p>
             */
            public Builder publicFigure(java.util.List<PublicFigure> publicFigure) {
                this.publicFigure = publicFigure;
                return this;
            }

            /**
             * <p>The hit result details.</p>
             */
            public Builder result(java.util.List<ResultsResult> result) {
                this.result = result;
                return this;
            }

            /**
             * <p>The image moderation service type.</p>
             * 
             * <strong>example:</strong>
             * <p>tonalityImprove</p>
             */
            public Builder service(String service) {
                this.service = service;
                return this;
            }

            /**
             * <p>The text information in the image that was hit.</p>
             */
            public Builder textInImage(java.util.Map<String, ?> textInImage) {
                this.textInImage = textInImage;
                return this;
            }

            /**
             * <p>The large model result.</p>
             */
            public Builder vlContent(VlContent vlContent) {
                this.vlContent = vlContent;
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

            private Builder() {
            } 

            private Builder(Frames model) {
                this.offset = model.offset;
                this.results = model.results;
                this.riskLevel = model.riskLevel;
                this.tempUrl = model.tempUrl;
                this.timestamp = model.timestamp;
            } 

            /**
             * <p>The offset value of the captured frame.</p>
             * 
             * <strong>example:</strong>
             * <p>338</p>
             */
            public Builder offset(Float offset) {
                this.offset = offset;
                return this;
            }

            /**
             * <p>The frame detection result details.</p>
             */
            public Builder results(java.util.List<Results> results) {
                this.results = results;
                return this;
            }

            /**
             * <p>The risk level, returned based on the configured high and low risk scores. Valid values:</p>
             * <ul>
             * <li><p>high: High risk.</p>
             * </li>
             * <li><p>medium: Medium risk.</p>
             * </li>
             * <li><p>low: Low risk.</p>
             * </li>
             * <li><p>none: No risk detected.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>high</p>
             */
            public Builder riskLevel(String riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            /**
             * <p>The temporary access URL of the captured frame image.</p>
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

            private Builder() {
            } 

            private Builder(FrameResult model) {
                this.frameNum = model.frameNum;
                this.frameSummarys = model.frameSummarys;
                this.frames = model.frames;
                this.riskLevel = model.riskLevel;
            } 

            /**
             * <p>The number of result frames.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder frameNum(Integer frameNum) {
                this.frameNum = frameNum;
                return this;
            }

            /**
             * <p>The summary of video frame labels.</p>
             */
            public Builder frameSummarys(java.util.List<FrameSummarys> frameSummarys) {
                this.frameSummarys = frameSummarys;
                return this;
            }

            /**
             * <p>The information about video frames that contain hit labels.</p>
             */
            public Builder frames(java.util.List<Frames> frames) {
                this.frames = frames;
                return this;
            }

            /**
             * <p>The risk level, which is returned based on the configured high and low risk scores. Valid values:</p>
             * <ul>
             * <li><p>high: high risk.</p>
             * </li>
             * <li><p>medium: medium risk.</p>
             * </li>
             * <li><p>low: low risk.</p>
             * </li>
             * <li><p>none: no risk detected.</p>
             * </li>
             * </ul>
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

        @com.aliyun.core.annotation.NameInMap("Ext")
        private Ext ext;

        @com.aliyun.core.annotation.NameInMap("FrameResult")
        private FrameResult frameResult;

        @com.aliyun.core.annotation.NameInMap("LiveId")
        private String liveId;

        @com.aliyun.core.annotation.NameInMap("ManualTaskId")
        private String manualTaskId;

        @com.aliyun.core.annotation.NameInMap("RiskLevel")
        private String riskLevel;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        private Data(Builder builder) {
            this.audioResult = builder.audioResult;
            this.dataId = builder.dataId;
            this.ext = builder.ext;
            this.frameResult = builder.frameResult;
            this.liveId = builder.liveId;
            this.manualTaskId = builder.manualTaskId;
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
         * @return ext
         */
        public Ext getExt() {
            return this.ext;
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
         * @return manualTaskId
         */
        public String getManualTaskId() {
            return this.manualTaskId;
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
            private Ext ext; 
            private FrameResult frameResult; 
            private String liveId; 
            private String manualTaskId; 
            private String riskLevel; 
            private String taskId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.audioResult = model.audioResult;
                this.dataId = model.dataId;
                this.ext = model.ext;
                this.frameResult = model.frameResult;
                this.liveId = model.liveId;
                this.manualTaskId = model.manualTaskId;
                this.riskLevel = model.riskLevel;
                this.taskId = model.taskId;
            } 

            /**
             * <p>The segmented audio moderation results for the video.</p>
             */
            public Builder audioResult(AudioResult audioResult) {
                this.audioResult = audioResult;
                return this;
            }

            /**
             * <p>The value of dataId passed in the API request. This field is not returned if dataId was not specified in the request.</p>
             * 
             * <strong>example:</strong>
             * <p>product_content-2055763</p>
             */
            public Builder dataId(String dataId) {
                this.dataId = dataId;
                return this;
            }

            /**
             * <p>The extended information.</p>
             */
            public Builder ext(Ext ext) {
                this.ext = ext;
                return this;
            }

            /**
             * <p>The list of video frame capture results.</p>
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
             * <p>The manual review task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>xxxxx-xxxxx</p>
             */
            public Builder manualTaskId(String manualTaskId) {
                this.manualTaskId = manualTaskId;
                return this;
            }

            /**
             * <p>The risk level, returned based on the configured high and low risk scores. Valid values:</p>
             * <ul>
             * <li><p>high: High risk.</p>
             * </li>
             * <li><p>medium: Medium risk.</p>
             * </li>
             * <li><p>low: Low risk.</p>
             * </li>
             * <li><p>none: No risk detected.</p>
             * </li>
             * </ul>
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
