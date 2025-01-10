// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20151123.models;

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
 * {@link SenderStatisticsDetailByParamResponseBody} extends {@link TeaModel}
 *
 * <p>SenderStatisticsDetailByParamResponseBody</p>
 */
public class SenderStatisticsDetailByParamResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NextStart")
    private String nextStart;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("data")
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
    public String getNextStart() {
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
        private String nextStart; 
        private String requestId; 
        private Data data; 

        /**
         * <p>The start position of the next page. The return value of the NextStart parameter indicates the start position of the next page. If you want to obtain more records, specify the return value in the next request.</p>
         * 
         * <strong>example:</strong>
         * <p>90f0243616#203#a***@example.net-1658817689#a***@example.net.247141122178</p>
         */
        public Builder nextStart(String nextStart) {
            this.nextStart = nextStart;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>B5AB8EBB-EE64-4BB2-B085-B92CC5DEDC41</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The response parameters.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        public SenderStatisticsDetailByParamResponseBody build() {
            return new SenderStatisticsDetailByParamResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link SenderStatisticsDetailByParamResponseBody} extends {@link TeaModel}
     *
     * <p>SenderStatisticsDetailByParamResponseBody</p>
     */
    public static class MailDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountName")
        private String accountName;

        @com.aliyun.core.annotation.NameInMap("ErrorClassification")
        private String errorClassification;

        @com.aliyun.core.annotation.NameInMap("LastUpdateTime")
        private String lastUpdateTime;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("Subject")
        private String subject;

        @com.aliyun.core.annotation.NameInMap("ToAddress")
        private String toAddress;

        @com.aliyun.core.annotation.NameInMap("UtcLastUpdateTime")
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
             * <p>The sender address.</p>
             * 
             * <strong>example:</strong>
             * <p>s***@example.net</p>
             */
            public Builder accountName(String accountName) {
                this.accountName = accountName;
                return this;
            }

            /**
             * <p>Detailed classification of error causes:</p>
             * <ul>
             * <li>SendOk</li>
             * <li>SmtpNxBox</li>
             * </ul>
             * <p>etc.</p>
             * 
             * <strong>example:</strong>
             * <p>SendOk</p>
             */
            public Builder errorClassification(String errorClassification) {
                this.errorClassification = errorClassification;
                return this;
            }

            /**
             * <p>The most recent update time.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-04-28T17:11Z</p>
             */
            public Builder lastUpdateTime(String lastUpdateTime) {
                this.lastUpdateTime = lastUpdateTime;
                return this;
            }

            /**
             * <p>The details of the email.</p>
             * 
             * <strong>example:</strong>
             * <p>250 Send Mail OK</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The delivery status. Valid values: 0: successful, 2 invalid email address, 3: spam, and 4: failed.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * <p>the subject of email.</p>
             * 
             * <strong>example:</strong>
             * <p>test subject</p>
             */
            public Builder subject(String subject) {
                this.subject = subject;
                return this;
            }

            /**
             * <p>The recipient address.</p>
             * 
             * <strong>example:</strong>
             * <p>b***@example.net</p>
             */
            public Builder toAddress(String toAddress) {
                this.toAddress = toAddress;
                return this;
            }

            /**
             * <p>The most recent update time (timestamp format)</p>
             * 
             * <strong>example:</strong>
             * <p>1619601108</p>
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
    /**
     * 
     * {@link SenderStatisticsDetailByParamResponseBody} extends {@link TeaModel}
     *
     * <p>SenderStatisticsDetailByParamResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("mailDetail")
        private java.util.List<MailDetail> mailDetail;

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
        public java.util.List<MailDetail> getMailDetail() {
            return this.mailDetail;
        }

        public static final class Builder {
            private java.util.List<MailDetail> mailDetail; 

            /**
             * mailDetail.
             */
            public Builder mailDetail(java.util.List<MailDetail> mailDetail) {
                this.mailDetail = mailDetail;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
