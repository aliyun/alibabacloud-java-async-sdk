// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * Cname.
         */
        public Builder cname(String cname) {
            this.putQueryParameter("Cname", cname);
            this.cname = cname;
            return this;
        }

        /**
         * Domain.
         */
        public Builder domain(String domain) {
            this.putQueryParameter("Domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * InstanceIds.
         */
        public Builder instanceIds(java.util.List < String > instanceIds) {
            this.putQueryParameter("InstanceIds", instanceIds);
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * QueryDomainPattern.
         */
        public Builder queryDomainPattern(String queryDomainPattern) {
            this.putQueryParameter("QueryDomainPattern", queryDomainPattern);
            this.queryDomainPattern = queryDomainPattern;
            return this;
        }

        /**
         * ResourceGroupId.
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
