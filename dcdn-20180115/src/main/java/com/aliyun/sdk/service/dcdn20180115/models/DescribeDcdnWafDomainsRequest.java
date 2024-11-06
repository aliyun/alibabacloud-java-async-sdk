// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDcdnWafDomainsRequest} extends {@link RequestModel}
 *
 * <p>DescribeDcdnWafDomainsRequest</p>
 */
public class DescribeDcdnWafDomainsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 500)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueryArgs")
    private String queryArgs;

    private DescribeDcdnWafDomainsRequest(Builder builder) {
        super(builder);
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.queryArgs = builder.queryArgs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnWafDomainsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return queryArgs
     */
    public String getQueryArgs() {
        return this.queryArgs;
    }

    public static final class Builder extends Request.Builder<DescribeDcdnWafDomainsRequest, Builder> {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String queryArgs; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDcdnWafDomainsRequest request) {
            super(request);
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.queryArgs = request.queryArgs;
        } 

        /**
         * <p>The number of the page to return. Valid values: <strong>1</strong> to <strong>100000</strong>.</p>
         * <p>Default value: <strong>1</strong>.</p>
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
         * <p>The number of domain names to return on each page. Valid values: an integer from <strong>1</strong> to <strong>500</strong>. Default value: <strong>20</strong>.</p>
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
         * <p>The query conditions. You can filter domain names by name. Fuzzy match is supported <code>QueryArgs={&quot;DomainName&quot;:&quot;Accelerated domain name&quot;}</code></p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;DomainName&quot;:&quot;example.com&quot;}</p>
         */
        public Builder queryArgs(String queryArgs) {
            this.putQueryParameter("QueryArgs", queryArgs);
            this.queryArgs = queryArgs;
            return this;
        }

        @Override
        public DescribeDcdnWafDomainsRequest build() {
            return new DescribeDcdnWafDomainsRequest(this);
        } 

    } 

}
