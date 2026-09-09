// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maxcompute20220104.models;

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
 * {@link SumComputeMetricsByRecordResponseBody} extends {@link TeaModel}
 *
 * <p>SumComputeMetricsByRecordResponseBody</p>
 */
public class SumComputeMetricsByRecordResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("httpCode")
    private Integer httpCode;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private SumComputeMetricsByRecordResponseBody(Builder builder) {
        this.data = builder.data;
        this.httpCode = builder.httpCode;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SumComputeMetricsByRecordResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return httpCode
     */
    public Integer getHttpCode() {
        return this.httpCode;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Data> data; 
        private Integer httpCode; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(SumComputeMetricsByRecordResponseBody model) {
            this.data = model.data;
            this.httpCode = model.httpCode;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The response data.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * <ul>
         * <li><p>1xx: Informational. The server has received the request and is processing it.</p>
         * </li>
         * <li><p>2xx: Success. The server successfully received, understood, and accepted the request.</p>
         * </li>
         * <li><p>3xx: Redirection. The client must take further action to complete the request.</p>
         * </li>
         * <li><p>4xx: Client-side error. The request contains invalid syntax or parameters and cannot be fulfilled.</p>
         * </li>
         * <li><p>5xx: Server-side error. The server failed to fulfill a valid request.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpCode(Integer httpCode) {
            this.httpCode = httpCode;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0a06dfe517540143853845404e83af</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public SumComputeMetricsByRecordResponseBody build() {
            return new SumComputeMetricsByRecordResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link SumComputeMetricsByRecordResponseBody} extends {@link TeaModel}
     *
     * <p>SumComputeMetricsByRecordResponseBody</p>
     */
    public static class DailyComputeRecords extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("dateTime")
        private String dateTime;

        @com.aliyun.core.annotation.NameInMap("percentage")
        private Double percentage;

        @com.aliyun.core.annotation.NameInMap("record")
        private String record;

        private DailyComputeRecords(Builder builder) {
            this.dateTime = builder.dateTime;
            this.percentage = builder.percentage;
            this.record = builder.record;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DailyComputeRecords create() {
            return builder().build();
        }

        /**
         * @return dateTime
         */
        public String getDateTime() {
            return this.dateTime;
        }

        /**
         * @return percentage
         */
        public Double getPercentage() {
            return this.percentage;
        }

        /**
         * @return record
         */
        public String getRecord() {
            return this.record;
        }

        public static final class Builder {
            private String dateTime; 
            private Double percentage; 
            private String record; 

            private Builder() {
            } 

            private Builder(DailyComputeRecords model) {
                this.dateTime = model.dateTime;
                this.percentage = model.percentage;
                this.record = model.record;
            } 

            /**
             * <p>The statistics date. The format is yyyyMMdd.</p>
             * 
             * <strong>example:</strong>
             * <p>20260411</p>
             */
            public Builder dateTime(String dateTime) {
                this.dateTime = dateTime;
                return this;
            }

            /**
             * <p>This day\&quot;s usage as a percentage of the total usage for the specified period. The value does not include a percent sign (%).</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder percentage(Double percentage) {
                this.percentage = percentage;
                return this;
            }

            /**
             * <p>The record count.</p>
             * 
             * <strong>example:</strong>
             * <p>1200</p>
             */
            public Builder record(String record) {
                this.record = record;
                return this;
            }

            public DailyComputeRecords build() {
                return new DailyComputeRecords(this);
            } 

        } 

    }
    /**
     * 
     * {@link SumComputeMetricsByRecordResponseBody} extends {@link TeaModel}
     *
     * <p>SumComputeMetricsByRecordResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("dailyComputeRecords")
        private java.util.List<DailyComputeRecords> dailyComputeRecords;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private Data(Builder builder) {
            this.dailyComputeRecords = builder.dailyComputeRecords;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return dailyComputeRecords
         */
        public java.util.List<DailyComputeRecords> getDailyComputeRecords() {
            return this.dailyComputeRecords;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private java.util.List<DailyComputeRecords> dailyComputeRecords; 
            private String type; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.dailyComputeRecords = model.dailyComputeRecords;
                this.type = model.type;
            } 

            /**
             * <p>A list of daily usage records.</p>
             */
            public Builder dailyComputeRecords(java.util.List<DailyComputeRecords> dailyComputeRecords) {
                this.dailyComputeRecords = dailyComputeRecords;
                return this;
            }

            /**
             * <p>The usage type. For example: ComputationSql</p>
             * 
             * <strong>example:</strong>
             * <p>ComputationSql</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
