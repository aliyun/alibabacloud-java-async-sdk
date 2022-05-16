// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paiplugin20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SmsReportRequest} extends {@link RequestModel}
 *
 * <p>SmsReportRequest</p>
 */
public class SmsReportRequest extends Request {
    @Body
    @NameInMap("body")
    private java.util.List < SmsReportRequestBody> body;

    private SmsReportRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SmsReportRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public java.util.List < SmsReportRequestBody> getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<SmsReportRequest, Builder> {
        private java.util.List < SmsReportRequestBody> body; 

        private Builder() {
            super();
        } 

        private Builder(SmsReportRequest request) {
            super(request);
            this.body = request.body;
        } 

        /**
         * 请求参数的主体信息。
         */
        public Builder body(java.util.List < SmsReportRequestBody> body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public SmsReportRequest build() {
            return new SmsReportRequest(this);
        } 

    } 

    public static class SmsReportRequestBody extends TeaModel {
        @NameInMap("biz_id")
        private String bizId;

        @NameInMap("err_code")
        private String errCode;

        @NameInMap("err_msg")
        private String errMsg;

        @NameInMap("message_id")
        private String messageId;

        @NameInMap("out_id")
        private String outId;

        @NameInMap("phone_number")
        private String phoneNumber;

        @NameInMap("report_time")
        private String reportTime;

        @NameInMap("request_id")
        private String requestId;

        @NameInMap("send_time")
        private String sendTime;

        @NameInMap("sign_name")
        private String signName;

        @NameInMap("sms_size")
        private String smsSize;

        @NameInMap("success")
        private Boolean success;

        @NameInMap("template_code")
        private String templateCode;

        private SmsReportRequestBody(Builder builder) {
            this.bizId = builder.bizId;
            this.errCode = builder.errCode;
            this.errMsg = builder.errMsg;
            this.messageId = builder.messageId;
            this.outId = builder.outId;
            this.phoneNumber = builder.phoneNumber;
            this.reportTime = builder.reportTime;
            this.requestId = builder.requestId;
            this.sendTime = builder.sendTime;
            this.signName = builder.signName;
            this.smsSize = builder.smsSize;
            this.success = builder.success;
            this.templateCode = builder.templateCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SmsReportRequestBody create() {
            return builder().build();
        }

        /**
         * @return bizId
         */
        public String getBizId() {
            return this.bizId;
        }

        /**
         * @return errCode
         */
        public String getErrCode() {
            return this.errCode;
        }

        /**
         * @return errMsg
         */
        public String getErrMsg() {
            return this.errMsg;
        }

        /**
         * @return messageId
         */
        public String getMessageId() {
            return this.messageId;
        }

        /**
         * @return outId
         */
        public String getOutId() {
            return this.outId;
        }

        /**
         * @return phoneNumber
         */
        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        /**
         * @return reportTime
         */
        public String getReportTime() {
            return this.reportTime;
        }

        /**
         * @return requestId
         */
        public String getRequestId() {
            return this.requestId;
        }

        /**
         * @return sendTime
         */
        public String getSendTime() {
            return this.sendTime;
        }

        /**
         * @return signName
         */
        public String getSignName() {
            return this.signName;
        }

        /**
         * @return smsSize
         */
        public String getSmsSize() {
            return this.smsSize;
        }

        /**
         * @return success
         */
        public Boolean getSuccess() {
            return this.success;
        }

        /**
         * @return templateCode
         */
        public String getTemplateCode() {
            return this.templateCode;
        }

        public static final class Builder {
            private String bizId; 
            private String errCode; 
            private String errMsg; 
            private String messageId; 
            private String outId; 
            private String phoneNumber; 
            private String reportTime; 
            private String requestId; 
            private String sendTime; 
            private String signName; 
            private String smsSize; 
            private Boolean success; 
            private String templateCode; 

            /**
             * 发送回执ID，即发送流水号。
             */
            public Builder bizId(String bizId) {
                this.bizId = bizId;
                return this;
            }

            /**
             * 状态报告编码。
             */
            public Builder errCode(String errCode) {
                this.errCode = errCode;
                return this;
            }

            /**
             * 状态报告说明。
             */
            public Builder errMsg(String errMsg) {
                this.errMsg = errMsg;
                return this;
            }

            /**
             * 短信Id。调用发送接口SendMessage发送短信时，返回值中的Id字段。可使用短信Id在接口ListMessages查询具体的发送状态。
             */
            public Builder messageId(String messageId) {
                this.messageId = messageId;
                return this;
            }

            /**
             * 外部拓展字段。
             */
            public Builder outId(String outId) {
                this.outId = outId;
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
             * 状态报告时间。
             */
            public Builder reportTime(String reportTime) {
                this.reportTime = reportTime;
                return this;
            }

            /**
             * 短信批处理Id。调用发送接口SendMessage发送短信时，返回值中的RequestId字段。可使用短信批处理Id在接口ListMessages查询具体的发送状态。
             */
            public Builder requestId(String requestId) {
                this.requestId = requestId;
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
             * 签名。
             */
            public Builder signName(String signName) {
                this.signName = signName;
                return this;
            }

            /**
             * 短信长度。短信长度不超过70个字，按照一条短信计费；超过70个字，即为长短信，按照67字/条拆分成多条计费。
             */
            public Builder smsSize(String smsSize) {
                this.smsSize = smsSize;
                return this;
            }

            /**
             * 是否接收成功。
             * <p>
             * - true : 接收成功。
             * - false : 接收失败。
             */
            public Builder success(Boolean success) {
                this.success = success;
                return this;
            }

            /**
             * 模板号。
             */
            public Builder templateCode(String templateCode) {
                this.templateCode = templateCode;
                return this;
            }

            public SmsReportRequestBody build() {
                return new SmsReportRequestBody(this);
            } 

        } 

    }
}
