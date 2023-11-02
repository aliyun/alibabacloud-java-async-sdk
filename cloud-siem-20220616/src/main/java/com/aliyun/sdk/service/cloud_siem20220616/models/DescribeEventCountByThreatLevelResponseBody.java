// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEventCountByThreatLevelResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEventCountByThreatLevelResponseBody</p>
 */
public class DescribeEventCountByThreatLevelResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
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
         * Code.
         */
        public Builder code(Integer code) {
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

        public DescribeEventCountByThreatLevelResponseBody build() {
            return new DescribeEventCountByThreatLevelResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("EventNum")
        private Long eventNum;

        @NameInMap("HighLevelEventNum")
        private Long highLevelEventNum;

        @NameInMap("LowLevelEventNum")
        private Long lowLevelEventNum;

        @NameInMap("MediumLevelEventNum")
        private Long mediumLevelEventNum;

        @NameInMap("UndealEventNum")
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
             * EventNum.
             */
            public Builder eventNum(Long eventNum) {
                this.eventNum = eventNum;
                return this;
            }

            /**
             * HighLevelEventNum.
             */
            public Builder highLevelEventNum(Long highLevelEventNum) {
                this.highLevelEventNum = highLevelEventNum;
                return this;
            }

            /**
             * LowLevelEventNum.
             */
            public Builder lowLevelEventNum(Long lowLevelEventNum) {
                this.lowLevelEventNum = lowLevelEventNum;
                return this;
            }

            /**
             * MediumLevelEventNum.
             */
            public Builder mediumLevelEventNum(Long mediumLevelEventNum) {
                this.mediumLevelEventNum = mediumLevelEventNum;
                return this;
            }

            /**
             * UndealEventNum.
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
