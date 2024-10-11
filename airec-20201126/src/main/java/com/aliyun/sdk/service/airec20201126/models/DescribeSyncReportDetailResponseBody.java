// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20201126.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeSyncReportDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSyncReportDetailResponseBody</p>
 */
public class DescribeSyncReportDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private java.util.List < Result> result;

    private DescribeSyncReportDetailResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSyncReportDetailResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
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
     * @return result
     */
    public java.util.List < Result> getResult() {
        return this.result;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String requestId; 
        private java.util.List < Result> result; 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * result.
         */
        public Builder result(java.util.List < Result> result) {
            this.result = result;
            return this;
        }

        public DescribeSyncReportDetailResponseBody build() {
            return new DescribeSyncReportDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSyncReportDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSyncReportDetailResponseBody</p>
     */
    public static class HistoryData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("endTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("errorPercent")
        private Float errorPercent;

        @com.aliyun.core.annotation.NameInMap("startTime")
        private Long startTime;

        private HistoryData(Builder builder) {
            this.endTime = builder.endTime;
            this.errorPercent = builder.errorPercent;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HistoryData create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return errorPercent
         */
        public Float getErrorPercent() {
            return this.errorPercent;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private Long endTime; 
            private Float errorPercent; 
            private Long startTime; 

            /**
             * endTime.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * errorPercent.
             */
            public Builder errorPercent(Float errorPercent) {
                this.errorPercent = errorPercent;
                return this;
            }

            /**
             * startTime.
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            public HistoryData build() {
                return new HistoryData(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSyncReportDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSyncReportDetailResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("defaultDisplay")
        private Boolean defaultDisplay;

        @com.aliyun.core.annotation.NameInMap("errorCount")
        private Integer errorCount;

        @com.aliyun.core.annotation.NameInMap("errorPercent")
        private Float errorPercent;

        @com.aliyun.core.annotation.NameInMap("historyData")
        private java.util.List < HistoryData> historyData;

        @com.aliyun.core.annotation.NameInMap("sampleDisplay")
        private Boolean sampleDisplay;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private Result(Builder builder) {
            this.defaultDisplay = builder.defaultDisplay;
            this.errorCount = builder.errorCount;
            this.errorPercent = builder.errorPercent;
            this.historyData = builder.historyData;
            this.sampleDisplay = builder.sampleDisplay;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return defaultDisplay
         */
        public Boolean getDefaultDisplay() {
            return this.defaultDisplay;
        }

        /**
         * @return errorCount
         */
        public Integer getErrorCount() {
            return this.errorCount;
        }

        /**
         * @return errorPercent
         */
        public Float getErrorPercent() {
            return this.errorPercent;
        }

        /**
         * @return historyData
         */
        public java.util.List < HistoryData> getHistoryData() {
            return this.historyData;
        }

        /**
         * @return sampleDisplay
         */
        public Boolean getSampleDisplay() {
            return this.sampleDisplay;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Boolean defaultDisplay; 
            private Integer errorCount; 
            private Float errorPercent; 
            private java.util.List < HistoryData> historyData; 
            private Boolean sampleDisplay; 
            private String type; 

            /**
             * defaultDisplay.
             */
            public Builder defaultDisplay(Boolean defaultDisplay) {
                this.defaultDisplay = defaultDisplay;
                return this;
            }

            /**
             * errorCount.
             */
            public Builder errorCount(Integer errorCount) {
                this.errorCount = errorCount;
                return this;
            }

            /**
             * errorPercent.
             */
            public Builder errorPercent(Float errorPercent) {
                this.errorPercent = errorPercent;
                return this;
            }

            /**
             * historyData.
             */
            public Builder historyData(java.util.List < HistoryData> historyData) {
                this.historyData = historyData;
                return this;
            }

            /**
             * sampleDisplay.
             */
            public Builder sampleDisplay(Boolean sampleDisplay) {
                this.sampleDisplay = sampleDisplay;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
