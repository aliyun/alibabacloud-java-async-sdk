// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDcdnWafPolicyValidDomainsRequest} extends {@link RequestModel}
 *
 * <p>DescribeDcdnWafPolicyValidDomainsRequest</p>
 */
public class DescribeDcdnWafPolicyValidDomainsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DefenseScene")
    @com.aliyun.core.annotation.Validation(required = true)
    private String defenseScene;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainNameLike")
    private String domainNameLike;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 500)
    private Integer pageSize;

    private DescribeDcdnWafPolicyValidDomainsRequest(Builder builder) {
        super(builder);
        this.defenseScene = builder.defenseScene;
        this.domainNameLike = builder.domainNameLike;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnWafPolicyValidDomainsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return defenseScene
     */
    public String getDefenseScene() {
        return this.defenseScene;
    }

    /**
     * @return domainNameLike
     */
    public String getDomainNameLike() {
        return this.domainNameLike;
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

    public static final class Builder extends Request.Builder<DescribeDcdnWafPolicyValidDomainsRequest, Builder> {
        private String defenseScene; 
        private String domainNameLike; 
        private Integer pageNumber; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDcdnWafPolicyValidDomainsRequest request) {
            super(request);
            this.defenseScene = request.defenseScene;
            this.domainNameLike = request.domainNameLike;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
        } 

        /**
         * <p>The type of the Web Application Firewall (WAF) protection policy. Valid values:</p>
         * <ul>
         * <li>waf_group: basic web protection</li>
         * <li>custom_acl: custom protection</li>
         * <li>whitelist: IP address whitelist</li>
         * <li>ip_blacklist: IP address blacklist</li>
         * <li>region_block: region blacklist</li>
         * <li>bot: bot management</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>custom_acl</p>
         */
        public Builder defenseScene(String defenseScene) {
            this.putQueryParameter("DefenseScene", defenseScene);
            this.defenseScene = defenseScene;
            return this;
        }

        /**
         * <p>The protected domain name. Fuzzy search is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        public Builder domainNameLike(String domainNameLike) {
            this.putQueryParameter("DomainNameLike", domainNameLike);
            this.domainNameLike = domainNameLike;
            return this;
        }

        /**
         * <p>The page number of the returned page. Valid values: <strong>1</strong> to <strong>100000</strong>. Default value: <strong>1</strong>.</p>
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

        @Override
        public DescribeDcdnWafPolicyValidDomainsRequest build() {
            return new DescribeDcdnWafPolicyValidDomainsRequest(this);
        } 

    } 

}
