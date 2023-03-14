// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20171228.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLayer7CCRulesRequest} extends {@link RequestModel}
 *
 * <p>DescribeLayer7CCRulesRequest</p>
 */
public class DescribeLayer7CCRulesRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("Domain")
    @Validation(required = true)
    private String domain;

    @Query
    @NameInMap("Offset")
    @Validation(required = true)
    private Integer offset;

    @Query
    @NameInMap("PageSize")
    @Validation(required = true)
    private String pageSize;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("SourceIp")
    private String sourceIp;

    private DescribeLayer7CCRulesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.domain = builder.domain;
        this.offset = builder.offset;
        this.pageSize = builder.pageSize;
        this.resourceGroupId = builder.resourceGroupId;
        this.sourceIp = builder.sourceIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLayer7CCRulesRequest create() {
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
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * @return offset
     */
    public Integer getOffset() {
        return this.offset;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    public static final class Builder extends Request.Builder<DescribeLayer7CCRulesRequest, Builder> {
        private String regionId; 
        private String domain; 
        private Integer offset; 
        private String pageSize; 
        private String resourceGroupId; 
        private String sourceIp; 

        private Builder() {
            super();
        } 

        private Builder(DescribeLayer7CCRulesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.domain = request.domain;
            this.offset = request.offset;
            this.pageSize = request.pageSize;
            this.resourceGroupId = request.resourceGroupId;
            this.sourceIp = request.sourceIp;
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
         * Domain.
         */
        public Builder domain(String domain) {
            this.putQueryParameter("Domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * Offset.
         */
        public Builder offset(Integer offset) {
            this.putQueryParameter("Offset", offset);
            this.offset = offset;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
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

        /**
         * SourceIp.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        @Override
        public DescribeLayer7CCRulesRequest build() {
            return new DescribeLayer7CCRulesRequest(this);
        } 

    } 

}
