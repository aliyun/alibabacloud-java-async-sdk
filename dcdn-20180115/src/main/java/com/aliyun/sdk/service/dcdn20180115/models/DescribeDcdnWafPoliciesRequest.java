// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDcdnWafPoliciesRequest} extends {@link RequestModel}
 *
 * <p>DescribeDcdnWafPoliciesRequest</p>
 */
public class DescribeDcdnWafPoliciesRequest extends Request {
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

    private DescribeDcdnWafPoliciesRequest(Builder builder) {
        super(builder);
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.queryArgs = builder.queryArgs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnWafPoliciesRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeDcdnWafPoliciesRequest, Builder> {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String queryArgs; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDcdnWafPoliciesRequest request) {
            super(request);
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.queryArgs = request.queryArgs;
        } 

        /**
         * <p>The number of the page to return. Valid values: <strong>1</strong> to <strong>100000</strong>. Default value: <strong>1</strong>.</p>
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
         * <p>The number of protection policies to return on each page. Valid values: an integer from <strong>1</strong> to <strong>500</strong>. Default value: <strong>20</strong>.</p>
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
         * <p>The query conditions. The value is a JSON string. The format is <code>QueryArgs={&quot;PolicyIds&quot;:&quot;The IDs of protection policies&quot;,&quot;RuleIds&quot;:&quot;The IDs of protection rules&quot;,&quot;PolicyNameLike&quot;:&quot;The name of the protection policy&quot;,&quot;DomainNames&quot;:&quot;The protected domain names&quot;,&quot;PolicyType&quot;:&quot;default&quot;,&quot;DefenseScenes&quot;:&quot;waf_group&quot;,&quot;PolicyStatus&quot;:&quot;on&quot;,&quot;OrderBy&quot;:&quot;GmtModified&quot;,&quot;Desc&quot;:&quot;false&quot;}</code></p>
         * <blockquote>
         * <p>If you do not set this parameter, all protection policies are queried.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>{&quot;PolicyNameLIike&quot;:&quot;test_policy&quot;}</p>
         */
        public Builder queryArgs(String queryArgs) {
            this.putQueryParameter("QueryArgs", queryArgs);
            this.queryArgs = queryArgs;
            return this;
        }

        @Override
        public DescribeDcdnWafPoliciesRequest build() {
            return new DescribeDcdnWafPoliciesRequest(this);
        } 

    } 

}
