// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysmsapi20170525.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QuerySendDetailsResponseBody} extends {@link TeaModel}
 *
 * <p>QuerySendDetailsResponseBody</p>
 */
public class QuerySendDetailsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SmsSendDetailDTOs")
    private SmsSendDetailDTOs smsSendDetailDTOs;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private String totalCount;

    private QuerySendDetailsResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.smsSendDetailDTOs = builder.smsSendDetailDTOs;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuerySendDetailsResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
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
     * @return smsSendDetailDTOs
     */
    public SmsSendDetailDTOs getSmsSendDetailDTOs() {
        return this.smsSendDetailDTOs;
    }

    /**
     * @return totalCount
     */
    public String getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String requestId; 
        private SmsSendDetailDTOs smsSendDetailDTOs; 
        private String totalCount; 

        /**
         * The response code.
         * <p>
         * 
         * *   The value OK indicates that the request was successful.
         * *   Other values indicate that the request failed. For more information, see [Error codes](~~101346~~).
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The returned message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The details of the message.
         */
        public Builder smsSendDetailDTOs(SmsSendDetailDTOs smsSendDetailDTOs) {
            this.smsSendDetailDTOs = smsSendDetailDTOs;
            return this;
        }

        /**
         * The number of sent messages.
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public QuerySendDetailsResponseBody build() {
            return new QuerySendDetailsResponseBody(this);
        } 

    } 

    public static class SmsSendDetailDTO extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("ErrCode")
        private String errCode;

        @com.aliyun.core.annotation.NameInMap("OutId")
        private String outId;

        @com.aliyun.core.annotation.NameInMap("PhoneNum")
        private String phoneNum;

        @com.aliyun.core.annotation.NameInMap("ReceiveDate")
        private String receiveDate;

        @com.aliyun.core.annotation.NameInMap("SendDate")
        private String sendDate;

        @com.aliyun.core.annotation.NameInMap("SendStatus")
        private Long sendStatus;

        @com.aliyun.core.annotation.NameInMap("TemplateCode")
        private String templateCode;

        private SmsSendDetailDTO(Builder builder) {
            this.content = builder.content;
            this.errCode = builder.errCode;
            this.outId = builder.outId;
            this.phoneNum = builder.phoneNum;
            this.receiveDate = builder.receiveDate;
            this.sendDate = builder.sendDate;
            this.sendStatus = builder.sendStatus;
            this.templateCode = builder.templateCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SmsSendDetailDTO create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return errCode
         */
        public String getErrCode() {
            return this.errCode;
        }

        /**
         * @return outId
         */
        public String getOutId() {
            return this.outId;
        }

        /**
         * @return phoneNum
         */
        public String getPhoneNum() {
            return this.phoneNum;
        }

        /**
         * @return receiveDate
         */
        public String getReceiveDate() {
            return this.receiveDate;
        }

        /**
         * @return sendDate
         */
        public String getSendDate() {
            return this.sendDate;
        }

        /**
         * @return sendStatus
         */
        public Long getSendStatus() {
            return this.sendStatus;
        }

        /**
         * @return templateCode
         */
        public String getTemplateCode() {
            return this.templateCode;
        }

        public static final class Builder {
            private String content; 
            private String errCode; 
            private String outId; 
            private String phoneNum; 
            private String receiveDate; 
            private String sendDate; 
            private Long sendStatus; 
            private String templateCode; 

            /**
             * The content of the message.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * The status code returned by the carrier.
             * <p>
             * 
             * *   If the message is delivered, "DELIVERED" is returned.
             * *   For information about the error codes that may be returned if the message is not delivered, see [error codes](~~101347~~).
             */
            public Builder errCode(String errCode) {
                this.errCode = errCode;
                return this;
            }

            /**
             * The extended field.
             */
            public Builder outId(String outId) {
                this.outId = outId;
                return this;
            }

            /**
             * The mobile numbers of the recipients.
             */
            public Builder phoneNum(String phoneNum) {
                this.phoneNum = phoneNum;
                return this;
            }

            /**
             * The date and time when the message was received.
             */
            public Builder receiveDate(String receiveDate) {
                this.receiveDate = receiveDate;
                return this;
            }

            /**
             * The date and time when the message was sent.
             */
            public Builder sendDate(String sendDate) {
                this.sendDate = sendDate;
                return this;
            }

            /**
             * The delivery status of the message. Valid values:
             * <p>
             * 
             * *   **1**: The message has not received a delivery receipt yet.
             * *   **2**: The message failed to be delivered.
             * *   **3**: The message was delivered.
             */
            public Builder sendStatus(Long sendStatus) {
                this.sendStatus = sendStatus;
                return this;
            }

            /**
             * The ID of the message template.
             */
            public Builder templateCode(String templateCode) {
                this.templateCode = templateCode;
                return this;
            }

            public SmsSendDetailDTO build() {
                return new SmsSendDetailDTO(this);
            } 

        } 

    }
    public static class SmsSendDetailDTOs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SmsSendDetailDTO")
        private java.util.List < SmsSendDetailDTO> smsSendDetailDTO;

        private SmsSendDetailDTOs(Builder builder) {
            this.smsSendDetailDTO = builder.smsSendDetailDTO;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SmsSendDetailDTOs create() {
            return builder().build();
        }

        /**
         * @return smsSendDetailDTO
         */
        public java.util.List < SmsSendDetailDTO> getSmsSendDetailDTO() {
            return this.smsSendDetailDTO;
        }

        public static final class Builder {
            private java.util.List < SmsSendDetailDTO> smsSendDetailDTO; 

            /**
             * SmsSendDetailDTO.
             */
            public Builder smsSendDetailDTO(java.util.List < SmsSendDetailDTO> smsSendDetailDTO) {
                this.smsSendDetailDTO = smsSendDetailDTO;
                return this;
            }

            public SmsSendDetailDTOs build() {
                return new SmsSendDetailDTOs(this);
            } 

        } 

    }
}
