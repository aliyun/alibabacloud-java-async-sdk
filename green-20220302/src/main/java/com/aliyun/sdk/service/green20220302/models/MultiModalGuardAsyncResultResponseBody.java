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
 * {@link MultiModalGuardAsyncResultResponseBody} extends {@link TeaModel}
 *
 * <p>MultiModalGuardAsyncResultResponseBody</p>
 */
public class MultiModalGuardAsyncResultResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private MultiModalGuardAsyncResultResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MultiModalGuardAsyncResultResponseBody create() {
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

        private Builder(MultiModalGuardAsyncResultResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message.</p>
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
         * <p>AAAAAA-BBBB-CCCCC-DDDD-EEEEEEEE****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public MultiModalGuardAsyncResultResponseBody build() {
            return new MultiModalGuardAsyncResultResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link MultiModalGuardAsyncResultResponseBody} extends {@link TeaModel}
     *
     * <p>MultiModalGuardAsyncResultResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Confidence")
        private Float confidence;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Ext")
        private Object ext;

        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        @com.aliyun.core.annotation.NameInMap("Level")
        private String level;

        private Result(Builder builder) {
            this.confidence = builder.confidence;
            this.description = builder.description;
            this.ext = builder.ext;
            this.label = builder.label;
            this.level = builder.level;
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
         * @return ext
         */
        public Object getExt() {
            return this.ext;
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        /**
         * @return level
         */
        public String getLevel() {
            return this.level;
        }

        public static final class Builder {
            private Float confidence; 
            private String description; 
            private Object ext; 
            private String label; 
            private String level; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.confidence = model.confidence;
                this.description = model.description;
                this.ext = model.ext;
                this.label = model.label;
                this.level = model.level;
            } 

            /**
             * <p>The confidence score, ranging from 0 to 100, rounded to two decimal places.</p>
             * 
             * <strong>example:</strong>
             * <p>90</p>
             */
            public Builder confidence(Float confidence) {
                this.confidence = confidence;
                return this;
            }

            /**
             * <p>The label description.</p>
             * 
             * <strong>example:</strong>
             * <p>drugs.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The extended information of the moderation result.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder ext(Object ext) {
                this.ext = ext;
                return this;
            }

            /**
             * <p>The label.</p>
             * 
             * <strong>example:</strong>
             * <p>drug</p>
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * <p>The risk level. Valid values:</p>
             * <ul>
             * <li>high: High risk. If a custom keyword library is hit, the risk level defaults to high.</li>
             * <li>medium: Medium risk.</li>
             * <li>low: Low risk.</li>
             * <li>none: No risk detected.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>high</p>
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
    /**
     * 
     * {@link MultiModalGuardAsyncResultResponseBody} extends {@link TeaModel}
     *
     * <p>MultiModalGuardAsyncResultResponseBody</p>
     */
    public static class Detail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Level")
        private String level;

        @com.aliyun.core.annotation.NameInMap("Result")
        private java.util.List<Result> result;

        @com.aliyun.core.annotation.NameInMap("Suggestion")
        private String suggestion;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Detail(Builder builder) {
            this.level = builder.level;
            this.result = builder.result;
            this.suggestion = builder.suggestion;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Detail create() {
            return builder().build();
        }

        /**
         * @return level
         */
        public String getLevel() {
            return this.level;
        }

        /**
         * @return result
         */
        public java.util.List<Result> getResult() {
            return this.result;
        }

        /**
         * @return suggestion
         */
        public String getSuggestion() {
            return this.suggestion;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String level; 
            private java.util.List<Result> result; 
            private String suggestion; 
            private String type; 

            private Builder() {
            } 

            private Builder(Detail model) {
                this.level = model.level;
                this.result = model.result;
                this.suggestion = model.suggestion;
                this.type = model.type;
            } 

            /**
             * <p>The risk level. Valid values:</p>
             * <ul>
             * <li>high: High risk. If a custom keyword library is hit, the risk level defaults to high.</li>
             * <li>medium: Medium risk.</li>
             * <li>low: Low risk.</li>
             * <li>none: No risk detected.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>high</p>
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * <p>The list of moderation results.</p>
             */
            public Builder result(java.util.List<Result> result) {
                this.result = result;
                return this;
            }

            /**
             * <p>The recommended action. Valid values:</p>
             * <ul>
             * <li>block: Block the content.</li>
             * <li>pass: Allow the content.</li>
             * <li>watch: Manually review the content.</li>
             * <li>mask: Mask the content.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>block</p>
             */
            public Builder suggestion(String suggestion) {
                this.suggestion = suggestion;
                return this;
            }

            /**
             * <p>The moderation type. Valid values:</p>
             * <ul>
             * <li>contentModeration: content compliance moderation</li>
             * <li>promptAttack: prompt attack detection</li>
             * <li>sensitiveData: sensitive content detection</li>
             * <li>modelHallucination: model hallucination detection</li>
             * <li>maliciousFile: malicious file detection</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>contentModeration</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Detail build() {
                return new Detail(this);
            } 

        } 

    }
    /**
     * 
     * {@link MultiModalGuardAsyncResultResponseBody} extends {@link TeaModel}
     *
     * <p>MultiModalGuardAsyncResultResponseBody</p>
     */
    public static class SliceDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Detail")
        private java.util.List<Detail> detail;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        @com.aliyun.core.annotation.NameInMap("Suggestion")
        private String suggestion;

        @com.aliyun.core.annotation.NameInMap("Text")
        private String text;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private SliceDetails(Builder builder) {
            this.detail = builder.detail;
            this.endTime = builder.endTime;
            this.startTime = builder.startTime;
            this.suggestion = builder.suggestion;
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
         * @return detail
         */
        public java.util.List<Detail> getDetail() {
            return this.detail;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        /**
         * @return suggestion
         */
        public String getSuggestion() {
            return this.suggestion;
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
            private java.util.List<Detail> detail; 
            private Long endTime; 
            private Long startTime; 
            private String suggestion; 
            private String text; 
            private String url; 

            private Builder() {
            } 

            private Builder(SliceDetails model) {
                this.detail = model.detail;
                this.endTime = model.endTime;
                this.startTime = model.startTime;
                this.suggestion = model.suggestion;
                this.text = model.text;
                this.url = model.url;
            } 

            /**
             * <p>The moderation details.</p>
             */
            public Builder detail(java.util.List<Detail> detail) {
                this.detail = detail;
                return this;
            }

            /**
             * <p>The end time of the segment, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
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
             * <p>The recommended action. Valid values:</p>
             * <ul>
             * <li>block: Block the content.</li>
             * <li>pass: Allow the content.</li>
             * <li>watch: Manually review the content.</li>
             * <li>mask: Mask the content.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>block</p>
             */
            public Builder suggestion(String suggestion) {
                this.suggestion = suggestion;
                return this;
            }

            /**
             * <p>The transcribed text of the audio segment.</p>
             * 
             * <strong>example:</strong>
             * <p>The weather is really nice today.</p>
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            /**
             * <p>The temporary URL of the audio segment file.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://xxxx.abc.wav">http://xxxx.abc.wav</a></p>
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
     * {@link MultiModalGuardAsyncResultResponseBody} extends {@link TeaModel}
     *
     * <p>MultiModalGuardAsyncResultResponseBody</p>
     */
    public static class AudioResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SliceDetails")
        private java.util.List<SliceDetails> sliceDetails;

        @com.aliyun.core.annotation.NameInMap("SliceNum")
        private Integer sliceNum;

        @com.aliyun.core.annotation.NameInMap("Suggestion")
        private String suggestion;

        private AudioResult(Builder builder) {
            this.sliceDetails = builder.sliceDetails;
            this.sliceNum = builder.sliceNum;
            this.suggestion = builder.suggestion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AudioResult create() {
            return builder().build();
        }

        /**
         * @return sliceDetails
         */
        public java.util.List<SliceDetails> getSliceDetails() {
            return this.sliceDetails;
        }

        /**
         * @return sliceNum
         */
        public Integer getSliceNum() {
            return this.sliceNum;
        }

        /**
         * @return suggestion
         */
        public String getSuggestion() {
            return this.suggestion;
        }

        public static final class Builder {
            private java.util.List<SliceDetails> sliceDetails; 
            private Integer sliceNum; 
            private String suggestion; 

            private Builder() {
            } 

            private Builder(AudioResult model) {
                this.sliceDetails = model.sliceDetails;
                this.sliceNum = model.sliceNum;
                this.suggestion = model.suggestion;
            } 

            /**
             * <p>The segment details.</p>
             */
            public Builder sliceDetails(java.util.List<SliceDetails> sliceDetails) {
                this.sliceDetails = sliceDetails;
                return this;
            }

            /**
             * <p>The number of segments.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder sliceNum(Integer sliceNum) {
                this.sliceNum = sliceNum;
                return this;
            }

            /**
             * <p>The recommended action.</p>
             * 
             * <strong>example:</strong>
             * <p>pass</p>
             */
            public Builder suggestion(String suggestion) {
                this.suggestion = suggestion;
                return this;
            }

            public AudioResult build() {
                return new AudioResult(this);
            } 

        } 

    }
    /**
     * 
     * {@link MultiModalGuardAsyncResultResponseBody} extends {@link TeaModel}
     *
     * <p>MultiModalGuardAsyncResultResponseBody</p>
     */
    public static class DetailResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Confidence")
        private Float confidence;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Ext")
        private Object ext;

        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        @com.aliyun.core.annotation.NameInMap("Level")
        private String level;

        private DetailResult(Builder builder) {
            this.confidence = builder.confidence;
            this.description = builder.description;
            this.ext = builder.ext;
            this.label = builder.label;
            this.level = builder.level;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DetailResult create() {
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
         * @return ext
         */
        public Object getExt() {
            return this.ext;
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        /**
         * @return level
         */
        public String getLevel() {
            return this.level;
        }

        public static final class Builder {
            private Float confidence; 
            private String description; 
            private Object ext; 
            private String label; 
            private String level; 

            private Builder() {
            } 

            private Builder(DetailResult model) {
                this.confidence = model.confidence;
                this.description = model.description;
                this.ext = model.ext;
                this.label = model.label;
                this.level = model.level;
            } 

            /**
             * <p>The confidence score, ranging from 0 to 100, rounded to two decimal places.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder confidence(Float confidence) {
                this.confidence = confidence;
                return this;
            }

            /**
             * <p>The label description.</p>
             * 
             * <strong>example:</strong>
             * <p>advertisement.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The extended information of the moderation result.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder ext(Object ext) {
                this.ext = ext;
                return this;
            }

            /**
             * <p>The label.</p>
             * 
             * <strong>example:</strong>
             * <p>ad</p>
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * <p>The risk level. Valid values:</p>
             * <ul>
             * <li>high: High risk. If a custom keyword library is hit, the risk level defaults to high.</li>
             * <li>medium: Medium risk.</li>
             * <li>low: Low risk.</li>
             * <li>none: No risk detected.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>loose</p>
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            public DetailResult build() {
                return new DetailResult(this);
            } 

        } 

    }
    /**
     * 
     * {@link MultiModalGuardAsyncResultResponseBody} extends {@link TeaModel}
     *
     * <p>MultiModalGuardAsyncResultResponseBody</p>
     */
    public static class FramesDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Level")
        private String level;

        @com.aliyun.core.annotation.NameInMap("Result")
        private java.util.List<DetailResult> result;

        @com.aliyun.core.annotation.NameInMap("Suggestion")
        private String suggestion;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private FramesDetail(Builder builder) {
            this.level = builder.level;
            this.result = builder.result;
            this.suggestion = builder.suggestion;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FramesDetail create() {
            return builder().build();
        }

        /**
         * @return level
         */
        public String getLevel() {
            return this.level;
        }

        /**
         * @return result
         */
        public java.util.List<DetailResult> getResult() {
            return this.result;
        }

        /**
         * @return suggestion
         */
        public String getSuggestion() {
            return this.suggestion;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String level; 
            private java.util.List<DetailResult> result; 
            private String suggestion; 
            private String type; 

            private Builder() {
            } 

            private Builder(FramesDetail model) {
                this.level = model.level;
                this.result = model.result;
                this.suggestion = model.suggestion;
                this.type = model.type;
            } 

            /**
             * <p>The risk level. Valid values:</p>
             * <ul>
             * <li>high: High risk. If a custom keyword library is hit, the risk level defaults to high.</li>
             * <li>medium: Medium risk.</li>
             * <li>low: Low risk.</li>
             * <li>none: No risk detected.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>low</p>
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * <p>The moderation result.</p>
             */
            public Builder result(java.util.List<DetailResult> result) {
                this.result = result;
                return this;
            }

            /**
             * <p>The recommended action. Valid values:</p>
             * <ul>
             * <li>block: Block the content.</li>
             * <li>pass: Allow the content.</li>
             * <li>watch: Manually review the content.</li>
             * <li>mask: Mask the content.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>watch</p>
             */
            public Builder suggestion(String suggestion) {
                this.suggestion = suggestion;
                return this;
            }

            /**
             * <p>The moderation type. Valid values:</p>
             * <ul>
             * <li>contentModeration: content compliance moderation</li>
             * <li>promptAttack: prompt attack detection</li>
             * <li>sensitiveData: sensitive content detection</li>
             * <li>modelHallucination: model hallucination detection</li>
             * <li>maliciousFile: malicious file detection</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>contentModeration</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public FramesDetail build() {
                return new FramesDetail(this);
            } 

        } 

    }
    /**
     * 
     * {@link MultiModalGuardAsyncResultResponseBody} extends {@link TeaModel}
     *
     * <p>MultiModalGuardAsyncResultResponseBody</p>
     */
    public static class Frames extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Detail")
        private java.util.List<FramesDetail> detail;

        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private Integer errorCode;

        @com.aliyun.core.annotation.NameInMap("ErrorMsg")
        private String errorMsg;

        @com.aliyun.core.annotation.NameInMap("Offset")
        private Float offset;

        @com.aliyun.core.annotation.NameInMap("Suggestion")
        private String suggestion;

        @com.aliyun.core.annotation.NameInMap("Timestamp")
        private Long timestamp;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private Frames(Builder builder) {
            this.detail = builder.detail;
            this.errorCode = builder.errorCode;
            this.errorMsg = builder.errorMsg;
            this.offset = builder.offset;
            this.suggestion = builder.suggestion;
            this.timestamp = builder.timestamp;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Frames create() {
            return builder().build();
        }

        /**
         * @return detail
         */
        public java.util.List<FramesDetail> getDetail() {
            return this.detail;
        }

        /**
         * @return errorCode
         */
        public Integer getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return errorMsg
         */
        public String getErrorMsg() {
            return this.errorMsg;
        }

        /**
         * @return offset
         */
        public Float getOffset() {
            return this.offset;
        }

        /**
         * @return suggestion
         */
        public String getSuggestion() {
            return this.suggestion;
        }

        /**
         * @return timestamp
         */
        public Long getTimestamp() {
            return this.timestamp;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private java.util.List<FramesDetail> detail; 
            private Integer errorCode; 
            private String errorMsg; 
            private Float offset; 
            private String suggestion; 
            private Long timestamp; 
            private String url; 

            private Builder() {
            } 

            private Builder(Frames model) {
                this.detail = model.detail;
                this.errorCode = model.errorCode;
                this.errorMsg = model.errorMsg;
                this.offset = model.offset;
                this.suggestion = model.suggestion;
                this.timestamp = model.timestamp;
                this.url = model.url;
            } 

            /**
             * <p>The list of moderation results.</p>
             */
            public Builder detail(java.util.List<FramesDetail> detail) {
                this.detail = detail;
                return this;
            }

            /**
             * <p>The error code.</p>
             * 
             * <strong>example:</strong>
             * <p>401</p>
             */
            public Builder errorCode(Integer errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * <p>The error message.</p>
             * 
             * <strong>example:</strong>
             * <p>parameter invalid</p>
             */
            public Builder errorMsg(String errorMsg) {
                this.errorMsg = errorMsg;
                return this;
            }

            /**
             * <p>The frame capture position.</p>
             * 
             * <strong>example:</strong>
             * <p>1.5</p>
             */
            public Builder offset(Float offset) {
                this.offset = offset;
                return this;
            }

            /**
             * <p>The recommended action. Valid values:</p>
             * <ul>
             * <li>block: Block the content.</li>
             * <li>pass: Allow the content.</li>
             * <li>watch: Manually review the content.</li>
             * <li>mask: Mask the content.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>block</p>
             */
            public Builder suggestion(String suggestion) {
                this.suggestion = suggestion;
                return this;
            }

            /**
             * <p>The absolute timestamp, in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1684559739000</p>
             */
            public Builder timestamp(Long timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            /**
             * <p>The temporary URL of the segment.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://xxx.jpeg">https://xxx.jpeg</a></p>
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public Frames build() {
                return new Frames(this);
            } 

        } 

    }
    /**
     * 
     * {@link MultiModalGuardAsyncResultResponseBody} extends {@link TeaModel}
     *
     * <p>MultiModalGuardAsyncResultResponseBody</p>
     */
    public static class FrameResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Frames")
        private java.util.List<Frames> frames;

        @com.aliyun.core.annotation.NameInMap("SliceNum")
        private Integer sliceNum;

        @com.aliyun.core.annotation.NameInMap("Suggestion")
        private String suggestion;

        private FrameResult(Builder builder) {
            this.frames = builder.frames;
            this.sliceNum = builder.sliceNum;
            this.suggestion = builder.suggestion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FrameResult create() {
            return builder().build();
        }

        /**
         * @return frames
         */
        public java.util.List<Frames> getFrames() {
            return this.frames;
        }

        /**
         * @return sliceNum
         */
        public Integer getSliceNum() {
            return this.sliceNum;
        }

        /**
         * @return suggestion
         */
        public String getSuggestion() {
            return this.suggestion;
        }

        public static final class Builder {
            private java.util.List<Frames> frames; 
            private Integer sliceNum; 
            private String suggestion; 

            private Builder() {
            } 

            private Builder(FrameResult model) {
                this.frames = model.frames;
                this.sliceNum = model.sliceNum;
                this.suggestion = model.suggestion;
            } 

            /**
             * <p>The frame moderation results.</p>
             */
            public Builder frames(java.util.List<Frames> frames) {
                this.frames = frames;
                return this;
            }

            /**
             * <p>The number of segments.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder sliceNum(Integer sliceNum) {
                this.sliceNum = sliceNum;
                return this;
            }

            /**
             * <p>The recommended action. Valid values:</p>
             * <ul>
             * <li>block: Block the content.</li>
             * <li>pass: Allow the content.</li>
             * <li>watch: Manually review the content.</li>
             * <li>mask: Mask the content.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>pass</p>
             */
            public Builder suggestion(String suggestion) {
                this.suggestion = suggestion;
                return this;
            }

            public FrameResult build() {
                return new FrameResult(this);
            } 

        } 

    }
    /**
     * 
     * {@link MultiModalGuardAsyncResultResponseBody} extends {@link TeaModel}
     *
     * <p>MultiModalGuardAsyncResultResponseBody</p>
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

        @com.aliyun.core.annotation.NameInMap("Suggestion")
        private String suggestion;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        private Data(Builder builder) {
            this.audioResult = builder.audioResult;
            this.dataId = builder.dataId;
            this.frameResult = builder.frameResult;
            this.liveId = builder.liveId;
            this.suggestion = builder.suggestion;
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
         * @return suggestion
         */
        public String getSuggestion() {
            return this.suggestion;
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
            private String suggestion; 
            private String taskId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.audioResult = model.audioResult;
                this.dataId = model.dataId;
                this.frameResult = model.frameResult;
                this.liveId = model.liveId;
                this.suggestion = model.suggestion;
                this.taskId = model.taskId;
            } 

            /**
             * <p>The audio moderation segment results.</p>
             */
            public Builder audioResult(AudioResult audioResult) {
                this.audioResult = audioResult;
                return this;
            }

            /**
             * <p>The value of dataId passed in the API request. This field is not returned if dataId was not specified in the request.</p>
             * 
             * <strong>example:</strong>
             * <p>data1234</p>
             */
            public Builder dataId(String dataId) {
                this.dataId = dataId;
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
             * <p>The recommended action. Valid values:</p>
             * <ul>
             * <li>block: Block the content.</li>
             * <li>pass: Allow the content.</li>
             * <li>watch: Manually review the content.</li>
             * <li>mask: Mask the content.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>pass</p>
             */
            public Builder suggestion(String suggestion) {
                this.suggestion = suggestion;
                return this;
            }

            /**
             * <p>The task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vi_f_xxx</p>
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
