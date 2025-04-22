// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

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
 * {@link UpdateAggregatorRequest} extends {@link RequestModel}
 *
 * <p>UpdateAggregatorRequest</p>
 */
public class UpdateAggregatorRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AggregatorAccounts")
    private java.util.List<AggregatorAccounts> aggregatorAccounts;

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

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FolderId")
    private String folderId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    private UpdateAggregatorRequest(Builder builder) {
        super(builder);
        this.aggregatorAccounts = builder.aggregatorAccounts;
        this.aggregatorId = builder.aggregatorId;
        this.aggregatorName = builder.aggregatorName;
        this.clientToken = builder.clientToken;
        this.description = builder.description;
        this.folderId = builder.folderId;
        this.tag = builder.tag;
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
    public java.util.List<AggregatorAccounts> getAggregatorAccounts() {
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

    /**
     * @return folderId
     */
    public String getFolderId() {
        return this.folderId;
    }

    /**
     * @return tag
     */
    public java.util.List<Tag> getTag() {
        return this.tag;
    }

    public static final class Builder extends Request.Builder<UpdateAggregatorRequest, Builder> {
        private java.util.List<AggregatorAccounts> aggregatorAccounts; 
        private String aggregatorId; 
        private String aggregatorName; 
        private String clientToken; 
        private String description; 
        private String folderId; 
        private java.util.List<Tag> tag; 

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
            this.folderId = request.folderId;
            this.tag = request.tag;
        } 

        /**
         * <p>The members in the account group.</p>
         * <blockquote>
         * <p> When you modify the configurations of an account group, this parameter can be left empty. In this case, the member list is not updated. If you want to update the member list, you must configure both the <code>AccountId</code> and <code>AccountType</code> parameters.</p>
         * </blockquote>
         */
        public Builder aggregatorAccounts(java.util.List<AggregatorAccounts> aggregatorAccounts) {
            String aggregatorAccountsShrink = shrink(aggregatorAccounts, "AggregatorAccounts", "json");
            this.putBodyParameter("AggregatorAccounts", aggregatorAccountsShrink);
            this.aggregatorAccounts = aggregatorAccounts;
            return this;
        }

        /**
         * <p>The ID of the account group.</p>
         * <p>For more information about how to obtain the ID of an account group, see <a href="https://help.aliyun.com/document_detail/255797.html">ListAggregators</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ca-dacf86d8314e00eb****</p>
         */
        public Builder aggregatorId(String aggregatorId) {
            this.putBodyParameter("AggregatorId", aggregatorId);
            this.aggregatorId = aggregatorId;
            return this;
        }

        /**
         * <p>The name of the account group.</p>
         * <p>For more information about how to obtain the name of an account group, see <a href="https://help.aliyun.com/document_detail/255797.html">ListAggregators</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>Test_Group</p>
         */
        public Builder aggregatorName(String aggregatorName) {
            this.putBodyParameter("AggregatorName", aggregatorName);
            this.aggregatorName = aggregatorName;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must ensure that it is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>1594295238-f9361358-5843-4294-8d30-b5183fac****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The description of the account group.</p>
         * <p>For more information about how to obtain the description of an account group, see <a href="https://help.aliyun.com/document_detail/255797.html">ListAggregators</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>Test_Aggregator_Description</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The folder ID. Separate multiple folder IDs with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>fd-brHdgv****,fd-brHdgk****</p>
         */
        public Builder folderId(String folderId) {
            this.putBodyParameter("FolderId", folderId);
            this.folderId = folderId;
            return this;
        }

        /**
         * <p>The tags of the resource.</p>
         * <p>You can add up to 20 tags to a resource.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            String tagShrink = shrink(tag, "Tag", "json");
            this.putQueryParameter("Tag", tagShrink);
            this.tag = tag;
            return this;
        }

        @Override
        public UpdateAggregatorRequest build() {
            return new UpdateAggregatorRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateAggregatorRequest} extends {@link TeaModel}
     *
     * <p>UpdateAggregatorRequest</p>
     */
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

            private Builder() {
            } 

            private Builder(AggregatorAccounts model) {
                this.accountId = model.accountId;
                this.accountName = model.accountName;
                this.accountType = model.accountType;
            } 

            /**
             * <p>The ID of the member.</p>
             * <p>For more information about how to obtain the ID of a member, see <a href="https://help.aliyun.com/document_detail/160016.html">ListAccounts</a>.</p>
             * <blockquote>
             * <p> If you want to update the member list, you must configure both the <code>AccountId</code> and <code>AccountType</code> parameters.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>173808452267****</p>
             */
            public Builder accountId(Long accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * <p>The display name of the member.</p>
             * <p>For more information about how to obtain the name of a member, see <a href="https://help.aliyun.com/document_detail/160016.html">ListAccounts</a>.</p>
             * <blockquote>
             * <p> If you want to update the member list, you must configure both the <code>AccountId</code> and <code>AccountType</code> parameters.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>Tony</p>
             */
            public Builder accountName(String accountName) {
                this.accountName = accountName;
                return this;
            }

            /**
             * <p>The resource directory to which the member belongs. Valid value: ResourceDirectory. ResourceDirectory indicates that the member belongs to a resource directory.</p>
             * <blockquote>
             * <p> If you want to update the member list, you must configure both the <code>AccountId</code> and <code>AccountType</code> parameters.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>ResourceDirectory</p>
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
    /**
     * 
     * {@link UpdateAggregatorRequest} extends {@link TeaModel}
     *
     * <p>UpdateAggregatorRequest</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(Tag model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag key of the resource. You can specify up to 20 tag keys.</p>
             * <p>The tag key cannot be an empty string. The tag key must be 1 to 64 characters in length and cannot start with <code>aliyun</code> or <code>acs</code>:. The tag key cannot contain <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>key-1</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag values.</p>
             * <p>The tag values can be an empty string or up to 128 characters in length. The tag values cannot start with <code>aliyun</code> or <code>acs:</code> and cannot contain <code>http://</code> or <code>https://</code>.</p>
             * <p>Each key-value must be unique. You can specify at most 20 tag values in each call.</p>
             * 
             * <strong>example:</strong>
             * <p>value-1</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
}
