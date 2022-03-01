// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListStackInstancesRequest} extends {@link RequestModel}
 *
 * <p>ListStackInstancesRequest</p>
 */
public class ListStackInstancesRequest extends Request {
    @Query
    @NameInMap("PageNumber")
    private Long pageNumber;

    @Query
    @NameInMap("PageSize")
    private Long pageSize;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("StackGroupName")
    @Validation(required = true)
    private String stackGroupName;

    @Query
    @NameInMap("StackInstanceAccountId")
    private String stackInstanceAccountId;

    @Query
    @NameInMap("StackInstanceRegionId")
    private String stackInstanceRegionId;

    private ListStackInstancesRequest(Builder builder) {
        super(builder);
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.stackGroupName = builder.stackGroupName;
        this.stackInstanceAccountId = builder.stackInstanceAccountId;
        this.stackInstanceRegionId = builder.stackInstanceRegionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListStackInstancesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return stackGroupName
     */
    public String getStackGroupName() {
        return this.stackGroupName;
    }

    /**
     * @return stackInstanceAccountId
     */
    public String getStackInstanceAccountId() {
        return this.stackInstanceAccountId;
    }

    /**
     * @return stackInstanceRegionId
     */
    public String getStackInstanceRegionId() {
        return this.stackInstanceRegionId;
    }

    public static final class Builder extends Request.Builder<ListStackInstancesRequest, Builder> {
        private Long pageNumber; 
        private Long pageSize; 
        private String regionId; 
        private String stackGroupName; 
        private String stackInstanceAccountId; 
        private String stackInstanceRegionId; 

        private Builder() {
            super();
        } 

        private Builder(ListStackInstancesRequest response) {
            super(response);
            this.pageNumber = response.pageNumber;
            this.pageSize = response.pageSize;
            this.regionId = response.regionId;
            this.stackGroupName = response.stackGroupName;
            this.stackInstanceAccountId = response.stackInstanceAccountId;
            this.stackInstanceRegionId = response.stackInstanceRegionId;
        } 

        /**
         * PageNumber.
         */
        public Builder pageNumber(Long pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Long pageSize) {
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
         * StackGroupName.
         */
        public Builder stackGroupName(String stackGroupName) {
            this.putQueryParameter("StackGroupName", stackGroupName);
            this.stackGroupName = stackGroupName;
            return this;
        }

        /**
         * StackInstanceAccountId.
         */
        public Builder stackInstanceAccountId(String stackInstanceAccountId) {
            this.putQueryParameter("StackInstanceAccountId", stackInstanceAccountId);
            this.stackInstanceAccountId = stackInstanceAccountId;
            return this;
        }

        /**
         * StackInstanceRegionId.
         */
        public Builder stackInstanceRegionId(String stackInstanceRegionId) {
            this.putQueryParameter("StackInstanceRegionId", stackInstanceRegionId);
            this.stackInstanceRegionId = stackInstanceRegionId;
            return this;
        }

        @Override
        public ListStackInstancesRequest build() {
            return new ListStackInstancesRequest(this);
        } 

    } 

}
