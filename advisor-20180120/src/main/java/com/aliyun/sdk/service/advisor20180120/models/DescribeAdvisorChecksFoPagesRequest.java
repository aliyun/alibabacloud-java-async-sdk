// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.advisor20180120.models;

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
 * {@link DescribeAdvisorChecksFoPagesRequest} extends {@link RequestModel}
 *
 * <p>DescribeAdvisorChecksFoPagesRequest</p>
 */
public class DescribeAdvisorChecksFoPagesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AssumeAliyunId")
    private Long assumeAliyunId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizCategory")
    private String bizCategory;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Category")
    private String category;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CheckTypes")
    private java.util.List<Long> checkTypes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Product")
    private String product;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Source")
    private String source;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Token")
    private String token;

    private DescribeAdvisorChecksFoPagesRequest(Builder builder) {
        super(builder);
        this.assumeAliyunId = builder.assumeAliyunId;
        this.bizCategory = builder.bizCategory;
        this.category = builder.category;
        this.checkTypes = builder.checkTypes;
        this.name = builder.name;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.product = builder.product;
        this.source = builder.source;
        this.status = builder.status;
        this.token = builder.token;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAdvisorChecksFoPagesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return assumeAliyunId
     */
    public Long getAssumeAliyunId() {
        return this.assumeAliyunId;
    }

    /**
     * @return bizCategory
     */
    public String getBizCategory() {
        return this.bizCategory;
    }

    /**
     * @return category
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * @return checkTypes
     */
    public java.util.List<Long> getCheckTypes() {
        return this.checkTypes;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return product
     */
    public String getProduct() {
        return this.product;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return token
     */
    public String getToken() {
        return this.token;
    }

    public static final class Builder extends Request.Builder<DescribeAdvisorChecksFoPagesRequest, Builder> {
        private Long assumeAliyunId; 
        private String bizCategory; 
        private String category; 
        private java.util.List<Long> checkTypes; 
        private String name; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String product; 
        private String source; 
        private String status; 
        private String token; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAdvisorChecksFoPagesRequest request) {
            super(request);
            this.assumeAliyunId = request.assumeAliyunId;
            this.bizCategory = request.bizCategory;
            this.category = request.category;
            this.checkTypes = request.checkTypes;
            this.name = request.name;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.product = request.product;
            this.source = request.source;
            this.status = request.status;
            this.token = request.token;
        } 

        /**
         * AssumeAliyunId.
         */
        public Builder assumeAliyunId(Long assumeAliyunId) {
            this.putQueryParameter("AssumeAliyunId", assumeAliyunId);
            this.assumeAliyunId = assumeAliyunId;
            return this;
        }

        /**
         * BizCategory.
         */
        public Builder bizCategory(String bizCategory) {
            this.putQueryParameter("BizCategory", bizCategory);
            this.bizCategory = bizCategory;
            return this;
        }

        /**
         * Category.
         */
        public Builder category(String category) {
            this.putQueryParameter("Category", category);
            this.category = category;
            return this;
        }

        /**
         * CheckTypes.
         */
        public Builder checkTypes(java.util.List<Long> checkTypes) {
            String checkTypesShrink = shrink(checkTypes, "CheckTypes", "json");
            this.putQueryParameter("CheckTypes", checkTypesShrink);
            this.checkTypes = checkTypes;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
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
         * Product.
         */
        public Builder product(String product) {
            this.putQueryParameter("Product", product);
            this.product = product;
            return this;
        }

        /**
         * Source.
         */
        public Builder source(String source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * Token.
         */
        public Builder token(String token) {
            this.putQueryParameter("Token", token);
            this.token = token;
            return this;
        }

        @Override
        public DescribeAdvisorChecksFoPagesRequest build() {
            return new DescribeAdvisorChecksFoPagesRequest(this);
        } 

    } 

}
