// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeStoragePackagesRequest} extends {@link RequestModel}
 *
 * <p>DescribeStoragePackagesRequest</p>
 */
public class DescribeStoragePackagesRequest extends Request {
    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    @Validation(maximum = 100, minimum = 1)
    private Integer pageSize;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("UseUTCDateTime")
    private Boolean useUTCDateTime;

    private DescribeStoragePackagesRequest(Builder builder) {
        super(builder);
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.useUTCDateTime = builder.useUTCDateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeStoragePackagesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return useUTCDateTime
     */
    public Boolean getUseUTCDateTime() {
        return this.useUTCDateTime;
    }

    public static final class Builder extends Request.Builder<DescribeStoragePackagesRequest, Builder> {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 
        private Boolean useUTCDateTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeStoragePackagesRequest request) {
            super(request);
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.useUTCDateTime = request.useUTCDateTime;
        } 

        /**
         * The number of the page to return.
         * <p>
         * 
         * Pages start from page 1. Default value: 1.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of storage plans to return on each page.
         * <p>
         * 
         * Valid values: 1 to 100.
         * 
         * Default value: 10.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The region ID.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Specifies whether the time to return is in UTC.
         * <p>
         * 
         * Valid values:
         * 
         * *   true (default): returns UTC time.
         * *   false: returns UNIX timestamp.
         */
        public Builder useUTCDateTime(Boolean useUTCDateTime) {
            this.putQueryParameter("UseUTCDateTime", useUTCDateTime);
            this.useUTCDateTime = useUTCDateTime;
            return this;
        }

        @Override
        public DescribeStoragePackagesRequest build() {
            return new DescribeStoragePackagesRequest(this);
        } 

    } 

}
