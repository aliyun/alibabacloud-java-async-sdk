// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeCdnUserDomainsByFuncRequest} extends {@link RequestModel}
 *
 * <p>DescribeCdnUserDomainsByFuncRequest</p>
 */
public class DescribeCdnUserDomainsByFuncRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FuncId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer funcId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 500)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    private DescribeCdnUserDomainsByFuncRequest(Builder builder) {
        super(builder);
        this.funcId = builder.funcId;
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
        private Integer pageNumber; 
        private Integer pageSize; 
        private String resourceGroupId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCdnUserDomainsByFuncRequest request) {
            super(request);
            this.funcId = request.funcId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.resourceGroupId = request.resourceGroupId;
        } 

        /**
         * <p>The ID of the feature.</p>
         * <p>For example, the ID of the origin host feature (set_req_host_header) is 18.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        public Builder funcId(Integer funcId) {
            this.putQueryParameter("FuncId", funcId);
            this.funcId = funcId;
            return this;
        }

        /**
         * <p>The number of the page to return. Default value: <strong>1</strong>.</p>
         * <p>Valid values: <strong>1</strong> to <strong>100000</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of domain names to return on each page. Default value: <strong>20</strong>.</p>
         * <p>Valid values: <strong>1</strong> to <strong>50</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-xxxxx</p>
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
