// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDatabaseInstancesRequest} extends {@link RequestModel}
 *
 * <p>DescribeDatabaseInstancesRequest</p>
 */
public class DescribeDatabaseInstancesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DatabaseInstanceIds")
    private String databaseInstanceIds;

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

    private DescribeDatabaseInstancesRequest(Builder builder) {
        super(builder);
        this.databaseInstanceIds = builder.databaseInstanceIds;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDatabaseInstancesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return databaseInstanceIds
     */
    public String getDatabaseInstanceIds() {
        return this.databaseInstanceIds;
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

    public static final class Builder extends Request.Builder<DescribeDatabaseInstancesRequest, Builder> {
        private String databaseInstanceIds; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDatabaseInstancesRequest request) {
            super(request);
            this.databaseInstanceIds = request.databaseInstanceIds;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The IDs of the Simple Database Service instances. The value can be a JSON array that consists of up to 100 Simple Database Service instance IDs. Separate multiple instance IDs with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;swasdb-xxx******&quot;,&quot;swasdb-yyy******&quot;]</p>
         */
        public Builder databaseInstanceIds(String databaseInstanceIds) {
            this.putQueryParameter("DatabaseInstanceIds", databaseInstanceIds);
            this.databaseInstanceIds = databaseInstanceIds;
            return this;
        }

        /**
         * <p>The page number.</p>
         * <p>Pages start from page 1.</p>
         * <p>Default value: 1.</p>
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
         * <p>The number of entries per page.</p>
         * <p>Maximum value: 100.</p>
         * <p>Default value: 10.</p>
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
         * <p>The region ID of the Simple Database Service instances.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DescribeDatabaseInstancesRequest build() {
            return new DescribeDatabaseInstancesRequest(this);
        } 

    } 

}
