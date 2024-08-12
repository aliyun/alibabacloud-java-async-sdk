// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dianjin20240628.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDocumentChunkListRequest} extends {@link RequestModel}
 *
 * <p>GetDocumentChunkListRequest</p>
 */
public class GetDocumentChunkListRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("chunkIdList")
    private java.util.List < String > chunkIdList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("docId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String docId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("libraryId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String libraryId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("order")
    private String order;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("orderBy")
    private String orderBy;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("page")
    private Integer page;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("searchQuery")
    private String searchQuery;

    private GetDocumentChunkListRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.chunkIdList = builder.chunkIdList;
        this.docId = builder.docId;
        this.libraryId = builder.libraryId;
        this.order = builder.order;
        this.orderBy = builder.orderBy;
        this.page = builder.page;
        this.pageSize = builder.pageSize;
        this.searchQuery = builder.searchQuery;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDocumentChunkListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return chunkIdList
     */
    public java.util.List < String > getChunkIdList() {
        return this.chunkIdList;
    }

    /**
     * @return docId
     */
    public String getDocId() {
        return this.docId;
    }

    /**
     * @return libraryId
     */
    public String getLibraryId() {
        return this.libraryId;
    }

    /**
     * @return order
     */
    public String getOrder() {
        return this.order;
    }

    /**
     * @return orderBy
     */
    public String getOrderBy() {
        return this.orderBy;
    }

    /**
     * @return page
     */
    public Integer getPage() {
        return this.page;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return searchQuery
     */
    public String getSearchQuery() {
        return this.searchQuery;
    }

    public static final class Builder extends Request.Builder<GetDocumentChunkListRequest, Builder> {
        private String workspaceId; 
        private java.util.List < String > chunkIdList; 
        private String docId; 
        private String libraryId; 
        private String order; 
        private String orderBy; 
        private Integer page; 
        private Integer pageSize; 
        private String searchQuery; 

        private Builder() {
            super();
        } 

        private Builder(GetDocumentChunkListRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.chunkIdList = request.chunkIdList;
            this.docId = request.docId;
            this.libraryId = request.libraryId;
            this.order = request.order;
            this.orderBy = request.orderBy;
            this.page = request.page;
            this.pageSize = request.pageSize;
            this.searchQuery = request.searchQuery;
        } 

        /**
         * workspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * chunkIdList.
         */
        public Builder chunkIdList(java.util.List < String > chunkIdList) {
            this.putBodyParameter("chunkIdList", chunkIdList);
            this.chunkIdList = chunkIdList;
            return this;
        }

        /**
         * docId.
         */
        public Builder docId(String docId) {
            this.putBodyParameter("docId", docId);
            this.docId = docId;
            return this;
        }

        /**
         * libraryId.
         */
        public Builder libraryId(String libraryId) {
            this.putBodyParameter("libraryId", libraryId);
            this.libraryId = libraryId;
            return this;
        }

        /**
         * order.
         */
        public Builder order(String order) {
            this.putBodyParameter("order", order);
            this.order = order;
            return this;
        }

        /**
         * orderBy.
         */
        public Builder orderBy(String orderBy) {
            this.putBodyParameter("orderBy", orderBy);
            this.orderBy = orderBy;
            return this;
        }

        /**
         * page.
         */
        public Builder page(Integer page) {
            this.putBodyParameter("page", page);
            this.page = page;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * searchQuery.
         */
        public Builder searchQuery(String searchQuery) {
            this.putBodyParameter("searchQuery", searchQuery);
            this.searchQuery = searchQuery;
            return this;
        }

        @Override
        public GetDocumentChunkListRequest build() {
            return new GetDocumentChunkListRequest(this);
        } 

    } 

}
