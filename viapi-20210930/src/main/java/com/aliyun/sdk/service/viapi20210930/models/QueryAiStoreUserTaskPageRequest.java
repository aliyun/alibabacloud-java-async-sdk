// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.viapi20210930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryAiStoreUserTaskPageRequest} extends {@link RequestModel}
 *
 * <p>QueryAiStoreUserTaskPageRequest</p>
 */
public class QueryAiStoreUserTaskPageRequest extends Request {
    @Query
    @NameInMap("ApiName")
    private String apiName;

    @Query
    @NameInMap("BucketName")
    private String bucketName;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("PageNo")
    private Integer pageNo;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("Product")
    private String product;

    @Query
    @NameInMap("Status")
    private String status;

    private QueryAiStoreUserTaskPageRequest(Builder builder) {
        super(builder);
        this.apiName = builder.apiName;
        this.bucketName = builder.bucketName;
        this.name = builder.name;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.product = builder.product;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryAiStoreUserTaskPageRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiName
     */
    public String getApiName() {
        return this.apiName;
    }

    /**
     * @return bucketName
     */
    public String getBucketName() {
        return this.bucketName;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return pageNo
     */
    public Integer getPageNo() {
        return this.pageNo;
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
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<QueryAiStoreUserTaskPageRequest, Builder> {
        private String apiName; 
        private String bucketName; 
        private String name; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String product; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(QueryAiStoreUserTaskPageRequest request) {
            super(request);
            this.apiName = request.apiName;
            this.bucketName = request.bucketName;
            this.name = request.name;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.product = request.product;
            this.status = request.status;
        } 

        /**
         * ApiName.
         */
        public Builder apiName(String apiName) {
            this.putQueryParameter("ApiName", apiName);
            this.apiName = apiName;
            return this;
        }

        /**
         * BucketName.
         */
        public Builder bucketName(String bucketName) {
            this.putQueryParameter("BucketName", bucketName);
            this.bucketName = bucketName;
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
         * PageNo.
         */
        public Builder pageNo(Integer pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
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
         * Status.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public QueryAiStoreUserTaskPageRequest build() {
            return new QueryAiStoreUserTaskPageRequest(this);
        } 

    } 

}
