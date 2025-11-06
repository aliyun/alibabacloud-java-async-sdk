// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

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
 * {@link ListAnalysisCoreIndexResponseBody} extends {@link TeaModel}
 *
 * <p>ListAnalysisCoreIndexResponseBody</p>
 */
public class ListAnalysisCoreIndexResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResultCode")
    private String resultCode;

    @com.aliyun.core.annotation.NameInMap("ResultContent")
    private ResultContent resultContent;

    @com.aliyun.core.annotation.NameInMap("ResultMessage")
    private String resultMessage;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListAnalysisCoreIndexResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resultCode = builder.resultCode;
        this.resultContent = builder.resultContent;
        this.resultMessage = builder.resultMessage;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAnalysisCoreIndexResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resultCode
     */
    public String getResultCode() {
        return this.resultCode;
    }

    /**
     * @return resultContent
     */
    public ResultContent getResultContent() {
        return this.resultContent;
    }

    /**
     * @return resultMessage
     */
    public String getResultMessage() {
        return this.resultMessage;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String requestId; 
        private String resultCode; 
        private ResultContent resultContent; 
        private String resultMessage; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListAnalysisCoreIndexResponseBody model) {
            this.requestId = model.requestId;
            this.resultCode = model.resultCode;
            this.resultContent = model.resultContent;
            this.resultMessage = model.resultMessage;
            this.success = model.success;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ResultCode.
         */
        public Builder resultCode(String resultCode) {
            this.resultCode = resultCode;
            return this;
        }

        /**
         * ResultContent.
         */
        public Builder resultContent(ResultContent resultContent) {
            this.resultContent = resultContent;
            return this;
        }

        /**
         * ResultMessage.
         */
        public Builder resultMessage(String resultMessage) {
            this.resultMessage = resultMessage;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListAnalysisCoreIndexResponseBody build() {
            return new ListAnalysisCoreIndexResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAnalysisCoreIndexResponseBody} extends {@link TeaModel}
     *
     * <p>ListAnalysisCoreIndexResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ArrivalNum")
        private String arrivalNum;

        @com.aliyun.core.annotation.NameInMap("ArrivalRate")
        private String arrivalRate;

        @com.aliyun.core.annotation.NameInMap("IgnoreNum")
        private String ignoreNum;

        @com.aliyun.core.annotation.NameInMap("IgnoreRate")
        private String ignoreRate;

        @com.aliyun.core.annotation.NameInMap("OpenNum")
        private String openNum;

        @com.aliyun.core.annotation.NameInMap("OpenRate")
        private String openRate;

        @com.aliyun.core.annotation.NameInMap("PushNum")
        private String pushNum;

        @com.aliyun.core.annotation.NameInMap("PushTotalNum")
        private String pushTotalNum;

        private Data(Builder builder) {
            this.arrivalNum = builder.arrivalNum;
            this.arrivalRate = builder.arrivalRate;
            this.ignoreNum = builder.ignoreNum;
            this.ignoreRate = builder.ignoreRate;
            this.openNum = builder.openNum;
            this.openRate = builder.openRate;
            this.pushNum = builder.pushNum;
            this.pushTotalNum = builder.pushTotalNum;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return arrivalNum
         */
        public String getArrivalNum() {
            return this.arrivalNum;
        }

        /**
         * @return arrivalRate
         */
        public String getArrivalRate() {
            return this.arrivalRate;
        }

        /**
         * @return ignoreNum
         */
        public String getIgnoreNum() {
            return this.ignoreNum;
        }

        /**
         * @return ignoreRate
         */
        public String getIgnoreRate() {
            return this.ignoreRate;
        }

        /**
         * @return openNum
         */
        public String getOpenNum() {
            return this.openNum;
        }

        /**
         * @return openRate
         */
        public String getOpenRate() {
            return this.openRate;
        }

        /**
         * @return pushNum
         */
        public String getPushNum() {
            return this.pushNum;
        }

        /**
         * @return pushTotalNum
         */
        public String getPushTotalNum() {
            return this.pushTotalNum;
        }

        public static final class Builder {
            private String arrivalNum; 
            private String arrivalRate; 
            private String ignoreNum; 
            private String ignoreRate; 
            private String openNum; 
            private String openRate; 
            private String pushNum; 
            private String pushTotalNum; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.arrivalNum = model.arrivalNum;
                this.arrivalRate = model.arrivalRate;
                this.ignoreNum = model.ignoreNum;
                this.ignoreRate = model.ignoreRate;
                this.openNum = model.openNum;
                this.openRate = model.openRate;
                this.pushNum = model.pushNum;
                this.pushTotalNum = model.pushTotalNum;
            } 

            /**
             * <p>0</p>
             */
            public Builder arrivalNum(String arrivalNum) {
                this.arrivalNum = arrivalNum;
                return this;
            }

            /**
             * <p>0</p>
             */
            public Builder arrivalRate(String arrivalRate) {
                this.arrivalRate = arrivalRate;
                return this;
            }

            /**
             * <p>0</p>
             */
            public Builder ignoreNum(String ignoreNum) {
                this.ignoreNum = ignoreNum;
                return this;
            }

            /**
             * <p>0</p>
             */
            public Builder ignoreRate(String ignoreRate) {
                this.ignoreRate = ignoreRate;
                return this;
            }

            /**
             * <p>0</p>
             */
            public Builder openNum(String openNum) {
                this.openNum = openNum;
                return this;
            }

            /**
             * <p>0</p>
             */
            public Builder openRate(String openRate) {
                this.openRate = openRate;
                return this;
            }

            /**
             * <p>0</p>
             */
            public Builder pushNum(String pushNum) {
                this.pushNum = pushNum;
                return this;
            }

            /**
             * <p>0</p>
             */
            public Builder pushTotalNum(String pushTotalNum) {
                this.pushTotalNum = pushTotalNum;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAnalysisCoreIndexResponseBody} extends {@link TeaModel}
     *
     * <p>ListAnalysisCoreIndexResponseBody</p>
     */
    public static class ResultContent extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Data")
        private Data data;

        @com.aliyun.core.annotation.NameInMap("ResultMsg")
        private String resultMsg;

        @com.aliyun.core.annotation.NameInMap("Success")
        private Boolean success;

        private ResultContent(Builder builder) {
            this.data = builder.data;
            this.resultMsg = builder.resultMsg;
            this.success = builder.success;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultContent create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public Data getData() {
            return this.data;
        }

        /**
         * @return resultMsg
         */
        public String getResultMsg() {
            return this.resultMsg;
        }

        /**
         * @return success
         */
        public Boolean getSuccess() {
            return this.success;
        }

        public static final class Builder {
            private Data data; 
            private String resultMsg; 
            private Boolean success; 

            private Builder() {
            } 

            private Builder(ResultContent model) {
                this.data = model.data;
                this.resultMsg = model.resultMsg;
                this.success = model.success;
            } 

            /**
             * Data.
             */
            public Builder data(Data data) {
                this.data = data;
                return this;
            }

            /**
             * ResultMsg.
             */
            public Builder resultMsg(String resultMsg) {
                this.resultMsg = resultMsg;
                return this;
            }

            /**
             * Success.
             */
            public Builder success(Boolean success) {
                this.success = success;
                return this;
            }

            public ResultContent build() {
                return new ResultContent(this);
            } 

        } 

    }
}
