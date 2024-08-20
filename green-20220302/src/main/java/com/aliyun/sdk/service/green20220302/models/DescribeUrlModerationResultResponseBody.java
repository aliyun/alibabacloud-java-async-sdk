// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220302.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUrlModerationResultResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUrlModerationResultResponseBody</p>
 */
public class DescribeUrlModerationResultResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Msg")
    private String msg;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeUrlModerationResultResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.msg = builder.msg;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUrlModerationResultResponseBody create() {
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
         * The returned HTTP status code. The status code 200 indicates that the request was successful.
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
        public Builder msg(String msg) {
            this.msg = msg;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeUrlModerationResultResponseBody build() {
            return new DescribeUrlModerationResultResponseBody(this);
        } 

    } 

    public static class ExtraInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IcpNo")
        private String icpNo;

        @com.aliyun.core.annotation.NameInMap("IcpType")
        private String icpType;

        @com.aliyun.core.annotation.NameInMap("SiteType")
        private String siteType;

        private ExtraInfo(Builder builder) {
            this.icpNo = builder.icpNo;
            this.icpType = builder.icpType;
            this.siteType = builder.siteType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExtraInfo create() {
            return builder().build();
        }

        /**
         * @return icpNo
         */
        public String getIcpNo() {
            return this.icpNo;
        }

        /**
         * @return icpType
         */
        public String getIcpType() {
            return this.icpType;
        }

        /**
         * @return siteType
         */
        public String getSiteType() {
            return this.siteType;
        }

        public static final class Builder {
            private String icpNo; 
            private String icpType; 
            private String siteType; 

            /**
             * The ICP number.
             */
            public Builder icpNo(String icpNo) {
                this.icpNo = icpNo;
                return this;
            }

            /**
             * The type of the ICP filing.
             */
            public Builder icpType(String icpType) {
                this.icpType = icpType;
                return this;
            }

            /**
             * The type of site
             */
            public Builder siteType(String siteType) {
                this.siteType = siteType;
                return this;
            }

            public ExtraInfo build() {
                return new ExtraInfo(this);
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
             * The score of the confidence level. Valid values: 0 to 100. The value is accurate to two decimal places.
             */
            public Builder confidence(Float confidence) {
                this.confidence = confidence;
                return this;
            }

            /**
             * The labels returned after the asynchronous URL moderation.
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

        @com.aliyun.core.annotation.NameInMap("ExtraInfo")
        private ExtraInfo extraInfo;

        @com.aliyun.core.annotation.NameInMap("ReqId")
        private String reqId;

        @com.aliyun.core.annotation.NameInMap("Result")
        private java.util.List < Result> result;

        private Data(Builder builder) {
            this.dataId = builder.dataId;
            this.extraInfo = builder.extraInfo;
            this.reqId = builder.reqId;
            this.result = builder.result;
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
         * @return extraInfo
         */
        public ExtraInfo getExtraInfo() {
            return this.extraInfo;
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

        public static final class Builder {
            private String dataId; 
            private ExtraInfo extraInfo; 
            private String reqId; 
            private java.util.List < Result> result; 

            /**
             * The value of dataId that is specified in the API request. If this parameter is not specified in the API request, this field is not available in the response.
             */
            public Builder dataId(String dataId) {
                this.dataId = dataId;
                return this;
            }

            /**
             * The supplementary information.
             */
            public Builder extraInfo(ExtraInfo extraInfo) {
                this.extraInfo = extraInfo;
                return this;
            }

            /**
             * The ReqId field returned by an asynchronous URL moderation operation.
             */
            public Builder reqId(String reqId) {
                this.reqId = reqId;
                return this;
            }

            /**
             * The returned results.
             */
            public Builder result(java.util.List < Result> result) {
                this.result = result;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
