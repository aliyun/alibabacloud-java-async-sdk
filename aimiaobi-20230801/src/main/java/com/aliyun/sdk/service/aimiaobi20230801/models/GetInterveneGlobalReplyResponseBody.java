// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimiaobi20230801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetInterveneGlobalReplyResponseBody} extends {@link TeaModel}
 *
 * <p>GetInterveneGlobalReplyResponseBody</p>
 */
public class GetInterveneGlobalReplyResponseBody extends TeaModel {
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

    private GetInterveneGlobalReplyResponseBody(Builder builder) {
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

    public static GetInterveneGlobalReplyResponseBody create() {
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
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
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

        public GetInterveneGlobalReplyResponseBody build() {
            return new GetInterveneGlobalReplyResponseBody(this);
        } 

    } 

    public static class ReplyMessagList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("ReplyType")
        private String replyType;

        private ReplyMessagList(Builder builder) {
            this.message = builder.message;
            this.replyType = builder.replyType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReplyMessagList create() {
            return builder().build();
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return replyType
         */
        public String getReplyType() {
            return this.replyType;
        }

        public static final class Builder {
            private String message; 
            private String replyType; 

            /**
             * Message.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * ReplyType.
             */
            public Builder replyType(String replyType) {
                this.replyType = replyType;
                return this;
            }

            public ReplyMessagList build() {
                return new ReplyMessagList(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ReplyMessagList")
        private java.util.List < ReplyMessagList> replyMessagList;

        private Data(Builder builder) {
            this.replyMessagList = builder.replyMessagList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return replyMessagList
         */
        public java.util.List < ReplyMessagList> getReplyMessagList() {
            return this.replyMessagList;
        }

        public static final class Builder {
            private java.util.List < ReplyMessagList> replyMessagList; 

            /**
             * ReplyMessagList.
             */
            public Builder replyMessagList(java.util.List < ReplyMessagList> replyMessagList) {
                this.replyMessagList = replyMessagList;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
