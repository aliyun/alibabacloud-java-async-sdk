// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth20200618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSmsDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSmsDetailResponseBody</p>
 */
public class DescribeSmsDetailResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("CurrentPage")
    private Integer currentPage;

    @NameInMap("Items")
    private java.util.List < Items> items;

    @NameInMap("Message")
    private String message;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalItem")
    private Integer totalItem;

    @NameInMap("TotalPage")
    private Integer totalPage;

    private DescribeSmsDetailResponseBody(Builder builder) {
        this.code = builder.code;
        this.currentPage = builder.currentPage;
        this.items = builder.items;
        this.message = builder.message;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalItem = builder.totalItem;
        this.totalPage = builder.totalPage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSmsDetailResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return items
     */
    public java.util.List < Items> getItems() {
        return this.items;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalItem
     */
    public Integer getTotalItem() {
        return this.totalItem;
    }

    /**
     * @return totalPage
     */
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static final class Builder {
        private String code; 
        private Integer currentPage; 
        private java.util.List < Items> items; 
        private String message; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalItem; 
        private Integer totalPage; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * Items.
         */
        public Builder items(java.util.List < Items> items) {
            this.items = items;
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
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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
         * TotalItem.
         */
        public Builder totalItem(Integer totalItem) {
            this.totalItem = totalItem;
            return this;
        }

        /**
         * TotalPage.
         */
        public Builder totalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }

        public DescribeSmsDetailResponseBody build() {
            return new DescribeSmsDetailResponseBody(this);
        } 

    } 

    public static class Items extends TeaModel {
        @NameInMap("BizId")
        private String bizId;

        @NameInMap("Content")
        private String content;

        @NameInMap("ErrorCode")
        private String errorCode;

        @NameInMap("ErrorMessage")
        private String errorMessage;

        @NameInMap("Mobile")
        private String mobile;

        @NameInMap("OuterOrderNo")
        private String outerOrderNo;

        @NameInMap("ReceiveDate")
        private String receiveDate;

        @NameInMap("SendDate")
        private String sendDate;

        @NameInMap("SendStatus")
        private String sendStatus;

        @NameInMap("SignName")
        private String signName;

        @NameInMap("SmsSize")
        private Integer smsSize;

        @NameInMap("TaskDate")
        private String taskDate;

        @NameInMap("TemplateCode")
        private String templateCode;

        private Items(Builder builder) {
            this.bizId = builder.bizId;
            this.content = builder.content;
            this.errorCode = builder.errorCode;
            this.errorMessage = builder.errorMessage;
            this.mobile = builder.mobile;
            this.outerOrderNo = builder.outerOrderNo;
            this.receiveDate = builder.receiveDate;
            this.sendDate = builder.sendDate;
            this.sendStatus = builder.sendStatus;
            this.signName = builder.signName;
            this.smsSize = builder.smsSize;
            this.taskDate = builder.taskDate;
            this.templateCode = builder.templateCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return bizId
         */
        public String getBizId() {
            return this.bizId;
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return mobile
         */
        public String getMobile() {
            return this.mobile;
        }

        /**
         * @return outerOrderNo
         */
        public String getOuterOrderNo() {
            return this.outerOrderNo;
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
        public String getSendStatus() {
            return this.sendStatus;
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
        public Integer getSmsSize() {
            return this.smsSize;
        }

        /**
         * @return taskDate
         */
        public String getTaskDate() {
            return this.taskDate;
        }

        /**
         * @return templateCode
         */
        public String getTemplateCode() {
            return this.templateCode;
        }

        public static final class Builder {
            private String bizId; 
            private String content; 
            private String errorCode; 
            private String errorMessage; 
            private String mobile; 
            private String outerOrderNo; 
            private String receiveDate; 
            private String sendDate; 
            private String sendStatus; 
            private String signName; 
            private Integer smsSize; 
            private String taskDate; 
            private String templateCode; 

            /**
             * BizId.
             */
            public Builder bizId(String bizId) {
                this.bizId = bizId;
                return this;
            }

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * ErrorCode.
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * ErrorMessage.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * Mobile.
             */
            public Builder mobile(String mobile) {
                this.mobile = mobile;
                return this;
            }

            /**
             * OuterOrderNo.
             */
            public Builder outerOrderNo(String outerOrderNo) {
                this.outerOrderNo = outerOrderNo;
                return this;
            }

            /**
             * ReceiveDate.
             */
            public Builder receiveDate(String receiveDate) {
                this.receiveDate = receiveDate;
                return this;
            }

            /**
             * SendDate.
             */
            public Builder sendDate(String sendDate) {
                this.sendDate = sendDate;
                return this;
            }

            /**
             * SendStatus.
             */
            public Builder sendStatus(String sendStatus) {
                this.sendStatus = sendStatus;
                return this;
            }

            /**
             * SignName.
             */
            public Builder signName(String signName) {
                this.signName = signName;
                return this;
            }

            /**
             * SmsSize.
             */
            public Builder smsSize(Integer smsSize) {
                this.smsSize = smsSize;
                return this;
            }

            /**
             * TaskDate.
             */
            public Builder taskDate(String taskDate) {
                this.taskDate = taskDate;
                return this;
            }

            /**
             * TemplateCode.
             */
            public Builder templateCode(String templateCode) {
                this.templateCode = templateCode;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
