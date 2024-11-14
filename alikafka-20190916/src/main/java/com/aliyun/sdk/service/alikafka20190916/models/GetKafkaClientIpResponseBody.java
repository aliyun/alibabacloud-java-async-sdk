// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alikafka20190916.models;

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

        /**
         * Code.
         */
        public Builder code(Long code) {
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
         * Success.
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

            /**
             * Ip.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * Num.
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
        private java.util.List < DataData> data;

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
        public java.util.List < DataData> getData() {
            return this.data;
        }

        public static final class Builder {
            private java.util.List < DataData> data; 

            /**
             * Data.
             */
            public Builder data(java.util.List < DataData> data) {
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

            /**
             * Data.
             */
            public Builder data(DataDataData data) {
                this.data = data;
                return this;
            }

            /**
             * Name.
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
        private java.util.List < GetKafkaClientIpResponseBodyDataDataData> data;

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
        public java.util.List < GetKafkaClientIpResponseBodyDataDataData> getData() {
            return this.data;
        }

        public static final class Builder {
            private java.util.List < GetKafkaClientIpResponseBodyDataDataData> data; 

            /**
             * Data.
             */
            public Builder data(java.util.List < GetKafkaClientIpResponseBodyDataDataData> data) {
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

            /**
             * Alert.
             */
            public Builder alert(Boolean alert) {
                this.alert = alert;
                return this;
            }

            /**
             * Data.
             */
            public Builder data(GetKafkaClientIpResponseBodyDataData data) {
                this.data = data;
                return this;
            }

            /**
             * EndDate.
             */
            public Builder endDate(Long endDate) {
                this.endDate = endDate;
                return this;
            }

            /**
             * SearchTimeRange.
             */
            public Builder searchTimeRange(Integer searchTimeRange) {
                this.searchTimeRange = searchTimeRange;
                return this;
            }

            /**
             * StartDate.
             */
            public Builder startDate(Long startDate) {
                this.startDate = startDate;
                return this;
            }

            /**
             * TimeLimitDay.
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
