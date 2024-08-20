// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDcdnWafRulesRequest} extends {@link RequestModel}
 *
 * <p>DescribeDcdnWafRulesRequest</p>
 */
public class DescribeDcdnWafRulesRequest extends Request {
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

    private DescribeDcdnWafRulesRequest(Builder builder) {
        super(builder);
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.queryArgs = builder.queryArgs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnWafRulesRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeDcdnWafRulesRequest, Builder> {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String queryArgs; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDcdnWafRulesRequest request) {
            super(request);
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.queryArgs = request.queryArgs;
        } 

        /**
         * The number of the page to return. Valid values: **1** to **100000**. Default value: **1**.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of protection rules to return per page. Valid values: integers from **1** to **500**. Default value: **20**.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The query conditions. The value needs to be a JSON string in the following format: `QueryArgs={"PolicyIds":"The range of protection policy IDs","RuleIds":"The range of protection rule IDs","RuleNameLike":"The name of the protection rule","DomainNames":"The protected domain names","DefenseScenes":"waf_group","RuleStatus":"on","OrderBy":"GmtModified","Desc":"false"}`.
         * <p>
         * 
         * > If you do not specify this parameter, all protection rules are queried.
         */
        public Builder queryArgs(String queryArgs) {
            this.putQueryParameter("QueryArgs", queryArgs);
            this.queryArgs = queryArgs;
            return this;
        }

        @Override
        public DescribeDcdnWafRulesRequest build() {
            return new DescribeDcdnWafRulesRequest(this);
        } 

    } 

}
