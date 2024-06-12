// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAggregatorRequest} extends {@link RequestModel}
 *
 * <p>CreateAggregatorRequest</p>
 */
public class CreateAggregatorRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AggregatorAccounts")
    private java.util.List < AggregatorAccounts> aggregatorAccounts;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AggregatorName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String aggregatorName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AggregatorType")
    private String aggregatorType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    @com.aliyun.core.annotation.Validation(required = true)
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FolderId")
    private String folderId;

    private CreateAggregatorRequest(Builder builder) {
        super(builder);
        this.aggregatorAccounts = builder.aggregatorAccounts;
        this.aggregatorName = builder.aggregatorName;
        this.aggregatorType = builder.aggregatorType;
        this.clientToken = builder.clientToken;
        this.description = builder.description;
        this.folderId = builder.folderId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAggregatorRequest create() {
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
     * @return aggregatorName
     */
    public String getAggregatorName() {
        return this.aggregatorName;
    }

    /**
     * @return aggregatorType
     */
    public String getAggregatorType() {
        return this.aggregatorType;
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

    /**
     * @return folderId
     */
    public String getFolderId() {
        return this.folderId;
    }

    public static final class Builder extends Request.Builder<CreateAggregatorRequest, Builder> {
        private java.util.List < AggregatorAccounts> aggregatorAccounts; 
        private String aggregatorName; 
        private String aggregatorType; 
        private String clientToken; 
        private String description; 
        private String folderId; 

        private Builder() {
            super();
        } 

        private Builder(CreateAggregatorRequest request) {
            super(request);
            this.aggregatorAccounts = request.aggregatorAccounts;
            this.aggregatorName = request.aggregatorName;
            this.aggregatorType = request.aggregatorType;
            this.clientToken = request.clientToken;
            this.description = request.description;
            this.folderId = request.folderId;
        } 

        /**
         * The information about the member accounts in the account group. Example:
         * <p>
         * 
         *     [{
         *     	"accountId": 171322098523****,
         *     	"accountType":"ResourceDirectory",
         *                     "accountName":"Alice"
         *     }, {
         *     	"accountId": 100532098349****,
         *     	"accountType":"ResourceDirectory",
         *                     "accountName":"Tom"
         *     }]
         * 
         * >  If `AggregatorType` is set to `RD` or `FOLDER`, this parameter can be left empty, which indicates that all accounts in the resource directory are added to the global account group.
         */
        public Builder aggregatorAccounts(java.util.List < AggregatorAccounts> aggregatorAccounts) {
            String aggregatorAccountsShrink = shrink(aggregatorAccounts, "AggregatorAccounts", "json");
            this.putBodyParameter("AggregatorAccounts", aggregatorAccountsShrink);
            this.aggregatorAccounts = aggregatorAccounts;
            return this;
        }

        /**
         * The name of the account group.
         */
        public Builder aggregatorName(String aggregatorName) {
            this.putBodyParameter("AggregatorName", aggregatorName);
            this.aggregatorName = aggregatorName;
            return this;
        }

        /**
         * The type of the account group. Valid values:
         * <p>
         * 
         * *   RD: global account group.
         * *   FOLDER: account group of the folder.
         * *   CUSTOM (default): custom account group.
         */
        public Builder aggregatorType(String aggregatorType) {
            this.putBodyParameter("AggregatorType", aggregatorType);
            this.aggregatorType = aggregatorType;
            return this;
        }

        /**
         * The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The `token` can contain only ASCII characters and cannot exceed 64 characters in length.
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The description of the account group.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The ID of the folder to which the account group is attached. You must specify this parameter if `AggregatorType` is set to `FOLDER`.
         */
        public Builder folderId(String folderId) {
            this.putBodyParameter("FolderId", folderId);
            this.folderId = folderId;
            return this;
        }

        @Override
        public CreateAggregatorRequest build() {
            return new CreateAggregatorRequest(this);
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
             * The member account ID. For more information about how to obtain the ID of a member account, see [ListAccounts](~~160016~~).
             */
            public Builder accountId(Long accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * The name of the member account. For more information about how to obtain the name of a member account, see [ListAccounts](~~160016~~).
             */
            public Builder accountName(String accountName) {
                this.accountName = accountName;
                return this;
            }

            /**
             * The type of the member account. Set this parameter to ResourceDirectory.
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
