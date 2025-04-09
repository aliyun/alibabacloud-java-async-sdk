// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alikafka20190916.models;

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
 * {@link GetKafkaClientIpResponseBody} extends {@link TeaModel}
 *
 * <p>GetKafkaClientIpResponseBody</p>
 */
public class GetKafkaClientIpResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Long code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetKafkaClientIpResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetKafkaClientIpResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public Long getCode() {
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
        private Long code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetKafkaClientIpResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The returned status code. The status code 200 indicates that the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Long code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The data returned.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The message returned.</p>
         * 
         * <strong>example:</strong>
         * <p>operation success.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>E57A8862-DF68-4055-8E55-B80CB4****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetKafkaClientIpResponseBody build() {
            return new GetKafkaClientIpResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetKafkaClientIpResponseBody} extends {@link TeaModel}
     *
     * <p>GetKafkaClientIpResponseBody</p>
     */
    public static class DataData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Ip")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("Num")
        private Long num;

        private DataData(Builder builder) {
            this.ip = builder.ip;
            this.num = builder.num;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataData create() {
            return builder().build();
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return num
         */
        public Long getNum() {
            return this.num;
        }

        public static final class Builder {
            private String ip; 
            private Long num; 

            private Builder() {
            } 

            private Builder(DataData model) {
                this.ip = model.ip;
                this.num = model.num;
            } 

            /**
             * <p>The IP address of the client.</p>
             * 
             * <strong>example:</strong>
             * <p>58.210.117.154</p>
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * <p>The statistics.</p>
             * <blockquote>
             * <p> The value of this parameter indicates the number of connections on different ports of the IP address within the specified period of time.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder num(Long num) {
                this.num = num;
                return this;
            }

            public DataData build() {
                return new DataData(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetKafkaClientIpResponseBody} extends {@link TeaModel}
     *
     * <p>GetKafkaClientIpResponseBody</p>
     */
    public static class DataDataData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Data")
        private java.util.List<DataData> data;

        private DataDataData(Builder builder) {
            this.data = builder.data;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataDataData create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public java.util.List<DataData> getData() {
            return this.data;
        }

        public static final class Builder {
            private java.util.List<DataData> data; 

            private Builder() {
            } 

            private Builder(DataDataData model) {
                this.data = model.data;
            } 

            /**
             * <p>The data returned.</p>
             */
            public Builder data(java.util.List<DataData> data) {
                this.data = data;
                return this;
            }

            public DataDataData build() {
                return new DataDataData(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetKafkaClientIpResponseBody} extends {@link TeaModel}
     *
     * <p>GetKafkaClientIpResponseBody</p>
     */
    public static class GetKafkaClientIpResponseBodyDataDataData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Data")
        private DataDataData data;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private GetKafkaClientIpResponseBodyDataDataData(Builder builder) {
            this.data = builder.data;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GetKafkaClientIpResponseBodyDataDataData create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public DataDataData getData() {
            return this.data;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private DataDataData data; 
            private String name; 

            private Builder() {
            } 

            private Builder(GetKafkaClientIpResponseBodyDataDataData model) {
                this.data = model.data;
                this.name = model.name;
            } 

            /**
             * <p>The response parameters.</p>
             */
            public Builder data(DataDataData data) {
                this.data = data;
                return this;
            }

            /**
             * <p>The request name.</p>
             * <blockquote>
             * <p> The value of this parameter indicates the type of request that the client sends to the broker within the specified period of time.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>OFFSET_COMMIT</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public GetKafkaClientIpResponseBodyDataDataData build() {
                return new GetKafkaClientIpResponseBodyDataDataData(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetKafkaClientIpResponseBody} extends {@link TeaModel}
     *
     * <p>GetKafkaClientIpResponseBody</p>
     */
    public static class GetKafkaClientIpResponseBodyDataData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Data")
        private java.util.List<GetKafkaClientIpResponseBodyDataDataData> data;

        private GetKafkaClientIpResponseBodyDataData(Builder builder) {
            this.data = builder.data;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GetKafkaClientIpResponseBodyDataData create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public java.util.List<GetKafkaClientIpResponseBodyDataDataData> getData() {
            return this.data;
        }

        public static final class Builder {
            private java.util.List<GetKafkaClientIpResponseBodyDataDataData> data; 

            private Builder() {
            } 

            private Builder(GetKafkaClientIpResponseBodyDataData model) {
                this.data = model.data;
            } 

            /**
             * <p>The response parameters.</p>
             */
            public Builder data(java.util.List<GetKafkaClientIpResponseBodyDataDataData> data) {
                this.data = data;
                return this;
            }

            public GetKafkaClientIpResponseBodyDataData build() {
                return new GetKafkaClientIpResponseBodyDataData(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetKafkaClientIpResponseBody} extends {@link TeaModel}
     *
     * <p>GetKafkaClientIpResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Alert")
        private Boolean alert;

        @com.aliyun.core.annotation.NameInMap("Data")
        private GetKafkaClientIpResponseBodyDataData data;

        @com.aliyun.core.annotation.NameInMap("EndDate")
        private Long endDate;

        @com.aliyun.core.annotation.NameInMap("SearchTimeRange")
        private Integer searchTimeRange;

        @com.aliyun.core.annotation.NameInMap("StartDate")
        private Long startDate;

        @com.aliyun.core.annotation.NameInMap("TimeLimitDay")
        private Integer timeLimitDay;

        private Data(Builder builder) {
            this.alert = builder.alert;
            this.data = builder.data;
            this.endDate = builder.endDate;
            this.searchTimeRange = builder.searchTimeRange;
            this.startDate = builder.startDate;
            this.timeLimitDay = builder.timeLimitDay;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return alert
         */
        public Boolean getAlert() {
            return this.alert;
        }

        /**
         * @return data
         */
        public GetKafkaClientIpResponseBodyDataData getData() {
            return this.data;
        }

        /**
         * @return endDate
         */
        public Long getEndDate() {
            return this.endDate;
        }

        /**
         * @return searchTimeRange
         */
        public Integer getSearchTimeRange() {
            return this.searchTimeRange;
        }

        /**
         * @return startDate
         */
        public Long getStartDate() {
            return this.startDate;
        }

        /**
         * @return timeLimitDay
         */
        public Integer getTimeLimitDay() {
            return this.timeLimitDay;
        }

        public static final class Builder {
            private Boolean alert; 
            private GetKafkaClientIpResponseBodyDataData data; 
            private Long endDate; 
            private Integer searchTimeRange; 
            private Long startDate; 
            private Integer timeLimitDay; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.alert = model.alert;
                this.data = model.data;
                this.endDate = model.endDate;
                this.searchTimeRange = model.searchTimeRange;
                this.startDate = model.startDate;
                this.timeLimitDay = model.timeLimitDay;
            } 

            /**
             * <p>The value true indicates that the broker is not of the latest minor version.</p>
             * <blockquote>
             * <p> If the broker is not of the latest minor version, the sampled logs may not be accurate. This may cause inaccurate IP information. Therefore, we recommend that you update your broker to the latest version at the earliest opportunity.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder alert(Boolean alert) {
                this.alert = alert;
                return this;
            }

            /**
             * <p>The data returned.</p>
             */
            public Builder data(GetKafkaClientIpResponseBodyDataData data) {
                this.data = data;
                return this;
            }

            /**
             * <p>The end of the date range within which data is queried.</p>
             * 
             * <strong>example:</strong>
             * <p>1716343502000</p>
             */
            public Builder endDate(Long endDate) {
                this.endDate = endDate;
                return this;
            }

            /**
             * <p>The time range within which the client IP addresses are queried.</p>
             * <blockquote>
             * <p> The valid value is 1 hour. If the beginning of the time range to query and the end of the time range to query exceeds 1 hour, only data within 1 hour is returned.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder searchTimeRange(Integer searchTimeRange) {
                this.searchTimeRange = searchTimeRange;
                return this;
            }

            /**
             * <p>The beginning of the date range within which data is queried.</p>
             * 
             * <strong>example:</strong>
             * <p>1716343501000</p>
             */
            public Builder startDate(Long startDate) {
                this.startDate = startDate;
                return this;
            }

            /**
             * <p>The date range within which the client IP addresses are queried.</p>
             * <blockquote>
             * <p> The valid value is 7 days. If the beginning of the date range to query and the end of the date range to query exceeds 7 days, only data within 7 days is returned.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>7</p>
             */
            public Builder timeLimitDay(Integer timeLimitDay) {
                this.timeLimitDay = timeLimitDay;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
