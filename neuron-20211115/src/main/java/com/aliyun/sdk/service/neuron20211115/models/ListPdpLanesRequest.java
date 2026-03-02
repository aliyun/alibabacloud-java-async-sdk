// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.neuron20211115.models;

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
 * {@link ListPdpLanesRequest} extends {@link RequestModel}
 *
 * <p>ListPdpLanesRequest</p>
 */
public class ListPdpLanesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("companyId")
    private Long companyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("env")
    private String env;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("inletServiceId")
    private Long inletServiceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("keyword")
    private String keyword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("orderBy")
    private String orderBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("orderDirection")
    private String orderDirection;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("productId")
    private Long productId;

    private ListPdpLanesRequest(Builder builder) {
        super(builder);
        this.companyId = builder.companyId;
        this.env = builder.env;
        this.inletServiceId = builder.inletServiceId;
        this.keyword = builder.keyword;
        this.orderBy = builder.orderBy;
        this.orderDirection = builder.orderDirection;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.productId = builder.productId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPdpLanesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return companyId
     */
    public Long getCompanyId() {
        return this.companyId;
    }

    /**
     * @return env
     */
    public String getEnv() {
        return this.env;
    }

    /**
     * @return inletServiceId
     */
    public Long getInletServiceId() {
        return this.inletServiceId;
    }

    /**
     * @return keyword
     */
    public String getKeyword() {
        return this.keyword;
    }

    /**
     * @return orderBy
     */
    public String getOrderBy() {
        return this.orderBy;
    }

    /**
     * @return orderDirection
     */
    public String getOrderDirection() {
        return this.orderDirection;
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
     * @return productId
     */
    public Long getProductId() {
        return this.productId;
    }

    public static final class Builder extends Request.Builder<ListPdpLanesRequest, Builder> {
        private Long companyId; 
        private String env; 
        private Long inletServiceId; 
        private String keyword; 
        private String orderBy; 
        private String orderDirection; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private Long productId; 

        private Builder() {
            super();
        } 

        private Builder(ListPdpLanesRequest request) {
            super(request);
            this.companyId = request.companyId;
            this.env = request.env;
            this.inletServiceId = request.inletServiceId;
            this.keyword = request.keyword;
            this.orderBy = request.orderBy;
            this.orderDirection = request.orderDirection;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.productId = request.productId;
        } 

        /**
         * companyId.
         */
        public Builder companyId(Long companyId) {
            this.putQueryParameter("companyId", companyId);
            this.companyId = companyId;
            return this;
        }

        /**
         * env.
         */
        public Builder env(String env) {
            this.putQueryParameter("env", env);
            this.env = env;
            return this;
        }

        /**
         * inletServiceId.
         */
        public Builder inletServiceId(Long inletServiceId) {
            this.putQueryParameter("inletServiceId", inletServiceId);
            this.inletServiceId = inletServiceId;
            return this;
        }

        /**
         * keyword.
         */
        public Builder keyword(String keyword) {
            this.putQueryParameter("keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * orderBy.
         */
        public Builder orderBy(String orderBy) {
            this.putQueryParameter("orderBy", orderBy);
            this.orderBy = orderBy;
            return this;
        }

        /**
         * orderDirection.
         */
        public Builder orderDirection(String orderDirection) {
            this.putQueryParameter("orderDirection", orderDirection);
            this.orderDirection = orderDirection;
            return this;
        }

        /**
         * pageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("pageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * productId.
         */
        public Builder productId(Long productId) {
            this.putQueryParameter("productId", productId);
            this.productId = productId;
            return this;
        }

        @Override
        public ListPdpLanesRequest build() {
            return new ListPdpLanesRequest(this);
        } 

    } 

}
