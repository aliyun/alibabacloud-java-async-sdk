// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paiplugin20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMessageConfigResponseBody} extends {@link TeaModel}
 *
 * <p>GetMessageConfigResponseBody</p>
 */
public class GetMessageConfigResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("ErrorCode")
    private Integer errorCode;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    private GetMessageConfigResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMessageConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errorCode
     */
    public Integer getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private Integer errorCode; 
        private String errorMessage; 
        private String requestId; 

        /**
         * 返回数据。
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * 错误码。
         */
        public Builder errorCode(Integer errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * 错误信息。
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * 请求ID。
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetMessageConfigResponseBody build() {
            return new GetMessageConfigResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("SmsReportUrl")
        private String smsReportUrl;

        @NameInMap("SmsUpUrl")
        private String smsUpUrl;

        private Data(Builder builder) {
            this.smsReportUrl = builder.smsReportUrl;
            this.smsUpUrl = builder.smsUpUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return smsReportUrl
         */
        public String getSmsReportUrl() {
            return this.smsReportUrl;
        }

        /**
         * @return smsUpUrl
         */
        public String getSmsUpUrl() {
            return this.smsUpUrl;
        }

        public static final class Builder {
            private String smsReportUrl; 
            private String smsUpUrl; 

            /**
             * 短信发送状态回执接收服务地址。
             */
            public Builder smsReportUrl(String smsReportUrl) {
                this.smsReportUrl = smsReportUrl;
                return this;
            }

            /**
             * 上行短信消息接收服务地址。
             */
            public Builder smsUpUrl(String smsUpUrl) {
                this.smsUpUrl = smsUpUrl;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
