// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220302.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUrlModerationResultResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUrlModerationResultResponseBody</p>
 */
public class DescribeUrlModerationResultResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Msg")
    private String msg;

    @NameInMap("RequestId")
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
         * Msg.
         */
        public Builder msg(String msg) {
            this.msg = msg;
            return this;
        }

        /**
         * RequestId.
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
        @NameInMap("IcpNo")
        private String icpNo;

        @NameInMap("IcpType")
        private String icpType;

        private ExtraInfo(Builder builder) {
            this.icpNo = builder.icpNo;
            this.icpType = builder.icpType;
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

        public static final class Builder {
            private String icpNo; 
            private String icpType; 

            /**
             * IcpNo.
             */
            public Builder icpNo(String icpNo) {
                this.icpNo = icpNo;
                return this;
            }

            /**
             * IcpType.
             */
            public Builder icpType(String icpType) {
                this.icpType = icpType;
                return this;
            }

            public ExtraInfo build() {
                return new ExtraInfo(this);
            } 

        } 

    }
    public static class Result extends TeaModel {
        @NameInMap("Confidence")
        private Float confidence;

        @NameInMap("Label")
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
             * Confidence.
             */
            public Builder confidence(Float confidence) {
                this.confidence = confidence;
                return this;
            }

            /**
             * Label.
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
        @NameInMap("DataId")
        private String dataId;

        @NameInMap("ExtraInfo")
        private ExtraInfo extraInfo;

        @NameInMap("ReqId")
        private String reqId;

        @NameInMap("Result")
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
             * DataId.
             */
            public Builder dataId(String dataId) {
                this.dataId = dataId;
                return this;
            }

            /**
             * ExtraInfo.
             */
            public Builder extraInfo(ExtraInfo extraInfo) {
                this.extraInfo = extraInfo;
                return this;
            }

            /**
             * ReqId.
             */
            public Builder reqId(String reqId) {
                this.reqId = reqId;
                return this;
            }

            /**
             * Result.
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
