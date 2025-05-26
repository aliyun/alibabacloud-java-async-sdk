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
 * {@link QueryMailAddressByParamResponseBody} extends {@link TeaModel}
 *
 * <p>QueryMailAddressByParamResponseBody</p>
 */
public class QueryMailAddressByParamResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    private QueryMailAddressByParamResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.data = builder.data;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryMailAddressByParamResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
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
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    public static final class Builder {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 
        private Data data; 

        private Builder() {
        } 

        private Builder(QueryMailAddressByParamResponseBody model) {
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
            this.data = model.data;
        } 

        /**
         * <p>Current page number</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>Page size</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Request ID</p>
         * 
         * <strong>example:</strong>
         * <p>95A7D497-F8DD-4834-B81E-C1783236E55F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Total count</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>List of mail addresses</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        public QueryMailAddressByParamResponseBody build() {
            return new QueryMailAddressByParamResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryMailAddressByParamResponseBody} extends {@link TeaModel}
     *
     * <p>QueryMailAddressByParamResponseBody</p>
     */
    public static class MailAddress extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountName")
        private String accountName;

        @com.aliyun.core.annotation.NameInMap("AccountStatus")
        private String accountStatus;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("DailyCount")
        private String dailyCount;

        @com.aliyun.core.annotation.NameInMap("DailyReqCount")
        private String dailyReqCount;

        @com.aliyun.core.annotation.NameInMap("DomainStatus")
        private String domainStatus;

        @com.aliyun.core.annotation.NameInMap("MailAddressId")
        private String mailAddressId;

        @com.aliyun.core.annotation.NameInMap("MonthCount")
        private String monthCount;

        @com.aliyun.core.annotation.NameInMap("MonthReqCount")
        private String monthReqCount;

        @com.aliyun.core.annotation.NameInMap("ReplyAddress")
        private String replyAddress;

        @com.aliyun.core.annotation.NameInMap("ReplyStatus")
        private String replyStatus;

        @com.aliyun.core.annotation.NameInMap("Sendtype")
        private String sendtype;

        private MailAddress(Builder builder) {
            this.accountName = builder.accountName;
            this.accountStatus = builder.accountStatus;
            this.createTime = builder.createTime;
            this.dailyCount = builder.dailyCount;
            this.dailyReqCount = builder.dailyReqCount;
            this.domainStatus = builder.domainStatus;
            this.mailAddressId = builder.mailAddressId;
            this.monthCount = builder.monthCount;
            this.monthReqCount = builder.monthReqCount;
            this.replyAddress = builder.replyAddress;
            this.replyStatus = builder.replyStatus;
            this.sendtype = builder.sendtype;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MailAddress create() {
            return builder().build();
        }

        /**
         * @return accountName
         */
        public String getAccountName() {
            return this.accountName;
        }

        /**
         * @return accountStatus
         */
        public String getAccountStatus() {
            return this.accountStatus;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return dailyCount
         */
        public String getDailyCount() {
            return this.dailyCount;
        }

        /**
         * @return dailyReqCount
         */
        public String getDailyReqCount() {
            return this.dailyReqCount;
        }

        /**
         * @return domainStatus
         */
        public String getDomainStatus() {
            return this.domainStatus;
        }

        /**
         * @return mailAddressId
         */
        public String getMailAddressId() {
            return this.mailAddressId;
        }

        /**
         * @return monthCount
         */
        public String getMonthCount() {
            return this.monthCount;
        }

        /**
         * @return monthReqCount
         */
        public String getMonthReqCount() {
            return this.monthReqCount;
        }

        /**
         * @return replyAddress
         */
        public String getReplyAddress() {
            return this.replyAddress;
        }

        /**
         * @return replyStatus
         */
        public String getReplyStatus() {
            return this.replyStatus;
        }

        /**
         * @return sendtype
         */
        public String getSendtype() {
            return this.sendtype;
        }

        public static final class Builder {
            private String accountName; 
            private String accountStatus; 
            private String createTime; 
            private String dailyCount; 
            private String dailyReqCount; 
            private String domainStatus; 
            private String mailAddressId; 
            private String monthCount; 
            private String monthReqCount; 
            private String replyAddress; 
            private String replyStatus; 
            private String sendtype; 

            private Builder() {
            } 

            private Builder(MailAddress model) {
                this.accountName = model.accountName;
                this.accountStatus = model.accountStatus;
                this.createTime = model.createTime;
                this.dailyCount = model.dailyCount;
                this.dailyReqCount = model.dailyReqCount;
                this.domainStatus = model.domainStatus;
                this.mailAddressId = model.mailAddressId;
                this.monthCount = model.monthCount;
                this.monthReqCount = model.monthReqCount;
                this.replyAddress = model.replyAddress;
                this.replyStatus = model.replyStatus;
                this.sendtype = model.sendtype;
            } 

            /**
             * <p>Sending address</p>
             * 
             * <strong>example:</strong>
             * <p>账户+@+域名</p>
             */
            public Builder accountName(String accountName) {
                this.accountName = accountName;
                return this;
            }

            /**
             * <p>Account status, frozen: 1, normal: 0.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder accountStatus(String accountStatus) {
                this.accountStatus = accountStatus;
                return this;
            }

            /**
             * <p>Creation time</p>
             * 
             * <strong>example:</strong>
             * <p>2019-09-29T13:28Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>Daily quota limit</p>
             * 
             * <strong>example:</strong>
             * <p>10000</p>
             */
            public Builder dailyCount(String dailyCount) {
                this.dailyCount = dailyCount;
                return this;
            }

            /**
             * <p>Daily quota</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder dailyReqCount(String dailyReqCount) {
                this.dailyReqCount = dailyReqCount;
                return this;
            }

            /**
             * <p>Domain status, 0 indicates normal, 1 indicates abnormal.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder domainStatus(String domainStatus) {
                this.domainStatus = domainStatus;
                return this;
            }

            /**
             * <p>Mail address ID</p>
             * 
             * <strong>example:</strong>
             * <p>12122</p>
             */
            public Builder mailAddressId(String mailAddressId) {
                this.mailAddressId = mailAddressId;
                return this;
            }

            /**
             * <p>Monthly quota limit</p>
             * 
             * <strong>example:</strong>
             * <p>300000</p>
             */
            public Builder monthCount(String monthCount) {
                this.monthCount = monthCount;
                return this;
            }

            /**
             * <p>Monthly quota</p>
             * 
             * <strong>example:</strong>
             * <p>20000</p>
             */
            public Builder monthReqCount(String monthReqCount) {
                this.monthReqCount = monthReqCount;
                return this;
            }

            /**
             * <p>Reply address</p>
             * 
             * <strong>example:</strong>
             * <p><a href="mailto:test@example.com">test@example.com</a></p>
             */
            public Builder replyAddress(String replyAddress) {
                this.replyAddress = replyAddress;
                return this;
            }

            /**
             * <p>Reply address status</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder replyStatus(String replyStatus) {
                this.replyStatus = replyStatus;
                return this;
            }

            /**
             * <p>Type of sending address. Values:</p>
             * <ul>
             * <li>batch: bulk email</li>
             * <li>trigger: triggered email</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>batch</p>
             */
            public Builder sendtype(String sendtype) {
                this.sendtype = sendtype;
                return this;
            }

            public MailAddress build() {
                return new MailAddress(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryMailAddressByParamResponseBody} extends {@link TeaModel}
     *
     * <p>QueryMailAddressByParamResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("mailAddress")
        private java.util.List<MailAddress> mailAddress;

        private Data(Builder builder) {
            this.mailAddress = builder.mailAddress;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return mailAddress
         */
        public java.util.List<MailAddress> getMailAddress() {
            return this.mailAddress;
        }

        public static final class Builder {
            private java.util.List<MailAddress> mailAddress; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.mailAddress = model.mailAddress;
            } 

            /**
             * mailAddress.
             */
            public Builder mailAddress(java.util.List<MailAddress> mailAddress) {
                this.mailAddress = mailAddress;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
