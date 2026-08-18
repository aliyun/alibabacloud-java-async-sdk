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
 * {@link BatchDeleteDomainItemsRequest} extends {@link RequestModel}
 *
 * <p>BatchDeleteDomainItemsRequest</p>
 */
public class BatchDeleteDomainItemsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ItemIds")
    private java.util.List<Long> itemIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ListId")
    private String listId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ListType")
    private String listType;

    private BatchDeleteDomainItemsRequest(Builder builder) {
        super(builder);
        this.itemIds = builder.itemIds;
        this.listId = builder.listId;
        this.listType = builder.listType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchDeleteDomainItemsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return itemIds
     */
    public java.util.List<Long> getItemIds() {
        return this.itemIds;
    }

    /**
     * @return listId
     */
    public String getListId() {
        return this.listId;
    }

    /**
     * @return listType
     */
    public String getListType() {
        return this.listType;
    }

    public static final class Builder extends Request.Builder<BatchDeleteDomainItemsRequest, Builder> {
        private java.util.List<Long> itemIds; 
        private String listId; 
        private String listType; 

        private Builder() {
            super();
        } 

        private Builder(BatchDeleteDomainItemsRequest request) {
            super(request);
            this.itemIds = request.itemIds;
            this.listId = request.listId;
            this.listType = request.listType;
        } 

        /**
         * ItemIds.
         */
        public Builder itemIds(java.util.List<Long> itemIds) {
            this.putBodyParameter("ItemIds", itemIds);
            this.itemIds = itemIds;
            return this;
        }

        /**
         * ListId.
         */
        public Builder listId(String listId) {
            this.putBodyParameter("ListId", listId);
            this.listId = listId;
            return this;
        }

        /**
         * ListType.
         */
        public Builder listType(String listType) {
            this.putBodyParameter("ListType", listType);
            this.listType = listType;
            return this;
        }

        @Override
        public BatchDeleteDomainItemsRequest build() {
            return new BatchDeleteDomainItemsRequest(this);
        } 

    } 

}
