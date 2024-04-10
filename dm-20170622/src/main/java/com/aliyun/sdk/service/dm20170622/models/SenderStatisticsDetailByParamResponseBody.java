// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20170622.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SenderStatisticsDetailByParamResponseBody} extends {@link TeaModel}
 *
 * <p>SenderStatisticsDetailByParamResponseBody</p>
 */
public class SenderStatisticsDetailByParamResponseBody extends TeaModel {
    @NameInMap("NextStart")
    private Integer nextStart;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("data")
    private Data data;

    private SenderStatisticsDetailByParamResponseBody(Builder builder) {
        this.nextStart = builder.nextStart;
        this.requestId = builder.requestId;
        this.data = builder.data;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SenderStatisticsDetailByParamResponseBody create() {
        return builder().build();
    }

    /**
     * @return nextStart
     */
    public Integer getNextStart() {
        return this.nextStart;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    public static final class Builder {
        private Integer nextStart; 
        private String requestId; 
        private Data data; 

        /**
         * NextStart.
         */
        public Builder nextStart(Integer nextStart) {
            this.nextStart = nextStart;
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
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        public SenderStatisticsDetailByParamResponseBody build() {
            return new SenderStatisticsDetailByParamResponseBody(this);
        } 

    } 

    public static class MailDetail extends TeaModel {
        @NameInMap("AccountName")
        private String accountName;

        @NameInMap("ErrorClassification")
        private String errorClassification;

        @NameInMap("LastUpdateTime")
        private String lastUpdateTime;

        @NameInMap("Message")
        private String message;

        @NameInMap("Status")
        private Integer status;

        @NameInMap("Subject")
        private String subject;

        @NameInMap("ToAddress")
        private String toAddress;

        @NameInMap("UtcLastUpdateTime")
        private String utcLastUpdateTime;

        private MailDetail(Builder builder) {
            this.accountName = builder.accountName;
            this.errorClassification = builder.errorClassification;
            this.lastUpdateTime = builder.lastUpdateTime;
            this.message = builder.message;
            this.status = builder.status;
            this.subject = builder.subject;
            this.toAddress = builder.toAddress;
            this.utcLastUpdateTime = builder.utcLastUpdateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MailDetail create() {
            return builder().build();
        }

        /**
         * @return accountName
         */
        public String getAccountName() {
            return this.accountName;
        }

        /**
         * @return errorClassification
         */
        public String getErrorClassification() {
            return this.errorClassification;
        }

        /**
         * @return lastUpdateTime
         */
        public String getLastUpdateTime() {
            return this.lastUpdateTime;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return subject
         */
        public String getSubject() {
            return this.subject;
        }

        /**
         * @return toAddress
         */
        public String getToAddress() {
            return this.toAddress;
        }

        /**
         * @return utcLastUpdateTime
         */
        public String getUtcLastUpdateTime() {
            return this.utcLastUpdateTime;
        }

        public static final class Builder {
            private String accountName; 
            private String errorClassification; 
            private String lastUpdateTime; 
            private String message; 
            private Integer status; 
            private String subject; 
            private String toAddress; 
            private String utcLastUpdateTime; 

            /**
             * AccountName.
             */
            public Builder accountName(String accountName) {
                this.accountName = accountName;
                return this;
            }

            /**
             * ErrorClassification.
             */
            public Builder errorClassification(String errorClassification) {
                this.errorClassification = errorClassification;
                return this;
            }

            /**
             * LastUpdateTime.
             */
            public Builder lastUpdateTime(String lastUpdateTime) {
                this.lastUpdateTime = lastUpdateTime;
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
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * Subject.
             */
            public Builder subject(String subject) {
                this.subject = subject;
                return this;
            }

            /**
             * ToAddress.
             */
            public Builder toAddress(String toAddress) {
                this.toAddress = toAddress;
                return this;
            }

            /**
             * UtcLastUpdateTime.
             */
            public Builder utcLastUpdateTime(String utcLastUpdateTime) {
                this.utcLastUpdateTime = utcLastUpdateTime;
                return this;
            }

            public MailDetail build() {
                return new MailDetail(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("mailDetail")
        private java.util.List < MailDetail> mailDetail;

        private Data(Builder builder) {
            this.mailDetail = builder.mailDetail;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return mailDetail
         */
        public java.util.List < MailDetail> getMailDetail() {
            return this.mailDetail;
        }

        public static final class Builder {
            private java.util.List < MailDetail> mailDetail; 

            /**
             * mailDetail.
             */
            public Builder mailDetail(java.util.List < MailDetail> mailDetail) {
                this.mailDetail = mailDetail;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
