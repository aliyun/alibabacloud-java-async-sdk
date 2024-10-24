// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysmsapi20170525.models;

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

        /**
         * AccessDeniedDetail.
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * <p>卡片短信发送结果</p>
         */
        public Builder cardSendDetailDTO(CardSendDetailDTO cardSendDetailDTO) {
            this.cardSendDetailDTO = cardSendDetailDTO;
            return this;
        }

        /**
         * <p>状态码</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>状态描述</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * Success.
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

            /**
             * <p>发送错误码</p>
             * 
             * <strong>example:</strong>
             * <p>Success</p>
             */
            public Builder errCode(String errCode) {
                this.errCode = errCode;
                return this;
            }

            /**
             * <p>客户传输outId</p>
             * 
             * <strong>example:</strong>
             * <p>12345678</p>
             */
            public Builder outId(String outId) {
                this.outId = outId;
                return this;
            }

            /**
             * <p>接收短信手机号</p>
             * 
             * <strong>example:</strong>
             * <p>156****9080</p>
             */
            public Builder phoneNumber(String phoneNumber) {
                this.phoneNumber = phoneNumber;
                return this;
            }

            /**
             * <p>接收时间</p>
             * 
             * <strong>example:</strong>
             * <p>2024-09-27 11:26:35</p>
             */
            public Builder receiveDate(String receiveDate) {
                this.receiveDate = receiveDate;
                return this;
            }

            /**
             * <p>接收短信类型</p>
             * 
             * <strong>example:</strong>
             * <p>CARD_SMS</p>
             */
            public Builder receiveType(String receiveType) {
                this.receiveType = receiveType;
                return this;
            }

            /**
             * <p>渲染时间</p>
             * 
             * <strong>example:</strong>
             * <p>2024-09-27 12:13:39</p>
             */
            public Builder renderDate(String renderDate) {
                this.renderDate = renderDate;
                return this;
            }

            /**
             * <p>解析状态.。0：未解析；1：解析成功；3：未解析</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder renderStatus(Long renderStatus) {
                this.renderStatus = renderStatus;
                return this;
            }

            /**
             * <p>短信发送时间</p>
             * 
             * <strong>example:</strong>
             * <p>2024-09-27 11:26:32</p>
             */
            public Builder sendDate(String sendDate) {
                this.sendDate = sendDate;
                return this;
            }

            /**
             * <p>发送状态 1：发送中；2：发送失败；3：发送成功；4：寻址失败</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder sendStatus(Long sendStatus) {
                this.sendStatus = sendStatus;
                return this;
            }

            /**
             * <p>短信内容。只有文本短信有值</p>
             * 
             * <strong>example:</strong>
             * <p>您收到一条短信消息</p>
             */
            public Builder smsContent(String smsContent) {
                this.smsContent = smsContent;
                return this;
            }

            /**
             * <p>模板code</p>
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
        private java.util.List < Records> records;

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
        public java.util.List < Records> getRecords() {
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
            private java.util.List < Records> records; 
            private Long totalCount; 

            /**
             * <p>页码</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder currentPage(Long currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * <p>页数</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Long pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * Records.
             */
            public Builder records(java.util.List < Records> records) {
                this.records = records;
                return this;
            }

            /**
             * <p>总量</p>
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
