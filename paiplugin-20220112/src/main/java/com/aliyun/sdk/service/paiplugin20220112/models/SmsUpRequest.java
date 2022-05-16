// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paiplugin20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SmsUpRequest} extends {@link RequestModel}
 *
 * <p>SmsUpRequest</p>
 */
public class SmsUpRequest extends Request {
    @Body
    @NameInMap("body")
    private java.util.List < SmsUpRequestBody> body;

    private SmsUpRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SmsUpRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public java.util.List < SmsUpRequestBody> getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<SmsUpRequest, Builder> {
        private java.util.List < SmsUpRequestBody> body; 

        private Builder() {
            super();
        } 

        private Builder(SmsUpRequest request) {
            super(request);
            this.body = request.body;
        } 

        /**
         * 请求参数的主体信息。
         */
        public Builder body(java.util.List < SmsUpRequestBody> body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public SmsUpRequest build() {
            return new SmsUpRequest(this);
        } 

    } 

    public static class SmsUpRequestBody extends TeaModel {
        @NameInMap("content")
        private String content;

        @NameInMap("dest_code")
        private String destCode;

        @NameInMap("phone_number")
        private String phoneNumber;

        @NameInMap("send_time")
        private String sendTime;

        @NameInMap("sequence_id")
        private Integer sequenceId;

        @NameInMap("sign_name")
        private String signName;

        private SmsUpRequestBody(Builder builder) {
            this.content = builder.content;
            this.destCode = builder.destCode;
            this.phoneNumber = builder.phoneNumber;
            this.sendTime = builder.sendTime;
            this.sequenceId = builder.sequenceId;
            this.signName = builder.signName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SmsUpRequestBody create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return destCode
         */
        public String getDestCode() {
            return this.destCode;
        }

        /**
         * @return phoneNumber
         */
        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        /**
         * @return sendTime
         */
        public String getSendTime() {
            return this.sendTime;
        }

        /**
         * @return sequenceId
         */
        public Integer getSequenceId() {
            return this.sequenceId;
        }

        /**
         * @return signName
         */
        public String getSignName() {
            return this.signName;
        }

        public static final class Builder {
            private String content; 
            private String destCode; 
            private String phoneNumber; 
            private String sendTime; 
            private Integer sequenceId; 
            private String signName; 

            /**
             * 发送内容。
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * 上行短信扩展号码，系统后台自动生成，不支持自定义传入。
             */
            public Builder destCode(String destCode) {
                this.destCode = destCode;
                return this;
            }

            /**
             * 手机号码。
             */
            public Builder phoneNumber(String phoneNumber) {
                this.phoneNumber = phoneNumber;
                return this;
            }

            /**
             * 发送时间。
             */
            public Builder sendTime(String sendTime) {
                this.sendTime = sendTime;
                return this;
            }

            /**
             * 序列号。
             */
            public Builder sequenceId(Integer sequenceId) {
                this.sequenceId = sequenceId;
                return this;
            }

            /**
             * 签名信息。
             */
            public Builder signName(String signName) {
                this.signName = signName;
                return this;
            }

            public SmsUpRequestBody build() {
                return new SmsUpRequestBody(this);
            } 

        } 

    }
}
