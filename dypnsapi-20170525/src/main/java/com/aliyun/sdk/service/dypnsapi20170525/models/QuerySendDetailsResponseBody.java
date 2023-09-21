// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dypnsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QuerySendDetailsResponseBody} extends {@link TeaModel}
 *
 * <p>QuerySendDetailsResponseBody</p>
 */
public class QuerySendDetailsResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("Model")
    private java.util.List < Model> model;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TotalCount")
    private Long totalCount;

    private QuerySendDetailsResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.message = builder.message;
        this.model = builder.model;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuerySendDetailsResponseBody create() {
        return builder().build();
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
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
     * @return model
     */
    public java.util.List < Model> getModel() {
        return this.model;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String accessDeniedDetail; 
        private String code; 
        private String message; 
        private java.util.List < Model> model; 
        private Boolean success; 
        private Long totalCount; 

        /**
         * AccessDeniedDetail.
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
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
         * Model.
         */
        public Builder model(java.util.List < Model> model) {
            this.model = model;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public QuerySendDetailsResponseBody build() {
            return new QuerySendDetailsResponseBody(this);
        } 

    } 

    public static class Model extends TeaModel {
        @NameInMap("Content")
        private String content;

        @NameInMap("ErrCode")
        private String errCode;

        @NameInMap("OutId")
        private String outId;

        @NameInMap("PhoneNum")
        private String phoneNum;

        @NameInMap("ReceiveDate")
        private String receiveDate;

        @NameInMap("SendDate")
        private String sendDate;

        @NameInMap("SendStatus")
        private Long sendStatus;

        @NameInMap("TemplateCode")
        private String templateCode;

        private Model(Builder builder) {
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

        public static Model create() {
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
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * ErrCode.
             */
            public Builder errCode(String errCode) {
                this.errCode = errCode;
                return this;
            }

            /**
             * OutId.
             */
            public Builder outId(String outId) {
                this.outId = outId;
                return this;
            }

            /**
             * PhoneNum.
             */
            public Builder phoneNum(String phoneNum) {
                this.phoneNum = phoneNum;
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
            public Builder sendStatus(Long sendStatus) {
                this.sendStatus = sendStatus;
                return this;
            }

            /**
             * TemplateCode.
             */
            public Builder templateCode(String templateCode) {
                this.templateCode = templateCode;
                return this;
            }

            public Model build() {
                return new Model(this);
            } 

        } 

    }
}
