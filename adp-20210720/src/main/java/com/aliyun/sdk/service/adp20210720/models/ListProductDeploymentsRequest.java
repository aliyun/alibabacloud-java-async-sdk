// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adp20210720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListProductDeploymentsRequest} extends {@link RequestModel}
 *
 * <p>ListProductDeploymentsRequest</p>
 */
public class ListProductDeploymentsRequest extends Request {
    @Query
    @NameInMap("environmentUID")
    @Validation(required = true)
    private String environmentUID;

    @Query
    @NameInMap("pageNum")
    @Validation(maximum = 1000, minimum = 1)
    private Integer pageNum;

    @Query
    @NameInMap("pageSize")
    @Validation(maximum = 100)
    private Integer pageSize;

    @Query
    @NameInMap("productVersionUID")
    @Validation(required = true)
    private String productVersionUID;

    private ListProductDeploymentsRequest(Builder builder) {
        super(builder);
        this.environmentUID = builder.environmentUID;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.productVersionUID = builder.productVersionUID;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProductDeploymentsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return environmentUID
     */
    public String getEnvironmentUID() {
        return this.environmentUID;
    }

    /**
     * @return pageNum
     */
    public Integer getPageNum() {
        return this.pageNum;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return productVersionUID
     */
    public String getProductVersionUID() {
        return this.productVersionUID;
    }

    public static final class Builder extends Request.Builder<ListProductDeploymentsRequest, Builder> {
        private String environmentUID; 
        private Integer pageNum; 
        private Integer pageSize; 
        private String productVersionUID; 

        private Builder() {
            super();
        } 

        private Builder(ListProductDeploymentsRequest request) {
            super(request);
            this.environmentUID = request.environmentUID;
            this.pageNum = request.pageNum;
            this.pageSize = request.pageSize;
            this.productVersionUID = request.productVersionUID;
        } 

        /**
         * environmentUID.
         */
        public Builder environmentUID(String environmentUID) {
            this.putQueryParameter("environmentUID", environmentUID);
            this.environmentUID = environmentUID;
            return this;
        }

        /**
         * pageNum.
         */
        public Builder pageNum(Integer pageNum) {
            this.putQueryParameter("pageNum", pageNum);
            this.pageNum = pageNum;
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
         * productVersionUID.
         */
        public Builder productVersionUID(String productVersionUID) {
            this.putQueryParameter("productVersionUID", productVersionUID);
            this.productVersionUID = productVersionUID;
            return this;
        }

        @Override
        public ListProductDeploymentsRequest build() {
            return new ListProductDeploymentsRequest(this);
        } 

    } 

}
