// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateAggregatorRequest} extends {@link RequestModel}
 *
 * <p>UpdateAggregatorRequest</p>
 */
public class UpdateAggregatorRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AggregatorAccounts")
    private java.util.List < AggregatorAccounts> aggregatorAccounts;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AggregatorId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String aggregatorId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AggregatorName")
    private String aggregatorName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    private UpdateAggregatorRequest(Builder builder) {
        super(builder);
        this.aggregatorAccounts = builder.aggregatorAccounts;
        this.aggregatorId = builder.aggregatorId;
        this.aggregatorName = builder.aggregatorName;
        this.clientToken = builder.clientToken;
        this.description = builder.description;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAggregatorRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aggregatorAccounts
     */
    public java.util.List < AggregatorAccounts> getAggregatorAccounts() {
        return this.aggregatorAccounts;
    }

    /**
     * @return aggregatorId
     */
    public String getAggregatorId() {
        return this.aggregatorId;
    }

    /**
     * @return aggregatorName
     */
    public String getAggregatorName() {
        return this.aggregatorName;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    public static final class Builder extends Request.Builder<UpdateAggregatorRequest, Builder> {
        private java.util.List < AggregatorAccounts> aggregatorAccounts; 
        private String aggregatorId; 
        private String aggregatorName; 
        private String clientToken; 
        private String description; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAggregatorRequest request) {
            super(request);
            this.aggregatorAccounts = request.aggregatorAccounts;
            this.aggregatorId = request.aggregatorId;
            this.aggregatorName = request.aggregatorName;
            this.clientToken = request.clientToken;
            this.description = request.description;
        } 

        /**
         * The information about the member accounts in the account group.
         * <p>
         * 
         * >  When you modify the configurations of an account group, this parameter can be left empty. In this case, the member account list is not updated. If you want to update the member account list, you must set the `AccountId`, `AccountName` and `AccountType` parameters.
         */
        public Builder aggregatorAccounts(java.util.List < AggregatorAccounts> aggregatorAccounts) {
            String aggregatorAccountsShrink = shrink(aggregatorAccounts, "AggregatorAccounts", "json");
            this.putBodyParameter("AggregatorAccounts", aggregatorAccountsShrink);
            this.aggregatorAccounts = aggregatorAccounts;
            return this;
        }

        /**
         * The ID of the account group.
         * <p>
         * 
         * For more information about how to obtain the ID of an account group, see [ListAggregators](~~255797~~).
         */
        public Builder aggregatorId(String aggregatorId) {
            this.putBodyParameter("AggregatorId", aggregatorId);
            this.aggregatorId = aggregatorId;
            return this;
        }

        /**
         * The name of the account group.
         * <p>
         * 
         * For more information about how to obtain the name of an account group, see [ListAggregators](~~255797~~).
         */
        public Builder aggregatorName(String aggregatorName) {
            this.putBodyParameter("AggregatorName", aggregatorName);
            this.aggregatorName = aggregatorName;
            return this;
        }

        /**
         * The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must ensure that it is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The description of the account group.
         * <p>
         * 
         * For more information about how to obtain the description of an account group, see [ListAggregators](~~255797~~).
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        @Override
        public UpdateAggregatorRequest build() {
            return new UpdateAggregatorRequest(this);
        } 

    } 

    public static class AggregatorAccounts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountId")
        private Long accountId;

        @com.aliyun.core.annotation.NameInMap("AccountName")
        private String accountName;

        @com.aliyun.core.annotation.NameInMap("AccountType")
        private String accountType;

        private AggregatorAccounts(Builder builder) {
            this.accountId = builder.accountId;
            this.accountName = builder.accountName;
            this.accountType = builder.accountType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AggregatorAccounts create() {
            return builder().build();
        }

        /**
         * @return accountId
         */
        public Long getAccountId() {
            return this.accountId;
        }

        /**
         * @return accountName
         */
        public String getAccountName() {
            return this.accountName;
        }

        /**
         * @return accountType
         */
        public String getAccountType() {
            return this.accountType;
        }

        public static final class Builder {
            private Long accountId; 
            private String accountName; 
            private String accountType; 

            /**
             * The member account ID, which indicates the Alibaba Cloud account ID of the member account.
             * <p>
             * 
             * For more information about how to obtain the ID of a member account, see [ListAccounts](~~160016~~).
             * 
             * >  If you want to update the member account list, you must set the `AccountId`, `AccountName` and `AccountType` parameters.
             */
            public Builder accountId(Long accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * The member account name, which indicates the name of the Alibaba Cloud account that corresponds to the member account.
             * <p>
             * 
             * For more information about how to obtain the name of a member account, see [ListAccounts](~~160016~~).
             * 
             * >  If you want to update the member account list, you must set the `AccountId`, `AccountName` and `AccountType` parameters.
             */
            public Builder accountName(String accountName) {
                this.accountName = accountName;
                return this;
            }

            /**
             * The affiliation of the member account. You can set this parameter to only ResourceDirectory.
             * <p>
             * 
             * >  If you want to update the member account list, you must set the `AccountId`, `AccountName` and `AccountType` parameters.
             */
            public Builder accountType(String accountType) {
                this.accountType = accountType;
                return this;
            }

            public AggregatorAccounts build() {
                return new AggregatorAccounts(this);
            } 

        } 

    }
}
