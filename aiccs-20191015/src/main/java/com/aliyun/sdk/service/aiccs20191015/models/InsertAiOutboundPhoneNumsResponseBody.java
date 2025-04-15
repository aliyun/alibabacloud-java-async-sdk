// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

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
 * {@link InsertAiOutboundPhoneNumsResponseBody} extends {@link TeaModel}
 *
 * <p>InsertAiOutboundPhoneNumsResponseBody</p>
 */
public class InsertAiOutboundPhoneNumsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private InsertAiOutboundPhoneNumsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InsertAiOutboundPhoneNumsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(InsertAiOutboundPhoneNumsResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
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

        public InsertAiOutboundPhoneNumsResponseBody build() {
            return new InsertAiOutboundPhoneNumsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link InsertAiOutboundPhoneNumsResponseBody} extends {@link TeaModel}
     *
     * <p>InsertAiOutboundPhoneNumsResponseBody</p>
     */
    public static class FailInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BizData")
        private String bizData;

        @com.aliyun.core.annotation.NameInMap("Msg")
        private String msg;

        @com.aliyun.core.annotation.NameInMap("PhoneNum")
        private String phoneNum;

        private FailInfo(Builder builder) {
            this.bizData = builder.bizData;
            this.msg = builder.msg;
            this.phoneNum = builder.phoneNum;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FailInfo create() {
            return builder().build();
        }

        /**
         * @return bizData
         */
        public String getBizData() {
            return this.bizData;
        }

        /**
         * @return msg
         */
        public String getMsg() {
            return this.msg;
        }

        /**
         * @return phoneNum
         */
        public String getPhoneNum() {
            return this.phoneNum;
        }

        public static final class Builder {
            private String bizData; 
            private String msg; 
            private String phoneNum; 

            private Builder() {
            } 

            private Builder(FailInfo model) {
                this.bizData = model.bizData;
                this.msg = model.msg;
                this.phoneNum = model.phoneNum;
            } 

            /**
             * BizData.
             */
            public Builder bizData(String bizData) {
                this.bizData = bizData;
                return this;
            }

            /**
             * Msg.
             */
            public Builder msg(String msg) {
                this.msg = msg;
                return this;
            }

            /**
             * PhoneNum.
             */
            public Builder phoneNum(String phoneNum) {
                this.phoneNum = phoneNum;
                return this;
            }

            public FailInfo build() {
                return new FailInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link InsertAiOutboundPhoneNumsResponseBody} extends {@link TeaModel}
     *
     * <p>InsertAiOutboundPhoneNumsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FailInfo")
        private java.util.List<FailInfo> failInfo;

        @com.aliyun.core.annotation.NameInMap("SuccessCount")
        private Integer successCount;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private Data(Builder builder) {
            this.failInfo = builder.failInfo;
            this.successCount = builder.successCount;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return failInfo
         */
        public java.util.List<FailInfo> getFailInfo() {
            return this.failInfo;
        }

        /**
         * @return successCount
         */
        public Integer getSuccessCount() {
            return this.successCount;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List<FailInfo> failInfo; 
            private Integer successCount; 
            private Integer totalCount; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.failInfo = model.failInfo;
                this.successCount = model.successCount;
                this.totalCount = model.totalCount;
            } 

            /**
             * FailInfo.
             */
            public Builder failInfo(java.util.List<FailInfo> failInfo) {
                this.failInfo = failInfo;
                return this;
            }

            /**
             * SuccessCount.
             */
            public Builder successCount(Integer successCount) {
                this.successCount = successCount;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
