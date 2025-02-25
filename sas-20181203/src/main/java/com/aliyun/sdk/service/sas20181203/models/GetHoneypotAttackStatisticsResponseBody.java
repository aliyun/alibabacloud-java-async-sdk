// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link GetHoneypotAttackStatisticsResponseBody} extends {@link TeaModel}
 *
 * <p>GetHoneypotAttackStatisticsResponseBody</p>
 */
public class GetHoneypotAttackStatisticsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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
         * <p>The status code that is returned. The status code <strong>200</strong> indicates that the request was successful. Other status codes indicate that the request failed. You can identify the cause of the failure based on the status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The statistics.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3FACC60A-3FE4-5F49-9184-50730C8B****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetHoneypotAttackStatisticsResponseBody build() {
            return new GetHoneypotAttackStatisticsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetHoneypotAttackStatisticsResponseBody} extends {@link TeaModel}
     *
     * <p>GetHoneypotAttackStatisticsResponseBody</p>
     */
    public static class HoneypotAttackStatistics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("StatisticsCount")
        private Integer statisticsCount;

        @com.aliyun.core.annotation.NameInMap("StatisticsValue")
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
             * <p>The number of times the value is counted.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder statisticsCount(Integer statisticsCount) {
                this.statisticsCount = statisticsCount;
                return this;
            }

            /**
             * <p>The statistical value.</p>
             * 
             * <strong>example:</strong>
             * <p>112.168.1.**</p>
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
    /**
     * 
     * {@link GetHoneypotAttackStatisticsResponseBody} extends {@link TeaModel}
     *
     * <p>GetHoneypotAttackStatisticsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("HoneypotAttackStatistics")
        private java.util.List<HoneypotAttackStatistics> honeypotAttackStatistics;

        @com.aliyun.core.annotation.NameInMap("StatisticsType")
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
        public java.util.List<HoneypotAttackStatistics> getHoneypotAttackStatistics() {
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
            private java.util.List<HoneypotAttackStatistics> honeypotAttackStatistics; 
            private String statisticsType; 

            /**
             * <p>The number of entries on the current page.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The statistics details.</p>
             */
            public Builder honeypotAttackStatistics(java.util.List<HoneypotAttackStatistics> honeypotAttackStatistics) {
                this.honeypotAttackStatistics = honeypotAttackStatistics;
                return this;
            }

            /**
             * <p>The type of the attack source statistics. Valid values:</p>
             * <ul>
             * <li><strong>TOP_ATTACKED_AGENT</strong>: the top five probes that are attacked the most frequently.</li>
             * <li><strong>TOP_ATTACKED_IP</strong>: the top five IP addresses that are attacked the most frequently.</li>
             * <li><strong>ATTACK_EVENT_TYPE</strong>: the type of the intrusion event.</li>
             * <li><strong>ATTACK_HONEYPOT_TYPE</strong>: the type of the attacked honeypot.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>TOP_ATTACKED_IP</p>
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
