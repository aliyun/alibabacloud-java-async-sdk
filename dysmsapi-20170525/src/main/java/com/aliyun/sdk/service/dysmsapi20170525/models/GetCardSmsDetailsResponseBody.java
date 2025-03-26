// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysmsapi20170525.models;

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
 * {@link GetCardSmsDetailsResponseBody} extends {@link TeaModel}
 *
 * <p>GetCardSmsDetailsResponseBody</p>
 */
public class GetCardSmsDetailsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("CardSendDetailDTO")
    private CardSendDetailDTO cardSendDetailDTO;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetCardSmsDetailsResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.cardSendDetailDTO = builder.cardSendDetailDTO;
        this.code = builder.code;
        this.message = builder.message;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCardSmsDetailsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    /**
     * @return cardSendDetailDTO
     */
    public CardSendDetailDTO getCardSendDetailDTO() {
        return this.cardSendDetailDTO;
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String accessDeniedDetail; 
        private CardSendDetailDTO cardSendDetailDTO; 
        private String code; 
        private String message; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetCardSmsDetailsResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.cardSendDetailDTO = model.cardSendDetailDTO;
            this.code = model.code;
            this.message = model.message;
            this.success = model.success;
        } 

        /**
         * <p>Access denied detail; this field is returned only if the RAM check fails.</p>
         * 
         * <strong>example:</strong>
         * <p>无</p>
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * <p>Card SMS sending result</p>
         */
        public Builder cardSendDetailDTO(CardSendDetailDTO cardSendDetailDTO) {
            this.cardSendDetailDTO = cardSendDetailDTO;
            return this;
        }

        /**
         * <p>Request status code.</p>
         * <ul>
         * <li>OK indicates a successful request.</li>
         * <li>For other error codes, see <a href="https://help.aliyun.com/document_detail/101346.html">API Error Codes</a>.</li>
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
         * <p>Description of the status code.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Indicates whether the API call was successful. Values:</p>
         * <ul>
         * <li><strong>true</strong> - <strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetCardSmsDetailsResponseBody build() {
            return new GetCardSmsDetailsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetCardSmsDetailsResponseBody} extends {@link TeaModel}
     *
     * <p>GetCardSmsDetailsResponseBody</p>
     */
    public static class Records extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrCode")
        private String errCode;

        @com.aliyun.core.annotation.NameInMap("OutId")
        private String outId;

        @com.aliyun.core.annotation.NameInMap("PhoneNumber")
        private String phoneNumber;

        @com.aliyun.core.annotation.NameInMap("ReceiveDate")
        private String receiveDate;

        @com.aliyun.core.annotation.NameInMap("ReceiveType")
        private String receiveType;

        @com.aliyun.core.annotation.NameInMap("RenderDate")
        private String renderDate;

        @com.aliyun.core.annotation.NameInMap("RenderStatus")
        private Long renderStatus;

        @com.aliyun.core.annotation.NameInMap("SendDate")
        private String sendDate;

        @com.aliyun.core.annotation.NameInMap("SendStatus")
        private Long sendStatus;

        @com.aliyun.core.annotation.NameInMap("SmsContent")
        private String smsContent;

        @com.aliyun.core.annotation.NameInMap("TemplateCode")
        private String templateCode;

        private Records(Builder builder) {
            this.errCode = builder.errCode;
            this.outId = builder.outId;
            this.phoneNumber = builder.phoneNumber;
            this.receiveDate = builder.receiveDate;
            this.receiveType = builder.receiveType;
            this.renderDate = builder.renderDate;
            this.renderStatus = builder.renderStatus;
            this.sendDate = builder.sendDate;
            this.sendStatus = builder.sendStatus;
            this.smsContent = builder.smsContent;
            this.templateCode = builder.templateCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Records create() {
            return builder().build();
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
         * @return phoneNumber
         */
        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        /**
         * @return receiveDate
         */
        public String getReceiveDate() {
            return this.receiveDate;
        }

        /**
         * @return receiveType
         */
        public String getReceiveType() {
            return this.receiveType;
        }

        /**
         * @return renderDate
         */
        public String getRenderDate() {
            return this.renderDate;
        }

        /**
         * @return renderStatus
         */
        public Long getRenderStatus() {
            return this.renderStatus;
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
         * @return smsContent
         */
        public String getSmsContent() {
            return this.smsContent;
        }

        /**
         * @return templateCode
         */
        public String getTemplateCode() {
            return this.templateCode;
        }

        public static final class Builder {
            private String errCode; 
            private String outId; 
            private String phoneNumber; 
            private String receiveDate; 
            private String receiveType; 
            private String renderDate; 
            private Long renderStatus; 
            private String sendDate; 
            private Long sendStatus; 
            private String smsContent; 
            private String templateCode; 

            private Builder() {
            } 

            private Builder(Records model) {
                this.errCode = model.errCode;
                this.outId = model.outId;
                this.phoneNumber = model.phoneNumber;
                this.receiveDate = model.receiveDate;
                this.receiveType = model.receiveType;
                this.renderDate = model.renderDate;
                this.renderStatus = model.renderStatus;
                this.sendDate = model.sendDate;
                this.sendStatus = model.sendStatus;
                this.smsContent = model.smsContent;
                this.templateCode = model.templateCode;
            } 

            /**
             * <p>Error code for sending</p>
             * 
             * <strong>example:</strong>
             * <p>Success</p>
             */
            public Builder errCode(String errCode) {
                this.errCode = errCode;
                return this;
            }

            /**
             * <p>Customer-transmitted outId</p>
             * 
             * <strong>example:</strong>
             * <p>12345678</p>
             */
            public Builder outId(String outId) {
                this.outId = outId;
                return this;
            }

            /**
             * <p>Phone number that received the SMS</p>
             * 
             * <strong>example:</strong>
             * <p>156****9080</p>
             */
            public Builder phoneNumber(String phoneNumber) {
                this.phoneNumber = phoneNumber;
                return this;
            }

            /**
             * <p>Receive date</p>
             * 
             * <strong>example:</strong>
             * <p>2024-09-27 11:26:35</p>
             */
            public Builder receiveDate(String receiveDate) {
                this.receiveDate = receiveDate;
                return this;
            }

            /**
             * <p>Receive SMS type</p>
             * 
             * <strong>example:</strong>
             * <p>CARD_SMS</p>
             */
            public Builder receiveType(String receiveType) {
                this.receiveType = receiveType;
                return this;
            }

            /**
             * <p>Render date</p>
             * 
             * <strong>example:</strong>
             * <p>2024-09-27 12:13:39</p>
             */
            public Builder renderDate(String renderDate) {
                this.renderDate = renderDate;
                return this;
            }

            /**
             * <p>Render status. 0: Not rendered; 1: Rendered successfully; 3: Not rendered</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder renderStatus(Long renderStatus) {
                this.renderStatus = renderStatus;
                return this;
            }

            /**
             * <p>Time when the SMS was sent</p>
             * 
             * <strong>example:</strong>
             * <p>2024-09-27 11:26:32</p>
             */
            public Builder sendDate(String sendDate) {
                this.sendDate = sendDate;
                return this;
            }

            /**
             * <p>Sending status. 1: Sending; 2: Send failed; 3: Sent successfully; 4: Addressing failed</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder sendStatus(Long sendStatus) {
                this.sendStatus = sendStatus;
                return this;
            }

            /**
             * <p>SMS content. Only applicable for text messages.</p>
             * 
             * <strong>example:</strong>
             * <p>您收到一条短信消息</p>
             */
            public Builder smsContent(String smsContent) {
                this.smsContent = smsContent;
                return this;
            }

            /**
             * <p>Template code</p>
             * 
             * <strong>example:</strong>
             * <p>CARD_SMS_6***</p>
             */
            public Builder templateCode(String templateCode) {
                this.templateCode = templateCode;
                return this;
            }

            public Records build() {
                return new Records(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetCardSmsDetailsResponseBody} extends {@link TeaModel}
     *
     * <p>GetCardSmsDetailsResponseBody</p>
     */
    public static class CardSendDetailDTO extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CurrentPage")
        private Long currentPage;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Long pageSize;

        @com.aliyun.core.annotation.NameInMap("Records")
        private java.util.List<Records> records;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Long totalCount;

        private CardSendDetailDTO(Builder builder) {
            this.currentPage = builder.currentPage;
            this.pageSize = builder.pageSize;
            this.records = builder.records;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CardSendDetailDTO create() {
            return builder().build();
        }

        /**
         * @return currentPage
         */
        public Long getCurrentPage() {
            return this.currentPage;
        }

        /**
         * @return pageSize
         */
        public Long getPageSize() {
            return this.pageSize;
        }

        /**
         * @return records
         */
        public java.util.List<Records> getRecords() {
            return this.records;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Long currentPage; 
            private Long pageSize; 
            private java.util.List<Records> records; 
            private Long totalCount; 

            private Builder() {
            } 

            private Builder(CardSendDetailDTO model) {
                this.currentPage = model.currentPage;
                this.pageSize = model.pageSize;
                this.records = model.records;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>Current page number</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder currentPage(Long currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * <p>Page size</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Long pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>List of card SMS sending records</p>
             */
            public Builder records(java.util.List<Records> records) {
                this.records = records;
                return this;
            }

            /**
             * <p>Total count</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public CardSendDetailDTO build() {
                return new CardSendDetailDTO(this);
            } 

        } 

    }
}
