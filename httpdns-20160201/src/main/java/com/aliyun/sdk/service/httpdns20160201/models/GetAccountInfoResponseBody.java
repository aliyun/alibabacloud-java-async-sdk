// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.httpdns20160201.models;

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
 * {@link GetAccountInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetAccountInfoResponseBody</p>
 */
public class GetAccountInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccountInfo")
    private AccountInfo accountInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetAccountInfoResponseBody model) {
            this.accountInfo = model.accountInfo;
            this.requestId = model.requestId;
        } 

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

    /**
     * 
     * {@link GetAccountInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetAccountInfoResponseBody</p>
     */
    public static class AccountInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountId")
        private String accountId;

        @com.aliyun.core.annotation.NameInMap("DohEnabled")
        private Boolean dohEnabled;

        @com.aliyun.core.annotation.NameInMap("DohResolveAllEnabled")
        private Boolean dohResolveAllEnabled;

        @com.aliyun.core.annotation.NameInMap("MonthDohResolveCount")
        private Long monthDohResolveCount;

        @com.aliyun.core.annotation.NameInMap("MonthFreeCount")
        private Integer monthFreeCount;

        @com.aliyun.core.annotation.NameInMap("MonthHttpAesResolveCount")
        private Long monthHttpAesResolveCount;

        @com.aliyun.core.annotation.NameInMap("MonthHttpsAesResolveCount")
        private Long monthHttpsAesResolveCount;

        @com.aliyun.core.annotation.NameInMap("MonthHttpsResolveCount")
        private Integer monthHttpsResolveCount;

        @com.aliyun.core.annotation.NameInMap("MonthResolveCount")
        private Integer monthResolveCount;

        @com.aliyun.core.annotation.NameInMap("PackageCount")
        private Integer packageCount;

        @com.aliyun.core.annotation.NameInMap("SignSecret")
        private String signSecret;

        @com.aliyun.core.annotation.NameInMap("SignedCount")
        private Long signedCount;

        @com.aliyun.core.annotation.NameInMap("UnsignedCount")
        private Long unsignedCount;

        @com.aliyun.core.annotation.NameInMap("UnsignedEnabled")
        private Boolean unsignedEnabled;

        @com.aliyun.core.annotation.NameInMap("UserStatus")
        private Integer userStatus;

        private AccountInfo(Builder builder) {
            this.accountId = builder.accountId;
            this.dohEnabled = builder.dohEnabled;
            this.dohResolveAllEnabled = builder.dohResolveAllEnabled;
            this.monthDohResolveCount = builder.monthDohResolveCount;
            this.monthFreeCount = builder.monthFreeCount;
            this.monthHttpAesResolveCount = builder.monthHttpAesResolveCount;
            this.monthHttpsAesResolveCount = builder.monthHttpsAesResolveCount;
            this.monthHttpsResolveCount = builder.monthHttpsResolveCount;
            this.monthResolveCount = builder.monthResolveCount;
            this.packageCount = builder.packageCount;
            this.signSecret = builder.signSecret;
            this.signedCount = builder.signedCount;
            this.unsignedCount = builder.unsignedCount;
            this.unsignedEnabled = builder.unsignedEnabled;
            this.userStatus = builder.userStatus;
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
         * @return dohEnabled
         */
        public Boolean getDohEnabled() {
            return this.dohEnabled;
        }

        /**
         * @return dohResolveAllEnabled
         */
        public Boolean getDohResolveAllEnabled() {
            return this.dohResolveAllEnabled;
        }

        /**
         * @return monthDohResolveCount
         */
        public Long getMonthDohResolveCount() {
            return this.monthDohResolveCount;
        }

        /**
         * @return monthFreeCount
         */
        public Integer getMonthFreeCount() {
            return this.monthFreeCount;
        }

        /**
         * @return monthHttpAesResolveCount
         */
        public Long getMonthHttpAesResolveCount() {
            return this.monthHttpAesResolveCount;
        }

        /**
         * @return monthHttpsAesResolveCount
         */
        public Long getMonthHttpsAesResolveCount() {
            return this.monthHttpsAesResolveCount;
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
         * @return packageCount
         */
        public Integer getPackageCount() {
            return this.packageCount;
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

        /**
         * @return userStatus
         */
        public Integer getUserStatus() {
            return this.userStatus;
        }

        public static final class Builder {
            private String accountId; 
            private Boolean dohEnabled; 
            private Boolean dohResolveAllEnabled; 
            private Long monthDohResolveCount; 
            private Integer monthFreeCount; 
            private Long monthHttpAesResolveCount; 
            private Long monthHttpsAesResolveCount; 
            private Integer monthHttpsResolveCount; 
            private Integer monthResolveCount; 
            private Integer packageCount; 
            private String signSecret; 
            private Long signedCount; 
            private Long unsignedCount; 
            private Boolean unsignedEnabled; 
            private Integer userStatus; 

            private Builder() {
            } 

            private Builder(AccountInfo model) {
                this.accountId = model.accountId;
                this.dohEnabled = model.dohEnabled;
                this.dohResolveAllEnabled = model.dohResolveAllEnabled;
                this.monthDohResolveCount = model.monthDohResolveCount;
                this.monthFreeCount = model.monthFreeCount;
                this.monthHttpAesResolveCount = model.monthHttpAesResolveCount;
                this.monthHttpsAesResolveCount = model.monthHttpsAesResolveCount;
                this.monthHttpsResolveCount = model.monthHttpsResolveCount;
                this.monthResolveCount = model.monthResolveCount;
                this.packageCount = model.packageCount;
                this.signSecret = model.signSecret;
                this.signedCount = model.signedCount;
                this.unsignedCount = model.unsignedCount;
                this.unsignedEnabled = model.unsignedEnabled;
                this.userStatus = model.userStatus;
            } 

            /**
             * AccountId.
             */
            public Builder accountId(String accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * DohEnabled.
             */
            public Builder dohEnabled(Boolean dohEnabled) {
                this.dohEnabled = dohEnabled;
                return this;
            }

            /**
             * DohResolveAllEnabled.
             */
            public Builder dohResolveAllEnabled(Boolean dohResolveAllEnabled) {
                this.dohResolveAllEnabled = dohResolveAllEnabled;
                return this;
            }

            /**
             * MonthDohResolveCount.
             */
            public Builder monthDohResolveCount(Long monthDohResolveCount) {
                this.monthDohResolveCount = monthDohResolveCount;
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
             * MonthHttpAesResolveCount.
             */
            public Builder monthHttpAesResolveCount(Long monthHttpAesResolveCount) {
                this.monthHttpAesResolveCount = monthHttpAesResolveCount;
                return this;
            }

            /**
             * MonthHttpsAesResolveCount.
             */
            public Builder monthHttpsAesResolveCount(Long monthHttpsAesResolveCount) {
                this.monthHttpsAesResolveCount = monthHttpsAesResolveCount;
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
             * PackageCount.
             */
            public Builder packageCount(Integer packageCount) {
                this.packageCount = packageCount;
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

            /**
             * UserStatus.
             */
            public Builder userStatus(Integer userStatus) {
                this.userStatus = userStatus;
                return this;
            }

            public AccountInfo build() {
                return new AccountInfo(this);
            } 

        } 

    }
}
