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
         * <p>List of member account information.</p>
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

        @com.aliyun.core.annotation.NameInMap("OperatorUid")
        private String operatorUid;

        @com.aliyun.core.annotation.NameInMap("PostBasicService")
        private Integer postBasicService;

        @com.aliyun.core.annotation.NameInMap("SasVersion")
        private String sasVersion;

        private AccountIdInfos(Builder builder) {
            this.accountId = builder.accountId;
            this.addTime = builder.addTime;
            this.operatorUid = builder.operatorUid;
            this.postBasicService = builder.postBasicService;
            this.sasVersion = builder.sasVersion;
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

        public static final class Builder {
            private String accountId; 
            private Long addTime; 
            private String operatorUid; 
            private Integer postBasicService; 
            private String sasVersion; 

            private Builder() {
            } 

            private Builder(AccountIdInfos model) {
                this.accountId = model.accountId;
                this.addTime = model.addTime;
                this.operatorUid = model.operatorUid;
                this.postBasicService = model.postBasicService;
                this.sasVersion = model.sasVersion;
            } 

            /**
             * <p>The Alibaba Cloud account ID of the member.</p>
             * 
             * <strong>example:</strong>
             * <p>119593010538****</p>
             */
            public Builder accountId(String accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * <p>The time when it was added to the control list, in timestamp format with second precision.</p>
             * 
             * <strong>example:</strong>
             * <p>1760520684000</p>
             */
            public Builder addTime(Long addTime) {
                this.addTime = addTime;
                return this;
            }

            /**
             * <p>The account ID of the operator.</p>
             * 
             * <strong>example:</strong>
             * <p>106635707417****</p>
             */
            public Builder operatorUid(String operatorUid) {
                this.operatorUid = operatorUid;
                return this;
            }

            /**
             * <p>Basic service switch. Values: </p>
             * <ul>
             * <li><strong>0</strong>: Off </li>
             * <li><strong>1</strong>: On</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder postBasicService(Integer postBasicService) {
                this.postBasicService = postBasicService;
                return this;
            }

            /**
             * <p>The purchased version of Cloud Security Center. Values:</p>
             * <ul>
             * <li><strong>0</strong> or <strong>1</strong>: Free Edition </li>
             * <li><strong>2</strong> or <strong>3</strong>: Enterprise Edition</li>
             * <li><strong>5</strong>: Advanced Edition </li>
             * <li><strong>6</strong>: Anti-Virus Edition </li>
             * <li><strong>7</strong>: Flagship Edition</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>7</p>
             */
            public Builder sasVersion(String sasVersion) {
                this.sasVersion = sasVersion;
                return this;
            }

            public AccountIdInfos build() {
                return new AccountIdInfos(this);
            } 

        } 

    }
}
