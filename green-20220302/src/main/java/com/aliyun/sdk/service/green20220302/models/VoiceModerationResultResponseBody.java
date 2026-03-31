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
 * {@link VoiceModerationResultResponseBody} extends {@link TeaModel}
 *
 * <p>VoiceModerationResultResponseBody</p>
 */
public class VoiceModerationResultResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private VoiceModerationResultResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static VoiceModerationResultResponseBody create() {
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

        private Builder(VoiceModerationResultResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The returned HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The data returned.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The message that is returned in response to the request.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>2881AD4F-638B-52A3-BA20-F74C5B1CEAE3</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public VoiceModerationResultResponseBody build() {
            return new VoiceModerationResultResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link VoiceModerationResultResponseBody} extends {@link TeaModel}
     *
     * <p>VoiceModerationResultResponseBody</p>
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
             * KeyWords.
             */
            public Builder keyWords(String keyWords) {
                this.keyWords = keyWords;
                return this;
            }

            /**
             * LibName.
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
     * {@link VoiceModerationResultResponseBody} extends {@link TeaModel}
     *
     * <p>VoiceModerationResultResponseBody</p>
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
             * EndPos.
             */
            public Builder endPos(Integer endPos) {
                this.endPos = endPos;
                return this;
            }

            /**
             * RiskWord.
             */
            public Builder riskWord(String riskWord) {
                this.riskWord = riskWord;
                return this;
            }

            /**
             * StartPos.
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
     * {@link VoiceModerationResultResponseBody} extends {@link TeaModel}
     *
     * <p>VoiceModerationResultResponseBody</p>
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
             * Confidence.
             */
            public Builder confidence(Float confidence) {
                this.confidence = confidence;
                return this;
            }

            /**
             * CustomizedHit.
             */
            public Builder customizedHit(java.util.List<CustomizedHit> customizedHit) {
                this.customizedHit = customizedHit;
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
             * Label.
             */
            public Builder label(String label) {
                this.label = label;
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
             * RiskPositions.
             */
            public Builder riskPositions(java.util.List<RiskPositions> riskPositions) {
                this.riskPositions = riskPositions;
                return this;
            }

            /**
             * RiskWords.
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
     * {@link VoiceModerationResultResponseBody} extends {@link TeaModel}
     *
     * <p>VoiceModerationResultResponseBody</p>
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

        @com.aliyun.core.annotation.NameInMap("OriginAlgoResult")
        private java.util.Map<String, ?> originAlgoResult;

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
            this.originAlgoResult = builder.originAlgoResult;
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
         * @return originAlgoResult
         */
        public java.util.Map<String, ?> getOriginAlgoResult() {
            return this.originAlgoResult;
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
            private java.util.Map<String, ?> originAlgoResult; 
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
                this.originAlgoResult = model.originAlgoResult;
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
             * <p>The description of the labels.</p>
             * 
             * <strong>example:</strong>
             * <p>no risk</p>
             */
            public Builder descriptions(String descriptions) {
                this.descriptions = descriptions;
                return this;
            }

            /**
             * <p>The end time of the audio segment in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The end timestamp of the segment. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1678854649720</p>
             */
            public Builder endTimestamp(Long endTimestamp) {
                this.endTimestamp = endTimestamp;
                return this;
            }

            /**
             * <p>Extended fields.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;riskTips&quot;:&quot;sexuality_Suggestive&quot;,&quot;riskWords&quot;:&quot;pxxxxy&quot;}</p>
             */
            public Builder extend(String extend) {
                this.extend = extend;
                return this;
            }

            /**
             * <p>The details of the labels.</p>
             * 
             * <strong>example:</strong>
             * <p>sexual_sounds</p>
             */
            public Builder labels(String labels) {
                this.labels = labels;
                return this;
            }

            /**
             * <p>Reserved parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder originAlgoResult(java.util.Map<String, ?> originAlgoResult) {
                this.originAlgoResult = originAlgoResult;
                return this;
            }

            /**
             * Result.
             */
            public Builder result(java.util.List<Result> result) {
                this.result = result;
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
             * <p>The details of the risky content.</p>
             * 
             * <strong>example:</strong>
             * <p>sexuality_Suggestive</p>
             */
            public Builder riskTips(String riskTips) {
                this.riskTips = riskTips;
                return this;
            }

            /**
             * <p>The term hit by the risky content.</p>
             * 
             * <strong>example:</strong>
             * <p>AAA,BBB,CCC</p>
             */
            public Builder riskWords(String riskWords) {
                this.riskWords = riskWords;
                return this;
            }

            /**
             * <p>The risk score. Default range: 0 to 99.</p>
             * 
             * <strong>example:</strong>
             * <p>87.01</p>
             */
            public Builder score(Float score) {
                this.score = score;
                return this;
            }

            /**
             * <p>The start time of the audio segment in seconds.</p>
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
             * <p>1678854649720</p>
             */
            public Builder startTimestamp(Long startTimestamp) {
                this.startTimestamp = startTimestamp;
                return this;
            }

            /**
             * <p>The text converted from the audio segment.</p>
             * 
             * <strong>example:</strong>
             * <p>Disgusting</p>
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            /**
             * <p>The temporary URL of the audio segment.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://aliyundoc.com">https://aliyundoc.com</a></p>
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
     * {@link VoiceModerationResultResponseBody} extends {@link TeaModel}
     *
     * <p>VoiceModerationResultResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataId")
        private String dataId;

        @com.aliyun.core.annotation.NameInMap("LiveId")
        private String liveId;

        @com.aliyun.core.annotation.NameInMap("ManualTaskId")
        private String manualTaskId;

        @com.aliyun.core.annotation.NameInMap("RiskLevel")
        private String riskLevel;

        @com.aliyun.core.annotation.NameInMap("SliceDetails")
        private java.util.List<SliceDetails> sliceDetails;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private Data(Builder builder) {
            this.dataId = builder.dataId;
            this.liveId = builder.liveId;
            this.manualTaskId = builder.manualTaskId;
            this.riskLevel = builder.riskLevel;
            this.sliceDetails = builder.sliceDetails;
            this.taskId = builder.taskId;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return dataId
         */
        public String getDataId() {
            return this.dataId;
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
         * @return sliceDetails
         */
        public java.util.List<SliceDetails> getSliceDetails() {
            return this.sliceDetails;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String dataId; 
            private String liveId; 
            private String manualTaskId; 
            private String riskLevel; 
            private java.util.List<SliceDetails> sliceDetails; 
            private String taskId; 
            private String url; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.dataId = model.dataId;
                this.liveId = model.liveId;
                this.manualTaskId = model.manualTaskId;
                this.riskLevel = model.riskLevel;
                this.sliceDetails = model.sliceDetails;
                this.taskId = model.taskId;
                this.url = model.url;
            } 

            /**
             * <p>The ID of the moderated object.</p>
             * 
             * <strong>example:</strong>
             * <p>26769ada6e264e7ba9aa048241e12be9</p>
             */
            public Builder dataId(String dataId) {
                this.dataId = dataId;
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
             * ManualTaskId.
             */
            public Builder manualTaskId(String manualTaskId) {
                this.manualTaskId = manualTaskId;
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
             * <p>The moderation results of audio segments.</p>
             */
            public Builder sliceDetails(java.util.List<SliceDetails> sliceDetails) {
                this.sliceDetails = sliceDetails;
                return this;
            }

            /**
             * <p>The task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>kw24ihd0WGkdi5nniVZM@qOj-1x5Ibb</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>The URL of the moderated content.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://aliyundoc.com">https://aliyundoc.com</a></p>
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
