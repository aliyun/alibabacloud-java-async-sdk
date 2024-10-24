// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysmsapi20170525.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The response code.</p>
         * <ul>
         * <li>The value OK indicates that the request was successful.</li>
         * <li>Other values indicate that the request failed. For more information, see <a href="https://help.aliyun.com/document_detail/101346.html">Error codes</a>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>819BE656-D2E0-4858-8B21-B2E477085AAF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The details of the message.</p>
         */
        public Builder smsSendDetailDTOs(SmsSendDetailDTOs smsSendDetailDTOs) {
            this.smsSendDetailDTOs = smsSendDetailDTOs;
            return this;
        }

        /**
         * <p>The number of sent messages.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public QuerySendDetailsResponseBody build() {
            return new QuerySendDetailsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QuerySendDetailsResponseBody} extends {@link TeaModel}
     *
     * <p>QuerySendDetailsResponseBody</p>
     */
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
             * <p>The content of the message.</p>
             * 
             * <strong>example:</strong>
             * <p>【Aliyun】This is a test message.</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The status code returned by the carrier.</p>
             * <ul>
             * <li>If the message is delivered, &quot;DELIVERED&quot; is returned.</li>
             * <li>For information about the error codes that may be returned if the message is not delivered, see <a href="https://help.aliyun.com/document_detail/101347.html">error codes</a>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>DELIVERED</p>
             */
            public Builder errCode(String errCode) {
                this.errCode = errCode;
                return this;
            }

            /**
             * <p>The extended field.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder outId(String outId) {
                this.outId = outId;
                return this;
            }

            /**
             * <p>The mobile numbers of the recipients.</p>
             * 
             * <strong>example:</strong>
             * <p>1390000****</p>
             */
            public Builder phoneNum(String phoneNum) {
                this.phoneNum = phoneNum;
                return this;
            }

            /**
             * <p>The date and time when the message was received.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-01-08 16:44:13</p>
             */
            public Builder receiveDate(String receiveDate) {
                this.receiveDate = receiveDate;
                return this;
            }

            /**
             * <p>The date and time when the message was sent.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-01-08 16:44:10</p>
             */
            public Builder sendDate(String sendDate) {
                this.sendDate = sendDate;
                return this;
            }

            /**
             * <p>The delivery status of the message. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: The message has not received a delivery receipt yet.</li>
             * <li><strong>2</strong>: The message failed to be delivered.</li>
             * <li><strong>3</strong>: The message was delivered.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder sendStatus(Long sendStatus) {
                this.sendStatus = sendStatus;
                return this;
            }

            /**
             * <p>The ID of the message template.</p>
             * 
             * <strong>example:</strong>
             * <p>SMS_12231****</p>
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
    /**
     * 
     * {@link QuerySendDetailsResponseBody} extends {@link TeaModel}
     *
     * <p>QuerySendDetailsResponseBody</p>
     */
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
