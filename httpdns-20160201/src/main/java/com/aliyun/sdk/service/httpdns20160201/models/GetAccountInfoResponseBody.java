// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.httpdns20160201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAccountInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetAccountInfoResponseBody</p>
 */
public class GetAccountInfoResponseBody extends TeaModel {
    @NameInMap("AccountInfo")
    private AccountInfo accountInfo;

    @NameInMap("RequestId")
    private String requestId;

    private GetAccountInfoResponseBody(Builder builder) {
        this.accountInfo = builder.accountInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAccountInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return accountInfo
     */
    public AccountInfo getAccountInfo() {
        return this.accountInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private AccountInfo accountInfo; 
        private String requestId; 

        /**
         * AccountInfo.
         */
        public Builder accountInfo(AccountInfo accountInfo) {
            this.accountInfo = accountInfo;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetAccountInfoResponseBody build() {
            return new GetAccountInfoResponseBody(this);
        } 

    } 

    public static class AccountInfo extends TeaModel {
        @NameInMap("AccountId")
        private String accountId;

        @NameInMap("MonthFreeCount")
        private Integer monthFreeCount;

        @NameInMap("MonthHttpsResolveCount")
        private Integer monthHttpsResolveCount;

        @NameInMap("MonthResolveCount")
        private Integer monthResolveCount;

        @NameInMap("SignSecret")
        private String signSecret;

        @NameInMap("SignedCount")
        private Long signedCount;

        @NameInMap("UnsignedCount")
        private Long unsignedCount;

        @NameInMap("UnsignedEnabled")
        private Boolean unsignedEnabled;

        private AccountInfo(Builder builder) {
            this.accountId = builder.accountId;
            this.monthFreeCount = builder.monthFreeCount;
            this.monthHttpsResolveCount = builder.monthHttpsResolveCount;
            this.monthResolveCount = builder.monthResolveCount;
            this.signSecret = builder.signSecret;
            this.signedCount = builder.signedCount;
            this.unsignedCount = builder.unsignedCount;
            this.unsignedEnabled = builder.unsignedEnabled;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AccountInfo create() {
            return builder().build();
        }

        /**
         * @return accountId
         */
        public String getAccountId() {
            return this.accountId;
        }

        /**
         * @return monthFreeCount
         */
        public Integer getMonthFreeCount() {
            return this.monthFreeCount;
        }

        /**
         * @return monthHttpsResolveCount
         */
        public Integer getMonthHttpsResolveCount() {
            return this.monthHttpsResolveCount;
        }

        /**
         * @return monthResolveCount
         */
        public Integer getMonthResolveCount() {
            return this.monthResolveCount;
        }

        /**
         * @return signSecret
         */
        public String getSignSecret() {
            return this.signSecret;
        }

        /**
         * @return signedCount
         */
        public Long getSignedCount() {
            return this.signedCount;
        }

        /**
         * @return unsignedCount
         */
        public Long getUnsignedCount() {
            return this.unsignedCount;
        }

        /**
         * @return unsignedEnabled
         */
        public Boolean getUnsignedEnabled() {
            return this.unsignedEnabled;
        }

        public static final class Builder {
            private String accountId; 
            private Integer monthFreeCount; 
            private Integer monthHttpsResolveCount; 
            private Integer monthResolveCount; 
            private String signSecret; 
            private Long signedCount; 
            private Long unsignedCount; 
            private Boolean unsignedEnabled; 

            /**
             * AccountId.
             */
            public Builder accountId(String accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * MonthFreeCount.
             */
            public Builder monthFreeCount(Integer monthFreeCount) {
                this.monthFreeCount = monthFreeCount;
                return this;
            }

            /**
             * MonthHttpsResolveCount.
             */
            public Builder monthHttpsResolveCount(Integer monthHttpsResolveCount) {
                this.monthHttpsResolveCount = monthHttpsResolveCount;
                return this;
            }

            /**
             * MonthResolveCount.
             */
            public Builder monthResolveCount(Integer monthResolveCount) {
                this.monthResolveCount = monthResolveCount;
                return this;
            }

            /**
             * SignSecret.
             */
            public Builder signSecret(String signSecret) {
                this.signSecret = signSecret;
                return this;
            }

            /**
             * SignedCount.
             */
            public Builder signedCount(Long signedCount) {
                this.signedCount = signedCount;
                return this;
            }

            /**
             * UnsignedCount.
             */
            public Builder unsignedCount(Long unsignedCount) {
                this.unsignedCount = unsignedCount;
                return this;
            }

            /**
             * UnsignedEnabled.
             */
            public Builder unsignedEnabled(Boolean unsignedEnabled) {
                this.unsignedEnabled = unsignedEnabled;
                return this;
            }

            public AccountInfo build() {
                return new AccountInfo(this);
            } 

        } 

    }
}
