// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth_intl20220809.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRiskScoreResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRiskScoreResponseBody</p>
 */
public class DescribeRiskScoreResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeRiskScoreResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRiskScoreResponseBody create() {
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

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
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

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeRiskScoreResponseBody build() {
            return new DescribeRiskScoreResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DetailList")
        private java.util.List < String > detailList;

        @com.aliyun.core.annotation.NameInMap("HackingEvent")
        private String hackingEvent;

        @com.aliyun.core.annotation.NameInMap("RiskLevel")
        private String riskLevel;

        @com.aliyun.core.annotation.NameInMap("Score")
        private Integer score;

        private Data(Builder builder) {
            this.detailList = builder.detailList;
            this.hackingEvent = builder.hackingEvent;
            this.riskLevel = builder.riskLevel;
            this.score = builder.score;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return detailList
         */
        public java.util.List < String > getDetailList() {
            return this.detailList;
        }

        /**
         * @return hackingEvent
         */
        public String getHackingEvent() {
            return this.hackingEvent;
        }

        /**
         * @return riskLevel
         */
        public String getRiskLevel() {
            return this.riskLevel;
        }

        /**
         * @return score
         */
        public Integer getScore() {
            return this.score;
        }

        public static final class Builder {
            private java.util.List < String > detailList; 
            private String hackingEvent; 
            private String riskLevel; 
            private Integer score; 

            /**
             * DetailList.
             */
            public Builder detailList(java.util.List < String > detailList) {
                this.detailList = detailList;
                return this;
            }

            /**
             * HackingEvent.
             */
            public Builder hackingEvent(String hackingEvent) {
                this.hackingEvent = hackingEvent;
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
             * Score.
             */
            public Builder score(Integer score) {
                this.score = score;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
