// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDcdnWafPolicyValidDomainsRequest} extends {@link RequestModel}
 *
 * <p>DescribeDcdnWafPolicyValidDomainsRequest</p>
 */
public class DescribeDcdnWafPolicyValidDomainsRequest extends Request {
    @Query
    @NameInMap("DefenseScene")
    @Validation(required = true)
    private String defenseScene;

    @Query
    @NameInMap("DomainNameLike")
    private String domainNameLike;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    @Validation(maximum = 500)
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
         * The type of the Web Application Firewall (WAF) protection policy. Valid values:
         * <p>
         * 
         * *   waf_group: basic web protection
         * *   custom_acl: custom protection
         * *   whitelist: IP address whitelist
         * *   ip_blacklist: IP address blacklist
         * *   region_block: region blacklist
         * *   bot: bot management
         */
        public Builder defenseScene(String defenseScene) {
            this.putQueryParameter("DefenseScene", defenseScene);
            this.defenseScene = defenseScene;
            return this;
        }

        /**
         * The protected domain name. Fuzzy search is supported.
         */
        public Builder domainNameLike(String domainNameLike) {
            this.putQueryParameter("DomainNameLike", domainNameLike);
            this.domainNameLike = domainNameLike;
            return this;
        }

        /**
         * The page number of the returned page. Valid values: **1** to **100000**. Default value: **1**.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of domain names to return on each page. Valid values: an integer from **1** to **500**. Default value: **20**.
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
