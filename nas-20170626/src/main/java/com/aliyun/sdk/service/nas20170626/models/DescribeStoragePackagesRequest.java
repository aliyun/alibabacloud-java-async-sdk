// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

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
 * {@link DescribeStoragePackagesRequest} extends {@link RequestModel}
 *
 * <p>DescribeStoragePackagesRequest</p>
 */
public class DescribeStoragePackagesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UseUTCDateTime")
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
         * <p>The number of the page to return.</p>
         * <p>Pages start from page 1. Default value: 1.</p>
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
         * <p>The number of storage plans to return on each page.</p>
         * <p>Valid values: 1 to 100.</p>
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
         * <p>The region ID.</p>
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

        /**
         * <p>Specifies whether the time to return is in UTC.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>true (default): returns UTC time.</li>
         * <li>false: returns UNIX timestamp.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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
