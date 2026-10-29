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
         * <p>The current account information.</p>
         */
        public Builder accountInfo(AccountInfo accountInfo) {
            this.accountInfo = accountInfo;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>50F9C40E-188D-4208-BE2C-74271337****</p>
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
             * <p>The account ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1337****</p>
             */
            public Builder accountId(String accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * <p>Indicates whether the DNS over HTTPS (DoH) feature is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder dohEnabled(Boolean dohEnabled) {
                this.dohEnabled = dohEnabled;
                return this;
            }

            /**
             * <p>Indicates whether DoH is used to resolve all domain names.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder dohResolveAllEnabled(Boolean dohResolveAllEnabled) {
                this.dohResolveAllEnabled = dohResolveAllEnabled;
                return this;
            }

            /**
             * <p>The number of DoH resolutions for the current month.</p>
             * 
             * <strong>example:</strong>
             * <p>10000</p>
             */
            public Builder monthDohResolveCount(Long monthDohResolveCount) {
                this.monthDohResolveCount = monthDohResolveCount;
                return this;
            }

            /**
             * <p>The monthly free resolution quota. This is the number of times you can call the HTTPDNS service for domain name resolution free of charge each calendar month.</p>
             * 
             * <strong>example:</strong>
             * <p>1500000</p>
             */
            public Builder monthFreeCount(Integer monthFreeCount) {
                this.monthFreeCount = monthFreeCount;
                return this;
            }

            /**
             * <p>The number of HTTP AES-encrypted resolutions for the current month.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder monthHttpAesResolveCount(Long monthHttpAesResolveCount) {
                this.monthHttpAesResolveCount = monthHttpAesResolveCount;
                return this;
            }

            /**
             * <p>The number of HTTPS AES-encrypted resolutions for the current month.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder monthHttpsAesResolveCount(Long monthHttpsAesResolveCount) {
                this.monthHttpsAesResolveCount = monthHttpsAesResolveCount;
                return this;
            }

            /**
             * <p>The total number of HTTPS resolutions for the current month.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder monthHttpsResolveCount(Integer monthHttpsResolveCount) {
                this.monthHttpsResolveCount = monthHttpsResolveCount;
                return this;
            }

            /**
             * <p>The total number of HTTP resolutions for the current month.</p>
             * 
             * <strong>example:</strong>
             * <p>9927326</p>
             */
            public Builder monthResolveCount(Integer monthResolveCount) {
                this.monthResolveCount = monthResolveCount;
                return this;
            }

            /**
             * <p>The number of resource plans. This is a legacy field and is always set to 0.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder packageCount(Integer packageCount) {
                this.packageCount = packageCount;
                return this;
            }

            /**
             * <p>The signing secret.</p>
             * 
             * <strong>example:</strong>
             * <p>50F9C40E****</p>
             */
            public Builder signSecret(String signSecret) {
                this.signSecret = signSecret;
                return this;
            }

            /**
             * <p>The number of requests to authenticated API operations.</p>
             * 
             * <strong>example:</strong>
             * <p>611523</p>
             */
            public Builder signedCount(Long signedCount) {
                this.signedCount = signedCount;
                return this;
            }

            /**
             * <p>The number of requests to unauthenticated API operations.</p>
             * 
             * <strong>example:</strong>
             * <p>1523</p>
             */
            public Builder unsignedCount(Long unsignedCount) {
                this.unsignedCount = unsignedCount;
                return this;
            }

            /**
             * <p>Indicates whether unauthenticated API operations are enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder unsignedEnabled(Boolean unsignedEnabled) {
                this.unsignedEnabled = unsignedEnabled;
                return this;
            }

            /**
             * <p>The HTTPDNS account status code. Valid values:</p>
             * <ul>
             * <li>1: The account is normal.</li>
             * <li>2: The account has an overdue payment.</li>
             * <li>3: The account is suspended.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
