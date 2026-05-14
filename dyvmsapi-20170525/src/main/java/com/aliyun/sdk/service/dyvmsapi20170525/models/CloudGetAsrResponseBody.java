// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525.models;

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
 * {@link CloudGetAsrResponseBody} extends {@link TeaModel}
 *
 * <p>CloudGetAsrResponseBody</p>
 */
public class CloudGetAsrResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CloudGetAsrResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CloudGetAsrResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    /**
     * @return code
     */
    public String getCode() {
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
        private String accessDeniedDetail; 
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CloudGetAsrResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * AccessDeniedDetail.
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(String code) {
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CloudGetAsrResponseBody build() {
            return new CloudGetAsrResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CloudGetAsrResponseBody} extends {@link TeaModel}
     *
     * <p>CloudGetAsrResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BeginTime")
        private Long beginTime;

        @com.aliyun.core.annotation.NameInMap("ChannelId")
        private Long channelId;

        @com.aliyun.core.annotation.NameInMap("EmotionValue")
        private Double emotionValue;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("SilenceDuration")
        private Long silenceDuration;

        @com.aliyun.core.annotation.NameInMap("SpeechRate")
        private Long speechRate;

        @com.aliyun.core.annotation.NameInMap("Text")
        private String text;

        private Result(Builder builder) {
            this.beginTime = builder.beginTime;
            this.channelId = builder.channelId;
            this.emotionValue = builder.emotionValue;
            this.endTime = builder.endTime;
            this.silenceDuration = builder.silenceDuration;
            this.speechRate = builder.speechRate;
            this.text = builder.text;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return beginTime
         */
        public Long getBeginTime() {
            return this.beginTime;
        }

        /**
         * @return channelId
         */
        public Long getChannelId() {
            return this.channelId;
        }

        /**
         * @return emotionValue
         */
        public Double getEmotionValue() {
            return this.emotionValue;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return silenceDuration
         */
        public Long getSilenceDuration() {
            return this.silenceDuration;
        }

        /**
         * @return speechRate
         */
        public Long getSpeechRate() {
            return this.speechRate;
        }

        /**
         * @return text
         */
        public String getText() {
            return this.text;
        }

        public static final class Builder {
            private Long beginTime; 
            private Long channelId; 
            private Double emotionValue; 
            private Long endTime; 
            private Long silenceDuration; 
            private Long speechRate; 
            private String text; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.beginTime = model.beginTime;
                this.channelId = model.channelId;
                this.emotionValue = model.emotionValue;
                this.endTime = model.endTime;
                this.silenceDuration = model.silenceDuration;
                this.speechRate = model.speechRate;
                this.text = model.text;
            } 

            /**
             * <p>开始时间</p>
             * 
             * <strong>example:</strong>
             * <p>30140</p>
             */
            public Builder beginTime(Long beginTime) {
                this.beginTime = beginTime;
                return this;
            }

            /**
             * <p>通道id</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder channelId(Long channelId) {
                this.channelId = channelId;
                return this;
            }

            /**
             * <p>情感值</p>
             * 
             * <strong>example:</strong>
             * <p>6.0</p>
             */
            public Builder emotionValue(Double emotionValue) {
                this.emotionValue = emotionValue;
                return this;
            }

            /**
             * <p>结束时间</p>
             * 
             * <strong>example:</strong>
             * <p>31805</p>
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>沉默时间</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder silenceDuration(Long silenceDuration) {
                this.silenceDuration = silenceDuration;
                return this;
            }

            /**
             * <p>语速</p>
             * 
             * <strong>example:</strong>
             * <p>108</p>
             */
            public Builder speechRate(Long speechRate) {
                this.speechRate = speechRate;
                return this;
            }

            /**
             * <p>转写文本</p>
             * 
             * <strong>example:</strong>
             * <p>示例值示例值</p>
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
    /**
     * 
     * {@link CloudGetAsrResponseBody} extends {@link TeaModel}
     *
     * <p>CloudGetAsrResponseBody</p>
     */
    public static class RecordFileText1In extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BizDuration")
        private Long bizDuration;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Result")
        private java.util.List<Result> result;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StatusCode")
        private Long statusCode;

        private RecordFileText1In(Builder builder) {
            this.bizDuration = builder.bizDuration;
            this.errorMessage = builder.errorMessage;
            this.id = builder.id;
            this.result = builder.result;
            this.status = builder.status;
            this.statusCode = builder.statusCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RecordFileText1In create() {
            return builder().build();
        }

        /**
         * @return bizDuration
         */
        public Long getBizDuration() {
            return this.bizDuration;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return result
         */
        public java.util.List<Result> getResult() {
            return this.result;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return statusCode
         */
        public Long getStatusCode() {
            return this.statusCode;
        }

        public static final class Builder {
            private Long bizDuration; 
            private String errorMessage; 
            private String id; 
            private java.util.List<Result> result; 
            private String status; 
            private Long statusCode; 

            private Builder() {
            } 

            private Builder(RecordFileText1In model) {
                this.bizDuration = model.bizDuration;
                this.errorMessage = model.errorMessage;
                this.id = model.id;
                this.result = model.result;
                this.status = model.status;
                this.statusCode = model.statusCode;
            } 

            /**
             * BizDuration.
             */
            public Builder bizDuration(Long bizDuration) {
                this.bizDuration = bizDuration;
                return this;
            }

            /**
             * <p>错误信息</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;&quot;</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>id</p>
             * 
             * <strong>example:</strong>
             * <p>8f2ff56a7cfe458c942595b2f271d715</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>转写结果</p>
             */
            public Builder result(java.util.List<Result> result) {
                this.result = result;
                return this;
            }

            /**
             * <p>状态</p>
             * 
             * <strong>example:</strong>
             * <p>示例值示例值</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>状态码</p>
             * 
             * <strong>example:</strong>
             * <p>SUCCEED</p>
             */
            public Builder statusCode(Long statusCode) {
                this.statusCode = statusCode;
                return this;
            }

            public RecordFileText1In build() {
                return new RecordFileText1In(this);
            } 

        } 

    }
    /**
     * 
     * {@link CloudGetAsrResponseBody} extends {@link TeaModel}
     *
     * <p>CloudGetAsrResponseBody</p>
     */
    public static class RecordFileText1OutResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BeginTime")
        private Long beginTime;

        @com.aliyun.core.annotation.NameInMap("ChannelId")
        private Long channelId;

        @com.aliyun.core.annotation.NameInMap("EmotionValue")
        private Double emotionValue;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("SilenceDuration")
        private Long silenceDuration;

        @com.aliyun.core.annotation.NameInMap("SpeechRate")
        private Long speechRate;

        @com.aliyun.core.annotation.NameInMap("Text")
        private String text;

        private RecordFileText1OutResult(Builder builder) {
            this.beginTime = builder.beginTime;
            this.channelId = builder.channelId;
            this.emotionValue = builder.emotionValue;
            this.endTime = builder.endTime;
            this.silenceDuration = builder.silenceDuration;
            this.speechRate = builder.speechRate;
            this.text = builder.text;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RecordFileText1OutResult create() {
            return builder().build();
        }

        /**
         * @return beginTime
         */
        public Long getBeginTime() {
            return this.beginTime;
        }

        /**
         * @return channelId
         */
        public Long getChannelId() {
            return this.channelId;
        }

        /**
         * @return emotionValue
         */
        public Double getEmotionValue() {
            return this.emotionValue;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return silenceDuration
         */
        public Long getSilenceDuration() {
            return this.silenceDuration;
        }

        /**
         * @return speechRate
         */
        public Long getSpeechRate() {
            return this.speechRate;
        }

        /**
         * @return text
         */
        public String getText() {
            return this.text;
        }

        public static final class Builder {
            private Long beginTime; 
            private Long channelId; 
            private Double emotionValue; 
            private Long endTime; 
            private Long silenceDuration; 
            private Long speechRate; 
            private String text; 

            private Builder() {
            } 

            private Builder(RecordFileText1OutResult model) {
                this.beginTime = model.beginTime;
                this.channelId = model.channelId;
                this.emotionValue = model.emotionValue;
                this.endTime = model.endTime;
                this.silenceDuration = model.silenceDuration;
                this.speechRate = model.speechRate;
                this.text = model.text;
            } 

            /**
             * <p>开始时间</p>
             * 
             * <strong>example:</strong>
             * <p>30550</p>
             */
            public Builder beginTime(Long beginTime) {
                this.beginTime = beginTime;
                return this;
            }

            /**
             * <p>通道id</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder channelId(Long channelId) {
                this.channelId = channelId;
                return this;
            }

            /**
             * <p>情感值</p>
             * 
             * <strong>example:</strong>
             * <p>6.0</p>
             */
            public Builder emotionValue(Double emotionValue) {
                this.emotionValue = emotionValue;
                return this;
            }

            /**
             * <p>结束时间</p>
             * 
             * <strong>example:</strong>
             * <p>31515</p>
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>沉默时间</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder silenceDuration(Long silenceDuration) {
                this.silenceDuration = silenceDuration;
                return this;
            }

            /**
             * <p>语速</p>
             * 
             * <strong>example:</strong>
             * <p>186</p>
             */
            public Builder speechRate(Long speechRate) {
                this.speechRate = speechRate;
                return this;
            }

            /**
             * <p>转写文本</p>
             * 
             * <strong>example:</strong>
             * <p>示例值示例值示例值</p>
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            public RecordFileText1OutResult build() {
                return new RecordFileText1OutResult(this);
            } 

        } 

    }
    /**
     * 
     * {@link CloudGetAsrResponseBody} extends {@link TeaModel}
     *
     * <p>CloudGetAsrResponseBody</p>
     */
    public static class RecordFileText1Out extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BizDuration")
        private Long bizDuration;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Result")
        private java.util.List<RecordFileText1OutResult> result;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StatusCode")
        private Long statusCode;

        private RecordFileText1Out(Builder builder) {
            this.bizDuration = builder.bizDuration;
            this.errorMessage = builder.errorMessage;
            this.id = builder.id;
            this.result = builder.result;
            this.status = builder.status;
            this.statusCode = builder.statusCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RecordFileText1Out create() {
            return builder().build();
        }

        /**
         * @return bizDuration
         */
        public Long getBizDuration() {
            return this.bizDuration;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return result
         */
        public java.util.List<RecordFileText1OutResult> getResult() {
            return this.result;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return statusCode
         */
        public Long getStatusCode() {
            return this.statusCode;
        }

        public static final class Builder {
            private Long bizDuration; 
            private String errorMessage; 
            private String id; 
            private java.util.List<RecordFileText1OutResult> result; 
            private String status; 
            private Long statusCode; 

            private Builder() {
            } 

            private Builder(RecordFileText1Out model) {
                this.bizDuration = model.bizDuration;
                this.errorMessage = model.errorMessage;
                this.id = model.id;
                this.result = model.result;
                this.status = model.status;
                this.statusCode = model.statusCode;
            } 

            /**
             * BizDuration.
             */
            public Builder bizDuration(Long bizDuration) {
                this.bizDuration = bizDuration;
                return this;
            }

            /**
             * <p>错误信息</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;&quot;</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>id</p>
             * 
             * <strong>example:</strong>
             * <p>145a13227e3249258cd3b5232a56d634</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>转写结果</p>
             */
            public Builder result(java.util.List<RecordFileText1OutResult> result) {
                this.result = result;
                return this;
            }

            /**
             * <p>状态</p>
             * 
             * <strong>example:</strong>
             * <p>SUCCEED</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>状态码</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder statusCode(Long statusCode) {
                this.statusCode = statusCode;
                return this;
            }

            public RecordFileText1Out build() {
                return new RecordFileText1Out(this);
            } 

        } 

    }
    /**
     * 
     * {@link CloudGetAsrResponseBody} extends {@link TeaModel}
     *
     * <p>CloudGetAsrResponseBody</p>
     */
    public static class DataResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BeginTime")
        private Long beginTime;

        @com.aliyun.core.annotation.NameInMap("ChannelId")
        private Long channelId;

        @com.aliyun.core.annotation.NameInMap("EmotionValue")
        private Double emotionValue;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("Side")
        private String side;

        @com.aliyun.core.annotation.NameInMap("SilenceDuration")
        private Long silenceDuration;

        @com.aliyun.core.annotation.NameInMap("SpeechRate")
        private Long speechRate;

        @com.aliyun.core.annotation.NameInMap("Text")
        private String text;

        private DataResult(Builder builder) {
            this.beginTime = builder.beginTime;
            this.channelId = builder.channelId;
            this.emotionValue = builder.emotionValue;
            this.endTime = builder.endTime;
            this.side = builder.side;
            this.silenceDuration = builder.silenceDuration;
            this.speechRate = builder.speechRate;
            this.text = builder.text;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataResult create() {
            return builder().build();
        }

        /**
         * @return beginTime
         */
        public Long getBeginTime() {
            return this.beginTime;
        }

        /**
         * @return channelId
         */
        public Long getChannelId() {
            return this.channelId;
        }

        /**
         * @return emotionValue
         */
        public Double getEmotionValue() {
            return this.emotionValue;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return side
         */
        public String getSide() {
            return this.side;
        }

        /**
         * @return silenceDuration
         */
        public Long getSilenceDuration() {
            return this.silenceDuration;
        }

        /**
         * @return speechRate
         */
        public Long getSpeechRate() {
            return this.speechRate;
        }

        /**
         * @return text
         */
        public String getText() {
            return this.text;
        }

        public static final class Builder {
            private Long beginTime; 
            private Long channelId; 
            private Double emotionValue; 
            private Long endTime; 
            private String side; 
            private Long silenceDuration; 
            private Long speechRate; 
            private String text; 

            private Builder() {
            } 

            private Builder(DataResult model) {
                this.beginTime = model.beginTime;
                this.channelId = model.channelId;
                this.emotionValue = model.emotionValue;
                this.endTime = model.endTime;
                this.side = model.side;
                this.silenceDuration = model.silenceDuration;
                this.speechRate = model.speechRate;
                this.text = model.text;
            } 

            /**
             * <p>开始时间</p>
             * 
             * <strong>example:</strong>
             * <p>4350</p>
             */
            public Builder beginTime(Long beginTime) {
                this.beginTime = beginTime;
                return this;
            }

            /**
             * <p>通道id</p>
             * 
             * <strong>example:</strong>
             * <p>32</p>
             */
            public Builder channelId(Long channelId) {
                this.channelId = channelId;
                return this;
            }

            /**
             * <p>情感值</p>
             * 
             * <strong>example:</strong>
             * <p>7.0</p>
             */
            public Builder emotionValue(Double emotionValue) {
                this.emotionValue = emotionValue;
                return this;
            }

            /**
             * <p>结束时间</p>
             * 
             * <strong>example:</strong>
             * <p>10445</p>
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>语音文本所属方；in: 第一侧；out: 第二侧</p>
             * 
             * <strong>example:</strong>
             * <p>out</p>
             */
            public Builder side(String side) {
                this.side = side;
                return this;
            }

            /**
             * <p>沉默时间</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder silenceDuration(Long silenceDuration) {
                this.silenceDuration = silenceDuration;
                return this;
            }

            /**
             * <p>语速</p>
             * 
             * <strong>example:</strong>
             * <p>255</p>
             */
            public Builder speechRate(Long speechRate) {
                this.speechRate = speechRate;
                return this;
            }

            /**
             * <p>转写文本</p>
             * 
             * <strong>example:</strong>
             * <p>示例值示例值</p>
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            public DataResult build() {
                return new DataResult(this);
            } 

        } 

    }
    /**
     * 
     * {@link CloudGetAsrResponseBody} extends {@link TeaModel}
     *
     * <p>CloudGetAsrResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EnterpriseId")
        private String enterpriseId;

        @com.aliyun.core.annotation.NameInMap("MonitorType")
        private String monitorType;

        @com.aliyun.core.annotation.NameInMap("RecordFileCount")
        private String recordFileCount;

        @com.aliyun.core.annotation.NameInMap("RecordFileText1In")
        private RecordFileText1In recordFileText1In;

        @com.aliyun.core.annotation.NameInMap("RecordFileText1Out")
        private RecordFileText1Out recordFileText1Out;

        @com.aliyun.core.annotation.NameInMap("Result")
        private java.util.List<DataResult> result;

        private Data(Builder builder) {
            this.enterpriseId = builder.enterpriseId;
            this.monitorType = builder.monitorType;
            this.recordFileCount = builder.recordFileCount;
            this.recordFileText1In = builder.recordFileText1In;
            this.recordFileText1Out = builder.recordFileText1Out;
            this.result = builder.result;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return enterpriseId
         */
        public String getEnterpriseId() {
            return this.enterpriseId;
        }

        /**
         * @return monitorType
         */
        public String getMonitorType() {
            return this.monitorType;
        }

        /**
         * @return recordFileCount
         */
        public String getRecordFileCount() {
            return this.recordFileCount;
        }

        /**
         * @return recordFileText1In
         */
        public RecordFileText1In getRecordFileText1In() {
            return this.recordFileText1In;
        }

        /**
         * @return recordFileText1Out
         */
        public RecordFileText1Out getRecordFileText1Out() {
            return this.recordFileText1Out;
        }

        /**
         * @return result
         */
        public java.util.List<DataResult> getResult() {
            return this.result;
        }

        public static final class Builder {
            private String enterpriseId; 
            private String monitorType; 
            private String recordFileCount; 
            private RecordFileText1In recordFileText1In; 
            private RecordFileText1Out recordFileText1Out; 
            private java.util.List<DataResult> result; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.enterpriseId = model.enterpriseId;
                this.monitorType = model.monitorType;
                this.recordFileCount = model.recordFileCount;
                this.recordFileText1In = model.recordFileText1In;
                this.recordFileText1Out = model.recordFileText1Out;
                this.result = model.result;
            } 

            /**
             * <p>企业编号</p>
             * 
             * <strong>example:</strong>
             * <p>7000002</p>
             */
            public Builder enterpriseId(String enterpriseId) {
                this.enterpriseId = enterpriseId;
                return this;
            }

            /**
             * <p>转写类型 1：混音 2：分轨</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder monitorType(String monitorType) {
                this.monitorType = monitorType;
                return this;
            }

            /**
             * <p>转写文件个数</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder recordFileCount(String recordFileCount) {
                this.recordFileCount = recordFileCount;
                return this;
            }

            /**
             * <p>第一侧转写文本结果</p>
             */
            public Builder recordFileText1In(RecordFileText1In recordFileText1In) {
                this.recordFileText1In = recordFileText1In;
                return this;
            }

            /**
             * <p>第二侧转写文本结果</p>
             */
            public Builder recordFileText1Out(RecordFileText1Out recordFileText1Out) {
                this.recordFileText1Out = recordFileText1Out;
                return this;
            }

            /**
             * <p>转写结果, 当all=true时返回</p>
             */
            public Builder result(java.util.List<DataResult> result) {
                this.result = result;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
