// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListBasicAcceleratorsRequest} extends {@link RequestModel}
 *
 * <p>ListBasicAcceleratorsRequest</p>
 */
public class ListBasicAcceleratorsRequest extends Request {
    @Query
    @NameInMap("AcceleratorId")
    private String acceleratorId;

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

    private ListBasicAcceleratorsRequest(Builder builder) {
        super(builder);
        this.acceleratorId = builder.acceleratorId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.state = builder.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListBasicAcceleratorsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceleratorId
     */
    public String getAcceleratorId() {
        return this.acceleratorId;
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

    public static final class Builder extends Request.Builder<ListBasicAcceleratorsRequest, Builder> {
        private String acceleratorId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 
        private String state; 

        private Builder() {
            super();
        } 

        private Builder(ListBasicAcceleratorsRequest response) {
            super(response);
            this.acceleratorId = response.acceleratorId;
            this.pageNumber = response.pageNumber;
            this.pageSize = response.pageSize;
            this.regionId = response.regionId;
            this.state = response.state;
        } 

        /**
         * 全球加速实例Id
         */
        public Builder acceleratorId(String acceleratorId) {
            this.putQueryParameter("AcceleratorId", acceleratorId);
            this.acceleratorId = acceleratorId;
            return this;
        }

        /**
         * 分页页码
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * 分页大小
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RegionId
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * 全球加速实例状态
         */
        public Builder state(String state) {
            this.putQueryParameter("State", state);
            this.state = state;
            return this;
        }

        @Override
        public ListBasicAcceleratorsRequest build() {
            return new ListBasicAcceleratorsRequest(this);
        } 

    } 

}
