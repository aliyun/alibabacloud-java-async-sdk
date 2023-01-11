// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkcard20210520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSimCardStateDistributionResponseBody} extends {@link TeaModel}
 *
 * <p>GetSimCardStateDistributionResponseBody</p>
 */
public class GetSimCardStateDistributionResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private GetSimCardStateDistributionResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSimCardStateDistributionResponseBody create() {
        return builder().build();
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
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

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
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetSimCardStateDistributionResponseBody build() {
            return new GetSimCardStateDistributionResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("CardCount")
        private Long cardCount;

        @NameInMap("DestoryedCount")
        private Long destoryedCount;

        @NameInMap("ShutDownCount")
        private Long shutDownCount;

        @NameInMap("StopCount")
        private Long stopCount;

        @NameInMap("TestCount")
        private Long testCount;

        @NameInMap("UnusedCount")
        private Long unusedCount;

        @NameInMap("UsingCount")
        private Long usingCount;

        private Data(Builder builder) {
            this.cardCount = builder.cardCount;
            this.destoryedCount = builder.destoryedCount;
            this.shutDownCount = builder.shutDownCount;
            this.stopCount = builder.stopCount;
            this.testCount = builder.testCount;
            this.unusedCount = builder.unusedCount;
            this.usingCount = builder.usingCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return cardCount
         */
        public Long getCardCount() {
            return this.cardCount;
        }

        /**
         * @return destoryedCount
         */
        public Long getDestoryedCount() {
            return this.destoryedCount;
        }

        /**
         * @return shutDownCount
         */
        public Long getShutDownCount() {
            return this.shutDownCount;
        }

        /**
         * @return stopCount
         */
        public Long getStopCount() {
            return this.stopCount;
        }

        /**
         * @return testCount
         */
        public Long getTestCount() {
            return this.testCount;
        }

        /**
         * @return unusedCount
         */
        public Long getUnusedCount() {
            return this.unusedCount;
        }

        /**
         * @return usingCount
         */
        public Long getUsingCount() {
            return this.usingCount;
        }

        public static final class Builder {
            private Long cardCount; 
            private Long destoryedCount; 
            private Long shutDownCount; 
            private Long stopCount; 
            private Long testCount; 
            private Long unusedCount; 
            private Long usingCount; 

            /**
             * CardCount.
             */
            public Builder cardCount(Long cardCount) {
                this.cardCount = cardCount;
                return this;
            }

            /**
             * DestoryedCount.
             */
            public Builder destoryedCount(Long destoryedCount) {
                this.destoryedCount = destoryedCount;
                return this;
            }

            /**
             * ShutDownCount.
             */
            public Builder shutDownCount(Long shutDownCount) {
                this.shutDownCount = shutDownCount;
                return this;
            }

            /**
             * StopCount.
             */
            public Builder stopCount(Long stopCount) {
                this.stopCount = stopCount;
                return this;
            }

            /**
             * TestCount.
             */
            public Builder testCount(Long testCount) {
                this.testCount = testCount;
                return this;
            }

            /**
             * UnusedCount.
             */
            public Builder unusedCount(Long unusedCount) {
                this.unusedCount = unusedCount;
                return this;
            }

            /**
             * UsingCount.
             */
            public Builder usingCount(Long usingCount) {
                this.usingCount = usingCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
