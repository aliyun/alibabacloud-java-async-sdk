// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link DescribeMonitorAccountsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMonitorAccountsResponseBody</p>
 */
public class DescribeMonitorAccountsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccountIdInfos")
    private java.util.List<AccountIdInfos> accountIdInfos;

    @com.aliyun.core.annotation.NameInMap("AccountIds")
    private java.util.List<String> accountIds;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeMonitorAccountsResponseBody(Builder builder) {
        this.accountIdInfos = builder.accountIdInfos;
        this.accountIds = builder.accountIds;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMonitorAccountsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountIdInfos
     */
    public java.util.List<AccountIdInfos> getAccountIdInfos() {
        return this.accountIdInfos;
    }

    /**
     * @return accountIds
     */
    public java.util.List<String> getAccountIds() {
        return this.accountIds;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<AccountIdInfos> accountIdInfos; 
        private java.util.List<String> accountIds; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeMonitorAccountsResponseBody model) {
            this.accountIdInfos = model.accountIdInfos;
            this.accountIds = model.accountIds;
            this.requestId = model.requestId;
        } 

        /**
         * AccountIdInfos.
         */
        public Builder accountIdInfos(java.util.List<AccountIdInfos> accountIdInfos) {
            this.accountIdInfos = accountIdInfos;
            return this;
        }

        /**
         * <p>The IDs of the members.</p>
         */
        public Builder accountIds(java.util.List<String> accountIds) {
            this.accountIds = accountIds;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>028CF634-5268-5660-9575-48C9ED6BF880</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeMonitorAccountsResponseBody build() {
            return new DescribeMonitorAccountsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeMonitorAccountsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMonitorAccountsResponseBody</p>
     */
    public static class AccountIdInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountId")
        private String accountId;

        @com.aliyun.core.annotation.NameInMap("AddTime")
        private Long addTime;

        @com.aliyun.core.annotation.NameInMap("IsCloudSiemAccount")
        private String isCloudSiemAccount;

        @com.aliyun.core.annotation.NameInMap("IsSasAccount")
        private String isSasAccount;

        @com.aliyun.core.annotation.NameInMap("OperatorUid")
        private String operatorUid;

        @com.aliyun.core.annotation.NameInMap("PostBasicService")
        private Integer postBasicService;

        @com.aliyun.core.annotation.NameInMap("SasVersion")
        private String sasVersion;

        @com.aliyun.core.annotation.NameInMap("aliUid")
        private String aliUid;

        @com.aliyun.core.annotation.NameInMap("isMarked")
        private String isMarked;

        private AccountIdInfos(Builder builder) {
            this.accountId = builder.accountId;
            this.addTime = builder.addTime;
            this.isCloudSiemAccount = builder.isCloudSiemAccount;
            this.isSasAccount = builder.isSasAccount;
            this.operatorUid = builder.operatorUid;
            this.postBasicService = builder.postBasicService;
            this.sasVersion = builder.sasVersion;
            this.aliUid = builder.aliUid;
            this.isMarked = builder.isMarked;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AccountIdInfos create() {
            return builder().build();
        }

        /**
         * @return accountId
         */
        public String getAccountId() {
            return this.accountId;
        }

        /**
         * @return addTime
         */
        public Long getAddTime() {
            return this.addTime;
        }

        /**
         * @return isCloudSiemAccount
         */
        public String getIsCloudSiemAccount() {
            return this.isCloudSiemAccount;
        }

        /**
         * @return isSasAccount
         */
        public String getIsSasAccount() {
            return this.isSasAccount;
        }

        /**
         * @return operatorUid
         */
        public String getOperatorUid() {
            return this.operatorUid;
        }

        /**
         * @return postBasicService
         */
        public Integer getPostBasicService() {
            return this.postBasicService;
        }

        /**
         * @return sasVersion
         */
        public String getSasVersion() {
            return this.sasVersion;
        }

        /**
         * @return aliUid
         */
        public String getAliUid() {
            return this.aliUid;
        }

        /**
         * @return isMarked
         */
        public String getIsMarked() {
            return this.isMarked;
        }

        public static final class Builder {
            private String accountId; 
            private Long addTime; 
            private String isCloudSiemAccount; 
            private String isSasAccount; 
            private String operatorUid; 
            private Integer postBasicService; 
            private String sasVersion; 
            private String aliUid; 
            private String isMarked; 

            private Builder() {
            } 

            private Builder(AccountIdInfos model) {
                this.accountId = model.accountId;
                this.addTime = model.addTime;
                this.isCloudSiemAccount = model.isCloudSiemAccount;
                this.isSasAccount = model.isSasAccount;
                this.operatorUid = model.operatorUid;
                this.postBasicService = model.postBasicService;
                this.sasVersion = model.sasVersion;
                this.aliUid = model.aliUid;
                this.isMarked = model.isMarked;
            } 

            /**
             * AccountId.
             */
            public Builder accountId(String accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * AddTime.
             */
            public Builder addTime(Long addTime) {
                this.addTime = addTime;
                return this;
            }

            /**
             * IsCloudSiemAccount.
             */
            public Builder isCloudSiemAccount(String isCloudSiemAccount) {
                this.isCloudSiemAccount = isCloudSiemAccount;
                return this;
            }

            /**
             * IsSasAccount.
             */
            public Builder isSasAccount(String isSasAccount) {
                this.isSasAccount = isSasAccount;
                return this;
            }

            /**
             * OperatorUid.
             */
            public Builder operatorUid(String operatorUid) {
                this.operatorUid = operatorUid;
                return this;
            }

            /**
             * PostBasicService.
             */
            public Builder postBasicService(Integer postBasicService) {
                this.postBasicService = postBasicService;
                return this;
            }

            /**
             * SasVersion.
             */
            public Builder sasVersion(String sasVersion) {
                this.sasVersion = sasVersion;
                return this;
            }

            /**
             * aliUid.
             */
            public Builder aliUid(String aliUid) {
                this.aliUid = aliUid;
                return this;
            }

            /**
             * isMarked.
             */
            public Builder isMarked(String isMarked) {
                this.isMarked = isMarked;
                return this;
            }

            public AccountIdInfos build() {
                return new AccountIdInfos(this);
            } 

        } 

    }
}
