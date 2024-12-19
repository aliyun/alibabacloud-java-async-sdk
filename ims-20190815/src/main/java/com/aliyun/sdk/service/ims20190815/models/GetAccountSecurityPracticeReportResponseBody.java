// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

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
 * {@link GetAccountSecurityPracticeReportResponseBody} extends {@link TeaModel}
 *
 * <p>GetAccountSecurityPracticeReportResponseBody</p>
 */
public class GetAccountSecurityPracticeReportResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccountSecurityPracticeInfo")
    private AccountSecurityPracticeInfo accountSecurityPracticeInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The information of the security report for the Alibaba Cloud account.</p>
         */
        public Builder accountSecurityPracticeInfo(AccountSecurityPracticeInfo accountSecurityPracticeInfo) {
            this.accountSecurityPracticeInfo = accountSecurityPracticeInfo;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>ABA822EE-85C2-4418-9577-A1831FC8466D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetAccountSecurityPracticeReportResponseBody build() {
            return new GetAccountSecurityPracticeReportResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAccountSecurityPracticeReportResponseBody} extends {@link TeaModel}
     *
     * <p>GetAccountSecurityPracticeReportResponseBody</p>
     */
    public static class AccountSecurityPracticeUserInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BindMfa")
        private Boolean bindMfa;

        @com.aliyun.core.annotation.NameInMap("OldAkNum")
        private Integer oldAkNum;

        @com.aliyun.core.annotation.NameInMap("RootWithAccessKey")
        private Integer rootWithAccessKey;

        @com.aliyun.core.annotation.NameInMap("SubUser")
        private Integer subUser;

        @com.aliyun.core.annotation.NameInMap("SubUserBindMfa")
        private Integer subUserBindMfa;

        @com.aliyun.core.annotation.NameInMap("SubUserPwdLevel")
        private String subUserPwdLevel;

        @com.aliyun.core.annotation.NameInMap("SubUserWithOldAccessKey")
        private Integer subUserWithOldAccessKey;

        @com.aliyun.core.annotation.NameInMap("SubUserWithUnusedAccessKey")
        private Integer subUserWithUnusedAccessKey;

        @com.aliyun.core.annotation.NameInMap("UnusedAkNum")
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
             * <p>Indicates whether MFA is enabled. Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder bindMfa(Boolean bindMfa) {
                this.bindMfa = bindMfa;
                return this;
            }

            /**
             * <p>The number of old AccessKey pairs for the Alibaba Cloud account.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder oldAkNum(Integer oldAkNum) {
                this.oldAkNum = oldAkNum;
                return this;
            }

            /**
             * <p>The number of AccessKey pairs for the Alibaba Cloud account.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder rootWithAccessKey(Integer rootWithAccessKey) {
                this.rootWithAccessKey = rootWithAccessKey;
                return this;
            }

            /**
             * <p>The number of RAM users within the Alibaba Cloud account.</p>
             * 
             * <strong>example:</strong>
             * <p>9</p>
             */
            public Builder subUser(Integer subUser) {
                this.subUser = subUser;
                return this;
            }

            /**
             * <p>The number of RAM users that have MFA devices bound.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder subUserBindMfa(Integer subUserBindMfa) {
                this.subUserBindMfa = subUserBindMfa;
                return this;
            }

            /**
             * <p>The complexity level of the password for the RAM user. Valid values:</p>
             * <ul>
             * <li>low</li>
             * <li>mid</li>
             * <li>high</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>low</p>
             */
            public Builder subUserPwdLevel(String subUserPwdLevel) {
                this.subUserPwdLevel = subUserPwdLevel;
                return this;
            }

            /**
             * <p>The number of RAM users that use the old AccessKey pairs.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder subUserWithOldAccessKey(Integer subUserWithOldAccessKey) {
                this.subUserWithOldAccessKey = subUserWithOldAccessKey;
                return this;
            }

            /**
             * <p>The number of RAM users that have no AccessKey pairs.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder subUserWithUnusedAccessKey(Integer subUserWithUnusedAccessKey) {
                this.subUserWithUnusedAccessKey = subUserWithUnusedAccessKey;
                return this;
            }

            /**
             * <p>The number of AccessKey pairs that are not used for the Alibaba Cloud account.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
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
    /**
     * 
     * {@link GetAccountSecurityPracticeReportResponseBody} extends {@link TeaModel}
     *
     * <p>GetAccountSecurityPracticeReportResponseBody</p>
     */
    public static class AccountSecurityPracticeInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountSecurityPracticeUserInfo")
        private AccountSecurityPracticeUserInfo accountSecurityPracticeUserInfo;

        @com.aliyun.core.annotation.NameInMap("Score")
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
             * <p>The information of the security report for the Alibaba Cloud account.</p>
             */
            public Builder accountSecurityPracticeUserInfo(AccountSecurityPracticeUserInfo accountSecurityPracticeUserInfo) {
                this.accountSecurityPracticeUserInfo = accountSecurityPracticeUserInfo;
                return this;
            }

            /**
             * <p>The security score of the Alibaba Cloud account.</p>
             * 
             * <strong>example:</strong>
             * <p>63</p>
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
