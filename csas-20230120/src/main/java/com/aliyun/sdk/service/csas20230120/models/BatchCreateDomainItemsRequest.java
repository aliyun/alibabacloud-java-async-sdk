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
 * {@link BatchCreateDomainItemsRequest} extends {@link RequestModel}
 *
 * <p>BatchCreateDomainItemsRequest</p>
 */
public class BatchCreateDomainItemsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DomainItems")
    private java.util.List<String> domainItems;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ListId")
    private String listId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ListType")
    private String listType;

    private BatchCreateDomainItemsRequest(Builder builder) {
        super(builder);
        this.domainItems = builder.domainItems;
        this.listId = builder.listId;
        this.listType = builder.listType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchCreateDomainItemsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainItems
     */
    public java.util.List<String> getDomainItems() {
        return this.domainItems;
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

    public static final class Builder extends Request.Builder<BatchCreateDomainItemsRequest, Builder> {
        private java.util.List<String> domainItems; 
        private String listId; 
        private String listType; 

        private Builder() {
            super();
        } 

        private Builder(BatchCreateDomainItemsRequest request) {
            super(request);
            this.domainItems = request.domainItems;
            this.listId = request.listId;
            this.listType = request.listType;
        } 

        /**
         * DomainItems.
         */
        public Builder domainItems(java.util.List<String> domainItems) {
            this.putBodyParameter("DomainItems", domainItems);
            this.domainItems = domainItems;
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
        public BatchCreateDomainItemsRequest build() {
            return new BatchCreateDomainItemsRequest(this);
        } 

    } 

}
