// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeAlertsCountResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The data returned.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9AAA9ED9-78F4-5021-86DC-D51C7511****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeAlertsCountResponseBody build() {
            return new DescribeAlertsCountResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAlertsCountResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAlertsCountResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("All")
        private Long all;

        @com.aliyun.core.annotation.NameInMap("CountMap")
        private java.util.Map<String, Long> countMap;

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
            this.countMap = builder.countMap;
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
         * @return countMap
         */
        public java.util.Map<String, Long> getCountMap() {
            return this.countMap;
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
            private java.util.Map<String, Long> countMap; 
            private Long high; 
            private Long low; 
            private Long medium; 
            private Integer productNum; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.all = model.all;
                this.countMap = model.countMap;
                this.high = model.high;
                this.low = model.low;
                this.medium = model.medium;
                this.productNum = model.productNum;
            } 

            /**
             * <p>The total number of alerts.</p>
             * 
             * <strong>example:</strong>
             * <p>75</p>
             */
            public Builder all(Long all) {
                this.all = all;
                return this;
            }

            /**
             * CountMap.
             */
            public Builder countMap(java.util.Map<String, Long> countMap) {
                this.countMap = countMap;
                return this;
            }

            /**
             * <p>The number of high-risk alerts.</p>
             * 
             * <strong>example:</strong>
             * <p>25</p>
             */
            public Builder high(Long high) {
                this.high = high;
                return this;
            }

            /**
             * <p>The number of low-risk alerts.</p>
             * 
             * <strong>example:</strong>
             * <p>25</p>
             */
            public Builder low(Long low) {
                this.low = low;
                return this;
            }

            /**
             * <p>The number of medium-risk alerts.</p>
             * 
             * <strong>example:</strong>
             * <p>25</p>
             */
            public Builder medium(Long medium) {
                this.medium = medium;
                return this;
            }

            /**
             * <p>The number of connected services.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
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
