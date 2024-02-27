// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20190103.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDataObjectColumnDetailRequest} extends {@link RequestModel}
 *
 * <p>DescribeDataObjectColumnDetailRequest</p>
 */
public class DescribeDataObjectColumnDetailRequest extends Request {
    @Query
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @Query
    @NameInMap("Id")
    private Long id;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("ProductId")
    private Long productId;

    @Query
    @NameInMap("TemplateId")
    private Long templateId;

    private DescribeDataObjectColumnDetailRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.id = builder.id;
        this.lang = builder.lang;
        this.pageSize = builder.pageSize;
        this.productId = builder.productId;
        this.templateId = builder.templateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDataObjectColumnDetailRequest create() {
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
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
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
     * @return templateId
     */
    public Long getTemplateId() {
        return this.templateId;
    }

    public static final class Builder extends Request.Builder<DescribeDataObjectColumnDetailRequest, Builder> {
        private Integer currentPage; 
        private Long id; 
        private String lang; 
        private Integer pageSize; 
        private Long productId; 
        private Long templateId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDataObjectColumnDetailRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.id = request.id;
            this.lang = request.lang;
            this.pageSize = request.pageSize;
            this.productId = request.productId;
            this.templateId = request.templateId;
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
         * Id.
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
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
         * TemplateId.
         */
        public Builder templateId(Long templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        @Override
        public DescribeDataObjectColumnDetailRequest build() {
            return new DescribeDataObjectColumnDetailRequest(this);
        } 

    } 

}
