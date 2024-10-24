// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeWebRulesRequest} extends {@link RequestModel}
 *
 * <p>DescribeWebRulesRequest</p>
 */
public class DescribeWebRulesRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Cname")
    @com.aliyun.core.annotation.Validation(maxLength = 128, minLength = 3)
    private String cname;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Domain")
    private String domain;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceIds")
    private java.util.List < String > instanceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueryDomainPattern")
    private String queryDomainPattern;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    private DescribeWebRulesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.cname = builder.cname;
        this.domain = builder.domain;
        this.instanceIds = builder.instanceIds;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.queryDomainPattern = builder.queryDomainPattern;
        this.resourceGroupId = builder.resourceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeWebRulesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return cname
     */
    public String getCname() {
        return this.cname;
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * @return instanceIds
     */
    public java.util.List < String > getInstanceIds() {
        return this.instanceIds;
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
     * @return queryDomainPattern
     */
    public String getQueryDomainPattern() {
        return this.queryDomainPattern;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public static final class Builder extends Request.Builder<DescribeWebRulesRequest, Builder> {
        private String regionId; 
        private String cname; 
        private String domain; 
        private java.util.List < String > instanceIds; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String queryDomainPattern; 
        private String resourceGroupId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeWebRulesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.cname = request.cname;
            this.domain = request.domain;
            this.instanceIds = request.instanceIds;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.queryDomainPattern = request.queryDomainPattern;
            this.resourceGroupId = request.resourceGroupId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The CNAME address to query.</p>
         * 
         * <strong>example:</strong>
         * <p>kzmk7b8tt351****.aliyunddos1014****</p>
         */
        public Builder cname(String cname) {
            this.putQueryParameter("Cname", cname);
            this.cname = cname;
            return this;
        }

        /**
         * <p>The domain name of the website to query.</p>
         * <blockquote>
         * <p>The domain must have been configured with website business forwarding rules. You can call <a href="~~DescribeDomains~~">DescribeDomains</a> to query all domains that have been configured with website business forwarding rules.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        public Builder domain(String domain) {
            this.putQueryParameter("Domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * <p>The list of DDoS protection instance IDs to query.</p>
         * 
         * <strong>example:</strong>
         * <p>ddoscoo-cn-mp91j1ao****</p>
         */
        public Builder instanceIds(java.util.List < String > instanceIds) {
            this.putQueryParameter("InstanceIds", instanceIds);
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * <p>The page number. Default value: <strong>1</strong>.</p>
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
         * <p>The number of entries per page. Valid values: <strong>1</strong> to <strong>10</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The query matching pattern. Values:</p>
         * <ul>
         * <li><strong>fuzzy</strong> (default): Indicates fuzzy query.</li>
         * <li><strong>exact</strong>: Indicates exact query.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>exact</p>
         */
        public Builder queryDomainPattern(String queryDomainPattern) {
            this.putQueryParameter("QueryDomainPattern", queryDomainPattern);
            this.queryDomainPattern = queryDomainPattern;
            return this;
        }

        /**
         * <p>The resource group ID of the DDoS protection instance in the resource management service.</p>
         * <p>Not setting this parameter indicates the default resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfm2pz25js****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        @Override
        public DescribeWebRulesRequest build() {
            return new DescribeWebRulesRequest(this);
        } 

    } 

}
