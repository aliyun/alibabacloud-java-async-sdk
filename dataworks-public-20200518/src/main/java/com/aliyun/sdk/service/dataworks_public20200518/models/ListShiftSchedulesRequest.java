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

    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Body
    @NameInMap("ShiftScheduleName")
    private String shiftScheduleName;

    private ListShiftSchedulesRequest(Builder builder) {
        super(builder);
        this.owner = builder.owner;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return shiftScheduleName
     */
    public String getShiftScheduleName() {
        return this.shiftScheduleName;
    }

    public static final class Builder extends Request.Builder<ListShiftSchedulesRequest, Builder> {
        private String owner; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 
        private String shiftScheduleName; 

        private Builder() {
            super();
        } 

        private Builder(ListShiftSchedulesRequest request) {
            super(request);
            this.owner = request.owner;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.shiftScheduleName = request.shiftScheduleName;
        } 

        /**
         * Owner.
         */
        public Builder owner(String owner) {
            this.putBodyParameter("Owner", owner);
            this.owner = owner;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putBodyParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
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
         * ShiftScheduleName.
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
