// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAiotVehicleTablesRequest} extends {@link RequestModel}
 *
 * <p>DescribeAiotVehicleTablesRequest</p>
 */
public class DescribeAiotVehicleTablesRequest extends Request {
    @Body
    @NameInMap("Id")
    @Validation(required = true)
    private String id;

    @Body
    @NameInMap("VehicleTableIdList")
    private String vehicleTableIdList;

    private DescribeAiotVehicleTablesRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
        this.vehicleTableIdList = builder.vehicleTableIdList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAiotVehicleTablesRequest create() {
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
     * @return vehicleTableIdList
     */
    public String getVehicleTableIdList() {
        return this.vehicleTableIdList;
    }

    public static final class Builder extends Request.Builder<DescribeAiotVehicleTablesRequest, Builder> {
        private String id; 
        private String vehicleTableIdList; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAiotVehicleTablesRequest response) {
            super(response);
            this.id = response.id;
            this.vehicleTableIdList = response.vehicleTableIdList;
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
         * VehicleTableIdList.
         */
        public Builder vehicleTableIdList(String vehicleTableIdList) {
            this.putBodyParameter("VehicleTableIdList", vehicleTableIdList);
            this.vehicleTableIdList = vehicleTableIdList;
            return this;
        }

        @Override
        public DescribeAiotVehicleTablesRequest build() {
            return new DescribeAiotVehicleTablesRequest(this);
        } 

    } 

}
