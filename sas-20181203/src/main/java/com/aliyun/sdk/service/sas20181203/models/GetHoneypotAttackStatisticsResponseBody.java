// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetHoneypotAttackStatisticsResponseBody} extends {@link TeaModel}
 *
 * <p>GetHoneypotAttackStatisticsResponseBody</p>
 */
public class GetHoneypotAttackStatisticsResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private GetHoneypotAttackStatisticsResponseBody(Builder builder) {
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

    public static GetHoneypotAttackStatisticsResponseBody create() {
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
         * The status code that is returned. The status code **200** indicates that the request was successful. Other status codes indicate that the request failed. You can identify the cause of the failure based on the status code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The statistics.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The HTTP status code.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * The returned message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false**
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetHoneypotAttackStatisticsResponseBody build() {
            return new GetHoneypotAttackStatisticsResponseBody(this);
        } 

    } 

    public static class HoneypotAttackStatistics extends TeaModel {
        @NameInMap("StatisticsCount")
        private Integer statisticsCount;

        @NameInMap("StatisticsValue")
        private String statisticsValue;

        private HoneypotAttackStatistics(Builder builder) {
            this.statisticsCount = builder.statisticsCount;
            this.statisticsValue = builder.statisticsValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HoneypotAttackStatistics create() {
            return builder().build();
        }

        /**
         * @return statisticsCount
         */
        public Integer getStatisticsCount() {
            return this.statisticsCount;
        }

        /**
         * @return statisticsValue
         */
        public String getStatisticsValue() {
            return this.statisticsValue;
        }

        public static final class Builder {
            private Integer statisticsCount; 
            private String statisticsValue; 

            /**
             * The number of times the value is counted.
             */
            public Builder statisticsCount(Integer statisticsCount) {
                this.statisticsCount = statisticsCount;
                return this;
            }

            /**
             * The statistical value.
             */
            public Builder statisticsValue(String statisticsValue) {
                this.statisticsValue = statisticsValue;
                return this;
            }

            public HoneypotAttackStatistics build() {
                return new HoneypotAttackStatistics(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("Count")
        private Integer count;

        @NameInMap("HoneypotAttackStatistics")
        private java.util.List < HoneypotAttackStatistics> honeypotAttackStatistics;

        @NameInMap("StatisticsType")
        private String statisticsType;

        private Data(Builder builder) {
            this.count = builder.count;
            this.honeypotAttackStatistics = builder.honeypotAttackStatistics;
            this.statisticsType = builder.statisticsType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return honeypotAttackStatistics
         */
        public java.util.List < HoneypotAttackStatistics> getHoneypotAttackStatistics() {
            return this.honeypotAttackStatistics;
        }

        /**
         * @return statisticsType
         */
        public String getStatisticsType() {
            return this.statisticsType;
        }

        public static final class Builder {
            private Integer count; 
            private java.util.List < HoneypotAttackStatistics> honeypotAttackStatistics; 
            private String statisticsType; 

            /**
             * The number of entries on the current page.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * The statistics details.
             */
            public Builder honeypotAttackStatistics(java.util.List < HoneypotAttackStatistics> honeypotAttackStatistics) {
                this.honeypotAttackStatistics = honeypotAttackStatistics;
                return this;
            }

            /**
             * The type of the attack source statistics. Valid values:
             * <p>
             * 
             * *   **TOP_ATTACKED_AGENT**: the top five probes that are attacked the most frequently.
             * *   **TOP_ATTACKED_IP**: the top five IP addresses that are attacked the most frequently.
             * *   **ATTACK_EVENT_TYPE**: the type of the intrusion event.
             * *   **ATTACK_HONEYPOT_TYPE**: the type of the attacked honeypot.
             */
            public Builder statisticsType(String statisticsType) {
                this.statisticsType = statisticsType;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
