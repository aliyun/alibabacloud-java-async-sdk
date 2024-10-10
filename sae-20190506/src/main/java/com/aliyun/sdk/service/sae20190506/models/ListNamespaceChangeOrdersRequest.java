// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListNamespaceChangeOrdersRequest} extends {@link RequestModel}
 *
 * <p>ListNamespaceChangeOrdersRequest</p>
 */
public class ListNamespaceChangeOrdersRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CoStatus")
    private String coStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CoType")
    private String coType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Key")
    private String key;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NamespaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String namespaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
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

        private Builder(ListNamespaceChangeOrdersRequest request) {
            super(request);
            this.coStatus = request.coStatus;
            this.coType = request.coType;
            this.currentPage = request.currentPage;
            this.key = request.key;
            this.namespaceId = request.namespaceId;
            this.pageSize = request.pageSize;
        } 

        /**
         * <p>2</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder coStatus(String coStatus) {
            this.putQueryParameter("CoStatus", coStatus);
            this.coStatus = coStatus;
            return this;
        }

        /**
         * <p>CoBatchStartApplication</p>
         * 
         * <strong>example:</strong>
         * <p>CoBatchStartApplication</p>
         */
        public Builder coType(String coType) {
            this.putQueryParameter("CoType", coType);
            this.coType = coType;
            return this;
        }

        /**
         * <p>1</p>
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
         * <p>test</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder key(String key) {
            this.putQueryParameter("Key", key);
            this.key = key;
            return this;
        }

        /**
         * <p>cn-shanghai:test</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai:test</p>
         */
        public Builder namespaceId(String namespaceId) {
            this.putQueryParameter("NamespaceId", namespaceId);
            this.namespaceId = namespaceId;
            return this;
        }

        /**
         * <p>20</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
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
