// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryFinancialAccountInfoResponseBody} extends {@link TeaModel}
 *
 * <p>QueryFinancialAccountInfoResponseBody</p>
 */
public class QueryFinancialAccountInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QueryFinancialAccountInfoResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryFinancialAccountInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * The status code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The data returned.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The message returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryFinancialAccountInfoResponseBody build() {
            return new QueryFinancialAccountInfoResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountType")
        private String accountType;

        @com.aliyun.core.annotation.NameInMap("IsFinancialAccount")
        private Boolean isFinancialAccount;

        @com.aliyun.core.annotation.NameInMap("MemberGroupId")
        private Long memberGroupId;

        @com.aliyun.core.annotation.NameInMap("MemberGroupName")
        private String memberGroupName;

        @com.aliyun.core.annotation.NameInMap("MemberNickName")
        private String memberNickName;

        @com.aliyun.core.annotation.NameInMap("UserName")
        private String userName;

        private Data(Builder builder) {
            this.accountType = builder.accountType;
            this.isFinancialAccount = builder.isFinancialAccount;
            this.memberGroupId = builder.memberGroupId;
            this.memberGroupName = builder.memberGroupName;
            this.memberNickName = builder.memberNickName;
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return accountType
         */
        public String getAccountType() {
            return this.accountType;
        }

        /**
         * @return isFinancialAccount
         */
        public Boolean getIsFinancialAccount() {
            return this.isFinancialAccount;
        }

        /**
         * @return memberGroupId
         */
        public Long getMemberGroupId() {
            return this.memberGroupId;
        }

        /**
         * @return memberGroupName
         */
        public String getMemberGroupName() {
            return this.memberGroupName;
        }

        /**
         * @return memberNickName
         */
        public String getMemberNickName() {
            return this.memberNickName;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        public static final class Builder {
            private String accountType; 
            private Boolean isFinancialAccount; 
            private Long memberGroupId; 
            private String memberGroupName; 
            private String memberNickName; 
            private String userName; 

            /**
             * The type of the financial account. A value of MASTER indicates that the account is a management account. A value of MEMBER indicates that the account is a member.
             */
            public Builder accountType(String accountType) {
                this.accountType = accountType;
                return this;
            }

            /**
             * Indicates whether the account is a financial account. A value of true indicates that the account is a financial account. A value of false indicates that the account is not a financial account.
             */
            public Builder isFinancialAccount(Boolean isFinancialAccount) {
                this.isFinancialAccount = isFinancialAccount;
                return this;
            }

            /**
             * The ID of the group to which the member belongs.
             */
            public Builder memberGroupId(Long memberGroupId) {
                this.memberGroupId = memberGroupId;
                return this;
            }

            /**
             * The name of the group to which the member belongs.
             */
            public Builder memberGroupName(String memberGroupName) {
                this.memberGroupName = memberGroupName;
                return this;
            }

            /**
             * The display name of the member.
             */
            public Builder memberNickName(String memberNickName) {
                this.memberNickName = memberNickName;
                return this;
            }

            /**
             * The username of the account.
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
