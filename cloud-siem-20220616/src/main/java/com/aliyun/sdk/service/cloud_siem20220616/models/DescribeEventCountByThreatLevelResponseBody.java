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

        private Builder(DescribeEventCountByThreatLevelResponseBody model) {
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

        public DescribeEventCountByThreatLevelResponseBody build() {
            return new DescribeEventCountByThreatLevelResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeEventCountByThreatLevelResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEventCountByThreatLevelResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Data model) {
                this.eventNum = model.eventNum;
                this.highLevelEventNum = model.highLevelEventNum;
                this.lowLevelEventNum = model.lowLevelEventNum;
                this.mediumLevelEventNum = model.mediumLevelEventNum;
                this.undealEventNum = model.undealEventNum;
            } 

            /**
             * <p>The total number of events.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder eventNum(Long eventNum) {
                this.eventNum = eventNum;
                return this;
            }

            /**
             * <p>The number of high-risk events.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder highLevelEventNum(Long highLevelEventNum) {
                this.highLevelEventNum = highLevelEventNum;
                return this;
            }

            /**
             * <p>The number of low-risk events.</p>
             * 
             * <strong>example:</strong>
             * <p>52</p>
             */
            public Builder lowLevelEventNum(Long lowLevelEventNum) {
                this.lowLevelEventNum = lowLevelEventNum;
                return this;
            }

            /**
             * <p>The number of medium-risk events.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder mediumLevelEventNum(Long mediumLevelEventNum) {
                this.mediumLevelEventNum = mediumLevelEventNum;
                return this;
            }

            /**
             * <p>The number of unhandled events.</p>
             * 
             * <strong>example:</strong>
             * <p>75</p>
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
