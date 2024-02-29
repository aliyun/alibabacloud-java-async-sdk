// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListShiftSchedulesRequest} extends {@link RequestModel}
 *
 * <p>ListShiftSchedulesRequest</p>
 */
public class ListShiftSchedulesRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("Owner")
    private String owner;

    @Body
    @NameInMap("PageNumber")
    @Validation(maximum = 100, minimum = 1)
    private Integer pageNumber;

    @Body
    @NameInMap("PageSize")
    @Validation(maximum = 100, minimum = 10)
    private Integer pageSize;

    @Body
    @NameInMap("ShiftScheduleName")
    private String shiftScheduleName;

    private ListShiftSchedulesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.owner = builder.owner;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.shiftScheduleName = builder.shiftScheduleName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListShiftSchedulesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return owner
     */
    public String getOwner() {
        return this.owner;
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
     * @return shiftScheduleName
     */
    public String getShiftScheduleName() {
        return this.shiftScheduleName;
    }

    public static final class Builder extends Request.Builder<ListShiftSchedulesRequest, Builder> {
        private String regionId; 
        private String owner; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String shiftScheduleName; 

        private Builder() {
            super();
        } 

        private Builder(ListShiftSchedulesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.owner = request.owner;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.shiftScheduleName = request.shiftScheduleName;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The number of entries to return on each page. Default value: 10. Maximum value: 100.
         */
        public Builder owner(String owner) {
            this.putBodyParameter("Owner", owner);
            this.owner = owner;
            return this;
        }

        /**
         * The ID of the request. You can use the ID to query logs and troubleshoot issues.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putBodyParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of the page to return. Minimum value:1. Maximum value: 100. Default value: 1.
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of your Alibaba Cloud account. You can log on to the DataWorks console and move the pointer over the profile picture in the upper-right corner to obtain the ID.
         */
        public Builder shiftScheduleName(String shiftScheduleName) {
            this.putBodyParameter("ShiftScheduleName", shiftScheduleName);
            this.shiftScheduleName = shiftScheduleName;
            return this;
        }

        @Override
        public ListShiftSchedulesRequest build() {
            return new ListShiftSchedulesRequest(this);
        } 

    } 

}
