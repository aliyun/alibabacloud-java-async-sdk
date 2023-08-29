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
        private Integer pageNumber; 
        private Integer pageSize; 
        private String resourceGroupId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDcdnUserDomainsByFuncRequest request) {
            super(request);
            this.domainName = request.domainName;
            this.funcFilter = request.funcFilter;
            this.funcId = request.funcId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.resourceGroupId = request.resourceGroupId;
        } 

        /**
         * The accelerated domain name whose ICP filing status you want to update.
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * Specifies whether the feature that is specified by the FuncId parameter is enabled.
         * <p>
         * 
         * *   **config**: enabled
         * *   **unconfig**: not enabled
         */
        public Builder funcFilter(String funcFilter) {
            this.putQueryParameter("FuncFilter", funcFilter);
            this.funcFilter = funcFilter;
            return this;
        }

        /**
         * The ID of the feature. For more information about how to query feature IDs, see [Parameters for configuring features for domain names](~~410622~~). For example, the ID of the origin host feature (set_req_host_header) is 18.
         */
        public Builder funcId(Integer funcId) {
            this.putQueryParameter("FuncId", funcId);
            this.funcId = funcId;
            return this;
        }

        /**
         * The number of the page to return. Default value: **1**. Valid values: **1 to 100000**.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries to return on each page. Default value: **20**. Valid values: **1 to 500**.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the resource group.
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
