// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAiotVehicleTableItemsRequest} extends {@link RequestModel}
 *
 * <p>DescribeAiotVehicleTableItemsRequest</p>
 */
public class DescribeAiotVehicleTableItemsRequest extends Request {
    @Body
    @NameInMap("Id")
    @Validation(required = true)
    private String id;

    @Body
    @NameInMap("PageNum")
    private Long pageNum;

    @Body
    @NameInMap("PageSize")
    private Long pageSize;

    @Body
    @NameInMap("VehicleTableId")
    @Validation(required = true)
    private String vehicleTableId;

    @Body
    @NameInMap("VehicleTableItemId")
    private String vehicleTableItemId;

    private DescribeAiotVehicleTableItemsRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.vehicleTableId = builder.vehicleTableId;
        this.vehicleTableItemId = builder.vehicleTableItemId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAiotVehicleTableItemsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return pageNum
     */
    public Long getPageNum() {
        return this.pageNum;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return vehicleTableId
     */
    public String getVehicleTableId() {
        return this.vehicleTableId;
    }

    /**
     * @return vehicleTableItemId
     */
    public String getVehicleTableItemId() {
        return this.vehicleTableItemId;
    }

    public static final class Builder extends Request.Builder<DescribeAiotVehicleTableItemsRequest, Builder> {
        private String id; 
        private Long pageNum; 
        private Long pageSize; 
        private String vehicleTableId; 
        private String vehicleTableItemId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAiotVehicleTableItemsRequest response) {
            super(response);
            this.id = response.id;
            this.pageNum = response.pageNum;
            this.pageSize = response.pageSize;
            this.vehicleTableId = response.vehicleTableId;
            this.vehicleTableItemId = response.vehicleTableItemId;
        } 

        /**
         * Id.
         */
        public Builder id(String id) {
            this.putBodyParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * PageNum.
         */
        public Builder pageNum(Long pageNum) {
            this.putBodyParameter("PageNum", pageNum);
            this.pageNum = pageNum;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * VehicleTableId.
         */
        public Builder vehicleTableId(String vehicleTableId) {
            this.putBodyParameter("VehicleTableId", vehicleTableId);
            this.vehicleTableId = vehicleTableId;
            return this;
        }

        /**
         * VehicleTableItemId.
         */
        public Builder vehicleTableItemId(String vehicleTableItemId) {
            this.putBodyParameter("VehicleTableItemId", vehicleTableItemId);
            this.vehicleTableItemId = vehicleTableItemId;
            return this;
        }

        @Override
        public DescribeAiotVehicleTableItemsRequest build() {
            return new DescribeAiotVehicleTableItemsRequest(this);
        } 

    } 

}
