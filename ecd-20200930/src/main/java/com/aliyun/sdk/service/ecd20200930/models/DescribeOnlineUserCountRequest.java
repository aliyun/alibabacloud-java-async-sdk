// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
 * {@link DescribeOnlineUserCountRequest} extends {@link RequestModel}
 *
 * <p>DescribeOnlineUserCountRequest</p>
 */
public class DescribeOnlineUserCountRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizType")
    private Integer bizType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OfficeSiteId")
    private String officeSiteId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SearchRegionId")
    private String searchRegionId;

    private DescribeOnlineUserCountRequest(Builder builder) {
        super(builder);
        this.bizType = builder.bizType;
        this.officeSiteId = builder.officeSiteId;
        this.regionId = builder.regionId;
        this.searchRegionId = builder.searchRegionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeOnlineUserCountRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizType
     */
    public Integer getBizType() {
        return this.bizType;
    }

    /**
     * @return officeSiteId
     */
    public String getOfficeSiteId() {
        return this.officeSiteId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return searchRegionId
     */
    public String getSearchRegionId() {
        return this.searchRegionId;
    }

    public static final class Builder extends Request.Builder<DescribeOnlineUserCountRequest, Builder> {
        private Integer bizType; 
        private String officeSiteId; 
        private String regionId; 
        private String searchRegionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeOnlineUserCountRequest request) {
            super(request);
            this.bizType = request.bizType;
            this.officeSiteId = request.officeSiteId;
            this.regionId = request.regionId;
            this.searchRegionId = request.searchRegionId;
        } 

        /**
         * BizType.
         */
        public Builder bizType(Integer bizType) {
            this.putQueryParameter("BizType", bizType);
            this.bizType = bizType;
            return this;
        }

        /**
         * OfficeSiteId.
         */
        public Builder officeSiteId(String officeSiteId) {
            this.putQueryParameter("OfficeSiteId", officeSiteId);
            this.officeSiteId = officeSiteId;
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
         * SearchRegionId.
         */
        public Builder searchRegionId(String searchRegionId) {
            this.putQueryParameter("SearchRegionId", searchRegionId);
            this.searchRegionId = searchRegionId;
            return this;
        }

        @Override
        public DescribeOnlineUserCountRequest build() {
            return new DescribeOnlineUserCountRequest(this);
        } 

    } 

}
