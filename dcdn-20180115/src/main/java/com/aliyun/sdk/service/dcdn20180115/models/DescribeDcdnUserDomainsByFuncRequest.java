// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDcdnUserDomainsByFuncRequest} extends {@link RequestModel}
 *
 * <p>DescribeDcdnUserDomainsByFuncRequest</p>
 */
public class DescribeDcdnUserDomainsByFuncRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FuncFilter")
    private String funcFilter;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FuncId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer funcId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MatchType")
    private String matchType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    @com.aliyun.core.annotation.Validation(maximum = 100000, minimum = 1)
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 500, minimum = 1)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    private DescribeDcdnUserDomainsByFuncRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
        this.funcFilter = builder.funcFilter;
        this.funcId = builder.funcId;
        this.matchType = builder.matchType;
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
     * @return matchType
     */
    public String getMatchType() {
        return this.matchType;
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
        private String matchType; 
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
            this.matchType = request.matchType;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.resourceGroupId = request.resourceGroupId;
        } 

        /**
         * <p>The accelerated domain name whose ICP filing status you want to update.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * <p>Specifies whether the feature that is specified by the FuncId parameter is enabled.</p>
         * <ul>
         * <li><strong>config</strong>: enabled</li>
         * <li><strong>unconfig</strong>: not enabled</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>config</p>
         */
        public Builder funcFilter(String funcFilter) {
            this.putQueryParameter("FuncFilter", funcFilter);
            this.funcFilter = funcFilter;
            return this;
        }

        /**
         * <p>The ID of the feature. For more information about how to query feature IDs, see <a href="https://help.aliyun.com/document_detail/410622.html">Parameters for configuring features for domain names</a>. For example, the ID of the origin host feature (set_req_host_header) is 18.</p>
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
         * <p>The type of the search. Default value: exact_match. Valid values:</p>
         * <ul>
         * <li>fuzzy_match: fuzzy search.</li>
         * <li>exact_match: exact search.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>exact_match</p>
         */
        public Builder matchType(String matchType) {
            this.putQueryParameter("MatchType", matchType);
            this.matchType = matchType;
            return this;
        }

        /**
         * <p>The number of the page to return. Default value: <strong>1</strong>. Valid values: <strong>1 to 100000</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries to return on each page. Default value: <strong>20</strong>. Valid values: <strong>1 to 500</strong>.</p>
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
         * <p>rg-acfmyuji4b6r4**</p>
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
