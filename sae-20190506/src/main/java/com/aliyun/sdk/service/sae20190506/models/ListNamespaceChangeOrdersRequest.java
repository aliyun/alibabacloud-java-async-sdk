// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListNamespaceChangeOrdersRequest} extends {@link RequestModel}
 *
 * <p>ListNamespaceChangeOrdersRequest</p>
 */
public class ListNamespaceChangeOrdersRequest extends Request {
    @Query
    @NameInMap("CoStatus")
    private String coStatus;

    @Query
    @NameInMap("CoType")
    private String coType;

    @Query
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @Query
    @NameInMap("Key")
    private String key;

    @Query
    @NameInMap("NamespaceId")
    @Validation(required = true)
    private String namespaceId;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    private ListNamespaceChangeOrdersRequest(Builder builder) {
        super(builder);
        this.coStatus = builder.coStatus;
        this.coType = builder.coType;
        this.currentPage = builder.currentPage;
        this.key = builder.key;
        this.namespaceId = builder.namespaceId;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListNamespaceChangeOrdersRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return coStatus
     */
    public String getCoStatus() {
        return this.coStatus;
    }

    /**
     * @return coType
     */
    public String getCoType() {
        return this.coType;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return key
     */
    public String getKey() {
        return this.key;
    }

    /**
     * @return namespaceId
     */
    public String getNamespaceId() {
        return this.namespaceId;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    public static final class Builder extends Request.Builder<ListNamespaceChangeOrdersRequest, Builder> {
        private String coStatus; 
        private String coType; 
        private Integer currentPage; 
        private String key; 
        private String namespaceId; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(ListNamespaceChangeOrdersRequest response) {
            super(response);
            this.coStatus = response.coStatus;
            this.coType = response.coType;
            this.currentPage = response.currentPage;
            this.key = response.key;
            this.namespaceId = response.namespaceId;
            this.pageSize = response.pageSize;
        } 

        /**
         * CoStatus.
         */
        public Builder coStatus(String coStatus) {
            this.putQueryParameter("CoStatus", coStatus);
            this.coStatus = coStatus;
            return this;
        }

        /**
         * CoType.
         */
        public Builder coType(String coType) {
            this.putQueryParameter("CoType", coType);
            this.coType = coType;
            return this;
        }

        /**
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * Key.
         */
        public Builder key(String key) {
            this.putQueryParameter("Key", key);
            this.key = key;
            return this;
        }

        /**
         * NamespaceId.
         */
        public Builder namespaceId(String namespaceId) {
            this.putQueryParameter("NamespaceId", namespaceId);
            this.namespaceId = namespaceId;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public ListNamespaceChangeOrdersRequest build() {
            return new ListNamespaceChangeOrdersRequest(this);
        } 

    } 

}
