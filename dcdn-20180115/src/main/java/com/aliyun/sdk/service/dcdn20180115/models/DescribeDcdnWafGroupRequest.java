// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDcdnWafGroupRequest} extends {@link RequestModel}
 *
 * <p>DescribeDcdnWafGroupRequest</p>
 */
public class DescribeDcdnWafGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Language")
    @com.aliyun.core.annotation.Validation(required = true)
    private String language;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueryArgs")
    private String queryArgs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Scope")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The ID of the WAF rule group. You can query the ID by calling the <a href="~~DescribeDcdnWafGroups~~">DescribeDcdnWafGroups</a> operation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1012</p>
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * <p>The language of the response. Valid values:</p>
         * <ul>
         * <li><strong>en</strong>: English.</li>
         * <li><strong>zh</strong>: Chinese.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder language(String language) {
            this.putQueryParameter("Language", language);
            this.language = language;
            return this;
        }

        /**
         * <p>The number of the page to return. Default value: <strong>1</strong>.</p>
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
         * <p>The number of entries to return on each page. Default value: <strong>20</strong>.</p>
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
         * <p>The query conditions. The value is a JSON string in the following format:</p>
         * <p><code>QueryArgs={&quot;PolicyIds&quot;:&quot;The range of protection policy IDs&quot;,&quot;RuleIds&quot;:&quot;The range of protection rule IDs&quot;,&quot;RuleNameLike&quot;:&quot;The name of the protection rule&quot;,&quot;DomainNames&quot;:&quot;The protected domain names&quot;,&quot;DefenseScenes&quot;:&quot;waf_group&quot;,&quot;RuleStatus&quot;:&quot;on&quot;,&quot;OrderBy&quot;:&quot;GmtModified&quot;,&quot;Desc&quot;:&quot;false&quot;}</code></p>
         * <blockquote>
         * <p> If you do not specify this parameter, all protection rules are queried.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>{&quot;RiskLevel&quot;:&quot;&quot;,&quot;ProtectionType&quot;:&quot;&quot;,&quot;ApplicationType&quot;:&quot;&quot;,&quot;RuleIdLike&quot;:&quot;&quot;}</p>
         */
        public Builder queryArgs(String queryArgs) {
            this.putQueryParameter("QueryArgs", queryArgs);
            this.queryArgs = queryArgs;
            return this;
        }

        /**
         * <p>The range of the rule group to be queried.</p>
         * <ul>
         * <li><strong>in</strong>: Rules in the rule group are returned.</li>
         * <li><strong>out</strong>: Rules that are in the full rule set but are not in the rule group are returned.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>in</p>
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
