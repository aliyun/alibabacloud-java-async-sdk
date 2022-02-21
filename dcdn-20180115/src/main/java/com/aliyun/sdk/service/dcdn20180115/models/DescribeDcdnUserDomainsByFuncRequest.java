// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDcdnUserDomainsByFuncRequest} extends {@link RequestModel}
 *
 * <p>DescribeDcdnUserDomainsByFuncRequest</p>
 */
public class DescribeDcdnUserDomainsByFuncRequest extends Request {
    @Query
    @NameInMap("DomainName")
    private String domainName;

    @Query
    @NameInMap("FuncFilter")
    private String funcFilter;

    @Query
    @NameInMap("FuncId")
    @Validation(required = true)
    private Integer funcId;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("PageNumber")
    @Validation(maximum = 100000, minimum = 1)
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    @Validation(maximum = 500, minimum = 1)
    private Integer pageSize;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    private DescribeDcdnUserDomainsByFuncRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
        this.funcFilter = builder.funcFilter;
        this.funcId = builder.funcId;
        this.ownerId = builder.ownerId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.resourceGroupId = builder.resourceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnUserDomainsByFuncRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return funcFilter
     */
    public String getFuncFilter() {
        return this.funcFilter;
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

    public static final class Builder extends Request.Builder<DescribeDcdnUserDomainsByFuncRequest, Builder> {
        private String domainName; 
        private String funcFilter; 
        private Integer funcId; 
        private Long ownerId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String resourceGroupId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDcdnUserDomainsByFuncRequest response) {
            super(response);
            this.domainName = response.domainName;
            this.funcFilter = response.funcFilter;
            this.funcId = response.funcId;
            this.ownerId = response.ownerId;
            this.pageNumber = response.pageNumber;
            this.pageSize = response.pageSize;
            this.resourceGroupId = response.resourceGroupId;
        } 

        /**
         * DomainName.
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * FuncFilter.
         */
        public Builder funcFilter(String funcFilter) {
            this.putQueryParameter("FuncFilter", funcFilter);
            this.funcFilter = funcFilter;
            return this;
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
        public DescribeDcdnUserDomainsByFuncRequest build() {
            return new DescribeDcdnUserDomainsByFuncRequest(this);
        } 

    } 

}
