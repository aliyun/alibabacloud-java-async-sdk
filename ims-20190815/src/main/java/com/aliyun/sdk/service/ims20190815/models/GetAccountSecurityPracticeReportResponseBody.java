// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAccountSecurityPracticeReportResponseBody} extends {@link TeaModel}
 *
 * <p>GetAccountSecurityPracticeReportResponseBody</p>
 */
public class GetAccountSecurityPracticeReportResponseBody extends TeaModel {
    @NameInMap("AccountSecurityPracticeInfo")
    private AccountSecurityPracticeInfo accountSecurityPracticeInfo;

    @NameInMap("RequestId")
    private String requestId;

    private GetAccountSecurityPracticeReportResponseBody(Builder builder) {
        this.accountSecurityPracticeInfo = builder.accountSecurityPracticeInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAccountSecurityPracticeReportResponseBody create() {
        return builder().build();
    }

    /**
     * @return accountSecurityPracticeInfo
     */
    public AccountSecurityPracticeInfo getAccountSecurityPracticeInfo() {
        return this.accountSecurityPracticeInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private AccountSecurityPracticeInfo accountSecurityPracticeInfo; 
        private String requestId; 

        /**
         * The information of the security report for the Alibaba Cloud account.
         */
        public Builder accountSecurityPracticeInfo(AccountSecurityPracticeInfo accountSecurityPracticeInfo) {
            this.accountSecurityPracticeInfo = accountSecurityPracticeInfo;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetAccountSecurityPracticeReportResponseBody build() {
            return new GetAccountSecurityPracticeReportResponseBody(this);
        } 

    } 

    public static class AccountSecurityPracticeUserInfo extends TeaModel {
        @NameInMap("BindMfa")
        private Boolean bindMfa;

        @NameInMap("OldAkNum")
        private Integer oldAkNum;

        @NameInMap("RootWithAccessKey")
        private Integer rootWithAccessKey;

        @NameInMap("SubUser")
        private Integer subUser;

        @NameInMap("SubUserBindMfa")
        private Integer subUserBindMfa;

        @NameInMap("SubUserPwdLevel")
        private String subUserPwdLevel;

        @NameInMap("SubUserWithOldAccessKey")
        private Integer subUserWithOldAccessKey;

        @NameInMap("SubUserWithUnusedAccessKey")
        private Integer subUserWithUnusedAccessKey;

        @NameInMap("UnusedAkNum")
        private Integer unusedAkNum;

        private AccountSecurityPracticeUserInfo(Builder builder) {
            this.bindMfa = builder.bindMfa;
            this.oldAkNum = builder.oldAkNum;
            this.rootWithAccessKey = builder.rootWithAccessKey;
            this.subUser = builder.subUser;
            this.subUserBindMfa = builder.subUserBindMfa;
            this.subUserPwdLevel = builder.subUserPwdLevel;
            this.subUserWithOldAccessKey = builder.subUserWithOldAccessKey;
            this.subUserWithUnusedAccessKey = builder.subUserWithUnusedAccessKey;
            this.unusedAkNum = builder.unusedAkNum;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AccountSecurityPracticeUserInfo create() {
            return builder().build();
        }

        /**
         * @return bindMfa
         */
        public Boolean getBindMfa() {
            return this.bindMfa;
        }

        /**
         * @return oldAkNum
         */
        public Integer getOldAkNum() {
            return this.oldAkNum;
        }

        /**
         * @return rootWithAccessKey
         */
        public Integer getRootWithAccessKey() {
            return this.rootWithAccessKey;
        }

        /**
         * @return subUser
         */
        public Integer getSubUser() {
            return this.subUser;
        }

        /**
         * @return subUserBindMfa
         */
        public Integer getSubUserBindMfa() {
            return this.subUserBindMfa;
        }

        /**
         * @return subUserPwdLevel
         */
        public String getSubUserPwdLevel() {
            return this.subUserPwdLevel;
        }

        /**
         * @return subUserWithOldAccessKey
         */
        public Integer getSubUserWithOldAccessKey() {
            return this.subUserWithOldAccessKey;
        }

        /**
         * @return subUserWithUnusedAccessKey
         */
        public Integer getSubUserWithUnusedAccessKey() {
            return this.subUserWithUnusedAccessKey;
        }

        /**
         * @return unusedAkNum
         */
        public Integer getUnusedAkNum() {
            return this.unusedAkNum;
        }

        public static final class Builder {
            private Boolean bindMfa; 
            private Integer oldAkNum; 
            private Integer rootWithAccessKey; 
            private Integer subUser; 
            private Integer subUserBindMfa; 
            private String subUserPwdLevel; 
            private Integer subUserWithOldAccessKey; 
            private Integer subUserWithUnusedAccessKey; 
            private Integer unusedAkNum; 

            /**
             * Indicates whether MFA is enabled. Valid values:
             * <p>
             * 
             * *   true
             * *   false
             */
            public Builder bindMfa(Boolean bindMfa) {
                this.bindMfa = bindMfa;
                return this;
            }

            /**
             * The number of old AccessKey pairs for the Alibaba Cloud account.
             */
            public Builder oldAkNum(Integer oldAkNum) {
                this.oldAkNum = oldAkNum;
                return this;
            }

            /**
             * The number of AccessKey pairs for the Alibaba Cloud account.
             */
            public Builder rootWithAccessKey(Integer rootWithAccessKey) {
                this.rootWithAccessKey = rootWithAccessKey;
                return this;
            }

            /**
             * The number of RAM users within the Alibaba Cloud account.
             */
            public Builder subUser(Integer subUser) {
                this.subUser = subUser;
                return this;
            }

            /**
             * The number of RAM users that have MFA devices bound.
             */
            public Builder subUserBindMfa(Integer subUserBindMfa) {
                this.subUserBindMfa = subUserBindMfa;
                return this;
            }

            /**
             * The complexity level of the password for the RAM user. Valid values:
             * <p>
             * 
             * *   low
             * *   mid
             * *   high
             */
            public Builder subUserPwdLevel(String subUserPwdLevel) {
                this.subUserPwdLevel = subUserPwdLevel;
                return this;
            }

            /**
             * The number of RAM users that use the old AccessKey pairs.
             */
            public Builder subUserWithOldAccessKey(Integer subUserWithOldAccessKey) {
                this.subUserWithOldAccessKey = subUserWithOldAccessKey;
                return this;
            }

            /**
             * The number of RAM users that have no AccessKey pairs.
             */
            public Builder subUserWithUnusedAccessKey(Integer subUserWithUnusedAccessKey) {
                this.subUserWithUnusedAccessKey = subUserWithUnusedAccessKey;
                return this;
            }

            /**
             * The number of AccessKey pairs that are not used for the Alibaba Cloud account.
             */
            public Builder unusedAkNum(Integer unusedAkNum) {
                this.unusedAkNum = unusedAkNum;
                return this;
            }

            public AccountSecurityPracticeUserInfo build() {
                return new AccountSecurityPracticeUserInfo(this);
            } 

        } 

    }
    public static class AccountSecurityPracticeInfo extends TeaModel {
        @NameInMap("AccountSecurityPracticeUserInfo")
        private AccountSecurityPracticeUserInfo accountSecurityPracticeUserInfo;

        @NameInMap("Score")
        private Integer score;

        private AccountSecurityPracticeInfo(Builder builder) {
            this.accountSecurityPracticeUserInfo = builder.accountSecurityPracticeUserInfo;
            this.score = builder.score;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AccountSecurityPracticeInfo create() {
            return builder().build();
        }

        /**
         * @return accountSecurityPracticeUserInfo
         */
        public AccountSecurityPracticeUserInfo getAccountSecurityPracticeUserInfo() {
            return this.accountSecurityPracticeUserInfo;
        }

        /**
         * @return score
         */
        public Integer getScore() {
            return this.score;
        }

        public static final class Builder {
            private AccountSecurityPracticeUserInfo accountSecurityPracticeUserInfo; 
            private Integer score; 

            /**
             * The information of the security report for the Alibaba Cloud account.
             */
            public Builder accountSecurityPracticeUserInfo(AccountSecurityPracticeUserInfo accountSecurityPracticeUserInfo) {
                this.accountSecurityPracticeUserInfo = accountSecurityPracticeUserInfo;
                return this;
            }

            /**
             * The security score of the Alibaba Cloud account.
             */
            public Builder score(Integer score) {
                this.score = score;
                return this;
            }

            public AccountSecurityPracticeInfo build() {
                return new AccountSecurityPracticeInfo(this);
            } 

        } 

    }
}
