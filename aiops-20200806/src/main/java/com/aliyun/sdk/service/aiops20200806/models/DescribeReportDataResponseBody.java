// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeReportDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeReportDataResponseBody</p>
 */
public class DescribeReportDataResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Status")
    private String status;

    private DescribeReportDataResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeReportDataResponseBody create() {
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

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private Integer code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private String status; 

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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public DescribeReportDataResponseBody build() {
            return new DescribeReportDataResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("HeathScore")
        private Long heathScore;

        @NameInMap("HeathScoreTrendList")
        private java.util.List < Long > heathScoreTrendList;

        @NameInMap("PreUpdateTime")
        private String preUpdateTime;

        @NameInMap("RiskCount")
        private Long riskCount;

        @NameInMap("RiskCountTrendList")
        private java.util.List < Long > riskCountTrendList;

        private Data(Builder builder) {
            this.heathScore = builder.heathScore;
            this.heathScoreTrendList = builder.heathScoreTrendList;
            this.preUpdateTime = builder.preUpdateTime;
            this.riskCount = builder.riskCount;
            this.riskCountTrendList = builder.riskCountTrendList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return heathScore
         */
        public Long getHeathScore() {
            return this.heathScore;
        }

        /**
         * @return heathScoreTrendList
         */
        public java.util.List < Long > getHeathScoreTrendList() {
            return this.heathScoreTrendList;
        }

        /**
         * @return preUpdateTime
         */
        public String getPreUpdateTime() {
            return this.preUpdateTime;
        }

        /**
         * @return riskCount
         */
        public Long getRiskCount() {
            return this.riskCount;
        }

        /**
         * @return riskCountTrendList
         */
        public java.util.List < Long > getRiskCountTrendList() {
            return this.riskCountTrendList;
        }

        public static final class Builder {
            private Long heathScore; 
            private java.util.List < Long > heathScoreTrendList; 
            private String preUpdateTime; 
            private Long riskCount; 
            private java.util.List < Long > riskCountTrendList; 

            /**
             * HeathScore.
             */
            public Builder heathScore(Long heathScore) {
                this.heathScore = heathScore;
                return this;
            }

            /**
             * HeathScoreTrendList.
             */
            public Builder heathScoreTrendList(java.util.List < Long > heathScoreTrendList) {
                this.heathScoreTrendList = heathScoreTrendList;
                return this;
            }

            /**
             * PreUpdateTime.
             */
            public Builder preUpdateTime(String preUpdateTime) {
                this.preUpdateTime = preUpdateTime;
                return this;
            }

            /**
             * RiskCount.
             */
            public Builder riskCount(Long riskCount) {
                this.riskCount = riskCount;
                return this;
            }

            /**
             * RiskCountTrendList.
             */
            public Builder riskCountTrendList(java.util.List < Long > riskCountTrendList) {
                this.riskCountTrendList = riskCountTrendList;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
