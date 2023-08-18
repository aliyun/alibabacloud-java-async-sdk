// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.advisor20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAdvicesPageRequest} extends {@link RequestModel}
 *
 * <p>DescribeAdvicesPageRequest</p>
 */
public class DescribeAdvicesPageRequest extends Request {
    @Query
    @NameInMap("AdviceId")
    private Long adviceId;

    @Query
    @NameInMap("CheckId")
    private String checkId;

    @Query
    @NameInMap("Language")
    private String language;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("Product")
    private String product;

    @Query
    @NameInMap("ResourceId")
    private String resourceId;

    private DescribeAdvicesPageRequest(Builder builder) {
        super(builder);
        this.adviceId = builder.adviceId;
        this.checkId = builder.checkId;
        this.language = builder.language;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.product = builder.product;
        this.resourceId = builder.resourceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAdvicesPageRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return adviceId
     */
    public Long getAdviceId() {
        return this.adviceId;
    }

    /**
     * @return checkId
     */
    public String getCheckId() {
        return this.checkId;
    }

    /**
     * @return language
     */
    public String getLanguage() {
        return this.language;
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
     * @return resourceId
     */
    public String getResourceId() {
        return this.resourceId;
    }

    public static final class Builder extends Request.Builder<DescribeAdvicesPageRequest, Builder> {
        private Long adviceId; 
        private String checkId; 
        private String language; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String product; 
        private String resourceId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAdvicesPageRequest request) {
            super(request);
            this.adviceId = request.adviceId;
            this.checkId = request.checkId;
            this.language = request.language;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.product = request.product;
            this.resourceId = request.resourceId;
        } 

        /**
         * AdviceId.
         */
        public Builder adviceId(Long adviceId) {
            this.putQueryParameter("AdviceId", adviceId);
            this.adviceId = adviceId;
            return this;
        }

        /**
         * CheckId.
         */
        public Builder checkId(String checkId) {
            this.putQueryParameter("CheckId", checkId);
            this.checkId = checkId;
            return this;
        }

        /**
         * Language.
         */
        public Builder language(String language) {
            this.putQueryParameter("Language", language);
            this.language = language;
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
         * ResourceId.
         */
        public Builder resourceId(String resourceId) {
            this.putQueryParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        @Override
        public DescribeAdvicesPageRequest build() {
            return new DescribeAdvicesPageRequest(this);
        } 

    } 

}
