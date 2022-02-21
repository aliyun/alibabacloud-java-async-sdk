// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20151123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryMailAddressByParamResponseBody} extends {@link TeaModel}
 *
 * <p>QueryMailAddressByParamResponseBody</p>
 */
public class QueryMailAddressByParamResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    @NameInMap("data")
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

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
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
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        public QueryMailAddressByParamResponseBody build() {
            return new QueryMailAddressByParamResponseBody(this);
        } 

    } 

    public static class MailAddress extends TeaModel {
        @NameInMap("AccountName")
        private String accountName;

        @NameInMap("AccountStatus")
        private String accountStatus;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("DailyCount")
        private String dailyCount;

        @NameInMap("DailyReqCount")
        private String dailyReqCount;

        @NameInMap("DomainStatus")
        private String domainStatus;

        @NameInMap("MailAddressId")
        private String mailAddressId;

        @NameInMap("MonthCount")
        private String monthCount;

        @NameInMap("MonthReqCount")
        private String monthReqCount;

        @NameInMap("ReplyAddress")
        private String replyAddress;

        @NameInMap("ReplyStatus")
        private String replyStatus;

        @NameInMap("Sendtype")
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

            /**
             * AccountName.
             */
            public Builder accountName(String accountName) {
                this.accountName = accountName;
                return this;
            }

            /**
             * AccountStatus.
             */
            public Builder accountStatus(String accountStatus) {
                this.accountStatus = accountStatus;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * DailyCount.
             */
            public Builder dailyCount(String dailyCount) {
                this.dailyCount = dailyCount;
                return this;
            }

            /**
             * DailyReqCount.
             */
            public Builder dailyReqCount(String dailyReqCount) {
                this.dailyReqCount = dailyReqCount;
                return this;
            }

            /**
             * DomainStatus.
             */
            public Builder domainStatus(String domainStatus) {
                this.domainStatus = domainStatus;
                return this;
            }

            /**
             * MailAddressId.
             */
            public Builder mailAddressId(String mailAddressId) {
                this.mailAddressId = mailAddressId;
                return this;
            }

            /**
             * MonthCount.
             */
            public Builder monthCount(String monthCount) {
                this.monthCount = monthCount;
                return this;
            }

            /**
             * MonthReqCount.
             */
            public Builder monthReqCount(String monthReqCount) {
                this.monthReqCount = monthReqCount;
                return this;
            }

            /**
             * ReplyAddress.
             */
            public Builder replyAddress(String replyAddress) {
                this.replyAddress = replyAddress;
                return this;
            }

            /**
             * ReplyStatus.
             */
            public Builder replyStatus(String replyStatus) {
                this.replyStatus = replyStatus;
                return this;
            }

            /**
             * Sendtype.
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
    public static class Data extends TeaModel {
        @NameInMap("mailAddress")
        private java.util.List < MailAddress> mailAddress;

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
        public java.util.List < MailAddress> getMailAddress() {
            return this.mailAddress;
        }

        public static final class Builder {
            private java.util.List < MailAddress> mailAddress; 

            /**
             * mailAddress.
             */
            public Builder mailAddress(java.util.List < MailAddress> mailAddress) {
                this.mailAddress = mailAddress;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
