// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link DescribeKVCacheInstancesRequest} extends {@link RequestModel}
 *
 * <p>DescribeKVCacheInstancesRequest</p>
 */
public class DescribeKVCacheInstancesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KVCacheInstanceDescription")
    private String KVCacheInstanceDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KVCacheInstanceIds")
    private String KVCacheInstanceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RelativeDBClusterId")
    private String relativeDBClusterId;

    private DescribeKVCacheInstancesRequest(Builder builder) {
        super(builder);
        this.KVCacheInstanceDescription = builder.KVCacheInstanceDescription;
        this.KVCacheInstanceIds = builder.KVCacheInstanceIds;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.relativeDBClusterId = builder.relativeDBClusterId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeKVCacheInstancesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return KVCacheInstanceDescription
     */
    public String getKVCacheInstanceDescription() {
        return this.KVCacheInstanceDescription;
    }

    /**
     * @return KVCacheInstanceIds
     */
    public String getKVCacheInstanceIds() {
        return this.KVCacheInstanceIds;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return relativeDBClusterId
     */
    public String getRelativeDBClusterId() {
        return this.relativeDBClusterId;
    }

    public static final class Builder extends Request.Builder<DescribeKVCacheInstancesRequest, Builder> {
        private String KVCacheInstanceDescription; 
        private String KVCacheInstanceIds; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 
        private String relativeDBClusterId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeKVCacheInstancesRequest request) {
            super(request);
            this.KVCacheInstanceDescription = request.KVCacheInstanceDescription;
            this.KVCacheInstanceIds = request.KVCacheInstanceIds;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.relativeDBClusterId = request.relativeDBClusterId;
        } 

        /**
         * <p>The description of the KVCache instance.</p>
         * 
         * <strong>example:</strong>
         * <p>Test cache instance</p>
         */
        public Builder KVCacheInstanceDescription(String KVCacheInstanceDescription) {
            this.putQueryParameter("KVCacheInstanceDescription", KVCacheInstanceDescription);
            this.KVCacheInstanceDescription = KVCacheInstanceDescription;
            return this;
        }

        /**
         * <p>The KVCache instance IDs. Separate multiple instance IDs with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>pkv-123456,pkv-789012</p>
         */
        public Builder KVCacheInstanceIds(String KVCacheInstanceIds) {
            this.putQueryParameter("KVCacheInstanceIds", KVCacheInstanceIds);
            this.KVCacheInstanceIds = KVCacheInstanceIds;
            return this;
        }

        /**
         * <p>The page number.</p>
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
         * <p>The page size.</p>
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
         * <p>The region ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The instance ID of the associated PolarDB instance.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-123456</p>
         */
        public Builder relativeDBClusterId(String relativeDBClusterId) {
            this.putQueryParameter("RelativeDBClusterId", relativeDBClusterId);
            this.relativeDBClusterId = relativeDBClusterId;
            return this;
        }

        @Override
        public DescribeKVCacheInstancesRequest build() {
            return new DescribeKVCacheInstancesRequest(this);
        } 

    } 

}
