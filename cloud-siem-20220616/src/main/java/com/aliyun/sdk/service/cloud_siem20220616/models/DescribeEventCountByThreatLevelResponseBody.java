// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEventCountByThreatLevelResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEventCountByThreatLevelResponseBody</p>
 */
public class DescribeEventCountByThreatLevelResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeEventCountByThreatLevelResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEventCountByThreatLevelResponseBody create() {
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Integer code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * The HTTP status code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The data returned.
         */
        public Builder data(Data data) {
            this.data = data;
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
         * *   true
         * *   false
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeEventCountByThreatLevelResponseBody build() {
            return new DescribeEventCountByThreatLevelResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EventNum")
        private Long eventNum;

        @com.aliyun.core.annotation.NameInMap("HighLevelEventNum")
        private Long highLevelEventNum;

        @com.aliyun.core.annotation.NameInMap("LowLevelEventNum")
        private Long lowLevelEventNum;

        @com.aliyun.core.annotation.NameInMap("MediumLevelEventNum")
        private Long mediumLevelEventNum;

        @com.aliyun.core.annotation.NameInMap("UndealEventNum")
        private Long undealEventNum;

        private Data(Builder builder) {
            this.eventNum = builder.eventNum;
            this.highLevelEventNum = builder.highLevelEventNum;
            this.lowLevelEventNum = builder.lowLevelEventNum;
            this.mediumLevelEventNum = builder.mediumLevelEventNum;
            this.undealEventNum = builder.undealEventNum;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return eventNum
         */
        public Long getEventNum() {
            return this.eventNum;
        }

        /**
         * @return highLevelEventNum
         */
        public Long getHighLevelEventNum() {
            return this.highLevelEventNum;
        }

        /**
         * @return lowLevelEventNum
         */
        public Long getLowLevelEventNum() {
            return this.lowLevelEventNum;
        }

        /**
         * @return mediumLevelEventNum
         */
        public Long getMediumLevelEventNum() {
            return this.mediumLevelEventNum;
        }

        /**
         * @return undealEventNum
         */
        public Long getUndealEventNum() {
            return this.undealEventNum;
        }

        public static final class Builder {
            private Long eventNum; 
            private Long highLevelEventNum; 
            private Long lowLevelEventNum; 
            private Long mediumLevelEventNum; 
            private Long undealEventNum; 

            /**
             * The total number of events.
             */
            public Builder eventNum(Long eventNum) {
                this.eventNum = eventNum;
                return this;
            }

            /**
             * The number of high-risk events.
             */
            public Builder highLevelEventNum(Long highLevelEventNum) {
                this.highLevelEventNum = highLevelEventNum;
                return this;
            }

            /**
             * The number of low-risk events.
             */
            public Builder lowLevelEventNum(Long lowLevelEventNum) {
                this.lowLevelEventNum = lowLevelEventNum;
                return this;
            }

            /**
             * The number of medium-risk events.
             */
            public Builder mediumLevelEventNum(Long mediumLevelEventNum) {
                this.mediumLevelEventNum = mediumLevelEventNum;
                return this;
            }

            /**
             * The number of unhandled events.
             */
            public Builder undealEventNum(Long undealEventNum) {
                this.undealEventNum = undealEventNum;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
