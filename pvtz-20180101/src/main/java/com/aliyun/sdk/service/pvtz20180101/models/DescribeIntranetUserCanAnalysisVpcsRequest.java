// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pvtz20180101.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeIntranetUserCanAnalysisVpcsRequest} extends {@link RequestModel}
 *
 * <p>DescribeIntranetUserCanAnalysisVpcsRequest</p>
 */
public class DescribeIntranetUserCanAnalysisVpcsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetworkType")
    private String networkType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueryTreeLevel")
    private Integer queryTreeLevel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcOwner")
    private Long vpcOwner;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcType")
    private String vpcType;

    private DescribeIntranetUserCanAnalysisVpcsRequest(Builder builder) {
        super(builder);
        this.networkType = builder.networkType;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.queryTreeLevel = builder.queryTreeLevel;
        this.regionId = builder.regionId;
        this.vpcOwner = builder.vpcOwner;
        this.vpcType = builder.vpcType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeIntranetUserCanAnalysisVpcsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return networkType
     */
    public String getNetworkType() {
        return this.networkType;
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
     * @return queryTreeLevel
     */
    public Integer getQueryTreeLevel() {
        return this.queryTreeLevel;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return vpcOwner
     */
    public Long getVpcOwner() {
        return this.vpcOwner;
    }

    /**
     * @return vpcType
     */
    public String getVpcType() {
        return this.vpcType;
    }

    public static final class Builder extends Request.Builder<DescribeIntranetUserCanAnalysisVpcsRequest, Builder> {
        private String networkType; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private Integer queryTreeLevel; 
        private String regionId; 
        private Long vpcOwner; 
        private String vpcType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeIntranetUserCanAnalysisVpcsRequest request) {
            super(request);
            this.networkType = request.networkType;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.queryTreeLevel = request.queryTreeLevel;
            this.regionId = request.regionId;
            this.vpcOwner = request.vpcOwner;
            this.vpcType = request.vpcType;
        } 

        /**
         * NetworkType.
         */
        public Builder networkType(String networkType) {
            this.putQueryParameter("NetworkType", networkType);
            this.networkType = networkType;
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
         * QueryTreeLevel.
         */
        public Builder queryTreeLevel(Integer queryTreeLevel) {
            this.putQueryParameter("QueryTreeLevel", queryTreeLevel);
            this.queryTreeLevel = queryTreeLevel;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * VpcOwner.
         */
        public Builder vpcOwner(Long vpcOwner) {
            this.putQueryParameter("VpcOwner", vpcOwner);
            this.vpcOwner = vpcOwner;
            return this;
        }

        /**
         * VpcType.
         */
        public Builder vpcType(String vpcType) {
            this.putQueryParameter("VpcType", vpcType);
            this.vpcType = vpcType;
            return this;
        }

        @Override
        public DescribeIntranetUserCanAnalysisVpcsRequest build() {
            return new DescribeIntranetUserCanAnalysisVpcsRequest(this);
        } 

    } 

}
