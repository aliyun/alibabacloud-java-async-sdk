// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InsertAiOutboundPhoneNumsResponseBody} extends {@link TeaModel}
 *
 * <p>InsertAiOutboundPhoneNumsResponseBody</p>
 */
public class InsertAiOutboundPhoneNumsResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
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

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * 导入结果
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
         * Id of the request
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

    public static class FailInfo extends TeaModel {
        @NameInMap("BizData")
        private String bizData;

        @NameInMap("Msg")
        private String msg;

        @NameInMap("PhoneNum")
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

            /**
             * 自定义信息
             */
            public Builder bizData(String bizData) {
                this.bizData = bizData;
                return this;
            }

            /**
             * 失败原因描述
             */
            public Builder msg(String msg) {
                this.msg = msg;
                return this;
            }

            /**
             * 外呼被叫号码
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
    public static class Data extends TeaModel {
        @NameInMap("FailInfo")
        private java.util.List < FailInfo> failInfo;

        @NameInMap("SuccessCount")
        private Integer successCount;

        @NameInMap("TotalCount")
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
        public java.util.List < FailInfo> getFailInfo() {
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
            private java.util.List < FailInfo> failInfo; 
            private Integer successCount; 
            private Integer totalCount; 

            /**
             * 失败号码详情
             */
            public Builder failInfo(java.util.List < FailInfo> failInfo) {
                this.failInfo = failInfo;
                return this;
            }

            /**
             * 导入成功数量
             */
            public Builder successCount(Integer successCount) {
                this.successCount = successCount;
                return this;
            }

            /**
             * 导入总数
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
