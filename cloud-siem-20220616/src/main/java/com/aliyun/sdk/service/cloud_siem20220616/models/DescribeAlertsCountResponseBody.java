// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAlertsCountResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAlertsCountResponseBody</p>
 */
public class DescribeAlertsCountResponseBody extends TeaModel {
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

    private DescribeAlertsCountResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAlertsCountResponseBody create() {
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

        public DescribeAlertsCountResponseBody build() {
            return new DescribeAlertsCountResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("All")
        private Long all;

        @com.aliyun.core.annotation.NameInMap("High")
        private Long high;

        @com.aliyun.core.annotation.NameInMap("Low")
        private Long low;

        @com.aliyun.core.annotation.NameInMap("Medium")
        private Long medium;

        @com.aliyun.core.annotation.NameInMap("ProductNum")
        private Integer productNum;

        private Data(Builder builder) {
            this.all = builder.all;
            this.high = builder.high;
            this.low = builder.low;
            this.medium = builder.medium;
            this.productNum = builder.productNum;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return all
         */
        public Long getAll() {
            return this.all;
        }

        /**
         * @return high
         */
        public Long getHigh() {
            return this.high;
        }

        /**
         * @return low
         */
        public Long getLow() {
            return this.low;
        }

        /**
         * @return medium
         */
        public Long getMedium() {
            return this.medium;
        }

        /**
         * @return productNum
         */
        public Integer getProductNum() {
            return this.productNum;
        }

        public static final class Builder {
            private Long all; 
            private Long high; 
            private Long low; 
            private Long medium; 
            private Integer productNum; 

            /**
             * The total number of alerts.
             */
            public Builder all(Long all) {
                this.all = all;
                return this;
            }

            /**
             * The number of high-risk alerts.
             */
            public Builder high(Long high) {
                this.high = high;
                return this;
            }

            /**
             * The number of low-risk alerts.
             */
            public Builder low(Long low) {
                this.low = low;
                return this;
            }

            /**
             * The number of medium-risk alerts.
             */
            public Builder medium(Long medium) {
                this.medium = medium;
                return this;
            }

            /**
             * The number of connected services.
             */
            public Builder productNum(Integer productNum) {
                this.productNum = productNum;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
