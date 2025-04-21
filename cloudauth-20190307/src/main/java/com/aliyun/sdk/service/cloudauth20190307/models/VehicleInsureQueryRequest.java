// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth20190307.models;

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
 * {@link VehicleInsureQueryRequest} extends {@link RequestModel}
 *
 * <p>VehicleInsureQueryRequest</p>
 */
public class VehicleInsureQueryRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ParamType")
    private String paramType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VehicleNum")
    private String vehicleNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VehicleType")
    private String vehicleType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Vin")
    private String vin;

    private VehicleInsureQueryRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.paramType = builder.paramType;
        this.vehicleNum = builder.vehicleNum;
        this.vehicleType = builder.vehicleType;
        this.vin = builder.vin;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static VehicleInsureQueryRequest create() {
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
     * @return paramType
     */
    public String getParamType() {
        return this.paramType;
    }

    /**
     * @return vehicleNum
     */
    public String getVehicleNum() {
        return this.vehicleNum;
    }

    /**
     * @return vehicleType
     */
    public String getVehicleType() {
        return this.vehicleType;
    }

    /**
     * @return vin
     */
    public String getVin() {
        return this.vin;
    }

    public static final class Builder extends Request.Builder<VehicleInsureQueryRequest, Builder> {
        private String regionId; 
        private String paramType; 
        private String vehicleNum; 
        private String vehicleType; 
        private String vin; 

        private Builder() {
            super();
        } 

        private Builder(VehicleInsureQueryRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.paramType = request.paramType;
            this.vehicleNum = request.vehicleNum;
            this.vehicleType = request.vehicleType;
            this.vin = request.vin;
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
         * ParamType.
         */
        public Builder paramType(String paramType) {
            this.putQueryParameter("ParamType", paramType);
            this.paramType = paramType;
            return this;
        }

        /**
         * VehicleNum.
         */
        public Builder vehicleNum(String vehicleNum) {
            this.putQueryParameter("VehicleNum", vehicleNum);
            this.vehicleNum = vehicleNum;
            return this;
        }

        /**
         * VehicleType.
         */
        public Builder vehicleType(String vehicleType) {
            this.putQueryParameter("VehicleType", vehicleType);
            this.vehicleType = vehicleType;
            return this;
        }

        /**
         * Vin.
         */
        public Builder vin(String vin) {
            this.putQueryParameter("Vin", vin);
            this.vin = vin;
            return this;
        }

        @Override
        public VehicleInsureQueryRequest build() {
            return new VehicleInsureQueryRequest(this);
        } 

    } 

}
