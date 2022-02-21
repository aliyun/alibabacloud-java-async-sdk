// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListBandwidthPackagesRequest} extends {@link RequestModel}
 *
 * <p>ListBandwidthPackagesRequest</p>
 */
public class ListBandwidthPackagesRequest extends Request {
    @Query
    @NameInMap("BandwidthPackageId")
    private String bandwidthPackageId;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("State")
    private String state;

    @Query
    @NameInMap("Type")
    private String type;

    private ListBandwidthPackagesRequest(Builder builder) {
        super(builder);
        this.bandwidthPackageId = builder.bandwidthPackageId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.state = builder.state;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListBandwidthPackagesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bandwidthPackageId
     */
    public String getBandwidthPackageId() {
        return this.bandwidthPackageId;
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
     * @return state
     */
    public String getState() {
        return this.state;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<ListBandwidthPackagesRequest, Builder> {
        private String bandwidthPackageId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 
        private String state; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(ListBandwidthPackagesRequest response) {
            super(response);
            this.bandwidthPackageId = response.bandwidthPackageId;
            this.pageNumber = response.pageNumber;
            this.pageSize = response.pageSize;
            this.regionId = response.regionId;
            this.state = response.state;
            this.type = response.type;
        } 

        /**
         * BandwidthPackageId.
         */
        public Builder bandwidthPackageId(String bandwidthPackageId) {
            this.putQueryParameter("BandwidthPackageId", bandwidthPackageId);
            this.bandwidthPackageId = bandwidthPackageId;
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * State.
         */
        public Builder state(String state) {
            this.putQueryParameter("State", state);
            this.state = state;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public ListBandwidthPackagesRequest build() {
            return new ListBandwidthPackagesRequest(this);
        } 

    } 

}
