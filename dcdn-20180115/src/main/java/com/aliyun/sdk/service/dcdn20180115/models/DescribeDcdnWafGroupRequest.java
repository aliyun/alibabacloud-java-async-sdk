// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDcdnWafGroupRequest} extends {@link RequestModel}
 *
 * <p>DescribeDcdnWafGroupRequest</p>
 */
public class DescribeDcdnWafGroupRequest extends Request {
    @Query
    @NameInMap("Id")
    @Validation(required = true)
    private Long id;

    @Query
    @NameInMap("Language")
    @Validation(required = true)
    private String language;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("QueryArgs")
    private String queryArgs;

    @Query
    @NameInMap("Scope")
    @Validation(required = true)
    private String scope;

    private DescribeDcdnWafGroupRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
        this.language = builder.language;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.queryArgs = builder.queryArgs;
        this.scope = builder.scope;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnWafGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return language
     */
    public String getLanguage() {
        return this.language;
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

    /**
     * @return scope
     */
    public String getScope() {
        return this.scope;
    }

    public static final class Builder extends Request.Builder<DescribeDcdnWafGroupRequest, Builder> {
        private Long id; 
        private String language; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String queryArgs; 
        private String scope; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDcdnWafGroupRequest request) {
            super(request);
            this.id = request.id;
            this.language = request.language;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.queryArgs = request.queryArgs;
            this.scope = request.scope;
        } 

        /**
         * The ID of the WAF rule group. You can query the ID by calling the [DescribeDcdnWafGroups](~~DescribeDcdnWafGroups~~) operation.
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * The language of the response. Valid values:
         * <p>
         * 
         * *   **en**: English
         * *    **zh**: Chinese
         */
        public Builder language(String language) {
            this.putQueryParameter("Language", language);
            this.language = language;
            return this;
        }

        /**
         * The number of the page to return. Default value: **1**.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries to return on each page. Default value: **20**.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The query conditions. The value needs to be a JSON string in the following format: Format:
         * <p>
         * 
         * `QueryArgs={"PolicyIds":"IDs of protection policies","RuleIds":"IDs of protection rules","RuleNameLike":"Names of protection rules","DomainNames":"Protected domain names","DefenseScenes":"waf_group","RuleStatus":"on","OrderBy":"GmtModified","Desc":"false"}`
         * 
         * > If you do not specify this parameter, all protection rules are queried.
         */
        public Builder queryArgs(String queryArgs) {
            this.putQueryParameter("QueryArgs", queryArgs);
            this.queryArgs = queryArgs;
            return this;
        }

        /**
         * The range of the rule group to be queried.
         * <p>
         * 
         * *   **in**: rules in the rule group are returned.
         * *  **out**: rules that are in the full rule set but are not in the rule group are returned.
         */
        public Builder scope(String scope) {
            this.putQueryParameter("Scope", scope);
            this.scope = scope;
            return this;
        }

        @Override
        public DescribeDcdnWafGroupRequest build() {
            return new DescribeDcdnWafGroupRequest(this);
        } 

    } 

}
