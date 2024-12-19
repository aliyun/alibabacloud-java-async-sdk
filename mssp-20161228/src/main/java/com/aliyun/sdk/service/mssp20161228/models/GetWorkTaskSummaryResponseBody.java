// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mssp20161228.models;

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
 * {@link GetWorkTaskSummaryResponseBody} extends {@link TeaModel}
 *
 * <p>GetWorkTaskSummaryResponseBody</p>
 */
public class GetWorkTaskSummaryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetWorkTaskSummaryResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetWorkTaskSummaryResponseBody create() {
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
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * <p>Response code.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Data returned by the interface.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>Prompt message for the response result.</p>
         * 
         * <strong>example:</strong>
         * <p>Successful!</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>EF801DD1-D934-51B3-92D4-776CE17B184F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Whether the call was successful. - <strong>true</strong>: The call was successful. - <strong>false</strong>: The call failed.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetWorkTaskSummaryResponseBody build() {
            return new GetWorkTaskSummaryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetWorkTaskSummaryResponseBody} extends {@link TeaModel}
     *
     * <p>GetWorkTaskSummaryResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DealAverageDuration")
        private Long dealAverageDuration;

        @com.aliyun.core.annotation.NameInMap("DealAverageDurationGrowthRate")
        private String dealAverageDurationGrowthRate;

        @com.aliyun.core.annotation.NameInMap("DealWorkTaskCount")
        private Long dealWorkTaskCount;

        @com.aliyun.core.annotation.NameInMap("DealWorkTaskCountRate")
        private String dealWorkTaskCountRate;

        @com.aliyun.core.annotation.NameInMap("WorkTaskCount")
        private Long workTaskCount;

        @com.aliyun.core.annotation.NameInMap("WorkTaskDealRate")
        private String workTaskDealRate;

        @com.aliyun.core.annotation.NameInMap("WorkTaskDealRateGrowthRate")
        private String workTaskDealRateGrowthRate;

        @com.aliyun.core.annotation.NameInMap("WorkTaskGrowthRate")
        private String workTaskGrowthRate;

        private Data(Builder builder) {
            this.dealAverageDuration = builder.dealAverageDuration;
            this.dealAverageDurationGrowthRate = builder.dealAverageDurationGrowthRate;
            this.dealWorkTaskCount = builder.dealWorkTaskCount;
            this.dealWorkTaskCountRate = builder.dealWorkTaskCountRate;
            this.workTaskCount = builder.workTaskCount;
            this.workTaskDealRate = builder.workTaskDealRate;
            this.workTaskDealRateGrowthRate = builder.workTaskDealRateGrowthRate;
            this.workTaskGrowthRate = builder.workTaskGrowthRate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return dealAverageDuration
         */
        public Long getDealAverageDuration() {
            return this.dealAverageDuration;
        }

        /**
         * @return dealAverageDurationGrowthRate
         */
        public String getDealAverageDurationGrowthRate() {
            return this.dealAverageDurationGrowthRate;
        }

        /**
         * @return dealWorkTaskCount
         */
        public Long getDealWorkTaskCount() {
            return this.dealWorkTaskCount;
        }

        /**
         * @return dealWorkTaskCountRate
         */
        public String getDealWorkTaskCountRate() {
            return this.dealWorkTaskCountRate;
        }

        /**
         * @return workTaskCount
         */
        public Long getWorkTaskCount() {
            return this.workTaskCount;
        }

        /**
         * @return workTaskDealRate
         */
        public String getWorkTaskDealRate() {
            return this.workTaskDealRate;
        }

        /**
         * @return workTaskDealRateGrowthRate
         */
        public String getWorkTaskDealRateGrowthRate() {
            return this.workTaskDealRateGrowthRate;
        }

        /**
         * @return workTaskGrowthRate
         */
        public String getWorkTaskGrowthRate() {
            return this.workTaskGrowthRate;
        }

        public static final class Builder {
            private Long dealAverageDuration; 
            private String dealAverageDurationGrowthRate; 
            private Long dealWorkTaskCount; 
            private String dealWorkTaskCountRate; 
            private Long workTaskCount; 
            private String workTaskDealRate; 
            private String workTaskDealRateGrowthRate; 
            private String workTaskGrowthRate; 

            /**
             * <p>Average response time (in minutes).</p>
             * 
             * <strong>example:</strong>
             * <p>60</p>
             */
            public Builder dealAverageDuration(Long dealAverageDuration) {
                this.dealAverageDuration = dealAverageDuration;
                return this;
            }

            /**
             * <p>Year-over-year growth rate of average response time.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder dealAverageDurationGrowthRate(String dealAverageDurationGrowthRate) {
                this.dealAverageDurationGrowthRate = dealAverageDurationGrowthRate;
                return this;
            }

            /**
             * <p>Number of work orders responded to.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder dealWorkTaskCount(Long dealWorkTaskCount) {
                this.dealWorkTaskCount = dealWorkTaskCount;
                return this;
            }

            /**
             * <p>Year-over-year growth rate of the number of work orders responded to.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder dealWorkTaskCountRate(String dealWorkTaskCountRate) {
                this.dealWorkTaskCountRate = dealWorkTaskCountRate;
                return this;
            }

            /**
             * <p>Number of service responses.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder workTaskCount(Long workTaskCount) {
                this.workTaskCount = workTaskCount;
                return this;
            }

            /**
             * <p>Problem closure rate.</p>
             * 
             * <strong>example:</strong>
             * <p>90</p>
             */
            public Builder workTaskDealRate(String workTaskDealRate) {
                this.workTaskDealRate = workTaskDealRate;
                return this;
            }

            /**
             * <p>Year-over-year growth rate of problem closure rate.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder workTaskDealRateGrowthRate(String workTaskDealRateGrowthRate) {
                this.workTaskDealRateGrowthRate = workTaskDealRateGrowthRate;
                return this;
            }

            /**
             * <p>Year-over-year growth rate of service responses.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder workTaskGrowthRate(String workTaskGrowthRate) {
                this.workTaskGrowthRate = workTaskGrowthRate;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
