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
 * {@link ListDomainItemsRequest} extends {@link RequestModel}
 *
 * <p>ListDomainItemsRequest</p>
 */
public class ListDomainItemsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ItemValue")
    private String itemValue;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ListId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String listId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ListType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String listType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageSize;

    private ListDomainItemsRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.itemValue = builder.itemValue;
        this.listId = builder.listId;
        this.listType = builder.listType;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDomainItemsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return itemValue
     */
    public String getItemValue() {
        return this.itemValue;
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

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    public static final class Builder extends Request.Builder<ListDomainItemsRequest, Builder> {
        private Integer currentPage; 
        private String itemValue; 
        private String listId; 
        private String listType; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(ListDomainItemsRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.itemValue = request.itemValue;
            this.listId = request.listId;
            this.listType = request.listType;
            this.pageSize = request.pageSize;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * ItemValue.
         */
        public Builder itemValue(String itemValue) {
            this.putQueryParameter("ItemValue", itemValue);
            this.itemValue = itemValue;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ladl-6f1exxxxx6ab59</p>
         */
        public Builder listId(String listId) {
            this.putQueryParameter("ListId", listId);
            this.listId = listId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>la_domain_white_list</p>
         */
        public Builder listType(String listType) {
            this.putQueryParameter("ListType", listType);
            this.listType = listType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public ListDomainItemsRequest build() {
            return new ListDomainItemsRequest(this);
        } 

    } 

}
