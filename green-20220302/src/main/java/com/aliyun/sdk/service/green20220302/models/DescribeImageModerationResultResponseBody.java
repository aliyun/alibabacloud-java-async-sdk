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

        private Builder() {
        } 

        private Builder(DescribeImageModerationResultResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.msg = model.msg;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The error code. This is the same as the HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The results of the image content moderation.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The response message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder msg(String msg) {
            this.msg = msg;
            return this;
        }

        /**
         * <p>The unique ID of the request. Alibaba Cloud generates this ID for each request. Use this ID to troubleshoot and locate issues.</p>
         * 
         * <strong>example:</strong>
         * <p>2881AD4F-638B-52A3-BA20-F74C5B1CEAE3</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeImageModerationResultResponseBody build() {
            return new DescribeImageModerationResultResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeImageModerationResultResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeImageModerationResultResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Confidence")
        private Float confidence;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        @com.aliyun.core.annotation.NameInMap("RiskLevel")
        private String riskLevel;

        private Result(Builder builder) {
            this.confidence = builder.confidence;
            this.description = builder.description;
            this.label = builder.label;
            this.riskLevel = builder.riskLevel;
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

        /**
         * @return riskLevel
         */
        public String getRiskLevel() {
            return this.riskLevel;
        }

        public static final class Builder {
            private Float confidence; 
            private String description; 
            private String label; 
            private String riskLevel; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.confidence = model.confidence;
                this.description = model.description;
                this.label = model.label;
                this.riskLevel = model.riskLevel;
            } 

            /**
             * <p>The confidence score. The value ranges from 0 to 100. The value is accurate to two decimal places.</p>
             * 
             * <strong>example:</strong>
             * <p>81.22</p>
             */
            public Builder confidence(Float confidence) {
                this.confidence = confidence;
                return this;
            }

            /**
             * <p>The description.</p>
             * 
             * <strong>example:</strong>
             * <p>未检测出风险</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The label returned after the image content is moderated.</p>
             * 
             * <strong>example:</strong>
             * <p>violent_explosion</p>
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

            public Result build() {
                return new Result(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeImageModerationResultResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeImageModerationResultResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountId")
        private String accountId;

        @com.aliyun.core.annotation.NameInMap("DataId")
        private String dataId;

        @com.aliyun.core.annotation.NameInMap("Frame")
        private String frame;

        @com.aliyun.core.annotation.NameInMap("FrameNum")
        private Integer frameNum;

        @com.aliyun.core.annotation.NameInMap("ManualTaskId")
        private String manualTaskId;

        @com.aliyun.core.annotation.NameInMap("ReqId")
        private String reqId;

        @com.aliyun.core.annotation.NameInMap("Result")
        private java.util.List<Result> result;

        @com.aliyun.core.annotation.NameInMap("RiskLevel")
        private String riskLevel;

        private Data(Builder builder) {
            this.accountId = builder.accountId;
            this.dataId = builder.dataId;
            this.frame = builder.frame;
            this.frameNum = builder.frameNum;
            this.manualTaskId = builder.manualTaskId;
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
         * @return accountId
         */
        public String getAccountId() {
            return this.accountId;
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
         * @return manualTaskId
         */
        public String getManualTaskId() {
            return this.manualTaskId;
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
        public java.util.List<Result> getResult() {
            return this.result;
        }

        /**
         * @return riskLevel
         */
        public String getRiskLevel() {
            return this.riskLevel;
        }

        public static final class Builder {
            private String accountId; 
            private String dataId; 
            private String frame; 
            private Integer frameNum; 
            private String manualTaskId; 
            private String reqId; 
            private java.util.List<Result> result; 
            private String riskLevel; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.accountId = model.accountId;
                this.dataId = model.dataId;
                this.frame = model.frame;
                this.frameNum = model.frameNum;
                this.manualTaskId = model.manualTaskId;
                this.reqId = model.reqId;
                this.result = model.result;
                this.riskLevel = model.riskLevel;
            } 

            /**
             * <p>The AccountId specified in the request.</p>
             * 
             * <strong>example:</strong>
             * <p>123456789</p>
             */
            public Builder accountId(String accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * <p>The value of the \<code>dataId\\</code> parameter specified in the API request. This field is not returned if \<code>dataId\\</code> was not specified.</p>
             * 
             * <strong>example:</strong>
             * <p>2a5389eb-4ff8-4584-ac99-644e2a539aa1</p>
             */
            public Builder dataId(String dataId) {
                this.dataId = dataId;
                return this;
            }

            /**
             * <p>Information about the image frames.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;result&quot;:[{&quot;confidence&quot;:81.22,&quot;label&quot;:&quot;violent_explosion&quot;}]}]</p>
             */
            public Builder frame(String frame) {
                this.frame = frame;
                return this;
            }

            /**
             * <p>The number of result frames.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder frameNum(Integer frameNum) {
                this.frameNum = frameNum;
                return this;
            }

            /**
             * <p>The ID of the manual review task.</p>
             * 
             * <strong>example:</strong>
             * <p>xxxxx-xxxxx</p>
             */
            public Builder manualTaskId(String manualTaskId) {
                this.manualTaskId = manualTaskId;
                return this;
            }

            /**
             * <p>The \<code>ReqId\\</code> returned by the asynchronous Image Moderation Pro API.</p>
             * 
             * <strong>example:</strong>
             * <p>B0963D30-BAB4-562F-9ED0-7A23AEC51C7C</p>
             */
            public Builder reqId(String reqId) {
                this.reqId = reqId;
                return this;
            }

            /**
             * <p>The results of the image moderation, including risk labels and confidence scores.</p>
             */
            public Builder result(java.util.List<Result> result) {
                this.result = result;
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

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
