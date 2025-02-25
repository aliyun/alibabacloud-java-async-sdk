// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202.models;

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
 * {@link DescribeGdnInstancesRequest} extends {@link RequestModel}
 *
 * <p>DescribeGdnInstancesRequest</p>
 */
public class DescribeGdnInstancesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FilterType")
    private String filterType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FilterValue")
    private String filterValue;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GDNId")
    private String GDNId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNum")
    private String pageNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private String pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private DescribeGdnInstancesRequest(Builder builder) {
        super(builder);
        this.filterType = builder.filterType;
        this.filterValue = builder.filterValue;
        this.GDNId = builder.GDNId;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeGdnInstancesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return filterType
     */
    public String getFilterType() {
        return this.filterType;
    }

    /**
     * @return filterValue
     */
    public String getFilterValue() {
        return this.filterValue;
    }

    /**
     * @return GDNId
     */
    public String getGDNId() {
        return this.GDNId;
    }

    /**
     * @return pageNum
     */
    public String getPageNum() {
        return this.pageNum;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DescribeGdnInstancesRequest, Builder> {
        private String filterType; 
        private String filterValue; 
        private String GDNId; 
        private String pageNum; 
        private String pageSize; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeGdnInstancesRequest request) {
            super(request);
            this.filterType = request.filterType;
            this.filterValue = request.filterValue;
            this.GDNId = request.GDNId;
            this.pageNum = request.pageNum;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
        } 

        /**
         * FilterType.
         */
        public Builder filterType(String filterType) {
            this.putQueryParameter("FilterType", filterType);
            this.filterType = filterType;
            return this;
        }

        /**
         * FilterValue.
         */
        public Builder filterValue(String filterValue) {
            this.putQueryParameter("FilterValue", filterValue);
            this.filterValue = filterValue;
            return this;
        }

        /**
         * <p>GDN ID。</p>
         * 
         * <strong>example:</strong>
         * <p>gdn-***</p>
         */
        public Builder GDNId(String GDNId) {
            this.putQueryParameter("GDNId", GDNId);
            this.GDNId = GDNId;
            return this;
        }

        /**
         * PageNum.
         */
        public Builder pageNum(String pageNum) {
            this.putQueryParameter("PageNum", pageNum);
            this.pageNum = pageNum;
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DescribeGdnInstancesRequest build() {
            return new DescribeGdnInstancesRequest(this);
        } 

    } 

}
