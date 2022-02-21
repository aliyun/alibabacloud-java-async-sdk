// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetHotlineMessageLogResponseBody} extends {@link TeaModel}
 *
 * <p>GetHotlineMessageLogResponseBody</p>
 */
public class GetHotlineMessageLogResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private GetHotlineMessageLogResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetHotlineMessageLogResponseBody create() {
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
    public java.util.List < Data> getData() {
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
        private java.util.List < Data> data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * 错误码
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * 错误信息
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
         * 调用是否成功
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetHotlineMessageLogResponseBody build() {
            return new GetHotlineMessageLogResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("Acid")
        private String acid;

        @NameInMap("Content")
        private String content;

        @NameInMap("EndTime")
        private Long endTime;

        @NameInMap("Mid")
        private String mid;

        @NameInMap("SenderType")
        private Integer senderType;

        @NameInMap("StartTime")
        private Long startTime;

        private Data(Builder builder) {
            this.acid = builder.acid;
            this.content = builder.content;
            this.endTime = builder.endTime;
            this.mid = builder.mid;
            this.senderType = builder.senderType;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return acid
         */
        public String getAcid() {
            return this.acid;
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return mid
         */
        public String getMid() {
            return this.mid;
        }

        /**
         * @return senderType
         */
        public Integer getSenderType() {
            return this.senderType;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private String acid; 
            private String content; 
            private Long endTime; 
            private String mid; 
            private Integer senderType; 
            private Long startTime; 

            /**
             * 会话ID
             */
            public Builder acid(String acid) {
                this.acid = acid;
                return this;
            }

            /**
             * 会话内容
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * 结束时间
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * 记录id
             */
            public Builder mid(String mid) {
                this.mid = mid;
                return this;
            }

            /**
             * 发送方类型（1：会员，2：坐席）
             */
            public Builder senderType(Integer senderType) {
                this.senderType = senderType;
                return this;
            }

            /**
             * 开始时间
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
