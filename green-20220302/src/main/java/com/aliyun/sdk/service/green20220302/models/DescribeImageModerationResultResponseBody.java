// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220302.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeImageModerationResultResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeImageModerationResultResponseBody</p>
 */
public class DescribeImageModerationResultResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Msg")
    private String msg;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeImageModerationResultResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.msg = builder.msg;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeImageModerationResultResponseBody create() {
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
     * @return msg
     */
    public String getMsg() {
        return this.msg;
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
        private String msg; 
        private String requestId; 

        /**
         * The returned HTTP status code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The image moderation results.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The message that is returned in response to the request.
         */
        public Builder msg(String msg) {
            this.msg = msg;
            return this;
        }

        /**
         * The request ID, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeImageModerationResultResponseBody build() {
            return new DescribeImageModerationResultResponseBody(this);
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
             * The description of the result.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The labels returned after the image moderation.
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
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataId")
        private String dataId;

        @com.aliyun.core.annotation.NameInMap("Frame")
        private String frame;

        @com.aliyun.core.annotation.NameInMap("FrameNum")
        private Integer frameNum;

        @com.aliyun.core.annotation.NameInMap("ReqId")
        private String reqId;

        @com.aliyun.core.annotation.NameInMap("Result")
        private java.util.List < Result> result;

        @com.aliyun.core.annotation.NameInMap("RiskLevel")
        private String riskLevel;

        private Data(Builder builder) {
            this.dataId = builder.dataId;
            this.frame = builder.frame;
            this.frameNum = builder.frameNum;
            this.reqId = builder.reqId;
            this.result = builder.result;
            this.riskLevel = builder.riskLevel;
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
         * @return frame
         */
        public String getFrame() {
            return this.frame;
        }

        /**
         * @return frameNum
         */
        public Integer getFrameNum() {
            return this.frameNum;
        }

        /**
         * @return reqId
         */
        public String getReqId() {
            return this.reqId;
        }

        /**
         * @return result
         */
        public java.util.List < Result> getResult() {
            return this.result;
        }

        /**
         * @return riskLevel
         */
        public String getRiskLevel() {
            return this.riskLevel;
        }

        public static final class Builder {
            private String dataId; 
            private String frame; 
            private Integer frameNum; 
            private String reqId; 
            private java.util.List < Result> result; 
            private String riskLevel; 

            /**
             * The value of dataId that is specified in the API request. If this parameter is not specified in the API request, this field is not available in the response.
             */
            public Builder dataId(String dataId) {
                this.dataId = dataId;
                return this;
            }

            /**
             * The information about the captured frames.
             */
            public Builder frame(String frame) {
                this.frame = frame;
                return this;
            }

            /**
             * The number of frames.
             */
            public Builder frameNum(Integer frameNum) {
                this.frameNum = frameNum;
                return this;
            }

            /**
             * The reqId field returned by the Image Async Moderation API.
             */
            public Builder reqId(String reqId) {
                this.reqId = reqId;
                return this;
            }

            /**
             * The results of image moderation parameters such as the label parameter and the confidence parameter.
             */
            public Builder result(java.util.List < Result> result) {
                this.result = result;
                return this;
            }

            /**
             * Risk Level.
             */
            public Builder riskLevel(String riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
