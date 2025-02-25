// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAllTagResourceNumListRequest} extends {@link RequestModel}
 *
 * <p>GetAllTagResourceNumListRequest</p>
 */
public class GetAllTagResourceNumListRequest extends Request {
    @Query
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @Query
    @NameInMap("OperaUid")
    private String operaUid;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("ProductId")
    private Long productId;

    @Query
    @NameInMap("TagName")
    private String tagName;

    private GetAllTagResourceNumListRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.operaUid = builder.operaUid;
        this.pageSize = builder.pageSize;
        this.productId = builder.productId;
        this.tagName = builder.tagName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAllTagResourceNumListRequest create() {
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
     * @return operaUid
     */
    public String getOperaUid() {
        return this.operaUid;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return productId
     */
    public Long getProductId() {
        return this.productId;
    }

    /**
     * @return tagName
     */
    public String getTagName() {
        return this.tagName;
    }

    public static final class Builder extends Request.Builder<GetAllTagResourceNumListRequest, Builder> {
        private Integer currentPage; 
        private String operaUid; 
        private Integer pageSize; 
        private Long productId; 
        private String tagName; 

        private Builder() {
            super();
        } 

        private Builder(GetAllTagResourceNumListRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.operaUid = request.operaUid;
            this.pageSize = request.pageSize;
            this.productId = request.productId;
            this.tagName = request.tagName;
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
         * OperaUid.
         */
        public Builder operaUid(String operaUid) {
            this.putQueryParameter("OperaUid", operaUid);
            this.operaUid = operaUid;
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

        /**
         * ProductId.
         */
        public Builder productId(Long productId) {
            this.putQueryParameter("ProductId", productId);
            this.productId = productId;
            return this;
        }

        /**
         * TagName.
         */
        public Builder tagName(String tagName) {
            this.putQueryParameter("TagName", tagName);
            this.tagName = tagName;
            return this;
        }

        @Override
        public GetAllTagResourceNumListRequest build() {
            return new GetAllTagResourceNumListRequest(this);
        } 

    } 

}
