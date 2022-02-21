// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCdnUserDomainsByFuncRequest} extends {@link RequestModel}
 *
 * <p>DescribeCdnUserDomainsByFuncRequest</p>
 */
public class DescribeCdnUserDomainsByFuncRequest extends Request {
    @Query
    @NameInMap("FuncId")
    @Validation(required = true)
    private Integer funcId;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    @Validation(maximum = 500)
    private Integer pageSize;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    private DescribeCdnUserDomainsByFuncRequest(Builder builder) {
        super(builder);
        this.funcId = builder.funcId;
        this.ownerId = builder.ownerId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.resourceGroupId = builder.resourceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCdnUserDomainsByFuncRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return funcId
     */
    public Integer getFuncId() {
        return this.funcId;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
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
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public static final class Builder extends Request.Builder<DescribeCdnUserDomainsByFuncRequest, Builder> {
        private Integer funcId; 
        private Long ownerId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String resourceGroupId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCdnUserDomainsByFuncRequest response) {
            super(response);
            this.funcId = response.funcId;
            this.ownerId = response.ownerId;
            this.pageNumber = response.pageNumber;
            this.pageSize = response.pageSize;
            this.resourceGroupId = response.resourceGroupId;
        } 

        /**
         * FuncId.
         */
        public Builder funcId(Integer funcId) {
            this.putQueryParameter("FuncId", funcId);
            this.funcId = funcId;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
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
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        @Override
        public DescribeCdnUserDomainsByFuncRequest build() {
            return new DescribeCdnUserDomainsByFuncRequest(this);
        } 

    } 

}
