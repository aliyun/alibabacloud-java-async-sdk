// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220302.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link VoiceModerationResultResponseBody} extends {@link TeaModel}
 *
 * <p>VoiceModerationResultResponseBody</p>
 */
public class VoiceModerationResultResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
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

        public VoiceModerationResultResponseBody build() {
            return new VoiceModerationResultResponseBody(this);
        } 

    } 

    public static class SliceDetails extends TeaModel {
        @NameInMap("EndTime")
        private Long endTime;

        @NameInMap("EndTimestamp")
        private Long endTimestamp;

        @NameInMap("Extend")
        private String extend;

        @NameInMap("Labels")
        private String labels;

        @NameInMap("OriginAlgoResult")
        private java.util.Map < String, ? > originAlgoResult;

        @NameInMap("RiskTips")
        private String riskTips;

        @NameInMap("RiskWords")
        private String riskWords;

        @NameInMap("Score")
        private Float score;

        @NameInMap("StartTime")
        private Long startTime;

        @NameInMap("StartTimestamp")
        private Long startTimestamp;

        @NameInMap("Text")
        private String text;

        @NameInMap("Url")
        private String url;

        private SliceDetails(Builder builder) {
            this.endTime = builder.endTime;
            this.endTimestamp = builder.endTimestamp;
            this.extend = builder.extend;
            this.labels = builder.labels;
            this.originAlgoResult = builder.originAlgoResult;
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
         * @return originAlgoResult
         */
        public java.util.Map < String, ? > getOriginAlgoResult() {
            return this.originAlgoResult;
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
            private java.util.Map < String, ? > originAlgoResult; 
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
             * OriginAlgoResult.
             */
            public Builder originAlgoResult(java.util.Map < String, ? > originAlgoResult) {
                this.originAlgoResult = originAlgoResult;
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
    public static class Data extends TeaModel {
        @NameInMap("LiveId")
        private String liveId;

        @NameInMap("SliceDetails")
        private java.util.List < SliceDetails> sliceDetails;

        @NameInMap("TaskId")
        private String taskId;

        @NameInMap("Url")
        private String url;

        private Data(Builder builder) {
            this.liveId = builder.liveId;
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
         * @return liveId
         */
        public String getLiveId() {
            return this.liveId;
        }

        /**
         * @return sliceDetails
         */
        public java.util.List < SliceDetails> getSliceDetails() {
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
            private String liveId; 
            private java.util.List < SliceDetails> sliceDetails; 
            private String taskId; 
            private String url; 

            /**
             * LiveId.
             */
            public Builder liveId(String liveId) {
                this.liveId = liveId;
                return this;
            }

            /**
             * SliceDetails.
             */
            public Builder sliceDetails(java.util.List < SliceDetails> sliceDetails) {
                this.sliceDetails = sliceDetails;
                return this;
            }

            /**
             * TaskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * Url.
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
