// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link ModifyForwardStrategyBindingItemsRequest} extends {@link RequestModel}
 *
 * <p>ModifyForwardStrategyBindingItemsRequest</p>
 */
public class ModifyForwardStrategyBindingItemsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ForwardId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String forwardId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ItemIds")
    private java.util.List<String> itemIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MatchMode")
    private String matchMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModifyType")
    private String modifyType;

    private ModifyForwardStrategyBindingItemsRequest(Builder builder) {
        super(builder);
        this.forwardId = builder.forwardId;
        this.itemIds = builder.itemIds;
        this.matchMode = builder.matchMode;
        this.modifyType = builder.modifyType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyForwardStrategyBindingItemsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return forwardId
     */
    public String getForwardId() {
        return this.forwardId;
    }

    /**
     * @return itemIds
     */
    public java.util.List<String> getItemIds() {
        return this.itemIds;
    }

    /**
     * @return matchMode
     */
    public String getMatchMode() {
        return this.matchMode;
    }

    /**
     * @return modifyType
     */
    public String getModifyType() {
        return this.modifyType;
    }

    public static final class Builder extends Request.Builder<ModifyForwardStrategyBindingItemsRequest, Builder> {
        private String forwardId; 
        private java.util.List<String> itemIds; 
        private String matchMode; 
        private String modifyType; 

        private Builder() {
            super();
        } 

        private Builder(ModifyForwardStrategyBindingItemsRequest request) {
            super(request);
            this.forwardId = request.forwardId;
            this.itemIds = request.itemIds;
            this.matchMode = request.matchMode;
            this.modifyType = request.modifyType;
        } 

        /**
         * <p>The forwarding rule ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>fs-849ac29396d9ea98</p>
         */
        public Builder forwardId(String forwardId) {
            this.putBodyParameter("ForwardId", forwardId);
            this.forwardId = forwardId;
            return this;
        }

        /**
         * <p>The list of binding item IDs. Must be empty when MatchMode is <strong>UserGroupAll</strong> or <strong>ApplicationAll</strong>. Required for other values. Duplicates are not allowed in the list, and the specified objects must already exist.</p>
         */
        public Builder itemIds(java.util.List<String> itemIds) {
            this.putQueryParameter("ItemIds", itemIds);
            this.itemIds = itemIds;
            return this;
        }

        /**
         * <p>The policy matching target type. Required. Valid values:</p>
         * <ul>
         * <li><strong>UserGroupAll</strong>: associates with all users.</li>
         * <li><strong>UserGroupNormal</strong>: associates with specific user groups.</li>
         * <li><strong>ApplicationAll</strong>: all private network applications.</li>
         * <li><strong>Application</strong>: specific private network applications.</li>
         * <li><strong>Tag</strong>: private network application tags.</li>
         * </ul>
         * <p>When the value is <strong>UserGroupAll</strong> or <strong>ApplicationAll</strong>, ItemIds must be empty. When the value is <strong>UserGroupNormal</strong>, <strong>Application</strong>, or <strong>Tag</strong>, ItemIds is required.</p>
         * <p>When ModifyType is not <strong>Cover</strong>, switching the matching target type is not allowed: <strong>Application</strong>, <strong>Tag</strong>, and <strong>ApplicationAll</strong> are mutually exclusive, and <strong>UserGroupNormal</strong> and <strong>UserGroupAll</strong> are mutually exclusive. If a binding item of a mutually exclusive type already exists on the same forwarding rule, the request is rejected.</p>
         * 
         * <strong>example:</strong>
         * <p>Application</p>
         */
        public Builder matchMode(String matchMode) {
            this.putQueryParameter("MatchMode", matchMode);
            this.matchMode = matchMode;
            return this;
        }

        /**
         * <p>The modification method. Required. Valid values:</p>
         * <ul>
         * <li><strong>Append</strong>: appends to existing binding items. ItemIds cannot contain objects that are already bound.</li>
         * <li><strong>Delete</strong>: deletes specified binding items. All objects in ItemIds must be already bound.</li>
         * <li><strong>Cover</strong>: overwrites binding items of the same category by clearing all existing binding items of the same category on the forwarding rule and then writing ItemIds. The same category refers to <strong>ApplicationAll</strong>, <strong>Application</strong>, and <strong>Tag</strong>, or <strong>UserGroupAll</strong> and <strong>UserGroupNormal</strong>.</li>
         * </ul>
         * <p>When the value is <strong>Append</strong> or <strong>Delete</strong>, MatchMode cannot be <strong>UserGroupAll</strong> or <strong>ApplicationAll</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>Cover</p>
         */
        public Builder modifyType(String modifyType) {
            this.putQueryParameter("ModifyType", modifyType);
            this.modifyType = modifyType;
            return this;
        }

        @Override
        public ModifyForwardStrategyBindingItemsRequest build() {
            return new ModifyForwardStrategyBindingItemsRequest(this);
        } 

    } 

}
