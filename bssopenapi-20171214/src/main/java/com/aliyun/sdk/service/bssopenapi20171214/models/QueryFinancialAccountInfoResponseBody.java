// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(QueryFinancialAccountInfoResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The status code.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The data returned.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The message returned.</p>
         * 
         * <strong>example:</strong>
         * <p>Successful!</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>97426BC2-792E-41F5-92B8-73C710DA7779</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryFinancialAccountInfoResponseBody build() {
            return new QueryFinancialAccountInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryFinancialAccountInfoResponseBody} extends {@link TeaModel}
     *
     * <p>QueryFinancialAccountInfoResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Data model) {
                this.accountType = model.accountType;
                this.isFinancialAccount = model.isFinancialAccount;
                this.memberGroupId = model.memberGroupId;
                this.memberGroupName = model.memberGroupName;
                this.memberNickName = model.memberNickName;
                this.userName = model.userName;
            } 

            /**
             * <p>The type of the financial account. A value of MASTER indicates that the account is a management account. A value of MEMBER indicates that the account is a member.</p>
             * 
             * <strong>example:</strong>
             * <p>MEMBER</p>
             */
            public Builder accountType(String accountType) {
                this.accountType = accountType;
                return this;
            }

            /**
             * <p>Indicates whether the account is a financial account. A value of true indicates that the account is a financial account. A value of false indicates that the account is not a financial account.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isFinancialAccount(Boolean isFinancialAccount) {
                this.isFinancialAccount = isFinancialAccount;
                return this;
            }

            /**
             * <p>The ID of the group to which the member belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>124</p>
             */
            public Builder memberGroupId(Long memberGroupId) {
                this.memberGroupId = memberGroupId;
                return this;
            }

            /**
             * <p>The name of the group to which the member belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>Test group</p>
             */
            public Builder memberGroupName(String memberGroupName) {
                this.memberGroupName = memberGroupName;
                return this;
            }

            /**
             * <p>The display name of the member.</p>
             * 
             * <strong>example:</strong>
             * <p>Test</p>
             */
            public Builder memberNickName(String memberNickName) {
                this.memberNickName = memberNickName;
                return this;
            }

            /**
             * <p>The username of the account.</p>
             * 
             * <strong>example:</strong>
             * <p>killortop3</p>
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
