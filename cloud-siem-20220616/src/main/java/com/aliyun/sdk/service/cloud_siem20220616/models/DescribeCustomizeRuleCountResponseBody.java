// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCustomizeRuleCountResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCustomizeRuleCountResponseBody</p>
 */
public class DescribeCustomizeRuleCountResponseBody extends TeaModel {
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

    private DescribeCustomizeRuleCountResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCustomizeRuleCountResponseBody create() {
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

        public DescribeCustomizeRuleCountResponseBody build() {
            return new DescribeCustomizeRuleCountResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("HighRuleNum")
        private Integer highRuleNum;

        @NameInMap("InUseRuleNum")
        private Integer inUseRuleNum;

        @NameInMap("LowRuleNum")
        private Integer lowRuleNum;

        @NameInMap("MediumRuleNum")
        private Integer mediumRuleNum;

        private Data(Builder builder) {
            this.highRuleNum = builder.highRuleNum;
            this.inUseRuleNum = builder.inUseRuleNum;
            this.lowRuleNum = builder.lowRuleNum;
            this.mediumRuleNum = builder.mediumRuleNum;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return highRuleNum
         */
        public Integer getHighRuleNum() {
            return this.highRuleNum;
        }

        /**
         * @return inUseRuleNum
         */
        public Integer getInUseRuleNum() {
            return this.inUseRuleNum;
        }

        /**
         * @return lowRuleNum
         */
        public Integer getLowRuleNum() {
            return this.lowRuleNum;
        }

        /**
         * @return mediumRuleNum
         */
        public Integer getMediumRuleNum() {
            return this.mediumRuleNum;
        }

        public static final class Builder {
            private Integer highRuleNum; 
            private Integer inUseRuleNum; 
            private Integer lowRuleNum; 
            private Integer mediumRuleNum; 

            /**
             * HighRuleNum.
             */
            public Builder highRuleNum(Integer highRuleNum) {
                this.highRuleNum = highRuleNum;
                return this;
            }

            /**
             * InUseRuleNum.
             */
            public Builder inUseRuleNum(Integer inUseRuleNum) {
                this.inUseRuleNum = inUseRuleNum;
                return this;
            }

            /**
             * LowRuleNum.
             */
            public Builder lowRuleNum(Integer lowRuleNum) {
                this.lowRuleNum = lowRuleNum;
                return this;
            }

            /**
             * MediumRuleNum.
             */
            public Builder mediumRuleNum(Integer mediumRuleNum) {
                this.mediumRuleNum = mediumRuleNum;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
